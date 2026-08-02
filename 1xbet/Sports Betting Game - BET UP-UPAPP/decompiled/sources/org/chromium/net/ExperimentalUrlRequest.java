package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ExperimentalUrlRequest extends UrlRequest {

    @Deprecated
    public static abstract class Builder extends UrlRequest.Builder {
        public static final int DEFAULT_IDEMPOTENCY = 0;
        public static final int IDEMPOTENT = 1;
        public static final int NOT_IDEMPOTENT = 2;

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder addHeader(String header, String value);

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder addRequestAnnotation(Object annotation) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract ExperimentalUrlRequest build();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setHttpMethod(String method);

        public Builder setIdempotency(int idempotency) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setPriority(int priority);

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder setTrafficStatsTag(int tag) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder setTrafficStatsUid(int uid) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
