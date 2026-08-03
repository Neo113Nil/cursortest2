package androidx.compose.foundation.gestures;

/* compiled from: TapGestureDetector.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class TapGestureDetectorKt$waitForUpOrCancellation$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    TapGestureDetectorKt$waitForUpOrCancellation$2(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
    }
}
