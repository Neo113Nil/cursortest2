package androidx.compose.foundation.selection;

import D1.C2809k;
import I1.D;
import I1.z;
import androidx.compose.foundation.m;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import t0.q;

/* loaded from: classes8.dex */
final class i extends m {

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private J1.a f39780u;

    private i() {
        throw null;
    }

    public i(J1.a aVar, q qVar, boolean z11, I1.i iVar, Function0 function0) {
        super(qVar, null, z11, null, iVar, function0);
        this.f39780u = aVar;
    }

    @Override // androidx.compose.foundation.AbstractC5157a
    public final void S1(@NotNull D d11) {
        z.w(d11, this.f39780u);
    }

    public final void c2(@NotNull J1.a aVar, q qVar, boolean z11, I1.i iVar, @NotNull Function0 function0) {
        if (this.f39780u != aVar) {
            this.f39780u = aVar;
            C2809k.f(this).x0();
        }
        b2(qVar, null, z11, iVar, function0);
    }
}
