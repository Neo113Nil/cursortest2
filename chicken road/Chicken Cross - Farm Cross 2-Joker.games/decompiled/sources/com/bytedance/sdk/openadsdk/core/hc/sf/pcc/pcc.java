package com.bytedance.sdk.openadsdk.core.hc.sf.pcc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.material.timepicker.TimeModel;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
class pcc extends View {
    private final Path atb;
    private float[] dax;
    private final Runnable erj;
    private float fmh;
    private float[] fum;
    private String[] gbb;
    private C0156pcc[] gd;
    private int gm;
    private ValueAnimator[] gpj;
    private Matrix hc;
    private float hpk;
    private float iv;
    private float[] jr;
    private final RectF jsj;
    private Paint kj;
    private int kun;
    private ValueAnimator[] lo;
    private final Path lq;
    private float lrr;
    private boolean[] lu;
    private final Path mk;
    private Paint mu;
    private boolean[] nac;
    private long nn;
    private final AccelerateDecelerateInterpolator of;
    private int oo;
    private Handler ork;
    private int pcc;
    private final float[] pq;
    private com.bytedance.sdk.openadsdk.core.hc.sf.pcc.sf qf;
    private final RectF qy;
    private float ri;
    private int rj;
    private int rnn;
    private int sf;
    private Camera tmg;
    private int tsx;
    private final RectF tsz;
    private float[] tz;
    private String[] vh;
    private int vj;
    private com.bytedance.adsdk.ugeno.vy.wh.pcc vy;
    private float wh;
    private float xb;
    private final Path ye;
    private final RectF yt;
    private sf[] zsj;
    private final float[] zti;

    static /* synthetic */ int pcc(pcc pccVar) {
        int i = pccVar.pcc;
        pccVar.pcc = i - 1;
        return i;
    }

