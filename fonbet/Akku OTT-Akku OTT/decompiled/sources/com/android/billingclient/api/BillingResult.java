package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.fragment.app.u;

/* loaded from: classes3.dex */
public final class BillingResult {
    private int zza;
    private String zzb;

    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.zza = this.zza;
            billingResult.zzb = this.zzb;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }

        public /* synthetic */ Builder(zzci zzciVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }

    @NonNull
    public String toString() {
        return u.a("Response Code: ", com.google.android.gms.internal.play_billing.zze.zzi(this.zza), ", Debug Message: ", this.zzb);
    }
}
