package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class kj extends View {
    private static final int[] pcc = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final RectF gm;
    private int kj;
    private final ArrayList<pcc> oo;
    private int qf;
    private final RectF sf;
    private final Paint vj;
    private int vy;
    private final Paint wh;

    public kj(Context context) {
        super(context);
        this.sf = new RectF();
        this.gm = new RectF();
        this.oo = new ArrayList<>();
        this.wh = new Paint();
        Paint paint = new Paint();
        this.vj = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    public void setProgress(int i) {
        int i2 = this.kj;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.kj = i;
        pcc();
    }

    private void pcc() {
        if (this.qf <= 0) {
            return;
        }
        int width = (int) (((this.kj * 1.0f) / 100.0f) * getWidth());
        this.gm.right = Math.max(this.vy, width);
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.qf = i5;
        this.vy = i5 * 5;
        float f = i;
        float f2 = i2;
        this.sf.set(0.0f, 0.0f, f, f2);
        this.gm.set(0.0f, 0.0f, 0.0f, f2);
        this.wh.setShader(new LinearGradient(0.0f, 0.0f, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.oo.clear();
        float f3 = this.qf / 4.0f;
        for (int i6 : pcc) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.oo.add(new pcc(paint, this.qf / 2.0f, f3, f2 / 2.0f));
            f3 += (this.qf / 2.0f) * 3.0f;
        }
        pcc();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.sf;
        int i = this.qf;
        canvas.drawRoundRect(rectF, i, i, this.vj);
        RectF rectF2 = this.gm;
        int i2 = this.qf;
        canvas.drawRoundRect(rectF2, i2, i2, this.wh);
        int save = canvas.save();
        canvas.translate(this.gm.right - this.vy, 0.0f);
        Iterator<pcc> it = this.oo.iterator();
        while (it.hasNext()) {
            pcc next = it.next();
            canvas.drawCircle(next.gm, next.oo, next.sf, next.pcc);
        }
        canvas.restoreToCount(save);
    }

    private static final class pcc {
        float gm;
        float oo;
        public Paint pcc;
        public float sf;

        public pcc(Paint paint, float f, float f2, float f3) {
            this.pcc = paint;
            this.sf = f;
            this.gm = f2;
            this.oo = f3;
        }
    }
}
