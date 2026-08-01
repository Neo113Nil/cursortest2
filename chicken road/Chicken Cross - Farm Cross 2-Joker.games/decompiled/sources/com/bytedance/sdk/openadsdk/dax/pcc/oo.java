package com.bytedance.sdk.openadsdk.dax.pcc;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.dax.pcc.oo;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo<T extends oo> implements gm {
    private String gm;
    private String hc;
    private String ork;
    private String pcc;
    private String qf;
    private String sf;
    private String tmg;
    private String vh;
    private String vy;
    private final String oo = BuildConfig.VERSION_NAME;
    private long vj = System.currentTimeMillis() / 1000;
    private int wh = 0;
    private int kj = 0;

    private T dax() {
        return this;
    }

    private oo() {
        try {
            this.hc = tsz.pcc();
        } catch (Throwable unused) {
            this.hc = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    public static oo<oo> sf() {
        return new oo<>();
    }

    @Override // com.bytedance.sdk.openadsdk.dax.pcc.gm
    public JSONObject pcc() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", qf());
            jSONObject2.put("app_version", kun.kj());
            jSONObject2.put("timestamp", kj());
            jSONObject2.put("conn_type", lu.sf(com.bytedance.sdk.openadsdk.core.lu.pcc()));
            jSONObject2.put("appid", TextUtils.isEmpty(ork.sf().oo()) ? "" : ork.sf().oo());
            jSONObject2.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, jr());
            if (!TextUtils.isEmpty(gm())) {
                jSONObject2.put("type", gm());
            }
            jSONObject2.put("error_code", vh());
            if (!TextUtils.isEmpty(tmg())) {
                jSONObject2.put("error_msg", tmg());
            }
            if (!TextUtils.isEmpty(vj())) {
                jSONObject2.put("rit", vj());
            }
            if (!TextUtils.isEmpty(wh())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, wh());
            }
            if (vy() > 0) {
                jSONObject2.put("adtype", vy());
            }
            if (!TextUtils.isEmpty(ork())) {
                jSONObject2.put("req_id", ork());
            }
            if (!TextUtils.isEmpty(hc())) {
                jSONObject2.put("extra", hc());
            }
            String oo = oo();
            if (TextUtils.isEmpty(oo)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(oo);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.hc + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(oo)) {
                jSONObject2.put("event_extra", oo);
            }
            if (!TextUtils.isEmpty(gbb())) {
                jSONObject2.put(IronSourceConstants.EVENTS_DURATION, gbb());
            }
        } catch (Throwable th) {
            lo.gm("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    private JSONObject jr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(L6.F, 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", kun.wh());
            jSONObject.put(L6.d0, kun.oo());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String gm() {
        return this.pcc;
    }

    public T pcc(String str) {
        this.pcc = str;
        return dax();
    }

    public String oo() {
        return this.vh;
    }

    public T sf(String str) {
        this.vh = str;
        return dax();
    }

    public String vj() {
        return this.sf;
    }

    public T gm(String str) {
        this.sf = str;
        return dax();
    }

    public String wh() {
        return this.gm;
    }

    public T oo(String str) {
        this.gm = str;
        return dax();
    }

    public String qf() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public long kj() {
        return this.vj;
    }

    public int vy() {
        return this.wh;
    }

    public T pcc(int i) {
        this.wh = i;
        return dax();
    }

    public String ork() {
        return this.qf;
    }

    public T vj(String str) {
        this.qf = str;
        return dax();
    }

    public int vh() {
        return this.kj;
    }

    public T sf(int i) {
        this.kj = i;
        return dax();
    }

    public String tmg() {
        return this.vy;
    }

    public T wh(String str) {
        this.vy = str;
        return dax();
    }

    public String hc() {
        return this.ork;
    }

    public T qf(String str) {
        this.ork = str;
        return dax();
    }

    public String gbb() {
        return this.tmg;
    }

    public T kj(String str) {
        this.tmg = str;
        return dax();
    }
}
