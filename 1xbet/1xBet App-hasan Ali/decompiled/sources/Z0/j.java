package Z0;

import A.B;
import A.s;
import A0.C0028g0;
import A0.F;
import A0.G1;
import A0.RunnableC0049o;
import A0.Z;
import E.H0;
import P.C0283b0;
import P.C0310p;
import P.InterfaceC0298j;
import a.AbstractC0444a;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import g1.C1968b;
import game.betting133.sports1xbet.R;
import i4.InterfaceC2015a;
import java.util.LinkedHashMap;
import n1.AbstractC2181w;
import n1.C;
import n1.InterfaceC2167h;
import n1.InterfaceC2168i;
import n1.h0;
import n1.k0;
import p4.AbstractC2282w;
import r0.AbstractC2346c;
import s0.C2355d;
import s0.C2358g;
import t0.x;
import t3.AbstractC2425d;
import w0.AbstractC2540a;
import x0.f0;
import z0.AbstractC2749f;
import z0.C2731G;
import z0.C2761s;
import z0.n0;
import z0.o0;
import z0.p0;

/* loaded from: classes.dex */
public abstract class j extends ViewGroup implements InterfaceC2167h, InterfaceC0298j, o0, InterfaceC2168i {

    /* renamed from: A, reason: collision with root package name */
    public final i f6285A;

    /* renamed from: B, reason: collision with root package name */
    public final i f6286B;

    /* renamed from: C, reason: collision with root package name */
    public i4.c f6287C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f6288D;

    /* renamed from: E, reason: collision with root package name */
    public int f6289E;

    /* renamed from: F, reason: collision with root package name */
    public int f6290F;

    /* renamed from: G, reason: collision with root package name */
    public final H0 f6291G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6292H;

    /* renamed from: I, reason: collision with root package name */
    public final C2731G f6293I;

    /* renamed from: k, reason: collision with root package name */
    public final C2355d f6294k;

    /* renamed from: l, reason: collision with root package name */
    public final View f6295l;

    /* renamed from: m, reason: collision with root package name */
    public final n0 f6296m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC2015a f6297n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6298o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC2015a f6299p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC2015a f6300q;

    /* renamed from: r, reason: collision with root package name */
    public b0.p f6301r;

    /* renamed from: s, reason: collision with root package name */
    public i4.c f6302s;

    /* renamed from: t, reason: collision with root package name */
    public W0.c f6303t;

    /* renamed from: u, reason: collision with root package name */
    public i4.c f6304u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0491u f6305v;

    /* renamed from: w, reason: collision with root package name */
    public U1.e f6306w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f6307x;

    /* renamed from: y, reason: collision with root package name */
    public long f6308y;

