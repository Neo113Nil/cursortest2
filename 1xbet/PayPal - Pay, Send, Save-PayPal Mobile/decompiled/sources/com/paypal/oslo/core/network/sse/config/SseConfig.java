package com.paypal.oslo.core.network.sse.config;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "", "getInitialRetryDelayMs", "()J", "initialRetryDelayMs", "getMaxRetryDelayMs", "maxRetryDelayMs", "", "getMaxRetryAttempts", "()I", "maxRetryAttempts", "", "getBackoffMultiplier", "()D", "backoffMultiplier", "getReadTimeoutMs", "readTimeoutMs", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SseConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.sse.config.SseConfig.Companion INSTANCE = com.paypal.oslo.core.network.sse.config.SseConfig.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final double DEFAULT_BACKOFF_MULTIPLIER = 2.0d;
    public static final long DEFAULT_INITIAL_RETRY_DELAY_MS = 1000;
    public static final int DEFAULT_MAX_RETRY_ATTEMPTS = 5;
    public static final long DEFAULT_MAX_RETRY_DELAY_MS = 30000;
    public static final long DEFAULT_READ_TIMEOUT_MS = 15000;

    default double getBackoffMultiplier() {
        return 2.0d;
    }

    java.lang.String getBaseUrl();

    default long getInitialRetryDelayMs() {
        return 1000L;
    }

    default int getMaxRetryAttempts() {
        return 5;
    }

    default long getMaxRetryDelayMs() {
        return 30000L;
    }

    default long getReadTimeoutMs() {
        return 15000L;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static long getInitialRetryDelayMs(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
            return com.paypal.oslo.core.network.sse.config.SseConfig.super.getInitialRetryDelayMs();
        }

        @java.lang.Deprecated
        public static long getMaxRetryDelayMs(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
            return com.paypal.oslo.core.network.sse.config.SseConfig.super.getMaxRetryDelayMs();
        }

        @java.lang.Deprecated
        public static int getMaxRetryAttempts(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
            return com.paypal.oslo.core.network.sse.config.SseConfig.super.getMaxRetryAttempts();
        }

        @java.lang.Deprecated
        public static double getBackoffMultiplier(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
            return com.paypal.oslo.core.network.sse.config.SseConfig.super.getBackoffMultiplier();
        }

        @java.lang.Deprecated
        public static long getReadTimeoutMs(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
            return com.paypal.oslo.core.network.sse.config.SseConfig.super.getReadTimeoutMs();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/sse/config/SseConfig$Companion;", "", "<init>", "()V", "", "DEFAULT_INITIAL_RETRY_DELAY_MS", "J", "DEFAULT_MAX_RETRY_DELAY_MS", "", "DEFAULT_MAX_RETRY_ATTEMPTS", com.visa.cbp.getEncExpo.warmup, "", "DEFAULT_BACKOFF_MULTIPLIER", "D", "DEFAULT_READ_TIMEOUT_MS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final double DEFAULT_BACKOFF_MULTIPLIER = 2.0d;
        public static final long DEFAULT_INITIAL_RETRY_DELAY_MS = 1000;
        public static final int DEFAULT_MAX_RETRY_ATTEMPTS = 5;
        public static final long DEFAULT_MAX_RETRY_DELAY_MS = 30000;
        public static final long DEFAULT_READ_TIMEOUT_MS = 15000;
        static final /* synthetic */ com.paypal.oslo.core.network.sse.config.SseConfig.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.network.sse.config.SseConfig.Companion();

        private Companion() {
        }
    }
}
