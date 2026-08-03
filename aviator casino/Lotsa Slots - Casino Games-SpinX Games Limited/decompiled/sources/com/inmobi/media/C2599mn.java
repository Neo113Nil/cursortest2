package com.inmobi.media;

/* renamed from: com.inmobi.media.mn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2599mn implements kotlinx.coroutines.flow.Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.MutableStateFlow f5343a;

    public C2599mn(kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow) {
        this.f5343a = mutableStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.f5343a.collect(new com.inmobi.media.C2573ln(flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
