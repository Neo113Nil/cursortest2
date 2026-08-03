package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapj implements com.google.android.gms.internal.ads.zzapt {
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
    private long zzk;
    private com.google.android.gms.internal.ads.zzv zzl;
    private int zzm;
    private long zzn;

    public zzapj(java.lang.String str, int i, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(new byte[128], 128);
        this.zza = zzesVar;
        this.zzb = new com.google.android.gms.internal.ads.zzet(zzesVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzf = zzarhVar.zzc();
        this.zzg = zzagbVar.zzu(zzarhVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        this.zzg.getClass();
        while (zzetVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (true) {
                    if (zzetVar.zzd() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int zzs = zzetVar.zzs();
                        if (zzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
                            zzetVar2.zzi()[0] = com.google.common.base.Ascii.VT;
                            zzetVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = zzs == 11;
                    } else {
                        this.zzj = zzetVar.zzs() == 11;
                    }
                }
            } else if (i != 1) {
                int min = java.lang.Math.min(zzetVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzetVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzm) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzb;
                byte[] zzi = zzetVar3.zzi();
                int min2 = java.lang.Math.min(zzetVar.zzd(), 128 - this.zzi);
                zzetVar.zzm(zzi, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 128) {
                    com.google.android.gms.internal.ads.zzes zzesVar = this.zza;
                    zzesVar.zzf(0);
                    com.google.android.gms.internal.ads.zzaex zzc = com.google.android.gms.internal.ads.zzaey.zzc(zzesVar);
                    com.google.android.gms.internal.ads.zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzc.zzc != zzvVar.zzH || zzc.zzb != zzvVar.zzI || !java.util.Objects.equals(zzc.zza, zzvVar.zzp)) {
                        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        java.lang.String str = zzc.zza;
                        zztVar.zzo(str);
                        zztVar.zzG(zzc.zzc);
                        zztVar.zzH(zzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i4 = zzc.zzf;
                        zztVar.zzj(i4);
                        if ("audio/ac3".equals(str)) {
                            zztVar.zzi(i4);
                        }
                        com.google.android.gms.internal.ads.zzv zzO = zztVar.zzO();
                        this.zzl = zzO;
                        this.zzg.zzA(zzO);
                    }
                    this.zzm = zzc.zzd;
                    this.zzk = (zzc.zze * 1000000) / this.zzl.zzI;
                    zzetVar3.zzh(0);
                    this.zzg.zzc(zzetVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
    }
}
