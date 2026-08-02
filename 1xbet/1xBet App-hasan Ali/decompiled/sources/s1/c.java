package s1;

import A0.C;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.Field;
import n.T;

/* loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: B, reason: collision with root package name */
    public static final int f19182B = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public final T f19183A;

    /* renamed from: k, reason: collision with root package name */
    public final C2359a f19184k;

    /* renamed from: l, reason: collision with root package name */
    public final AccelerateInterpolator f19185l;

    /* renamed from: m, reason: collision with root package name */
    public final ListView f19186m;

    /* renamed from: n, reason: collision with root package name */
    public C f19187n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f19188o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f19189p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19190q;

    /* renamed from: r, reason: collision with root package name */
    public final int f19191r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f19192s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f19193t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f19194u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19195v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19196w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19197x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19198y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19199z;

    public c(T t5) {
        C2359a c2359a = new C2359a();
        c2359a.f19179e = Long.MIN_VALUE;
        c2359a.f19180g = -1L;
        c2359a.f = 0L;
        this.f19184k = c2359a;
        this.f19185l = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f19188o = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f19189p = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f19192s = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f19193t = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f19194u = fArr5;
        this.f19186m = t5;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f19190q = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f19191r = f19182B;
        c2359a.f19175a = 500;
        c2359a.f19176b = 500;
        this.f19183A = t5;
    }

    public static float b(float f, float f5, float f6) {
        return f > f6 ? f6 : f < f5 ? f5 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f, float f5, float f6) {
        float f7;
        float interpolation;
        float b3 = b(this.f19188o[i] * f5, 0.0f, this.f19189p[i]);
        float d5 = d(f5 - f, b3) - d(f, b3);
        AccelerateInterpolator accelerateInterpolator = this.f19185l;
        if (d5 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-d5);
        } else {
            if (d5 <= 0.0f) {
                f7 = 0.0f;
                if (f7 != 0.0f) {
                    return 0.0f;
                }
                float f8 = this.f19192s[i];
                float f9 = this.f19193t[i];
                float f10 = this.f19194u[i];
                float f11 = f8 * f6;
                return f7 > 0.0f ? b(f7 * f11, f9, f10) : -b((-f7) * f11, f9, f10);
            }
            interpolation = accelerateInterpolator.getInterpolation(d5);
        }
        f7 = b(interpolation, -1.0f, 1.0f);
        if (f7 != 0.0f) {
        }
    }

    public final float d(float f, float f5) {
        if (f5 != 0.0f) {
            int i = this.f19190q;
            if (i == 0 || i == 1) {
                if (f < f5) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f5);
                    }
                    if (this.f19198y && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f5);
            }
        }
        return 0.0f;
    }

    public final void f() {
        int i = 0;
        if (this.f19196w) {
            this.f19198y = false;
            return;
        }
        C2359a c2359a = this.f19184k;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (currentAnimationTimeMillis - c2359a.f19179e);
        int i6 = c2359a.f19176b;
        if (i5 > i6) {
            i = i6;
        } else if (i5 >= 0) {
            i = i5;
        }
        c2359a.i = i;
        c2359a.f19181h = c2359a.a(currentAnimationTimeMillis);
        c2359a.f19180g = currentAnimationTimeMillis;
    }

    public final boolean i() {
        T t5;
        int count;
        C2359a c2359a = this.f19184k;
        float f = c2359a.f19178d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c2359a.f19177c);
        if (abs != 0 && (count = (t5 = this.f19183A).getCount()) != 0) {
            int childCount = t5.getChildCount();
            int firstVisiblePosition = t5.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && t5.getChildAt(0).getTop() >= 0)) : !(i >= count && t5.getChildAt(childCount - 1).getBottom() <= t5.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f19199z) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                f();
                return false;
            }
            this.f19197x = true;
            this.f19195v = false;
            float x5 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f19186m;
            float a5 = a(0, x5, width, listView.getWidth());
            float a6 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            C2359a c2359a = this.f19184k;
            c2359a.f19177c = a5;
            c2359a.f19178d = a6;
            if (!this.f19198y && i()) {
                if (this.f19187n == null) {
                    this.f19187n = new C(20, this);
                }
                this.f19198y = true;
                this.f19196w = true;
                if (this.f19195v || (i = this.f19191r) <= 0) {
                    this.f19187n.run();
                } else {
                    C c5 = this.f19187n;
                    long j5 = i;
                    Field field = n1.C.f18360a;
                    listView.postOnAnimationDelayed(c5, j5);
                }
                this.f19195v = true;
            }
        }
        return false;
    }
}
