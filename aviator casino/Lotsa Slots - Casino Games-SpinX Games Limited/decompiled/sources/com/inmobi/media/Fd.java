package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fd implements kotlinx.coroutines.flow.Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow f4705a;

    public Fd(kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow) {
        this.f4705a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.f4705a.collect(new com.inmobi.media.Ed(flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
