package androidx.constraintlayout.motion.widget;

import C.o0;
import Ij.C3261b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.m;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.view.B;
import g.C6594f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m2.C8043a;
import m2.e;
import p2.C8834a;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public class MotionLayout extends ConstraintLayout implements B {

    /* renamed from: I0, reason: collision with root package name */
    public static boolean f41220I0;

    /* renamed from: A, reason: collision with root package name */
    int f41221A;

    /* renamed from: A0, reason: collision with root package name */
    Rect f41222A0;

    /* renamed from: B, reason: collision with root package name */
    int f41223B;

    /* renamed from: B0, reason: collision with root package name */
    j f41224B0;

    /* renamed from: C, reason: collision with root package name */
    boolean f41225C;

    /* renamed from: C0, reason: collision with root package name */
    e f41226C0;

    /* renamed from: D, reason: collision with root package name */
    float f41227D;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f41228D0;

    /* renamed from: E, reason: collision with root package name */
    float f41229E;

    /* renamed from: E0, reason: collision with root package name */
    private RectF f41230E0;

    /* renamed from: F, reason: collision with root package name */
    long f41231F;

    /* renamed from: F0, reason: collision with root package name */
    private View f41232F0;

    /* renamed from: G, reason: collision with root package name */
    float f41233G;

    /* renamed from: G0, reason: collision with root package name */
    private Matrix f41234G0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f41235H;

    /* renamed from: H0, reason: collision with root package name */
    ArrayList<Integer> f41236H0;

    /* renamed from: I, reason: collision with root package name */
    private ArrayList<p2.c> f41237I;

    /* renamed from: J, reason: collision with root package name */
    private ArrayList<p2.c> f41238J;

    /* renamed from: K, reason: collision with root package name */
    private CopyOnWriteArrayList<i> f41239K;

    /* renamed from: L, reason: collision with root package name */
    private int f41240L;

    /* renamed from: M, reason: collision with root package name */
    private long f41241M;

    /* renamed from: N, reason: collision with root package name */
    private float f41242N;

    /* renamed from: O, reason: collision with root package name */
    private int f41243O;

    /* renamed from: P, reason: collision with root package name */
    private float f41244P;

    /* renamed from: Q, reason: collision with root package name */
    protected boolean f41245Q;

    /* renamed from: R, reason: collision with root package name */
    int f41246R;

    /* renamed from: S, reason: collision with root package name */
    int f41247S;

    /* renamed from: c, reason: collision with root package name */
    m f41248c;

    /* renamed from: d, reason: collision with root package name */
    p2.d f41249d;

    /* renamed from: e, reason: collision with root package name */
    Interpolator f41250e;

    /* renamed from: f, reason: collision with root package name */
    float f41251f;

    /* renamed from: g, reason: collision with root package name */
    private int f41252g;

    /* renamed from: h, reason: collision with root package name */
    int f41253h;

    /* renamed from: i, reason: collision with root package name */
    private int f41254i;

    /* renamed from: j, reason: collision with root package name */
    private int f41255j;

    /* renamed from: k, reason: collision with root package name */
    private int f41256k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41257l;

    /* renamed from: m, reason: collision with root package name */
    HashMap<View, k> f41258m;

    /* renamed from: n, reason: collision with root package name */
    private long f41259n;

    /* renamed from: o, reason: collision with root package name */
    private float f41260o;

    /* renamed from: p, reason: collision with root package name */
    float f41261p;

    /* renamed from: q, reason: collision with root package name */
    float f41262q;

    /* renamed from: r, reason: collision with root package name */
    private long f41263r;

    /* renamed from: r0, reason: collision with root package name */
    int f41264r0;

    /* renamed from: s, reason: collision with root package name */
    float f41265s;

    /* renamed from: s0, reason: collision with root package name */
    int f41266s0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f41267t;

    /* renamed from: t0, reason: collision with root package name */
    int f41268t0;

    /* renamed from: u, reason: collision with root package name */
    boolean f41269u;

    /* renamed from: u0, reason: collision with root package name */
    int f41270u0;

    /* renamed from: v, reason: collision with root package name */
    int f41271v;

    /* renamed from: v0, reason: collision with root package name */
    float f41272v0;

    /* renamed from: w, reason: collision with root package name */
    d f41273w;

    /* renamed from: w0, reason: collision with root package name */
    private h2.d f41274w0;

    /* renamed from: x, reason: collision with root package name */
    private boolean f41275x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f41276x0;

    /* renamed from: y, reason: collision with root package name */
    private o2.b f41277y;

    /* renamed from: y0, reason: collision with root package name */
    private h f41278y0;

    /* renamed from: z, reason: collision with root package name */
    private c f41279z;

    /* renamed from: z0, reason: collision with root package name */
    private J2.b f41280z0;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f41281a;

        a(ViewGroup viewGroup) {
            this.f41281a = viewGroup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f41281a.setNestedScrollingEnabled(true);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41282a;

        static {
            int[] iArr = new int[j.values().length];
            f41282a = iArr;
            try {
                iArr[j.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41282a[j.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41282a[j.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41282a[j.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c extends p2.d {

        /* renamed from: a, reason: collision with root package name */
        float f41283a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        float f41284b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        float f41285c;

        c() {
        }

        @Override // p2.d
        public final float a() {
            return MotionLayout.this.f41251f;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f11 = this.f41283a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f11 > 0.0f) {
                float f12 = this.f41285c;
                if (f11 / f12 < f7) {
                    f7 = f11 / f12;
                }
                motionLayout.f41251f = f11 - (f12 * f7);
                return ((f11 * f7) - (((f12 * f7) * f7) / 2.0f)) + this.f41284b;
            }
            float f13 = this.f41285c;
            if ((-f11) / f13 < f7) {
                f7 = (-f11) / f13;
            }
            motionLayout.f41251f = (f13 * f7) + f11;
            return (((f13 * f7) * f7) / 2.0f) + (f11 * f7) + this.f41284b;
        }
    }

    private class d {

        /* renamed from: a, reason: collision with root package name */
        float[] f41287a;

        /* renamed from: b, reason: collision with root package name */
        int[] f41288b;

        /* renamed from: c, reason: collision with root package name */
        float[] f41289c;

        /* renamed from: d, reason: collision with root package name */
        Path f41290d;

        /* renamed from: e, reason: collision with root package name */
        Paint f41291e;

        /* renamed from: f, reason: collision with root package name */
        Paint f41292f;

        /* renamed from: g, reason: collision with root package name */
        Paint f41293g;

        /* renamed from: h, reason: collision with root package name */
        Paint f41294h;

        /* renamed from: i, reason: collision with root package name */
        Paint f41295i;

        /* renamed from: j, reason: collision with root package name */
        private float[] f41296j;

        /* renamed from: k, reason: collision with root package name */
        int f41297k;

        /* renamed from: l, reason: collision with root package name */
        Rect f41298l = new Rect();

        /* renamed from: m, reason: collision with root package name */
        int f41299m = 1;

        public d() {
            Paint paint = new Paint();
            this.f41291e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f41292f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f41293g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.f41294h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f41296j = new float[8];
            Paint paint5 = new Paint();
            this.f41295i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f41289c = new float[100];
            this.f41288b = new int[50];
        }

        private void c(Canvas canvas) {
            float[] fArr = this.f41287a;
            float f7 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float min = Math.min(f7, f12);
            float max = Math.max(f11, f13);
            float max2 = Math.max(f7, f12);
            float max3 = Math.max(f11, f13);
            Paint paint = this.f41293g;
            canvas.drawLine(min, max, max2, max3, paint);
            canvas.drawLine(Math.min(f7, f12), Math.min(f11, f13), Math.min(f7, f12), Math.max(f11, f13), paint);
        }

        private void d(Canvas canvas, float f7, float f11) {
            float[] fArr = this.f41287a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float min = Math.min(f12, f14);
            float max = Math.max(f13, f15);
            float min2 = f7 - Math.min(f12, f14);
            float max2 = Math.max(f13, f15) - f11;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f14 - f12)) + 0.5d)) / 100.0f);
            Paint paint = this.f41294h;
            paint.getTextBounds(str, 0, str.length(), this.f41298l);
            Rect rect = this.f41298l;
            canvas.drawText(str, ((min2 / 2.0f) - (rect.width() / 2)) + min, f11 - 20.0f, paint);
            float min3 = Math.min(f12, f14);
            Paint paint2 = this.f41293g;
            canvas.drawLine(f7, f11, min3, f11, paint2);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), this.f41298l);
            canvas.drawText(str2, f7 + 5.0f, max - ((max2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f7, f11, f7, Math.max(f13, f15), paint2);
        }

        private void e(Canvas canvas, float f7, float f11) {
            float[] fArr = this.f41287a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f12 - f14, f13 - f15);
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f11 - f13) * f17) + ((f7 - f12) * f16)) / (hypot * hypot);
            float f19 = (f16 * f18) + f12;
            float f21 = (f18 * f17) + f13;
            Path path = new Path();
            path.moveTo(f7, f11);
            path.lineTo(f19, f21);
            float hypot2 = (float) Math.hypot(f19 - f7, f21 - f11);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            Paint paint = this.f41294h;
            paint.getTextBounds(str, 0, str.length(), this.f41298l);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.f41298l.width() / 2), -20.0f, paint);
            canvas.drawLine(f7, f11, f19, f21, this.f41293g);
        }

        private void f(Canvas canvas, float f7, float f11, int i11, int i12) {
            StringBuilder sb2 = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb2.append(((int) ((((f7 - (i11 / 2)) * 100.0f) / (motionLayout.getWidth() - i11)) + 0.5d)) / 100.0f);
            String sb3 = sb2.toString();
            Paint paint = this.f41294h;
            paint.getTextBounds(sb3, 0, sb3.length(), this.f41298l);
            Rect rect = this.f41298l;
            canvas.drawText(sb3, ((f7 / 2.0f) - (rect.width() / 2)) + 0.0f, f11 - 20.0f, paint);
            float min = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f41293g;
            canvas.drawLine(f7, f11, min, f11, paint2);
            String str = "" + (((int) ((((f11 - (i12 / 2)) * 100.0f) / (motionLayout.getHeight() - i12)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), this.f41298l);
            canvas.drawText(str, f7 + 5.0f, 0.0f - ((f11 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f7, f11, f7, Math.max(0.0f, 1.0f), paint2);
        }

        public final void a(Canvas canvas, HashMap<View, k> hashMap, int i11, int i12) {
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            MotionLayout motionLayout = MotionLayout.this;
            boolean isInEditMode = motionLayout.isInEditMode();
            Paint paint = this.f41291e;
            if (!isInEditMode && (i12 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f41254i) + ProductContainerDTO.RATIO_DELIMITER + motionLayout.f41262q;
                canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, this.f41294h);
                canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint);
            }
            for (k kVar : hashMap.values()) {
                int k11 = kVar.k();
                if (i12 > 0 && k11 == 0) {
                    k11 = 1;
                }
                if (k11 != 0) {
                    this.f41297k = kVar.c(this.f41289c, this.f41288b);
                    if (k11 >= 1) {
                        int i13 = i11 / 16;
                        float[] fArr = this.f41287a;
                        if (fArr == null || fArr.length != i13 * 2) {
                            this.f41287a = new float[i13 * 2];
                            this.f41290d = new Path();
                        }
                        int i14 = this.f41299m;
                        float f7 = i14;
                        canvas.translate(f7, f7);
                        paint.setColor(1996488704);
                        Paint paint2 = this.f41295i;
                        paint2.setColor(1996488704);
                        Paint paint3 = this.f41292f;
                        paint3.setColor(1996488704);
                        Paint paint4 = this.f41293g;
                        paint4.setColor(1996488704);
                        kVar.d(this.f41287a, i13);
                        b(canvas, k11, this.f41297k, kVar);
                        paint.setColor(-21965);
                        paint3.setColor(-2067046);
                        paint2.setColor(-2067046);
                        paint4.setColor(-13391360);
                        float f11 = -i14;
                        canvas.translate(f11, f11);
                        b(canvas, k11, this.f41297k, kVar);
                        if (k11 == 5) {
                            this.f41290d.reset();
                            for (int i15 = 0; i15 <= 50; i15++) {
                                float[] fArr2 = this.f41296j;
                                kVar.e(i15 / 50, fArr2);
                                this.f41290d.moveTo(fArr2[0], fArr2[1]);
                                this.f41290d.lineTo(fArr2[2], fArr2[3]);
                                this.f41290d.lineTo(fArr2[4], fArr2[5]);
                                this.f41290d.lineTo(fArr2[6], fArr2[7]);
                                this.f41290d.close();
                            }
                            paint.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(this.f41290d, paint);
                            canvas.translate(-2.0f, -2.0f);
                            paint.setColor(-65536);
                            canvas.drawPath(this.f41290d, paint);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public final void b(Canvas canvas, int i11, int i12, k kVar) {
            Canvas canvas2;
            int i13;
            int i14;
            boolean z11;
            float f7;
            int[] iArr = this.f41288b;
            boolean z12 = false;
            int i15 = 4;
            if (i11 == 4) {
                int i16 = 0;
                boolean z13 = false;
                boolean z14 = false;
                while (i16 < this.f41297k) {
                    int i17 = iArr[i16];
                    boolean z15 = z13;
                    if (i17 == 1) {
                        z15 = true;
                    }
                    if (i17 == 0) {
                        z14 = true;
                    }
                    i16++;
                    z13 = z15;
                    z14 = z14;
                }
                if (z13) {
                    float[] fArr = this.f41287a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f41293g);
                }
                if (z14) {
                    c(canvas);
                }
            }
            if (i11 == 2) {
                float[] fArr2 = this.f41287a;
                canvas2 = canvas;
                canvas2.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f41293g);
            } else {
                canvas2 = canvas;
            }
            if (i11 == 3) {
                c(canvas);
            }
            canvas2.drawLines(this.f41287a, this.f41291e);
            View view = kVar.f41433b;
            if (view != null) {
                i13 = view.getWidth();
                i14 = kVar.f41433b.getHeight();
            } else {
                i13 = 0;
                i14 = 0;
            }
            int i18 = 1;
            while (i18 < i12 - 1) {
                if (i11 == i15 && iArr[i18 - 1] == 0) {
                    z11 = z12;
                } else {
                    int i19 = i18 * 2;
                    float[] fArr3 = this.f41289c;
                    float f11 = fArr3[i19];
                    float f12 = fArr3[i19 + 1];
                    this.f41290d.reset();
                    z11 = z12;
                    this.f41290d.moveTo(f11, f12 + 10.0f);
                    this.f41290d.lineTo(f11 + 10.0f, f12);
                    this.f41290d.lineTo(f11, f12 - 10.0f);
                    this.f41290d.lineTo(f11 - 10.0f, f12);
                    this.f41290d.close();
                    int i21 = i18 - 1;
                    kVar.n(i21);
                    Paint paint = this.f41295i;
                    if (i11 == i15) {
                        int i22 = iArr[i21];
                        if (i22 == 1) {
                            e(canvas2, f11 - 0.0f, f12 - 0.0f);
                        } else if (i22 == 0) {
                            d(canvas2, f11 - 0.0f, f12 - 0.0f);
                        } else if (i22 == 2) {
                            f7 = f12;
                            f(canvas2, f11 - 0.0f, f7 - 0.0f, i13, i14);
                            canvas2.drawPath(this.f41290d, paint);
                        }
                        f7 = f12;
                        canvas2.drawPath(this.f41290d, paint);
                    } else {
                        f7 = f12;
                    }
                    if (i11 == 2) {
                        e(canvas2, f11 - 0.0f, f7 - 0.0f);
                    }
                    if (i11 == 3) {
                        d(canvas2, f11 - 0.0f, f7 - 0.0f);
                    }
                    if (i11 == 6) {
                        f(canvas2, f11 - 0.0f, f7 - 0.0f, i13, i14);
                    }
                    canvas2.drawPath(this.f41290d, paint);
                }
                i18++;
                z12 = z11;
                i15 = 4;
            }
            boolean z16 = z12;
            float[] fArr4 = this.f41287a;
            if (fArr4.length > 1) {
                float f13 = fArr4[z16 ? 1 : 0];
                float f14 = fArr4[1];
                Paint paint2 = this.f41292f;
                canvas2.drawCircle(f13, f14, 8.0f, paint2);
                float[] fArr5 = this.f41287a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
            }
        }
    }

    class e {

        /* renamed from: a, reason: collision with root package name */
        m2.f f41301a = new m2.f();

        /* renamed from: b, reason: collision with root package name */
        m2.f f41302b = new m2.f();

        /* renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.d f41303c = null;

        /* renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.d f41304d = null;

        /* renamed from: e, reason: collision with root package name */
        int f41305e;

        /* renamed from: f, reason: collision with root package name */
        int f41306f;

        e() {
        }

        private void b(int i11, int i12) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.f41253h == motionLayout.A()) {
                m2.f fVar = this.f41302b;
                androidx.constraintlayout.widget.d dVar = this.f41304d;
                motionLayout.resolveSystem(fVar, optimizationLevel, (dVar == null || dVar.f41703c == 0) ? i11 : i12, (dVar == null || dVar.f41703c == 0) ? i12 : i11);
                androidx.constraintlayout.widget.d dVar2 = this.f41303c;
                if (dVar2 != null) {
                    m2.f fVar2 = this.f41301a;
                    int i13 = dVar2.f41703c;
                    int i14 = i13 == 0 ? i11 : i12;
                    if (i13 == 0) {
                        i11 = i12;
                    }
                    motionLayout.resolveSystem(fVar2, optimizationLevel, i14, i11);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar3 = this.f41303c;
            if (dVar3 != null) {
                m2.f fVar3 = this.f41301a;
                int i15 = dVar3.f41703c;
                motionLayout.resolveSystem(fVar3, optimizationLevel, i15 == 0 ? i11 : i12, i15 == 0 ? i12 : i11);
            }
            m2.f fVar4 = this.f41302b;
            androidx.constraintlayout.widget.d dVar4 = this.f41304d;
            int i16 = (dVar4 == null || dVar4.f41703c == 0) ? i11 : i12;
            if (dVar4 == null || dVar4.f41703c == 0) {
                i11 = i12;
            }
            motionLayout.resolveSystem(fVar4, optimizationLevel, i16, i11);
        }

        static void c(m2.f fVar, m2.f fVar2) {
            ArrayList<m2.e> arrayList = fVar.f74253v0;
            HashMap<m2.e, m2.e> hashMap = new HashMap<>();
            hashMap.put(fVar, fVar2);
            fVar2.f74253v0.clear();
            fVar2.k(fVar, hashMap);
            Iterator<m2.e> it = arrayList.iterator();
            while (it.hasNext()) {
                m2.e next = it.next();
                m2.e c8043a = next instanceof C8043a ? new C8043a() : next instanceof m2.h ? new m2.h() : next instanceof m2.g ? new m2.g() : next instanceof m2.l ? new m2.l() : next instanceof m2.i ? new m2.j() : new m2.e();
                fVar2.b(c8043a);
                hashMap.put(next, c8043a);
            }
            Iterator<m2.e> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m2.e next2 = it2.next();
                hashMap.get(next2).k(next2, hashMap);
            }
        }

        static m2.e d(m2.f fVar, View view) {
            if (fVar.r() == view) {
                return fVar;
            }
            ArrayList<m2.e> arrayList = fVar.f74253v0;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m2.e eVar = arrayList.get(i11);
                if (eVar.r() == view) {
                    return eVar;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void g(m2.f fVar, androidx.constraintlayout.widget.d dVar) {
            SparseArray<m2.e> sparseArray = new SparseArray<>();
            e.a aVar = new e.a();
            sparseArray.clear();
            sparseArray.put(0, fVar);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), fVar);
            if (dVar != null && dVar.f41703c != 0) {
                motionLayout.resolveSystem(this.f41302b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824));
            }
            Iterator<m2.e> it = fVar.f74253v0.iterator();
            while (it.hasNext()) {
                m2.e next = it.next();
                next.o0();
                sparseArray.put(((View) next.r()).getId(), next);
            }
            Iterator<m2.e> it2 = fVar.f74253v0.iterator();
            while (it2.hasNext()) {
                m2.e next2 = it2.next();
                View view = (View) next2.r();
                dVar.i(view.getId(), aVar);
                next2.T0(dVar.O(view.getId()));
                next2.z0(dVar.J(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    dVar.g((androidx.constraintlayout.widget.b) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                aVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
                motionLayout.applyConstraintsFromLayoutParams(false, view, next2, aVar, sparseArray);
                if (dVar.N(view.getId()) == 1) {
                    next2.S0(view.getVisibility());
                } else {
                    next2.S0(dVar.M(view.getId()));
                }
            }
            Iterator<m2.e> it3 = fVar.f74253v0.iterator();
            while (it3.hasNext()) {
                m2.e next3 = it3.next();
                if (next3 instanceof m2.m) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) next3.r();
                    m2.i iVar = (m2.i) next3;
                    bVar.updatePreLayout(fVar, iVar, sparseArray);
                    m2.m mVar = (m2.m) iVar;
                    for (int i11 = 0; i11 < mVar.f74240w0; i11++) {
                        m2.e eVar = mVar.f74239v0[i11];
                        if (eVar != null) {
                            eVar.G0();
                        }
                    }
                }
            }
        }

        public final void a() {
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            motionLayout.f41258m.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = motionLayout.getChildAt(i11);
                k kVar = new k(childAt);
                int id2 = childAt.getId();
                iArr[i11] = id2;
                sparseArray.put(id2, kVar);
                motionLayout.f41258m.put(childAt, kVar);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = motionLayout.getChildAt(i12);
                k kVar2 = motionLayout.f41258m.get(childAt2);
                if (kVar2 != null) {
                    if (this.f41303c != null) {
                        m2.e d11 = d(this.f41301a, childAt2);
                        if (d11 != null) {
                            kVar2.v(MotionLayout.l(motionLayout, d11), this.f41303c, motionLayout.getWidth(), motionLayout.getHeight());
                        } else if (motionLayout.f41271v != 0) {
                            Log.e("MotionLayout", C8834a.b() + "no widget for  " + C8834a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                    if (this.f41304d != null) {
                        m2.e d12 = d(this.f41302b, childAt2);
                        if (d12 != null) {
                            kVar2.s(MotionLayout.l(motionLayout, d12), this.f41304d, motionLayout.getWidth(), motionLayout.getHeight());
                        } else if (motionLayout.f41271v != 0) {
                            Log.e("MotionLayout", C8834a.b() + "no widget for  " + C8834a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                k kVar3 = (k) sparseArray.get(iArr[i13]);
                int h11 = kVar3.h();
                if (h11 != -1) {
                    kVar3.x((k) sparseArray.get(h11));
                }
            }
        }

        final void e(androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f41303c = dVar;
            this.f41304d = dVar2;
            this.f41301a = new m2.f();
            this.f41302b = new m2.f();
            m2.f fVar = this.f41301a;
            MotionLayout motionLayout = MotionLayout.this;
            fVar.q1(((ConstraintLayout) motionLayout).mLayoutWidget.h1());
            this.f41302b.q1(((ConstraintLayout) motionLayout).mLayoutWidget.h1());
            this.f41301a.f74253v0.clear();
            this.f41302b.f74253v0.clear();
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f41301a);
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f41302b);
            if (motionLayout.f41262q > 0.5d) {
                if (dVar != null) {
                    g(this.f41301a, dVar);
                }
                g(this.f41302b, dVar2);
            } else {
                g(this.f41302b, dVar2);
                if (dVar != null) {
                    g(this.f41301a, dVar);
                }
            }
            this.f41301a.t1(motionLayout.isRtl());
            this.f41301a.u1();
            this.f41302b.t1(motionLayout.isRtl());
            this.f41302b.u1();
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    m2.f fVar2 = this.f41301a;
                    e.b bVar = e.b.WRAP_CONTENT;
                    fVar2.C0(bVar);
                    this.f41302b.C0(bVar);
                }
                if (layoutParams.height == -2) {
                    m2.f fVar3 = this.f41301a;
                    e.b bVar2 = e.b.WRAP_CONTENT;
                    fVar3.Q0(bVar2);
                    this.f41302b.Q0(bVar2);
                }
            }
        }

        public final void f() {
            HashMap<View, k> hashMap;
            MotionLayout motionLayout = MotionLayout.this;
            int i11 = motionLayout.f41255j;
            int i12 = motionLayout.f41256k;
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            motionLayout.f41268t0 = mode;
            motionLayout.f41270u0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i11, i12);
            int i13 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i11, i12);
                motionLayout.f41246R = this.f41301a.N();
                motionLayout.f41247S = this.f41301a.v();
                motionLayout.f41264r0 = this.f41302b.N();
                int v11 = this.f41302b.v();
                motionLayout.f41266s0 = v11;
                motionLayout.f41245Q = (motionLayout.f41246R == motionLayout.f41264r0 && motionLayout.f41247S == v11) ? false : true;
            }
            int i14 = motionLayout.f41246R;
            int i15 = motionLayout.f41247S;
            int i16 = motionLayout.f41268t0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i14 = (int) ((motionLayout.f41272v0 * (motionLayout.f41264r0 - i14)) + i14);
            }
            int i17 = motionLayout.f41270u0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i15 = (int) ((motionLayout.f41272v0 * (motionLayout.f41266s0 - i15)) + i15);
            }
            motionLayout.resolveMeasuredDimension(i11, i12, i14, i15, this.f41301a.m1() || this.f41302b.m1(), this.f41301a.k1() || this.f41302b.k1());
            int childCount = motionLayout.getChildCount();
            motionLayout.f41226C0.a();
            motionLayout.f41269u = true;
            SparseArray sparseArray = new SparseArray();
            int i18 = 0;
            while (true) {
                hashMap = motionLayout.f41258m;
                if (i18 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i18);
                sparseArray.put(childAt.getId(), hashMap.get(childAt));
                i18++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            m.b bVar = motionLayout.f41248c.f41478c;
            int i19 = bVar != null ? bVar.f41511p : -1;
            if (i19 != -1) {
                for (int i21 = 0; i21 < childCount; i21++) {
                    k kVar = hashMap.get(motionLayout.getChildAt(i21));
                    if (kVar != null) {
                        kVar.t(i19);
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[hashMap.size()];
            int i22 = 0;
            for (int i23 = 0; i23 < childCount; i23++) {
                k kVar2 = hashMap.get(motionLayout.getChildAt(i23));
                if (kVar2.h() != -1) {
                    sparseBooleanArray.put(kVar2.h(), true);
                    iArr[i22] = kVar2.h();
                    i22++;
                }
            }
            for (int i24 = 0; i24 < i22; i24++) {
                k kVar3 = hashMap.get(motionLayout.findViewById(iArr[i24]));
                if (kVar3 != null) {
                    motionLayout.f41248c.n(kVar3);
                    System.nanoTime();
                    kVar3.w(width, height);
                }
            }
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt2 = motionLayout.getChildAt(i25);
                k kVar4 = hashMap.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && kVar4 != null) {
                    motionLayout.f41248c.n(kVar4);
                    System.nanoTime();
                    kVar4.w(width, height);
                }
            }
            m.b bVar2 = motionLayout.f41248c.f41478c;
            float f7 = bVar2 != null ? bVar2.f41504i : 0.0f;
            if (f7 != 0.0f) {
                boolean z11 = ((double) f7) < 0.0d;
                float abs = Math.abs(f7);
                float f11 = -3.4028235E38f;
                float f12 = Float.MAX_VALUE;
                float f13 = -3.4028235E38f;
                float f14 = Float.MAX_VALUE;
                for (int i26 = 0; i26 < childCount; i26++) {
                    k kVar5 = hashMap.get(motionLayout.getChildAt(i26));
                    if (!Float.isNaN(kVar5.f41443l)) {
                        for (int i27 = 0; i27 < childCount; i27++) {
                            k kVar6 = hashMap.get(motionLayout.getChildAt(i27));
                            if (!Float.isNaN(kVar6.f41443l)) {
                                f12 = Math.min(f12, kVar6.f41443l);
                                f11 = Math.max(f11, kVar6.f41443l);
                            }
                        }
                        while (i13 < childCount) {
                            k kVar7 = hashMap.get(motionLayout.getChildAt(i13));
                            if (!Float.isNaN(kVar7.f41443l)) {
                                kVar7.f41445n = 1.0f / (1.0f - abs);
                                if (z11) {
                                    kVar7.f41444m = abs - (((f11 - kVar7.f41443l) / (f11 - f12)) * abs);
                                } else {
                                    kVar7.f41444m = abs - (((kVar7.f41443l - f12) * abs) / (f11 - f12));
                                }
                            }
                            i13++;
                        }
                        return;
                    }
                    float l11 = kVar5.l();
                    float m11 = kVar5.m();
                    float f15 = z11 ? m11 - l11 : m11 + l11;
                    f14 = Math.min(f14, f15);
                    f13 = Math.max(f13, f15);
                }
                while (i13 < childCount) {
                    k kVar8 = hashMap.get(motionLayout.getChildAt(i13));
                    float l12 = kVar8.l();
                    float m12 = kVar8.m();
                    float f16 = z11 ? m12 - l12 : m12 + l12;
                    kVar8.f41445n = 1.0f / (1.0f - abs);
                    kVar8.f41444m = abs - (((f16 - f14) * abs) / (f13 - f14));
                    i13++;
                }
            }
        }
    }

    protected interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class g implements f {

        /* renamed from: b, reason: collision with root package name */
        private static g f41308b = new g();

        /* renamed from: a, reason: collision with root package name */
        VelocityTracker f41309a;

        public static g a() {
            g gVar = f41308b;
            gVar.f41309a = VelocityTracker.obtain();
            return gVar;
        }
    }

    class h {

        /* renamed from: a, reason: collision with root package name */
        float f41310a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        int f41311b = -1;

        /* renamed from: c, reason: collision with root package name */
        int f41312c = -1;

        h() {
        }

        final void a() {
            int i11 = this.f41311b;
            MotionLayout motionLayout = MotionLayout.this;
            if (i11 != -1 || this.f41312c != -1) {
                if (i11 == -1) {
                    motionLayout.P(this.f41312c);
                } else {
                    int i12 = this.f41312c;
                    if (i12 == -1) {
                        motionLayout.setState(i11, -1, -1);
                    } else {
                        motionLayout.J(i11, i12);
                    }
                }
                motionLayout.I(j.SETUP);
            }
            if (Float.isNaN(Float.NaN)) {
                if (Float.isNaN(this.f41310a)) {
                    return;
                }
                motionLayout.H(this.f41310a);
            } else {
                motionLayout.G(this.f41310a);
                this.f41310a = Float.NaN;
                this.f41311b = -1;
                this.f41312c = -1;
            }
        }
    }

    public interface i {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class j {
        private static final /* synthetic */ j[] $VALUES;
        public static final j FINISHED;
        public static final j MOVING;
        public static final j SETUP;
        public static final j UNDEFINED;

        static {
            j jVar = new j("UNDEFINED", 0);
            UNDEFINED = jVar;
            j jVar2 = new j("SETUP", 1);
            SETUP = jVar2;
            j jVar3 = new j("MOVING", 2);
            MOVING = jVar3;
            j jVar4 = new j("FINISHED", 3);
            FINISHED = jVar4;
            $VALUES = new j[]{jVar, jVar2, jVar3, jVar4};
        }

        private j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }
    }

    public MotionLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m mVar;
        this.f41250e = null;
        this.f41251f = 0.0f;
        this.f41252g = -1;
        this.f41253h = -1;
        this.f41254i = -1;
        this.f41255j = 0;
        this.f41256k = 0;
        this.f41257l = true;
        this.f41258m = new HashMap<>();
        this.f41259n = 0L;
        this.f41260o = 1.0f;
        this.f41261p = 0.0f;
        this.f41262q = 0.0f;
        this.f41265s = 0.0f;
        this.f41269u = false;
        this.f41271v = 0;
        this.f41275x = false;
        this.f41277y = new o2.b();
        this.f41279z = new c();
        this.f41225C = false;
        this.f41235H = false;
        this.f41237I = null;
        this.f41238J = null;
        this.f41239K = null;
        this.f41240L = 0;
        this.f41241M = -1L;
        this.f41242N = 0.0f;
        this.f41243O = 0;
        this.f41244P = 0.0f;
        this.f41245Q = false;
        this.f41274w0 = new h2.d();
        this.f41276x0 = false;
        this.f41280z0 = null;
        new HashMap();
        this.f41222A0 = new Rect();
        this.f41224B0 = j.UNDEFINED;
        this.f41226C0 = new e();
        this.f41228D0 = false;
        this.f41230E0 = new RectF();
        this.f41232F0 = null;
        this.f41234G0 = null;
        this.f41236H0 = new ArrayList<>();
        f41220I0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f41857n);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z11 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 2) {
                    this.f41248c = new m(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f41253h = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f41265s = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f41269u = true;
                } else if (index == 0) {
                    z11 = obtainStyledAttributes.getBoolean(index, z11);
                } else if (index == 5) {
                    if (this.f41271v == 0) {
                        this.f41271v = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f41271v = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f41248c == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z11) {
                this.f41248c = null;
            }
        }
        if (this.f41271v != 0) {
            m mVar2 = this.f41248c;
            if (mVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int p11 = mVar2.p();
                m mVar3 = this.f41248c;
                androidx.constraintlayout.widget.d h11 = mVar3.h(mVar3.p());
                String c11 = C8834a.c(p11, getContext());
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    int id2 = childAt.getId();
                    if (id2 == -1) {
                        StringBuilder b11 = C6594f.b("CHECK: ", c11, " ALL VIEWS SHOULD HAVE ID's ");
                        b11.append(childAt.getClass().getName());
                        b11.append(" does not!");
                        Log.w("MotionLayout", b11.toString());
                    }
                    if (h11.I(id2) == null) {
                        StringBuilder b12 = C6594f.b("CHECK: ", c11, " NO CONSTRAINTS for ");
                        b12.append(C8834a.d(childAt));
                        Log.w("MotionLayout", b12.toString());
                    }
                }
                int[] K11 = h11.K();
                for (int i13 = 0; i13 < K11.length; i13++) {
                    int i14 = K11[i13];
                    String c12 = C8834a.c(i14, getContext());
                    if (findViewById(K11[i13]) == null) {
                        Log.w("MotionLayout", "CHECK: " + c11 + " NO View matches id " + c12);
                    }
                    if (h11.J(i14) == -1) {
                        Log.w("MotionLayout", V.e.a("CHECK: ", c11, "(", c12, ") no LAYOUT_HEIGHT"));
                    }
                    if (h11.O(i14) == -1) {
                        Log.w("MotionLayout", V.e.a("CHECK: ", c11, "(", c12, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator<m.b> it = this.f41248c.j().iterator();
                while (it.hasNext()) {
                    m.b next = it.next();
                    if (next == this.f41248c.f41478c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (next.y() == next.w()) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int y11 = next.y();
                    int w11 = next.w();
                    String c13 = C8834a.c(y11, getContext());
                    String c14 = C8834a.c(w11, getContext());
                    if (sparseIntArray.get(y11) == w11) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + c13 + "->" + c14);
                    }
                    if (sparseIntArray2.get(w11) == y11) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + c13 + "->" + c14);
                    }
                    sparseIntArray.put(y11, w11);
                    sparseIntArray2.put(w11, y11);
                    if (this.f41248c.h(y11) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + c13);
                    }
                    if (this.f41248c.h(w11) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + c13);
                    }
                }
            }
        }
        if (this.f41253h != -1 || (mVar = this.f41248c) == null) {
            return;
        }
        this.f41253h = mVar.p();
        this.f41252g = this.f41248c.p();
        m.b bVar = this.f41248c.f41478c;
        this.f41254i = bVar != null ? bVar.f41498c : -1;
    }

    private boolean C(float f7, float f11, View view, MotionEvent motionEvent) {
        boolean z11;
        boolean onTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (C((r3.getLeft() + f7) - view.getScrollX(), (r3.getTop() + f11) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z11) {
            RectF rectF = this.f41230E0;
            rectF.set(f7, f11, (view.getRight() + f7) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f7;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f12, f13);
                    if (this.f41234G0 == null) {
                        this.f41234G0 = new Matrix();
                    }
                    matrix.invert(this.f41234G0);
                    obtain.transform(this.f41234G0);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z11;
    }

    private void F() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.f41239K;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ArrayList<Integer> arrayList = this.f41236H0;
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f41239K;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    i next2 = it2.next();
                    next.getClass();
                    next2.getClass();
                }
            }
        }
        arrayList.clear();
    }

    static Rect l(MotionLayout motionLayout, m2.e eVar) {
        int P11 = eVar.P();
        Rect rect = motionLayout.f41222A0;
        rect.top = P11;
        rect.left = eVar.O();
        rect.right = eVar.N() + rect.left;
        rect.bottom = eVar.v() + rect.top;
        return rect;
    }

    private void u() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f41239K;
        if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty() || this.f41244P == this.f41261p) {
            return;
        }
        if (this.f41243O != -1 && (copyOnWriteArrayList = this.f41239K) != null) {
            Iterator<i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        this.f41243O = -1;
        this.f41244P = this.f41261p;
        CopyOnWriteArrayList<i> copyOnWriteArrayList3 = this.f41239K;
        if (copyOnWriteArrayList3 != null) {
            Iterator<i> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public final int A() {
        return this.f41252g;
    }

    public final m.b B(int i11) {
        return this.f41248c.q(i11);
    }

    public final boolean D() {
        return this.f41257l;
    }

    final void E() {
        m mVar;
        m.b bVar;
        m mVar2 = this.f41248c;
        if (mVar2 == null) {
            return;
        }
        if (mVar2.g(this.f41253h, this)) {
            requestLayout();
            return;
        }
        int i11 = this.f41253h;
        if (i11 != -1) {
            this.f41248c.f(i11, this);
        }
        if (!this.f41248c.C() || (bVar = (mVar = this.f41248c).f41478c) == null || bVar.f41507l == null) {
            return;
        }
        mVar.f41478c.f41507l.w();
    }

    public final void G(float f7) {
        if (!super.isAttachedToWindow()) {
            if (this.f41278y0 == null) {
                this.f41278y0 = new h();
            }
            this.f41278y0.f41310a = f7;
        } else {
            H(f7);
            I(j.MOVING);
            this.f41251f = Float.NaN;
            s(0.0f);
        }
    }

    public final void H(float f7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.f41278y0 == null) {
                this.f41278y0 = new h();
            }
            this.f41278y0.f41310a = f7;
            return;
        }
        if (f7 <= 0.0f) {
            if (this.f41262q == 1.0f && this.f41253h == this.f41254i) {
                I(j.MOVING);
            }
            this.f41253h = this.f41252g;
            if (this.f41262q == 0.0f) {
                I(j.FINISHED);
            }
        } else if (f7 >= 1.0f) {
            if (this.f41262q == 0.0f && this.f41253h == this.f41252g) {
                I(j.MOVING);
            }
            this.f41253h = this.f41254i;
            if (this.f41262q == 1.0f) {
                I(j.FINISHED);
            }
        } else {
            this.f41253h = -1;
            I(j.MOVING);
        }
        if (this.f41248c == null) {
            return;
        }
        this.f41267t = true;
        this.f41265s = f7;
        this.f41261p = f7;
        this.f41263r = -1L;
        this.f41259n = -1L;
        this.f41249d = null;
        this.f41269u = true;
        invalidate();
    }

    final void I(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.f41253h == -1) {
            return;
        }
        j jVar3 = this.f41224B0;
        this.f41224B0 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            u();
        }
        int i11 = b.f41282a[jVar3.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 && jVar == jVar2) {
                v();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            u();
        }
        if (jVar == jVar2) {
            v();
        }
    }

    public final void J(int i11, int i12) {
        if (!super.isAttachedToWindow()) {
            if (this.f41278y0 == null) {
                this.f41278y0 = new h();
            }
            h hVar = this.f41278y0;
            hVar.f41311b = i11;
            hVar.f41312c = i12;
            return;
        }
        m mVar = this.f41248c;
        if (mVar != null) {
            this.f41252g = i11;
            this.f41254i = i12;
            mVar.A(i11, i12);
            this.f41226C0.e(this.f41248c.h(i11), this.f41248c.h(i12));
            this.f41226C0.f();
            invalidate();
            this.f41262q = 0.0f;
            O();
        }
    }

    protected final void K(m.b bVar) {
        this.f41248c.B(bVar);
        I(j.SETUP);
        int i11 = this.f41253h;
        m.b bVar2 = this.f41248c.f41478c;
        if (i11 == (bVar2 == null ? -1 : bVar2.f41498c)) {
            this.f41262q = 1.0f;
            this.f41261p = 1.0f;
            this.f41265s = 1.0f;
        } else {
            this.f41262q = 0.0f;
            this.f41261p = 0.0f;
            this.f41265s = 0.0f;
        }
        this.f41263r = bVar.B(1) ? -1L : System.nanoTime();
        int p11 = this.f41248c.p();
        m.b bVar3 = this.f41248c.f41478c;
        int i12 = bVar3 != null ? bVar3.f41498c : -1;
        if (p11 == this.f41252g && i12 == this.f41254i) {
            return;
        }
        this.f41252g = p11;
        this.f41254i = i12;
        this.f41248c.A(p11, i12);
        androidx.constraintlayout.widget.d h11 = this.f41248c.h(this.f41252g);
        androidx.constraintlayout.widget.d h12 = this.f41248c.h(this.f41254i);
        e eVar = this.f41226C0;
        eVar.e(h11, h12);
        int i13 = this.f41252g;
        int i14 = this.f41254i;
        eVar.f41305e = i13;
        eVar.f41306f = i14;
        eVar.f();
        this.f41226C0.f();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r23 != 7) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if ((((r24 * r6) - (((r2 * r6) * r6) / 2.0f)) + r1) > 1.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        r2 = r21.f41262q;
        r5 = r21.f41260o;
        r6 = r21.f41248c.o();
        r1 = r21.f41248c;
        r7 = r1.f41478c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r7.f41507l == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        r7 = r1.f41478c.f41507l.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r21.f41277y.b(r2, r22, r24, r5, r6, r7);
        r21.f41251f = 0.0f;
        r1 = r21.f41253h;
        r21.f41265s = r22;
        r21.f41253h = r1;
        r21.f41249d = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        r1 = r21.f41262q;
        r2 = r21.f41248c.o();
        r12.f41283a = r24;
        r12.f41284b = r1;
        r12.f41285c = r2;
        r21.f41249d = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if ((((((r2 * r5) * r5) / 2.0f) + (r24 * r5)) + r1) < 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(float f7, int i11, float f11) {
        if (this.f41248c == null || this.f41262q == f7) {
            return;
        }
        this.f41275x = true;
        this.f41259n = System.nanoTime();
        this.f41260o = this.f41248c.k() / 1000.0f;
        this.f41265s = f7;
        this.f41269u = true;
        o2.b bVar = this.f41277y;
        float f12 = 0.0f;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            c cVar = this.f41279z;
            if (i11 == 4) {
                float f13 = this.f41262q;
                float o11 = this.f41248c.o();
                cVar.f41283a = f11;
                cVar.f41284b = f13;
                cVar.f41285c = o11;
                this.f41249d = cVar;
            } else if (i11 == 5) {
                float f14 = this.f41262q;
                float o12 = this.f41248c.o();
                if (f11 > 0.0f) {
                    float f15 = f11 / o12;
                } else {
                    float f16 = (-f11) / o12;
                }
            } else if (i11 != 6) {
            }
            this.f41267t = false;
            this.f41259n = System.nanoTime();
            invalidate();
        }
        float f17 = (i11 == 1 || i11 == 7) ? 0.0f : (i11 == 2 || i11 == 6) ? 1.0f : f7;
        m mVar = this.f41248c;
        m.b bVar2 = mVar.f41478c;
        if (((bVar2 == null || bVar2.f41507l == null) ? 0 : mVar.f41478c.f41507l.b()) == 0) {
            float f18 = this.f41262q;
            float f19 = this.f41260o;
            float o13 = this.f41248c.o();
            m mVar2 = this.f41248c;
            m.b bVar3 = mVar2.f41478c;
            if (bVar3 != null && bVar3.f41507l != null) {
                f12 = mVar2.f41478c.f41507l.f();
            }
            this.f41277y.b(f18, f17, f11, f19, o13, f12);
        } else {
            float f21 = this.f41262q;
            m mVar3 = this.f41248c;
            m.b bVar4 = mVar3.f41478c;
            float k11 = (bVar4 == null || bVar4.f41507l == null) ? 0.0f : mVar3.f41478c.f41507l.k();
            m mVar4 = this.f41248c;
            m.b bVar5 = mVar4.f41478c;
            float l11 = (bVar5 == null || bVar5.f41507l == null) ? 0.0f : mVar4.f41478c.f41507l.l();
            m mVar5 = this.f41248c;
            m.b bVar6 = mVar5.f41478c;
            float j11 = (bVar6 == null || bVar6.f41507l == null) ? 0.0f : mVar5.f41478c.f41507l.j();
            m mVar6 = this.f41248c;
            m.b bVar7 = mVar6.f41478c;
            if (bVar7 != null && bVar7.f41507l != null) {
                f12 = mVar6.f41478c.f41507l.m();
            }
            float f22 = f12;
            m mVar7 = this.f41248c;
            m.b bVar8 = mVar7.f41478c;
            this.f41277y.d(f21, f17, k11, l11, j11, f22, (bVar8 == null || bVar8.f41507l == null) ? 0 : mVar7.f41478c.f41507l.i());
        }
        int i12 = this.f41253h;
        this.f41265s = f17;
        this.f41253h = i12;
        this.f41249d = bVar;
        this.f41267t = false;
        this.f41259n = System.nanoTime();
        invalidate();
    }

    public final void M() {
        s(1.0f);
        this.f41280z0 = null;
    }

    public final void N(J2.b bVar) {
        s(1.0f);
        this.f41280z0 = bVar;
    }

    public final void O() {
        s(0.0f);
    }

    public final void P(int i11) {
        androidx.constraintlayout.widget.k kVar;
        float f7;
        int a11;
        if (!super.isAttachedToWindow()) {
            if (this.f41278y0 == null) {
                this.f41278y0 = new h();
            }
            this.f41278y0.f41312c = i11;
            return;
        }
        m mVar = this.f41248c;
        if (mVar != null && (kVar = mVar.f41477b) != null && (a11 = kVar.a(this.f41253h, -1, f7, i11)) != -1) {
            i11 = a11;
        }
        int i12 = this.f41253h;
        if (i12 == i11) {
            return;
        }
        if (this.f41252g == i11) {
            s(0.0f);
            return;
        }
        if (this.f41254i == i11) {
            s(1.0f);
            return;
        }
        this.f41254i = i11;
        if (i12 != -1) {
            J(i12, i11);
            s(1.0f);
            this.f41262q = 0.0f;
            M();
            return;
        }
        this.f41275x = false;
        this.f41265s = 1.0f;
        this.f41261p = 0.0f;
        this.f41262q = 0.0f;
        this.f41263r = System.nanoTime();
        this.f41259n = System.nanoTime();
        this.f41267t = false;
        this.f41249d = null;
        this.f41260o = this.f41248c.k() / 1000.0f;
        this.f41252g = -1;
        this.f41248c.A(-1, this.f41254i);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap<View, k> hashMap = this.f41258m;
        hashMap.clear();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            hashMap.put(childAt, new k(childAt));
            sparseArray.put(childAt.getId(), hashMap.get(childAt));
        }
        this.f41269u = true;
        androidx.constraintlayout.widget.d h11 = this.f41248c.h(i11);
        e eVar = this.f41226C0;
        eVar.e(null, h11);
        this.f41226C0.f();
        invalidate();
        eVar.a();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            k kVar2 = hashMap.get(childAt2);
            if (kVar2 != null) {
                kVar2.u(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i15 = 0; i15 < childCount; i15++) {
            k kVar3 = hashMap.get(getChildAt(i15));
            if (kVar3 != null) {
                this.f41248c.n(kVar3);
                System.nanoTime();
                kVar3.w(width, height);
            }
        }
        m.b bVar = this.f41248c.f41478c;
        float f11 = bVar != null ? bVar.f41504i : 0.0f;
        if (f11 != 0.0f) {
            float f12 = Float.MAX_VALUE;
            float f13 = -3.4028235E38f;
            for (int i16 = 0; i16 < childCount; i16++) {
                k kVar4 = hashMap.get(getChildAt(i16));
                float m11 = kVar4.m() + kVar4.l();
                f12 = Math.min(f12, m11);
                f13 = Math.max(f13, m11);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                k kVar5 = hashMap.get(getChildAt(i17));
                float l11 = kVar5.l();
                float m12 = kVar5.m();
                kVar5.f41445n = 1.0f / (1.0f - f11);
                kVar5.f41444m = f11 - ((((l11 + m12) - f12) * f11) / (f13 - f12));
            }
        }
        this.f41261p = 0.0f;
        this.f41262q = 0.0f;
        this.f41269u = true;
        invalidate();
    }

    public final void Q(androidx.constraintlayout.widget.d dVar, int i11) {
        m mVar = this.f41248c;
        if (mVar != null) {
            mVar.y(dVar, i11);
        }
        this.f41226C0.e(this.f41248c.h(this.f41252g), this.f41248c.h(this.f41254i));
        this.f41226C0.f();
        invalidate();
        if (this.f41253h == i11) {
            dVar.f(this);
        }
    }

    public final void R(int i11, View... viewArr) {
        m mVar = this.f41248c;
        if (mVar != null) {
            mVar.f41492q.d(i11, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        r rVar;
        ArrayList<p.a> arrayList;
        t(false);
        m mVar = this.f41248c;
        if (mVar != null && (rVar = mVar.f41492q) != null && (arrayList = rVar.f41588e) != null) {
            Iterator<p.a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            ArrayList<p.a> arrayList2 = rVar.f41588e;
            ArrayList<p.a> arrayList3 = rVar.f41589f;
            arrayList2.removeAll(arrayList3);
            arrayList3.clear();
            if (rVar.f41588e.isEmpty()) {
                rVar.f41588e = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.f41248c == null) {
            return;
        }
        if ((this.f41271v & 1) == 1 && !isInEditMode()) {
            this.f41240L++;
            long nanoTime = System.nanoTime();
            long j11 = this.f41241M;
            if (j11 != -1) {
                if (nanoTime - j11 > 200000000) {
                    this.f41242N = ((int) ((this.f41240L / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f41240L = 0;
                    this.f41241M = nanoTime;
                }
            } else {
                this.f41241M = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float f7 = ((int) (this.f41262q * 1000.0f)) / 10.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f41242N);
            sb2.append(" fps ");
            int i11 = this.f41252g;
            StringBuilder e11 = C3261b.e(o0.c(sb2, i11 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i11), " -> "));
            int i12 = this.f41254i;
            e11.append(i12 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i12));
            e11.append(" (progress: ");
            e11.append(f7);
            e11.append(" ) state=");
            int i13 = this.f41253h;
            if (i13 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i13 != -1 ? getContext().getResources().getResourceEntryName(i13) : "UNDEFINED";
            }
            e11.append(resourceEntryName);
            String sb3 = e11.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb3, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb3, 10.0f, getHeight() - 30, paint);
        }
        if (this.f41271v > 1) {
            if (this.f41273w == null) {
                this.f41273w = new d();
            }
            this.f41273w.a(canvas, this.f41258m, this.f41248c.k(), this.f41271v);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i11) {
        m.b bVar;
        if (i11 == 0) {
            this.f41248c = null;
            return;
        }
        try {
            m mVar = new m(getContext(), this, i11);
            this.f41248c = mVar;
            int i12 = -1;
            if (this.f41253h == -1) {
                this.f41253h = mVar.p();
                this.f41252g = this.f41248c.p();
                m.b bVar2 = this.f41248c.f41478c;
                if (bVar2 != null) {
                    i12 = bVar2.f41498c;
                }
                this.f41254i = i12;
            }
            if (!super.isAttachedToWindow()) {
                this.f41248c = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                m mVar2 = this.f41248c;
                if (mVar2 != null) {
                    androidx.constraintlayout.widget.d h11 = mVar2.h(this.f41253h);
                    this.f41248c.x(this);
                    if (h11 != null) {
                        h11.f(this);
                    }
                    this.f41252g = this.f41253h;
                }
                E();
                h hVar = this.f41278y0;
                if (hVar != null) {
                    hVar.a();
                    return;
                }
                m mVar3 = this.f41248c;
                if (mVar3 == null || (bVar = mVar3.f41478c) == null || bVar.v() != 4) {
                    return;
                }
                M();
                I(j.SETUP);
                I(j.MOVING);
            } catch (Exception e11) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e11);
            }
        } catch (Exception e12) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        m.b bVar;
        int i11;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        m mVar = this.f41248c;
        if (mVar != null && (i11 = this.f41253h) != -1) {
            androidx.constraintlayout.widget.d h11 = mVar.h(i11);
            this.f41248c.x(this);
            if (h11 != null) {
                h11.f(this);
            }
            this.f41252g = this.f41253h;
        }
        E();
        h hVar = this.f41278y0;
        if (hVar != null) {
            hVar.a();
            return;
        }
        m mVar2 = this.f41248c;
        if (mVar2 == null || (bVar = mVar2.f41478c) == null || bVar.v() != 4) {
            return;
        }
        M();
        I(j.SETUP);
        I(j.MOVING);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n z11;
        int o11;
        RectF n11;
        m mVar = this.f41248c;
        if (mVar == null || !this.f41257l) {
            return false;
        }
        r rVar = mVar.f41492q;
        if (rVar != null) {
            rVar.c(motionEvent);
        }
        m.b bVar = this.f41248c.f41478c;
        if (bVar == null || !bVar.A() || (z11 = bVar.z()) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (n11 = z11.n(this, new RectF())) != null && !n11.contains(motionEvent.getX(), motionEvent.getY())) || (o11 = z11.o()) == -1) {
            return false;
        }
        View view = this.f41232F0;
        if (view == null || view.getId() != o11) {
            this.f41232F0 = findViewById(o11);
        }
        if (this.f41232F0 == null) {
            return false;
        }
        RectF rectF = this.f41230E0;
        rectF.set(r0.getLeft(), this.f41232F0.getTop(), this.f41232F0.getRight(), this.f41232F0.getBottom());
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || C(this.f41232F0.getLeft(), this.f41232F0.getTop(), this.f41232F0, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        MotionLayout motionLayout;
        this.f41276x0 = true;
        try {
            if (this.f41248c == null) {
                super.onLayout(z11, i11, i12, i13, i14);
                this.f41276x0 = false;
                return;
            }
            motionLayout = this;
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            try {
                if (motionLayout.f41221A == i15) {
                    if (motionLayout.f41223B != i16) {
                    }
                    motionLayout.f41221A = i15;
                    motionLayout.f41223B = i16;
                    motionLayout.f41276x0 = false;
                }
                motionLayout.f41226C0.f();
                invalidate();
                t(true);
                motionLayout.f41221A = i15;
                motionLayout.f41223B = i16;
                motionLayout.f41276x0 = false;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                motionLayout.f41276x0 = false;
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            motionLayout = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        boolean z11;
        if (this.f41248c == null) {
            super.onMeasure(i11, i12);
            return;
        }
        boolean z12 = true;
        boolean z13 = (this.f41255j == i11 && this.f41256k == i12) ? false : true;
        if (this.f41228D0) {
            this.f41228D0 = false;
            E();
            F();
            z13 = true;
        }
        if (this.mDirtyHierarchy) {
            z13 = true;
        }
        this.f41255j = i11;
        this.f41256k = i12;
        int p11 = this.f41248c.p();
        m.b bVar = this.f41248c.f41478c;
        int i13 = bVar == null ? -1 : bVar.f41498c;
        e eVar = this.f41226C0;
        if ((!z13 && p11 == eVar.f41305e && i13 == eVar.f41306f) || this.f41252g == -1) {
            if (z13) {
                super.onMeasure(i11, i12);
            }
            z11 = true;
        } else {
            super.onMeasure(i11, i12);
            eVar.e(this.f41248c.h(p11), this.f41248c.h(i13));
            eVar.f();
            eVar.f41305e = p11;
            eVar.f41306f = i13;
            z11 = false;
        }
        if (this.f41245Q || z11) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int N11 = this.mLayoutWidget.N() + getPaddingRight() + getPaddingLeft();
            int v11 = this.mLayoutWidget.v() + paddingBottom;
            int i14 = this.f41268t0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                N11 = (int) ((this.f41272v0 * (this.f41264r0 - r1)) + this.f41246R);
                requestLayout();
            }
            int i15 = this.f41270u0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                v11 = (int) ((this.f41272v0 * (this.f41266s0 - r2)) + this.f41247S);
                requestLayout();
            }
            setMeasuredDimension(N11, v11);
        }
        float signum = Math.signum(this.f41265s - this.f41262q);
        long nanoTime = System.nanoTime();
        p2.d dVar = this.f41249d;
        float f7 = this.f41262q + (!(dVar instanceof o2.b) ? (((nanoTime - this.f41263r) * signum) * 1.0E-9f) / this.f41260o : 0.0f);
        if (this.f41267t) {
            f7 = this.f41265s;
        }
        if ((signum <= 0.0f || f7 < this.f41265s) && (signum > 0.0f || f7 > this.f41265s)) {
            z12 = false;
        } else {
            f7 = this.f41265s;
        }
        if (dVar != null && !z12) {
            f7 = this.f41275x ? dVar.getInterpolation((nanoTime - this.f41259n) * 1.0E-9f) : dVar.getInterpolation(f7);
        }
        if ((signum > 0.0f && f7 >= this.f41265s) || (signum <= 0.0f && f7 <= this.f41265s)) {
            f7 = this.f41265s;
        }
        this.f41272v0 = f7;
        int childCount = getChildCount();
        long nanoTime2 = System.nanoTime();
        Interpolator interpolator = this.f41250e;
        if (interpolator != null) {
            f7 = interpolator.getInterpolation(f7);
        }
        float f11 = f7;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            k kVar = this.f41258m.get(childAt);
            if (kVar != null) {
                kVar.o(f11, nanoTime2, childAt, this.f41274w0);
            }
        }
        if (this.f41245Q) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f7, float f11, boolean z11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f7, float f11) {
        return false;
    }

    @Override // androidx.core.view.A
    public final void onNestedPreScroll(@NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        m.b bVar;
        n z11;
        int o11;
        m mVar = this.f41248c;
        if (mVar == null || (bVar = mVar.f41478c) == null || !bVar.A()) {
            return;
        }
        int i14 = -1;
        if (!bVar.A() || (z11 = bVar.z()) == null || (o11 = z11.o()) == -1 || view.getId() == o11) {
            m.b bVar2 = mVar.f41478c;
            if ((bVar2 == null || bVar2.f41507l == null) ? false : mVar.f41478c.f41507l.g()) {
                n z12 = bVar.z();
                if (z12 != null && (z12.c() & 4) != 0) {
                    i14 = i12;
                }
                float f7 = this.f41261p;
                if ((f7 == 1.0f || f7 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            if (bVar.z() != null && (bVar.z().c() & 1) != 0) {
                float f11 = i11;
                float f12 = i12;
                m.b bVar3 = mVar.f41478c;
                float h11 = (bVar3 == null || bVar3.f41507l == null) ? 0.0f : mVar.f41478c.f41507l.h(f11, f12);
                float f13 = this.f41262q;
                if ((f13 <= 0.0f && h11 < 0.0f) || (f13 >= 1.0f && h11 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a((ViewGroup) view));
                    return;
                }
            }
            float f14 = this.f41261p;
            long nanoTime = System.nanoTime();
            float f15 = i11;
            this.f41227D = f15;
            float f16 = i12;
            this.f41229E = f16;
            this.f41233G = (float) ((nanoTime - this.f41231F) * 1.0E-9d);
            this.f41231F = nanoTime;
            m.b bVar4 = mVar.f41478c;
            if (bVar4 != null && bVar4.f41507l != null) {
                mVar.f41478c.f41507l.r(f15, f16);
            }
            if (f14 != this.f41261p) {
                iArr[0] = i11;
                iArr[1] = i12;
            }
            t(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f41225C = true;
        }
    }

    @Override // androidx.core.view.A
    public final void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15) {
    }

    @Override // androidx.core.view.A
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i11, int i12) {
        this.f41231F = System.nanoTime();
        this.f41233G = 0.0f;
        this.f41227D = 0.0f;
        this.f41229E = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        m mVar = this.f41248c;
        if (mVar != null) {
            mVar.z(isRtl());
        }
    }

    @Override // androidx.core.view.A
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i11, int i12) {
        m.b bVar;
        m mVar = this.f41248c;
        return (mVar == null || (bVar = mVar.f41478c) == null || bVar.z() == null || (this.f41248c.f41478c.z().c() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.A
    public final void onStopNestedScroll(@NonNull View view, int i11) {
        m mVar = this.f41248c;
        if (mVar != null) {
            float f7 = this.f41233G;
            if (f7 == 0.0f) {
                return;
            }
            float f11 = this.f41227D / f7;
            float f12 = this.f41229E / f7;
            m.b bVar = mVar.f41478c;
            if (bVar == null || bVar.f41507l == null) {
                return;
            }
            mVar.f41478c.f41507l.s(f11, f12);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f41248c;
        if (mVar == null || !this.f41257l || !mVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        m.b bVar = this.f41248c.f41478c;
        if (bVar != null && !bVar.A()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f41248c.v(motionEvent, this.f41253h, this);
        if (this.f41248c.f41478c.B(4)) {
            return this.f41248c.f41478c.z().p();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof p2.c) {
            p2.c cVar = (p2.c) view;
            if (this.f41239K == null) {
                this.f41239K = new CopyOnWriteArrayList<>();
            }
            this.f41239K.add(cVar);
            if (cVar.b()) {
                if (this.f41237I == null) {
                    this.f41237I = new ArrayList<>();
                }
                this.f41237I.add(cVar);
            }
            if (cVar.a()) {
                if (this.f41238J == null) {
                    this.f41238J = new ArrayList<>();
                }
                this.f41238J.add(cVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<p2.c> arrayList = this.f41237I;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<p2.c> arrayList2 = this.f41238J;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected final void parseLayoutDescription(int i11) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        m mVar;
        m.b bVar;
        if (!this.f41245Q && this.f41253h == -1 && (mVar = this.f41248c) != null && (bVar = mVar.f41478c) != null) {
            int x11 = bVar.x();
            if (x11 == 0) {
                return;
            }
            if (x11 == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f41258m.get(getChildAt(i11)).f41435d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    final void s(float f7) {
        if (this.f41248c == null) {
            return;
        }
        float f11 = this.f41262q;
        float f12 = this.f41261p;
        if (f11 != f12 && this.f41267t) {
            this.f41262q = f12;
        }
        float f13 = this.f41262q;
        if (f13 == f7) {
            return;
        }
        this.f41275x = false;
        this.f41265s = f7;
        this.f41260o = r0.k() / 1000.0f;
        H(this.f41265s);
        this.f41249d = null;
        this.f41250e = this.f41248c.m();
        this.f41267t = false;
        this.f41259n = System.nanoTime();
        this.f41269u = true;
        this.f41261p = f13;
        this.f41262q = f13;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i11, int i12, int i13) {
        I(j.SETUP);
        this.f41253h = i11;
        this.f41252g = -1;
        this.f41254i = -1;
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.b(i12, i11, i13);
            return;
        }
        m mVar = this.f41248c;
        if (mVar != null) {
            mVar.h(i11).f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void t(boolean z11) {
        boolean z12;
        char c11;
        int childCount;
        Interpolator interpolator;
        int i11;
        int i12;
        boolean z13;
        if (this.f41263r == -1) {
            this.f41263r = System.nanoTime();
        }
        float f7 = this.f41262q;
        if (f7 > 0.0f && f7 < 1.0f) {
            this.f41253h = -1;
        }
        boolean z14 = false;
        if (this.f41235H || (this.f41269u && (z11 || this.f41265s != f7))) {
            float signum = Math.signum(this.f41265s - f7);
            long nanoTime = System.nanoTime();
            p2.d dVar = this.f41249d;
            float f11 = dVar == null ? (((nanoTime - this.f41263r) * signum) * 1.0E-9f) / this.f41260o : 0.0f;
            float f12 = this.f41262q + f11;
            if (this.f41267t) {
                f12 = this.f41265s;
            }
            if ((signum <= 0.0f || f12 < this.f41265s) && (signum > 0.0f || f12 > this.f41265s)) {
                z12 = false;
            } else {
                f12 = this.f41265s;
                this.f41269u = false;
                z12 = true;
            }
            this.f41262q = f12;
            this.f41261p = f12;
            this.f41263r = nanoTime;
            if (dVar == null || z12) {
                this.f41251f = f11;
            } else if (this.f41275x) {
                float interpolation = dVar.getInterpolation((nanoTime - this.f41259n) * 1.0E-9f);
                p2.d dVar2 = this.f41249d;
                o2.b bVar = this.f41277y;
                c11 = dVar2 == bVar ? bVar.c() ? (char) 2 : (char) 1 : (char) 0;
                this.f41262q = interpolation;
                this.f41263r = nanoTime;
                p2.d dVar3 = this.f41249d;
                if (dVar3 != null) {
                    float a11 = dVar3.a();
                    this.f41251f = a11;
                    if (Math.abs(a11) * this.f41260o <= 1.0E-5f && c11 == 2) {
                        this.f41269u = false;
                    }
                    if (a11 > 0.0f && interpolation >= 1.0f) {
                        this.f41262q = 1.0f;
                        this.f41269u = false;
                        interpolation = 1.0f;
                    }
                    if (a11 < 0.0f && interpolation <= 0.0f) {
                        this.f41262q = 0.0f;
                        this.f41269u = false;
                        f12 = 0.0f;
                        if (Math.abs(this.f41251f) > 1.0E-5f) {
                            I(j.MOVING);
                        }
                        if (c11 != 1) {
                            if ((signum > 0.0f && f12 >= this.f41265s) || (signum <= 0.0f && f12 <= this.f41265s)) {
                                f12 = this.f41265s;
                                this.f41269u = false;
                            }
                            if (f12 >= 1.0f || f12 <= 0.0f) {
                                this.f41269u = false;
                                I(j.FINISHED);
                            }
                        }
                        childCount = getChildCount();
                        this.f41235H = false;
                        long nanoTime2 = System.nanoTime();
                        this.f41272v0 = f12;
                        Interpolator interpolator2 = this.f41250e;
                        float interpolation2 = interpolator2 == null ? f12 : interpolator2.getInterpolation(f12);
                        interpolator = this.f41250e;
                        if (interpolator != null) {
                            float interpolation3 = interpolator.getInterpolation((signum / this.f41260o) + f12);
                            this.f41251f = interpolation3;
                            this.f41251f = interpolation3 - this.f41250e.getInterpolation(f12);
                        }
                        for (i11 = 0; i11 < childCount; i11++) {
                            View childAt = getChildAt(i11);
                            k kVar = this.f41258m.get(childAt);
                            if (kVar != null) {
                                this.f41235H = kVar.o(interpolation2, nanoTime2, childAt, this.f41274w0) | this.f41235H;
                            }
                        }
                        boolean z15 = (signum <= 0.0f && f12 >= this.f41265s) || (signum <= 0.0f && f12 <= this.f41265s);
                        if (!this.f41235H && !this.f41269u && z15) {
                            I(j.FINISHED);
                        }
                        if (this.f41245Q) {
                            requestLayout();
                        }
                        this.f41235H = (!z15) | this.f41235H;
                        if (f12 <= 0.0f && (i12 = this.f41252g) != -1 && this.f41253h != i12) {
                            this.f41253h = i12;
                            this.f41248c.h(i12).d(this);
                            I(j.FINISHED);
                            z14 = true;
                        }
                        if (f12 >= 1.0d) {
                            int i13 = this.f41253h;
                            int i14 = this.f41254i;
                            if (i13 != i14) {
                                this.f41253h = i14;
                                this.f41248c.h(i14).d(this);
                                I(j.FINISHED);
                                z14 = true;
                            }
                        }
                        if (!this.f41235H || this.f41269u) {
                            invalidate();
                        } else if ((signum > 0.0f && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f)) {
                            I(j.FINISHED);
                        }
                        if (!this.f41235H && !this.f41269u && ((signum > 0.0f && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f))) {
                            E();
                        }
                    }
                }
                f12 = interpolation;
                if (Math.abs(this.f41251f) > 1.0E-5f) {
                }
                if (c11 != 1) {
                }
                childCount = getChildCount();
                this.f41235H = false;
                long nanoTime22 = System.nanoTime();
                this.f41272v0 = f12;
                Interpolator interpolator22 = this.f41250e;
                if (interpolator22 == null) {
                }
                interpolator = this.f41250e;
                if (interpolator != null) {
                }
                while (i11 < childCount) {
                }
                if (signum <= 0.0f) {
                }
                if (!this.f41235H) {
                    I(j.FINISHED);
                }
                if (this.f41245Q) {
                }
                this.f41235H = (!z15) | this.f41235H;
                if (f12 <= 0.0f) {
                    this.f41253h = i12;
                    this.f41248c.h(i12).d(this);
                    I(j.FINISHED);
                    z14 = true;
                }
                if (f12 >= 1.0d) {
                }
                if (this.f41235H) {
                }
                invalidate();
                if (!this.f41235H) {
                    E();
                }
            } else {
                float interpolation4 = dVar.getInterpolation(f12);
                p2.d dVar4 = this.f41249d;
                if (dVar4 != null) {
                    this.f41251f = dVar4.a();
                } else {
                    this.f41251f = ((dVar4.getInterpolation(f12 + f11) - interpolation4) * signum) / f11;
                }
                f12 = interpolation4;
            }
            c11 = 0;
            if (Math.abs(this.f41251f) > 1.0E-5f) {
            }
            if (c11 != 1) {
            }
            childCount = getChildCount();
            this.f41235H = false;
            long nanoTime222 = System.nanoTime();
            this.f41272v0 = f12;
            Interpolator interpolator222 = this.f41250e;
            if (interpolator222 == null) {
            }
            interpolator = this.f41250e;
            if (interpolator != null) {
            }
            while (i11 < childCount) {
            }
            if (signum <= 0.0f) {
            }
            if (!this.f41235H) {
            }
            if (this.f41245Q) {
            }
            this.f41235H = (!z15) | this.f41235H;
            if (f12 <= 0.0f) {
            }
            if (f12 >= 1.0d) {
            }
            if (this.f41235H) {
            }
            invalidate();
            if (!this.f41235H) {
            }
        }
        float f13 = this.f41262q;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i15 = this.f41253h;
                int i16 = this.f41252g;
                z13 = i15 == i16 ? z14 : true;
                this.f41253h = i16;
            }
            this.f41228D0 |= z14;
            if (z14 && !this.f41276x0) {
                requestLayout();
            }
            this.f41261p = this.f41262q;
        }
        int i17 = this.f41253h;
        int i18 = this.f41254i;
        z13 = i17 == i18 ? z14 : true;
        this.f41253h = i18;
        z14 = z13;
        this.f41228D0 |= z14;
        if (z14) {
            requestLayout();
        }
        this.f41261p = this.f41262q;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C8834a.c(this.f41252g, context) + "->" + C8834a.c(this.f41254i, context) + " (pos:" + this.f41262q + " Dpos/Dt:" + this.f41251f;
    }

    protected final void v() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.f41239K;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty() && this.f41243O == -1) {
            this.f41243O = this.f41253h;
            ArrayList<Integer> arrayList = this.f41236H0;
            int intValue = !arrayList.isEmpty() ? ((Integer) o0.b(1, arrayList)).intValue() : -1;
            int i11 = this.f41253h;
            if (intValue != i11 && i11 != -1) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        F();
        J2.b bVar = this.f41280z0;
        if (bVar != null) {
            bVar.run();
        }
    }

    public final void w(int i11, boolean z11, float f7) {
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.f41239K;
        if (copyOnWriteArrayList != null) {
            Iterator<i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
    }

    final void x(int i11, float f7, float f11, float f12, float[] fArr) {
        HashMap<View, k> hashMap = this.f41258m;
        View viewById = getViewById(i11);
        k kVar = hashMap.get(viewById);
        if (kVar != null) {
            kVar.j(f7, f11, f12, fArr);
            viewById.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? Ej.b.a(i11, "") : viewById.getContext().getResources().getResourceName(i11)));
        }
    }

    public final ArrayList<m.b> y() {
        m mVar = this.f41248c;
        if (mVar == null) {
            return null;
        }
        return mVar.j();
    }

    public final int z() {
        return this.f41254i;
    }

    @Override // androidx.core.view.B
    public final void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (this.f41225C || i11 != 0 || i12 != 0) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
        }
        this.f41225C = false;
    }
}
