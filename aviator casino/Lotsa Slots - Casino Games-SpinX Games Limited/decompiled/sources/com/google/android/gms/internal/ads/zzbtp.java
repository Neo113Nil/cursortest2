package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbtp implements com.google.android.gms.internal.ads.zzcga {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbto zza;

    zzbtp(com.google.android.gms.internal.ads.zzbtt zzbttVar, com.google.android.gms.internal.ads.zzbto zzbtoVar) {
        this.zza = zzbtoVar;
        java.util.Objects.requireNonNull(zzbttVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((com.google.android.gms.internal.ads.zzbsp) obj).zzl());
    }
}
