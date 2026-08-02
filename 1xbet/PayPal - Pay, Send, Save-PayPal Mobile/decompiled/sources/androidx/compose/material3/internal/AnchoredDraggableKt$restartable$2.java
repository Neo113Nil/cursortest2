package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {708}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnchoredDraggableKt$restartable$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<I> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.compose.runtime.SnapshotStateKt.snapshotFlow(this.Camera2StreamConfigurationMap).collect(new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2.AnonymousClass1(objectRef, coroutineScope, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(I i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
            int i2;
            java.lang.Object obj;
            kotlinx.coroutines.Job launch$default;
            if (continuation instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1) {
                anchoredDraggableKt$restartable$2$1$emit$1 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
                if ((anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRanges;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRanges.element;
                        obj = i;
                        if (job != null) {
                            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                            anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRangesFor = i;
                            anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoSizes = job;
                            anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                            obj = i;
                            if (job.join(anchoredDraggableKt$restartable$2$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj3 = anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        obj = obj3;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef = this.getHighSpeedVideoFpsRanges;
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2(this.Camera2StreamConfigurationMap, obj, this.getHighSpeedVideoFpsRangesFor, null), 1, null);
                    objectRef.element = (T) launch$default;
                    return kotlin.Unit.INSTANCE;
                }
            }
            anchoredDraggableKt$restartable$2$1$emit$1 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
            java.lang.Object obj22 = anchoredDraggableKt$restartable$2$1$emit$1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRanges;
            if (i2 != 0) {
            }
            kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef2 = this.getHighSpeedVideoFpsRanges;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2(this.Camera2StreamConfigurationMap, obj, this.getHighSpeedVideoFpsRangesFor, null), 1, null);
            objectRef2.element = (T) launch$default;
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ I getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
            int getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
                    I i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (function2.invoke(i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.CoroutineScopeKt.cancel(this.getHighSpeedVideoSizes, new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, I i, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRanges = function2;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                this.getHighSpeedVideoSizes = coroutineScope;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
            this.getHighSpeedVideoFpsRanges = objectRef;
            this.getHighSpeedVideoFpsRangesFor = coroutineScope;
            this.Camera2StreamConfigurationMap = function2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        anchoredDraggableKt$restartable$2.getHighSpeedVideoSizes = obj;
        return anchoredDraggableKt$restartable$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableKt$restartable$2(kotlin.jvm.functions.Function0<? extends I> function0, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
