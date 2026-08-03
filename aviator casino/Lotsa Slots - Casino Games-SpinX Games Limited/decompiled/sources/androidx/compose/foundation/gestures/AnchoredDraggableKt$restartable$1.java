package androidx.compose.foundation.gestures;

/* compiled from: AnchoredDraggable.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_INSTANCE_LOAD_TIMEOUT}, m = "restartable", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableKt$restartable$1<I> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    AnchoredDraggableKt$restartable$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object restartable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        restartable = androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(null, null, this);
        return restartable;
    }
}
