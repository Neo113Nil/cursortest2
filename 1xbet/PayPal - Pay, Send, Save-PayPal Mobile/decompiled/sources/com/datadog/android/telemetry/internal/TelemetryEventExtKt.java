package com.datadog.android.telemetry.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\t*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\n\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\r\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source$Companion;", "", "source", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "tryFromSource", "(Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source$Companion;", "Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;", "(Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/telemetry/model/TelemetryDebugEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source$Companion;", "Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "(Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/telemetry/model/TelemetryErrorEvent$Source;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source$Companion;", "Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "(Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source$Companion;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)Lcom/datadog/android/telemetry/model/TelemetryUsageEvent$Source;", "UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TelemetryEventExtKt {
    public static final java.lang.String UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT = "You are using an unknown source %s for your events";

    public static final com.datadog.android.telemetry.model.TelemetryDebugEvent.Source tryFromSource(com.datadog.android.telemetry.model.TelemetryDebugEvent.Source.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.telemetry.model.TelemetryErrorEvent.Source tryFromSource(com.datadog.android.telemetry.model.TelemetryErrorEvent.Source.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.telemetry.model.TelemetryUsageEvent.Source tryFromSource(com.datadog.android.telemetry.model.TelemetryUsageEvent.Source.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source tryFromSource(com.datadog.android.telemetry.model.TelemetryConfigurationEvent.Source.Companion companion, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return companion.fromJson(str);
        } catch (java.util.NoSuchElementException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$4
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "You are using an unknown source %s for your events", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
