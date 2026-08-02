package org.chromium.net;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public abstract class ExperimentalUrlRequest extends org.chromium.net.UrlRequest {

    @java.lang.Deprecated
    public static abstract class Builder extends org.chromium.net.UrlRequest.Builder {
        public static final int DEFAULT_IDEMPOTENCY = 0;
        public static final int IDEMPOTENT = 1;
        public static final int NOT_IDEMPOTENT = 2;

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder addHeader(java.lang.String str, java.lang.String str2);

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder addRequestAnnotation(java.lang.Object obj) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest build();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder disableCache();

        public org.chromium.net.ExperimentalUrlRequest.Builder disableConnectionMigration() {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setHttpMethod(java.lang.String str);

        public org.chromium.net.ExperimentalUrlRequest.Builder setIdempotency(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setPriority(int i);

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public org.chromium.net.ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract org.chromium.net.ExperimentalUrlRequest.Builder setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor);
    }
}
