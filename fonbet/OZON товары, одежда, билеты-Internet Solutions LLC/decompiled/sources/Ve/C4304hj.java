package Ve;

/* renamed from: Ve.hj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4304hj {

    /* renamed from: a, reason: collision with root package name */
    public final int f31199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31200b;

    public C4304hj(int i11, int i12) {
        this.f31199a = i11;
        this.f31200b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4304hj)) {
            return false;
        }
        C4304hj c4304hj = (C4304hj) obj;
        return this.f31199a == c4304hj.f31199a && this.f31200b == c4304hj.f31200b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31200b) + (Integer.hashCode(this.f31199a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubstringIndexes(firstIndex=");
        sb2.append(this.f31199a);
        sb2.append(", lastIndex=");
        return K00.b.e(this.f31200b, ")", sb2);
    }
}
