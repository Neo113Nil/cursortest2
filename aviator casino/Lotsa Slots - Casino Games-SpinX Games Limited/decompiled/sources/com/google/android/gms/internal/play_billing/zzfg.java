package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzfg {
    private static final com.google.android.gms.internal.play_billing.zzfg zza = new com.google.android.gms.internal.play_billing.zzfg(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzfg() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzfg(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static com.google.android.gms.internal.play_billing.zzfg zzc() {
        return zza;
    }

    static com.google.android.gms.internal.play_billing.zzfg zze(com.google.android.gms.internal.play_billing.zzfg zzfgVar, com.google.android.gms.internal.play_billing.zzfg zzfgVar2) {
        int i = zzfgVar.zzb + zzfgVar2.zzb;
        int[] copyOf = java.util.Arrays.copyOf(zzfgVar.zzc, i);
        java.lang.System.arraycopy(zzfgVar2.zzc, 0, copyOf, zzfgVar.zzb, zzfgVar2.zzb);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(zzfgVar.zzd, i);
        java.lang.System.arraycopy(zzfgVar2.zzd, 0, copyOf2, zzfgVar.zzb, zzfgVar2.zzb);
        return new com.google.android.gms.internal.play_billing.zzfg(i, copyOf, copyOf2, true);
    }

    static com.google.android.gms.internal.play_billing.zzfg zzf() {
        return new com.google.android.gms.internal.play_billing.zzfg(0, new int[8], new java.lang.Object[8], true);
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
        if (obj == null || !(obj instanceof com.google.android.gms.internal.play_billing.zzfg)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.zzfg zzfgVar = (com.google.android.gms.internal.play_billing.zzfg) obj;
        int i = this.zzb;
        if (i == zzfgVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzfgVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.zzd;
                    java.lang.Object[] objArr2 = zzfgVar.zzd;
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

    public final int zza() {
        int zzw;
        int zzx;
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
                    i = com.google.android.gms.internal.play_billing.zzby.zzw(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    com.google.android.gms.internal.play_billing.zzbq zzbqVar = (com.google.android.gms.internal.play_billing.zzbq) this.zzd[i4];
                    int zzw2 = com.google.android.gms.internal.play_billing.zzby.zzw(i8);
                    int zzd = zzbqVar.zzd();
                    i = zzw2 + com.google.android.gms.internal.play_billing.zzby.zzw(zzd) + zzd;
                } else if (i7 == 3) {
                    int zzw3 = com.google.android.gms.internal.play_billing.zzby.zzw(i6 << 3);
                    zzw = zzw3 + zzw3;
                    zzx = ((com.google.android.gms.internal.play_billing.zzfg) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.zzdc.zza());
                    }
                    ((java.lang.Integer) this.zzd[i4]).intValue();
                    i = com.google.android.gms.internal.play_billing.zzby.zzw(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((java.lang.Long) this.zzd[i4]).longValue();
                zzw = com.google.android.gms.internal.play_billing.zzby.zzw(i9);
                zzx = com.google.android.gms.internal.play_billing.zzby.zzx(longValue);
            }
            i = zzw + zzx;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            com.google.android.gms.internal.play_billing.zzbq zzbqVar = (com.google.android.gms.internal.play_billing.zzbq) this.zzd[i3];
            int zzw = com.google.android.gms.internal.play_billing.zzby.zzw(8);
            int zzw2 = com.google.android.gms.internal.play_billing.zzby.zzw(16) + com.google.android.gms.internal.play_billing.zzby.zzw(i4);
            int zzw3 = com.google.android.gms.internal.play_billing.zzby.zzw(24);
            int zzd = zzbqVar.zzd();
            i2 += zzw + zzw + zzw2 + zzw3 + com.google.android.gms.internal.play_billing.zzby.zzw(zzd) + zzd;
        }
        this.zze = i2;
        return i2;
    }

    final com.google.android.gms.internal.play_billing.zzfg zzd(com.google.android.gms.internal.play_billing.zzfg zzfgVar) {
        if (zzfgVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzfgVar.zzb;
        zzm(i);
        java.lang.System.arraycopy(zzfgVar.zzc, 0, this.zzc, this.zzb, zzfgVar.zzb);
        java.lang.System.arraycopy(zzfgVar.zzd, 0, this.zzd, this.zzb, zzfgVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            com.google.android.gms.internal.play_billing.zzee.zzb(sb, i, java.lang.String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, java.lang.Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(com.google.android.gms.internal.play_billing.zzfx zzfxVar) throws java.io.IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzfxVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(com.google.android.gms.internal.play_billing.zzfx zzfxVar) throws java.io.IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                java.lang.Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzfxVar.zzt(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 1) {
                    zzfxVar.zzm(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 2) {
                    zzfxVar.zzd(i4, (com.google.android.gms.internal.play_billing.zzbq) obj);
                } else if (i3 == 3) {
                    zzfxVar.zzF(i4);
                    ((com.google.android.gms.internal.play_billing.zzfg) obj).zzl(zzfxVar);
                    zzfxVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new java.lang.RuntimeException(com.google.android.gms.internal.play_billing.zzdc.zza());
                    }
                    zzfxVar.zzk(i4, ((java.lang.Integer) obj).intValue());
                }
            }
        }
    }
}
