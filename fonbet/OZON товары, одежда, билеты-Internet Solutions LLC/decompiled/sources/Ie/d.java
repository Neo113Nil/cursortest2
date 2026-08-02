package Ie;

import Ie.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {
    public static final void a(@NotNull h hVar, long j11, @NotNull Function1 function1) {
        c cVar = new c(j11);
        b bVar = b.f12281a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        U.g(3, bVar);
        e eVar = new e(cVar, bVar);
        hVar.n(new h.a(eVar.d(), eVar.c(), eVar.b(), k.e(), function1, null), false);
    }
}
