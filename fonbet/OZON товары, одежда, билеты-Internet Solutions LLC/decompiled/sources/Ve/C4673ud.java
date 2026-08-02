package Ve;

import Ae.C2399j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4673ud implements Ib {

    /* renamed from: a, reason: collision with root package name */
    public final Ae.x0 f32204a;

    /* renamed from: b, reason: collision with root package name */
    public final Ae.M0 f32205b;

    public C4673ud() {
        Ae.x0 a11 = Ae.O0.a(new Fh(C4770xp.f32511a, 6));
        this.f32204a = a11;
        this.f32205b = C2399j.b(a11);
    }

    public final Fh a() {
        return (Fh) this.f32205b.getValue();
    }

    public final void b(Fh income) {
        Intrinsics.checkNotNullParameter(income, "income");
        Pc block = new Pc(income);
        Intrinsics.checkNotNullParameter(block, "block");
        if (a().f29004a instanceof To) {
            return;
        }
        AbstractC4245fi abstractC4245fi = income.f29004a;
        if (!(a().f29004a instanceof InterfaceC4337io) || Intrinsics.d(abstractC4245fi, C4362jk.f31374a)) {
            this.f32204a.setValue(income);
        }
    }

    public final void c(AbstractC4245fi income) {
        Intrinsics.checkNotNullParameter(income, "income");
        C4470nc block = new C4470nc(income);
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(a().f29004a instanceof InterfaceC4337io) || Intrinsics.d(income, C4362jk.f31374a)) {
            Ae.x0 x0Var = this.f32204a;
            x0Var.setValue(Fh.a((Fh) x0Var.getValue(), income, null, false, 6));
        }
    }
}
