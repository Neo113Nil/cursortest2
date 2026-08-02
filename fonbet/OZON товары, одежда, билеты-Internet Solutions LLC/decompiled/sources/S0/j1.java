package S0;

import c1.AbstractC5705I;
import c1.AbstractC5706J;
import c1.AbstractC5715f;
import c1.C5721l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class j1 extends AbstractC5705I implements InterfaceC3974n0, c1.t<Long> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private a f25425b;

    private static final class a extends AbstractC5706J {

        /* renamed from: c, reason: collision with root package name */
        private long f25426c;

        public a(long j11) {
            this.f25426c = j11;
        }

        @Override // c1.AbstractC5706J
        public final void a(@NotNull AbstractC5706J abstractC5706J) {
            Intrinsics.g(abstractC5706J, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f25426c = ((a) abstractC5706J).f25426c;
        }

        @Override // c1.AbstractC5706J
        @NotNull
        public final AbstractC5706J b() {
            return new a(this.f25426c);
        }

        public final long g() {
            return this.f25426c;
        }

        public final void h(long j11) {
            this.f25426c = j11;
        }
    }

    public j1(long j11) {
        v1 v1Var;
        a aVar = new a(j11);
        v1Var = C5721l.f56251b;
        if (v1Var.a() != null) {
            a aVar2 = new a(j11);
            aVar2.f(1);
            aVar.e(aVar2);
        }
        this.f25425b = aVar;
    }

    @Override // c1.t
    @NotNull
    public final l1<Long> a() {
        return D1.f25195a;
    }

    @Override // c1.InterfaceC5704H
    public final void b(@NotNull AbstractC5706J abstractC5706J) {
        this.f25425b = (a) abstractC5706J;
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J k() {
        return this.f25425b;
    }

    @Override // S0.InterfaceC3974n0
    public final long n() {
        return ((a) C5721l.M(this.f25425b, this)).g();
    }

    @Override // c1.InterfaceC5704H
    public final AbstractC5706J o(@NotNull AbstractC5706J abstractC5706J, @NotNull AbstractC5706J abstractC5706J2, @NotNull AbstractC5706J abstractC5706J3) {
        if (((a) abstractC5706J2).g() == ((a) abstractC5706J3).g()) {
            return abstractC5706J2;
        }
        return null;
    }

    @Override // S0.InterfaceC3974n0
    public final void t(long j11) {
        AbstractC5715f C11;
        a aVar = (a) C5721l.A(this.f25425b);
        if (aVar.g() != j11) {
            a aVar2 = this.f25425b;
            synchronized (C5721l.D()) {
                C11 = C5721l.C();
                ((a) C5721l.I(aVar2, this, C11, aVar)).h(j11);
                Unit unit = Unit.f71690a;
            }
            C5721l.H(C11, this);
        }
    }

    @NotNull
    public final String toString() {
        return "MutableLongState(value=" + ((a) C5721l.A(this.f25425b)).g() + ")@" + hashCode();
    }
}
