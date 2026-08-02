package org.chromium.net;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public abstract class ExperimentalBidirectionalStream extends org.chromium.net.BidirectionalStream {

    @java.lang.Deprecated
    public static abstract class Builder extends org.chromium.net.BidirectionalStream.Builder {
        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder addHeader(java.lang.String str, java.lang.String str2);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public org.chromium.net.ExperimentalBidirectionalStream.Builder addRequestAnnotation(java.lang.Object obj) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream build();

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder setHttpMethod(java.lang.String str);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder setPriority(int i);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
            return this;
        }
    }
}
