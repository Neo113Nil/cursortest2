package L5;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4421b;

    public N(String str, Integer num) {
        this.f4420a = num;
        this.f4421b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n2 = (N) obj;
        if (this.f4420a.equals(n2.f4420a)) {
            return this.f4421b.equals(n2.f4421b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4421b.hashCode() + (this.f4420a.hashCode() * 31);
    }
}
