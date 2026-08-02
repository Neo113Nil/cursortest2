package F4;

import H4.h;
import L4.r;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2740a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2741b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2742c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2743d;

    public a(int i7, h hVar, byte[] bArr, byte[] bArr2) {
        this.f2740a = i7;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f2741b = hVar;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f2742c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f2743d = bArr2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        int compare = Integer.compare(this.f2740a, aVar.f2740a);
        if (compare != 0) {
            return compare;
        }
        int compareTo = this.f2741b.compareTo(aVar.f2741b);
        if (compareTo != 0) {
            return compareTo;
        }
        int b7 = r.b(this.f2742c, aVar.f2742c);
        return b7 != 0 ? b7 : r.b(this.f2743d, aVar.f2743d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2740a == aVar.f2740a && this.f2741b.equals(aVar.f2741b) && Arrays.equals(this.f2742c, aVar.f2742c) && Arrays.equals(this.f2743d, aVar.f2743d);
    }

    public final int hashCode() {
        return ((((((this.f2740a ^ 1000003) * 1000003) ^ this.f2741b.f3318a.hashCode()) * 1000003) ^ Arrays.hashCode(this.f2742c)) * 1000003) ^ Arrays.hashCode(this.f2743d);
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.f2740a + ", documentKey=" + this.f2741b + ", arrayValue=" + Arrays.toString(this.f2742c) + ", directionalValue=" + Arrays.toString(this.f2743d) + "}";
    }
}
