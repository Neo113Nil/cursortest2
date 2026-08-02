package Q6;

/* loaded from: classes9.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f23007a;

    b(Integer num) {
        this.f23007a = num;
    }

    @Override // Q6.f
    public final Integer a() {
        return this.f23007a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.f23007a;
        Integer a11 = ((f) obj).a();
        return num == null ? a11 == null : num.equals(a11);
    }

    public final int hashCode() {
        Integer num = this.f23007a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return Ep.a.c(new StringBuilder("ProductData{productId="), this.f23007a, "}");
    }
}
