package R3;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends K3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f6046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f6047e;

    public k(int i7, int i8, d dVar, d dVar2) {
        this.f6044b = i7;
        this.f6045c = i8;
        this.f6046d = dVar;
        this.f6047e = dVar2;
    }

    public final int b() {
        d dVar = d.f6031o;
        int i7 = this.f6045c;
        d dVar2 = this.f6046d;
        if (dVar2 == dVar) {
            return i7;
        }
        if (dVar2 == d.f6028l) {
            return i7 + 5;
        }
        if (dVar2 == d.f6029m) {
            return i7 + 5;
        }
        if (dVar2 == d.f6030n) {
            return i7 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f6044b == this.f6044b && kVar.b() == b() && kVar.f6046d == this.f6046d && kVar.f6047e == this.f6047e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6044b), Integer.valueOf(this.f6045c), this.f6046d, this.f6047e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f6046d);
        sb.append(", hashType: ");
        sb.append(this.f6047e);
        sb.append(", ");
        sb.append(this.f6045c);
        sb.append("-byte tags, and ");
        return p031e1.k.g(sb, this.f6044b, "-byte key)");
    }
}
