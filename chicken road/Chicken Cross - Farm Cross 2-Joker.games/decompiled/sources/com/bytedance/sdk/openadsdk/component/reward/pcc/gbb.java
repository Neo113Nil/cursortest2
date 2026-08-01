package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class gbb {
    private com.bytedance.adsdk.ugeno.sf.gm gbb;
    private FrameLayout gm;
    private com.bytedance.adsdk.ugeno.sf.gm hc;
    private volatile long kj;
    private boolean nac;
    final of pcc;
    private volatile long qf;
    private final sf sf;
    private String vy;
    private volatile long wh;
    private final AtomicBoolean oo = new AtomicBoolean(false);
    private final AtomicBoolean vj = new AtomicBoolean(false);
    private final AtomicBoolean ork = new AtomicBoolean(false);
    private long vh = 0;
    private long tmg = 0;
    private String jr = null;
    private boolean dax = false;

    public gbb(sf sfVar) {
        this.sf = sfVar;
        this.pcc = sfVar.sf;
        this.vy = sfVar.vj;
    }

    public void pcc() {
        if (this.nac) {
            return;
        }
        this.nac = true;
        sf();
    }

    void sf() {
        this.gm = (FrameLayout) this.sf.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.nac);
    }

    public void gm() {
        com.bytedance.sdk.openadsdk.core.hc.kj.pcc nn;
        of ofVar = this.pcc;
        if (ofVar == null || (nn = ofVar.nn()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.hc.oo.sf sfVar = new com.bytedance.sdk.openadsdk.core.hc.oo.sf(this.sf.rnn, this.pcc, nn, this.vy, new com.bytedance.sdk.openadsdk.core.hc.qf.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gbb.1
            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
            public void pcc(String str) {
                gbb.this.vh = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
            public void pcc(int i, String str, String str2) {
                gbb.this.jr = str2;
                gbb.this.oo.set(false);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(gbb.this.pcc, false, gbb.this.vy, U3.g.e, SystemClock.elapsedRealtime() - gbb.this.vh, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
            public void sf(String str) {
                gbb.this.jr = str;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(gbb.this.pcc, false, gbb.this.vy, "success", SystemClock.elapsedRealtime() - gbb.this.vh, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.sf
            public void pcc() {
                gbb.this.vj();
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.sf
            public void pcc(int i, String str) {
                gbb.this.oo.set(false);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(gbb.this.pcc, gbb.this.vy, SystemClock.elapsedRealtime() - gbb.this.wh, i, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.sf
            public void pcc(com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
                gbb.this.hc = gmVar;
                gbb.this.oo.set(true);
                gbb.this.qf = SystemClock.elapsedRealtime();
                if (gbb.this.sf.ye.lo()) {
                    View ork = gbb.this.sf.mu.ork();
                    if (ork instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                        ((com.bytedance.sdk.openadsdk.core.wh.oo) ork).setImageResource(tz.oo(gbb.this.sf.kun, "tt_skip_btn"));
                    }
                }
                gbb.this.gbb();
                gbb.this.vy();
                com.bytedance.sdk.openadsdk.oo.gm.pcc(gbb.this.pcc, gbb.this.vy, gbb.this.qf - gbb.this.wh);
            }
        });
        if (this.pcc.rnn() != null) {
            sfVar.pcc(new com.bytedance.sdk.openadsdk.core.hc.qf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gbb.2
                @Override // com.bytedance.sdk.openadsdk.core.hc.qf.pcc
                public void sf() {
                }

                @Override // com.bytedance.sdk.openadsdk.core.hc.qf.pcc
                public String pcc() {
                    return Constants.NORMAL;
                }
            });
        }
        sfVar.pcc();
        sfVar.pcc(this.sf.mu.ork());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gbb() {
        com.bytedance.sdk.openadsdk.core.hc.kj.pcc rnn;
        of ofVar = this.pcc;
        if (ofVar == null || (rnn = ofVar.rnn()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.hc.oo.sf sfVar = new com.bytedance.sdk.openadsdk.core.hc.oo.sf(this.sf.rnn, this.pcc, rnn, this.vy, new com.bytedance.sdk.openadsdk.core.hc.qf.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gbb.3
            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.sf
            public void pcc() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
            public void pcc(String str) {
                gbb.this.tmg = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
            public void pcc(int i, String str, String str2) {
                gbb.this.vj.set(false);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(gbb.this.pcc, true, gbb.this.vy, U3.g.e, SystemClock.elapsedRealtime() - gbb.this.tmg, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
            public void sf(String str) {
                com.bytedance.sdk.openadsdk.oo.gm.pcc(gbb.this.pcc, true, gbb.this.vy, "success", SystemClock.elapsedRealtime() - gbb.this.tmg, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.sf
            public void pcc(int i, String str) {
                gbb.this.vj.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.sf
            public void pcc(com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
                gbb.this.gbb = gmVar;
                gbb.this.vj.set(true);
            }
        });
        sfVar.pcc(new com.bytedance.sdk.openadsdk.core.hc.qf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gbb.4
            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.pcc
            public String pcc() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.pcc
            public void sf() {
                gbb.this.dax = true;
                gbb.this.sf.mu.ork().performClick();
            }
        });
        sfVar.pcc();
        sfVar.pcc(this.sf.mu.ork());
    }

    public boolean oo() {
        return this.dax;
    }

    public void pcc(int i) {
        rj.pcc((View) this.gm, i);
    }

    public void vj() {
        this.wh = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc, this.vy);
    }

    public void wh() {
        this.kj = SystemClock.elapsedRealtime();
    }

    public void qf() {
        ork();
        vy();
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.hc;
        if (gmVar != null) {
            this.gm.addView(gmVar.vh(), new FrameLayout.LayoutParams(this.hc.nn(), this.hc.rnn()));
        }
    }

    public void kj() {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.gbb;
        if (gmVar != null) {
            this.gm.addView(gmVar.vh(), new FrameLayout.LayoutParams(this.gbb.nn(), this.gbb.rnn()));
        }
    }

    public void vy() {
        if (this.kj <= 0 || this.qf <= 0 || this.ork.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.qf - this.kj, this.pcc, this.vy, this.jr);
    }

    public void ork() {
        com.bytedance.sdk.openadsdk.oo.gm.gm(this.pcc, this.vy);
    }

    public void vh() {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(SystemClock.elapsedRealtime() - this.kj, this.pcc, this.vy);
    }

    public boolean tmg() {
        return this.oo.get();
    }

    public boolean hc() {
        return this.vj.get();
    }
}
