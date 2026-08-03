package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0}, l = {com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION}, m = "awaitScrollEvent", n = {"$this$awaitScrollEvent"}, s = {"L$0"})
/* loaded from: classes.dex */
final class ScrollableKt$awaitScrollEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ScrollableKt$awaitScrollEvent$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object awaitScrollEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitScrollEvent = androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(null, this);
        return awaitScrollEvent;
    }
}
