package com.ironsource;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4524m1;
import com.ironsource.InterfaceC4470j1;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class N2 implements E2 {

    /* renamed from: a, reason: collision with root package name */
    private final J9 f7802a;
    private final C4370d8 b;
    private final W1 c;
    private final InterfaceC4596q1 d;
    private final InterfaceC4499kc e;
    private final InterfaceC4414fg f;
    private final J8 g;
    private final J8.a h;
    private final boolean i;
    private BannerAdInfo j;
    private WeakReference<O2> k;
    private View.OnAttachStateChangeListener l;
    private WeakReference<FrameLayout> m;

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C4334b8 size = N2.this.d().getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a(), 17);
            if (N2.this.i) {
                ViewParent parent = N2.this.d().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(N2.this.d());
                }
            }
            ((FrameLayout) v).addView(N2.this.d(), 0, layoutParams);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            ((FrameLayout) v).removeAllViews();
        }
    }

    public N2(J9 adInstance, C4370d8 container, W1 auctionDataReporter, InterfaceC4596q1 analytics, InterfaceC4499kc networkDestroyAPI, InterfaceC4414fg threadManager, J8 sessionDepthService, J8.a sessionDepthServiceEditor, InterfaceC4709w7 epService) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(epService, "epService");
        this.f7802a = adInstance;
        this.b = container;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = epService.n();
        String f = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        String e = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new BannerAdInfo(f, e);
        this.k = new WeakReference<>(null);
        this.m = new WeakReference<>(null);
        Ic ic = new Ic();
        adInstance.a(ic);
        ic.a(this);
    }

    public final void b(WeakReference<FrameLayout> value) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(value, "value");
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.l;
        if (onAttachStateChangeListener != null && (frameLayout = this.m.get()) != null) {
            frameLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.m = value;
        a a2 = a();
        this.l = a2;
        FrameLayout frameLayout2 = value.get();
        if (frameLayout2 != null) {
            frameLayout2.addOnAttachStateChangeListener(a2);
        }
    }

    public final BannerAdInfo c() {
        return this.j;
    }

    public final C4370d8 d() {
        return this.b;
    }

    public final WeakReference<O2> e() {
        return this.k;
    }

    public final WeakReference<FrameLayout> f() {
        return this.m;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.E2
    public void onBannerClick() {
        InterfaceC4470j1.a.f8255a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.N2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                N2.c(N2.this);
            }
        });
    }

    @Override // com.ironsource.E2
    public void onBannerShowSuccess() {
        J8 j8 = this.g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC4470j1.a.f8255a.f(new C4524m1.w(j8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onBannerShowSuccess");
        this.f.a(new Runnable() { // from class: com.ironsource.N2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                N2.d(N2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(N2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        O2 o2 = this$0.k.get();
        if (o2 != null) {
            o2.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(N2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        O2 o2 = this$0.k.get();
        if (o2 != null) {
            o2.onBannerAdShown();
        }
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.j = bannerAdInfo;
    }

    public final void a(WeakReference<O2> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.k = weakReference;
    }

    private final a a() {
        return new a();
    }

    public final void b() {
        InterfaceC4414fg.a(this.f, new Runnable() { // from class: com.ironsource.N2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                N2.b(N2.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(N2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4470j1.d.f8260a.b().a(this$0.d);
        this$0.e.a(this$0.f7802a);
    }

    public /* synthetic */ N2(J9 j9, C4370d8 c4370d8, W1 w1, InterfaceC4596q1 interfaceC4596q1, InterfaceC4499kc interfaceC4499kc, InterfaceC4414fg interfaceC4414fg, J8 j8, J8.a aVar, InterfaceC4709w7 interfaceC4709w7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, c4370d8, w1, interfaceC4596q1, (i & 16) != 0 ? new C4517lc() : interfaceC4499kc, (i & 32) != 0 ? O7.f7826a : interfaceC4414fg, (i & 64) != 0 ? Ib.v.d().s() : j8, (i & 128) != 0 ? Ib.v.a().i() : aVar, (i & 256) != 0 ? Ib.v.d().h() : interfaceC4709w7);
    }
}
