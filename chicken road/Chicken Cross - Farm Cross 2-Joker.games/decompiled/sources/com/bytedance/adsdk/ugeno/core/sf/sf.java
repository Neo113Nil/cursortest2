package com.bytedance.adsdk.ugeno.core.sf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.core.ork;
import com.bytedance.adsdk.ugeno.qf.vy;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf implements vy.pcc {
    private Context gm;
    private hc oo;
    private int pcc;
    private jr sf;
    private com.bytedance.adsdk.ugeno.sf.gm vj;
    private Handler wh = new vy(Looper.getMainLooper(), this);

    public sf(Context context, hc hcVar, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.gm = context;
        this.oo = hcVar;
        this.vj = gmVar;
    }

    public void pcc(jr jrVar) {
        this.sf = jrVar;
    }

    public void pcc() {
        hc hcVar = this.oo;
        if (hcVar == null) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(com.bytedance.adsdk.ugeno.gm.sf.pcc(hcVar.gm().optString("delay"), this.vj.tmg()));
            this.pcc = parseInt;
            this.wh.sendEmptyMessageDelayed(1001, parseInt);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qf.vy.pcc
    public void pcc(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject gm = this.oo.gm();
        if (TextUtils.equals(gm.optString("type"), "onAnimation")) {
            String optString = gm.optString("nodeId");
            com.bytedance.adsdk.ugeno.sf.gm gmVar = this.vj;
            com.bytedance.adsdk.ugeno.sf.gm vj = gmVar.sf(gmVar).vj(optString);
            new ork(vj.vh(), com.bytedance.adsdk.ugeno.core.pcc.pcc(gm.optJSONObject("animatorSet"), vj)).pcc();
        } else {
            jr jrVar = this.sf;
            if (jrVar != null) {
                hc hcVar = this.oo;
                com.bytedance.adsdk.ugeno.sf.gm gmVar2 = this.vj;
                jrVar.pcc(hcVar, gmVar2, gmVar2);
            }
        }
        this.wh.removeMessages(1001);
    }
}
