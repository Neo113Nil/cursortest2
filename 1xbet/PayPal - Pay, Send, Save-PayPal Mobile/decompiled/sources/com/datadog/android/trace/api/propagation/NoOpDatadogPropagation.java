package com.datadog.android.trace.api.propagation;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\r\u001a\u0004\u0018\u00010\f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u000024\u0010\u000b\u001a0\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\n0\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00002-\u0010\u0011\u001a)\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\n0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/trace/api/propagation/NoOpDatadogPropagation;", "Lcom/datadog/android/trace/api/propagation/DatadogPropagation;", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "carrier", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "", "", "getter", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "extract", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "context", "Lkotlin/Function3;", "setter", "inject", "(Lcom/datadog/android/trace/api/span/DatadogSpanContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpDatadogPropagation implements com.datadog.android.trace.api.propagation.DatadogPropagation {
    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public final <C> void inject(com.datadog.android.trace.api.span.DatadogSpanContext context, C carrier, kotlin.jvm.functions.Function3<? super C, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> setter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setter, "");
    }

    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public final <C> com.datadog.android.trace.api.span.DatadogSpanContext extract(C carrier, kotlin.jvm.functions.Function2<? super C, ? super kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.Boolean>, kotlin.Unit> getter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getter, "");
        return null;
    }
}
