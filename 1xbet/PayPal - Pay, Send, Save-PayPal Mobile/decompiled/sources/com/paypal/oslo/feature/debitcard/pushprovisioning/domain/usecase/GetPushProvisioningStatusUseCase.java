package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetPushProvisioningStatusUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/GetPushProvisioningStatusRequest;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityResponse;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/repository/TokenEligibilityRepository;", "tokenEligibilityRepository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/repository/TokenEligibilityRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/GetPushProvisioningStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/starpay/api/Token;", "p0", "", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityRequest;", "getHighSpeedVideoSizes", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityRequest;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletToken;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/starpay/api/Token;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletToken;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/repository/TokenEligibilityRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetPushProvisioningStatusUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.TokenEligibilityRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetPushProvisioningStatusUseCase(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.TokenEligibilityRepository tokenEligibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenEligibilityRepository, "");
        this.Camera2StreamConfigurationMap = tokenEligibilityRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest getPushProvisioningStatusRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse>> continuation) {
        return invoke2(getPushProvisioningStatusRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r9 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest getPushProvisioningStatusRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse>> continuation) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$invoke$1 getPushProvisioningStatusUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest getPushProvisioningStatusRequest2;
        java.lang.Object result;
        com.paypal.oslo.feature.starpay.api.Result result2;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$invoke$1) {
            getPushProvisioningStatusUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$invoke$1) continuation;
            if ((getPushProvisioningStatusUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getPushProvisioningStatusUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getPushProvisioningStatusUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPushProvisioningStatusUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    getPushProvisioningStatusRequest2 = getPushProvisioningStatusRequest;
                    getPushProvisioningStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = getPushProvisioningStatusRequest2;
                    getPushProvisioningStatusUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    getPushProvisioningStatusUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$invoke$1 getPushProvisioningStatusUseCase$invoke$12 = getPushProvisioningStatusUseCase$invoke$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(getPushProvisioningStatusUseCase$invoke$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    getPushProvisioningStatusRequest.getStarPayClient().fetchProvisionedTokens((com.paypal.oslo.feature.starpay.api.OnCompleteListener) new com.paypal.oslo.feature.starpay.api.OnCompleteListener<java.util.List<? extends com.paypal.oslo.feature.starpay.api.Token>>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$invoke$provisionTokensResult$1$1
                        @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
                        public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends java.util.List<? extends com.paypal.oslo.feature.starpay.api.Token>> result3) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result3, "");
                            kotlinx.coroutines.CancellableContinuation<com.paypal.oslo.feature.starpay.api.Result<? extends java.util.List<com.paypal.oslo.feature.starpay.api.Token>>> cancellableContinuation = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(result3));
                        }
                    });
                    result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(getPushProvisioningStatusUseCase$invoke$12);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    int i2 = getPushProvisioningStatusUseCase$invoke$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest getPushProvisioningStatusRequest3 = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest) getPushProvisioningStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    result = obj;
                    getPushProvisioningStatusRequest2 = getPushProvisioningStatusRequest3;
                }
                result2 = (com.paypal.oslo.feature.starpay.api.Result) result;
                if (!(result2 instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
                    com.paypal.oslo.feature.starpay.api.Result.Failure failure = (com.paypal.oslo.feature.starpay.api.Result.Failure) result2;
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push Provisioning TIds fetch failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", failure.getError().getCode()), kotlin.TuplesKt.to("errorMessage", failure.getError().getMessage()), kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, getPushProvisioningStatusRequest2.getProductName())), null, null, 12, null);
                    java.lang.Integer code = failure.getError().getCode();
                    if (code != null && code.intValue() == 15002) {
                        java.util.List<com.paypal.oslo.feature.starpay.api.Token> emptyList = kotlin.collections.CollectionsKt.emptyList();
                        java.lang.String productName = getPushProvisioningStatusRequest2.getProductName();
                        getPushProvisioningStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPushProvisioningStatusRequest2);
                        getPushProvisioningStatusUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(result2);
                        getPushProvisioningStatusUseCase$invoke$1.Camera2StreamConfigurationMap = 2;
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(emptyList, productName, getPushProvisioningStatusUseCase$invoke$1);
                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            return highSpeedVideoFpsRanges;
                        }
                    } else {
                        return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.PushProvisioningWalletError(null, failure.getError().getMessage());
                    }
                } else {
                    if (!(result2 instanceof com.paypal.oslo.feature.starpay.api.Result.Success)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.util.List<com.paypal.oslo.feature.starpay.api.Token> list = (java.util.List) ((com.paypal.oslo.feature.starpay.api.Result.Success) result2).getData();
                    java.lang.String productName2 = getPushProvisioningStatusRequest2.getProductName();
                    getPushProvisioningStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getPushProvisioningStatusRequest2);
                    getPushProvisioningStatusUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(result2);
                    getPushProvisioningStatusUseCase$invoke$1.Camera2StreamConfigurationMap = 3;
                    java.lang.Object highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(list, productName2, getPushProvisioningStatusUseCase$invoke$1);
                    if (highSpeedVideoFpsRanges2 != coroutine_suspended) {
                        return highSpeedVideoFpsRanges2;
                    }
                }
                return coroutine_suspended;
            }
        }
        getPushProvisioningStatusUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getPushProvisioningStatusUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPushProvisioningStatusUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        result2 = (com.paypal.oslo.feature.starpay.api.Result) result;
        if (!(result2 instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
        }
        return coroutine_suspended2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.starpay.api.Token> list, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse>> continuation) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$checkTokenEligibility$1 getPushProvisioningStatusUseCase$checkTokenEligibility$1;
        int i;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$checkTokenEligibility$1) {
            getPushProvisioningStatusUseCase$checkTokenEligibility$1 = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$checkTokenEligibility$1) continuation;
            if ((getPushProvisioningStatusUseCase$checkTokenEligibility$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getPushProvisioningStatusUseCase$checkTokenEligibility$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getPushProvisioningStatusUseCase$checkTokenEligibility$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPushProvisioningStatusUseCase$checkTokenEligibility$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Push Provisioning eligibility check", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size())), kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, str)), null, 4, null);
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.TokenEligibilityRepository tokenEligibilityRepository = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest highSpeedVideoSizes = getHighSpeedVideoSizes(list, str);
                    getPushProvisioningStatusUseCase$checkTokenEligibility$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    getPushProvisioningStatusUseCase$checkTokenEligibility$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getPushProvisioningStatusUseCase$checkTokenEligibility$1.getHighSpeedVideoFpsRangesFor = this;
                    getPushProvisioningStatusUseCase$checkTokenEligibility$1.Camera2StreamConfigurationMap = 1;
                    obj = tokenEligibilityRepository.checkTokenEligibility(highSpeedVideoSizes, getPushProvisioningStatusUseCase$checkTokenEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getPushProvisioningStatusUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getPushProvisioningStatusUseCase = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase) getPushProvisioningStatusUseCase$checkTokenEligibility$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getPushProvisioningStatusUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase.m14259$r8$lambda$A7zGRGQk0goYeMwfp6klMZDc8o((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse) obj2);
                    }
                });
            }
        }
        getPushProvisioningStatusUseCase$checkTokenEligibility$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$checkTokenEligibility$1(this, continuation);
        java.lang.Object obj2 = getPushProvisioningStatusUseCase$checkTokenEligibility$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPushProvisioningStatusUseCase$checkTokenEligibility$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return getPushProvisioningStatusUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase.m14259$r8$lambda$A7zGRGQk0goYeMwfp6klMZDc8o((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse) obj22);
            }
        });
    }

    private static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest getHighSpeedVideoSizes(java.util.List<com.paypal.oslo.feature.starpay.api.Token> list, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.DIGITIZATION_TOKEN_GOOGLE_PAY.getValue());
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf(str);
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            java.util.List<com.paypal.oslo.feature.starpay.api.Token> list2 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.starpay.api.Token) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest("MOBILE", com.paypal.oslo.feature.debitcard.pushprovisioning.constants.PushProvisioningConstants.EXPERIENCE_CHANNEL, null, listOf, listOf2, java.lang.Boolean.FALSE, arrayList, 4, null);
    }

    private static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.starpay.api.Token token) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken(token.getFpanLastFour(), token.getTpanLastFour(), com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType.PHONE, null, null, null, null, null, token.getIssuerTokenId(), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
    }

    /* renamed from: $r8$lambda$A7zGRGQk0goYe-Mwfp6klMZDc8o, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse m14259$r8$lambda$A7zGRGQk0goYeMwfp6klMZDc8o(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse debitInstrumentTokenEligibilityResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenEligibilityResponse, "");
        return debitInstrumentTokenEligibilityResponse;
    }
}
