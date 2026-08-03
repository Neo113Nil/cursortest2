package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfuj {
    private boolean zza;

    final boolean zza() {
        return this.zza;
    }

    final void zzb(android.content.Context context) {
        com.google.android.gms.internal.ads.zzfwi.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        com.google.android.gms.internal.ads.zzfvq.zza().zzb(context);
        com.google.android.gms.internal.ads.zzfvh.zza().zzd(context);
        com.google.android.gms.internal.ads.zzfwd.zza(context);
        com.google.android.gms.internal.ads.zzfwe.zza(context);
        com.google.android.gms.internal.ads.zzfwh.zza(context);
        com.google.android.gms.internal.ads.zzfvn.zza().zzc(context);
        com.google.android.gms.internal.ads.zzfvg.zza().zzc(context);
        com.google.android.gms.internal.ads.zzfvs.zza().zzb(context);
    }
}
