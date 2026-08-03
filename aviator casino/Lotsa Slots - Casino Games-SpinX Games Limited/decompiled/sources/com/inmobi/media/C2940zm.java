package com.inmobi.media;

/* renamed from: com.inmobi.media.zm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2940zm implements kotlinx.coroutines.flow.Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.Flow f5597a;

    public C2940zm(kotlinx.coroutines.flow.Flow flow) {
        this.f5597a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = this.f5597a.collect(new com.inmobi.media.C2915ym(flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
