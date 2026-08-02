package com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1", f = "AmountEntryScreen.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AmountEntryScreenKt$AmountEntryScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect amountEntryEffect = (com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(amountEntryEffect, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect.NavigateBack.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(amountEntryEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect.NavigateToNextScreen)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
                final androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> state = this.Camera2StreamConfigurationMap;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect.this, state, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect amountEntryEffect, androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt.access$AmountEntryScreen$lambda$0(state).getAssetSymbol(), ((com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryEffect.NavigateToNextScreen) amountEntryEffect).getAmount()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> state) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.Camera2StreamConfigurationMap = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.Camera2StreamConfigurationMap.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountEntryScreenKt$AmountEntryScreen$1$1(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel amountEntryViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.model.AmountEntryUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt$AmountEntryScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = amountEntryViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighSpeedVideoSizes = state;
    }
}
