package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2", f = "ManageAgreementBottomSheetScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManageAgreementBottomSheetScreenKt$handleUiEffects$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect manageAgreementUiEffect = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (kotlin.jvm.internal.Intrinsics.areEqual(manageAgreementUiEffect, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.DismissModal.INSTANCE)) {
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            if (!(manageAgreementUiEffect instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect manageAgreementUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessBottomSheetDestination(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.getSuccessModalTypeByEffect((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess) manageAgreementUiEffect)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect manageAgreementUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2) create(manageAgreementUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2 manageAgreementBottomSheetScreenKt$handleUiEffects$2 = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2(this.Camera2StreamConfigurationMap, continuation);
        manageAgreementBottomSheetScreenKt$handleUiEffects$2.getHighSpeedVideoFpsRangesFor = obj;
        return manageAgreementBottomSheetScreenKt$handleUiEffects$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageAgreementBottomSheetScreenKt$handleUiEffects$2(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt$handleUiEffects$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
