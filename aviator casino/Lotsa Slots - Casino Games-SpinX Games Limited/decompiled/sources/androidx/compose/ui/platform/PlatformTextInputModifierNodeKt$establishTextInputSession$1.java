package androidx.compose.ui.platform;

/* compiled from: PlatformTextInputModifierNode.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {101}, m = "establishTextInputSession", n = {}, s = {})
/* loaded from: classes.dex */
final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    PlatformTextInputModifierNodeKt$establishTextInputSession$1(kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
    }
}
