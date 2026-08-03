package com.inmobi.media;

/* renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2713r5 implements com.inmobi.media.InterfaceC2357dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2768t5 f5419a;

    public C2713r5(com.inmobi.media.C2768t5 c2768t5) {
        this.f5419a = c2768t5;
    }

    @Override // com.inmobi.media.InterfaceC2357dg
    public final java.lang.Object a(com.inmobi.media.C2409fg c2409fg, kotlin.coroutines.Continuation continuation) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f5419a.b.get(c2409fg.f5201a.h);
        com.inmobi.media.InterfaceC2620ng interfaceC2620ng = weakReference != null ? (com.inmobi.media.InterfaceC2620ng) weakReference.get() : null;
        if (!com.inmobi.media.AbstractC2487ig.a(c2409fg)) {
            java.lang.Object a2 = this.f5419a.a(c2409fg, interfaceC2620ng, continuation);
            return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
        }
        com.inmobi.media.C2768t5 c2768t5 = this.f5419a;
        c2768t5.getClass();
        com.inmobi.media.AbstractC2699qg.a(c2409fg, interfaceC2620ng);
        java.lang.Object a3 = c2768t5.f5411a.f5552a.a("pings", "id=?", new java.lang.String[]{c2409fg.f5201a.b}, continuation);
        if (a3 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a3 = kotlin.Unit.INSTANCE;
        }
        if (a3 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a3 = kotlin.Unit.INSTANCE;
        }
        return a3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : kotlin.Unit.INSTANCE;
    }
}
