package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapr implements com.google.android.gms.internal.ads.zzapt {
    private final com.google.android.gms.internal.ads.zzet zza;
    private final java.lang.String zzc;
    private final int zzd;
    private java.lang.String zzf;
    private com.google.android.gms.internal.ads.zzahk zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private com.google.android.gms.internal.ads.zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final java.util.concurrent.atomic.AtomicInteger zzb = new java.util.concurrent.atomic.AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final java.lang.String zze = "video/mp2t";

    public zzapr(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.zza = new com.google.android.gms.internal.ads.zzet(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzf(com.google.android.gms.internal.ads.zzet zzetVar, byte[] bArr, int i) {
        int min = java.lang.Math.min(zzetVar.zzd(), i - this.zzi);
        zzetVar.zzm(bArr, this.zzi, min);
        int i2 = this.zzi + min;
        this.zzi = i2;
        return i2 == i;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    private final void zzg(com.google.android.gms.internal.ads.zzafw zzafwVar) {
        int i;
        int i2 = zzafwVar.zzb;
        if (i2 == -2147483647 || (i = zzafwVar.zzc) == -1) {
            return;
        }
        com.google.android.gms.internal.ads.zzv zzvVar = this.zzl;
        if (zzvVar != null && i == zzvVar.zzH && i2 == zzvVar.zzI && java.util.Objects.equals(zzafwVar.zza, zzvVar.zzp)) {
            return;
        }
        com.google.android.gms.internal.ads.zzv zzvVar2 = this.zzl;
        com.google.android.gms.internal.ads.zzt zztVar = zzvVar2 == null ? new com.google.android.gms.internal.ads.zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzn(this.zze);
        zztVar.zzo(zzafwVar.zza);
        zztVar.zzG(i);
        zztVar.zzH(i2);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
        this.zzl = zzO;
        this.zzg.zzA(zzO);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzf = zzarhVar.zzc();
        this.zzg = zzagbVar.zzu(zzarhVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        byte b;
        int i3;
        this.zzg.getClass();
        while (zzetVar.zzd() > 0) {
            int i4 = this.zzh;
            if (i4 == 0) {
                while (true) {
                    if (zzetVar.zzd() > 0) {
                        int i5 = this.zzj << 8;
                        this.zzj = i5;
                        int zzs = i5 | zzetVar.zzs();
                        this.zzj = zzs;
                        int zza = com.google.android.gms.internal.ads.zzafx.zza(zzs);
                        this.zzn = zza;
                        if (zza != 0) {
                            byte[] zzi = this.zza.zzi();
                            int i6 = this.zzj;
                            zzi[0] = (byte) ((i6 >> 24) & 255);
                            zzi[1] = (byte) ((i6 >> 16) & 255);
                            zzi[2] = (byte) ((i6 >> 8) & 255);
                            zzi[3] = (byte) (i6 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            int i7 = this.zzn;
                            if (i7 == 3 || i7 == 4) {
                                this.zzh = 4;
                            } else if (i7 == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i4 == 1) {
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zza;
                if (zzf(zzetVar, zzetVar2.zzi(), 18)) {
                    byte[] zzi2 = zzetVar2.zzi();
                    if (this.zzl == null) {
                        com.google.android.gms.internal.ads.zzv zzb = com.google.android.gms.internal.ads.zzafx.zzb(zzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzb;
                        this.zzg.zzA(zzb);
                    }
                    this.zzm = com.google.android.gms.internal.ads.zzafx.zzc(zzi2);
                    byte b2 = zzi2[0];
                    if (b2 != -2) {
                        if (b2 == -1) {
                            i2 = (zzi2[4] & 7) << 4;
                            b = zzi2[7];
                        } else if (b2 != 31) {
                            i2 = (zzi2[4] & 1) << 6;
                            i3 = zzi2[5] & 252;
                            i = (i3 >> 2) | i2;
                        } else {
                            i2 = (7 & zzi2[5]) << 4;
                            b = zzi2[6];
                        }
                        i3 = b & 60;
                        i = (i3 >> 2) | i2;
                    } else {
                        i = ((zzi2[4] & 252) >> 2) | ((zzi2[5] & 1) << 6);
                    }
                    this.zzk = com.google.android.gms.internal.ads.zzhah.zza(com.google.android.gms.internal.ads.zzfl.zzt((i + 1) * 32, this.zzl.zzI));
                    zzetVar2.zzh(0);
                    this.zzg.zzc(zzetVar2, 18);
                    this.zzh = 6;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    com.google.android.gms.internal.ads.zzet zzetVar3 = this.zza;
                    if (zzf(zzetVar, zzetVar3.zzi(), this.zzo)) {
                        com.google.android.gms.internal.ads.zzafw zzd = com.google.android.gms.internal.ads.zzafx.zzd(zzetVar3.zzi());
                        zzg(zzd);
                        this.zzm = zzd.zzd;
                        long j = zzd.zze;
                        this.zzk = j != -9223372036854775807L ? j : 0L;
                        zzetVar3.zzh(0);
                        this.zzg.zzc(zzetVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i4 == 4) {
                    com.google.android.gms.internal.ads.zzet zzetVar4 = this.zza;
                    if (zzf(zzetVar, zzetVar4.zzi(), 6)) {
                        int zzg = com.google.android.gms.internal.ads.zzafx.zzg(zzetVar4.zzi());
                        this.zzp = zzg;
                        int i8 = this.zzi;
                        if (i8 > zzg) {
                            int i9 = i8 - zzg;
                            this.zzi = i8 - i9;
                            zzetVar.zzh(zzetVar.zzg() - i9);
                        }
                        this.zzh = 5;
                    }
                } else if (i4 != 5) {
                    int min = java.lang.Math.min(zzetVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzetVar, min);
                    int i10 = this.zzi + min;
                    this.zzi = i10;
                    if (i10 == this.zzm) {
                        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    com.google.android.gms.internal.ads.zzet zzetVar5 = this.zza;
                    if (zzf(zzetVar, zzetVar5.zzi(), this.zzp)) {
                        com.google.android.gms.internal.ads.zzafw zzf = com.google.android.gms.internal.ads.zzafx.zzf(zzetVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzf);
                        }
                        this.zzm = zzf.zzd;
                        long j2 = zzf.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzetVar5.zzh(0);
                        this.zzg.zzc(zzetVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                com.google.android.gms.internal.ads.zzet zzetVar6 = this.zza;
                if (zzf(zzetVar, zzetVar6.zzi(), 7)) {
                    this.zzo = com.google.android.gms.internal.ads.zzafx.zze(zzetVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
    }
}
