package androidx.compose.ui.tooling;

import J0.Q1;
import S0.C3956f1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object[] f41131b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41132c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f41133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(String str, String str2, Object[] objArr) {
        super(2);
        this.f41131b = objArr;
        this.f41132c = str;
        this.f41133d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C3956f1.a(0);
                interfaceC3967k2.x(C11);
            }
            InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
            Object[] objArr = this.f41131b;
            Q1.a(null, null, null, null, null, a1.c.c(958604965, new c(interfaceC3972m0, objArr), interfaceC3967k2), 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, a1.c.c(57310875, new d(this.f41132c, this.f41133d, objArr, interfaceC3972m0), interfaceC3967k2), interfaceC3967k2, 196608);
        }
        return Unit.f71690a;
    }
}
