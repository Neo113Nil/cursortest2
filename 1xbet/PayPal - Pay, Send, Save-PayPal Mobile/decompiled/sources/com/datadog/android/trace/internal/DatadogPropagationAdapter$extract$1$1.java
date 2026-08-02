package com.datadog.android.trace.internal;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class DatadogPropagationAdapter$extract$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean> {
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(java.lang.String str, java.lang.String str2) {
        return java.lang.Boolean.valueOf(((com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier) this.receiver).accept(str, str2));
    }

    DatadogPropagationAdapter$extract$1$1(java.lang.Object obj) {
        super(2, obj, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier.class, "accept", "accept(Ljava/lang/String;Ljava/lang/String;)Z", 0);
    }
}
