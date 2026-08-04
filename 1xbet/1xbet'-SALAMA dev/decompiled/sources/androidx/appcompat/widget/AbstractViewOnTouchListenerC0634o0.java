package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.appcompat.widget.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0634o0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f8723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RunnableC0632n0 f8724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RunnableC0632n0 f8725f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8727y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f8728z = new int[2];

    public AbstractViewOnTouchListenerC0634o0(View view) {
        this.f8723d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8720a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8721b = tapTimeout;
        this.f8722c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0632n0 runnableC0632n0 = this.f8725f;
        View view = this.f8723d;
        if (runnableC0632n0 != null) {
            view.removeCallbacks(runnableC0632n0);
        }
        RunnableC0632n0 runnableC0632n1 = this.f8724e;
        if (runnableC0632n1 != null) {
            view.removeCallbacks(runnableC0632n1);
        }
    }

    public abstract p086m.B b();

    public abstract boolean c();

    public boolean d() {
        p086m.B b7 = b();
        if (b7 == null || !b7.b()) {
            return true;
        }
        b7.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        C0628l0 c0628l0H;
        boolean z7 = this.f8726x;
        View view2 = this.f8723d;
        if (z7) {
            p086m.B b7 = b();
            if (b7 != null && b7.b() && (c0628l0H = b7.h()) != null && c0628l0H.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f8728z;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0628l0H.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = c0628l0H.b(this.f8727y, motionEventObtainNoHistory);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z8 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z8) {
                    z4 = true;
                } else if (d()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else if (d()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f8727y = motionEvent.getPointerId(0);
                    if (this.f8724e == null) {
                        this.f8724e = new RunnableC0632n0(this, 0);
                    }
                    view2.postDelayed(this.f8724e, this.f8721b);
                    if (this.f8725f == null) {
                        this.f8725f = new RunnableC0632n0(this, 1);
                    }
                    view2.postDelayed(this.f8725f, this.f8722c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f8727y);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX(iFindPointerIndex);
                        float y4 = motionEvent.getY(iFindPointerIndex);
                        float f7 = this.f8720a;
                        float f8 = -f7;
                        if (x4 < f8 || y4 < f8 || x4 >= (view2.getRight() - view2.getLeft()) + f7 || y4 >= (view2.getBottom() - view2.getTop()) + f7) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z4 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f8726x = z4;
        return z4 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8726x = false;
        this.f8727y = -1;
        RunnableC0632n0 runnableC0632n0 = this.f8724e;
        if (runnableC0632n0 != null) {
            this.f8723d.removeCallbacks(runnableC0632n0);
        }
    }
}
