package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fe implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.Ah, com.inmobi.media.I, com.inmobi.media.InterfaceC2419g {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Nc f4706a;
    public final com.inmobi.media.C2867x b;
    public final com.inmobi.ads.controllers.PublisherCallbacks c;
    public final com.inmobi.media.AbstractC2861wj d;

    public Fe(com.inmobi.media.Nc adUnit, com.inmobi.media.C2867x adComponent, com.inmobi.ads.controllers.PublisherCallbacks publisherCallbacks, com.inmobi.media.AbstractC2861wj stateMachine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f4706a = adUnit;
        this.b = adComponent;
        this.c = publisherCallbacks;
        this.d = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.b.f5538a.c;
        if (c2799u9 != null) {
            c2799u9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.f4706a.b.d();
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        com.inmobi.media.C2799u9 c2799u9 = this.b.f5538a.c;
        if (c2799u9 != null) {
            c2799u9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.d.a(new com.inmobi.media.Ae(this.f4706a, this.b, this.c, this.d), this);
    }

    @Override // com.inmobi.media.InterfaceC2419g
    public final void j() {
        this.d.a(new com.inmobi.media.C2821v5(this.f4706a, null, this.b), this);
    }

    @Override // com.inmobi.media.Ah
    public final void a(com.inmobi.media.ads.nativeAd.InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        com.inmobi.media.C2799u9 c2799u9 = this.b.f5538a.c;
        if (c2799u9 != null) {
            c2799u9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        com.inmobi.media.Nc nc = this.f4706a;
        nc.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        nc.b.a(inMobiNativeViewData);
    }
}