    /* renamed from: z, reason: collision with root package name */
    public k0 f6309z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, C0310p c0310p, int i, C2355d c2355d, View view, n0 n0Var) {
        super(context);
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        this.f6294k = c2355d;
        this.f6295l = view;
        this.f6296m = n0Var;
        LinkedHashMap linkedHashMap = G1.f273a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0310p);
        setSaveFromParentEnabled(false);
        addView(view);
        q qVar = (q) this;
        C.f(this, new a(qVar, i7));
        AbstractC2181w.c(this, this);
        this.f6297n = h.f6281o;
        this.f6299p = h.f6280n;
        this.f6300q = h.f6279m;
        this.f6301r = b0.m.f7161k;
        this.f6303t = AbstractC2425d.a();
        this.f6307x = new int[2];
        this.f6308y = 0L;
        this.f6285A = new i(qVar, i6);
        this.f6286B = new i(qVar, i7);
        this.f6288D = new int[2];
        this.f6289E = Integer.MIN_VALUE;
        this.f6290F = Integer.MIN_VALUE;
        this.f6291G = new H0();
        C2731G c2731g = new C2731G(3);
        c2731g.f21637x = qVar;
        b0.p a5 = H0.k.a(androidx.compose.ui.input.nestedscroll.a.a(c2355d), true, b.f6261o);
        x xVar = new x();
        xVar.f19529k = new d(qVar, i6);
        C0283b0 c0283b0 = new C0283b0();
        C0283b0 c0283b02 = xVar.f19530l;
        if (c0283b02 != null) {
            c0283b02.f4445l = null;
        }
        xVar.f19530l = c0283b0;
        c0283b0.f4445l = xVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(c0283b0);
        b0.p d5 = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(a5.c(xVar), new s(qVar, c2731g, qVar, 5)), new c(qVar, c2731g, i5));
        c2731g.e0(this.f6301r.c(d5));
        this.f6302s = new C0028g0(27, c2731g, d5);
        c2731g.a0(this.f6303t);
        this.f6304u = new B(20, c2731g);
        c2731g.f21619V = new c(qVar, c2731g, i7);
        c2731g.f21620W = new d(qVar, i7);
        c2731g.d0(new e(qVar, c2731g, i7));
        this.f6293I = c2731g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC2540a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((F) this.f6296m).getSnapshotObserver();
    }

    public static final int k(q qVar, int i, int i5, int i6) {
        return (i6 >= 0 || i == i5) ? View.MeasureSpec.makeMeasureSpec(AbstractC0444a.t(i6, i, i5), 1073741824) : (i6 != -2 || i5 == Integer.MAX_VALUE) ? (i6 != -1 || i5 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
    }

    public static C1968b l(C1968b c1968b, int i, int i5, int i6, int i7) {
        int i8 = c1968b.f17073a - i;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = c1968b.f17074b - i5;
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = c1968b.f17075c - i6;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = c1968b.f17076d - i7;
        return C1968b.b(i8, i9, i10, i11 >= 0 ? i11 : 0);
    }

    @Override // n1.InterfaceC2166g
    public final void a(View view, View view2, int i, int i5) {
        H0 h02 = this.f6291G;
        if (i5 == 1) {
            h02.f1042b = i;
        } else {
            h02.f1041a = i;
        }
    }

    @Override // n1.InterfaceC2166g
    public final void b(View view, int i) {
        H0 h02 = this.f6291G;
        if (i == 1) {
            h02.f1042b = 0;
        } else {
            h02.f1041a = 0;
        }
    }

    @Override // n1.InterfaceC2167h
    public final void c(NestedScrollView nestedScrollView, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        if (this.f6295l.isNestedScrollingEnabled()) {
            float f = i;
            float f5 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(f * f5) << 32) | (Float.floatToRawIntBits(i5 * f5) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i6 * f5) << 32) | (Float.floatToRawIntBits(i7 * f5) & 4294967295L);
            int i9 = i8 == 0 ? 1 : 2;
            C2358g c2358g = this.f6294k.f19158a;
            C2358g c2358g2 = null;
            if (c2358g != null && c2358g.f7175x) {
                c2358g2 = (C2358g) AbstractC2749f.k(c2358g);
            }
            C2358g c2358g3 = c2358g2;
            long I5 = c2358g3 != null ? c2358g3.I(i9, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = Z.q(Float.intBitsToFloat((int) (I5 >> 32)));
            iArr[1] = Z.q(Float.intBitsToFloat((int) (I5 & 4294967295L)));
        }
    }

    @Override // n1.InterfaceC2166g
    public final void d(int i, int i5, int[] iArr, int i6) {
        if (this.f6295l.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i5 * f) & 4294967295L) | (Float.floatToRawIntBits(i * f) << 32);
            int i7 = i6 == 0 ? 1 : 2;
            C2358g c2358g = this.f6294k.f19158a;
            C2358g c2358g2 = null;
            if (c2358g != null && c2358g.f7175x) {
                c2358g2 = (C2358g) AbstractC2749f.k(c2358g);
            }
            long c02 = c2358g2 != null ? c2358g2.c0(i7, floatToRawIntBits) : 0L;
            iArr[0] = Z.q(Float.intBitsToFloat((int) (c02 >> 32)));
            iArr[1] = Z.q(Float.intBitsToFloat((int) (c02 & 4294967295L)));
        }
    }

    @Override // n1.InterfaceC2168i
    public final k0 e(View view, k0 k0Var) {
        this.f6309z = new k0(k0Var);
        return m(k0Var);
    }

    @Override // n1.InterfaceC2166g
    public final void f(NestedScrollView nestedScrollView, int i, int i5, int i6, int i7, int i8) {
        if (this.f6295l.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i * f) << 32) | (Float.floatToRawIntBits(i5 * f) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i6 * f) << 32) | (Float.floatToRawIntBits(i7 * f) & 4294967295L);
            int i9 = i8 == 0 ? 1 : 2;
            C2358g c2358g = this.f6294k.f19158a;
            C2358g c2358g2 = null;
            if (c2358g != null && c2358g.f7175x) {
                c2358g2 = (C2358g) AbstractC2749f.k(c2358g);
            }
            if (c2358g2 != null) {
                c2358g2.I(i9, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // P.InterfaceC0298j
    public final void g() {
        this.f6300q.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f6288D;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final W0.c getDensity() {
        return this.f6303t;
    }

    public final View getInteropView() {
        return this.f6295l;
    }

    public final C2731G getLayoutNode() {
        return this.f6293I;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f6295l.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC0491u getLifecycleOwner() {
        return this.f6305v;
    }

    public final b0.p getModifier() {
        return this.f6301r;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        H0 h02 = this.f6291G;
        return h02.f1042b | h02.f1041a;
    }

    public final i4.c getOnDensityChanged$ui_release() {
        return this.f6304u;
    }

    public final i4.c getOnModifierChanged$ui_release() {
        return this.f6302s;
    }

    public final i4.c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f6287C;
    }

    public final InterfaceC2015a getRelease() {
        return this.f6300q;
    }

    public final InterfaceC2015a getReset() {
        return this.f6299p;
    }

    public final U1.e getSavedStateRegistryOwner() {
        return this.f6306w;
    }

    public final InterfaceC2015a getUpdate() {
        return this.f6297n;
    }

    public final View getView() {
        return this.f6295l;
    }

    @Override // P.InterfaceC0298j
    public final void h() {
        this.f6299p.invoke();
        removeAllViewsInLayout();
    }

    @Override // n1.InterfaceC2166g
    public final boolean i(View view, View view2, int i, int i5) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f6292H) {
            this.f6293I.C();
            return null;
        }
        this.f6295l.postOnAnimation(new RunnableC0049o(6, this.f6286B));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f6295l.isNestedScrollingEnabled();
    }

    public final k0 m(k0 k0Var) {
        h0 h0Var = k0Var.f18442a;
        C1968b i = h0Var.i(-1);
        C1968b c1968b = C1968b.f17072e;
        if (!i.equals(c1968b) || !h0Var.j(-9).equals(c1968b) || h0Var.h() != null) {
            C2761s c2761s = this.f6293I.f21612O.f21768c;
            if (c2761s.f21856Y.f7175x) {
                long K = G4.l.K(c2761s.J(0L));
                int i5 = (int) (K >> 32);
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = (int) (K & 4294967295L);
                if (i6 < 0) {
                    i6 = 0;
                }
                long I5 = f0.h(c2761s).I();
                int i7 = (int) (I5 >> 32);
                int i8 = (int) (I5 & 4294967295L);
                long j5 = c2761s.f20975m;
                long K5 = G4.l.K(c2761s.J((Float.floatToRawIntBits((int) (j5 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L)));
                int i9 = i7 - ((int) (K5 >> 32));
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = i8 - ((int) (4294967295L & K5));
                int i11 = i10 >= 0 ? i10 : 0;
                if (i5 != 0 || i6 != 0 || i9 != 0 || i11 != 0) {
                    return k0Var.f18442a.r(i5, i6, i9, i11);
                }
            }
        }
        return k0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6285A.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f6292H) {
            this.f6293I.C();
            return;
        }
        this.f6295l.postOnAnimation(new RunnableC0049o(6, this.f6286B));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f21843a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        this.f6295l.layout(0, 0, i6 - i, i7 - i5);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        View view = this.f6295l;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i5));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i5);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f6289E = i;
        this.f6290F = i5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f5, boolean z3) {
        if (!this.f6295l.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2282w.p(this.f6294k.c(), null, new f(z3, this, AbstractC2346c.c(f * (-1.0f), f5 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f5) {
        if (!this.f6295l.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2282w.p(this.f6294k.c(), null, new g(this, AbstractC2346c.c(f * (-1.0f), f5 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        i4.c cVar = this.f6287C;
        if (cVar != null) {
            cVar.c(Boolean.valueOf(z3));
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void setDensity(W0.c cVar) {
        if (cVar != this.f6303t) {
            this.f6303t = cVar;
            i4.c cVar2 = this.f6304u;
            if (cVar2 != null) {
                cVar2.c(cVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0491u interfaceC0491u) {
        if (interfaceC0491u != this.f6305v) {
            this.f6305v = interfaceC0491u;
            L.l(this, interfaceC0491u);
        }
    }

    public final void setModifier(b0.p pVar) {
        if (pVar != this.f6301r) {
            this.f6301r = pVar;
            i4.c cVar = this.f6302s;
            if (cVar != null) {
                cVar.c(pVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(i4.c cVar) {
        this.f6304u = cVar;
    }

    public final void setOnModifierChanged$ui_release(i4.c cVar) {
        this.f6302s = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(i4.c cVar) {
        this.f6287C = cVar;
    }

    public final void setRelease(InterfaceC2015a interfaceC2015a) {
        this.f6300q = interfaceC2015a;
    }

    public final void setReset(InterfaceC2015a interfaceC2015a) {
        this.f6299p = interfaceC2015a;
    }

    public final void setSavedStateRegistryOwner(U1.e eVar) {
        if (eVar != this.f6306w) {
            this.f6306w = eVar;
            setTag(R.id.view_tree_saved_state_registry_owner, eVar);
        }
    }

    public final void setUpdate(InterfaceC2015a interfaceC2015a) {
        this.f6297n = interfaceC2015a;
        this.f6298o = true;
        this.f6285A.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // z0.o0
    public final boolean z() {
        return isAttachedToWindow();
    }
}
