package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class QueryPurchasesParams {
    private final java.lang.String zza;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static class Builder {
        private java.lang.String zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzdi zzdiVar) {
        }

        public com.android.billingclient.api.QueryPurchasesParams build() {
            if (this.zza != null) {
                return new com.android.billingclient.api.QueryPurchasesParams(this, null);
            }
            throw new java.lang.IllegalArgumentException("Product type must be set");
        }

        public com.android.billingclient.api.QueryPurchasesParams.Builder setProductType(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ QueryPurchasesParams(com.android.billingclient.api.QueryPurchasesParams.Builder builder, com.android.billingclient.api.zzdj zzdjVar) {
        this.zza = builder.zza;
    }

    public static com.android.billingclient.api.QueryPurchasesParams.Builder newBuilder() {
        return new com.android.billingclient.api.QueryPurchasesParams.Builder(null);
    }

    public final java.lang.String zza() {
        return this.zza;
    }
}
