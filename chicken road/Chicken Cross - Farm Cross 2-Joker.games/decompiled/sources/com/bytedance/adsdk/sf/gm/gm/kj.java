package com.bytedance.adsdk.sf.gm.gm;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public class kj extends pcc {
    private final Paint kj;
    private final Path ork;
    private final RectF qf;
    private com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> tmg;
    private final vj vh;
    private final float[] vy;

    kj(com.bytedance.adsdk.sf.vy vyVar, vj vjVar) {
        super(vyVar, vjVar);
        this.qf = new RectF();
        com.bytedance.adsdk.sf.pcc.pcc pccVar = new com.bytedance.adsdk.sf.pcc.pcc();
        this.kj = pccVar;
        this.vy = new float[8];
        this.ork = new Path();
        this.vh = vjVar;
        pccVar.setAlpha(0);
        pccVar.setStyle(Paint.Style.FILL);
        pccVar.setColor(vjVar.dax());
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        super.sf(canvas, matrix, i);
        int alpha = Color.alpha(this.vh.dax());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.oo.pcc() == null ? 100 : this.oo.pcc().qf().intValue())) / 100.0f) * 255.0f);
        this.kj.setAlpha(intValue);
        com.bytedance.adsdk.sf.pcc.sf.pcc<ColorFilter, ColorFilter> pccVar = this.tmg;
        if (pccVar != null) {
            this.kj.setColorFilter(pccVar.qf());
        }
        if (intValue > 0) {
            float[] fArr = this.vy;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.vh.lu();
            float[] fArr2 = this.vy;
            fArr2[3] = 0.0f;
            fArr2[4] = this.vh.lu();
            this.vy[5] = this.vh.nac();
            float[] fArr3 = this.vy;
            fArr3[6] = 0.0f;
            fArr3[7] = this.vh.nac();
            matrix.mapPoints(this.vy);
            this.ork.reset();
            Path path = this.ork;
            float[] fArr4 = this.vy;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.ork;
            float[] fArr5 = this.vy;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.ork;
            float[] fArr6 = this.vy;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.ork;
            float[] fArr7 = this.vy;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.ork;
            float[] fArr8 = this.vy;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.ork.close();
            canvas.drawPath(this.ork, this.kj);
        }
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        super.pcc(rectF, matrix, z);
        this.qf.set(0.0f, 0.0f, this.vh.lu(), this.vh.nac());
        this.pcc.mapRect(this.qf);
        rectF.set(this.qf);
    }
}
