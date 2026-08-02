package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"!\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/core/network/NetworkModule;", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/zettle/sdk/commons/network/NetworkClient;", "planet", "(Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/commons/network/Scope;)Lcom/zettle/sdk/commons/network/NetworkClient;", "", "ZETTLE_SDK_RESULT", "Ljava/lang/String;", "Lcom/zettle/sdk/ZettleSDK;", "", "Lcom/zettle/sdk/features/FeatureConf;", "getFeatures", "(Lcom/zettle/sdk/ZettleSDK;)Ljava/util/Map;", "features", "Lcom/zettle/sdk/core/Register;", "getModules", "(Lcom/zettle/sdk/ZettleSDK;)Lcom/zettle/sdk/core/Register;", "modules"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZettleSDKExtKt {
    public static final java.lang.String ZETTLE_SDK_RESULT = "ZettleSDKActivity::Result";

    public static final com.zettle.sdk.core.Register getModules(com.zettle.sdk.ZettleSDK zettleSDK) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleSDK, "");
        return ((com.zettle.sdk.ZettleSDKImpl) zettleSDK).getStore$core_publicRelease();
    }

    public static final java.util.Map<java.lang.String, com.zettle.sdk.features.FeatureConf> getFeatures(com.zettle.sdk.ZettleSDK zettleSDK) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleSDK, "");
        return ((com.zettle.sdk.ZettleSDKImpl) zettleSDK).getFeatures$core_publicRelease();
    }

    public static /* synthetic */ com.zettle.sdk.commons.network.NetworkClient planet$default(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.commons.network.Scope scope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            scope = com.zettle.sdk.commons.network.Scope.Payment;
        }
        return planet(networkModule, scope);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Old way of calling APIs")
    public static final com.zettle.sdk.commons.network.NetworkClient planet(com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.commons.network.Scope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        return com.zettle.sdk.core.network.NetworkModule.DefaultImpls.createNetworkClient$default(networkModule, com.zettle.sdk.commons.network.Service.CardPayment, scope, null, null, 0L, 0L, 0L, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }
}
