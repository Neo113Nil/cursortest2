package com.google.android.gms.ads.internal.adaptersettings;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
class AdapterSettings {
    private static volatile com.google.android.gms.ads.internal.adaptersettings.AdapterSettings instance;
    private final com.google.android.gms.internal.ads.zzbhz adapterSettingsInternal = com.google.android.gms.ads.internal.client.zzba.zzd();

    AdapterSettings() {
    }

    private boolean getBoolean(java.lang.String str, boolean z) {
        return this.adapterSettingsInternal.zzf(str, z);
    }

    private float getFloat(java.lang.String str, float f) {
        return this.adapterSettingsInternal.zze(str, f);
    }

    public static com.google.android.gms.ads.internal.adaptersettings.AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (com.google.android.gms.ads.internal.adaptersettings.AdapterSettings.class) {
                if (instance == null) {
                    instance = new com.google.android.gms.ads.internal.adaptersettings.AdapterSettings();
                }
            }
        }
        return instance;
    }

    private int getInt(java.lang.String str, int i) {
        return this.adapterSettingsInternal.zzd(str, i);
    }

    private long getLong(java.lang.String str, long j) {
        return this.adapterSettingsInternal.zzc(str, j);
    }

    private java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
