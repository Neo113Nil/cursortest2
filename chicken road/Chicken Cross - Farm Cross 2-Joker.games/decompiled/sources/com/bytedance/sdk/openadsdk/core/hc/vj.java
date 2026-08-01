package com.bytedance.sdk.openadsdk.core.hc;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.L6;
import com.ironsource.U3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vj {
    private static String pcc = "";

    public static boolean pcc(int i) {
        return i == 10 || i == 9 || i == 11;
    }

    public static JSONObject pcc(of ofVar, String str) {
        JSONObject hc = ofVar.hc(false);
        try {
            hc.put("show_dislike", ofVar.dk());
            hc.put("language", hc.sf());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String kj = ork.sf().kj();
                int vy = ork.sf().vy();
                jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, kj);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(vy)));
                hc.put("open_app_info", jSONObject);
            }
            hc.put(L6.F, U3.d);
            JSONArray gm = gm(ofVar);
            if (gm != null) {
                hc.put("dpa_data", gm);
            }
        } catch (Throwable th) {
            lo.gm("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
        }
        return hc;
    }

    private static JSONArray gm(of ofVar) {
        try {
            of.pcc kx = ofVar.kx();
            if (kx == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(kx.vy());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt(FirebaseAnalytics.Param.DISCOUNT, Double.valueOf(jSONObject.optDouble(FirebaseAnalytics.Param.DISCOUNT, 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray optJSONArray = jSONObject.optJSONArray("dpa_images");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                jSONObject2.putOpt("image", optJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", ofVar.bgf());
            JSONArray jSONArray = new JSONArray();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (optJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i);
                        jSONObject3.put("button_text", ofVar.bgf());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean pcc(of ofVar) {
        return ofVar != null && ofVar.rt() == 7;
    }

    public static String pcc() {
        return pcc;
    }

    public static boolean sf(of ofVar) {
        return ofVar != null && ofVar.rt() == 10;
    }

    public static JSONObject pcc(of ofVar, com.bytedance.sdk.openadsdk.core.hc.qf.gm gmVar) {
        JSONObject jSONObject;
        gmVar.pcc("ad");
        String str = "";
        pcc = "";
        JSONObject jSONObject2 = null;
        try {
            of.pcc kx = ofVar.kx();
            if (kx != null) {
                str = kx.jr();
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(kx.gbb()) && !TextUtils.isEmpty(kx.oo())) {
                    str = com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc("ad", kx.oo(), kx.gbb());
                }
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject = new JSONObject(str);
                    try {
                        try {
                            pcc = "getTemplate success";
                            gmVar.sf("local");
                            return jSONObject;
                        } catch (JSONException unused) {
                            String concat = "parse json exception data is ".concat(String.valueOf(str));
                            pcc = concat;
                            gmVar.pcc(2, concat, "local");
                            return null;
                        }
                    } catch (Throwable th) {
                        jSONObject2 = jSONObject;
                        th = th;
                        String str2 = "get template error " + th.getMessage();
                        pcc = str2;
                        gmVar.pcc(2, str2, "local");
                        return jSONObject2;
                    }
                } catch (JSONException unused2) {
                    jSONObject = null;
                }
            } else {
                String str3 = "local data is null id is " + kx.oo() + " md5 is " + kx.gbb();
                pcc = str3;
                gmVar.pcc(3, str3, "net");
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
