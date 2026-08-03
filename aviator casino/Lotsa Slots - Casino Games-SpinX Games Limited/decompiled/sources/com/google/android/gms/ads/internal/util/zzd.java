package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzd {
    public static void zza(android.content.Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkm.zza.zze()).booleanValue()) {
            try {
                if (android.provider.Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                com.google.common.util.concurrent.ListenableFuture zzb = new com.google.android.gms.ads.internal.util.zzc(context).zzb();
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                com.google.android.gms.internal.ads.zzcfu.zza(zzb, "AdDebugLogUpdater.updateEnablement", com.google.android.gms.internal.ads.zzcfr.zzh);
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e);
            }
        }
    }
}
