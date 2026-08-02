package M20;

import B4.C2581j;
import B4.P;
import S0.InterfaceC3967k;
import android.os.Bundle;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6616a;
import g3.C6617b;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l0.InterfaceC7772p;
import r20.C9164a;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements InterfaceC6512o<InterfaceC7772p, C2581j, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f17281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(P p11) {
        super(4);
        this.f17281b = p11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC7772p interfaceC7772p, C2581j c2581j, InterfaceC3967k interfaceC3967k, Integer num) {
        String string;
        Bundle c11;
        String string2;
        InterfaceC7772p composable = interfaceC7772p;
        C2581j backStackEntry = c2581j;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Bundle c12 = backStackEntry.c();
        if (c12 != null && (string = c12.getString("sourceName")) != null && (c11 = backStackEntry.c()) != null && (string2 = c11.getString("resourceKey")) != null) {
            C9164a c9164a = C9164a.f82858a;
            E20.d w11 = C9164a.a().w(string, string2);
            interfaceC3967k2.B(1729797275);
            B0 a11 = C6616a.a(interfaceC3967k2);
            if (a11 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 a12 = C6617b.a(N.b(N20.f.class), a11, null, w11, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k2);
            interfaceC3967k2.K();
            N20.c.a((N20.e) C6285b.c(((N20.f) a12).getState(), interfaceC3967k2, 0).getValue(), this.f17281b, interfaceC3967k2);
        }
        return Unit.f71690a;
    }
}
