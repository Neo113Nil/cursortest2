package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import x1.F;

/* loaded from: classes.dex */
public class m extends AbstractC5157a {
    private m() {
        throw null;
    }

    @Override // androidx.compose.foundation.AbstractC5157a
    public final Object T1(@NotNull F f7, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object e11 = C9115P.e(f7, new k(this, null), new l(this), (kotlin.coroutines.jvm.internal.j) dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    public final void b2(t0.q qVar, InterfaceC8369J interfaceC8369J, boolean z11, I1.i iVar, @NotNull Function0 function0) {
        a2(qVar, interfaceC8369J, z11, null, iVar, function0);
    }
}
