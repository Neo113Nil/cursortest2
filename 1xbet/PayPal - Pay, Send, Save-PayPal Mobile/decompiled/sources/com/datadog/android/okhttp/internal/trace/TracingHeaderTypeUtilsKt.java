package com.datadog.android.okhttp.internal.trace;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/trace/TracingHeaderType;", "Lcom/datadog/android/internal/telemetry/TracingHeaderType;", "toTelemetryTracingHeaderType", "(Lcom/datadog/android/trace/TracingHeaderType;)Lcom/datadog/android/internal/telemetry/TracingHeaderType;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TracingHeaderTypeUtilsKt {
    public static final com.datadog.android.internal.telemetry.TracingHeaderType toTelemetryTracingHeaderType(com.datadog.android.trace.TracingHeaderType tracingHeaderType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracingHeaderType, "");
        int i = com.datadog.android.okhttp.internal.trace.TracingHeaderTypeUtilsKt.WhenMappings.$EnumSwitchMapping$0[tracingHeaderType.ordinal()];
        if (i == 1) {
            return com.datadog.android.internal.telemetry.TracingHeaderType.DATADOG;
        }
        if (i == 2) {
            return com.datadog.android.internal.telemetry.TracingHeaderType.B3;
        }
        if (i == 3) {
            return com.datadog.android.internal.telemetry.TracingHeaderType.B3MULTI;
        }
        if (i == 4) {
            return com.datadog.android.internal.telemetry.TracingHeaderType.TRACECONTEXT;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.trace.TracingHeaderType.values().length];
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.DATADOG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.B3.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.B3MULTI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.datadog.android.trace.TracingHeaderType.TRACECONTEXT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
