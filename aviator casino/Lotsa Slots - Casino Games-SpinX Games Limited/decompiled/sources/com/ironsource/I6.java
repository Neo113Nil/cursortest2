package com.ironsource;

/* loaded from: classes5.dex */
public final class I6 implements com.ironsource.InterfaceC3307u6, com.ironsource.C3218p6.b, com.ironsource.C3218p6.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f5754a;
    private final com.ironsource.InterfaceC3307u6.a b;
    private final com.ironsource.InterfaceC3236q6 c;
    private final com.ironsource.InterfaceC3271s6 d;
    private final com.ironsource.InterfaceC3289t6 e;
    private com.ironsource.C3218p6 f;

    public I6(com.ironsource.C3212p0 adTools, com.ironsource.InterfaceC3307u6.a config, com.ironsource.InterfaceC3236q6 fullscreenAdUnitFactory, com.ironsource.InterfaceC3271s6 fullscreenAdUnitListener, com.ironsource.InterfaceC3289t6 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5754a = adTools;
        this.b = config;
        this.c = fullscreenAdUnitFactory;
        this.d = fullscreenAdUnitListener;
        this.e = listener;
    }

    public final com.ironsource.C3212p0 a() {
        return this.f5754a;
    }

    public final com.ironsource.InterfaceC3307u6.a b() {
        return this.b;
    }

    @Override // com.ironsource.C3218p6.b
    public void c(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC3307u6
    public void loadAd() {
        com.ironsource.C3218p6 a2 = this.c.a(true, this.d);
        a2.a(this);
        this.f = a2;
    }

    @Override // com.ironsource.InterfaceC3307u6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.ironsource.C3218p6 c3218p6 = this.f;
        if (c3218p6 != null) {
            c3218p6.a(activity, this);
        }
    }

    @Override // com.ironsource.C3218p6.b
    public void b(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    @Override // com.ironsource.C3218p6.b
    public void a(com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f = null;
        this.e.a();
    }

    @Override // com.ironsource.C3218p6.b
    public void b(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
    }

    @Override // com.ironsource.C3218p6.a
    public void a(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adInfo);
    }

    @Override // com.ironsource.C3218p6.a
    public void a(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.c(ironSourceError);
    }
}
