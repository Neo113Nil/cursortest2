package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: vd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0799vd implements Iterable, Serializable {

    /* JADX INFO: renamed from: l */
    public static final C0799vd f8177l = new C0799vd(ge0.f2711b);

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0725td f8178m;

    /* JADX INFO: renamed from: j */
    public int f8179j = 0;

    /* JADX INFO: renamed from: k */
    public final byte[] f8180k;

    static {
        f8178m = AbstractC0085c4.m846a() ? new nc1(15) : new wa0(15);
    }

    public C0799vd(byte[] bArr) {
        bArr.getClass();
        this.f8180k = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m5147c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            C0270h1.m2193i(AbstractC0024an.m282e(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i2, i3, "End index: ", " >= "));
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static C0799vd m5148d(byte[] bArr, int i, int i2) {
        m5147c(i, i + i2, bArr.length);
        return new C0799vd(f8178m.mo3518d(bArr, i, i2));
    }

    /* JADX INFO: renamed from: b */
    public byte mo4338b(int i) {
        return this.f8180k[i];
    }

    /* JADX INFO: renamed from: e */
    public void mo4339e(int i, byte[] bArr) {
        System.arraycopy(this.f8180k, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0799vd) || size() != ((C0799vd) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0799vd)) {
            return obj.equals(this);
        }
        C0799vd c0799vd = (C0799vd) obj;
        int i = this.f8179j;
        int i2 = c0799vd.f8179j;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0799vd.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0799vd.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0799vd.size());
        }
        byte[] bArr = c0799vd.f8180k;
        int iMo4340f = mo4340f() + size;
        int iMo4340f2 = mo4340f();
        int iMo4340f3 = c0799vd.mo4340f();
        while (iMo4340f2 < iMo4340f) {
            if (this.f8180k[iMo4340f2] != bArr[iMo4340f3]) {
                return false;
            }
            iMo4340f2++;
            iMo4340f3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public int mo4340f() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public byte mo4341g(int i) {
        return this.f8180k[i];
    }

    public final int hashCode() {
        int i = this.f8179j;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iMo4340f = mo4340f();
        int i2 = size;
        for (int i3 = iMo4340f; i3 < iMo4340f + size; i3++) {
            i2 = (i2 * 31) + this.f8180k[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f8179j = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0577pd(this);
    }

    public int size() {
        return this.f8180k.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = xe1.m5637e(this);
        } else {
            int iM5147c = m5147c(0, 47, size());
            strConcat = xe1.m5637e(iM5147c == 0 ? f8177l : new C0651rd(this.f8180k, mo4340f(), iM5147c)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0024an.m285h(sb, strConcat, "\">");
    }
}
