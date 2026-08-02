package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\f\u0010\u0010J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardUseCase;", "", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "pushNotificationTokenDataSource", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/PendingCardActivation;", "pendingCardActivation", "(Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/PendingCardActivation;)Lkotlinx/coroutines/flow/Flow;", "Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/TermsAndConditionSession;", "tcSession", "(Lcom/gemalto/mfs/mwsdk/mobilegateway/enrollment/TermsAndConditionSession;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenDataSource;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "EnrollingServiceListener"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThalesDigitizeCardUseCase {
    public static final java.lang.String IDV_APP_TO_APP = "app_to_app";
    public static final java.lang.String IDV_CUSTOMER_SERVICE = "customer_service";
    public static final java.lang.String IDV_EMAIL = "email";
    public static final java.lang.String IDV_SMS = "cell_phone";
    public static final java.lang.String IDV_WEBSITE = "website";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.CardDataSource getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource getHighResolutionOutputSizeshNQ4ISI;

    public ThalesDigitizeCardUseCase(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = pushNotificationTokenDataSource;
        this.getHighSpeedVideoSizes = cardDataSource;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    public /* synthetic */ ThalesDigitizeCardUseCase(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenDataSource pushNotificationTokenDataSource, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pushNotificationTokenDataSource, cardDataSource, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> invoke(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession tcSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSession, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$1(tcSession, this, null));
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> invoke() {
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$2(this, null));
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> invoke(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingCardActivation, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$3(pendingCardActivation, this, null));
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardUseCase$EnrollingServiceListener;", "Lcom/gemalto/mfs/mwsdk/provisioning/listener/EnrollingServiceListener;", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "p0", "", "p1", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "p2", "Lkotlinx/coroutines/CoroutineDispatcher;", "p3", "<init>", "(Lkotlinx/coroutines/channels/SendChannel;[BLcom/paypal/android/taptopay/data/thales/card/CardDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/gemalto/mfs/mwsdk/utils/chcodeverifier/CHCodeVerifier;", "", "onCodeRequired", "(Lcom/gemalto/mfs/mwsdk/utils/chcodeverifier/CHCodeVerifier;)V", "onComplete", "()V", "Lcom/gemalto/mfs/mwsdk/provisioning/model/ProvisioningServiceError;", "onError", "(Lcom/gemalto/mfs/mwsdk/provisioning/model/ProvisioningServiceError;)V", "onStarted", "Camera2StreamConfigurationMap", "[B", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/SendChannel;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    static final class EnrollingServiceListener implements com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final byte[] getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.paypal.android.taptopay.data.thales.card.CardDataSource getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlinx.coroutines.channels.SendChannel<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> getHighSpeedVideoFpsRangesFor;
        private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        public EnrollingServiceListener(kotlinx.coroutines.channels.SendChannel<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> sendChannel, byte[] bArr, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendChannel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
            this.getHighSpeedVideoFpsRangesFor = sendChannel;
            this.getHighResolutionOutputSizeshNQ4ISI = bArr;
            this.getHighSpeedVideoFpsRanges = cardDataSource;
            this.getHighSpeedVideoSizes = coroutineDispatcher;
        }

        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener
        public final void onStarted() {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Enrolment service: onStarted", null, null, 6, null);
        }

        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener
        public final void onCodeRequired(com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifier p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Enrolment service: onCodeRequired", null, null, 6, null);
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bArr != null && bArr.length != 0) {
                com.gemalto.mfs.mwsdk.utils.chcodeverifier.SecureCodeInputer secureCodeInputer = p0.getSecureCodeInputer();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(secureCodeInputer, "");
                for (byte b : this.getHighResolutionOutputSizeshNQ4ISI) {
                    secureCodeInputer.input(b);
                }
                secureCodeInputer.finish();
                return;
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "activationCode is unexpectedly null or empty", null, null, 6, null);
        }

        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener
        public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
            kotlin.Pair[] pairArr = new kotlin.Pair[6];
            pairArr[0] = kotlin.TuplesKt.to("errorMessage", p0.getErrorMessage());
            pairArr[1] = kotlin.TuplesKt.to("statusCode", java.lang.Integer.valueOf(p0.getHttpStatusCode()));
            pairArr[2] = kotlin.TuplesKt.to("sdkCode", p0.getSdkErrorCode());
            pairArr[3] = kotlin.TuplesKt.to("cpsCode", java.lang.Integer.valueOf(p0.getCpsErrorCode()));
            pairArr[4] = kotlin.TuplesKt.to("tid", p0.getTokenId());
            kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError lastError = p0.getLastError();
            pairArr2[0] = kotlin.TuplesKt.to("statusCode", lastError != null ? java.lang.Integer.valueOf(lastError.getHttpStatusCode()) : null);
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError lastError2 = p0.getLastError();
            pairArr2[1] = kotlin.TuplesKt.to("sdkCode", lastError2 != null ? lastError2.getSdkErrorCode() : null);
            com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError lastError3 = p0.getLastError();
            pairArr2[2] = kotlin.TuplesKt.to("cpsCode", lastError3 != null ? java.lang.Integer.valueOf(lastError3.getCpsErrorCode()) : null);
            pairArr[5] = kotlin.TuplesKt.to("lastError", kotlin.collections.MapsKt.mapOf(pairArr2));
            com.paypal.android.logger.Logger.e$default(log, "Provisioning service error", kotlin.collections.MapsKt.mapOf(pairArr), null, p0.getCausingException(), 4, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$EnrollingServiceListener$onError$1(this, p0, null), 3, null);
        }

        @Override // com.gemalto.mfs.mwsdk.provisioning.listener.EnrollingServiceListener
        public final void onComplete() {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Enrolment service: onComplete", null, null, 6, null);
            this.getHighSpeedVideoFpsRanges.rehydrate$tap_to_pay_data_thales_release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1] */
    public static final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1 access$createMGDigitizationListener(final com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, final kotlinx.coroutines.channels.SendChannel sendChannel) {
        return new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1
            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener
            public final void onCPSActivationCodeAcquired(java.lang.String digitalCardId, byte[] code) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "CPS activation code acquired", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalCardId", digitalCardId), kotlin.TuplesKt.to("code", code)), null, 4, null);
                sendChannel.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted(digitalCardId));
                com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.access$handleCPSActivationCode(thalesDigitizeCardUseCase, sendChannel, code);
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener
            public final void onSelectIDVMethod(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector selector) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onSelectIDVMethod", null, null, 6, null);
                kotlinx.coroutines.channels.SendChannel<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> sendChannel2 = sendChannel;
                com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase2 = thalesDigitizeCardUseCase;
                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] idvMethodList = selector.getIdvMethodList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(idvMethodList, "");
                sendChannel2.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SelectIdentityVerification(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.access$toIdentityVerificationMethodList(thalesDigitizeCardUseCase2, idvMethodList), new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1(selector, null)));
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener
            public final void onActivationRequired(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingCardActivation, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onActivationRequired", null, null, 6, null);
                com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.access$handlePendingActivation(thalesDigitizeCardUseCase, sendChannel, pendingCardActivation, this);
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener
            public final void onComplete(java.lang.String digitalCardId) {
                com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onComplete", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalCardId", digitalCardId)), null, 4, null);
                cardDataSource = thalesDigitizeCardUseCase.getHighSpeedVideoSizes;
                cardDataSource.rehydrate$tap_to_pay_data_thales_release();
                sendChannel.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.DigitizeCardCompleted(digitalCardId));
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(sendChannel, null, 1, null);
            }

            @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener
            public final void onError(java.lang.String digitalCardId, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onError", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitalCardId), kotlin.TuplesKt.to("sdkErrorCode", error.getSDKErrorCode()), kotlin.TuplesKt.to("serverErrorCode", java.lang.Integer.valueOf(error.getServerErrorCode())), kotlin.TuplesKt.to("httpStatusCode", java.lang.Integer.valueOf(error.getHTTPStatusCode())), kotlin.TuplesKt.to("errorMessage", error.getMessage())), null, null, 12, null);
                kotlinx.coroutines.channels.SendChannel<com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> sendChannel2 = sendChannel;
                com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode sDKErrorCode = error.getSDKErrorCode();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKErrorCode, "");
                java.lang.String message = error.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "");
                sendChannel2.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.SDKError(sDKErrorCode, message));
            }
        };
    }

    public static final /* synthetic */ void access$handleCPSActivationCode(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, kotlinx.coroutines.channels.SendChannel sendChannel, byte[] bArr) {
        com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService enrollingBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getEnrollingBusinessService();
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling CPS activation code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isEnrolled", enrollingBusinessService.isEnrolled())), null, 4, null);
        com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus isEnrolled = enrollingBusinessService.isEnrolled();
        int i = isEnrolled == null ? -1 : com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.WhenMappings.$EnumSwitchMapping$0[isEnrolled.ordinal()];
        if (i == -1) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unexpected enrollment null state", null, null, null, 14, null);
            sendChannel.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error("null EnrollmentStatus", null, 2, null));
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(sendChannel, null, 1, null);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling enrollment in progress state", null, null, 6, null);
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                enrollingBusinessService.continueEnrollment(language, new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.EnrollingServiceListener(sendChannel, copyOf, thalesDigitizeCardUseCase.getHighSpeedVideoSizes, thalesDigitizeCardUseCase.Camera2StreamConfigurationMap));
                return;
            }
            if (i == 3) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling enrollment complete state", null, null, 6, null);
                com.gemalto.mfs.mwsdk.provisioning.sdkconfig.ProvisioningBusinessService provisioningBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getProvisioningBusinessService();
                byte[] copyOf2 = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                provisioningBusinessService.sendActivationCode(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.EnrollingServiceListener(sendChannel, copyOf2, thalesDigitizeCardUseCase.getHighSpeedVideoSizes, thalesDigitizeCardUseCase.Camera2StreamConfigurationMap));
                return;
            }
            return;
        }
        java.lang.String walletId = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardEnrollmentService().getWalletId();
        java.lang.String value = thalesDigitizeCardUseCase.getHighResolutionOutputSizeshNQ4ISI.getToken().getValue();
        if (value != null) {
            try {
                byte[] copyOf3 = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf3, "");
                enrollingBusinessService.enroll(walletId, value, language, new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.EnrollingServiceListener(sendChannel, copyOf3, thalesDigitizeCardUseCase.getHighSpeedVideoSizes, thalesDigitizeCardUseCase.Camera2StreamConfigurationMap));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            } catch (java.lang.Throwable th) {
                com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Error while enrolling for service", th);
                new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error("Error while enrolling for service. Thales SDK exception", th);
                return;
            }
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to handle card enrollment, Not enrolled for push notification", null, null, null, 14, null);
        kotlinx.coroutines.channels.ChannelResult.m24079boximpl(sendChannel.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.Error("null EnrollmentStatus", null, 2, null)));
    }

    public static final /* synthetic */ void access$handlePendingActivation(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, kotlinx.coroutines.channels.SendChannel sendChannel, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener) {
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState state = pendingCardActivation.getState();
        int i = state == null ? -1 : com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
        if (i == -1) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unexpected null PendingCardActivation state received", null, null, null, 14, null);
            return;
        }
        if (i == 1) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling IDV_METHOD_NOT_SELECTED state", null, null, 6, null);
            pendingCardActivation.invokeIdvSelection(mGDigitizationListener);
            return;
        }
        if (i == 2) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling OTP_NEEDED state", null, null, 6, null);
            sendChannel.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleOtpIdentityVerification(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$handlePendingActivation$1(pendingCardActivation, mGDigitizationListener, null)));
            return;
        }
        if (i == 3) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unsupported PendingCardActivation.WEB_3DS_NEEDED", null, null, null, 14, null);
            return;
        }
        if (i == 4) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling APP2APP_NEEDED state", null, null, 6, null);
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData appToAppData = pendingCardActivation.getAppToAppData();
            java.lang.String scheme = appToAppData.getScheme();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scheme, "");
            java.lang.String payLoad = appToAppData.getPayLoad();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(payLoad, "");
            java.lang.String source = appToAppData.getSource();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
            sendChannel.mo9266trySendJP2dKIU(new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState.HandleAppToAppIdentityVerification(scheme, payLoad, source));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final /* synthetic */ java.util.List access$toIdentityVerificationMethodList(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] iDVMethodArr) {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod iDVMethod : iDVMethodArr) {
            java.lang.String type = iDVMethod.getType();
            if (type != null) {
                switch (type.hashCode()) {
                    case -1006757807:
                        if (type.equals(IDV_SMS)) {
                            java.lang.String id = iDVMethod.getId();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
                            java.lang.String value = iDVMethod.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
                            createListBuilder.add(new com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms(id, value));
                            break;
                        }
                        break;
                    case -60936364:
                        if (type.equals(IDV_CUSTOMER_SERVICE)) {
                            java.lang.String id2 = iDVMethod.getId();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "");
                            java.lang.String value2 = iDVMethod.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "");
                            createListBuilder.add(new com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService(id2, value2));
                            break;
                        }
                        break;
                    case 96619420:
                        if (type.equals("email")) {
                            java.lang.String id3 = iDVMethod.getId();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id3, "");
                            java.lang.String value3 = iDVMethod.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value3, "");
                            createListBuilder.add(new com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail(id3, value3));
                            break;
                        }
                        break;
                    case 1224335515:
                        if (type.equals(IDV_WEBSITE)) {
                            java.lang.String id4 = iDVMethod.getId();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id4, "");
                            java.lang.String value4 = iDVMethod.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value4, "");
                            createListBuilder.add(new com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod.Website(id4, value4));
                            break;
                        }
                        break;
                    case 1307774523:
                        if (type.equals(IDV_APP_TO_APP)) {
                            java.lang.String id5 = iDVMethod.getId();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id5, "");
                            java.lang.String value5 = iDVMethod.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value5, "");
                            createListBuilder.add(new com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp(id5, value5));
                            break;
                        }
                        break;
                }
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unsupported ID&V method type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", iDVMethod.getType())), null, null, 12, null);
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_NEEDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_IN_PROGRESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_COMPLETE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.values().length];
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.IDV_METHOD_NOT_SELECTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.OTP_NEEDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.WEB_3DS_NEEDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
