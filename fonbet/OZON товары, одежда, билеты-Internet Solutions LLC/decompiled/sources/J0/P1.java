package J0;

import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class P1 {
    @NotNull
    public static O0.i a(long j11, boolean z11) {
        O0.i iVar;
        O0.i iVar2;
        O0.i iVar3;
        if (!z11) {
            iVar = androidx.compose.material.Q.f39940g;
            return iVar;
        }
        if (C7811b0.h(j11) > 0.5d) {
            iVar3 = androidx.compose.material.Q.f39938e;
            return iVar3;
        }
        iVar2 = androidx.compose.material.Q.f39939f;
        return iVar2;
    }

    public static long b(long j11, boolean z11) {
        long j12;
        float h11 = C7811b0.h(j11);
        if (z11 || h11 >= 0.5d) {
            return j11;
        }
        j12 = C7807Z.f72251e;
        return j12;
    }
}
