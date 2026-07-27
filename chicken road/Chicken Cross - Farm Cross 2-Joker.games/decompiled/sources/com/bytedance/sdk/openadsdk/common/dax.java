package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.widget.sf;

/* loaded from: classes4.dex */
public abstract class dax {
    protected String gm;
    protected String oo;
    protected final com.bytedance.sdk.openadsdk.component.reward.pcc.sf qf;
    protected String sf;
    protected String vj;
    protected String wh;

    protected abstract void gm();

    protected abstract void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar);

    protected abstract void pcc(boolean z);

    protected abstract boolean pcc();

    protected abstract boolean sf();

    public dax(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.qf = sfVar;
        vj();
    }

    private void vj() {
        if (this.sf != null) {
            return;
        }
        try {
            this.sf = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_reward_msg");
            this.gm = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_msgPlayable");
            this.wh = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_negtiveBtnBtnText");
            this.oo = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_postiveBtnText");
            this.vj = com.bytedance.sdk.component.utils.tz.pcc(this.qf.kun, "tt_postiveBtnTextPlayable");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("RewardTipDialogHelper", "init res text failed：" + th.getMessage());
        }
    }

    public final boolean pcc(boolean z, boolean z2, Runnable runnable) {
        if (this.qf.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj) {
            if (!this.qf.oo || sf() || (this.qf.ywp.rj() != null && this.qf.ywp.rj().nac())) {
                return false;
            }
            if (!z2 && pcc()) {
                return false;
            }
            if (!qf()) {
                if (!z2) {
                    return false;
                }
                if (runnable == null && z) {
                    gm();
                    return true;
                }
            }
        } else {
            if (pcc(z2, runnable)) {
                return false;
            }
            if (!qf()) {
                return sf(z2, z, runnable);
            }
            if (sf()) {
                sf(z, runnable);
                return false;
            }
            if (vy()) {
                this.qf.of.vy();
                return false;
            }
        }
        gm(z, runnable);
        return true;
    }

    private boolean pcc(boolean z, Runnable runnable) {
        if (z || !pcc()) {
            return false;
        }
        if (!this.qf.gdh) {
            if (wh()) {
                return kj();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        oo();
        return true;
    }

    private boolean wh() {
        return !this.qf.gdh && this.qf.vy.get();
    }

    private boolean qf() {
        return com.bytedance.sdk.openadsdk.core.lu.oo().kj(String.valueOf(this.qf.wh));
    }

    private boolean sf(boolean z, boolean z2, Runnable runnable) {
        if ((z || !wh() || !kj()) && runnable == null) {
            if (z2) {
                gm();
                return true;
            }
            oo();
        }
        return false;
    }

    private void sf(boolean z, Runnable runnable) {
        if (!(wh() && kj()) && runnable == null) {
            if (z) {
                gm();
            } else {
                oo();
            }
        }
    }

    private void sf(boolean z) {
        this.qf.fum.tz();
        if (z) {
            this.qf.of.wh();
        }
        this.qf.nac.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(boolean z) {
        this.qf.fum.fum();
        if (z) {
            this.qf.of.pcc(1000);
        }
        this.qf.nac.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kj() {
        if (!atb.kj(this.qf.sf)) {
            return false;
        }
        this.qf.of.vy();
        return true;
    }

    private boolean vy() {
        return !this.qf.sf.xb() && atb.kj(this.qf.sf) && this.qf.ye.kj().getVisibility() == 0;
    }

    private void gm(final boolean z, final Runnable runnable) {
        sf(z);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
        if (sfVar == null || sfVar.rnn.isFinishing() || this.qf.rnn.isDestroyed()) {
            com.bytedance.sdk.component.utils.lo.gm("RewardTipDialogHelper", "adContext or activity is null");
            return;
        }
        final com.bytedance.sdk.openadsdk.core.widget.sf sfVar2 = new com.bytedance.sdk.openadsdk.core.widget.sf(this.qf.rnn);
        if (this.qf.ew == null) {
            com.bytedance.sdk.component.utils.lo.gm("RewardTipDialogHelper", "adContext or  adType == null");
            return;
        }
        this.qf.ew.tmg = sfVar2;
        if (z) {
            sfVar2.pcc(this.gm).gm(this.vj).oo(this.wh);
        } else {
            sfVar2.pcc(this.sf).gm(this.oo).oo(this.wh);
        }
        sfVar2.pcc(new sf.InterfaceC0181sf() { // from class: com.bytedance.sdk.openadsdk.common.dax.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void pcc() {
                dax.this.gm(z);
                sfVar2.dismiss();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void sf() {
                sfVar2.dismiss();
                dax.this.pcc(true);
                dax.this.qf.nac.set(false);
                dax.this.qf.of.sf(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                if (z) {
                    if (dax.this.qf.gdh || !dax.this.kj()) {
                        dax.this.qf.jsj.wh();
                        dax.this.gm();
                        return;
                    }
                    return;
                }
                dax.this.oo();
            }
        }).show();
    }

    public void oo() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.qf;
        if (sfVar == null) {
            com.bytedance.sdk.component.utils.lo.gm("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        if (sfVar.ywp != null && (this.qf.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj)) {
            if (((com.bytedance.sdk.openadsdk.activity.single.vj) this.qf.ywp).kj()) {
                return;
            }
            gm();
        } else {
            this.qf.fum.zti();
            pcc.pcc(this.qf);
            pcc(this.qf);
        }
    }
}
