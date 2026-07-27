package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4429gd;
import com.ironsource.J7;
import com.ironsource.K3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Te {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";
    protected static final String a0 = "genericParams";
    protected static final String a1 = "pixel";
    protected static final String a2 = "tokenGenericParams";
    protected static final String b0 = "adUnits";
    protected static final String b1 = "pixelEventsUrl";
    protected static final String b2 = "compressToken";
    protected static final String c0 = "providerLoadName";
    protected static final String c1 = "pixelEventsEnabled";
    protected static final String c2 = "compressExternalToken";
    protected static final String d0 = "application";
    protected static final String d1 = "placements";
    protected static final String d2 = "instanceType";
    protected static final String e0 = "rewardedVideo";
    protected static final String e1 = "placementId";
    protected static final String e2 = "maxAdsPerSession";
    protected static final String f0 = "interstitial";
    protected static final String f1 = "placementName";
    protected static final String f2 = "reward";
    protected static final String g0 = "banner";
    protected static final String g1 = "delivery";
    protected static final String g2 = "name";
    protected static final String h0 = "nativeAd";
    protected static final String h1 = "isDefault";
    protected static final String h2 = "amount";
    protected static final String i0 = "integration";
    protected static final String i1 = "capping";
    protected static final String i2 = "bannerRefreshRate";
    protected static final String j0 = "loggers";
    protected static final String j1 = "pacing";
    protected static final String j2 = "protocolVersion";
    protected static final String k0 = "segment";
    protected static final String k1 = "enabled";
    protected static final String k2 = "adFormats";
    public static final String l = "appKey";
    protected static final String l0 = "events";
    protected static final String l1 = "maxImpressions";
    protected static final String l2 = "adUnits";
    public static final String m = "userId";
    protected static final String m0 = "crashReporter";
    protected static final String m1 = "numOfSeconds";
    protected static final String m2 = "rewarded";
    public static final String n = "response";
    protected static final String n0 = "token";
    protected static final String n1 = "unit";
    public static final String n2 = "preload";
    protected static final String o = "error";
    protected static final String o0 = "external";
    protected static final String o1 = "virtualItemName";
    protected static final int p = 3;
    protected static final String p0 = "mediationTypes";
    protected static final String p1 = "virtualItemCount";
    protected static final boolean q = false;
    protected static final String q0 = "providerDefaultInstance";
    protected static final String q1 = "uuidEnabled";
    protected static final boolean r = true;
    protected static final String r0 = "testSuite";
    protected static final String r1 = "abt";
    protected static final boolean s = true;
    protected static final String s0 = "controllerUrl";
    protected static final String s1 = "delayLoadFailure";
    protected static final int t = 2;
    protected static final String t0 = "AdQuality";
    protected static final String t1 = "keysToInclude";
    protected static final int u = 2;
    protected static final String u0 = "initMode";
    protected static final String u1 = "reporterURL";
    protected static final int v = 1;
    protected static final String v0 = "adq_init_blob";
    protected static final String v1 = "reporterKeyword";
    protected static final int w = 1;
    protected static final String w0 = "settings";
    protected static final String w1 = "includeANR";
    protected static final boolean x = true;
    protected static final String x0 = "collectBiddingDataTimeout";
    protected static final String x1 = "timeout";
    protected static final boolean y = false;
    protected static final String y0 = "providers";
    protected static final String y1 = "setIgnoreDebugger";
    protected static final boolean z = false;
    protected static final String z0 = "parallelInit";
    protected static final String z1 = "adSourceName";

    /* renamed from: a, reason: collision with root package name */
    private Hd f7915a;
    private Kd b;
    private K3 c;
    private String d;
    private String e;
    private JSONObject f;
    private Context g;
    private a h;
    private J7.a i;
    private boolean j;
    private K5 k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* renamed from: a, reason: collision with root package name */
        private final String f7916a;

        a(String str) {
            this.f7916a = str;
        }

        public String b() {
            return this.f7916a;
        }
    }

    public Te(Context context, String str, String str2, String str3) {
        this.h = a.NOT_SET;
        this.j = false;
        this.g = context;
        this.i = Ib.R().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f = new JSONObject();
            } else {
                this.f = new JSONObject(str3);
            }
            this.j = o();
            t();
            r();
            s();
            this.d = TextUtils.isEmpty(str) ? "" : str;
            this.e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            a();
        }
    }

    public static a a(Te te) {
        return te != null ? te.i() : a.NOT_SET;
    }

    private void b(JSONObject jSONObject) {
        this.k = new K5(jSONObject.optJSONObject(C4698ve.d));
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C4347c3 d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            C4429gd a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                C4347c3 c4347c3 = new C4347c3(optInt, optString, optBoolean, a3);
                if (a3 == null) {
                    return c4347c3;
                }
                this.i.b(this.g, c4347c3, IronSource.a.BANNER);
                return c4347c3;
            }
        }
        return null;
    }

    private C4295ac f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            C4429gd a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                C4295ac c4295ac = new C4295ac(optInt, optString, optBoolean, a3);
                if (a3 == null) {
                    return c4295ac;
                }
                this.i.b(this.g, c4295ac, IronSource.a.NATIVE_AD);
                return c4295ac;
            }
        }
        return null;
    }

    private String m() {
        return this.j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject c;
        JSONArray optJSONArray;
        JSONObject c3 = c(this.f, "providerOrder");
        JSONArray names = c3.names();
        if (names == null) {
            return true;
        }
        JSONObject c4 = c(c(this.f, "configurations"), b());
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i);
            JSONArray optJSONArray2 = c3.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (c = c(c4, optString)) != null && ((optJSONArray = c.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean o() {
        int i;
        try {
            i = this.f.optInt(j2, 0);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            i = 0;
        }
        return i == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x06b6 A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06d0 A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0720 A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0776 A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07af A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x07ce A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x085f A[Catch: Exception -> 0x087d, TRY_LEAVE, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x079d A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0280 A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03b7 A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0550 A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x067d A[Catch: Exception -> 0x087d, TryCatch #0 {Exception -> 0x087d, blocks: (B:3:0x0004, B:5:0x006d, B:8:0x0087, B:10:0x0093, B:11:0x00b1, B:15:0x00f6, B:17:0x015a, B:20:0x021a, B:22:0x0220, B:25:0x0244, B:28:0x024e, B:30:0x0254, B:32:0x025e, B:34:0x0261, B:38:0x0280, B:40:0x02de, B:41:0x037b, B:44:0x0385, B:46:0x038b, B:48:0x0395, B:50:0x0398, B:55:0x03b7, B:57:0x0444, B:59:0x044c, B:60:0x0505, B:63:0x0513, B:65:0x0519, B:67:0x0525, B:69:0x0528, B:74:0x0550, B:76:0x05be, B:78:0x05c8, B:79:0x0646, B:82:0x0656, B:84:0x065c, B:86:0x0666, B:88:0x0669, B:91:0x0676, B:93:0x067d, B:96:0x0688, B:98:0x068e, B:100:0x0698, B:102:0x06a0, B:103:0x06a3, B:104:0x06ad, B:106:0x06b6, B:107:0x06cb, B:109:0x06d0, B:110:0x06f6, B:112:0x0720, B:115:0x0764, B:117:0x076a, B:120:0x0776, B:121:0x0796, B:124:0x07a3, B:126:0x07af, B:128:0x07bc, B:129:0x07c0, B:130:0x07c5, B:132:0x07ce, B:133:0x07dc, B:135:0x0835, B:137:0x083d, B:139:0x085f, B:145:0x079d, B:148:0x0633, B:150:0x063b, B:152:0x04e4, B:154:0x04f4, B:156:0x0366, B:158:0x022d), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject3;
        String str5;
        String str6;
        JSONObject jSONObject4;
        String str7;
        JSONObject jSONObject5;
        String str8;
        String str9;
        String str10;
        C4376de c4376de;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        JSONObject jSONObject6;
        String str16;
        JSONObject jSONObject7;
        String str17;
        C4376de c4376de2;
        String str18;
        D9 d9;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        JSONObject jSONObject8;
        JSONObject jSONObject9;
        JSONObject jSONObject10;
        String str24;
        String str25;
        String str26;
        String str27;
        JSONObject jSONObject11;
        D9 d92;
        JSONObject jSONObject12;
        S2 s2;
        S2 s22;
        JSONObject jSONObject13;
        JSONObject jSONObject14;
        String str28;
        String str29;
        Pb pb;
        JSONObject jSONObject15;
        boolean z2;
        JSONObject jSONObject16;
        JSONObject jSONObject17;
        JSONObject c;
        String str30;
        JSONObject c3;
        C4597q2 c4597q2;
        C4597q2 c4597q22;
        C4597q2 c4597q23;
        C4597q2 c4597q24;
        C4597q2 c4597q25;
        C4597q2 c4597q26;
        try {
            JSONObject c4 = c(this.f, "configurations");
            JSONObject c5 = c(c4, b());
            JSONObject c6 = c(c4, "application");
            JSONObject c7 = c(c5, m());
            JSONObject c8 = c(c5, "interstitial");
            JSONObject c9 = c(c5, "banner");
            JSONObject c10 = c(c5, "nativeAd");
            JSONObject c11 = c(c6, "events");
            JSONObject c12 = c(c6, "loggers");
            JSONObject c13 = c(c6, "token");
            JSONObject c14 = c(c6, "segment");
            JSONObject c15 = c(c6, "auction");
            JSONObject c16 = c(c6, "crashReporter");
            JSONObject c17 = c(c6, "settings");
            JSONObject c18 = c(c6, "external");
            JSONObject c19 = c(c11, a1);
            if (c6 != null) {
                jSONObject = c19;
                jSONObject2 = c18;
                IronSourceUtils.b(this.g, "uuidEnabled", c6.optBoolean("uuidEnabled", true));
            } else {
                jSONObject = c19;
                jSONObject2 = c18;
            }
            if (c11 != null) {
                String optString = c11.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    Ib.a0().q().a(optString);
                    F9.i().a(optString);
                    C4412fe.i().a(optString);
                    str = optString;
                    H1 a3 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
                    String str31 = O1;
                    String str32 = P1;
                    String str33 = "auctionTrials";
                    String str34 = G1;
                    if (c7 == null) {
                        str10 = F1;
                        JSONArray optJSONArray = c7.optJSONArray("placements");
                        str3 = "placements";
                        JSONObject c20 = c(c7, "events");
                        str2 = "events";
                        JSONObject d = d(c7, y0);
                        str4 = y0;
                        long optLong = c7.optLong(x0, 3000L);
                        boolean optBoolean = d.optBoolean(z0, false);
                        boolean optBoolean2 = d.optBoolean(A0, false);
                        boolean optBoolean3 = c7.optBoolean(B0, true);
                        int a4 = a(c7, c6, "parallelLoad", 2);
                        boolean a5 = a(c7, c6, "bidderExclusive", true);
                        int a6 = a(c7, c6, E0, 60);
                        int a7 = a(c7, c6, "expiredDurationInMinutes", -1);
                        int a8 = a(c7, c6, s1, 3);
                        boolean a9 = a(c7, c6, "isOneFlow", false);
                        JSONObject b = IronSourceUtils.b(c20, c11);
                        H1 a10 = a(b, Boolean.valueOf(b.optBoolean("sendUltraEvents", false)));
                        if (c15 != null) {
                            JSONObject c21 = c(c15, m());
                            String optString2 = c15.optString(E1, "");
                            String optString3 = c15.optString(str10, "");
                            String optString4 = c15.optString(str34, "");
                            str34 = str34;
                            int optInt = c15.optInt(str33, 2);
                            str33 = str33;
                            str10 = str10;
                            long optLong2 = c15.optLong(str31, 10000L);
                            int optInt2 = c15.optInt(str32, 15);
                            str31 = str31;
                            boolean optBoolean4 = c15.optBoolean(U1, false);
                            boolean optBoolean5 = c15.optBoolean(V1, false);
                            int optInt3 = c15.optInt(W1, 1);
                            boolean optBoolean6 = c15.optBoolean(R1, true);
                            boolean optBoolean7 = c21.optBoolean(S1, true);
                            int optInt4 = c21.optInt(I1, 2000);
                            str32 = str32;
                            int optInt5 = c21.optInt(L1, 30000);
                            str5 = E1;
                            int optInt6 = c21.optInt(J1, 5000);
                            str6 = "";
                            int optInt7 = c21.optInt(K1, 50);
                            jSONObject3 = c15;
                            boolean optBoolean8 = c21.optBoolean(H1, false);
                            boolean optBoolean9 = c21.optBoolean("isLoadWhileShow", true);
                            int optInt8 = c21.optInt(T1, 30000);
                            str7 = s1;
                            jSONObject5 = c11;
                            jSONObject4 = c6;
                            str8 = B0;
                            str9 = A0;
                            C4597q2 c4597q27 = new C4597q2(optString2, optString3, optString4, optInt, optInt2, optLong2, optInt4, optInt5, optInt6, optInt7, optBoolean9, optInt8, optBoolean4, optBoolean5, optBoolean8, optInt3, false, optBoolean6, optBoolean7);
                            JSONArray optJSONArray2 = c21.optJSONArray(Q1);
                            if (optJSONArray2 != null) {
                                for (int i = 0; i < optJSONArray2.length(); i++) {
                                    c4597q27.a(optJSONArray2.optString(i));
                                }
                            }
                            c4597q26 = c4597q27;
                        } else {
                            str6 = "";
                            jSONObject4 = c6;
                            str7 = s1;
                            jSONObject5 = c11;
                            str8 = B0;
                            str9 = A0;
                            jSONObject3 = c15;
                            str5 = E1;
                            c4597q26 = new C4597q2();
                        }
                        c4376de = new C4376de(a4, a5, a6, a7, a10, c4597q26, a8, a9, optLong, optBoolean, optBoolean2, optBoolean3);
                        if (optJSONArray != null) {
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                C4411fd g = g(optJSONArray.optJSONObject(i3));
                                if (g != null) {
                                    c4376de.a(g);
                                }
                            }
                        }
                    } else {
                        str2 = "events";
                        str3 = "placements";
                        str4 = y0;
                        jSONObject3 = c15;
                        str5 = E1;
                        str6 = "";
                        jSONObject4 = c6;
                        str7 = s1;
                        jSONObject5 = c11;
                        str8 = B0;
                        str9 = A0;
                        str10 = F1;
                        c4376de = null;
                    }
                    if (c8 == null) {
                        str13 = str3;
                        JSONArray optJSONArray3 = c8.optJSONArray(str13);
                        str14 = str2;
                        JSONObject c22 = c(c8, str14);
                        str15 = str4;
                        JSONObject d3 = d(c8, str15);
                        long optLong3 = c8.optLong(x0, 3000L);
                        boolean optBoolean10 = d3.optBoolean(z0, false);
                        String str35 = str9;
                        boolean optBoolean11 = d3.optBoolean(str35, false);
                        str17 = str8;
                        boolean optBoolean12 = c8.optBoolean(str17, true);
                        jSONObject7 = jSONObject4;
                        int a11 = a(c8, jSONObject7, "parallelLoad", 2);
                        boolean a12 = a(c8, jSONObject7, "bidderExclusive", false);
                        int a13 = a(c8, jSONObject7, E0, 60);
                        str16 = str7;
                        int a14 = a(c8, jSONObject7, str16, 3);
                        boolean a15 = a(c8, jSONObject7, "isOneFlow", false);
                        JSONObject jSONObject18 = jSONObject5;
                        H1 a16 = a(IronSourceUtils.b(c22, jSONObject18), Boolean.FALSE);
                        if (jSONObject3 != null) {
                            jSONObject6 = jSONObject3;
                            JSONObject c23 = c(jSONObject6, "interstitial");
                            c4376de2 = c4376de;
                            String str36 = str5;
                            str18 = str6;
                            String optString5 = jSONObject6.optString(str36, str18);
                            str5 = str36;
                            String str37 = str10;
                            String optString6 = jSONObject6.optString(str37, str18);
                            str11 = x0;
                            String str38 = str34;
                            String optString7 = jSONObject6.optString(str38, str18);
                            str34 = str38;
                            str10 = str37;
                            String str39 = str33;
                            int optInt9 = jSONObject6.optInt(str39, 2);
                            str33 = str39;
                            str12 = str32;
                            jSONObject5 = jSONObject18;
                            str9 = str35;
                            String str40 = str31;
                            str31 = str40;
                            c4597q25 = new C4597q2(optString5, optString6, optString7, optInt9, jSONObject6.optInt(str12, 15), jSONObject6.optLong(str40, 10000L), c23.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject6.optBoolean(U1, false), jSONObject6.optBoolean(V1, false), true, jSONObject6.optInt(W1, 1), false, jSONObject6.optBoolean(R1, true), c23.optBoolean(S1, true));
                        } else {
                            c4376de2 = c4376de;
                            str11 = x0;
                            jSONObject5 = jSONObject18;
                            str9 = str35;
                            str12 = str32;
                            str18 = str6;
                            jSONObject6 = jSONObject3;
                            c4597q25 = new C4597q2();
                        }
                        D9 d93 = new D9(a11, a12, a13, a16, c4597q25, a14, a15, optLong3, optBoolean10, optBoolean11, optBoolean12);
                        if (optJSONArray3 != null) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                H9 e = e(optJSONArray3.optJSONObject(i4));
                                if (e != null) {
                                    d93.a(e);
                                }
                            }
                        }
                        d9 = d93;
                    } else {
                        str11 = x0;
                        str12 = str32;
                        str13 = str3;
                        str14 = str2;
                        str15 = str4;
                        jSONObject6 = jSONObject3;
                        str16 = str7;
                        jSONObject7 = jSONObject4;
                        str17 = str8;
                        c4376de2 = c4376de;
                        str18 = str6;
                        d9 = null;
                    }
                    if (c9 == null) {
                        JSONArray optJSONArray4 = c9.optJSONArray(str13);
                        JSONObject c24 = c(c9, str14);
                        JSONObject d4 = d(c9, str15);
                        str19 = str13;
                        str20 = str12;
                        JSONObject jSONObject19 = jSONObject;
                        String str41 = str33;
                        String str42 = str34;
                        jSONObject9 = jSONObject19;
                        String str43 = str11;
                        str21 = str15;
                        str22 = str14;
                        JSONArray jSONArray = optJSONArray4;
                        JSONObject jSONObject20 = jSONObject2;
                        str26 = str10;
                        d92 = d9;
                        jSONObject10 = jSONObject20;
                        jSONObject8 = c16;
                        str27 = str5;
                        long a17 = a(c9, jSONObject7, F0, 10000L);
                        int a18 = a(c9, jSONObject7, str16, 3);
                        int optInt10 = c9.optInt(G0, 60);
                        long optLong4 = c9.optLong(Y1, 15000L);
                        boolean a19 = a(c9, jSONObject7, "isOneFlow", false);
                        long optLong5 = c9.optLong(str43, 3000L);
                        boolean optBoolean13 = d4.optBoolean(z0, false);
                        String str44 = str9;
                        boolean optBoolean14 = d4.optBoolean(str44, false);
                        boolean optBoolean15 = c9.optBoolean(str17, true);
                        jSONObject11 = jSONObject5;
                        H1 a20 = a(IronSourceUtils.b(c24, jSONObject11), Boolean.FALSE);
                        jSONObject12 = jSONObject6;
                        if (jSONObject12 != null) {
                            JSONObject c25 = c(jSONObject12, "banner");
                            if (c25 != null) {
                                String optString8 = jSONObject12.optString(str27, str18);
                                String optString9 = jSONObject12.optString(str26, str18);
                                String optString10 = jSONObject12.optString(str42, str18);
                                str25 = str41;
                                int optInt11 = jSONObject12.optInt(str25, 2);
                                str34 = str42;
                                int optInt12 = jSONObject12.optInt(str20, 15);
                                str23 = str17;
                                str20 = str20;
                                String str45 = str31;
                                str27 = str27;
                                str9 = str44;
                                str24 = str43;
                                str31 = str45;
                                c4597q24 = new C4597q2(optString8, optString9, optString10, optInt11, optInt12, jSONObject12.optLong(str45, 10000L), c25.optInt(I1, 2000), c25.optInt(L1, 15000), c25.optInt(J1, 50), 0L, c25.optBoolean("isLoadWhileShow", false), 0, jSONObject12.optBoolean(U1, false), jSONObject12.optBoolean(V1, false), c25.optBoolean(H1, true), jSONObject12.optInt(W1, 1), c25.optBoolean(X1, true), jSONObject12.optBoolean(R1, true), c25.optBoolean(S1, true));
                                S2 s23 = new S2(1, a17, false, a20, optInt10, c4597q24, a18, a19, optLong5, optBoolean13, optBoolean14, optBoolean15, optLong4);
                                if (jSONArray != null) {
                                    int i5 = 0;
                                    while (i5 < jSONArray.length()) {
                                        JSONArray jSONArray2 = jSONArray;
                                        C4347c3 d5 = d(jSONArray2.optJSONObject(i5));
                                        if (d5 != null) {
                                            s23.a(d5);
                                        }
                                        i5++;
                                        jSONArray = jSONArray2;
                                    }
                                }
                                s2 = s23;
                            } else {
                                str9 = str44;
                                str24 = str43;
                                str23 = str17;
                                str34 = str42;
                                str25 = str41;
                                c4597q23 = new C4597q2();
                            }
                        } else {
                            str9 = str44;
                            str24 = str43;
                            str23 = str17;
                            str34 = str42;
                            str25 = str41;
                            c4597q23 = new C4597q2();
                        }
                        c4597q24 = c4597q23;
                        S2 s232 = new S2(1, a17, false, a20, optInt10, c4597q24, a18, a19, optLong5, optBoolean13, optBoolean14, optBoolean15, optLong4);
                        if (jSONArray != null) {
                        }
                        s2 = s232;
                    } else {
                        str19 = str13;
                        str20 = str12;
                        str21 = str15;
                        str22 = str14;
                        str23 = str17;
                        jSONObject8 = c16;
                        jSONObject9 = jSONObject;
                        jSONObject10 = jSONObject2;
                        str24 = str11;
                        str25 = str33;
                        str26 = str10;
                        str27 = str5;
                        jSONObject11 = jSONObject5;
                        d92 = d9;
                        jSONObject12 = jSONObject6;
                        s2 = null;
                    }
                    if (c10 == null) {
                        JSONArray optJSONArray5 = c10.optJSONArray(str19);
                        String str46 = str22;
                        JSONObject c26 = c(c10, str46);
                        JSONObject d6 = d(c10, str21);
                        String str47 = str27;
                        str28 = str46;
                        s22 = s2;
                        String str48 = str25;
                        JSONObject jSONObject21 = jSONObject12;
                        String str49 = str31;
                        String str50 = str34;
                        String str51 = str20;
                        long a21 = a(c10, jSONObject7, F0, 10000L);
                        int a22 = a(c10, jSONObject7, str16, 0);
                        long optLong6 = c10.optLong(str24, 3000L);
                        boolean optBoolean16 = d6.optBoolean(z0, false);
                        boolean optBoolean17 = d6.optBoolean(str9, false);
                        boolean optBoolean18 = c10.optBoolean(str23, true);
                        jSONObject14 = jSONObject11;
                        H1 a23 = a(IronSourceUtils.b(c26, jSONObject14), Boolean.FALSE);
                        if (jSONObject21 != null) {
                            jSONObject13 = jSONObject21;
                            JSONObject c27 = c(jSONObject13, "nativeAd");
                            if (c27 != null) {
                                str29 = str47;
                                c4597q22 = new C4597q2(jSONObject13.optString(str29, str18), jSONObject13.optString(str26, str18), jSONObject13.optString(str50, str18), jSONObject13.optInt(str48, 2), jSONObject13.optInt(str51, 15), jSONObject13.optLong(str49, 10000L), c27.optInt(I1, 2000), 0L, 0L, 0L, true, 0, jSONObject13.optBoolean(U1, false), jSONObject13.optBoolean(V1, false), true, jSONObject13.optInt(W1, 1), false, jSONObject13.optBoolean(R1, true), c27.optBoolean(S1, true));
                                pb = new Pb(1, a21, false, a23, c4597q22, a22, optLong6, optBoolean16, optBoolean17, optBoolean18);
                                if (optJSONArray5 != null) {
                                    for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                        C4295ac f = f(optJSONArray5.optJSONObject(i6));
                                        if (f != null) {
                                            pb.a(f);
                                        }
                                    }
                                }
                            } else {
                                str29 = str47;
                                c4597q2 = new C4597q2();
                            }
                        } else {
                            jSONObject13 = jSONObject21;
                            str29 = str47;
                            c4597q2 = new C4597q2();
                        }
                        c4597q22 = c4597q2;
                        pb = new Pb(1, a21, false, a23, c4597q22, a22, optLong6, optBoolean16, optBoolean17, optBoolean18);
                        if (optJSONArray5 != null) {
                        }
                    } else {
                        s22 = s2;
                        jSONObject13 = jSONObject12;
                        jSONObject14 = jSONObject11;
                        str28 = str22;
                        str29 = str27;
                        pb = null;
                    }
                    C4539mg c4539mg = new C4539mg();
                    if (c13 != null) {
                        JSONArray optJSONArray6 = c13.optJSONArray(Z1);
                        if (optJSONArray6 != null) {
                            for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                                c4539mg.a(optJSONArray6.optString(i7));
                            }
                        }
                        JSONObject optJSONObject = c13.optJSONObject(a2);
                        if (optJSONObject != null) {
                            c4539mg.a(optJSONObject);
                        }
                        c4539mg.a(c13.optBoolean(b2, true));
                    }
                    C4375dd c4375dd = new C4375dd();
                    jSONObject15 = jSONObject9;
                    if (jSONObject15 == null) {
                        String optString11 = jSONObject15.optString(b1, C4393ed.f8156a);
                        z2 = jSONObject15.optBoolean(c1, true);
                        c4375dd.a(optString11);
                    } else {
                        z2 = true;
                    }
                    c4375dd.b(z2);
                    if (z2) {
                        c4375dd.b(a(jSONObject14, "optOut"));
                        c4375dd.a(a(jSONObject14, "optIn"));
                        c4375dd.a(jSONObject14.optBoolean("eventsCompression", false));
                        c4375dd.a(jSONObject14.optInt("eventsCompressionLevel", -1));
                    }
                    O1 o12 = new O1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
                    E1 e12 = new E1();
                    jSONObject16 = jSONObject8;
                    if (jSONObject16 != null) {
                        e12.a(jSONObject16.optBoolean("enabled", false));
                        e12.c(jSONObject16.optString("reporterURL", str18));
                        e12.b(jSONObject16.optString("reporterKeyword", str18));
                        e12.c(jSONObject16.optBoolean("includeANR", false));
                        e12.a(jSONObject16.optInt("timeout", 5000));
                        e12.b(jSONObject16.optBoolean("setIgnoreDebugger", false));
                        JSONArray optJSONArray7 = jSONObject16.optJSONArray("keysToInclude");
                        if (optJSONArray7 != null) {
                            for (int i8 = 0; i8 < optJSONArray7.length(); i8++) {
                                e12.a(optJSONArray7.optString(i8));
                            }
                        }
                    }
                    Ue ue = c14 == null ? new Ue(c14.optString("name", str18), c14.optString("id", Y1.f), c14.optJSONObject("custom")) : null;
                    if (c17 == null) {
                        c17 = new JSONObject();
                    }
                    K1 k12 = new K1(c17);
                    J1 j12 = new J1();
                    jSONObject17 = jSONObject10;
                    if (jSONObject17 != null) {
                        JSONObject optJSONObject2 = jSONObject17.optJSONObject(p0);
                        Map hashMap = new HashMap();
                        if (optJSONObject2 != null) {
                            hashMap = IronSourceUtils.b(optJSONObject2);
                        }
                        j12 = new J1(hashMap);
                    }
                    A1 a110 = new A1(o12, ue, c4539mg, jSONObject7.optBoolean("integration", false), e12, k12, j12, c4375dd, jSONObject13 == null ? new C4739y1(jSONObject13.optString(str29)) : new C4739y1(), str, a3);
                    Yf h = h(c4);
                    com.ironsource.mediationsdk.adquality.a c28 = c(c4);
                    K3.a aVar = new K3.a();
                    aVar.a(c4376de2);
                    aVar.a(d92);
                    aVar.a(s22);
                    aVar.a(pb);
                    aVar.a(a110);
                    aVar.b(h);
                    aVar.a(c28);
                    K3 a24 = aVar.a();
                    this.c = a24;
                    IronLog.INTERNAL.verbose(a24.toString());
                    c = c(jSONObject14, "genericParams");
                    if (c != null && (c3 = c(c, (str30 = str28))) != null) {
                        c.remove(str30);
                        Map<String, String> b3 = IronSourceUtils.b(c3);
                        Ib.a0().q().b(b3);
                        C4412fe.i().b(b3);
                        F9.i().b(b3);
                    }
                    if (c == null) {
                        Map<String, String> b4 = IronSourceUtils.b(c);
                        Ib.a0().q().a(b4);
                        C4412fe.i().a(b4);
                        F9.i().a(b4);
                        return;
                    }
                    return;
                }
            }
            str = null;
            H1 a32 = a(c11, Boolean.valueOf(c11.optBoolean("sendUltraEvents", false)));
            String str312 = O1;
            String str322 = P1;
            String str332 = "auctionTrials";
            String str342 = G1;
            if (c7 == null) {
            }
            if (c8 == null) {
            }
            if (c9 == null) {
            }
            if (c10 == null) {
            }
            C4539mg c4539mg2 = new C4539mg();
            if (c13 != null) {
            }
            C4375dd c4375dd2 = new C4375dd();
            jSONObject15 = jSONObject9;
            if (jSONObject15 == null) {
            }
            c4375dd2.b(z2);
            if (z2) {
            }
            O1 o122 = new O1(c12.optInt("server", 3), c12.optInt("publisher", 3), c12.optInt("console", 3), c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            E1 e122 = new E1();
            jSONObject16 = jSONObject8;
            if (jSONObject16 != null) {
            }
            if (c14 == null) {
            }
            if (c17 == null) {
            }
            K1 k122 = new K1(c17);
            J1 j122 = new J1();
            jSONObject17 = jSONObject10;
            if (jSONObject17 != null) {
            }
            A1 a1102 = new A1(o122, ue, c4539mg2, jSONObject7.optBoolean("integration", false), e122, k122, j122, c4375dd2, jSONObject13 == null ? new C4739y1(jSONObject13.optString(str29)) : new C4739y1(), str, a32);
            Yf h3 = h(c4);
            com.ironsource.mediationsdk.adquality.a c282 = c(c4);
            K3.a aVar2 = new K3.a();
            aVar2.a(c4376de2);
            aVar2.a(d92);
            aVar2.a(s22);
            aVar2.a(pb);
            aVar2.a(a1102);
            aVar2.b(h3);
            aVar2.a(c282);
            K3 a242 = aVar2.a();
            this.c = a242;
            IronLog.INTERNAL.verbose(a242.toString());
            c = c(jSONObject14, "genericParams");
            if (c != null) {
                c.remove(str30);
                Map<String, String> b32 = IronSourceUtils.b(c3);
                Ib.a0().q().b(b32);
                C4412fe.i().b(b32);
                F9.i().b(b32);
            }
            if (c == null) {
            }
        } catch (Exception e3) {
            C4491k4.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
        }
    }

    private void s() {
        try {
            JSONObject c = c(this.f, "providerOrder");
            JSONArray b = b(c, m());
            JSONArray b3 = b(c, "interstitial");
            JSONArray b4 = b(c, "banner");
            JSONArray b5 = b(c, "nativeAd");
            this.f7915a = new Hd();
            if (b != null && c() != null && c().f() != null) {
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    this.f7915a.d(optString);
                    NetworkSettings b6 = Kd.c().b(optString);
                    if (b6 != null) {
                        b6.setRewardedVideoPriority(i);
                    }
                }
            }
            if (b3 != null && c() != null && c().d() != null) {
                for (int i3 = 0; i3 < b3.length(); i3++) {
                    String optString2 = b3.optString(i3);
                    this.f7915a.b(optString2);
                    NetworkSettings b7 = Kd.c().b(optString2);
                    if (b7 != null) {
                        b7.setInterstitialPriority(i3);
                    }
                }
            }
            if (b4 != null) {
                for (int i4 = 0; i4 < b4.length(); i4++) {
                    String optString3 = b4.optString(i4);
                    this.f7915a.a(optString3);
                    NetworkSettings b8 = Kd.c().b(optString3);
                    if (b8 != null) {
                        b8.setBannerPriority(i4);
                    }
                }
            }
            if (b5 != null) {
                for (int i5 = 0; i5 < b5.length(); i5++) {
                    String optString4 = b5.optString(i5);
                    this.f7915a.c(optString4);
                    NetworkSettings b9 = Kd.c().b(optString4);
                    if (b9 != null) {
                        b9.setNativeAdPriority(i5);
                    }
                }
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private void t() {
        JSONObject jSONObject;
        Iterator<String> it;
        Te te;
        Te te2 = this;
        try {
            te2.b = Kd.c();
            JSONObject c = te2.c(te2.f, "providerSettings");
            Iterator<String> keys = c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = c.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerNetworkKey", null);
                    String optString4 = optJSONObject.optString("providerLoadName", next);
                    String optString5 = optJSONObject.optString("providerDefaultInstance", optString4);
                    JSONObject c3 = te2.c(optJSONObject, b());
                    JSONObject c4 = te2.c(optJSONObject, "application");
                    JSONObject c5 = te2.c(c3, m());
                    JSONObject c6 = te2.c(c3, "interstitial");
                    JSONObject c7 = te2.c(c3, "banner");
                    JSONObject c8 = te2.c(c3, "nativeAd");
                    JSONObject b = IronSourceUtils.b(c5, c4);
                    JSONObject b3 = IronSourceUtils.b(c6, c4);
                    JSONObject b4 = IronSourceUtils.b(c7, c4);
                    JSONObject b5 = IronSourceUtils.b(c8, c4);
                    if (te2.b.a(next)) {
                        Ib.a0().q().a(new C4689v5(EnumC4707w5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings b6 = te2.b.b(next);
                        JSONObject rewardedVideoSettings = b6.getRewardedVideoSettings();
                        JSONObject interstitialSettings = b6.getInterstitialSettings();
                        JSONObject bannerSettings = b6.getBannerSettings();
                        JSONObject nativeAdSettings = b6.getNativeAdSettings();
                        b6.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, b));
                        b6.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, b3));
                        b6.setBannerSettings(IronSourceUtils.b(bannerSettings, b4));
                        b6.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, b5));
                        b6.setIsMultipleInstances(optBoolean);
                        b6.setSubProviderId(optString);
                        b6.setAdSourceNameForEvents(optString2);
                        b6.setProviderNetworkKey(optString3);
                    } else {
                        if (te2.b(optString4)) {
                            jSONObject = c;
                            NetworkSettings b7 = te2.b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = b7.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = b7.getInterstitialSettings();
                            JSONObject bannerSettings2 = b7.getBannerSettings();
                            JSONObject nativeAdSettings2 = b7.getNativeAdSettings();
                            it = keys;
                            JSONObject jSONObject2 = new JSONObject(rewardedVideoSettings2.toString());
                            JSONObject jSONObject3 = new JSONObject(interstitialSettings2.toString());
                            try {
                                NetworkSettings networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c4, IronSourceUtils.b(jSONObject2, b), IronSourceUtils.b(jSONObject3, b3), IronSourceUtils.b(new JSONObject(bannerSettings2.toString()), b4), IronSourceUtils.b(new JSONObject(nativeAdSettings2.toString()), b5));
                                networkSettings.setIsMultipleInstances(optBoolean);
                                networkSettings.setSubProviderId(optString);
                                networkSettings.setAdSourceNameForEvents(optString2);
                                te = this;
                                try {
                                    te.b.a(networkSettings);
                                } catch (Exception e) {
                                    e = e;
                                    C4491k4.d().a(e);
                                    IronLog.INTERNAL.error(e.toString());
                                    return;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                C4491k4.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        } else {
                            jSONObject = c;
                            it = keys;
                            te = te2;
                            NetworkSettings networkSettings2 = new NetworkSettings(next, optString4, optString5, optString3, c4, b, b3, b4, b5);
                            networkSettings2.setIsMultipleInstances(optBoolean);
                            networkSettings2.setSubProviderId(optString);
                            networkSettings2.setAdSourceNameForEvents(optString2);
                            te.b.a(networkSettings2);
                        }
                        te2 = te;
                        c = jSONObject;
                        keys = it;
                    }
                }
            }
            te2.b.b();
        } catch (Exception e4) {
            e = e4;
        }
    }

    public String e() {
        JSONObject jSONObject = this.f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f.optString("error");
    }

    public Y8 g() {
        return new Y8(this.d, this.e);
    }

    public List<IronSource.a> h() {
        Hd hd;
        Hd hd2;
        Hd hd3;
        Hd hd4;
        if (this.f == null || this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.c.f() != null && (hd4 = this.f7915a) != null && !hd4.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.c.d() != null && (hd3 = this.f7915a) != null && !hd3.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.c.c() != null && (hd2 = this.f7915a) != null && !hd2.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.c.e() != null && (hd = this.f7915a) != null && !hd.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    public a i() {
        return this.h;
    }

    public JSONObject j() {
        return this.f;
    }

    public Hd k() {
        return this.f7915a;
    }

    public Kd l() {
        return this.b;
    }

    public boolean p() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean q() {
        JSONObject jSONObject = this.f;
        return (jSONObject == null || jSONObject.has("error") || this.f7915a == null || this.b == null || this.c == null || !n()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.d);
            jSONObject.put("userId", this.e);
            jSONObject.put(n, this.f);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    private String b() {
        return this.j ? "adFormats" : Y0.c;
    }

    private C4411fd g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            String optString2 = jSONObject.optString("virtualItemName", "");
            int optInt2 = jSONObject.optInt("virtualItemCount", -1);
            C4429gd a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && optInt2 > 0) {
                C4411fd c4411fd = new C4411fd(optInt, optString, optBoolean, optString2, optInt2, a3);
                if (a3 == null) {
                    return c4411fd;
                }
                this.i.b(this.g, c4411fd, IronSource.a.REWARDED_VIDEO);
                return c4411fd;
            }
        }
        return null;
    }

    public K3 c() {
        return this.c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject c = c(jSONObject, str);
        String a3 = a(str);
        if (c == null || a3 == null) {
            return null;
        }
        return c.optJSONArray(a3);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject c = c(jSONObject, "AdQuality");
        if (c != null) {
            aVar.a(c.optInt("initMode", 0));
            new T9().b(c.optString("adq_init_blob"));
        }
        return aVar;
    }

    private H9 e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(h1, false);
            C4429gd a3 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                H9 h9 = new H9(optInt, optString, optBoolean, a3);
                if (a3 == null) {
                    return h9;
                }
                this.i.b(this.g, h9, IronSource.a.INTERSTITIAL);
                return h9;
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    private void a() {
        this.f = new JSONObject();
        this.d = "";
        this.e = "";
        this.f7915a = new Hd();
        this.b = Kd.c();
        this.c = new K3.a().a();
        this.i = Ib.R().x();
        b(this.f);
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject c = c(jSONObject, str);
        return c != null ? c : new JSONObject();
    }

    private boolean b(String str) {
        return this.b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    public K5 f() {
        return this.k;
    }

    private Context d() {
        return this.g;
    }

    private String a(String str) {
        try {
            JSONObject c = c(c(c(c(this.f, "configurations"), "adFormats"), str), Y0.c);
            if (c == null) {
                return null;
            }
            Iterator<String> keys = c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject c3 = c(c, next);
                if (c3 != null && c3.optBoolean(h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public static C4539mg b(Te te) {
        if (te != null && te.q()) {
            return te.c().b().k();
        }
        return C4539mg.a();
    }

    private Yf h(JSONObject jSONObject) {
        Yf yf = new Yf();
        JSONObject c = c(jSONObject, "testSuite");
        if (c != null) {
            yf.b(c.optString("controllerUrl"));
        }
        return yf;
    }

    public Te(Te te) {
        this.h = a.NOT_SET;
        this.j = false;
        try {
            this.g = te.d();
            this.f = new JSONObject(te.f.toString());
            this.d = te.d;
            this.e = te.e;
            this.j = te.j;
            this.f7915a = te.k();
            this.b = te.l();
            this.c = te.c();
            this.h = te.i();
            this.i = Ib.R().x();
            b(this.f);
        } catch (Exception e) {
            C4491k4.d().a(e);
            a();
        }
    }

    private H1 a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        boolean optBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean optBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int optInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String optString = jSONObject.optString("serverEventsURL", "");
        String optString2 = jSONObject.optString("serverEventsType", "");
        int optInt2 = jSONObject.optInt("backupThreshold", -1);
        int optInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int optInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray optJSONArray = jSONObject.optJSONArray("optOut");
        if (optJSONArray != null) {
            int[] iArr5 = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                iArr5[i] = optJSONArray.optInt(i);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("optIn");
        if (optJSONArray2 != null) {
            int[] iArr6 = new int[optJSONArray2.length()];
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                iArr6[i3] = optJSONArray2.optInt(i3);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (optJSONArray3 != null) {
            int[] iArr7 = new int[optJSONArray3.length()];
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                iArr7[i4] = optJSONArray3.optInt(i4);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (optJSONArray4 != null) {
            int[] iArr8 = new int[optJSONArray4.length()];
            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                iArr8[i5] = optJSONArray4.optInt(i5);
            }
            iArr4 = iArr8;
        } else {
            iArr4 = null;
        }
        return new H1(bool.booleanValue(), optBoolean, optBoolean2, optInt, optString, optString2, optInt2, optInt3, optInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            iArr[i] = optJSONArray.optInt(i);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z2) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z2) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z2) : z2;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i3 = 0;
        if (jSONObject.has(str)) {
            i3 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i3 = jSONObject2.optInt(str, 0);
        }
        return i3 == 0 ? i : i3;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long optLong;
        if (jSONObject.has(str)) {
            optLong = jSONObject.optLong(str, 0L);
        } else {
            optLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return optLong == 0 ? j : optLong;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C4429gd a(JSONObject jSONObject) {
        EnumC4500kd enumC4500kd = null;
        if (jSONObject == null) {
            return null;
        }
        C4429gd.a aVar = new C4429gd.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString(n1);
            if (!TextUtils.isEmpty(optString)) {
                EnumC4500kd enumC4500kd2 = EnumC4500kd.PER_DAY;
                if (!enumC4500kd2.toString().equals(optString)) {
                    enumC4500kd2 = EnumC4500kd.PER_HOUR;
                }
                enumC4500kd = enumC4500kd2;
            }
            int optInt = optJSONObject.optInt(l1, 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, enumC4500kd, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt(m1, 0);
            aVar.a(optJSONObject2.optBoolean("enabled", false) && optInt2 > 0, optInt2);
        }
        return aVar.a();
    }
}
