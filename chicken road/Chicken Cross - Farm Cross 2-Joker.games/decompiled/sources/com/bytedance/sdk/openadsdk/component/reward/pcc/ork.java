package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.single.oo;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.tsz;
import com.bytedance.sdk.openadsdk.core.widget.lu;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ork {
    protected boolean dax;
    protected boolean gbb;
    private boolean gm;
    protected AtomicBoolean gpj = new AtomicBoolean(false);
    protected boolean hc;
    protected boolean jr;
    protected volatile boolean kj;
    protected com.bytedance.sdk.openadsdk.tz.pcc.pcc lu;
    protected FrameLayout nac;
    protected final of ork;
    private com.bytedance.sdk.openadsdk.core.widget.lu pcc;
    private oo.wh sf;
    protected final sf tmg;
    protected final String vh;
    protected final Activity vy;

    public boolean ork() {
        return false;
    }

    public void pcc(int i) {
    }

    public int qf() {
        return 0;
    }

    public ork(sf sfVar) {
        this.tmg = sfVar;
        this.vy = sfVar.rnn;
        this.vh = sfVar.vj;
        of ofVar = sfVar.sf;
        this.ork = ofVar;
        this.gbb = atb.vj(ofVar);
    }

    public void pcc() {
        if (this.gbb && !this.hc) {
            this.hc = true;
        }
    }

    private void dax() {
        if (this.tmg.sf.jkt()) {
            com.bytedance.sdk.openadsdk.core.widget.lu luVar = new com.bytedance.sdk.openadsdk.core.widget.lu(this.tmg, new lu.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.ork.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
                public void pcc() {
                    ork.this.tmg.tsx.pcc("skipToNextAd", (JSONObject) null);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
                public void sf() {
                    mu qf = ork.this.lu.qf();
                    if (qf != null) {
                        qf.pcc("popupDidDismiss", (JSONObject) null);
                    }
                    ork.this.oo(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
                public void gm() {
                    com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
                    com.bytedance.sdk.openadsdk.activity.single.sf rj;
                    mu qf = ork.this.lu.qf();
                    if (qf != null) {
                        qf.pcc("popupDidShow", (JSONObject) null);
                    }
                    if (!ork.this.tmg.gdh || (kjVar = ork.this.tmg.ywp) == null || (rj = kjVar.rj()) == null) {
                        return;
                    }
                    rj.lq();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
                public int oo() {
                    if (ork.this.tmg.gdh) {
                        return ork.this.tmg();
                    }
                    return ork.this.kj();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
                public void vj() {
                    ork.this.nac();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.lu.pcc
                public void wh() {
                    ork.this.oo(false);
                }
            });
            this.pcc = luVar;
            luVar.pcc(this.tmg.nn);
            mu qf = this.lu.qf();
            if (qf != null) {
                qf.pcc(new tsz() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.ork.2
                    @Override // com.bytedance.sdk.openadsdk.core.tsz
                    public void r_() {
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tsz
                    public void m_() {
                        if (ork.this.pcc != null) {
                            ork.this.pcc.pcc(ork.this.tmg.rnn);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tsz
                    public void n_() {
                        if (ork.this.pcc != null) {
                            ork.this.pcc.n_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tsz
                    public int o_() {
                        if (ork.this.tmg.gdh) {
                            return ork.this.tmg();
                        }
                        return ork.this.kj();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tsz
                    public void p_() {
                        ork.this.nac();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tsz
                    public void q_() {
                        ork.this.oo(false);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo(boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.sf rj;
        if (this.tmg.gdh) {
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.tmg.ywp;
            if (kjVar == null || (rj = kjVar.rj()) == null) {
                return;
            }
            if (z) {
                rj.ye();
            }
            rj.pcc(1);
            return;
        }
        if (this instanceof kj) {
            pcc(0L);
        } else {
            oo.wh whVar = this.sf;
            if (whVar != null) {
                whVar.gm();
            }
        }
        this.gm = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nac() {
        com.bytedance.sdk.openadsdk.activity.single.sf rj;
        if (this.tmg.gdh) {
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.tmg.ywp;
            if (kjVar == null || (rj = kjVar.rj()) == null) {
                return;
            }
            rj.pcc(2);
            return;
        }
        if (this instanceof kj) {
            vy();
        } else {
            oo.wh whVar = this.sf;
            if (whVar != null) {
                whVar.sf();
            }
        }
        this.gm = true;
    }

    public boolean vh() {
        return !this.gm;
    }

    public void sf(boolean z) {
        if (this.gbb && this.tmg.lrr) {
            this.nac = (FrameLayout) this.tmg.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.slc);
            pcc(z);
            dax();
        }
    }

    protected void pcc(boolean z) {
        if (this.nac != null) {
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.tz.pcc.pcc(this.tmg.kun, this.ork, this.tmg.zsj, z, this.nac, false, this.tmg.ywp != null ? this.tmg.ywp.kun() : 0);
            this.lu = pccVar;
            pccVar.pcc(this.tmg.tsx);
            this.lu.pcc(true, sf());
        }
    }

    protected com.bytedance.sdk.openadsdk.hc.qf sf() {
        return new com.bytedance.sdk.openadsdk.hc.qf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.ork.3
            @Override // com.bytedance.sdk.openadsdk.hc.qf
            public void pcc() {
                ork.this.tmg.tsx.sf(false);
            }
        };
    }

    public void gm() {
        if (this.gbb) {
            this.kj = true;
            gm(this.tmg.xb);
            this.lu.pcc();
            lu();
            if (atb.kj(this.ork)) {
                this.tmg.ye.wh();
            }
        }
    }

    private void lu() {
        int jum = this.ork.jum();
        if (jum == -1) {
            if (atb.qf(this.ork)) {
                com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.lu;
                if (pccVar != null && pccVar.vj()) {
                    this.tmg.dax.set(true);
                    this.tmg.ew.hc();
                    return;
                } else {
                    this.tmg.ew.fum();
                    return;
                }
            }
            this.tmg.dax.set(true);
            this.tmg.ew.hc();
            return;
        }
        if (jum >= 0) {
            this.tmg.zti.oo(false);
            if (atb.qf(this.ork)) {
                com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar2 = this.lu;
                if (pccVar2 != null && pccVar2.vj()) {
                    oo.wh whVar = new oo.wh(jum) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.ork.4
                        @Override // com.bytedance.sdk.openadsdk.activity.single.oo.wh
                        public void pcc() {
                            ork.this.tmg.rj.sendEmptyMessage(600);
                        }
                    };
                    this.sf = whVar;
                    whVar.vj();
                    return;
                } else {
                    oo.wh whVar2 = new oo.wh(jum) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.ork.5
                        @Override // com.bytedance.sdk.openadsdk.activity.single.oo.wh
                        public void pcc() {
                            ork.this.tmg.rj.sendEmptyMessage(1);
                        }
                    };
                    this.sf = whVar2;
                    whVar2.vj();
                    return;
                }
            }
            oo.wh whVar3 = new oo.wh(jum) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.ork.6
                @Override // com.bytedance.sdk.openadsdk.activity.single.oo.wh
                public void pcc() {
                    ork.this.tmg.rj.sendEmptyMessage(600);
                }
            };
            this.sf = whVar3;
            whVar3.vj();
        }
    }

    public void oo() {
        if (!this.gbb || this.gpj.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.lu;
        if (pccVar != null) {
            pccVar.sf();
        }
        if (this.sf == null || !vh()) {
            return;
        }
        this.sf.gm();
    }

    public void vj() {
        if (!this.gbb || this.gpj.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.lu;
        if (pccVar != null) {
            pccVar.gm();
        }
        oo.wh whVar = this.sf;
        if (whVar != null) {
            whVar.sf();
        }
    }

    public void wh() {
        if (this.gbb && !this.dax) {
            this.dax = true;
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.lu;
            if (pccVar != null) {
                pccVar.oo();
            }
            FrameLayout frameLayout = this.nac;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.widget.lu luVar = this.pcc;
            if (luVar != null) {
                luVar.kj();
                this.pcc = null;
            }
            oo.wh whVar = this.sf;
            if (whVar != null) {
                whVar.oo();
                this.sf = null;
            }
        }
    }

    public void pcc(long j) {
        oo.wh whVar = this.sf;
        if (whVar != null) {
            whVar.gm();
        }
    }

    public void vy() {
        oo.wh whVar = this.sf;
        if (whVar != null) {
            whVar.sf();
        }
    }

    public int tmg() {
        com.bytedance.sdk.openadsdk.activity.single.sf rj;
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.tmg.ywp;
        if (kjVar == null || (rj = kjVar.rj()) == null) {
            return 0;
        }
        return rj.zti();
    }

    public int kj() {
        oo.wh whVar = this.sf;
        if (whVar != null) {
            return (int) (whVar.wh() / 1000);
        }
        return 0;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.vj vjVar) {
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar;
        if (this.gbb && (pccVar = this.lu) != null) {
            pccVar.pcc(vjVar);
        }
    }

    public void gm(boolean z) {
        if (this.gbb && this.lu != null && this.kj) {
            this.lu.pcc(z);
        }
    }

    public boolean hc() {
        return this.kj;
    }

    public void gbb() {
        if (this.gpj.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.lu;
            if (pccVar != null) {
                pccVar.pcc(true);
            }
            this.tmg.ye.qf(true);
            this.tmg.pq.pcc(true, this.tmg.ew);
            if (this.tmg.pq.vj()) {
                if (this.tmg.gh != null) {
                    this.tmg.gh.pcc(this.tmg, r1.qf);
                    return;
                }
                return;
            }
            this.tmg.ye.pcc(this.tmg.xb, true);
            this.tmg.ye.gm(true);
            this.tmg.ye.sf(true);
            this.tmg.rj.removeMessages(600);
            return;
        }
        this.tmg.ye.qf();
    }

    public boolean jr() {
        com.bytedance.sdk.openadsdk.core.widget.lu luVar = this.pcc;
        if (luVar != null) {
            return luVar.vy();
        }
        return false;
    }
}
