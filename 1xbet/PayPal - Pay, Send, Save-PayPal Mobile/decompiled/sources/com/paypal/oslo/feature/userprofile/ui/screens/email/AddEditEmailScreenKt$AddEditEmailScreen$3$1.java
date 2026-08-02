package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1", f = "AddEditEmailScreen.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditEmailScreenKt$AddEditEmailScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent addEditEmailEvent = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent) obj;
            if (!(addEditEmailEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation)) {
                if (!(addEditEmailEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.navigateToFullScreenError(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToFullScreenError) addEditEmailEvent).getStrategy(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(false));
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent addEditEmailEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation navigateToConfirmation = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailEvent.NavigateToConfirmation) addEditEmailEvent;
            navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination(navigateToConfirmation.getEmailId(), navigateToConfirmation.getEmailAddress(), navigateToConfirmation.getMakePrimary(), navigateToConfirmation.getReplaceId()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.Camera2StreamConfigurationMap = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoFpsRanges.getEvents().collect(new com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditEmailScreenKt$AddEditEmailScreen$3$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel addEditEmailViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = addEditEmailViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
