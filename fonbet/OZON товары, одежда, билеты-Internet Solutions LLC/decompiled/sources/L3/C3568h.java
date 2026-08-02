package L3;

import java.util.Arrays;

/* renamed from: L3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3568h {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16293c;

    /* renamed from: e, reason: collision with root package name */
    private int f16295e;

    /* renamed from: a, reason: collision with root package name */
    private a f16291a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f16292b = new a();

    /* renamed from: d, reason: collision with root package name */
    private long f16294d = -9223372036854775807L;

    /* renamed from: L3.h$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f16296a;

        /* renamed from: b, reason: collision with root package name */
        private long f16297b;

        /* renamed from: c, reason: collision with root package name */
        private long f16298c;

        /* renamed from: d, reason: collision with root package name */
        private long f16299d;

        /* renamed from: e, reason: collision with root package name */
        private long f16300e;

        /* renamed from: f, reason: collision with root package name */
        private long f16301f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f16302g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f16303h;

        public final long a() {
            long j11 = this.f16300e;
            if (j11 == 0) {
                return 0L;
            }
            return this.f16301f / j11;
        }

        public final long b() {
            return this.f16301f;
        }

        public final boolean c() {
            long j11 = this.f16299d;
            if (j11 == 0) {
                return false;
            }
            return this.f16302g[(int) ((j11 - 1) % 15)];
        }

        public final boolean d() {
            return this.f16299d > 15 && this.f16303h == 0;
        }

        public final void e(long j11) {
            long j12 = this.f16299d;
            if (j12 == 0) {
                this.f16296a = j11;
            } else if (j12 == 1) {
                long j13 = j11 - this.f16296a;
                this.f16297b = j13;
                this.f16301f = j13;
                this.f16300e = 1L;
            } else {
                long j14 = j11 - this.f16298c;
                int i11 = (int) (j12 % 15);
                long abs = Math.abs(j14 - this.f16297b);
                boolean[] zArr = this.f16302g;
                if (abs <= 1000000) {
                    this.f16300e++;
                    this.f16301f += j14;
                    if (zArr[i11]) {
                        zArr[i11] = false;
                        this.f16303h--;
                    }
                } else if (!zArr[i11]) {
                    zArr[i11] = true;
                    this.f16303h++;
                }
            }
            this.f16299d++;
            this.f16298c = j11;
        }

        public final void f() {
            this.f16299d = 0L;
            this.f16300e = 0L;
            this.f16301f = 0L;
            this.f16303h = 0;
            Arrays.fill(this.f16302g, false);
        }
    }

    public final long a() {
        if (this.f16291a.d()) {
            return this.f16291a.a();
        }
        return -9223372036854775807L;
    }

    public final float b() {
        if (this.f16291a.d()) {
            return (float) (1.0E9d / this.f16291a.a());
        }
        return -1.0f;
    }

    public final int c() {
        return this.f16295e;
    }

    public final long d() {
        if (this.f16291a.d()) {
            return this.f16291a.b();
        }
        return -9223372036854775807L;
    }

    public final boolean e() {
        return this.f16291a.d();
    }

    public final void f(long j11) {
        this.f16291a.e(j11);
        if (this.f16291a.d()) {
            this.f16293c = false;
        } else if (this.f16294d != -9223372036854775807L) {
            if (!this.f16293c || this.f16292b.c()) {
                this.f16292b.f();
                this.f16292b.e(this.f16294d);
            }
            this.f16293c = true;
            this.f16292b.e(j11);
        }
        if (this.f16293c && this.f16292b.d()) {
            a aVar = this.f16291a;
            this.f16291a = this.f16292b;
            this.f16292b = aVar;
            this.f16293c = false;
        }
        this.f16294d = j11;
        this.f16295e = this.f16291a.d() ? 0 : this.f16295e + 1;
    }

    public final void g() {
        this.f16291a.f();
        this.f16292b.f();
        this.f16293c = false;
        this.f16294d = -9223372036854775807L;
        this.f16295e = 0;
    }
}
