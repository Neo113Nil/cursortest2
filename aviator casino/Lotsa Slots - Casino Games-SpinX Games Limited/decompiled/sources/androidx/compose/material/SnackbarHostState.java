package androidx.compose.material;

/* compiled from: SnackbarHost.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "()V", "<set-?>", "Landroidx/compose/material/SnackbarData;", "currentSnackbarData", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "showSnackbar", "Landroidx/compose/material/SnackbarResult;", "message", "", "actionLabel", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Landroidx/compose/material/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SnackbarDataImpl", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostState {
    private final kotlinx.coroutines.sync.Mutex mutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: currentSnackbarData$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentSnackbarData = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(androidx.compose.material.SnackbarData snackbarData) {
        this.currentSnackbarData.setValue(snackbarData);
    }

    public final androidx.compose.material.SnackbarData getCurrentSnackbarData() {
        return (androidx.compose.material.SnackbarData) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:26:0x008b, B:28:0x00bc), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object showSnackbar(java.lang.String str, java.lang.String str2, androidx.compose.material.SnackbarDuration snackbarDuration, kotlin.coroutines.Continuation<? super androidx.compose.material.SnackbarResult> continuation) {
        androidx.compose.material.SnackbarHostState$showSnackbar$1 snackbarHostState$showSnackbar$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.compose.material.SnackbarDuration snackbarDuration2;
        java.lang.String str3;
        androidx.compose.material.SnackbarHostState snackbarHostState;
        java.lang.String str4;
        java.lang.Object result;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            try {
                if (continuation instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1) {
                    snackbarHostState$showSnackbar$1 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) continuation;
                    if ((snackbarHostState$showSnackbar$1.label & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$1.label -= Integer.MIN_VALUE;
                        java.lang.Object obj = snackbarHostState$showSnackbar$1.result;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = snackbarHostState$showSnackbar$1.label;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = this.mutex;
                            snackbarHostState$showSnackbar$1.L$0 = this;
                            snackbarHostState$showSnackbar$1.L$1 = str;
                            snackbarHostState$showSnackbar$1.L$2 = str2;
                            snackbarHostState$showSnackbar$1.L$3 = snackbarDuration;
                            snackbarHostState$showSnackbar$1.L$4 = mutex;
                            snackbarHostState$showSnackbar$1.label = 1;
                            if (mutex.lock(null, snackbarHostState$showSnackbar$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            snackbarDuration2 = snackbarDuration;
                            str3 = str2;
                            snackbarHostState = this;
                            str4 = str;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    mutex2 = (kotlinx.coroutines.sync.Mutex) snackbarHostState$showSnackbar$1.L$4;
                                    snackbarHostState = (androidx.compose.material.SnackbarHostState) snackbarHostState$showSnackbar$1.L$0;
                                    try {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        snackbarHostState.setCurrentSnackbarData(null);
                                        mutex2.unlock(null);
                                        return obj;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        snackbarHostState.setCurrentSnackbarData(null);
                                        throw th;
                                    }
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) snackbarHostState$showSnackbar$1.L$4;
                            androidx.compose.material.SnackbarDuration snackbarDuration3 = (androidx.compose.material.SnackbarDuration) snackbarHostState$showSnackbar$1.L$3;
                            java.lang.String str5 = (java.lang.String) snackbarHostState$showSnackbar$1.L$2;
                            java.lang.String str6 = (java.lang.String) snackbarHostState$showSnackbar$1.L$1;
                            androidx.compose.material.SnackbarHostState snackbarHostState2 = (androidx.compose.material.SnackbarHostState) snackbarHostState$showSnackbar$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = mutex3;
                            str4 = str6;
                            snackbarDuration2 = snackbarDuration3;
                            str3 = str5;
                            snackbarHostState = snackbarHostState2;
                        }
                        snackbarHostState$showSnackbar$1.L$0 = snackbarHostState;
                        snackbarHostState$showSnackbar$1.L$1 = str4;
                        snackbarHostState$showSnackbar$1.L$2 = str3;
                        snackbarHostState$showSnackbar$1.L$3 = snackbarDuration2;
                        snackbarHostState$showSnackbar$1.L$4 = mutex;
                        snackbarHostState$showSnackbar$1.L$5 = snackbarHostState$showSnackbar$1;
                        snackbarHostState$showSnackbar$1.label = 2;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        snackbarHostState.setCurrentSnackbarData(new androidx.compose.material.SnackbarHostState.SnackbarDataImpl(str4, str3, snackbarDuration2, cancellableContinuationImpl));
                        result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$1);
                        }
                        if (result != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlinx.coroutines.sync.Mutex mutex4 = mutex;
                        obj = result;
                        mutex2 = mutex4;
                        snackbarHostState.setCurrentSnackbarData(null);
                        mutex2.unlock(null);
                        return obj;
                    }
                }
                snackbarHostState$showSnackbar$1.L$0 = snackbarHostState;
                snackbarHostState$showSnackbar$1.L$1 = str4;
                snackbarHostState$showSnackbar$1.L$2 = str3;
                snackbarHostState$showSnackbar$1.L$3 = snackbarDuration2;
                snackbarHostState$showSnackbar$1.L$4 = mutex;
                snackbarHostState$showSnackbar$1.L$5 = snackbarHostState$showSnackbar$1;
                snackbarHostState$showSnackbar$1.label = 2;
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                cancellableContinuationImpl2.initCancellability();
                snackbarHostState.setCurrentSnackbarData(new androidx.compose.material.SnackbarHostState.SnackbarDataImpl(str4, str3, snackbarDuration2, cancellableContinuationImpl2));
                result = cancellableContinuationImpl2.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (result != coroutine_suspended) {
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                snackbarHostState.setCurrentSnackbarData(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th3) {
            str.unlock(null);
            throw th3;
        }
        snackbarHostState$showSnackbar$1 = new androidx.compose.material.SnackbarHostState$showSnackbar$1(this, continuation);
        java.lang.Object obj2 = snackbarHostState$showSnackbar$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snackbarHostState$showSnackbar$1.label;
    }

    public static /* synthetic */ java.lang.Object showSnackbar$default(androidx.compose.material.SnackbarHostState snackbarHostState, java.lang.String str, java.lang.String str2, androidx.compose.material.SnackbarDuration snackbarDuration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = androidx.compose.material.SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, continuation);
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "message", "", "actionLabel", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "Landroidx/compose/material/SnackbarDuration;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material/SnackbarResult;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/CancellableContinuation;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "getMessage", "dismiss", "", "performAction", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class SnackbarDataImpl implements androidx.compose.material.SnackbarData {
        private final java.lang.String actionLabel;
        private final kotlinx.coroutines.CancellableContinuation<androidx.compose.material.SnackbarResult> continuation;
        private final androidx.compose.material.SnackbarDuration duration;
        private final java.lang.String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(java.lang.String message, java.lang.String str, androidx.compose.material.SnackbarDuration duration, kotlinx.coroutines.CancellableContinuation<? super androidx.compose.material.SnackbarResult> continuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "duration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.message = message;
            this.actionLabel = str;
            this.duration = duration;
            this.continuation = continuation;
        }

        @Override // androidx.compose.material.SnackbarData
        public java.lang.String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public java.lang.String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        public androidx.compose.material.SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.CancellableContinuation<androidx.compose.material.SnackbarResult> cancellableContinuation = this.continuation;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(androidx.compose.material.SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.CancellableContinuation<androidx.compose.material.SnackbarResult> cancellableContinuation = this.continuation;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(androidx.compose.material.SnackbarResult.Dismissed));
            }
        }
    }
}
