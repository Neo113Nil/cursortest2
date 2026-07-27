package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class mk {
    private int gm;
    private int kj;
    private int oo;
    private String ork;
    private String pcc;
    private String qf;
    private String sf;
    private int vh;
    private String vj;
    private String vy;
    private String wh;

    public String pcc() {
        return this.qf;
    }

    public void pcc(String str) {
        this.qf = str;
    }

    public void pcc(int i) {
        this.vh = i;
    }

    public int sf() {
        return this.kj;
    }

    public void sf(int i) {
        this.kj = i;
    }

    public String gm() {
        return this.vy;
    }

    public void sf(String str) {
        this.vy = str;
    }

    public void gm(String str) {
        this.ork = str;
    }

    public String oo() {
        return this.vj;
    }

    public void oo(String str) {
        this.vj = str;
    }

    public String vj() {
        return this.wh;
    }

    public void vj(String str) {
        this.wh = str;
    }

    public void wh(String str) {
        this.pcc = str;
    }

    public void qf(String str) {
        this.sf = str;
    }

    public void gm(int i) {
        this.gm = i;
    }

    public int wh() {
        return this.oo;
    }

    public void oo(int i) {
        this.oo = i;
    }

    public boolean qf() {
        return this.oo == 1;
    }

    public boolean kj() {
        return this.oo == 2;
    }

    public boolean vy() {
        return this.vh == 1;
    }

    public static mk pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mk mkVar = new mk();
        try {
            mkVar.wh(jSONObject.optString("market_dpl", ""));
            mkVar.qf(jSONObject.optString("market_dpl_auto", ""));
            mkVar.gm(jSONObject.optInt("exec_type", 0));
            mkVar.oo(jSONObject.optInt("oem_vendor_type", 0));
            mkVar.oo(jSONObject.optString("market_pkg", ""));
            mkVar.vj(jSONObject.optString("regex", ""));
            mkVar.sf(jSONObject.optInt("overlay", 1));
            mkVar.sf(jSONObject.optString("caller_id", ""));
            mkVar.gm(jSONObject.optString("ext_map", null));
            mkVar.pcc(jSONObject.optInt("gp_card", 0));
            mkVar.pcc(jSONObject.optString("app_pkg", ""));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("OemModel", th.getMessage());
        }
        return mkVar;
    }

    public String ork() {
        if (this.gm == 2) {
            return this.sf;
        }
        return this.pcc;
    }

    public JSONObject vh() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.pcc)) {
                jSONObject.put("market_dpl", this.pcc);
            }
            if (!TextUtils.isEmpty(this.sf)) {
                jSONObject.put("market_dpl_auto", this.sf);
            }
            if (!TextUtils.isEmpty(this.vj)) {
                jSONObject.put("market_pkg", this.vj);
            }
            if (!TextUtils.isEmpty(this.qf)) {
                jSONObject.put("app_pkg", this.qf);
            }
            if (!TextUtils.isEmpty(this.wh)) {
                jSONObject.put("regex", this.wh);
            }
            jSONObject.put("exec_type", this.gm);
            jSONObject.put("oem_vendor_type", this.oo);
            jSONObject.put("overlay", this.kj);
            jSONObject.put("gp_card", this.vh);
            if (!TextUtils.isEmpty(this.vy)) {
                jSONObject.put("caller_id", this.vy);
            }
            if (!TextUtils.isEmpty(this.ork)) {
                jSONObject.put("ext_map", this.ork);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("OemModel", th.getMessage());
            return null;
        }
    }

    public void pcc(Intent intent) {
        if (TextUtils.isEmpty(this.ork)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.ork);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                } else {
                    new Object[]{"Unsupported type ", next, obj};
                }
            }
        } catch (Throwable th) {
            new Object[]{th};
        }
    }
}
