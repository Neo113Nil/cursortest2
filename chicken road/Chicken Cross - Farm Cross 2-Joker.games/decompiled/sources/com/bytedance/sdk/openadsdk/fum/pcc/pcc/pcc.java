package com.bytedance.sdk.openadsdk.fum.pcc.pcc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.core.vj;
import com.bytedance.sdk.openadsdk.oo.gbb;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    public static boolean pcc(Context context, String str, of ofVar, int i, Map<String, Object> map, boolean z) {
        String pcc = kun.pcc(ofVar);
        vj.pcc(ofVar, pcc, 1, null);
        Intent pcc2 = pcc(context, str, ofVar);
        if (TextUtils.isEmpty(str) || pcc2 == null) {
            vj.pcc(ofVar, pcc, -2, ofVar.dt().oo());
            return false;
        }
        boolean oo = kun.oo(context);
        if (map == null) {
            map = new HashMap<>();
        }
        if (ofVar != null && ofVar.fg() == 0) {
            map.put("auto_click", Boolean.valueOf(!ofVar.gpj()));
        }
        map.put("can_query_install", Integer.valueOf(oo ? 1 : 0));
        map.put("url", str);
        if (oo) {
            kun.sf pcc3 = kun.pcc(context, pcc2);
            if (pcc3.sf > 0) {
                try {
                    pcc(context, ofVar, map);
                    map.put("matched_count", Integer.valueOf(pcc3.sf));
                    if (pcc3.pcc != null) {
                        pcc2.setComponent(pcc3.pcc);
                    }
                } catch (Throwable th) {
                    lo.gm("DeepLinkUtils", th.getMessage());
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(SDKConstants.PARAM_INTENT, pcc2.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                vj.pcc(ofVar, pcc, -3, jSONObject);
                return false;
            }
        }
        try {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, pcc, "open_url_app", map);
            context.startActivity(pcc2);
            gbb.pcc().pcc(map).pcc(ofVar, pcc);
            com.bytedance.sdk.openadsdk.oo.gm.pcc("dp_start_act_success", ofVar, pcc, map);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th2.getMessage());
                jSONObject2.put(SDKConstants.PARAM_INTENT, pcc2.toString());
                jSONObject2.put("can_query_install", oo ? 1 : 0);
            } catch (Exception unused2) {
            }
            vj.pcc(ofVar, pcc, -4, jSONObject2);
            if (oo) {
                rnn.pcc(context, ofVar.xy(), ofVar, i, pcc, z);
            }
            return false;
        }
    }

    private static Intent pcc(Context context, String str, of ofVar) {
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (ofVar != null && ofVar.gmi() != null && !TextUtils.isEmpty(ofVar.gmi().oo())) {
                intent.setPackage(ofVar.gmi().oo());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            lo.gm("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void pcc(Context context, of ofVar, Map<String, Object> map) {
        if (ofVar != null && ofVar.fg() == 0) {
            map.put("auto_click", Boolean.valueOf(!ofVar.gpj()));
        }
        map.put("can_query_install", Integer.valueOf(kun.oo(context) ? 1 : 0));
    }
}
