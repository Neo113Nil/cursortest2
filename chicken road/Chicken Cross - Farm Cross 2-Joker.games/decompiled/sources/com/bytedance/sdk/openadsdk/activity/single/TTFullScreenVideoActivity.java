package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.dax;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.pcc.gm.sf jr;
    private boolean dax;
    private com.bytedance.sdk.openadsdk.pcc.gm.sf gbb;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void gm() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean jsj() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected dax kj() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean qy() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.ork) {
            jr = this.gbb;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void fum() {
        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc;
        super.fum();
        if (this.sf == null || (pcc = this.sf.yt.pcc()) == null) {
            return;
        }
        pcc.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                TTFullScreenVideoActivity.this.kun();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.sf == null || of.vj(this.sf.sf)) {
            return;
        }
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez = this.sf.sf.kez();
        if (kez == null) {
            com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar = new com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf();
            sfVar.pcc(10.0d);
            this.sf.sf.pcc(sfVar);
        } else if (kez.wh() <= 0.0d) {
            kez.pcc(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pcc(Intent intent) {
        super.pcc(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
        if (this.ork) {
            super.pcc(bundle);
            this.gbb = (com.bytedance.sdk.openadsdk.pcc.gm.sf) atb.pcc().pcc(this.mu, com.bytedance.sdk.openadsdk.pcc.gm.sf.class);
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.gm.sf gm = atb.pcc().gm();
        this.gbb = gm;
        if (gm != null || bundle == null) {
            return;
        }
        this.gbb = jr;
        jr = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void yt() {
        final View ork = this.sf.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.sf.ye.lo() && TTFullScreenVideoActivity.this.sf.vy.get()) {
                        boolean hc = TTFullScreenVideoActivity.this.sf.lq.hc();
                        TTFullScreenVideoActivity.this.sf.ye.wh(hc);
                        TTFullScreenVideoActivity.this.sf.mu.wh(8);
                        View view2 = ork;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                            ((com.bytedance.sdk.openadsdk.core.wh.oo) view2).setImageResource(tz.oo(TTFullScreenVideoActivity.this.sf.kun, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.sf.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!of.gm(TTFullScreenVideoActivity.this.sf.sf)) {
                            return;
                        }
                        if (of.gm(TTFullScreenVideoActivity.this.sf.sf) && hc) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.sf.ye.fum();
                    TTFullScreenVideoActivity.this.sf.lq.vh();
                    TTFullScreenVideoActivity.this.sf.jsj.wh();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.sf.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                com.bytedance.sdk.openadsdk.core.model.oo gto;
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                if (com.bytedance.sdk.openadsdk.core.model.atb.wh(TTFullScreenVideoActivity.this.sf.sf) || (com.bytedance.sdk.openadsdk.core.model.atb.vj(TTFullScreenVideoActivity.this.sf.sf) && TTFullScreenVideoActivity.this.sf.of.oo(com.bytedance.sdk.openadsdk.component.reward.pcc.vy.sf))) {
                    if (com.bytedance.sdk.openadsdk.core.model.atb.kj(TTFullScreenVideoActivity.this.sf.sf)) {
                        TTFullScreenVideoActivity.this.sf.of.vy();
                        return;
                    }
                    View view2 = ork;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (lo.pcc(TTFullScreenVideoActivity.this.sf.sf) && !TTFullScreenVideoActivity.this.sf.hc.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                jr.pcc pccVar = new jr.pcc();
                pccVar.sf(TTFullScreenVideoActivity.this.sf.fum.hc());
                pccVar.oo(TTFullScreenVideoActivity.this.sf.fum.jsj());
                pccVar.gm(TTFullScreenVideoActivity.this.sf.fum.nac());
                pccVar.gm(3);
                pccVar.oo(TTFullScreenVideoActivity.this.sf.fum.qy());
                pccVar.pcc(TTFullScreenVideoActivity.this.sf.fum.sf());
                com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(TTFullScreenVideoActivity.this.sf.fum.kj(), pccVar, TTFullScreenVideoActivity.this.sf.fum.vj());
                mk.gm(TTFullScreenVideoActivity.this.sf.wh);
                TTFullScreenVideoActivity.this.sf.fum.pcc("skip", false);
                TTFullScreenVideoActivity.this.sf.zti.oo(false);
                if (TTFullScreenVideoActivity.this.sf.gm) {
                    if (lo.gm(TTFullScreenVideoActivity.this.sf.sf)) {
                        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc2 = TTFullScreenVideoActivity.this.sf.yt.pcc();
                        if (pcc2 == null || pcc2.oo != 0) {
                            TTFullScreenVideoActivity.this.pcc(true, 4);
                        }
                    } else {
                        TTFullScreenVideoActivity.this.pcc(true, 4);
                    }
                    if (TTFullScreenVideoActivity.this.sf.sf != null && (gto = TTFullScreenVideoActivity.this.sf.sf.gto()) != null && (pcc = gto.pcc()) != null) {
                        pcc.wh(TTFullScreenVideoActivity.this.sf.fum.hc());
                        pcc.vj(TTFullScreenVideoActivity.this.sf.fum.hc());
                    }
                    com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(TTFullScreenVideoActivity.this.sf.sf, 5);
                }
                TTFullScreenVideoActivity.this.finish();
                if (TTFullScreenVideoActivity.this.sf.sf != null) {
                    pcc.wh(TTFullScreenVideoActivity.this.sf.fum.hc());
                    pcc.vj(TTFullScreenVideoActivity.this.sf.fum.hc());
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(TTFullScreenVideoActivity.this.sf.sf, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.oo gto;
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                TTFullScreenVideoActivity.this.sf.xb = !TTFullScreenVideoActivity.this.sf.xb;
                TTFullScreenVideoActivity.this.sf.fum.pcc(TTFullScreenVideoActivity.this.sf.xb, str);
                if (!com.bytedance.sdk.openadsdk.core.model.atb.dax(TTFullScreenVideoActivity.this.sf.sf) || TTFullScreenVideoActivity.this.sf.vy.get()) {
                    TTFullScreenVideoActivity.this.sf.ye.vj(TTFullScreenVideoActivity.this.sf.xb);
                    TTFullScreenVideoActivity.this.sf.of.sf(TTFullScreenVideoActivity.this.sf.xb);
                    if (TTFullScreenVideoActivity.this.sf.sf == null || (gto = TTFullScreenVideoActivity.this.sf.sf.gto()) == null || (pcc = gto.pcc()) == null) {
                        return;
                    }
                    if (TTFullScreenVideoActivity.this.sf.xb) {
                        pcc.kj(TTFullScreenVideoActivity.this.sf.fum.hc());
                    } else {
                        pcc.vy(TTFullScreenVideoActivity.this.sf.fum.hc());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                TTFullScreenVideoActivity.this.sf.mk.pcc(TTFullScreenVideoActivity.this.gm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View view2 = ork;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.mu.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pcc(long j, long j2) {
        pcc((int) (j / 1000));
        if (this.vj >= 0) {
            this.sf.zti.pcc(String.valueOf(this.vj), null);
        }
    }

    public void pcc(int i) {
        int bm = this.sf.sf.bm();
        if (!lu.oo().wh(String.valueOf(this.sf.wh)) || (!of.vj(this.sf.sf) && !this.sf.gm)) {
            if (i >= bm) {
                if (!this.sf.hoh) {
                    this.sf.pcc(true);
                }
                vy();
                return;
            }
            return;
        }
        if (!this.sf.hoh) {
            this.sf.pcc(true);
        }
        if (i <= bm) {
            gm(bm - i);
            this.sf.zti.vj(false);
        } else {
            vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void vy() {
        if (!of.vj(this.sf.sf) && !this.sf.gm) {
            this.sf.zti.pcc(null, "X");
        } else {
            this.sf.zti.pcc(null, TTAdDislikeToast.getSkipText());
        }
        this.sf.zti.vj(true);
    }

    private void gm(int i) {
        this.sf.zti.pcc(null, String.format(tz.pcc(lu.pcc(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
        if (this.sf.sf.zx() != 100.0f) {
            this.dax = true;
        }
        kun();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void gpj() {
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.pcc();
        } else {
            ork.pcc(this.sf != null ? this.sf.sf : null, "show", 0);
        }
        if (tsz()) {
            this.sf.yt.hc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void qcw() {
        kun();
        this.sf.sf.hu();
        this.sf.sf.oo(true);
        if (this.sf.vy.get() || !of.vj(this.sf.sf)) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.sf.sf, this.sf.vj, this.sf.sf.zex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kun() {
        new StringBuilder("invoke callback onAdClicked, ").append(this);
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.sf != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.sf.sf);
        }
        try {
            wh();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        wh();
        pcc(isFinishing(), isChangingConfigurations());
        if (this.ork) {
            return;
        }
        this.gbb = null;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.ork) {
            return;
        }
        jr = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void sf() {
        new StringBuilder("invoke callback onAdClose, ").append(this);
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.sf();
        } else {
            ork.pcc(this.sf != null ? this.sf.sf : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.sf == null || !sf(this.sf.sf) || pcc(this.sf.sf)) {
            return;
        }
        if (this.dax) {
            this.dax = false;
            finish();
        } else if (this.sf.ye.jsj()) {
            finish();
        }
    }

    private boolean pcc(of ofVar) {
        return ofVar == null || ofVar.zx() == 100.0f;
    }

    private boolean sf(of ofVar) {
        if (ofVar == null) {
            return false;
        }
        return lu.oo().fum(String.valueOf(this.sf.wh));
    }
}
