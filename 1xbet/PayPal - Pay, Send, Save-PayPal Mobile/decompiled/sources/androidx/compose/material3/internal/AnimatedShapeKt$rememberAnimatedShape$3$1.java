package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1", f = "AnimatedShape.kt", i = {0}, l = {140}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class AnimatedShapeKt$rememberAnimatedShape$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.internal.AnimatedShapeState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.compose.foundation.shape.RoundedCornerShape> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:5:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator<androidx.compose.foundation.shape.RoundedCornerShape> it;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            it = this.getHighSpeedVideoFpsRanges.iterator();
            coroutineScope = coroutineScope2;
            this.getHighSpeedVideoSizes = coroutineScope;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.Camera2StreamConfigurationMap = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoFpsRangesFor;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope32 = coroutineScope;
            if (((java.lang.Boolean) obj).booleanValue()) {
                androidx.compose.foundation.shape.RoundedCornerShape next = it.next();
                androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape = (androidx.compose.foundation.shape.RoundedCornerShape) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk());
                if (roundedCornerShape != null) {
                    next = roundedCornerShape;
                }
                coroutineScope = coroutineScope32;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, next, null), 3, null);
                this.getHighSpeedVideoSizes = coroutineScope;
                this.getHighSpeedVideoFpsRangesFor = it;
                this.Camera2StreamConfigurationMap = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlinx.coroutines.CoroutineScope coroutineScope322 = coroutineScope;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1", f = "AnimatedShape.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.foundation.shape.RoundedCornerShape getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.material3.internal.AnimatedShapeState getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (this.getHighSpeedVideoSizes.animateToShape(this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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
            return ((androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material3.internal.AnimatedShapeState animatedShapeState, androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = animatedShapeState;
            this.getHighResolutionOutputSizeshNQ4ISI = roundedCornerShape;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1 animatedShapeKt$rememberAnimatedShape$3$1 = new androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        animatedShapeKt$rememberAnimatedShape$3$1.getHighSpeedVideoSizes = obj;
        return animatedShapeKt$rememberAnimatedShape$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedShapeKt$rememberAnimatedShape$3$1(kotlinx.coroutines.channels.Channel<androidx.compose.foundation.shape.RoundedCornerShape> channel, androidx.compose.material3.internal.AnimatedShapeState animatedShapeState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = channel;
        this.getHighResolutionOutputSizeshNQ4ISI = animatedShapeState;
    }
}
