package Nf0;

import Bl0.C2652m;
import Hj0.T;
import J0.u3;
import Nf0.h;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import v0.C10164d;
import v0.G;

/* loaded from: classes3.dex */
public final class f extends Ze0.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f19515a = T.d(16);

    /* renamed from: b, reason: collision with root package name */
    private final long f19516b = T.d(14);

    /* renamed from: c, reason: collision with root package name */
    private final float f19517c = 8;

    /* renamed from: d, reason: collision with root package name */
    private final float f19518d = 2;

    static final class a extends AbstractC7737t implements Function1<G, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f19519b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f19520c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f19521d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f19522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, f fVar, boolean z11, j jVar) {
            super(1);
            this.f19519b = hVar;
            this.f19520c = fVar;
            this.f19521d = z11;
            this.f19522e = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(G g10) {
            G LazyColumn = g10;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            f fVar = this.f19520c;
            h hVar = this.f19519b;
            G.e(LazyColumn, null, new C4912a(true, -1152032946, new Nf0.b(fVar, hVar)), 3);
            List<h.b> b11 = hVar.b();
            LazyColumn.a(b11.size(), null, new d(b11), new C4912a(true, -1091073711, new e(b11, fVar, this.f19521d, this.f19522e)));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f19524c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f19525d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19526e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar, h hVar, int i11) {
            super(2);
            this.f19524c = jVar;
            this.f19525d = hVar;
            this.f19526e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f19526e | 1);
            j jVar = this.f19524c;
            h hVar = this.f19525d;
            f.this.b(jVar, hVar, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(j jVar, h hVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-601930822);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(jVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(hVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            boolean d11 = Intrinsics.d(hVar.c(), h.a.b.f19533a);
            u11.o(-1721012774);
            boolean F11 = ((i12 & 896) == 256) | u11.F(hVar) | u11.p(d11) | u11.F(jVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(hVar, this, d11, jVar);
                u11.x(C11);
            }
            u11.k();
            C10164d.a(null, null, null, null, null, null, false, (Function1) C11, u11, 0, 255);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(jVar, hVar, i11));
        }
    }

    public static final void d(f fVar, h hVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        fVar.getClass();
        C3969l u11 = interfaceC3967k.u(625782940);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(hVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(fVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            c3969l = u11;
            u3.b("Текущий статус: ".concat(hVar.c().getStatus()), androidx.compose.foundation.layout.T.f(androidx.compose.ui.e.f40358c0, fVar.f19517c), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 0, 0, 131068);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new g(fVar, hVar, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ze0.a
    public final void a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(1596564246);
        interfaceC3967k.o(1843075630);
        z0.b bVar = (z0.b) interfaceC3967k.m(Sf0.k.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(j.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        j jVar = (j) a12;
        b(jVar, (h) n1.b(jVar.f0(), interfaceC3967k).getValue(), interfaceC3967k, 0);
        interfaceC3967k.k();
    }
}
