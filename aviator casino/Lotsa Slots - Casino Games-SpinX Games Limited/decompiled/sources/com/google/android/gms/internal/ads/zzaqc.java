package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqc implements com.google.android.gms.internal.ads.zzapt {
    private final com.google.android.gms.internal.ads.zzaqw zza;
    private java.lang.String zzb;
    private com.google.android.gms.internal.ads.zzahk zzc;
    private com.google.android.gms.internal.ads.zzaqb zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final com.google.android.gms.internal.ads.zzaqk zzg = new com.google.android.gms.internal.ads.zzaqk(32, 128);
    private final com.google.android.gms.internal.ads.zzaqk zzh = new com.google.android.gms.internal.ads.zzaqk(33, 128);
    private final com.google.android.gms.internal.ads.zzaqk zzi = new com.google.android.gms.internal.ads.zzaqk(34, 128);
    private final com.google.android.gms.internal.ads.zzaqk zzj = new com.google.android.gms.internal.ads.zzaqk(39, 128);
    private final com.google.android.gms.internal.ads.zzaqk zzk = new com.google.android.gms.internal.ads.zzaqk(40, 128);
    private long zzm = -9223372036854775807L;
    private final com.google.android.gms.internal.ads.zzet zzn = new com.google.android.gms.internal.ads.zzet();

    public zzaqc(com.google.android.gms.internal.ads.zzaqw zzaqwVar, java.lang.String str) {
        this.zza = zzaqwVar;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            com.google.android.gms.internal.ads.zzaqk zzaqkVar = this.zzg;
            zzaqkVar.zze(i2);
            com.google.android.gms.internal.ads.zzaqk zzaqkVar2 = this.zzh;
            zzaqkVar2.zze(i2);
            com.google.android.gms.internal.ads.zzaqk zzaqkVar3 = this.zzi;
            zzaqkVar3.zze(i2);
            if (zzaqkVar.zzb() && zzaqkVar2.zzb() && zzaqkVar3.zzb()) {
                java.lang.String str = this.zzb;
                int i3 = zzaqkVar.zzb;
                byte[] bArr = new byte[zzaqkVar2.zzb + i3 + zzaqkVar3.zzb];
                java.lang.System.arraycopy(zzaqkVar.zza, 0, bArr, 0, i3);
                java.lang.System.arraycopy(zzaqkVar2.zza, 0, bArr, zzaqkVar.zzb, zzaqkVar2.zzb);
                java.lang.System.arraycopy(zzaqkVar3.zza, 0, bArr, zzaqkVar.zzb + zzaqkVar2.zzb, zzaqkVar3.zzb);
                java.lang.String str2 = null;
                com.google.android.gms.internal.ads.zzgj zzg = com.google.android.gms.internal.ads.zzgp.zzg(zzaqkVar2.zza, 3, zzaqkVar2.zzb, null);
                com.google.android.gms.internal.ads.zzge zzgeVar = zzg.zzb;
                if (zzgeVar != null) {
                    int i4 = zzgeVar.zzf;
                    int[] iArr = zzgeVar.zze;
                    int i5 = zzgeVar.zzd;
                    str2 = com.google.android.gms.internal.ads.zzdq.zzc(zzgeVar.zza, zzgeVar.zzb, zzgeVar.zzc, i5, iArr, i4);
                }
                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                zztVar.zza(str);
                zztVar.zzn("video/mp2t");
                zztVar.zzo("video/hevc");
                zztVar.zzk(str2);
                zztVar.zzv(zzg.zze);
                zztVar.zzw(zzg.zzf);
                zztVar.zzx(zzg.zzg);
                zztVar.zzy(zzg.zzh);
                com.google.android.gms.internal.ads.zzh zzhVar = new com.google.android.gms.internal.ads.zzh();
                zzhVar.zza(zzg.zzk);
                zzhVar.zzb(zzg.zzl);
                zzhVar.zzc(zzg.zzm);
                zzhVar.zze(zzg.zzc + 8);
                zzhVar.zzf(zzg.zzd + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zzg.zzi);
                zztVar.zzq(zzg.zzj);
                zztVar.zzF(zzg.zza + 1);
                zztVar.zzr(java.util.Collections.singletonList(bArr));
                com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
                this.zzc.zzA(zzO);
                int i6 = zzO.zzr;
                com.google.android.gms.internal.ads.zzgtj.zzi(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        com.google.android.gms.internal.ads.zzaqk zzaqkVar4 = this.zzj;
        if (zzaqkVar4.zze(i2)) {
            int zza = com.google.android.gms.internal.ads.zzgp.zza(zzaqkVar4.zza, zzaqkVar4.zzb);
            com.google.android.gms.internal.ads.zzet zzetVar = this.zzn;
            zzetVar.zzb(zzaqkVar4.zza, zza);
            zzetVar.zzk(5);
            this.zza.zzc(j2, zzetVar);
        }
        com.google.android.gms.internal.ads.zzaqk zzaqkVar5 = this.zzk;
        if (zzaqkVar5.zze(i2)) {
            int zza2 = com.google.android.gms.internal.ads.zzgp.zza(zzaqkVar5.zza, zzaqkVar5.zzb);
            com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzn;
            zzetVar2.zzb(zzaqkVar5.zza, zza2);
            zzetVar2.zzk(5);
            this.zza.zzc(j2, zzetVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        com.google.android.gms.internal.ads.zzgp.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        com.google.android.gms.internal.ads.zzaqb zzaqbVar = this.zzd;
        if (zzaqbVar != null) {
            zzaqbVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzb = zzarhVar.zzc();
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 2);
        this.zzc = zzu;
        this.zzd = new com.google.android.gms.internal.ads.zzaqb(zzu);
        this.zza.zza(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzapt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        int i;
        int i2;
        int i3;
        this.zzc.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        while (zzetVar.zzd() > 0) {
            int zzg = zzetVar.zzg();
            int zze = zzetVar.zze();
            byte[] zzi = zzetVar.zzi();
            this.zzl += zzetVar.zzd();
            this.zzc.zzc(zzetVar, zzetVar.zzd());
            while (zzg < zze) {
                int zzi2 = com.google.android.gms.internal.ads.zzgp.zzi(zzi, zzg, zze, this.zzf);
                if (zzi2 == zze) {
                    zzg(zzi, zzg, zze);
                    return;
                }
                int i4 = zzi[zzi2 + 3] & 126;
                if (zzi2 > 0) {
                    int i5 = zzi2 - 1;
                    if (zzi[i5] == 0) {
                        i = i5;
                        i2 = 4;
                        i3 = i - zzg;
                        if (i3 > 0) {
                            zzg(zzi, zzg, i);
                        }
                        int i6 = zze - i;
                        long j = this.zzl - i6;
                        zzh(j, i6, i3 >= 0 ? -i3 : 0, this.zzm);
                        zzf(j, i6, i4 >> 1, this.zzm);
                        zzg = i + i2;
                    }
                }
                i = zzi2;
                i2 = 3;
                i3 = i - zzg;
                if (i3 > 0) {
                }
                int i62 = zze - i;
                long j2 = this.zzl - i62;
                zzh(j2, i62, i3 >= 0 ? -i3 : 0, this.zzm);
                zzf(j2, i62, i4 >> 1, this.zzm);
                zzg = i + i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
        this.zzc.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
