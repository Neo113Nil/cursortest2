package E0;

import h1.C6769b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import p0.AbstractC8823a;
import p0.C8824b;

/* loaded from: classes8.dex */
final class J0 extends AbstractC7737t implements Function1<C6769b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F0 f7044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J0(F0 f02) {
        super(1);
        this.f7044b = f02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C6769b c6769b) {
        t0.j jVar = new t0.j();
        F0 f02 = this.f7044b;
        f02.b2().tryEmit(jVar);
        f02.f7000l = jVar;
        AbstractC8823a a11 = C8824b.a(f02);
        if (a11 != null) {
            a11.a();
        }
        return Unit.f71690a;
    }
}
