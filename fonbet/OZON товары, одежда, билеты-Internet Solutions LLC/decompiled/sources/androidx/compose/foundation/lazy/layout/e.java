package androidx.compose.foundation.lazy.layout;

import S0.InterfaceC3967k;
import S0.Q;
import androidx.compose.foundation.lazy.layout.f;
import b1.InterfaceC5505h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import x0.C10619x;
import x0.InterfaceC10620y;

/* loaded from: classes.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f39635b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f.a f39636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, f.a aVar) {
        super(2);
        this.f39635b = fVar;
        this.f39636c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC5505h interfaceC5505h;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            f fVar = this.f39635b;
            InterfaceC10620y invoke = fVar.d().invoke();
            f.a aVar = this.f39636c;
            int e11 = aVar.e();
            if ((e11 >= invoke.getItemCount() || !invoke.d(e11).equals(aVar.f())) && (e11 = invoke.b(aVar.f())) != -1) {
                aVar.f39642c = e11;
            }
            int i11 = e11;
            if (i11 != -1) {
                interfaceC3967k2.o(-660479623);
                interfaceC5505h = fVar.f39637a;
                C10619x.a(invoke, interfaceC5505h, i11, aVar.f(), interfaceC3967k2, 0);
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-660272047);
                interfaceC3967k2.k();
            }
            Object f7 = aVar.f();
            boolean F11 = interfaceC3967k2.F(aVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new d(aVar);
                interfaceC3967k2.x(C11);
            }
            Q.c(f7, (Function1) C11, interfaceC3967k2);
        }
        return Unit.f71690a;
    }
}
