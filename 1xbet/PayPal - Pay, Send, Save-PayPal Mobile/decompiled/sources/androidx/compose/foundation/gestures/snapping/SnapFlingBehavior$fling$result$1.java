package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {134, 150}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class SnapFlingBehavior$fling$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollScope getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r2 != r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec;
        androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider;
        final kotlin.jvm.internal.Ref.FloatRef floatRef;
        java.lang.Object highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider2;
        androidx.compose.animation.core.AnimationSpec animationSpec;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            decayAnimationSpec = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            float calculateTargetValue = androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, this.getHighSpeedVideoFpsRangesFor);
            snapLayoutInfoProvider = this.getOutputFormats.getHighSpeedVideoSizes;
            float calculateApproachOffset = snapLayoutInfoProvider.calculateApproachOffset(this.getHighSpeedVideoFpsRangesFor, calculateTargetValue);
            if (java.lang.Float.isNaN(calculateApproachOffset)) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            floatRef = new kotlin.jvm.internal.Ref.FloatRef();
            floatRef.element = java.lang.Math.abs(calculateApproachOffset) * java.lang.Math.signum(this.getHighSpeedVideoFpsRangesFor);
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element));
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior = this.getOutputFormats;
            androidx.compose.foundation.gestures.ScrollScope scrollScope = this.getHighSpeedVideoFpsRanges;
            float f = floatRef.element;
            float f2 = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = floatRef;
            this.Camera2StreamConfigurationMap = 1;
            highSpeedVideoFpsRangesFor = snapFlingBehavior.getHighSpeedVideoFpsRangesFor(scrollScope, f, f2, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor2;
                    highSpeedVideoFpsRangesFor2 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef.this, function1, ((java.lang.Float) obj2).floatValue());
                    return highSpeedVideoFpsRangesFor2;
                }
            }, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.jvm.internal.Ref.FloatRef floatRef2 = (kotlin.jvm.internal.Ref.FloatRef) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            floatRef = floatRef2;
            highSpeedVideoFpsRangesFor = obj;
        }
        androidx.compose.animation.core.AnimationState animationState = (androidx.compose.animation.core.AnimationState) highSpeedVideoFpsRangesFor;
        snapLayoutInfoProvider2 = this.getOutputFormats.getHighSpeedVideoSizes;
        float calculateSnapOffset = snapLayoutInfoProvider2.calculateSnapOffset(((java.lang.Number) animationState.getVelocity()).floatValue());
        if (java.lang.Float.isNaN(calculateSnapOffset)) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        floatRef.element = calculateSnapOffset;
        androidx.compose.foundation.gestures.ScrollScope scrollScope2 = this.getHighSpeedVideoFpsRanges;
        float f3 = floatRef.element;
        float f4 = floatRef.element;
        androidx.compose.animation.core.AnimationState copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
        animationSpec = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = 2;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getHighResolutionOutputSizeshNQ4ISI(scrollScope2, f3, f4, copy$default, animationSpec, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef.this, function12, ((java.lang.Float) obj2).floatValue());
                return Camera2StreamConfigurationMap;
            }
        }, this);
        return highResolutionOutputSizeshNQ4ISI == coroutine_suspended ? coroutine_suspended : highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.functions.Function1 function1, float f) {
        floatRef.element -= f;
        function1.invoke(java.lang.Float.valueOf(floatRef.element));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.functions.Function1 function1, float f) {
        floatRef.element -= f;
        function1.invoke(java.lang.Float.valueOf(floatRef.element));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        return ((androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapFlingBehavior$fling$result$1(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, float f, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = snapFlingBehavior;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = scrollScope;
    }
}
