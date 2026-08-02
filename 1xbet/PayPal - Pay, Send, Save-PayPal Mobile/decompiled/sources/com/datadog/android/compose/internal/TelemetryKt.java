package com.datadog.android.compose.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "autoInstrumented", "Lcom/datadog/android/compose/internal/InstrumentationType;", "instrumentationType", "Lcom/datadog/android/compose/internal/SupportLibrary;", "supportLibrary", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "sendTelemetry", "(ZLcom/datadog/android/compose/internal/InstrumentationType;Lcom/datadog/android/compose/internal/SupportLibrary;Lcom/datadog/android/api/SdkCore;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TelemetryKt {
    public static /* synthetic */ void sendTelemetry$default(boolean z, com.datadog.android.compose.internal.InstrumentationType instrumentationType, com.datadog.android.compose.internal.SupportLibrary supportLibrary, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            supportLibrary = null;
        }
        if ((i & 8) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        sendTelemetry(z, instrumentationType, supportLibrary, sdkCore);
    }

    public static final void sendTelemetry(boolean z, com.datadog.android.compose.internal.InstrumentationType instrumentationType, com.datadog.android.compose.internal.SupportLibrary supportLibrary, com.datadog.android.api.SdkCore sdkCore) {
        com.datadog.android.api.InternalLogger internalLogger;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        final java.lang.String concat = "Datadog Compose Integration Telemetry: ".concat(java.lang.String.valueOf(instrumentationType.getValue()));
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("compose_instrumentation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_INSTRUMENTATION_TYPE, instrumentationType), kotlin.TuplesKt.to("support_library", supportLibrary))));
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
        if (featureSdkCore == null || (internalLogger = featureSdkCore.getInternalLogger()) == null) {
            return;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.compose.internal.TelemetryKt$sendTelemetry$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return concat;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, true, mapOf, 8, (java.lang.Object) null);
    }
}
