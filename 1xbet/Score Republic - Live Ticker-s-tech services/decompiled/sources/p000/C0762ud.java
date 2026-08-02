package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0762ud implements Iterable, Serializable {

    /* JADX INFO: renamed from: l */
    public static final C0762ud f7797l = new C0762ud(fe0.f2382b);

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0688sd f7798m;

    /* JADX INFO: renamed from: j */
    public int f7799j = 0;

    /* JADX INFO: renamed from: k */
    public final byte[] f7800k;

    static {
        f7798m = AbstractC0049b4.m589a() ? new o31(15) : new nc1(14);
    }

    public C0762ud(byte[] bArr) {
        bArr.getClass();
        this.f7800k = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m4907c(int i, int i2, int i3) {
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
    public static C0762ud m4908d(byte[] bArr, int i, int i2) {
        m4907c(i, i + i2, bArr.length);
        return new C0762ud(f7798m.mo3518d(bArr, i, i2));
    }

    /* JADX INFO: renamed from: b */
    public byte mo4064b(int i) {
        return this.f7800k[i];
    }

    /* JADX INFO: renamed from: e */
    public int mo4065e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0762ud) || size() != ((C0762ud) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0762ud)) {
            return obj.equals(this);
        }
        C0762ud c0762ud = (C0762ud) obj;
        int i = this.f7799j;
        int i2 = c0762ud.f7799j;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0762ud.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0762ud.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0762ud.size());
        }
        byte[] bArr = c0762ud.f7800k;
        int iMo4065e = mo4065e() + size;
        int iMo4065e2 = mo4065e();
        int iMo4065e3 = c0762ud.mo4065e();
        while (iMo4065e2 < iMo4065e) {
            if (this.f7800k[iMo4065e2] != bArr[iMo4065e3]) {
                return false;
            }
            iMo4065e2++;
            iMo4065e3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public byte mo4066f(int i) {
        return this.f7800k[i];
    }

    public final int hashCode() {
        int i = this.f7799j;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iMo4065e = mo4065e();
        int i2 = size;
        for (int i3 = iMo4065e; i3 < iMo4065e + size; i3++) {
            i2 = (i2 * 31) + this.f7800k[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f7799j = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0577pd(this);
    }

    public int size() {
        return this.f7800k.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = d71.m1108c(this);
        } else {
            int iM4907c = m4907c(0, 47, size());
            strConcat = d71.m1108c(iM4907c == 0 ? f7797l : new C0614qd(this.f7800k, mo4065e(), iM4907c)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return AbstractC0024an.m285h(sb, strConcat, "\">");
    }
}
