package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0014\u0010\n\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"", "CONFIG_EXPOSURE", "Ljava/lang/String;", "DIAGNOSTICS_EVENT", "", "EXPOSURE_DEDUPE_INTERVAL", "J", "FLUSH_TIMER_MS", "GATE_EXPOSURE", "LAYER_EXPOSURE", "LOG_EVENT_FAILED", "", "MAX_EVENTS_BEFORE_FLUSH_ATTEMPT", com.visa.cbp.getEncExpo.warmup, "MAX_EVENT_BUFFER_SIZE", "NON_EXPOSED_CHECKS_EVENT", "SHUTDOWN_WAIT_S"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StatsigLoggerKt {
    public static final java.lang.String CONFIG_EXPOSURE = "statsig::config_exposure";
    public static final java.lang.String DIAGNOSTICS_EVENT = "statsig::diagnostics";
    private static final long EXPOSURE_DEDUPE_INTERVAL = 600000;
    public static final long FLUSH_TIMER_MS = 60000;
    public static final java.lang.String GATE_EXPOSURE = "statsig::gate_exposure";
    public static final java.lang.String LAYER_EXPOSURE = "statsig::layer_exposure";
    public static final java.lang.String LOG_EVENT_FAILED = "statsig::log_event_failed";
    public static final int MAX_EVENTS_BEFORE_FLUSH_ATTEMPT = 50;
    public static final int MAX_EVENT_BUFFER_SIZE = 1000;
    public static final java.lang.String NON_EXPOSED_CHECKS_EVENT = "statsig::non_exposed_checks";
    public static final long SHUTDOWN_WAIT_S = 3;
}
