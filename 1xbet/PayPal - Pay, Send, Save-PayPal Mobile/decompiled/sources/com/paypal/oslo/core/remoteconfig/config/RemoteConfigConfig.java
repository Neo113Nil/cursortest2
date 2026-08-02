package com.paypal.oslo.core.remoteconfig.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "getEnvironment", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "environment", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "Lkotlinx/coroutines/flow/Flow;", "getEnvironmentFlow", "()Lkotlinx/coroutines/flow/Flow;", "environmentFlow", "getBaseUrlFlow", "baseUrlFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface RemoteConfigConfig {
    java.lang.String getBaseUrl();

    kotlinx.coroutines.flow.Flow<java.lang.String> getBaseUrlFlow();

    com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment getEnvironment();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment> getEnvironmentFlow();
}
