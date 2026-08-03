package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Rc extends com.inmobi.media.AbstractC2861wj implements com.inmobi.media.Ah, com.inmobi.media.Tk, com.inmobi.media.InterfaceC2392f {
    public volatile com.inmobi.media.InterfaceC2782tj c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rc(com.inmobi.media.Mc nativeAdUnitComponent) {
        super(adComponent.f5538a.e);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        com.inmobi.media.C2867x adComponent = nativeAdUnitComponent.f4836a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.c = new com.inmobi.media.C2327cd(nativeAdUnitComponent, this);
    }

    @Override // com.inmobi.media.AbstractC2861wj
    public final com.inmobi.media.InterfaceC2782tj a() {
        return this.c;
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.Tk tk = interfaceC2782tj instanceof com.inmobi.media.Tk ? (com.inmobi.media.Tk) interfaceC2782tj : null;
        if (tk != null) {
            tk.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC2392f
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.InterfaceC2392f interfaceC2392f = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2392f ? (com.inmobi.media.InterfaceC2392f) interfaceC2782tj : null;
        if (interfaceC2392f == null) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object a2 = interfaceC2392f.a(continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Ah
    public final void a(com.inmobi.media.ads.nativeAd.InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.Ah ah = interfaceC2782tj instanceof com.inmobi.media.Ah ? (com.inmobi.media.Ah) interfaceC2782tj : null;
        if (ah != null) {
            ah.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC2861wj
    public final void a(com.inmobi.media.InterfaceC2782tj interfaceC2782tj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC2782tj, "<set-?>");
        this.c = interfaceC2782tj;
    }
}
