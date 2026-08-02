package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$loadCloseAccountEligibility$1", f = "CloseYourAccountViewModel.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {188, 197, 215}, m = "invokeSuspend", n = {"result", "this_$iv", "eligibilityResult", "$i$f$fold", "$i$a$-fold-CloseYourAccountViewModel$loadCloseAccountEligibility$1$2", "result", "this_$iv", "eligibilityResult", "$i$f$fold", "$i$a$-fold-CloseYourAccountViewModel$loadCloseAccountEligibility$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, s = {"L$0", "L$1", "L$3", "I$0", "I$1", "L$0", "L$1", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class CloseYourAccountViewModel$loadCloseAccountEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        if (r10 != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0125  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider;
        com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel;
        com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountErrorContentProvider closeAccountErrorContentProvider;
        com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountErrorContentProvider closeAccountErrorContentProvider2;
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider2;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult closeAccountEligibilityResult;
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider3;
        com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel2;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile closeAccountUserProfile;
        com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider closeAccountPersonalUserContentProvider;
        com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent content;
        com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountBusinessUserContentProvider closeAccountBusinessUserContentProvider;
        com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider closeAccountIneligibleUserContentProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            closeAccountUseCasesProvider = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            this.getOutputFormats = 1;
            obj = closeAccountUseCasesProvider.getGetEligibility().invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeAccountEligibilityResult = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult) this.getInputFormats;
                    closeYourAccountViewModel = (com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel) this.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile closeAccountUserProfile2 = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile) obj;
                    closeAccountIneligibleUserContentProvider = closeYourAccountViewModel.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent content2 = closeAccountIneligibleUserContentProvider.getContent(closeAccountEligibilityResult.getIneligibilityReasons(), closeAccountUserProfile2 != null ? closeAccountUserProfile2.getUserCountry() : null);
                    closeYourAccountViewModel.onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady(content2.getItems(), content2.getFooter()));
                    return kotlin.Unit.INSTANCE;
                }
                closeYourAccountViewModel2 = (com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                closeAccountUserProfile = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(closeAccountUserProfile == null ? closeAccountUserProfile.getAccountType() : null, "BUSINESS")) {
                    closeAccountPersonalUserContentProvider = closeYourAccountViewModel2.getHighResolutionOutputSizeshNQ4ISI;
                    content = closeAccountPersonalUserContentProvider.getContent(closeAccountUserProfile != null ? closeAccountUserProfile.getUserEmail() : null, closeAccountUserProfile != null ? closeAccountUserProfile.getUserCountry() : null);
                } else {
                    closeAccountBusinessUserContentProvider = closeYourAccountViewModel2.getHighSpeedVideoSizes;
                    content = closeAccountBusinessUserContentProvider.getContent(0);
                }
                closeYourAccountViewModel2.onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady(content.getItems(), content.getFooter()));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        closeYourAccountViewModel = this.getOutputMinFrameDuration;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult closeAccountEligibilityResult2 = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult) ((arrow.core.Either.Right) either).getValue();
            java.lang.String decisionCode = closeAccountEligibilityResult2.getDecisionCode();
            if (kotlin.jvm.internal.Intrinsics.areEqual(decisionCode, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE)) {
                closeAccountUseCasesProvider3 = closeYourAccountViewModel.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getUserProfile = closeAccountUseCasesProvider3.getGetUserProfile();
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizes = closeYourAccountViewModel;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountEligibilityResult2);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getOutputFormats = 2;
                obj = getUserProfile.invoke(this);
                if (obj != coroutine_suspended) {
                    closeYourAccountViewModel2 = closeYourAccountViewModel;
                    closeAccountUserProfile = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile) obj;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(closeAccountUserProfile == null ? closeAccountUserProfile.getAccountType() : null, "BUSINESS")) {
                    }
                    closeYourAccountViewModel2.onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady(content.getItems(), content.getFooter()));
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(decisionCode, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE)) {
                closeAccountUseCasesProvider2 = closeYourAccountViewModel.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getUserProfile2 = closeAccountUseCasesProvider2.getGetUserProfile();
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizes = closeYourAccountViewModel;
                this.getInputFormats = closeAccountEligibilityResult2;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getOutputFormats = 3;
                obj = getUserProfile2.invoke(this);
                if (obj != coroutine_suspended) {
                    closeAccountEligibilityResult = closeAccountEligibilityResult2;
                    com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile closeAccountUserProfile22 = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile) obj;
                    closeAccountIneligibleUserContentProvider = closeYourAccountViewModel.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent content22 = closeAccountIneligibleUserContentProvider.getContent(closeAccountEligibilityResult.getIneligibilityReasons(), closeAccountUserProfile22 != null ? closeAccountUserProfile22.getUserCountry() : null);
                    closeYourAccountViewModel.onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady(content22.getItems(), content22.getFooter()));
                }
            } else {
                closeAccountErrorContentProvider = closeYourAccountViewModel.getHighSpeedVideoFpsRanges;
                java.util.List<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem> content3 = closeAccountErrorContentProvider.getContent();
                closeAccountErrorContentProvider2 = closeYourAccountViewModel.getHighSpeedVideoFpsRanges;
                closeYourAccountViewModel.onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.ScreenContentReady(content3, closeAccountErrorContentProvider2.getFooter()));
            }
            return coroutine_suspended;
        }
        if (!(either instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        closeYourAccountViewModel.onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.EligibilityError((com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError) ((arrow.core.Either.Left) either).getValue()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$loadCloseAccountEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$loadCloseAccountEligibility$1(this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseYourAccountViewModel$loadCloseAccountEligibility$1(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$loadCloseAccountEligibility$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = closeYourAccountViewModel;
    }
}
