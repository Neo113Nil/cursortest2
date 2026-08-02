package com.datadog.android.trace;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "", "operationName", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "parentSpan", "", "activate", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "withinSpan", "(Ljava/lang/String;Lcom/datadog/android/trace/api/span/DatadogSpan;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SpanExtKt {
    public static /* synthetic */ java.lang.Object withinSpan$default(java.lang.String str, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            datadogSpan = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer = com.datadog.android.trace.GlobalDatadogTracer.get();
        com.datadog.android.trace.api.span.DatadogSpan start = datadogTracer.buildSpan(str).withParentSpan(datadogSpan).start();
        com.datadog.android.trace.api.scope.DatadogScope activateSpan = z ? datadogTracer.activateSpan(start) : null;
        try {
            return function1.invoke(start);
        } finally {
        }
    }

    public static final <T> T withinSpan(java.lang.String str, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, boolean z, kotlin.jvm.functions.Function1<? super com.datadog.android.trace.api.span.DatadogSpan, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer = com.datadog.android.trace.GlobalDatadogTracer.get();
        com.datadog.android.trace.api.span.DatadogSpan start = datadogTracer.buildSpan(str).withParentSpan(datadogSpan).start();
        com.datadog.android.trace.api.scope.DatadogScope activateSpan = z ? datadogTracer.activateSpan(start) : null;
        try {
            return function1.invoke(start);
        } finally {
        }
    }
}
