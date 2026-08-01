package com.bytedance.adsdk.sf.gm.gm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public class oo extends pcc {
    private final Paint kj;
    private final Rect ork;
    protected final com.bytedance.adsdk.sf.ork qf;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Bitmap, Bitmap> tmg;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> vh;
    private final Rect vy;

    oo(com.bytedance.adsdk.sf.vy vyVar, vj vjVar) {
        super(vyVar, vjVar);
        this.kj = new com.bytedance.adsdk.sf.pcc.pcc(3);
        this.vy = new Rect();
        this.ork = new Rect();
        this.qf = vyVar.wh(vjVar.qf());
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        super.sf(canvas, matrix, i);
        Bitmap tmg = tmg();
        if (tmg == null || tmg.isRecycled() || this.qf == null) {
            return;
        }
        float pcc = com.bytedance.adsdk.sf.wh.wh.pcc();
        this.kj.setAlpha(i);
        com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> pccVar = this.vh;
        if (pccVar != null) {
            this.kj.setColorFilter(pccVar.qf());
        }
        canvas.save();
        canvas.concat(matrix);
        this.vy.set(0, 0, tmg.getWidth(), tmg.getHeight());
        if (this.sf.vj()) {
            this.ork.set(0, 0, (int) (this.qf.pcc() * pcc), (int) (this.qf.sf() * pcc));
        } else {
            this.ork.set(0, 0, (int) (tmg.getWidth() * pcc), (int) (tmg.getHeight() * pcc));
        }
        canvas.drawBitmap(tmg, this.vy, this.ork, this.kj);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        super.pcc(rectF, matrix, z);
        if (this.qf != null) {
            float pcc = com.bytedance.adsdk.sf.wh.wh.pcc();
            rectF.set(0.0f, 0.0f, this.qf.pcc() * pcc, this.qf.sf() * pcc);
            this.pcc.mapRect(rectF);
        }
    }

    private Bitmap tmg() {
        Bitmap qf;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Bitmap, Bitmap> pccVar = this.tmg;
        if (pccVar != null && (qf = pccVar.qf()) != null) {
            return qf;
        }
        Bitmap vj = this.sf.vj(this.gm.qf());
        if (vj != null) {
            return vj;
        }
        com.bytedance.adsdk.sf.ork orkVar = this.qf;
        if (orkVar != null) {
            return orkVar.vh();
        }
        return null;
    }
}
