package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeqr implements com.google.android.gms.internal.ads.zzdea {
    boolean zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzelv zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zzc;

    zzeqr(com.google.android.gms.internal.ads.zzequ zzequVar, com.google.android.gms.internal.ads.zzelv zzelvVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zzb = zzelvVar;
        this.zzc = zzcfwVar;
        java.util.Objects.requireNonNull(zzequVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgz)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new com.google.android.gms.internal.ads.zzelw(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zzb(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, com.google.android.gms.internal.ads.zzequ.zze(this.zzb.zza, i), com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zzc(int i, java.lang.String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = com.google.android.gms.internal.ads.zzequ.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}
