package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.pcc.pcc;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vy extends ork<JSONObject> {
    private static final AtomicInteger pcc = new AtomicInteger(0);
    private com.bytedance.sdk.openadsdk.oo.pcc sf;

    public vy(final com.bytedance.sdk.openadsdk.oo.pcc pccVar) {
        super(pccVar.pcc, (pcc.InterfaceC0116pcc) new pcc.InterfaceC0116pcc<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.vy.1
            final int pcc = vy.pcc.getAndAdd(1);
            final long sf = SystemClock.elapsedRealtime();

            @Override // com.bytedance.pcc.pcc.InterfaceC0116pcc
            /* renamed from: sf, reason: merged with bridge method [inline-methods] */
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject oo = com.bytedance.sdk.openadsdk.oo.pcc.this.oo();
                    Iterator<String> keys = oo.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, oo.opt(next));
                    }
                    String optString = jSONObject.optString("ad_extra_data", null);
                    JSONObject jSONObject2 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                    String optString2 = jSONObject2.optString("pag_json_data");
                    JSONObject jSONObject3 = TextUtils.isEmpty(optString2) ? new JSONObject() : new JSONObject(optString2);
                    jSONObject3.putOpt("_nl", 1);
                    jSONObject3.putOpt("_ei", Integer.valueOf(this.pcc));
                    jSONObject3.putOpt("_reqc", 0);
                    jSONObject3.putOpt("_c_t_s", Long.valueOf(SystemClock.elapsedRealtime() - this.sf));
                    if (wh.sf()) {
                        jSONObject3.put("_ad_staging_flag", 3);
                    }
                    jSONObject2.putOpt("pag_json_data", jSONObject3.toString());
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
        pcc(pccVar.kj() ? 1 : 0);
        this.sf = pccVar;
    }

    public vy(String str, JSONObject jSONObject) {
        super(str, jSONObject);
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

    public String kj() {
        com.bytedance.sdk.openadsdk.oo.pcc pccVar = this.sf;
        if (pccVar != null) {
            return pccVar.wh();
        }
        return null;
    }

    @Override // com.bytedance.pcc.pcc
    public String toString() {
        com.bytedance.sdk.openadsdk.oo.pcc pccVar = this.sf;
        if (pccVar != null) {
            return pccVar.wh();
        }
        return super.toString();
    }
}
