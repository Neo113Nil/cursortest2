package C8;

import C8.f;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f4480a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4481b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f4482c;

    static final class a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f4483a;

        /* renamed from: b, reason: collision with root package name */
        private Long f4484b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f4485c;

        @Override // C8.f.a
        public final f a() {
            String str = this.f4484b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.f4483a, this.f4484b.longValue(), this.f4485c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // C8.f.a
        public final f.a b(f.b bVar) {
            this.f4485c = bVar;
            return this;
        }

        @Override // C8.f.a
        public final f.a c(String str) {
            this.f4483a = str;
            return this;
        }

        @Override // C8.f.a
        public final f.a d(long j11) {
            this.f4484b = Long.valueOf(j11);
            return this;
        }
    }

    b(String str, long j11, f.b bVar) {
        this.f4480a = str;
        this.f4481b = j11;
        this.f4482c = bVar;
    }

    @Override // C8.f
    public final f.b b() {
        return this.f4482c;
    }

    @Override // C8.f
    public final String c() {
        return this.f4480a;
    }

    @Override // C8.f
    @NonNull
    public final long d() {
        return this.f4481b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f4480a;
        if (str == null) {
            if (fVar.c() != null) {
                return false;
            }
        } else if (!str.equals(fVar.c())) {
            return false;
        }
        if (this.f4481b != fVar.d()) {
            return false;
        }
        f.b bVar = this.f4482c;
        return bVar == null ? fVar.b() == null : bVar.equals(fVar.b());
    }

    public final int hashCode() {
        String str = this.f4480a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j11 = this.f4481b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        f.b bVar = this.f4482c;
        return (bVar != null ? bVar.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f4480a + ", tokenExpirationTimestamp=" + this.f4481b + ", responseCode=" + this.f4482c + "}";
    }
}
