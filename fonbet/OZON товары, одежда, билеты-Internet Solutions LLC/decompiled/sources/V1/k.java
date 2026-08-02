package V1;

import Bl0.C2656q;
import K1.E;
import V1.l;
import kotlin.jvm.functions.Function0;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.C7811b0;
import l1.F0;
import l1.K0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k {
    public static final float a(float f7, Function0 function0) {
        return Float.isNaN(f7) ? ((Number) ((l.c) function0).invoke()).floatValue() : f7;
    }

    @NotNull
    public static final l b(@NotNull l lVar, @NotNull l lVar2, float f7) {
        boolean z11 = lVar instanceof b;
        l.b bVar = l.b.f27920a;
        if (!z11 && !(lVar2 instanceof b)) {
            long g10 = C7811b0.g(lVar.a(), lVar2.a(), f7);
            return g10 != 16 ? new c(g10) : bVar;
        }
        if (!z11 || !(lVar2 instanceof b)) {
            return (l) E.c(f7, lVar, lVar2);
        }
        AbstractC7799Q abstractC7799Q = (AbstractC7799Q) E.c(f7, ((b) lVar).d(), ((b) lVar2).d());
        float b11 = C2656q.b(((b) lVar).getAlpha(), ((b) lVar2).getAlpha(), f7);
        if (abstractC7799Q == null) {
            return bVar;
        }
        if (abstractC7799Q instanceof K0) {
            long c11 = c(b11, ((K0) abstractC7799Q).a());
            return c11 != 16 ? new c(c11) : bVar;
        }
        if (abstractC7799Q instanceof F0) {
            return new b((F0) abstractC7799Q, b11);
        }
        throw new Sc.o();
    }

    public static final long c(float f7, long j11) {
        return (Float.isNaN(f7) || f7 >= 1.0f) ? j11 : C7807Z.o(C7807Z.q(j11) * f7, j11);
    }
}
