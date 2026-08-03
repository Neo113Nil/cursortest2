package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzdd extends com.google.android.gms.ads.internal.client.zzdb {
    private final com.google.android.gms.ads.MuteThisAdListener zza;

    public zzdd(com.google.android.gms.ads.MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void zze() {
        this.zza.onAdMuted();
    }
}
