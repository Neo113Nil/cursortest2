package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public abstract class a<Listener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> extends com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<com.ironsource.mediationsdk.s, Listener> implements com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<Listener>, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<Listener>, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<Listener>, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface, com.ironsource.InterfaceC3268s3 {

    /* renamed from: a, reason: collision with root package name */
    protected com.ironsource.mediationsdk.AbstractAdapter f6395a;
    protected java.lang.ref.WeakReference<Listener> b;

    public a(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, java.util.UUID uuid) {
        super(com.ironsource.Ff.a(aVar), networkSettings, uuid);
        this.b = new java.lang.ref.WeakReference<>(null);
        this.f6395a = abstractAdapter;
    }

    public static com.ironsource.mediationsdk.a<?> a(com.ironsource.mediationsdk.AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a aVar, java.util.UUID uuid) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return new com.ironsource.mediationsdk.v(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return new com.ironsource.mediationsdk.n(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return new com.ironsource.mediationsdk.i(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return new com.ironsource.mediationsdk.r(abstractAdapter, networkSettings, uuid);
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("ad unit not supported - " + aVar);
        return null;
    }

    protected abstract void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData);

    protected abstract com.ironsource.mediationsdk.IronSource.a b();

    protected boolean b(org.json.JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    public void c(org.json.JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.InterfaceC3268s3
    public void collectBiddingData(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        a(com.ironsource.C3079ha.a(adData.getConfiguration()), com.ironsource.C3079ha.a(adData.getAdUnitData()), biddingDataCallback);
    }

    public void d(org.json.JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        a(com.ironsource.C3079ha.a(adData.getConfiguration()));
    }

    protected void e(org.json.JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        return b(com.ironsource.C3079ha.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, Listener listener) {
        a(adData, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        c(com.ironsource.C3079ha.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        d(com.ironsource.C3079ha.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, Listener listener) {
        this.b = new java.lang.ref.WeakReference<>(listener);
        e(com.ironsource.C3079ha.a(adData.getConfiguration()));
    }

    private void b(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, Listener listener) {
        a(adData, listener);
    }

    protected void a(org.json.JSONObject jSONObject) {
        b("destroyAd");
    }

    protected void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        b("collectBiddingData");
    }

    protected java.lang.String a(java.lang.String str) {
        java.lang.String aVar = b().toString();
        if (android.text.TextUtils.isEmpty(str)) {
            return aVar;
        }
        return aVar + " - " + str;
    }

    protected java.lang.String a() {
        return a((java.lang.String) null);
    }

    private void a(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, Listener listener) {
        this.b = new java.lang.ref.WeakReference<>(listener);
        a(com.ironsource.C3079ha.a(adData.getConfiguration()), com.ironsource.C3079ha.a(adData.getAdUnitData()), adData);
    }
}
