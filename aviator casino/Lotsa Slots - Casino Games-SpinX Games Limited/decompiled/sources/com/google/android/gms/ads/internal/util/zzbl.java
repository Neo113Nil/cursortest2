package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbl {
    private static com.google.android.gms.internal.ads.zzath zza;
    private static final java.lang.Object zzb = new java.lang.Object();

    public zzbl(android.content.Context context) {
        com.google.android.gms.internal.ads.zzath zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                com.google.android.gms.internal.ads.zzbiq.zza(context);
                if (!com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfq)).booleanValue()) {
                        zza2 = com.google.android.gms.ads.internal.util.zzay.zzb(context);
                        zza = zza2;
                    }
                }
                zza2 = com.google.android.gms.internal.ads.zzauj.zza(context, null);
                zza = zza2;
            }
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        zza.zzb(new com.google.android.gms.ads.internal.util.zzbk(str, null, zzcfwVar));
        return zzcfwVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(int i, java.lang.String str, java.util.Map map, byte[] bArr) {
        com.google.android.gms.ads.internal.util.zzbi zzbiVar = new com.google.android.gms.ads.internal.util.zzbi(null);
        com.google.android.gms.ads.internal.util.zzbg zzbgVar = new com.google.android.gms.ads.internal.util.zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        com.google.android.gms.ads.internal.util.zzbh zzbhVar = new com.google.android.gms.ads.internal.util.zzbh(this, i, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, "GET", zzbhVar.zzm(), zzbhVar.zzn());
            } catch (com.google.android.gms.internal.ads.zzasm e) {
                java.lang.String message = e.getMessage();
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }
}
