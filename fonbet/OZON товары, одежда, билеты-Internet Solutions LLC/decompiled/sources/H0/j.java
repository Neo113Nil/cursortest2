package H0;

import B1.B;
import I0.F;
import I0.K0;
import I0.O0;
import I0.r;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    private long f10417a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<B> f10418b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K0 f10419c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f10420d;

    /* JADX WARN: Multi-variable type inference failed */
    j(Function0<? extends B> function0, K0 k02, long j11) {
        this.f10418b = function0;
        this.f10419c = k02;
        this.f10420d = j11;
    }

    @Override // I0.r
    public final boolean a(long j11, @NotNull F f7) {
        B b11 = (B) ((g) this.f10418b).invoke();
        if (b11 == null || !b11.I()) {
            return false;
        }
        K0 k02 = this.f10419c;
        k02.h(b11, j11, f7, false);
        this.f10417a = j11;
        return O0.b(k02, this.f10420d);
    }

    @Override // I0.r
    public final void b() {
        this.f10419c.d();
    }

    @Override // I0.r
    public final boolean c(long j11, @NotNull F f7) {
        B b11 = (B) ((g) this.f10418b).invoke();
        if (b11 == null) {
            return true;
        }
        if (!b11.I()) {
            return false;
        }
        K0 k02 = this.f10419c;
        if (!O0.b(k02, this.f10420d)) {
            return false;
        }
        if (!k02.b(b11, j11, this.f10417a, f7, false)) {
            return true;
        }
        this.f10417a = j11;
        return true;
    }
}
