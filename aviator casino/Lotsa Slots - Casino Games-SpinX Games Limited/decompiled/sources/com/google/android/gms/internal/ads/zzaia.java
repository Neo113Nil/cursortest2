package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaia implements com.google.android.gms.internal.ads.zzafy {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet(4);
    private final com.google.android.gms.internal.ads.zzahd zzb = new com.google.android.gms.internal.ads.zzahd(-1, -1, androidx.media3.common.MimeTypes.IMAGE_AVIF);

    private final boolean zzh(com.google.android.gms.internal.ads.zzafz zzafzVar, int i) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zza(4);
        ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, 4, false);
        return zzetVar.zzz() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzj(4, false);
        return zzh(zzafzVar, 1718909296) && zzh(zzafzVar, 1635150182);
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
