package com.paypal.oslo.feature.cardconnect.sdk;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/sdk/KnotSDKLauncher;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "eventDispatcher", "launch", "(Landroid/content/Context;Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KnotSDKLauncher {
    public static final int $stable = 0;

    public final void launch(android.content.Context context, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration configuration, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent, kotlin.Unit> eventDispatcher) {
        com.knotapi.knot.models.Environment environment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.cardconnect.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.util.List<java.lang.Integer> merchantIds = configuration.getMerchantIds();
        pairArr[0] = kotlin.TuplesKt.to("merchantCount", java.lang.Integer.valueOf(merchantIds != null ? merchantIds.size() : 0));
        pairArr[1] = kotlin.TuplesKt.to("environment", configuration.getEnvironment().name());
        com.paypal.android.logger.Logger.d$default(logger, "KnotSDKLauncher: launching SDK", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        try {
            java.lang.String sessionId = configuration.getSessionId();
            java.lang.String clientId = configuration.getClientId();
            int i = com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher.WhenMappings.$EnumSwitchMapping$0[configuration.getEnvironment().ordinal()];
            if (i == 1) {
                environment = com.knotapi.knot.models.Environment.production;
            } else if (i == 2) {
                environment = com.knotapi.knot.models.Environment.development;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                environment = com.knotapi.knot.models.Environment.sandbox;
            }
            com.knotapi.knot.models.Environment environment2 = environment;
            com.knotapi.knot.Knot.Product product = com.knotapi.knot.Knot.Product.card_switcher;
            java.util.List<java.lang.Integer> merchantIds2 = configuration.getMerchantIds();
            com.knotapi.knot.models.CustomerConfiguration customerConfiguration = null;
            int[] intArray = merchantIds2 != null ? kotlin.collections.CollectionsKt.toIntArray(merchantIds2) : null;
            boolean shouldUseCategories = configuration.getShouldUseCategories();
            boolean shouldUseSearch = configuration.getShouldUseSearch();
            java.lang.String source = configuration.getSource();
            java.lang.String customerCardName = configuration.getCustomerCardName();
            java.lang.String customerName = configuration.getCustomerName();
            java.lang.String customerLogoId = configuration.getCustomerLogoId();
            if (customerCardName != null || customerName != null || customerLogoId != null) {
                customerConfiguration = new com.knotapi.knot.models.CustomerConfiguration(customerCardName, customerName, customerLogoId);
            }
            com.knotapi.knot.Knot.open(context, new com.knotapi.knot.models.KnotConfiguration(sessionId, clientId, environment2, product, intArray, java.lang.Boolean.valueOf(shouldUseCategories), java.lang.Boolean.valueOf(shouldUseSearch), null, source, customerConfiguration), new com.knotapi.knot.interfaces.KnotEventDelegate() { // from class: com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher$buildEventDelegate$1
                @Override // com.knotapi.knot.interfaces.KnotEventDelegate
                public final void onSuccess(java.lang.String merchant) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cardconnect.LoggerKt.log, "KnotSDKLauncher: SDK onSuccess", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("merchant", merchant)), null, 4, null);
                    eventDispatcher.invoke(new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success(merchant, null, 2, null));
                }

                @Override // com.knotapi.knot.interfaces.KnotEventDelegate
                public final void onError(com.knotapi.knot.models.KnotError knotError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(knotError, "");
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cardconnect.LoggerKt.log, "KnotSDKLauncher: SDK onError", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", knotError.getErrorCode()), kotlin.TuplesKt.to("errorDescription", knotError.getErrorDescription())), null, 4, null);
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent, kotlin.Unit> function1 = eventDispatcher;
                    java.lang.String errorCode = knotError.getErrorCode();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorCode, "");
                    java.lang.String errorDescription = knotError.getErrorDescription();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorDescription, "");
                    function1.invoke(new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error(errorCode, errorDescription, null, 4, null));
                }

                @Override // com.knotapi.knot.interfaces.KnotEventDelegate
                public final void onExit() {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cardconnect.LoggerKt.log, "KnotSDKLauncher: SDK onExit", null, null, 6, null);
                    eventDispatcher.invoke(new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit(null, 1, null));
                }

                @Override // com.knotapi.knot.interfaces.KnotEventDelegate
                public final void onEvent(com.knotapi.knot.models.KnotEvent knotEvent) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(knotEvent, "");
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cardconnect.LoggerKt.log, "KnotSDKLauncher: SDK onEvent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", knotEvent.getEvent()), kotlin.TuplesKt.to("merchantName", knotEvent.getMerchantName()), kotlin.TuplesKt.to("merchantId", knotEvent.getMerchantId()), kotlin.TuplesKt.to("taskId", knotEvent.getTaskId())), null, 4, null);
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent, kotlin.Unit> function1 = eventDispatcher;
                    java.lang.String event = knotEvent.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(event, "");
                    java.lang.String merchantName = knotEvent.getMerchantName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(merchantName, "");
                    java.lang.String merchantId = knotEvent.getMerchantId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(merchantId, "");
                    java.lang.String taskId = knotEvent.getTaskId();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(taskId, "");
                    function1.invoke(new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent(event, merchantName, merchantId, taskId, knotEvent.getMetaData()));
                }
            });
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.cardconnect.LoggerKt.log.e("KnotSDKLauncher: failed to launch SDK", e2);
            eventDispatcher.invoke(new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error("SDK_LAUNCH_ERROR", "Unable to launch card connection service. Please try again.", null, 4, null));
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.values().length];
            try {
                iArr[com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.PRODUCTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.STAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.SANDBOX.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
