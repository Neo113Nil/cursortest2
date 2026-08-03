package androidx.compose.foundation.text.selection;

/* compiled from: SelectionGestures.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
/* loaded from: classes.dex */
final class SelectionGesturesKt$awaitDown$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    SelectionGesturesKt$awaitDown$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object awaitDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitDown = androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(null, this);
        return awaitDown;
    }
}
