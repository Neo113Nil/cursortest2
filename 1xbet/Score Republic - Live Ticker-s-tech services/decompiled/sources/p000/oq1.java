package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 {

    /* JADX INFO: renamed from: f */
    public static final oq1 f5843f = new oq1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f5844a;

    /* JADX INFO: renamed from: b */
    public int[] f5845b;

    /* JADX INFO: renamed from: c */
    public Object[] f5846c;

    /* JADX INFO: renamed from: d */
    public int f5847d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f5848e;

    public oq1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f5844a = i;
        this.f5845b = iArr;
        this.f5846c = objArr;
        this.f5848e = z;
    }

    /* JADX INFO: renamed from: a */
    public static oq1 m3748a() {
        return new oq1(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    public final void m3749b(jg0 jg0Var) {
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        if (this.f5844a != 0) {
            for (int i = 0; i < this.f5844a; i++) {
                int i2 = this.f5845b[i];
                Object obj = this.f5846c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ro1Var.mo3560h(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ro1Var.mo3561i(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ro1Var.mo3564l(i4, (ko1) obj);
                } else if (i3 == 3) {
                    ro1Var.mo3556d(i4, 3);
                    ((oq1) obj).m3749b(jg0Var);
                    ro1Var.mo3556d(i4, 4);
                } else {
                    if (i3 != 5) {
                        dd0.m1163h(new lp1());
                        return;
                    }
                    ro1Var.mo3559g(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3750c() {
        int iM4391a;
        int iM4392b;
        int iM4391a2;
        int i = this.f5847d;
        if (i != -1) {
            return i;
        }
        int iM2772g = 0;
        for (int i2 = 0; i2 < this.f5844a; i2++) {
            int i3 = this.f5845b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        ko1 ko1Var = (ko1) this.f5846c[i2];
                        int iM4391a3 = ro1.m4391a(i6);
                        int iMo2330c = ko1Var.mo2330c();
                        iM2772g = j11.m2772g(iMo2330c, iMo2330c, iM4391a3, iM2772g);
                    } else if (i5 == 3) {
                        int iM4391a4 = ro1.m4391a(i4 << 3);
                        iM4391a = iM4391a4 + iM4391a4;
                        iM4392b = ((oq1) this.f5846c[i2]).m3750c();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new lp1());
                        }
                        ((Integer) this.f5846c[i2]).getClass();
                        iM4391a2 = ro1.m4391a(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f5846c[i2]).getClass();
                    iM4391a2 = ro1.m4391a(i4 << 3) + 8;
                }
                iM2772g = iM4391a2 + iM2772g;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f5846c[i2]).longValue();
                iM4391a = ro1.m4391a(i7);
                iM4392b = ro1.m4392b(jLongValue);
            }
            iM2772g = iM4392b + iM4391a + iM2772g;
        }
        this.f5847d = iM2772g;
        return iM2772g;
    }

    /* JADX INFO: renamed from: d */
    public final void m3751d(int i, Object obj) {
        if (!this.f5848e) {
            dd0.m1164i();
            return;
        }
        m3752e(this.f5844a + 1);
        int[] iArr = this.f5845b;
        int i2 = this.f5844a;
        iArr[i2] = i;
        this.f5846c[i2] = obj;
        this.f5844a = i2 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m3752e(int i) {
        int[] iArr = this.f5845b;
        if (i > iArr.length) {
            int i2 = this.f5844a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f5845b = Arrays.copyOf(iArr, i);
            this.f5846c = Arrays.copyOf(this.f5846c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof oq1)) {
            oq1 oq1Var = (oq1) obj;
            int i = this.f5844a;
            if (i == oq1Var.f5844a) {
                int[] iArr = this.f5845b;
                int[] iArr2 = oq1Var.f5845b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.f5846c;
                Object[] objArr2 = oq1Var.f5846c;
                int i3 = this.f5844a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f5844a;
        int i2 = i + 527;
        int[] iArr = this.f5845b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f5846c;
        int i6 = this.f5844a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
