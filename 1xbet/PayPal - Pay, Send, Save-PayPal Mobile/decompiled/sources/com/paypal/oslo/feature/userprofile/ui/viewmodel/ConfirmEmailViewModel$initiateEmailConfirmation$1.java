package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel", f = "ConfirmEmailViewModel.kt", i = {1, 1, 1, 1}, l = {309, 310}, m = "initiateEmailConfirmation", n = {"this_$iv", "error", "$i$f$fold", "$i$a$-fold-ConfirmEmailViewModel$initiateEmailConfirmation$2"}, nl = {378, 380}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmEmailViewModel$initiateEmailConfirmation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel.access$initiateEmailConfirmation(this.getInputSizeshNQ4ISI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmEmailViewModel$initiateEmailConfirmation$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel$initiateEmailConfirmation$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = confirmEmailViewModel;
    }
}
