package A0;

import java.util.Arrays;
import x0.C1249b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C1249b f78a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f79b;

    public n(C1249b c1249b, byte[] bArr) {
        if (c1249b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f78a = c1249b;
        this.f79b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f78a.equals(nVar.f78a)) {
            return Arrays.equals(this.f79b, nVar.f79b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f78a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f79b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f78a + ", bytes=[...]}";
    }
}
