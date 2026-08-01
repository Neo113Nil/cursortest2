package com.bytedance.sdk.openadsdk.dax.sf;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.L6;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo {

    public static class pcc {
        public final String pcc;
        public final JSONObject sf;

        public pcc(String str, JSONObject jSONObject) {
            this.pcc = str;
            this.sf = jSONObject;
            JSONObject optJSONObject = jSONObject.optJSONObject(DeviceRequestsHelper.DEVICE_INFO_PARAM);
            if (optJSONObject != null) {
                try {
                    optJSONObject.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
                    jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, optJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static gm pcc() {
        return vj.pcc();
    }
}
