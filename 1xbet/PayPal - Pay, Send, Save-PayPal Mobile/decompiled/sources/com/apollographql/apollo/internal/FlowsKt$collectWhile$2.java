package com.apollographql.apollo.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowsKt$collectWhile$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1 Camera2StreamConfigurationMap;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emit = this.Camera2StreamConfigurationMap.emit(t, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    public FlowsKt$collectWhile$2(com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1 flowsKt$collectWhile$collector$1) {
        this.Camera2StreamConfigurationMap = flowsKt$collectWhile$collector$1;
    }
}
