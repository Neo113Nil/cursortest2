package C1;

import A1.X;
import E3.Q;
import android.util.Pair;
import java.util.Arrays;

/* renamed from: C1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103i {

    /* renamed from: c, reason: collision with root package name */
    public static final C0103i f1492c = new C0103i(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final C0103i f1493d = new C0103i(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final Q f1494e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1495a;

    /* renamed from: b, reason: collision with root package name */
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
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f1495a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f1495a = new int[0];
        }
        this.f1496b = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r8 != 5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(X x4) {
        int intValue;
        int o7;
        String str = x4.f283C;
        str.getClass();
        int b7 = v2.i.b(str, x4.f312z);
        Integer valueOf = Integer.valueOf(b7);
        Q q7 = f1494e;
        if (!q7.containsKey(valueOf)) {
            return null;
        }
        int[] iArr = this.f1495a;
        int i7 = 6;
        if (b7 == 18 && Arrays.binarySearch(iArr, 18) < 0) {
            b7 = 6;
        } else if (b7 == 8 && Arrays.binarySearch(iArr, 8) < 0) {
            b7 = 7;
        }
        if (Arrays.binarySearch(iArr, b7) < 0) {
            return null;
        }
        int i8 = x4.f296P;
        if (i8 == -1 || b7 == 18) {
            int i9 = x4.f297Q;
            if (i9 == -1) {
                i9 = 48000;
            }
            if (v2.t.f17153a >= 29) {
                intValue = AbstractC0102h.b(b7, i9);
            } else {
                Object obj = q7.get(Integer.valueOf(b7));
                intValue = ((Integer) (obj != null ? obj : 0)).intValue();
            }
            i8 = intValue;
        } else if (i8 > this.f1496b) {
            return null;
        }
        int i10 = v2.t.f17153a;
        if (i10 <= 28) {
            if (i8 == 7) {
                i7 = 8;
            } else if (i8 != 3) {
                if (i8 != 4) {
                }
            }
            if (i10 <= 26 && "fugu".equals(v2.t.f17154b) && i7 == 1) {
                i7 = 2;
            }
            o7 = v2.t.o(i7);
            if (o7 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(b7), Integer.valueOf(o7));
        }
        i7 = i8;
        if (i10 <= 26) {
            i7 = 2;
        }
        o7 = v2.t.o(i7);
        if (o7 != 0) {
        }
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
