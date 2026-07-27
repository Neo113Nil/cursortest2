package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.qf.kj;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class gm extends com.bytedance.adsdk.ugeno.sf.pcc<com.bytedance.adsdk.ugeno.wh.sf> {
    private int az;
    private float gga;
    private int gpa;
    private float gr;
    private com.bytedance.adsdk.ugeno.sf.gm jmx;
    private String kez;
    private boolean ofe;
    private float rc;
    private float rv;
    private boolean uae;
    private String vd;
    private boolean xf;
    private float xy;
    private float zk;
    private JSONArray zpi;

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(JSONObject jSONObject) {
    }

    public gm(Context context) {
        super(context);
        this.xf = true;
        this.uae = true;
        this.gga = 0.0f;
        this.rc = 2000.0f;
        this.kez = Constants.NORMAL;
        this.ofe = true;
        this.gpa = Color.parseColor("#666666");
        this.az = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public View pcc() {
        this.vj = new com.bytedance.adsdk.ugeno.wh.sf(this.sf);
        ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).pcc((oo) this);
        return this.vj;
    }

    public void pcc(com.bytedance.adsdk.ugeno.wh.gm gmVar) {
        if (this.vj != 0) {
            ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).setOnPageChangeListener(gmVar);
        }
    }

    public void pcc(int i) {
        if (this.vj != 0) {
            ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).gbb(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        JSONArray jSONArray = this.zpi;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).kj((int) this.zk).vy((int) this.rv).ork((int) this.xy).gm(this.ofe).wh(this.az).qf(this.gpa).gm(this.kez).oo(this.xf).vj(this.gr).pcc(this.uae).oo((int) this.rc).gm(this.ofe);
        for (int i = 0; i < this.zpi.length(); i++) {
            tmg tmgVar = new tmg(this.sf);
            tmgVar.pcc(this.fvk);
            com.bytedance.adsdk.ugeno.sf.gm<View> sf = tmgVar.sf(this.jmx.ye(), (com.bytedance.adsdk.ugeno.sf.gm<View>) null);
            tmgVar.sf(this.zpi.optJSONObject(i));
            ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).pcc((com.bytedance.adsdk.ugeno.wh.sf) sf);
        }
        if (this.uae) {
            ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).gm();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.jmx = gmVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "delayStart":
                this.gga = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "indicatorColor":
                this.gpa = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "nextMargin":
                this.xy = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "effect":
                this.kez = str2;
                break;
            case "direction":
                this.vd = str2;
                break;
            case "indicator":
                this.ofe = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
            case "previousMargin":
                this.rv = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "loop":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
            case "speed":
                this.rc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 500.0f);
                break;
            case "pageCount":
                this.gr = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "pageMargin":
                this.zk = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.az = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "autoplay":
                this.uae = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
            case "dataList":
                this.zpi = com.bytedance.adsdk.ugeno.qf.sf.pcc(str2, (JSONArray) null);
                break;
        }
    }
}
