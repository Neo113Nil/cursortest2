package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gpj extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("sendStatsLog", "callBackToPublisher", "trackVideoStateWithOmSdk", "commitDislike", "responseHeartBeat", "trackUrl", "postVideoState", "renderLandingPage", "changeLpClickable", "closeLandingPage"));
    private final mu gm;
    private of oo;
    private boolean sf = false;

    public gpj(mu muVar, of ofVar) {
        this.gm = muVar;
        this.oo = ofVar;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar, of ofVar) {
        jrVar.pcc(pcc, new gpj(muVar, ofVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        return r6;
     */
    @Override // com.bytedance.sdk.component.pcc.oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.hashCode();
        switch (str) {
            case "responseHeartBeat":
                Log.d("BaseManagerBundle", "invoke: ");
                this.gm.fum();
                jSONObject2.put("success", true);
                break;
            case "commitDislike":
                vj(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "closeLandingPage":
                sf(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "renderLandingPage":
                gm(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "trackVideoStateWithOmSdk":
                qf(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "callBackToPublisher":
                kj(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "changeLpClickable":
                pcc(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "postVideoState":
                oo(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "trackUrl":
                wh(jSONObject);
                break;
            case "sendStatsLog":
                vy(jSONObject);
                jSONObject2.put("success", true);
                break;
        }
    }

    private void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("lpClickable", true);
        this.gm.pcc(jSONObject.optString(SDKConstants.PARAM_SESSION_ID), optBoolean);
    }

    private void sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.gm.qf(jSONObject.optString("url"));
    }

    private void gm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.gm.pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.oo.sf(jSONObject));
    }

    private void oo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        float optDouble = (float) jSONObject.optDouble("percent");
        jSONObject.optInt("current");
        jSONObject.optInt(IronSourceConstants.EVENTS_DURATION);
        jSONObject.optInt("play_count");
        if (this.sf || optDouble < 0.3f || this.oo == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoPercent30", this.oo);
        this.sf = true;
    }

    private void vj(JSONObject jSONObject) {
        FilterWord sf;
        if (jSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("filter_words");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (sf = com.bytedance.sdk.openadsdk.core.sf.sf(optJSONObject)) != null) {
                    arrayList.add(sf);
                }
            }
        }
        String optString = jSONObject.optString("dislike_source");
        com.bytedance.sdk.openadsdk.gm.sf.pcc().pcc(jSONObject.optString("ext"), arrayList, null, jSONObject.optString("suggestion"), optString);
    }

    private void wh(JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()))) {
            return;
        }
        int optInt = jSONObject.optInt("type");
        List<String> pcc2 = pcc(jSONObject.optJSONArray("urls"));
        String optString = jSONObject.optString("ad_id");
        if (optInt == 1) {
            com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(pcc2, true), 1, optString);
        } else if (optInt == 2) {
            com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(pcc2, true), 2, optString);
        }
    }

    private List<String> pcc(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    private void qf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.gm.pcc(jSONObject.optInt("state"), jSONObject);
    }

    private void kj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.gm.vj(jSONObject.optInt("type"));
    }

    private void vy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        final String optString = jSONObject.optString("type");
        int optInt = jSONObject.optInt("isRealTime");
        jSONObject.optInt("defaultRate");
        final JSONObject optJSONObject = jSONObject.optJSONObject("ext");
        com.bytedance.sdk.openadsdk.dax.oo.pcc(optString, optInt == 1, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gpj.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject2 = optJSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(optString).sf(jSONObject2.toString());
            }
        });
    }
}
