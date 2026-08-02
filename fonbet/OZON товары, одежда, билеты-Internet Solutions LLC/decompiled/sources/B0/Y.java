package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class Y extends AbstractC7737t implements Function1<B1.B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(O0 o02) {
        super(1);
        this.f1623b = o02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B1.B b11) {
        B1.B b12 = b11;
        R1 j11 = this.f1623b.j();
        if (j11 != null) {
            j11.g(b12);
        }
        return Unit.f71690a;
    }
}
