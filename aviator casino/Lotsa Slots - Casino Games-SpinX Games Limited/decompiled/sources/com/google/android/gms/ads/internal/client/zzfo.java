package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzfo extends com.google.android.gms.ads.internal.client.zzdp {
    private final com.google.android.gms.ads.OnPaidEventListener zza;

    public zzfo(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zze(com.google.android.gms.ads.internal.client.zzt zztVar) {
        com.google.android.gms.ads.OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(com.google.android.gms.ads.AdValue.zza(zztVar.zzb, zztVar.zzc, zztVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzf() {
        return this.zza == null;
    }
}
