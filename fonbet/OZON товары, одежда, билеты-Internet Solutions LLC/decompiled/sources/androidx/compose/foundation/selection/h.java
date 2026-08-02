package androidx.compose.foundation.selection;

import D1.C2809k;
import I1.D;
import I1.z;
import androidx.compose.foundation.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import t0.q;

/* loaded from: classes8.dex */
final class h extends m {

    /* renamed from: u, reason: collision with root package name */
    private boolean f39777u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private Function1<? super Boolean, Unit> f39778v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39779w;

    private h() {
        throw null;
    }

    public h(boolean z11, q qVar, boolean z12, I1.i iVar, Function1 function1) {
        super(qVar, null, z12, null, iVar, new f(function1, z11));
        this.f39777u = z11;
        this.f39778v = function1;
        this.f39779w = new g(this);
    }

    @Override // androidx.compose.foundation.AbstractC5157a
    public final void S1(@NotNull D d11) {
        z.w(d11, this.f39777u ? J1.a.On : J1.a.Off);
    }

    public final void e2(boolean z11, q qVar, boolean z12, I1.i iVar, @NotNull Function1 function1) {
        if (this.f39777u != z11) {
            this.f39777u = z11;
            C2809k.f(this).x0();
        }
        this.f39778v = function1;
        b2(qVar, null, z12, iVar, this.f39779w);
    }
}
