package com.bytedance.sdk.openadsdk.core.ork;

import com.bytedance.sdk.openadsdk.utils.rnn;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gbb implements com.bytedance.adsdk.ugeno.core.lu, com.bytedance.sdk.component.adexpress.sf.vy {
    private final com.bytedance.sdk.openadsdk.core.model.of gm;
    private final String oo;
    private final com.bytedance.sdk.openadsdk.oo.oo.vj pcc;
    private final String sf;
    private long vj;
    private boolean wh;

    public gbb(com.bytedance.sdk.openadsdk.oo.oo.vj vjVar, String str, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str2, boolean z) {
        this.pcc = vjVar;
        this.sf = str;
        this.oo = str2;
        this.gm = ofVar;
        this.wh = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void oo() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void pcc(boolean z) {
        this.pcc.sf(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void vj() {
        this.pcc.sf();
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void pcc(int i, String str) {
        this.pcc.pcc(i, str);
        tmg.pcc("Web", i, str, this.sf, this.oo, this.gm);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void pcc(int i) {
        this.vj = System.currentTimeMillis();
        if (i == 3) {
            this.pcc.gm("dynamic_render2_start");
        } else {
            this.pcc.gm("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void sf(int i) {
        if (i == 3) {
            this.pcc.oo("dynamic_sub_analysis2_start");
        } else {
            this.pcc.oo("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void gm(int i) {
        if (i == 3) {
            this.pcc.oo("dynamic_sub_analysis2_end");
        } else {
            this.pcc.oo("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void oo(int i) {
        if (i == 3) {
            this.pcc.oo("dynamic_sub_render2_start");
        } else {
            this.pcc.oo("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void vj(int i) {
        if (i == 3) {
            this.pcc.oo("dynamic_sub_render2_end");
        } else {
            this.pcc.oo("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void wh(int i) {
        final String str;
        System.currentTimeMillis();
        if (i == 3) {
            this.pcc.qf("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.pcc.qf("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.pcc.pcc(true);
        rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.ork.gbb.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.oo.gm.sf(gbb.this.gm, gbb.this.sf, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void pcc(int i, int i2, String str, boolean z) {
        if (!z) {
            this.pcc.pcc(true);
        }
        if (i == 3) {
            this.pcc.sf(i2, "dynamic_render2_error");
        } else {
            this.pcc.sf(i2, "dynamic_render_error");
        }
        tmg.pcc("NDR", i2, str, this.sf, this.oo, this.gm);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void qf(int i) {
        new Object[]{"native render start ", Integer.valueOf(i)};
        this.pcc.pcc(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void wh() {
        this.pcc.pcc(true);
        this.pcc.tmg();
        rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("native_success") { // from class: com.bytedance.sdk.openadsdk.core.ork.gbb.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.oo.gm.sf(gbb.this.gm, gbb.this.sf, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void qf() {
        this.pcc.hc();
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void kj() {
        this.pcc.gbb();
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vy
    public void vy() {
        this.pcc.sf();
    }

    public void ork() {
        this.pcc.ork();
        this.pcc.vh();
    }

    @Override // com.bytedance.adsdk.ugeno.core.lu
    public void pcc() {
        this.pcc.pcc("ugen_render_start", this.wh);
        this.pcc.vj("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.lu
    public void sf() {
        this.pcc.vj("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.adsdk.ugeno.core.lu
    public void gm() {
        this.pcc.vj("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.lu
    public void pcc(com.bytedance.adsdk.ugeno.core.nac nacVar) {
        if (nacVar.pcc() == 0) {
            this.pcc.vj("ugen_sub_render_end");
            this.pcc.wh("ugen_render_success");
        } else {
            this.pcc.gm(nacVar.pcc(), "ugen_render_error");
            tmg.pcc("UGen", nacVar.pcc(), nacVar.sf(), this.sf, this.oo, this.gm);
        }
        this.pcc.pcc(true);
    }
}
