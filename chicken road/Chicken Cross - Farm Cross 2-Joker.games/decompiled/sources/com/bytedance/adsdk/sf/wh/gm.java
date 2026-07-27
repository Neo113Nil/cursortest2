package com.bytedance.adsdk.sf.wh;

import android.view.Choreographer;
import com.bytedance.adsdk.sf.qf;

/* loaded from: classes4.dex */
public class gm extends pcc implements Choreographer.FrameCallback {
    private qf ork;
    private float sf = 1.0f;
    private boolean gm = false;
    private long oo = 0;
    private float vj = 0.0f;
    private float wh = 0.0f;
    private int qf = 0;
    private float kj = -2.1474836E9f;
    private float vy = 2.1474836E9f;
    protected boolean pcc = false;
    private boolean vh = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(wh());
    }

    public float wh() {
        qf qfVar = this.ork;
        if (qfVar == null) {
            return 0.0f;
        }
        return (this.wh - qfVar.wh()) / (this.ork.qf() - this.ork.wh());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float jr;
        float dax;
        float jr2;
        if (this.ork == null) {
            return 0.0f;
        }
        if (lo()) {
            jr = dax() - this.wh;
            dax = dax();
            jr2 = jr();
        } else {
            jr = this.wh - jr();
            dax = dax();
            jr2 = jr();
        }
        return jr / (dax - jr2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        qf qfVar = this.ork;
        if (qfVar == null) {
            return 0L;
        }
        return (long) qfVar.vj();
    }

    public float qf() {
        return this.wh;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.pcc;
    }

    public void gm(boolean z) {
        this.vh = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        nac();
        if (this.ork == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.sf.vj.pcc("LottieValueAnimator#doFrame");
        float gpj = (this.oo != 0 ? j - r1 : 0L) / gpj();
        float f = this.vj;
        if (lo()) {
            gpj = -gpj;
        }
        float f2 = f + gpj;
        boolean gm = vj.gm(f2, jr(), dax());
        float f3 = this.vj;
        float sf = vj.sf(f2, jr(), dax());
        this.vj = sf;
        if (this.vh) {
            sf = (float) Math.floor(sf);
        }
        this.wh = sf;
        this.oo = j;
        if (!this.vh || this.vj != f3) {
            gm();
        }
        if (!gm) {
            if (getRepeatCount() != -1 && this.qf >= getRepeatCount()) {
                float jr = this.sf < 0.0f ? jr() : dax();
                this.vj = jr;
                this.wh = jr;
                lu();
                sf(lo());
            } else {
                pcc();
                this.qf++;
                if (getRepeatMode() == 2) {
                    this.gm = !this.gm;
                    vy();
                } else {
                    float dax = lo() ? dax() : jr();
                    this.vj = dax;
                    this.wh = dax;
                }
                this.oo = j;
            }
        }
        fum();
        com.bytedance.adsdk.sf.vj.sf("LottieValueAnimator#doFrame");
    }

    private float gpj() {
        qf qfVar = this.ork;
        if (qfVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / qfVar.tmg()) / Math.abs(this.sf);
    }

    public void kj() {
        this.ork = null;
        this.kj = -2.1474836E9f;
        this.vy = 2.1474836E9f;
    }

    public void pcc(qf qfVar) {
        boolean z = this.ork == null;
        this.ork = qfVar;
        if (z) {
            pcc(Math.max(this.kj, qfVar.wh()), Math.min(this.vy, qfVar.qf()));
        } else {
            pcc((int) qfVar.wh(), (int) qfVar.qf());
        }
        float f = this.wh;
        this.wh = 0.0f;
        this.vj = 0.0f;
        pcc((int) f);
        gm();
    }

    public void pcc(float f) {
        if (this.vj == f) {
            return;
        }
        float sf = vj.sf(f, jr(), dax());
        this.vj = sf;
        if (this.vh) {
            sf = (float) Math.floor(sf);
        }
        this.wh = sf;
        this.oo = 0L;
        gm();
    }

    public void pcc(int i) {
        pcc(i, (int) this.vy);
    }

    public void sf(float f) {
        pcc(this.kj, f);
    }

    public void pcc(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        qf qfVar = this.ork;
        float wh = qfVar == null ? -3.4028235E38f : qfVar.wh();
        qf qfVar2 = this.ork;
        float qf = qfVar2 == null ? Float.MAX_VALUE : qfVar2.qf();
        float sf = vj.sf(f, wh, qf);
        float sf2 = vj.sf(f2, wh, qf);
        if (sf == this.kj && sf2 == this.vy) {
            return;
        }
        this.kj = sf;
        this.vy = sf2;
        pcc((int) vj.sf(this.wh, sf, sf2));
    }

    public void vy() {
        gm(-ork());
    }

    public void gm(float f) {
        this.sf = f;
    }

    public float ork() {
        return this.sf;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.gm) {
            return;
        }
        this.gm = false;
        vy();
    }

    public void vh() {
        this.pcc = true;
        pcc(lo());
        pcc((int) (lo() ? dax() : jr()));
        this.oo = 0L;
        this.qf = 0;
        nac();
    }

    public void tmg() {
        lu();
        sf(lo());
    }

    public void hc() {
        lu();
        oo();
    }

    public void gbb() {
        this.pcc = true;
        nac();
        this.oo = 0L;
        if (lo() && qf() == jr()) {
            pcc(dax());
        } else if (!lo() && qf() == dax()) {
            pcc(jr());
        }
        vj();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        sf();
        lu();
    }

    private boolean lo() {
        return ork() < 0.0f;
    }

    public float jr() {
        qf qfVar = this.ork;
        if (qfVar == null) {
            return 0.0f;
        }
        float f = this.kj;
        return f == -2.1474836E9f ? qfVar.wh() : f;
    }

    public float dax() {
        qf qfVar = this.ork;
        if (qfVar == null) {
            return 0.0f;
        }
        float f = this.vy;
        return f == 2.1474836E9f ? qfVar.qf() : f;
    }

    @Override // com.bytedance.adsdk.sf.wh.pcc
    void sf() {
        super.sf();
        sf(lo());
    }

    protected void nac() {
        if (isRunning()) {
            oo(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void lu() {
        oo(true);
    }

    protected void oo(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.pcc = false;
        }
    }

    private void fum() {
        if (this.ork == null) {
            return;
        }
        float f = this.wh;
        if (f < this.kj || f > this.vy) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.kj), Float.valueOf(this.vy), Float.valueOf(this.wh)));
        }
    }
}
