package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class pcc implements vh, vj, pcc.InterfaceC0101pcc {
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> dax;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> gbb;
    float gm;
    private final List<com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float>> hc;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> jr;
    private final com.bytedance.adsdk.sf.vy kj;
    private com.bytedance.adsdk.sf.pcc.sf.gm nac;
    private final float[] ork;
    protected final com.bytedance.adsdk.sf.gm.gm.pcc pcc;
    final Paint sf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Integer> tmg;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> vh;
    private final PathMeasure oo = new PathMeasure();
    private final Path vj = new Path();
    private final Path wh = new Path();
    private final RectF qf = new RectF();
    private final List<C0100pcc> vy = new ArrayList();

    pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.sf.gm.pcc.oo ooVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, List<com.bytedance.adsdk.sf.gm.pcc.sf> list, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2) {
        com.bytedance.adsdk.sf.pcc.pcc pccVar2 = new com.bytedance.adsdk.sf.pcc.pcc(1);
        this.sf = pccVar2;
        this.gm = 0.0f;
        this.kj = vyVar;
        this.pcc = pccVar;
        pccVar2.setStyle(Paint.Style.STROKE);
        pccVar2.setStrokeCap(cap);
        pccVar2.setStrokeJoin(join);
        pccVar2.setStrokeMiter(f);
        this.tmg = ooVar.pcc();
        this.vh = sfVar.pcc();
        if (sfVar2 == null) {
            this.gbb = null;
        } else {
            this.gbb = sfVar2.pcc();
        }
        this.hc = new ArrayList(list.size());
        this.ork = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.hc.add(list.get(i).pcc());
        }
        pccVar.pcc(this.tmg);
        pccVar.pcc(this.vh);
        for (int i2 = 0; i2 < this.hc.size(); i2++) {
            pccVar.pcc(this.hc.get(i2));
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar3 = this.gbb;
        if (pccVar3 != null) {
            pccVar.pcc(pccVar3);
        }
        this.tmg.pcc(this);
        this.vh.pcc(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.hc.get(i3).pcc(this);
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar4 = this.gbb;
        if (pccVar4 != null) {
            pccVar4.pcc(this);
        }
        if (pccVar.ork() != null) {
            com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = pccVar.ork().pcc().pcc();
            this.dax = pcc;
            pcc.pcc(this);
            pccVar.pcc(this.dax);
        }
        if (pccVar.vh() != null) {
            this.nac = new com.bytedance.adsdk.sf.pcc.sf.gm(this, pccVar, pccVar.vh());
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
    public void pcc() {
        this.kj.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        fum fumVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            gm gmVar = list.get(size);
            if (gmVar instanceof fum) {
                fum fumVar2 = (fum) gmVar;
                if (fumVar2.sf() == gpj.pcc.INDIVIDUALLY) {
                    fumVar = fumVar2;
                }
            }
        }
        if (fumVar != null) {
            fumVar.pcc(this);
        }
        C0100pcc c0100pcc = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            gm gmVar2 = list2.get(size2);
            if (gmVar2 instanceof fum) {
                fum fumVar3 = (fum) gmVar2;
                if (fumVar3.sf() == gpj.pcc.INDIVIDUALLY) {
                    if (c0100pcc != null) {
                        this.vy.add(c0100pcc);
                    }
                    c0100pcc = new C0100pcc(fumVar3);
                    fumVar3.pcc(this);
                }
            }
            if (gmVar2 instanceof hc) {
                if (c0100pcc == null) {
                    c0100pcc = new C0100pcc(fumVar);
                }
                c0100pcc.pcc.add((hc) gmVar2);
            }
        }
        if (c0100pcc != null) {
            this.vy.add(c0100pcc);
        }
    }

    public void pcc(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.sf.vj.pcc("StrokeContent#draw");
        if (com.bytedance.adsdk.sf.wh.wh.sf(matrix)) {
            com.bytedance.adsdk.sf.vj.sf("StrokeContent#draw");
            return;
        }
        this.sf.setAlpha(com.bytedance.adsdk.sf.wh.vj.pcc((int) ((((i / 255.0f) * ((com.bytedance.adsdk.sf.pcc.sf.wh) this.tmg).vy()) / 100.0f) * 255.0f), 0, 255));
        this.sf.setStrokeWidth(((com.bytedance.adsdk.sf.pcc.sf.oo) this.vh).vy() * com.bytedance.adsdk.sf.wh.wh.pcc(matrix));
        if (this.sf.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.sf.vj.sf("StrokeContent#draw");
            return;
        }
        pcc(matrix);
        com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> pccVar = this.jr;
        if (pccVar != null) {
            this.sf.setColorFilter(pccVar.qf());
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar2 = this.dax;
        if (pccVar2 != null) {
            float floatValue = pccVar2.qf().floatValue();
            if (floatValue == 0.0f) {
                this.sf.setMaskFilter(null);
            } else if (floatValue != this.gm) {
                this.sf.setMaskFilter(this.pcc.sf(floatValue));
            }
            this.gm = floatValue;
        }
        com.bytedance.adsdk.sf.pcc.sf.gm gmVar = this.nac;
        if (gmVar != null) {
            gmVar.pcc(this.sf);
        }
        for (int i2 = 0; i2 < this.vy.size(); i2++) {
            C0100pcc c0100pcc = this.vy.get(i2);
            if (c0100pcc.sf != null) {
                pcc(canvas, c0100pcc, matrix);
            } else {
                com.bytedance.adsdk.sf.vj.pcc("StrokeContent#buildPath");
                this.vj.reset();
                for (int size = c0100pcc.pcc.size() - 1; size >= 0; size--) {
                    this.vj.addPath(((hc) c0100pcc.pcc.get(size)).oo(), matrix);
                }
                com.bytedance.adsdk.sf.vj.sf("StrokeContent#buildPath");
                com.bytedance.adsdk.sf.vj.pcc("StrokeContent#drawPath");
                canvas.drawPath(this.vj, this.sf);
                com.bytedance.adsdk.sf.vj.sf("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.sf.vj.sf("StrokeContent#draw");
    }

    private void pcc(Canvas canvas, C0100pcc c0100pcc, Matrix matrix) {
        float f;
        float f2;
        com.bytedance.adsdk.sf.vj.pcc("StrokeContent#applyTrimPath");
        if (c0100pcc.sf == null) {
            com.bytedance.adsdk.sf.vj.sf("StrokeContent#applyTrimPath");
            return;
        }
        this.vj.reset();
        for (int size = c0100pcc.pcc.size() - 1; size >= 0; size--) {
            this.vj.addPath(((hc) c0100pcc.pcc.get(size)).oo(), matrix);
        }
        float floatValue = c0100pcc.sf.gm().qf().floatValue() / 100.0f;
        float floatValue2 = c0100pcc.sf.oo().qf().floatValue() / 100.0f;
        float floatValue3 = c0100pcc.sf.vj().qf().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.vj, this.sf);
            com.bytedance.adsdk.sf.vj.sf("StrokeContent#applyTrimPath");
            return;
        }
        this.oo.setPath(this.vj, false);
        float length = this.oo.getLength();
        while (this.oo.nextContour()) {
            length += this.oo.getLength();
        }
        float f3 = floatValue3 * length;
        float f4 = (floatValue * length) + f3;
        float min = Math.min((floatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = c0100pcc.pcc.size() - 1; size2 >= 0; size2--) {
            this.wh.set(((hc) c0100pcc.pcc.get(size2)).oo());
            this.wh.transform(matrix);
            this.oo.setPath(this.wh, false);
            float length2 = this.oo.getLength();
            if (min > length) {
                float f6 = min - length;
                if (f6 < f5 + length2 && f5 < f6) {
                    f = f4 > length ? (f4 - length) / length2 : 0.0f;
                    f2 = Math.min(f6 / length2, 1.0f);
                    com.bytedance.adsdk.sf.wh.wh.pcc(this.wh, f, f2, 0.0f);
                    canvas.drawPath(this.wh, this.sf);
                    f5 += length2;
                }
            }
            float f7 = f5 + length2;
            if (f7 >= f4 && f5 <= min) {
                if (f7 <= min && f4 < f5) {
                    canvas.drawPath(this.wh, this.sf);
                } else {
                    f = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                    f2 = min > f7 ? 1.0f : (min - f5) / length2;
                    com.bytedance.adsdk.sf.wh.wh.pcc(this.wh, f, f2, 0.0f);
                    canvas.drawPath(this.wh, this.sf);
                }
            }
            f5 += length2;
        }
        com.bytedance.adsdk.sf.vj.sf("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        com.bytedance.adsdk.sf.vj.pcc("StrokeContent#getBounds");
        this.vj.reset();
        for (int i = 0; i < this.vy.size(); i++) {
            C0100pcc c0100pcc = this.vy.get(i);
            for (int i2 = 0; i2 < c0100pcc.pcc.size(); i2++) {
                this.vj.addPath(((hc) c0100pcc.pcc.get(i2)).oo(), matrix);
            }
        }
        this.vj.computeBounds(this.qf, false);
        float vy = ((com.bytedance.adsdk.sf.pcc.sf.oo) this.vh).vy();
        RectF rectF2 = this.qf;
        float f = vy / 2.0f;
        rectF2.set(rectF2.left - f, this.qf.top - f, this.qf.right + f, this.qf.bottom + f);
        rectF.set(this.qf);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.sf.vj.sf("StrokeContent#getBounds");
    }

    private void pcc(Matrix matrix) {
        com.bytedance.adsdk.sf.vj.pcc("StrokeContent#applyDashPattern");
        if (this.hc.isEmpty()) {
            com.bytedance.adsdk.sf.vj.sf("StrokeContent#applyDashPattern");
            return;
        }
        float pcc = com.bytedance.adsdk.sf.wh.wh.pcc(matrix);
        for (int i = 0; i < this.hc.size(); i++) {
            this.ork[i] = this.hc.get(i).qf().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.ork;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.ork;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.ork;
            fArr3[i] = fArr3[i] * pcc;
        }
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar = this.gbb;
        this.sf.setPathEffect(new DashPathEffect(this.ork, pccVar == null ? 0.0f : pcc * pccVar.qf().floatValue()));
        com.bytedance.adsdk.sf.vj.sf("StrokeContent#applyDashPattern");
    }

    /* renamed from: com.bytedance.adsdk.sf.pcc.pcc.pcc$pcc, reason: collision with other inner class name */
    private static final class C0100pcc {
        private final List<hc> pcc;
        private final fum sf;

        private C0100pcc(fum fumVar) {
            this.pcc = new ArrayList();
            this.sf = fumVar;
        }
    }
}
