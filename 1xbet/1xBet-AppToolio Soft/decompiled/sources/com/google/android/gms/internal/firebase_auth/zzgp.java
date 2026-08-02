package com.google.android.gms.internal.firebase_auth;

/* loaded from: classes.dex */
public final class zzgp implements Cloneable {
    private static final zzgq zzxt = new zzgq();
    private int mSize;
    private boolean zzxu;
    private int[] zzxv;
    private zzgq[] zzxw;

    zzgp() {
        this(10);
    }

    private zzgp(int i) {
        this.zzxu = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.zzxv = new int[idealIntArraySize];
        this.zzxw = new zzgq[idealIntArraySize];
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

    private final int zzbd(int i) {
        int i2 = this.mSize - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.zzxv[i4];
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
        zzgp zzgpVar = new zzgp(i);
        System.arraycopy(this.zzxv, 0, zzgpVar.zzxv, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            zzgq[] zzgqVarArr = this.zzxw;
            if (zzgqVarArr[i2] != null) {
                zzgpVar.zzxw[i2] = (zzgq) zzgqVarArr[i2].clone();
            }
        }
        zzgpVar.mSize = i;
        return zzgpVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgp)) {
            return false;
        }
        zzgp zzgpVar = (zzgp) obj;
        int i = this.mSize;
        if (i != zzgpVar.mSize) {
            return false;
        }
        int[] iArr = this.zzxv;
        int[] iArr2 = zzgpVar.zzxv;
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
            zzgq[] zzgqVarArr = this.zzxw;
            zzgq[] zzgqVarArr2 = zzgpVar.zzxw;
            int i3 = this.mSize;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                }
                if (!zzgqVarArr[i4].equals(zzgqVarArr2[i4])) {
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
            i = (((i * 31) + this.zzxv[i2]) * 31) + this.zzxw[i2].hashCode();
        }
        return i;
    }

    final int size() {
        return this.mSize;
    }

    final void zza(int i, zzgq zzgqVar) {
        int zzbd = zzbd(i);
        if (zzbd >= 0) {
            this.zzxw[zzbd] = zzgqVar;
            return;
        }
        int i2 = zzbd ^ (-1);
        if (i2 < this.mSize) {
            zzgq[] zzgqVarArr = this.zzxw;
            if (zzgqVarArr[i2] == zzxt) {
                this.zzxv[i2] = i;
                zzgqVarArr[i2] = zzgqVar;
                return;
            }
        }
        int i3 = this.mSize;
        if (i3 >= this.zzxv.length) {
            int idealIntArraySize = idealIntArraySize(i3 + 1);
            int[] iArr = new int[idealIntArraySize];
            zzgq[] zzgqVarArr2 = new zzgq[idealIntArraySize];
            int[] iArr2 = this.zzxv;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            zzgq[] zzgqVarArr3 = this.zzxw;
            System.arraycopy(zzgqVarArr3, 0, zzgqVarArr2, 0, zzgqVarArr3.length);
            this.zzxv = iArr;
            this.zzxw = zzgqVarArr2;
        }
        int i4 = this.mSize;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.zzxv;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            zzgq[] zzgqVarArr4 = this.zzxw;
            System.arraycopy(zzgqVarArr4, i2, zzgqVarArr4, i5, this.mSize - i2);
        }
        this.zzxv[i2] = i;
        this.zzxw[i2] = zzgqVar;
        this.mSize++;
    }

    final zzgq zzbb(int i) {
        int zzbd = zzbd(i);
        if (zzbd < 0) {
            return null;
        }
        zzgq[] zzgqVarArr = this.zzxw;
        if (zzgqVarArr[zzbd] == zzxt) {
            return null;
        }
        return zzgqVarArr[zzbd];
    }

    final zzgq zzbc(int i) {
        return this.zzxw[i];
    }
}
