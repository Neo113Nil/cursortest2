package com.paypal.oslo.feature.wallet.banks.ui.search;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$4$1", f = "SearchInstitutionsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SearchInstitutionsScreenKt$SearchInstitutionsScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution>> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt.access$SearchInstitutionsScreen$lambda$0(this.getHighSpeedVideoFpsRanges) instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState.Success) {
            com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState access$SearchInstitutionsScreen$lambda$0 = com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt.access$SearchInstitutionsScreen$lambda$0(this.getHighSpeedVideoFpsRanges);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$SearchInstitutionsScreen$lambda$0, "");
            com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState.Success success = (com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState.Success) access$SearchInstitutionsScreen$lambda$0;
            booleanValue = ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
            if (booleanValue && com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt.access$SearchInstitutionsScreen$lambda$2(this.getHighSpeedVideoSizes).length() > 0) {
                this.getHighSpeedVideoFpsRangesFor.setValue(success.getInstitutions());
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$4$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchInstitutionsScreenKt$SearchInstitutionsScreen$4$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.UiState> state, androidx.compose.runtime.State<java.lang.Boolean> state2, androidx.compose.runtime.State<java.lang.String> state3, androidx.compose.runtime.MutableState<java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution>> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighResolutionOutputSizeshNQ4ISI = state2;
        this.getHighSpeedVideoSizes = state3;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
