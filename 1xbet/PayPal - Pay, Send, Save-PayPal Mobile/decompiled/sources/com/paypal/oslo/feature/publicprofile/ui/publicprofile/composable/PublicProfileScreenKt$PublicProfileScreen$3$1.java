package com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1", f = "PublicProfileScreen.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PublicProfileScreenKt$PublicProfileScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.core.commonui.utils.RefText> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.core.commonui.utils.RefText> getHighSpeedVideoFpsRangesFor;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect publicProfileUiEffect = (com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect) obj;
            if (!(publicProfileUiEffect instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet)) {
                if (!(publicProfileUiEffect instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast)) {
                    if (!(publicProfileUiEffect instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    this.getHighSpeedVideoFpsRangesFor.setValue(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowToast) publicProfileUiEffect).getMessage());
                }
            } else {
                this.getHighSpeedVideoFpsRanges.setValue(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.ShowBottomSheet) publicProfileUiEffect).getSheetType());
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect publicProfileUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(((com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect.NavigateBackWithResult) publicProfileUiEffect).getResult());
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType> mutableState, androidx.compose.runtime.MutableState<com.paypal.oslo.core.commonui.utils.RefText> mutableState2) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRanges = mutableState;
            this.getHighSpeedVideoFpsRangesFor = mutableState2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.Camera2StreamConfigurationMap.getUiEffect().collect(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PublicProfileScreenKt$PublicProfileScreen$3$1(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel publicProfileViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.publicprofile.ui.publicprofile.components.PublicProfileBottomSheetType> mutableState, androidx.compose.runtime.MutableState<com.paypal.oslo.core.commonui.utils.RefText> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.PublicProfileScreenKt$PublicProfileScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = publicProfileViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableState2;
    }
}
