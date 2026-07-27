package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbrf extends zzbrh {
    private final OnH5AdsEventListener zza;

    public zzbrf(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zza(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
