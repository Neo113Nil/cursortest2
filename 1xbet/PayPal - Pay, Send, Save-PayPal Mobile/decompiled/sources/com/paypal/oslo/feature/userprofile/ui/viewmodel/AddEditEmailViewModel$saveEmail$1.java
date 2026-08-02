package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel", f = "AddEditEmailViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m = "saveEmail", n = {"replaceId", "replaceId", "result", "this_$iv", "savedEmail", "$i$f$fold", "$i$a$-fold-AddEditEmailViewModel$saveEmail$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class AddEditEmailViewModel$saveEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel.access$saveEmail(this.getOutputFormats, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditEmailViewModel$saveEmail$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel addEditEmailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailViewModel$saveEmail$1> continuation) {
        super(continuation);
        this.getOutputFormats = addEditEmailViewModel;
    }
}
