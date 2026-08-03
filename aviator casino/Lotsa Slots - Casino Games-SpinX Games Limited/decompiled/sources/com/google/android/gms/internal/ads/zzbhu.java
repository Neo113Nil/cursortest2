package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbhu {
    com.google.android.gms.internal.ads.zzbem zza;
    boolean zzb;
    private final java.util.concurrent.ExecutorService zzc;

    public zzbhu() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    final /* synthetic */ java.util.concurrent.ExecutorService zza() {
        return this.zzc;
    }

    public zzbhu(final android.content.Context context) {
        java.util.concurrent.ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbhq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzge)).booleanValue();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.zzbhu zzbhuVar = com.google.android.gms.internal.ads.zzbhu.this;
                if (booleanValue) {
                    try {
                        zzbhuVar.zza = (com.google.android.gms.internal.ads.zzbem) com.google.android.gms.ads.internal.util.client.zzs.zza(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", com.google.android.gms.internal.ads.zzbhr.zza);
                        zzbhuVar.zza.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbhuVar.zzb = true;
                    } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr | java.lang.NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
