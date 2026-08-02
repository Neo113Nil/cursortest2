package S0;

import c1.AbstractC5705I;
import c1.AbstractC5706J;
import c1.AbstractC5715f;
import c1.C5721l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3962h1 extends AbstractC5705I implements InterfaceC3970l0, c1.t<Float> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private a f25419b;

    /* renamed from: S0.h1$a */
    private static final class a extends AbstractC5706J {

        /* renamed from: c, reason: collision with root package name */
        private float f25420c;

        public a(float f7) {
            this.f25420c = f7;
        }

        @Override // c1.AbstractC5706J
        public final void a(@NotNull AbstractC5706J abstractC5706J) {
            Intrinsics.g(abstractC5706J, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f25420c = ((a) abstractC5706J).f25420c;
        }

        @Override // c1.AbstractC5706J
        @NotNull
        public final AbstractC5706J b() {
            return new a(this.f25420c);
        }

        public final float g() {
            return this.f25420c;
        }

        public final void h(float f7) {
            this.f25420c = f7;
        }
    }

    public C3962h1(float f7) {
        v1 v1Var;
        a aVar = new a(f7);
        v1Var = C5721l.f56251b;
        if (v1Var.a() != null) {
            a aVar2 = new a(f7);
            aVar2.f(1);
            aVar.e(aVar2);
        }
        this.f25419b = aVar;
    }

    @Override // c1.t
    @NotNull
    public final l1<Float> a() {
        return D1.f25195a;
    }

    @Override // c1.InterfaceC5704H
    public final void b(@NotNull AbstractC5706J abstractC5706J) {
        this.f25419b = (a) abstractC5706J;
    }

    @Override // S0.InterfaceC3970l0, S0.S
    public final float getFloatValue() {
        return ((a) C5721l.M(this.f25419b, this)).g();
    }

    @Override // S0.InterfaceC3970l0
    public final void h(float f7) {
        AbstractC5715f C11;
        a aVar = (a) C5721l.A(this.f25419b);
        if (aVar.g() == f7) {
            return;
        }
        a aVar2 = this.f25419b;
        synchronized (C5721l.D()) {
            C11 = C5721l.C();
            ((a) C5721l.I(aVar2, this, C11, aVar)).h(f7);
            Unit unit = Unit.f71690a;
        }
        C5721l.H(C11, this);
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J k() {
        return this.f25419b;
    }

    @Override // c1.InterfaceC5704H
    public final AbstractC5706J o(@NotNull AbstractC5706J abstractC5706J, @NotNull AbstractC5706J abstractC5706J2, @NotNull AbstractC5706J abstractC5706J3) {
        if (((a) abstractC5706J2).g() == ((a) abstractC5706J3).g()) {
            return abstractC5706J2;
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return "MutableFloatState(value=" + ((a) C5721l.A(this.f25419b)).g() + ")@" + hashCode();
    }
}
