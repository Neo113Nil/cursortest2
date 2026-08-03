package com.ironsource;

/* renamed from: com.ironsource.v6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3325v6 implements com.ironsource.InterfaceC3307u6, com.ironsource.C3218p6.b, com.ironsource.C3218p6.a {
    public static final com.ironsource.C3325v6.a f = new com.ironsource.C3325v6.a(null);
    public static final java.lang.String g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f6773a;
    private final com.ironsource.InterfaceC3236q6 b;
    private final com.ironsource.InterfaceC3271s6 c;
    private final com.ironsource.InterfaceC3289t6 d;
    private com.ironsource.A6 e;

    /* renamed from: com.ironsource.v6$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3325v6(com.ironsource.C3212p0 adTools, com.ironsource.InterfaceC3236q6 factory, com.ironsource.InterfaceC3271s6 fullscreenAdUnitListener, com.ironsource.InterfaceC3289t6 listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6773a = adTools;
        this.b = factory;
        this.c = fullscreenAdUnitListener;
        this.d = listener;
        this.e = new com.ironsource.C3343w6(this);
    }

    public final com.ironsource.C3212p0 a() {
        return this.f6773a;
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

    public final void a(com.ironsource.A6 state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        this.e = state;
    }

    @Override // com.ironsource.C3218p6.b
    public void b(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adUnit, adInfo);
    }

    @Override // com.ironsource.C3218p6.b
    public void c(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.c(adUnit, adInfo);
    }

    @Override // com.ironsource.InterfaceC3307u6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.e.a(activity);
    }

    @Override // com.ironsource.C3218p6.b
    public void b(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C3218p6.b
    public void a(com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(adUnit);
    }

    @Override // com.ironsource.C3218p6.a
    public void a(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adUnit, adInfo);
    }

    @Override // com.ironsource.C3218p6.a
    public void a(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(adUnit, ironSourceError);
    }

    public final void a(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.f6773a.e().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + message);
    }
}
