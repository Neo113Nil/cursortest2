package K3;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class q extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f3943b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3944c;

    public q(int i7, j jVar) {
        this.f3943b = i7;
        this.f3944c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f3943b == this.f3943b && qVar.f3944c == this.f3944c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3943b), this.f3944c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f3944c);
        sb.append(", ");
        return e1.k.g(sb, this.f3943b, "-byte key)");
    }
}
