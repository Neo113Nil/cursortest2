package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.pcc.gm;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg extends com.bytedance.pcc.sf<vh> {
    @Override // com.bytedance.pcc.sf
    public void pcc(ArrayList<vh> arrayList, gm.sf<vh> sfVar) {
        oo.sf(arrayList, sfVar);
    }

    @Override // com.bytedance.pcc.sf
    public String oo() {
        return "stats_log_event";
    }

    @Override // com.bytedance.pcc.sf
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public vh pcc(String str, byte[] bArr, int i, int i2) {
        vh vhVar;
        JSONObject jSONObject;
        try {
            vhVar = new vh(str, new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
            try {
                vhVar.pcc(i);
                vhVar.sf(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            vhVar = null;
        }
        if (vhVar == null) {
            return null;
        }
        try {
            JSONObject gm = vhVar.gm();
            String optString = gm.optString("event_extra");
            if (!TextUtils.isEmpty(optString)) {
                jSONObject = new JSONObject(optString);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.putOpt("_reqc", Integer.valueOf(vhVar.vj()));
            gm.putOpt("event_extra", jSONObject.toString());
        } catch (Throwable unused3) {
        }
        return vhVar;
    }

    @Override // com.bytedance.pcc.sf
    public long pcc() {
        return gm.pcc().sf().pcc;
    }

    @Override // com.bytedance.pcc.sf
    public int sf() {
        return gm.pcc().sf().sf;
    }

    @Override // com.bytedance.pcc.sf
    public long vj() {
        return gm.pcc().sf().gm;
    }

    @Override // com.bytedance.pcc.sf
    public gm.InterfaceC0115gm qf() {
        return sf.pcc();
    }

    @Override // com.bytedance.pcc.sf
    public int kj() {
        return gm.pcc().sf().wh;
    }

    @Override // com.bytedance.pcc.sf
    public int vy() {
        return gm.pcc().sf().qf;
    }

    @Override // com.bytedance.pcc.sf
    public long ork() {
        return gm.pcc().sf().kj;
    }

    @Override // com.bytedance.pcc.sf
    public boolean wh() {
        return sf.sf();
    }
}
