package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1", f = "CryptoAssetSelectionScreen.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect cryptoAssetSelectionEffect = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect) obj;
            if (cryptoAssetSelectionEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (cryptoAssetSelectionEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (cryptoAssetSelectionEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (cryptoAssetSelectionEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(cryptoAssetSelectionEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.ShowNetworkSelectionSheet)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.showSheet();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect cryptoAssetSelectionEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination(((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry) cryptoAssetSelectionEffect).getAssetSymbol()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect cryptoAssetSelectionEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen navigateToReceiveScreen = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen) cryptoAssetSelectionEffect;
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination(navigateToReceiveScreen.getAssetSymbol(), navigateToReceiveScreen.getNetworkId(), navigateToReceiveScreen.getAssetName(), navigateToReceiveScreen.getLogoUrl()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect cryptoAssetSelectionEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination(((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry) cryptoAssetSelectionEffect).getAssetSymbol()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel cryptoAssetSelectionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt$CryptoAssetSelectionScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoAssetSelectionViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
    }
}
