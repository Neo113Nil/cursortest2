package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Nc implements com.inmobi.media.Io, com.inmobi.media.InterfaceC2392f {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Mc f4854a;
    public final com.inmobi.media.Rc b;

    public Nc(com.inmobi.media.Mc nativeAdUnitComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.f4854a = nativeAdUnitComponent;
        this.b = new com.inmobi.media.Rc(nativeAdUnitComponent);
    }

    public final void a() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.b.c;
        com.inmobi.media.Be be = interfaceC2782tj instanceof com.inmobi.media.Be ? (com.inmobi.media.Be) interfaceC2782tj : null;
        if (be != null) {
            com.inmobi.media.InterfaceC2772t9 l = be.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("NativeRenderedState", "takeAction");
            }
            ((com.inmobi.media.C2721rd) be.b.p.getValue()).b();
        }
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(double d) {
        return com.inmobi.media.Ho.a(this.f4854a.f4836a, d);
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(int i, double d) {
        return com.inmobi.media.Ho.a(this.f4854a.f4836a, i, d);
    }

    @Override // com.inmobi.media.InterfaceC2392f
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        java.lang.Object a2 = this.b.a(continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
