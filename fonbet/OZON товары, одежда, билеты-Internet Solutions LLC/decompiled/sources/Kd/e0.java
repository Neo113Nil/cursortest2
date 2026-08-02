package Kd;

import Cd.C2752m;
import Cd.EnumC2741b;
import Ed.InterfaceC2966a;
import Gd.C3074d;
import Gd.C3080j;
import Gd.C3085o;
import Jd.InterfaceC3391a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.H0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.C9851q;
import td.InterfaceC9831W;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.p0;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public final class e0 {
    private final je.N a(InterfaceC2966a interfaceC2966a, InterfaceC9835a interfaceC9835a, boolean z11, Fd.k kVar, EnumC2741b enumC2741b, j0 j0Var, boolean z12, Function1 function1) {
        g0 g0Var = new g0(interfaceC9835a, z11, kVar, enumC2741b);
        je.N n11 = (je.N) function1.invoke(interfaceC2966a);
        Collection<? extends InterfaceC9836b> o11 = interfaceC2966a.o();
        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC9836b> collection = o11;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        for (InterfaceC9836b interfaceC9836b : collection) {
            Intrinsics.f(interfaceC9836b);
            arrayList.add((je.N) function1.invoke(interfaceC9836b));
        }
        return C3510g.a(n11, g0Var.a(n11, arrayList, j0Var, z12), g0Var.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0253  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(@NotNull Fd.k c11, @NotNull Collection platformSignatures) {
        InterfaceC10030h annotations;
        InterfaceC9835a interfaceC9835a;
        je.N n11;
        Y y11;
        boolean z11;
        InterfaceC2966a interfaceC2966a;
        je.N a11;
        je.N returnType;
        d0 d0Var;
        boolean z12;
        int i11;
        Iterator it;
        boolean z13;
        je.N type;
        Fd.k c12;
        List<j0> b11;
        String a12;
        Fd.k c13;
        wd.Q q11;
        wd.S K02;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<InterfaceC9836b> collection = platformSignatures;
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        for (InterfaceC9836b interfaceC9836b : collection) {
            if (interfaceC9836b instanceof InterfaceC2966a) {
                boolean z14 = true;
                if (interfaceC9836b.getKind() != InterfaceC9836b.a.FAKE_OVERRIDE || interfaceC9836b.n0().o().size() != 1) {
                    InterfaceC9842h a13 = C9851q.a(interfaceC9836b);
                    if (a13 == null) {
                        annotations = interfaceC9836b.getAnnotations();
                    } else {
                        C3085o c3085o = a13 instanceof C3085o ? (C3085o) a13 : null;
                        List<InterfaceC3391a> N02 = c3085o != null ? c3085o.N0() : null;
                        List<InterfaceC3391a> list = N02;
                        if (list == null || list.isEmpty()) {
                            annotations = interfaceC9836b.getAnnotations();
                        } else {
                            List<InterfaceC3391a> list2 = N02;
                            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, i12));
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new C3080j(c11, (InterfaceC3391a) it2.next(), true));
                            }
                            annotations = InterfaceC10030h.a.a(C7714v.n0(interfaceC9836b.getAnnotations(), arrayList2));
                        }
                    }
                    Fd.k c14 = Fd.c.c(c11, annotations);
                    if (!(interfaceC9836b instanceof Ed.f) || (K02 = (q11 = (wd.Q) interfaceC9836b).K0()) == null || K02.G0()) {
                        interfaceC9835a = interfaceC9836b;
                    } else {
                        InterfaceC9835a K03 = q11.K0();
                        Intrinsics.f(K03);
                        interfaceC9835a = K03;
                    }
                    if (interfaceC9836b.d0() != null) {
                        InterfaceC9857w interfaceC9857w = interfaceC9835a instanceof InterfaceC9857w ? (InterfaceC9857w) interfaceC9835a : null;
                        InterfaceC9835a interfaceC9835a2 = interfaceC9857w != null ? (p0) interfaceC9857w.P(Ed.e.f7838G) : null;
                        n11 = a((InterfaceC2966a) interfaceC9836b, interfaceC9835a2, false, (interfaceC9835a2 == null || (c13 = Fd.c.c(c14, interfaceC9835a2.getAnnotations())) == null) ? c14 : c13, EnumC2741b.VALUE_PARAMETER, null, false, Z.f15875a);
                    } else {
                        n11 = null;
                    }
                    Ed.e eVar = interfaceC9836b instanceof Ed.e ? (Ed.e) interfaceC9836b : null;
                    if (eVar != null) {
                        InterfaceC9845k d11 = eVar.d();
                        Intrinsics.g(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String a14 = Ld.C.a((InterfaceC9839e) d11, Ld.D.a(eVar, 3));
                        if (a14 != null && (y11 = (Y) X.K().get(a14)) != null) {
                            if (y11.a() != null && ((a12 = y11.a()) == null || !kotlin.text.h.e0(a12, "2.", false))) {
                                throw new IllegalStateException("Check failed.");
                            }
                            if (y11.a() != null) {
                                y11 = y11.d();
                            }
                            if (y11 != null) {
                                y11.b().size();
                                ((Ed.e) interfaceC9836b).f().size();
                            }
                            if (Cd.S.c(c11.a().i())) {
                                c14.a().q().getClass();
                            } else if (Cd.S.b((InterfaceC2966a) interfaceC9836b)) {
                                z11 = true;
                                List<p0> f7 = interfaceC9835a.f();
                                String str = "getValueParameters(...)";
                                Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                                List<p0> list3 = f7;
                                ArrayList arrayList3 = new ArrayList(C7714v.z(list3, i12));
                                for (p0 p0Var : list3) {
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList4.add(a((InterfaceC2966a) interfaceC9836b, p0Var, false, (p0Var == null || (c12 = Fd.c.c(c14, p0Var.getAnnotations())) == null) ? c14 : c12, EnumC2741b.VALUE_PARAMETER, (y11 == null || (b11 = y11.b()) == null) ? null : (j0) C7714v.Q(p0Var.getIndex(), b11), z11, new a0(p0Var)));
                                    str = str;
                                    arrayList3 = arrayList4;
                                }
                                String str2 = str;
                                ArrayList arrayList5 = arrayList3;
                                InterfaceC9831W interfaceC9831W = interfaceC9836b instanceof InterfaceC9831W ? (InterfaceC9831W) interfaceC9836b : null;
                                EnumC2741b enumC2741b = (interfaceC9831W == null && C3074d.a(interfaceC9831W)) ? EnumC2741b.FIELD : EnumC2741b.METHOD_RETURN_TYPE;
                                interfaceC2966a = (InterfaceC2966a) interfaceC9836b;
                                a11 = a(interfaceC2966a, interfaceC9835a, true, c14, enumC2741b, y11 != null ? y11.c() : null, false, b0.f15881a);
                                returnType = interfaceC9836b.getReturnType();
                                Intrinsics.f(returnType);
                                d0Var = d0.f15887a;
                                if (!H0.c(returnType, d0Var)) {
                                    InterfaceC9834Z d02 = interfaceC9836b.d0();
                                    if (!((d02 == null || (type = d02.getType()) == null) ? false : H0.c(type, d0Var))) {
                                        List<p0> f11 = interfaceC9836b.f();
                                        Intrinsics.checkNotNullExpressionValue(f11, str2);
                                        List<p0> list4 = f11;
                                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                            Iterator<T> it3 = list4.iterator();
                                            while (it3.hasNext()) {
                                                je.N type2 = ((p0) it3.next()).getType();
                                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                                if (H0.c(type2, d0Var)) {
                                                    z13 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z13 = false;
                                        if (!z13) {
                                            z12 = false;
                                            Pair pair = !z12 ? new Pair(Yd.c.a(), new C2752m(interfaceC2966a)) : null;
                                            if (n11 == null && a11 == null) {
                                                if (!arrayList5.isEmpty()) {
                                                    Iterator it4 = arrayList5.iterator();
                                                    while (it4.hasNext()) {
                                                        if (((je.N) it4.next()) != null) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                z14 = false;
                                                if (!z14 && pair == null) {
                                                    i11 = 10;
                                                    arrayList.add(interfaceC9836b);
                                                    i12 = i11;
                                                }
                                            }
                                            InterfaceC2966a interfaceC2966a2 = (InterfaceC2966a) interfaceC9836b;
                                            if (n11 == null) {
                                                InterfaceC9834Z d03 = interfaceC9836b.d0();
                                                n11 = d03 != null ? d03.getType() : null;
                                            }
                                            i11 = 10;
                                            ArrayList arrayList6 = new ArrayList(C7714v.z(arrayList5, 10));
                                            it = arrayList5.iterator();
                                            int i13 = 0;
                                            while (it.hasNext()) {
                                                Object next = it.next();
                                                int i14 = i13 + 1;
                                                if (i13 < 0) {
                                                    C7714v.O0();
                                                    throw null;
                                                }
                                                je.N n12 = (je.N) next;
                                                if (n12 == null) {
                                                    n12 = interfaceC9836b.f().get(i13).getType();
                                                    Intrinsics.checkNotNullExpressionValue(n12, "getType(...)");
                                                }
                                                arrayList6.add(n12);
                                                i13 = i14;
                                            }
                                            if (a11 == null) {
                                                a11 = interfaceC9836b.getReturnType();
                                                Intrinsics.f(a11);
                                            }
                                            interfaceC9836b = interfaceC2966a2.G(n11, arrayList6, a11, pair);
                                            arrayList.add(interfaceC9836b);
                                            i12 = i11;
                                        }
                                    }
                                }
                                z12 = true;
                                if (!z12) {
                                }
                                if (n11 == null) {
                                    if (!arrayList5.isEmpty()) {
                                    }
                                    z14 = false;
                                    if (!z14) {
                                        i11 = 10;
                                        arrayList.add(interfaceC9836b);
                                        i12 = i11;
                                    }
                                }
                                InterfaceC2966a interfaceC2966a22 = (InterfaceC2966a) interfaceC9836b;
                                if (n11 == null) {
                                }
                                i11 = 10;
                                ArrayList arrayList62 = new ArrayList(C7714v.z(arrayList5, 10));
                                it = arrayList5.iterator();
                                int i132 = 0;
                                while (it.hasNext()) {
                                }
                                if (a11 == null) {
                                }
                                interfaceC9836b = interfaceC2966a22.G(n11, arrayList62, a11, pair);
                                arrayList.add(interfaceC9836b);
                                i12 = i11;
                            }
                            z11 = false;
                            List<p0> f72 = interfaceC9835a.f();
                            String str3 = "getValueParameters(...)";
                            Intrinsics.checkNotNullExpressionValue(f72, "getValueParameters(...)");
                            List<p0> list32 = f72;
                            ArrayList arrayList32 = new ArrayList(C7714v.z(list32, i12));
                            while (r11.hasNext()) {
                            }
                            String str22 = str3;
                            ArrayList arrayList52 = arrayList32;
                            if (interfaceC9836b instanceof InterfaceC9831W) {
                            }
                            EnumC2741b enumC2741b2 = (interfaceC9831W == null && C3074d.a(interfaceC9831W)) ? EnumC2741b.FIELD : EnumC2741b.METHOD_RETURN_TYPE;
                            interfaceC2966a = (InterfaceC2966a) interfaceC9836b;
                            a11 = a(interfaceC2966a, interfaceC9835a, true, c14, enumC2741b2, y11 != null ? y11.c() : null, false, b0.f15881a);
                            returnType = interfaceC9836b.getReturnType();
                            Intrinsics.f(returnType);
                            d0Var = d0.f15887a;
                            if (!H0.c(returnType, d0Var)) {
                            }
                            z12 = true;
                            if (!z12) {
                            }
                            if (n11 == null) {
                            }
                            InterfaceC2966a interfaceC2966a222 = (InterfaceC2966a) interfaceC9836b;
                            if (n11 == null) {
                            }
                            i11 = 10;
                            ArrayList arrayList622 = new ArrayList(C7714v.z(arrayList52, 10));
                            it = arrayList52.iterator();
                            int i1322 = 0;
                            while (it.hasNext()) {
                            }
                            if (a11 == null) {
                            }
                            interfaceC9836b = interfaceC2966a222.G(n11, arrayList622, a11, pair);
                            arrayList.add(interfaceC9836b);
                            i12 = i11;
                        }
                    }
                    y11 = null;
                    if (y11 != null) {
                    }
                    if (Cd.S.c(c11.a().i())) {
                    }
                    z11 = false;
                    List<p0> f722 = interfaceC9835a.f();
                    String str32 = "getValueParameters(...)";
                    Intrinsics.checkNotNullExpressionValue(f722, "getValueParameters(...)");
                    List<p0> list322 = f722;
                    ArrayList arrayList322 = new ArrayList(C7714v.z(list322, i12));
                    while (r11.hasNext()) {
                    }
                    String str222 = str32;
                    ArrayList arrayList522 = arrayList322;
                    if (interfaceC9836b instanceof InterfaceC9831W) {
                    }
                    EnumC2741b enumC2741b22 = (interfaceC9831W == null && C3074d.a(interfaceC9831W)) ? EnumC2741b.FIELD : EnumC2741b.METHOD_RETURN_TYPE;
                    interfaceC2966a = (InterfaceC2966a) interfaceC9836b;
                    a11 = a(interfaceC2966a, interfaceC9835a, true, c14, enumC2741b22, y11 != null ? y11.c() : null, false, b0.f15881a);
                    returnType = interfaceC9836b.getReturnType();
                    Intrinsics.f(returnType);
                    d0Var = d0.f15887a;
                    if (!H0.c(returnType, d0Var)) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (n11 == null) {
                    }
                    InterfaceC2966a interfaceC2966a2222 = (InterfaceC2966a) interfaceC9836b;
                    if (n11 == null) {
                    }
                    i11 = 10;
                    ArrayList arrayList6222 = new ArrayList(C7714v.z(arrayList522, 10));
                    it = arrayList522.iterator();
                    int i13222 = 0;
                    while (it.hasNext()) {
                    }
                    if (a11 == null) {
                    }
                    interfaceC9836b = interfaceC2966a2222.G(n11, arrayList6222, a11, pair);
                    arrayList.add(interfaceC9836b);
                    i12 = i11;
                }
            }
            i11 = i12;
            arrayList.add(interfaceC9836b);
            i12 = i11;
        }
        return arrayList;
    }

    @NotNull
    public final je.N c(@NotNull je.N type, @NotNull Fd.k context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        g0 g0Var = new g0(null, false, context, EnumC2741b.TYPE_USE, true);
        je.N a11 = C3510g.a(type, g0Var.a(type, kotlin.collections.K.f71697a, null, false), g0Var.k());
        return a11 == null ? type : a11;
    }

    @NotNull
    public final ArrayList d(@NotNull Gd.f0 typeParameter, @NotNull List bounds, @NotNull Fd.k context) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<je.N> list = bounds;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (je.N n11 : list) {
            if (!C8701c.b(n11, c0.f15883a)) {
                g0 g0Var = new g0(typeParameter, false, context, EnumC2741b.TYPE_PARAMETER_BOUNDS);
                je.N a11 = C3510g.a(n11, g0Var.a(n11, kotlin.collections.K.f71697a, null, false), g0Var.k());
                if (a11 != null) {
                    n11 = a11;
                }
            }
            arrayList.add(n11);
        }
        return arrayList;
    }
}
