package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 193}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class InfiniteTransition$run$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.InfiniteTransition getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new androidx.compose.animation.core.InfiniteTransition$run$1$1$$ExternalSyntheticLambda1(r4)), new androidx.compose.animation.core.InfiniteTransition$run$1$1.AnonymousClass3(null), r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        if (androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new androidx.compose.animation.core.InfiniteTransition$run$1$1$$ExternalSyntheticLambda0(r5, r6, r1, r4), r7) != r0) goto L13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007c -> B:6:0x003f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005c -> B:6:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.CoroutineScope coroutineScope;
        final kotlin.jvm.internal.Ref.FloatRef floatRef;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
            floatRef = new kotlin.jvm.internal.Ref.FloatRef();
            floatRef.element = 1.0f;
        } else if (i == 1) {
            floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.Camera2StreamConfigurationMap;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            if (floatRef.element == 0.0f) {
                this.getHighSpeedVideoFpsRanges = coroutineScope;
                this.Camera2StreamConfigurationMap = floatRef;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.Camera2StreamConfigurationMap;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> mutableState = this.getHighSpeedVideoSizes;
        final androidx.compose.animation.core.InfiniteTransition infiniteTransition = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.Camera2StreamConfigurationMap = floatRef;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState, androidx.compose.animation.core.InfiniteTransition infiniteTransition, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlinx.coroutines.CoroutineScope coroutineScope, long j) {
        long j2;
        androidx.compose.runtime.collection.MutableVector mutableVector;
        long j3;
        androidx.compose.runtime.collection.MutableVector mutableVector2;
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) mutableState.getValue();
        long longValue = state != null ? ((java.lang.Number) state.getValue()).longValue() : j;
        j2 = infiniteTransition.getHighSpeedVideoFpsRangesFor;
        if (j2 == Long.MIN_VALUE || floatRef.element != androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext())) {
            infiniteTransition.getHighSpeedVideoFpsRangesFor = j;
            mutableVector = infiniteTransition.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object[] objArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                ((androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) objArr[i]).reset$animation_core();
            }
            floatRef.element = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
        }
        if (floatRef.element == 0.0f) {
            mutableVector2 = infiniteTransition.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object[] objArr2 = mutableVector2.content;
            int size2 = mutableVector2.getSize();
            for (int i2 = 0; i2 < size2; i2++) {
                ((androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState) objArr2[i2]).skipToEnd$animation_core();
            }
        } else {
            j3 = infiniteTransition.getHighSpeedVideoFpsRangesFor;
            infiniteTransition.getHighResolutionOutputSizeshNQ4ISI((long) ((longValue - j3) / floatRef.element));
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ float getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRangesFor > 0.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Float f, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return getHighSpeedVideoFpsRangesFor(f.floatValue(), continuation);
        }

        private java.lang.Object getHighSpeedVideoFpsRangesFor(float f, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.compose.animation.core.InfiniteTransition$run$1$1.AnonymousClass3) create(java.lang.Float.valueOf(f), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.animation.core.InfiniteTransition$run$1$1.AnonymousClass3 anonymousClass3 = new androidx.compose.animation.core.InfiniteTransition$run$1$1.AnonymousClass3(continuation);
            anonymousClass3.getHighSpeedVideoFpsRangesFor = ((java.lang.Number) obj).floatValue();
            return anonymousClass3;
        }

        AnonymousClass3(kotlin.coroutines.Continuation<? super androidx.compose.animation.core.InfiniteTransition$run$1$1.AnonymousClass3> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope coroutineScope) {
        return androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.core.InfiniteTransition$run$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.animation.core.InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new androidx.compose.animation.core.InfiniteTransition$run$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        infiniteTransition$run$1$1.getHighSpeedVideoFpsRanges = obj;
        return infiniteTransition$run$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1$1(androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> mutableState, androidx.compose.animation.core.InfiniteTransition infiniteTransition, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.InfiniteTransition$run$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRangesFor = infiniteTransition;
    }
}
