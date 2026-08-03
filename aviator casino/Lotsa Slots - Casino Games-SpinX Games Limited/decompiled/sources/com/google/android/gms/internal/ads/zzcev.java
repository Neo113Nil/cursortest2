package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcev {
    public final com.google.common.util.concurrent.ListenableFuture zza(android.content.Context context, int i) {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new com.google.android.gms.internal.ads.zzceu(this, context, zzcfwVar));
        }
        return zzcfwVar;
    }
}
