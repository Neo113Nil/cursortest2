package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelSideEffectMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CloseCreditLoanUseCase;", "closeCreditLoanUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CloseCreditLoanUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/CloseCreditLoanUseCase;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeCancelSideEffectMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ChangeCancelSideEffectMiddleware(com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase closeCreditLoanUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeCreditLoanUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        this.getHighSpeedVideoFpsRanges = closeCreditLoanUseCase;
        this.getHighSpeedVideoFpsRangesFor = sessionStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$onEvent(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware changeCancelSideEffectMiddleware, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent changeCancelEvent, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware$onEvent$1 changeCancelSideEffectMiddleware$onEvent$1;
        int i;
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult useCaseResult;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware$onEvent$1) {
            changeCancelSideEffectMiddleware$onEvent$1 = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware$onEvent$1) continuation;
            if ((changeCancelSideEffectMiddleware$onEvent$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                changeCancelSideEffectMiddleware$onEvent$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = changeCancelSideEffectMiddleware$onEvent$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = changeCancelSideEffectMiddleware$onEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (changeCancelEvent instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.PrimaryButtonPressed) {
                        java.lang.String getHighSpeedVideoFpsRangesFor = changeCancelSideEffectMiddleware.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRangesFor();
                        if (getHighSpeedVideoFpsRangesFor == null) {
                            getHighSpeedVideoFpsRangesFor = "";
                        }
                        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CloseCreditLoanRequest closeCreditLoanRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CloseCreditLoanRequest(getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext(changeCancelSideEffectMiddleware.getHighSpeedVideoFpsRangesFor.getGetOutputMinFrameDuration(), com.paypal.oslo.feature.bnplacquisition.domain.utilities.NetworkConstants.MOBILE_APP, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.utilities.RequestUsageChannel.CONTACTLESS_MOBILE_WALLET)));
                        com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase closeCreditLoanUseCase = changeCancelSideEffectMiddleware.getHighSpeedVideoFpsRanges;
                        changeCancelSideEffectMiddleware$onEvent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(changeCancelEvent);
                        changeCancelSideEffectMiddleware$onEvent$1.getHighSpeedVideoFpsRangesFor = function1;
                        changeCancelSideEffectMiddleware$onEvent$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeCreditLoanRequest);
                        changeCancelSideEffectMiddleware$onEvent$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = closeCreditLoanUseCase.invoke2(closeCreditLoanRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) changeCancelSideEffectMiddleware$onEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (kotlin.jvm.functions.Function1) changeCancelSideEffectMiddleware$onEvent$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) obj;
                if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success)) {
                    function1.invoke(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiSuccess.INSTANCE);
                } else if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) {
                    function1.invoke(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError(null, 1, null));
                } else {
                    if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function1.invoke(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError(null, 1, null));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        changeCancelSideEffectMiddleware$onEvent$1 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware$onEvent$1(changeCancelSideEffectMiddleware, continuation);
        java.lang.Object obj2 = changeCancelSideEffectMiddleware$onEvent$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = changeCancelSideEffectMiddleware$onEvent$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) obj2;
        if (!(useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelSideEffectMiddleware$invoke$1(this, input, null), 3, null);
    }
}
