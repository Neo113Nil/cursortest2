package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public class vy extends pcc {
    private com.bytedance.adsdk.sf.pcc.sf.nac gbb;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> hc;
    private final RectF kj;
    private final String oo;
    private final int ork;
    private final LongSparseArray<RadialGradient> qf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> tmg;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<com.bytedance.adsdk.sf.gm.sf.oo, com.bytedance.adsdk.sf.gm.sf.oo> vh;
    private final boolean vj;
    private final com.bytedance.adsdk.sf.gm.sf.qf vy;
    private final LongSparseArray<LinearGradient> wh;

    public vy(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.wh whVar) {
        super(vyVar, pccVar, whVar.kj().pcc(), whVar.vy().pcc(), whVar.tmg(), whVar.oo(), whVar.qf(), whVar.ork(), whVar.vh());
        this.wh = new LongSparseArray<>();
        this.qf = new LongSparseArray<>();
        this.kj = new RectF();
        this.oo = whVar.pcc();
        this.vy = whVar.sf();
        this.vj = whVar.hc();
        this.ork = (int) (vyVar.jsj().vj() / 32.0f);
        com.bytedance.adsdk.sf.pcc.sf.pcc<com.bytedance.adsdk.sf.gm.sf.oo, com.bytedance.adsdk.sf.gm.sf.oo> pcc = whVar.gm().pcc();
        this.vh = pcc;
        pcc.pcc(this);
        pccVar.pcc(pcc);
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc2 = whVar.vj().pcc();
        this.tmg = pcc2;
        pcc2.pcc(this);
        pccVar.pcc(pcc2);
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc3 = whVar.wh().pcc();
        this.hc = pcc3;
        pcc3.pcc(this);
        pccVar.pcc(pcc3);
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(Canvas canvas, Matrix matrix, int i) {
        Shader gm;
        if (this.vj) {
            return;
        }
        pcc(this.kj, matrix, false);
        if (this.vy == com.bytedance.adsdk.sf.gm.sf.qf.LINEAR) {
            gm = sf();
        } else {
            gm = gm();
        }
        gm.setLocalMatrix(matrix);
        this.sf.setShader(gm);
        super.pcc(canvas, matrix, i);
    }

    private LinearGradient sf() {
        long oo = oo();
        LinearGradient linearGradient = this.wh.get(oo);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF qf = this.tmg.qf();
        PointF qf2 = this.hc.qf();
        com.bytedance.adsdk.sf.gm.sf.oo qf3 = this.vh.qf();
        LinearGradient linearGradient2 = new LinearGradient(qf.x, qf.y, qf2.x, qf2.y, pcc(qf3.sf()), qf3.pcc(), Shader.TileMode.CLAMP);
        this.wh.put(oo, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient gm() {
        long oo = oo();
        RadialGradient radialGradient = this.qf.get(oo);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF qf = this.tmg.qf();
        PointF qf2 = this.hc.qf();
        com.bytedance.adsdk.sf.gm.sf.oo qf3 = this.vh.qf();
        int[] pcc = pcc(qf3.sf());
        float[] pcc2 = qf3.pcc();
        RadialGradient radialGradient2 = new RadialGradient(qf.x, qf.y, (float) Math.hypot(qf2.x - r7, qf2.y - r8), pcc, pcc2, Shader.TileMode.CLAMP);
        this.qf.put(oo, radialGradient2);
        return radialGradient2;
    }

    private int oo() {
        int round = Math.round(this.tmg.kj() * this.ork);
        int round2 = Math.round(this.hc.kj() * this.ork);
        int round3 = Math.round(this.vh.kj() * this.ork);
        int i = round != 0 ? round * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] pcc(int[] iArr) {
        if (this.gbb == null) {
            return iArr;
        }
        throw null;
    }
}
