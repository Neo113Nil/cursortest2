package Ed;

import Vd.i;
import ce.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.N;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.m;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9857w;
import td.d0;
import td.p0;
import ud.InterfaceC10030h;
import wd.c0;

/* loaded from: classes10.dex */
public final class h {
    @NotNull
    public static final ArrayList a(@NotNull List newValueParameterTypes, @NotNull Collection oldValueParameters, @NotNull InterfaceC9857w interfaceC9857w) {
        Intrinsics.checkNotNullParameter(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(oldValueParameters, "oldValueParameters");
        InterfaceC9857w newOwner = interfaceC9857w;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        ArrayList b12 = C7714v.b1(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(C7714v.z(b12, 10));
        Iterator it = b12.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            N n11 = (N) pair.a();
            p0 p0Var = (p0) pair.b();
            int index = p0Var.getIndex();
            InterfaceC10030h annotations = p0Var.getAnnotations();
            Sd.f name = p0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            boolean R11 = p0Var.R();
            boolean u02 = p0Var.u0();
            boolean t02 = p0Var.t0();
            N k11 = p0Var.x0() != null ? Zd.e.j(newOwner).n().k(n11) : null;
            d0 e11 = p0Var.e();
            Intrinsics.checkNotNullExpressionValue(e11, "getSource(...)");
            arrayList.add(new c0(newOwner, null, index, annotations, name, n11, R11, u02, t02, k11, e11));
            newOwner = interfaceC9857w;
        }
        return arrayList;
    }

    public static final Gd.d0 b(@NotNull InterfaceC9839e interfaceC9839e) {
        InterfaceC9839e interfaceC9839e2;
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        int i11 = Zd.e.f35896a;
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        Iterator<N> it = interfaceC9839e.q().H0().o().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC9839e2 = null;
                break;
            }
            N next = it.next();
            if (!m.R(next)) {
                InterfaceC9842h p11 = next.H0().p();
                if (i.r(p11)) {
                    Intrinsics.g(p11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC9839e2 = (InterfaceC9839e) p11;
                    break;
                }
            }
        }
        if (interfaceC9839e2 == null) {
            return null;
        }
        l q02 = interfaceC9839e2.q0();
        Gd.d0 d0Var = q02 instanceof Gd.d0 ? (Gd.d0) q02 : null;
        return d0Var == null ? b(interfaceC9839e2) : d0Var;
    }
}
