package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {102, 105, 110}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class ForEachGestureKt$awaitEachGesture$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r8 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:8:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0071 -> B:8:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            if (kotlinx.coroutines.JobKt.isActive(this.getHighSpeedVideoFpsRanges)) {
                this.getHighSpeedVideoFpsRangesFor = r1;
                this.getHighResolutionOutputSizeshNQ4ISI = 3;
                java.lang.Object awaitAllPointersUp$default = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, null, this, 1, null);
                r1 = r1;
            } else {
                throw e;
            }
        }
        if (r1 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
        } else if (r1 == 1) {
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = awaitPointerEventScope2;
            this.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            java.lang.Object awaitAllPointersUp$default2 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(awaitPointerEventScope, null, this, 1, null);
            r1 = awaitPointerEventScope;
        } else if (r1 == 2) {
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            r1 = awaitPointerEventScope3;
        } else {
            if (r1 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            r1 = awaitPointerEventScope4;
        }
        if (kotlinx.coroutines.JobKt.isActive(this.getHighSpeedVideoFpsRanges)) {
            kotlin.jvm.functions.Function2 function2 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = r1;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object invoke = function2.invoke(r1, this);
            awaitPointerEventScope = r1;
        } else {
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        forEachGestureKt$awaitEachGesture$2.getHighSpeedVideoFpsRangesFor = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ForEachGestureKt$awaitEachGesture$2(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = coroutineContext;
        this.Camera2StreamConfigurationMap = function2;
    }
}
