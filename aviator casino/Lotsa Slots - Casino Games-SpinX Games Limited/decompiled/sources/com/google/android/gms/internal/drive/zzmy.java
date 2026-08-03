package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzmy {
    private static final com.google.android.gms.internal.drive.zzmy zzvr = new com.google.android.gms.internal.drive.zzmy(0, new int[0], new java.lang.Object[0], false);
    private int count;
    private boolean zznh;
    private int zzrr;
    private java.lang.Object[] zzue;
    private int[] zzvs;

    public static com.google.android.gms.internal.drive.zzmy zzfa() {
        return zzvr;
    }

    static com.google.android.gms.internal.drive.zzmy zzfb() {
        return new com.google.android.gms.internal.drive.zzmy();
    }

    static com.google.android.gms.internal.drive.zzmy zza(com.google.android.gms.internal.drive.zzmy zzmyVar, com.google.android.gms.internal.drive.zzmy zzmyVar2) {
        int i = zzmyVar.count + zzmyVar2.count;
        int[] copyOf = java.util.Arrays.copyOf(zzmyVar.zzvs, i);
        java.lang.System.arraycopy(zzmyVar2.zzvs, 0, copyOf, zzmyVar.count, zzmyVar2.count);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzmyVar.zzue, i);
        java.lang.System.arraycopy(zzmyVar2.zzue, 0, copyOf2, zzmyVar.count, zzmyVar2.count);
        return new com.google.android.gms.internal.drive.zzmy(i, copyOf, copyOf2, true);
    }

    private zzmy() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzmy(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zzrr = -1;
        this.count = i;
        this.zzvs = iArr;
        this.zzue = objArr;
        this.zznh = z;
    }

    public final void zzbp() {
        this.zznh = false;
    }

    final void zza(com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsj) {
            for (int i = this.count - 1; i >= 0; i--) {
                zznsVar.zza(this.zzvs[i] >>> 3, this.zzue[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zznsVar.zza(this.zzvs[i2] >>> 3, this.zzue[i2]);
        }
    }

    public final void zzb(com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        if (this.count == 0) {
            return;
        }
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsi) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzvs[i], this.zzue[i], zznsVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzvs[i2], this.zzue[i2], zznsVar);
        }
    }

    private static void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zznsVar.zzi(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zznsVar.zzc(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zznsVar.zza(i2, (com.google.android.gms.internal.drive.zzjc) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zznsVar.zzf(i2, ((java.lang.Integer) obj).intValue());
                return;
            }
            throw new java.lang.RuntimeException(com.google.android.gms.internal.drive.zzkq.zzdl());
        }
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsi) {
            zznsVar.zzak(i2);
            ((com.google.android.gms.internal.drive.zzmy) obj).zzb(zznsVar);
            zznsVar.zzal(i2);
        } else {
            zznsVar.zzal(i2);
            ((com.google.android.gms.internal.drive.zzmy) obj).zzb(zznsVar);
            zznsVar.zzak(i2);
        }
    }

    public final int zzfc() {
        int i = this.zzrr;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += com.google.android.gms.internal.drive.zzjr.zzd(this.zzvs[i3] >>> 3, (com.google.android.gms.internal.drive.zzjc) this.zzue[i3]);
        }
        this.zzrr = i2;
        return i2;
    }

    public final int zzcx() {
        int zze;
        int i = this.zzrr;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzvs[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = com.google.android.gms.internal.drive.zzjr.zze(i5, ((java.lang.Long) this.zzue[i3]).longValue());
            } else if (i6 == 1) {
                zze = com.google.android.gms.internal.drive.zzjr.zzg(i5, ((java.lang.Long) this.zzue[i3]).longValue());
            } else if (i6 == 2) {
                zze = com.google.android.gms.internal.drive.zzjr.zzc(i5, (com.google.android.gms.internal.drive.zzjc) this.zzue[i3]);
            } else if (i6 == 3) {
                zze = (com.google.android.gms.internal.drive.zzjr.zzab(i5) << 1) + ((com.google.android.gms.internal.drive.zzmy) this.zzue[i3]).zzcx();
            } else if (i6 == 5) {
                zze = com.google.android.gms.internal.drive.zzjr.zzj(i5, ((java.lang.Integer) this.zzue[i3]).intValue());
            } else {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.drive.zzkq.zzdl());
            }
            i2 += zze;
        }
        this.zzrr = i2;
        return i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.drive.zzmy)) {
            return false;
        }
        com.google.android.gms.internal.drive.zzmy zzmyVar = (com.google.android.gms.internal.drive.zzmy) obj;
        int i = this.count;
        if (i == zzmyVar.count) {
            int[] iArr = this.zzvs;
            int[] iArr2 = zzmyVar.zzvs;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    java.lang.Object[] objArr = this.zzue;
                    java.lang.Object[] objArr2 = zzmyVar.zzue;
                    int i3 = this.count;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzvs;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        java.lang.Object[] objArr = this.zzue;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    final void zza(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            com.google.android.gms.internal.drive.zzlt.zza(sb, i, java.lang.String.valueOf(this.zzvs[i2] >>> 3), this.zzue[i2]);
        }
    }

    final void zzb(int i, java.lang.Object obj) {
        if (!this.zznh) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i2 = this.count;
        int[] iArr = this.zzvs;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzvs = java.util.Arrays.copyOf(iArr, i3);
            this.zzue = java.util.Arrays.copyOf(this.zzue, i3);
        }
        int[] iArr2 = this.zzvs;
        int i4 = this.count;
        iArr2[i4] = i;
        this.zzue[i4] = obj;
        this.count = i4 + 1;
    }
}
