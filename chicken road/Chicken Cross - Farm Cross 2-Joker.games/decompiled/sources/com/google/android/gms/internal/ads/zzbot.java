package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbot implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbou zzc;

    zzbot(zzbou zzbouVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
        Objects.requireNonNull(zzbouVar);
        this.zzc = zzbouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdManagerAdView adManagerAdView = this.zza;
        if (adManagerAdView.zza(this.zzb)) {
            this.zzc.zzb().onAdManagerAdViewLoaded(adManagerAdView);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not bind.");
        }
    }
}
