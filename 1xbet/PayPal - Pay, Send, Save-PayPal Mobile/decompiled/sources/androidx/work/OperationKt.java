package androidx.work;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/work/Operation;", "Landroidx/work/Operation$State$SUCCESS;", "await", "(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/Tracer;", "tracer", "", "label", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "block", "launchOperation", "(Landroidx/work/Tracer;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Landroidx/work/Operation;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object await(androidx.work.Operation operation, kotlin.coroutines.Continuation<? super androidx.work.Operation.State.SUCCESS> continuation) {
        androidx.work.OperationKt$await$1 operationKt$await$1;
        int i;
        if (continuation instanceof androidx.work.OperationKt$await$1) {
            operationKt$await$1 = (androidx.work.OperationKt$await$1) continuation;
            if ((operationKt$await$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                operationKt$await$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = operationKt$await$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = operationKt$await$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> result = operation.getResult();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(result, "");
                    operationKt$await$1.getHighSpeedVideoSizes = 1;
                    obj = androidx.concurrent.futures.ListenableFutureKt.await(result, operationKt$await$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        operationKt$await$1 = new androidx.work.OperationKt$await$1(continuation);
        java.lang.Object obj2 = operationKt$await$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = operationKt$await$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }

    public static final androidx.work.Operation launchOperation(final androidx.work.Tracer tracer, final java.lang.String str, final java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        final androidx.view.MutableLiveData mutableLiveData = new androidx.view.MutableLiveData(androidx.work.Operation.IN_PROGRESS);
        com.google.common.util.concurrent.ListenableFuture future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.work.OperationKt$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.work.OperationKt.m9467$r8$lambda$4AmAQmnwY87AwH_dAIVRwuDub0(executor, tracer, str, function0, mutableLiveData, completer);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
        return new androidx.work.OperationImpl(mutableLiveData, future);
    }

    /* renamed from: $r8$lambda$4AmAQmnwY87AwH_dAIVR-wuDub0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9467$r8$lambda$4AmAQmnwY87AwH_dAIVRwuDub0(java.util.concurrent.Executor executor, final androidx.work.Tracer tracer, final java.lang.String str, final kotlin.jvm.functions.Function0 function0, final androidx.view.MutableLiveData mutableLiveData, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
        executor.execute(new java.lang.Runnable() { // from class: androidx.work.OperationKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.OperationKt.$r8$lambda$XKAkIiEN7OgIvwuLUZRQpJhjmyE(androidx.work.Tracer.this, str, function0, mutableLiveData, completer);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$XKAkIiEN7OgIvwuLUZRQpJhjmyE(androidx.work.Tracer tracer, java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.view.MutableLiveData mutableLiveData, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        boolean isEnabled = tracer.isEnabled();
        if (isEnabled) {
            try {
                tracer.beginSection(str);
            } finally {
                if (isEnabled) {
                    tracer.endSection();
                }
            }
        }
        try {
            function0.invoke();
            mutableLiveData.postValue(androidx.work.Operation.SUCCESS);
            completer.set(androidx.work.Operation.SUCCESS);
        } catch (java.lang.Throwable th) {
            mutableLiveData.postValue(new androidx.work.Operation.State.FAILURE(th));
            completer.setException(th);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
    }
}
