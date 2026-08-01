package com.ironsource;

import android.content.Context;
import com.ironsource.Vb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class Vb extends B implements NativeAdListener {
    private AdapterNativeAdViewBinder A;
    private AdapterNativeAdData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(T0 adTools, C instanceData, I adInstancePayload, F listener) {
        super(adTools, instanceData, adInstancePayload, null, listener, 8, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData i = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().f().h().g("activity must not be null");
            return;
        }
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        Intrinsics.checkNotNullExpressionValue(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) g).loadAd(i, activeContext, this);
    }

    public final AdapterNativeAdData K() {
        return this.z;
    }

    public final AdapterNativeAdViewBinder L() {
        return this.A;
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        super.b();
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            a(new a());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.z = adapterNativeAdData;
        this.A = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(Ob nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.z);
        nativeAdBinder.a(this.A);
    }

    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        public final void a() {
            try {
                if (Vb.this.g() instanceof AdapterNativeAdInterface) {
                    Object g = Vb.this.g();
                    Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                    ((AdapterNativeAdInterface) g).destroyAd(Vb.this.i());
                } else {
                    IronLog.INTERNAL.error(Vb.this.a("adapter not instance of AdapterNativeAdInterface"));
                }
            } catch (Throwable th) {
                T0 f = Vb.this.f();
                final Vb vb = Vb.this;
                f.a(new Runnable() { // from class: com.ironsource.Vb$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Vb.a.a(th, vb);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable t, Vb this$0) {
            Intrinsics.checkNotNullParameter(t, "$t");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C4491k4.d().a(t);
            String str = "destroyNativeAd - exception = " + t.getLocalizedMessage();
            IronLog.INTERNAL.error(this$0.a(str));
            this$0.f().f().h().g(str);
        }
    }
}
