package V6;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final long f28347a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28348b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f28349a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f28350b = 0;

        a() {
        }

        public final f a() {
            return new f(this.f28349a, this.f28350b);
        }

        public final void b(long j11) {
            this.f28350b = j11;
        }

        public final void c(long j11) {
            this.f28349a = j11;
        }
    }

    static {
        new a().a();
    }

    f(long j11, long j12) {
        this.f28347a = j11;
        this.f28348b = j12;
    }

    public static a c() {
        return new a();
    }

    @u8.d
    public final long a() {
        return this.f28348b;
    }

    @u8.d
    public final long b() {
        return this.f28347a;
    }
}
