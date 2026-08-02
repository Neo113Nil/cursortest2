package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7837o0;

/* renamed from: B0.n1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2495n1 extends AbstractC7737t implements Function1<C7837o0, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B1.B f1879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2495n1(B1.B b11) {
        super(1);
        this.f1879b = b11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7837o0 c7837o0) {
        float[] j11 = c7837o0.j();
        B1.B b11 = this.f1879b;
        if (b11.I()) {
            B1.C.c(b11).v(b11, j11);
        }
        return Unit.f71690a;
    }
}
