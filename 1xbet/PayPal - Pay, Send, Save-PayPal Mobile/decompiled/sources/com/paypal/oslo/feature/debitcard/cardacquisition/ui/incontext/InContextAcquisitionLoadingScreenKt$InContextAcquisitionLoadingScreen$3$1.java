package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1", f = "InContextAcquisitionLoadingScreen.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, nl = {130}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect debitCardApplyAndCreateUiEffect = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect) obj;
            if (!(debitCardApplyAndCreateUiEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.invalidateAll();
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect debitCardApplyAndCreateUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult(new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess) debitCardApplyAndCreateUiEffect).getDebitCardData(), (java.lang.Integer) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoFpsRanges = debitCardFundingOptionsCache;
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.Camera2StreamConfigurationMap.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = debitCardApplyAndCreateViewModel;
        this.getHighSpeedVideoFpsRanges = debitCardFundingOptionsCache;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
