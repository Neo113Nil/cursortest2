package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1", f = "AutoSaveFullScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveFullScreenKt$AutoSaveFullScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.access$AutoSaveFullScreen$lambda$0(this.getHighSpeedVideoSizes) instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup) {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState access$AutoSaveFullScreen$lambda$0 = com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt.access$AutoSaveFullScreen$lambda$0(this.getHighSpeedVideoSizes);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$AutoSaveFullScreen$lambda$0, "");
            final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup moveToAutoSaveSetup = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup) access$AutoSaveFullScreen$lambda$0;
            this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup moveToAutoSaveSetup, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.SavingsAmountInputDestination(moveToAutoSaveSetup.getGoal(), com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE, (java.lang.String) null, (java.lang.String) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AutoSaveFullScreenKt$AutoSaveFullScreen$3$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = state;
    }
}
