package com.datadog.android.telemetry.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "Lcom/datadog/android/telemetry/internal/TelemetryType;", "type", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)Lcom/datadog/android/telemetry/internal/TelemetryType;", "Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "getIdentity", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "identity"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TelemetryEventIdKt {
    public static final com.datadog.android.telemetry.internal.TelemetryEventId getIdentity(com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTelemetryEvent, "");
        if (!(internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error)) {
            return internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug ? new com.datadog.android.telemetry.internal.TelemetryEventId(type(internalTelemetryEvent), ((com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug) internalTelemetryEvent).getMessage(), null) : new com.datadog.android.telemetry.internal.TelemetryEventId(type(internalTelemetryEvent), "", null);
        }
        com.datadog.android.telemetry.internal.TelemetryType type = type(internalTelemetryEvent);
        com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error error = (com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) internalTelemetryEvent;
        return new com.datadog.android.telemetry.internal.TelemetryEventId(type, error.getMessage(), error.resolveKind());
    }

    public static final com.datadog.android.telemetry.internal.TelemetryType type(com.datadog.android.internal.telemetry.InternalTelemetryEvent internalTelemetryEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalTelemetryEvent, "");
        if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug) {
            return com.datadog.android.telemetry.internal.TelemetryType.DEBUG;
        }
        if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error) {
            return com.datadog.android.telemetry.internal.TelemetryType.ERROR;
        }
        if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Configuration) {
            return com.datadog.android.telemetry.internal.TelemetryType.CONFIGURATION;
        }
        if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.Metric) {
            return com.datadog.android.telemetry.internal.TelemetryType.METRIC;
        }
        if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage) {
            return com.datadog.android.telemetry.internal.TelemetryType.API_USAGE;
        }
        if (internalTelemetryEvent instanceof com.datadog.android.internal.telemetry.InternalTelemetryEvent.InterceptorInstantiated) {
            return com.datadog.android.telemetry.internal.TelemetryType.INTERCEPTOR_SETUP;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
