package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R/\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "duration", "Landroidx/compose/material3/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/material3/SnackbarData;", "<set-?>", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData", "SnackbarVisualsImpl", "SnackbarDataImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: currentSnackbarData$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentSnackbarData = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(androidx.compose.material3.SnackbarData snackbarData) {
        this.currentSnackbarData.setValue(snackbarData);
    }

    public final androidx.compose.material3.SnackbarData getCurrentSnackbarData() {
        return (androidx.compose.material3.SnackbarData) this.currentSnackbarData.getValue();
    }

    public static /* synthetic */ java.lang.Object showSnackbar$default(androidx.compose.material3.SnackbarHostState snackbarHostState, java.lang.String str, java.lang.String str2, boolean z, androidx.compose.material3.SnackbarDuration snackbarDuration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            snackbarDuration = str3 == null ? androidx.compose.material3.SnackbarDuration.Short : androidx.compose.material3.SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z2, snackbarDuration, continuation);
    }

    public final java.lang.Object showSnackbar(java.lang.String str, java.lang.String str2, boolean z, androidx.compose.material3.SnackbarDuration snackbarDuration, kotlin.coroutines.Continuation<? super androidx.compose.material3.SnackbarResult> continuation) {
        return showSnackbar(new androidx.compose.material3.SnackbarHostState.SnackbarVisualsImpl(str, str2, z, snackbarDuration), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        if (r9.lock(null, r0) != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:26:0x0064, B:28:0x0092), top: B:25:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals snackbarVisuals, kotlin.coroutines.Continuation<? super androidx.compose.material3.SnackbarResult> continuation) {
        androidx.compose.material3.SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.compose.material3.SnackbarVisuals snackbarVisuals2;
        java.lang.Throwable th;
        java.lang.Object result;
        kotlinx.coroutines.sync.Mutex mutex2;
        try {
            try {
                if (continuation instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2) {
                    snackbarHostState$showSnackbar$2 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) continuation;
                    if ((snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRanges -= 2147483648;
                        java.lang.Object obj = snackbarHostState$showSnackbar$2.getHighSpeedVideoSizes;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRanges;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = this.getHighSpeedVideoFpsRanges;
                            snackbarHostState$showSnackbar$2.Camera2StreamConfigurationMap = snackbarVisuals;
                            snackbarHostState$showSnackbar$2.getHighResolutionOutputSizeshNQ4ISI = mutex;
                            snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRanges = 1;
                            snackbarVisuals2 = snackbarVisuals;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex2 = (kotlinx.coroutines.sync.Mutex) snackbarHostState$showSnackbar$2.getHighResolutionOutputSizeshNQ4ISI;
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
                            kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) snackbarHostState$showSnackbar$2.getHighResolutionOutputSizeshNQ4ISI;
                            androidx.compose.material3.SnackbarVisuals snackbarVisuals3 = (androidx.compose.material3.SnackbarVisuals) snackbarHostState$showSnackbar$2.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = mutex3;
                            snackbarVisuals2 = snackbarVisuals3;
                        }
                        snackbarHostState$showSnackbar$2.Camera2StreamConfigurationMap = snackbarVisuals2;
                        snackbarHostState$showSnackbar$2.getHighResolutionOutputSizeshNQ4ISI = mutex;
                        snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRangesFor = snackbarHostState$showSnackbar$2;
                        snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRanges = 2;
                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$2), 1);
                        cancellableContinuationImpl.initCancellability();
                        setCurrentSnackbarData(new androidx.compose.material3.SnackbarHostState.SnackbarDataImpl(snackbarVisuals2, cancellableContinuationImpl));
                        result = cancellableContinuationImpl.getResult();
                        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$2);
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
                snackbarHostState$showSnackbar$2.Camera2StreamConfigurationMap = snackbarVisuals2;
                snackbarHostState$showSnackbar$2.getHighResolutionOutputSizeshNQ4ISI = mutex;
                snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRangesFor = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRanges = 2;
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$2), 1);
                cancellableContinuationImpl2.initCancellability();
                setCurrentSnackbarData(new androidx.compose.material3.SnackbarHostState.SnackbarDataImpl(snackbarVisuals2, cancellableContinuationImpl2));
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
            snackbarVisuals.unlock(null);
            throw th4;
        }
        snackbarHostState$showSnackbar$2 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2(this, continuation);
        java.lang.Object obj2 = snackbarHostState$showSnackbar$2.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snackbarHostState$showSnackbar$2.getHighSpeedVideoFpsRanges;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarVisualsImpl;", "Landroidx/compose/material3/SnackbarVisuals;", "", "p0", "p1", "", "p2", "Landroidx/compose/material3/SnackbarDuration;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getActionLabel", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Z", "getWithDismissAction", "()Z", "Landroidx/compose/material3/SnackbarDuration;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SnackbarVisualsImpl implements androidx.compose.material3.SnackbarVisuals {
        private final boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.material3.SnackbarDuration getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        public SnackbarVisualsImpl(java.lang.String str, java.lang.String str2, boolean z, androidx.compose.material3.SnackbarDuration snackbarDuration) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = str2;
            this.Camera2StreamConfigurationMap = z;
            this.getHighResolutionOutputSizeshNQ4ISI = snackbarDuration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        /* renamed from: getMessage, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        /* renamed from: getActionLabel, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        /* renamed from: getWithDismissAction, reason: from getter */
        public final boolean getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        /* renamed from: getDuration, reason: from getter */
        public final androidx.compose.material3.SnackbarDuration getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || getClass() != p0.getClass()) {
                return false;
            }
            androidx.compose.material3.SnackbarHostState.SnackbarVisualsImpl snackbarVisualsImpl = (androidx.compose.material3.SnackbarHostState.SnackbarVisualsImpl) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRangesFor(), snackbarVisualsImpl.getGetHighSpeedVideoFpsRangesFor()) && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRanges(), snackbarVisualsImpl.getGetHighSpeedVideoFpsRanges()) && getCamera2StreamConfigurationMap() == snackbarVisualsImpl.getCamera2StreamConfigurationMap() && getGetHighResolutionOutputSizeshNQ4ISI() == snackbarVisualsImpl.getGetHighResolutionOutputSizeshNQ4ISI();
        }

        public final int hashCode() {
            int hashCode = getGetHighSpeedVideoFpsRangesFor().hashCode();
            java.lang.String getHighSpeedVideoFpsRanges = getGetHighSpeedVideoFpsRanges();
            return (((((hashCode * 31) + (getHighSpeedVideoFpsRanges != null ? getHighSpeedVideoFpsRanges.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(getCamera2StreamConfigurationMap())) * 31) + getGetHighResolutionOutputSizeshNQ4ISI().hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material3/SnackbarData;", "Landroidx/compose/material3/SnackbarVisuals;", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material3/SnackbarResult;", "p1", "<init>", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlinx/coroutines/CancellableContinuation;)V", "", "performAction", "()V", "dismiss", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/material3/SnackbarVisuals;", "getVisuals", "()Landroidx/compose/material3/SnackbarVisuals;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SnackbarDataImpl implements androidx.compose.material3.SnackbarData {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.compose.material3.SnackbarVisuals getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlinx.coroutines.CancellableContinuation<androidx.compose.material3.SnackbarResult> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(androidx.compose.material3.SnackbarVisuals snackbarVisuals, kotlinx.coroutines.CancellableContinuation<? super androidx.compose.material3.SnackbarResult> cancellableContinuation) {
            this.getHighSpeedVideoSizes = snackbarVisuals;
            this.getHighResolutionOutputSizeshNQ4ISI = cancellableContinuation;
        }

        @Override // androidx.compose.material3.SnackbarData
        /* renamed from: getVisuals, reason: from getter */
        public final androidx.compose.material3.SnackbarVisuals getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.compose.material3.SnackbarData
        public final void performAction() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isActive()) {
                kotlinx.coroutines.CancellableContinuation<androidx.compose.material3.SnackbarResult> cancellableContinuation = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.compose.material3.SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material3.SnackbarData
        public final void dismiss() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isActive()) {
                kotlinx.coroutines.CancellableContinuation<androidx.compose.material3.SnackbarResult> cancellableContinuation = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.compose.material3.SnackbarResult.Dismissed));
            }
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || getClass() != p0.getClass()) {
                return false;
            }
            androidx.compose.material3.SnackbarHostState.SnackbarDataImpl snackbarDataImpl = (androidx.compose.material3.SnackbarHostState.SnackbarDataImpl) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoSizes(), snackbarDataImpl.getGetHighSpeedVideoSizes()) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, snackbarDataImpl.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final int hashCode() {
            return (getGetHighSpeedVideoSizes().hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }
    }
}
