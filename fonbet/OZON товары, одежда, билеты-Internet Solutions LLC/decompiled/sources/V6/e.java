package V6;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final long f28343a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28344b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f28345a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f28346b = 0;

        a() {
        }

        public final e a() {
            return new e(this.f28345a, this.f28346b);
        }

        public final void b(long j11) {
            this.f28345a = j11;
        }

        public final void c(long j11) {
            this.f28346b = j11;
        }
    }

    static {
        new a().a();
    }

    e(long j11, long j12) {
        this.f28343a = j11;
        this.f28344b = j12;
    }

    public static a c() {
        return new a();
    }

    @u8.d
    public final long a() {
        return this.f28343a;
    }

    @u8.d
    public final long b() {
        return this.f28344b;
    }
}
