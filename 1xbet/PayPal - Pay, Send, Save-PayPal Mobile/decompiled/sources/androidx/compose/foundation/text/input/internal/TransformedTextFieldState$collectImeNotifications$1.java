package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0}, l = {755}, m = "collectImeNotifications", n = {"transformedNotifyImeListener"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class TransformedTextFieldState$collectImeNotifications$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TransformedTextFieldState getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.collectImeNotifications(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformedTextFieldState$collectImeNotifications$1(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = transformedTextFieldState;
    }
}
