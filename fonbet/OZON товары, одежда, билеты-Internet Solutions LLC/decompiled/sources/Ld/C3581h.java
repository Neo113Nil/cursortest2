package Ld;

import Ld.B;
import Qd.C3856a;
import Rd.d;
import Td.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ld.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3581h {
    public static final B a(@NotNull Nd.m proto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        h.f<Nd.m, C3856a.c> propertySignature = C3856a.f23235d;
        Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
        C3856a.c cVar = (C3856a.c) Pd.e.a(proto, propertySignature);
        if (cVar == null) {
            return null;
        }
        if (z11) {
            int i11 = Rd.h.f25024b;
            d.a c11 = Rd.h.c(proto, nameResolver, typeTable, z13);
            if (c11 == null) {
                return null;
            }
            return B.a.a(c11);
        }
        if (!z12 || !cVar.D()) {
            return null;
        }
        C3856a.b signature = cVar.v();
        Intrinsics.checkNotNullExpressionValue(signature, "getSyntheticMethod(...)");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(signature, "signature");
        String name = nameResolver.getString(signature.l());
        String desc = nameResolver.getString(signature.j());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new B(U7.d.e(name, desc));
    }
}
