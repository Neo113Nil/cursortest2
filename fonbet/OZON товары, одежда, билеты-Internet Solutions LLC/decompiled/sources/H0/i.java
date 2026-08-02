package H0;

import B0.InterfaceC2477h1;
import B1.B;
import I0.F;
import I0.K0;
import I0.O0;
import k1.C7459e;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class i implements InterfaceC2477h1 {

    /* renamed from: a, reason: collision with root package name */
    private long f10412a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f10413b = 0;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<B> f10414c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K0 f10415d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f10416e;

    /* JADX WARN: Multi-variable type inference failed */
    i(Function0<? extends B> function0, K0 k02, long j11) {
        this.f10414c = function0;
        this.f10415d = k02;
        this.f10416e = j11;
    }

    @Override // B0.InterfaceC2477h1
    public final void a() {
    }

    @Override // B0.InterfaceC2477h1
    public final void b(long j11) {
        B b11 = (B) ((g) this.f10414c).invoke();
        if (b11 == null || !b11.I()) {
            return;
        }
        K0 k02 = this.f10415d;
        if (O0.b(k02, this.f10416e)) {
            long k11 = C7459e.k(this.f10413b, j11);
            this.f10413b = k11;
            long k12 = C7459e.k(this.f10412a, k11);
            if (k02.b(b11, k12, this.f10412a, F.a.f(), true)) {
                this.f10412a = k12;
                this.f10413b = 0L;
            }
        }
    }

    @Override // B0.InterfaceC2477h1
    public final void c(long j11) {
        B b11 = (B) ((g) this.f10414c).invoke();
        K0 k02 = this.f10415d;
        if (b11 != null) {
            if (!b11.I()) {
                return;
            }
            k02.h(b11, j11, F.a.f(), true);
            this.f10412a = j11;
        }
        if (O0.b(k02, this.f10416e)) {
            this.f10413b = 0L;
        }
    }

    @Override // B0.InterfaceC2477h1
    public final void d() {
    }

    @Override // B0.InterfaceC2477h1
    public final void onCancel() {
        long j11 = this.f10416e;
        K0 k02 = this.f10415d;
        if (O0.b(k02, j11)) {
            k02.d();
        }
    }

    @Override // B0.InterfaceC2477h1
    public final void onStop() {
        long j11 = this.f10416e;
        K0 k02 = this.f10415d;
        if (O0.b(k02, j11)) {
            k02.d();
        }
    }
}
