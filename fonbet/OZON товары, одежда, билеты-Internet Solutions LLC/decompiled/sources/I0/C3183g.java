package I0;

import Kk.C3532b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7795M;
import l1.InterfaceC7829k0;
import n1.C8408a;
import n1.C8415h;
import n1.InterfaceC8410c;

/* renamed from: I0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3183g extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Boolean> f11516b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f11517c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC7829k0 f11518d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7795M f11519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3183g(Function0 function0, boolean z11, InterfaceC7829k0 interfaceC7829k0, C7795M c7795m) {
        super(1);
        this.f11516b = function0;
        this.f11517c = z11;
        this.f11518d = interfaceC7829k0;
        this.f11519e = c7795m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        if (this.f11516b.invoke().booleanValue()) {
            boolean z11 = this.f11517c;
            C7795M c7795m = this.f11519e;
            InterfaceC7829k0 interfaceC7829k0 = this.f11518d;
            if (z11) {
                long A02 = interfaceC8410c2.A0();
                C8408a.b w02 = interfaceC8410c2.w0();
                long e11 = w02.e();
                w02.a().save();
                try {
                    w02.f().e(-1.0f, 1.0f, A02);
                    interfaceC8410c2.j1(interfaceC7829k0, C8415h.f76287a, c7795m);
                } finally {
                    C3532b.b(w02, e11);
                }
            } else {
                interfaceC8410c2.j1(interfaceC7829k0, C8415h.f76287a, c7795m);
            }
        }
        return Unit.f71690a;
    }
}
