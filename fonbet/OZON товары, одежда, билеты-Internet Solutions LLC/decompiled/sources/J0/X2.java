package J0;

import S0.InterfaceC3978p0;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class X2 extends AbstractC7737t implements Function1<C7464j, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f13081b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<C7464j> f13082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X2(InterfaceC3978p0 interfaceC3978p0, float f7) {
        super(1);
        this.f13081b = f7;
        this.f13082c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7464j c7464j) {
        long i11 = c7464j.i();
        float f7 = C7464j.f(i11);
        float f11 = this.f13081b;
        float f12 = f7 * f11;
        float d11 = C7464j.d(i11) * f11;
        InterfaceC3978p0<C7464j> interfaceC3978p0 = this.f13082c;
        if (C7464j.f(interfaceC3978p0.getValue().i()) != f12 || C7464j.d(interfaceC3978p0.getValue().i()) != d11) {
            interfaceC3978p0.setValue(C7464j.a(C7465k.a(f12, d11)));
        }
        return Unit.f71690a;
    }
}
