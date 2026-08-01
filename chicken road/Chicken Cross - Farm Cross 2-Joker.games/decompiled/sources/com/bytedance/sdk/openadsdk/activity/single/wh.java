package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;

/* loaded from: classes4.dex */
public class wh extends pcc {
    private boolean lo;

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected boolean c_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
    }

    public wh(sf sfVar, of ofVar, int i, int i2, boolean z) {
        super(sfVar, ofVar, i, i2, z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc
    public void sf() {
        if (!of.vj(this.vy.sf) && !this.vy.gm) {
            this.vy.zti.pcc(null, "X");
        } else {
            this.vy.zti.pcc(null, TTAdDislikeToast.getSkipText());
        }
        this.vy.zti.vj(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc, com.bytedance.sdk.openadsdk.activity.single.kj
    public void oo() {
        super.oo();
        if (this.vy == null || !sf(this.vy.sf) || pcc(this.vy.sf)) {
            return;
        }
        if (this.lo) {
            this.lo = false;
            iv();
        } else if (this.vy.ye.jsj()) {
            iv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public String d_() {
        return "fullscreen_interstitial_ad";
    }

    private boolean pcc(of ofVar) {
        return ofVar == null || ofVar.zx() == 100.0f;
    }

    private boolean sf(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        return lu.oo().fum(String.valueOf(this.vy.wh));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected void a_() {
        if (this.qf != null && this.qf.gm()) {
            super.a_();
            return;
        }
        final View ork = this.vy.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.wh.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (wh.this.vy.ye.lo() && wh.this.vy.vy.get()) {
                        boolean hc = wh.this.vy.lq.hc();
                        wh.this.vy.ye.wh(hc);
                        wh.this.vy.mu.wh(8);
                        wh.this.vy.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!of.gm(wh.this.vy.sf)) {
                            return;
                        }
                        if (of.gm(wh.this.vy.sf) && hc) {
                            return;
                        }
                    }
                    wh.this.vy.ye.fum();
                    wh.this.vy.lq.vh();
                    wh.this.vy.jsj.wh();
                    wh.this.iv();
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.vy.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.wh.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                if (lo.pcc(wh.this.vy.sf) && !wh.this.vy.hc.get()) {
                    wh.this.iv();
                    return;
                }
                wh.this.vy.fum.zti();
                jr.pcc pccVar = new jr.pcc();
                pccVar.sf(wh.this.vy.fum.hc());
                pccVar.oo(wh.this.vy.fum.jsj());
                pccVar.gm(wh.this.vy.fum.nac());
                pccVar.gm(3);
                pccVar.oo(wh.this.vy.fum.qy());
                pccVar.pcc(wh.this.vy.fum.sf());
                com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(wh.this.vy.fum.kj(), pccVar, wh.this.vy.fum.vj());
                mk.gm(wh.this.vy.wh);
                wh.this.vy.fum.pcc("skip", false);
                wh.this.vy.zti.oo(false);
                if (wh.this.vy.gm) {
                    wh.this.pcc(true, 4);
                } else {
                    wh.this.iv();
                }
                if (wh.this.vy.sf != null && wh.this.vy.sf.gto() != null && wh.this.vy.fum != null && (pcc = wh.this.vy.sf.gto().pcc()) != null) {
                    pcc.wh(wh.this.vy.fum.hc());
                    pcc.vj(wh.this.vy.fum.hc());
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(wh.this.vy.sf, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                wh.this.pcc(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                wh.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View view2 = ork;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
                wh whVar = wh.this;
                whVar.sf(whVar.vy);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void e_() {
        this.vy.mk.pcc(this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean f_() {
        return this.vy.xb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        this.vy.xb = !this.vy.xb;
        if (this.vy.yt != null && this.vy.yt.pcc() != null) {
            this.vy.yt.pcc().setSoundMute(this.vy.xb);
        }
        this.vy.fum.pcc(this.vy.xb, str);
        this.vy.ye.vj(this.vy.xb);
        if (this.vy.sf == null || (gto = this.vy.sf.gto()) == null || (pcc = gto.pcc()) == null) {
            return;
        }
        if (this.vy.xb) {
            pcc.kj(this.vy.fum.hc());
        } else {
            pcc.vy(this.vy.fum.hc());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc
    public FrameLayout qf() {
        if (this.wh.wh()) {
            if (this.vy == null || this.vy.yt == null) {
                return null;
            }
            return this.vy.yt.sf();
        }
        if (this.vy == null || this.vy.mu == null) {
            return null;
        }
        return this.vy.mu.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
        if (this.vy.sf.zx() != 100.0f) {
            this.lo = true;
        }
        super.pq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void nn() {
        super.nn();
        this.vj = false;
        this.vy.yt.sf(false);
        this.vy.fum.xb();
    }
}
