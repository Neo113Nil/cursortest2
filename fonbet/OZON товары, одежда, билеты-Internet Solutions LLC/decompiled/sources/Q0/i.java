package Q0;

import Bl0.C2652m;
import K1.T;
import P0.C3776u;
import P0.p2;
import S0.C3969l;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import S0.J0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f22761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f22762c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f22763d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f22764e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j11, T t2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f22761b = j11;
            this.f22762c = t2;
            this.f22763d = function2;
            this.f22764e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f22764e | 1);
            T t2 = this.f22762c;
            Function2<InterfaceC3967k, Integer, Unit> function2 = this.f22763d;
            i.a(this.f22761b, t2, function2, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(long j11, @NotNull T t2, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-716124955);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(t2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            C3996z.b(new H0[]{C3776u.a().c(C7807Z.m(j11)), p2.d().c(((T) u11.m(p2.d())).E(t2))}, function2, u11, ((i12 >> 3) & 112) | 8);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(j11, t2, function2, i11));
        }
    }
}
