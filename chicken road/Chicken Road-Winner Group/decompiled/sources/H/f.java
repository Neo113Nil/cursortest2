package H;

import D.z;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.Field;
import l.A;

/* loaded from: classes.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f461r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f462a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f463b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f464c;

    /* renamed from: d, reason: collision with root package name */
    public A.b f465d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f466e;
    public final float[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int f467g;

    /* renamed from: h, reason: collision with root package name */
    public final int f468h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f469i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f470j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f471k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f472l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f473m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f474n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f475o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f476p;

    /* renamed from: q, reason: collision with root package name */
    public final A f477q;

    public f(A a3) {
        a aVar = new a();
        aVar.f456e = Long.MIN_VALUE;
        aVar.f457g = -1L;
        aVar.f = 0L;
        this.f462a = aVar;
        this.f463b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f466e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f469i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f470j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f471k = fArr5;
        this.f464c = a3;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f467g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f468h = f461r;
        aVar.f452a = 500;
        aVar.f453b = 500;
        this.f477q = a3;
    }

    public static float b(float f, float f3, float f4) {
        return f > f4 ? f4 : f < f3 ? f3 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i3, float f, float f3, float f4) {
        float f5;
        float interpolation;
        float b3 = b(this.f466e[i3] * f3, 0.0f, this.f[i3]);
        float c3 = c(f3 - f, b3) - c(f, b3);
        AccelerateInterpolator accelerateInterpolator = this.f463b;
        if (c3 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c3);
        } else {
            if (c3 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f469i[i3];
                float f7 = this.f470j[i3];
                float f8 = this.f471k[i3];
                float f9 = f6 * f4;
                return f5 > 0.0f ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c3);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != 0.0f) {
        }
    }

    public final float c(float f, float f3) {
        if (f3 != 0.0f) {
            int i3 = this.f467g;
            if (i3 == 0 || i3 == 1) {
                if (f < f3) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f3);
                    }
                    if (this.f475o && i3 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i3 == 2 && f < 0.0f) {
                return f / (-f3);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f473m) {
            this.f475o = false;
            return;
        }
        a aVar = this.f462a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f456e);
        int i5 = aVar.f453b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f459i = i3;
        aVar.f458h = aVar.a(currentAnimationTimeMillis);
        aVar.f457g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        A a3;
        int count;
        a aVar = this.f462a;
        float f = aVar.f455d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(aVar.f454c);
        if (abs != 0 && (count = (a3 = this.f477q).getCount()) != 0) {
            int childCount = a3.getChildCount();
            int firstVisiblePosition = a3.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && a3.getChildAt(0).getTop() >= 0)) : !(i3 >= count && a3.getChildAt(childCount - 1).getBottom() <= a3.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i3;
        int i4 = 2;
        if (this.f476p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f474n = true;
            this.f472l = false;
            float x3 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f464c;
            float a3 = a(0, x3, width, listView.getWidth());
            float a4 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            a aVar = this.f462a;
            aVar.f454c = a3;
            aVar.f455d = a4;
            if (!this.f475o && e()) {
                if (this.f465d == null) {
                    this.f465d = new A.b(i4, this);
                }
                this.f475o = true;
                this.f473m = true;
                if (this.f472l || (i3 = this.f468h) <= 0) {
                    this.f465d.run();
                } else {
                    A.b bVar = this.f465d;
                    long j3 = i3;
                    Field field = z.f259a;
                    listView.postOnAnimationDelayed(bVar, j3);
                }
                this.f472l = true;
            }
        }
        return false;
    }
}
