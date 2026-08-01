package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.wh.oo;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class NiceImageView extends oo {
    private int dax;
    private final RectF fum;
    private final Xfermode gbb;
    private boolean gm;
    private final float[] gpj;
    private int hc;
    private int jr;
    private int kj;
    private RectF lo;
    private final float[] lu;
    private float nac;
    private final Path of;
    private int oo;
    private int ork;
    private final Context pcc;
    private int qf;
    private boolean sf;
    private int tmg;
    private final Paint tz;
    private int vh;
    private int vj;
    private int vy;
    private int wh;
    private Path yt;

    public NiceImageView(Context context) {
        this(context, null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.vj = -1;
        this.qf = -1;
        this.pcc = context;
        this.kj = rj.sf(context, 10.0f);
        this.lu = new float[8];
        this.gpj = new float[8];
        this.fum = new RectF();
        this.lo = new RectF();
        this.tz = new Paint();
        this.of = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.gbb = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.gbb = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.yt = new Path();
        }
        gm();
        oo();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.jr = i;
        this.dax = i2;
        pcc();
        sf();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.lo, null, 31);
        if (!this.gm) {
            int i = this.jr;
            int i2 = this.oo;
            int i3 = this.wh;
            int i4 = this.dax;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.tz.reset();
        this.of.reset();
        if (this.sf) {
            this.of.addCircle(this.jr / 2.0f, this.dax / 2.0f, this.nac, Path.Direction.CCW);
        } else {
            this.of.addRoundRect(this.lo, this.gpj, Path.Direction.CCW);
        }
        this.tz.setAntiAlias(true);
        this.tz.setStyle(Paint.Style.FILL);
        this.tz.setXfermode(this.gbb);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.of, this.tz);
        } else {
            this.yt.addRect(this.lo, Path.Direction.CCW);
            this.yt.op(this.of, Path.Op.DIFFERENCE);
            canvas.drawPath(this.yt, this.tz);
        }
        this.tz.setXfermode(null);
        int i5 = this.hc;
        if (i5 != 0) {
            this.tz.setColor(i5);
            canvas.drawPath(this.of, this.tz);
        }
        canvas.restore();
        pcc(canvas);
    }

    private void pcc(Canvas canvas) {
        if (this.sf) {
            int i = this.oo;
            if (i > 0) {
                pcc(canvas, i, this.vj, this.nac - (i / 2.0f));
            }
            int i2 = this.wh;
            if (i2 > 0) {
                pcc(canvas, i2, this.qf, (this.nac - this.oo) - (i2 / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.oo;
        if (i3 > 0) {
            pcc(canvas, i3, this.vj, this.fum, this.lu);
        }
    }

    private void pcc(Canvas canvas, int i, int i2, float f) {
        pcc(i, i2);
        this.of.addCircle(this.jr / 2.0f, this.dax / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.of, this.tz);
    }

    private void pcc(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        pcc(i, i2);
        this.of.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.of, this.tz);
    }

    private void pcc(int i, int i2) {
        this.of.reset();
        this.tz.setStrokeWidth(i);
        this.tz.setColor(i2);
        this.tz.setStyle(Paint.Style.STROKE);
    }

    private void pcc() {
        if (this.sf) {
            return;
        }
        RectF rectF = this.fum;
        int i = this.oo;
        rectF.set(i / 2.0f, i / 2.0f, this.jr - (i / 2.0f), this.dax - (i / 2.0f));
    }

    private void sf() {
        if (this.sf) {
            float min = Math.min(this.jr, this.dax) / 2.0f;
            this.nac = min;
            RectF rectF = this.lo;
            int i = this.jr;
            int i2 = this.dax;
            rectF.set((i / 2.0f) - min, (i2 / 2.0f) - min, (i / 2.0f) + min, (i2 / 2.0f) + min);
            return;
        }
        this.lo.set(0.0f, 0.0f, this.jr, this.dax);
        if (this.gm) {
            this.lo = this.fum;
        }
    }

    private void gm() {
        if (this.sf) {
            return;
        }
        int i = 0;
        if (this.kj <= 0) {
            float[] fArr = this.lu;
            int i2 = this.vy;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.ork;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.tmg;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.vh;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.gpj;
            int i6 = this.oo;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.lu;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.kj;
            fArr3[i] = i7;
            this.gpj[i] = i7 - (this.oo / 2.0f);
            i++;
        }
    }

    private void pcc(boolean z) {
        if (z) {
            this.kj = 0;
        }
        gm();
        pcc();
        invalidate();
    }

    private void oo() {
        if (this.sf) {
            return;
        }
        this.wh = 0;
    }

    public void isCoverSrc(boolean z) {
        this.gm = z;
        sf();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.sf = z;
        oo();
        sf();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.oo = rj.sf(this.pcc, i);
        pcc(false);
    }

    public void setBorderColor(int i) {
        this.vj = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.wh = rj.sf(this.pcc, i);
        oo();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.qf = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.kj = rj.sf(this.pcc, i);
        pcc(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.vy = rj.sf(this.pcc, i);
        pcc(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.ork = rj.sf(this.pcc, i);
        pcc(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.vh = rj.sf(this.pcc, i);
        pcc(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.tmg = rj.sf(this.pcc, i);
        pcc(true);
    }

    public void setMaskColor(int i) {
        this.hc = i;
        invalidate();
    }
}
