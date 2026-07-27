package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdal implements com.google.android.gms.ads.internal.client.zza {
    private final zzdap zza;
    private final zzflw zzb;

    zzdal(zzdap zzdapVar, zzflw zzflwVar) {
        this.zza = zzdapVar;
        this.zzb = zzflwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
