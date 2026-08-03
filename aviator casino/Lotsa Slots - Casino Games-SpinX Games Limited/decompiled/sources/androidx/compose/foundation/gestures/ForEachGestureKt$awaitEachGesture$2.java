package androidx.compose.foundation.gestures;

/* compiled from: ForEachGesture.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {104, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class ForEachGestureKt$awaitEachGesture$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    final /* synthetic */ kotlin.coroutines.CoroutineContext $currentContext;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ForEachGestureKt$awaitEachGesture$2(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2> continuation) {
        super(2, continuation);
        this.$currentContext = coroutineContext;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, continuation);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0076 -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object awaitAllPointersUp;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            e = e;
            if (!kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
            }
        }
        if (r1 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
            }
        } else if (r1 != 1) {
            if (r1 == 2) {
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEventScope2 = awaitPointerEventScope3;
            } else {
                if (r1 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEventScope2 = awaitPointerEventScope4;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
                try {
                } catch (java.util.concurrent.CancellationException e2) {
                    r1 = awaitPointerEventScope;
                    e = e2;
                    if (!kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
                        this.L$0 = r1;
                        this.label = 3;
                        java.lang.Object awaitAllPointersUp2 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp((androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1, this);
                        awaitPointerEventScope2 = r1;
                        if (awaitAllPointersUp2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope = awaitPointerEventScope2;
                        if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
                        }
                    } else {
                        throw e;
                    }
                }
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$block;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                if (function2.invoke(awaitPointerEventScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r1 = awaitPointerEventScope;
                this.L$0 = r1;
                this.label = 2;
                awaitAllPointersUp = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp((androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1, this);
                awaitPointerEventScope2 = r1;
                if (awaitAllPointersUp == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        } else {
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            r1 = awaitPointerEventScope5;
            this.L$0 = r1;
            this.label = 2;
            awaitAllPointersUp = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp((androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1, this);
            awaitPointerEventScope2 = r1;
            if (awaitAllPointersUp == coroutine_suspended) {
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            if (kotlinx.coroutines.JobKt.isActive(this.$currentContext)) {
            }
        }
    }
}
