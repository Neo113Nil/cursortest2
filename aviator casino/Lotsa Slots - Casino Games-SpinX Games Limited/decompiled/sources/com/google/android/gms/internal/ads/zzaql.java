package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaql implements com.google.android.gms.internal.ads.zzaqt {
    private com.google.android.gms.internal.ads.zzv zza;
    private com.google.android.gms.internal.ads.zzfi zzb;
    private com.google.android.gms.internal.ads.zzahk zzc;

    public zzaql(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzn("video/mp2t");
        zztVar.zzo(str);
        this.zza = zztVar.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zza(com.google.android.gms.internal.ads.zzfi zzfiVar, com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        this.zzb = zzfiVar;
        zzarhVar.zza();
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 5);
        this.zzc = zzu;
        zzu.zzA(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        this.zzb.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        long zzb = this.zzb.zzb();
        long zzc = this.zzb.zzc();
        if (zzb == -9223372036854775807L || zzc == -9223372036854775807L) {
            return;
        }
        com.google.android.gms.internal.ads.zzv zzvVar = this.zza;
        if (zzc != zzvVar.zzu) {
            com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
            zza.zzt(zzc);
            com.google.android.gms.internal.ads.zzv zzO = zza.zzO();
            this.zza = zzO;
            this.zzc.zzA(zzO);
        }
        int zzd = zzetVar.zzd();
        this.zzc.zzc(zzetVar, zzd);
        this.zzc.zze(zzb, 1, zzd, 0, null);
    }
}
