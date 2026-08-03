package com.inmobi.media;

/* renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2881xd extends com.inmobi.media.AbstractC2892y implements com.inmobi.media.Ah, com.inmobi.media.InterfaceC2782tj, com.inmobi.media.I, com.inmobi.media.InterfaceC2419g {
    public final com.inmobi.media.Nc b;
    public final com.inmobi.media.C2867x c;
    public final com.inmobi.media.AbstractC2735s1 d;
    public final com.inmobi.media.Ic e;
    public final com.inmobi.media.C2511je f;
    public final com.inmobi.media.C2867x g;
    public final com.inmobi.media.Nc h;
    public final com.inmobi.media.Pc i;
    public final com.inmobi.media.Ic j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2881xd(com.inmobi.media.C2511je nativePubData, com.inmobi.media.C2867x adComponent, com.inmobi.media.Nc adUnit, com.inmobi.media.AbstractC2735s1 adUnitTimeout, com.inmobi.media.Pc nativeCallback, com.inmobi.media.Ic stateMachine) {
        super(adComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativePubData, "nativePubData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adUnit;
        this.c = adComponent;
        this.d = adUnitTimeout;
        this.e = stateMachine;
        this.f = nativePubData;
        this.g = adComponent;
        this.h = adUnit;
        this.i = nativeCallback;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        com.inmobi.media.InterfaceC2772t9 l2 = l();
        if (l2 != null) {
            ((com.inmobi.media.C2799u9) l2).a("AUM-LoadedState", "Initialize Called");
        }
        this.d.e();
        com.inmobi.media.C2313c0 c2313c0 = this.f5559a.f5538a.d;
        c2313c0.getClass();
        c2313c0.g = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.T4.a(k(), new com.inmobi.media.C2855wd(this, null));
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-LoadedState", "onAdDisplayed");
        }
        com.inmobi.media.InterfaceC2772t9 l2 = l();
        if (l2 != null) {
            ((com.inmobi.media.C2799u9) l2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.j.a(new com.inmobi.media.Ae(this.h, this.g, this.i, this.j), this);
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-LoadedState", "onDestroy");
        }
        this.e.a(new com.inmobi.media.C2821v5(this.b, this.d, this.c), this);
    }

    @Override // com.inmobi.media.Ah
    public final void a(com.inmobi.media.ads.nativeAd.InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        com.inmobi.media.Nc nc = this.h;
        nc.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        nc.b.a(inMobiNativeViewData);
    }
}
