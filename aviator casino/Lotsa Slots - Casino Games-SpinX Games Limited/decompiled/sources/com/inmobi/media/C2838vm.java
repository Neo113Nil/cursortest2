package com.inmobi.media;

/* renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2838vm implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Fm f5516a;

    public C2838vm(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Fm fm) {
        this.f5516a = fm;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.AbstractC2509jc abstractC2509jc = (com.inmobi.media.AbstractC2509jc) obj;
        com.inmobi.media.C2799u9 c2799u9 = this.f5516a.e;
        if (c2799u9 != null) {
            c2799u9.a("VideoExperienceManager", "observeCompanionAdEvents - received companion event: " + abstractC2509jc);
        }
        java.lang.Object emit = this.f5516a.d.emit(abstractC2509jc, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }
}
