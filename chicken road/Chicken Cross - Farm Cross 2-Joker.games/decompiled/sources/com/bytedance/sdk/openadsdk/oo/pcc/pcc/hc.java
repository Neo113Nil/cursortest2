package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.bytedance.sdk.openadsdk.utils.tsz;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc extends ork<JSONObject> {
    public hc(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static hc pcc(String str, boolean z, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("track_url", str);
            jSONObject.putOpt("replace_holder", Boolean.valueOf(z));
            jSONObject.putOpt("track_type", Integer.valueOf(i));
            jSONObject.putOpt("ad_id", str2);
            hc hcVar = new hc(tsz.pcc(), jSONObject);
            hcVar.pcc(1);
            return hcVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int kj() {
        JSONObject gm = gm();
        if (gm != null) {
            return gm.optInt("track_type");
        }
        return 0;
    }

    public boolean vy() {
        JSONObject gm = gm();
        if (gm != null) {
            return gm.optBoolean("replace_holder");
        }
        return false;
    }

    public String ork() {
        JSONObject gm = gm();
        if (gm != null) {
            return gm.optString("track_url");
        }
        return null;
    }

    public String vh() {
        JSONObject gm = gm();
        if (gm != null) {
            return gm.optString("ad_id");
        }
        return null;
    }

    @Override // com.bytedance.pcc.pcc
    public byte[] oo() {
        String jSONObject;
        JSONObject gm = gm();
        if (gm == null || (jSONObject = gm.toString()) == null) {
            return null;
        }
        return jSONObject.getBytes(StandardCharsets.UTF_8);
    }
}
