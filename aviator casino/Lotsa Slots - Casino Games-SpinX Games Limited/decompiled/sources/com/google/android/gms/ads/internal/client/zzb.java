package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzb extends com.google.android.gms.ads.internal.client.zzbd {
    private final com.google.android.gms.ads.internal.client.zza zza;

    public zzb(com.google.android.gms.ads.internal.client.zza zzaVar) {
        this.zza = zzaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbe
    public final void zzb() {
        this.zza.onAdClicked();
    }
}
