package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nf1 {

    /* JADX INFO: renamed from: f */
    public static final nf1 f5398f = new nf1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f5399a;

    /* JADX INFO: renamed from: b */
    public int[] f5400b;

    /* JADX INFO: renamed from: c */
    public Object[] f5401c;

    /* JADX INFO: renamed from: d */
    public int f5402d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f5403e;

    public nf1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f5399a = i;
        this.f5400b = iArr;
        this.f5401c = objArr;
        this.f5403e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m3533a(int i) {
        int[] iArr = this.f5400b;
        if (i > iArr.length) {
            int i2 = this.f5399a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f5400b = Arrays.copyOf(iArr, i);
            this.f5401c = Arrays.copyOf(this.f5401c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3534b() {
        int iM3033c;
        int iM3035e;
        int iM3033c2;
        int i = this.f5402d;
        if (i != -1) {
            return i;
        }
        int iM279b = 0;
        for (int i2 = 0; i2 < this.f5399a; i2++) {
            int i3 = this.f5400b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        C0762ud c0762ud = (C0762ud) this.f5401c[i2];
                        int iM3033c3 = AbstractC0397ki.m3033c(i4);
                        int size = c0762ud.size();
                        iM279b = AbstractC0024an.m279b(size, size, iM3033c3, iM279b);
                    } else if (i5 == 3) {
                        iM3033c = AbstractC0397ki.m3033c(i4) * 2;
                        iM3035e = ((nf1) this.f5401c[i2]).m3534b();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(hf0.m2259b());
                        }
                        ((Integer) this.f5401c[i2]).getClass();
                        iM3033c2 = AbstractC0397ki.m3033c(i4) + 4;
                    }
                } else {
                    ((Long) this.f5401c[i2]).getClass();
                    iM3033c2 = AbstractC0397ki.m3033c(i4) + 8;
                }
                iM279b = iM3033c2 + iM279b;
            } else {
                long jLongValue = ((Long) this.f5401c[i2]).longValue();
                iM3033c = AbstractC0397ki.m3033c(i4);
                iM3035e = AbstractC0397ki.m3035e(jLongValue);
            }
            iM279b = iM3035e + iM3033c + iM279b;
        }
        this.f5402d = iM279b;
        return iM279b;
    }

    /* JADX INFO: renamed from: c */
    public final void m3535c(int i, Object obj) {
        if (!this.f5403e) {
            dd0.m1164i();
            return;
        }
        m3533a(this.f5399a + 1);
        int[] iArr = this.f5400b;
        int i2 = this.f5399a;
        iArr[i2] = i;
        this.f5401c[i2] = obj;
        this.f5399a = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m3536d(b90 b90Var) {
        if (this.f5399a == 0) {
            return;
        }
        b90Var.getClass();
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        for (int i = 0; i < this.f5399a; i++) {
            int i2 = this.f5400b[i];
            Object obj = this.f5401c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                abstractC0397ki.mo2078z(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                abstractC0397ki.mo2066n(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                abstractC0397ki.mo2062j(i3, (C0762ud) obj);
            } else if (i4 == 3) {
                abstractC0397ki.mo2075w(i3, 3);
                ((nf1) obj).m3536d(b90Var);
                abstractC0397ki.mo2075w(i3, 4);
            } else {
                if (i4 != 5) {
                    dd0.m1163h(hf0.m2259b());
                    return;
                }
                abstractC0397ki.mo2064l(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nf1)) {
            return false;
        }
        nf1 nf1Var = (nf1) obj;
        int i = this.f5399a;
        if (i == nf1Var.f5399a) {
            int[] iArr = this.f5400b;
            int[] iArr2 = nf1Var.f5400b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f5401c;
            Object[] objArr2 = nf1Var.f5401c;
            int i3 = this.f5399a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f5399a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f5400b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f5401c;
        int i6 = this.f5399a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
