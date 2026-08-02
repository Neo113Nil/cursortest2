package com.google.maps.android.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.maps.android.compose.CameraPositionState", f = "CameraPositionState.kt", i = {0, 0, 0, 0}, l = {359}, m = "animate", n = {"update", "myJob", "durationMs", "$i$f$suspendCancellableCoroutine"}, nl = {369}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes.dex */
final class CameraPositionState$animate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.google.maps.android.compose.CameraPositionState this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animate(null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraPositionState$animate$1(com.google.maps.android.compose.CameraPositionState cameraPositionState, kotlin.coroutines.Continuation<? super com.google.maps.android.compose.CameraPositionState$animate$1> continuation) {
        super(continuation);
        this.this$0 = cameraPositionState;
    }
}
