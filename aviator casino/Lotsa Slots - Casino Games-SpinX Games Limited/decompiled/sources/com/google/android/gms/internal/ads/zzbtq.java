package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbtq implements com.google.android.gms.internal.ads.zzcfy {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbto zza;

    zzbtq(com.google.android.gms.internal.ads.zzbtt zzbttVar, com.google.android.gms.internal.ads.zzbto zzbtoVar) {
        this.zza = zzbtoVar;
        java.util.Objects.requireNonNull(zzbttVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfy
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziF)).booleanValue()) {
            this.zza.zzh(new java.lang.IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
