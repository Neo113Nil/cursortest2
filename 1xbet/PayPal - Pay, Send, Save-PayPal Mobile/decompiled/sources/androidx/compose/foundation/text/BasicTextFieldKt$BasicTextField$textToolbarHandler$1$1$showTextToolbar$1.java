package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", i = {0, 0}, l = {com.visa.cbp.getCertUsage.getODAData}, m = "showTextToolbar", n = {"rect", "$this$showTextToolbar_u24lambda_u240"}, s = {"L$0", "L$3"}, v = 1)
/* loaded from: classes6.dex */
final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.showTextToolbar(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1> continuation) {
        super(continuation);
        this.getOutputFormats = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    }
}
