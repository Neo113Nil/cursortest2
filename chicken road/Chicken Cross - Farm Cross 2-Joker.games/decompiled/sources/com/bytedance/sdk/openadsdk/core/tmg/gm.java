package com.bytedance.sdk.openadsdk.core.tmg;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.vj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.Fc;
import com.ironsource.Y1;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private static boolean pcc = false;

    public static void pcc() {
        if (!pcc && lu.oo().se()) {
            sf.sf();
            pcc = sf.sf().gm();
        }
    }

    public static void pcc(String str) {
        if (lu.oo().se()) {
            sf.sf().pcc(str);
        }
    }

    public static void sf(String str) {
        if (TextUtils.isEmpty(str) || !lu.oo().se()) {
            return;
        }
        sf.sf().sf(str);
    }

    public static void sf() {
        if (lu.oo().se()) {
            sf.sf().pcc();
        }
    }

    public static void pcc(Map<String, Object> map) {
        if (lu.oo().se()) {
            sf.sf().pcc(map);
        }
    }

    public static void pcc(of ofVar, String str) {
        long j;
        long j2;
        long j3;
        Object obj;
        if (lu.oo().se()) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            hashMap.put("au_show", str);
            if (ofVar != null) {
                String qxv = ofVar.qxv();
                boolean isEmpty = TextUtils.isEmpty(qxv);
                String str2 = Y1.f;
                if (!isEmpty) {
                    hashMap.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, qxv);
                } else {
                    hashMap.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, Y1.f);
                }
                try {
                    long j4 = -1;
                    if (ofVar.zvx() != null) {
                        j = ofVar.zvx().optLong("ad_id", -1L);
                        j2 = ofVar.zvx().optLong("rit", -1L);
                        j3 = ofVar.zvx().optLong("ad_slot_type", -1L);
                        str2 = ofVar.zvx().optString("ad_type", Y1.f);
                    } else {
                        j = -1;
                        j2 = -1;
                        j3 = -1;
                    }
                    hashMap.put("ad_id", Long.valueOf(j));
                    hashMap.put("rit", Long.valueOf(j2));
                    hashMap.put("ad_slot_type", Long.valueOf(j3));
                    hashMap.put("ad_type", str2);
                    Map<String, Object> oa = ofVar.oa();
                    if (oa != null && (obj = oa.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j4 = Long.parseLong(obj.toString());
                    }
                    hashMap.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j4));
                    sf.sf().pcc(PglSSManager.REPORT_SCENE_ADSHOW, hashMap);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> pcc(String str, String str2) {
        if (lu.oo().se()) {
            return sf.sf().pcc(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static String gm() {
        if (lu.oo().se()) {
            return sf.sf().vj();
        }
        return "";
    }

    public static long oo() {
        if (lu.oo().se()) {
            return sf.sf().wh();
        }
        return 0L;
    }

    public static int vj() {
        if (lu.oo().se()) {
            return sf.sf().qf();
        }
        return 6;
    }

    public static void pcc(MotionEvent motionEvent) {
        if (lu.oo().se()) {
            sf.sf().pcc(motionEvent);
        }
    }

    public static void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (lu.oo().se()) {
                pcc();
                if (vj() == 0) {
                    jSONObject.put("sec_did", sf.sf().oo());
                    String pcc2 = vj.pcc(jSONObject.toString());
                    Map<String, String> pcc3 = sf.sf().pcc("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", pcc2 != null ? pcc2.getBytes() : new byte[0]);
                    if (pcc3 != null && pcc3.size() > 0) {
                        for (String str : pcc3.keySet()) {
                            jSONObject.put(str, pcc3.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", pcc2);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", sf.sf().wh());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(vj()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            lo.gm("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", Fc.e);
            } catch (JSONException unused) {
            }
        }
    }

    public static String wh() {
        if (lu.oo().se()) {
            return sf.sf().oo();
        }
        return null;
    }
}
