package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n12 extends AbstractC0823w0 implements Comparable {
    public static final Parcelable.Creator<n12> CREATOR = new jm1(17);

    /* JADX INFO: renamed from: j */
    public final String f5250j;

    /* JADX INFO: renamed from: k */
    public final long f5251k;

    /* JADX INFO: renamed from: l */
    public final boolean f5252l;

    /* JADX INFO: renamed from: m */
    public final double f5253m;

    /* JADX INFO: renamed from: n */
    public final String f5254n;

    /* JADX INFO: renamed from: o */
    public final byte[] f5255o;

    /* JADX INFO: renamed from: p */
    public final int f5256p;

    /* JADX INFO: renamed from: q */
    public final int f5257q;

    /* JADX INFO: renamed from: r */
    public final int f5258r;

    public n12(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.f5250j = str;
        this.f5251k = j;
        this.f5252l = z;
        this.f5253m = d;
        this.f5254n = str2;
        this.f5255o = bArr;
        this.f5256p = i;
        this.f5257q = i2;
        this.f5258r = i3;
    }

    /* JADX INFO: renamed from: b */
    public final void m3465b(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f5250j;
        sb.append(str);
        sb.append(", ");
        int i = this.f5256p;
        if (i == 1) {
            sb.append(this.f5251k);
        } else if (i == 2) {
            sb.append(this.f5252l);
        } else if (i == 3) {
            sb.append(this.f5253m);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.f5254n;
            p80.m3863h(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f5255o;
            p80.m3863h(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.f5257q);
        sb.append(", ");
        sb.append(this.f5258r);
        sb.append(")");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        n12 n12Var = (n12) obj;
        int iCompareTo = this.f5250j.compareTo(n12Var.f5250j);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = n12Var.f5256p;
        int i3 = this.f5256p;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.f5251k;
            long j2 = n12Var.f5251k;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = n12Var.f5252l;
            boolean z2 = this.f5252l;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.f5253m, n12Var.f5253m);
        }
        if (i3 == 4) {
            String str = n12Var.f5254n;
            String str2 = this.f5254n;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            throw new AssertionError(j11.m2774i(new StringBuilder(String.valueOf(i3).length() + 20), "Invalid enum value: ", i3));
        }
        byte[] bArr = n12Var.f5255o;
        byte[] bArr2 = this.f5255o;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n12) {
            n12 n12Var = (n12) obj;
            if (zg1.m5907r(this.f5250j, n12Var.f5250j)) {
                int i = n12Var.f5256p;
                int i2 = this.f5256p;
                if (i2 == i && this.f5257q == n12Var.f5257q && this.f5258r == n12Var.f5258r) {
                    if (i2 == 1) {
                        return this.f5251k == n12Var.f5251k;
                    }
                    if (i2 == 2) {
                        return this.f5252l == n12Var.f5252l;
                    }
                    if (i2 == 3) {
                        return this.f5253m == n12Var.f5253m;
                    }
                    if (i2 == 4) {
                        return zg1.m5907r(this.f5254n, n12Var.f5254n);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f5255o, n12Var.f5255o);
                    }
                    throw new AssertionError(j11.m2774i(new StringBuilder(String.valueOf(i2).length() + 20), "Invalid enum value: ", i2));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m3465b(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f5250j;
        boolean z = str == null;
        int iM4663q = t22.m4663q(parcel, 20293);
        if (!z) {
            t22.m4658l(parcel, 2, str);
        }
        long j = this.f5251k;
        if (j != 0) {
            t22.m4662p(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.f5252l) {
            t22.m4662p(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.f5253m;
        if (d != 0.0d) {
            t22.m4662p(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.f5254n;
        if (str2 != null) {
            t22.m4658l(parcel, 6, str2);
        }
        byte[] bArr = this.f5255o;
        if (bArr != null) {
            t22.m4653g(parcel, 7, bArr);
        }
        int i2 = this.f5256p;
        if (i2 != 0) {
            t22.m4662p(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.f5257q;
        if (i3 != 0) {
            t22.m4662p(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.f5258r;
        if (i4 != 0) {
            t22.m4662p(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        t22.m4665s(parcel, iM4663q);
    }
}
