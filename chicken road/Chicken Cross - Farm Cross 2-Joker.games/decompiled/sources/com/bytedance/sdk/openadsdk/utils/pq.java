package com.bytedance.sdk.openadsdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;

/* loaded from: classes4.dex */
public class pq implements Handler.Callback, pcc.InterfaceC0164pcc {
    private boolean kj;
    private final com.bytedance.sdk.openadsdk.core.model.of oo;
    private int ork;
    private boolean qf;
    private int tmg;
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf vj;
    private boolean vy;
    private boolean wh;
    private float pcc = 1.0f;
    private int sf = 1000;
    private final Handler gm = new Handler(Looper.getMainLooper(), this);
    private int vh = 0;

    public boolean pcc() {
        return this.wh;
    }

    public void pcc(long j) {
        int ceil = (int) Math.ceil(j / 1000.0d);
        if (this.qf && !this.kj) {
            this.vh = ceil;
            gm();
        } else {
            if (this.wh || this.kj) {
                return;
            }
            this.vh = ceil;
            this.wh = true;
            sf();
        }
    }

    public pq(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        this.ork = 0;
        this.tmg = 0;
        this.vj = sfVar;
        this.oo = ofVar;
        if (ofVar.tuy()) {
            if (ofVar.quq() >= 0) {
                this.tmg = ofVar.quq();
            } else {
                this.tmg = com.bytedance.sdk.openadsdk.core.lu.oo().vh(String.valueOf(ofVar.kot()));
            }
        } else if (ofVar.qra()) {
            if (ofVar.bm() >= 0) {
                this.tmg = ofVar.bm();
            } else {
                this.tmg = com.bytedance.sdk.openadsdk.core.lu.oo().lo(String.valueOf(ofVar.kot()));
            }
        }
        this.ork = (int) sfVar.fum.tsx();
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "totalTime: " + this.ork + ", skipTime=" + this.tmg);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1024) {
            int i = this.ork - this.vh;
            this.vj.fum.pcc(this.vh * 1000);
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.vh + ", mRemainTimeInSeconds=" + i);
            if (i > 0) {
                if (this.vj.rnn instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) this.vj.rnn).gm(this.vh * 1000, this.ork);
                }
                boolean z = false;
                if (this.vj.yt != null && this.vj.yt.pcc() != null) {
                    this.vj.yt.pcc().setTime(String.valueOf(i), this.vh, 0, false);
                }
                if (this.oo.tuy()) {
                    if (this.vj.yt != null) {
                        if (this.vj.yt.vy() && this.tmg > 0) {
                            z = true;
                        }
                        this.vy = z;
                    }
                    if (this.vy && this.vh >= this.tmg && this.vj.sf.bg() != 5 && this.vj.sf.bg() != 33) {
                        this.vj.pcc(true);
                        this.vj.zti.pcc(String.valueOf(i), TTAdDislikeToast.getSkipText());
                        this.vj.zti.vj(true);
                    } else {
                        this.vj.zti.pcc(String.valueOf(i), null);
                    }
                } else if (this.oo.qra() && (this.vj.yt.vy() || this.vj.sf.nmd())) {
                    if (this.vj.rnn instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) this.vj.rnn).pcc(this.vh);
                    }
                    this.vj.zti.oo(true);
                    this.vj.zti.pcc(String.valueOf(i), null);
                }
                this.vh++;
                if (this.vj.fum.gm()) {
                    com.bytedance.sdk.openadsdk.core.model.ye uk = this.vj.sf.uk();
                    if (uk != null) {
                        float pcc = uk.pcc();
                        this.pcc = pcc;
                        if (pcc <= 0.0f) {
                            this.pcc = 1.0f;
                        }
                    }
                } else {
                    this.pcc = 1.0f;
                }
                int i2 = (int) (1000.0f / this.pcc);
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i2)));
                this.gm.sendEmptyMessageDelayed(message.what, i2);
            }
        }
        return true;
    }

    public void sf() {
        this.gm.sendEmptyMessage(1024);
        this.qf = false;
    }

    public void gm() {
        if (this.wh) {
            this.gm.removeMessages(1024);
            this.gm.sendEmptyMessage(1024);
            this.qf = false;
        }
    }

    public void oo() {
        if (!this.wh || this.qf) {
            return;
        }
        this.gm.removeMessages(1024);
        this.qf = true;
    }

    public void vj() {
        this.gm.removeMessages(1024);
        this.wh = false;
        this.kj = true;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vj;
        if (sfVar != null) {
            sfVar.fum.zti();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.pcc.InterfaceC0164pcc
    public void pcc(int i) {
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i)));
        if (i == 1) {
            gm();
            return;
        }
        if (i == 2) {
            oo();
        } else if (i == 3 || i == 4) {
            vj();
        }
    }
}
