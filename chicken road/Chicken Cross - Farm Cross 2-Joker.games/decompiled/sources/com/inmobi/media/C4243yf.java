package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.yf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4243yf implements Ok, Pi, J, InterfaceC3722g {

    /* renamed from: a, reason: collision with root package name */
    public final Fd f7502a;
    public final C4227y b;
    public final PublisherCallbacks c;
    public final Rk d;

    public C4243yf(Fd adUnit, C4227y adComponent, PublisherCallbacks publisherCallbacks, Rk stateMachine) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f7502a = adUnit;
        this.b = adComponent;
        this.c = publisherCallbacks;
        this.d = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Z9 z9 = this.b.f7489a.c;
        if (z9 != null) {
            z9.a("AUM-NativeUnTrackedState", "Initialize Called");
        }
        this.f7502a.b.d();
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.J
    public final void g() {
        Z9 z9 = this.b.f7489a.c;
        if (z9 != null) {
            z9.a("AUM-NativeUnTrackedState", "onAdDisplayed");
        }
        this.d.a(new C4106tf(this.f7502a, this.b, this.c, this.d), this);
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        this.d.a(new S5(this.f7502a, null, this.b), this);
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        Z9 z9 = this.b.f7489a.c;
        if (z9 != null) {
            z9.a("AUM-NativeUnTrackedState", "registerViewForTracking");
        }
        Fd fd = this.f7502a;
        fd.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        fd.b.a(inMobiNativeViewData);
    }
}
