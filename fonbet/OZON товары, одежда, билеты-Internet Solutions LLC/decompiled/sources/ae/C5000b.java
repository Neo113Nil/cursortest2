package ae;

import Vd.i;
import Vd.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.N;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.s;
import td.C9852r;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9857w;
import td.i0;
import td.p0;

/* renamed from: ae.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5000b {
    private static final boolean a(N n11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 != null) {
            if (k.b(p11)) {
                Intrinsics.checkNotNullParameter(p11, "<this>");
                if (k.f(p11) && !Zd.e.g((InterfaceC9839e) p11).equals(s.f81861h)) {
                    return true;
                }
            }
            if (k.h(n11)) {
                return true;
            }
        }
        InterfaceC9842h p12 = n11.H0().p();
        i0 i0Var = p12 instanceof i0 ? (i0) p12 : null;
        return i0Var != null && a(C8701c.i(i0Var));
    }

    public static final boolean b(@NotNull InterfaceC9857w descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        InterfaceC9838d interfaceC9838d = descriptor instanceof InterfaceC9838d ? (InterfaceC9838d) descriptor : null;
        if (interfaceC9838d == null || C9852r.g(interfaceC9838d.getVisibility())) {
            return false;
        }
        InterfaceC9839e K11 = interfaceC9838d.K();
        Intrinsics.checkNotNullExpressionValue(K11, "getConstructedClass(...)");
        if (k.f(K11) || i.A(interfaceC9838d.K())) {
            return false;
        }
        List<p0> f7 = interfaceC9838d.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        List<p0> list = f7;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            N type = ((p0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (a(type)) {
                return true;
            }
        }
        return false;
    }
}
