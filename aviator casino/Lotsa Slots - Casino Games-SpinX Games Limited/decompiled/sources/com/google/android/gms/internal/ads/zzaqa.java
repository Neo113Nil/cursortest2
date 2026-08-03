package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqa implements com.google.android.gms.internal.ads.zzapt {
    private final com.google.android.gms.internal.ads.zzaqw zza;
    private long zzf;
    private java.lang.String zzh;
    private com.google.android.gms.internal.ads.zzahk zzi;
    private com.google.android.gms.internal.ads.zzapz zzj;
    private boolean zzk;
    private boolean zzm;
    private final java.lang.String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final com.google.android.gms.internal.ads.zzaqk zzc = new com.google.android.gms.internal.ads.zzaqk(7, 128);
    private final com.google.android.gms.internal.ads.zzaqk zzd = new com.google.android.gms.internal.ads.zzaqk(8, 128);
    private final com.google.android.gms.internal.ads.zzaqk zze = new com.google.android.gms.internal.ads.zzaqk(6, 128);
    private long zzl = -9223372036854775807L;
    private final com.google.android.gms.internal.ads.zzet zzn = new com.google.android.gms.internal.ads.zzet();

    public zzaqa(com.google.android.gms.internal.ads.zzaqw zzaqwVar, boolean z, boolean z2, java.lang.String str) {
        this.zza = zzaqwVar;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        com.google.android.gms.internal.ads.zzgp.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        com.google.android.gms.internal.ads.zzapz zzapzVar = this.zzj;
        if (zzapzVar != null) {
            zzapzVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzh = zzarhVar.zzc();
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 2);
        this.zzi = zzu;
        this.zzj = new com.google.android.gms.internal.ads.zzapz(zzu, false, false);
        this.zza.zza(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    @Override // com.google.android.gms.internal.ads.zzapt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        int i;
        int i2;
        int i3;
        this.zzi.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int zzg = zzetVar.zzg();
        int zze = zzetVar.zze();
        byte[] zzi = zzetVar.zzi();
        this.zzf += zzetVar.zzd();
        this.zzi.zzc(zzetVar, zzetVar.zzd());
        while (true) {
            int zzi2 = com.google.android.gms.internal.ads.zzgp.zzi(zzi, zzg, zze, this.zzg);
            if (zzi2 == zze) {
                zzg(zzi, zzg, zze);
                return;
            }
            int i4 = zzi[zzi2 + 3] & com.google.common.base.Ascii.US;
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
                    long j = this.zzf - i6;
                    zzh(j, i6, i3 >= 0 ? -i3 : 0, this.zzl);
                    zzf(j, i4, this.zzl);
                    zzg = i + i2;
                }
            }
            i = zzi2;
            i2 = 3;
            i3 = i - zzg;
            if (i3 > 0) {
            }
            int i62 = zze - i;
            long j2 = this.zzf - i62;
            zzh(j2, i62, i3 >= 0 ? -i3 : 0, this.zzl);
            zzf(j2, i4, this.zzl);
            zzg = i + i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
        this.zzi.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            com.google.android.gms.internal.ads.zzaqk zzaqkVar = this.zzc;
            zzaqkVar.zze(i2);
            com.google.android.gms.internal.ads.zzaqk zzaqkVar2 = this.zzd;
            zzaqkVar2.zze(i2);
            if (this.zzk) {
                if (zzaqkVar.zzb()) {
                    com.google.android.gms.internal.ads.zzgo zze = com.google.android.gms.internal.ads.zzgp.zze(zzaqkVar.zza, 4, zzaqkVar.zzb);
                    this.zza.zzb(zze.zzm);
                    this.zzj.zza(zze);
                    zzaqkVar.zza();
                } else if (zzaqkVar2.zzb()) {
                    this.zzj.zzb(com.google.android.gms.internal.ads.zzgp.zzh(zzaqkVar2.zza, 4, zzaqkVar2.zzb));
                    zzaqkVar2.zza();
                }
            } else if (zzaqkVar.zzb() && zzaqkVar2.zzb()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(java.util.Arrays.copyOf(zzaqkVar.zza, zzaqkVar.zzb));
                arrayList.add(java.util.Arrays.copyOf(zzaqkVar2.zza, zzaqkVar2.zzb));
                com.google.android.gms.internal.ads.zzgo zze2 = com.google.android.gms.internal.ads.zzgp.zze(zzaqkVar.zza, 4, zzaqkVar.zzb);
                com.google.android.gms.internal.ads.zzgn zzh = com.google.android.gms.internal.ads.zzgp.zzh(zzaqkVar2.zza, 4, zzaqkVar2.zzb);
                java.lang.String zzb = com.google.android.gms.internal.ads.zzdq.zzb(zze2.zza, zze2.zzb, zze2.zzc);
                com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzi;
                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                zztVar.zza(this.zzh);
                zztVar.zzn(this.zzb);
                zztVar.zzo("video/avc");
                zztVar.zzk(zzb);
                zztVar.zzv(zze2.zze);
                zztVar.zzw(zze2.zzf);
                com.google.android.gms.internal.ads.zzh zzhVar = new com.google.android.gms.internal.ads.zzh();
                zzhVar.zza(zze2.zzj);
                zzhVar.zzb(zze2.zzk);
                zzhVar.zzc(zze2.zzl);
                zzhVar.zze(zze2.zzh + 8);
                zzhVar.zzf(zze2.zzi + 8);
                zztVar.zzE(zzhVar.zzg());
                zztVar.zzB(zze2.zzg);
                zztVar.zzr(arrayList);
                int i3 = zze2.zzm;
                zztVar.zzq(i3);
                zzahkVar.zzA(zztVar.zzO());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zze2);
                this.zzj.zzb(zzh);
                zzaqkVar.zza();
                zzaqkVar2.zza();
            }
        }
        com.google.android.gms.internal.ads.zzaqk zzaqkVar3 = this.zze;
        if (zzaqkVar3.zze(i2)) {
            int zza = com.google.android.gms.internal.ads.zzgp.zza(zzaqkVar3.zza, zzaqkVar3.zzb);
            com.google.android.gms.internal.ads.zzet zzetVar = this.zzn;
            zzetVar.zzb(zzaqkVar3.zza, zza);
            zzetVar.zzh(4);
            this.zza.zzc(j2, zzetVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
