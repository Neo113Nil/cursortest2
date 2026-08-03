package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public class ConsentRequestParameters {
    private final boolean zza;
    private final java.lang.String zzb;
    private final com.google.android.ump.ConsentDebugSettings zzc;
    private final java.lang.String zzd;

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public static final class Builder {
        private boolean zza;
        private java.lang.String zzb;
        private com.google.android.ump.ConsentDebugSettings zzc;
        private java.lang.String zzd;

        public com.google.android.ump.ConsentRequestParameters build() {
            return new com.google.android.ump.ConsentRequestParameters(this, null);
        }

        public com.google.android.ump.ConsentRequestParameters.Builder setAdMobAppId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.ump.ConsentRequestParameters.Builder setConsentDebugSettings(com.google.android.ump.ConsentDebugSettings consentDebugSettings) {
            this.zzc = consentDebugSettings;
            return this;
        }

        public com.google.android.ump.ConsentRequestParameters.Builder setConsentSyncId(java.lang.String str) {
            if (str == null) {
                str = null;
            } else if (!str.matches("^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$")) {
                android.util.Log.e("UserMessagingPlatform", "The UMP SDK requires a valid consent sync ID matching the following regex: ^[0-9a-zA-Z+.=\\/_,$\\-{}]{22,150}$. See the setConsentSyncId() API documentation for more details.");
                return this;
            }
            this.zzd = str;
            return this;
        }

        public com.google.android.ump.ConsentRequestParameters.Builder setTagForUnderAgeOfConsent(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(com.google.android.ump.ConsentRequestParameters.Builder builder, com.google.android.ump.zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
    }

    public com.google.android.ump.ConsentDebugSettings getConsentDebugSettings() {
        return this.zzc;
    }

    public java.lang.String getConsentSyncId() {
        return this.zzd;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.zza;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }
}
