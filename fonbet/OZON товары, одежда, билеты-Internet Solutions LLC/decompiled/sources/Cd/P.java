package Cd;

import java.util.HashSet;
import java.util.LinkedHashMap;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9830V;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.c0;

/* loaded from: classes10.dex */
public final class P {
    public static final boolean a(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return c(c0Var) != null;
    }

    public static final String b(@NotNull InterfaceC9857w callableMemberDescriptor) {
        InterfaceC9836b l11;
        LinkedHashMap linkedHashMap;
        Sd.f fVar;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC9836b c11 = qd.m.V(callableMemberDescriptor) ? c(callableMemberDescriptor) : null;
        if (c11 != null && (l11 = Zd.e.l(c11)) != null) {
            if (l11 instanceof InterfaceC9831W) {
                Intrinsics.checkNotNullParameter(l11, "<this>");
                qd.m.V(l11);
                InterfaceC9836b b11 = Zd.e.b(Zd.e.l(l11), C2750k.f4763a);
                if (b11 != null && (fVar = (Sd.f) C2748i.a().get(Zd.e.g(b11))) != null) {
                    return fVar.b();
                }
            } else if (l11 instanceof c0) {
                int i11 = C2744e.f4754m;
                c0 functionDescriptor = (c0) l11;
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                linkedHashMap = Q.f4741i;
                String b12 = Ld.D.b(functionDescriptor);
                Sd.f fVar2 = b12 == null ? null : (Sd.f) linkedHashMap.get(b12);
                if (fVar2 != null) {
                    return fVar2.b();
                }
            }
        }
        return null;
    }

    public static final <T extends InterfaceC9836b> T c(@NotNull T t2) {
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(t2, "<this>");
        hashSet = Q.f4742j;
        if (!hashSet.contains(t2.getName()) && !C2748i.d().contains(Zd.e.l(t2).getName())) {
            return null;
        }
        if ((t2 instanceof InterfaceC9831W) || (t2 instanceof InterfaceC9830V)) {
            return (T) Zd.e.b(t2, M.f4730a);
        }
        if (t2 instanceof c0) {
            return (T) Zd.e.b(t2, N.f4731a);
        }
        return null;
    }

    public static final <T extends InterfaceC9836b> T d(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        T t11 = (T) c(t2);
        if (t11 != null) {
            return t11;
        }
        int i11 = C2747h.f4757m;
        Sd.f name = t2.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C2747h.j(name)) {
            return (T) Zd.e.b(t2, O.f4732a);
        }
        return null;
    }

    public static final boolean e(@NotNull InterfaceC9839e interfaceC9839e, @NotNull InterfaceC9836b specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(interfaceC9839e, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC9845k d11 = specialCallableDescriptor.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Y q11 = ((InterfaceC9839e) d11).q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        for (InterfaceC9839e o11 = Vd.i.o(interfaceC9839e); o11 != null; o11 = Vd.i.o(o11)) {
            if (!(o11 instanceof Ed.c) && ke.x.b(o11.q(), q11) != null) {
                return !qd.m.V(o11);
            }
        }
        return false;
    }
}
