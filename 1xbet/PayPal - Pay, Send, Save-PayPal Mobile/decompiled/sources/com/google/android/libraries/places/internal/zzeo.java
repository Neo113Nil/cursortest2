package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzeo {
    private static final com.google.android.libraries.places.internal.zztc zza = com.google.android.libraries.places.internal.zztc.zzf("com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs");
    private static final java.util.Set zzb = new java.util.HashSet();

    public static void zza(java.lang.String str) {
        if (str.length() > 50) {
            ((com.google.android.libraries.places.internal.zzsz) ((com.google.android.libraries.places.internal.zzsz) zza.zzb()).zzn("com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs", "addInternalUsageAttributionId", 25, "AuxLibConfigs.java")).zzp("Internal Usage Attribution Id is too long: %s", str);
            return;
        }
        java.util.Set set = zzb;
        if (set.size() >= 10) {
            ((com.google.android.libraries.places.internal.zzsz) ((com.google.android.libraries.places.internal.zzsz) zza.zzb()).zzn("com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs", "addInternalUsageAttributionId", 31, "AuxLibConfigs.java")).zzo("Internal Usage Attribution Ids list is full.");
        } else {
            set.add(str);
        }
    }

    public static java.util.Set zzb() {
        return zzb;
    }
}
