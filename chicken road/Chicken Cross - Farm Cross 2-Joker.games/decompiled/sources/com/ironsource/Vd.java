package com.ironsource;

import android.app.Activity;
import com.ironsource.C4524m1;
import com.ironsource.InterfaceC4470j1;
import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Vd implements InterfaceC4289a6 {

    /* renamed from: a, reason: collision with root package name */
    private J9 f7973a;
    private InterfaceC4344c0 b;
    private X1 c;
    private InterfaceC4596q1 d;
    private InterfaceC4499kc e;
    private InterfaceC4414fg f;
    private J8 g;
    private J8.a h;
    private final Map<String, Vd> i;
    private RewardedAdInfo j;
    private Wd k;

    public Vd(J9 adInstance, InterfaceC4344c0 adNetworkShow, X1 auctionDataReporter, InterfaceC4596q1 analytics, InterfaceC4499kc networkDestroyAPI, InterfaceC4414fg threadManager, J8 sessionDepthService, J8.a sessionDepthServiceEditor, Map<String, Vd> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f7973a = adInstance;
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
        String e = this.f7973a.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        this.j = new RewardedAdInfo(f, e);
        Y5 y5 = new Y5();
        this.f7973a.a(y5);
        y5.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Vd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wd wd = this$0.k;
        if (wd != null) {
            wd.onRewardedAdShown();
        }
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.j = rewardedAdInfo;
    }

    public final RewardedAdInfo b() {
        return this.j;
    }

    public final Wd c() {
        return this.k;
    }

    public final boolean d() {
        boolean a2 = this.b.a(this.f7973a);
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
        this.f.a(new Runnable() { // from class: com.ironsource.Vd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Vd.b(Vd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC4470j1.a.f8255a.a(new InterfaceC4542n1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Vd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Vd.c(Vd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidReward(String str, int i) {
        C4524m1.u uVar = new C4524m1.u("Virtual Item");
        C4524m1.t tVar = new C4524m1.t(1);
        C4524m1.q qVar = new C4524m1.q("DefaultRewardedVideo");
        String a2 = IronSourceUtils.a(System.currentTimeMillis(), this.f7973a.g());
        Intrinsics.checkNotNullExpressionValue(a2, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC4470j1.a.f8255a.c(uVar, tVar, qVar, new C4524m1.y(a2)).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Vd$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Vd.d(Vd.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void onAdInstanceDidShow() {
        J8 j8 = this.g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC4470j1.a.f8255a.b(new C4524m1.w(j8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.Vd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Vd.e(Vd.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Vd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wd wd = this$0.k;
        if (wd != null) {
            wd.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Vd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wd wd = this$0.k;
        if (wd != null) {
            wd.onRewardedAdDismissed();
        }
    }

    public final void a(Wd wd) {
        this.k = wd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Vd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wd wd = this$0.k;
        if (wd != null) {
            wd.onUserEarnedReward();
        }
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.f7973a)) {
            a(C4635s5.f8523a.t());
        } else {
            InterfaceC4470j1.a.f8255a.d(new InterfaceC4542n1[0]).a(this.d);
            this.b.a(activity, this.f7973a);
        }
    }

    @Override // com.ironsource.InterfaceC4289a6
    public void a(String str) {
        a(C4635s5.f8523a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC4470j1.a.f8255a.a(new C4524m1.j(ironSourceError.getErrorCode()), new C4524m1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.Vd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Vd.a(Vd.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Vd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Wd wd = this$0.k;
        if (wd != null) {
            wd.onRewardedAdFailedToShow(error);
        }
    }

    public final void a() {
        InterfaceC4414fg.a(this.f, new Runnable() { // from class: com.ironsource.Vd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Vd.a(Vd.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Vd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4470j1.d.f8260a.b().a(this$0.d);
        this$0.e.a(this$0.f7973a);
    }

    public /* synthetic */ Vd(J9 j9, InterfaceC4344c0 interfaceC4344c0, X1 x1, InterfaceC4596q1 interfaceC4596q1, InterfaceC4499kc interfaceC4499kc, InterfaceC4414fg interfaceC4414fg, J8 j8, J8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, interfaceC4344c0, x1, interfaceC4596q1, (i & 16) != 0 ? new C4517lc() : interfaceC4499kc, (i & 32) != 0 ? O7.f7826a : interfaceC4414fg, (i & 64) != 0 ? Ib.v.d().s() : j8, (i & 128) != 0 ? Ib.v.a().i() : aVar, map);
    }
}
