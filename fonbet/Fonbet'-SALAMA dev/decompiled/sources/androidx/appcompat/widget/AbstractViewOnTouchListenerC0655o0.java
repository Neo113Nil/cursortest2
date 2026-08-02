package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import m.InterfaceC1414B;

/* renamed from: androidx.appcompat.widget.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0655o0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f8720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8721b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8722c;

    /* renamed from: d, reason: collision with root package name */
    public final View f8723d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0653n0 f8724e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0653n0 f8725f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8726x;

    /* renamed from: y, reason: collision with root package name */
    public int f8727y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f8728z = new int[2];

    public AbstractViewOnTouchListenerC0655o0(View view) {
        this.f8723d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8720a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8721b = tapTimeout;
        this.f8722c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0653n0 runnableC0653n0 = this.f8725f;
        View view = this.f8723d;
        if (runnableC0653n0 != null) {
            view.removeCallbacks(runnableC0653n0);
        }
        RunnableC0653n0 runnableC0653n02 = this.f8724e;
        if (runnableC0653n02 != null) {
            view.removeCallbacks(runnableC0653n02);
        }
    }

    public abstract InterfaceC1414B b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC1414B b7 = b();
        if (b7 == null || !b7.b()) {
            return true;
        }
        b7.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        C0649l0 h6;
        boolean z7 = this.f8726x;
        View view2 = this.f8723d;
        if (z7) {
            InterfaceC1414B b7 = b();
            if (b7 != null && b7.b() && (h6 = b7.h()) != null && h6.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f8728z;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                h6.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b8 = h6.b(this.f8727y, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z8 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b8) {
                }
            }
            if (d()) {
                z4 = false;
            }
            z4 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f8727y);
                            if (findPointerIndex >= 0) {
                                float x4 = motionEvent.getX(findPointerIndex);
                                float y4 = motionEvent.getY(findPointerIndex);
                                float f7 = this.f8720a;
                                float f8 = -f7;
                                if (x4 < f8 || y4 < f8 || x4 >= (view2.getRight() - view2.getLeft()) + f7 || y4 >= (view2.getBottom() - view2.getTop()) + f7) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z4 = true;
                                        if (z4) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f8727y = motionEvent.getPointerId(0);
                    if (this.f8724e == null) {
                        this.f8724e = new RunnableC0653n0(this, 0);
                    }
                    view2.postDelayed(this.f8724e, this.f8721b);
                    if (this.f8725f == null) {
                        this.f8725f = new RunnableC0653n0(this, 1);
                    }
                    view2.postDelayed(this.f8725f, this.f8722c);
                }
            }
            z4 = false;
            if (z4) {
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
        RunnableC0653n0 runnableC0653n0 = this.f8724e;
        if (runnableC0653n0 != null) {
            this.f8723d.removeCallbacks(runnableC0653n0);
        }
    }
}
