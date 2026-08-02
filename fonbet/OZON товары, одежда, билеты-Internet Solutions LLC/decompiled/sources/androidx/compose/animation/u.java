package androidx.compose.animation;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.e0;
import m0.C7980b;
import m0.C8010q;
import m0.InterfaceC8002m;
import m0.W0;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* loaded from: classes8.dex */
final class u extends e0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC8002m<Z1.q> f38819a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private e1.d f38820b;

    /* renamed from: c, reason: collision with root package name */
    private long f38821c = androidx.compose.animation.a.b();

    /* renamed from: d, reason: collision with root package name */
    private long f38822d = Z1.c.b(0, 0, 15);

    /* renamed from: e, reason: collision with root package name */
    private boolean f38823e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f38824f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C7980b<Z1.q, C8010q> f38825a;

        /* renamed from: b, reason: collision with root package name */
        private long f38826b;

        private a() {
            throw null;
        }

        public a(C7980b c7980b, long j11) {
            this.f38825a = c7980b;
            this.f38826b = j11;
        }

        @NotNull
        public final C7980b<Z1.q, C8010q> a() {
            return this.f38825a;
        }

        public final void b(long j11) {
            this.f38826b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f38825a, aVar.f38825a) && Z1.q.c(this.f38826b, aVar.f38826b);
        }

        public final int hashCode() {
            return Long.hashCode(this.f38826b) + (this.f38825a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "AnimData(anim=" + this.f38825a + ", startSize=" + ((Object) Z1.q.d(this.f38826b)) + ')';
        }
    }

    static final class b extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38828c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f38829d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f38830e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y f38831f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m0 f38832g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, int i11, int i12, Y y11, m0 m0Var) {
            super(1);
            this.f38828c = j11;
            this.f38829d = i11;
            this.f38830e = i12;
            this.f38831f = y11;
            this.f38832g = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            InterfaceC6250b I12 = u.this.I1();
            e1.d dVar = (e1.d) I12;
            aVar.f(this.f38832g, dVar.a(this.f38828c, Z1.r.a(this.f38829d, this.f38830e), this.f38831f.getLayoutDirection()), 0.0f);
            return Unit.f71690a;
        }
    }

    public u(@NotNull InterfaceC8002m interfaceC8002m, @NotNull e1.d dVar) {
        C3991w0 f7;
        this.f38819a = interfaceC8002m;
        this.f38820b = dVar;
        f7 = n1.f(null, D1.f25195a);
        this.f38824f = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        m0 a02;
        a aVar;
        long e11;
        a aVar2;
        W z02;
        if (y11.R0()) {
            this.f38822d = j11;
            this.f38823e = true;
            a02 = u11.a0(j11);
        } else {
            a02 = u11.a0(this.f38823e ? this.f38822d : j11);
        }
        m0 m0Var = a02;
        long a11 = Z1.r.a(m0Var.u0(), m0Var.l0());
        if (y11.R0()) {
            this.f38821c = a11;
            e11 = a11;
        } else {
            long j12 = androidx.compose.animation.a.c(this.f38821c) ? this.f38821c : a11;
            C3991w0 c3991w0 = this.f38824f;
            a aVar3 = (a) c3991w0.getValue();
            if (aVar3 != null) {
                boolean z11 = (Z1.q.c(j12, aVar3.a().k().e()) || aVar3.a().l()) ? false : true;
                if (!Z1.q.c(j12, aVar3.a().i().e()) || z11) {
                    aVar3.b(aVar3.a().k().e());
                    aVar2 = aVar3;
                    C10727i.c(getCoroutineScope(), null, null, new v(aVar2, j12, this, null), 3);
                } else {
                    aVar2 = aVar3;
                }
                aVar = aVar2;
            } else {
                aVar = new a(new C7980b(Z1.q.a(j12), W0.j(), Z1.q.a(Z1.r.a(1, 1)), 8), j12);
            }
            c3991w0.setValue(aVar);
            e11 = Z1.c.e(j11, aVar.a().k().e());
        }
        int i11 = (int) (e11 >> 32);
        int i12 = (int) (e11 & 4294967295L);
        z02 = y11.z0(i11, i12, kotlin.collections.U.c(), new b(a11, i11, i12, y11, m0Var));
        return z02;
    }

    @NotNull
    public final InterfaceC6250b I1() {
        return this.f38820b;
    }

    @NotNull
    public final InterfaceC8002m<Z1.q> J1() {
        return this.f38819a;
    }

    public final void K1(@NotNull InterfaceC6250b interfaceC6250b) {
        this.f38820b = (e1.d) interfaceC6250b;
    }

    public final void L1(@NotNull InterfaceC8002m<Z1.q> interfaceC8002m) {
        this.f38819a = interfaceC8002m;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        super.onAttach();
        this.f38821c = androidx.compose.animation.a.b();
        this.f38823e = false;
    }

    @Override // androidx.compose.ui.e.c
    public final void onReset() {
        super.onReset();
        this.f38824f.setValue(null);
    }
}
