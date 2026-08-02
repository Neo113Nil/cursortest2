package com.datadog.trace.api.gateway;

/* loaded from: classes8.dex */
public interface Flow<T> {
    com.datadog.trace.api.gateway.Flow.Action getAction();

    T getResult();

    public interface Action {
        boolean isBlocking();

        public static class Noop implements com.datadog.trace.api.gateway.Flow.Action {
            public static com.datadog.trace.api.gateway.Flow.Action INSTANCE = new com.datadog.trace.api.gateway.Flow.Action.Noop();

            @Override // com.datadog.trace.api.gateway.Flow.Action
            public boolean isBlocking() {
                return false;
            }

            private Noop() {
            }
        }

        public static class RequestBlockingAction implements com.datadog.trace.api.gateway.Flow.Action {
            private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
            private final com.datadog.trace.appsec.api.blocking.BlockingContentType getHighSpeedVideoFpsRanges;
            private final int getHighSpeedVideoSizes;

            @Override // com.datadog.trace.api.gateway.Flow.Action
            public boolean isBlocking() {
                return true;
            }

            public RequestBlockingAction(int i, com.datadog.trace.appsec.api.blocking.BlockingContentType blockingContentType, java.util.Map<java.lang.String, java.lang.String> map) {
                this.getHighSpeedVideoSizes = i;
                this.getHighSpeedVideoFpsRanges = blockingContentType;
                this.Camera2StreamConfigurationMap = map;
            }

            public RequestBlockingAction(int i, com.datadog.trace.appsec.api.blocking.BlockingContentType blockingContentType) {
                this(i, blockingContentType, java.util.Collections.emptyMap());
            }

            public static com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction forRedirect(int i, java.lang.String str) {
                return new com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction(i, com.datadog.trace.appsec.api.blocking.BlockingContentType.NONE, java.util.Collections.singletonMap("Location", str));
            }

            public int getStatusCode() {
                return this.getHighSpeedVideoSizes;
            }

            public com.datadog.trace.appsec.api.blocking.BlockingContentType getBlockingContentType() {
                return this.getHighSpeedVideoFpsRanges;
            }

            public java.util.Map<java.lang.String, java.lang.String> getExtraHeaders() {
                return this.Camera2StreamConfigurationMap;
            }
        }
    }

    public static class ResultFlow<R> implements com.datadog.trace.api.gateway.Flow<R> {
        private static final com.datadog.trace.api.gateway.Flow.ResultFlow getHighSpeedVideoFpsRanges = new com.datadog.trace.api.gateway.Flow.ResultFlow(null);
        private final R Camera2StreamConfigurationMap;

        public static <R> com.datadog.trace.api.gateway.Flow.ResultFlow<R> empty() {
            return getHighSpeedVideoFpsRanges;
        }

        public ResultFlow(R r) {
            this.Camera2StreamConfigurationMap = r;
        }

        @Override // com.datadog.trace.api.gateway.Flow
        public com.datadog.trace.api.gateway.Flow.Action getAction() {
            return com.datadog.trace.api.gateway.Flow.Action.Noop.INSTANCE;
        }

        @Override // com.datadog.trace.api.gateway.Flow
        public R getResult() {
            return this.Camera2StreamConfigurationMap;
        }
    }
}
