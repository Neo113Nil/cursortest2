package com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel$loadAddresses$1", f = "AddressSelectionViewModel.kt", i = {0}, l = {110}, m = "invokeSuspend", n = {"request"}, nl = {111}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class AddressSelectionViewModel$loadAddresses$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase getAddressesUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesRequest getAddressesRequest = new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesRequest(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.name());
            getAddressesUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getAddressesRequest);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getAddressesUseCase.invoke2(getAddressesRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress>>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) {
            this.getHighSpeedVideoSizesFor.processEvent(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded((java.util.List) ((com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success) useCaseResult).getData(), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error) useCaseResult;
            this.getHighSpeedVideoSizesFor.processEvent(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed(error.getTag(), com.paypal.oslo.feature.debitcard.shared.ui.model.UseCaseResultExtensionsKt.toDebitErrorType(error), this.getHighSpeedVideoSizes));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel$loadAddresses$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel$loadAddresses$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSelectionViewModel$loadAddresses$1(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel addressSelectionViewModel, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel$loadAddresses$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardProductName;
        this.getHighSpeedVideoSizesFor = addressSelectionViewModel;
        this.getHighSpeedVideoSizes = str2;
    }
}
