package Z6;

import Z6.e;
import androidx.recyclerview.widget.m;

/* loaded from: classes9.dex */
final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    private final long f35609b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35610c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35611d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35612e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35613f;

    /* renamed from: Z6.a$a, reason: collision with other inner class name */
    static final class C0671a extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f35614a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f35615b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f35616c;

        /* renamed from: d, reason: collision with root package name */
        private Long f35617d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f35618e;

        final a a() {
            String str = this.f35614a == null ? " maxStorageSizeInBytes" : "";
            if (this.f35615b == null) {
                str = str.concat(" loadBatchSize");
            }
            if (this.f35616c == null) {
                str = U7.d.e(str, " criticalSectionEnterTimeoutMs");
            }
            if (this.f35617d == null) {
                str = U7.d.e(str, " eventCleanUpAge");
            }
            if (this.f35618e == null) {
                str = U7.d.e(str, " maxBlobByteSizePerRow");
            }
            if (str.isEmpty()) {
                return new a(this.f35614a.longValue(), this.f35617d.longValue(), this.f35615b.intValue(), this.f35616c.intValue(), this.f35618e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        final C0671a b() {
            this.f35616c = 10000;
            return this;
        }

        final C0671a c() {
            this.f35617d = 604800000L;
            return this;
        }

        final C0671a d() {
            this.f35615b = Integer.valueOf(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
            return this;
        }

        final C0671a e() {
            this.f35618e = 81920;
            return this;
        }

        final C0671a f() {
            this.f35614a = 10485760L;
            return this;
        }
    }

    a(long j11, long j12, int i11, int i12, int i13) {
        this.f35609b = j11;
        this.f35610c = i11;
        this.f35611d = i12;
        this.f35612e = j12;
        this.f35613f = i13;
    }

    @Override // Z6.e
    final int a() {
        return this.f35611d;
    }

    @Override // Z6.e
    final long b() {
        return this.f35612e;
    }

    @Override // Z6.e
    final int c() {
        return this.f35610c;
    }

    @Override // Z6.e
    final int d() {
        return this.f35613f;
    }

    @Override // Z6.e
    final long e() {
        return this.f35609b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f35609b == eVar.e() && this.f35610c == eVar.c() && this.f35611d == eVar.a() && this.f35612e == eVar.b() && this.f35613f == eVar.d();
    }

    public final int hashCode() {
        long j11 = this.f35609b;
        int i11 = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f35610c) * 1000003) ^ this.f35611d) * 1000003;
        long j12 = this.f35612e;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f35613f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f35609b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f35610c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f35611d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f35612e);
        sb2.append(", maxBlobByteSizePerRow=");
        return K00.b.e(this.f35613f, "}", sb2);
    }
}
