package org.chromium.net.apihelpers;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public abstract class InMemoryTransformCronetCallback<T> extends ImplicitFlowControlCallback {
    private static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private final Set<CronetRequestCompletionListener<? super T>> mListeners = new LinkedHashSet();
    private WritableByteChannel mResponseBodyChannel;
    private ByteArrayOutputStream mResponseBodyStream;

    protected abstract T transformBodyBytes(UrlResponseInfo info, byte[] bodyBytes);

    public ImplicitFlowControlCallback addCompletionListener(CronetRequestCompletionListener<? super T> listener) {
        this.mListeners.add(listener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onResponseStarted(UrlResponseInfo info) {
        long bodyLength = getBodyLength(info);
        if (bodyLength > 2147483639) {
            throw new IllegalArgumentException("The body is too large and wouldn't fit in a byte array!");
        }
        if (bodyLength >= 0) {
            this.mResponseBodyStream = new ByteArrayOutputStream((int) bodyLength);
        } else {
            this.mResponseBodyStream = new ByteArrayOutputStream();
        }
        this.mResponseBodyChannel = Channels.newChannel(this.mResponseBodyStream);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onBodyChunkRead(UrlResponseInfo info, ByteBuffer bodyChunk) throws Exception {
        this.mResponseBodyChannel.write(bodyChunk);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onSucceeded(UrlResponseInfo info) {
        T transformBodyBytes = transformBodyBytes(info, this.mResponseBodyStream.toByteArray());
        Iterator<CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onSucceeded(info, transformBodyBytes);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onFailed(UrlResponseInfo info, CronetException exception) {
        Iterator<CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onFailed(info, exception);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    protected final void onCanceled(UrlResponseInfo info) {
        Iterator<CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCanceled(info);
        }
    }

    private static long getBodyLength(UrlResponseInfo info) {
        List<String> list = info.getAllHeaders().get("Content-Length");
        if (list == null || list.size() != 1) {
            return -1L;
        }
        try {
            return Long.parseLong(list.get(0));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
