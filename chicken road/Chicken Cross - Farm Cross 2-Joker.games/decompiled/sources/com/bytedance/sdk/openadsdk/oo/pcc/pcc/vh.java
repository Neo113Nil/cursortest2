package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vh extends ork<JSONObject> {
    private static final AtomicInteger pcc = new AtomicInteger(0);

    public vh(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static JSONObject pcc(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            String optString = jSONObject2.optString("event_extra");
            JSONObject jSONObject3 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
            jSONObject3.putOpt("_nl", 1);
            jSONObject3.putOpt("_ei", Integer.valueOf(pcc.getAndAdd(1)));
            jSONObject3.putOpt("_reqc", 0);
            jSONObject2.putOpt("event_extra", jSONObject3.toString());
        } catch (Exception unused) {
        }
        return jSONObject2;
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
