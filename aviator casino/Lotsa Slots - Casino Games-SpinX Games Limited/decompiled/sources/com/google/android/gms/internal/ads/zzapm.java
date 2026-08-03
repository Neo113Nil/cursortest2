package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapm implements com.google.android.gms.internal.ads.zzapt {
    private final com.google.android.gms.internal.ads.zzes zza;
    private final com.google.android.gms.internal.ads.zzet zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private final java.lang.String zze;
    private java.lang.String zzf;
    private com.google.android.gms.internal.ads.zzahk zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private com.google.android.gms.internal.ads.zzv zzm;
    private int zzn;
    private long zzo;

    public zzapm(java.lang.String str, int i, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(new byte[16], 16);
        this.zza = zzesVar;
        this.zzb = new com.google.android.gms.internal.ads.zzet(zzesVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzf = zzarhVar.zzc();
        this.zzg = zzagbVar.zzu(zzarhVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzo = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012d  */
    @Override // com.google.android.gms.internal.ads.zzapt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        boolean z;
        this.zzg.getClass();
        while (zzetVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (zzetVar.zzd() > 0) {
                    if (this.zzj) {
                        int zzs = zzetVar.zzs();
                        this.zzj = zzs == 172;
                        byte b = com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO;
                        if (zzs != 64) {
                            if (zzs == 65) {
                            }
                        } else if (zzs != 65) {
                            z = false;
                            this.zzk = z;
                            this.zzh = 1;
                            com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
                            zzetVar2.zzi()[0] = -84;
                            byte[] zzi = zzetVar2.zzi();
                            if (true == this.zzk) {
                                b = 65;
                            }
                            zzi[1] = b;
                            this.zzi = 2;
                        }
                        z = true;
                        this.zzk = z;
                        this.zzh = 1;
                        com.google.android.gms.internal.ads.zzet zzetVar22 = this.zzb;
                        zzetVar22.zzi()[0] = -84;
                        byte[] zzi2 = zzetVar22.zzi();
                        if (true == this.zzk) {
                        }
                        zzi2[1] = b;
                        this.zzi = 2;
                    } else {
                        this.zzj = zzetVar.zzs() == 172;
                    }
                }
            } else if (i != 1) {
                int min = java.lang.Math.min(zzetVar.zzd(), this.zzn - this.zzi);
                this.zzg.zzc(zzetVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzn) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(this.zzo != -9223372036854775807L);
                    this.zzg.zze(this.zzo, 1, this.zzn, 0, null);
                    this.zzo += this.zzl;
                    this.zzh = 0;
                }
            } else {
                com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzb;
                byte[] zzi3 = zzetVar3.zzi();
                int min2 = java.lang.Math.min(zzetVar.zzd(), 16 - this.zzi);
                zzetVar.zzm(zzi3, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 16) {
                    com.google.android.gms.internal.ads.zzes zzesVar = this.zza;
                    zzesVar.zzf(0);
                    com.google.android.gms.internal.ads.zzafa zzb = com.google.android.gms.internal.ads.zzafb.zzb(zzesVar);
                    com.google.android.gms.internal.ads.zzv zzvVar = this.zzm;
                    if (zzvVar == null || zzvVar.zzH != 2 || zzb.zza != zzvVar.zzI || !"audio/ac4".equals(zzvVar.zzp)) {
                        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        zztVar.zzo("audio/ac4");
                        zztVar.zzG(2);
                        zztVar.zzH(zzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
                        this.zzm = zzO;
                        this.zzg.zzA(zzO);
                    }
                    this.zzn = zzb.zzb;
                    this.zzl = (zzb.zzc * 1000000) / this.zzm.zzI;
                    zzetVar3.zzh(0);
                    this.zzg.zzc(zzetVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
    }
}
