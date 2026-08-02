package p000;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: A */
    public static final int f197A = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: j */
    public final C0610q9 f198j;

    /* JADX INFO: renamed from: k */
    public final AccelerateInterpolator f199k;

    /* JADX INFO: renamed from: l */
    public final C0151dv f200l;

    /* JADX INFO: renamed from: m */
    public RunnableC0897y0 f201m;

    /* JADX INFO: renamed from: n */
    public final float[] f202n;

    /* JADX INFO: renamed from: o */
    public final float[] f203o;

    /* JADX INFO: renamed from: p */
    public final int f204p;

    /* JADX INFO: renamed from: q */
    public final int f205q;

    /* JADX INFO: renamed from: r */
    public final float[] f206r;

    /* JADX INFO: renamed from: s */
    public final float[] f207s;

    /* JADX INFO: renamed from: t */
    public final float[] f208t;

    /* JADX INFO: renamed from: u */
    public boolean f209u;

    /* JADX INFO: renamed from: v */
    public boolean f210v;

    /* JADX INFO: renamed from: w */
    public boolean f211w;

    /* JADX INFO: renamed from: x */
    public boolean f212x;

    /* JADX INFO: renamed from: y */
    public boolean f213y;

    /* JADX INFO: renamed from: z */
    public final C0151dv f214z;

    public aj0(C0151dv c0151dv) {
        C0610q9 c0610q9 = new C0610q9();
        c0610q9.f6423e = Long.MIN_VALUE;
        c0610q9.f6425g = -1L;
        c0610q9.f6424f = 0L;
        this.f198j = c0610q9;
        this.f199k = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f202n = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f203o = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f206r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f207s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f208t = fArr5;
        this.f200l = c0151dv;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f204p = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f205q = f197A;
        c0610q9.f6419a = 500;
        c0610q9.f6420b = 500;
        this.f214z = c0151dv;
    }

    /* JADX INFO: renamed from: b */
    public static float m256b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: a */
    public final float m257a(int i, float f, float f2, float f3) {
        float fM256b;
        float interpolation;
        float fM256b2 = m256b(this.f202n[i] * f2, 0.0f, this.f203o[i]);
        float fM258c = m258c(f2 - f, fM256b2) - m258c(f, fM256b2);
        AccelerateInterpolator accelerateInterpolator = this.f199k;
        if (fM258c >= 0.0f) {
            if (fM258c > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM258c);
            } else {
                fM256b = 0.0f;
            }
            if (fM256b == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f206r[i];
            float f5 = this.f207s[i];
            float f6 = this.f208t[i];
            float f7 = f4 * f3;
            return fM256b > 0.0f ? m256b(fM256b * f7, f5, f6) : -m256b((-fM256b) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM258c);
        fM256b = m256b(interpolation, -1.0f, 1.0f);
        if (fM256b == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f206r[i];
        float f9 = this.f207s[i];
        float f10 = this.f208t[i];
        float f11 = f8 * f3;
        if (fM256b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m258c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f204p;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f212x && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m259d() {
        int i = 0;
        if (this.f210v) {
            this.f212x = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0610q9 c0610q9 = this.f198j;
        int i2 = (int) (jCurrentAnimationTimeMillis - c0610q9.f6423e);
        int i3 = c0610q9.f6420b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0610q9.f6427i = i;
        c0610q9.f6426h = c0610q9.m4042a(jCurrentAnimationTimeMillis);
        c0610q9.f6425g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m260e() {
        C0151dv c0151dv;
        int count;
        C0610q9 c0610q9 = this.f198j;
        float f = c0610q9.f6422d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0610q9.f6421c);
        if (iAbs != 0 && (count = (c0151dv = this.f214z).getCount()) != 0) {
            int childCount = c0151dv.getChildCount();
            int firstVisiblePosition = c0151dv.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c0151dv.getChildAt(0).getTop() >= 0)) : !(i >= count && c0151dv.getChildAt(childCount - 1).getBottom() <= c0151dv.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f213y) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 3;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m259d();
                return false;
            }
            this.f211w = true;
            this.f209u = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            C0151dv c0151dv = this.f200l;
            float fM257a = m257a(0, x, width, c0151dv.getWidth());
            float fM257a2 = m257a(1, motionEvent.getY(), view.getHeight(), c0151dv.getHeight());
            C0610q9 c0610q9 = this.f198j;
            c0610q9.f6421c = fM257a;
            c0610q9.f6422d = fM257a2;
            if (!this.f212x && m260e()) {
                if (this.f201m == null) {
                    this.f201m = new RunnableC0897y0(i2, this);
                }
                this.f212x = true;
                this.f210v = true;
                if (this.f209u || (i = this.f205q) <= 0) {
                    this.f201m.run();
                } else {
                    RunnableC0897y0 runnableC0897y0 = this.f201m;
                    long j = i;
                    WeakHashMap weakHashMap = ai1.f194a;
                    c0151dv.postOnAnimationDelayed(runnableC0897y0, j);
                }
                this.f209u = true;
            }
        }
        return false;
    }
}
