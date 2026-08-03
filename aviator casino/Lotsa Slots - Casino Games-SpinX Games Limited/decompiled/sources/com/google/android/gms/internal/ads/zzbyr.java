package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyr extends com.google.android.gms.internal.ads.zzbnr {
    private final com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener zza;

    public zzbyr(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zze(java.lang.String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zzf() {
        this.zza.onUnconfirmedClickCancelled();
    }
}
