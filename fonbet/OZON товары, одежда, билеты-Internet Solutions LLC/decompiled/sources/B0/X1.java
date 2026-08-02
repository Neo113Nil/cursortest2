package B0;

import K1.C3422b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class X1 extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ U1 f1622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X1(U1 u12) {
        super(0);
        this.f1622b = u12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        K1.J k11;
        U1 u12 = this.f1622b;
        C3422b f7 = u12.f();
        K1.K g10 = u12.g();
        return Boolean.valueOf(Intrinsics.d(f7, (g10 == null || (k11 = g10.k()) == null) ? null : k11.j()));
    }
}
