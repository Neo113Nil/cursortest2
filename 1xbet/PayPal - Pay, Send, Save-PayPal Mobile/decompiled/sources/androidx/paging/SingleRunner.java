package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u0014\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/paging/SingleRunner;", "", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "runInIsolation", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/SingleRunner$Holder;", "Camera2StreamConfigurationMap", "Landroidx/paging/SingleRunner$Holder;", "getHighSpeedVideoSizes", "Companion", "CancelIsolatedRunnerException", "Holder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleRunner {
    public static final int DEFAULT_PRIORITY = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.paging.SingleRunner.Holder getHighSpeedVideoSizes;

    public SingleRunner(boolean z) {
        this.getHighSpeedVideoSizes = new androidx.paging.SingleRunner.Holder(this, z);
    }

    public /* synthetic */ SingleRunner(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public static /* synthetic */ java.lang.Object runInIsolation$default(androidx.paging.SingleRunner singleRunner, int i, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.runInIsolation(i, function1, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r5.getGetHighSpeedVideoSizes() != r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object runInIsolation(int i, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.SingleRunner$runInIsolation$1 singleRunner$runInIsolation$1;
        int i2;
        if (continuation instanceof androidx.paging.SingleRunner$runInIsolation$1) {
            singleRunner$runInIsolation$1 = (androidx.paging.SingleRunner$runInIsolation$1) continuation;
            if ((singleRunner$runInIsolation$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                singleRunner$runInIsolation$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = singleRunner$runInIsolation$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = singleRunner$runInIsolation$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.paging.SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new androidx.paging.SingleRunner$runInIsolation$2(this, i, function1, null);
                    singleRunner$runInIsolation$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(singleRunner$runInIsolation$2, singleRunner$runInIsolation$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        singleRunner$runInIsolation$1 = new androidx.paging.SingleRunner$runInIsolation$1(this, continuation);
        java.lang.Object obj2 = singleRunner$runInIsolation$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = singleRunner$runInIsolation$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "Landroidx/paging/SingleRunner;", "p0", "<init>", "(Landroidx/paging/SingleRunner;)V", "getHighSpeedVideoFpsRanges", "Landroidx/paging/SingleRunner;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/paging/SingleRunner;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class CancelIsolatedRunnerException extends java.util.concurrent.CancellationException {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.paging.SingleRunner getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelIsolatedRunnerException(androidx.paging.SingleRunner singleRunner) {
            super("Cancelled isolated runner");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleRunner, "");
            this.getHighSpeedVideoSizes = singleRunner;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final androidx.paging.SingleRunner getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\n\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000e\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017"}, d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "Landroidx/paging/SingleRunner;", "p0", "", "p1", "<init>", "(Landroidx/paging/SingleRunner;Z)V", "", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "(ILkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroidx/paging/SingleRunner;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/Job;", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Holder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;
        private kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.paging.SingleRunner getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges;

        public Holder(androidx.paging.SingleRunner singleRunner, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleRunner, "");
            this.getHighSpeedVideoSizes = singleRunner;
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            r11.cancel((java.util.concurrent.CancellationException) new androidx.paging.SingleRunner.CancelIsolatedRunnerException(r8.getHighSpeedVideoSizes));
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:12:0x0034, B:14:0x009b, B:15:0x009f, B:23:0x0063, B:25:0x0067, B:27:0x006d, B:30:0x0073, B:35:0x007c, B:37:0x008a), top: B:7:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(int i, kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            androidx.paging.SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
            int i2;
            boolean z;
            kotlinx.coroutines.Job job2;
            kotlinx.coroutines.sync.Mutex mutex;
            kotlinx.coroutines.Job job3;
            kotlinx.coroutines.Job job4;
            int i3;
            try {
                if (continuation instanceof androidx.paging.SingleRunner$Holder$tryEnqueue$1) {
                    singleRunner$Holder$tryEnqueue$1 = (androidx.paging.SingleRunner$Holder$tryEnqueue$1) continuation;
                    if ((singleRunner$Holder$tryEnqueue$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                        singleRunner$Holder$tryEnqueue$1.Camera2StreamConfigurationMap -= 2147483648;
                        java.lang.Object obj = singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoSizes;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i2 = singleRunner$Holder$tryEnqueue$1.Camera2StreamConfigurationMap;
                        z = true;
                        if (i2 != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.sync.Mutex mutex2 = this.getHighSpeedVideoFpsRanges;
                            singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRanges = job;
                            singleRunner$Holder$tryEnqueue$1.getHighResolutionOutputSizeshNQ4ISI = mutex2;
                            singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRangesFor = i;
                            singleRunner$Holder$tryEnqueue$1.Camera2StreamConfigurationMap = 1;
                            if (mutex2.lock(null, singleRunner$Holder$tryEnqueue$1) != coroutine_suspended) {
                                job2 = job;
                                mutex = mutex2;
                            }
                            return coroutine_suspended;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i = singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRangesFor;
                            kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) singleRunner$Holder$tryEnqueue$1.getHighResolutionOutputSizeshNQ4ISI;
                            job4 = (kotlinx.coroutines.Job) singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = mutex3;
                            job2 = job4;
                            this.getHighResolutionOutputSizeshNQ4ISI = job2;
                            this.getHighSpeedVideoFpsRangesFor = i;
                            job = mutex;
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                        }
                        i = singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) singleRunner$Holder$tryEnqueue$1.getHighResolutionOutputSizeshNQ4ISI;
                        job2 = (kotlinx.coroutines.Job) singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex4;
                        job3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (job3 != null && job3.isActive() && (i3 = this.getHighSpeedVideoFpsRangesFor) >= i && (i3 != i || !this.Camera2StreamConfigurationMap)) {
                            z = false;
                            job = mutex;
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                        }
                        if (job3 != null) {
                            singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRanges = job2;
                            singleRunner$Holder$tryEnqueue$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                            singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoFpsRangesFor = i;
                            singleRunner$Holder$tryEnqueue$1.Camera2StreamConfigurationMap = 2;
                            if (job3.join(singleRunner$Holder$tryEnqueue$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            job4 = job2;
                            mutex = mutex;
                            job2 = job4;
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI = job2;
                        this.getHighSpeedVideoFpsRangesFor = i;
                        job = mutex;
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                    }
                }
                if (i2 != 0) {
                }
                job3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (job3 != null) {
                    z = false;
                    job = mutex;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                }
                if (job3 != null) {
                }
                this.getHighResolutionOutputSizeshNQ4ISI = job2;
                this.getHighSpeedVideoFpsRangesFor = i;
                job = mutex;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            } finally {
                job.unlock(null);
            }
            singleRunner$Holder$tryEnqueue$1 = new androidx.paging.SingleRunner$Holder$tryEnqueue$1(this, continuation);
            java.lang.Object obj2 = singleRunner$Holder$tryEnqueue$1.getHighSpeedVideoSizes;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = singleRunner$Holder$tryEnqueue$1.Camera2StreamConfigurationMap;
            z = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x0055), top: B:10:0x004f }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
            int i;
            kotlinx.coroutines.sync.Mutex mutex;
            try {
                if (continuation instanceof androidx.paging.SingleRunner$Holder$onFinish$1) {
                    singleRunner$Holder$onFinish$1 = (androidx.paging.SingleRunner$Holder$onFinish$1) continuation;
                    if ((singleRunner$Holder$onFinish$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                        singleRunner$Holder$onFinish$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                        java.lang.Object obj = singleRunner$Holder$onFinish$1.getHighSpeedVideoFpsRanges;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = singleRunner$Holder$onFinish$1.getHighSpeedVideoFpsRangesFor;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = this.getHighSpeedVideoFpsRanges;
                            singleRunner$Holder$onFinish$1.getHighResolutionOutputSizeshNQ4ISI = job;
                            singleRunner$Holder$onFinish$1.getHighSpeedVideoSizes = mutex;
                            singleRunner$Holder$onFinish$1.getHighSpeedVideoFpsRangesFor = 1;
                            if (mutex.lock(null, singleRunner$Holder$onFinish$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) singleRunner$Holder$onFinish$1.getHighSpeedVideoSizes;
                            kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) singleRunner$Holder$onFinish$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutex = mutex2;
                            job = job2;
                        }
                        if (job == this.getHighResolutionOutputSizeshNQ4ISI) {
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        mutex.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                if (job == this.getHighResolutionOutputSizeshNQ4ISI) {
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                mutex.unlock(null);
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                mutex.unlock(null);
                throw th;
            }
            singleRunner$Holder$onFinish$1 = new androidx.paging.SingleRunner$Holder$onFinish$1(this, continuation);
            java.lang.Object obj2 = singleRunner$Holder$onFinish$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = singleRunner$Holder$onFinish$1.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
            }
        }
    }

    public SingleRunner() {
        this(false, 1, null);
    }
}
