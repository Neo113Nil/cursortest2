package com.paypal.oslo.feature.cryptocurrency.ui.loyalty;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1", f = "LoyaltyCryptoEntryScreen.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, nl = {87}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect loyaltyCryptoEntryEffect = (com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect) obj;
            if (loyaltyCryptoEntryEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.ShowProvisioningFlow) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (loyaltyCryptoEntryEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.NavigateToAssetSelection) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(loyaltyCryptoEntryEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect loyaltyCryptoEntryEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination(((com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.ShowProvisioningFlow) loyaltyCryptoEntryEffect).getIntent()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceTop(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.LOYALTY_REDEEM));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt$LoyaltyCryptoEntryScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = loyaltyCryptoEntryViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.Camera2StreamConfigurationMap = str;
    }
}
