package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bd implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Ld f4622a;

    public Bd(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Ld ld) {
        this.f4622a = ld;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.AbstractC2509jc abstractC2509jc = (com.inmobi.media.AbstractC2509jc) obj;
        com.inmobi.media.AbstractC2367e1 abstractC2367e1 = this.f4622a.d;
        kotlin.jvm.internal.Intrinsics.checkNotNull(abstractC2509jc, "null cannot be cast to non-null type com.inmobi.media.ads.common.models.VideoEvent");
        abstractC2367e1.a((com.inmobi.media.AbstractC2493im) abstractC2509jc);
        return kotlin.Unit.INSTANCE;
    }
}
