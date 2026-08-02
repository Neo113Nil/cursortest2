package androidx.compose.foundation.selection;

import D1.C2809k;
import I1.D;
import I1.z;
import androidx.compose.foundation.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import t0.q;

/* loaded from: classes8.dex */
final class d extends m {

    /* renamed from: u, reason: collision with root package name */
    private boolean f39773u;

    private d() {
        throw null;
    }

    public d(boolean z11, q qVar, InterfaceC8369J interfaceC8369J, boolean z12, I1.i iVar, Function0 function0) {
        super(qVar, interfaceC8369J, z12, null, iVar, function0);
        this.f39773u = z11;
    }

    @Override // androidx.compose.foundation.AbstractC5157a
    public final void S1(@NotNull D d11) {
        z.r(d11, this.f39773u);
    }

    public final void c2(boolean z11, q qVar, InterfaceC8369J interfaceC8369J, boolean z12, I1.i iVar, @NotNull Function0<Unit> function0) {
        if (this.f39773u != z11) {
            this.f39773u = z11;
            C2809k.f(this).x0();
        }
        b2(qVar, interfaceC8369J, z12, iVar, function0);
    }
}
