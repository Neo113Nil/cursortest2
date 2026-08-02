package com.paypal.oslo.feature.mosaic.utils;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "fromJson", "(Ljava/lang/String;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "getWebViewUrl", "(Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtensionsKt {
    public static final /* synthetic */ <T> T fromJson(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
            kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
            return (T) companion.decodeFromString(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null), str);
        } catch (kotlinx.serialization.SerializationException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.mosaic.LoggerKt.log;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class).getSimpleName();
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize JSON ");
            sb.append(str);
            sb.append(" to ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            throw new java.lang.IllegalStateException("Failed to deserialize JSON to ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class).getSimpleName())), e);
        }
    }

    public static final java.lang.String getWebViewUrl(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigConfig, "");
        com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment environment = remoteConfigConfig.getEnvironment();
        if (kotlin.jvm.internal.Intrinsics.areEqual(environment, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Production.INSTANCE)) {
            return com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(environment, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Development.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (kotlin.text.StringsKt.startsWith$default(remoteConfigConfig.getBaseUrl(), com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.HTTPS_PREFIX, false, 2, (java.lang.Object) null)) {
            return kotlin.text.StringsKt.replace$default(remoteConfigConfig.getBaseUrl(), com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.HTTPS_PREFIX, "https://www.", false, 4, (java.lang.Object) null);
        }
        return remoteConfigConfig.getBaseUrl();
    }
}
