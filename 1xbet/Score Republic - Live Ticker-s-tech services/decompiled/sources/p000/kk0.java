package p000;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kk0 implements Cloneable {

    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean f4400j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ long[] f4401k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object[] f4402l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ int f4403m;

    /* JADX INFO: renamed from: a */
    public final void m3047a(long j, WeakReference weakReference) {
        Object obj = m80.f5001l;
        int iM3009b = kd0.m3009b(this.f4401k, this.f4403m, j);
        if (iM3009b >= 0) {
            this.f4402l[iM3009b] = weakReference;
            return;
        }
        int i = ~iM3009b;
        int i2 = this.f4403m;
        if (i < i2) {
            Object[] objArr = this.f4402l;
            if (objArr[i] == obj) {
                this.f4401k[i] = j;
                objArr[i] = weakReference;
                return;
            }
        }
        if (this.f4400j) {
            long[] jArr = this.f4401k;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f4402l;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != obj) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f4400j = false;
                this.f4403m = i3;
                i = ~kd0.m3009b(this.f4401k, i3, j);
            }
        }
        int i5 = this.f4403m;
        if (i5 >= this.f4401k.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f4401k = Arrays.copyOf(this.f4401k, i9);
            this.f4402l = Arrays.copyOf(this.f4402l, i9);
        }
        int i10 = this.f4403m - i;
        if (i10 != 0) {
            long[] jArr2 = this.f4401k;
            int i11 = i + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f4402l;
            AbstractC0202f8.m1744u(i11, i, this.f4403m, objArr3, objArr3);
        }
        this.f4401k[i] = j;
        this.f4402l[i] = weakReference;
        this.f4403m++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        kk0 kk0Var = (kk0) objClone;
        kk0Var.f4401k = (long[]) this.f4401k.clone();
        kk0Var.f4402l = (Object[]) this.f4402l.clone();
        return kk0Var;
    }

    public final String toString() {
        int i;
        int i2;
        Object obj = m80.f5001l;
        if (this.f4400j) {
            int i3 = this.f4403m;
            long[] jArr = this.f4401k;
            Object[] objArr = this.f4402l;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj2 = objArr[i5];
                if (obj2 != obj) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj2;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f4400j = false;
            this.f4403m = i4;
        }
        int i6 = this.f4403m;
        if (i6 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i6 * 28);
        sb.append('{');
        int i7 = this.f4403m;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            if (i8 < 0 || i8 >= (i = this.f4403m)) {
                C0270h1.m2186b(j11.m2773h("Expected index to be within 0..size()-1, but was ", i8));
                return null;
            }
            if (this.f4400j) {
                long[] jArr2 = this.f4401k;
                Object[] objArr2 = this.f4402l;
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj) {
                        if (i10 != i9) {
                            jArr2[i9] = jArr2[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f4400j = false;
                this.f4403m = i9;
            }
            sb.append(this.f4401k[i8]);
            sb.append('=');
            if (i8 < 0 || i8 >= (i2 = this.f4403m)) {
                C0270h1.m2186b(j11.m2773h("Expected index to be within 0..size()-1, but was ", i8));
                return null;
            }
            if (this.f4400j) {
                long[] jArr3 = this.f4401k;
                Object[] objArr3 = this.f4402l;
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    Object obj4 = objArr3[i12];
                    if (obj4 != obj) {
                        if (i12 != i11) {
                            jArr3[i11] = jArr3[i12];
                            objArr3[i11] = obj4;
                            objArr3[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f4400j = false;
                this.f4403m = i11;
            }
            Object obj5 = this.f4402l[i8];
            if (obj5 != sb) {
                sb.append(obj5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
