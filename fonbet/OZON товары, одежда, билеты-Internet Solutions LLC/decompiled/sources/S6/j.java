package S6;

import S6.r;
import java.util.Arrays;

/* loaded from: classes9.dex */
final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    private final String f25915a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f25916b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.e f25917c;

    static final class a extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25918a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f25919b;

        /* renamed from: c, reason: collision with root package name */
        private Q6.e f25920c;

        @Override // S6.r.a
        public final r a() {
            String str = this.f25918a == null ? " backendName" : "";
            if (this.f25920c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new j(this.f25918a, this.f25919b, this.f25920c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // S6.r.a
        public final r.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f25918a = str;
            return this;
        }

        @Override // S6.r.a
        public final r.a c(byte[] bArr) {
            this.f25919b = bArr;
            return this;
        }

        @Override // S6.r.a
        public final r.a d(Q6.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f25920c = eVar;
            return this;
        }
    }

    j(String str, byte[] bArr, Q6.e eVar) {
        this.f25915a = str;
        this.f25916b = bArr;
        this.f25917c = eVar;
    }

    @Override // S6.r
    public final String b() {
        return this.f25915a;
    }

    @Override // S6.r
    public final byte[] c() {
        return this.f25916b;
    }

    @Override // S6.r
    public final Q6.e d() {
        return this.f25917c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f25915a.equals(rVar.b())) {
            return Arrays.equals(this.f25916b, rVar instanceof j ? ((j) rVar).f25916b : rVar.c()) && this.f25917c.equals(rVar.d());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f25915a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25916b)) * 1000003) ^ this.f25917c.hashCode();
    }
}
