package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqd implements com.google.android.gms.internal.ads.zzapt {
    private com.google.android.gms.internal.ads.zzahk zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final java.lang.String zza = "video/mp2t";
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(10);
    private long zze = -9223372036854775807L;

    public zzaqd(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 5);
        this.zzc = zzu;
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zza(zzarhVar.zzc());
        zztVar.zzn(this.zza);
        zztVar.zzo("application/id3");
        zzu.zzA(zztVar.zzO());
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int zzd = zzetVar.zzd();
            int i = this.zzg;
            if (i < 10) {
                int min = java.lang.Math.min(zzd, 10 - i);
                byte[] zzi = zzetVar.zzi();
                int zzg = zzetVar.zzg();
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
                java.lang.System.arraycopy(zzi, zzg, zzetVar2.zzi(), this.zzg, min);
                if (this.zzg + min == 10) {
                    zzetVar2.zzh(0);
                    if (zzetVar2.zzs() != 73 || zzetVar2.zzs() != 68 || zzetVar2.zzs() != 51) {
                        com.google.android.gms.internal.ads.zzeg.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzetVar2.zzk(3);
                        this.zzf = zzetVar2.zzG() + 10;
                    }
                }
            }
            int min2 = java.lang.Math.min(zzd, this.zzf - this.zzg);
            this.zzc.zzc(zzetVar, min2);
            this.zzg += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
        int i;
        this.zzc.getClass();
        if (this.zzd && (i = this.zzf) != 0 && this.zzg == i) {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zze != -9223372036854775807L);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
