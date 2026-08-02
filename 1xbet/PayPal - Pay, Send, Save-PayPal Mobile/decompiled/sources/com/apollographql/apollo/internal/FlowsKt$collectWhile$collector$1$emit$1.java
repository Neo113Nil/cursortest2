package com.apollographql.apollo.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1", f = "flows.kt", i = {}, l = {31}, m = "emit", n = {}, s = {})
/* loaded from: classes3.dex */
public final class FlowsKt$collectWhile$collector$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1 getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowsKt$collectWhile$collector$1$emit$1(com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1 flowsKt$collectWhile$collector$1, kotlin.coroutines.Continuation<? super com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = flowsKt$collectWhile$collector$1;
    }
}
