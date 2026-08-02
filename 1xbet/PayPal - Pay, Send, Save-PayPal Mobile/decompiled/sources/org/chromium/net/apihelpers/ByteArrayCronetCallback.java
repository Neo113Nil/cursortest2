package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public abstract class ByteArrayCronetCallback extends org.chromium.net.apihelpers.InMemoryTransformCronetCallback<byte[]> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public final byte[] transformBodyBytes(org.chromium.net.UrlResponseInfo urlResponseInfo, byte[] bArr) {
        return bArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public org.chromium.net.apihelpers.ByteArrayCronetCallback addCompletionListener(org.chromium.net.apihelpers.CronetRequestCompletionListener<? super byte[]> cronetRequestCompletionListener) {
        super.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }
}
