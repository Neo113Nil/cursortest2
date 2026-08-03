package com.google.android.gms.ads.h5;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class H5AdsRequestHandler {
    private final com.google.android.gms.internal.ads.zzbqx zza;

    public H5AdsRequestHandler(android.content.Context context, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new com.google.android.gms.internal.ads.zzbqx(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zzb();
    }

    public boolean handleH5AdsRequest(java.lang.String str) {
        return this.zza.zza(str);
    }

    public boolean shouldInterceptRequest(java.lang.String str) {
        return com.google.android.gms.internal.ads.zzbqx.zzc(str);
    }
}
