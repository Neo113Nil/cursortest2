package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w40 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public final float f8370j;

    /* JADX INFO: renamed from: k */
    public final int f8371k;

    /* JADX INFO: renamed from: l */
    public final int f8372l;

    /* JADX INFO: renamed from: m */
    public final View f8373m;

    /* JADX INFO: renamed from: n */
    public v40 f8374n;

    /* JADX INFO: renamed from: o */
    public v40 f8375o;

    /* JADX INFO: renamed from: p */
    public boolean f8376p;

    /* JADX INFO: renamed from: q */
    public int f8377q;

    /* JADX INFO: renamed from: r */
    public final int[] f8378r = new int[2];

    public w40(View view) {
        this.f8373m = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8370j = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8371k = tapTimeout;
        this.f8372l = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m5234a() {
        v40 v40Var = this.f8375o;
        View view = this.f8373m;
        if (v40Var != null) {
            view.removeCallbacks(v40Var);
        }
        v40 v40Var2 = this.f8374n;
        if (v40Var2 != null) {
            view.removeCallbacks(v40Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract t71 mo2980b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2981c();

    /* JADX INFO: renamed from: d */
    public boolean mo2982d() {
        t71 t71VarMo2980b = mo2980b();
        if (t71VarMo2980b == null || !t71VarMo2980b.mo3216a()) {
            return true;
        }
        t71VarMo2980b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C0151dv c0151dvMo3218i;
        boolean z2 = this.f8376p;
        View view2 = this.f8373m;
        if (z2) {
            t71 t71VarMo2980b = mo2980b();
            if (t71VarMo2980b != null && t71VarMo2980b.mo3216a() && (c0151dvMo3218i = t71VarMo2980b.mo3218i()) != null && c0151dvMo3218i.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f8378r;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0151dvMo3218i.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM1307b = c0151dvMo3218i.m1307b(motionEventObtainNoHistory, this.f8377q);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM1307b && z3) {
                    z = true;
                } else if (mo2982d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (mo2982d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f8377q = motionEvent.getPointerId(0);
                    if (this.f8374n == null) {
                        this.f8374n = new v40(this, 0);
                    }
                    view2.postDelayed(this.f8374n, this.f8371k);
                    if (this.f8375o == null) {
                        this.f8375o = new v40(this, 1);
                    }
                    view2.postDelayed(this.f8375o, this.f8372l);
                } else if (actionMasked2 == 1) {
                    m5234a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f8377q);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f8370j;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m5234a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (mo2981c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m5234a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f8376p = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8376p = false;
        this.f8377q = -1;
        v40 v40Var = this.f8374n;
        if (v40Var != null) {
            this.f8373m.removeCallbacks(v40Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
