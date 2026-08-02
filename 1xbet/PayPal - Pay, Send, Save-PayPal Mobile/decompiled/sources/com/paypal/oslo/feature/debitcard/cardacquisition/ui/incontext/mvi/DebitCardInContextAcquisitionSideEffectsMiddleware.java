package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0094@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/CheckDebitCardEligibilityUseCase;", "checkDebitCardEligibilityUseCase", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "fundingOptionsCache", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/CheckDebitCardEligibilityUseCase;Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityRequest;", "getHighSpeedVideoFpsRanges", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityRequest;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "p1", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/CheckDebitCardEligibilityUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardInContextAcquisitionSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache getHighSpeedVideoSizes;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionSideEffectsMiddleware$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionSideEffectsMiddleware;", "create", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionSideEffectsMiddleware;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName);
    }

    @dagger.assisted.AssistedInject
    public DebitCardInContextAcquisitionSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkDebitCardEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptionsCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        this.getHighSpeedVideoFpsRanges = checkDebitCardEligibilityUseCase;
        this.getHighSpeedVideoSizes = debitCardFundingOptionsCache;
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardProductName;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent debitCardInContextAcquisitionEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState debitCardInContextAcquisitionUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(debitCardInContextAcquisitionEvent, debitCardInContextAcquisitionUiState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent debitCardInContextAcquisitionEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState debitCardInContextAcquisitionUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardInContextAcquisitionEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.CheckInContextProvisionEligibility.INSTANCE)) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        if (debitCardInContextAcquisitionEvent instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked) {
            java.lang.String fundingSourceId = ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked) debitCardInContextAcquisitionEvent).getFundingSourceId();
            if (fundingSourceId == null) {
                function1.invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing.INSTANCE);
            } else {
                com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource selectedFundingSource = this.getHighSpeedVideoSizes.getSelectedFundingSource(fundingSourceId);
                if ((selectedFundingSource != null ? selectedFundingSource.getContingencyDetails() : null) != null) {
                    function1.invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceContingencyDetected.INSTANCE);
                } else {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed(fundingSourceId));
                }
            }
        } else if (debitCardInContextAcquisitionEvent instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked) debitCardInContextAcquisitionEvent).getBannerState(), com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.FundingSourceContingency.INSTANCE)) {
                java.lang.String selectedFundingSourceId = this.getHighSpeedVideoSizes.getSelectedFundingSourceId();
                java.lang.String str = selectedFundingSourceId;
                if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                    function1.invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing.INSTANCE);
                } else {
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource selectedFundingSource2 = this.getHighSpeedVideoSizes.getSelectedFundingSource(selectedFundingSourceId);
                    if (selectedFundingSource2 == null) {
                        function1.invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing.INSTANCE);
                    } else {
                        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
                        java.lang.String lastNChars = selectedFundingSource2.getLastNChars();
                        if (lastNChars == null) {
                            lastNChars = "";
                        }
                        function1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank(new com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig(selectedFundingSourceId, bankAccountType, lastNChars, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC)));
                    }
                }
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardInContextAcquisitionEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBackButtonClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(debitCardInContextAcquisitionEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnCloseButtonClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(debitCardInContextAcquisitionEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnSkipButtonClicked.INSTANCE)) {
            this.getHighSpeedVideoSizes.invalidateAll();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1 debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1) {
            debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1 = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1) continuation;
            if ((debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                    debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.getHighSpeedVideoFpsRanges = function1;
                    debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.Camera2StreamConfigurationMap = 1;
                    obj = checkDebitCardEligibilityUseCase.invoke2(highSpeedVideoFpsRanges, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse>>) debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj, function1);
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1 = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1(this, continuation);
        java.lang.Object obj2 = debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardInContextAcquisitionSideEffectsMiddleware$handleCheckEligibility$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2, function1);
        return kotlin.Unit.INSTANCE;
    }

    private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest getHighSpeedVideoFpsRanges() {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest(this.getHighResolutionOutputSizeshNQ4ISI, null, new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.DIGITIZATION_TOKEN_PAYPAL), false, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse> p0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent, kotlin.Unit> p1) {
        if (!(p0 instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
            if (!(p0 instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            p1.invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckError.INSTANCE);
            return;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) p0;
        int i = com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionSideEffectsMiddleware.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) success.getData()).getEligibilityStatus().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            p1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed(((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) success.getData()).getEligibilityReasons()));
            return;
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) success.getData()).getEligibleDebitCardDetails());
        if (eligibleDebitCardDetails != null) {
            p1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded(eligibleDebitCardDetails));
        } else {
            p1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed(((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) success.getData()).getEligibilityReasons()));
        }
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
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INELIGIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
