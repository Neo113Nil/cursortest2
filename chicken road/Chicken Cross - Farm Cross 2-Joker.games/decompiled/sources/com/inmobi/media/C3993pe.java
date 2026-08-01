package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3993pe extends AbstractC4254z implements Pi, Ok, J, InterfaceC3722g {
    public final Fd b;
    public final C4227y c;
    public final AbstractC4120u1 d;
    public final Ad e;
    public final C3626cf f;
    public final C4227y g;
    public final Fd h;
    public final Hd i;
    public final Ad j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3993pe(C3626cf nativePubData, C4227y adComponent, Fd adUnit, AbstractC4120u1 adUnitTimeout, Hd nativeCallback, Ad stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(nativePubData, "nativePubData");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
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

    @Override // com.inmobi.media.Ok
    public final void a() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        Y9 l2 = l();
        if (l2 != null) {
            ((Z9) l2).a("AUM-LoadedState", "Initialize Called");
        }
        this.d.e();
        C3639d0 c3639d0 = this.f7514a.f7489a.d;
        c3639d0.getClass();
        c3639d0.g = SystemClock.elapsedRealtime();
        AbstractC4012q5.a(k(), new C3965oe(this, null));
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.J
    public final void g() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-LoadedState", "onAdDisplayed");
        }
        Y9 l2 = l();
        if (l2 != null) {
            ((Z9) l2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.j.a(new C4106tf(this.h, this.g, this.i, this.j), this);
    }

    @Override // com.inmobi.media.InterfaceC3722g
    public final void j() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-LoadedState", "onDestroy");
        }
        this.e.a(new S5(this.b, this.d, this.c), this);
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Fd fd = this.h;
        fd.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        fd.b.a(inMobiNativeViewData);
    }
}
