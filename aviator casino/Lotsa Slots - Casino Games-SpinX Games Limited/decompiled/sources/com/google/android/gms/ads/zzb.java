package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzb {
    private static volatile com.google.android.gms.ads.internal.client.zzch zza;

    private zzb() {
    }

    public static com.google.android.gms.ads.internal.client.zzch zza(android.content.Context context) {
        if (zza == null) {
            synchronized (com.google.android.gms.ads.zzb.class) {
                if (zza == null) {
                    zza = com.google.android.gms.ads.internal.client.zzay.zzb().zzd(context, new com.google.android.gms.internal.ads.zzbuy());
                }
            }
        }
        return zza;
    }
}
