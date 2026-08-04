package U5;

/* JADX INFO: renamed from: U5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0447n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0446m f6558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f6559b;

    public C0447n(EnumC0446m enumC0446m, l0 l0Var) {
        this.f6558a = enumC0446m;
        p113p3.f.k(l0Var, "status is null");
        this.f6559b = l0Var;
    }

    public static C0447n a(EnumC0446m enumC0446m) {
        p113p3.f.d("state is TRANSIENT_ERROR. Use forError() instead", enumC0446m != EnumC0446m.f6552c);
        return new C0447n(enumC0446m, l0.f6536e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0447n)) {
            return false;
        }
        C0447n c0447n = (C0447n) obj;
        return this.f6558a.equals(c0447n.f6558a) && this.f6559b.equals(c0447n.f6559b);
    }

    public final int hashCode() {
        return this.f6558a.hashCode() ^ this.f6559b.hashCode();
    }

    public final String toString() {
        l0 l0Var = this.f6559b;
        boolean zE = l0Var.e();
        EnumC0446m enumC0446m = this.f6558a;
        if (zE) {
            return enumC0446m.toString();
        }
        return enumC0446m + "(" + l0Var + ")";
    }
}
