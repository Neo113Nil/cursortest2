package com.paypal.oslo.feature.wallet.banks.ui.search;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1", f = "SearchInstitutionsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo access$SearchInstitutionsScreen$lambda$4 = com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt.access$SearchInstitutionsScreen$lambda$4(this.getHighSpeedVideoFpsRanges);
        if (access$SearchInstitutionsScreen$lambda$4 instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo.GoBackWithResult) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$SearchInstitutionsScreen$lambda$4 instanceof com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo.GoToDestination) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (access$SearchInstitutionsScreen$lambda$4 != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt.access$SearchInstitutionsScreen$lambda$4(this.getHighSpeedVideoFpsRanges) != null) {
            this.Camera2StreamConfigurationMap.resetNavigation();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo navigateTo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(((com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo.GoToDestination) navigateTo).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo navigateTo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(((com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo.GoBackWithResult) navigateTo).getResult());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel searchInstitutionsViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel.NavigateTo> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt$SearchInstitutionsScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = searchInstitutionsViewModel;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
