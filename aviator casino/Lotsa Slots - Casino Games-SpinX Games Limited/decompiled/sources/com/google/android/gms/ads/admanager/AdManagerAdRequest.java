package com.google.android.gms.ads.admanager;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class AdManagerAdRequest extends com.google.android.gms.ads.AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static final class Builder extends com.google.android.gms.ads.AbstractAdRequestBuilder<com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder> {
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder addCategoryExclusion(java.lang.String str) {
            this.zza.zzm(str);
            return this;
        }

        public com.google.android.gms.ads.admanager.AdManagerAdRequest build() {
            return new com.google.android.gms.ads.admanager.AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder self() {
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder self() {
            return this;
        }

        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder setPublisherProvidedId(java.lang.String str) {
            this.zza.zzi(str);
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder builder, byte[] bArr) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public android.os.Bundle getCustomTargeting() {
        return this.zza.zzk();
    }

    public java.lang.String getPublisherProvidedId() {
        return this.zza.zzf();
    }
}
