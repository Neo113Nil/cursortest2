package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import m.InterfaceC7975b;

/* loaded from: classes8.dex */
public abstract class K implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f37655a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37656b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37657c;

    /* renamed from: d, reason: collision with root package name */
    final View f37658d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f37659e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f37660f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37661g;

    /* renamed from: h, reason: collision with root package name */
    private int f37662h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f37663i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = K.this.f37658d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            K.this.e();
        }
    }

    public K(View view) {
        this.f37658d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f37655a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f37656b = tapTimeout;
        this.f37657c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    private void a() {
        Runnable runnable = this.f37660f;
        View view = this.f37658d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f37659e;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    public abstract InterfaceC7975b b();

    protected abstract boolean c();

    protected boolean d() {
        InterfaceC7975b b11 = b();
        if (b11 == null || !b11.a()) {
            return true;
        }
        b11.dismiss();
        return true;
    }

    final void e() {
        a();
        View view = this.f37658d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f37661g = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        I i11;
        boolean z12 = this.f37661g;
        View view2 = this.f37658d;
        if (z12) {
            InterfaceC7975b b11 = b();
            if (b11 != null && b11.a() && (i11 = (I) b11.h()) != null && i11.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f37663i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                i11.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b12 = i11.b(obtainNoHistory, this.f37662h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z13 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b12) {
                }
            }
            if (d()) {
                z11 = false;
            }
            z11 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f37662h);
                            if (findPointerIndex >= 0) {
                                float x11 = motionEvent.getX(findPointerIndex);
                                float y11 = motionEvent.getY(findPointerIndex);
                                float f7 = this.f37655a;
                                float f11 = -f7;
                                if (x11 < f11 || y11 < f11 || x11 >= (view2.getRight() - view2.getLeft()) + f7 || y11 >= (view2.getBottom() - view2.getTop()) + f7) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z11 = true;
                                        if (z11) {
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
                    this.f37662h = motionEvent.getPointerId(0);
                    if (this.f37659e == null) {
                        this.f37659e = new a();
                    }
                    view2.postDelayed(this.f37659e, this.f37656b);
                    if (this.f37660f == null) {
                        this.f37660f = new b();
                    }
                    view2.postDelayed(this.f37660f, this.f37657c);
                }
            }
            z11 = false;
            if (z11) {
            }
        }
        this.f37661g = z11;
        return z11 || z12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f37661g = false;
        this.f37662h = -1;
        Runnable runnable = this.f37659e;
        if (runnable != null) {
            this.f37658d.removeCallbacks(runnable);
        }
    }
}
