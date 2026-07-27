package G0;

import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f389a;

    /* renamed from: b, reason: collision with root package name */
    public final long f390b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f391c;

    public c(long j3, long j4, Set set) {
        this.f389a = j3;
        this.f390b = j4;
        this.f391c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f389a == cVar.f389a && this.f390b == cVar.f390b && this.f391c.equals(cVar.f391c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f389a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j4 = this.f390b;
        return ((i3 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f391c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f389a + ", maxAllowedDelay=" + this.f390b + ", flags=" + this.f391c + "}";
    }
}
