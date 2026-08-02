package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzacf implements Cloneable {
    private static final zzacg zzbzh = new zzacg();
    private int mSize;
    private boolean zzbzi;
    private int[] zzbzj;
    private zzacg[] zzbzk;

    zzacf() {
        this(10);
    }

    private zzacf(int i) {
        this.zzbzi = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzbzj = new int[idealIntArraySize];
        this.zzbzk = new zzacg[idealIntArraySize];
        this.mSize = 0;
    }

    private static int idealIntArraySize(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    private final int zzav(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzbzj[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.mSize;
        zzacf zzacfVar = new zzacf(i);
        System.arraycopy(this.zzbzj, 0, zzacfVar.zzbzj, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            zzacg[] zzacgVarArr = this.zzbzk;
            if (zzacgVarArr[i2] != null) {
                zzacfVar.zzbzk[i2] = (zzacg) zzacgVarArr[i2].clone();
            }
        }
        zzacfVar.mSize = i;
        return zzacfVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacf)) {
            return false;
        }
        zzacf zzacfVar = (zzacf) obj;
        int i = this.mSize;
        if (i != zzacfVar.mSize) {
            return false;
        }
        int[] iArr = this.zzbzj;
        int[] iArr2 = zzacfVar.zzbzj;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            zzacg[] zzacgVarArr = this.zzbzk;
            zzacg[] zzacgVarArr2 = zzacfVar.zzbzk;
            int i3 = this.mSize;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!zzacgVarArr[i4].equals(zzacgVarArr2[i4])) {
                    z2 = false;
                    break;
                }
                i4++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            i = (((i * 31) + this.zzbzj[i2]) * 31) + this.zzbzk[i2].hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    final int size() {
        return this.mSize;
    }

    final void zza(int i, zzacg zzacgVar) {
        int zzav = zzav(i);
        if (zzav >= 0) {
            this.zzbzk[zzav] = zzacgVar;
            return;
        }
        int i2 = zzav ^ (-1);
        if (i2 < this.mSize) {
            zzacg[] zzacgVarArr = this.zzbzk;
            if (zzacgVarArr[i2] == zzbzh) {
                this.zzbzj[i2] = i;
                zzacgVarArr[i2] = zzacgVar;
                return;
            }
        }
        int i3 = this.mSize;
        if (i3 >= this.zzbzj.length) {
            int idealIntArraySize = idealIntArraySize(i3 + 1);
            int[] iArr = new int[idealIntArraySize];
            zzacg[] zzacgVarArr2 = new zzacg[idealIntArraySize];
            int[] iArr2 = this.zzbzj;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzacg[] zzacgVarArr3 = this.zzbzk;
            System.arraycopy(zzacgVarArr3, 0, zzacgVarArr2, 0, zzacgVarArr3.length);
            this.zzbzj = iArr;
            this.zzbzk = zzacgVarArr2;
        }
        int i4 = this.mSize;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.zzbzj;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            zzacg[] zzacgVarArr4 = this.zzbzk;
            System.arraycopy(zzacgVarArr4, i2, zzacgVarArr4, i5, this.mSize - i2);
        }
        this.zzbzj[i2] = i;
        this.zzbzk[i2] = zzacgVar;
        this.mSize++;
    }

    final zzacg zzat(int i) {
        int zzav = zzav(i);
        if (zzav < 0) {
            return null;
        }
        zzacg[] zzacgVarArr = this.zzbzk;
        if (zzacgVarArr[zzav] == zzbzh) {
            return null;
        }
        return zzacgVarArr[zzav];
    }

    final zzacg zzau(int i) {
        return this.zzbzk[i];
    }
}
