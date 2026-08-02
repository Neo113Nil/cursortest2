package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1", f = "ViewPinScreen.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, nl = {119}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ViewPinScreenKt$ViewPinScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect viewPinEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect) obj;
            if (viewPinEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(viewPinEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect.FocusConfirmCvvField)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, 1, null));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.focus.FocusRequester focusRequester) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = focusRequester;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPinScreenKt$ViewPinScreen$2$1(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel viewPinViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.focus.FocusRequester focusRequester, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$ViewPinScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = viewPinViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = focusRequester;
    }
}
