package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbzs {
    private static com.google.android.gms.internal.ads.zzcem zze;
    private final android.content.Context zza;
    private final com.google.android.gms.ads.AdFormat zzb;
    private final com.google.android.gms.ads.internal.client.zzeh zzc;
    private final java.lang.String zzd;

    public zzbzs(android.content.Context context, com.google.android.gms.ads.AdFormat adFormat, com.google.android.gms.ads.internal.client.zzeh zzehVar, java.lang.String str) {
        this.zza = context;
        this.zzb = adFormat;
        this.zzc = zzehVar;
        this.zzd = str;
    }

    public static com.google.android.gms.internal.ads.zzcem zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcem zzcemVar;
        synchronized (com.google.android.gms.internal.ads.zzbzs.class) {
            if (zze == null) {
                zze = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(context, new com.google.android.gms.internal.ads.zzbuy());
            }
            zzcemVar = zze;
        }
        return zzcemVar;
    }

    public final void zzb(com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zza;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzcem zza2 = zza(context);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzeh zzehVar = this.zzc;
        if (zzehVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzi(currentTimeMillis);
            zza = zznVar.zza();
        } else {
            zzehVar.zzp(currentTimeMillis);
            zza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzehVar);
        }
        try {
            zza2.zze(wrap, new com.google.android.gms.internal.ads.zzceq(this.zzd, this.zzb.name(), null, zza), new com.google.android.gms.internal.ads.zzbzr(this, queryInfoGenerationCallback));
        } catch (android.os.RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
