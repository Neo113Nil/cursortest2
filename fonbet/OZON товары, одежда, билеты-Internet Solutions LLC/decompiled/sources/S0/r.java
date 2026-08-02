package S0;

import S0.C3988v;
import S0.InterfaceC3967k;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C3983s0 f25510a = new C3983s0("provider");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3983s0 f25511b = new C3983s0("provider");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C3983s0 f25512c = new C3983s0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C3983s0 f25513d = new C3983s0("providers");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C3983s0 f25514e = new C3983s0("reference");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C3979q f25515f = new C3979q();

    public static final ArrayList a(C3945c c3945c, C3947c1 c3947c1) {
        ArrayList arrayList = new ArrayList();
        C3944b1 x11 = c3947c1.x();
        try {
            i(x11, arrayList, c3947c1.c(c3945c));
            Unit unit = Unit.f71690a;
            return arrayList;
        } finally {
            x11.c();
        }
    }

    public static final ArrayList b(ArrayList arrayList, int i11, int i12) {
        ArrayList arrayList2 = new ArrayList();
        int m11 = m(i11, arrayList);
        if (m11 < 0) {
            m11 = -(m11 + 1);
        }
        while (m11 < arrayList.size()) {
            X x11 = (X) arrayList.get(m11);
            if (x11.b() >= i12) {
                break;
            }
            arrayList2.add(x11);
            m11++;
        }
        return arrayList2;
    }

    public static final X c(ArrayList arrayList, int i11, int i12) {
        int m11 = m(i11, arrayList);
        if (m11 < 0) {
            m11 = -(m11 + 1);
        }
        if (m11 >= arrayList.size()) {
            return null;
        }
        X x11 = (X) arrayList.get(m11);
        if (x11.b() < i12) {
            return x11;
        }
        return null;
    }

    public static final void f(ArrayList arrayList, int i11, J0 j02, Object obj) {
        int m11 = m(i11, arrayList);
        if (m11 < 0) {
            int i12 = -(m11 + 1);
            if (!(obj instanceof J)) {
                obj = null;
            }
            arrayList.add(i12, new X(j02, i11, obj));
            return;
        }
        X x11 = (X) arrayList.get(m11);
        if (!(obj instanceof J)) {
            x11.e(null);
            return;
        }
        Object a11 = x11.a();
        if (a11 == null) {
            x11.e(obj);
            return;
        }
        if (a11 instanceof androidx.collection.M) {
            ((androidx.collection.M) a11).d(obj);
            return;
        }
        int i13 = androidx.collection.Y.f38668a;
        androidx.collection.M m12 = new androidx.collection.M(2);
        m12.k(a11);
        m12.k(obj);
        x11.e(m12);
    }

    public static final X g(int i11, ArrayList arrayList) {
        int m11 = m(i11, arrayList);
        if (m11 >= 0) {
            return (X) arrayList.remove(m11);
        }
        return null;
    }

    public static final void h(ArrayList arrayList, int i11, int i12) {
        int m11 = m(i11, arrayList);
        if (m11 < 0) {
            m11 = -(m11 + 1);
        }
        while (m11 < arrayList.size() && ((X) arrayList.get(m11)).b() < i12) {
            arrayList.remove(m11);
        }
    }

    private static final void i(C3944b1 c3944b1, ArrayList arrayList, int i11) {
        if (c3944b1.I(i11)) {
            arrayList.add(c3944b1.K(i11));
            return;
        }
        int i12 = i11 + 1;
        int D11 = c3944b1.D(i11) + i11;
        while (i12 < D11) {
            i(c3944b1, arrayList, i12);
            i12 += c3944b1.D(i12);
        }
    }

    public static final void j(@NotNull String str) {
        throw new C3965j(B0.A0.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final void k(@NotNull String str) {
        throw new C3965j(B0.A0.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void l(@NotNull C3953e1 c3953e1, @NotNull U0 u02) {
        int b02;
        int I02;
        int b03;
        int K11;
        int i11;
        int i12;
        int U10 = c3953e1.U();
        int V11 = c3953e1.V();
        while (U10 < V11) {
            Object t02 = c3953e1.t0(U10);
            if (t02 instanceof InterfaceC3963i) {
                ((C3988v.a) u02).d((InterfaceC3963i) t02, c3953e1.Y() - c3953e1.M0(U10));
            }
            b02 = c3953e1.b0(U10);
            I02 = c3953e1.I0(c3953e1.f25379b, b02);
            int[] iArr = c3953e1.f25379b;
            int i13 = U10 + 1;
            b03 = c3953e1.b0(i13);
            int J11 = c3953e1.J(iArr, b03);
            for (int i14 = I02; i14 < J11; i14++) {
                int i15 = i14 - I02;
                Object[] objArr = c3953e1.f25380c;
                K11 = c3953e1.K(i14);
                Object obj = objArr[K11];
                if (obj instanceof W0) {
                    W0 w02 = (W0) obj;
                    V0 b11 = w02.b();
                    if (b11 instanceof Y0) {
                        continue;
                    } else {
                        if (obj != c3953e1.D0(U10, i15, InterfaceC3967k.a.a())) {
                            j("Slot table is out of sync");
                            throw null;
                        }
                        int Y11 = c3953e1.Y() - i15;
                        C3945c a11 = w02.a();
                        if (a11 == null || !a11.b()) {
                            i11 = -1;
                            i12 = -1;
                        } else {
                            i11 = c3953e1.F(a11);
                            i12 = c3953e1.Y() - c3953e1.K0(i11);
                        }
                        ((C3988v.a) u02).c(b11, Y11, i11, i12);
                    }
                } else if (!(obj instanceof J0)) {
                    continue;
                } else {
                    if (obj != c3953e1.D0(U10, i15, InterfaceC3967k.a.a())) {
                        j("Slot table is out of sync");
                        throw null;
                    }
                    ((J0) obj).v();
                }
            }
            U10 = i13;
        }
    }

    private static final int m(int i11, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = Intrinsics.i(((X) arrayList.get(i13)).b(), i11);
            if (i14 < 0) {
                i12 = i13 + 1;
            } else {
                if (i14 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    @NotNull
    public static final C3983s0 n() {
        return f25512c;
    }

    @NotNull
    public static final C3983s0 o() {
        return f25510a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(Object obj, Object obj2, Integer num) {
        Z z11 = obj instanceof Z ? (Z) obj : null;
        if (z11 == null) {
            return null;
        }
        if (Intrinsics.d(z11.a(), obj2) && Intrinsics.d(z11.b(), num)) {
            return obj;
        }
        Object p11 = p(z11.a(), obj2, num);
        return p11 == null ? p(z11.b(), obj2, num) : p11;
    }

    @NotNull
    public static final C3983s0 q() {
        return f25511b;
    }

    @NotNull
    public static final C3983s0 r() {
        return f25513d;
    }

    @NotNull
    public static final C3983s0 s() {
        return f25514e;
    }

    public static final void t(@NotNull C3953e1 c3953e1, @NotNull U0 u02) {
        int b02;
        int b03;
        int K11;
        int i11;
        int i12;
        b02 = c3953e1.b0(c3953e1.U());
        int[] iArr = c3953e1.f25379b;
        b03 = c3953e1.b0(c3953e1.e0(c3953e1.U()) + c3953e1.U());
        int J11 = c3953e1.J(iArr, b03);
        for (int J12 = c3953e1.J(c3953e1.f25379b, b02); J12 < J11; J12++) {
            Object[] objArr = c3953e1.f25380c;
            K11 = c3953e1.K(J12);
            Object obj = objArr[K11];
            if (obj instanceof InterfaceC3963i) {
                ((C3988v.a) u02).j((InterfaceC3963i) obj, c3953e1.Y() - J12);
            }
            if (obj instanceof W0) {
                int Y11 = c3953e1.Y() - J12;
                W0 w02 = (W0) obj;
                C3945c a11 = w02.a();
                if (a11 == null || !a11.b()) {
                    i11 = -1;
                    i12 = -1;
                } else {
                    i11 = c3953e1.F(a11);
                    i12 = c3953e1.Y() - c3953e1.K0(i11);
                }
                ((C3988v.a) u02).c(w02.b(), Y11, i11, i12);
            }
            if (obj instanceof J0) {
                ((J0) obj).v();
            }
        }
        c3953e1.z0();
    }

    public static final void u(boolean z11) {
        if (z11) {
            return;
        }
        j("Check failed");
        throw null;
    }
}
