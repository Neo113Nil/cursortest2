package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators", f = "FormFieldValidators.kt", i = {0, 0, 0, 0}, l = {374}, m = "validateAddressField", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "fieldId", "addressValidation", "address"}, nl = {400}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class FormFieldValidators$validateAddressField$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.validateAddressField(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormFieldValidators$validateAddressField$1(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators$validateAddressField$1> continuation) {
        super(continuation);
        this.getInputFormats = formFieldValidators;
    }
}
