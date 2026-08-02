package Vf0;

import Cf0.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o {
    public static final boolean a(@NotNull Ld0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        J j11 = pf0.m.f80514a;
        if (j11 == null) {
            throw new RuntimeException("NetworkDi must be initialized.");
        }
        q20.c c11 = j11.f().c();
        return !(cVar.c().b() == Nd0.b.DEBUG || c11 == q20.c.PROD_BUILDS_OZON_QA || c11 == q20.c.PROD_BUILDS_OZON_EMPLOYEE || c11 == q20.c.QA_BUILDS_OR_AUTOTEST);
    }
}
