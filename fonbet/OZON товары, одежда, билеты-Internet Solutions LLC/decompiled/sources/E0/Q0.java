package E0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Q0 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F0 f7076b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B0.N0 f7077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(F0 f02, B0.N0 n02) {
        super(0);
        this.f7076b = f02;
        this.f7077c = n02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Ae.w0 Q12;
        F0 f02 = this.f7076b;
        if (!f02.h2()) {
            j1.u.b(f02);
        }
        B0.N0 n02 = this.f7077c;
        if (n02.e() != 7 && n02.e() != 8 && (Q12 = F0.Q1(f02)) != null) {
            ((Ae.C0) Q12).tryEmit(Unit.f71690a);
        }
        return Boolean.TRUE;
    }
}
