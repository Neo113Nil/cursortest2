package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tmg;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.ork;
import com.bytedance.sdk.openadsdk.core.settings.vj;
import com.bytedance.sdk.openadsdk.core.settings.vy;
import com.bytedance.sdk.openadsdk.oo.pcc.ork;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vh implements vy.pcc {
    private static String qy;
    private int dax;
    private final vj.sf<Map<String, Integer>> fum;
    private final AtomicBoolean gbb;
    private final kj hc;
    private volatile boolean jr;
    vj.sf<com.bytedance.sdk.openadsdk.oo.pcc.ork> kj;
    private final Runnable lo;
    private boolean lu;
    private int nac;
    private final vj.sf<Set<String>> of;
    private Set<String> ork;
    private final com.bytedance.sdk.openadsdk.core.settings.pcc tmg;
    private final Set<String> tz;
    private vj.sf<JSONObject> yt;
    public static final String pcc = UByte$$ExternalSyntheticBackport0.m((CharSequence) "_", new CharSequence[]{"bus_con_collect", kun.ye()});
    public static final String sf = UByte$$ExternalSyntheticBackport0.m((CharSequence) "_", new CharSequence[]{"bus_con", kun.ye(), kun.atb(), "timeout"});
    public static final String gm = UByte$$ExternalSyntheticBackport0.m((CharSequence) "_", new CharSequence[]{"bus_con", kun.ye(), kun.atb(), "alpha"});
    private static final String vy = kun.of();
    public static String oo = "";
    public static int vj = -2;
    public static String wh = AndroidTcfDataSource.TCF_TCSTRING_KEY;
    private static boolean vh = false;
    private static final ConcurrentLinkedQueue<ork.pcc> gpj = new ConcurrentLinkedQueue<>();
    static final ConcurrentHashMap<String, Integer> qf = new ConcurrentHashMap<>();

    private static final class pcc {
        static final vh pcc = new vh();
    }

    private vh() {
        this.ork = Collections.synchronizedSet(new HashSet());
        this.tmg = new com.bytedance.sdk.openadsdk.core.settings.pcc();
        this.hc = new kj(new ork.pcc() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void pcc() {
                ork.pcc[] pccVarArr;
                boolean unused = vh.vh = true;
                com.bytedance.sdk.openadsdk.core.vh.sf.pcc().gbb();
                if (vh.gpj == null || vh.gpj.size() == 0 || (pccVarArr = (ork.pcc[]) vh.gpj.toArray()) == null) {
                    return;
                }
                for (ork.pcc pccVar : pccVarArr) {
                    pccVar.pcc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void sf() {
                com.bytedance.sdk.openadsdk.core.vh.sf.pcc().jr();
                if (vh.gpj == null || vh.gpj.isEmpty()) {
                    return;
                }
                Iterator it = vh.gpj.iterator();
                while (it.hasNext()) {
                    ((ork.pcc) it.next()).sf();
                }
            }
        });
        this.gbb = new AtomicBoolean(false);
        this.jr = false;
        this.dax = 5000;
        this.nac = 10;
        this.lo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.7
            @Override // java.lang.Runnable
            public void run() {
                vh.this.pcc(2, false);
                vh.this.ei();
            }
        };
        this.fum = new vj.sf<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> sf(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap hashMap = new HashMap(jSONObject.length());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int optInt = jSONObject.optInt(next, 100);
                            if (optInt >= 0 && optInt <= 100) {
                                hashMap.put(next, Integer.valueOf(optInt));
                            } else {
                                hashMap.put(next, 100);
                            }
                        }
                    }
                    return hashMap;
                } catch (Exception e) {
                    lo.gm("get applog rate from sp failed:" + e.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.tz = new HashSet();
        this.of = new vj.sf<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public Set<String> sf(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("applog_count");
                        if (optInt >= 2 && optInt <= 100) {
                            vh.this.nac = optInt;
                        }
                        int optInt2 = jSONObject.optInt("applog_interval");
                        if (optInt2 >= 100 && optInt2 <= 30000) {
                            vh.this.dax = optInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        Log.i("TTAD.SdkSettings", e.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.yt = new vj.sf<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public JSONObject sf(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    lo.gm("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.kj = new vj.sf<com.bytedance.sdk.openadsdk.oo.pcc.ork>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.oo.pcc.ork sf(String str) {
                com.bytedance.sdk.openadsdk.oo.pcc.ork orkVar = new com.bytedance.sdk.openadsdk.oo.pcc.ork();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    orkVar.pcc(jSONObject.optInt("enable_strategy", 0) == 1);
                    orkVar.pcc(pcc(jSONObject.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject optJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            orkVar.pcc(next, pcc(optJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return orkVar;
            }

            private ork.pcc pcc(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new ork.pcc(jSONObject.optInt("retry_times", -1), jSONObject.optInt(SDKConstants.PARAM_A2U_TIME_INTERVAL, -1));
                }
                return null;
            }
        };
    }

    public void pcc() {
        try {
            gm.sf();
            this.hc.oo();
            this.tmg.oo();
            Context pcc2 = lu.pcc();
            File file = new File(new File(pcc2.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                pcc2.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    public static int pcc(Context context) {
        if (context == null) {
            return -2;
        }
        try {
            SharedPreferences gm2 = gm(context);
            if (gm2 == null) {
                return -2;
            }
            int i = gm2.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
            int i2 = gm2.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
            if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
                return -2;
            }
            return gm2.getInt("IABTCF_gdprApplies", -1);
        } catch (Throwable unused) {
            return -2;
        }
    }

    public static String sf(Context context) {
        SharedPreferences gm2;
        return (context == null || (gm2 = gm(context)) == null) ? "" : gm2.getString(wh, "");
    }

    private static SharedPreferences gm(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static vh sf() {
        return pcc.pcc;
    }

    public synchronized void gm() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.jr;
        this.tmg.pcc(this.jr);
        this.hc.pcc(this.jr);
        gm.pcc(!z);
        this.jr = true;
        new Object[]{"loadLocalData: finished, used", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "ms"};
        if (!z) {
            jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.3
                @Override // java.lang.Runnable
                public void run() {
                    vh.this.pcc(1, com.bytedance.sdk.openadsdk.core.vh.sf.pcc().qf() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().ork());
                    vh.this.ei();
                }
            }, 1000L);
        }
    }

    public String oo() {
        return this.hc.pcc("aes_key", "");
    }

    public int vj() {
        return this.hc.pcc("max_tpl_cnts", 100);
    }

    public JSONObject wh() {
        return (JSONObject) this.hc.pcc("digest", null, vj.pcc);
    }

    public long qf() {
        return this.hc.pcc("data_time", 0L);
    }

    public void kj() {
        this.hc.sf().pcc("ab_test_param").pcc();
    }

    public void pcc(JSONObject jSONObject, vj.pcc pccVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        kj kjVar = this.hc;
        String str = vy;
        String pcc2 = kjVar.pcc("dyn_draw_engine_url", str);
        final String optString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(pcc2) && !TextUtils.isEmpty(optString) && !optString.equals(pcc2)) {
            jr.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(vh.this.hc.pcc("dyn_draw_engine_url", vh.vy), optString)) {
                        com.bytedance.sdk.component.adexpress.pcc.sf.vj.sf().gm();
                    }
                }
            }, 5000L);
        }
        pccVar.pcc("dyn_draw_engine_url", optString);
    }

    public int pcc(String str) {
        if (str == null) {
            return 0;
        }
        return lu.oo().tsz(str).gpj;
    }

    public String vy() {
        return this.hc.pcc("ab_test_version", "");
    }

    public int ork() {
        return this.hc.pcc("splash_video_load_strategy", 0);
    }

    public int sf(String str) {
        Integer num;
        Map map = (Map) this.hc.pcc("perf_con_applog_rate", null, this.fum);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int vh() {
        return this.hc.pcc("perf_con_drawable_code", 0);
    }

    public Set<String> tmg() {
        return gr();
    }

    public int hc() {
        gr();
        return this.nac;
    }

    public int gbb() {
        gr();
        return this.dax;
    }

    public boolean jr() {
        return this.hc.pcc("allow_blind_mode_request_ad", false);
    }

    public boolean dax() {
        return this.hc.pcc("support_gzip", false);
    }

    public boolean nac() {
        return this.hc.pcc("ad_revenue_enable", true);
    }

    public boolean lu() {
        return this.hc.pcc("bus_con_adshow_check_enable", true);
    }

    public String gpj() {
        return this.hc.pcc("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public int lo() {
        return this.hc.pcc("bus_con_behavior_count", 300);
    }

    public String fum() {
        return this.hc.pcc("bus_con_check_clz", "");
    }

    public boolean tz() {
        return this.hc.pcc("bus_con_url_check", 1) != 0;
    }

    public boolean of() {
        return this.hc.pcc(pcc, false);
    }

    public int yt() {
        return this.hc.pcc(sf, 10000);
    }

    public float qy() {
        return this.hc.pcc(gm, 1.0f);
    }

    public int jsj() {
        return this.hc.pcc("bus_con_slide_num", 2);
    }

    public int tsz() {
        return this.hc.pcc("loadedCallbackOpportunity", 0);
    }

    public String mk() {
        return this.hc.pcc("ab_test_param", "");
    }

    public boolean atb() {
        return this.hc.pcc("landingpage_new_style", -1) == 1;
    }

    public long ye() {
        return this.hc.pcc(IronSourceConstants.EVENTS_DURATION, 10000L);
    }

    public int lq() {
        return this.hc.pcc("max", 50);
    }

    public wh zti() {
        return (wh) this.hc.pcc("insert_js_config", wh.pcc, new vj.sf<wh>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public wh sf(String str) {
                return new wh(str);
            }
        });
    }

    public int pq() {
        int pcc2 = this.hc.pcc("fetch_tpl_timeout_ctrl", 3000);
        if (pcc2 <= 0) {
            return 3000;
        }
        return pcc2;
    }

    public int mu() {
        int pcc2 = this.hc.pcc("fetch_tpl_second", 0);
        if (pcc2 <= 0) {
            return 0;
        }
        return pcc2;
    }

    public void nn() {
        String az = az();
        if (TextUtils.isEmpty(az)) {
            return;
        }
        if (az.equals("zh-Hant")) {
            tmg.pcc(lu.pcc(), "zh", "tw");
        } else {
            tmg.pcc(lu.pcc(), az, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            lo.gm("TTAD.SdkSettings", th.getMessage());
        }
    }

    private String az() {
        return this.hc.pcc("force_language", "");
    }

    public boolean gm(String str) {
        return tsz(str).gm == 1;
    }

    public boolean oo(String str) {
        return tsz(str).mk;
    }

    public boolean vj(String str) {
        int i = tsz(str).vj;
        if (i != 1) {
            return i == 2 && com.bytedance.sdk.component.utils.lu.gm(lu.pcc()) != 0;
        }
        return com.bytedance.sdk.component.utils.lu.oo(lu.pcc());
    }

    public boolean wh(String str) {
        return tsz(str).qf == 1;
    }

    public int qf(String str) {
        return tsz(str).lu;
    }

    public boolean kj(String str) {
        return str == null || tsz(str).gbb == 1;
    }

    public int vy(String str) {
        if (str == null) {
            return 1;
        }
        return tsz(str).gbb;
    }

    public int ork(String str) {
        if (str == null) {
            return 5000;
        }
        return tsz(str).dax;
    }

    public int vh(String str) {
        return tsz(str).vh;
    }

    public int tmg(String str) {
        return tsz(str).tmg;
    }

    public boolean hc(String str) {
        try {
            return tsz(str).of != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean rnn() {
        return this.hc.gm();
    }

    public int gbb(String str) {
        return tsz(String.valueOf(str)).kj;
    }

    public boolean jr(String str) {
        return gbb(str) != 1;
    }

    public int dax(String str) {
        return tsz(str).ork;
    }

    public boolean nac(String str) {
        return tsz(str).tz == 0;
    }

    public boolean lu(String str) {
        return str == null || DeviceUtils.ork(lu.pcc()) == 0 || tsz(str).hc == 1;
    }

    public String tsx() {
        return this.hc.pcc("ads_url", "");
    }

    public String kun() {
        return this.hc.pcc("settings_url", "");
    }

    public String rj() {
        return this.hc.pcc("app_log_url", "");
    }

    public String lrr() {
        return this.hc.pcc("policy_url", "");
    }

    public int iv() {
        return this.hc.pcc("ivrv_downward", 0);
    }

    public String xb() {
        return this.hc.pcc("dyn_draw_engine_url", vy);
    }

    public String ri() {
        return this.hc.pcc("dc", "TX");
    }

    public String hpk() {
        return this.hc.pcc("dc", "");
    }

    public int pcc(int i) {
        return tsz(String.valueOf(i)).lq;
    }

    public int sf(int i) {
        return tsz(String.valueOf(i)).sf;
    }

    public int gm(int i) {
        return tsz(String.valueOf(i)).vy;
    }

    public int fmh() {
        return this.hc.pcc("vbtt", 5);
    }

    public JSONObject gpj(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.hc.pcc("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", tsz(str).zti);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                lo.gm("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public int lo(String str) {
        return tsz(str).lo;
    }

    public boolean fum(String str) {
        return tsz(str).fum;
    }

    public int tz(String str) {
        return tsz(str).qy;
    }

    public int of(String str) {
        return tsz(str).jsj;
    }

    public int yt(String str) {
        return tsz(str).tsz;
    }

    public boolean qy(String str) {
        return tsz(str).ye;
    }

    public boolean jsj(String str) {
        return lu.oo().tsz(str).jr == 1;
    }

    public sf tsz(String str) {
        return gm.pcc(str);
    }

    public boolean zsj() {
        int pcc2 = this.hc.pcc("privacy_ad_enable", Integer.MAX_VALUE);
        if (pcc2 == 1) {
            return true;
        }
        if (pcc2 == 0) {
            return false;
        }
        int qy2 = kun.qy();
        return qy2 == 1 || qy2 == 2 || qy2 == 3;
    }

    public int gd() {
        int pcc2 = this.hc.pcc("privacy_personalized_ad", Integer.MAX_VALUE);
        if (pcc2 != Integer.MAX_VALUE) {
            return pcc2;
        }
        int qy2 = kun.qy();
        if (qy2 == 1 || qy2 == 2) {
            return 2;
        }
        return qy2 != 3 ? 0 : 1;
    }

    public boolean erj() {
        return this.hc.pcc("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public boolean se() {
        boolean z = this.hc.pcc("bus_con_sec_type", Integer.MAX_VALUE) != 0;
        new Object[]{"secSdk type: ", Boolean.valueOf(z)};
        return z;
    }

    public boolean ptr() {
        return this.hc.pcc("privacy_debug_unlock", 1) != 0;
    }

    public boolean mk(String str) {
        Set set = (Set) this.hc.pcc("privacy_fields_allowed", Collections.emptySet(), vj.sf);
        if (set.isEmpty()) {
            int qy2 = kun.qy();
            if (qy2 != 1) {
                if (qy2 != 2 && qy2 != 3) {
                    return false;
                }
                if (!"mcc".equals(str) && !"mnc".equals(str)) {
                    return false;
                }
            }
            return true;
        }
        return set.contains(str);
    }

    public String hoh() {
        return this.hc.pcc("privacy_app_reg", "");
    }

    public boolean qcw() {
        return this.jr;
    }

    public boolean vr() {
        return this.hc.pcc("global_rate", 1.0f) == 1.0f;
    }

    public boolean bg() {
        return this.hc.pcc("read_video_from_cache", 1) == 1;
    }

    public int kz() {
        int pcc2 = this.hc.pcc("perf_con_webview_cache_count", 0);
        if (pcc2 < 0) {
            return 0;
        }
        return pcc2;
    }

    public int ew() {
        int pcc2 = this.hc.pcc("perf_con_webview_cache_count_v3", 0);
        if (pcc2 < 0) {
            return 0;
        }
        return pcc2;
    }

    public String[] tmh() {
        Set<String> set;
        try {
            set = this.ork;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.hc.pcc("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.ork.add(jSONArray.getString(i));
                }
            }
            Set<String> pcc2 = kj.pcc(this.ork);
            this.ork = pcc2;
            if (pcc2 != null) {
                if (pcc2.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.ork.toArray(new String[0]);
    }

    public int gh() {
        return this.hc.pcc("blank_detect_rate", 30);
    }

    public long gdh() {
        long pcc2 = this.hc.pcc("req_inter_min", 600000L);
        if (pcc2 < 0 || pcc2 > 86400000) {
            return 600000L;
        }
        return pcc2;
    }

    public long otd() {
        return this.hc.pcc("last_req_time", 0L);
    }

    public void pcc(long j) {
        this.hc.sf().pcc("last_req_time", j).pcc();
    }

    void ei() {
        jr.sf().removeCallbacks(this.lo);
        jr.sf().postDelayed(this.lo, gdh());
    }

    public boolean vgx() {
        return this.gbb.get();
    }

    public void pcc(final int i, boolean z) {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().oo()) {
            return;
        }
        if (!jr.vj() && i != 1 && i != 2) {
            if (z) {
                this.lu = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.ork.sf().oo())) {
                return;
            }
            if (this.lu) {
                this.lu = false;
                if (!z) {
                    z = true;
                }
            }
            long otd = otd();
            long currentTimeMillis = System.currentTimeMillis();
            long gdh = gdh();
            long j = currentTimeMillis - otd;
            if ((z || j >= gdh) && this.gbb.compareAndSet(false, true)) {
                rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.vh.sf.pcc().pcc(new com.bytedance.sdk.openadsdk.core.vh.oo() { // from class: com.bytedance.sdk.openadsdk.core.settings.vh.6.1
                            @Override // com.bytedance.sdk.openadsdk.core.vh.oo
                            public void pcc(boolean z2) {
                                if (!z2) {
                                    vh.this.gbb.set(false);
                                } else {
                                    new vy(vh.this, vh.this.hc, vh.this.tmg).run();
                                }
                            }
                        }, i == 6);
                    }
                });
                jr.sf().removeCallbacks(this.lo);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vy.pcc
    public void pcc(boolean z) {
        this.gbb.set(false);
        ei();
        if (z) {
            HashMap hashMap = new HashMap();
            Set<String> vd = vd();
            if (vd != null && !vd.isEmpty()) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, vd);
            }
            String lu = kun.lu();
            if (!TextUtils.isEmpty(lu)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, lu);
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
                Set<String> gga = sf().gga();
                if (gga != null && !gga.isEmpty()) {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, gga);
                } else {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
                }
            } else {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, rc());
            com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(hashMap);
        }
    }

    public boolean ywp() {
        if (com.bytedance.sdk.component.adexpress.oo.sf.pcc(lu.pcc())) {
            return this.hc.pcc("support_rtl", false);
        }
        return false;
    }

    private Set<String> gr() {
        return (Set) this.hc.pcc("perf_con_applog_send", this.tz, this.of);
    }

    public boolean ra() {
        int pcc2 = this.tmg.pcc("perf_con_apm", 100);
        if (pcc2 == 0) {
            return false;
        }
        return pcc2 < 0 || pcc2 >= 100 || pcc2 > ((int) (Math.random() * 100.0d));
    }

    public long rt() {
        return this.hc.pcc("perf_con_adlog_expire_time", 0L);
    }

    public boolean qc() {
        return this.hc.pcc("perf_con_is_new_net_thread", 0) == 1;
    }

    public JSONObject wax() {
        return (JSONObject) this.hc.pcc("perf_con_thread_pool_config", new JSONObject(), this.yt);
    }

    public boolean bbd() {
        return this.hc.pcc("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public boolean pv() {
        return this.hc.pcc("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public String jq() {
        return this.hc.pcc("dual_event_url", (String) null);
    }

    public Set<String> gqd() {
        Set<String> set = (Set) this.hc.pcc("dual_event_url_backup", Collections.emptySet(), vj.sf);
        return (set == null || set.size() == 0) ? Collections.emptySet() : set;
    }

    public int fvk() {
        int pcc2 = this.hc.pcc("bus_con_auto_click_delay", 3000);
        if (pcc2 <= 0) {
            return 3000;
        }
        return pcc2;
    }

    public com.bytedance.sdk.openadsdk.oo.pcc.ork mua() {
        return (com.bytedance.sdk.openadsdk.oo.pcc.ork) this.hc.pcc("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.oo.pcc.ork.pcc, this.kj);
    }

    public Set<String> vo() {
        return (Set) this.hc.pcc("perf_con_drop2rt_skip_label_list", Collections.emptySet(), vj.sf);
    }

    public int fy() {
        return this.hc.pcc("perf_con_sync_gaid", 0);
    }

    public static boolean bxz() {
        return vh;
    }

    public static void pcc(ork.pcc pccVar) {
        ConcurrentLinkedQueue<ork.pcc> concurrentLinkedQueue = gpj;
        if (concurrentLinkedQueue.contains(pccVar)) {
            return;
        }
        concurrentLinkedQueue.add(pccVar);
    }

    public boolean kx() {
        return this.hc.pcc("bus_con_video_keep_screen_on", 1) == 1;
    }

    public void jy() {
        vj.pcc sf2 = this.hc.sf();
        sf2.pcc("settings_url", "");
        sf2.pcc();
        ye("");
    }

    public Set<String> vd() {
        return (Set) this.hc.pcc("privacy_fields_allowed", Collections.emptySet(), vj.sf);
    }

    public boolean xf() {
        return this.hc.pcc("token_enable", 0) == 1;
    }

    public boolean atb(String str) {
        Set<String> uae;
        if (TextUtils.isEmpty(str) || (uae = uae()) == null || uae.size() == 0) {
            return false;
        }
        return uae.contains(str);
    }

    public Set<String> uae() {
        return (Set) this.hc.pcc("token_adx_ids", Collections.emptySet(), vj.sf);
    }

    public Set<String> gga() {
        Set<String> set = (Set) this.hc.pcc("ads_url_backup", Collections.emptySet(), vj.sf);
        return (set == null || set.size() == 0) ? Collections.emptySet() : set;
    }

    public String rc() {
        return this.hc.pcc("target_region", "");
    }

    public static String kez() {
        if (qy == null) {
            String sf2 = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("settings_host_from_meta", "");
            qy = sf2;
            if (sf2 == null) {
                qy = "";
            }
        }
        return qy;
    }

    public static void ye(String str) {
        if (str == null) {
            str = "";
        }
        String kez = kez();
        if (kez == null || !kez.equals(str)) {
            com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("settings_host_from_meta", str);
            qy = str;
            sf().pcc(8, true);
        }
    }
}
