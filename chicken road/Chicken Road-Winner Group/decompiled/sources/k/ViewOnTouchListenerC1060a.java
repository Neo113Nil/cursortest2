package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.A;
import l.C;
import l.C1087f;
import l.C1088g;
import l.C1089h;
import l.C1090i;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1060a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f9529a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9530b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9531c;

    /* renamed from: d, reason: collision with root package name */
    public final View f9532d;

    /* renamed from: e, reason: collision with root package name */
    public C f9533e;
    public C f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9534g;

    /* renamed from: h, reason: collision with root package name */
    public int f9535h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f9536i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9537j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f9538k;

    public ViewOnTouchListenerC1060a(View view) {
        this.f9536i = new int[2];
        this.f9532d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9529a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9530b = tapTimeout;
        this.f9531c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        C c3 = this.f;
        View view = this.f9532d;
        if (c3 != null) {
            view.removeCallbacks(c3);
        }
        C c4 = this.f9533e;
        if (c4 != null) {
            view.removeCallbacks(c4);
        }
    }

    public final AbstractC1071l b() {
        C1087f c1087f;
        switch (this.f9537j) {
            case 0:
                AbstractC1061b abstractC1061b = ((ActionMenuItemView) this.f9538k).f1898j;
                if (abstractC1061b == null || (c1087f = ((C1088g) abstractC1061b).f9792a.f9817s) == null) {
                    return null;
                }
                return c1087f.a();
            default:
                C1087f c1087f2 = ((C1089h) this.f9538k).f9793c.f9816r;
                if (c1087f2 == null) {
                    return null;
                }
                return c1087f2.a();
        }
    }

    public final boolean c() {
        AbstractC1071l b3;
        switch (this.f9537j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f9538k;
                InterfaceC1068i interfaceC1068i = actionMenuItemView.f1896h;
                return interfaceC1068i != null && interfaceC1068i.a(actionMenuItemView.f1894e) && (b3 = b()) != null && b3.k();
            default:
                ((C1089h) this.f9538k).f9793c.k();
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
        boolean z4;
        A a3;
        boolean z5 = this.f9534g;
        View view2 = this.f9532d;
        if (z5) {
            AbstractC1071l b3 = b();
            if (b3 != null && b3.k() && (a3 = (A) b3.g()) != null && a3.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f9536i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                a3.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b4 = a3.b(this.f9535h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b4) {
                }
            }
            switch (this.f9537j) {
                case 1:
                    C1090i c1090i = ((C1089h) this.f9538k).f9793c;
                    if (c1090i.f9818t == null) {
                        c1090i.g();
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        break;
                    }
                default:
                    AbstractC1071l b5 = b();
                    if (b5 != null && b5.k()) {
                        b5.dismiss();
                    }
                    z4 = true;
                    break;
            }
            if (z4) {
                z3 = false;
            }
            z3 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f9535h);
                            if (findPointerIndex >= 0) {
                                float x3 = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.f9529a;
                                float f3 = -f;
                                if (x3 < f3 || y < f3 || x3 >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
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
                    this.f9535h = motionEvent.getPointerId(0);
                    if (this.f9533e == null) {
                        this.f9533e = new C(this, 0);
                    }
                    view2.postDelayed(this.f9533e, this.f9530b);
                    if (this.f == null) {
                        this.f = new C(this, 1);
                    }
                    view2.postDelayed(this.f, this.f9531c);
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        this.f9534g = z3;
        return z3 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9534g = false;
        this.f9535h = -1;
        C c3 = this.f9533e;
        if (c3 != null) {
            this.f9532d.removeCallbacks(c3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1060a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f9537j = 0;
        this.f9538k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1060a(C1089h c1089h, C1089h c1089h2) {
        this(c1089h2);
        this.f9537j = 1;
        this.f9538k = c1089h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
