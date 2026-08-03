package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahd implements com.google.android.gms.internal.ads.zzafy {
    private final int zza;
    private final int zzb;
    private final java.lang.String zzc;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzagb zzf;
    private com.google.android.gms.internal.ads.zzahk zzg;

    public zzahd(int i, int i2, java.lang.String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        int i = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zzi((i == -1 || this.zzb == -1) ? false : true);
        int i2 = this.zzb;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(i2);
        ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, i2, false);
        return zzetVar.zzt() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzf = zzagbVar;
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(1024, 4);
        this.zzg = zzu;
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        java.lang.String str = this.zzc;
        zztVar.zzn(str);
        zztVar.zzo(str);
        zzu.zzA(zztVar.zzO());
        this.zzf.zzv();
        this.zzf.zzw(new com.google.android.gms.internal.ads.zzahe(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new java.lang.IllegalStateException();
        }
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzg;
        zzahkVar.getClass();
        int zza = zzahkVar.zza(zzafzVar, 1024, true);
        if (zza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }
}
