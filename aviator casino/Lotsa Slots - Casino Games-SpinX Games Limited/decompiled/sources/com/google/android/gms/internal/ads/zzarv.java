package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzarv implements com.google.android.gms.internal.ads.zzafy {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet(4);
    private final com.google.android.gms.internal.ads.zzahd zzb = new com.google.android.gms.internal.ads.zzahd(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zza(4);
        com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
        zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
        if (zzetVar.zzz() == 1380533830) {
            zzafpVar.zzj(4, false);
            zzetVar.zza(4);
            zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
            if (zzetVar.zzz() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzb.zzc(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        return this.zzb.zzd(zzafzVar, zzagyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzb.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }
}
