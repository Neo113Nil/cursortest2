package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes8.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: q, reason: collision with root package name */
    private static final int f42399q = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    final C0778a f42400a;

    /* renamed from: b, reason: collision with root package name */
    private final AccelerateInterpolator f42401b;

    /* renamed from: c, reason: collision with root package name */
    final ListView f42402c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f42403d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f42404e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f42405f;

    /* renamed from: g, reason: collision with root package name */
    private int f42406g;

    /* renamed from: h, reason: collision with root package name */
    private int f42407h;

    /* renamed from: i, reason: collision with root package name */
    private float[] f42408i;

    /* renamed from: j, reason: collision with root package name */
    private float[] f42409j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f42410k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42411l;

    /* renamed from: m, reason: collision with root package name */
    boolean f42412m;

    /* renamed from: n, reason: collision with root package name */
    boolean f42413n;

    /* renamed from: o, reason: collision with root package name */
    boolean f42414o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f42415p;

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0778a {

        /* renamed from: a, reason: collision with root package name */
        private int f42416a;

        /* renamed from: b, reason: collision with root package name */
        private int f42417b;

        /* renamed from: c, reason: collision with root package name */
        private float f42418c;

        /* renamed from: d, reason: collision with root package name */
        private float f42419d;

        /* renamed from: i, reason: collision with root package name */
        private float f42424i;

        /* renamed from: j, reason: collision with root package name */
        private int f42425j;

        /* renamed from: e, reason: collision with root package name */
        private long f42420e = Long.MIN_VALUE;

        /* renamed from: h, reason: collision with root package name */
        private long f42423h = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f42421f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f42422g = 0;

        C0778a() {
        }

        private float d(long j11) {
            if (j11 < this.f42420e) {
                return 0.0f;
            }
            long j12 = this.f42423h;
            if (j12 < 0 || j11 < j12) {
                return a.c((j11 - r0) / this.f42416a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f42424i;
            return (f7 * a.c((j11 - j12) / this.f42425j, 0.0f, 1.0f)) + (1.0f - f7);
        }

        public final void a() {
            if (this.f42421f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float d11 = d(currentAnimationTimeMillis);
            long j11 = currentAnimationTimeMillis - this.f42421f;
            this.f42421f = currentAnimationTimeMillis;
            this.f42422g = (int) (j11 * ((d11 * 4.0f) + ((-4.0f) * d11 * d11)) * this.f42419d);
        }

        public final int b() {
            return this.f42422g;
        }

        public final void c() {
            Math.abs(this.f42418c);
        }

        public final int e() {
            float f7 = this.f42419d;
            return (int) (f7 / Math.abs(f7));
        }

        public final boolean f() {
            return this.f42423h > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f42423h + ((long) this.f42425j);
        }

        public final void g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i11 = (int) (currentAnimationTimeMillis - this.f42420e);
            int i12 = this.f42417b;
            if (i11 > i12) {
                i11 = i12;
            } else if (i11 < 0) {
                i11 = 0;
            }
            this.f42425j = i11;
            this.f42424i = d(currentAnimationTimeMillis);
            this.f42423h = currentAnimationTimeMillis;
        }

        public final void h() {
            this.f42417b = CounterView.COUNTER_MAX_DEFAULT;
        }

        public final void i() {
            this.f42416a = CounterView.COUNTER_MAX_DEFAULT;
        }

        public final void j(float f7, float f11) {
            this.f42418c = f7;
            this.f42419d = f11;
        }

        public final void k() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f42420e = currentAnimationTimeMillis;
            this.f42423h = -1L;
            this.f42421f = currentAnimationTimeMillis;
            this.f42424i = 0.5f;
            this.f42422g = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f42414o) {
                boolean z11 = aVar.f42412m;
                C0778a c0778a = aVar.f42400a;
                if (z11) {
                    aVar.f42412m = false;
                    c0778a.k();
                }
                if (!c0778a.f()) {
                    int e11 = c0778a.e();
                    c0778a.c();
                    if (e11 != 0 && aVar.a(e11)) {
                        boolean z12 = aVar.f42413n;
                        ListView listView = aVar.f42402c;
                        if (z12) {
                            aVar.f42413n = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            listView.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        c0778a.a();
                        aVar.e(c0778a.b());
                        int i11 = Y.f42258g;
                        listView.postOnAnimation(this);
                        return;
                    }
                }
                aVar.f42414o = false;
            }
        }
    }

    public a(@NonNull ListView listView) {
        C0778a c0778a = new C0778a();
        this.f42400a = c0778a;
        this.f42401b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f42404e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f42405f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f42408i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f42409j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f42410k = fArr5;
        this.f42402c = listView;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f42406g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f42407h = f42399q;
        c0778a.i();
        c0778a.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float b(float f7, float f11, float f12, int i11) {
        float f13;
        float interpolation;
        float c11 = c(this.f42404e[i11] * f11, 0.0f, this.f42405f[i11]);
        float d11 = d(f11 - f7, c11) - d(f7, c11);
        AccelerateInterpolator accelerateInterpolator = this.f42401b;
        if (d11 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-d11);
        } else {
            if (d11 <= 0.0f) {
                f13 = 0.0f;
                if (f13 != 0.0f) {
                    return 0.0f;
                }
                float f14 = this.f42408i[i11];
                float f15 = this.f42409j[i11];
                float f16 = this.f42410k[i11];
                float f17 = f14 * f12;
                return f13 > 0.0f ? c(f13 * f17, f15, f16) : -c((-f13) * f17, f15, f16);
            }
            interpolation = accelerateInterpolator.getInterpolation(d11);
        }
        f13 = c(interpolation, -1.0f, 1.0f);
        if (f13 != 0.0f) {
        }
    }

    static float c(float f7, float f11, float f12) {
        return f7 > f12 ? f12 : f7 < f11 ? f11 : f7;
    }

    private float d(float f7, float f11) {
        if (f11 != 0.0f) {
            int i11 = this.f42406g;
            if (i11 == 0 || i11 == 1) {
                if (f7 < f11) {
                    if (f7 >= 0.0f) {
                        return 1.0f - (f7 / f11);
                    }
                    if (this.f42414o && i11 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i11 == 2 && f7 < 0.0f) {
                return f7 / (-f11);
            }
        }
        return 0.0f;
    }

    public abstract boolean a(int i11);

    public abstract void e(int i11);

    public final void f(boolean z11) {
        if (this.f42415p && !z11) {
            if (this.f42412m) {
                this.f42414o = false;
            } else {
                this.f42400a.g();
            }
        }
        this.f42415p = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 != 3) goto L37;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i11;
        if (this.f42415p) {
            int actionMasked = motionEvent.getActionMasked();
            C0778a c0778a = this.f42400a;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                if (this.f42412m) {
                    this.f42414o = false;
                    return false;
                }
                c0778a.g();
                return false;
            }
            this.f42413n = true;
            this.f42411l = false;
            float x11 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f42402c;
            c0778a.j(b(x11, width, listView.getWidth(), 0), b(motionEvent.getY(), view.getHeight(), listView.getHeight(), 1));
            if (!this.f42414o) {
                int e11 = c0778a.e();
                c0778a.c();
                if (e11 != 0 && a(e11)) {
                    if (this.f42403d == null) {
                        this.f42403d = new b();
                    }
                    this.f42414o = true;
                    this.f42412m = true;
                    if (this.f42411l || (i11 = this.f42407h) <= 0) {
                        ((b) this.f42403d).run();
                    } else {
                        Runnable runnable = this.f42403d;
                        long j11 = i11;
                        int i12 = Y.f42258g;
                        listView.postOnAnimationDelayed(runnable, j11);
                    }
                    this.f42411l = true;
                }
            }
        }
        return false;
    }
}
