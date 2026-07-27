package com.bytedance.sdk.openadsdk.oo.vj.sf;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.lo;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh extends gm {
    private long gm;
    private int oo = 0;
    private final com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm pcc;
    private long sf;

    public wh(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
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
            jSONObject.put("total_duration", this.sf);
            jSONObject.put("buffers_time", this.gm);
            jSONObject.put("video_backup", this.oo);
        } catch (Throwable th) {
            lo.gm("FeedOverModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(pcc pccVar) {
        super.pcc(pccVar);
        JSONObject oo = pccVar.oo();
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.pcc.vj(), this.pcc.nac());
        if (file.exists()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                oo.put("level", com.bykv.vk.openvk.pcc.pcc.pcc.qf.oo.pcc(file.getAbsolutePath()));
                oo.put("level_cost_time", SystemClock.elapsedRealtime() - elapsedRealtime);
            } catch (JSONException unused) {
            }
        }
    }
}
