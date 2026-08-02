package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1", f = "DebitCardActivationRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardActivationRouterKt$DebitCardActivationRouter$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode debitPinMode;
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo copy;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt.access$DebitCardActivationRouter$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI) == com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState.INITIAL) {
            this.getHighSpeedVideoFpsRangesFor.updateNavigationState();
            if (this.Camera2StreamConfigurationMap.isPinSet()) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                copy = r2.copy((r26 & 1) != 0 ? r2.instrumentId : null, (r26 & 2) != 0 ? r2.productName : null, (r26 & 4) != 0 ? r2.cardImageUrl : null, (r26 & 8) != 0 ? r2.lastFourDigits : null, (r26 & 16) != 0 ? r2.isPinSet : false, (r26 & 32) != 0 ? r2.displayAddress : null, (r26 & 64) != 0 ? r2.lifecycleState : null, (r26 & 128) != 0 ? r2.billingAddressId : null, (r26 & 256) != 0 ? r2.expectedArrivalDate : null, (r26 & 512) != 0 ? r2.primary : false, (r26 & 1024) != 0 ? r2.resultType : com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.DISMISSED, (r26 & 2048) != 0 ? this.Camera2StreamConfigurationMap.collectedPin : null);
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt.m14325$r8$lambda$V2wI0HpvenJWj65qrBVPwsbK8(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (this.Camera2StreamConfigurationMap.getLifecycleState() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.PENDING_ACTIVE) {
                    debitPinMode = com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode.COLLECT_PIN;
                } else {
                    debitPinMode = com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode.SET_PIN;
                }
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoSizes;
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo = this.Camera2StreamConfigurationMap;
                appNavigator2.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.this, debitPinMode, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode debitPinMode, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination(debitCardActivationInfo.getInstrumentId(), (com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType) null, (java.lang.String) null, debitPinMode, false, 22, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitCardActivationRouterKt$DebitCardActivationRouter$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationRouterViewModel debitCardActivationRouterViewModel, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = debitCardActivationRouterViewModel;
        this.Camera2StreamConfigurationMap = debitCardActivationInfo;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
