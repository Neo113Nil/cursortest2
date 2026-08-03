package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbwe extends com.google.android.gms.internal.ads.zzbvk {
    private final com.google.android.gms.ads.mediation.MediationInterscrollerAd zza;

    public zzbwe(com.google.android.gms.ads.mediation.MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final com.google.android.gms.dynamic.IObjectWrapper zze() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}
