package com.bytedance.sdk.openadsdk.dax;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.L6;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo {
    private static volatile oo pcc;

    private boolean gm(com.bytedance.sdk.openadsdk.dax.pcc.oo ooVar) {
        return ooVar == null;
    }

    private oo() {
    }

    public static oo pcc() {
        if (pcc == null) {
            synchronized (oo.class) {
                if (pcc == null) {
                    pcc = new oo();
                }
            }
        }
        return pcc;
    }

    public static void pcc(final of ofVar) {
        if (ofVar == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        pcc("bidding_receive", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (ofVar.tqg() == 3) {
                    jSONObject.put("is_icon_only", ofVar.ye() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("bidding_receive").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(of ofVar, final long j) {
        if (ofVar == null) {
            return;
        }
        pcc("bidding_load", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.8
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("bidding_load").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(final String str, final com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        pcc(str, false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.13
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject gm = com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.gm();
                if (gm == null) {
                    gm = new JSONObject();
                }
                of pcc2 = com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.pcc();
                gm.put("req_id", pcc2.qxv());
                com.bytedance.sdk.openadsdk.oo.vj.sf.gm vj = com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.vj();
                if (vj != null) {
                    vj.pcc(gm);
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(str).pcc(pcc2.tqg()).sf(gm.toString());
            }
        });
    }

    public static void sf(final of ofVar) {
        if (kun.pcc(ofVar) == null || TextUtils.isEmpty(ofVar.cz())) {
            return;
        }
        pcc("download_gecko_start", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.14
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", of.this.xy());
                jSONObject.put("channel_name", of.this.cz());
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("download_gecko_start").pcc(of.this.tqg()).sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(final of ofVar, final JSONObject jSONObject) {
        if (kun.pcc(ofVar) == null || TextUtils.isEmpty(ofVar.cz())) {
            return;
        }
        pcc("download_gecko_end", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.15
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", of.this.xy());
                jSONObject2.put("channel_name", of.this.cz());
                jSONObject2.put("data", jSONObject);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("download_gecko_end").pcc(of.this.tqg()).sf(jSONObject2.toString());
            }
        });
    }

    public void pcc(final com.bytedance.sdk.openadsdk.dax.pcc.oo ooVar) {
        if (gm(ooVar)) {
            return;
        }
        ooVar.pcc("express_ad_render");
        lu.vj().pcc(new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.16
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                return ooVar;
            }
        });
    }

    public void sf(final com.bytedance.sdk.openadsdk.dax.pcc.oo ooVar) {
        if (gm(ooVar)) {
            return;
        }
        ooVar.pcc("show_backup_endcard");
        lu.vj().pcc(new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.17
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                return ooVar;
            }
        });
    }

    public void pcc(final long j, final long j2) {
        final long j3 = j2 - j;
        pcc("general_label", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                int i = !jr.sf.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("general_label").kj(String.valueOf(j3)).sf(jSONObject.toString());
            }
        });
    }

    public static void sf() {
        rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("showFailLog") { // from class: com.bytedance.sdk.openadsdk.dax.oo.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    oo.pcc().pcc("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    lo.gm("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public void pcc(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        pcc(str, false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(str).sf(jSONObject.toString());
            }
        });
    }

    public void gm() {
        pcc("blind_mode_status", true, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.5
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("blind_mode_status");
            }
        });
    }

    public void pcc(final JSONObject jSONObject) {
        if (jSONObject == null) {
            lo.pcc("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
            lo.pcc("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            lo.pcc("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            pcc("ad_revenue", true, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.6
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                        jSONObject.put("uuid", hc.gm(lu.pcc()));
                        String str = "";
                        try {
                            if (hc.pcc(lu.pcc()) != null) {
                                str = hc.pcc(lu.pcc());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", str);
                        jSONObject.put(L6.H, "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("ad_revenue").sf(jSONObject.toString());
                }
            });
        }
    }

    public static void oo() {
        pcc("disk_log", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.7
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long pcc2 = oo.pcc(file2);
                        j += pcc2;
                        jSONObject.put(file2.getName(), pcc2);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("disk_log").sf(jSONObject.toString());
            }
        });
    }

    public static long pcc(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File file2 : file.listFiles()) {
            j += pcc(file2);
        }
        return j;
    }

    public static void pcc(String str, boolean z, sf sfVar) {
        pcc(str, z, -1, sfVar);
    }

    public static void pcc(String str, boolean z, int i, sf sfVar) {
        if (TextUtils.isEmpty(str)) {
            new Object[]{"type=", str, " disallowed for invalid value"};
        } else if (!gm.pcc(str, i)) {
            new Object[]{"type=", str, " disallowed by strategy"};
        } else {
            lu.vj().pcc(sfVar, z);
        }
    }

    public static void pcc(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = elapsedRealtime - j;
        final long j4 = elapsedRealtime - j2;
        final long j5 = j2 - j;
        pcc("ad_show_cost_time", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.9
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("ad_show_cost_time").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(int i, String str) {
        pcc(i, str, 0, (String) null);
    }

    public static void pcc(final int i, final String str, final int i2, final String str2) {
        pcc("ipv6_req", false, new sf<com.bytedance.sdk.openadsdk.dax.pcc.gm>() { // from class: com.bytedance.sdk.openadsdk.dax.oo.10
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 != -1) {
                    str3 = "start";
                } else {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = U3.g.e;
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("ipv6_req").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(final String str, final boolean z) {
        pcc("img_error_param", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.11
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("msg", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("img_error_param").sf(jSONObject.toString());
            }
        });
    }

    public static void pcc(final boolean z) {
        pcc("web_container_reuse", false, new sf() { // from class: com.bytedance.sdk.openadsdk.dax.oo.12
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z ? 1 : 0);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("web_container_reuse").sf(jSONObject.toString());
            }
        });
    }
}
