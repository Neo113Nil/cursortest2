package M20;

import B4.C2581j;
import B4.P;
import P20.r;
import P20.s;
import S0.InterfaceC3967k;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6616a;
import g3.C6617b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l0.InterfaceC7772p;
import r20.C9164a;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements InterfaceC6512o<InterfaceC7772p, C2581j, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f17279b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(P p11) {
        super(4);
        this.f17279b = p11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC7772p interfaceC7772p, C2581j c2581j, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC7772p composable = interfaceC7772p;
        C2581j it = c2581j;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        C9164a c9164a = C9164a.f82858a;
        E20.c u11 = C9164a.a().u();
        interfaceC3967k2.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k2);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(s.class), a11, null, u11, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k2);
        interfaceC3967k2.K();
        s sVar = (s) a12;
        P20.e eVar = (P20.e) C6285b.c(sVar.getState(), interfaceC3967k2, 0).getValue();
        interfaceC3967k2.o(-891446515);
        boolean F11 = interfaceC3967k2.F(sVar);
        Object C11 = interfaceC3967k2.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            d dVar = new d(0, sVar, s.class, "onBackClicked", "onBackClicked()V", 0);
            interfaceC3967k2.x(dVar);
            C11 = dVar;
        }
        interfaceC3967k2.k();
        r.a(eVar, this.f17279b, (Function0) ((kotlin.reflect.h) C11), interfaceC3967k2, 0);
        return Unit.f71690a;
    }
}
