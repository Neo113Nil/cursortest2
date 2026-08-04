package X3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7473a;

    public a(byte[] bArr, int i7) {
        byte[] bArr2 = new byte[i7];
        this.f7473a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i7);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f7473a, this.f7473a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7473a);
    }

    public final String toString() {
        return "Bytes(" + Q0.a.w(this.f7473a) + ")";
    }
}
