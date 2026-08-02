package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1", f = "ConfirmEmailScreen.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmEmailScreenKt$ConfirmEmailScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent confirmEmailEvent = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent) obj;
            if (confirmEmailEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(confirmEmailEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.navigateToFullScreenError(this.getHighResolutionOutputSizeshNQ4ISI, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.NavigateToFullScreenError) confirmEmailEvent).getStrategy(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent confirmEmailEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult(((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailEvent.ConfirmationSuccess) confirmEmailEvent).getEmail()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getEvents().collect(new com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1.AnonymousClass1(this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmEmailScreenKt$ConfirmEmailScreen$4$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = confirmEmailViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
