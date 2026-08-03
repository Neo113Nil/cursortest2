package com.google.android.gms.ads.preload;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class PreloadConfiguration {
    private final java.lang.String zza;

    @java.lang.Deprecated
    private final com.google.android.gms.ads.AdFormat zzb;
    private final com.google.android.gms.ads.AdRequest zzc;
    private final int zzd;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static class Builder {
        private final java.lang.String zza;
        private com.google.android.gms.ads.AdFormat zzb;
        private com.google.android.gms.ads.AdRequest zzc = new com.google.android.gms.ads.AdRequest.Builder().build();
        private int zzd;

        public Builder(java.lang.String str) {
            this.zza = str;
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration build() {
            return new com.google.android.gms.ads.preload.PreloadConfiguration(this, null);
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration.Builder setAdRequest(com.google.android.gms.ads.AdRequest adRequest) {
            this.zzc = adRequest;
            return this;
        }

        public com.google.android.gms.ads.preload.PreloadConfiguration.Builder setBufferSize(int i) {
            this.zzd = i;
            return this;
        }

        final /* synthetic */ java.lang.String zza() {
            return this.zza;
        }

        final /* synthetic */ com.google.android.gms.ads.AdFormat zzb() {
            return this.zzb;
        }

        final /* synthetic */ com.google.android.gms.ads.AdRequest zzc() {
            return this.zzc;
        }

        final /* synthetic */ int zzd() {
            return this.zzd;
        }

        @java.lang.Deprecated
        public Builder(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
            this.zza = str;
            this.zzb = adFormat;
        }
    }

    /* synthetic */ PreloadConfiguration(com.google.android.gms.ads.preload.PreloadConfiguration.Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
        this.zzc = builder.zzc();
        this.zzd = builder.zzd();
    }

    @java.lang.Deprecated
    public com.google.android.gms.ads.AdFormat getAdFormat() {
        com.google.android.gms.ads.AdFormat adFormat = this.zzb;
        return adFormat == null ? com.google.android.gms.ads.AdFormat.INTERSTITIAL : adFormat;
    }

    public com.google.android.gms.ads.AdRequest getAdRequest() {
        return this.zzc;
    }

    public java.lang.String getAdUnitId() {
        return this.zza;
    }

    public int getBufferSize() {
        return this.zzd;
    }
}
