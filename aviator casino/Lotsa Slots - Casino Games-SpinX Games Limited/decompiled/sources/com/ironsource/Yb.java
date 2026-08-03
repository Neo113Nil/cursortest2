package com.ironsource;

/* loaded from: classes5.dex */
public final class Yb extends com.ironsource.AbstractC3090i3<com.ironsource.C2991cc, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> implements com.ironsource.R0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yb(java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> list, com.ironsource.Pb configs, java.lang.String str, com.ironsource.C3150la publisherDataHolder, com.ironsource.C2953aa c2953aa) {
        super(new com.ironsource.Zb(str, list, configs), publisherDataHolder, c2953aa);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC3090i3
    protected void D() {
    }

    @Override // com.ironsource.AbstractC3090i3
    protected boolean E() {
        return false;
    }

    public final void J() {
        com.ironsource.C3138kg c3138kg;
        int intValue;
        com.ironsource.C3384yb c3384yb;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        try {
            com.ironsource.C2991cc c2991cc = (com.ironsource.C2991cc) this.f6300a.d();
            if (c2991cc != null) {
                java.lang.Integer r = c2991cc.r();
                if (r == null) {
                    intValue = this.C.a(this.o.b());
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    intValue = r.intValue();
                }
                com.ironsource.F0 f0 = this.s;
                if (f0 != null && (c3384yb = f0.f) != null) {
                    c3384yb.a(intValue);
                }
                c2991cc.P();
                this.f6300a.a(null);
                this.f6300a.b(null);
            }
            this.i = null;
            a(com.ironsource.AbstractC3090i3.f.NONE);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(b(str));
            com.ironsource.F0 f02 = this.s;
            if (f02 == null || (c3138kg = f02.j) == null) {
                return;
            }
            c3138kg.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC3090i3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.ironsource.C2991cc a(com.ironsource.mediationsdk.model.NetworkSettings providerSettings, com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> adapter, int i, java.lang.String currentAuctionId, com.ironsource.C3232q2 item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return new com.ironsource.C2991cc(this, new com.ironsource.C3176n0(com.ironsource.mediationsdk.IronSource.a.NATIVE_AD, this.o.o(), i, this.g, currentAuctionId, this.e, this.f, providerSettings, this.o.n()), adapter, this.i, item, this);
    }

    @Override // com.ironsource.AbstractC3090i3
    protected com.ironsource.L0 d() {
        return new com.ironsource.C3074h5();
    }

    @Override // com.ironsource.AbstractC3090i3
    protected java.lang.String i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC3090i3
    protected java.lang.String l() {
        return com.ironsource.mediationsdk.utils.IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3090i3
    protected boolean s() {
        return false;
    }

    public final void a(com.ironsource.C3064gd c3064gd) {
        java.lang.String format;
        int b;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("placement = " + c3064gd);
        if (c3064gd == null || android.text.TextUtils.isEmpty(c3064gd.c())) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            format = java.lang.String.format("can't load native ad - %s", java.util.Arrays.copyOf(new java.lang.Object[]{c3064gd == null ? "placement is null" : "placement name is empty"}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = com.ironsource.B0.b(this.o.b());
        } else if (this.E.c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), c3064gd, this.o.b())) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            format = java.lang.String.format("placement %s is capped", java.util.Arrays.copyOf(new java.lang.Object[]{c3064gd.c()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = com.ironsource.B0.f(this.o.b());
        } else {
            format = null;
            b = 510;
        }
        if (android.text.TextUtils.isEmpty(format)) {
            this.i = c3064gd;
            x();
        } else {
            com.ironsource.mediationsdk.logger.IronLog.API.error(b(format));
            a(b, format, false);
        }
    }

    @Override // com.ironsource.AbstractC3090i3
    protected org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        org.json.JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener nativeAdListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new com.ironsource.Xb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC3090i3
    protected void a(com.ironsource.AbstractC3107j3<?> abstractC3107j3, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        if (abstractC3107j3 instanceof com.ironsource.C2991cc) {
            com.ironsource.C2991cc c2991cc = (com.ironsource.C2991cc) abstractC3107j3;
            this.t.a(c2991cc.Q(), c2991cc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC3090i3
    protected void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC3090i3, com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.Map<java.lang.String, java.lang.Object> data = super.a(event);
        com.ironsource.C3064gd c3064gd = this.i;
        if (c3064gd != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", c3064gd.c());
        }
        java.util.UUID uuid = this.w;
        if (uuid != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
