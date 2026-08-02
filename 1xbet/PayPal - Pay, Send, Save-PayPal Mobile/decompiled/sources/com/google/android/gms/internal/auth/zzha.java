package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzha {
    private static final com.google.android.gms.internal.auth.zzha zza = new com.google.android.gms.internal.auth.zzha(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private boolean zze;

    private zzha() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    static com.google.android.gms.internal.auth.zzha zzc(com.google.android.gms.internal.auth.zzha zzhaVar, com.google.android.gms.internal.auth.zzha zzhaVar2) {
        int i = zzhaVar.zzb + zzhaVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zzhaVar.zzc, i);
        java.lang.System.arraycopy(zzhaVar2.zzc, 0, copyOf, zzhaVar.zzb, zzhaVar2.zzb);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzhaVar.zzd, i);
        java.lang.System.arraycopy(zzhaVar2.zzd, 0, copyOf2, zzhaVar.zzb, zzhaVar2.zzb);
        return new com.google.android.gms.internal.auth.zzha(i, copyOf, copyOf2, true);
    }

    private final void zzi(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = java.util.Arrays.copyOf(iArr, i);
            this.zzd = java.util.Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.auth.zzha)) {
            return false;
        }
        com.google.android.gms.internal.auth.zzha zzhaVar = (com.google.android.gms.internal.auth.zzha) obj;
        int i = this.zzb;
        if (i == zzhaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhaVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.zzd;
                    java.lang.Object[] objArr2 = zzhaVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int[] iArr = this.zzc;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        java.lang.Object[] objArr = this.zzd;
        int i5 = this.zzb;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return ((((i + 527) * 31) + i3) * 31) + i2;
    }

    final com.google.android.gms.internal.auth.zzha zzb(com.google.android.gms.internal.auth.zzha zzhaVar) {
        if (zzhaVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzhaVar.zzb;
        zzi(i);
        java.lang.System.arraycopy(zzhaVar.zzc, 0, this.zzc, this.zzb, zzhaVar.zzb);
        java.lang.System.arraycopy(zzhaVar.zzd, 0, this.zzd, this.zzb, zzhaVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zze() {
        if (!this.zze) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    final void zzg(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            com.google.android.gms.internal.auth.zzfz.zzb(sb, i, java.lang.String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzh(int i, java.lang.Object obj) {
        zze();
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzf() {
        if (this.zze) {
            this.zze = false;
        }
    }

    static com.google.android.gms.internal.auth.zzha zzd() {
        return new com.google.android.gms.internal.auth.zzha(0, new int[8], new java.lang.Object[8], true);
    }

    public static com.google.android.gms.internal.auth.zzha zza() {
        return zza;
    }

    private zzha(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z;
    }
}
