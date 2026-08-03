package com.google.android.gms.ads.mediation.rtb;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class RtbSignalData {
    private final android.content.Context zza;
    private final java.util.List zzb;
    private final android.os.Bundle zzc;
    private final com.google.android.gms.ads.AdSize zzd;

    public RtbSignalData(android.content.Context context, java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> list, android.os.Bundle bundle, com.google.android.gms.ads.AdSize adSize) {
        this.zza = context;
        this.zzb = list;
        this.zzc = bundle;
        this.zzd = adSize;
    }

    public com.google.android.gms.ads.AdSize getAdSize() {
        return this.zzd;
    }

    public java.util.List<com.google.android.gms.ads.mediation.MediationConfiguration> getConfigurations() {
        return this.zzb;
    }

    public android.content.Context getContext() {
        return this.zza;
    }

    public android.os.Bundle getNetworkExtras() {
        return this.zzc;
    }
}
