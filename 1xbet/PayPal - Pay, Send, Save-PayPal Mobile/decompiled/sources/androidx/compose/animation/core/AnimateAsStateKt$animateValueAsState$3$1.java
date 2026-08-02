package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {0}, l = {418}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AnimateAsStateKt$animateValueAsState$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<T, kotlin.Unit>> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<T> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.Animatable<T, V> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;
    int getOutputFormats;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            it = this.getHighSpeedVideoFpsRanges.iterator();
            this.getInputFormats = coroutineScope;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getOutputFormats = 1;
            hasNext = it.hasNext(this);
            if (hasNext == coroutine_suspended) {
            }
            if (((java.lang.Boolean) hasNext).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRangesFor;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            hasNext = obj;
            if (((java.lang.Boolean) hasNext).booleanValue()) {
                java.lang.Object next = it.next();
                java.lang.Object m24084getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk());
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.AnonymousClass1(m24084getOrNullimpl != null ? m24084getOrNullimpl : next, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), 3, null);
                this.getInputFormats = coroutineScope;
                this.getHighSpeedVideoFpsRangesFor = it;
                this.getOutputFormats = 1;
                hasNext = it.hasNext(this);
                if (hasNext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((java.lang.Boolean) hasNext).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.animation.core.Animatable<T, V> Camera2StreamConfigurationMap;
        final /* synthetic */ T getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<T, kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationSpec highResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1 highSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getTargetValue())) {
                    androidx.compose.animation.core.Animatable<T, V> animatable = this.Camera2StreamConfigurationMap;
                    T t = this.getHighResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.AnimateAsStateKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, t, highResolutionOutputSizeshNQ4ISI, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRanges = androidx.compose.animation.core.AnimateAsStateKt.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
            if (highSpeedVideoFpsRanges != null) {
                highSpeedVideoFpsRanges.invoke(this.Camera2StreamConfigurationMap.getValue());
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T t, androidx.compose.animation.core.Animatable<T, V> animatable, androidx.compose.runtime.State<? extends androidx.compose.animation.core.AnimationSpec<T>> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super T, kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.Camera2StreamConfigurationMap = animatable;
            this.getHighSpeedVideoSizes = state;
            this.getHighSpeedVideoFpsRangesFor = state2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        animateAsStateKt$animateValueAsState$3$1.getInputFormats = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimateAsStateKt$animateValueAsState$3$1(kotlinx.coroutines.channels.Channel<T> channel, androidx.compose.animation.core.Animatable<T, V> animatable, androidx.compose.runtime.State<? extends androidx.compose.animation.core.AnimationSpec<T>> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super T, kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = channel;
        this.getHighSpeedVideoSizes = animatable;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.Camera2StreamConfigurationMap = state2;
    }
}
