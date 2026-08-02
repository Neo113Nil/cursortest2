package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\b\u0007H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "", "spanName", "", "isContainer", "Lkotlin/Function1;", "Lcom/datadog/android/internal/profiler/BenchmarkSpan;", "Lkotlin/ExtensionFunctionType;", "block", "withinSRBenchmarkSpan", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BenchmarkExtKt {
    public static /* synthetic */ java.lang.Object withinSRBenchmarkSpan$default(java.lang.String str, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.datadog.android.internal.profiler.BenchmarkSpan startSpan = com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getProfiler().getTracer("dd-sdk-android").spanBuilder(str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attribute.container", java.lang.String.valueOf(z)))).startSpan();
        try {
            return function1.invoke(startSpan);
        } finally {
            startSpan.stop();
        }
    }

    public static final <T> T withinSRBenchmarkSpan(java.lang.String str, boolean z, kotlin.jvm.functions.Function1<? super com.datadog.android.internal.profiler.BenchmarkSpan, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.datadog.android.internal.profiler.BenchmarkSpan startSpan = com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getProfiler().getTracer("dd-sdk-android").spanBuilder(str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attribute.container", java.lang.String.valueOf(z)))).startSpan();
        try {
            return function1.invoke(startSpan);
        } finally {
            startSpan.stop();
        }
    }
}
