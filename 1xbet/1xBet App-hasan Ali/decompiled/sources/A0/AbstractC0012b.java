package A0;

import P.AbstractC0321v;
import P.C0315s;
import P.EnumC0330z0;
import P.InterfaceC0281a0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC0491u;
import game.betting133.sports1xbet.R;
import java.lang.ref.WeakReference;
import p4.AbstractC2282w;
import q4.AbstractC2314d;
import q4.C2313c;
import r0.AbstractC2346c;
import w0.AbstractC2540a;

/* renamed from: A0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0012b extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f463k;

    /* renamed from: l, reason: collision with root package name */
    public IBinder f464l;

    /* renamed from: m, reason: collision with root package name */
    public K1 f465m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0321v f466n;

    /* renamed from: o, reason: collision with root package name */
    public A.n f467o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f468p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f469q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f470r;

    public AbstractC0012b(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        I i = new I(1, this);
        addOnAttachStateChangeListener(i);
        o1 o1Var = new o1(0);
        AbstractC2346c.s(this).f19535a.add(o1Var);
        this.f467o = new A.n(this, i, o1Var, 1);
    }

    private final void setParentContext(AbstractC0321v abstractC0321v) {
        if (this.f466n != abstractC0321v) {
            this.f466n = abstractC0321v;
            if (abstractC0321v != null) {
                this.f463k = null;
            }
            K1 k12 = this.f465m;
            if (k12 != null) {
                k12.a();
                this.f465m = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f464l != iBinder) {
            this.f464l = iBinder;
            this.f463k = null;
        }
    }

    public abstract void a(int i, C0315s c0315s);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.f469q) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f465m == null) {
            try {
                this.f469q = true;
                this.f465m = L1.a(this, g(), new X.d(-656146368, new C0009a(0, this), true));
            } finally {
                this.f469q = false;
            }
        }
    }

    public void d(boolean z3, int i, int i5, int i6, int i7) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i6 - i) - getPaddingRight(), (i7 - i5) - getPaddingBottom());
        }
    }

    public void f(int i, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i5);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i5)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0321v g() {
        P.F0 f02;
        a4.h hVar;
        C0059t0 c0059t0;
        int i = 2;
        AbstractC0321v abstractC0321v = this.f466n;
        if (abstractC0321v == null) {
            abstractC0321v = G1.b(this);
            if (abstractC0321v == null) {
                Object parent = getParent();
                while (abstractC0321v == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC0321v = G1.b(view);
                    parent = view.getParent();
                }
            }
            if (abstractC0321v != null) {
                AbstractC0321v abstractC0321v2 = (!(abstractC0321v instanceof P.F0) || ((EnumC0330z0) ((P.F0) abstractC0321v).f4307t.getValue()).compareTo(EnumC0330z0.f4608l) > 0) ? abstractC0321v : null;
                if (abstractC0321v2 != null) {
                    this.f463k = new WeakReference(abstractC0321v2);
                }
            } else {
                abstractC0321v = null;
            }
            if (abstractC0321v == null) {
                WeakReference weakReference = this.f463k;
                if (weakReference == null || (abstractC0321v = (AbstractC0321v) weakReference.get()) == null || ((abstractC0321v instanceof P.F0) && ((EnumC0330z0) ((P.F0) abstractC0321v).f4307t.getValue()).compareTo(EnumC0330z0.f4608l) <= 0)) {
                    abstractC0321v = null;
                }
                if (abstractC0321v == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC2540a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC0321v b3 = G1.b(view2);
                    if (b3 == null) {
                        ((v1) x1.f594a.get()).getClass();
                        a4.i iVar = a4.i.f6649k;
                        W3.m mVar = C0055r0.f554w;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (a4.h) C0055r0.f554w.getValue();
                        } else {
                            hVar = (a4.h) C0055r0.f555x.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        a4.h m5 = hVar.m(iVar);
                        InterfaceC0281a0 interfaceC0281a0 = (InterfaceC0281a0) m5.l(P.Z.f4430l);
                        if (interfaceC0281a0 != null) {
                            C0059t0 c0059t02 = new C0059t0(interfaceC0281a0);
                            P.W w5 = (P.W) c0059t02.f579m;
                            synchronized (w5.f4412l) {
                                w5.f4411k = false;
                                c0059t0 = c0059t02;
                            }
                        } else {
                            c0059t0 = 0;
                        }
                        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                        a4.h hVar2 = (b0.r) m5.l(b0.c.f7150x);
                        if (hVar2 == null) {
                            hVar2 = new C0017c1();
                            wVar.f17624k = hVar2;
                        }
                        if (c0059t0 != 0) {
                            iVar = c0059t0;
                        }
                        a4.h m6 = m5.m(iVar).m(hVar2);
                        f02 = new P.F0(m6);
                        f02.C();
                        u4.c a5 = AbstractC2282w.a(m6);
                        InterfaceC0491u f = androidx.lifecycle.L.f(view2);
                        androidx.lifecycle.L g5 = f != null ? f.g() : null;
                        if (g5 == null) {
                            AbstractC2540a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new D2.e();
                        }
                        view2.addOnAttachStateChangeListener(new y1(view2, f02));
                        g5.a(new D1(a5, c0059t0, f02, wVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, f02);
                        p4.M m7 = p4.M.f18757k;
                        Handler handler = view2.getHandler();
                        int i5 = AbstractC2314d.f18898a;
                        view2.addOnAttachStateChangeListener(new I(i, AbstractC2282w.p(m7, new C2313c(handler, "windowRecomposer cleanup", false).f18897p, new w1(f02, view2, null), 2)));
                    } else {
                        if (!(b3 instanceof P.F0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        f02 = (P.F0) b3;
                    }
                    P.F0 f03 = ((EnumC0330z0) f02.f4307t.getValue()).compareTo(EnumC0330z0.f4608l) > 0 ? f02 : null;
                    if (f03 != null) {
                        this.f463k = new WeakReference(f03);
                    }
                    return f02;
                }
            }
        }
        return abstractC0321v;
    }

    public final boolean getHasComposition() {
        return this.f465m != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f468p;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f470r || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        d(z3, i, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        c();
        f(i, i5);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(AbstractC0321v abstractC0321v) {
        setParentContext(abstractC0321v);
    }

    public final void setShowLayoutBounds(boolean z3) {
        this.f468p = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((F) ((z0.n0) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.f470r = true;
    }

    public final void setViewCompositionStrategy(p1 p1Var) {
        A.n nVar = this.f467o;
        if (nVar != null) {
            nVar.invoke();
        }
        ((Z) p1Var).getClass();
        I i = new I(1, this);
        addOnAttachStateChangeListener(i);
        o1 o1Var = new o1(0);
        AbstractC2346c.s(this).f19535a.add(o1Var);
        this.f467o = new A.n(this, i, o1Var, 1);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z3) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i5) {
        b();
        super.addView(view, i, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
