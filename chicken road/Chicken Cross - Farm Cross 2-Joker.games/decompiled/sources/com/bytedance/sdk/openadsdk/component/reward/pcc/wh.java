package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.yt;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh {
    private pcc gm;
    private final sf pcc;
    private final com.bytedance.sdk.openadsdk.component.reward.view.qf sf;

    public interface pcc {
        void pcc(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar, int i);
    }

    private boolean pcc(int i) {
        return i < 0 || i > 20000;
    }

    public wh(sf sfVar) {
        this.pcc = sfVar;
        this.sf = new com.bytedance.sdk.openadsdk.component.reward.view.qf(sfVar);
    }

    public void pcc() {
        this.sf.pcc();
    }

    public void sf() {
        this.sf.gm();
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.vj vjVar) {
        this.sf.pcc(vjVar);
    }

    public void pcc(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar, int i) {
        if (this.pcc != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.pcc.sf);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(this.pcc.sf);
        }
        new StringBuilder("showEndCard() called with: isSkip = [").append(z).append("], force = [").append(z2).append("], isFromLandingPage = [").append(z3).append("], mAdType = [").append(sfVar);
        if (this.pcc.rnn.isFinishing() || sfVar == null) {
            return;
        }
        this.pcc.mu.hc();
        if (z2) {
            this.pcc.tmg.set(true);
        }
        if (this.pcc.tmh && !this.pcc.hc.get() && !lo.gbb(this.pcc.sf) && !lo.tmg(this.pcc.sf) && (!lo.sf(this.pcc.sf) || !this.pcc.tmg.get() || !this.pcc.gbb.get())) {
            if ((lo.sf(this.pcc.sf) && z3) || !sf(z2)) {
                return;
            }
            if (lo.sf(this.pcc.sf) || lo.oo(this.pcc.sf) || lo.kj(this.pcc.sf)) {
                this.pcc.zti.gm(false);
                sfVar.hc();
                return;
            }
        }
        if (this.pcc.rnn.isDestroyed() || this.pcc.rnn.isFinishing()) {
            return;
        }
        if (this.pcc.sf.nmd()) {
            com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.pcc.yt;
            com.bytedance.sdk.openadsdk.core.ork.gm brandBannerController = (vyVar == null || vyVar.pcc() == null) ? null : vyVar.pcc().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.sf();
            }
            this.pcc.rnn.finish();
            return;
        }
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(z, z2, z3, sfVar, i);
            return;
        }
        this.pcc.fum.lo();
        this.pcc.ye.tz();
        this.pcc.ork.set(false);
        if (!this.pcc.otd || !(this.pcc.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj) || this.pcc.ywp.rnn()) {
            this.pcc.vh.set(false);
        }
        this.pcc.mk.pcc();
        this.pcc.zti.pcc(this.pcc.sf.dk());
        if (this.pcc.vy.getAndSet(true)) {
            return;
        }
        if (atb.sf(this.pcc.sf) && this.pcc.rt) {
            pcc(z, z2, z3, i);
            this.pcc.mu.oo(8);
            this.pcc.zti.gm(true);
            this.pcc.of.ork();
            com.bytedance.sdk.openadsdk.core.jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.wh.1
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.pcc.mu.gm();
                    if (wh.this.pcc.yt != null) {
                        wh.this.pcc.yt.wh();
                    }
                }
            });
            return;
        }
        pcc(z, sfVar);
    }

    private void pcc(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        if (this.pcc.ye.tsz()) {
            i2 = 1;
        } else {
            i2 = !this.pcc.ye.gbb() ? -1 : 2;
        }
        hashMap.put("webview_state", Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc.sf, this.pcc.vj, z, z2, z3, this.pcc.rnn.isFinishing(), i, hashMap);
    }

    public void pcc(boolean z, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        this.pcc.jr.set(z);
        sfVar.tmg();
        this.pcc.sf.on();
        this.pcc.zti.oo(false);
        this.pcc.zti.gm(false);
        this.pcc.ye.of();
        if (this.pcc.mu.dax != null) {
            this.pcc.mu.dax.vj();
        }
        this.pcc.mu.gm();
        if (this.pcc.yt != null) {
            this.pcc.yt.wh();
        }
        if (this.pcc.of != null) {
            this.pcc.of.gm(vy.sf);
        }
        if (!TextUtils.isEmpty(of.pcc(this.pcc.kun, this.pcc.sf))) {
            yt.pcc(this.pcc.rnn, atb.tmg(this.pcc.sf), this.pcc.sf, sf.pcc.gm, true);
            return;
        }
        if (of.gm(this.pcc.sf) && this.pcc.lq != null) {
            this.pcc.lq.wh();
        }
        if (of.pcc(this.pcc.sf) || ((!of.gm(this.pcc.sf) && this.pcc.ye.atb()) || !of.pcc(this.pcc.sf, this.pcc.ye.tsz(), this.pcc.ye.zti(), this.pcc.lq.tmg(), this.pcc.ye.yt()))) {
            oo();
            return;
        }
        if (!of.oo(this.pcc.sf) && !of.gm(this.pcc.sf)) {
            this.pcc.ye.pcc(true, 0, (String) null);
        }
        sf(sfVar);
        pcc(sfVar);
    }

    void pcc(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        if (!of.gm(this.pcc.sf)) {
            this.pcc.lq.pcc(8);
            this.pcc.ye.pcc(0);
            this.pcc.ye.ye();
        } else {
            this.pcc.ye.pcc(8);
            this.pcc.lq.pcc(0);
            this.pcc.lq.qf();
        }
        this.pcc.mu.oo(8);
        this.pcc.mu.qf();
        if (of.gm(this.pcc.sf)) {
            this.pcc.rj.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        this.pcc.ye.pcc(this.pcc.xb, true);
        this.pcc.ye.gm(true);
        this.pcc.ye.sf(true);
        mu vy = this.pcc.ye.vy();
        if (vy != null) {
            vy.pcc("prerender_page_show", (JSONObject) null);
        }
        if (!atb.sf(this.pcc.sf)) {
            this.pcc.zti.gm(false);
        }
        com.bytedance.sdk.component.vy.qf kj = this.pcc.ye.kj();
        if (kj == null || kj.getWebView() == null) {
            return;
        }
        kj.tmg();
        kj.getWebView().resumeTimers();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.model.atb.qf(r4.pcc.sf) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sf(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        boolean z;
        this.pcc.qf = wh();
        int i = this.pcc.qf;
        if (this.pcc.sf.lo()) {
            return false;
        }
        if (this.pcc.qf == -1) {
            if (this.pcc.ywp == null && atb.kj(this.pcc.sf) && this.pcc.ye.hc()) {
                sfVar.fum();
                z = false;
            } else {
                sfVar.hc();
                z = true;
            }
        } else {
            if (this.pcc.qf >= 0) {
                this.pcc.lu.set(false);
                Message obtain = Message.obtain();
                obtain.what = 700;
                obtain.arg1 = this.pcc.qf;
                this.pcc.rj.sendMessage(obtain);
            }
            z = false;
        }
        if (!(this.pcc.ye.lo() ? false : z) || this.pcc.gh == null || !this.pcc.qf()) {
            return true;
        }
        this.pcc.gh.pcc(this.pcc, r0.qf);
        return true;
    }

    private int sf(int i) {
        if (i <= 1000) {
            return 1000;
        }
        return (i / 1000) * 1000;
    }

    private int wh() {
        sf sfVar = this.pcc;
        if (sfVar != null && sfVar.sf != null) {
            int orc = this.pcc.sf.orc();
            if (com.bytedance.sdk.openadsdk.core.lu.oo() == null) {
                return -1;
            }
            int pcc2 = com.bytedance.sdk.openadsdk.core.lu.oo().pcc(this.pcc.sf.kot());
            if (!pcc(orc) && !pcc(pcc2)) {
                return Math.min(sf(orc), sf(pcc2));
            }
        }
        return -1;
    }

    public void gm() {
        this.sf.oo();
    }

    public void oo() {
        pcc(true);
    }

    public void pcc(boolean z) {
        if (!of.oo(this.pcc.sf)) {
            this.pcc.ye.pcc(false, 408, "end_card_timeout");
        }
        this.pcc.ye.sf(com.bytedance.sdk.openadsdk.core.hc.wh.pcc.gm.pcc() ? 1 : 0);
        this.pcc.ye.pcc(8);
        this.pcc.lq.pcc(8);
        this.pcc.mu.oo(8);
        if (this.pcc.sf.on()) {
            if (!this.sf.pcc(this.pcc.fum)) {
                this.pcc.rnn.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.pcc.ywp;
            if (kjVar != null) {
                this.sf.pcc(kjVar.rj().ork());
            }
            this.sf.sf();
        }
        this.pcc.mu.qf();
        if (z) {
            sf(this.pcc.ew);
        }
        this.pcc.zti.gm(false);
        this.pcc.jsj.pcc(this.pcc.sf.tuy());
    }

    public void pcc(pcc pccVar) {
        this.gm = pccVar;
    }

    public boolean vj() {
        return this.sf.vj();
    }

    private boolean sf(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc2;
        if (!lo.gm(this.pcc.sf) || (pcc2 = this.pcc.yt.pcc()) == null || pcc2.oo != 0 || z) {
            return true;
        }
        this.pcc.zti.gm(false);
        return false;
    }
}
