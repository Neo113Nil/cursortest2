package com.bytedance.sdk.openadsdk.oo;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc implements com.bytedance.sdk.component.wh.pcc.oo.pcc.sf {
    private String dax;
    private com.bytedance.sdk.openadsdk.oo.sf.pcc fum;
    private JSONObject gbb;
    private boolean gm;
    private String gpj;
    private final AtomicBoolean hc;
    private String jr;
    private List<String> jsj;
    private int kj;
    private String lo;
    private String lu;
    private String nac;
    private String of;
    private long oo;
    private int ork;
    public final String pcc;
    private int qf;
    private String qy;
    protected final JSONObject sf;
    private String tz;
    private long vj;
    private int vy;
    private final String wh;
    private int yt;
    private static final Set<String> vh = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> tmg = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", InneractiveInternalBrowserActivity.URL_EXTRA);
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(IronSourceConstants.EVENTS_ERROR_CODE, "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    public pcc(String str, JSONObject jSONObject) {
        this.wh = "adiff";
        this.hc = new AtomicBoolean(false);
        this.gbb = new JSONObject();
        this.pcc = str;
        this.sf = jSONObject;
    }

    private void vy() {
        JSONObject jSONObject = this.gbb;
        if (jSONObject == null) {
            if (!pcc(this.lu, this.nac, this.of)) {
                return;
            }
        } else {
            String optString = jSONObject.optString("value");
            String optString2 = this.gbb.optString("category");
            String optString3 = this.gbb.optString("log_extra");
            if (pcc(this.lu, this.nac, this.of)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !sf(optString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(optString) || TextUtils.equals(optString, "0")) && (TextUtils.isEmpty(this.lu) || TextUtils.equals(this.lu, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.nac) || !sf(this.nac)) && (TextUtils.isEmpty(optString2) || !sf(optString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.of) && TextUtils.isEmpty(optString3)) {
                    return;
                }
            }
        }
        this.oo = com.bytedance.sdk.openadsdk.oo.pcc.sf.gm.incrementAndGet();
    }

    private boolean sf(String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean pcc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private JSONObject pcc(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.pcc);
            }
            if (this.gm) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.qf);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.kj);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.vy);
                }
            }
            sf(jSONObject);
            if (!jSONObject.has("pangle_client_unique_id")) {
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.pcc + "-" + System.currentTimeMillis());
            }
            if (com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.sf()) {
                String optString = jSONObject.optString("pag_json_data");
                if (!TextUtils.isEmpty(optString)) {
                    this.ork = new JSONObject(optString).optInt("_l_s_t");
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            lo.gm("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public int gm() {
        return this.ork;
    }

    private void sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : tmg.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object opt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(tmg.get(str), opt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject oo() {
        if (this.hc.get()) {
            return this.sf;
        }
        try {
            ork();
        } catch (Throwable th) {
            new Object[]{th};
        }
        if (this.sf.has("ad_extra_data")) {
            Object opt = this.sf.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        this.sf.put("ad_extra_data", pcc((JSONObject) opt).toString());
                    } else if (opt instanceof String) {
                        this.sf.put("ad_extra_data", pcc(new JSONObject((String) opt)).toString());
                    }
                } catch (JSONException e) {
                    lo.gm("AdEvent", "json error", e.getMessage());
                }
            }
            this.hc.set(true);
            return this.sf;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adiff", this.pcc);
            if (this.gm) {
                jSONObject.put("interaction_method", this.qf);
                jSONObject.put("real_interaction_method", this.kj);
                jSONObject.put("image_mode", this.vy);
            }
            this.sf.put("ad_extra_data", jSONObject.toString());
        } catch (JSONException e2) {
            lo.gm("AdEvent", "json error", e2.getMessage());
        }
        this.hc.set(true);
        return this.sf;
        new Object[]{th};
        return this.sf;
    }

    public JSONObject vj() {
        JSONObject oo = oo();
        try {
            JSONObject jSONObject = new JSONObject(oo.toString());
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (optJSONObject != null) {
                optJSONObject.remove("app_log_url");
                optJSONObject.remove("app_log_url_back");
            }
            return jSONObject;
        } catch (JSONException e) {
            lo.gm("AdEvent", e.getMessage());
            return oo;
        }
    }

    public String wh() {
        if (TextUtils.isEmpty(this.dax)) {
            JSONObject jSONObject = this.sf;
            if (jSONObject != null) {
                return jSONObject.optString("label");
            }
            return "";
        }
        return this.dax;
    }

    private void ork() throws JSONException {
        this.sf.putOpt("app_log_url", this.qy);
        List<String> list = this.jsj;
        if (list != null && !list.isEmpty()) {
            try {
                this.sf.putOpt("app_log_url_back", new JSONArray((Collection) this.jsj));
            } catch (Throwable th) {
                lo.gm("AdEvent", th.getMessage());
            }
        }
        this.sf.putOpt("tag", this.jr);
        this.sf.putOpt("label", this.dax);
        this.sf.putOpt("category", this.nac);
        if (!TextUtils.isEmpty(this.lu)) {
            try {
                this.sf.putOpt("value", Long.valueOf(Long.parseLong(this.lu)));
            } catch (NumberFormatException unused) {
                this.sf.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.lo)) {
            try {
                this.sf.putOpt("ext_value", Long.valueOf(Long.parseLong(this.lo)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.of)) {
            this.sf.putOpt("log_extra", this.of);
        }
        if (!TextUtils.isEmpty(this.tz)) {
            try {
                this.sf.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.tz)));
            } catch (NumberFormatException unused3) {
            }
        }
        pcc(this.sf, this.dax);
        try {
            if (!this.sf.has("nt")) {
                this.sf.putOpt("nt", Integer.valueOf(this.yt));
            }
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.gbb.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.sf.putOpt(next, this.gbb.opt(next));
        }
    }

    public String qf() {
        return this.pcc;
    }

    pcc(C0193pcc c0193pcc) {
        this.wh = "adiff";
        this.hc = new AtomicBoolean(false);
        this.gbb = new JSONObject();
        if (TextUtils.isEmpty(c0193pcc.sf)) {
            this.pcc = tsz.pcc();
        } else {
            this.pcc = c0193pcc.sf;
        }
        this.fum = c0193pcc.jr;
        this.of = c0193pcc.wh;
        this.jr = c0193pcc.gm;
        this.dax = c0193pcc.oo;
        if (TextUtils.isEmpty(c0193pcc.vj)) {
            this.nac = "app_union";
        } else {
            this.nac = c0193pcc.vj;
        }
        this.tz = c0193pcc.vh;
        this.lu = c0193pcc.kj;
        this.lo = c0193pcc.vy;
        this.gpj = c0193pcc.qf;
        this.yt = c0193pcc.tmg;
        this.qy = c0193pcc.hc;
        this.gbb = c0193pcc.ork = c0193pcc.ork != null ? c0193pcc.ork : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.sf = jSONObject;
        if (!TextUtils.isEmpty(c0193pcc.hc)) {
            try {
                jSONObject.put("app_log_url", c0193pcc.hc);
            } catch (JSONException e) {
                lo.gm("AdEvent", e.getMessage());
            }
        }
        this.jsj = c0193pcc.fum;
        if (c0193pcc.fum != null && !c0193pcc.fum.isEmpty()) {
            try {
                this.sf.putOpt("app_log_url_back", new JSONArray((Collection) c0193pcc.fum));
            } catch (Throwable th) {
                lo.gm("AdEvent", th.getMessage());
            }
        }
        this.qf = c0193pcc.nac;
        this.kj = c0193pcc.lu;
        this.vy = c0193pcc.pcc;
        this.gm = c0193pcc.gpj;
        this.vj = System.currentTimeMillis();
        vy();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc.sf
    public JSONObject pcc(String str) {
        return oo();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc.sf
    public long pcc() {
        return this.vj;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc.sf
    public long sf() {
        return this.oo;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.oo.pcc$pcc, reason: collision with other inner class name */
    public static final class C0193pcc {
        private final long dax;
        private List<String> fum;
        private com.bytedance.sdk.openadsdk.oo.sf.sf gbb;
        private String gm;
        private boolean gpj;
        private String hc;
        private com.bytedance.sdk.openadsdk.oo.sf.pcc jr;
        private String kj;
        private String lo;
        private int lu;
        private int nac;
        private String oo;
        private JSONObject ork;
        public int pcc;
        private String qf;
        private String sf;
        private final int tmg;
        private String vh;
        private String vj;
        private String vy;
        private String wh;

        public C0193pcc(long j, of ofVar) {
            this.nac = -1;
            this.lu = -1;
            this.pcc = -1;
            if (ofVar != null) {
                this.gpj = atb.sf(ofVar);
                this.nac = ofVar.kz();
                this.lu = ofVar.bg();
                this.pcc = ofVar.ct();
            }
            this.dax = j;
            this.tmg = com.bytedance.sdk.component.utils.lu.gm(com.bytedance.sdk.openadsdk.core.lu.pcc());
        }

        public C0193pcc pcc(String str) {
            this.hc = str;
            return this;
        }

        public C0193pcc pcc(List<String> list) {
            this.fum = list;
            return this;
        }

        public C0193pcc sf(String str) {
            this.gm = str;
            return this;
        }

        public C0193pcc gm(String str) {
            this.oo = str;
            return this;
        }

        public C0193pcc oo(String str) {
            this.vj = str;
            return this;
        }

        public C0193pcc vj(String str) {
            this.kj = str;
            return this;
        }

        public C0193pcc wh(String str) {
            this.vy = str;
            return this;
        }

        public C0193pcc pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.ork = jSONObject;
            return this;
        }

        public C0193pcc qf(String str) {
            this.qf = str;
            return this;
        }

        public void pcc(com.bytedance.sdk.openadsdk.oo.sf.pcc pccVar) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc(this.oo, this.lo, this.qf, this.gm);
            this.jr = pccVar;
            pcc pccVar2 = new pcc(this);
            try {
                com.bytedance.sdk.openadsdk.oo.sf.sf sfVar = this.gbb;
                if (sfVar != null) {
                    sfVar.pcc(pccVar2.sf, this.dax);
                } else {
                    new com.bytedance.sdk.openadsdk.oo.sf.gm().pcc(pccVar2.sf, this.dax);
                }
            } catch (Throwable th) {
                new Object[]{th};
            }
            com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(pccVar2);
        }

        public C0193pcc kj(String str) {
            this.lo = str;
            return this;
        }
    }

    public boolean kj() {
        Set<String> tmg2;
        if (this.sf == null || (tmg2 = com.bytedance.sdk.openadsdk.core.lu.oo().tmg()) == null) {
            return false;
        }
        String optString = this.sf.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.dax)) {
                return false;
            }
            return tmg2.contains(this.dax);
        }
        return tmg2.contains(optString);
    }

    private static void pcc(JSONObject jSONObject, String str) {
        try {
            Set<String> set = vh;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            lo.gm("AdEvent", th);
        }
    }
}
