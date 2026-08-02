package N0;

import B1.B;
import hd.C6915b;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class g extends AbstractC7737t implements Function1<B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f18303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(s sVar) {
        super(1);
        this.f18303b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B b11) {
        B w11 = b11.w();
        Intrinsics.f(w11);
        long a11 = w11.a();
        long u11 = w11.u(0L);
        Z1.o a12 = Z1.p.a(Z1.n.a(C6915b.c(C7459e.g(u11)), C6915b.c(C7459e.h(u11))), a11);
        s sVar = this.f18303b;
        sVar.f(a12);
        sVar.l();
        return Unit.f71690a;
    }
}
