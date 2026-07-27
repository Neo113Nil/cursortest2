package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class La implements InterfaceC4730xa {

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f7734a;
    private final U2 b;
    private final L2 c;
    private InterfaceC4748ya d;
    private Qa e;
    private J2 f;
    private final L0 g;
    private final InterfaceC4756z0 h;
    private final M2 i;

    public static final class a implements M2 {
        a() {
        }

        public void a() {
            InterfaceC4748ya m = La.this.m();
            if (m != null) {
                m.onAdLeftApplication();
            }
        }

        public void b() {
            InterfaceC4748ya m = La.this.m();
            if (m != null) {
                m.k();
            }
        }

        public void c() {
            InterfaceC4748ya m = La.this.m();
            if (m != null) {
                m.i();
            }
        }

        @Override // com.ironsource.J0
        public void e() {
            InterfaceC4748ya m = La.this.m();
            if (m != null) {
                m.onAdClicked();
            }
        }

        @Override // com.ironsource.M2
        public /* bridge */ /* synthetic */ Unit g() {
            a();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.M2
        public /* bridge */ /* synthetic */ Unit h() {
            c();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.M2
        public /* bridge */ /* synthetic */ Unit j() {
            b();
            return Unit.INSTANCE;
        }
    }

    public static final class b implements L0 {
        b() {
        }

        @Override // com.ironsource.L0
        public void a(C4666u0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            La.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void b(IronSourceError ironSourceError) {
            La.this.l().b(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4756z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC4756z0
        public void a(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            InterfaceC4748ya m = La.this.m();
            if (m != null) {
                m.onAdDisplayed(adInfo);
            }
        }

        @Override // com.ironsource.InterfaceC4756z0
        public void c(IronSourceError ironSourceError) {
            InterfaceC4748ya m = La.this.m();
            if (m != null) {
                m.d(ironSourceError);
            }
        }
    }

    public La(C4577p0 adTools, U2 bannerContainer, L2 bannerAdUnitFactory) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f7734a = adTools;
        this.b = bannerContainer;
        this.c = bannerAdUnitFactory;
        this.e = new Ma(this);
        this.g = new b();
        this.h = new c();
        this.i = new a();
    }

    public final C4577p0 a() {
        return this.f7734a;
    }

    public final void b(InterfaceC4748ya interfaceC4748ya) {
        this.d = interfaceC4748ya;
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void c() {
        this.e.c();
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void d() {
    }

    public final M2 e() {
        return this.i;
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void f() {
    }

    public final L0 g() {
        return this.g;
    }

    public final InterfaceC4756z0 h() {
        return this.h;
    }

    public final L2 i() {
        return this.c;
    }

    public final U2 j() {
        return this.b;
    }

    public final J2 k() {
        return this.f;
    }

    public final Qa l() {
        return this.e;
    }

    public final InterfaceC4748ya m() {
        return this.d;
    }

    public final void a(Qa qa) {
        Intrinsics.checkNotNullParameter(qa, "<set-?>");
        this.e = qa;
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void b() {
        this.e.b();
    }

    public final void a(J2 j2) {
        this.f = j2;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f7734a.f().h().f("Banner Single Ad Unit Strategy - " + message);
    }

    public final void a(C4666u0 adUnitCallback, J2 adUnit) {
        InterfaceC4748ya interfaceC4748ya;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        adUnit.a(this.b.getViewBinder(), this.h);
        LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 == null || (interfaceC4748ya = this.d) == null) {
            return;
        }
        interfaceC4748ya.onAdLoaded(c2);
    }

    public final void a(IronSourceError ironSourceError) {
        InterfaceC4748ya interfaceC4748ya = this.d;
        if (interfaceC4748ya != null) {
            interfaceC4748ya.a(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void a(InterfaceC4748ya listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }
}
