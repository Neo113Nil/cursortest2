package p000;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class of1 {

    /* JADX INFO: renamed from: f */
    public static final of1 f5717f = new of1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f5718a;

    /* JADX INFO: renamed from: b */
    public int[] f5719b;

    /* JADX INFO: renamed from: c */
    public Object[] f5720c;

    /* JADX INFO: renamed from: d */
    public int f5721d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f5722e;

    public of1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f5718a = i;
        this.f5719b = iArr;
        this.f5720c = objArr;
        this.f5722e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m3687a(int i) {
        int[] iArr = this.f5719b;
        if (i > iArr.length) {
            int i2 = this.f5718a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f5719b = Arrays.copyOf(iArr, i);
            this.f5720c = Arrays.copyOf(this.f5720c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3688b() {
        int iM2872h;
        int iM2874j;
        int iM2872h2;
        int i = this.f5721d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5718a; i3++) {
            int i4 = this.f5719b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f5720c[i3]).getClass();
                    iM2872h2 = C0360ji.m2872h(i5) + 8;
                } else if (i6 == 2) {
                    iM2872h2 = C0360ji.m2870f(i5, (C0799vd) this.f5720c[i3]);
                } else if (i6 == 3) {
                    iM2872h = C0360ji.m2872h(i5) * 2;
                    iM2874j = ((of1) this.f5720c[i3]).m3688b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(if0.m2597b());
                    }
                    ((Integer) this.f5720c[i3]).getClass();
                    iM2872h2 = C0360ji.m2872h(i5) + 4;
                }
                i2 = iM2872h2 + i2;
            } else {
                long jLongValue = ((Long) this.f5720c[i3]).longValue();
                iM2872h = C0360ji.m2872h(i5);
                iM2874j = C0360ji.m2874j(jLongValue);
            }
            i2 = iM2874j + iM2872h + i2;
        }
        this.f5721d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m3689c(int i, Object obj) {
        if (!this.f5722e) {
            dd0.m1164i();
            return;
        }
        m3687a(this.f5718a + 1);
        int[] iArr = this.f5719b;
        int i2 = this.f5718a;
        iArr[i2] = i;
        this.f5720c[i2] = obj;
        this.f5718a = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m3690d(nu1 nu1Var) throws IOException {
        if (this.f5718a == 0) {
            return;
        }
        nu1Var.getClass();
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        for (int i = 0; i < this.f5718a; i++) {
            int i2 = this.f5719b[i];
            Object obj = this.f5720c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0360ji.m2879E(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c0360ji.m2895t(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c0360ji.m2891p(i3, (C0799vd) obj);
            } else if (i4 == 3) {
                c0360ji.m2876B(i3, 3);
                ((of1) obj).m3690d(nu1Var);
                c0360ji.m2876B(i3, 4);
            } else {
                if (i4 != 5) {
                    dd0.m1163h(if0.m2597b());
                    return;
                }
                c0360ji.m2893r(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof of1)) {
            return false;
        }
        of1 of1Var = (of1) obj;
        int i = this.f5718a;
        if (i == of1Var.f5718a) {
            int[] iArr = this.f5719b;
            int[] iArr2 = of1Var.f5719b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f5720c;
            Object[] objArr2 = of1Var.f5720c;
            int i3 = this.f5718a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f5718a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f5719b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f5720c;
        int i6 = this.f5718a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
