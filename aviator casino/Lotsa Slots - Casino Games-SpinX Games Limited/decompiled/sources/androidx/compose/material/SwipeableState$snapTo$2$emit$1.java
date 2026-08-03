package androidx.compose.material;

/* compiled from: Swipeable.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class SwipeableState$snapTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.material.SwipeableState$snapTo$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapTo$2$emit$1(androidx.compose.material.SwipeableState$snapTo$2 swipeableState$snapTo$2, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableState$snapTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((java.util.Map) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }
}
