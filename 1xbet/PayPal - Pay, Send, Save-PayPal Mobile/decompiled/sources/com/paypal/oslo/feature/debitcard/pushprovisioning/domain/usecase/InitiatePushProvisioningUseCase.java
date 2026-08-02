package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/InitiatePushProvisioningUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/InitiatePushProvisioningRequest;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/InitiatePushProvisioningStatus;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/repository/PrepareDigitizationDataRepository;", "prepareDigitizationDataRepository", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/repository/PrepareDigitizationDataRepository;Lcom/paypal/oslo/core/userstore/UserStore;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/InitiatePushProvisioningRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/repository/PrepareDigitizationDataRepository;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InitiatePushProvisioningUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningRequest, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public InitiatePushProvisioningUseCase(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository prepareDigitizationDataRepository, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prepareDigitizationDataRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = prepareDigitizationDataRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$processDigitizationData(final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.starpay.api.WalletData walletData, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.coroutines.Continuation continuation2) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$processDigitizationData$1 initiatePushProvisioningUseCase$processDigitizationData$1;
        int i;
        final kotlin.jvm.functions.Function1 function12;
        kotlin.coroutines.Continuation continuation3;
        final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2;
        if (continuation2 instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$processDigitizationData$1) {
            initiatePushProvisioningUseCase$processDigitizationData$1 = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$processDigitizationData$1) continuation2;
            if ((initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = initiatePushProvisioningUseCase$processDigitizationData$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest debitDigitizationRequest = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.DIGITIZATION_TOKEN_GOOGLE_PAY, debitInstrument.getId(), "MOBILE", com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXPERIENCE_CHANNEL, new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet(walletData.getWalletId(), walletData.getDeviceId(), com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider.GOOGLE_PAY), null, null, null, null, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Fetching pre-digitization data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fundingCardId", debitDigitizationRequest.getFundingCardId()), kotlin.TuplesKt.to("tokenProductName", debitDigitizationRequest.getTokenProductName())), null, 4, null);
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository prepareDigitizationDataRepository = initiatePushProvisioningUseCase.getHighSpeedVideoFpsRanges;
                    initiatePushProvisioningUseCase$processDigitizationData$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoSizes = continuation;
                    initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(walletData);
                    initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoFpsRangesFor = debitInstrument;
                    initiatePushProvisioningUseCase$processDigitizationData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitDigitizationRequest);
                    initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoSizesFor = 1;
                    obj = prepareDigitizationDataRepository.fetchDigitizationData(debitDigitizationRequest, initiatePushProvisioningUseCase$processDigitizationData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function12 = function1;
                    continuation3 = continuation;
                    debitInstrument2 = debitInstrument;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    debitInstrument2 = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoFpsRangesFor;
                    continuation3 = (kotlin.coroutines.Continuation) initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoSizes;
                    function12 = (kotlin.jvm.functions.Function1) initiatePushProvisioningUseCase$processDigitizationData$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus> useCaseResult = initiatePushProvisioningUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase.$r8$lambda$Eys4yo7GUIeKcXMz5NBHXGSq4hc(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase.this, debitInstrument2, function12, (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse) obj2);
                    }
                });
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation3.resumeWith(kotlin.Result.m23436constructorimpl(useCaseResult));
                return kotlin.Unit.INSTANCE;
            }
        }
        initiatePushProvisioningUseCase$processDigitizationData$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$processDigitizationData$1(initiatePushProvisioningUseCase, continuation2);
        java.lang.Object obj2 = initiatePushProvisioningUseCase$processDigitizationData$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initiatePushProvisioningUseCase$processDigitizationData$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus> useCaseResult2 = initiatePushProvisioningUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase.$r8$lambda$Eys4yo7GUIeKcXMz5NBHXGSq4hc(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase.this, debitInstrument2, function12, (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse) obj22);
            }
        });
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation3.resumeWith(kotlin.Result.m23436constructorimpl(useCaseResult2));
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final java.lang.Object invoke(final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningRequest initiatePushProvisioningRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        initiatePushProvisioningRequest.getStarPayClient().initiatePushProvisioning(initiatePushProvisioningRequest.getLauncher(), new kotlin.jvm.functions.Function2<com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletData>, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$invoke$2$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletData> result, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, ? extends kotlin.Unit> function1) {
                com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletData> result2 = result;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.starpay.api.ProvisioningMetadata, ? extends kotlin.Unit> function12 = function1;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
                com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase.access$handlePushProvisioningResult(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase.this, result2, function12, initiatePushProvisioningRequest.getCoroutineScope(), cancellableContinuationImpl2, initiatePushProvisioningRequest.getDebitInstrument());
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus $r8$lambda$Eys4yo7GUIeKcXMz5NBHXGSq4hc(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse debitDigitizationResponse) {
        com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber phoneNumber;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitDigitizationResponse, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Pre-digitization data fetched successfully", null, null, 6, null);
        java.lang.String preDigitizationData = debitDigitizationResponse.getPreDigitizationData();
        com.paypal.oslo.core.userstore.model.UserState value = initiatePushProvisioningUseCase.getHighResolutionOutputSizeshNQ4ISI.getUserState().getValue();
        if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            com.paypal.oslo.core.userstore.model.ProfilePhone primaryMobilePhone = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getPrimaryMobilePhone();
            java.lang.String nationalNumber = (primaryMobilePhone == null || (phoneNumber = primaryMobilePhone.getPhoneNumber()) == null) ? null : phoneNumber.getNationalNumber();
            if (nationalNumber != null) {
                str = nationalNumber;
            }
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "User profile not yet loaded, using empty phone number", null, null, 6, null);
        }
        com.paypal.oslo.feature.starpay.api.ProvisioningMetadata createProvisioningMetadata = com.paypal.oslo.feature.debitcard.pushprovisioning.domain.mapper.ProvisioningMetadataMapper.INSTANCE.createProvisioningMetadata(preDigitizationData, debitInstrument, str);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("fundingCardId", debitInstrument.getId());
        pairArr[1] = kotlin.TuplesKt.to("hasPhoneNumber", java.lang.Boolean.valueOf(str.length() > 0));
        com.paypal.android.logger.Logger.i$default(logger, "Push provisioning metadata prepared, invoking SDK callback", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        function1.invoke(createProvisioningMetadata);
        return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.InitiatePushProvisioningStatus.Initiated.INSTANCE;
    }

    public static final /* synthetic */ void access$handlePushProvisioningResult(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase initiatePushProvisioningUseCase, com.paypal.oslo.feature.starpay.api.Result result, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning initiated, handling wallet data result", null, null, 6, null);
        if (result instanceof com.paypal.oslo.feature.starpay.api.Result.Success) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning wallet data received successfully, proceeding to fetch digitization data", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase$handlePushProvisioningResult$1(initiatePushProvisioningUseCase, function1, continuation, result, debitInstrument, null), 3, null);
        } else {
            if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.starpay.api.Result.Failure failure = (com.paypal.oslo.feature.starpay.api.Result.Failure) result;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push provisioning wallet data retrieval failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", failure.getError().getMessage()), kotlin.TuplesKt.to("errorCode", failure.getError().getCode())), null, null, 12, null);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.PushProvisioningWalletError(null, failure.getError().getMessage())));
        }
    }
}
