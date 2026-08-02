package com.paypal.oslo.core.network.sse.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy;", "", "Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "sseConfig", "<init>", "(Lcom/paypal/oslo/core/network/sse/config/SseConfig;)V", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "error", "", "currentRetryCount", "Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy$RetryDecision;", "decideRetry", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;I)Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy$RetryDecision;", "retryCount", "", "lastEventId", "", "delayBeforeReconnect", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "calculateBackoffDelay", "(I)J", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "getHighResolutionOutputSizeshNQ4ISI", "RetryDecision"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SseRetryStrategy {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.sse.config.SseConfig getHighResolutionOutputSizeshNQ4ISI;

    public SseRetryStrategy(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sseConfig;
    }

    public final com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision decideRetry(com.paypal.oslo.core.network.http.error.NetworkError error, int currentRetryCount) {
        java.lang.Throwable th;
        if (error == null) {
            return new com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision(false, currentRetryCount, null, 4, null);
        }
        boolean z = error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet;
        if (!z && !(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            return new com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision(false, currentRetryCount, error);
        }
        int i = currentRetryCount + 1;
        if (i > this.getHighResolutionOutputSizeshNQ4ISI.getMaxRetryAttempts()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "Max SSE retry attempts reached", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("lastError", error)), null, 4, null);
            if (z) {
                th = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause();
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                th = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause();
            } else {
                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                th = null;
            }
            return new com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision(false, i, new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("Max SSE reconnection attempts reached", th)));
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "Retryable SSE error, will reconnect", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attempt", java.lang.Integer.valueOf(i)), kotlin.TuplesKt.to("error", error)), null, 4, null);
        return new com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision(true, i, null, 4, null);
    }

    public final java.lang.Object delayBeforeReconnect(int i, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        long calculateBackoffDelay = calculateBackoffDelay(i);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "Reconnecting SSE", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("delayMs", kotlin.coroutines.jvm.internal.Boxing.boxLong(calculateBackoffDelay)), kotlin.TuplesKt.to("attempt", kotlin.coroutines.jvm.internal.Boxing.boxInt(i)), kotlin.TuplesKt.to("lastEventId", str)), null, 4, null);
        java.lang.Object delay = kotlinx.coroutines.DelayKt.delay(calculateBackoffDelay, continuation);
        return delay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : kotlin.Unit.INSTANCE;
    }

    public final long calculateBackoffDelay(int retryCount) {
        return java.lang.Math.min((long) (this.getHighResolutionOutputSizeshNQ4ISI.getInitialRetryDelayMs() * java.lang.Math.pow(this.getHighResolutionOutputSizeshNQ4ISI.getBackoffMultiplier(), retryCount - 1)), this.getHighResolutionOutputSizeshNQ4ISI.getMaxRetryDelayMs());
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy$RetryDecision;", "", "", "shouldReconnect", "", "nextRetryCount", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "errorToEmit", "<init>", "(ZILcom/paypal/oslo/core/network/http/error/NetworkError;)V", "component1", "()Z", "component2", "()I", "component3", "()Lcom/paypal/oslo/core/network/http/error/NetworkError;", "copy", "(ZILcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy$RetryDecision;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getShouldReconnect", com.visa.cbp.getEncExpo.warmup, "getNextRetryCount", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getErrorToEmit"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class RetryDecision {
        private final com.paypal.oslo.core.network.http.error.NetworkError errorToEmit;
        private final int nextRetryCount;
        private final boolean shouldReconnect;

        public RetryDecision(boolean z, int i, com.paypal.oslo.core.network.http.error.NetworkError networkError) {
            this.shouldReconnect = z;
            this.nextRetryCount = i;
            this.errorToEmit = networkError;
        }

        public /* synthetic */ RetryDecision(boolean z, int i, com.paypal.oslo.core.network.http.error.NetworkError networkError, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, i, (i2 & 4) != 0 ? null : networkError);
        }

        public final boolean getShouldReconnect() {
            return this.shouldReconnect;
        }

        public final int getNextRetryCount() {
            return this.nextRetryCount;
        }

        public final com.paypal.oslo.core.network.http.error.NetworkError getErrorToEmit() {
            return this.errorToEmit;
        }

        public final java.lang.String toString() {
            boolean z = this.shouldReconnect;
            int i = this.nextRetryCount;
            com.paypal.oslo.core.network.http.error.NetworkError networkError = this.errorToEmit;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryDecision(shouldReconnect=");
            sb.append(z);
            sb.append(", nextRetryCount=");
            sb.append(i);
            sb.append(", errorToEmit=");
            sb.append(networkError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.shouldReconnect);
            int hashCode2 = java.lang.Integer.hashCode(this.nextRetryCount);
            com.paypal.oslo.core.network.http.error.NetworkError networkError = this.errorToEmit;
            return (((hashCode * 31) + hashCode2) * 31) + (networkError == null ? 0 : networkError.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision)) {
                return false;
            }
            com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision retryDecision = (com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision) other;
            return this.shouldReconnect == retryDecision.shouldReconnect && this.nextRetryCount == retryDecision.nextRetryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.errorToEmit, retryDecision.errorToEmit);
        }

        public final com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision copy(boolean shouldReconnect, int nextRetryCount, com.paypal.oslo.core.network.http.error.NetworkError errorToEmit) {
            return new com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision(shouldReconnect, nextRetryCount, errorToEmit);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.network.http.error.NetworkError getErrorToEmit() {
            return this.errorToEmit;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNextRetryCount() {
            return this.nextRetryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldReconnect() {
            return this.shouldReconnect;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision copy$default(com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision retryDecision, boolean z, int i, com.paypal.oslo.core.network.http.error.NetworkError networkError, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                z = retryDecision.shouldReconnect;
            }
            if ((i2 & 2) != 0) {
                i = retryDecision.nextRetryCount;
            }
            if ((i2 & 4) != 0) {
                networkError = retryDecision.errorToEmit;
            }
            return retryDecision.copy(z, i, networkError);
        }
    }
}
