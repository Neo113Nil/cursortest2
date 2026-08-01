package com.bytedance.sdk.openadsdk.core.ork;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class jr {
    public static void pcc(final com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("preloadStaticRes") { // from class: com.bytedance.sdk.openadsdk.core.ork.jr.1
            @Override // java.lang.Runnable
            public void run() {
                zti uae;
                zti.pcc wh;
                com.bytedance.sdk.openadsdk.core.model.of ofVar2 = ofVar;
                if (ofVar2 == null || (uae = ofVar2.uae()) == null || (wh = uae.wh()) == null) {
                    return;
                }
                String gpj = com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj();
                jr.pcc(ofVar, wh.pcc(), gpj);
                jr.gm(wh.sf(), gpj);
                jr.oo(wh.gm(), gpj);
            }
        });
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String pcc = com.bytedance.sdk.openadsdk.core.hc.oo.pcc(str, optString);
                String pcc2 = com.bytedance.sdk.component.utils.vj.pcc(pcc);
                InputStream pcc3 = com.bytedance.sdk.openadsdk.ork.oo.pcc(pcc, pcc2);
                if (pcc3 != null) {
                    try {
                        pcc3.close();
                    } catch (IOException unused) {
                    }
                } else {
                    com.bytedance.sdk.openadsdk.ork.oo.pcc(pcc).gm(1).pcc(pcc2).pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, pcc, new com.bytedance.sdk.component.vj.dax() { // from class: com.bytedance.sdk.openadsdk.core.ork.jr.2
                        @Override // com.bytedance.sdk.component.vj.dax
                        public void pcc(int i2, String str2, Throwable th) {
                        }

                        @Override // com.bytedance.sdk.component.vj.dax
                        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
                            vhVar.pcc();
                        }
                    }), 4);
                }
            }
        }
    }

    public static boolean sf(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        zti uae;
        return (ofVar == null || (uae = ofVar.uae()) == null || uae.wh() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String pcc = com.bytedance.sdk.openadsdk.core.hc.oo.pcc(str, optString);
                File pcc2 = pcc(pcc);
                if (pcc2 != null && pcc2.exists() && pcc2.length() > 0) {
                    return;
                } else {
                    gm(pcc);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oo(JSONArray jSONArray, String str) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String pcc = com.bytedance.sdk.openadsdk.core.hc.oo.pcc(str, optString);
                File pcc2 = pcc(pcc);
                if (pcc2 != null && pcc2.exists() && pcc2.length() > 0) {
                    return;
                } else {
                    gm(pcc);
                }
            }
        }
    }

    private static void gm(String str) {
        File pcc = pcc(str);
        if (pcc == null) {
            return;
        }
        File file = new File(pcc + ".tmp");
        com.bytedance.sdk.component.qf.sf.pcc oo = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().oo();
        oo.pcc(8);
        oo.sf("preloadStaticRes");
        oo.gm(str);
        oo.pcc(pcc.getParent(), pcc.getName());
        com.bytedance.sdk.component.qf.sf vj = oo.vj();
        if (vj != null && vj.wh() && vj.vj() != null && vj.vj().exists()) {
            com.bytedance.sdk.component.utils.lo.pcc("ExpressStaticResPreload", "downloadFile: success url=".concat(String.valueOf(str)));
            return;
        }
        if (pcc.exists()) {
            try {
                pcc.delete();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("ExpressStaticResPreload", th.getMessage());
            }
        }
        if (file.exists()) {
            try {
                file.delete();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.lo.gm("ExpressStaticResPreload", th2.getMessage());
            }
        }
    }

    public static File pcc(String str) {
        String pcc = com.bytedance.sdk.component.utils.vj.pcc(str);
        if (pcc == null) {
            return null;
        }
        String str2 = new File(CacheDirFactory.getRootDir()).getName() + "/express_static_res";
        new Object[]{"cachePath is:", str2, ", fileName is:", pcc};
        return new File(com.bytedance.sdk.component.utils.qf.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), str2), pcc);
    }

    public static InputStream sf(String str) {
        File pcc = pcc(str);
        if (pcc != null && pcc.exists() && pcc.length() > 0) {
            try {
                return new FileInputStream(pcc);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("ExpressStaticResPreload", th.getMessage());
            }
        }
        return null;
    }
}
