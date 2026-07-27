package V0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final S0.c f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3214b;

    public k(S0.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f3213a = cVar;
        this.f3214b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f3213a.equals(kVar.f3213a)) {
            return Arrays.equals(this.f3214b, kVar.f3214b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3213a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3214b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f3213a + ", bytes=[...]}";
    }
}
