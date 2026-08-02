package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import n.C2132f;
import n.C2134g;
import n.C2136h;
import n.C2140j;
import n.T;
import n.V;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2063a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final float f17859k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17860l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17861m;

    /* renamed from: n, reason: collision with root package name */
    public final View f17862n;

    /* renamed from: o, reason: collision with root package name */
    public V f17863o;

    /* renamed from: p, reason: collision with root package name */
    public V f17864p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17865q;

    /* renamed from: r, reason: collision with root package name */
    public int f17866r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f17867s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f17868t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f17869u;

    public ViewOnTouchListenerC2063a(View view) {
        this.f17867s = new int[2];
        this.f17862n = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f17859k = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f17860l = tapTimeout;
        this.f17861m = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        V v4 = this.f17864p;
        View view = this.f17862n;
        if (v4 != null) {
            view.removeCallbacks(v4);
        }
        V v5 = this.f17863o;
        if (v5 != null) {
            view.removeCallbacks(v5);
        }
    }

    public final AbstractC2072j b() {
        C2132f c2132f;
        switch (this.f17868t) {
            case 0:
                AbstractC2064b abstractC2064b = ((ActionMenuItemView) this.f17869u).f6659w;
                if (abstractC2064b == null || (c2132f = ((C2134g) abstractC2064b).f18246a.f18256C) == null) {
                    return null;
                }
                return c2132f.a();
            default:
                C2132f c2132f2 = ((C2136h) this.f17869u).f18247n.f18255B;
                if (c2132f2 == null) {
                    return null;
                }
                return c2132f2.a();
        }
    }

    public final boolean d() {
        AbstractC2072j b3;
        switch (this.f17868t) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f17869u;
                InterfaceC2069g interfaceC2069g = actionMenuItemView.f6657u;
                return interfaceC2069g != null && interfaceC2069g.a(actionMenuItemView.f6654r) && (b3 = b()) != null && b3.i();
            default:
                ((C2136h) this.f17869u).f18247n.i();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z5;
        T t5;
        boolean z6 = this.f17865q;
        View view2 = this.f17862n;
        if (z6) {
            AbstractC2072j b3 = b();
            if (b3 != null && b3.i() && (t5 = (T) b3.d()) != null && t5.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f17867s;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                t5.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b5 = t5.b(obtainNoHistory, this.f17866r);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z7 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b5) {
                }
            }
            switch (this.f17868t) {
                case 1:
                    C2140j c2140j = ((C2136h) this.f17869u).f18247n;
                    if (c2140j.f18257D == null) {
                        c2140j.d();
                        z5 = true;
                        break;
                    } else {
                        z5 = false;
                        break;
                    }
                default:
                    AbstractC2072j b6 = b();
                    if (b6 != null && b6.i()) {
                        b6.dismiss();
                    }
                    z5 = true;
                    break;
            }
            if (z5) {
                z3 = false;
            }
            z3 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f17866r);
                            if (findPointerIndex >= 0) {
                                float x5 = motionEvent.getX(findPointerIndex);
                                float y5 = motionEvent.getY(findPointerIndex);
                                float f = this.f17859k;
                                float f5 = -f;
                                if (x5 < f5 || y5 < f5 || x5 >= (view2.getRight() - view2.getLeft()) + f || y5 >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (d()) {
                                        z3 = true;
                                        if (z3) {
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
                    this.f17866r = motionEvent.getPointerId(0);
                    if (this.f17863o == null) {
                        this.f17863o = new V(this, 0);
                    }
                    view2.postDelayed(this.f17863o, this.f17860l);
                    if (this.f17864p == null) {
                        this.f17864p = new V(this, 1);
                    }
                    view2.postDelayed(this.f17864p, this.f17861m);
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        this.f17865q = z3;
        return z3 || z6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f17865q = false;
        this.f17866r = -1;
        V v4 = this.f17863o;
        if (v4 != null) {
            this.f17862n.removeCallbacks(v4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC2063a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f17868t = 0;
        this.f17869u = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC2063a(C2136h c2136h, C2136h c2136h2) {
        this(c2136h2);
        this.f17868t = 1;
        this.f17869u = c2136h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
