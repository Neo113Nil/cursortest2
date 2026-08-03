package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcsn implements com.google.android.gms.internal.ads.zzcru {
    private final com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager zza;

    zzcsn(com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager deviceTierManager) {
        this.zza = deviceTierManager;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final void zza(org.json.JSONObject jSONObject) {
        com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier fromValue;
        com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier fromValue2;
        com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier fromValue3;
        if (jSONObject.has("AvailableMemoryTier") && (fromValue3 = com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier.fromValue(jSONObject.optInt("AvailableMemoryTier", -1))) != null) {
            this.zza.setAvailableMemoryTier(fromValue3);
        }
        if (jSONObject.has("AvailableProcessorTier") && (fromValue2 = com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier.fromValue(jSONObject.optInt("AvailableProcessorTier", -1))) != null) {
            this.zza.setAvailableProcessorTier(fromValue2);
        }
        if (!jSONObject.has("AdvertisedMemoryTier") || (fromValue = com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier.fromValue(jSONObject.optInt("AdvertisedMemoryTier", -1))) == null) {
            return;
        }
        this.zza.setAdvertisedMemoryTier(fromValue);
    }
}
