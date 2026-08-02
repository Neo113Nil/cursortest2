package B0;

import Kk.C3532b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7795M;
import l1.InterfaceC7829k0;
import n1.C8408a;
import n1.C8409b;
import n1.C8415h;
import n1.InterfaceC8410c;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2463d extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f1696b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC7829k0 f1697c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7795M f1698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2463d(float f7, InterfaceC7829k0 interfaceC7829k0, C7795M c7795m) {
        super(1);
        this.f1696b = f7;
        this.f1697c = interfaceC7829k0;
        this.f1698d = c7795m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        float f7 = this.f1696b;
        InterfaceC7829k0 interfaceC7829k0 = this.f1697c;
        C7795M c7795m = this.f1698d;
        C8408a.b w02 = interfaceC8410c2.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            C8409b f11 = w02.f();
            f11.g(f7, 0.0f);
            f11.d();
            interfaceC8410c2.j1(interfaceC7829k0, C8415h.f76287a, c7795m);
            C3532b.b(w02, e11);
            return Unit.f71690a;
        } catch (Throwable th2) {
            C3532b.b(w02, e11);
            throw th2;
        }
    }
}
