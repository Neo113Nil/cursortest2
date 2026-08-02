package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0011\u001a\u0004\u0018\u00010\u0010\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u000024\u0010\u000f\u001a0\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u000e0\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JT\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00028\u00002-\u0010\u0015\u001a)\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogPropagationAdapter;", "Lcom/datadog/android/trace/api/propagation/DatadogPropagation;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentPropagation;", "delegate", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/trace/bootstrap/instrumentation/api/AgentPropagation;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "carrier", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "", "", "getter", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "extract", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "context", "Lkotlin/Function3;", "setter", "inject", "(Lcom/datadog/android/trace/api/span/DatadogSpanContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Camera2StreamConfigurationMap", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentPropagation;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogPropagationAdapter implements com.datadog.android.trace.api.propagation.DatadogPropagation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    public DatadogPropagationAdapter(com.datadog.android.api.InternalLogger internalLogger, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation agentPropagation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agentPropagation, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoSizes = agentPropagation;
    }

    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public final <C> void inject(final com.datadog.android.trace.api.span.DatadogSpanContext context, C carrier, final kotlin.jvm.functions.Function3<? super C, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> setter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setter, "");
        if (!(context instanceof com.datadog.android.trace.internal.DatadogSpanContextAdapter)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.DatadogPropagationAdapter$inject$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.trace.internal.DatadogPropagationAdapter.access$constructErrorMessage(com.datadog.android.trace.internal.DatadogPropagationAdapter.this, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(context.getClass()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            this.getHighSpeedVideoSizes.inject(((com.datadog.android.trace.internal.DatadogSpanContextAdapter) context).getDelegate(), (com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context) carrier, (com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context>) new com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter() { // from class: com.datadog.android.trace.internal.DatadogPropagationAdapter$$ExternalSyntheticLambda0
                @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter
                public final void set(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
                    kotlin.jvm.functions.Function3.this.invoke(obj, str, str2);
                }
            });
        }
    }

    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public final <C> com.datadog.android.trace.api.span.DatadogSpanContext extract(C carrier, final kotlin.jvm.functions.Function2<? super C, ? super kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.Boolean>, kotlin.Unit> getter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getter, "");
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted extract = this.getHighSpeedVideoSizes.extract(carrier, new com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor() { // from class: com.datadog.android.trace.internal.DatadogPropagationAdapter$$ExternalSyntheticLambda1
            @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor
            public final void forEachKey(java.lang.Object obj, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier keyClassifier) {
                com.datadog.android.trace.internal.DatadogPropagationAdapter.$r8$lambda$oi2TuBux4U0xUFnBGAg1HaF9bWs(kotlin.jvm.functions.Function2.this, obj, keyClassifier);
            }
        });
        return extract != null ? new com.datadog.android.trace.internal.DatadogSpanContextAdapter(extract) : null;
    }

    public static /* synthetic */ void $r8$lambda$oi2TuBux4U0xUFnBGAg1HaF9bWs(kotlin.jvm.functions.Function2 function2, java.lang.Object obj, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier keyClassifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keyClassifier, "");
        function2.invoke(obj, new com.datadog.android.trace.internal.DatadogPropagationAdapter$extract$1$1(keyClassifier));
    }

    public static final /* synthetic */ java.lang.String access$constructErrorMessage(com.datadog.android.trace.internal.DatadogPropagationAdapter datadogPropagationAdapter, kotlin.reflect.KClass kClass) {
        java.lang.String simpleName = kClass.getSimpleName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DatadogPropagationAdapter supports only DatadogSpanContextAdapter instances for injection but ");
        sb.append(simpleName);
        sb.append(" is given");
        return sb.toString();
    }
}
