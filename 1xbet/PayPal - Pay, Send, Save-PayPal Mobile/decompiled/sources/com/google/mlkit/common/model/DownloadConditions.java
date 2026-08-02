package com.google.mlkit.common.model;

/* loaded from: classes9.dex */
public class DownloadConditions {
    private final boolean zza;
    private final boolean zzb;

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.mlkit.common.model.DownloadConditions)) {
            return false;
        }
        com.google.mlkit.common.model.DownloadConditions downloadConditions = (com.google.mlkit.common.model.DownloadConditions) obj;
        return this.zza == downloadConditions.zza && this.zzb == downloadConditions.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(this.zzb));
    }

    public static class Builder {
        private boolean zza = false;
        private boolean zzb = false;

        public com.google.mlkit.common.model.DownloadConditions.Builder requireWifi() {
            this.zzb = true;
            return this;
        }

        public com.google.mlkit.common.model.DownloadConditions.Builder requireCharging() {
            this.zza = true;
            return this;
        }

        public com.google.mlkit.common.model.DownloadConditions build() {
            return new com.google.mlkit.common.model.DownloadConditions(this.zza, this.zzb, null);
        }
    }

    public boolean isWifiRequired() {
        return this.zzb;
    }

    public boolean isChargingRequired() {
        return this.zza;
    }

    /* synthetic */ DownloadConditions(boolean z, boolean z2, com.google.mlkit.common.model.zzb zzbVar) {
        this.zza = z;
        this.zzb = z2;
    }
}
