package com.datadog.android.core.internal.time;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/datadog/android/core/internal/time/KronosTimeProvider;", "Lcom/datadog/android/internal/time/BaseTimeProvider;", "Lcom/lyft/kronos/Clock;", "clock", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/lyft/kronos/Clock;Lcom/datadog/android/api/InternalLogger;)V", "", "getServerOffsetMillis", "()J", "getServerOffsetNanos", "getServerTimestampMillis", "Lkotlin/Result;", "getHighSpeedVideoFpsRanges", "(Lcom/lyft/kronos/Clock;)Ljava/lang/Object;", "Lcom/lyft/kronos/Clock;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KronosTimeProvider extends com.datadog.android.internal.time.BaseTimeProvider {
    public static final java.lang.String FAIL_MESSAGE = "KronosClock.getCurrentTimeMs failed with an exception";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.lyft.kronos.Clock getHighSpeedVideoFpsRangesFor;

    public KronosTimeProvider(com.lyft.kronos.Clock clock, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = clock;
        this.getHighSpeedVideoFpsRanges = internalLogger;
    }

    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getServerTimestampMillis() {
        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
        if (kotlin.Result.m23439exceptionOrNullimpl(highSpeedVideoFpsRanges) != null) {
            highSpeedVideoFpsRanges = java.lang.Long.valueOf(getDeviceTimestampMillis());
        }
        return ((java.lang.Number) highSpeedVideoFpsRanges).longValue();
    }

    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getServerOffsetMillis() {
        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
        if (kotlin.Result.m23442isSuccessimpl(highSpeedVideoFpsRanges)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            highSpeedVideoFpsRanges = java.lang.Long.valueOf(((java.lang.Number) highSpeedVideoFpsRanges).longValue() - getDeviceTimestampMillis());
        }
        java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl(highSpeedVideoFpsRanges);
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = 0L;
        }
        return ((java.lang.Number) m23436constructorimpl).longValue();
    }

    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getServerOffsetNanos() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(getServerOffsetMillis());
    }

    private final java.lang.Object getHighSpeedVideoFpsRanges(com.lyft.kronos.Clock clock) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Long.valueOf(clock.getCurrentTimeMs()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            this.getHighSpeedVideoFpsRanges.log(com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0<java.lang.String>) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.time.KronosTimeProvider$safeGetCurrentTimeMs$2$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.time.KronosTimeProvider.FAIL_MESSAGE;
                }
            }, m23439exceptionOrNullimpl, true, kotlin.collections.MapsKt.emptyMap());
        }
        return m23436constructorimpl;
    }
}
