package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m12 extends AbstractC0823w0 {
    public static final Parcelable.Creator<m12> CREATOR = new jm1(16);

    /* JADX INFO: renamed from: j */
    public final String f4947j;

    /* JADX INFO: renamed from: k */
    public final byte[] f4948k;

    /* JADX INFO: renamed from: l */
    public final byte[][] f4949l;

    /* JADX INFO: renamed from: m */
    public final byte[][] f4950m;

    /* JADX INFO: renamed from: n */
    public final byte[][] f4951n;

    /* JADX INFO: renamed from: o */
    public final byte[][] f4952o;

    /* JADX INFO: renamed from: p */
    public final int[] f4953p;

    /* JADX INFO: renamed from: q */
    public final byte[][] f4954q;

    /* JADX INFO: renamed from: r */
    public final int[] f4955r;

    /* JADX INFO: renamed from: s */
    public final byte[][] f4956s;

    public m12(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f4947j = str;
        this.f4948k = bArr;
        this.f4949l = bArr2;
        this.f4950m = bArr3;
        this.f4951n = bArr4;
        this.f4952o = bArr5;
        this.f4953p = iArr;
        this.f4954q = bArr6;
        this.f4955r = iArr2;
        this.f4956s = bArr7;
    }

    /* JADX INFO: renamed from: b */
    public static void m3319b(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            p80.m3863h(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    /* JADX INFO: renamed from: d */
    public static Set m3320d(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetM5985n = AbstractC0959zp.m5985n(length);
        for (byte[] bArr2 : bArr) {
            p80.m3863h(bArr2);
            hashSetM5985n.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetM5985n;
    }

    /* JADX INFO: renamed from: e */
    public static List m3321e(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new u12(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final Set m3322c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f4954q;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f4948k;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return m3320d((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objM5985n;
        Object objM5985n2;
        int length;
        int length2;
        if (obj instanceof m12) {
            m12 m12Var = (m12) obj;
            if (zg1.m5907r(this.f4947j, m12Var.f4947j) && zg1.m5907r(m3322c(), m12Var.m3322c()) && zg1.m5907r(m3320d(this.f4949l), m3320d(m12Var.f4949l)) && zg1.m5907r(m3320d(this.f4950m), m3320d(m12Var.f4950m)) && zg1.m5907r(m3320d(this.f4951n), m3320d(m12Var.f4951n)) && zg1.m5907r(m3320d(this.f4952o), m3320d(m12Var.f4952o))) {
                int[] iArr = this.f4953p;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objM5985n = Collections.EMPTY_SET;
                } else {
                    objM5985n = AbstractC0959zp.m5985n(length2);
                    for (int i : iArr) {
                        objM5985n.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = m12Var.f4953p;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objM5985n2 = Collections.EMPTY_SET;
                } else {
                    objM5985n2 = AbstractC0959zp.m5985n(length);
                    for (int i2 : iArr2) {
                        objM5985n2.add(Integer.valueOf(i2));
                    }
                }
                if (zg1.m5907r(objM5985n, objM5985n2) && zg1.m5907r(m3321e(this.f4955r), m3321e(m12Var.f4955r)) && zg1.m5907r(m3320d(this.f4956s), m3320d(m12Var.f4956s))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f4947j;
        sb.append(str == null ? "null" : AbstractC0024an.m286i(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.f4948k;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m3319b(sb, "GAIA=", this.f4949l);
        sb.append(", ");
        m3319b(sb, "PSEUDO=", this.f4950m);
        sb.append(", ");
        m3319b(sb, "ALWAYS=", this.f4951n);
        sb.append(", ");
        m3319b(sb, "OTHER=", this.f4952o);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f4953p));
        sb.append(", ");
        m3319b(sb, "directs=", this.f4954q);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m3321e(this.f4955r).toArray()));
        sb.append(", ");
        m3319b(sb, "external=", this.f4956s);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 2, this.f4947j);
        t22.m4653g(parcel, 3, this.f4948k);
        t22.m4654h(parcel, 4, this.f4949l);
        t22.m4654h(parcel, 5, this.f4950m);
        t22.m4654h(parcel, 6, this.f4951n);
        t22.m4654h(parcel, 7, this.f4952o);
        t22.m4656j(parcel, 8, this.f4953p);
        t22.m4654h(parcel, 9, this.f4954q);
        t22.m4656j(parcel, 10, this.f4955r);
        t22.m4654h(parcel, 11, this.f4956s);
        t22.m4665s(parcel, iM4663q);
    }
}
