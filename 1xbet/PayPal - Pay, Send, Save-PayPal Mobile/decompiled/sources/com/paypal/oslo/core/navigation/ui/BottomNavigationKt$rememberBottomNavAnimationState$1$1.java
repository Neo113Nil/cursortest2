package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.ui.BottomNavigationKt$rememberBottomNavAnimationState$1$1", f = "BottomNavigation.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class BottomNavigationKt$rememberBottomNavAnimationState$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder.getHighSpeedVideoSizes().isEmpty() == false) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.AnimationSpec spring$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRangesFor <= 0.0f) {
                com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder bottomNavPositionHolder = com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder.INSTANCE;
            }
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRangesFor);
            spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.5f, 1500.0f, null, 4, null);
            this.getHighSpeedVideoFpsRanges = 1;
            if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, boxFloat, spring$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder bottomNavPositionHolder2 = com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder.INSTANCE;
        com.paypal.oslo.core.navigation.ui.BottomNavPositionHolder.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.ui.BottomNavigationKt$rememberBottomNavAnimationState$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.ui.BottomNavigationKt$rememberBottomNavAnimationState$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomNavigationKt$rememberBottomNavAnimationState$1$1(float f, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.ui.BottomNavigationKt$rememberBottomNavAnimationState$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = animatable;
    }
}
