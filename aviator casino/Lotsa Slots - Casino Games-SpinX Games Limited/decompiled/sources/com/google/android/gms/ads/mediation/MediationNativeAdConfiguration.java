package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public class MediationNativeAdConfiguration extends com.google.android.gms.ads.mediation.MediationAdConfiguration {
    private final com.google.android.gms.internal.ads.zzblt zza;

    public MediationNativeAdConfiguration(android.content.Context context, java.lang.String str, android.os.Bundle bundle, android.os.Bundle bundle2, boolean z, android.location.Location location, int i, int i2, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzblt zzbltVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = zzbltVar;
    }

    public com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdOptions() {
        return com.google.android.gms.internal.ads.zzblt.zza(this.zza);
    }
}
