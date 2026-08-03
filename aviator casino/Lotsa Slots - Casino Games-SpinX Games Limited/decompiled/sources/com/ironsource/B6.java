package com.ironsource;

/* loaded from: classes5.dex */
public final class B6 implements com.ironsource.InterfaceC3307u6, com.ironsource.C3218p6.b, com.ironsource.C3218p6.a {
    public static final com.ironsource.B6.a f = new com.ironsource.B6.a(null);
    public static final java.lang.String g = "Fullscreen ProgressiveOnShown Strategy";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f5623a;
    private final com.ironsource.InterfaceC3236q6 b;
    private final com.ironsource.InterfaceC3271s6 c;
    private final com.ironsource.InterfaceC3289t6 d;
    private com.ironsource.H6 e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public B6(com.ironsource.C3212p0 adTools, com.ironsource.InterfaceC3236q6 factory, com.ironsource.InterfaceC3271s6 fullscreenAdUnitListener, com.ironsource.InterfaceC3289t6 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5623a = adTools;
        this.b = factory;
        this.c = fullscreenAdUnitListener;
        this.d = listener;
        this.e = new com.ironsource.C6(this, null, false, 4, null);
    }

    public final com.ironsource.C3212p0 a() {
        return this.f5623a;
    }

    public final com.ironsource.InterfaceC3236q6 b() {
        return this.b;
    }

    public final com.ironsource.InterfaceC3271s6 c() {
        return this.c;
    }

    public final com.ironsource.InterfaceC3289t6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3307u6
    public void loadAd() {
        this.e.loadAd();
    }

    @Override // com.ironsource.InterfaceC3307u6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(activity);
    }

    @Override // com.ironsource.C3218p6.b
    public void b(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.c(adInfo);
    }

    @Override // com.ironsource.C3218p6.b
    public void c(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    public final void a(com.ironsource.H6 state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        this.e = state;
    }

    @Override // com.ironsource.C3218p6.b
    public void b(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
    }

    public final void a(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.f5623a.e().h().f("Fullscreen ProgressiveOnShown Strategy - " + message);
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

    @Override // com.ironsource.C3218p6.b
    public void a(com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a();
    }
}