    public pcc(Context context) {
        super(context);
        this.ork = new Handler(Looper.getMainLooper());
        this.vh = new String[3];
        this.tmg = new Camera();
        this.hc = new Matrix();
        this.gbb = new String[3];
        this.jr = new float[3];
        this.dax = new float[3];
        this.nac = new boolean[3];
        this.lu = new boolean[3];
        this.gpj = new ValueAnimator[3];
        this.lo = new ValueAnimator[3];
        this.fum = new float[3];
        this.tz = new float[3];
        this.of = new AccelerateDecelerateInterpolator();
        this.yt = new RectF();
        this.qy = new RectF();
        this.jsj = new RectF();
        this.tsz = new RectF();
        this.mk = new Path();
        this.atb = new Path();
        this.ye = new Path();
        this.lq = new Path();
        this.zti = new float[8];
        this.pq = new float[8];
        this.nn = 0L;
        this.erj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.pcc.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                pcc.pcc(pcc.this);
                pcc.this.invalidate();
                if (pcc.this.pcc <= 0) {
                    pcc.this.ork.removeCallbacks(this);
                    pcc.this.sf();
                } else {
                    pcc.this.ork.postDelayed(this, 1000L);
                }
            }
        };
        oo();
        vj();
        gm();
    }

    private void gm() {
        this.zsj = new sf[3];
        this.gd = new C0156pcc[3];
        for (int i = 0; i < 3; i++) {
            this.zsj[i] = new sf(this, i);
            this.gd[i] = new C0156pcc(this, i);
        }
    }

    private void oo() {
        Paint paint = new Paint();
        this.kj = paint;
        paint.setColor(this.sf);
        this.kj.setAntiAlias(true);
    }

    public void pcc(int i, int i2, int i3, int i4, int i5, float f) {
        int min = Math.min(i, 360060);
        this.sf = i2;
        this.gm = i3;
        this.oo = i4;
        this.vj = i5;
        this.wh = f;
        this.pcc = min;
        this.ork.post(this.erj);
        Paint paint = this.kj;
        if (paint != null) {
            paint.setColor(this.sf);
        }
        float[] fArr = this.zti;
        float f2 = this.wh;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.pq;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f2;
        fArr2[6] = f2;
        fArr2[5] = f2;
        fArr2[4] = f2;
        invalidate();
    }

    private void vj() {
        if (this.vy == null) {
            com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar = new com.bytedance.adsdk.ugeno.vy.wh.pcc(getContext());
            this.vy = pccVar;
            this.mu = pccVar.getPaint();
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.hc.sf.pcc.sf sfVar) {
        this.qf = sfVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.hc.sf.pcc.sf sfVar = this.qf;
        if (sfVar != null) {
            int[] pcc = sfVar.pcc(i, i2);
            if (this.vj > 0) {
                int mode = View.MeasureSpec.getMode(pcc[1]);
                int size = View.MeasureSpec.getSize(pcc[1]);
                if (mode == 0 || size > this.vj) {
                    pcc[1] = View.MeasureSpec.makeMeasureSpec(this.vj, 1073741824);
                }
            }
            super.onMeasure(pcc[0], pcc[1]);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.oo <= 0 || this.vj <= 0) {
            return;
        }
        this.yt.set((getWidth() - this.oo) / 2.0f, (getHeight() - this.vj) / 2.0f, (getWidth() + this.oo) / 2.0f, (getHeight() + this.vj) / 2.0f);
        RectF rectF = this.yt;
        float f = this.wh;
        canvas.drawRoundRect(rectF, f, f, this.kj);
        int i = this.pcc;
        this.rnn = i / 3600;
        int i2 = i % 3600;
        this.tsx = i2;
        this.kun = i2 / 60;
        this.rj = i2 % 60;
        this.lrr = this.oo;
        this.iv = this.vj;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.xb = width;
        float f2 = this.lrr * 3.0f;
        this.ri = f2;
        float f3 = width - f2;
        this.hpk = f3;
        this.fmh = f3 > 0.0f ? f3 / 2.0f : 10.0f;
        pcc(this.rnn, this.kun, this.rj);
        float paddingLeft = getPaddingLeft();
        float centerY = this.yt.centerY();
        float f4 = this.iv;
        pcc(canvas, paddingLeft, centerY - (f4 / 2.0f), this.lrr, f4, String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.rnn)), 0);
        float paddingLeft2 = getPaddingLeft() + this.lrr + this.fmh;
        float centerY2 = this.yt.centerY();
        float f5 = this.iv;
        pcc(canvas, paddingLeft2, centerY2 - (f5 / 2.0f), this.lrr, f5, String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.kun)), 1);
        float paddingLeft3 = getPaddingLeft() + ((this.lrr + this.fmh) * 2.0f);
        float centerY3 = this.yt.centerY();
        float f6 = this.iv;
        pcc(canvas, paddingLeft3, centerY3 - (f6 / 2.0f), this.lrr, f6, String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.rj)), 2);
        pcc(canvas, getPaddingLeft() + this.lrr + (this.fmh / 2.0f), this.yt.centerY());
        pcc(canvas, getPaddingLeft() + (this.lrr * 2.0f) + ((this.fmh * 3.0f) / 2.0f), this.yt.centerY());
        com.bytedance.sdk.openadsdk.core.hc.sf.pcc.sf sfVar = this.qf;
        if (sfVar != null) {
            sfVar.pcc(canvas);
        }
    }

    private void pcc(Canvas canvas, float f, float f2, float f3, float f4, String str, int i) {
        this.qy.set(f, f2, f3 + f, f4 + f2);
        float centerY = this.qy.centerY();
        float centerY2 = this.qy.centerY() - ((this.vy.getPaint().descent() + this.vy.getPaint().ascent()) / 2.0f);
        this.jsj.set(this.qy.left, this.qy.top, this.qy.right, centerY);
        this.mk.reset();
        this.mk.addRoundRect(this.jsj, this.zti, Path.Direction.CW);
        this.kj.setColor(this.sf);
        canvas.drawPath(this.mk, this.kj);
        this.mu.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.qy.centerX(), centerY2, this.mu);
        this.tsz.set(this.qy.left, centerY, this.qy.right, this.qy.bottom);
        this.atb.reset();
        this.atb.addRoundRect(this.tsz, this.pq, Path.Direction.CW);
        this.kj.setColor(this.gm);
        canvas.drawPath(this.atb, this.kj);
        canvas.drawText(str, this.qy.centerX(), centerY2, this.vy.getPaint());
        boolean z = this.nac[i];
        if (z || this.lu[i]) {
            if (z) {
                canvas.save();
                this.hc.reset();
                this.tmg.save();
                this.tmg.rotateX(this.jr[i]);
                this.tmg.getMatrix(this.hc);
                this.hc.preTranslate(-this.qy.centerX(), -centerY);
                this.hc.postTranslate(this.qy.centerX(), centerY);
                canvas.concat(this.hc);
                this.ye.reset();
                this.ye.addRoundRect(this.jsj, this.zti, Path.Direction.CW);
                this.kj.setColor(this.sf);
                canvas.drawPath(this.ye, this.kj);
                int alpha = this.mu.getAlpha();
                this.mu.setAlpha((int) (this.fum[i] * 255.0f));
                canvas.drawText(this.vh[i], this.qy.centerX(), centerY2, this.mu);
                this.mu.setAlpha(alpha);
                this.tmg.restore();
                canvas.restore();
            }
            if (this.lu[i]) {
                canvas.save();
                this.hc.reset();
                this.tmg.save();
                this.tmg.rotateX(this.dax[i]);
                this.tmg.getMatrix(this.hc);
                this.hc.preTranslate(-this.qy.centerX(), -centerY);
                this.hc.postTranslate(this.qy.centerX(), centerY);
                canvas.concat(this.hc);
                this.lq.reset();
                this.lq.addRoundRect(this.tsz, this.pq, Path.Direction.CW);
                this.kj.setColor(this.gm);
                canvas.drawPath(this.lq, this.kj);
                int alpha2 = this.mu.getAlpha();
                this.mu.setAlpha((int) (this.tz[i] * 255.0f));
                canvas.drawText(this.gbb[i], this.qy.centerX(), centerY2, this.mu);
                this.mu.setAlpha(alpha2);
                this.tmg.restore();
                canvas.restore();
            }
        }
    }

    private void pcc(Canvas canvas, float f, float f2) {
        canvas.drawText(ServerSentEventKt.COLON, f, f2 - ((this.mu.descent() + this.mu.ascent()) / 2.0f), this.mu);
    }

    private void pcc(int i, int i2, int i3) {
        String str = this.vh[0];
        String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
        if (!format.equals(str) && !this.nac[0] && !this.lu[0] && str != null) {
            pcc(0, str, format);
        }
        String str2 = this.vh[1];
        String format2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
        if (!format2.equals(str2) && !this.nac[1] && !this.lu[1] && str2 != null) {
            pcc(1, str2, format2);
        }
        String str3 = this.vh[2];
        String format3 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3));
        if (!format3.equals(str3) && !this.nac[2] && !this.lu[2] && str3 != null) {
            pcc(2, str3, format3);
        }
        String[] strArr = this.vh;
        if (strArr[0] == null) {
            strArr[0] = format;
        }
        if (strArr[1] == null) {
            strArr[1] = format2;
        }
        if (strArr[2] == null) {
            strArr[2] = format3;
        }
    }

    private void pcc(final int i, String str, String str2) {
        this.vh[i] = str;
        this.gbb[i] = str2;
        this.nac[i] = true;
        this.lu[i] = true;
        this.jr[i] = 0.0f;
        this.dax[i] = 90.0f;
        this.fum[i] = 1.0f;
        this.tz[i] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.gpj;
        ValueAnimator valueAnimator = valueAnimatorArr[i];
        if (valueAnimator == null) {
            valueAnimatorArr[i] = ValueAnimator.ofFloat(0.0f, -90.0f);
            this.gpj[i].setDuration(250L);
            this.gpj[i].setInterpolator(this.of);
            this.gpj[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.pcc.pcc$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    pcc.this.sf(i, valueAnimator2);
                }
            });
            this.gpj[i].addListener(this.zsj[i]);
        } else {
            valueAnimator.setFloatValues(0.0f, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.lo;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i] = ValueAnimator.ofFloat(-90.0f, 0.0f);
            this.lo[i].setDuration(250L);
            this.lo[i].setInterpolator(this.of);
            this.lo[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.pcc.pcc$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    pcc.this.pcc(i, valueAnimator3);
                }
            });
            this.lo[i].addListener(this.gd[i]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, 0.0f);
        }
        if (this.gpj[i].isRunning()) {
            this.gpj[i].cancel();
        }
        if (this.lo[i].isRunning()) {
            this.lo[i].cancel();
        }
        this.gpj[i].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sf(int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.jr[i] = floatValue;
        this.fum[i] = 1.0f - (floatValue / (-90.0f));
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.nn >= 16) {
            invalidate();
            this.nn = currentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void pcc(int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.dax[i] = floatValue;
        this.tz[i] = (floatValue + 90.0f) / 90.0f;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.nn >= 16) {
            invalidate();
            this.nn = currentTimeMillis;
        }
    }

    public com.bytedance.adsdk.ugeno.vy.wh.pcc pcc() {
        return this.vy;
    }

    public void pcc(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        this.vy = pccVar;
    }

    public void sf() {
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = this.gpj[i];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.gpj[i].cancel();
            }
            ValueAnimator valueAnimator2 = this.lo[i];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.lo[i].cancel();
            }
        }
    }

    private static class sf implements Animator.AnimatorListener {
        private final int pcc;
        private final pcc sf;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public sf(pcc pccVar, int i) {
            this.sf = pccVar;
            this.pcc = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.sf.nac[this.pcc] = false;
            this.sf.lo[this.pcc].start();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.sf.pcc.pcc$pcc, reason: collision with other inner class name */
    private static class C0156pcc implements Animator.AnimatorListener {
        private final int pcc;
        private final pcc sf;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public C0156pcc(pcc pccVar, int i) {
            this.sf = pccVar;
            this.pcc = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.sf.lu[this.pcc] = false;
            this.sf.vh[this.pcc] = this.sf.gbb[this.pcc];
        }
    }
}
