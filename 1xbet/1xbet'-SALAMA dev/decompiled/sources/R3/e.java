package R3;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends K3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f6036d;

    public e(int i7, int i8, d dVar) {
        this.f6034b = i7;
        this.f6035c = i8;
        this.f6036d = dVar;
    }

    public final int b() {
        d dVar = d.f6023f;
        int i7 = this.f6035c;
        d dVar2 = this.f6036d;
        if (dVar2 == dVar) {
            return i7;
        }
        if (dVar2 == d.f6020c) {
            return i7 + 5;
        }
        if (dVar2 == d.f6021d) {
            return i7 + 5;
        }
        if (dVar2 == d.f6022e) {
            return i7 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f6034b == this.f6034b && eVar.b() == b() && eVar.f6036d == this.f6036d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6034b), Integer.valueOf(this.f6035c), this.f6036d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f6036d);
        sb.append(", ");
        sb.append(this.f6035c);
        sb.append("-byte tags, and ");
        return p031e1.k.g(sb, this.f6034b, "-byte key)");
    }
}
