package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzoi {
    private static final com.google.android.gms.internal.measurement.zzoi zza = new com.google.android.gms.internal.measurement.zzoi(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoi() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzoi(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static com.google.android.gms.internal.measurement.zzoi zza() {
        return zza;
    }

    static com.google.android.gms.internal.measurement.zzoi zzb() {
        return new com.google.android.gms.internal.measurement.zzoi(0, new int[8], new java.lang.Object[8], true);
    }

    static com.google.android.gms.internal.measurement.zzoi zzc(com.google.android.gms.internal.measurement.zzoi zzoiVar, com.google.android.gms.internal.measurement.zzoi zzoiVar2) {
        int i = zzoiVar.zzb + zzoiVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zzoiVar.zzc, i);
        java.lang.System.arraycopy(zzoiVar2.zzc, 0, copyOf, zzoiVar.zzb, zzoiVar2.zzb);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzoiVar.zzd, i);
        java.lang.System.arraycopy(zzoiVar2.zzd, 0, copyOf2, zzoiVar.zzb, zzoiVar2.zzb);
        return new com.google.android.gms.internal.measurement.zzoi(i, copyOf, copyOf2, true);
    }

    private final void zzm(int i) {
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
        if (obj == null || !(obj instanceof com.google.android.gms.internal.measurement.zzoi)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzoi zzoiVar = (com.google.android.gms.internal.measurement.zzoi) obj;
        int i = this.zzb;
        if (i == zzoiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzoiVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.zzd;
                    java.lang.Object[] objArr2 = zzoiVar.zzd;
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
        int i2 = i + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        java.lang.Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    final void zzf(com.google.android.gms.internal.measurement.zzou zzouVar) throws java.io.IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzouVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(com.google.android.gms.internal.measurement.zzou zzouVar) throws java.io.IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                java.lang.Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzouVar.zzc(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 1) {
                    zzouVar.zzj(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 2) {
                    zzouVar.zzn(i4, (com.google.android.gms.internal.measurement.zzlg) obj);
                } else if (i3 == 3) {
                    zzouVar.zzt(i4);
                    ((com.google.android.gms.internal.measurement.zzoi) obj).zzg(zzouVar);
                    zzouVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new java.lang.RuntimeException(new com.google.android.gms.internal.measurement.zzmp("Protocol message tag had invalid wire type."));
                    }
                    zzouVar.zzk(i4, ((java.lang.Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            com.google.android.gms.internal.measurement.zzlg zzlgVar = (com.google.android.gms.internal.measurement.zzlg) this.zzd[i3];
            int zzz = com.google.android.gms.internal.measurement.zzll.zzz(8);
            int zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(16) + com.google.android.gms.internal.measurement.zzll.zzz(i4);
            int zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(24);
            int zzc = zzlgVar.zzc();
            i2 += zzz + zzz + zzz2 + zzz3 + com.google.android.gms.internal.measurement.zzll.zzz(zzc) + zzc;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzz;
        int zzA;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((java.lang.Long) this.zzd[i4]).longValue();
                    i = com.google.android.gms.internal.measurement.zzll.zzz(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    com.google.android.gms.internal.measurement.zzlg zzlgVar = (com.google.android.gms.internal.measurement.zzlg) this.zzd[i4];
                    int zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(i8);
                    int zzc = zzlgVar.zzc();
                    i = zzz2 + com.google.android.gms.internal.measurement.zzll.zzz(zzc) + zzc;
                } else if (i7 == 3) {
                    int zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(i6 << 3);
                    zzz = zzz3 + zzz3;
                    zzA = ((com.google.android.gms.internal.measurement.zzoi) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new java.lang.IllegalStateException(new com.google.android.gms.internal.measurement.zzmp("Protocol message tag had invalid wire type."));
                    }
                    ((java.lang.Integer) this.zzd[i4]).intValue();
                    i = com.google.android.gms.internal.measurement.zzll.zzz(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((java.lang.Long) this.zzd[i4]).longValue();
                zzz = com.google.android.gms.internal.measurement.zzll.zzz(i9);
                zzA = com.google.android.gms.internal.measurement.zzll.zzA(longValue);
            }
            i = zzz + zzA;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    final void zzj(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            com.google.android.gms.internal.measurement.zznn.zzb(sb, i, java.lang.String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzk(int i, java.lang.Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final com.google.android.gms.internal.measurement.zzoi zzl(com.google.android.gms.internal.measurement.zzoi zzoiVar) {
        if (zzoiVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzoiVar.zzb;
        zzm(i);
        java.lang.System.arraycopy(zzoiVar.zzc, 0, this.zzc, this.zzb, zzoiVar.zzb);
        java.lang.System.arraycopy(zzoiVar.zzd, 0, this.zzd, this.zzb, zzoiVar.zzb);
        this.zzb = i;
        return this;
    }
}
