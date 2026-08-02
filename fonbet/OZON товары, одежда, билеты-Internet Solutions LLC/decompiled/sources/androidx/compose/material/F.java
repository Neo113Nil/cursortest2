package androidx.compose.material;

import I1.C3222a;
import J0.C3326o1;
import J0.EnumC3337r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class F extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3326o1 f39891b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f39892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(C3326o1 c3326o1, xe.M m11) {
        super(1);
        this.f39891b = c3326o1;
        this.f39892c = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        C3326o1 c3326o1 = this.f39891b;
        if (c3326o1.h()) {
            xe.M m11 = this.f39892c;
            A a11 = new A(c3326o1, m11);
            int i11 = I1.z.f11793b;
            d12.b(I1.k.f(), new C3222a(null, a11));
            if (c3326o1.c().p() == EnumC3337r1.HalfExpanded) {
                d12.b(I1.k.g(), new C3222a(null, new C(c3326o1, m11)));
            } else if (c3326o1.e()) {
                d12.b(I1.k.b(), new C3222a(null, new E(c3326o1, m11)));
            }
        }
        return Unit.f71690a;
    }
}
