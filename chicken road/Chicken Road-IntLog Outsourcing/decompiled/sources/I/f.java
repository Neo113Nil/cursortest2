package I;

import E.G;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import java.lang.reflect.Field;
import l.AbstractC1252y;

/* loaded from: classes.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f1222r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f1224b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f1225c;

    /* renamed from: d, reason: collision with root package name */
    public B.a f1226d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f1227e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f1228f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1229g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1230h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1231i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f1232j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1233k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1234l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1235m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1236n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1237o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1238p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1252y f1239q;

    public f(AbstractC1252y abstractC1252y) {
        a aVar = new a();
        aVar.f1216e = Long.MIN_VALUE;
        aVar.f1218g = -1L;
        aVar.f1217f = 0L;
        this.f1223a = aVar;
        this.f1224b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1227e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1228f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1231i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1232j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1233k = fArr5;
        this.f1225c = abstractC1252y;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f6 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f6;
        fArr5[1] = f6;
        float f7 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f7;
        fArr4[1] = f7;
        this.f1229g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1230h = f1222r;
        aVar.f1212a = PermissionsViewModel.DELAY_TIME_CALLBACK_CALL;
        aVar.f1213b = PermissionsViewModel.DELAY_TIME_CALLBACK_CALL;
        this.f1239q = abstractC1252y;
    }

    public static float b(float f3, float f6, float f7) {
        return f3 > f7 ? f7 : f3 < f6 ? f6 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i2, float f3, float f6, float f7) {
        float f8;
        float interpolation;
        float b6 = b(this.f1227e[i2] * f6, 0.0f, this.f1228f[i2]);
        float c2 = c(f6 - f3, b6) - c(f3, b6);
        AccelerateInterpolator accelerateInterpolator = this.f1224b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f8 = 0.0f;
                if (f8 != 0.0f) {
                    return 0.0f;
                }
                float f9 = this.f1231i[i2];
                float f10 = this.f1232j[i2];
                float f11 = this.f1233k[i2];
                float f12 = f9 * f7;
                return f8 > 0.0f ? b(f8 * f12, f10, f11) : -b((-f8) * f12, f10, f11);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f8 = b(interpolation, -1.0f, 1.0f);
        if (f8 != 0.0f) {
        }
    }

    public final float c(float f3, float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f1229g;
        if (i2 == 0 || i2 == 1) {
            if (f3 < f6) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f6);
                }
                if (this.f1237o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f3 < 0.0f) {
            return f3 / (-f6);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f1235m) {
            this.f1237o = false;
            return;
        }
        a aVar = this.f1223a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f1216e);
        int i6 = aVar.f1213b;
        if (i3 > i6) {
            i2 = i6;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f1220i = i2;
        aVar.f1219h = aVar.a(currentAnimationTimeMillis);
        aVar.f1218g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC1252y abstractC1252y;
        int count;
        a aVar = this.f1223a;
        float f3 = aVar.f1215d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f1214c);
        if (abs == 0 || (count = (abstractC1252y = this.f1239q).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC1252y.getChildCount();
        int firstVisiblePosition = abstractC1252y.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i2 >= count && abstractC1252y.getChildAt(childCount - 1).getBottom() <= abstractC1252y.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && abstractC1252y.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r1 != 3) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3 = 3;
        if (!this.f1238p) {
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
        this.f1236n = true;
        this.f1234l = false;
        float x5 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f1225c;
        float a6 = a(0, x5, width, listView.getWidth());
        float a7 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f1223a;
        aVar.f1214c = a6;
        aVar.f1215d = a7;
        if (!this.f1237o && e()) {
            if (this.f1226d == null) {
                this.f1226d = new B.a(i3, this);
            }
            this.f1237o = true;
            this.f1235m = true;
            if (this.f1234l || (i2 = this.f1230h) <= 0) {
                this.f1226d.run();
            } else {
                B.a aVar2 = this.f1226d;
                long j2 = i2;
                Field field = G.f566a;
                listView.postOnAnimationDelayed(aVar2, j2);
            }
            this.f1234l = true;
        }
        return false;
    }
}
