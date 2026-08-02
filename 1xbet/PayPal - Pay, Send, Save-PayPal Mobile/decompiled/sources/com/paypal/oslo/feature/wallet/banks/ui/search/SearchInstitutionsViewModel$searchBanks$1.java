package com.paypal.oslo.feature.wallet.banks.ui.search;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel$searchBanks$1", f = "SearchInstitutionsViewModel.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SearchInstitutionsViewModel$searchBanks$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase searchInstitutionsUseCase;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError openBankingInstitutionsError;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            searchInstitutionsUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = searchInstitutionsUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        if (ior instanceof arrow.core.Ior.Right) {
            mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState.Success((java.util.List) ((arrow.core.Ior.Right) ior).getValue(), false));
        } else {
            boolean z = ior instanceof arrow.core.Ior.Left;
            if (z || (ior instanceof arrow.core.Ior.Both)) {
                if (z) {
                    openBankingInstitutionsError = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError) ((arrow.core.Ior.Left) ior).getValue();
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    openBankingInstitutionsError = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsError) ((arrow.core.Ior.Both) ior).getLeftValue();
                }
                mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState.Error(openBankingInstitutionsError));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel$searchBanks$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel$searchBanks$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchInstitutionsViewModel$searchBanks$1(com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel searchInstitutionsViewModel, java.lang.String str, java.lang.String str2, int i, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel$searchBanks$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = searchInstitutionsViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRanges = i;
    }
}
