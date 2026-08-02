package com.paypal.oslo.feature.userprofile.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel", f = "AddEditAddressViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "validateAndSubmit", n = {"state", "address", "state", "address", "this_$iv", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "$i$f$fold", "$i$a$-fold-AddEditAddressViewModel$validateAndSubmit$3"}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class AddEditAddressViewModel$validateAndSubmit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel.access$validateAndSubmit(this.getHighSpeedVideoSizesFor, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditAddressViewModel$validateAndSubmit$1(com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel addEditAddressViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel$validateAndSubmit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = addEditAddressViewModel;
    }
}
