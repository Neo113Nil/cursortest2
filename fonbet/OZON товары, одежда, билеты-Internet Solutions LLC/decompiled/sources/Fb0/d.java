package Fb0;

import Ib0.i;
import Kb0.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {
    public static final void a(@NotNull c loginResult, @NotNull Gb0.d ozonIdSignInType, boolean z11) {
        Intrinsics.checkNotNullParameter(loginResult, "loginResult");
        Intrinsics.checkNotNullParameter(ozonIdSignInType, "ozonIdSignInType");
        Intrinsics.checkNotNullParameter(loginResult, "loginResult");
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.p().getValue().j(z11 ? new i.a(ozonIdSignInType) : loginResult.b() ? new i.c(ozonIdSignInType, loginResult.a()) : new i.b(ozonIdSignInType));
    }
}
