package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbuk implements com.google.android.gms.internal.ads.zzcfy {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbto zzb;

    zzbuk(com.google.android.gms.internal.ads.zzbum zzbumVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar, com.google.android.gms.internal.ads.zzbto zzbtoVar) {
        this.zza = zzcfwVar;
        this.zzb = zzbtoVar;
        java.util.Objects.requireNonNull(zzbumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfy
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new com.google.android.gms.internal.ads.zzbtx("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
