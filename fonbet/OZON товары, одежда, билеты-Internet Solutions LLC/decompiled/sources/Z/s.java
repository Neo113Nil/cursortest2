package Z;

import Z.a;

/* loaded from: classes8.dex */
final class s extends Z.a {

    /* renamed from: b, reason: collision with root package name */
    private final int f35277b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35278c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35279d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35280e;

    static final class a extends a.AbstractC0654a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f35281a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f35282b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f35283c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f35284d;

        @Override // Z.a.AbstractC0654a
        final Z.a a() {
            String str = this.f35281a == null ? " audioSource" : "";
            if (this.f35282b == null) {
                str = str.concat(" sampleRate");
            }
            if (this.f35283c == null) {
                str = U7.d.e(str, " channelCount");
            }
            if (this.f35284d == null) {
                str = U7.d.e(str, " audioFormat");
            }
            if (str.isEmpty()) {
                return new s(this.f35281a.intValue(), this.f35282b.intValue(), this.f35283c.intValue(), this.f35284d.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // Z.a.AbstractC0654a
        public final a.AbstractC0654a c(int i11) {
            this.f35284d = Integer.valueOf(i11);
            return this;
        }

        @Override // Z.a.AbstractC0654a
        public final a.AbstractC0654a d(int i11) {
            this.f35281a = Integer.valueOf(i11);
            return this;
        }

        @Override // Z.a.AbstractC0654a
        public final a.AbstractC0654a e(int i11) {
            this.f35283c = Integer.valueOf(i11);
            return this;
        }

        @Override // Z.a.AbstractC0654a
        public final a.AbstractC0654a f(int i11) {
            this.f35282b = Integer.valueOf(i11);
            return this;
        }
    }

    s(int i11, int i12, int i13, int i14) {
        this.f35277b = i11;
        this.f35278c = i12;
        this.f35279d = i13;
        this.f35280e = i14;
    }

    @Override // Z.a
    public final int b() {
        return this.f35280e;
    }

    @Override // Z.a
    public final int c() {
        return this.f35277b;
    }

    @Override // Z.a
    public final int e() {
        return this.f35279d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z.a)) {
            return false;
        }
        Z.a aVar = (Z.a) obj;
        return this.f35277b == aVar.c() && this.f35278c == aVar.f() && this.f35279d == aVar.e() && this.f35280e == aVar.b();
    }

    @Override // Z.a
    public final int f() {
        return this.f35278c;
    }

    public final int hashCode() {
        return ((((((this.f35277b ^ 1000003) * 1000003) ^ this.f35278c) * 1000003) ^ this.f35279d) * 1000003) ^ this.f35280e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSettings{audioSource=");
        sb2.append(this.f35277b);
        sb2.append(", sampleRate=");
        sb2.append(this.f35278c);
        sb2.append(", channelCount=");
        sb2.append(this.f35279d);
        sb2.append(", audioFormat=");
        return K00.b.e(this.f35280e, "}", sb2);
    }
}
