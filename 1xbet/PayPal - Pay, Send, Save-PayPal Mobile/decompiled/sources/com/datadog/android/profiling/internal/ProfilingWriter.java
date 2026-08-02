package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/profiling/internal/ProfilingWriter;", "", "Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;", "profilingResult", "Lcom/datadog/android/internal/profiling/TTIDRumContext;", "ttidRumContext", "", "write", "(Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;Lcom/datadog/android/internal/profiling/TTIDRumContext;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProfilingWriter {
    void write(com.datadog.android.profiling.internal.perfetto.PerfettoResult profilingResult, com.datadog.android.internal.profiling.TTIDRumContext ttidRumContext);
}
