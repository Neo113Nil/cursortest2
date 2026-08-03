package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqm implements com.google.android.gms.internal.ads.zzari {
    private final com.google.android.gms.internal.ads.zzapt zza;
    private final com.google.android.gms.internal.ads.zzes zzb = new com.google.android.gms.internal.ads.zzes(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private com.google.android.gms.internal.ads.zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaqm(com.google.android.gms.internal.ads.zzapt zzaptVar) {
        this.zza = zzaptVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(com.google.android.gms.internal.ads.zzet zzetVar, byte[] bArr, int i) {
        int min = java.lang.Math.min(zzetVar.zzd(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzetVar.zzk(min);
        } else {
            zzetVar.zzm(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zza(com.google.android.gms.internal.ads.zzfi zzfiVar, com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        this.zze = zzfiVar;
        this.zza.zzb(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) throws com.google.android.gms.internal.ads.zzat {
        com.google.android.gms.internal.ads.zzet zzetVar2;
        int i2;
        int i3;
        int i4;
        long j;
        com.google.android.gms.internal.ads.zzet zzetVar3 = zzetVar;
        this.zze.getClass();
        int i5 = -1;
        int i6 = 2;
        ?? r6 = 0;
        if ((i & 1) != 0) {
            int i7 = this.zzc;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.zzj;
                    if (i8 != -1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i8).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i8);
                        sb.append(" more bytes");
                        com.google.android.gms.internal.ads.zzeg.zzc("PesReader", sb.toString());
                    }
                    this.zza.zze(zzetVar.zze() == 0);
                } else {
                    com.google.android.gms.internal.ads.zzeg.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i9 = i;
        while (zzetVar.zzd() > 0) {
            int i10 = this.zzc;
            if (i10 == 0) {
                zzetVar2 = zzetVar3;
                i2 = i9;
                zzetVar2.zzk(zzetVar.zzd());
            } else if (i10 == 1) {
                i2 = i9;
                com.google.android.gms.internal.ads.zzes zzesVar = this.zzb;
                zzetVar2 = zzetVar;
                if (zzf(zzetVar2, zzesVar.zza, 9)) {
                    zzesVar.zzf(0);
                    int zzj = zzesVar.zzj(24);
                    if (zzj != 1) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzj).length() + 30);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(zzj);
                        com.google.android.gms.internal.ads.zzeg.zzc("PesReader", sb2.toString());
                        this.zzj = -1;
                        i3 = 0;
                    } else {
                        zzesVar.zzh(8);
                        int zzj2 = zzesVar.zzj(16);
                        zzesVar.zzh(5);
                        this.zzk = zzesVar.zzi();
                        zzesVar.zzh(2);
                        this.zzf = zzesVar.zzi();
                        this.zzg = zzesVar.zzi();
                        zzesVar.zzh(6);
                        int zzj3 = zzesVar.zzj(8);
                        this.zzi = zzj3;
                        if (zzj2 == 0) {
                            this.zzj = -1;
                        } else {
                            int i11 = (zzj2 - 3) - zzj3;
                            this.zzj = i11;
                            if (i11 < 0) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i11).length() + 36);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i11);
                                com.google.android.gms.internal.ads.zzeg.zzc("PesReader", sb3.toString());
                                this.zzj = -1;
                                i3 = 2;
                            }
                        }
                        i3 = 2;
                    }
                    zze(i3);
                }
            } else if (i10 != i6) {
                int zzd = zzetVar.zzd();
                int i12 = this.zzj;
                int i13 = i12 == i5 ? 0 : zzd - i12;
                if (i13 > 0) {
                    zzd -= i13;
                    zzetVar3.zzf(zzetVar.zzg() + zzd);
                }
                com.google.android.gms.internal.ads.zzapt zzaptVar = this.zza;
                zzaptVar.zzd(zzetVar3);
                int i14 = this.zzj;
                if (i14 != i5) {
                    int i15 = i14 - zzd;
                    this.zzj = i15;
                    if (i15 == 0) {
                        zzaptVar.zze(r6);
                        zze(1);
                    }
                }
                zzetVar2 = zzetVar3;
                i2 = i9;
            } else {
                int min = java.lang.Math.min(10, this.zzi);
                com.google.android.gms.internal.ads.zzes zzesVar2 = this.zzb;
                if (zzf(zzetVar3, zzesVar2.zza, min) && zzf(zzetVar3, null, this.zzi)) {
                    zzesVar2.zzf(r6);
                    if (this.zzf) {
                        zzesVar2.zzh(4);
                        long zzj4 = zzesVar2.zzj(3);
                        zzesVar2.zzh(1);
                        int zzj5 = zzesVar2.zzj(15) << 15;
                        zzesVar2.zzh(1);
                        long zzj6 = zzesVar2.zzj(15);
                        zzesVar2.zzh(1);
                        if (this.zzh || !this.zzg) {
                            i4 = i9;
                        } else {
                            zzesVar2.zzh(4);
                            zzesVar2.zzh(1);
                            int zzj7 = zzesVar2.zzj(15) << 15;
                            zzesVar2.zzh(1);
                            i4 = i9;
                            long zzj8 = zzesVar2.zzj(15);
                            zzesVar2.zzh(1);
                            this.zze.zze(zzj8 | zzj7 | (zzesVar2.zzj(3) << 30));
                            this.zzh = true;
                        }
                        j = this.zze.zze((zzj4 << 30) | zzj5 | zzj6);
                    } else {
                        i4 = i9;
                        j = -9223372036854775807L;
                    }
                    int i16 = i4 | (true != this.zzk ? 0 : 4);
                    this.zza.zzc(j, i16);
                    zze(3);
                    zzetVar3 = zzetVar;
                    i9 = i16;
                    i5 = -1;
                    i6 = 2;
                    r6 = 0;
                } else {
                    i2 = i9;
                    zzetVar2 = zzetVar;
                }
            }
            zzetVar3 = zzetVar2;
            i9 = i2;
            i5 = -1;
            i6 = 2;
            r6 = 0;
        }
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
