package com.bytedance.sdk.openadsdk.core.ork;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.component.vy.qf;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class qy extends tsz {
    private Activity gpj;
    protected com.bytedance.sdk.openadsdk.core.ork.pcc.sf kj;
    private final jsj.pcc lo;
    protected final AtomicBoolean vy;

    public qy(Context context, com.bytedance.sdk.component.adexpress.sf.hc hcVar, com.bytedance.sdk.openadsdk.oo.oo.vj vjVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        super(context, hcVar, vjVar, ofVar);
        this.vy = new AtomicBoolean(false);
        this.lo = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.ork.qy.1
            @Override // com.bytedance.sdk.component.utils.jsj.pcc
            public void pcc(Context context2, Intent intent, boolean z, int i) {
                if (qy.this.jr != null) {
                    qy.this.jr.oo(i);
                }
            }
        };
        gpj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void jr() {
        super.jr();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    protected qf.gm pcc() {
        return qf.gm.ADS_V4;
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    protected void sf() {
        if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.gm()) {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().sf(this.vj);
        } else {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().pcc(this.vj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    protected com.bytedance.sdk.component.vy.qf pcc(Context context, String str) {
        return com.bytedance.sdk.component.adexpress.vj.vj.pcc().pcc(context, str);
    }

    public void sf(Activity activity) {
        this.gpj = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    protected void dax() {
        if (!com.bytedance.sdk.openadsdk.core.model.lo.vj(this.tmg) && !com.bytedance.sdk.component.adexpress.pcc.sf.sf.sf(this.hc) && this.sf != null) {
            this.sf.pcc(103, "data null is " + (this.hc == null));
        } else {
            super.dax();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void nac() {
        if (this.vj == null || this.vj.getWebView() == null || this.jr == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ork.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.core.ork.pcc.sf(this.jr, this.vj, this.tmg);
        this.kj = sfVar;
        sfVar.oo();
        this.kj.sf();
        this.kj.pcc(this).pcc(this.gpj).pcc(this.gbb).pcc(this.nac).pcc(this.vh).pcc(this.hc).pcc(this.dax).pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz, com.bytedance.sdk.component.adexpress.vj.pcc, com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        super.pcc(gbbVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    protected boolean sf(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        return gbbVar.sf() && TextUtils.equals(gbbVar.jr(), "v4");
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz, com.bytedance.sdk.component.adexpress.vj.pcc
    public void kj() {
        super.kj();
        this.kj.gm();
        lo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz, com.bytedance.sdk.component.adexpress.vj.pcc
    public void vy() {
        super.vy();
        com.bytedance.sdk.openadsdk.core.ork.pcc.sf sfVar = this.kj;
        if (sfVar != null) {
            sfVar.wh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    public void lu() {
        super.lu();
        com.bytedance.sdk.openadsdk.core.ork.pcc.sf sfVar = this.kj;
        if (sfVar != null) {
            sfVar.vj();
        }
    }

    protected void gpj() {
        if (this.vy.get()) {
            return;
        }
        this.vy.set(true);
        com.bytedance.sdk.component.utils.jsj.pcc(this.lo, this.ork);
    }

    protected void lo() {
        if (this.vy.get()) {
            this.vy.set(false);
            try {
                com.bytedance.sdk.component.utils.jsj.pcc(this.lo);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    protected void wh() {
        if (!com.bytedance.sdk.openadsdk.component.reward.gm.kj.sf() || this.vj == null) {
            return;
        }
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.WebViewRender", "refreshWebView: refresh webview by console log ");
        this.vj.a_("javascript:console.log('init engine');");
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.tsz
    protected void fum() {
        if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.gm()) {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().sf(this.vj, this.jr);
        } else {
            super.fum();
        }
    }
}
