package D1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<H> f5556a = new U0.b<>(new H[16]);

    /* renamed from: b, reason: collision with root package name */
    private H[] f5557b;

    private static void b(H h11) {
        h11.t();
        int i11 = 0;
        h11.n1(false);
        U0.b<H> o02 = h11.o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            do {
                b(l11[i11]);
                i11++;
            } while (i11 < m11);
        }
    }

    public final void a() {
        u0 u0Var = u0.f5555a;
        U0.b<H> bVar = this.f5556a;
        bVar.z(u0Var);
        int m11 = bVar.m();
        H[] hArr = this.f5557b;
        if (hArr == null || hArr.length < m11) {
            hArr = new H[Math.max(16, bVar.m())];
        }
        this.f5557b = null;
        for (int i11 = 0; i11 < m11; i11++) {
            hArr[i11] = bVar.l()[i11];
        }
        bVar.h();
        while (true) {
            m11--;
            if (-1 >= m11) {
                this.f5557b = hArr;
                return;
            }
            H h11 = hArr[m11];
            Intrinsics.f(h11);
            if (h11.b0()) {
                b(h11);
            }
        }
    }

    public final boolean c() {
        return this.f5556a.p();
    }

    public final void d(@NotNull H h11) {
        this.f5556a.b(h11);
        h11.n1(true);
    }

    public final void e(@NotNull H h11) {
        U0.b<H> bVar = this.f5556a;
        bVar.h();
        bVar.b(h11);
        h11.n1(true);
    }

    public final void f(@NotNull H h11) {
        this.f5556a.s(h11);
    }
}
