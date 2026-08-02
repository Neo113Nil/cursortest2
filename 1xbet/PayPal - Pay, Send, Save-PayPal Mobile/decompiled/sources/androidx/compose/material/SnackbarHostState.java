package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR/\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "Landroidx/compose/material/SnackbarDuration;", "duration", "Landroidx/compose/material/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/material/SnackbarData;", "<set-?>", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData", "SnackbarDataImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: currentSnackbarData$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentSnackbarData = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(androidx.compose.material.SnackbarData snackbarData) {
        this.currentSnackbarData.setValue(snackbarData);
    }

    public final androidx.compose.material.SnackbarData getCurrentSnackbarData() {
        return (androidx.compose.material.SnackbarData) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r11.lock(null, r0) != r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #2 {all -> 0x00be, blocks: (B:26:0x007a, B:28:0x00ac), top: B:25:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object showSnackbar(java.lang.String str, java.lang.String str2, androidx.compose.material.SnackbarDuration snackbarDuration, kotlin.coroutines.Continuation<? super androidx.compose.material.SnackbarResult> continuation) {
        androidx.compose.material.SnackbarHostState$showSnackbar$1 snackbarHostState$showSnackbar$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.String str3;
        java.lang.Throwable th;
        java.lang.Object result;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            try {
                if (continuation instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1) {
                    snackbarHostState$showSnackbar$1 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) continuation;
                    if ((snackbarHostState$showSnackbar$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$1.getHighSpeedVideoSizesFor -= 2147483648;
                        java.lang.Object obj = snackbarHostState$showSnackbar$1.getInputFormats;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = snackbarHostState$showSnackbar$1.getHighSpeedVideoSizesFor;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = this.getHighSpeedVideoFpsRanges;
                            snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRanges = str;
                            snackbarHostState$showSnackbar$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                            snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRangesFor = snackbarDuration;
                            snackbarHostState$showSnackbar$1.Camera2StreamConfigurationMap = mutex;
                            snackbarHostState$showSnackbar$1.getHighSpeedVideoSizesFor = 1;
                            str3 = str;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex2 = (kotlinx.coroutines.sync.Mutex) snackbarHostState$showSnackbar$1.Camera2StreamConfigurationMap;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    setCurrentSnackbarData(null);
                                    mutex2.unlock(null);
                                    return obj;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    setCurrentSnackbarData(null);
                                    throw th;
                                }
                            }
                            kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) snackbarHostState$showSnackbar$1.Camera2StreamConfigurationMap;
                            snackbarDuration = (androidx.compose.material.SnackbarDuration) snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRangesFor;
                            str2 = (java.lang.String) snackbarHostState$showSnackbar$1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.String str4 = (java.lang.String) snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = mutex3;
                            str3 = str4;
                        }
                        snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRanges = str3;
                        snackbarHostState$showSnackbar$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                        snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRangesFor = snackbarDuration;
                        snackbarHostState$showSnackbar$1.Camera2StreamConfigurationMap = mutex;
                        snackbarHostState$showSnackbar$1.getHighSpeedVideoSizes = snackbarHostState$showSnackbar$1;
                        snackbarHostState$showSnackbar$1.getHighSpeedVideoSizesFor = 2;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        setCurrentSnackbarData(new androidx.compose.material.SnackbarHostState.SnackbarDataImpl(str3, str2, snackbarDuration, cancellableContinuationImpl));
                        result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$1);
                        }
                        if (result != coroutine_suspended) {
                            kotlinx.coroutines.sync.Mutex mutex4 = mutex;
                            obj = result;
                            mutex2 = mutex4;
                            setCurrentSnackbarData(null);
                            mutex2.unlock(null);
                            return obj;
                        }
                        return coroutine_suspended;
                    }
                }
                snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRanges = str3;
                snackbarHostState$showSnackbar$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                snackbarHostState$showSnackbar$1.getHighSpeedVideoFpsRangesFor = snackbarDuration;
                snackbarHostState$showSnackbar$1.Camera2StreamConfigurationMap = mutex;
                snackbarHostState$showSnackbar$1.getHighSpeedVideoSizes = snackbarHostState$showSnackbar$1;
                snackbarHostState$showSnackbar$1.getHighSpeedVideoSizesFor = 2;
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                cancellableContinuationImpl2.initCancellability();
                setCurrentSnackbarData(new androidx.compose.material.SnackbarHostState.SnackbarDataImpl(str3, str2, snackbarDuration, cancellableContinuationImpl2));
                result = cancellableContinuationImpl2.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (result != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th3) {
                th = th3;
                setCurrentSnackbarData(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th4) {
            str.unlock(null);
            throw th4;
        }
        snackbarHostState$showSnackbar$1 = new androidx.compose.material.SnackbarHostState$showSnackbar$1(this, continuation);
        java.lang.Object obj2 = snackbarHostState$showSnackbar$1.getInputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snackbarHostState$showSnackbar$1.getHighSpeedVideoSizesFor;
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

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "", "p0", "p1", "Landroidx/compose/material/SnackbarDuration;", "p2", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material/SnackbarResult;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/CancellableContinuation;)V", "", "performAction", "()V", "dismiss", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getActionLabel", "getHighSpeedVideoSizes", "Landroidx/compose/material/SnackbarDuration;", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CancellableContinuation;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class SnackbarDataImpl implements androidx.compose.material.SnackbarData {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlinx.coroutines.CancellableContinuation<androidx.compose.material.SnackbarResult> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.compose.material.SnackbarDuration Camera2StreamConfigurationMap;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(java.lang.String str, java.lang.String str2, androidx.compose.material.SnackbarDuration snackbarDuration, kotlinx.coroutines.CancellableContinuation<? super androidx.compose.material.SnackbarResult> cancellableContinuation) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.Camera2StreamConfigurationMap = snackbarDuration;
            this.getHighSpeedVideoFpsRangesFor = cancellableContinuation;
        }

        @Override // androidx.compose.material.SnackbarData
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.compose.material.SnackbarData
        /* renamed from: getActionLabel, reason: from getter */
        public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.compose.material.SnackbarData
        /* renamed from: getDuration, reason: from getter */
        public final androidx.compose.material.SnackbarDuration getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.compose.material.SnackbarData
        public final void performAction() {
            if (this.getHighSpeedVideoFpsRangesFor.isActive()) {
                kotlinx.coroutines.CancellableContinuation<androidx.compose.material.SnackbarResult> cancellableContinuation = this.getHighSpeedVideoFpsRangesFor;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.compose.material.SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        public final void dismiss() {
            if (this.getHighSpeedVideoFpsRangesFor.isActive()) {
                kotlinx.coroutines.CancellableContinuation<androidx.compose.material.SnackbarResult> cancellableContinuation = this.getHighSpeedVideoFpsRangesFor;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.compose.material.SnackbarResult.Dismissed));
            }
        }
    }
}
