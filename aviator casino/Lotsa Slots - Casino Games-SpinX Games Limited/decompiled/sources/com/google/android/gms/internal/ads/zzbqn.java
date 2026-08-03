package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqn extends com.google.android.gms.internal.ads.zzbqp {
    private final com.google.android.gms.ads.h5.OnH5AdsEventListener zza;

    public zzbqn(com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final void zzb(java.lang.String str) {
        this.zza.onH5AdsEvent(str);
    }
}
