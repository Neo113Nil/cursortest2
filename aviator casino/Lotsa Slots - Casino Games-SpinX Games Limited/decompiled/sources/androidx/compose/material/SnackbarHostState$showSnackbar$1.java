package androidx.compose.material;

/* compiled from: SnackbarHost.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {379, 382}, m = "showSnackbar", n = {"this", "message", "actionLabel", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "$this$withLock_u24default$iv", "this", "message", "actionLabel", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes.dex */
final class SnackbarHostState$showSnackbar$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.material.SnackbarHostState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$1(androidx.compose.material.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super androidx.compose.material.SnackbarHostState$showSnackbar$1> continuation) {
        super(continuation);
        this.this$0 = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showSnackbar(null, null, null, this);
    }
}
