package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class BillingResult {
    private int zza;
    private java.lang.String zzb;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static class Builder {
        private int zza;
        private java.lang.String zzb = "";

        private Builder() {
        }

        /* synthetic */ Builder(com.android.billingclient.api.zzcd zzcdVar) {
        }

        public com.android.billingclient.api.BillingResult build() {
            com.android.billingclient.api.BillingResult billingResult = new com.android.billingclient.api.BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        public com.android.billingclient.api.BillingResult.Builder setDebugMessage(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.android.billingclient.api.BillingResult.Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }
    }

    public static com.android.billingclient.api.BillingResult.Builder newBuilder() {
        return new com.android.billingclient.api.BillingResult.Builder(null);
    }

    public java.lang.String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    public java.lang.String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.zzb.zzh(this.zza) + ", Debug Message: " + this.zzb;
    }
}
