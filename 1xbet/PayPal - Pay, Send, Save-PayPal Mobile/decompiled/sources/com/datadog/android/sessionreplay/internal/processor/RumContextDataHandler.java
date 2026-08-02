package com.datadog.android.sessionreplay.internal.processor;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/processor/RumContextDataHandler;", "", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "rumContextProvider", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;Lcom/datadog/android/internal/time/TimeProvider;Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "createRumContextData$dd_sdk_android_session_replay_release", "()Lcom/datadog/android/sessionreplay/internal/processor/RecordedQueuedItemContext;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/internal/time/TimeProvider;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RumContextDataHandler {
    public static final java.lang.String INVALID_RUM_CONTEXT_ERROR_MESSAGE_FORMAT = "SR RumContextDataHandler: Invalid RUM context: [%s] when trying to bundle the RumContextData";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.utils.RumContextProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider Camera2StreamConfigurationMap;

    public RumContextDataHandler(com.datadog.android.sessionreplay.internal.utils.RumContextProvider rumContextProvider, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = rumContextProvider;
        this.Camera2StreamConfigurationMap = timeProvider;
        this.getHighSpeedVideoSizes = internalLogger;
    }

    public final com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext createRumContextData$dd_sdk_android_session_replay_release() {
        long deviceTimestampMillis = this.Camera2StreamConfigurationMap.getDeviceTimestampMillis();
        final com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext rumContext = this.getHighSpeedVideoFpsRangesFor.getRumContext();
        if (rumContext.isNotValid$dd_sdk_android_session_replay_release()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.processor.RumContextDataHandler$createRumContextData$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, com.datadog.android.sessionreplay.internal.processor.RumContextDataHandler.INVALID_RUM_CONTEXT_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext.this.toString()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return null;
        }
        return new com.datadog.android.sessionreplay.internal.processor.RecordedQueuedItemContext(deviceTimestampMillis + rumContext.getViewTimeOffsetMs(), com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext.copy$default(rumContext, null, null, null, 0L, 15, null));
    }
}
