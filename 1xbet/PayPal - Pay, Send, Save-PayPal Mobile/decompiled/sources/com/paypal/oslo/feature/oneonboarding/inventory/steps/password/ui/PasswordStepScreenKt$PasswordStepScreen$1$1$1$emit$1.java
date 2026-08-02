package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1$1", f = "PasswordStepScreen.kt", i = {0}, l = {165}, m = "emit", n = {"action"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class PasswordStepScreenKt$PasswordStepScreen$1$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1.AnonymousClass1<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PasswordStepScreenKt$PasswordStepScreen$1$1$1$emit$1(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.password.ui.PasswordStepScreenKt$PasswordStepScreen$1$1$1$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = anonymousClass1;
    }
}
