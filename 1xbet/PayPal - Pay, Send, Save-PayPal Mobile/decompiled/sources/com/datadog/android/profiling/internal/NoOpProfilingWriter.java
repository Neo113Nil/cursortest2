package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/profiling/internal/NoOpProfilingWriter;", "Lcom/datadog/android/profiling/internal/ProfilingWriter;", "<init>", "()V", "Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;", "profilingResult", "Lcom/datadog/android/internal/profiling/TTIDRumContext;", "ttidRumContext", "", "write", "(Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;Lcom/datadog/android/internal/profiling/TTIDRumContext;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpProfilingWriter implements com.datadog.android.profiling.internal.ProfilingWriter {
    @Override // com.datadog.android.profiling.internal.ProfilingWriter
    public final void write(com.datadog.android.profiling.internal.perfetto.PerfettoResult profilingResult, com.datadog.android.internal.profiling.TTIDRumContext ttidRumContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilingResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ttidRumContext, "");
    }
}
