package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1", f = "ShowToPayScreen.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, nl = {131}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ShowToPayScreenKt$ShowToPayScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getInputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1$1", f = "ShowToPayScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect showToPayUiEffect = (com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputMinFrameDuration != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (showToPayUiEffect instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
                final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str2 = this.getHighSpeedVideoSizes;
                final java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.this, str, str2, str3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(showToPayUiEffect instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect showToPayUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.qrc.navigation.ShowToPayAmountDestination(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayAmountNavArgs(((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToEnterAmount) showToPayUiEffect).getDetectedCountryCode())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect showToPayUiEffect, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.qrc.navigation.ShowToPayLoadingDestination(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayLoadingNavArgs(((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect.NavigateToLoading) showToPayUiEffect).getTitleRes() != com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_confirming_location ? str2 : str, str3, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiEffect showToPayUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1.AnonymousClass1) create(showToPayUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = str2;
            this.getHighSpeedVideoFpsRanges = str3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowToPayScreenKt$ShowToPayScreen$2$1(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel showToPayViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = showToPayViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }
}
