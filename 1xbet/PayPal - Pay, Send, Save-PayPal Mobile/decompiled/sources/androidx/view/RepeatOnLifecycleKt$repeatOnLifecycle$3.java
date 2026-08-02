package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.lifecycle.Lifecycle.State Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.Lifecycle getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {161}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"}, v = 1)
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.lifecycle.Lifecycle.State getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.view.Lifecycle getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        java.lang.Object getInputSizeshNQ4ISI;
        java.lang.Object getOutputFormats;
        java.lang.Object getOutputMinFrameDuration;
        int getOutputStallDurationlomOqCM;

        /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
        /* JADX WARN: Type inference failed for: r7v1, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            kotlin.jvm.internal.Ref.ObjectRef objectRef2;
            kotlinx.coroutines.Job job;
            androidx.view.LifecycleEventObserver lifecycleEventObserver;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputStallDurationlomOqCM;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                    return kotlin.Unit.INSTANCE;
                }
                final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                kotlin.jvm.internal.Ref.ObjectRef objectRef4 = new kotlin.jvm.internal.Ref.ObjectRef();
                try {
                    androidx.lifecycle.Lifecycle.State state = this.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.view.Lifecycle lifecycle = this.getHighSpeedVideoFpsRangesFor;
                    final kotlinx.coroutines.CoroutineScope coroutineScope = this.Camera2StreamConfigurationMap;
                    final kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoFpsRanges = objectRef3;
                    this.getInputFormats = objectRef4;
                    this.getOutputMinFrameDuration = state;
                    this.getOutputFormats = lifecycle;
                    this.getInputSizeshNQ4ISI = coroutineScope;
                    this.getHighSpeedVideoSizesFor = function2;
                    this.getOutputStallDurationlomOqCM = 1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    final androidx.lifecycle.Lifecycle.Event upTo = androidx.lifecycle.Lifecycle.Event.INSTANCE.upTo(state);
                    final androidx.lifecycle.Lifecycle.Event downFrom = androidx.lifecycle.Lifecycle.Event.INSTANCE.downFrom(state);
                    final kotlinx.coroutines.sync.Mutex Mutex$default = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
                    objectRef4.element = new androidx.view.LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
                        /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.Job] */
                        @Override // androidx.view.LifecycleEventObserver
                        public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                            ?? launch$default;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                            if (event == androidx.lifecycle.Lifecycle.Event.this) {
                                kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef5 = objectRef3;
                                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1(Mutex$default, function2, null), 3, null);
                                objectRef5.element = launch$default;
                                return;
                            }
                            if (event == downFrom) {
                                kotlinx.coroutines.Job job2 = objectRef3.element;
                                if (job2 != null) {
                                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                }
                                objectRef3.element = null;
                            }
                            if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                            }
                        }

                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {166, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"}, v = 1)
                        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                            final /* synthetic */ kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap;
                            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
                            int getHighSpeedVideoFpsRangesFor;
                            java.lang.Object getHighSpeedVideoSizes;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2;
                                kotlinx.coroutines.sync.Mutex mutex;
                                kotlinx.coroutines.sync.Mutex mutex2;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.getHighSpeedVideoFpsRangesFor;
                                try {
                                    if (i == 0) {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        kotlinx.coroutines.sync.Mutex mutex3 = this.Camera2StreamConfigurationMap;
                                        function2 = this.getHighSpeedVideoFpsRanges;
                                        this.getHighSpeedVideoSizes = mutex3;
                                        this.getHighResolutionOutputSizeshNQ4ISI = function2;
                                        this.getHighSpeedVideoFpsRangesFor = 1;
                                        if (mutex3.lock(null, this) != coroutine_suspended) {
                                            mutex = mutex3;
                                        }
                                        return coroutine_suspended;
                                    }
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoSizes;
                                        try {
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            mutex2.unlock(null);
                                            return kotlin.Unit.INSTANCE;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            mutex = mutex2;
                                            mutex.unlock(null);
                                            throw th;
                                        }
                                    }
                                    function2 = (kotlin.jvm.functions.Function2) this.getHighResolutionOutputSizeshNQ4ISI;
                                    mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoSizes;
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                    this.getHighSpeedVideoSizes = mutex;
                                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                                    this.getHighSpeedVideoFpsRangesFor = 2;
                                    if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutine_suspended) {
                                        mutex2 = mutex;
                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                        mutex2.unlock(null);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    mutex.unlock(null);
                                    throw th;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                return ((androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                return new androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(kotlinx.coroutines.sync.Mutex mutex, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.Camera2StreamConfigurationMap = mutex;
                                this.getHighSpeedVideoFpsRanges = function2;
                            }
                        }
                    };
                    T t = objectRef4.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
                    lifecycle.addObserver((androidx.view.LifecycleEventObserver) t);
                    java.lang.Object result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                } catch (java.lang.Throwable th) {
                    th = th;
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                    job = (kotlinx.coroutines.Job) objectRef.element;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    lifecycleEventObserver = (androidx.view.LifecycleEventObserver) objectRef2.element;
                    if (lifecycleEventObserver != null) {
                        this.getHighSpeedVideoFpsRangesFor.removeObserver(lifecycleEventObserver);
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputFormats;
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRanges;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    job = (kotlinx.coroutines.Job) objectRef.element;
                    if (job != null) {
                    }
                    lifecycleEventObserver = (androidx.view.LifecycleEventObserver) objectRef2.element;
                    if (lifecycleEventObserver != null) {
                    }
                    throw th;
                }
            }
            kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) objectRef.element;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            androidx.view.LifecycleEventObserver lifecycleEventObserver2 = (androidx.view.LifecycleEventObserver) objectRef2.element;
            if (lifecycleEventObserver2 != null) {
                this.getHighSpeedVideoFpsRangesFor.removeObserver(lifecycleEventObserver2);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = lifecycle;
            this.getHighResolutionOutputSizeshNQ4ISI = state;
            this.Camera2StreamConfigurationMap = coroutineScope;
            this.getHighSpeedVideoSizes = function2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, coroutineScope, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.getHighResolutionOutputSizeshNQ4ISI = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.view.RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = lifecycle;
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
