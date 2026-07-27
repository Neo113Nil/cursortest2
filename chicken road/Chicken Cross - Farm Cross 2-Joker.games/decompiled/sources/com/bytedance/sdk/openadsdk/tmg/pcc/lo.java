package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.tsx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class lo extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private of sf;

    public lo(of ofVar) {
        this.sf = ofVar;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, of ofVar) {
        jrVar.pcc(pcc, new lo(ofVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.pcc.oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        String yez;
        of ofVar = this.sf;
        if (ofVar != null && (yez = ofVar.yez()) != null) {
            JSONObject jSONObject2 = new JSONObject();
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1166163208:
                    if (str.equals("getStorageItem")) {
                        c = 0;
                        break;
                    }
                    break;
                case 541948222:
                    if (str.equals("removeAllStorage")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1357067884:
                    if (str.equals("setStorageItem")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1498706186:
                    if (str.equals("removeStorageItem")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String optString = jSONObject.optString("key");
                    if (!TextUtils.isEmpty(optString) && tsx.pcc().sf(yez, optString)) {
                        jSONObject2.put("value", tsx.pcc().pcc(yez, optString));
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                        break;
                    } else {
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                        break;
                    }
                    break;
                case 1:
                    tsx.pcc().pcc(yez);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                    break;
                case 2:
                    String optString2 = jSONObject.optString("key");
                    String optString3 = jSONObject.optString("value");
                    if (optString2 != null) {
                        tsx.pcc().pcc(yez, optString2, optString3);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                        break;
                    } else {
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                        break;
                    }
                case 3:
                    String optString4 = jSONObject.optString("key");
                    if (!TextUtils.isEmpty(optString4)) {
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, tsx.pcc().gm(yez, optString4) ? "0" : "1");
                        break;
                    } else {
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                        break;
                    }
            }
        } else {
            return null;
        }
    }
}
