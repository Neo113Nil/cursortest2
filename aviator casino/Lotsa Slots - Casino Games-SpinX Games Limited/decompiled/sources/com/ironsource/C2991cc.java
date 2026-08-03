package com.ironsource;

/* renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2991cc extends com.ironsource.AbstractC3107j3<com.ironsource.R0> implements com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener, com.ironsource.E0 {
    private com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData r;
    private com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2991cc(com.ironsource.InterfaceC3243qd threadInterface, com.ironsource.C3176n0 adSmashData, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> baseAdAdapter, com.ironsource.C3064gd c3064gd, com.ironsource.C3232q2 item, com.ironsource.R0 r0) {
        super(threadInterface, adSmashData, baseAdAdapter, new com.ironsource.C3016e1(adSmashData.g(), adSmashData.g().getNativeAdSettings(), com.ironsource.mediationsdk.IronSource.a.NATIVE_AD), item, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        this.g = c3064gd;
    }

    private final void J() {
        com.ironsource.C3138kg c3138kg;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.e != com.ironsource.AbstractC3107j3.h.FAILED) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("unexpected onAdOpened for %s, state - %s", java.util.Arrays.copyOf(new java.lang.Object[]{k(), this.e}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            com.ironsource.F0 f0 = this.d;
            if (f0 == null || (c3138kg = f0.j) == null) {
                return;
            }
            c3138kg.q(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C2991cc this$0, com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC3107j3
    protected void G() {
        com.ironsource.C3138kg c3138kg;
        if (!(this.c instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface)) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("activity must not be null"));
            com.ironsource.F0 f0 = this.d;
            if (f0 == null || (c3138kg = f0.j) == null) {
                return;
            }
            c3138kg.g("activity must not be null");
            return;
        }
        java.lang.Object obj = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        com.ironsource.mediationsdk.adunit.adapter.utility.AdData mCurrentAdData = this.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        android.app.Activity currentActiveActivity = com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    public final void P() {
        com.ironsource.C3138kg c3138kg;
        com.ironsource.C3384yb c3384yb;
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(k());
        a(com.ironsource.AbstractC3107j3.h.NONE);
        java.lang.Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                com.ironsource.mediationsdk.adunit.adapter.utility.AdData mCurrentAdData = this.k;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a(str));
            com.ironsource.F0 f0 = this.d;
            if (f0 != null && (c3138kg = f0.j) != null) {
                c3138kg.g(str);
            }
        }
        com.ironsource.F0 f02 = this.d;
        if (f02 == null || (c3384yb = f02.f) == null) {
            return;
        }
        java.lang.Integer sessionDepth = r();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        c3384yb.a(sessionDepth.intValue());
    }

    public final com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData Q() {
        return this.r;
    }

    public final com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder R() {
        return this.s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(final com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, final com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new java.lang.Runnable() { // from class: com.ironsource.cc$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C2991cc.a(com.ironsource.C2991cc.this, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC3107j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new java.lang.Runnable() { // from class: com.ironsource.cc$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C2991cc.a(com.ironsource.C2991cc.this);
                }
            });
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, java.lang.String str) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    private final void a(com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.r = adapterNativeAdData;
        this.s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C2991cc this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    @Override // com.ironsource.AbstractC3107j3, com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.Map<java.lang.String, java.lang.Object> data = super.a(event);
        if (this.g != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
