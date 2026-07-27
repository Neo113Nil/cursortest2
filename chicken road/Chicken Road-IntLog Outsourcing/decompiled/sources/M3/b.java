package M3;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final int f1947b;

    public b(int i2) {
        this.f1947b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        b bVar = (b) ((g) obj);
        bVar.getClass();
        return this.f1947b == bVar.f1947b;
    }

    public final int hashCode() {
        return (-593379575) ^ this.f1947b;
    }

    public final String toString() {
        return "LogLimits{maxNumberOfAttributes=128, maxAttributeValueLength=" + this.f1947b + "}";
    }
}
