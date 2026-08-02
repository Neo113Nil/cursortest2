package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt", f = "FormFieldExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {176}, m = "validateAllWithResult", n = {"$this$validateAllWithResult", "validators", "shouldValidate", "raise$iv$iv$iv", "$this$validateAllWithResult_u24lambda_u241", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FormFieldExtensionsKt$validateAllWithResult$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class FormFieldExtensionsKt$validateAllWithResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validateAllWithResult(null, null, null, this);
    }

    FormFieldExtensionsKt$validateAllWithResult$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt$validateAllWithResult$1> continuation) {
        super(continuation);
    }
}
