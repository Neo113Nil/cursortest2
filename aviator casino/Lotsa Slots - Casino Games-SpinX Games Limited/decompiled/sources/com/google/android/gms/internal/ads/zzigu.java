package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzigu {
    private static final com.google.android.gms.internal.ads.zzigu zza = new com.google.android.gms.internal.ads.zzigu(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzigu() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzigu(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static com.google.android.gms.internal.ads.zzigu zza() {
        return zza;
    }

    static com.google.android.gms.internal.ads.zzigu zzb() {
        return new com.google.android.gms.internal.ads.zzigu();
    }

    static com.google.android.gms.internal.ads.zzigu zzc(com.google.android.gms.internal.ads.zzigu zziguVar, com.google.android.gms.internal.ads.zzigu zziguVar2) {
        int i = zziguVar.zzb + zziguVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zziguVar.zzc, i);
        java.lang.System.arraycopy(zziguVar2.zzc, 0, copyOf, zziguVar.zzb, zziguVar2.zzb);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zziguVar.zzd, i);
        java.lang.System.arraycopy(zziguVar2.zzd, 0, copyOf2, zziguVar.zzb, zziguVar2.zzb);
        return new com.google.android.gms.internal.ads.zzigu(i, copyOf, copyOf2, true);
    }

    private final void zzn(int i) {
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
        if (obj == null || !(obj instanceof com.google.android.gms.internal.ads.zzigu)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzigu zziguVar = (com.google.android.gms.internal.ads.zzigu) obj;
        int i = this.zzb;
        if (i == zziguVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziguVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.zzd;
                    java.lang.Object[] objArr2 = zziguVar.zzd;
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

    final void zzf(com.google.android.gms.internal.ads.zzihi zzihiVar) throws java.io.IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzihiVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(com.google.android.gms.internal.ads.zzihi zzihiVar) throws java.io.IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                java.lang.Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzihiVar.zzc(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 1) {
                    zzihiVar.zzj(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 2) {
                    zzihiVar.zzn(i4, (com.google.android.gms.internal.ads.zzida) obj);
                } else if (i3 == 3) {
                    zzihiVar.zzt(i4);
                    ((com.google.android.gms.internal.ads.zzigu) obj).zzg(zzihiVar);
                    zzihiVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new java.lang.RuntimeException(new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type."));
                    }
                    zzihiVar.zzk(i4, ((java.lang.Integer) obj).intValue());
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
            com.google.android.gms.internal.ads.zzida zzidaVar = (com.google.android.gms.internal.ads.zzida) this.zzd[i3];
            int zzF = com.google.android.gms.internal.ads.zzidj.zzF(8);
            int zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(16) + com.google.android.gms.internal.ads.zzidj.zzF(i4);
            int zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(24);
            int zzb = zzidaVar.zzb();
            i2 += zzF + zzF + zzF2 + zzF3 + com.google.android.gms.internal.ads.zzidj.zzF(zzb) + zzb;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzF;
        int zzG;
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
                    i = com.google.android.gms.internal.ads.zzidj.zzF(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    com.google.android.gms.internal.ads.zzida zzidaVar = (com.google.android.gms.internal.ads.zzida) this.zzd[i4];
                    int zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(i8);
                    int zzb = zzidaVar.zzb();
                    i = zzF2 + com.google.android.gms.internal.ads.zzidj.zzF(zzb) + zzb;
                } else if (i7 == 3) {
                    int zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(i6 << 3);
                    zzF = zzF3 + zzF3;
                    zzG = ((com.google.android.gms.internal.ads.zzigu) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new java.lang.IllegalStateException(new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type."));
                    }
                    ((java.lang.Integer) this.zzd[i4]).intValue();
                    i = com.google.android.gms.internal.ads.zzidj.zzF(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((java.lang.Long) this.zzd[i4]).longValue();
                zzF = com.google.android.gms.internal.ads.zzidj.zzF(i9);
                zzG = com.google.android.gms.internal.ads.zzidj.zzG(longValue);
            }
            i = zzF + zzG;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    final void zzj(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            com.google.android.gms.internal.ads.zzifr.zzb(sb, i, java.lang.String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzk(int i, java.lang.Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final boolean zzl(int i, com.google.android.gms.internal.ads.zzide zzideVar) throws java.io.IOException {
        int zza2;
        zze();
        int i2 = i & 7;
        if (i2 == 0) {
            zzk(i, java.lang.Long.valueOf(zzideVar.zzg()));
            return true;
        }
        if (i2 == 1) {
            zzk(i, java.lang.Long.valueOf(zzideVar.zzi()));
            return true;
        }
        if (i2 == 2) {
            zzk(i, zzideVar.zzn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zzideVar.zzK();
                return false;
            }
            if (i2 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            zzk(i, java.lang.Integer.valueOf(zzideVar.zzj()));
            return true;
        }
        com.google.android.gms.internal.ads.zzigu zziguVar = new com.google.android.gms.internal.ads.zzigu();
        do {
            zza2 = zzideVar.zza();
            if (zza2 == 0) {
                break;
            }
        } while (zziguVar.zzl(zza2, zzideVar));
        zzideVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zziguVar);
        return true;
    }

    final com.google.android.gms.internal.ads.zzigu zzm(com.google.android.gms.internal.ads.zzigu zziguVar) {
        if (zziguVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zziguVar.zzb;
        zzn(i);
        java.lang.System.arraycopy(zziguVar.zzc, 0, this.zzc, this.zzb, zziguVar.zzb);
        java.lang.System.arraycopy(zziguVar.zzd, 0, this.zzd, this.zzb, zziguVar.zzb);
        this.zzb = i;
        return this;
    }
}
