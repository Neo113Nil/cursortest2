package com.google.android.gms.ads.nonagon.devicetier;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class DeviceTierManager {
    private final android.content.Context zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier.UNKNOWN);
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier.UNKNOWN);
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference(com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier.UNKNOWN);

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    public enum AdvertisedMemoryTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        VERY_LOW(3),
        LOW(4),
        MID(5),
        MID_PLUS(6),
        HIGH(7),
        VERY_HIGH(8),
        EXTREME_HIGH(9);

        private final int zza;

        AdvertisedMemoryTier(int i) {
            this.zza = i;
        }

        public static com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier fromValue(int i) {
            for (com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier advertisedMemoryTier : values()) {
                if (advertisedMemoryTier.zza == i) {
                    return advertisedMemoryTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.zza;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    public enum AvailableMemoryTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        VERY_LOW(3),
        LOW(4),
        MID(5),
        MID_PLUS(6),
        HIGH(7),
        VERY_HIGH(8),
        EXTREME_HIGH(9);

        private final int zza;

        AvailableMemoryTier(int i) {
            this.zza = i;
        }

        public static com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier fromValue(int i) {
            for (com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier availableMemoryTier : values()) {
                if (availableMemoryTier.zza == i) {
                    return availableMemoryTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.zza;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    public enum AvailableProcessorTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        LOW(3),
        MID(4),
        MID_PLUS(5),
        HIGH(6),
        EXTREME_HIGH(7);

        private final int zza;

        AvailableProcessorTier(int i) {
            this.zza = i;
        }

        public static com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier fromValue(int i) {
            for (com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier availableProcessorTier : values()) {
                if (availableProcessorTier.zza == i) {
                    return availableProcessorTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.zza;
        }
    }

    DeviceTierManager(android.content.Context context) {
        this.zza = context;
    }

    public com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier getAdvertisedMemoryTier() {
        return (com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier) this.zzc.get();
    }

    public com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier getAvailableMemoryTier() {
        return (com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier) this.zzd.get();
    }

    public com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier getAvailableProcessorTier() {
        return (com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier) this.zze.get();
    }

    public void initialize() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zzb;
        if (atomicBoolean.get()) {
            return;
        }
        com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier fromValue = com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier.fromValue(this.zza.getSharedPreferences(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB, 0).getInt("advertised_memory_tier", com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier.UNKNOWN.getValue()));
        if (fromValue != null) {
            this.zzc.set(fromValue);
        }
        atomicBoolean.set(true);
    }

    public synchronized void setAdvertisedMemoryTier(com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AdvertisedMemoryTier advertisedMemoryTier) {
        if (advertisedMemoryTier == null) {
            return;
        }
        this.zzc.set(advertisedMemoryTier);
        this.zza.getSharedPreferences(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB, 0).edit().putInt("advertised_memory_tier", advertisedMemoryTier.getValue()).apply();
    }

    public void setAvailableMemoryTier(com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableMemoryTier availableMemoryTier) {
        if (availableMemoryTier != null) {
            this.zzd.set(availableMemoryTier);
        }
    }

    public void setAvailableProcessorTier(com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager.AvailableProcessorTier availableProcessorTier) {
        if (availableProcessorTier != null) {
            this.zze.set(availableProcessorTier);
        }
    }
}
