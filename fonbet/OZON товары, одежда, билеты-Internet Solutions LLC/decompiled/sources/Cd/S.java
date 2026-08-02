package Cd;

import Ed.InterfaceC2966a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.InterfaceC9857w;
import td.s0;
import ud.InterfaceC10025c;

/* loaded from: classes10.dex */
public final class S {
    public static final InterfaceC10025c a(@NotNull Fd.k c11, @NotNull Jd.B wildcardType) {
        InterfaceC10025c interfaceC10025c;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(wildcardType, "wildcardType");
        if (wildcardType.y() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<InterfaceC10025c> it = new Fd.g(c11, wildcardType, false).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                interfaceC10025c = null;
                break;
            }
            interfaceC10025c = it.next();
            InterfaceC10025c interfaceC10025c2 = interfaceC10025c;
            for (Sd.c cVar : y.d()) {
                if (Intrinsics.d(interfaceC10025c2.c(), cVar)) {
                    break loop0;
                }
            }
        }
        return interfaceC10025c;
    }

    public static final boolean b(@NotNull InterfaceC2966a memberDescriptor) {
        Intrinsics.checkNotNullParameter(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof InterfaceC9857w) && Intrinsics.d(memberDescriptor.P(Ed.e.f7839H), Boolean.TRUE);
    }

    public static final boolean c(@NotNull C2739A javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(y.c()) == L.STRICT;
    }

    @NotNull
    public static final AbstractC9853s d(@NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        AbstractC9853s e11 = w.e(s0Var);
        Intrinsics.checkNotNullExpressionValue(e11, "toDescriptorVisibility(...)");
        return e11;
    }
}
