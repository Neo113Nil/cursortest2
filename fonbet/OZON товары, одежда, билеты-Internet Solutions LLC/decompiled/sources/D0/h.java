package D0;

import E0.r;
import K1.Q;
import K1.S;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h {
    public static final void a(@NotNull g gVar, @NotNull a aVar, @NotNull a aVar2, @NotNull r rVar, boolean z11) {
        if (rVar.c() > 1) {
            gVar.c(new G0.d(0, aVar.toString(), aVar2.toString(), aVar.d(), aVar2.d(), 0L, false, 32));
            return;
        }
        if (rVar.c() == 1) {
            long d11 = rVar.d();
            long e11 = rVar.e();
            if (Q.e(d11) && Q.e(e11)) {
                return;
            }
            gVar.c(new G0.d(Q.h(d11), S.c(d11, aVar), S.c(e11, aVar2), aVar.d(), aVar2.d(), 0L, z11, 32));
        }
    }
}
