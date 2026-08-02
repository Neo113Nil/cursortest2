package Pd;

import Nd.m;
import Nd.p;
import Nd.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {
    public static final p a(@NotNull p pVar, @NotNull g typeTable) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (pVar.m0()) {
            return pVar.Z();
        }
        if (pVar.n0()) {
            return typeTable.a(pVar.a0());
        }
        return null;
    }

    public static final p b(@NotNull Nd.h hVar, @NotNull g typeTable) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (hVar.k0()) {
            return hVar.Z();
        }
        if (hVar.l0()) {
            return typeTable.a(hVar.a0());
        }
        return null;
    }

    @NotNull
    public static final p c(@NotNull Nd.h hVar, @NotNull g typeTable) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (hVar.m0()) {
            p b02 = hVar.b0();
            Intrinsics.checkNotNullExpressionValue(b02, "getReturnType(...)");
            return b02;
        }
        if (hVar.n0()) {
            return typeTable.a(hVar.c0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    @NotNull
    public static final p d(@NotNull m mVar, @NotNull g typeTable) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (mVar.l0()) {
            p a02 = mVar.a0();
            Intrinsics.checkNotNullExpressionValue(a02, "getReturnType(...)");
            return a02;
        }
        if (mVar.m0()) {
            return typeTable.a(mVar.b0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    @NotNull
    public static final p e(@NotNull t tVar, @NotNull g typeTable) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (tVar.O()) {
            p I11 = tVar.I();
            Intrinsics.checkNotNullExpressionValue(I11, "getType(...)");
            return I11;
        }
        if (tVar.P()) {
            return typeTable.a(tVar.J());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
