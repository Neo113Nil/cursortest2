package K3;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f3930e;

    public k(int i7, int i8, int i9, j jVar) {
        this.f3927b = i7;
        this.f3928c = i8;
        this.f3929d = i9;
        this.f3930e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f3927b == this.f3927b && kVar.f3928c == this.f3928c && kVar.f3929d == this.f3929d && kVar.f3930e == this.f3930e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3927b), Integer.valueOf(this.f3928c), Integer.valueOf(this.f3929d), this.f3930e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f3930e);
        sb.append(", ");
        sb.append(this.f3928c);
        sb.append("-byte IV, ");
        sb.append(this.f3929d);
        sb.append("-byte tag, and ");
        return p031e1.k.g(sb, this.f3927b, "-byte key)");
    }
}
