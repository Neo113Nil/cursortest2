package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbta implements com.google.android.gms.internal.ads.zzbpq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsp zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtu zzc;

    zzbta(com.google.android.gms.internal.ads.zzbtu zzbtuVar, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzbsp zzbspVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.zza = zzbspVar;
        this.zzb = zzbvVar;
        java.util.Objects.requireNonNull(zzbtuVar);
        this.zzc = zzbtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        com.google.android.gms.internal.ads.zzbtu zzbtuVar = this.zzc;
        synchronized (zzbtuVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            com.google.android.gms.ads.internal.util.client.zzo.zzh("JS Engine is requesting an update");
            if (zzbtuVar.zzk() == 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Starting reload.");
                zzbtuVar.zzl(2);
                zzbtuVar.zza(null);
            }
            this.zza.zzn("/requestReload", (com.google.android.gms.internal.ads.zzbpq) this.zzb.zza());
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
