package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class RootTelemetryConfigManager {
    private static com.google.android.gms.common.internal.RootTelemetryConfigManager zza;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration zzb = new com.google.android.gms.common.internal.RootTelemetryConfiguration(0, false, false, 0, 0);
    private com.google.android.gms.common.internal.RootTelemetryConfiguration zzc;

    public final void zza(com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration) {
        synchronized (this) {
            if (rootTelemetryConfiguration == null) {
                this.zzc = zzb;
                return;
            }
            com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration2 = this.zzc;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
                this.zzc = rootTelemetryConfiguration;
            }
        }
    }

    public final com.google.android.gms.common.internal.RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    public static com.google.android.gms.common.internal.RootTelemetryConfigManager getInstance() {
        com.google.android.gms.common.internal.RootTelemetryConfigManager rootTelemetryConfigManager;
        synchronized (com.google.android.gms.common.internal.RootTelemetryConfigManager.class) {
            if (zza == null) {
                zza = new com.google.android.gms.common.internal.RootTelemetryConfigManager();
            }
            rootTelemetryConfigManager = zza;
        }
        return rootTelemetryConfigManager;
    }

    private RootTelemetryConfigManager() {
    }
}
