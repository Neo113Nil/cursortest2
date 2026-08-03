package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class ServerSideVerificationOptions {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static final class Builder {
        private java.lang.String zza = "";
        private java.lang.String zzb = "";

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions build() {
            return new com.google.android.gms.ads.rewarded.ServerSideVerificationOptions(this, null);
        }

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder setCustomData(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder setUserId(java.lang.String str) {
            this.zza = str;
            return this;
        }

        final /* synthetic */ java.lang.String zza() {
            return this.zza;
        }

        final /* synthetic */ java.lang.String zzb() {
            return this.zzb;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions.Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
    }

    public java.lang.String getCustomData() {
        return this.zzb;
    }

    public java.lang.String getUserId() {
        return this.zza;
    }
}
