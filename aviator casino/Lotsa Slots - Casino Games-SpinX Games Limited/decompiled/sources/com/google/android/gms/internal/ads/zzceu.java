package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzceu implements java.lang.Runnable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zzb;

    zzceu(com.google.android.gms.internal.ads.zzcev zzcevVar, android.content.Context context, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = context;
        this.zzb = zzcfwVar;
        java.util.Objects.requireNonNull(zzcevVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException | com.google.android.gms.common.GooglePlayServicesRepairableException | java.io.IOException | java.lang.IllegalStateException e) {
            this.zzb.zzd(e);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e);
        }
    }
}
