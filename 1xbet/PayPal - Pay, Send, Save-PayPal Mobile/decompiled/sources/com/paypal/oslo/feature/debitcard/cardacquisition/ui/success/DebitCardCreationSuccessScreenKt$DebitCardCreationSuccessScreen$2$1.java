package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$2$1", f = "DebitCardCreationSuccessScreen.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, nl = {127}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect> uiEffect = this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect();
            final com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel debitCardCreationSuccessScreenViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            final java.lang.String str = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect debitCardCreationSuccessScreenEffect = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect) obj2;
                    if (!(debitCardCreationSuccessScreenEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.CloseSuccessScreen)) {
                        if (!(debitCardCreationSuccessScreenEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.NavigateToCardManagement)) {
                            if (!(debitCardCreationSuccessScreenEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.NavigateToCardManagementWithProvisioningSuccess)) {
                                if (debitCardCreationSuccessScreenEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEffect.NavigateToAddCardholderFlow) {
                                    com.paypal.oslo.core.navigation.AppNavigator.this.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj3) {
                                            return com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt.$r8$lambda$olvVPro4k1EHyk2T7od1cgiJA5c(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
                                        }
                                    });
                                }
                            } else {
                                com.paypal.oslo.core.navigation.AppNavigator.this.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj3) {
                                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt.m14247$r8$lambda$EncGPH2tnfpTYutJpH8GnQwMIs(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
                                    }
                                });
                            }
                        } else {
                            com.paypal.oslo.core.navigation.AppNavigator.this.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj22) {
                                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt.$r8$lambda$3fwBu2AwoqEiZ03Qsmxu5yCDWOs(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.this, r2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj22);
                                }
                            });
                        }
                    } else {
                        com.paypal.oslo.core.navigation.AppNavigator.this.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt.m14251$r8$lambda$ju8eNlBh2OoAuxdNcZdgkQ4fgo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
                            }
                        });
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$2$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel debitCardCreationSuccessScreenViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardCreationSuccessScreenViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoSizes = str;
    }
}
