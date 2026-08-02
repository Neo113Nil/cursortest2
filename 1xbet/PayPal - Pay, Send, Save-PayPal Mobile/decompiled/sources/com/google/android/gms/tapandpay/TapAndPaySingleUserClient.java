package com.google.android.gms.tapandpay;

/* loaded from: classes8.dex */
public interface TapAndPaySingleUserClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> {
    com.google.android.gms.tasks.Task<java.lang.String> getActiveWalletId();

    com.google.android.gms.tasks.Task<java.lang.String> getLinkingToken(com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest getLinkingTokenRequest);
}
