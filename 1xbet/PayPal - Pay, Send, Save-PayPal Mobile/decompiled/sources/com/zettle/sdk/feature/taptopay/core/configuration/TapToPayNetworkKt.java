package com.zettle.sdk.feature.taptopay.core.configuration;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/network/NetworkModule;", "Lcom/zettle/sdk/commons/network/Service;", "url", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/zettle/sdk/commons/network/NetworkClient;", "createTapToPayNetworkClient", "(Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/commons/network/Service;Lcom/zettle/sdk/commons/network/Scope;)Lcom/zettle/sdk/commons/network/NetworkClient;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayNetworkKt {
    public static final com.zettle.sdk.commons.network.NetworkClient createTapToPayNetworkClient(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.commons.network.Service service, com.zettle.sdk.commons.network.Scope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        return com.zettle.sdk.core.network.NetworkModule.DefaultImpls.createNetworkClient$default(networkModule, service, scope, null, null, 15L, 0L, 0L, null, 236, null);
    }
}
