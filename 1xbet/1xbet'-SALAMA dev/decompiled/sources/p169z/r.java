package p169z;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f18352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f18353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f18354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f18355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f18356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f18357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f18358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f18359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f18360i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f18362l = new Rect();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18363m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f18364n;

    public r(MotionLayout motionLayout) {
        this.f18364n = motionLayout;
        Paint paint = new Paint();
        this.f18356e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f18357f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f18358g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f18359h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.j = new float[8];
        Paint paint5 = new Paint();
        this.f18360i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f18354c = new float[100];
        this.f18353b = new int[50];
    }

    public final void a(Canvas canvas, int i7, int i8, n nVar) {
        int width;
        int height;
        int[] iArr = this.f18353b;
        int i9 = 4;
        if (i7 == 4) {
            boolean z4 = false;
            boolean z7 = false;
            for (int i10 = 0; i10 < this.f18361k; i10++) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    z4 = true;
                }
                if (i11 == 0) {
                    z7 = true;
                }
            }
            if (z4) {
                float[] fArr = this.f18352a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f18358g);
            }
            if (z7) {
                b(canvas);
            }
        }
        if (i7 == 2) {
            float[] fArr2 = this.f18352a;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f18358g);
        }
        if (i7 == 3) {
            b(canvas);
        }
        canvas.drawLines(this.f18352a, this.f18356e);
        View view = nVar.f18322b;
        if (view != null) {
            width = view.getWidth();
            height = nVar.f18322b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i12 = 1;
        while (i12 < i8 - 1) {
            if (i7 == i9 && iArr[i12 - 1] == 0) {
                i12 = i12;
            } else {
                int i13 = i12 * 2;
                float[] fArr3 = this.f18354c;
                float f7 = fArr3[i13];
                float f8 = fArr3[i13 + 1];
                this.f18355d.reset();
                this.f18355d.moveTo(f7, f8 + 10.0f);
                this.f18355d.lineTo(f7 + 10.0f, f8);
                this.f18355d.lineTo(f7, f8 - 10.0f);
                this.f18355d.lineTo(f7 - 10.0f, f8);
                this.f18355d.close();
                int i14 = i12 - 1;
                Paint paint = this.f18360i;
                if (i7 == i9) {
                    int i15 = iArr[i14];
                    if (i15 == 1) {
                        d(canvas, f7 - 0.0f, f8 - 0.0f);
                    } else if (i15 == 0) {
                        c(canvas, f7 - 0.0f, f8 - 0.0f);
                    } else {
                        if (i15 == 2) {
                            e(canvas, f7 - 0.0f, f8 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f18355d, paint);
                    }
                    canvas.drawPath(this.f18355d, paint);
                } else {
                    paint = paint;
                    f8 = f8;
                    f7 = f7;
                    i12 = i12;
                }
                if (i7 == 2) {
                    d(canvas, f7 - 0.0f, f8 - 0.0f);
                }
                if (i7 == 3) {
                    c(canvas, f7 - 0.0f, f8 - 0.0f);
                }
                if (i7 == 6) {
                    e(canvas, f7 - 0.0f, f8 - 0.0f, width, height);
                }
                canvas.drawPath(this.f18355d, paint);
            }
            i12++;
            i9 = 4;
        }
        float[] fArr4 = this.f18352a;
        if (fArr4.length > 1) {
            float f9 = fArr4[0];
            float f10 = fArr4[1];
            Paint paint2 = this.f18357f;
            canvas.drawCircle(f9, f10, 8.0f, paint2);
            float[] fArr5 = this.f18352a;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.f18352a;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[fArr.length - 2];
        float f10 = fArr[fArr.length - 1];
        float fMin = Math.min(f7, f9);
        float fMax = Math.max(f8, f10);
        float fMax2 = Math.max(f7, f9);
        float fMax3 = Math.max(f8, f10);
        Paint paint = this.f18358g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f7, f9), Math.min(f8, f10), Math.min(f7, f9), Math.max(f8, f10), paint);
    }

    public final void c(Canvas canvas, float f7, float f8) {
        float[] fArr = this.f18352a;
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[fArr.length - 2];
        float f12 = fArr[fArr.length - 1];
        float fMin = Math.min(f9, f11);
        float fMax = Math.max(f10, f12);
        float fMin2 = f7 - Math.min(f9, f11);
        float fMax2 = Math.max(f10, f12) - f8;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f11 - f9))) + 0.5d)) / 100.0f);
        Paint paint = this.f18359h;
        paint.getTextBounds(str, 0, str.length(), this.f18362l);
        Rect rect = this.f18362l;
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f8 - 20.0f, paint);
        float fMin3 = Math.min(f9, f11);
        Paint paint2 = this.f18358g;
        canvas.drawLine(f7, f8, fMin3, f8, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f12 - f10))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), this.f18362l);
        canvas.drawText(str2, f7 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f7, f8, f7, Math.max(f10, f12), paint2);
    }

    public final void d(Canvas canvas, float f7, float f8) {
        float[] fArr = this.f18352a;
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[fArr.length - 2];
        float f12 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f9 - f11, f10 - f12);
        float f13 = f11 - f9;
        float f14 = f12 - f10;
        float f15 = (((f8 - f10) * f14) + ((f7 - f9) * f13)) / (fHypot * fHypot);
        float f16 = f9 + (f13 * f15);
        float f17 = f10 + (f15 * f14);
        Path path = new Path();
        path.moveTo(f7, f8);
        path.lineTo(f16, f17);
        float fHypot2 = (float) Math.hypot(f16 - f7, f17 - f8);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        Paint paint = this.f18359h;
        paint.getTextBounds(str, 0, str.length(), this.f18362l);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f18362l.width() / 2), -20.0f, paint);
        canvas.drawLine(f7, f8, f16, f17, this.f18358g);
    }

    public final void e(Canvas canvas, float f7, float f8, int i7, int i8) {
        StringBuilder sb = new StringBuilder("");
        MotionLayout motionLayout = this.f18364n;
        sb.append(((int) (((double) (((f7 - (i7 / 2)) * 100.0f) / (motionLayout.getWidth() - i7))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        Paint paint = this.f18359h;
        paint.getTextBounds(string, 0, string.length(), this.f18362l);
        Rect rect = this.f18362l;
        canvas.drawText(string, ((f7 / 2.0f) - (rect.width() / 2)) + 0.0f, f8 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f18358g;
        canvas.drawLine(f7, f8, fMin, f8, paint2);
        String str = "" + (((int) (((double) (((f8 - (i8 / 2)) * 100.0f) / (motionLayout.getHeight() - i8))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), this.f18362l);
        canvas.drawText(str, f7 + 5.0f, 0.0f - ((f8 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f7, f8, f7, Math.max(0.0f, 1.0f), paint2);
    }
}
