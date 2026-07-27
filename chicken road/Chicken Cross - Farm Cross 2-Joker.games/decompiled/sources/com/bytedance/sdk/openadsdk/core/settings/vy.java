package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.tmg;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.core.zti;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.of;
import com.bytedance.sdk.openadsdk.utils.ye;
import com.ironsource.L6;
import com.ironsource.U3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vy extends com.bytedance.sdk.component.kj.sf.gm {
    private final Set<vj> gm;
    private final pcc pcc;
    private final kj sf;

    public interface pcc {
        void pcc(boolean z);
    }

    public vy(pcc pccVar, kj kjVar, vj... vjVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.gm = hashSet;
        this.pcc = pccVar;
        this.sf = kjVar;
        hashSet.addAll(Arrays.asList(vjVarArr));
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int pcc2 = jsj.pcc(lu.pcc(), 0L);
        if (pcc2 == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.pcc.pcc(false);
            return;
        }
        JSONObject pcc3 = pcc(pcc2);
        com.bytedance.sdk.component.qf.sf.oo sf = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
        try {
            sf.gm(com.bytedance.sdk.openadsdk.vy.oo.pcc(sf, kun.pcc("/api/ad/union/sdk/settings/", false, true)));
            sf.sf("User-Agent", kun.oo());
        } catch (Exception unused) {
        }
        String jSONObject = sf(pcc3).toString();
        if (lu.oo().ptr() && zti.pcc().oo() == 1) {
            kun.pcc("Pangle_Debug_Mode", jSONObject, lu.pcc());
        }
        sf.pcc(jSONObject, lu.oo().dax());
        sf.pcc(6);
        sf.sf("setting");
        if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            sf.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.settings.vy.1
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("settings_fetch");
                    return pccVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.settings.vy.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("settings_fetch");
                    return pccVar;
                }
            });
        }
        sf.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.settings.vy.3
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                JSONObject jSONObject2;
                int pcc4 = sfVar.pcc();
                String oo = sfVar.oo();
                if (lu.oo().ptr() && zti.pcc().oo() == 1) {
                    kun.pcc("Pangle_Debug_Mode", oo, lu.pcc());
                }
                if (sfVar.wh() && !TextUtils.isEmpty(oo)) {
                    try {
                        jSONObject2 = new JSONObject(oo);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        String pcc5 = yt.pcc(jSONObject2.optInt("cypher", -1), jSONObject2.optString("message"));
                        if (!TextUtils.isEmpty(pcc5)) {
                            try {
                                jSONObject2 = new JSONObject(pcc5);
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            vy.this.pcc(pcc5, sfVar.gm());
                        } catch (Throwable unused4) {
                        }
                        try {
                            vy.this.pcc(jSONObject2);
                            lu.oo().pcc(System.currentTimeMillis());
                            if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                                com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.settings.vy.3.1
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                        pccVar.sf("settings_fetch");
                                        return pccVar;
                                    }
                                });
                            }
                            of.sf();
                        } catch (Throwable unused5) {
                        }
                        vy.this.pcc.pcc(true);
                        return;
                    }
                } else if (gmVar != null) {
                    of.pcc(gmVar.wh());
                }
                if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.settings.vy.3.2
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("settings_fetch");
                            return pccVar;
                        }
                    });
                }
                if (!sfVar.wh()) {
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("settings_fetch", gmVar.wh(), pcc4, sfVar.sf(), null, null);
                }
                vy.this.pcc.pcc(false);
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                vy.this.pcc.pcc(false);
                if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.settings.vy.3.3
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("settings_fetch");
                            return pccVar;
                        }
                    });
                }
                if (gmVar != null) {
                    of.pcc(gmVar.wh());
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("settings_fetch", gmVar.wh(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                }
            }
        });
        tmg.sf(hc.pcc(lu.pcc()));
        DeviceUtils.tmg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        hashMap.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) hashMap.get("active-control");
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    String str3 = (String) hashMap.get("ts");
                    if (str3 != null) {
                        long parseLong = Long.parseLong(str3);
                        String str4 = (String) hashMap.get("pst");
                        String pcc2 = com.bykv.vk.openvk.pcc.pcc.pcc.qf.sf.pcc(str + parseInt + parseLong);
                        if (pcc2 != null) {
                            if (pcc2.equalsIgnoreCase(str4)) {
                                i = parseInt;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        qf.pcc(i);
    }

    public static JSONObject pcc(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            vh oo = lu.oo();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", kun.yt());
            com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(jSONObject);
            if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vh()) {
                jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.ork.sf().ork());
            }
            if (oo.mk("mcc")) {
                jSONObject.put("mcc", ye.sf());
            }
            Context pcc2 = lu.pcc();
            jSONObject.put("conn_type", kun.qf(i));
            jSONObject.put(L6.F, 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", hc.sf());
            jSONObject.put("time_zone", kun.tsz());
            jSONObject.put("package_name", kun.wh());
            jSONObject.put(U3.i.L, kun.pcc() ? 1 : 2);
            jSONObject.put("app_version", kun.kj());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", hc.gm(pcc2));
            String oo2 = com.bytedance.sdk.openadsdk.core.ork.sf().oo();
            if (oo2 != null) {
                jSONObject.put("app_id", oo2);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", currentTimeMillis);
            String str = "";
            if (oo2 != null) {
                str = oo2.concat(String.valueOf(currentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.vj.pcc(str));
            jSONObject.put("tcstring", vh.sf(pcc2));
            jSONObject.put("tcf_gdpr", vh.pcc(pcc2));
            jSONObject.put("lmt", DeviceUtils.gm());
            jSONObject.put("locale_language", DeviceUtils.oo());
            jSONObject.put("channel", U3.i.Z);
            JSONObject wh = oo.wh();
            if (wh != null) {
                jSONObject.put("digest", wh);
            }
            jSONObject.put("data_time", oo.qf());
            jSONObject.put("app_set_id_scope", oo.sf());
            jSONObject.put("app_set_id", oo.gm());
            jSONObject.put("installed_source", oo.oo());
            jSONObject.put("did", hc.pcc(lu.pcc()));
            jSONObject.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            String qf = com.bytedance.sdk.openadsdk.core.ork.sf().qf();
            if (!TextUtils.isEmpty(qf)) {
                jSONObject.put("mediation", qf);
            }
            jSONObject.put("device", DeviceUtils.pcc(pcc2, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.ork.sf().tz());
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.vh.sf.pcc().kj());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private JSONObject sf(JSONObject jSONObject) {
        return yt.pcc(PangleEncryptConstant.CryptDataScene.SETTINGS, jSONObject);
    }

    public boolean pcc(JSONObject jSONObject) {
        this.sf.pcc(jSONObject);
        for (vj vjVar : this.gm) {
            if (vjVar != null) {
                vjVar.pcc(jSONObject);
            }
        }
        return this.sf.gm;
    }
}
