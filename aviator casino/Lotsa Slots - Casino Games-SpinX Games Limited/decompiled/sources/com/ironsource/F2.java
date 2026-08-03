package com.ironsource;

/* loaded from: classes5.dex */
public final class F2 implements com.ironsource.K {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3389yg f5695a;

    public F2(com.ironsource.InterfaceC3389yg viewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.f5695a = viewBinder;
    }

    @Override // com.ironsource.K
    public void a(com.ironsource.B2 bannerAdInstance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdInstance, "bannerAdInstance");
        bannerAdInstance.a(this.f5695a);
    }

    @Override // com.ironsource.K
    public /* synthetic */ void a(com.ironsource.Vb vb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vb, "nativeAdInstance");
    }

    @Override // com.ironsource.K
    public /* synthetic */ void a(com.ironsource.C3075h6 c3075h6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3075h6, "fullscreenAdInstance");
    }
}
