package Q6;

/* loaded from: classes9.dex */
final class a<T> extends d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f23004a;

    /* renamed from: b, reason: collision with root package name */
    private final e f23005b;

    /* renamed from: c, reason: collision with root package name */
    private final f f23006c;

    /* JADX WARN: Multi-variable type inference failed */
    a(Object obj, e eVar, f fVar) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f23004a = obj;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f23005b = eVar;
        this.f23006c = fVar;
    }

    @Override // Q6.d
    public final Integer a() {
        return null;
    }

    @Override // Q6.d
    public final T b() {
        return this.f23004a;
    }

    @Override // Q6.d
    public final e c() {
        return this.f23005b;
    }

    @Override // Q6.d
    public final f d() {
        return this.f23006c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.a() != null) {
            return false;
        }
        if (!this.f23004a.equals(dVar.b()) || !this.f23005b.equals(dVar.c())) {
            return false;
        }
        f fVar = this.f23006c;
        return fVar == null ? dVar.d() == null : fVar.equals(dVar.d());
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.f23004a.hashCode()) * 1000003) ^ this.f23005b.hashCode()) * 1000003;
        f fVar = this.f23006c;
        return (fVar == null ? 0 : fVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f23004a + ", priority=" + this.f23005b + ", productData=" + this.f23006c + "}";
    }
}
