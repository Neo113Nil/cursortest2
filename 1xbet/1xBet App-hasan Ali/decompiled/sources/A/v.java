package A;

import F4.C0121a;
import P.C0299j0;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import h0.C1988b;
import h0.C1991e;
import i4.InterfaceC2015a;
import java.io.IOException;
import java.util.ArrayList;
import k0.C2023c;
import n.C2138i;
import n1.InterfaceC2166g;
import n1.InterfaceC2167h;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import r.C2338p;
import t0.C2407d;
import u.AbstractC2453d;
import u.AbstractC2478z;
import u.C2451c;
import u.z0;
import y.C2645a;
import y.C2646b;
import y.C2647c;
import y.C2648d;
import y.C2649e;
import y.C2651g;
import y.C2652h;
import y.InterfaceC2653i;
import z0.C2731G;
import z0.C2733I;
import z0.C2760q;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f132a;

    /* renamed from: b, reason: collision with root package name */
    public Object f133b;

    /* renamed from: c, reason: collision with root package name */
    public Object f134c = AbstractC2453d.a();

    /* renamed from: d, reason: collision with root package name */
    public Object f135d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f136e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(InterfaceC2015a interfaceC2015a, boolean z3) {
        this.f132a = z3;
        this.f133b = (kotlin.jvm.internal.m) interfaceC2015a;
    }

    public IOException a(boolean z3, boolean z5, IOException iOException) {
        if (iOException != null) {
            j(iOException);
        }
        C4.i iVar = (C4.i) this.f133b;
        if (z5) {
            if (iOException != null) {
                kotlin.jvm.internal.l.f("call", iVar);
            } else {
                kotlin.jvm.internal.l.f("call", iVar);
            }
        }
        if (z3) {
            if (iOException != null) {
                kotlin.jvm.internal.l.f("call", iVar);
            } else {
                kotlin.jvm.internal.l.f("call", iVar);
            }
        }
        return iVar.j(this, z5, z3, iOException);
    }

    public boolean b(int i, int i5, int i6, int[] iArr, int[] iArr2) {
        ViewParent e3;
        int i7;
        int i8;
        if (!this.f132a || (e3 = e(i6)) == null) {
            return false;
        }
        if (i == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) this.f135d;
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.f136e) == null) {
                this.f136e = new int[2];
            }
            iArr = (int[]) this.f136e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e3 instanceof InterfaceC2166g) {
            ((InterfaceC2166g) e3).d(i, i5, iArr, i6);
        } else if (i6 == 0) {
            try {
                e3.onNestedPreScroll(nestedScrollView, i, i5, iArr);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean c(int i, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent e3;
        int i9;
        int i10;
        int[] iArr3;
        if (this.f132a && (e3 = e(i8)) != null) {
            if (i != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                NestedScrollView nestedScrollView = (NestedScrollView) this.f135d;
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i9 = iArr[0];
                    i10 = iArr[1];
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.f136e) == null) {
                        this.f136e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.f136e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e3 instanceof InterfaceC2167h) {
                    ((InterfaceC2167h) e3).c(nestedScrollView, i, i5, i6, i7, i8, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i6;
                    iArr3[1] = iArr3[1] + i7;
                    if (e3 instanceof InterfaceC2166g) {
                        ((InterfaceC2166g) e3).f(nestedScrollView, i, i5, i6, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            e3.onNestedScroll(nestedScrollView, i, i5, i6, i7);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i9;
                    iArr[1] = iArr[1] - i10;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public void d(C2733I c2733i, float f, long j5) {
        float floatValue = ((Number) ((C2451c) this.f134c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b3 = i0.p.b(floatValue, j5);
            if (!this.f132a) {
                AbstractC0467k.h(c2733i, b3, f, 0L, 124);
                return;
            }
            float d5 = C1991e.d(c2733i.d());
            float b5 = C1991e.b(c2733i.d());
            v3.e eVar = c2733i.f21647k.f17540l;
            long A3 = eVar.A();
            eVar.v().k();
            ((v3.e) ((C2023c) eVar.f20432l).f17544l).v().f(0.0f, 0.0f, d5, b5, 1);
            AbstractC0467k.h(c2733i, b3, f, 0L, 124);
            eVar.v().j();
            eVar.P(A3);
        }
    }

    public ViewParent e(int i) {
        if (i == 0) {
            return (ViewParent) this.f133b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.f134c;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [i4.a, kotlin.jvm.internal.m] */
    public void f(InterfaceC2653i interfaceC2653i, InterfaceC2280u interfaceC2280u) {
        boolean z3 = interfaceC2653i instanceof C2651g;
        ArrayList arrayList = (ArrayList) this.f135d;
        if (z3) {
            arrayList.add(interfaceC2653i);
        } else if (interfaceC2653i instanceof C2652h) {
            arrayList.remove(((C2652h) interfaceC2653i).f21122a);
        } else if (interfaceC2653i instanceof C2648d) {
            arrayList.add(interfaceC2653i);
        } else if (interfaceC2653i instanceof C2649e) {
            arrayList.remove(((C2649e) interfaceC2653i).f21118a);
        } else if (interfaceC2653i instanceof C2646b) {
            arrayList.add(interfaceC2653i);
        } else if (interfaceC2653i instanceof C2647c) {
            arrayList.remove(((C2647c) interfaceC2653i).f21117a);
        } else if (!(interfaceC2653i instanceof C2645a)) {
            return;
        } else {
            arrayList.remove(((C2645a) interfaceC2653i).f21116a);
        }
        InterfaceC2653i interfaceC2653i2 = (InterfaceC2653i) X3.m.f0(arrayList);
        if (kotlin.jvm.internal.l.a((InterfaceC2653i) this.f136e, interfaceC2653i2)) {
            return;
        }
        if (interfaceC2653i2 != null) {
            L.h hVar = (L.h) ((kotlin.jvm.internal.m) this.f133b).invoke();
            float f = z3 ? hVar.f2938c : interfaceC2653i instanceof C2648d ? hVar.f2937b : interfaceC2653i instanceof C2646b ? hVar.f2936a : 0.0f;
            z0 z0Var = L.u.f2978a;
            boolean z5 = interfaceC2653i2 instanceof C2651g;
            z0 z0Var2 = L.u.f2978a;
            if (!z5) {
                if (interfaceC2653i2 instanceof C2648d) {
                    z0Var2 = new z0(45, 0, AbstractC2478z.f19971b);
                } else if (interfaceC2653i2 instanceof C2646b) {
                    z0Var2 = new z0(45, 0, AbstractC2478z.f19971b);
                }
            }
            AbstractC2282w.p(interfaceC2280u, null, new L.B(this, f, z0Var2, null), 3);
        } else {
            InterfaceC2653i interfaceC2653i3 = (InterfaceC2653i) this.f136e;
            z0 z0Var3 = L.u.f2978a;
            boolean z6 = interfaceC2653i3 instanceof C2651g;
            z0 z0Var4 = L.u.f2978a;
            if (!z6 && !(interfaceC2653i3 instanceof C2648d) && (interfaceC2653i3 instanceof C2646b)) {
                z0Var4 = new z0(150, 0, AbstractC2478z.f19971b);
            }
            AbstractC2282w.p(interfaceC2280u, null, new L.C(this, z0Var4, null), 3);
        }
        this.f136e = interfaceC2653i2;
    }

    public D4.g g(y4.z zVar) {
        D4.d dVar = (D4.d) this.f135d;
        try {
            String b3 = y4.z.b("Content-Type", zVar);
            long g5 = dVar.g(zVar);
            return new D4.g(b3, g5, N4.b.k(new C4.d(this, dVar.a(zVar), g5)), 0);
        } catch (IOException e3) {
            kotlin.jvm.internal.l.f("call", (C4.i) this.f133b);
            j(e3);
            throw e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int h(G.v vVar, A0.F f, boolean z3) {
        Object[] objArr;
        C2407d c2407d;
        int i;
        int i5;
        C2760q c2760q = (C2760q) this.f136e;
        if (this.f132a) {
            return 0;
        }
        try {
            this.f132a = true;
            D3.l g5 = ((C2138i) this.f135d).g(vVar, f);
            C2338p c2338p = (C2338p) g5.f962m;
            int j5 = c2338p.j();
            for (int i6 = 0; i6 < j5; i6++) {
                t0.s sVar = (t0.s) c2338p.k(i6);
                if (!sVar.f19503d && !sVar.f19506h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int j6 = c2338p.j();
            int i7 = 0;
            while (true) {
                c2407d = (C2407d) this.f134c;
                if (i7 >= j6) {
                    break;
                }
                t0.s sVar2 = (t0.s) c2338p.k(i7);
                if (objArr != false || t0.q.a(sVar2)) {
                    ((C2731G) this.f133b).A(sVar2.f19502c, (C2760q) this.f136e, sVar2.i, true);
                    if (!c2760q.f21850k.g()) {
                        c2407d.a(sVar2.f19500a, c2760q, t0.q.a(sVar2));
                        c2760q.clear();
                    }
                }
                i7++;
            }
            boolean b3 = c2407d.b(g5, z3);
            if (!g5.f961l) {
                int j7 = c2338p.j();
                for (int i8 = 0; i8 < j7; i8++) {
                    t0.s sVar3 = (t0.s) c2338p.k(i8);
                    if (!C1988b.b(t0.q.e(sVar3, true), 0L) && sVar3.b()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int j8 = c2338p.j();
            int i9 = 0;
            while (true) {
                if (i9 >= j8) {
                    i5 = 0;
                    break;
                }
                if (((t0.s) c2338p.k(i9)).b()) {
                    i5 = 1;
                    break;
                }
                i9++;
            }
            int i10 = (b3 ? 1 : 0) | (i << 1) | (i5 << 2);
            this.f132a = false;
            return i10;
        } catch (Throwable th) {
            this.f132a = false;
            throw th;
        }
    }

    public y4.y i(boolean z3) {
        try {
            y4.y f = ((D4.d) this.f135d).f(z3);
            if (f != null) {
                f.f21447m = this;
            }
            return f;
        } catch (IOException e3) {
            kotlin.jvm.internal.l.f("call", (C4.i) this.f133b);
            j(e3);
            throw e3;
        }
    }

    public void j(IOException iOException) {
        this.f132a = true;
        ((C4.e) this.f134c).c(iOException);
        C4.k h3 = ((D4.d) this.f135d).h();
        C4.i iVar = (C4.i) this.f133b;
        synchronized (h3) {
            try {
                kotlin.jvm.internal.l.f("call", iVar);
                if (!(iOException instanceof F4.C)) {
                    if (!(h3.f896g != null) || (iOException instanceof C0121a)) {
                        h3.f898j = true;
                        if (h3.f901m == 0) {
                            C4.k.d(iVar.f876k, h3.f892b, iOException);
                            h3.f900l++;
                        }
                    }
                } else if (((F4.C) iOException).f1567k == 8) {
                    int i = h3.f902n + 1;
                    h3.f902n = i;
                    if (i > 1) {
                        h3.f898j = true;
                        h3.f900l++;
                    }
                } else if (((F4.C) iOException).f1567k != 9 || !iVar.f888w) {
                    h3.f898j = true;
                    h3.f900l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(int i, int i5) {
        if (i < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
        ((C0299j0) this.f133b).i(i);
        B.v vVar = (B.v) this.f136e;
        if (i != vVar.f717l) {
            vVar.f717l = i;
            int i6 = (i / 30) * 30;
            vVar.f716k.setValue(AbstractC0444a.f0(Math.max(i6 - 100, 0), i6 + 130));
        }
        ((C0299j0) this.f134c).i(i5);
    }
}
