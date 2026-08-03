package androidx.work;

/* compiled from: Operation.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "Landroidx/work/Operation$State$SUCCESS;", "Landroidx/work/Operation;", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class OperationKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object await(androidx.work.Operation operation, kotlin.coroutines.Continuation<? super androidx.work.Operation.State.SUCCESS> continuation) {
        androidx.work.OperationKt$await$1 operationKt$await$1;
        int i;
        androidx.work.Operation.State.SUCCESS success;
        if (continuation instanceof androidx.work.OperationKt$await$1) {
            operationKt$await$1 = (androidx.work.OperationKt$await$1) continuation;
            if ((operationKt$await$1.label & Integer.MIN_VALUE) != 0) {
                operationKt$await$1.label -= Integer.MIN_VALUE;
                ?? r6 = operationKt$await$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operationKt$await$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(r6);
                    com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> result = operation.getResult();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "result");
                    if (result.isDone()) {
                        try {
                            success = result.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "result.await()");
                            return success;
                        } catch (java.util.concurrent.ExecutionException e) {
                            java.lang.Throwable cause = e.getCause();
                            if (cause == null) {
                                throw e;
                            }
                            throw cause;
                        }
                    }
                    operationKt$await$1.L$0 = result;
                    operationKt$await$1.label = 1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(operationKt$await$1), 1);
                    cancellableContinuationImpl.initCancellability();
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    result.addListener(new androidx.work.ListenableFutureKt$await$2$1(cancellableContinuationImpl2, result), androidx.work.DirectExecutor.INSTANCE);
                    cancellableContinuationImpl2.invokeOnCancellation(new androidx.work.ListenableFutureKt$await$2$2(result));
                    r6 = cancellableContinuationImpl.getResult();
                    if (r6 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(operationKt$await$1);
                    }
                    if (r6 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(r6);
                }
                success = r6;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "result.await()");
                return success;
            }
        }
        operationKt$await$1 = new androidx.work.OperationKt$await$1(continuation);
        ?? r62 = operationKt$await$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operationKt$await$1.label;
        if (i != 0) {
        }
        success = r62;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "result.await()");
        return success;
    }

    private static final java.lang.Object await$$forInline(androidx.work.Operation operation, kotlin.coroutines.Continuation<? super androidx.work.Operation.State.SUCCESS> continuation) {
        java.lang.Object obj;
        com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> result = operation.getResult();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "result");
        if (result.isDone()) {
            try {
                obj = result.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        } else {
            kotlin.jvm.internal.InlineMarker.mark(0);
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            result.addListener(new androidx.work.ListenableFutureKt$await$2$1(cancellableContinuationImpl2, result), androidx.work.DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new androidx.work.ListenableFutureKt$await$2$2(result));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            kotlin.jvm.internal.InlineMarker.mark(1);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
        return obj;
    }
}
