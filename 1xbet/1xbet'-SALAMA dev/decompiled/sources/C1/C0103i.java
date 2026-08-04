package C1;

import A1.X;
import E3.Q;
import android.util.Pair;
import java.util.Arrays;

/* JADX INFO: renamed from: C1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0103i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0103i f1492c = new C0103i(new int[]{2}, 8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0103i f1493d = new C0103i(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q f1494e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1496b;

    static {
        B1.m mVar = new B1.m(4, 3);
        mVar.o(5, 6);
        mVar.o(17, 6);
        mVar.o(7, 6);
        mVar.o(18, 6);
        mVar.o(6, 8);
        mVar.o(8, 8);
        mVar.o(14, 8);
        f1494e = mVar.i();
    }

    public C0103i(int[] iArr, int i7) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f1495a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f1495a = new int[0];
        }
        this.f1496b = i7;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    public final Pair a(X x4) {
        int iIntValue;
        String str = x4.f283C;
        str.getClass();
        int iB = p151v2.i.b(str, x4.f312z);
        Integer numValueOf = Integer.valueOf(iB);
        Q q7 = f1494e;
        if (!q7.containsKey(numValueOf)) {
            return null;
        }
        int[] iArr = this.f1495a;
        int i7 = 6;
        if (iB == 18 && Arrays.binarySearch(iArr, 18) < 0) {
            iB = 6;
        } else if (iB == 8 && Arrays.binarySearch(iArr, 8) < 0) {
            iB = 7;
        }
        if (Arrays.binarySearch(iArr, iB) < 0) {
            return null;
        }
        int i8 = x4.f296P;
        if (i8 == -1 || iB == 18) {
            int i9 = x4.f297Q;
            if (i9 == -1) {
                i9 = 48000;
            }
            if (p151v2.t.f17159a >= 29) {
                iIntValue = AbstractC0102h.b(iB, i9);
            } else {
                Object obj = q7.get(Integer.valueOf(iB));
                iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
            }
            i8 = iIntValue;
        } else if (i8 > this.f1496b) {
            return null;
        }
        int i10 = p151v2.t.f17159a;
        if (i10 > 28) {
            i7 = i8;
        } else if (i8 == 7) {
            i7 = 8;
        } else if (i8 != 3 && i8 != 4 && i8 != 5) {
            i7 = i8;
        }
        if (i10 <= 26 && "fugu".equals(p151v2.t.f17160b) && i7 == 1) {
            i7 = 2;
        }
        int iO = p151v2.t.o(i7);
        if (iO == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iO));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0103i)) {
            return false;
        }
        C0103i c0103i = (C0103i) obj;
        return Arrays.equals(this.f1495a, c0103i.f1495a) && this.f1496b == c0103i.f1496b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f1495a) * 31) + this.f1496b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f1496b + ", supportedEncodings=" + Arrays.toString(this.f1495a) + "]";
    }
}
