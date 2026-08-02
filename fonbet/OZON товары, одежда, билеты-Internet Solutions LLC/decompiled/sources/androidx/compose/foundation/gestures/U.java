package androidx.compose.foundation.gestures;

import k1.C7459e;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC9142v f39108a;

    /* renamed from: b, reason: collision with root package name */
    private long f39109b;

    public U() {
        this(null);
    }

    public final C7459e a(@NotNull x1.x xVar, float f7) {
        float abs;
        long a11;
        long k11 = C7459e.k(this.f39109b, C7459e.j(xVar.f(), xVar.i()));
        this.f39109b = k11;
        EnumC9142v enumC9142v = this.f39108a;
        if (enumC9142v == null) {
            abs = C7459e.e(k11);
        } else {
            abs = Math.abs(enumC9142v == EnumC9142v.Horizontal ? C7459e.g(k11) : C7459e.h(k11));
        }
        if (abs < f7) {
            return null;
        }
        if (enumC9142v == null) {
            long j11 = this.f39109b;
            a11 = C7459e.j(this.f39109b, C7459e.l(f7, C7459e.c(C7459e.e(j11), j11)));
        } else {
            long j12 = this.f39109b;
            EnumC9142v enumC9142v2 = EnumC9142v.Horizontal;
            float g10 = enumC9142v == enumC9142v2 ? C7459e.g(j12) : C7459e.h(j12);
            long j13 = this.f39109b;
            float signum = g10 - (Math.signum(enumC9142v == enumC9142v2 ? C7459e.g(j13) : C7459e.h(j13)) * f7);
            long j14 = this.f39109b;
            float h11 = enumC9142v == enumC9142v2 ? C7459e.h(j14) : C7459e.g(j14);
            a11 = enumC9142v == enumC9142v2 ? P9.a.a(signum, h11) : P9.a.a(h11, signum);
        }
        return C7459e.a(a11);
    }

    public final void b() {
        this.f39109b = 0L;
    }

    public U(EnumC9142v enumC9142v) {
        this.f39108a = enumC9142v;
        this.f39109b = 0L;
    }
}
