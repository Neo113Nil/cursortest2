package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1", f = "AutoSaveFullScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveFullScreenKt$AutoSaveFullScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult = (com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1.WhenMappings.$EnumSwitchMapping$0[savingsAutoSaveNavResult.getType().ordinal()];
        if (i == 1) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (i == 2) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.error(savingsAutoSaveNavResult.getMessage()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.cancelled());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.success(savingsAutoSaveNavResult.getMessage()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1) create(savingsAutoSaveNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.CANCELLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1 autoSaveFullScreenKt$AutoSaveFullScreen$5$1 = new com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1(this.getHighSpeedVideoSizes, continuation);
        autoSaveFullScreenKt$AutoSaveFullScreen$5$1.getHighSpeedVideoFpsRanges = obj;
        return autoSaveFullScreenKt$AutoSaveFullScreen$5$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoSaveFullScreenKt$AutoSaveFullScreen$5$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.AutoSaveFullScreenKt$AutoSaveFullScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
