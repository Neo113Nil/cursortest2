package coil.util;

/* compiled from: Lifecycles.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0081@¢\u0006\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"awaitStarted", "", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAndAddObserver", "observer", "Landroidx/lifecycle/LifecycleObserver;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil.util.-Lifecycles, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Lifecycles {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitStarted(androidx.lifecycle.Lifecycle lifecycle, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        coil.util.Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        int i;
        androidx.lifecycle.Lifecycle lifecycle2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Throwable th;
        androidx.lifecycle.LifecycleObserver lifecycleObserver;
        androidx.lifecycle.LifecycleObserver lifecycleObserver2;
        if (continuation instanceof coil.util.Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (coil.util.Lifecycles$awaitStarted$1) continuation;
            if ((lifecycles$awaitStarted$1.label & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = lifecycles$awaitStarted$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lifecycles$awaitStarted$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (lifecycle.getState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        lifecycles$awaitStarted$1.L$0 = lifecycle;
                        lifecycles$awaitStarted$1.L$1 = objectRef2;
                        lifecycles$awaitStarted$1.label = 1;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(lifecycles$awaitStarted$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        objectRef2.element = new androidx.lifecycle.DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$awaitStarted$2$1
                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onCreate(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onPause(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onStop(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public void onStart(androidx.lifecycle.LifecycleOwner owner) {
                                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                            }
                        };
                        T t = objectRef2.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                        lifecycle.addObserver((androidx.lifecycle.LifecycleObserver) t);
                        java.lang.Object result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(lifecycles$awaitStarted$1);
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
                        lifecycleObserver = (androidx.lifecycle.LifecycleObserver) objectRef.element;
                        if (lifecycleObserver != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) lifecycles$awaitStarted$1.L$1;
                    lifecycle2 = (androidx.lifecycle.Lifecycle) lifecycles$awaitStarted$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        lifecycleObserver = (androidx.lifecycle.LifecycleObserver) objectRef.element;
                        if (lifecycleObserver != null) {
                            lifecycle2.removeObserver(lifecycleObserver);
                        }
                        throw th;
                    }
                }
                lifecycleObserver2 = (androidx.lifecycle.LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        lifecycles$awaitStarted$1 = new coil.util.Lifecycles$awaitStarted$1(continuation);
        java.lang.Object obj2 = lifecycles$awaitStarted$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lifecycles$awaitStarted$1.label;
        if (i != 0) {
        }
        lifecycleObserver2 = (androidx.lifecycle.LifecycleObserver) objectRef.element;
        if (lifecycleObserver2 != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void removeAndAddObserver(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
