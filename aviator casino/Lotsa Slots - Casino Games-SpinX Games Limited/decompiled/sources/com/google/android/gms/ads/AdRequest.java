package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class AdRequest {
    public static final java.lang.String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final com.google.android.gms.ads.internal.client.zzeh zza;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static class Builder extends com.google.android.gms.ads.AbstractAdRequestBuilder<com.google.android.gms.ads.AdRequest.Builder> {
        public com.google.android.gms.ads.AdRequest build() {
            return new com.google.android.gms.ads.AdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.AdRequest.Builder self() {
            return this;
        }
    }

    protected AdRequest(com.google.android.gms.ads.AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.zza = new com.google.android.gms.ads.internal.client.zzeh(abstractAdRequestBuilder.zza);
    }

    public java.lang.String getAdString() {
        return this.zza.zzn();
    }

    public java.lang.String getContentUrl() {
        return this.zza.zza();
    }

    @java.lang.Deprecated
    public <T extends com.google.android.gms.ads.mediation.customevent.CustomEvent> android.os.Bundle getCustomEventExtrasBundle(java.lang.Class<T> cls) {
        return this.zza.zze(cls);
    }

    public android.os.Bundle getCustomTargeting() {
        return this.zza.zzk();
    }

    public java.util.Set<java.lang.String> getKeywords() {
        return this.zza.zzc();
    }

    public java.util.List<java.lang.String> getNeighboringContentUrls() {
        return this.zza.zzb();
    }

    public <T extends com.google.android.gms.ads.mediation.MediationExtrasReceiver> android.os.Bundle getNetworkExtrasBundle(java.lang.Class<T> cls) {
        return this.zza.zzd(cls);
    }

    public long getPlacementId() {
        return this.zza.zzr();
    }

    public java.lang.String getRequestAgent() {
        return this.zza.zzg();
    }

    public boolean isTestDevice(android.content.Context context) {
        return this.zza.zzh(context);
    }

    public final com.google.android.gms.ads.internal.client.zzeh zza() {
        return this.zza;
    }
}
