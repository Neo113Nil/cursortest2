package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pcc.gm;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.ironsource.Te;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gbb extends com.bytedance.sdk.component.pcc.gm<JSONObject, JSONObject> {
    private final WeakReference<mu> pcc;

    public gbb(mu muVar) {
        this.pcc = new WeakReference<>(muVar);
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, final mu muVar) {
        jrVar.pcc("request", new gm.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.1
            @Override // com.bytedance.sdk.component.pcc.gm.sf
            public com.bytedance.sdk.component.pcc.gm pcc() {
                return new gbb(mu.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.pcc.gm
    public void pcc(JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu muVar = this.pcc.get();
        final JSONObject jSONObject2 = new JSONObject();
        if (muVar == null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("net_code", 10001);
            jSONObject3.put("msg", "ttAndroidObject is null");
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
            jSONObject2.put("data", jSONObject3);
            pcc((gbb) jSONObject2);
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, 10001, "ttAndroidObject is null", null, null);
            return;
        }
        if (jSONObject == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("net_code", 10001);
            jSONObject4.put("msg", "params is null");
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
            jSONObject2.put("data", jSONObject4);
            pcc((gbb) jSONObject2);
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, 10001, "params is null", null, null);
            return;
        }
        if (!jSONObject.has("url") || !jSONObject.has("method")) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("net_code", 10001);
            jSONObject5.put("msg", "url or method is empty");
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
            jSONObject2.put("data", jSONObject5);
            pcc((gbb) jSONObject2);
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, 10001, "url or method is empty", null, null);
            return;
        }
        pcc(jSONObject, new com.bytedance.sdk.openadsdk.hc.wh() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.3
            @Override // com.bytedance.sdk.openadsdk.hc.wh
            public void pcc(int i, int i2, String str, JSONObject jSONObject6, Object obj, int i3) {
                try {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("net_code", i2);
                    if (str != null && !str.isEmpty()) {
                        jSONObject7.put("msg", str);
                    }
                    jSONObject7.put("header", jSONObject6);
                    if (obj != null) {
                        jSONObject7.put(Te.n, obj);
                        jSONObject7.put("decode", i3);
                    }
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
                    jSONObject2.put("data", jSONObject7);
                    gbb.this.pcc((gbb) jSONObject2);
                    new StringBuilder("onRequestAdSuccess: ").append(obj);
                } catch (Exception unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.hc.wh
            public void pcc(int i, int i2, String str) {
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("net_code", i2);
                    jSONObject6.put("msg", str);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
                    jSONObject2.put("data", jSONObject6);
                    gbb.this.pcc((gbb) jSONObject2);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|3|(2:5|(9:7|8|(1:12)|13|14|15|(2:20|(2:28|(2:30|31)(2:32|(2:34|35)(2:36|(2:38|39)(2:40|41))))(2:25|26))|42|43))(1:47)|46|8|(2:10|12)|13|14|15|(5:17|20|(0)|28|(0)(0))|42|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        r0 = "param is null";
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:3:0x0005, B:5:0x0027, B:7:0x0033, B:8:0x003f, B:10:0x004e, B:12:0x0054, B:15:0x0064, B:17:0x006a, B:20:0x0072, B:23:0x007a, B:25:0x007e, B:28:0x008d, B:30:0x0099, B:32:0x00a8, B:34:0x00b0, B:36:0x00b8, B:38:0x00c0, B:40:0x00c8, B:42:0x00df), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:3:0x0005, B:5:0x0027, B:7:0x0033, B:8:0x003f, B:10:0x004e, B:12:0x0054, B:15:0x0064, B:17:0x006a, B:20:0x0072, B:23:0x007a, B:25:0x007e, B:28:0x008d, B:30:0x0099, B:32:0x00a8, B:34:0x00b0, B:36:0x00b8, B:38:0x00c0, B:40:0x00c8, B:42:0x00df), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.hc.wh whVar) {
        JSONArray jSONArray;
        Boolean bool;
        List<String> arrayList;
        try {
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("method");
            Object opt = jSONObject.opt("bodyParams");
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
            Boolean bool2 = Boolean.TRUE;
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("fallbackUrls");
                if (optJSONObject.has("encrypt")) {
                    bool = Boolean.valueOf(optJSONObject.optBoolean("encrypt"));
                    Map<String, String> pcc = pcc(optJSONObject2, bool.booleanValue());
                    arrayList = new ArrayList<>();
                    if (jSONArray != null && jSONArray.length() > 0) {
                        arrayList = pcc(jSONArray);
                    }
                    String str = new URL(optString).getPath();
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if (!bool.booleanValue() && opt != null && !(opt instanceof JSONObject)) {
                            whVar.pcc(0, 10001, "bodyParams must be JSONObject when encrypt is true");
                            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, 10001, "bodyParams must be JSONObject when encrypt is true", str, arrayList);
                            return;
                        }
                        if ("https".equalsIgnoreCase(sf(optString))) {
                            whVar.pcc(0, 10001, "non-https url is not allowed");
                            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, 10001, "non-https url is not allowed", str, arrayList);
                            return;
                        } else if ("GET".equalsIgnoreCase(optString2)) {
                            pcc(optString, pcc, arrayList, str, bool, whVar);
                            return;
                        } else {
                            if ("POST".equalsIgnoreCase(optString2)) {
                                pcc(optString, pcc, arrayList, opt, bool, str, whVar);
                                return;
                            }
                            String concat = "unsupported method: ".concat(String.valueOf(optString2));
                            whVar.pcc(0, 10001, concat);
                            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, 10001, concat, str, arrayList);
                            return;
                        }
                    }
                    whVar.pcc(0, 10001, "null url or method");
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, 10001, "null url or method", str, arrayList);
                }
            } else {
                jSONArray = null;
            }
            bool = bool2;
            Map<String, String> pcc2 = pcc(optJSONObject2, bool.booleanValue());
            arrayList = new ArrayList<>();
            if (jSONArray != null) {
                arrayList = pcc(jSONArray);
            }
            String str2 = new URL(optString).getPath();
            if (!TextUtils.isEmpty(optString)) {
                if (!bool.booleanValue()) {
                }
                if ("https".equalsIgnoreCase(sf(optString))) {
                }
            }
            whVar.pcc(0, 10001, "null url or method");
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, 10001, "null url or method", str2, arrayList);
        } catch (Exception e) {
            try {
                whVar.pcc(0, 10001, e.getMessage());
            } catch (JSONException e2) {
                com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, 10001, "JSONException: " + e2.getMessage(), null, null);
            }
        }
    }

    private Map<String, String> pcc(JSONObject jSONObject, boolean z) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    String optString = jSONObject.optString(next, "");
                    if (!TextUtils.isEmpty(optString)) {
                        hashMap.put(next, optString);
                    }
                }
            }
        }
        if (z && !hashMap.containsKey("x-pgli18n")) {
            hashMap.put("x-pgli18n", "4");
        }
        return hashMap;
    }

    private List<String> pcc(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if ("https".equalsIgnoreCase(sf(jSONArray.optString(i)))) {
                    arrayList.add(jSONArray.optString(i));
                }
            }
        }
        return arrayList;
    }

    public String sf(String str) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme != null) {
                return scheme.toLowerCase();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject pcc(JSONObject jSONObject) {
        return yt.pcc(PangleEncryptConstant.CryptDataScene.JSB_REQUEST, jSONObject);
    }

    private Pair<Boolean, JSONObject> sf(JSONObject jSONObject) {
        JSONObject jSONObject2;
        boolean z;
        if (jSONObject == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (!jSONObject.has("cypher") || !jSONObject.has("message")) {
            return new Pair<>(Boolean.FALSE, jSONObject);
        }
        String pcc = yt.pcc(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
        if (!TextUtils.isEmpty(pcc)) {
            try {
                jSONObject2 = new JSONObject(pcc);
                z = true;
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, -3, "decryptBody error" + e.getMessage(), null, null);
            }
            return new Pair<>(Boolean.valueOf(z), jSONObject2);
        }
        jSONObject2 = jSONObject;
        z = false;
        return new Pair<>(Boolean.valueOf(z), jSONObject2);
    }

    private void pcc(final String str, Map<String, String> map, final List<String> list, final String str2, final Boolean bool, final com.bytedance.sdk.openadsdk.hc.wh whVar) {
        com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
        pcc(gm, "jsb_request", str2);
        gm.gm(str);
        if (map != null && !map.isEmpty()) {
            gm.oo(map);
        }
        if (com.bytedance.sdk.openadsdk.utils.sf.gm() && !list.isEmpty()) {
            gm.pcc(list);
            gm.pcc(60L, TimeUnit.SECONDS);
        }
        gm.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.4
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                gbb.this.pcc(sfVar, str2, bool, whVar);
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                gbb.this.pcc(iOException.getMessage(), str2, whVar);
                com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", str, iOException.hashCode(), iOException.getMessage(), str2, list);
            }
        });
    }

    private void pcc(final String str, Map<String, String> map, final List<String> list, Object obj, final Boolean bool, final String str2, final com.bytedance.sdk.openadsdk.hc.wh whVar) {
        JSONObject jSONObject;
        try {
            com.bytedance.sdk.component.qf.sf.oo sf = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
            pcc(sf, "jsb_request", str2);
            sf.gm(str);
            if (map != null && !map.isEmpty()) {
                sf.oo(map);
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    if (bool.booleanValue()) {
                        jSONObject = pcc((JSONObject) obj);
                    } else {
                        jSONObject = (JSONObject) obj;
                    }
                    sf.pcc(jSONObject);
                } else {
                    sf.pcc(new JSONObject(obj.toString()));
                }
            } else {
                sf.pcc(new JSONObject());
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.gm() && !list.isEmpty()) {
                sf.pcc(list);
                sf.pcc(60L, TimeUnit.SECONDS);
            }
            sf.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.5
                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                    gbb.this.pcc(sfVar, str2, bool, whVar);
                }

                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                    gbb.this.pcc(iOException.getMessage(), str2, whVar);
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", str, iOException.hashCode(), iOException.getMessage(), str2, list);
                }
            });
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", str, 10001, "executePostRequest error" + e.getMessage(), str2, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e A[Catch: Exception -> 0x00c7, TryCatch #2 {Exception -> 0x00c7, blocks: (B:12:0x0004, B:14:0x000a, B:16:0x0019, B:17:0x0021, B:19:0x0027, B:24:0x003d, B:30:0x0041, B:33:0x0049, B:34:0x004f, B:36:0x005e, B:39:0x0064, B:41:0x0069, B:43:0x0077, B:45:0x007b, B:51:0x0089, B:56:0x0098, B:58:0x009e, B:59:0x00a6, B:3:0x00ad, B:5:0x00b3, B:7:0x00bd, B:8:0x00c1), top: B:11:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(com.bytedance.sdk.component.qf.sf sfVar, final String str, Boolean bool, com.bytedance.sdk.openadsdk.hc.wh whVar) {
        String str2;
        if (sfVar != null) {
            try {
                if (sfVar.wh()) {
                    int pcc = sfVar.pcc();
                    Map<String, String> gm = sfVar.gm();
                    JSONObject jSONObject = new JSONObject();
                    if (gm != null) {
                        for (Map.Entry<String, String> entry : gm.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (key != null && value != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    String oo = sfVar.oo() != null ? sfVar.oo() : "";
                    JSONObject jSONObject2 = null;
                    new Pair(Boolean.FALSE, null);
                    int i = -1;
                    if (!TextUtils.isEmpty(oo) && bool.booleanValue()) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(oo);
                            try {
                                Pair<Boolean, JSONObject> sf = sf(jSONObject3);
                                if (!((Boolean) sf.first).booleanValue() || sf.second == null) {
                                    jSONObject2 = jSONObject3;
                                } else {
                                    i = 4;
                                    r1 = 1;
                                    jSONObject2 = (JSONObject) sf.second;
                                }
                            } catch (JSONException e) {
                                e = e;
                                jSONObject2 = jSONObject3;
                                e.getMessage();
                                str2 = "body is not valid JSON";
                                int i2 = i;
                                if (r1 != 0) {
                                }
                                if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                                }
                                whVar.pcc(1, pcc, str2, jSONObject, r8, i2);
                                return;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    }
                    str2 = "";
                    int i22 = i;
                    Object obj = (r1 != 0 || jSONObject2 == null) ? oo : jSONObject2;
                    if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.6
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("jsb_request");
                                if (!TextUtils.isEmpty(str)) {
                                    pccVar.qf(str);
                                }
                                return pccVar;
                            }
                        });
                    }
                    whVar.pcc(1, pcc, str2, jSONObject, obj, i22);
                    return;
                }
            } catch (Exception e3) {
                if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.8
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("jsb_request");
                            if (!TextUtils.isEmpty(str)) {
                                pccVar.qf(str);
                            }
                            return pccVar;
                        }
                    });
                }
                try {
                    whVar.pcc(1, 10001, e3.getMessage());
                    return;
                } catch (JSONException e4) {
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, 10001, "JSONException: " + e4.getMessage(), null, null);
                    return;
                }
            }
        }
        if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.7
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("jsb_request");
                    if (!TextUtils.isEmpty(str)) {
                        pccVar.qf(str);
                    }
                    return pccVar;
                }
            });
        }
        whVar.pcc(1, sfVar != null ? sfVar.pcc() : 0, "HTTP error : response is empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, final String str2, com.bytedance.sdk.openadsdk.hc.wh whVar) {
        if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.9
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("jsb_request");
                    if (!TextUtils.isEmpty(str2)) {
                        pccVar.qf(str2);
                    }
                    return pccVar;
                }
            });
        }
        try {
            whVar.pcc(1, 10001, str);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, 10001, "JSONException: " + e.getMessage(), null, null);
        }
    }

    private void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, final String str, final String str2) {
        if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.10
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf(str);
                    if (!TextUtils.isEmpty(str2)) {
                        pccVar.qf(str2);
                    }
                    return pccVar;
                }
            });
        } else {
            gmVar.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf(str);
                    if (!TextUtils.isEmpty(str2)) {
                        pccVar.qf(str2);
                    }
                    return pccVar;
                }
            });
        }
    }
}
