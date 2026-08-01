package com.ironsource;

import android.app.Activity;
import com.ironsource.C4524m1;
import com.ironsource.InterfaceC4470j1;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4693v9 implements InterfaceC4289a6 {

    /* renamed from: a, reason: collision with root package name */
    private J9 f8732a;
    private InterfaceC4344c0 b;
    private X1 c;
    private InterfaceC4596q1 d;
    private InterfaceC4499kc e;
    private InterfaceC4414fg f;
    private J8 g;
    private J8.a h;
    private final Map<String, C4693v9> i;
    private InterstitialAdInfo j;
    private InterfaceC4711w9 k;

    public C4693v9(J9 adInstance, InterfaceC4344c0 adNetworkShow, X1 auctionDataReporter, InterfaceC4596q1 analytics, InterfaceC4499kc networkDestroyAPI, InterfaceC4414fg threadManager, J8 sessionDepthService, J8.a sessionDepthServiceEditor, Map<String, C4693v9> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f8732a = adInstance;
        this.b = adNetworkShow;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = retainer;
        String f = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f, "adInstance.instanceId");
        String e = this.f8732a.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new InterstitialAdInfo(f, e);
        Y5 y5 = new Y5();
        this.f8732a.a(y5);
        y5.a(this);
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.j = interstitialAdInfo;
    }

    public final InterstitialAdInfo b() {
        return this.j;
    }

    public final InterfaceC4711w9 c() {
        return this.k;
    }

    public final boolean d() {
        boolean a2 = this.b.a(this.f8732a);
        InterfaceC4470j1.a.f8255a.a(a2).a(this.d);
        return a2;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4470j1.a.f8255a.f(new InterfaceC4542n1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidClick() {
        InterfaceC4470j1.a.f8255a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4693v9.b(C4693v9.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4470j1.a.f8255a.a(new InterfaceC4542n1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4693v9.c(C4693v9.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidReward(String str, int i) {
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidShow() {
        J8 j8 = this.g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4470j1.a.f8255a.b(new C4524m1.w(j8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4693v9.d(C4693v9.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4693v9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4711w9 interfaceC4711w9 = this$0.k;
        if (interfaceC4711w9 != null) {
            interfaceC4711w9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4693v9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4711w9 interfaceC4711w9 = this$0.k;
        if (interfaceC4711w9 != null) {
            interfaceC4711w9.onAdInstanceDidDismiss();
        }
    }

    public final void a(InterfaceC4711w9 interfaceC4711w9) {
        this.k = interfaceC4711w9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4693v9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4711w9 interfaceC4711w9 = this$0.k;
        if (interfaceC4711w9 != null) {
            interfaceC4711w9.onAdInstanceDidShow();
        }
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.f8732a)) {
            a(C4635s5.f8523a.t());
        } else {
            InterfaceC4470j1.a.f8255a.d(new InterfaceC4542n1[0]).a(this.d);
            this.b.a(activity, this.f8732a);
        }
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void a(String str) {
        a(C4635s5.f8523a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4470j1.a.f8255a.a(new C4524m1.j(ironSourceError.getErrorCode()), new C4524m1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4693v9.a(C4693v9.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4693v9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC4711w9 interfaceC4711w9 = this$0.k;
        if (interfaceC4711w9 != null) {
            interfaceC4711w9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        InterfaceC4414fg.a(this.f, new Runnable() { // from class: com.ironsource.v9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4693v9.a(C4693v9.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4693v9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4470j1.d.f8260a.b().a(this$0.d);
        this$0.e.a(this$0.f8732a);
    }

    public /* synthetic */ C4693v9(J9 j9, InterfaceC4344c0 interfaceC4344c0, X1 x1, InterfaceC4596q1 interfaceC4596q1, InterfaceC4499kc interfaceC4499kc, InterfaceC4414fg interfaceC4414fg, J8 j8, J8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, interfaceC4344c0, x1, interfaceC4596q1, (i & 16) != 0 ? new C4517lc() : interfaceC4499kc, (i & 32) != 0 ? O7.f7826a : interfaceC4414fg, (i & 64) != 0 ? Ib.v.d().s() : j8, (i & 128) != 0 ? Ib.v.a().i() : aVar, map);
    }
}
