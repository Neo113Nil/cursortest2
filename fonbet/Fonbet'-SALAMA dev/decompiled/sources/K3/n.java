package K3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class n extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f3935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3936c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3937d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3938e;

    public n(int i7, int i8, int i9, j jVar) {
        this.f3935b = i7;
        this.f3936c = i8;
        this.f3937d = i9;
        this.f3938e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f3935b == this.f3935b && nVar.f3936c == this.f3936c && nVar.f3937d == this.f3937d && nVar.f3938e == this.f3938e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3935b), Integer.valueOf(this.f3936c), Integer.valueOf(this.f3937d), this.f3938e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f3938e);
        sb.append(", ");
        sb.append(this.f3936c);
        sb.append("-byte IV, ");
        sb.append(this.f3937d);
        sb.append("-byte tag, and ");
        return e1.k.g(sb, this.f3935b, "-byte key)");
    }
}
