package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbry implements com.google.android.gms.ads.initialization.InitializationStatus {
    private final java.util.Map zza;

    public zzbry(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final java.util.Map<java.lang.String, com.google.android.gms.ads.initialization.AdapterStatus> getAdapterStatusMap() {
        return this.zza;
    }
}
