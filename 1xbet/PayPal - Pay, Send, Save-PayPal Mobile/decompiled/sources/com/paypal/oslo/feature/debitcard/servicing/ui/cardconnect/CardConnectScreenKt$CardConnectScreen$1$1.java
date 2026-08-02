package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1", f = "CardConnectScreen.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, nl = {79}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CardConnectScreenKt$CardConnectScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect cardConnectEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect) obj;
            if (cardConnectEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk) {
                this.getHighSpeedVideoSizes.launchKnotSdk(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk) cardConnectEffect).getSession());
            } else {
                if (!(cardConnectEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
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

        AnonymousClass1(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoSizes = cardConnectViewModel;
            this.Camera2StreamConfigurationMap = context;
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardConnectScreenKt$CardConnectScreen$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.viewmodel.CardConnectViewModel cardConnectViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.CardConnectScreenKt$CardConnectScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cardConnectViewModel;
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
