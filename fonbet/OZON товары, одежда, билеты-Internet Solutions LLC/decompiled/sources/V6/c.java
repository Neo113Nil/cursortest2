package V6;

import u8.InterfaceC9984c;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f28335a;

    /* renamed from: b, reason: collision with root package name */
    private final b f28336b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f28337a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f28338b = b.REASON_UNKNOWN;

        a() {
        }

        public final c a() {
            return new c(this.f28337a, this.f28338b);
        }

        public final void b(long j11) {
            this.f28337a = j11;
        }

        public final void c(b bVar) {
            this.f28338b = bVar;
        }
    }

    public enum b implements InterfaceC9984c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i11) {
            this.number_ = i11;
        }

        @Override // u8.InterfaceC9984c
        public final int getNumber() {
            return this.number_;
        }
    }

    static {
        new a().a();
    }

    c(long j11, b bVar) {
        this.f28335a = j11;
        this.f28336b = bVar;
    }

    public static a c() {
        return new a();
    }

    @u8.d
    public final long a() {
        return this.f28335a;
    }

    @u8.d
    public final b b() {
        return this.f28336b;
    }
}
