package I0;

import B0.InterfaceC2477h1;
import I0.W;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class O extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f11353b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(C4912a c4912a, C3215w0 c3215w0) {
        super(2);
        this.f11353b = c4912a;
        this.f11354c = c3215w0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f11353b.invoke(interfaceC3967k2, 0);
            C3215w0 c3215w0 = this.f11354c;
            if (c3215w0.A() && c3215w0.u()) {
                C3220z x11 = c3215w0.x();
                if (!(x11 == null ? true : Intrinsics.d(x11.d(), x11.b()))) {
                    interfaceC3967k2.o(-882227523);
                    C3220z x12 = c3215w0.x();
                    if (x12 == null) {
                        interfaceC3967k2.o(-882188681);
                    } else {
                        interfaceC3967k2.o(-882188680);
                        interfaceC3967k2.o(1495564482);
                        List b02 = C7714v.b0(Boolean.TRUE, Boolean.FALSE);
                        int size = b02.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            boolean booleanValue = ((Boolean) b02.get(i11)).booleanValue();
                            boolean p11 = interfaceC3967k2.p(booleanValue);
                            Object C11 = interfaceC3967k2.C();
                            if (p11 || C11 == InterfaceC3967k.a.a()) {
                                C11 = new C3221z0(booleanValue, c3215w0);
                                interfaceC3967k2.x(C11);
                            }
                            InterfaceC2477h1 interfaceC2477h1 = (InterfaceC2477h1) C11;
                            boolean p12 = interfaceC3967k2.p(booleanValue);
                            Object C12 = interfaceC3967k2.C();
                            if (p12 || C12 == InterfaceC3967k.a.a()) {
                                C12 = booleanValue ? new M(c3215w0) : new N(c3215w0);
                                interfaceC3967k2.x(C12);
                            }
                            Function0 function0 = (Function0) C12;
                            V1.g b11 = booleanValue ? x12.d().b() : x12.b().b();
                            W.a aVar = new W.a(function0);
                            boolean c11 = x12.c();
                            e.a aVar2 = androidx.compose.ui.e.f40358c0;
                            boolean F11 = interfaceC3967k2.F(interfaceC2477h1);
                            Object C13 = interfaceC3967k2.C();
                            if (F11 || C13 == InterfaceC3967k.a.a()) {
                                C13 = new L(interfaceC2477h1, null);
                                interfaceC3967k2.x(C13);
                            }
                            C3181f.b(aVar, booleanValue, b11, c11, 0L, x1.L.b(aVar2, interfaceC2477h1, (Function2) C13), interfaceC3967k2, 0, 16);
                        }
                        interfaceC3967k2.k();
                    }
                    interfaceC3967k2.k();
                    interfaceC3967k2.k();
                }
            }
            interfaceC3967k2.o(-880741817);
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
