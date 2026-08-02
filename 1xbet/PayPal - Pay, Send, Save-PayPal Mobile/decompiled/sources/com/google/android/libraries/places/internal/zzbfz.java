package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfz {
    private static final com.google.android.libraries.places.internal.zzbfz zza = new com.google.android.libraries.places.internal.zzbfz(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzbfz() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    static com.google.android.libraries.places.internal.zzbfz zzc(com.google.android.libraries.places.internal.zzbfz zzbfzVar, com.google.android.libraries.places.internal.zzbfz zzbfzVar2) {
        int i = zzbfzVar.zzb + zzbfzVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zzbfzVar.zzc, i);
        java.lang.System.arraycopy(zzbfzVar2.zzc, 0, copyOf, zzbfzVar.zzb, zzbfzVar2.zzb);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzbfzVar.zzd, i);
        java.lang.System.arraycopy(zzbfzVar2.zzd, 0, copyOf2, zzbfzVar.zzb, zzbfzVar2.zzb);
        return new com.google.android.libraries.places.internal.zzbfz(i, copyOf, copyOf2, true);
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
        if (obj == null || !(obj instanceof com.google.android.libraries.places.internal.zzbfz)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbfz zzbfzVar = (com.google.android.libraries.places.internal.zzbfz) obj;
        int i = this.zzb;
        if (i == zzbfzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzbfzVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.zzd;
                    java.lang.Object[] objArr2 = zzbfzVar.zzd;
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

    final void zze() {
        if (!this.zzf) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    final void zzf(com.google.android.libraries.places.internal.zzbgl zzbglVar) throws java.io.IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzbglVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(com.google.android.libraries.places.internal.zzbgl zzbglVar) throws java.io.IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                java.lang.Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzbglVar.zzc(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 1) {
                    zzbglVar.zzj(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 2) {
                    zzbglVar.zzn(i4, (com.google.android.libraries.places.internal.zzbcl) obj);
                } else if (i3 == 3) {
                    zzbglVar.zzt(i4);
                    ((com.google.android.libraries.places.internal.zzbfz) obj).zzg(zzbglVar);
                    zzbglVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new java.lang.RuntimeException(new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type."));
                    }
                    zzbglVar.zzk(i4, ((java.lang.Integer) obj).intValue());
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
            int i4 = this.zzc[i3];
            com.google.android.libraries.places.internal.zzbcl zzbclVar = (com.google.android.libraries.places.internal.zzbcl) this.zzd[i3];
            int zzy = com.google.android.libraries.places.internal.zzbcu.zzy(8);
            int zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(16);
            int zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i4 >>> 3);
            int zzy4 = com.google.android.libraries.places.internal.zzbcu.zzy(24);
            int zzc = zzbclVar.zzc();
            i2 += zzy + zzy + zzy2 + zzy3 + zzy4 + com.google.android.libraries.places.internal.zzbcu.zzy(zzc) + zzc;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzy;
        int zzz;
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
                    i = com.google.android.libraries.places.internal.zzbcu.zzy(i6 << 3) + 8;
                } else if (i7 == 2) {
                    com.google.android.libraries.places.internal.zzbcl zzbclVar = (com.google.android.libraries.places.internal.zzbcl) this.zzd[i4];
                    int zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(i6 << 3);
                    int zzc = zzbclVar.zzc();
                    i = zzy2 + com.google.android.libraries.places.internal.zzbcu.zzy(zzc) + zzc;
                } else if (i7 == 3) {
                    int zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i6 << 3);
                    zzy = zzy3 + zzy3;
                    zzz = ((com.google.android.libraries.places.internal.zzbfz) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new java.lang.IllegalStateException(new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type."));
                    }
                    i = com.google.android.libraries.places.internal.zzbcu.zzy(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                long longValue = ((java.lang.Long) this.zzd[i4]).longValue();
                zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i6 << 3);
                zzz = com.google.android.libraries.places.internal.zzbcu.zzz(longValue);
            }
            i = zzy + zzz;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    final void zzj(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            com.google.android.libraries.places.internal.zzbez.zzb(sb, i, java.lang.String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
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

    final com.google.android.libraries.places.internal.zzbfz zzl(com.google.android.libraries.places.internal.zzbfz zzbfzVar) {
        if (zzbfzVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzbfzVar.zzb;
        zzm(i);
        java.lang.System.arraycopy(zzbfzVar.zzc, 0, this.zzc, this.zzb, zzbfzVar.zzb);
        java.lang.System.arraycopy(zzbfzVar.zzd, 0, this.zzd, this.zzb, zzbfzVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    static com.google.android.libraries.places.internal.zzbfz zzb() {
        return new com.google.android.libraries.places.internal.zzbfz(0, new int[8], new java.lang.Object[8], true);
    }

    public static com.google.android.libraries.places.internal.zzbfz zza() {
        return zza;
    }

    private zzbfz(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }
}
