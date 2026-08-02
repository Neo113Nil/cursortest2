package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$initializeScreen$1", f = "TaxDocumentsViewModel.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsViewModel$initializeScreen$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userStore = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(userStore.getUserState(), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$initializeScreen$1$terminalState$1(null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "initializeScreen: user is LoggedOut, deferring to auth layer", null, null, 6, null);
            return kotlin.Unit.INSTANCE;
        }
        if (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.access$extractCountryCode(this.getHighResolutionOutputSizeshNQ4ISI, userState) != null) {
            taxDocumentsUseCaseProvider = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.YearDropdownData invoke = taxDocumentsUseCaseProvider.getGetYearDropdownData().invoke();
            this.Camera2StreamConfigurationMap.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.AvailableYearsLoaded(invoke));
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear taxYear = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) invoke.getYearList());
            java.lang.String year = taxYear != null ? taxYear.getYear() : null;
            if (year != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r11), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadTaxReportsForYear$1(this.getHighResolutionOutputSizeshNQ4ISI, year, null), 3, null);
            }
        } else {
            java.lang.String access$getInitializationErrorMessage = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.access$getInitializationErrorMessage(this.getHighResolutionOutputSizeshNQ4ISI, userState);
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "initializeScreen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", access$getInitializationErrorMessage), kotlin.TuplesKt.to("terminalState", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(userState.getClass()).getSimpleName())), null, 4, null);
            this.Camera2StreamConfigurationMap.invoke(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.InitializationFailed(access$getInitializationErrorMessage));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$initializeScreen$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$initializeScreen$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaxDocumentsViewModel$initializeScreen$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$initializeScreen$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = taxDocumentsViewModel;
        this.Camera2StreamConfigurationMap = function1;
    }
}
