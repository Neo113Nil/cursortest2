package Yf;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public abstract class f<L> extends b<L> {

    /* renamed from: i, reason: collision with root package name */
    private final float f34944i;

    /* renamed from: j, reason: collision with root package name */
    private float f34945j;

    /* renamed from: k, reason: collision with root package name */
    private final h f34946k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f34947l;

    /* renamed from: m, reason: collision with root package name */
    final HashMap<i, e> f34948m;

    /* renamed from: n, reason: collision with root package name */
    private PointF f34949n;

    /* renamed from: o, reason: collision with root package name */
    private DisplayMetrics f34950o;

    public f(Context context, a aVar) {
        super(context, aVar);
        this.f34946k = new h();
        this.f34947l = new ArrayList();
        this.f34948m = new HashMap<>();
        this.f34949n = new PointF();
        this.f34944i = ViewConfiguration.get(context).getScaledEdgeSlop();
        m();
    }

    private void m() {
        WindowManager windowManager = this.f34919b;
        if (windowManager == null) {
            this.f34950o = this.f34918a.getResources().getDisplayMetrics();
        } else {
            this.f34950o = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(this.f34950o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[LOOP:1: B:28:0x00cf->B:29:0x00d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    @Override // Yf.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean a(@NonNull MotionEvent motionEvent) {
        long j11;
        boolean z11;
        int actionMasked;
        int pointerCount;
        int i11;
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            m();
        }
        int pointerCount2 = motionEvent.getPointerCount();
        ArrayList arrayList = this.f34947l;
        int size = arrayList.size();
        this.f34946k.getClass();
        int i12 = 1;
        if (size == 0) {
            j11 = 0;
        } else {
            if (Math.abs(pointerCount2 - size) <= 1) {
                if (pointerCount2 > size) {
                    j11 = 5;
                } else if (pointerCount2 >= size) {
                    j11 = ((pointerCount2 == 1 ? 1L : 6L) << 8) + 2;
                }
            }
            j11 = 255;
        }
        long j12 = actionMasked2;
        if (j12 != j11) {
            while (j11 != 0) {
                if (j12 != (j11 & 255)) {
                    j11 >>= 8;
                }
            }
            z11 = true;
            HashMap<i, e> hashMap = this.f34948m;
            if (z11) {
                if (this instanceof j) {
                    j jVar = (j) this;
                    if (jVar.t()) {
                        jVar.q();
                    }
                }
                arrayList.clear();
                hashMap.clear();
            }
            if (z11 || actionMasked2 == 0) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 5) {
                    arrayList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                } else if (actionMasked == 1 || actionMasked == 6) {
                    arrayList.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                }
            }
            pointerCount = motionEvent.getPointerCount();
            float f7 = 0.0f;
            float f11 = 0.0f;
            for (i11 = 0; i11 < pointerCount; i11++) {
                f7 += motionEvent.getX(i11);
                f11 += motionEvent.getY(i11);
            }
            float f12 = pointerCount;
            this.f34949n = new PointF(f7 / f12, f11 / f12);
            if (!z11) {
                Log.w("MultiFingerGesture", "Some MotionEvents were not passed to the library or events from different view trees are merged.");
                return false;
            }
            if (actionMasked2 == 2 && arrayList.size() >= k() && c().getPressure() / e().getPressure() > 0.67f) {
                hashMap.clear();
                int i13 = 0;
                while (i13 < arrayList.size() - i12) {
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (i15 < arrayList.size()) {
                        Integer num = (Integer) arrayList.get(i13);
                        int intValue = num.intValue();
                        Integer num2 = (Integer) arrayList.get(i15);
                        int intValue2 = num2.intValue();
                        float x11 = e().getX(e().findPointerIndex(intValue));
                        float y11 = e().getY(e().findPointerIndex(intValue));
                        hashMap.put(new i(num, num2), new e(e().getX(e().findPointerIndex(intValue2)) - x11, e().getY(e().findPointerIndex(intValue2)) - y11, c().getX(c().findPointerIndex(intValue2)) - c().getX(c().findPointerIndex(intValue)), c().getY(c().findPointerIndex(intValue2)) - c().getY(c().findPointerIndex(intValue))));
                        i15++;
                        i12 = 1;
                    }
                    i13 = i14;
                }
                if (!l()) {
                    return h();
                }
            }
            return false;
        }
        if (actionMasked2 == 2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (motionEvent.findPointerIndex(((Integer) it.next()).intValue()) == -1) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        HashMap<i, e> hashMap2 = this.f34948m;
        if (z11) {
        }
        if (z11) {
        }
        actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
        }
        arrayList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        pointerCount = motionEvent.getPointerCount();
        float f72 = 0.0f;
        float f112 = 0.0f;
        while (i11 < pointerCount) {
        }
        float f122 = pointerCount;
        this.f34949n = new PointF(f72 / f122, f112 / f122);
        if (!z11) {
        }
    }

    @Override // Yf.b
    protected boolean b(int i11) {
        return super.b(i11) && !l();
    }

    protected boolean h() {
        return false;
    }

    public final PointF i() {
        return this.f34949n;
    }

    public final int j() {
        return this.f34947l.size();
    }

    protected int k() {
        return 2;
    }

    protected boolean l() {
        float f7 = this.f34950o.widthPixels;
        float f11 = this.f34944i;
        float f12 = f7 - f11;
        float f13 = r0.heightPixels - f11;
        Iterator it = this.f34947l.iterator();
        while (it.hasNext()) {
            int findPointerIndex = c().findPointerIndex(((Integer) it.next()).intValue());
            MotionEvent c11 = c();
            float x11 = findPointerIndex < c11.getPointerCount() ? c11.getX(findPointerIndex) + (c11.getRawX() - c11.getX()) : 0.0f;
            MotionEvent c12 = c();
            float y11 = findPointerIndex < c12.getPointerCount() ? c12.getY(findPointerIndex) + (c12.getRawY() - c12.getY()) : 0.0f;
            if (x11 < f11 || y11 < f11 || x11 > f12 || y11 > f13) {
                return true;
            }
        }
        Iterator<e> it2 = this.f34948m.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().b() < this.f34945j) {
                return true;
            }
        }
        return false;
    }

    protected void n() {
    }

    public final void o() {
        this.f34945j = this.f34918a.getResources().getDimension(R.dimen.mapbox_internalMinSpan24);
    }
}
