package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4444ha;
import com.ironsource.Gf;
import com.ironsource.InterfaceC4580p3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class a<Listener extends AdapterAdListener> extends BaseAdAdapter<s, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, InterfaceC4580p3 {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f8367a;
    protected WeakReference<Listener> b;

    public a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        super(Gf.a(aVar), networkSettings, uuid);
        this.b = new WeakReference<>(null);
        this.f8367a = abstractAdapter;
    }

    public static a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return new v(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return new n(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.BANNER) {
            return new i(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return new r(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + aVar);
        return null;
    }

    protected abstract void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    protected abstract IronSource.a b();

    protected boolean b(JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    public void c(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.InterfaceC4580p3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        a(C4444ha.a(adData.getConfiguration()), C4444ha.a(adData.getAdUnitData()), biddingDataCallback);
    }

    public void d(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(AdData adData) {
        a(C4444ha.a(adData.getConfiguration()));
    }

    protected void e(JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return b(C4444ha.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(AdData adData, Context context, Listener listener) {
        a(adData, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(AdData adData) {
        c(C4444ha.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(AdData adData) {
        d(C4444ha.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, Listener listener) {
        this.b = new WeakReference<>(listener);
        e(C4444ha.a(adData.getConfiguration()));
    }

    private void b(String str) {
        IronLog.INTERNAL.error(a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        a(adData, listener);
    }

    protected void a(JSONObject jSONObject) {
        b("destroyAd");
    }

    protected void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        b("collectBiddingData");
    }

    protected String a(String str) {
        String aVar = b().toString();
        return TextUtils.isEmpty(str) ? aVar : aVar + " - " + str;
    }

    protected String a() {
        return a((String) null);
    }

    private void a(AdData adData, Listener listener) {
        this.b = new WeakReference<>(listener);
        a(C4444ha.a(adData.getConfiguration()), C4444ha.a(adData.getAdUnitData()), adData);
    }
}
