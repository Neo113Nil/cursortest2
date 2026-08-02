package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, 310, com.visa.cbp.getCertUsage.setODAData}, m = "invokeSuspend", n = {"$this$userScroll", "requiredAnimation", "$this$userScroll", "requiredAnimation", "durationMillis", "$this$userScroll", "requiredAnimation"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.NestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ float getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.MouseWheelScrollingLogic getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x012c, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019e  */
    /* JADX WARN: Type inference failed for: r6v15, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0130 -> B:10:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x015b -> B:7:0x015d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        int i;
        androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        java.lang.Object highSpeedVideoSizes;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef3;
        androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope3;
        java.lang.Object highSpeedVideoSizes2;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputMinFrameDuration;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nestedScrollScope = (androidx.compose.foundation.gestures.NestedScrollScope) this.getOutputSizeshNQ4ISI;
            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            booleanRef.element = true;
            nestedScrollScope2 = nestedScrollScope;
            booleanRef2 = booleanRef;
            if (booleanRef2.element) {
            }
        } else if (i2 == 1) {
            kotlin.jvm.internal.Ref.BooleanRef booleanRef4 = (kotlin.jvm.internal.Ref.BooleanRef) this.getInputFormats;
            kotlin.jvm.internal.Ref.BooleanRef booleanRef5 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoSizesFor;
            nestedScrollScope3 = (androidx.compose.foundation.gestures.NestedScrollScope) this.getOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            booleanRef3 = booleanRef5;
            booleanRef4.element = ((java.lang.Boolean) obj).booleanValue();
            nestedScrollScope = nestedScrollScope3;
            booleanRef = booleanRef3;
            nestedScrollScope2 = nestedScrollScope;
            booleanRef2 = booleanRef;
            if (booleanRef2.element) {
            }
        } else if (i2 == 2) {
            int i3 = this.getOutputFormats;
            kotlin.jvm.internal.Ref.BooleanRef booleanRef6 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoSizesFor;
            androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope4 = (androidx.compose.foundation.gestures.NestedScrollScope) this.getOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            i = i3;
            booleanRef2 = booleanRef6;
            nestedScrollScope2 = nestedScrollScope4;
            if (!booleanRef2.element) {
                this.getOutputSizeshNQ4ISI = nestedScrollScope2;
                this.getHighSpeedVideoSizesFor = booleanRef2;
                this.getInputFormats = booleanRef2;
                this.getOutputMinFrameDuration = 3;
                highSpeedVideoSizes = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.getHighSpeedVideoSizes(this.getOutputStallDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, 50 - i, this);
                if (highSpeedVideoSizes != coroutine_suspended) {
                    booleanRef3 = booleanRef2;
                    nestedScrollScope3 = nestedScrollScope2;
                    booleanRef2.element = ((java.lang.Boolean) highSpeedVideoSizes).booleanValue();
                    nestedScrollScope = nestedScrollScope3;
                    booleanRef = booleanRef3;
                    nestedScrollScope2 = nestedScrollScope;
                    booleanRef2 = booleanRef;
                }
                return coroutine_suspended;
            }
            if (booleanRef2.element) {
            }
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.getInputFormats;
            kotlin.jvm.internal.Ref.BooleanRef booleanRef7 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoSizesFor;
            nestedScrollScope3 = (androidx.compose.foundation.gestures.NestedScrollScope) this.getOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            booleanRef3 = booleanRef7;
            highSpeedVideoSizes = obj;
            booleanRef2.element = ((java.lang.Boolean) highSpeedVideoSizes).booleanValue();
            nestedScrollScope = nestedScrollScope3;
            booleanRef = booleanRef3;
            nestedScrollScope2 = nestedScrollScope;
            booleanRef2 = booleanRef;
            if (booleanRef2.element) {
                booleanRef2.element = false;
                float floatValue = this.getHighSpeedVideoFpsRanges.element - this.getHighResolutionOutputSizeshNQ4ISI.element.getValue().floatValue();
                if (this.getHighSpeedVideoFpsRangesFor.element.getGetHighSpeedVideoFpsRangesFor() || java.lang.Math.abs(floatValue) < this.getInputSizeshNQ4ISI) {
                    this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(nestedScrollScope2, floatValue);
                    this.getOutputSizeshNQ4ISI = nestedScrollScope2;
                    this.getHighSpeedVideoSizesFor = booleanRef2;
                    this.getInputFormats = booleanRef2;
                    this.getOutputMinFrameDuration = 1;
                    highSpeedVideoSizes2 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.getHighSpeedVideoSizes(this.getOutputStallDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, 50L, this);
                    if (highSpeedVideoSizes2 != coroutine_suspended) {
                        booleanRef3 = booleanRef2;
                        nestedScrollScope3 = nestedScrollScope2;
                        booleanRef2.element = ((java.lang.Boolean) highSpeedVideoSizes2).booleanValue();
                        nestedScrollScope = nestedScrollScope3;
                        booleanRef = booleanRef3;
                        nestedScrollScope2 = nestedScrollScope;
                        booleanRef2 = booleanRef;
                        if (booleanRef2.element) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } else {
                    float signum = java.lang.Math.signum(floatValue) * this.getInputSizeshNQ4ISI;
                    this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(nestedScrollScope2, signum);
                    kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> objectRef = this.getHighResolutionOutputSizeshNQ4ISI;
                    objectRef.element = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) objectRef.element, this.getHighResolutionOutputSizeshNQ4ISI.element.getValue().floatValue() + signum, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                    i = kotlin.ranges.RangesKt.coerceAtMost(kotlin.math.MathKt.roundToInt(java.lang.Math.abs(this.getHighSpeedVideoFpsRanges.element - this.getHighResolutionOutputSizeshNQ4ISI.element.getValue().floatValue()) / this.Camera2StreamConfigurationMap), 100);
                    androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic = this.getOutputStallDuration;
                    androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState = this.getHighResolutionOutputSizeshNQ4ISI.element;
                    float f = this.getHighSpeedVideoFpsRanges.element;
                    final androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic2 = this.getOutputStallDuration;
                    final kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> objectRef2 = this.getHighSpeedVideoFpsRangesFor;
                    final kotlin.jvm.internal.Ref.FloatRef floatRef = this.getHighSpeedVideoFpsRanges;
                    final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = this.getHighSpeedVideoSizes;
                    final kotlin.jvm.internal.Ref.BooleanRef booleanRef8 = booleanRef2;
                    this.getOutputSizeshNQ4ISI = nestedScrollScope2;
                    this.getHighSpeedVideoSizesFor = booleanRef2;
                    this.getInputFormats = null;
                    this.getOutputFormats = i;
                    this.getOutputMinFrameDuration = 2;
                    highSpeedVideoFpsRangesFor = mouseWheelScrollingLogic.getHighSpeedVideoFpsRangesFor(nestedScrollScope2, animationState, f, i, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            boolean highSpeedVideoFpsRanges;
                            highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this, objectRef2, floatRef, scrollingLogic, booleanRef8, ((java.lang.Float) obj2).floatValue());
                            return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
                        }
                    }, this);
                }
                return coroutine_suspended;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.jvm.internal.Ref.BooleanRef booleanRef, float f) {
        kotlinx.coroutines.channels.Channel channel;
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta highResolutionOutputSizeshNQ4ISI;
        float m1537toFloatk4lQ0M;
        boolean Camera2StreamConfigurationMap;
        channel = mouseWheelScrollingLogic.getHighSpeedVideoFpsRangesFor;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.getHighResolutionOutputSizeshNQ4ISI((kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta>) channel);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            mouseWheelScrollingLogic.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
            objectRef.element = ((androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) objectRef.element).getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI);
            if (androidx.compose.foundation.ComposeFoundationFlags.isMouseWheel1DAxisLockingEnabled) {
                m1537toFloatk4lQ0M = scrollingLogic.m1539toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m1535reverseIfNeededMKHz9U(((androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) objectRef.element).getGetHighSpeedVideoSizes()));
            } else {
                m1537toFloatk4lQ0M = scrollingLogic.m1537toFloatk4lQ0M(scrollingLogic.m1535reverseIfNeededMKHz9U(((androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) objectRef.element).getGetHighSpeedVideoSizes()));
            }
            floatRef.element = m1537toFloatk4lQ0M;
            Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.MouseWheelScrollableKt.Camera2StreamConfigurationMap(floatRef.element - f);
            booleanRef.element = !Camera2StreamConfigurationMap;
        }
        return highResolutionOutputSizeshNQ4ISI != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create(nestedScrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getOutputStallDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.getOutputSizeshNQ4ISI = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> objectRef, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> objectRef2, float f, androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, float f2, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = floatRef;
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
        this.getHighSpeedVideoFpsRangesFor = objectRef2;
        this.getInputSizeshNQ4ISI = f;
        this.getOutputStallDuration = mouseWheelScrollingLogic;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighSpeedVideoSizes = scrollingLogic;
    }
}
