package G7;

/* loaded from: classes9.dex */
final class g extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f9735a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f9736b;

    /* synthetic */ g(String str, Long l11) {
        this.f9735a = str;
        this.f9736b = l11;
    }

    @Override // G7.d
    public final Long b() {
        return this.f9736b;
    }

    @Override // G7.d
    public final String c() {
        return this.f9735a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f9735a.equals(dVar.c())) {
            return false;
        }
        Long l11 = this.f9736b;
        return l11 == null ? dVar.b() == null : l11.equals(dVar.b());
    }

    public final int hashCode() {
        int hashCode = this.f9735a.hashCode() ^ 1000003;
        Long l11 = this.f9736b;
        return (hashCode * 1000003) ^ (l11 == null ? 0 : l11.hashCode());
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f9735a + ", cloudProjectNumber=" + this.f9736b + "}";
    }
}
