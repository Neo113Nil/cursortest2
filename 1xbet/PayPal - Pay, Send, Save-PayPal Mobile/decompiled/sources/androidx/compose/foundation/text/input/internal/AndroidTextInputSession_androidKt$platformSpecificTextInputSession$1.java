package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {60}, m = "platformSpecificTextInputSession", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, this);
    }

    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1> continuation) {
        super(continuation);
    }
}
