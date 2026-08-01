package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj extends gm {
    private long gm;
    private int oo;
    private final com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm pcc;
    private long sf;

    public kj(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        this.pcc = gmVar;
    }

    public void pcc(long j) {
        this.sf = j;
    }

    public void sf(long j) {
        this.gm = j;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.sf);
            jSONObject.put("video_cache_size", this.gm);
            jSONObject.put("is_auto_play", this.oo);
        } catch (Throwable th) {
            lo.gm("FeedPlayModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(pcc pccVar) {
        if (this.pcc.jsj()) {
            String vj = this.pcc.vj();
            String nac = this.pcc.nac();
            File sf = com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.sf(vj, nac);
            File gm = com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.gm(vj, nac);
            if (gm.exists()) {
                sf = gm;
            }
            try {
                pccVar.oo().put("moov_box_pos", com.bykv.vk.openvk.pcc.pcc.pcc.qf.oo.pcc(sf));
            } catch (JSONException unused) {
            }
        }
    }
}
