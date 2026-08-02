package If0;

import J0.C3332q;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9895d;

/* renamed from: If0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3247m extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12447b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3247m(J j11, Function1<? super I, Unit> function1) {
        super(3);
        this.f12447b = j11;
        this.f12448c = function1;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9895d Block = interfaceC9895d;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(Block, "$this$Block");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Sf0.e.a("Domain reachability config", null, interfaceC3967k2, 6, 2);
            J j11 = this.f12447b;
            Lf0.a c11 = j11.c();
            interfaceC3967k2.o(-2090806678);
            Function1<I, Unit> function1 = this.f12448c;
            boolean n11 = interfaceC3967k2.n(function1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3242h(function1);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C3250p.f("Лимит доменов", c11, (Function1) C11, interfaceC3967k2, 6);
            Lf0.a f7 = j11.f();
            interfaceC3967k2.o(-2090801041);
            boolean n12 = interfaceC3967k2.n(function1);
            Object C12 = interfaceC3967k2.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C3243i(function1);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            C3250p.f("Лимит параллельных задач", f7, (Function1) C12, interfaceC3967k2, 6);
            if (j11.e()) {
                interfaceC3967k2.o(-390240276);
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
                interfaceC3967k2.o(-2090795732);
                boolean n13 = interfaceC3967k2.n(function1);
                Object C13 = interfaceC3967k2.C();
                if (n13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new C3244j(function1);
                    interfaceC3967k2.x(C13);
                }
                interfaceC3967k2.k();
                C3332q.a((Function0) C13, e11, false, null, null, null, null, C3237c.f12421b, interfaceC3967k2, 805306416, 508);
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-390027771);
                androidx.compose.ui.e e12 = androidx.compose.foundation.layout.a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
                interfaceC3967k2.o(-2090788861);
                boolean n14 = interfaceC3967k2.n(function1);
                Object C14 = interfaceC3967k2.C();
                if (n14 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new C3245k(function1);
                    interfaceC3967k2.x(C14);
                }
                interfaceC3967k2.k();
                C3332q.a((Function0) C14, e12, false, null, null, null, null, C3237c.f12422c, interfaceC3967k2, 805306416, 508);
                interfaceC3967k2.k();
            }
            androidx.compose.ui.e e13 = androidx.compose.foundation.layout.a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            interfaceC3967k2.o(-2090783383);
            boolean n15 = interfaceC3967k2.n(function1);
            Object C15 = interfaceC3967k2.C();
            if (n15 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C3246l(function1);
                interfaceC3967k2.x(C15);
            }
            interfaceC3967k2.k();
            C3332q.a((Function0) C15, e13, false, null, null, null, null, C3237c.f12423d, interfaceC3967k2, 805306416, 508);
        }
        return Unit.f71690a;
    }
}
