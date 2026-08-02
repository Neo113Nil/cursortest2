package androidx.view.compose;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/runtime/ProduceStateScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class FlowExtKt$collectAsStateWithLifecycle$1$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.Lifecycle getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.lifecycle.Lifecycle.State getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", i = {}, l = {179, 181}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.coroutines.CoroutineContext getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.ProduceStateScope<T> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r7.collect(new androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.C00411<>(), r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r6.getHighResolutionOutputSizeshNQ4ISI, new androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.AnonymousClass2(r6.Camera2StreamConfigurationMap, r6.getHighSpeedVideoSizes, null), r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.coroutines.EmptyCoroutineContext.INSTANCE)) {
                    kotlinx.coroutines.flow.Flow<T> flow = this.Camera2StreamConfigurationMap;
                    final androidx.compose.runtime.ProduceStateScope<T> produceStateScope = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                } else {
                    this.getHighSpeedVideoFpsRangesFor = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ androidx.compose.runtime.ProduceStateScope<T> getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<T> flow = this.getHighSpeedVideoFpsRangesFor;
                    final androidx.compose.runtime.ProduceStateScope<T> produceStateScope = this.getHighSpeedVideoSizes;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.1.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            produceStateScope.setValue(t);
                            return kotlin.Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
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
                return ((androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T> flow, androidx.compose.runtime.ProduceStateScope<T> produceStateScope, kotlin.coroutines.Continuation<? super androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = flow;
                this.getHighSpeedVideoSizes = produceStateScope;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.flow.Flow<? extends T> flow, androidx.compose.runtime.ProduceStateScope<T> produceStateScope, kotlin.coroutines.Continuation<? super androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = coroutineContext;
            this.Camera2StreamConfigurationMap = flow;
            this.getHighSpeedVideoSizes = produceStateScope;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getOutputFormats;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, new androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, produceStateScope, null), this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1) create((androidx.compose.runtime.ProduceStateScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        flowExtKt$collectAsStateWithLifecycle$1$1.getOutputFormats = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$collectAsStateWithLifecycle$1$1(androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super androidx.view.compose.FlowExtKt$collectAsStateWithLifecycle$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycle;
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoSizes = coroutineContext;
        this.Camera2StreamConfigurationMap = flow;
    }
}
