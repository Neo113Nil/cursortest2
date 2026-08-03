package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wd implements kotlinx.coroutines.flow.Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow f5030a;

    public Wd(kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow) {
        this.f5030a = mutableSharedFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.f5030a.collect(new com.inmobi.media.Vd(flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
