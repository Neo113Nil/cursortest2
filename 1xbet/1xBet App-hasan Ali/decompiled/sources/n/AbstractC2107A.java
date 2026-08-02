package n;

import P.C0315s;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.ArrayList;
import java.util.List;
import t3.AbstractC2425d;
import x0.C2625k;
import x0.C2636w;
import x0.EnumC2633t;
import x0.EnumC2634u;
import x0.InterfaceC2632s;
import x0.InterfaceC2639z;
import z0.AbstractC2739O;
import z0.C2751h;
import z0.InterfaceC2765w;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2107A {
    public static /* synthetic */ boolean A(Object obj) {
        return obj != null;
    }

    public static b0.p B() {
        if (1.0f > 0.0d) {
            return new LayoutWeightElement(1.0f);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }

    public static b0.p C(b0.p pVar, float f) {
        if (f > 0.0d) {
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            return pVar.c(new LayoutWeightElement(f));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    public static int a(InterfaceC2639z interfaceC2639z, AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return interfaceC2639z.f(new C2636w(abstractC2739O, abstractC2739O.getLayoutDirection()), new C2625k(n5, x0.S.f20961l, x0.T.f20964l, 1), W0.b.b(i, 0, 13)).c();
    }

    public static int b(x0.O o5, InterfaceC2632s interfaceC2632s, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2625k((x0.N) list.get(i5), EnumC2633t.f21055l, EnumC2634u.f21058l, 0));
        }
        return o5.c(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), arrayList, W0.b.b(i, 0, 13)).c();
    }

    public static int c(InterfaceC2765w interfaceC2765w, InterfaceC2632s interfaceC2632s, x0.N n5, int i) {
        return interfaceC2765w.f(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), new C2625k(n5, z0.g0.f21819l, z0.h0.f21827l, 2), W0.b.b(i, 0, 13)).c();
    }

    public static int d(InterfaceC2639z interfaceC2639z, AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return interfaceC2639z.f(new C2636w(abstractC2739O, abstractC2739O.getLayoutDirection()), new C2625k(n5, x0.S.f20961l, x0.T.f20963k, 1), W0.b.b(0, i, 7)).getWidth();
    }

    public static int e(x0.O o5, InterfaceC2632s interfaceC2632s, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2625k((x0.N) list.get(i5), EnumC2633t.f21055l, EnumC2634u.f21057k, 0));
        }
        return o5.c(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), arrayList, W0.b.b(0, i, 7)).getWidth();
    }

    public static int f(InterfaceC2765w interfaceC2765w, InterfaceC2632s interfaceC2632s, x0.N n5, int i) {
        return interfaceC2765w.f(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), new C2625k(n5, z0.g0.f21819l, z0.h0.f21826k, 2), W0.b.b(0, i, 7)).getWidth();
    }

    public static int g(InterfaceC2639z interfaceC2639z, AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return interfaceC2639z.f(new C2636w(abstractC2739O, abstractC2739O.getLayoutDirection()), new C2625k(n5, x0.S.f20960k, x0.T.f20964l, 1), W0.b.b(i, 0, 13)).c();
    }

    public static int h(x0.O o5, InterfaceC2632s interfaceC2632s, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2625k((x0.N) list.get(i5), EnumC2633t.f21054k, EnumC2634u.f21058l, 0));
        }
        return o5.c(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), arrayList, W0.b.b(i, 0, 13)).c();
    }

    public static int i(InterfaceC2765w interfaceC2765w, InterfaceC2632s interfaceC2632s, x0.N n5, int i) {
        return interfaceC2765w.f(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), new C2625k(n5, z0.g0.f21818k, z0.h0.f21827l, 2), W0.b.b(i, 0, 13)).c();
    }

    public static int j(InterfaceC2639z interfaceC2639z, AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return interfaceC2639z.f(new C2636w(abstractC2739O, abstractC2739O.getLayoutDirection()), new C2625k(n5, x0.S.f20960k, x0.T.f20963k, 1), W0.b.b(0, i, 7)).getWidth();
    }

    public static int k(x0.O o5, InterfaceC2632s interfaceC2632s, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2625k((x0.N) list.get(i5), EnumC2633t.f21054k, EnumC2634u.f21057k, 0));
        }
        return o5.c(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), arrayList, W0.b.b(0, i, 7)).getWidth();
    }

    public static int l(InterfaceC2765w interfaceC2765w, InterfaceC2632s interfaceC2632s, x0.N n5, int i) {
        return interfaceC2765w.f(new C2636w(interfaceC2632s, interfaceC2632s.getLayoutDirection()), new C2625k(n5, z0.g0.f21818k, z0.h0.f21826k, 2), W0.b.b(0, i, 7)).getWidth();
    }

    public static int n(float f, int i, int i5) {
        return (Float.floatToIntBits(f) + i) * i5;
    }

    public static int o(int i, int i5, long j5) {
        return (i0.p.i(j5) + i) * i5;
    }

    public static ClassCastException p(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String q(String str, int i) {
        return str + i;
    }

    public static String r(String str, long j5) {
        return str + j5;
    }

    public static String s(StringBuilder sb, float f, char c5) {
        sb.append(f);
        sb.append(c5);
        return sb.toString();
    }

    public static String t(StringBuilder sb, int i, char c5) {
        sb.append(i);
        sb.append(c5);
        return sb.toString();
    }

    public static String u(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder v(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(String str, int i, String str2, int i5, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i5);
        sb.append(str3);
        return sb;
    }

    public static void x(int i, int i5, int i6, int i7, int i8) {
        AbstractC2425d.b(i);
        AbstractC2425d.b(i5);
        AbstractC2425d.b(i6);
        AbstractC2425d.b(i7);
        AbstractC2425d.b(i8);
    }

    public static void y(int i, C0315s c0315s, int i5, C2751h c2751h) {
        c0315s.i0(Integer.valueOf(i));
        c0315s.b(c2751h, Integer.valueOf(i5));
    }

    public static void z(long j5, StringBuilder sb, String str) {
        sb.append((Object) i0.p.j(j5));
        sb.append(str);
    }
}
