package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1", f = "ConfirmPhoneScreen.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent confirmPhoneEvent = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent) obj;
            if (!(confirmPhoneEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent.ConfirmationSuccess)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent confirmPhoneEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult(((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent.ConfirmationSuccess) confirmPhoneEvent).getPhone(), com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.RESEND_CONFIRMATION));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoFpsRanges.getEvents().collect(new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1.AnonymousClass1(this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = confirmPhoneViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
