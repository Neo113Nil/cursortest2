package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
public final class zzams implements zzann {
    private final zzaly zza;
    private final zzec zzb = new zzec(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzek zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzams(zzaly zzalyVar) {
        this.zza = zzalyVar;
    }

    private final void zze(int i7) {
        this.zzc = i7;
        this.zzd = 0;
    }

    private final boolean zzf(zzed zzedVar, byte[] bArr, int i7) {
        int min = Math.min(zzedVar.zzb(), i7 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzedVar.zzM(min);
        } else {
            zzedVar.zzH(bArr, this.zzd, min);
        }
        int i8 = this.zzd + min;
        this.zzd = i8;
        return i8 == i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.google.android.gms.internal.ads.zzec] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.google.android.gms.internal.ads.zzaly] */
    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar, int i7) {
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        long j;
        int i12;
        zzcv.zzb(this.zze);
        int i13 = -1;
        int i14 = 2;
        ?? r62 = 0;
        int i15 = 1;
        if ((i7 & 1) != 0) {
            int i16 = this.zzc;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    int i17 = this.zzj;
                    if (i17 != -1) {
                        zzdq.zzf("PesReader", "Unexpected start indicator: expected " + i17 + " more bytes");
                    }
                    this.zza.zzc(zzedVar.zze() == 0);
                } else {
                    zzdq.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i18 = i7;
        while (zzedVar.zzb() > 0) {
            int i19 = this.zzc;
            if (i19 == 0) {
                i8 = i14;
                z4 = r62;
                i9 = i15;
                i10 = i13;
                zzedVar.zzM(zzedVar.zzb());
            } else if (i19 != i15) {
                if (i19 != i14) {
                    int zzb = zzedVar.zzb();
                    int i20 = this.zzj;
                    int i21 = i20 == i13 ? r62 : zzb - i20;
                    if (i21 > 0) {
                        zzb -= i21;
                        zzedVar.zzK(zzedVar.zzd() + zzb);
                    }
                    this.zza.zza(zzedVar);
                    int i22 = this.zzj;
                    if (i22 != i13) {
                        int i23 = i22 - zzb;
                        this.zzj = i23;
                        if (i23 == 0) {
                            this.zza.zzc(r62);
                            zze(i15);
                        }
                    }
                } else {
                    if (zzf(zzedVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzedVar, null, this.zzi)) {
                        this.zzb.zzl(r62);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzn(i15);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i15);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzn(i15);
                            if (this.zzh || !this.zzg) {
                                i12 = zzd2;
                            } else {
                                this.zzb.zzn(4);
                                this.zzb.zzn(i15);
                                int zzd4 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i15);
                                long zzd5 = this.zzb.zzd(15);
                                this.zzb.zzn(i15);
                                i12 = zzd2;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                this.zzh = true;
                            }
                            j = this.zze.zzb((zzd << 30) | i12 | zzd3);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i18 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j, i18);
                        zze(3);
                        i13 = -1;
                        i14 = 2;
                        r62 = 0;
                        i15 = 1;
                    }
                }
                i8 = i14;
                z4 = r62;
                i9 = i15;
                i10 = i13;
            } else if (zzf(zzedVar, this.zzb.zza, 9)) {
                z4 = false;
                this.zzb.zzl(0);
                int zzd6 = this.zzb.zzd(24);
                i9 = 1;
                if (zzd6 != 1) {
                    AbstractC0486a1.k(zzd6, "Unexpected start code prefix: ", "PesReader");
                    this.zzj = -1;
                    i10 = -1;
                    i11 = 0;
                    i8 = 2;
                } else {
                    this.zzb.zzn(8);
                    zzec zzecVar = this.zzb;
                    int zzd7 = zzecVar.zzd(16);
                    zzecVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    i8 = 2;
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    i10 = -1;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                    } else {
                        int i24 = (zzd7 - 3) - zzd8;
                        this.zzj = i24;
                        if (i24 < 0) {
                            AbstractC0486a1.k(i24, "Found negative packet payload size: ", "PesReader");
                            this.zzj = -1;
                        }
                    }
                    i11 = 2;
                }
                zze(i11);
            } else {
                z4 = false;
                i9 = 1;
                i10 = -1;
                i8 = 2;
            }
            i13 = i10;
            i15 = i9;
            r62 = z4;
            i14 = i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
        this.zze = zzekVar;
        this.zza.zzb(zzacyVar, zzanmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z4) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
