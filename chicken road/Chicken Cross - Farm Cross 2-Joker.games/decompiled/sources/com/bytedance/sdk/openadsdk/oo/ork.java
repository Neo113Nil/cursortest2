package com.bytedance.sdk.openadsdk.oo;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ork {
    public static void pcc(of ofVar, String str, String str2, String str3) {
        pcc(ofVar, str, str2, str3, null);
    }

    public static void pcc(of ofVar, String str, String str2, String str3, JSONObject jSONObject) {
        pcc(ofVar, str, str2, str3, jSONObject, 0);
    }

    public static void pcc(final of ofVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i) {
        if (ofVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        gm.pcc(System.currentTimeMillis(), ofVar, str2, str, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.ork.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                if (jSONObject != null) {
                    long nac = ofVar.nac();
                    if (nac < 0) {
                        long vy = ofVar.vy();
                        if (vy > 0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime() - vy;
                            if (elapsedRealtime > 0) {
                                nac = elapsedRealtime;
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(IronSourceConstants.EVENTS_DURATION, nac);
                    } catch (Exception e) {
                        lo.gm(e.getMessage(), new Object[0]);
                    }
                    return jSONObject2;
                }
                return super.sf();
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                return ork.sf(ofVar, str3, i, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject sf(of ofVar, String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            int i2 = 1;
            jSONObject2.put("ad_show_order", i + 1);
            jSONObject2.put("interaction_method", ofVar.kz());
            jSONObject2.put("real_interaction_method", ofVar.bg());
            jSONObject2.put("give_up_reward", ofVar.dax() ? 1 : 2);
            if (!ofVar.rj()) {
                i2 = 2;
            }
            jSONObject2.put("has_reward", i2);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                        new StringBuilder("Failed to merge key: ").append(next);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    public static void pcc(String str, boolean z, boolean z2, of ofVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 1;
            jSONObject.put("has_close_invoke", z ? 1 : 2);
            if (!z2) {
                i = 2;
            }
            jSONObject.put("has_show_invoke", i);
            pcc(ofVar, str, ofVar != null ? ofVar.vj() : null, null, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static void pcc(of ofVar, String str, int i) {
        pcc(ofVar, "close".equals(str) ? "close_listen_empty" : "show_listen_empty", ofVar != null ? ofVar.vj() : null, null, null, i);
    }
}
