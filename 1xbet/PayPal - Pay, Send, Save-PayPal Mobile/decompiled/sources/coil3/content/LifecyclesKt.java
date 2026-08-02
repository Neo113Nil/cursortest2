package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "awaitStarted", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleObserver;", "observer", "removeAndAddObserver", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/LifecycleObserver;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LifecyclesKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil3.util.LifecyclesKt$awaitStarted$2$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitStarted(androidx.view.Lifecycle lifecycle, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        coil3.content.LifecyclesKt$awaitStarted$1 lifecyclesKt$awaitStarted$1;
        int i;
        androidx.view.Lifecycle lifecycle2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Throwable th;
        androidx.view.LifecycleObserver lifecycleObserver;
        androidx.view.LifecycleObserver lifecycleObserver2;
        if (continuation instanceof coil3.content.LifecyclesKt$awaitStarted$1) {
            lifecyclesKt$awaitStarted$1 = (coil3.content.LifecyclesKt$awaitStarted$1) continuation;
            if ((lifecyclesKt$awaitStarted$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                lifecyclesKt$awaitStarted$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = lifecyclesKt$awaitStarted$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lifecyclesKt$awaitStarted$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (lifecycle.getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        lifecyclesKt$awaitStarted$1.getHighResolutionOutputSizeshNQ4ISI = lifecycle;
                        lifecyclesKt$awaitStarted$1.getHighSpeedVideoFpsRanges = objectRef2;
                        lifecyclesKt$awaitStarted$1.getHighSpeedVideoFpsRangesFor = 1;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(lifecyclesKt$awaitStarted$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        objectRef2.element = new androidx.view.DefaultLifecycleObserver() { // from class: coil3.util.LifecyclesKt$awaitStarted$2$1
                            @Override // androidx.view.DefaultLifecycleObserver
                            public final void onStart(androidx.view.LifecycleOwner owner) {
                                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                            }
                        };
                        lifecycle.addObserver((androidx.view.LifecycleObserver) objectRef2.element);
                        java.lang.Object result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(lifecyclesKt$awaitStarted$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lifecycle2 = lifecycle;
                        objectRef = objectRef2;
                    } catch (java.lang.Throwable th2) {
                        lifecycle2 = lifecycle;
                        objectRef = objectRef2;
                        th = th2;
                        lifecycleObserver = (androidx.view.LifecycleObserver) objectRef.element;
                        if (lifecycleObserver != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) lifecyclesKt$awaitStarted$1.getHighSpeedVideoFpsRanges;
                    lifecycle2 = (androidx.view.Lifecycle) lifecyclesKt$awaitStarted$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        lifecycleObserver = (androidx.view.LifecycleObserver) objectRef.element;
                        if (lifecycleObserver != null) {
                            lifecycle2.removeObserver(lifecycleObserver);
                        }
                        throw th;
                    }
                }
                lifecycleObserver2 = (androidx.view.LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        lifecyclesKt$awaitStarted$1 = new coil3.content.LifecyclesKt$awaitStarted$1(continuation);
        java.lang.Object obj2 = lifecyclesKt$awaitStarted$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lifecyclesKt$awaitStarted$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        lifecycleObserver2 = (androidx.view.LifecycleObserver) objectRef.element;
        if (lifecycleObserver2 != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void removeAndAddObserver(androidx.view.Lifecycle lifecycle, androidx.view.LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
