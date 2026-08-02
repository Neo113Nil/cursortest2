package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0013\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkSetupManager;", "", "Lcom/payair/logic/managers/SetupManager;", "setupManager", "Lcom/payair/logic/managers/PaymentManager;", "paymentManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/init/HceConfigurationProvider;", "hceConfigurationProvider", "<init>", "(Lcom/payair/logic/managers/SetupManager;Lcom/payair/logic/managers/PaymentManager;Lcom/paypal/oslo/feature/taptopay/data/payair/init/HceConfigurationProvider;)V", "", "Lcom/payair/model/CardScheme;", "schemes", "", "baseUrl", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "Lcom/payair/model/Response;", "initialize", "(Ljava/util/Set;Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/RegistrationStatus;", "checkRegistrationStatus", "()Lcom/payair/model/RegistrationStatus;", "", "checkDeviceKeys", "()V", "", "isSupported", "Landroid/content/Context;", "context", "setLowValueTransactionSupport", "(ZLandroid/content/Context;)V", "getHighSpeedVideoFpsRanges", "Lcom/payair/logic/managers/SetupManager;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/PaymentManager;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/payair/init/HceConfigurationProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SdkSetupManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.payair.logic.managers.PaymentManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.payair.logic.managers.SetupManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SdkSetupManager(com.payair.logic.managers.SetupManager setupManager, com.payair.logic.managers.PaymentManager paymentManager, com.paypal.oslo.feature.taptopay.data.payair.init.HceConfigurationProvider hceConfigurationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceConfigurationProvider, "");
        this.Camera2StreamConfigurationMap = setupManager;
        this.getHighSpeedVideoSizes = paymentManager;
        this.getHighResolutionOutputSizeshNQ4ISI = hceConfigurationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initialize(java.util.Set<? extends com.payair.model.CardScheme> set, java.lang.String str, java.lang.Class<? extends android.app.Activity> cls, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager$initialize$1 sdkSetupManager$initialize$1;
        int i;
        com.payair.model.Response response;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager$initialize$1) {
            sdkSetupManager$initialize$1 = (com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager$initialize$1) continuation;
            if ((sdkSetupManager$initialize$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                sdkSetupManager$initialize$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager$initialize$1 sdkSetupManager$initialize$12 = sdkSetupManager$initialize$1;
                java.lang.Object obj = sdkSetupManager$initialize$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sdkSetupManager$initialize$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[5];
                    pairArr[0] = kotlin.TuplesKt.to("paymentAppProviderId", this.getHighResolutionOutputSizeshNQ4ISI.getPaymentAppProviderId());
                    pairArr[1] = kotlin.TuplesKt.to("apiCustomerBaseUrl", str);
                    pairArr[2] = kotlin.TuplesKt.to("wakeupIntentURI", this.getHighResolutionOutputSizeshNQ4ISI.getWakeUpIntent(cls));
                    pairArr[3] = kotlin.TuplesKt.to("closeIntentURI", this.getHighResolutionOutputSizeshNQ4ISI.getWakeUpIntent(cls));
                    java.util.Set<? extends com.payair.model.CardScheme> set2 = set;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
                    java.util.Iterator<T> it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.payair.model.CardScheme) it.next()).name());
                    }
                    pairArr[4] = kotlin.TuplesKt.to("schemes", arrayList);
                    com.paypal.android.logger.Logger.d$default(logger, "Initializing Payair SDK", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.payair.logic.managers.SetupManager setupManager = this.Camera2StreamConfigurationMap;
                    java.lang.String paymentAppProviderId = this.getHighResolutionOutputSizeshNQ4ISI.getPaymentAppProviderId();
                    java.lang.String wakeUpIntent = this.getHighResolutionOutputSizeshNQ4ISI.getWakeUpIntent(cls);
                    java.lang.String wakeUpIntent2 = this.getHighResolutionOutputSizeshNQ4ISI.getWakeUpIntent(cls);
                    sdkSetupManager$initialize$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
                    sdkSetupManager$initialize$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    sdkSetupManager$initialize$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cls);
                    sdkSetupManager$initialize$12.getHighSpeedVideoSizes = 1;
                    obj = setupManager.initialize(paymentAppProviderId, str, wakeUpIntent, wakeUpIntent2, set, sdkSetupManager$initialize$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                response = (com.payair.model.Response) obj;
                if (!(response instanceof com.payair.model.Response.Error)) {
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    com.payair.model.Response.Error error = (com.payair.model.Response.Error) response;
                    pairArr2[0] = kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(error.getErrorCode()));
                    java.util.List<com.payair.model.NetworkError> networkErrors = error.getNetworkErrors();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(networkErrors, 10));
                    for (com.payair.model.NetworkError networkError : networkErrors) {
                        arrayList2.add(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", networkError.getErrorCode()), kotlin.TuplesKt.to("reasonCode", networkError.getReasonCode()), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, networkError.getDescription())));
                    }
                    pairArr2[1] = kotlin.TuplesKt.to("networkErrors", arrayList2);
                    com.paypal.android.logger.Logger.w$default(logger2, "SDK initialization failed", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                    return response;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SDK initialization successful", null, null, 6, null);
                return response;
            }
        }
        sdkSetupManager$initialize$1 = new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager$initialize$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager$initialize$1 sdkSetupManager$initialize$122 = sdkSetupManager$initialize$1;
        java.lang.Object obj2 = sdkSetupManager$initialize$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sdkSetupManager$initialize$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (!(response instanceof com.payair.model.Response.Error)) {
        }
    }

    public final com.payair.model.RegistrationStatus checkRegistrationStatus() {
        return this.Camera2StreamConfigurationMap.checkRegistrationStatus();
    }

    public final void checkDeviceKeys() {
        this.Camera2StreamConfigurationMap.checkIfDeviceUnlockKeysAreValid();
    }

    public final void setLowValueTransactionSupport(boolean isSupported, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.payair.logic.managers.PaymentManager.DefaultImpls.setLvtSupported$default(this.getHighSpeedVideoSizes, isSupported, context, null, 4, null);
    }
}
