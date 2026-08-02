package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1", f = "DeleteEmailScreen.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DeleteEmailScreenKt$DeleteEmailScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent deleteEmailEvent = (com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent) obj;
            if (!(deleteEmailEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent.NavigateToFullScreenError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.navigateToFullScreenError(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailEvent.NavigateToFullScreenError) deleteEmailEvent).getStrategy(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EmailBottomSheetDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoSizes.getEvents().collect(new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteEmailScreenKt$DeleteEmailScreen$3$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt$DeleteEmailScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = deleteEmailViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
