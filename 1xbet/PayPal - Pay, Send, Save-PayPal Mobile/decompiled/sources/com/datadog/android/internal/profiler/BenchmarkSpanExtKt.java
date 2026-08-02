package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "", "operationName", "", "additionalProperties", "Lkotlin/Function1;", "Lcom/datadog/android/internal/profiler/BenchmarkSpan;", "Lkotlin/ExtensionFunctionType;", "block", "withinBenchmarkSpan", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BenchmarkSpanExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object withinBenchmarkSpan$default(java.lang.String str, java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.datadog.android.internal.profiler.BenchmarkSpan startSpan = com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getProfiler().getTracer("dd-sdk-android").spanBuilder(str, map).startSpan();
        try {
            return function1.invoke(startSpan);
        } finally {
            startSpan.stop();
        }
    }

    public static final <T> T withinBenchmarkSpan(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, kotlin.jvm.functions.Function1<? super com.datadog.android.internal.profiler.BenchmarkSpan, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.datadog.android.internal.profiler.BenchmarkSpan startSpan = com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getProfiler().getTracer("dd-sdk-android").spanBuilder(str, map).startSpan();
        try {
            return function1.invoke(startSpan);
        } finally {
            startSpan.stop();
        }
    }
}
