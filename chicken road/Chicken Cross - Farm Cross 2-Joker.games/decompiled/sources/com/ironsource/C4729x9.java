package com.ironsource;

import android.os.Bundle;
import com.ironsource.C4524m1;
import com.ironsource.InterfaceC4432gg;
import com.ironsource.InterfaceC4470j1;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4729x9 implements InterfaceC4767zb, Z5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f8759a;
    private final Ab b;
    private final V<InterstitialAd> c;
    private final InterfaceC4543n2 d;
    private final InterfaceC4660tc e;
    private final InterfaceC4596q1 f;
    private final InterfaceC4380e0<InterstitialAd> g;
    private final InterfaceC4432gg.c h;
    private final Executor i;
    private C4385e5 j;
    private InterfaceC4432gg k;
    private W1 l;
    private boolean m;

    /* renamed from: com.ironsource.x9$a */
    public static final class a implements InterfaceC4432gg.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC4432gg.a
        public void a() {
            C4729x9.this.a(C4635s5.f8523a.s());
        }
    }

    public C4729x9(InterstitialAdRequest adRequest, Ab loadTaskConfig, V<InterstitialAd> adLoadTaskListener, InterfaceC4543n2 auctionResponseFetcher, InterfaceC4660tc networkLoadApi, InterfaceC4596q1 analytics, InterfaceC4380e0<InterstitialAd> adObjectFactory, InterfaceC4432gg.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f8759a = adRequest;
        this.b = loadTaskConfig;
        this.c = adLoadTaskListener;
        this.d = auctionResponseFetcher;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adObjectFactory;
        this.h = timerFactory;
        this.i = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a2 = O5.f7824a.a(bundle);
        for (String str : a2.keySet()) {
            InterfaceC4470j1.c.f8258a.a(new C4524m1.l(str + U3.j.b + String.valueOf(a2.get(str)))).a(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC4767zb
    public void start() {
        this.j = new C4385e5();
        this.f.a(new C4524m1.s(this.b.f()), new C4524m1.n(this.b.g().b()), new C4524m1.b(this.f8759a.getAdId$mediationsdk_release()));
        InterfaceC4470j1.c.f8258a.a().a(this.f);
        a(this.f8759a.getExtraParams());
        long h = this.b.h();
        InterfaceC4432gg.c cVar = this.h;
        InterfaceC4432gg.b bVar = new InterfaceC4432gg.b();
        bVar.b(h);
        Unit unit = Unit.INSTANCE;
        InterfaceC4432gg a2 = cVar.a(bVar);
        this.k = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.d.a();
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a3);
        if (m8082exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(m8082exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((Y7) m8082exceptionOrNullimpl).a());
            a3 = null;
        }
        C4489k2 c4489k2 = (C4489k2) a3;
        if (c4489k2 == null) {
            return;
        }
        InterfaceC4596q1 interfaceC4596q1 = this.f;
        String b = c4489k2.b();
        if (b != null) {
            interfaceC4596q1.a(new C4524m1.d(b));
        }
        JSONObject f = c4489k2.f();
        if (f != null) {
            interfaceC4596q1.a(new C4524m1.m(f));
        }
        String a4 = c4489k2.a();
        if (a4 != null) {
            interfaceC4596q1.a(new C4524m1.g(a4));
        }
        EnumC4586p9 g = this.b.g();
        Y5 y5 = new Y5();
        y5.a(this);
        J9 adInstance = new K9(this.f8759a.getProviderName$mediationsdk_release().value(), y5).a(g.b(EnumC4586p9.Bidder)).b(this.b.i()).a(this.f8759a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C4535mc().a(), O5.f7824a.a(this.f8759a.getExtraParams()))).a();
        InterfaceC4596q1 interfaceC4596q12 = this.f;
        String e = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        interfaceC4596q12.a(new C4524m1.b(e));
        C4696vc c4696vc = new C4696vc(c4489k2, this.b.j());
        this.l = new W1(new C4550n9(this.f8759a.getInstanceId(), g.b(), c4489k2.a()), new com.ironsource.mediationsdk.d(), c4489k2.c());
        InterfaceC4470j1.d.f8260a.c().a(this.f);
        InterfaceC4660tc interfaceC4660tc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC4660tc.a(adInstance, c4696vc);
    }

    @Override // com.ironsource.Z5
    public void a(final J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.x9$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4729x9.a(C4729x9.this, adInstance);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    public /* synthetic */ C4729x9(InterstitialAdRequest interstitialAdRequest, Ab ab, V v, InterfaceC4543n2 interfaceC4543n2, InterfaceC4660tc interfaceC4660tc, InterfaceC4596q1 interfaceC4596q1, InterfaceC4380e0 interfaceC4380e0, InterfaceC4432gg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, ab, v, interfaceC4543n2, interfaceC4660tc, interfaceC4596q1, interfaceC4380e0, (i & 128) != 0 ? new InterfaceC4432gg.d() : cVar, (i & 256) != 0 ? O7.f7826a.d() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4729x9 this$0, J9 adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        InterfaceC4432gg interfaceC4432gg = this$0.k;
        if (interfaceC4432gg != null) {
            interfaceC4432gg.cancel();
        }
        C4385e5 c4385e5 = this$0.j;
        if (c4385e5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4385e5 = null;
        }
        InterfaceC4470j1.c.f8258a.a(new C4524m1.f(C4385e5.a(c4385e5))).a(this$0.f);
        W1 w1 = this$0.l;
        if (w1 != null) {
            w1.c("onAdInstanceDidLoad");
        }
        InterfaceC4380e0<InterstitialAd> interfaceC4380e0 = this$0.g;
        W1 w12 = this$0.l;
        Intrinsics.checkNotNull(w12);
        this$0.c.a((V<InterstitialAd>) interfaceC4380e0.a(adInstance, w12));
    }

    @Override // com.ironsource.Z5
    public void a(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C4635s5.f8523a.c(description));
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.x9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4729x9.a(C4729x9.this, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4729x9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        InterfaceC4432gg interfaceC4432gg = this$0.k;
        if (interfaceC4432gg != null) {
            interfaceC4432gg.cancel();
        }
        InterfaceC4470j1.c.a aVar = InterfaceC4470j1.c.f8258a;
        C4524m1.j jVar = new C4524m1.j(error.getErrorCode());
        C4524m1.k kVar = new C4524m1.k(error.getErrorMessage());
        C4385e5 c4385e5 = this$0.j;
        if (c4385e5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4385e5 = null;
        }
        aVar.a(jVar, kVar, new C4524m1.f(C4385e5.a(c4385e5))).a(this$0.f);
        W1 w1 = this$0.l;
        if (w1 != null) {
            w1.a("onAdInstanceDidFailToLoad");
        }
        this$0.c.a(error);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC4470j1.d.f8260a.a(new C4524m1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
