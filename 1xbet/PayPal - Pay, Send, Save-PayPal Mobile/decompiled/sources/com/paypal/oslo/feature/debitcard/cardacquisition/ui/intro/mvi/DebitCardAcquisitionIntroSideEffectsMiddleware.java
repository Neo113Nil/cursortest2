package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0094@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroSideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/shared/base/SideEffectsMiddleware;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/CheckDebitCardEligibilityUseCase;", "checkDebitCardEligibilityUseCase", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/CheckDebitCardEligibilityUseCase;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "event", "currentState", "Lkotlin/Function1;", "", "eventDispatcher", "handleEvent", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroEvent;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/usecase/CheckDebitCardEligibilityUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroSideEffectsMiddleware extends com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroSideEffectsMiddleware$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroSideEffectsMiddleware;", "create", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/intro/mvi/DebitCardAcquisitionIntroSideEffectsMiddleware;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName);
    }

    @dagger.assisted.AssistedInject
    public DebitCardAcquisitionIntroSideEffectsMiddleware(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkDebitCardEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        this.getHighResolutionOutputSizeshNQ4ISI = checkDebitCardEligibilityUseCase;
        this.productName = debitCardProductName;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.SideEffectsMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object handleEvent(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent debitCardAcquisitionIntroEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return handleEvent2(debitCardAcquisitionIntroEvent, debitCardAcquisitionIntroState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    /* renamed from: handleEvent, reason: avoid collision after fix types in other method */
    protected final java.lang.Object handleEvent2(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent debitCardAcquisitionIntroEvent, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroState debitCardAcquisitionIntroState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if ((debitCardAcquisitionIntroEvent instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.CheckEligibility) || (debitCardAcquisitionIntroEvent instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.ErrorActionCtaClicked)) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(function1, continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1 debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1;
        int i;
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1) {
            debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1 = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1) continuation;
            if ((debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest debitCardEligibilityRequest = new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest(this.productName, null, null, false, 6, null);
                    com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighSpeedVideoFpsRangesFor = function1;
                    debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(debitCardEligibilityRequest);
                    debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighSpeedVideoSizes = 1;
                    obj = checkDebitCardEligibilityUseCase.invoke2(debitCardEligibilityRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse>>) debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
                    function1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.EligibilityLoaded((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData()));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
                    function1.invoke(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroEvent.EligibilityCheckFailed(new com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo(error.getTag(), error.getErrorMessage()), com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error)));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1 = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1(this, continuation);
        java.lang.Object obj2 = debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debitCardAcquisitionIntroSideEffectsMiddleware$checkEligibility$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
