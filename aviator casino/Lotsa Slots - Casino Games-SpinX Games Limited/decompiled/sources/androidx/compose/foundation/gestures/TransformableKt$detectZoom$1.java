package androidx.compose.foundation.gestures;

/* compiled from: Transformable.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 262}, m = "detectZoom", n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
/* loaded from: classes.dex */
final class TransformableKt$detectZoom$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;

    TransformableKt$detectZoom$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableKt$detectZoom$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object detectZoom;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        detectZoom = androidx.compose.foundation.gestures.TransformableKt.detectZoom(null, false, null, null, this);
        return detectZoom;
    }
}
