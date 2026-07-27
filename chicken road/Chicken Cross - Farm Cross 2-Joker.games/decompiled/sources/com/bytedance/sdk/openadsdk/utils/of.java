package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.net.HttpHeaders;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class of {
    public static final String[] gm = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    public static int pcc = Integer.MIN_VALUE;
    public static int sf = Integer.MIN_VALUE;

    public static String pcc() {
        if (pcc == Integer.MIN_VALUE) {
            pcc = com.bytedance.sdk.openadsdk.core.ork.vj();
        }
        if (pcc < 0) {
            pcc = 0;
        }
        String[] strArr = gm;
        try {
            return strArr[pcc % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.utils.of.pcc + 1;
        com.bytedance.sdk.openadsdk.utils.of.pcc = r2;
        com.bytedance.sdk.openadsdk.core.ork.pcc(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:16:0x0027, B:18:0x002f, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004c, B:28:0x0069, B:36:0x0024, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c A[Catch: all -> 0x0070, TryCatch #0 {, blocks: (B:16:0x0027, B:18:0x002f, B:22:0x0037, B:24:0x003d, B:25:0x0043, B:27:0x004c, B:28:0x0069, B:36:0x0024, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void pcc(String str) {
        int i;
        synchronized (of.class) {
            if (str == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                try {
                    String[] strArr = gm;
                    if (i2 >= strArr.length) {
                        break;
                    } else if (str.contains(strArr[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                } finally {
                    if (!str.contains("/api/ad/union/sdk/settings/")) {
                    }
                    if (sf == Integer.MIN_VALUE) {
                    }
                    i = sf + 1;
                    sf = i;
                    if (i >= 3) {
                    }
                    com.bytedance.sdk.openadsdk.core.ork.sf(sf);
                }
            }
            if (!str.contains("/api/ad/union/sdk/settings/") || str.contains("/api/ad/union/sdk/strategies/adn")) {
                if (sf == Integer.MIN_VALUE) {
                    sf = com.bytedance.sdk.openadsdk.core.ork.wh();
                }
                i = sf + 1;
                sf = i;
                if (i >= 3) {
                    final String kun = com.bytedance.sdk.openadsdk.core.settings.vh.sf().kun();
                    final int i3 = sf;
                    com.bytedance.sdk.openadsdk.core.settings.vh.sf().jy();
                    sf = 0;
                    com.bytedance.sdk.openadsdk.dax.oo.pcc("clear_domain", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.utils.of.1
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(U3.j.D, kun);
                                jSONObject.put("times", i3);
                            } catch (Exception unused) {
                            }
                            return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("clear_domain").sf(jSONObject.toString());
                        }
                    });
                }
                com.bytedance.sdk.openadsdk.core.ork.sf(sf);
            }
        }
    }

    public static synchronized void sf() {
        synchronized (of.class) {
            if (sf == 0) {
                return;
            }
            sf = 0;
            com.bytedance.sdk.openadsdk.core.ork.sf(0);
        }
    }

    public static void pcc(com.bytedance.sdk.component.vy.qf qfVar, String str) {
        if (TextUtils.isEmpty(str) || qfVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("pag_additional_headers", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            HashMap hashMap = new HashMap();
            boolean z = false;
            if (jSONObject != null) {
                z = jSONObject.optBoolean(a.k, false);
                JSONObject optJSONObject = jSONObject.optJSONObject("header_value");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = optJSONObject.optString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                            hashMap.put(next, optString);
                        }
                    }
                }
            }
            if (!z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
                qfVar.pcc(str, hashMap2);
            } else if (!hashMap.isEmpty()) {
                qfVar.pcc(str, hashMap);
            } else {
                qfVar.a_(str);
            }
        } catch (Throwable unused) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
            qfVar.pcc(str, hashMap3);
        }
    }
}
