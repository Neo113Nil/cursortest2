package J3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3854a;

    public l(byte[] bArr) {
        this.f3854a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        byte[] bArr = this.f3854a;
        int length = bArr.length;
        byte[] bArr2 = lVar.f3854a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = lVar.f3854a[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f3854a, ((l) obj).f3854a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3854a);
    }

    public final String toString() {
        return Q0.a.w(this.f3854a);
    }
}
