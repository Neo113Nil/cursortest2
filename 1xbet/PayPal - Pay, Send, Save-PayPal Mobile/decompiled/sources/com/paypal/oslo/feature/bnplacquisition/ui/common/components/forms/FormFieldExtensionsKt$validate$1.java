package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt", f = "FormFieldExtensions.kt", i = {0, 0}, l = {70}, m = "validate", n = {"$this$validate", "validators"}, nl = {75}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class FormFieldExtensionsKt$validate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validate(null, null, this);
    }

    FormFieldExtensionsKt$validate$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt$validate$1> continuation) {
        super(continuation);
    }
}
