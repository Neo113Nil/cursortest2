package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {136}, m = "establishTextInputSession", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
    }

    PlatformTextInputModifierNodeKt$establishTextInputSession$1(kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1> continuation) {
        super(continuation);
    }
}
