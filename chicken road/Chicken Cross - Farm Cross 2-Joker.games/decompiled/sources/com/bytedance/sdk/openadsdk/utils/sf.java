package com.bytedance.sdk.openadsdk.utils;

import com.ironsource.mediationsdk.metadata.a;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    private static Boolean gm;
    private static volatile com.bytedance.sdk.component.qf.gm.vj kj;
    private static Boolean oo;
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.of> pcc;
    private static Boolean qf;
    private static Boolean sf;
    private static Boolean vj;
    private static Boolean wh;

    public static boolean pcc() {
        if (sf == null) {
            try {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.yt.vj.pcc("adapt_decor_size", 1) != 1) {
                    z = false;
                }
                sf = Boolean.valueOf(z);
            } catch (Throwable unused) {
                sf = Boolean.FALSE;
            }
        }
        new StringBuilder("isAdapterSize: ").append(sf);
        return sf.booleanValue();
    }

    public static boolean sf() {
        if (gm == null) {
            try {
                gm = Boolean.valueOf(com.bytedance.sdk.openadsdk.yt.vj.pcc("stability_sinking", 0) == 1);
            } catch (Throwable unused) {
                gm = Boolean.FALSE;
            }
        }
        new StringBuilder("isBusStabilityMonitorEnabled: ").append(gm);
        return gm.booleanValue();
    }

    public static boolean gm() {
        try {
            if (oo == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.yt.vj.pcc("net_opt_multiple_domain_retry", 0) != 1) {
                    z = false;
                }
                oo = Boolean.valueOf(z);
            }
            return oo.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean oo() {
        try {
            if (vj == null) {
                boolean z = true;
                if (com.bytedance.sdk.openadsdk.yt.vj.pcc("iv_rv_load_show_new", 0) != 1) {
                    z = false;
                }
                vj = Boolean.valueOf(z);
            }
            return vj.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean vj() {
        try {
            if (wh == null) {
                wh = Boolean.valueOf(com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_redirect_monitor", false));
            }
            return wh.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean wh() {
        try {
            if (qf == null) {
                qf = Boolean.valueOf(com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_optimize", false));
            }
            return qf.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.of qf() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.of> softReference = pcc;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            return;
        }
        pcc = new SoftReference<>(ofVar);
    }

    public static com.bytedance.sdk.component.qf.gm.vj kj() {
        if (kj != null) {
            return kj;
        }
        com.bytedance.sdk.component.qf.gm.vj vjVar = new com.bytedance.sdk.component.qf.gm.vj();
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("net_multi_domain_config", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            if (jSONObject != null) {
                vjVar.pcc = jSONObject.optInt(a.k, 0) == 1;
                vjVar.sf = jSONObject.optInt("fail_count", 10);
                vjVar.gm = jSONObject.optLong("interval", 1800000L);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        kj = vjVar;
        new StringBuilder("NetDomainConfig initialized: ").append(kj);
        return kj;
    }
}
