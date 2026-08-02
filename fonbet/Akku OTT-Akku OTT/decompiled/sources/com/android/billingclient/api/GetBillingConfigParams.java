package com.android.billingclient.api;

import androidx.annotation.NonNull;

@zzh
/* loaded from: classes3.dex */
public final class GetBillingConfigParams {

    @zzh
    public static final class Builder {
        private Builder() {
        }

        @NonNull
        public GetBillingConfigParams build() {
            return new GetBillingConfigParams();
        }
    }

    private GetBillingConfigParams() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
