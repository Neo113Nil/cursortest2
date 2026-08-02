package com.datadog.android.trace;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/trace/GlobalDatadogTracer;", "", "<init>", "()V", "", "clear", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "get", "()Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "getOrNull", "tracer", "", "registerIfAbsent", "(Lcom/datadog/android/trace/api/tracer/DatadogTracer;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReference;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobalDatadogTracer {
    public static final com.datadog.android.trace.GlobalDatadogTracer INSTANCE = new com.datadog.android.trace.GlobalDatadogTracer();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicReference<com.datadog.android.trace.api.tracer.DatadogTracer> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();

    private GlobalDatadogTracer() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean registerIfAbsent(com.datadog.android.trace.api.tracer.DatadogTracer tracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
        return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, null, tracer);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.trace.api.tracer.DatadogTracer get() {
        com.datadog.android.trace.api.tracer.DatadogTracer orNull = INSTANCE.getOrNull();
        return orNull == null ? new com.datadog.android.trace.api.tracer.NoOpDatadogTracer() : orNull;
    }

    public final com.datadog.android.trace.api.tracer.DatadogTracer getOrNull() {
        return Camera2StreamConfigurationMap.get();
    }

    public final void clear() {
        Camera2StreamConfigurationMap.set(null);
    }
}
