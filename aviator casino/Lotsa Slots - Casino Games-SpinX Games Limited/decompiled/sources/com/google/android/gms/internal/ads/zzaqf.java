package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqf implements com.google.android.gms.internal.ads.zzapt {
    private final com.google.android.gms.internal.ads.zzet zza;
    private final com.google.android.gms.internal.ads.zzagv zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final java.lang.String zze;
    private com.google.android.gms.internal.ads.zzahk zzf;
    private java.lang.String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaqf(java.lang.String str, int i, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(4);
        this.zza = zzetVar;
        zzetVar.zzi()[0] = -1;
        this.zzb = new com.google.android.gms.internal.ads.zzagv();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzg = zzarhVar.zzc();
        this.zzf = zzagbVar.zzu(zzarhVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        this.zzf.getClass();
        while (zzetVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                byte[] zzi = zzetVar.zzi();
                int zzg = zzetVar.zzg();
                int zze = zzetVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzetVar.zzh(zze);
                        break;
                    }
                    int i2 = zzg + 1;
                    byte b = zzi[zzg];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzk && (b & 224) == 224;
                    this.zzk = z;
                    if (z2) {
                        zzetVar.zzh(i2);
                        this.zzk = false;
                        this.zza.zzi()[1] = zzi[zzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    zzg = i2;
                }
            } else if (i != 1) {
                int min = java.lang.Math.min(zzetVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzc(zzetVar, min);
                int i3 = this.zzi + min;
                this.zzi = i3;
                if (i3 >= this.zzm) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(this.zzn != -9223372036854775807L);
                    this.zzf.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int min2 = java.lang.Math.min(zzetVar.zzd(), 4 - this.zzi);
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zza;
                zzetVar.zzm(zzetVar2.zzi(), this.zzi, min2);
                int i4 = this.zzi + min2;
                this.zzi = i4;
                if (i4 >= 4) {
                    zzetVar2.zzh(0);
                    com.google.android.gms.internal.ads.zzagv zzagvVar = this.zzb;
                    if (zzagvVar.zza(zzetVar2.zzB())) {
                        this.zzm = zzagvVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (zzagvVar.zzg * 1000000) / zzagvVar.zzd;
                            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzn(this.zze);
                            zztVar.zzo(zzagvVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzG(zzagvVar.zze);
                            zztVar.zzH(zzagvVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzA(zztVar.zzO());
                            this.zzj = true;
                        }
                        zzetVar2.zzh(0);
                        this.zzf.zzc(zzetVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
    }
}
