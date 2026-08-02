package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadTaxReportsForYear$1", f = "TaxDocumentsViewModel.kt", i = {1, 1, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 283, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"userInfo", "countryCode", "userInfo", "countryCode"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsViewModel$loadTaxReportsForYear$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.access$loadInitialPageData(r6.getHighSpeedVideoSizes, r6.getHighSpeedVideoFpsRangesFor, r1, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.access$loadReportsOnly(r6.getHighSpeedVideoSizes, r6.getHighSpeedVideoFpsRangesFor, r1, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r7 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mviStateStore = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
            mviStateStore.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ShowLoader.INSTANCE);
            taxDocumentsUseCaseProvider = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(taxDocumentsUseCaseProvider.getGetUserInfo().invoke(), this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo userInfo = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.UserInfo) obj;
        java.lang.String countryCode = userInfo.getCountryCode();
        if (countryCode == null) {
            countryCode = "US";
        }
        z = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        if (z) {
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userInfo);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(countryCode);
            this.getHighSpeedVideoFpsRanges = 2;
        } else {
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userInfo);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(countryCode);
            this.getHighSpeedVideoFpsRanges = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadTaxReportsForYear$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadTaxReportsForYear$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxDocumentsViewModel$loadTaxReportsForYear$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadTaxReportsForYear$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = taxDocumentsViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
