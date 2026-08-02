package Ld;

import ae.C5002d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.C9661c;
import td.InterfaceC9839e;

/* loaded from: classes10.dex */
public final class C {
    @NotNull
    public static final String a(@NotNull InterfaceC9839e classDescriptor, @NotNull String jvmDescriptor) {
        String a11;
        Intrinsics.checkNotNullParameter(G.f16741a, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        int i11 = C9661c.f98575o;
        Sd.d j11 = Zd.e.g(classDescriptor).j();
        Intrinsics.checkNotNullExpressionValue(j11, "toUnsafe(...)");
        Sd.b k11 = C9661c.k(j11);
        if (k11 != null) {
            a11 = C5002d.h(k11);
            Intrinsics.checkNotNullExpressionValue(a11, "internalNameByClassId(...)");
        } else {
            a11 = l.a(classDescriptor, H.f16742a);
        }
        return G.i(a11, jvmDescriptor);
    }
}
