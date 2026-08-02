package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1", f = "CryptoSellReviewScreen.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect cryptoSellReviewEffect = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect) obj;
            if (cryptoSellReviewEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (cryptoSellReviewEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(cryptoSellReviewEffect, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.ShowGenericError.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect cryptoSellReviewEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen navigateToSuccessScreen = (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewEffect.NavigateToSuccessScreen) cryptoSellReviewEffect;
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination(navigateToSuccessScreen.getTradeId(), navigateToSuccessScreen.getAssetSymbol(), navigateToSuccessScreen.getAssetName(), navigateToSuccessScreen.getAssetLogoUrl(), navigateToSuccessScreen.getCryptoAmount(), navigateToSuccessScreen.getFiatAmount(), navigateToSuccessScreen.getStatus()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
            this.Camera2StreamConfigurationMap = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRanges.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel cryptoSellReviewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt$CryptoSellReviewScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cryptoSellReviewViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
