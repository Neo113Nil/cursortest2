package org.chromium.net;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public abstract class BidirectionalStream {

    public static abstract class Builder {
        public static final int STREAM_PRIORITY_HIGHEST = 4;
        public static final int STREAM_PRIORITY_IDLE = 0;
        public static final int STREAM_PRIORITY_LOW = 2;
        public static final int STREAM_PRIORITY_LOWEST = 1;
        public static final int STREAM_PRIORITY_MEDIUM = 3;

        public abstract Builder addHeader(String header, String value);

        public Builder addRequestAnnotation(Object annotation) {
            return this;
        }

        public Builder bindToNetwork(long networkHandle) {
            return this;
        }

        public abstract BidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean delayRequestHeadersUntilFirstFlush);

        public abstract Builder setHttpMethod(String method);

        public abstract Builder setPriority(int priority);

        public Builder setTrafficStatsTag(int tag) {
            return this;
        }

        public Builder setTrafficStatsUid(int uid) {
            return this;
        }
    }

    public static abstract class Callback {
        public void onCanceled(BidirectionalStream stream, UrlResponseInfo info) {
        }

        public abstract void onFailed(BidirectionalStream stream, UrlResponseInfo info, CronetException error);

        public abstract void onReadCompleted(BidirectionalStream stream, UrlResponseInfo info, ByteBuffer buffer, boolean endOfStream);

        public abstract void onResponseHeadersReceived(BidirectionalStream stream, UrlResponseInfo info);

        public void onResponseTrailersReceived(BidirectionalStream stream, UrlResponseInfo info, UrlResponseInfo.HeaderBlock trailers) {
        }

        public abstract void onStreamReady(BidirectionalStream stream);

        public abstract void onSucceeded(BidirectionalStream stream, UrlResponseInfo info);

        public abstract void onWriteCompleted(BidirectionalStream stream, UrlResponseInfo info, ByteBuffer buffer, boolean endOfStream);
    }

    public abstract void cancel();

    public abstract void flush();

    public abstract boolean isDone();

    public abstract void read(ByteBuffer buffer);

    public abstract void start();

    public abstract void write(ByteBuffer buffer, boolean endOfStream);
}
