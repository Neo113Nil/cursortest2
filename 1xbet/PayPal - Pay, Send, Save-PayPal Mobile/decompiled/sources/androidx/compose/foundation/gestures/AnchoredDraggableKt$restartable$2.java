package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {1549}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableKt$restartable$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<I> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            this.getHighSpeedVideoFpsRanges = 1;
            if (androidx.compose.runtime.SnapshotStateKt.snapshotFlow(this.getHighResolutionOutputSizeshNQ4ISI).collect(new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1(objectRef, coroutineScope, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(I i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
            int i2;
            java.lang.Object obj;
            kotlinx.coroutines.Job launch$default;
            if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) {
                anchoredDraggableKt$restartable$2$1$emit$1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
                if ((anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoSizes;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRanges.element;
                        obj = i;
                        if (job != null) {
                            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                            anchoredDraggableKt$restartable$2$1$emit$1.Camera2StreamConfigurationMap = i;
                            anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRanges = job;
                            anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoSizes = 1;
                            obj = i;
                            if (job.join(anchoredDraggableKt$restartable$2$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj3 = anchoredDraggableKt$restartable$2$1$emit$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        obj = obj3;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef = this.getHighSpeedVideoFpsRanges;
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2(this.Camera2StreamConfigurationMap, obj, this.getHighSpeedVideoSizes, null), 1, null);
                    objectRef.element = (T) launch$default;
                    return kotlin.Unit.INSTANCE;
                }
            }
            anchoredDraggableKt$restartable$2$1$emit$1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
            java.lang.Object obj22 = anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = anchoredDraggableKt$restartable$2$1$emit$1.getHighSpeedVideoSizes;
            if (i2 != 0) {
            }
            kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef2 = this.getHighSpeedVideoFpsRanges;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2(this.Camera2StreamConfigurationMap, obj, this.getHighSpeedVideoSizes, null), 1, null);
            objectRef2.element = (T) launch$default;
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {1556}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
            final /* synthetic */ kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ I getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.Camera2StreamConfigurationMap;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
                    I i2 = this.getHighSpeedVideoSizes;
                    this.Camera2StreamConfigurationMap = 1;
                    if (function2.invoke(i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.CoroutineScopeKt.cancel(this.getHighSpeedVideoFpsRanges, new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, I i, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = function2;
                this.getHighSpeedVideoSizes = i;
                this.getHighSpeedVideoFpsRanges = coroutineScope;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
            this.getHighSpeedVideoFpsRanges = objectRef;
            this.getHighSpeedVideoSizes = coroutineScope;
            this.Camera2StreamConfigurationMap = function2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        anchoredDraggableKt$restartable$2.getHighSpeedVideoSizes = obj;
        return anchoredDraggableKt$restartable$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableKt$restartable$2(kotlin.jvm.functions.Function0<? extends I> function0, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.Camera2StreamConfigurationMap = function2;
    }
}
