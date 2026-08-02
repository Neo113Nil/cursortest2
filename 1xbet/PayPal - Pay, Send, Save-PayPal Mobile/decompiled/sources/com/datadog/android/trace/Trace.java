package com.datadog.android.trace;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/trace/Trace;", "", "<init>", "()V", "Lcom/datadog/android/trace/TraceConfiguration;", "traceConfiguration", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "enable", "(Lcom/datadog/android/trace/TraceConfiguration;Lcom/datadog/android/api/SdkCore;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Trace {
    public static final com.datadog.android.trace.Trace INSTANCE = new com.datadog.android.trace.Trace();

    private Trace() {
    }

    public static /* synthetic */ void enable$default(com.datadog.android.trace.TraceConfiguration traceConfiguration, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        enable(traceConfiguration, sdkCore);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(com.datadog.android.trace.TraceConfiguration traceConfiguration, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = (com.datadog.android.api.feature.FeatureSdkCore) sdkCore;
        featureSdkCore.registerFeature(new com.datadog.android.trace.internal.TracingFeature(featureSdkCore, traceConfiguration.getCustomEndpointUrl$dd_sdk_android_trace_release(), traceConfiguration.getEventMapper$dd_sdk_android_trace_release(), traceConfiguration.getNetworkInfoEnabled$dd_sdk_android_trace_release()));
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(com.datadog.android.trace.TraceConfiguration traceConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceConfiguration, "");
        enable$default(traceConfiguration, null, 2, null);
    }
}
