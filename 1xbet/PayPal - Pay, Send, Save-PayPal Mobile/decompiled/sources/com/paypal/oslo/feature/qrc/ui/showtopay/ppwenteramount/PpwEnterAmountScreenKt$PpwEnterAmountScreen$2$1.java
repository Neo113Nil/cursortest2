package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1", f = "PpwEnterAmountScreen.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, nl = {143}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1$1", f = "PpwEnterAmountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect ppwEnterAmountUiEffect = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (ppwEnterAmountUiEffect instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str = this.getHighSpeedVideoSizes;
                final java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                final java.lang.String str3 = this.Camera2StreamConfigurationMap;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.result.ShowToPayNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(str2, str3, ppwEnterAmountUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (ppwEnterAmountUiEffect instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(ppwEnterAmountUiEffect instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.CloseFlow)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect ppwEnterAmountUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading navigateToLoading = (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect.NavigateToLoading) ppwEnterAmountUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayLoadingNavArgs(str, str2, true, navigateToLoading.getReceiverAmount(), navigateToLoading.getSenderAmount(), navigateToLoading.getSenderCurrencyCode(), navigateToLoading.getReceiverCurrencyCode(), navigateToLoading.getSenderCountryCode(), navigateToLoading.getReceiverCountryCode())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.api.navigation.QrcFlow.class));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect ppwEnterAmountUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1) create(ppwEnterAmountUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.Camera2StreamConfigurationMap = str3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel ppwEnterAmountViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountScreenKt$PpwEnterAmountScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = ppwEnterAmountViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRanges = str3;
    }
}
