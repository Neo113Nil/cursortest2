package Ld;

import Cd.C2747h;
import Ld.u;
import ae.EnumC5003e;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.Iterator;
import java.util.List;
import je.H0;
import je.N;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9839e;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.c0;
import td.p0;

/* loaded from: classes10.dex */
public final class D {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if ((r4 instanceof td.InterfaceC9832X) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(InterfaceC9857w descriptor, int i11) {
        String b11;
        boolean z11 = (i11 & 1) != 0;
        boolean z12 = (i11 & 2) != 0;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z12) {
            if (descriptor instanceof InterfaceC9844j) {
                b11 = "<init>";
            } else {
                b11 = descriptor.getName().b();
                Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            }
            sb2.append(b11);
        }
        sb2.append("(");
        InterfaceC9834Z d02 = descriptor.d0();
        if (d02 != null) {
            N type = d02.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(d(type));
        }
        Iterator<p0> it = descriptor.f().iterator();
        while (it.hasNext()) {
            N type2 = it.next().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            sb2.append(d(type2));
        }
        sb2.append(")");
        if (z11) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (!(descriptor instanceof InterfaceC9844j)) {
                N returnType = descriptor.getReturnType();
                Intrinsics.f(returnType);
                if (qd.m.l0(returnType)) {
                    N returnType2 = descriptor.getReturnType();
                    Intrinsics.f(returnType2);
                    if (!H0.g(returnType2)) {
                    }
                }
                N returnType3 = descriptor.getReturnType();
                Intrinsics.f(returnType3);
                sb2.append(d(returnType3));
            }
            sb2.append("V");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final String b(@NotNull InterfaceC9835a interfaceC9835a) {
        Intrinsics.checkNotNullParameter(interfaceC9835a, "<this>");
        if (!Vd.i.y(interfaceC9835a)) {
            InterfaceC9845k d11 = interfaceC9835a.d();
            InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
            if (interfaceC9839e != null && !interfaceC9839e.getName().g()) {
                InterfaceC9835a n02 = interfaceC9835a.n0();
                c0 c0Var = n02 instanceof c0 ? (c0) n02 : null;
                if (c0Var != null) {
                    return C.a(interfaceC9839e, a(c0Var, 3));
                }
            }
        }
        return null;
    }

    public static final boolean c(@NotNull InterfaceC9857w f7) {
        InterfaceC9857w i11;
        Intrinsics.checkNotNullParameter(f7, "f");
        if (f7 == null || !Intrinsics.d(f7.getName().b(), ProductAction.ACTION_REMOVE) || f7.f().size() != 1) {
            return false;
        }
        Intrinsics.checkNotNullParameter(f7, "<this>");
        Intrinsics.checkNotNullParameter(f7, "<this>");
        if ((Zd.e.l(f7).d() instanceof Ed.c) || qd.m.V(f7)) {
            return false;
        }
        List<p0> f11 = f7.n0().f();
        Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
        N type = ((p0) C7714v.B0(f11)).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        u d11 = d(type);
        u.c cVar = d11 instanceof u.c ? (u.c) d11 : null;
        if ((cVar != null ? cVar.i() : null) != EnumC5003e.INT || (i11 = C2747h.i(f7)) == null) {
            return false;
        }
        List<p0> f12 = i11.n0().f();
        Intrinsics.checkNotNullExpressionValue(f12, "getValueParameters(...)");
        N type2 = ((p0) C7714v.B0(f12)).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        u d12 = d(type2);
        InterfaceC9845k d13 = i11.d();
        Intrinsics.checkNotNullExpressionValue(d13, "getContainingDeclaration(...)");
        return Intrinsics.d(Zd.e.h(d13), s.a.f81881K.j()) && (d12 instanceof u.b) && Intrinsics.d(((u.b) d12).i(), "java/lang/Object");
    }

    @NotNull
    public static final u d(@NotNull N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        return (u) l.b(n11, I.f16743k, te.g.b());
    }
}
