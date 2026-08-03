package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzeo implements com.google.android.gms.ads.initialization.AdapterStatus {
    zzeo(com.google.android.gms.ads.internal.client.zzeu zzeuVar) {
        java.util.Objects.requireNonNull(zzeuVar);
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final java.lang.String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final com.google.android.gms.ads.initialization.AdapterStatus.State getInitializationState() {
        return com.google.android.gms.ads.initialization.AdapterStatus.State.READY;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return 0;
    }
}
