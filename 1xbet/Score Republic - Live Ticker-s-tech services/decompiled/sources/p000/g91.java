package p000;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g91 implements Cloneable {

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int[] f2667j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object[] f2668k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ int f2669l;

    public g91() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f2667j = new int[i4];
        this.f2668k = new Object[i4];
    }

    /* JADX INFO: renamed from: a */
    public final void m2003a(int i, ColorStateList colorStateList) {
        int i2 = this.f2669l;
        if (i2 != 0) {
            int[] iArr = this.f2667j;
            if (i <= iArr[i2 - 1]) {
                int iM3008a = kd0.m3008a(i2, i, iArr);
                if (iM3008a >= 0) {
                    this.f2668k[iM3008a] = colorStateList;
                    return;
                }
                int i3 = ~iM3008a;
                int i4 = this.f2669l;
                if (i3 < i4) {
                    Object[] objArr = this.f2668k;
                    if (objArr[i3] == wm1.f8588c) {
                        this.f2667j[i3] = i;
                        objArr[i3] = colorStateList;
                        return;
                    }
                }
                if (i4 >= this.f2667j.length) {
                    int i5 = (i4 + 1) * 4;
                    for (int i6 = 4; i6 < 32; i6++) {
                        int i7 = (1 << i6) - 12;
                        if (i5 <= i7) {
                            i5 = i7;
                            break;
                        }
                    }
                    int i8 = i5 / 4;
                    this.f2667j = Arrays.copyOf(this.f2667j, i8);
                    this.f2668k = Arrays.copyOf(this.f2668k, i8);
                }
                int i9 = this.f2669l;
                if (i9 - i3 != 0) {
                    int[] iArr2 = this.f2667j;
                    int i10 = i3 + 1;
                    AbstractC0202f8.m1743t(i10, i3, i9, iArr2, iArr2);
                    Object[] objArr2 = this.f2668k;
                    AbstractC0202f8.m1744u(i10, i3, this.f2669l, objArr2, objArr2);
                }
                this.f2667j[i3] = i;
                this.f2668k[i3] = colorStateList;
                this.f2669l++;
                return;
            }
        }
        if (i2 >= this.f2667j.length) {
            int i11 = (i2 + 1) * 4;
            for (int i12 = 4; i12 < 32; i12++) {
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
            }
            int i14 = i11 / 4;
            this.f2667j = Arrays.copyOf(this.f2667j, i14);
            this.f2668k = Arrays.copyOf(this.f2668k, i14);
        }
        this.f2667j[i2] = i;
        this.f2668k[i2] = colorStateList;
        this.f2669l = i2 + 1;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        g91 g91Var = (g91) objClone;
        g91Var.f2667j = (int[]) this.f2667j.clone();
        g91Var.f2668k = (Object[]) this.f2668k.clone();
        return g91Var;
    }

    public final String toString() {
        int i = this.f2669l;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f2669l;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2667j[i3]);
            sb.append('=');
            Object obj = this.f2668k[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
