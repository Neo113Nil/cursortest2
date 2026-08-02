package S0;

import c1.AbstractC5705I;
import c1.AbstractC5706J;
import c1.AbstractC5715f;
import c1.C5721l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class k1<T> extends AbstractC5705I implements c1.t<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l1<T> f25435b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private a<T> f25436c;

    private static final class a<T> extends AbstractC5706J {

        /* renamed from: c, reason: collision with root package name */
        private T f25437c;

        public a(T t2) {
            this.f25437c = t2;
        }

        @Override // c1.AbstractC5706J
        public final void a(@NotNull AbstractC5706J abstractC5706J) {
            Intrinsics.g(abstractC5706J, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f25437c = ((a) abstractC5706J).f25437c;
        }

        @Override // c1.AbstractC5706J
        @NotNull
        public final AbstractC5706J b() {
            return new a(this.f25437c);
        }

        public final T g() {
            return this.f25437c;
        }

        public final void h(T t2) {
            this.f25437c = t2;
        }
    }

    public k1(T t2, @NotNull l1<T> l1Var) {
        v1 v1Var;
        this.f25435b = l1Var;
        a<T> aVar = new a<>(t2);
        v1Var = C5721l.f56251b;
        if (v1Var.a() != null) {
            a aVar2 = new a(t2);
            aVar2.f(1);
            aVar.e(aVar2);
        }
        this.f25436c = aVar;
    }

    @Override // c1.t
    @NotNull
    public final l1<T> a() {
        return this.f25435b;
    }

    @Override // c1.InterfaceC5704H
    public final void b(@NotNull AbstractC5706J abstractC5706J) {
        this.f25436c = (a) abstractC5706J;
    }

    @Override // S0.A1
    public final T getValue() {
        return (T) ((a) C5721l.M(this.f25436c, this)).g();
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J k() {
        return this.f25436c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c1.InterfaceC5704H
    public final AbstractC5706J o(@NotNull AbstractC5706J abstractC5706J, @NotNull AbstractC5706J abstractC5706J2, @NotNull AbstractC5706J abstractC5706J3) {
        if (this.f25435b.a(((a) abstractC5706J2).g(), ((a) abstractC5706J3).g())) {
            return abstractC5706J2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.InterfaceC3978p0
    public final void setValue(T t2) {
        AbstractC5715f C11;
        a aVar = (a) C5721l.A(this.f25436c);
        if (this.f25435b.a(aVar.g(), t2)) {
            return;
        }
        a<T> aVar2 = this.f25436c;
        synchronized (C5721l.D()) {
            C11 = C5721l.C();
            ((a) C5721l.I(aVar2, this, C11, aVar)).h(t2);
            Unit unit = Unit.f71690a;
        }
        C5721l.H(C11, this);
    }

    @NotNull
    public final String toString() {
        return "MutableState(value=" + ((a) C5721l.A(this.f25436c)).g() + ")@" + hashCode();
    }
}
