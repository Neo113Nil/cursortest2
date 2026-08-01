package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.ironsource.C4698ve;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g implements MarketplaceAuctionParameters {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6030a = new HashMap();
    public final com.fyber.inneractive.sdk.serverapi.d b;
    public String c;

    public g(com.fyber.inneractive.sdk.serverapi.c cVar) {
        this.b = cVar;
    }

    public static JSONObject a(HashMap hashMap, f... fVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (f fVar : fVarArr) {
            String str = (String) hashMap.get(fVar.marketPlaceParam);
            if (!TextUtils.isEmpty(str)) {
                try {
                    Object a2 = a(fVar.type, str);
                    if (a2 != null) {
                        jSONObject.put(fVar.fairBidParam, a2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getAdvertisingId() {
        y yVar = x.f5294a.b;
        if (yVar != null ? yVar.c : false) {
            return null;
        }
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        int i = com.fyber.inneractive.sdk.config.n.f5271a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (TextUtils.isEmpty(property)) {
            y yVar2 = x.f5294a.b;
            if (yVar2 == null) {
                return null;
            }
            property = yVar2.f5295a;
        }
        return property;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getAmazonAdvertisingId() {
        y yVar = x.f5294a.b;
        if (!(yVar != null ? yVar.c : false)) {
            return null;
        }
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        int i = com.fyber.inneractive.sdk.config.n.f5271a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (TextUtils.isEmpty(property)) {
            y yVar2 = x.f5294a.b;
            if (yVar2 == null) {
                return null;
            }
            property = yVar2.f5295a;
        }
        return property;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getAppVersion() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.k.i();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getBundleId() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.o.f5960a.getPackageName();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getCarrier() {
        return ((com.fyber.inneractive.sdk.serverapi.c) this.b).a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getDeviceModel() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.k.g();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final r getFeatureProvider(String str) {
        return (r) this.f6030a.get(str);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getHeight() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.c());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getHorizontalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final List getInputLanguages() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return IAConfigManager.R.q;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getLanguage() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return IAConfigManager.R.p;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getLatitudeLongitude() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final JSONObject getMarketplaceEntry() {
        HashMap hashMap = new HashMap();
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).a(this.c, hashMap);
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String str = f.KEY_COUNTRY_CODE.marketPlaceParam;
            ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
            hashMap.put(str, com.fyber.inneractive.sdk.util.k.f());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_params", a(hashMap, f.KEY_TIME_OF_DAY));
        } catch (Exception unused) {
        }
        try {
            jSONObject.put("device_params", a(hashMap, f.KEY_AVAILABLE_DISK_SPACE, f.KEY_DO_NOT_DISTURB, f.KEY_AIRPLANE_MODE, f.KEY_ANDROID_LEVEL, f.KEY_IS_MUTED, f.KEY_HEADSET, f.KEY_BATTERY_CONNECTED, f.KEY_BATTERY_LEVEL, f.KEY_BLUETOOTH_CONNECTED, f.KEY_LOW_POWER_MODE, f.KEY_COUNTRY_CODE, f.KEY_DARK_MODE, f.KEY_TOTAL_DISK_SPACE, f.KEY_MEDIA_MUTED, f.KEY_AD_SERVICES_VERSION));
        } catch (Exception unused2) {
        }
        try {
            jSONObject.put("content_params", a(hashMap, f.KEY_LAST_BUNDLE_SHOWED, f.KEY_LAST_DOMAIN_SHOWED));
        } catch (Exception unused3) {
        }
        r a2 = r.a();
        this.f6030a.put(this.c, a2);
        a2.a(false, this.c);
        JSONArray a3 = com.fyber.inneractive.sdk.config.global.g.a(a2.b, true);
        IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a3);
        if (a3 != null && a3.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C4698ve.d, a3);
            } catch (Exception unused4) {
            }
            try {
                jSONObject.put("sdk_experiments", jSONObject2);
            } catch (Exception unused5) {
            }
        }
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.6");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-').append(InneractiveAdManager.getDevPlatform());
        }
        try {
            jSONObject.put("version", sb.toString());
        } catch (JSONException unused6) {
        }
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.R.F;
        if (hVar != null) {
            com.fyber.inneractive.sdk.ignite.l lVar = hVar.o;
            String i = lVar != null ? lVar.f5145a.i() : null;
            com.fyber.inneractive.sdk.ignite.l lVar2 = hVar.o;
            String d = lVar2 != null ? lVar2.f5145a.d() : null;
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(i) && !TextUtils.isEmpty(d)) {
                try {
                    jSONObject3.put("version", i);
                } catch (JSONException unused7) {
                }
                try {
                    jSONObject3.put("package_name", d);
                } catch (JSONException unused8) {
                }
                try {
                    jSONObject.put("ignite_params", jSONObject3);
                } catch (Exception unused9) {
                }
            }
        }
        IAlog.a("getMarketplaceEntry:Json object - %s", jSONObject.toString());
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getMobileCountryCode() {
        String str = ((com.fyber.inneractive.sdk.serverapi.c) this.b).b;
        return str == null ? "" : str.substring(0, Math.min(3, str.length()));
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getMobileNetworkCode() {
        String str = ((com.fyber.inneractive.sdk.serverapi.c) this.b).b;
        return str == null ? "" : str.substring(Math.min(3, str.length()));
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getNetwork() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        a1 a2 = a1.a();
        IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a2, a2.b());
        return a2.b();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final List getSupportedApis() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.serverapi.c.c;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final List getSupportedProtocols() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.serverapi.c.d;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getSupportedTypesBitwise() {
        this.b.getClass();
        return 372;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getTimeAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getVerticalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getWidth() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final boolean hasAmazonAdvertisingId() {
        y yVar = x.f5294a.b;
        if (yVar != null) {
            return yVar.c;
        }
        return false;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final Boolean isLimitTrackingEnabled() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        y yVar = x.f5294a.b;
        return Boolean.valueOf(yVar != null ? yVar.b : false);
    }

    public static Object a(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String obj2 = obj.toString();
        if (TextUtils.equals(obj2, Integer.class.toString())) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (TextUtils.equals(obj2, String.class.toString())) {
            return str;
        }
        if (TextUtils.equals(obj2, Boolean.class.toString())) {
            if (str.equalsIgnoreCase("1")) {
                return Boolean.TRUE;
            }
            if (str.equalsIgnoreCase("0")) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
