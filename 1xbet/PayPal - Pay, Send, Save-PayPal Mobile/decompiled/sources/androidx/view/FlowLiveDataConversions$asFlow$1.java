package androidx.view;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1}, l = {105, 106, 108}, m = "invokeSuspend", n = {"observer", "observer"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes7.dex */
final class FlowLiveDataConversions$asFlow$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.LiveData<T> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.Observer observer;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
            if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate().plus(kotlinx.coroutines.NonCancellable.INSTANCE), new androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, r1, null), this) != coroutine_suspended) {
                throw th;
            }
        }
        if (r1 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
            androidx.view.Observer observer2 = new androidx.view.Observer() { // from class: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$$ExternalSyntheticLambda0
                @Override // androidx.view.Observer
                public final void onChanged(java.lang.Object obj2) {
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU(obj2);
                }
            };
            this.getHighSpeedVideoSizes = observer2;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, observer2, null), this);
            observer = observer2;
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    androidx.view.Observer observer3 = (androidx.view.Observer) this.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r1 = observer3;
                    throw new kotlin.KotlinNothingValueException();
                }
                if (r1 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th2 = (java.lang.Throwable) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th2;
            }
            androidx.view.Observer observer4 = (androidx.view.Observer) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            observer = observer4;
        }
        this.getHighSpeedVideoSizes = observer;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        r1 = observer;
        if (kotlinx.coroutines.DelayKt.awaitCancellation(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.view.LiveData<T> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.view.Observer<T> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI.observeForever(this.getHighSpeedVideoFpsRanges);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.view.LiveData<T> liveData, androidx.view.Observer<T> observer, kotlin.coroutines.Continuation<? super androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = liveData;
            this.getHighSpeedVideoFpsRanges = observer;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.view.Observer<T> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.view.LiveData<T> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges.removeObserver(this.getHighResolutionOutputSizeshNQ4ISI);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.view.LiveData<T> liveData, androidx.view.Observer<T> observer, kotlin.coroutines.Continuation<? super androidx.view.FlowLiveDataConversions$asFlow$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = liveData;
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.FlowLiveDataConversions$asFlow$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new androidx.view.FlowLiveDataConversions$asFlow$1(this.getHighSpeedVideoFpsRanges, continuation);
        flowLiveDataConversions$asFlow$1.getHighSpeedVideoSizes = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowLiveDataConversions$asFlow$1(androidx.view.LiveData<T> liveData, kotlin.coroutines.Continuation<? super androidx.view.FlowLiveDataConversions$asFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = liveData;
    }
}
