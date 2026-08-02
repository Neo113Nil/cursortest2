package com.paypal.oslo.feature.inappcheckout.ui.profile.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1", f = "ProfileScreen.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, nl = {85}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ProfileScreenKt$ProfileScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.initialize(this.getHighResolutionOutputSizeshNQ4ISI);
            com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.getHighSpeedVideoFpsRanges;
            java.lang.String str = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = 1;
            if (com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt.access$handleProfileEffects(profileViewModel, inAppCheckoutCoordinator, str, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this, (java.lang.String) obj2);
                }
            }, this) == coroutine_suspended) {
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileScreenKt$ProfileScreen$1$1(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel, com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, java.lang.String str, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$ProfileScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = profileViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = buyerInfoEntity;
        this.getHighSpeedVideoFpsRanges = inAppCheckoutCoordinator;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
