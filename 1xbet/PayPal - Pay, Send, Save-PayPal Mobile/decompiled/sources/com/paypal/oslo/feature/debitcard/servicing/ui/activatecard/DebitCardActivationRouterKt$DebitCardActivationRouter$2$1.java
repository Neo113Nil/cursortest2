package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitPinNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1", f = "DebitCardActivationRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardActivationRouterKt$DebitCardActivationRouter$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo copy;
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo copy2;
        com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult debitPinNavResult = (com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (debitPinNavResult.isPinSet()) {
            if (debitPinNavResult.getCollectedPin() != null) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                copy2 = r3.copy((r26 & 1) != 0 ? r3.instrumentId : null, (r26 & 2) != 0 ? r3.productName : null, (r26 & 4) != 0 ? r3.cardImageUrl : null, (r26 & 8) != 0 ? r3.lastFourDigits : null, (r26 & 16) != 0 ? r3.isPinSet : false, (r26 & 32) != 0 ? r3.displayAddress : null, (r26 & 64) != 0 ? r3.lifecycleState : null, (r26 & 128) != 0 ? r3.billingAddressId : null, (r26 & 256) != 0 ? r3.expectedArrivalDate : null, (r26 & 512) != 0 ? r3.primary : false, (r26 & 1024) != 0 ? r3.resultType : com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.DISMISSED, (r26 & 2048) != 0 ? this.getHighSpeedVideoFpsRanges.collectedPin : debitPinNavResult.getCollectedPin());
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt.m14325$r8$lambda$V2wI0HpvenJWj65qrBVPwsbK8(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                copy = r2.copy((r26 & 1) != 0 ? r2.instrumentId : null, (r26 & 2) != 0 ? r2.productName : null, (r26 & 4) != 0 ? r2.cardImageUrl : null, (r26 & 8) != 0 ? r2.lastFourDigits : null, (r26 & 16) != 0 ? r2.isPinSet : false, (r26 & 32) != 0 ? r2.displayAddress : null, (r26 & 64) != 0 ? r2.lifecycleState : null, (r26 & 128) != 0 ? r2.billingAddressId : null, (r26 & 256) != 0 ? r2.expectedArrivalDate : null, (r26 & 512) != 0 ? r2.primary : false, (r26 & 1024) != 0 ? r2.resultType : com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.RELOAD_NEEDED, (r26 & 2048) != 0 ? this.getHighSpeedVideoFpsRanges.collectedPin : null);
                appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt.m14325$r8$lambda$V2wI0HpvenJWj65qrBVPwsbK8(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.DISMISSED, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult debitPinNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1) create(debitPinNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1 debitCardActivationRouterKt$DebitCardActivationRouter$2$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        debitCardActivationRouterKt$DebitCardActivationRouter$2$1.getHighSpeedVideoSizes = obj;
        return debitCardActivationRouterKt$DebitCardActivationRouter$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardActivationRouterKt$DebitCardActivationRouter$2$1(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationRouterKt$DebitCardActivationRouter$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = debitCardActivationInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
