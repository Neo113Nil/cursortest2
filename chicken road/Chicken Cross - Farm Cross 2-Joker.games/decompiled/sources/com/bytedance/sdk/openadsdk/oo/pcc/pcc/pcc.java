package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.pcc.gm;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.pcc.sf<vy> {
    @Override // com.bytedance.pcc.sf
    public void pcc(ArrayList<vy> arrayList, gm.sf<vy> sfVar) {
        oo.pcc(arrayList, sfVar);
    }

    @Override // com.bytedance.pcc.sf
    public String oo() {
        return "app_log_event";
    }

    @Override // com.bytedance.pcc.sf
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public vy pcc(String str, byte[] bArr, int i, int i2) {
        vy vyVar;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            vyVar = new vy(str, new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
            try {
                vyVar.pcc(i);
                vyVar.sf(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            vyVar = null;
        }
        if (vyVar == null) {
            return null;
        }
        try {
            JSONObject gm = vyVar.gm();
            String optString = gm.optString("ad_extra_data");
            if (!TextUtils.isEmpty(optString)) {
                jSONObject = new JSONObject(optString);
            } else {
                jSONObject = new JSONObject();
            }
            String optString2 = jSONObject.optString("pag_json_data");
            if (!TextUtils.isEmpty(optString2)) {
                jSONObject2 = new JSONObject(optString2);
            } else {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.putOpt("_reqc", Integer.valueOf(vyVar.vj()));
            jSONObject.putOpt("pag_json_data", jSONObject2.toString());
            gm.putOpt("ad_extra_data", jSONObject.toString());
        } catch (Throwable unused3) {
        }
        return vyVar;
    }

    @Override // com.bytedance.pcc.sf
    public long pcc() {
        return gm.pcc().pcc().pcc;
    }

    @Override // com.bytedance.pcc.sf
    public int sf() {
        return gm.pcc().pcc().sf;
    }

    @Override // com.bytedance.pcc.sf
    public long vj() {
        return gm.pcc().pcc().gm;
    }

    @Override // com.bytedance.pcc.sf
    public gm.InterfaceC0115gm qf() {
        return sf.pcc();
    }

    @Override // com.bytedance.pcc.sf
    public int kj() {
        return gm.pcc().pcc().wh;
    }

    @Override // com.bytedance.pcc.sf
    public int vy() {
        return gm.pcc().pcc().qf;
    }

    @Override // com.bytedance.pcc.sf
    public long ork() {
        return gm.pcc().pcc().kj;
    }

    @Override // com.bytedance.pcc.sf
    public boolean wh() {
        return sf.sf();
    }
}
