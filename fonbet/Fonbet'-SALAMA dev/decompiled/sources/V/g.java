package V;

import C0.RunnableC0085d;
import P.U;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.C0649l0;
import io.sentry.HttpStatusCodeRange;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: I, reason: collision with root package name */
    public static final int f6609I = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public final float[] f6610A;

    /* renamed from: B, reason: collision with root package name */
    public final float[] f6611B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f6612C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f6613D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6614E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6615F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6616G;

    /* renamed from: H, reason: collision with root package name */
    public final C0649l0 f6617H;

    /* renamed from: a, reason: collision with root package name */
    public final a f6618a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f6619b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f6620c;

    /* renamed from: d, reason: collision with root package name */
    public RunnableC0085d f6621d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6622e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f6623f;

    /* renamed from: x, reason: collision with root package name */
    public final int f6624x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6625y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f6626z;

    public g(C0649l0 c0649l0) {
        a aVar = new a();
        aVar.f6604e = Long.MIN_VALUE;
        aVar.f6606g = -1L;
        aVar.f6605f = 0L;
        this.f6618a = aVar;
        this.f6619b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6622e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6623f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6626z = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6610A = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6611B = fArr5;
        this.f6620c = c0649l0;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f8;
        fArr5[1] = f8;
        float f9 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f9;
        fArr4[1] = f9;
        this.f6624x = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6625y = f6609I;
        aVar.f6600a = HttpStatusCodeRange.DEFAULT_MIN;
        aVar.f6601b = HttpStatusCodeRange.DEFAULT_MIN;
        this.f6617H = c0649l0;
    }

    public static float b(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i7, float f7, float f8, float f9) {
        float f10;
        float interpolation;
        float b7 = b(this.f6622e[i7] * f8, 0.0f, this.f6623f[i7]);
        float c3 = c(f8 - f7, b7) - c(f7, b7);
        AccelerateInterpolator accelerateInterpolator = this.f6619b;
        if (c3 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c3);
        } else {
            if (c3 <= 0.0f) {
                f10 = 0.0f;
                if (f10 != 0.0f) {
                    return 0.0f;
                }
                float f11 = this.f6626z[i7];
                float f12 = this.f6610A[i7];
                float f13 = this.f6611B[i7];
                float f14 = f11 * f9;
                return f10 > 0.0f ? b(f10 * f14, f12, f13) : -b((-f10) * f14, f12, f13);
            }
            interpolation = accelerateInterpolator.getInterpolation(c3);
        }
        f10 = b(interpolation, -1.0f, 1.0f);
        if (f10 != 0.0f) {
        }
    }

    public final float c(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f6624x;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f6615F && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f6613D) {
            this.f6615F = false;
            return;
        }
        a aVar = this.f6618a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i8 = (int) (currentAnimationTimeMillis - aVar.f6604e);
        int i9 = aVar.f6601b;
        if (i8 > i9) {
            i7 = i9;
        } else if (i8 >= 0) {
            i7 = i8;
        }
        aVar.f6608i = i7;
        aVar.f6607h = aVar.a(currentAnimationTimeMillis);
        aVar.f6606g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0649l0 c0649l0;
        int count;
        a aVar = this.f6618a;
        float f7 = aVar.f6603d;
        int abs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.f6602c);
        if (abs == 0 || (count = (c0649l0 = this.f6617H).getCount()) == 0) {
            return false;
        }
        int childCount = c0649l0.getChildCount();
        int firstVisiblePosition = c0649l0.getFirstVisiblePosition();
        int i7 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i7 >= count && c0649l0.getChildAt(childCount - 1).getBottom() <= c0649l0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0649l0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7;
        if (!this.f6616G) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f6614E = true;
        this.f6612C = false;
        float x4 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f6620c;
        float a2 = a(0, x4, width, listView.getWidth());
        float a4 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f6618a;
        aVar.f6602c = a2;
        aVar.f6603d = a4;
        if (!this.f6615F && e()) {
            if (this.f6621d == null) {
                this.f6621d = new RunnableC0085d(this, 13);
            }
            this.f6615F = true;
            this.f6613D = true;
            if (this.f6612C || (i7 = this.f6625y) <= 0) {
                this.f6621d.run();
            } else {
                RunnableC0085d runnableC0085d = this.f6621d;
                long j = i7;
                WeakHashMap weakHashMap = U.f5037a;
                listView.postOnAnimationDelayed(runnableC0085d, j);
            }
            this.f6612C = true;
        }
        return false;
    }
}
