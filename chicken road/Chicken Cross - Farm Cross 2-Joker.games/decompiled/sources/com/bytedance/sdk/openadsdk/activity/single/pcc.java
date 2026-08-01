package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.component.reward.pcc.wh;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.dax;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class pcc extends kj implements tsz.pcc, wh.pcc {
    private boolean atb;
    private Bundle fum;
    protected int gm;
    private long jsj;
    private int lo;
    private CountDownTimer mk;
    private boolean of;
    protected boolean oo;
    protected final tsz pcc;
    private long qy;
    protected com.bytedance.sdk.openadsdk.component.reward.sf.sf sf;
    private boolean tsz;
    private int tz;
    protected boolean vj;
    private boolean yt;

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
    }

    public abstract FrameLayout qf();

    protected abstract void sf();

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
    }

    public pcc(sf sfVar, of ofVar, int i, int i2, boolean z) {
        super(sfVar, ofVar, i, i2, z);
        this.pcc = new tsz(Looper.getMainLooper(), this);
        this.lo = 1;
        this.tz = 0;
        this.of = false;
        this.oo = false;
        ew();
    }

    private void ew() {
        this.tsz = atb.gm(this.wh) && this.wh.aj();
        if (this.tsz) {
            this.jsj = this.wh.jk() * 1000;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void pcc(Activity activity, Bundle bundle) {
        this.fum = bundle;
        super.pcc(activity, bundle);
        pcc(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final com.bytedance.sdk.openadsdk.component.reward.view.kj pcc() {
        return this.vy.nn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Activity activity, sf.vj vjVar) {
        try {
            this.lo = this.wh.ial();
            pcc(activity, this.wh, this.fum);
            if (this.vy.gdh && this.wh.aj()) {
                this.vy.xb = vjVar.oo;
            }
            if (this.vy.gdh && this.ork > 0) {
                this.vy.xb = vjVar.oo;
            }
            tmh();
            gh();
            if (lo.wh(this.wh)) {
                bg();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.dax.oo.sf();
            iv();
        }
    }

    private void pcc(Activity activity, of ofVar, Bundle bundle) {
        this.vy = new com.bytedance.sdk.openadsdk.component.reward.pcc.sf(activity, this.pcc, ofVar, this, 1, this.qf.sf(), this.vy);
        this.vy.gdh = this.qf.wh();
        this.vy.otd = this.hc;
        this.vy.bbd = this.vy.gdh && lo.wh(ofVar);
        this.vy.ei = this.qf.oo();
        this.vy.vgx = this.qf.yt();
        this.vy.ywp = this;
        this.vy.atb = this.qf.tz();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.vy, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(intent, this.vy);
            ofVar.pcc(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.vy.hoh) {
            sf();
        }
        this.sf = com.bytedance.sdk.openadsdk.component.reward.sf.wh.pcc(this.vy);
        this.vy.ew = this.sf;
        this.vy.pq.pcc(this);
        if (this.vy.gdh) {
            this.vy.fum.pcc(new pcc.InterfaceC0164pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.1
                @Override // com.bytedance.sdk.openadsdk.core.jr.oo.pcc.InterfaceC0164pcc
                public void pcc(int i) {
                    if (pcc.this.qf == null) {
                        return;
                    }
                    pcc.this.qf.sf(pcc.this, i);
                }
            });
            if (!this.qf.jsj()) {
                this.qf.yt().setShowSound(of.vj(ofVar));
            }
        }
        dax.pcc(ofVar, this.vy.kun, this.vy.vj, this.vy.tsx);
        new StringBuilder("init: mAdType = ").append(this.sf);
    }

    private void tmh() {
        this.vy.nn.pcc(this.sf);
        this.sf.pcc(this, this.pcc);
        this.sf.ork();
    }

    private void gh() {
        this.sf.yt();
        this.gm = (int) this.vy.fum.tsx();
        if (this.vy.gdh) {
            pcc(this.vy.jsj.vj());
            pcc(this.vy.jsj.oo());
        }
        a_();
        ei();
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.gm.sf sfVar) {
        if (sfVar != null) {
            HashMap hashMap = new HashMap();
            try {
                int i = this.vh + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                hashMap.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            sfVar.pcc(hashMap);
        }
    }

    private boolean gdh() {
        if (this.wh.wh()) {
            return this.vy.vy.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Activity activity) {
        super.pcc(activity);
        if (this.vy == null) {
            return;
        }
        this.vy.qy.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gm() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        super.gm();
        if (this.vy == null || (sfVar = this.sf) == null) {
            return;
        }
        sfVar.jr();
        this.vy.ri = true;
        if (gdh()) {
            this.vy.zti.pcc(this.vy.sf.dk());
        }
        this.vy.mu.dax();
        this.vy.ye.nac();
        this.vy.of.vj();
        if (this.sf.sf()) {
            this.vy.fum.pcc(this.sf);
            if (this.vy.fum.hpk()) {
                pcc(this.vy.fum.jr(), true);
            } else if (this.vy.fum.qf() && this.qf.jsj()) {
                nn();
            } else {
                this.vy.fum.pcc(false, this, this.tz != 0);
            }
        }
        this.tz++;
        otd();
        if (this.vy.yt != null) {
            this.vy.yt.qf();
        }
        this.vy.qy.pcc(this.pcc);
        if (this.qf.jsj()) {
            this.vy.yt.pcc(0, false);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.tsz) {
            long j = this.qy;
            if (j != 0 && currentTimeMillis - j > this.jsj) {
                rj().pcc(this, pcc(8));
                return;
            }
            if (j != 0) {
                this.jsj -= currentTimeMillis - j;
            }
            pcc(this.jsj);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.bytedance.sdk.openadsdk.activity.single.pcc$2] */
    private void pcc(long j) {
        this.mk = new CountDownTimer(j, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.2
            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                pcc.this.jsj = j2;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                sf rj = pcc.this.rj();
                pcc pccVar = pcc.this;
                rj.pcc(pccVar, pccVar.pcc(8));
            }
        }.start();
    }

    private void otd() {
        if (this.wh.wh() && !this.of) {
            this.of = true;
            pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] pcc;
                    if (!pcc.this.qf.jsj()) {
                        pcc = pcc.this.vy.qy.pcc(pcc.this.lo);
                    } else {
                        pcc = new float[]{rj.gm(pcc.this.vy.rnn, pcc.this.vy.nn.getWidth()), rj.gm(pcc.this.vy.rnn, pcc.this.vy.nn.getHeight())};
                    }
                    if (pcc.this.vy.tsz.pcc()) {
                        pcc.this.vy.tsz.pcc(pcc.this.wh);
                    } else {
                        pcc.this.vy.tsz.pcc(pcc);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void oo() {
        super.oo();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.lu();
    }

    private void ei() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        if (this.wh.wh() || (sfVar = this.sf) == null) {
            return;
        }
        sfVar.pcc(this.vy.mu.wh());
        this.sf.of();
    }

    public final void pcc(boolean z, int i) {
        pcc(z, false, i);
    }

    public final void pcc(boolean z, boolean z2, int i) {
        this.vy.pq.pcc(z, z2, false, this.vy.ew, i);
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vj() {
        int i = this.ork;
        if (this.qf != null) {
            this.qf.pcc(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(boolean z) {
        int i = this.ork;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.qf == null) {
            return;
        }
        this.qf.sf(this, pcc(7));
    }

    protected final void wh() {
        Message message = new Message();
        message.what = 400;
        if (this.wh.tuy()) {
            sf(10000);
        }
        this.pcc.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public boolean pcc(long j, boolean z) {
        if (this.vy == null) {
            return false;
        }
        this.vy.yt.sf(false);
        this.vj = false;
        com.bytedance.sdk.openadsdk.oo.qf vy = vy();
        if (qf() == null) {
            return false;
        }
        this.vy.fum.pcc(qf(), vy);
        Map<String, Object> kj = this.wh.wh() ? kj() : null;
        gm.pcc pccVar = new gm.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.pcc.4
            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void pcc(long j2, int i) {
                boolean z2 = pcc.this.vj;
                if (pcc.this.vj) {
                    return;
                }
                pcc.this.vj = true;
                boolean wh = pcc.this.wh.wh();
                pcc.this.pcc.removeMessages(300);
                pcc.this.lu();
                pcc.this.vy.fum.pcc(j2, j2);
                if (wh) {
                    pcc.this.vy.yt.sf(true);
                } else {
                    pcc.this.vy.dax.set(true);
                }
                if (pcc.this.vy.sf.bg() == 36 && pcc.this.vy.gm) {
                    pcc.this.vy.tz.gm().pcc(pcc.this.vy.sf);
                    dax.sf();
                }
                if (!wh && pcc.this.vy.sf.giw()) {
                    pcc.this.vy.sf.zsj(1);
                    pcc.this.vy.mu.lu();
                }
                if (pcc.this.vy.sf.bg() == 21 && !pcc.this.vy.sf.gpj()) {
                    pcc.this.vy.sf.vj(true);
                    pcc.this.vy.mu.lu();
                }
                sf.vj pcc = pcc.this.pcc(5);
                pcc.vj = true;
                pcc.this.qf.pcc(pcc.this, pcc);
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void sf(long j2, int i) {
                pcc.this.vy.fum.vh();
                if (pcc.this.vy.mu.dax != null) {
                    pcc.this.vy.mu.dax.ork();
                }
                if (pcc.this.vy.fum.wh()) {
                    pcc.this.wh();
                    return;
                }
                pcc.this.vy.fum.lo();
                if (pcc.this.wh.wh()) {
                    pcc.this.vy.yt.pcc(true);
                }
                sf sfVar = pcc.this.qf;
                pcc pccVar2 = pcc.this;
                sfVar.pcc(pccVar2, pccVar2.pcc(3));
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void pcc() {
                pcc.this.vy.fum.vh();
                pcc.this.lu();
                sf sfVar = pcc.this.qf;
                pcc pccVar2 = pcc.this;
                sfVar.pcc(pccVar2, pccVar2.pcc(6));
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void pcc(long j2, long j3) {
                if (!pcc.this.vy.ri && pcc.this.vy.fum.wh()) {
                    pcc.this.vy.fum.sf(true);
                }
                if (pcc.this.vy.vy.get()) {
                    return;
                }
                if (j2 != pcc.this.vy.fum.gbb()) {
                    pcc.this.lu();
                }
                if (!pcc.this.vy.fum.wh()) {
                    pcc.this.pcc.removeMessages(300);
                    return;
                }
                pcc.this.vy.fum.pcc(j2, j3);
                int i = (int) (j2 / 1000);
                if ((pcc.this.vy.nac.get() || pcc.this.vy.ork.get()) && pcc.this.vy.fum.wh()) {
                    pcc.this.vy.fum.tz();
                }
                if (pcc.this.vy.oo) {
                    pcc.this.vy.mu.vj(i);
                }
                if (pcc.this.wh.wh() && pcc.this.vy.yt != null && pcc.this.vy.yt.pcc() != null) {
                    pcc.this.vy.yt.pcc().setTime(String.valueOf(pcc.this.gm), i, 0, false);
                    pcc.this.vy.yt.pcc().pcc(j2, j3);
                }
                pcc.this.pcc((j2 * 1.0f) / j3);
                pcc.this.vy.pcc(true);
            }
        };
        this.vy.fum.pcc(pccVar);
        if (!this.wh.wh() && this.vy.mu.dax != null) {
            this.vy.mu.dax.pcc(pccVar);
        }
        return this.vy.fum.pcc(j, z, kj, this.sf);
    }

    public Map<String, Object> kj() {
        HashMap hashMap = new HashMap();
        if (this.vy != null && this.vy.yt != null && this.wh != null && this.wh.ei() == 2) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.vy.yt.vh()));
            JSONObject pcc = this.vy.yt.pcc((JSONObject) null);
            if (pcc != null) {
                Iterator<String> keys = pcc.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        hashMap.put(next, pcc.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return hashMap;
    }

    public com.bytedance.sdk.openadsdk.oo.qf vy() {
        if (this.wh.wh()) {
            if (this.vy != null && this.vy.yt != null && this.vy.yt.pcc() != null) {
                return this.vy.yt.pcc().getAdShowTime();
            }
            com.bytedance.sdk.openadsdk.oo.qf qfVar = new com.bytedance.sdk.openadsdk.oo.qf();
            qfVar.pcc(System.currentTimeMillis(), 1.0f);
            return qfVar;
        }
        com.bytedance.sdk.openadsdk.oo.qf qfVar2 = new com.bytedance.sdk.openadsdk.oo.qf();
        qfVar2.pcc(System.currentTimeMillis(), 1.0f);
        return qfVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ork() {
        super.ork();
        if (this.wh.wh()) {
            this.vy.yt.hc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void vh() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.vh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void tmg() {
        if (this.qf == null) {
            return;
        }
        this.qf.sf(this, pcc(10));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void hc() {
        super.hc();
        if (this.vy == null || com.bytedance.sdk.component.utils.sf.pcc(lrr())) {
            return;
        }
        this.vy.ye.qy();
        com.bytedance.sdk.openadsdk.utils.oo.pcc(lrr(), this.vy.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gbb() {
        super.gbb();
        if (this.tsz) {
            this.qy = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.mk;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.nac();
        if (this.vy.yt != null) {
            this.vy.yt.kj();
        }
        if (this.qf.jsj()) {
            this.vy.yt.pcc(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void jr() {
        this.vy.fum.kun();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final View dax() {
        return this.vy.fum.rj();
    }

    protected final void lu() {
        this.pcc.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gpj() {
        super.gpj();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.sf(this.lu);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.wh.pcc
    public void pcc(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar, int i) {
        pcc(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void lo() {
        super.lo();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.lo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(kj kjVar, kj kjVar2, sf.vj vjVar) {
        super.pcc(kjVar, kjVar2, vjVar);
        if (kjVar == this && (kjVar2 instanceof vj)) {
            if (vjVar.sf == 3) {
                this.vy.fum.pcc(!this.vy.fum.rnn() ? 1 : 0, 2);
            } else if (vjVar.sf == 6) {
                this.vy.fum.pcc(!this.vy.fum.rnn() ? 1 : 0, !this.vy.fum.rnn() ? 1 : 0);
            } else if (vjVar.sf == 5 && !of.vj(this.vy.sf) && vjVar.vj) {
                this.vy.fum.pcc("skip", true);
            }
            this.vy.zti.pcc(false);
            this.vy.zti.oo(false);
        }
    }

    public void pcc(float f) {
        if (this.qf == null) {
            return;
        }
        this.qf.pcc(f);
        if (this.yt || this.wh.bg() == 43 || f < this.wh.ri() / 100.0f) {
            return;
        }
        kj qy = this.qf.qy();
        if (qy instanceof pcc) {
            ((pcc) qy).fum();
        }
    }

    public void fum() {
        if (this.yt) {
            return;
        }
        this.yt = true;
        erj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean tz() {
        return this.vy != null && this.vy.fum.pq();
    }

    protected sf.vj pcc(int i) {
        sf.vj vjVar = new sf.vj(i, this.vy);
        vjVar.oo = this.vy.xb;
        return vjVar;
    }

    public void of() {
        this.qf.pcc(this, pcc(sf.C0198sf.sf));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gm(boolean z) {
        if (this.vy == null || this.vy.jsj == null) {
            return;
        }
        this.vy.jsj.sf(z);
        this.vy.jsj.gm(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void oo(boolean z) {
        if (this.qf != null) {
            this.qf.pcc(this, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean qy() {
        return this.vy.yt.vy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Map<String, Object> map, float f, float f2) {
        super.pcc(map, f, f2);
        this.qf.pcc(map, this, f, f2);
    }

    public void jsj() {
        otd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void tsz() {
        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc;
        super.tsz();
        if (this.vy == null || (pcc = this.vy.yt.pcc()) == null || !pcc.qy()) {
            return;
        }
        kz();
    }

    public void mk() {
        if (this.vy == null) {
            return;
        }
        this.vy.fum.dax();
    }

    public void atb() {
        if (this.vy != null && this.vy.fum.vy()) {
            this.vy.fum.fum();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ye() {
        this.oo = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(of ofVar, int i, int i2) {
        super.pcc(ofVar, i, i2);
        ew();
        this.of = false;
        this.atb = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean lq() {
        return this.wh.rt() == 10 && !qy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean zti() {
        return this.vy.yt.ork() && !qy();
    }
}
