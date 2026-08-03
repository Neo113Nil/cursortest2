package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdsq implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;

    zzdsq(com.google.android.gms.internal.ads.zzdtc zzdtcVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        java.util.Objects.requireNonNull(zzdtcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        if (zzckuVar == null) {
            this.zza.zzd(new com.google.android.gms.internal.ads.zzeph(1, "Missing webview from video view future."));
            return;
        }
        final com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zza;
        zzckuVar.zzab("/video", new com.google.android.gms.internal.ads.zzcim(new com.google.android.gms.internal.ads.zzcil() { // from class: com.google.android.gms.internal.ads.zzdsp
            @Override // com.google.android.gms.internal.ads.zzcil
            public final /* synthetic */ void zza(java.lang.String str) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("mediaUrl", str);
                com.google.android.gms.internal.ads.zzcfw.this.zzc(bundle);
            }
        }));
        zzckuVar.zzI();
    }
}
