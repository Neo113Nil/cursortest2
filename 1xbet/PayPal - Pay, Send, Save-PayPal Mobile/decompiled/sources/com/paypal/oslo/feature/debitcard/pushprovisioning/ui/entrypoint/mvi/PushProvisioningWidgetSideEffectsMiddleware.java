package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0094@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetState;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetPushProvisioningStatusUseCase;", "getPushProvisioningStatusUseCase", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetPushProvisioningStatusUseCase;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "p0", "p1", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "p2", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityResponse;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityResponse;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibility;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibility;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetPushProvisioningStatusUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningWidgetSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PushProvisioningWidgetSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPushProvisioningStatusUseCase, "");
        this.getHighSpeedVideoFpsRanges = getPushProvisioningStatusUseCase;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent pushProvisioningWidgetEvent, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState pushProvisioningWidgetState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(pushProvisioningWidgetEvent, pushProvisioningWidgetState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent pushProvisioningWidgetEvent, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState pushProvisioningWidgetState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        boolean z = pushProvisioningWidgetEvent instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested;
        if (z || (pushProvisioningWidgetEvent instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested)) {
            if (z) {
                starPayClient = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested) pushProvisioningWidgetEvent).getStarPayClient();
            } else {
                if (!(pushProvisioningWidgetEvent instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested)) {
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.UNEXCEPTED_EVENT_TYPE.toString());
                }
                starPayClient = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested) pushProvisioningWidgetEvent).getStarPayClient();
            }
            if (z) {
                productName = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityCheckRequested) pushProvisioningWidgetEvent).getProductName();
            } else {
                if (!(pushProvisioningWidgetEvent instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested)) {
                    throw new java.lang.IllegalStateException(com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.UNEXCEPTED_EVENT_TYPE.toString());
                }
                productName = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested) pushProvisioningWidgetEvent).getProductName();
            }
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(starPayClient, function1, productName, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1 pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1) {
            pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1 = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1) continuation;
            if ((pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest getPushProvisioningStatusRequest = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest(starPayClient, debitCardProductName.name());
                    pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(starPayClient);
                    pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.Camera2StreamConfigurationMap = function1;
                    pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoFpsRangesFor = debitCardProductName;
                    pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoSizes = 1;
                    obj = getPushProvisioningStatusUseCase.invoke2(getPushProvisioningStatusRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse>>) pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    debitCardProductName = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoFpsRangesFor;
                    function1 = (kotlin.jvm.functions.Function1) pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning eligibility retrieval failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMessage()), kotlin.TuplesKt.to("correlationId", error.getCorrelationId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, debitCardProductName.name())), null, null, 12, null);
                    function1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), null, 2, null));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData(), function1);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1(this, continuation);
        java.lang.Object obj2 = pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushProvisioningWidgetSideEffectsMiddleware$getPushProvisioningStatus$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, kotlin.Unit> p1) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility debitInstrumentTokenEligibility = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) p0.getTokenEligibilities());
        if (debitInstrumentTokenEligibility == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning eligibility retrieval failed: response contains no token eligibility entries", null, null, null, 14, null);
            p1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed(null, null, 3, null));
            return;
        }
        if (debitInstrumentTokenEligibility.getDebitInstrument() == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning eligibility retrieval failed: debit instrument is null in token data", null, null, null, 14, null);
            p1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrievalFailed(null, null, 3, null));
            return;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData(getHighSpeedVideoFpsRangesFor(debitInstrumentTokenEligibility), Camera2StreamConfigurationMap(debitInstrumentTokenEligibility), debitInstrumentTokenEligibility.getDebitInstrument());
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[7];
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility deviceEligibility = debitInstrumentTokenEligibility.getDeviceEligibility();
        pairArr[0] = kotlin.TuplesKt.to("isPrimaryEligible", deviceEligibility != null ? deviceEligibility.isPrimaryEligible() : null);
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility deviceEligibility2 = debitInstrumentTokenEligibility.getDeviceEligibility();
        pairArr[1] = kotlin.TuplesKt.to("isCompanionEligible", deviceEligibility2 != null ? deviceEligibility2.isCompanionEligible() : null);
        pairArr[2] = kotlin.TuplesKt.to("eligibilityStatus", debitInstrumentTokenEligibility.getEligibilityStatus());
        java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.EligibilityReason> eligibilityReasons = debitInstrumentTokenEligibility.getEligibilityReasons();
        pairArr[3] = kotlin.TuplesKt.to("eligibilityReasons", eligibilityReasons != null ? kotlin.collections.CollectionsKt.joinToString$default(eligibilityReasons, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware.$r8$lambda$3jwjUaMe2J6E2KopGT_QziHHgMw((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.EligibilityReason) obj);
            }
        }, 31, null) : null);
        pairArr[4] = kotlin.TuplesKt.to("TEligibilitiesSize", java.lang.Integer.valueOf(p0.getTokenEligibilities().size()));
        pairArr[5] = kotlin.TuplesKt.to("primaryWidgetStatus", debitInstrumentTokenEligibilityUiData.getPrimaryWidgetStatus());
        pairArr[6] = kotlin.TuplesKt.to("companionWidgetStatus", debitInstrumentTokenEligibilityUiData.getCompanionWidgetStatus());
        com.paypal.android.logger.Logger.i$default(logger, "Push provisioning eligibility retrieved", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        p1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.TokenEligibilityRetrieved(debitInstrumentTokenEligibilityUiData));
    }

    private static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility debitInstrumentTokenEligibility) {
        int i = com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware.WhenMappings.$EnumSwitchMapping$0[debitInstrumentTokenEligibility.getEligibilityStatus().ordinal()];
        if (i == 1 || i == 2) {
            com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility deviceEligibility = debitInstrumentTokenEligibility.getDeviceEligibility();
            if (deviceEligibility != null && kotlin.jvm.internal.Intrinsics.areEqual(deviceEligibility.isPrimaryEligible(), java.lang.Boolean.TRUE)) {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.AddToWallet.INSTANCE;
            }
            return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.ManageWallet.INSTANCE;
        }
        return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.Ineligible.INSTANCE;
    }

    private static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility debitInstrumentTokenEligibility) {
        int i = com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware.WhenMappings.$EnumSwitchMapping$0[debitInstrumentTokenEligibility.getEligibilityStatus().ordinal()];
        if (i == 1 || i == 2) {
            com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility deviceEligibility = debitInstrumentTokenEligibility.getDeviceEligibility();
            if (deviceEligibility != null && kotlin.jvm.internal.Intrinsics.areEqual(deviceEligibility.isCompanionEligible(), java.lang.Boolean.TRUE)) {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.AddToWallet.INSTANCE;
            }
            return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.ManageWallet.INSTANCE;
        }
        return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.Ineligible.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$3jwjUaMe2J6E2KopGT_QziHHgMw(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.EligibilityReason eligibilityReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityReason, "");
        return eligibilityReason.getReason();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
