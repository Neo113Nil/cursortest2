package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.Ba;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ba implements InterfaceC4730xa {

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f7569a;
    private final U2 b;
    private final long c;
    private final long d;
    private InterfaceC4748ya e;
    private final L2 f;
    private final Df g;
    private final InterfaceC4527m4 h;
    private final boolean i;
    private L0 j;
    private InterfaceC4756z0 k;
    private M2 l;
    private Ka m;

    public static final class a implements M2 {
        a() {
        }

        public void a() {
            Ba.this.m().onAdLeftApplication();
        }

        public void b() {
            Ba.this.m().k();
        }

        public void c() {
            Ba.this.m().i();
        }

        @Override // com.ironsource.J0
        public void e() {
            Ba.this.m().onAdClicked();
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
            Ba.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.L0
        public void b(IronSourceError ironSourceError) {
            Ba.this.l().b(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4756z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC4756z0
        public void a(LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            Ba.this.m().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC4756z0
        public void c(IronSourceError ironSourceError) {
            Ba.this.m().d(ironSourceError);
        }
    }

    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ J2 b;
        final /* synthetic */ AbstractC4365d3 c;
        final /* synthetic */ Long d;

        d(J2 j2, AbstractC4365d3 abstractC4365d3, Long l) {
            this.b = j2;
            this.c = abstractC4365d3;
            this.d = l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ba this$0, J2 currentAdUnit, AbstractC4365d3 reloadReason) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
            Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
            Ba.a(this$0, currentAdUnit, reloadReason, false, 4, (Object) null);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ba.this.j().getViewTreeObserver().isAlive()) {
                Ba.this.j().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (Fg.a(Ba.this.j(), new Rect())) {
                C4577p0 a2 = Ba.this.a();
                final Ba ba = Ba.this;
                final J2 j2 = this.b;
                final AbstractC4365d3 abstractC4365d3 = this.c;
                a2.a(new Runnable() { // from class: com.ironsource.Ba$d$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Ba.d.a(Ba.this, j2, abstractC4365d3);
                    }
                });
                return;
            }
            C4577p0 a3 = Ba.this.a();
            final Ba ba2 = Ba.this;
            final J2 j22 = this.b;
            final Long l = this.d;
            a3.a(new Runnable() { // from class: com.ironsource.Ba$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Ba.d.a(Ba.this, j22, l);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Ba this$0, J2 currentAdUnit, Long l) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
            this$0.a((Ka) new Ea(this$0, currentAdUnit, l));
        }
    }

    public Ba(C4577p0 adTools, U2 bannerContainer, long j, long j2, InterfaceC4748ya strategyListener, L2 bannerAdUnitFactory, Df taskScheduler, InterfaceC4527m4 timeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f7569a = adTools;
        this.b = bannerContainer;
        this.c = j;
        this.d = j2;
        this.e = strategyListener;
        this.f = bannerAdUnitFactory;
        this.g = taskScheduler;
        this.h = timeProvider;
        this.i = z;
        this.j = new b();
        this.k = new c();
        this.l = new a();
        this.m = new Ca(this, false, 2, null);
    }

    public final C4577p0 a() {
        return this.f7569a;
    }

    public final void b(InterfaceC4748ya interfaceC4748ya) {
        Intrinsics.checkNotNullParameter(interfaceC4748ya, "<set-?>");
        this.e = interfaceC4748ya;
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void c() {
        this.m.c();
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void d() {
        this.m.d();
    }

    public final M2 e() {
        return this.l;
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void f() {
        this.m.f();
    }

    public final L0 g() {
        return this.j;
    }

    public final InterfaceC4756z0 h() {
        return this.k;
    }

    public final L2 i() {
        return this.f;
    }

    public final U2 j() {
        return this.b;
    }

    public final long k() {
        return this.c;
    }

    public final Ka l() {
        return this.m;
    }

    public final InterfaceC4748ya m() {
        return this.e;
    }

    public final Df n() {
        return this.g;
    }

    public final InterfaceC4527m4 o() {
        return this.h;
    }

    public final long p() {
        return this.d;
    }

    public final void q() {
        this.f7569a.f().h().h("Banner view is not visible");
    }

    public final void a(L0 l0) {
        Intrinsics.checkNotNullParameter(l0, "<set-?>");
        this.j = l0;
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void b() {
        this.m.b();
    }

    public final void a(InterfaceC4756z0 interfaceC4756z0) {
        Intrinsics.checkNotNullParameter(interfaceC4756z0, "<set-?>");
        this.k = interfaceC4756z0;
    }

    public final void a(M2 m2) {
        Intrinsics.checkNotNullParameter(m2, "<set-?>");
        this.l = m2;
    }

    public final void a(Ka ka) {
        Intrinsics.checkNotNullParameter(ka, "<set-?>");
        this.m = ka;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f7569a.f().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(C4666u0 adUnitCallback, J2 currentAdUnit, J2 j2, AbstractC4365d3 reloadReason, boolean z, Long l) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.b.getViewBinder(), this.k);
        LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 != null) {
            this.e.onAdLoaded(c2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C4577p0.a(this.f7569a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (j2 != null) {
            j2.a(false);
        }
        if (z) {
            this.m = new Ga(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l);
        }
    }

    public final void a(IronSourceError ironSourceError, J2 currentAdUnit, AbstractC4365d3 reloadReason, boolean z, boolean z2, Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.e.a(ironSourceError);
        if (z2) {
            this.m = new Ga(this, currentAdUnit);
        } else if (z) {
            a(currentAdUnit, reloadReason, l);
        } else {
            a(currentAdUnit, reloadReason, this.i);
        }
    }

    public final void a(final J2 currentAdUnit, final AbstractC4365d3 reloadReason, final Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f7569a.b(new Runnable() { // from class: com.ironsource.Ba$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ba.a(Ba.this, currentAdUnit, reloadReason, l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Ba this$0, final J2 currentAdUnit, final AbstractC4365d3 reloadReason, final Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (Fg.a(this$0.b, new Rect())) {
            this$0.f7569a.a(new Runnable() { // from class: com.ironsource.Ba$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Ba.a(Ba.this, currentAdUnit, reloadReason);
                }
            });
        } else if (!this$0.b.getViewTreeObserver().isAlive()) {
            this$0.f7569a.a(new Runnable() { // from class: com.ironsource.Ba$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Ba.a(Ba.this, currentAdUnit, l);
                }
            });
        } else {
            this$0.b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new d(currentAdUnit, reloadReason, l));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ba(C4577p0 c4577p0, U2 u2, long j, long j2, InterfaceC4748ya interfaceC4748ya, L2 l2, Df df, InterfaceC4527m4 interfaceC4527m4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4577p0, u2, j, j2, interfaceC4748ya, l2, r16, interfaceC4527m4, z);
        Df df2;
        if ((i & 64) != 0) {
            df2 = new Cf(null, null, null, 7, null);
        } else {
            df2 = df;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ba this$0, J2 currentAdUnit, AbstractC4365d3 reloadReason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        a(this$0, currentAdUnit, reloadReason, false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ba this$0, J2 currentAdUnit, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        this$0.m = new Ea(this$0, currentAdUnit, l);
    }

    public static /* synthetic */ void a(Ba ba, J2 j2, AbstractC4365d3 abstractC4365d3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        ba.a(j2, abstractC4365d3, z);
    }

    public final void a(J2 currentAdUnit, AbstractC4365d3 reloadReason, boolean z) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        J2 a2 = this.f.a(false);
        Ha ha = new Ha(this, currentAdUnit, a2, this.h.a(), z);
        a(reloadReason);
        this.m = ha;
        a2.a(this.j);
    }

    private final void a(AbstractC4365d3 abstractC4365d3) {
        this.f7569a.f().h().a(abstractC4365d3.c(), abstractC4365d3.b(), abstractC4365d3.a());
    }

    @Override // com.ironsource.InterfaceC4730xa
    public void a(InterfaceC4748ya listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.e = listener;
    }
}
