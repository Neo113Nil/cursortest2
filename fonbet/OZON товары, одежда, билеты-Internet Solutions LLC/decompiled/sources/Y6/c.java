package Y6;

import Y6.e;
import java.util.Set;

/* loaded from: classes9.dex */
final class c extends e.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f34647a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34648b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<e.c> f34649c;

    static final class a extends e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f34650a;

        /* renamed from: b, reason: collision with root package name */
        private Long f34651b;

        /* renamed from: c, reason: collision with root package name */
        private Set<e.c> f34652c;

        @Override // Y6.e.b.a
        public final e.b a() {
            String str = this.f34650a == null ? " delta" : "";
            if (this.f34651b == null) {
                str = str.concat(" maxAllowedDelay");
            }
            if (this.f34652c == null) {
                str = U7.d.e(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f34650a.longValue(), this.f34651b.longValue(), this.f34652c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // Y6.e.b.a
        public final e.b.a b(long j11) {
            this.f34650a = Long.valueOf(j11);
            return this;
        }

        @Override // Y6.e.b.a
        public final e.b.a c(Set<e.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f34652c = set;
            return this;
        }

        @Override // Y6.e.b.a
        public final e.b.a d() {
            this.f34651b = 86400000L;
            return this;
        }
    }

    c(long j11, long j12, Set set) {
        this.f34647a = j11;
        this.f34648b = j12;
        this.f34649c = set;
    }

    @Override // Y6.e.b
    final long b() {
        return this.f34647a;
    }

    @Override // Y6.e.b
    final Set<e.c> c() {
        return this.f34649c;
    }

    @Override // Y6.e.b
    final long d() {
        return this.f34648b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.b)) {
            return false;
        }
        e.b bVar = (e.b) obj;
        return this.f34647a == bVar.b() && this.f34648b == bVar.d() && this.f34649c.equals(bVar.c());
    }

    public final int hashCode() {
        long j11 = this.f34647a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f34648b;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f34649c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f34647a + ", maxAllowedDelay=" + this.f34648b + ", flags=" + this.f34649c + "}";
    }
}
