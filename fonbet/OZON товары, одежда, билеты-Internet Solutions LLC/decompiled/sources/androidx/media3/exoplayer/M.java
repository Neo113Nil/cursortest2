package androidx.media3.exoplayer;

import java.util.Objects;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final long f43657a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43658b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43659c;

    M(a aVar) {
        this.f43657a = aVar.f43660a;
        this.f43658b = aVar.f43661b;
        this.f43659c = aVar.f43662c;
    }

    public final a a() {
        return new a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m11 = (M) obj;
        return this.f43657a == m11.f43657a && this.f43658b == m11.f43658b && this.f43659c == m11.f43659c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f43657a), Float.valueOf(this.f43658b), Long.valueOf(this.f43659c));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f43660a;

        /* renamed from: b, reason: collision with root package name */
        private float f43661b;

        /* renamed from: c, reason: collision with root package name */
        private long f43662c;

        public a() {
            this.f43660a = -9223372036854775807L;
            this.f43661b = -3.4028235E38f;
            this.f43662c = -9223372036854775807L;
        }

        public final M d() {
            return new M(this);
        }

        public final void e(long j11) {
            G10.a.c(j11 >= 0 || j11 == -9223372036854775807L);
            this.f43662c = j11;
        }

        public final void f(long j11) {
            this.f43660a = j11;
        }

        public final void g(float f7) {
            G10.a.c(f7 > 0.0f || f7 == -3.4028235E38f);
            this.f43661b = f7;
        }

        a(M m11) {
            this.f43660a = m11.f43657a;
            this.f43661b = m11.f43658b;
            this.f43662c = m11.f43659c;
        }
    }
}
