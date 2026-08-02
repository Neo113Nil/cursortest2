package N3;

import N3.H;
import java.io.IOException;

/* renamed from: N3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC3654e {

    /* renamed from: a, reason: collision with root package name */
    protected final a f18580a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f18581b;

    /* renamed from: c, reason: collision with root package name */
    protected c f18582c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18583d;

    /* renamed from: N3.e$a */
    public static class a implements H {

        /* renamed from: a, reason: collision with root package name */
        private final d f18584a;

        /* renamed from: b, reason: collision with root package name */
        private final long f18585b;

        /* renamed from: c, reason: collision with root package name */
        private final long f18586c;

        /* renamed from: d, reason: collision with root package name */
        private final long f18587d;

        /* renamed from: e, reason: collision with root package name */
        private final long f18588e;

        /* renamed from: f, reason: collision with root package name */
        private final long f18589f;

        public a(d dVar, long j11, long j12, long j13, long j14, long j15) {
            this.f18584a = dVar;
            this.f18585b = j11;
            this.f18586c = j12;
            this.f18587d = j13;
            this.f18588e = j14;
            this.f18589f = j15;
        }

        public final long e(long j11) {
            return this.f18584a.a(j11);
        }

        @Override // N3.H
        public final long getDurationUs() {
            return this.f18585b;
        }

        @Override // N3.H
        public final H.a getSeekPoints(long j11) {
            I i11 = new I(j11, c.h(this.f18584a.a(j11), 0L, this.f18586c, this.f18587d, this.f18588e, this.f18589f));
            return new H.a(i11, i11);
        }

        @Override // N3.H
        public final boolean isSeekable() {
            return true;
        }
    }

    /* renamed from: N3.e$b */
    public static final class b implements d {
        @Override // N3.AbstractC3654e.d
        public final long a(long j11) {
            return j11;
        }
    }

    /* renamed from: N3.e$c */
    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f18590a;

        /* renamed from: b, reason: collision with root package name */
        private final long f18591b;

        /* renamed from: c, reason: collision with root package name */
        private final long f18592c;

        /* renamed from: d, reason: collision with root package name */
        private long f18593d;

        /* renamed from: e, reason: collision with root package name */
        private long f18594e;

        /* renamed from: f, reason: collision with root package name */
        private long f18595f;

        /* renamed from: g, reason: collision with root package name */
        private long f18596g;

        /* renamed from: h, reason: collision with root package name */
        private long f18597h;

        protected c(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.f18590a = j11;
            this.f18591b = j12;
            this.f18593d = j13;
            this.f18594e = j14;
            this.f18595f = j15;
            this.f18596g = j16;
            this.f18592c = j17;
            this.f18597h = h(j12, j13, j14, j15, j16, j17);
        }

        static long a(c cVar) {
            return cVar.f18590a;
        }

        static long b(c cVar) {
            return cVar.f18595f;
        }

        static long c(c cVar) {
            return cVar.f18596g;
        }

        static long d(c cVar) {
            return cVar.f18597h;
        }

        static long e(c cVar) {
            return cVar.f18591b;
        }

        static void f(c cVar, long j11, long j12) {
            cVar.f18594e = j11;
            cVar.f18596g = j12;
            cVar.f18597h = h(cVar.f18591b, cVar.f18593d, j11, cVar.f18595f, j12, cVar.f18592c);
        }

        static void g(c cVar, long j11, long j12) {
            cVar.f18593d = j11;
            cVar.f18595f = j12;
            cVar.f18597h = h(cVar.f18591b, j11, cVar.f18594e, j12, cVar.f18596g, cVar.f18592c);
        }

        protected static long h(long j11, long j12, long j13, long j14, long j15, long j16) {
            if (j14 + 1 >= j15 || j12 + 1 >= j13) {
                return j14;
            }
            long j17 = (long) ((j11 - j12) * ((j15 - j14) / (j13 - j12)));
            return m3.N.j(((j17 + j14) - j16) - (j17 / 20), j14, j15 - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N3.e$d */
    public interface d {
        long a(long j11);
    }

    /* renamed from: N3.e$e, reason: collision with other inner class name */
    public static final class C0355e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0355e f18598d = new C0355e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f18599a;

        /* renamed from: b, reason: collision with root package name */
        private final long f18600b;

        /* renamed from: c, reason: collision with root package name */
        private final long f18601c;

        private C0355e(int i11, long j11, long j12) {
            this.f18599a = i11;
            this.f18600b = j11;
            this.f18601c = j12;
        }

        public static C0355e d(long j11, long j12) {
            return new C0355e(-1, j11, j12);
        }

        public static C0355e e(long j11) {
            return new C0355e(0, -9223372036854775807L, j11);
        }

        public static C0355e f(long j11, long j12) {
            return new C0355e(-2, j11, j12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N3.e$f */
    public interface f {
        C0355e a(C3659j c3659j, long j11) throws IOException;

        default void b() {
        }
    }

    protected AbstractC3654e(d dVar, f fVar, long j11, long j12, long j13, long j14, long j15, int i11) {
        this.f18581b = fVar;
        this.f18583d = i11;
        this.f18580a = new a(dVar, j11, j12, j13, j14, j15);
    }

    protected static int d(C3659j c3659j, long j11, G g10) {
        if (j11 == c3659j.getPosition()) {
            return 0;
        }
        g10.f18501a = j11;
        return 1;
    }

    public final a a() {
        return this.f18580a;
    }

    public final int b(C3659j c3659j, G g10) throws IOException {
        long d11;
        while (true) {
            c cVar = this.f18582c;
            G10.a.i(cVar);
            long b11 = c.b(cVar);
            long c11 = c.c(cVar);
            d11 = c.d(cVar);
            long j11 = c11 - b11;
            long j12 = this.f18583d;
            f fVar = this.f18581b;
            if (j11 <= j12) {
                this.f18582c = null;
                fVar.b();
                return d(c3659j, b11, g10);
            }
            long position = d11 - c3659j.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            c3659j.m((int) position, false);
            c3659j.e();
            C0355e a11 = fVar.a(c3659j, c.e(cVar));
            int i11 = a11.f18599a;
            if (i11 == -3) {
                this.f18582c = null;
                fVar.b();
                return d(c3659j, d11, g10);
            }
            if (i11 == -2) {
                c.g(cVar, a11.f18600b, a11.f18601c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = a11.f18601c - c3659j.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        c3659j.m((int) position2, false);
                    }
                    this.f18582c = null;
                    fVar.b();
                    return d(c3659j, a11.f18601c, g10);
                }
                c.f(cVar, a11.f18600b, a11.f18601c);
            }
        }
        return d(c3659j, d11, g10);
    }

    public final boolean c() {
        return this.f18582c != null;
    }

    public final void e(long j11) {
        c cVar = this.f18582c;
        if (cVar == null || c.a(cVar) != j11) {
            a aVar = this.f18580a;
            this.f18582c = new c(j11, aVar.e(j11), 0L, aVar.f18586c, aVar.f18587d, aVar.f18588e, aVar.f18589f);
        }
    }
}
