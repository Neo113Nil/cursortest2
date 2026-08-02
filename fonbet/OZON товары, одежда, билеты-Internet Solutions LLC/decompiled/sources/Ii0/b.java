package Ii0;

import B0.C2510t;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import P0.u2;
import P0.v2;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dj0.f;
import e1.InterfaceC6250b;
import ff0.C6554a;
import gf0.C6730b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mf0.C8143e;
import mf0.InterfaceC8142d;
import oj0.InterfaceC8746a;
import org.jetbrains.annotations.NotNull;
import qj0.C9071a;
import qj0.C9077g;
import qj0.InterfaceC9075e;

/* loaded from: classes3.dex */
public final class b {

    static final class a extends AbstractC7737t implements Function1<f.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12577b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(f.a aVar) {
            f.a TrackerIsland = aVar;
            Intrinsics.checkNotNullParameter(TrackerIsland, "$this$TrackerIsland");
            TrackerIsland.b(Ii0.a.f12576b);
            return Unit.f71690a;
        }
    }

    /* renamed from: Ii0.b$b, reason: collision with other inner class name */
    static final class C0252b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8746a<Hi0.a> f12578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f12579c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC9075e<?>, Unit> f12580d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC9075e<?>, Unit> f12581e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0252b(InterfaceC8746a<Hi0.a> interfaceC8746a, String str, Function1<? super InterfaceC9075e<?>, Unit> function1, Function1<? super InterfaceC9075e<?>, Unit> function12) {
            super(2);
            this.f12578b = interfaceC8746a;
            this.f12579c = str;
            this.f12580d = function1;
            this.f12581e = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                InterfaceC8746a.C1332a c1332a = (InterfaceC8746a.C1332a) this.f12578b;
                C9077g.d(c1332a.b(), new C9071a(c1332a.c(), this.f12579c), this.f12580d, this.f12581e, null, interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<Hi0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8142d f12582b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC8142d interfaceC8142d) {
            super(1);
            this.f12582b = interfaceC8142d;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Hi0.a aVar) {
            Hi0.a item = aVar;
            Intrinsics.checkNotNullParameter(item, "item");
            C6730b c6730b = new C6730b(item.b());
            c6730b.a();
            this.f12582b.c(c6730b, C8143e.f74843b);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8746a<Hi0.a> f12583b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f12584c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC9075e<?>, Unit> f12585d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC9075e<?>, Unit> f12586e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC8746a<Hi0.a> interfaceC8746a, String str, Function1<? super InterfaceC9075e<?>, Unit> function1, Function1<? super InterfaceC9075e<?>, Unit> function12, int i11) {
            super(2);
            this.f12583b = interfaceC8746a;
            this.f12584c = str;
            this.f12585d = function1;
            this.f12586e = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(49);
            String str = this.f12584c;
            b.a(this.f12583b, str, this.f12585d, this.f12586e, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull InterfaceC8746a<Hi0.a> state, @NotNull String reloadAppBadgeTestTag, @NotNull Function1<? super InterfaceC9075e<?>, Unit> onChangedConfiguration, @NotNull Function1<? super InterfaceC9075e<?>, Unit> onResetConfiguration, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reloadAppBadgeTestTag, "reloadAppBadgeTestTag");
        Intrinsics.checkNotNullParameter(onChangedConfiguration, "onChangedConfiguration");
        Intrinsics.checkNotNullParameter(onResetConfiguration, "onResetConfiguration");
        C3969l u11 = interfaceC3967k.u(-1097325795);
        if (((i11 | (u11.F(state) ? 4 : 2) | (u11.F(onChangedConfiguration) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onResetConfiguration) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL)) & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            float f7 = 16;
            e c11 = z.c(T.h(a0.d(aVar), f7, 0.0f, 2), z.b(u11), 14);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, c11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            i.b(u11, f11, 588562246);
            if (state instanceof InterfaceC8746a.C1332a) {
                u11.o(588564640);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = a.f12577b;
                    u11.x(C11);
                }
                u11.k();
                dj0.e.a(null, (Function1) C11, a1.c.c(766131820, new C0252b(state, reloadAppBadgeTestTag, onChangedConfiguration, onResetConfiguration), u11), u11, 432, 1);
            }
            u11.k();
            C2510t.b("TEST EVENTS", T.h(T.j(aVar, 0.0f, f7, 0.0f, 0.0f, 13), f7, 0.0f, 2), ((u2) u11.m(v2.a())).n(), null, 0, false, 0, 0, null, u11, 54, 504);
            u11 = u11;
            List<Hi0.a> a13 = state.a();
            InterfaceC8142d interfaceC8142d = (InterfaceC8142d) u11.m(C6554a.a());
            e j11 = T.j(aVar, 0.0f, 8, 0.0f, 0.0f, 13);
            u11.o(588598159);
            boolean F11 = u11.F(interfaceC8142d);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new c(interfaceC8142d);
                u11.x(C12);
            }
            u11.k();
            rj0.b.a(j11, a13, (Function1) C12, u11, 6, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(state, reloadAppBadgeTestTag, onChangedConfiguration, onResetConfiguration, i11));
        }
    }
}
