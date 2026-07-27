package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4524m1;
import com.ironsource.InterfaceC4432gg;
import com.ironsource.InterfaceC4470j1;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Y2 implements InterfaceC4767zb, C2 {

    /* renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f8019a;
    private final AdSize b;
    private final InterfaceC4543n2 c;
    private final Ab d;
    private final InterfaceC4660tc e;
    private final InterfaceC4596q1 f;
    private final V<BannerAdView> g;
    private final F2 h;
    private final InterfaceC4432gg.c i;
    private final Executor j;
    private C4385e5 k;
    private InterfaceC4432gg l;
    private W1 m;
    private boolean n;

    public static final class a implements InterfaceC4432gg.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC4432gg.a
        public void a() {
            Y2.this.a(C4635s5.f8523a.s());
        }
    }

    public Y2(BannerAdRequest adRequest, AdSize size, InterfaceC4543n2 auctionResponseFetcher, Ab loadTaskConfig, InterfaceC4660tc networkLoadApi, InterfaceC4596q1 analytics, V<BannerAdView> adLoadTaskListener, F2 adLayoutFactory, InterfaceC4432gg.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f8019a = adRequest;
        this.b = size;
        this.c = auctionResponseFetcher;
        this.d = loadTaskConfig;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adLoadTaskListener;
        this.h = adLayoutFactory;
        this.i = timerFactory;
        this.j = taskFinishedExecutor;
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

    @Override // com.ironsource.C2
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C4635s5.f8523a.c(description));
    }

    @Override // com.ironsource.C2
    public void onBannerLoadSuccess(final J9 adInstance, final C4370d8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.Y2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Y2.a(Y2.this, adInstance, adContainer);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.InterfaceC4767zb
    public void start() {
        this.k = new C4385e5();
        this.f.a(new C4524m1.s(this.d.f()), new C4524m1.n(this.d.g().b()), new C4524m1.c(this.b), new C4524m1.b(this.f8019a.getAdId$mediationsdk_release()));
        InterfaceC4470j1.c.f8258a.a().a(this.f);
        a(this.f8019a.getExtraParams());
        long h = this.d.h();
        InterfaceC4432gg.c cVar = this.i;
        InterfaceC4432gg.b bVar = new InterfaceC4432gg.b();
        bVar.b(h);
        Unit unit = Unit.INSTANCE;
        InterfaceC4432gg a2 = cVar.a(bVar);
        this.l = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.c.a();
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
        EnumC4586p9 g = this.d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C4334b8 c4334b8 = new C4334b8(AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        Ic ic = new Ic();
        ic.a(this);
        J9 adInstance = new K9(this.f8019a.getProviderName$mediationsdk_release().value(), ic).a(g.b(EnumC4586p9.Bidder)).a(c4334b8).b(this.d.i()).a(this.f8019a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C4535mc().a(), O5.f7824a.a(this.f8019a.getExtraParams()))).a();
        C4696vc c4696vc = new C4696vc(c4489k2, this.d.j());
        this.m = new W1(new C4550n9(this.f8019a.getInstanceId(), g.b(), c4489k2.a()), new com.ironsource.mediationsdk.d(), c4489k2.c());
        InterfaceC4470j1.d.f8260a.c().a(this.f);
        InterfaceC4660tc interfaceC4660tc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC4660tc.a(adInstance, c4696vc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y2 this$0, J9 adInstance, C4370d8 adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        InterfaceC4432gg interfaceC4432gg = this$0.l;
        if (interfaceC4432gg != null) {
            interfaceC4432gg.cancel();
        }
        C4385e5 c4385e5 = this$0.k;
        if (c4385e5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4385e5 = null;
        }
        InterfaceC4470j1.c.f8258a.a(new C4524m1.f(C4385e5.a(c4385e5))).a(this$0.f);
        W1 w1 = this$0.m;
        if (w1 != null) {
            w1.c("onBannerLoadSuccess");
        }
        F2 f2 = this$0.h;
        W1 w12 = this$0.m;
        Intrinsics.checkNotNull(w12);
        this$0.g.a((V<BannerAdView>) f2.a(adInstance, adContainer, w12));
    }

    public /* synthetic */ Y2(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC4543n2 interfaceC4543n2, Ab ab, InterfaceC4660tc interfaceC4660tc, InterfaceC4596q1 interfaceC4596q1, V v, F2 f2, InterfaceC4432gg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC4543n2, ab, interfaceC4660tc, interfaceC4596q1, v, f2, (i & 256) != 0 ? new InterfaceC4432gg.d() : cVar, (i & 512) != 0 ? O7.f7826a.d() : executor);
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.Y2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Y2.a(Y2.this, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y2 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        InterfaceC4432gg interfaceC4432gg = this$0.l;
        if (interfaceC4432gg != null) {
            interfaceC4432gg.cancel();
        }
        InterfaceC4470j1.c.a aVar = InterfaceC4470j1.c.f8258a;
        C4524m1.j jVar = new C4524m1.j(error.getErrorCode());
        C4524m1.k kVar = new C4524m1.k(error.getErrorMessage());
        C4385e5 c4385e5 = this$0.k;
        if (c4385e5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4385e5 = null;
        }
        aVar.a(jVar, kVar, new C4524m1.f(C4385e5.a(c4385e5))).a(this$0.f);
        W1 w1 = this$0.m;
        if (w1 != null) {
            w1.a("onBannerLoadFail");
        }
        this$0.g.a(error);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC4470j1.d.f8260a.a(new C4524m1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
