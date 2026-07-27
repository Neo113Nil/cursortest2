package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class tmg extends View {
    private LinearGradient gbb;
    private int gm;
    private PorterDuff.Mode hc;
    private final List<pcc> jr;
    private int kj;
    private int oo;
    private Bitmap ork;
    Rect pcc;
    private int qf;
    Rect sf;
    private Xfermode tmg;
    private Paint vh;
    private int vj;
    private int[] vy;
    private int wh;

    public tmg(Context context) {
        super(context);
        this.hc = PorterDuff.Mode.DST_IN;
        this.jr = new ArrayList();
        pcc();
    }

    private void pcc() {
        this.gm = com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_splash_unlock_image_arrow");
        this.oo = Color.parseColor("#00ffffff");
        this.vj = Color.parseColor("#ffffffff");
        int parseColor = Color.parseColor("#00ffffff");
        this.wh = parseColor;
        this.qf = 10;
        this.kj = 40;
        this.vy = new int[]{this.oo, this.vj, parseColor};
        setLayerType(1, null);
        this.vh = new Paint(1);
        this.ork = BitmapFactory.decodeResource(getResources(), this.gm);
        this.tmg = new PorterDuffXfermode(this.hc);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.ork, this.pcc, this.sf, this.vh);
        canvas.save();
        Iterator<pcc> it = this.jr.iterator();
        while (it.hasNext()) {
            pcc next = it.next();
            this.gbb = new LinearGradient(next.sf, 0.0f, next.sf + this.kj, this.qf, this.vy, (float[]) null, Shader.TileMode.CLAMP);
            this.vh.setColor(-1);
            this.vh.setShader(this.gbb);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.vh);
            this.vh.setShader(null);
            next.pcc();
            if (next.sf > getWidth()) {
                it.remove();
            }
        }
        this.vh.setXfermode(this.tmg);
        canvas.drawBitmap(this.ork, this.pcc, this.sf, this.vh);
        this.vh.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.ork == null) {
            return;
        }
        this.pcc = new Rect(0, 0, this.ork.getWidth(), this.ork.getHeight());
        this.sf = new Rect(0, 0, getWidth(), getHeight());
    }

    public void pcc(int i) {
        this.jr.add(new pcc(i));
        postInvalidate();
    }

    public static class pcc {
        private final int pcc;
        private int sf = 0;

        public pcc(int i) {
            this.pcc = i;
        }

        public void pcc() {
            this.sf += this.pcc;
        }
    }
}
