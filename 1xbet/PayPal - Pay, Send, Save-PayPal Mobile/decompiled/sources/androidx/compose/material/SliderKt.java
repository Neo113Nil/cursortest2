package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001aj\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u00182\u0014\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f0\u0018H\u0002\u001a\u007f\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u001b\u001aK\u0010\u001c\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010!\u001ak\u0010\"\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010)\u001aC\u0010*\u001a\u00020\u0001*\u00020+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0003¢\u0006\u0004\b/\u00100\u001aS\u00101\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00104\u001a.\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0002\u001a2\u00109\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u0003\u0018\u00010:*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0082@¢\u0006\u0004\bA\u0010B\u001a\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a0\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003H\u0002\u001a<\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00032\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010H\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u0003H\u0002\u001a \u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003H\u0002\u001aS\u0010O\u001a\u00020\u00012\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030S2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010T\u001a\\\u0010U\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001aj\u0010V\u001a\u00020\u0007*\u00020\u00072\u0006\u0010W\u001a\u00020X2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0018\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00050\u00182\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030S2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a.\u0010\\\u001a\u00020\u00012\u0006\u0010W\u001a\u00020X2\u0006\u00106\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010_\u001a\u0098\u0001\u0010`\u001a\u00020\u0007*\u00020\u00072\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00108\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00050\u00182\u001e\u0010c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010d0\u0018H\u0002\"\u0016\u0010e\u001a\u00020-X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bf\u0010g\"\u0010\u0010i\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0010\u0010j\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0010\u0010k\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0016\u0010l\u001a\u00020-X\u0080\u0004¢\u0006\n\n\u0002\u0010h\u001a\u0004\bm\u0010g\"\u0010\u0010n\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u0010\u0010o\u001a\u00020-X\u0082\u0004¢\u0006\u0004\n\u0002\u0010h\"\u000e\u0010p\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Slider", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SliderColors;", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "slideOnKeyEvents", "isRtl", "onValueChangeState", "Landroidx/compose/runtime/State;", "onValueChangeFinishedState", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "tickFractions", "", "width", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", "offset", "Landroidx/compose/ui/unit/Dp;", "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "snapValueToTick", "current", "minPx", "maxPx", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stepsToTickFractions", "scale", "a1", "b1", "x1", "a2", "b2", "x", "calcFraction", "a", util.h.xy.cb.b.f1091, "pos", "CorrectValueSideEffect", "scaleToOffset", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "sliderTapModifier", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "rawOffset", "gestureEndAction", "pressOffset", "animateToTarget", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "rawOffsetEnd", "onDrag", "Lkotlin/Function2;", "ThumbRadius", "getThumbRadius", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SliderKt {
    private static final float Camera2StreamConfigurationMap;
    private static final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI;
    private static final androidx.compose.animation.core.TweenSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
    private static final float getHighSpeedVideoFpsRangesFor;
    private static final float getOutputMinFrameDuration = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);
    private static final float getHighSpeedVideoSizesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f);
    private static final float getInputFormats = androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f);
    private static final float getOutputFormats = androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: access$awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object m2737access$awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, kotlin.coroutines.Continuation continuation) {
        androidx.compose.material.SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        if (continuation instanceof androidx.compose.material.SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (androidx.compose.material.SliderKt$awaitSlop$1) continuation;
            if ((sliderKt$awaitSlop$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                androidx.compose.material.SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                java.lang.Object obj = sliderKt$awaitSlop$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sliderKt$awaitSlop$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return androidx.compose.material.SliderKt.$r8$lambda$njpnG27SKQaKrYVLGIl04kwmCPQ(kotlin.jvm.internal.Ref.FloatRef.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2, ((java.lang.Float) obj3).floatValue());
                        }
                    };
                    sliderKt$awaitSlop$12.Camera2StreamConfigurationMap = floatRef2;
                    sliderKt$awaitSlop$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    java.lang.Object m2601awaitHorizontalPointerSlopOrCancellationgDDlDlE = androidx.compose.material.DragGestureDetectorCopyKt.m2601awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
                    if (m2601awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m2601awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    floatRef = floatRef2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) sliderKt$awaitSlop$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                if (pointerInputChange == null) {
                    return kotlin.TuplesKt.to(pointerInputChange, kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element));
                }
                return null;
            }
        }
        sliderKt$awaitSlop$1 = new androidx.compose.material.SliderKt$awaitSlop$1(continuation);
        androidx.compose.material.SliderKt$awaitSlop$1 sliderKt$awaitSlop$122 = sliderKt$awaitSlop$1;
        java.lang.Object obj2 = sliderKt$awaitSlop$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sliderKt$awaitSlop$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj2;
        if (pointerInputChange == null) {
        }
    }

    private static final float getHighSpeedVideoSizes(float f, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f4 == 0.0f ? 0.0f : (f3 - f) / f4;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, int i, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.SliderColors sliderColors, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        int i9;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final boolean z3;
        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3;
        final int i10;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        final androidx.compose.material.SliderColors sliderColors2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        int i11;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        int i12;
        androidx.compose.material.SliderColors sliderColors3;
        int i13;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4;
        int i14;
        int i15;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1962335196);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i15 = 16384;
                            i4 |= i15;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i15 = 8192;
                    i4 |= i15;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(sliderColors)) {
                            i14 = 67108864;
                            i4 |= i14;
                        }
                        i14 = 33554432;
                        i4 |= i14;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            companion = modifier;
                            sliderColors3 = sliderColors;
                            i13 = i4;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i11 = i7;
                            i12 = 131072;
                            function03 = function0;
                            mutableInteractionSource3 = mutableInteractionSource;
                        } else {
                            companion = i16 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRange3 = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                            }
                            i11 = i6 != 0 ? 0 : i7;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i8 != 0 ? null : function0;
                            mutableInteractionSource3 = i9 == 0 ? mutableInteractionSource : null;
                            if ((i3 & 256) != 0) {
                                i12 = 131072;
                                i4 &= -234881025;
                                sliderColors3 = androidx.compose.material.SliderDefaults.INSTANCE.m2724colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                            } else {
                                i12 = 131072;
                                sliderColors3 = sliderColors;
                            }
                            i13 = i4;
                            function03 = function04;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1962335196, i13, -1, "androidx.compose.material.Slider (Slider.kt:164)");
                        }
                        if (mutableInteractionSource3 == null) {
                            startRestartGroup.startReplaceGroup(-1127489737);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource4 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                        } else {
                            startRestartGroup.startReplaceGroup(-313465952);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        if (i11 < 0) {
                            throw new java.lang.IllegalArgumentException("steps should be >= 0".toString());
                        }
                        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i13 >> 3) & 14);
                        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function03, startRestartGroup, (i13 >> 18) & 14);
                        boolean z4 = (i13 & 458752) == i12;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = getHighSpeedVideoFpsRanges(i11);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final java.util.List list = (java.util.List) rememberedValue2;
                        androidx.compose.ui.Modifier minimumInteractiveComponentSize = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion);
                        float f2 = getOutputMinFrameDuration * 2.0f;
                        androidx.compose.ui.Modifier focusable = androidx.compose.foundation.FocusableKt.focusable(getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.SizeKt.m1736requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, androidx.compose.ui.unit.Dp.m8601constructorimpl(f2), androidx.compose.ui.unit.Dp.m8601constructorimpl(f2), 0.0f, 0.0f, 12, null), f, z2, function1, function03, closedFloatingPointRange3, i11), z2, mutableInteractionSource4);
                        androidx.compose.ui.Modifier modifier3 = companion;
                        boolean z5 = startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl;
                        if (i11 >= 0) {
                            final boolean z6 = z2;
                            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange4 = closedFloatingPointRange3;
                            final int i17 = i11;
                            final boolean z7 = z5;
                            final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange5 = closedFloatingPointRange3;
                            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function03;
                            final boolean z8 = z2;
                            final androidx.compose.material.SliderColors sliderColors4 = sliderColors3;
                            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(androidx.compose.ui.input.key.KeyInputModifierKt.onKeyEvent(focusable, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.material.SliderKt$slideOnKeyEvents$2
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                                    android.view.KeyEvent m7078unboximpl = keyEvent.m7078unboximpl();
                                    if (!z6) {
                                        return java.lang.Boolean.FALSE;
                                    }
                                    int m7090getTypeZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(m7078unboximpl);
                                    boolean z9 = false;
                                    if (androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(m7090getTypeZmokQxo, androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY())) {
                                        float abs = java.lang.Math.abs(closedFloatingPointRange4.getEndInclusive().floatValue() - closedFloatingPointRange4.getStart().floatValue());
                                        int i18 = i17;
                                        float f3 = abs / (i18 > 0 ? i18 + 1 : 100);
                                        long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(m7078unboximpl);
                                        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ())) {
                                            rememberUpdatedState.getValue().invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f + f3), closedFloatingPointRange4));
                                        } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ())) {
                                            rememberUpdatedState.getValue().invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f - f3), closedFloatingPointRange4));
                                        } else {
                                            if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6858getDirectionRightEK5gGoQ())) {
                                                rememberUpdatedState.getValue().invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f + ((z7 ? -1 : 1) * f3)), closedFloatingPointRange4));
                                            } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6857getDirectionLeftEK5gGoQ())) {
                                                rememberUpdatedState.getValue().invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f - ((z7 ? -1 : 1) * f3)), closedFloatingPointRange4));
                                            } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6933getMoveHomeEK5gGoQ())) {
                                                rememberUpdatedState.getValue().invoke(closedFloatingPointRange4.getStart());
                                            } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6932getMoveEndEK5gGoQ())) {
                                                rememberUpdatedState.getValue().invoke(closedFloatingPointRange4.getEndInclusive());
                                            } else if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ())) {
                                                rememberUpdatedState.getValue().invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f - (kotlin.ranges.RangesKt.coerceIn(r1 / 10, 1, 10) * f3)), closedFloatingPointRange4));
                                            } else {
                                                if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo, androidx.compose.ui.input.key.Key.INSTANCE.m6969getPageDownEK5gGoQ())) {
                                                    rememberUpdatedState.getValue().invoke(kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f + (kotlin.ranges.RangesKt.coerceIn(r1 / 10, 1, 10) * f3)), closedFloatingPointRange4));
                                                }
                                                return java.lang.Boolean.valueOf(z9);
                                            }
                                        }
                                        z9 = true;
                                        return java.lang.Boolean.valueOf(z9);
                                    }
                                    if (androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(m7090getTypeZmokQxo, androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7087getKeyUpCS__XNY())) {
                                        long m7089getKeyZmokQxo2 = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(m7078unboximpl);
                                        if (androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6858getDirectionRightEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6857getDirectionLeftEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6933getMoveHomeEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6932getMoveEndEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(m7089getKeyZmokQxo2, androidx.compose.ui.input.key.Key.INSTANCE.m6969getPageDownEK5gGoQ())) {
                                            kotlin.jvm.functions.Function0<kotlin.Unit> value = rememberUpdatedState2.getValue();
                                            if (value != null) {
                                                value.invoke();
                                            }
                                            z9 = true;
                                        }
                                    }
                                    return java.lang.Boolean.valueOf(z9);
                                }
                            }), null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2085116814, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return androidx.compose.material.SliderKt.$r8$lambda$ijKyOQN_Yxj1CyUUoULwY41L1wI(kotlin.ranges.ClosedFloatingPointRange.this, f, list, function05, mutableInteractionSource5, z8, sliderColors4, rememberUpdatedState, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            int i18 = i11;
                            function02 = function03;
                            z3 = z2;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            sliderColors2 = sliderColors3;
                            i10 = i18;
                        } else {
                            throw new java.lang.IllegalArgumentException("steps should be >= 0".toString());
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        function02 = function0;
                        z3 = z2;
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        i10 = i7;
                        mutableInteractionSource2 = mutableInteractionSource;
                        sliderColors2 = sliderColors;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.SliderKt.$r8$lambda$O2Um5sOsRGSxRVqByKXUryl1wFc(f, function1, modifier2, z3, closedFloatingPointRange3, i10, function02, mutableInteractionSource2, sliderColors2, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, float f) {
        return androidx.compose.ui.util.MathHelpersKt.lerp(floatRef.element, floatRef2.element, getHighSpeedVideoSizes(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, final kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2, int i, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.material.SliderColors sliderColors, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        boolean z2;
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3;
        int i6;
        int i7;
        int i8;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange4;
        final int i9;
        final androidx.compose.material.SliderColors sliderColors2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange5;
        int i10;
        androidx.compose.material.SliderColors sliderColors3;
        androidx.compose.material.SliderColors sliderColors4;
        int i11;
        int i12;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1556183027);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        if (startRestartGroup.changed(closedFloatingPointRange3)) {
                            i12 = 16384;
                            i4 |= i12;
                        }
                    } else {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                    }
                    i12 = 8192;
                    i4 |= i12;
                } else {
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                            i11 = 8388608;
                            i4 |= i11;
                        }
                        i11 = 4194304;
                        i4 |= i11;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i13 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                closedFloatingPointRange5 = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
                                i4 &= -57345;
                            } else {
                                closedFloatingPointRange5 = closedFloatingPointRange3;
                            }
                            i10 = i6 != 0 ? 0 : i7;
                            function02 = i8 != 0 ? null : function0;
                            if ((i3 & 128) != 0) {
                                sliderColors3 = androidx.compose.material.SliderDefaults.INSTANCE.m2724colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                                i4 = (-29360129) & i4;
                            } else {
                                sliderColors3 = sliderColors;
                            }
                            sliderColors4 = sliderColors3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            function02 = function0;
                            sliderColors4 = sliderColors;
                            closedFloatingPointRange5 = closedFloatingPointRange3;
                            i10 = i7;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1556183027, i4, -1, "androidx.compose.material.RangeSlider (Slider.kt:404)");
                        }
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
                        if (i10 < 0) {
                            throw new java.lang.IllegalArgumentException("steps should be >= 0".toString());
                        }
                        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i4 >> 3) & 14);
                        boolean z4 = (i4 & 458752) == 131072;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = getHighSpeedVideoFpsRanges(i10);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        final java.util.List list = (java.util.List) rememberedValue3;
                        androidx.compose.ui.Modifier minimumInteractiveComponentSize = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                        float f = getOutputMinFrameDuration;
                        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange6 = closedFloatingPointRange5;
                        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange7 = closedFloatingPointRange5;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
                        final boolean z5 = z2;
                        final int i14 = i10;
                        final androidx.compose.material.SliderColors sliderColors5 = sliderColors4;
                        androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(androidx.compose.foundation.layout.SizeKt.m1736requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f * f), androidx.compose.ui.unit.Dp.m8601constructorimpl(f * 2.0f), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(652589923, true, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return androidx.compose.material.SliderKt.$r8$lambda$EwuyqqgBOGUbVIy1ImtRv2m1u9o(kotlin.ranges.ClosedFloatingPointRange.this, closedFloatingPointRange, list, function03, rememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z5, i14, sliderColors5, (androidx.compose.foundation.layout.BoxWithConstraintsScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z3 = z2;
                        sliderColors2 = sliderColors4;
                        modifier3 = modifier2;
                        i9 = i10;
                        closedFloatingPointRange4 = closedFloatingPointRange7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function02 = function0;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRange4 = closedFloatingPointRange3;
                        i9 = i7;
                        sliderColors2 = sliderColors;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material.SliderKt.m2732$r8$lambda$W8ICLEsnJeldQH2PIygEVtkMZE(kotlin.ranges.ClosedFloatingPointRange.this, function1, modifier3, z3, closedFloatingPointRange4, i9, function02, sliderColors2, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 4793491) == 4793490, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2) {
        return getHighResolutionOutputSizeshNQ4ISI(floatRef.element, floatRef2.element, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRanges(kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, float f) {
        return androidx.compose.ui.util.MathHelpersKt.lerp(floatRef.element, floatRef2.element, getHighSpeedVideoSizes(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f));
    }

    private static final void getHighSpeedVideoFpsRangesFor(final boolean z, final float f, final java.util.List<java.lang.Float> list, final androidx.compose.material.SliderColors sliderColors, final float f2, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1679682785);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1679682785, i3, -1, "androidx.compose.material.SliderImpl (Slider.kt:683)");
            }
            androidx.compose.ui.Modifier then = modifier.then(getHighResolutionOutputSizeshNQ4ISI);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, then);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(getOutputFormats);
            float f3 = getOutputMinFrameDuration;
            float mo1418toPx0680j_42 = density.mo1418toPx0680j_4(f3);
            float mo1414toDpu2uoSUM = density.mo1414toDpu2uoSUM(f2);
            float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(f3 * 2.0f);
            float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(mo1414toDpu2uoSUM * f);
            int i4 = i3 >> 6;
            int i5 = i3 << 9;
            getHighSpeedVideoSizes(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, mo1418toPx0680j_42, mo1418toPx0680j_4, startRestartGroup, (i4 & 112) | 3078 | ((i3 << 6) & 896) | (i5 & 57344) | (i5 & 458752));
            getHighSpeedVideoSizes(boxScopeInstance, androidx.compose.ui.Modifier.INSTANCE, m8601constructorimpl2, mutableInteractionSource, sliderColors, z, m8601constructorimpl, startRestartGroup, (i4 & 7168) | 1572918 | ((i3 << 3) & 57344) | ((i3 << 15) & 458752));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.SliderKt.$r8$lambda$HG0M6Dmfbwz0yyrxwoHjVTzNJg0(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final boolean z, final float f, final float f2, final java.util.List<java.lang.Float> list, final androidx.compose.material.SliderColors sliderColors, final float f3, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, final androidx.compose.ui.Modifier modifier, final androidx.compose.ui.Modifier modifier2, final androidx.compose.ui.Modifier modifier3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-278895713);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(modifier2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(modifier3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-278895713, i3, i4, "androidx.compose.material.RangeSliderImpl (Slider.kt:724)");
            }
            final java.lang.String m2763getString4foXLRw = androidx.compose.material.Strings_androidKt.m2763getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m2761getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
            final java.lang.String m2763getString4foXLRw2 = androidx.compose.material.Strings_androidKt.m2763getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m2760getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
            androidx.compose.ui.Modifier then = modifier.then(getHighResolutionOutputSizeshNQ4ISI);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, then);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(getOutputFormats);
            float f4 = getOutputMinFrameDuration;
            float mo1418toPx0680j_42 = density.mo1418toPx0680j_4(f4);
            float mo1414toDpu2uoSUM = density.mo1414toDpu2uoSUM(f3);
            float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(f4 * 2.0f);
            float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(mo1414toDpu2uoSUM * f);
            float m8601constructorimpl3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(mo1414toDpu2uoSUM * f2);
            int i5 = i3 >> 9;
            int i6 = i3 << 6;
            int i7 = i3;
            getHighSpeedVideoSizes(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, list, mo1418toPx0680j_42, mo1418toPx0680j_4, startRestartGroup, (i6 & 458752) | (i6 & 7168) | (i6 & 896) | (i5 & 112) | (i6 & 57344));
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            composer2 = startRestartGroup;
            boolean changed = composer2.changed(m2763getString4foXLRw);
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.SliderKt.m2731$r8$lambda$VZWM0xNiJa2OzuMepPashF1wrk(m2763getString4foXLRw, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            int i8 = i7 & 57344;
            int i9 = (i7 << 15) & 458752;
            getHighSpeedVideoSizes(boxScopeInstance, androidx.compose.foundation.FocusableKt.focusable(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, (kotlin.jvm.functions.Function1) rememberedValue), true, mutableInteractionSource).then(modifier2), m8601constructorimpl2, mutableInteractionSource, sliderColors, z, m8601constructorimpl, composer2, (i5 & 7168) | 1572870 | i8 | i9);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed2 = composer2.changed(m2763getString4foXLRw2);
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.SliderKt.m2729$r8$lambda$GPuJlw0GATeyOI9OIIt6pDwpG4(m2763getString4foXLRw2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            getHighSpeedVideoSizes(boxScopeInstance, androidx.compose.foundation.FocusableKt.focusable(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion2, true, (kotlin.jvm.functions.Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier3), m8601constructorimpl3, mutableInteractionSource2, sliderColors, z, m8601constructorimpl, composer2, ((i7 >> 12) & 7168) | 1572870 | i8 | i9);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.SliderKt.m2727$r8$lambda$BJNCsBJZKtzG8_LUkYfN1FkaE(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final androidx.compose.foundation.layout.BoxScope boxScope, final androidx.compose.ui.Modifier modifier, final float f, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.material.SliderColors sliderColors, final boolean z, final float f2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        float f3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(428907178);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(428907178, i2, -1, "androidx.compose.material.SliderThumb (Slider.kt:787)");
            }
            androidx.compose.ui.Modifier align = boxScope.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, align);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
            boolean z2 = (i2 & 7168) == 2048;
            androidx.compose.material.SliderKt$SliderThumb$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.compose.material.SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            int i3 = i2 >> 9;
            androidx.compose.runtime.EffectsKt.LaunchedEffect(mutableInteractionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3 & 14);
            if (!snapshotStateList.isEmpty()) {
                f3 = getInputFormats;
            } else {
                f3 = getHighSpeedVideoSizes;
            }
            androidx.compose.ui.Modifier hoverable$default = androidx.compose.foundation.HoverableKt.hoverable$default(androidx.compose.foundation.IndicationKt.indication(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, androidx.compose.material.RippleKt.m2713rippleH2RKhps$default(false, getHighSpeedVideoSizesFor, 0L, 4, null)), mutableInteractionSource, false, 2, null);
            if (!z) {
                f3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.BackgroundKt.m1285backgroundbw27NRU(androidx.compose.ui.draw.ShadowKt.m5613shadows4CzXII$default(hoverable$default, f3, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, startRestartGroup, ((i2 >> 15) & 14) | (i3 & 112)).getValue().m6006unboximpl(), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.SliderKt.$r8$lambda$39QXORyFdLEDbhkS3R6BAEq2z3M(androidx.compose.foundation.layout.BoxScope.this, modifier, f, mutableInteractionSource, sliderColors, z, f2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final androidx.compose.ui.Modifier modifier, final androidx.compose.material.SliderColors sliderColors, final boolean z, final float f, final float f2, final java.util.List<java.lang.Float> list, final float f3, final float f4, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1833126050);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i2 & 4793491) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1833126050, i2, -1, "androidx.compose.material.Track (Slider.kt:833)");
            }
            int i4 = ((i2 >> 6) & 14) | 48 | ((i2 << 3) & 896);
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor = sliderColors.trackColor(z, false, startRestartGroup, i4);
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor2 = sliderColors.trackColor(z, true, startRestartGroup, i4);
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> tickColor = sliderColors.tickColor(z, false, startRestartGroup, i4);
            final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> tickColor2 = sliderColors.tickColor(z, true, startRestartGroup, i4);
            boolean z2 = (i2 & 3670016) == 1048576;
            boolean changed = startRestartGroup.changed(trackColor);
            boolean z3 = (i2 & 29360128) == 8388608;
            boolean z4 = (57344 & i2) == 16384;
            int i5 = i2;
            boolean z5 = (i2 & 7168) == 2048;
            boolean changed2 = startRestartGroup.changed(trackColor2);
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean changed3 = startRestartGroup.changed(tickColor);
            boolean changed4 = startRestartGroup.changed(tickColor2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (((z3 | z2 | changed | z4 | z5 | changed2 | changedInstance | changed3) || changed4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                composer2 = startRestartGroup;
                java.lang.Object obj = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.compose.material.SliderKt.m2734$r8$lambda$_elkTKgWdC7CjX9VArdUXQNVas(f3, trackColor, f4, f2, f, trackColor2, list, tickColor, tickColor2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                    }
                };
                composer2.updateRememberedValue(obj);
                rememberedValue = obj;
            } else {
                composer2 = startRestartGroup;
                i3 = i5;
            }
            androidx.compose.foundation.CanvasKt.Canvas(modifier, (kotlin.jvm.functions.Function1) rememberedValue, composer2, i3 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material.SliderKt.m2735$r8$lambda$nwB73Ux0uz6X2nTkmnrOkQzDQA(androidx.compose.ui.Modifier.this, sliderColors, z, f, f2, list, f3, f4, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    private static final java.util.List<java.lang.Float> getHighSpeedVideoFpsRanges(int i) {
        if (i == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        int i2 = i + 2;
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Float.valueOf(i3 / (i + 1)));
        }
        return arrayList;
    }

    private static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI(float f, float f2, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, float f3, float f4) {
        return kotlin.ranges.RangesKt.rangeTo(androidx.compose.ui.util.MathHelpersKt.lerp(f3, f4, getHighSpeedVideoSizes(f, f2, closedFloatingPointRange.getStart().floatValue())), androidx.compose.ui.util.MathHelpersKt.lerp(f3, f4, getHighSpeedVideoSizes(f, f2, closedFloatingPointRange.getEndInclusive().floatValue())));
    }

    private static final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2, final androidx.compose.runtime.MutableState<java.lang.Float> mutableState, final float f, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-743965752);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-743965752, i2, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:927)");
            }
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (57344 & i2) == 16384;
            boolean z4 = (i2 & 7168) == 2048;
            boolean z5 = (i2 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (((z | z2 | z3 | z4) || z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material.SliderKt.m2728$r8$lambda$BsIsPs04DdbQt_PVf7ojCuuZzk(kotlin.ranges.ClosedFloatingPointRange.this, function1, f, mutableState, closedFloatingPointRange2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = 0;
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.SliderKt.$r8$lambda$2SnuSvz9s2HxpUrnVrq6hNnB7II(kotlin.jvm.functions.Function1.this, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final androidx.compose.ui.Modifier getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, float f, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, final int i) {
        final float coerceIn = kotlin.ranges.RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.SliderKt.$r8$lambda$o63LJOphjcQslhkzlWDps2Zf1Hs(z, closedFloatingPointRange, i, coerceIn, function1, function0, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
            }
        }, 1, null), f, closedFloatingPointRange, i);
    }

    public static final float getThumbRadius() {
        return getOutputMinFrameDuration;
    }

    public static final float getTrackHeight() {
        return getOutputFormats;
    }

    private static final float Camera2StreamConfigurationMap(float f, java.util.List<java.lang.Float> list, float f2, float f3) {
        java.lang.Float f4;
        if (list.isEmpty()) {
            f4 = null;
        } else {
            java.lang.Float f5 = list.get(0);
            float abs = java.lang.Math.abs(androidx.compose.ui.util.MathHelpersKt.lerp(f2, f3, f5.floatValue()) - f);
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i = 1;
                while (true) {
                    java.lang.Float f6 = list.get(i);
                    float abs2 = java.lang.Math.abs(androidx.compose.ui.util.MathHelpersKt.lerp(f2, f3, f6.floatValue()) - f);
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        f5 = f6;
                        abs = abs2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            f4 = f5;
        }
        java.lang.Float f7 = f4;
        return f7 != null ? androidx.compose.ui.util.MathHelpersKt.lerp(f2, f3, f7.floatValue()) : f;
    }

    static {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f);
        Camera2StreamConfigurationMap = m8601constructorimpl;
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(144.0f);
        getHighSpeedVideoFpsRangesFor = m8601constructorimpl2;
        getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1747widthInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, m8601constructorimpl2, 0.0f, 2, null), 0.0f, m8601constructorimpl, 1, null);
        getHighSpeedVideoFpsRanges = new androidx.compose.animation.core.TweenSpec<>(100, 0, null, 6, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2SnuSvz9s2HxpUrnVrq6hNnB7II(kotlin.jvm.functions.Function1 function1, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange2, androidx.compose.runtime.MutableState mutableState, float f, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(function1, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$39QXORyFdLEDbhkS3R6BAEq2z3M(androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.ui.Modifier modifier, float f, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.SliderColors sliderColors, boolean z, float f2, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(boxScope, modifier, f, mutableInteractionSource, sliderColors, z, f2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6kahxMXZQfDstKT67Yi-XNOaQ8k, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m2725$r8$lambda$6kahxMXZQfDstKT67YiXNOaQ8k(boolean z, androidx.compose.foundation.gestures.DraggableState draggableState, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, float f, boolean z2, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier modifier2;
        composer.startReplaceGroup(1945228890);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1945228890, i, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1000)");
        }
        if (z) {
            composer.startReplaceGroup(-1679801122);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            java.lang.Object[] objArr = {draggableState, mutableInteractionSource, java.lang.Float.valueOf(f), java.lang.Boolean.valueOf(z2)};
            boolean changed = composer.changed(z2);
            boolean changed2 = composer.changed(f);
            boolean changed3 = composer.changed(mutableState);
            boolean changed4 = composer.changed(state);
            boolean changedInstance = composer.changedInstance(coroutineScope);
            boolean changedInstance2 = composer.changedInstance(draggableState);
            boolean changed5 = composer.changed(state2);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed | changed2 | changed3 | changed4 | changedInstance | changedInstance2 | changed5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new androidx.compose.material.SliderKt$sliderTapModifier$2$1$1(z2, f, mutableState, state, coroutineScope, draggableState, state2);
                composer.updateRememberedValue(rememberedValue2);
            }
            modifier2 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, objArr, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue2);
            composer.endReplaceGroup();
        } else {
            modifier2 = modifier;
            composer.startReplaceGroup(-1678708124);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifier2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AfieEd8wRrVwW4ki6GIL8E4zxUY(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, java.util.List list, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State state, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, boolean z) {
        float floatValue = (z ? mutableFloatState : mutableFloatState2).getFloatValue();
        float Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(floatValue, (java.util.List<java.lang.Float>) list, floatRef.element, floatRef2.element);
        if (floatValue != Camera2StreamConfigurationMap2) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1(floatValue, Camera2StreamConfigurationMap2, function0, z, mutableFloatState, mutableFloatState2, state, floatRef, floatRef2, closedFloatingPointRange, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$BFvs-a8HUoH0vOM15rx_7XM7GxI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2726$r8$lambda$BFvsa8HUoH0vOM15rx_7XM7GxI(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, androidx.compose.runtime.State state, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, float f) {
        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f + mutableFloatState2.getFloatValue());
        mutableFloatState2.setFloatValue(0.0f);
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(mutableFloatState.getFloatValue(), floatRef.element, floatRef2.element);
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(java.lang.Float.valueOf(androidx.compose.ui.util.MathHelpersKt.lerp(((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue(), getHighSpeedVideoSizes(floatRef.element, floatRef2.element, coerceIn))));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BJNCsBJZKt-zG8_LUkYf-N1FkaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2727$r8$lambda$BJNCsBJZKtzG8_LUkYfN1FkaE(boolean z, float f, float f2, java.util.List list, androidx.compose.material.SliderColors sliderColors, float f3, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Modifier modifier2, androidx.compose.ui.Modifier modifier3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$BsIs-Ps04DdbQt_PVf7ojCuuZzk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2728$r8$lambda$BsIsPs04DdbQt_PVf7ojCuuZzk(kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, kotlin.jvm.functions.Function1 function1, float f, androidx.compose.runtime.MutableState mutableState, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange2) {
        float floatValue = (((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue()) / 1000.0f;
        float floatValue2 = ((java.lang.Number) function1.invoke(java.lang.Float.valueOf(f))).floatValue();
        if (java.lang.Math.abs(floatValue2 - ((java.lang.Number) mutableState.getValue()).floatValue()) > floatValue && closedFloatingPointRange2.contains((java.lang.Comparable) mutableState.getValue())) {
            mutableState.setValue(java.lang.Float.valueOf(floatValue2));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$EwuyqqgBOGUbVIy1ImtRv2m1u9o(final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange2, final java.util.List list, final kotlin.jvm.functions.Function0 function0, final androidx.compose.runtime.State state, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, boolean z, int i, androidx.compose.material.SliderColors sliderColors, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        float f;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        kotlin.jvm.internal.Ref.FloatRef floatRef2;
        kotlin.jvm.internal.Ref.FloatRef floatRef3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(652589923, i3, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:418)");
            }
            final boolean z2 = composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl;
            float m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(boxWithConstraintsScope.getCamera2StreamConfigurationMap());
            final kotlin.jvm.internal.Ref.FloatRef floatRef4 = new kotlin.jvm.internal.Ref.FloatRef();
            final kotlin.jvm.internal.Ref.FloatRef floatRef5 = new kotlin.jvm.internal.Ref.FloatRef();
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            float f2 = getOutputMinFrameDuration;
            floatRef4.element = m8554getMaxWidthimpl - density.mo1418toPx0680j_4(f2);
            floatRef5.element = density.mo1418toPx0680j_4(f2);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(getHighSpeedVideoFpsRanges(closedFloatingPointRange, floatRef5, floatRef4, ((java.lang.Number) closedFloatingPointRange2.getStart()).floatValue()));
                composer.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(getHighSpeedVideoFpsRanges(closedFloatingPointRange, floatRef5, floatRef4, ((java.lang.Number) closedFloatingPointRange2.getEndInclusive()).floatValue()));
                composer.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableFloatState mutableFloatState2 = (androidx.compose.runtime.MutableFloatState) rememberedValue2;
            boolean changed = composer.changed(closedFloatingPointRange);
            boolean changed2 = composer.changed(floatRef5.element);
            boolean changed3 = composer.changed(floatRef4.element);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.reflect.KFunction) new androidx.compose.material.SliderKt$RangeSlider$2$2$1(closedFloatingPointRange, floatRef5, floatRef4);
                composer.updateRememberedValue(rememberedValue3);
            }
            getHighSpeedVideoSizes((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), closedFloatingPointRange, kotlin.ranges.RangesKt.rangeTo(floatRef5.element, floatRef4.element), mutableFloatState, ((java.lang.Number) closedFloatingPointRange2.getStart()).floatValue(), composer, 3072);
            boolean changed4 = composer.changed(closedFloatingPointRange);
            boolean changed5 = composer.changed(floatRef5.element);
            boolean changed6 = composer.changed(floatRef4.element);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed4 | changed5 | changed6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.reflect.KFunction) new androidx.compose.material.SliderKt$RangeSlider$2$3$1(closedFloatingPointRange, floatRef5, floatRef4);
                composer.updateRememberedValue(rememberedValue4);
            }
            getHighSpeedVideoSizes((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue4), closedFloatingPointRange, kotlin.ranges.RangesKt.rangeTo(floatRef5.element, floatRef4.element), mutableFloatState2, ((java.lang.Number) closedFloatingPointRange2.getEndInclusive()).floatValue(), composer, 3072);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue5);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue5;
            boolean changedInstance = composer.changedInstance(list);
            boolean changed7 = composer.changed(floatRef5.element);
            boolean changed8 = composer.changed(floatRef4.element);
            boolean changed9 = composer.changed(function0);
            boolean changedInstance2 = composer.changedInstance(coroutineScope);
            boolean changed10 = composer.changed(state);
            boolean changed11 = composer.changed(closedFloatingPointRange);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (((changedInstance | changed7 | changed8 | changed9 | changedInstance2 | changed10) || changed11) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                f = m8554getMaxWidthimpl;
                floatRef = floatRef5;
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.SliderKt.$r8$lambda$AfieEd8wRrVwW4ki6GIL8E4zxUY(androidx.compose.runtime.MutableFloatState.this, mutableFloatState2, list, floatRef5, floatRef4, function0, coroutineScope, state, closedFloatingPointRange, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            } else {
                f = m8554getMaxWidthimpl;
                floatRef = floatRef5;
            }
            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function1) rememberedValue6, composer, 0);
            boolean changed12 = composer.changed(closedFloatingPointRange);
            boolean changed13 = composer.changed(floatRef.element);
            boolean changed14 = composer.changed(floatRef4.element);
            boolean changed15 = composer.changed(closedFloatingPointRange2);
            boolean changed16 = composer.changed(state);
            java.lang.Object rememberedValue7 = composer.rememberedValue();
            if ((changed12 | changed13 | changed14 | changed15 | changed16) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final kotlin.jvm.internal.Ref.FloatRef floatRef6 = floatRef;
                java.lang.Object obj = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material.SliderKt.$r8$lambda$tFi39EFQghjKHDUa3ry7tO2r0WE(androidx.compose.runtime.MutableFloatState.this, mutableFloatState2, closedFloatingPointRange2, floatRef6, floatRef4, state, closedFloatingPointRange, ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Float) obj3).floatValue());
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue7 = obj;
            }
            final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function2) rememberedValue7, composer, 0);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            final androidx.compose.runtime.MutableFloatState mutableFloatState3 = mutableFloatState;
            final androidx.compose.runtime.MutableFloatState mutableFloatState4 = mutableFloatState2;
            if (z) {
                floatRef2 = floatRef4;
                floatRef3 = floatRef;
                final float f3 = f;
                companion = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput((androidx.compose.ui.Modifier) companion, new java.lang.Object[]{mutableInteractionSource, mutableInteractionSource2, java.lang.Float.valueOf(f), java.lang.Boolean.valueOf(z2), closedFloatingPointRange}, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object coroutineScope2 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1(pointerInputScope, z2, f3, new androidx.compose.material.RangeSliderLogic(androidx.compose.foundation.interaction.MutableInteractionSource.this, mutableInteractionSource2, mutableFloatState3, mutableFloatState4, rememberUpdatedState2), mutableFloatState3, rememberUpdatedState, mutableFloatState4, rememberUpdatedState2, null), continuation);
                        return coroutineScope2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope2 : kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1081}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ float Camera2StreamConfigurationMap;
                        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI;
                        final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
                        final /* synthetic */ androidx.compose.material.RangeSliderLogic getHighSpeedVideoFpsRangesFor;
                        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> getHighSpeedVideoSizes;
                        final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> getHighSpeedVideoSizesFor;
                        final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getInputFormats;
                        private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
                        int getOutputFormats;
                        final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> getOutputMinFrameDuration;

                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1082, 1093, 1115}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"}, v = 1)
                        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C00261 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                            final /* synthetic */ boolean Camera2StreamConfigurationMap;
                            final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
                            final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> getHighSpeedVideoFpsRanges;
                            final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
                            final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;
                            java.lang.Object getHighSpeedVideoSizesFor;
                            java.lang.Object getInputFormats;
                            final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> getInputSizeshNQ4ISI;
                            final /* synthetic */ androidx.compose.material.RangeSliderLogic getOutputFormats;
                            final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> getOutputMinFrameDuration;
                            java.lang.Object getOutputMinFrameDurationlomOqCM;
                            private /* synthetic */ java.lang.Object getOutputSizes;
                            java.lang.Object getOutputSizeshNQ4ISI;
                            int getOutputStallDuration;

                            /* JADX WARN: Removed duplicated region for block: B:12:0x01df A[Catch: CancellationException -> 0x01ef, TryCatch #0 {CancellationException -> 0x01ef, blocks: (B:8:0x001e, B:10:0x01d7, B:12:0x01df, B:16:0x01e7), top: B:7:0x001e }] */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x01e7 A[Catch: CancellationException -> 0x01ef, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01ef, blocks: (B:8:0x001e, B:10:0x01d7, B:12:0x01df, B:16:0x01e7), top: B:7:0x001e }] */
                            /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x0186  */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
                            /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                                java.lang.Object awaitFirstDown$default;
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
                                androidx.compose.foundation.interaction.DragInteraction.Start start;
                                java.lang.Object m2737access$awaitSlop8vUncbI;
                                kotlin.jvm.internal.Ref.FloatRef floatRef;
                                final kotlin.jvm.internal.Ref.BooleanRef booleanRef;
                                kotlin.Pair pair;
                                java.lang.Object m1468horizontalDragjO51t88;
                                kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
                                androidx.compose.foundation.interaction.DragInteraction.Start start2;
                                androidx.compose.foundation.interaction.DragInteraction.Cancel cancel;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.getOutputStallDuration;
                                if (i == 0) {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputSizes;
                                    this.getOutputSizes = awaitPointerEventScope;
                                    this.getOutputStallDuration = 1;
                                    awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                                    if (awaitFirstDown$default == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoSizesFor;
                                            start2 = (androidx.compose.foundation.interaction.DragInteraction.Start) this.getOutputSizes;
                                            try {
                                                kotlin.ResultKt.throwOnFailure(obj);
                                                m1468horizontalDragjO51t88 = obj;
                                                if (!((java.lang.Boolean) m1468horizontalDragjO51t88).booleanValue()) {
                                                    cancel = new androidx.compose.foundation.interaction.DragInteraction.Stop(start2);
                                                } else {
                                                    cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start2);
                                                }
                                            } catch (java.util.concurrent.CancellationException unused) {
                                                start = start2;
                                                booleanRef = booleanRef2;
                                                cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start);
                                                booleanRef2 = booleanRef;
                                                this.getHighSpeedVideoFpsRangesFor.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef2.element));
                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261.AnonymousClass2(this.getOutputFormats, booleanRef2, cancel, null), 3, null);
                                                return kotlin.Unit.INSTANCE;
                                            }
                                            this.getHighSpeedVideoFpsRangesFor.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanRef2.element));
                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, null, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261.AnonymousClass2(this.getOutputFormats, booleanRef2, cancel, null), 3, null);
                                            return kotlin.Unit.INSTANCE;
                                        }
                                        booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getOutputSizeshNQ4ISI;
                                        floatRef = (kotlin.jvm.internal.Ref.FloatRef) this.getOutputMinFrameDurationlomOqCM;
                                        start = (androidx.compose.foundation.interaction.DragInteraction.Start) this.getInputFormats;
                                        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizesFor;
                                        awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getOutputSizes;
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        m2737access$awaitSlop8vUncbI = obj;
                                        pair = (kotlin.Pair) m2737access$awaitSlop8vUncbI;
                                        if (pair != null) {
                                            androidx.compose.runtime.State<java.lang.Float> state = this.getOutputMinFrameDuration;
                                            androidx.compose.runtime.State<java.lang.Float> state2 = this.getInputSizeshNQ4ISI;
                                            boolean z = this.Camera2StreamConfigurationMap;
                                            float m2602pointerSlopE8SPZFQ = androidx.compose.material.DragGestureDetectorCopyKt.m2602pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                                            if (java.lang.Math.abs(state.getValue().floatValue() - floatRef.element) < m2602pointerSlopE8SPZFQ && java.lang.Math.abs(state2.getValue().floatValue() - floatRef.element) < m2602pointerSlopE8SPZFQ) {
                                                float floatValue = ((java.lang.Number) pair.getSecond()).floatValue();
                                                booleanRef.element = !z ? floatValue >= 0.0f : floatValue < 0.0f;
                                                floatRef.element += java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChange((androidx.compose.ui.input.pointer.PointerInputChange) pair.getFirst()) >> 32));
                                            }
                                        }
                                        androidx.compose.material.RangeSliderLogic rangeSliderLogic = this.getOutputFormats;
                                        boolean z2 = booleanRef.element;
                                        float f = floatRef.element;
                                        androidx.compose.foundation.interaction.DragInteraction.Start start3 = start;
                                        kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoSizes;
                                        rangeSliderLogic.getHighSpeedVideoSizes.getValue().invoke(java.lang.Boolean.valueOf(z2), java.lang.Float.valueOf(f - (!z2 ? rangeSliderLogic.Camera2StreamConfigurationMap : rangeSliderLogic.getHighSpeedVideoFpsRanges).getValue().floatValue()));
                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.RangeSliderLogic$captureThumb$1(rangeSliderLogic, z2, start3, null), 3, null);
                                        try {
                                            long id = pointerInputChange.getId();
                                            final androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> state3 = this.getHighSpeedVideoFpsRanges;
                                            final boolean z3 = this.Camera2StreamConfigurationMap;
                                            this.getOutputSizes = start;
                                            this.getHighSpeedVideoSizesFor = booleanRef;
                                            this.getInputFormats = null;
                                            this.getOutputMinFrameDurationlomOqCM = null;
                                            this.getOutputSizeshNQ4ISI = null;
                                            this.getOutputStallDuration = 3;
                                            m1468horizontalDragjO51t88 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1468horizontalDragjO51t88(awaitPointerEventScope2, id, 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01ce: INVOKE (r3v9 'm1468horizontalDragjO51t88' java.lang.Object) = 
                                                  (r11v2 'awaitPointerEventScope2' androidx.compose.ui.input.pointer.AwaitPointerEventScope)
                                                  (r5v7 'id' long)
                                                  (wrap:kotlin.jvm.functions.Function1:0x01bc: CONSTRUCTOR 
                                                  (r3v6 'state3' androidx.compose.runtime.State<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Float, kotlin.Unit>> A[DONT_INLINE])
                                                  (r2v6 'booleanRef' kotlin.jvm.internal.Ref$BooleanRef A[DONT_INLINE])
                                                  (r7v3 'z3' boolean A[DONT_INLINE])
                                                 A[Catch: CancellationException -> 0x01f1, MD:(androidx.compose.runtime.State, kotlin.jvm.internal.Ref$BooleanRef, boolean):void (m), WRAPPED] call: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.State, kotlin.jvm.internal.Ref$BooleanRef, boolean):void type: CONSTRUCTOR)
                                                  (r18v0 'this' androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1 A[IMMUTABLE_TYPE, THIS])
                                                 STATIC call: androidx.compose.foundation.gestures.DragGestureDetectorKt.horizontalDrag-jO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object A[Catch: CancellationException -> 0x01f1, MD:(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>, kotlin.coroutines.Continuation<? super java.lang.Boolean>):java.lang.Object (m), TRY_LEAVE] in method: androidx.compose.material.SliderKt.rangeSliderPressDragModifier.1.1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes6.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 39 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 545
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }

                                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1133}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                                        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                                        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                            final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef Camera2StreamConfigurationMap;
                                            int getHighResolutionOutputSizeshNQ4ISI;
                                            final /* synthetic */ androidx.compose.foundation.interaction.DragInteraction getHighSpeedVideoFpsRanges;
                                            final /* synthetic */ androidx.compose.material.RangeSliderLogic getHighSpeedVideoFpsRangesFor;

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                                                if (i == 0) {
                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                    androidx.compose.material.RangeSliderLogic rangeSliderLogic = this.getHighSpeedVideoFpsRangesFor;
                                                    androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.Camera2StreamConfigurationMap.element ? rangeSliderLogic.getHighSpeedVideoFpsRangesFor : rangeSliderLogic.getHighResolutionOutputSizeshNQ4ISI;
                                                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                                                    if (mutableInteractionSource.emit(this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
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
                                                return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                return new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass2(androidx.compose.material.RangeSliderLogic rangeSliderLogic, kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.foundation.interaction.DragInteraction dragInteraction, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261.AnonymousClass2> continuation) {
                                                super(2, continuation);
                                                this.getHighSpeedVideoFpsRangesFor = rangeSliderLogic;
                                                this.Camera2StreamConfigurationMap = booleanRef;
                                                this.getHighSpeedVideoFpsRanges = dragInteraction;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                            return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                        }

                                        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.State state, kotlin.jvm.internal.Ref.BooleanRef booleanRef, boolean z, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
                                            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange) >> 32));
                                            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) state.getValue();
                                            boolean z2 = booleanRef.element;
                                            if (z) {
                                                intBitsToFloat = -intBitsToFloat;
                                            }
                                            function2.invoke(java.lang.Boolean.valueOf(z2), java.lang.Float.valueOf(intBitsToFloat));
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                            androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261 c00261 = new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, continuation);
                                            c00261.getOutputSizes = obj;
                                            return c00261;
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        C00261(boolean z, float f, androidx.compose.material.RangeSliderLogic rangeSliderLogic, androidx.compose.runtime.State<java.lang.Float> state, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, androidx.compose.runtime.State<java.lang.Float> state3, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state4, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261> continuation) {
                                            super(2, continuation);
                                            this.Camera2StreamConfigurationMap = z;
                                            this.getHighResolutionOutputSizeshNQ4ISI = f;
                                            this.getOutputFormats = rangeSliderLogic;
                                            this.getInputSizeshNQ4ISI = state;
                                            this.getHighSpeedVideoSizes = coroutineScope;
                                            this.getHighSpeedVideoFpsRangesFor = state2;
                                            this.getOutputMinFrameDuration = state3;
                                            this.getHighSpeedVideoFpsRanges = state4;
                                        }
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.getOutputFormats;
                                        if (i == 0) {
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                                            this.getOutputFormats = 1;
                                            if (androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(this.getInputFormats, new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00261(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, coroutineScope, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
                                        return ((androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                        androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1(this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                                        anonymousClass1.getInputSizeshNQ4ISI = obj;
                                        return anonymousClass1;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass1(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, boolean z, float f, androidx.compose.material.RangeSliderLogic rangeSliderLogic, androidx.compose.runtime.State<java.lang.Float> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, androidx.compose.runtime.State<java.lang.Float> state3, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state4, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.getInputFormats = pointerInputScope;
                                        this.getHighSpeedVideoFpsRanges = z;
                                        this.Camera2StreamConfigurationMap = f;
                                        this.getHighSpeedVideoFpsRangesFor = rangeSliderLogic;
                                        this.getHighSpeedVideoSizesFor = state;
                                        this.getHighSpeedVideoSizes = state2;
                                        this.getOutputMinFrameDuration = state3;
                                        this.getHighResolutionOutputSizeshNQ4ISI = state4;
                                    }
                                }
                            });
                        } else {
                            floatRef2 = floatRef4;
                            floatRef3 = floatRef;
                        }
                        androidx.compose.ui.Modifier modifier = companion;
                        final float coerceIn = kotlin.ranges.RangesKt.coerceIn(((java.lang.Number) closedFloatingPointRange2.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange2.getEndInclusive()).floatValue());
                        final float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(((java.lang.Number) closedFloatingPointRange2.getEndInclusive()).floatValue(), ((java.lang.Number) closedFloatingPointRange2.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue());
                        float highSpeedVideoSizes = getHighSpeedVideoSizes(((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue(), coerceIn);
                        float highSpeedVideoSizes2 = getHighSpeedVideoSizes(((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue(), coerceIn2);
                        float f4 = i;
                        int floor = (int) java.lang.Math.floor(f4 * highSpeedVideoSizes2);
                        int floor2 = (int) java.lang.Math.floor(f4 * (1.0f - highSpeedVideoSizes));
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changed17 = composer.changed(state);
                        boolean changed18 = composer.changed(coerceIn2);
                        java.lang.Object rememberedValue8 = composer.rememberedValue();
                        if ((changed17 | changed18) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return androidx.compose.material.SliderKt.$r8$lambda$GE4LJN4OqE3rq2nvl3oVFZ73YcQ(androidx.compose.runtime.State.this, coerceIn2, ((java.lang.Float) obj2).floatValue());
                                }
                            };
                            composer.updateRememberedValue(rememberedValue8);
                        }
                        androidx.compose.ui.Modifier highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(companion2, coerceIn, z, (kotlin.jvm.functions.Function1) rememberedValue8, function0, kotlin.ranges.RangesKt.rangeTo(((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), coerceIn2), floor);
                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changed19 = composer.changed(state);
                        boolean changed20 = composer.changed(coerceIn);
                        java.lang.Object rememberedValue9 = composer.rememberedValue();
                        if ((changed19 | changed20) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return androidx.compose.material.SliderKt.m2736$r8$lambda$qkalZ6Z_mhu9UuBQyQJW9KQ8rg(androidx.compose.runtime.State.this, coerceIn, ((java.lang.Float) obj2).floatValue());
                                }
                            };
                            composer.updateRememberedValue(rememberedValue9);
                        }
                        getHighSpeedVideoFpsRangesFor(z, highSpeedVideoSizes, highSpeedVideoSizes2, list, sliderColors, floatRef2.element - floatRef3.element, mutableInteractionSource, mutableInteractionSource2, modifier, highSpeedVideoFpsRanges, getHighSpeedVideoFpsRanges(companion3, coerceIn2, z, (kotlin.jvm.functions.Function1) rememberedValue9, function0, kotlin.ranges.RangesKt.rangeTo(coerceIn, ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue()), floor2), composer, 14155776, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                public static /* synthetic */ kotlin.Unit $r8$lambda$GE4LJN4OqE3rq2nvl3oVFZ73YcQ(androidx.compose.runtime.State state, float f, float f2) {
                    ((kotlin.jvm.functions.Function1) state.getValue()).invoke(kotlin.ranges.RangesKt.rangeTo(f2, f));
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: $r8$lambda$GPuJlw0GATeyOI9OIIt6pDw-pG4, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m2729$r8$lambda$GPuJlw0GATeyOI9OIIt6pDwpG4(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    return kotlin.Unit.INSTANCE;
                }

                public static /* synthetic */ kotlin.Unit $r8$lambda$HG0M6Dmfbwz0yyrxwoHjVTzNJg0(boolean z, float f, java.util.List list, androidx.compose.material.SliderColors sliderColors, float f2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
                    getHighSpeedVideoFpsRangesFor(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }

                public static /* synthetic */ kotlin.Unit $r8$lambda$O2Um5sOsRGSxRVqByKXUryl1wFc(float f, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.SliderColors sliderColors, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
                    Slider(f, function1, modifier, z, closedFloatingPointRange, i, function0, mutableInteractionSource, sliderColors, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: $r8$lambda$VMpRYKL9C-239MzO2Hhtcc6lcb8, reason: not valid java name */
                public static /* synthetic */ boolean m2730$r8$lambda$VMpRYKL9C239MzO2Hhtcc6lcb8(kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, float f, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, float f2) {
                    int i2;
                    float coerceIn = kotlin.ranges.RangesKt.coerceIn(f2, ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue());
                    if (i > 0 && (i2 = i + 1) >= 0) {
                        float f3 = coerceIn;
                        float f4 = f3;
                        int i3 = 0;
                        while (true) {
                            float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i3 / i2);
                            float f5 = lerp - coerceIn;
                            if (java.lang.Math.abs(f5) <= f3) {
                                f3 = java.lang.Math.abs(f5);
                                f4 = lerp;
                            }
                            if (i3 == i2) {
                                break;
                            }
                            i3++;
                        }
                        coerceIn = f4;
                    }
                    if (coerceIn == f) {
                        return false;
                    }
                    function1.invoke(java.lang.Float.valueOf(coerceIn));
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return true;
                }

                /* renamed from: $r8$lambda$VZWM0xNiJa2OzuM-epPashF1wrk, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m2731$r8$lambda$VZWM0xNiJa2OzuMepPashF1wrk(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: $r8$lambda$W8ICLEsnJeldQH2-PIygEVtkMZE, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m2732$r8$lambda$W8ICLEsnJeldQH2PIygEVtkMZE(kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange2, int i, kotlin.jvm.functions.Function0 function0, androidx.compose.material.SliderColors sliderColors, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
                    RangeSlider(closedFloatingPointRange, function1, modifier, z, closedFloatingPointRange2, i, function0, sliderColors, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: $r8$lambda$WXvwF8TvY9C9lDLd1PyB51t-2B8, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m2733$r8$lambda$WXvwF8TvY9C9lDLd1PyB51t2B8(androidx.compose.runtime.MutableFloatState mutableFloatState, java.util.List list, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material.SliderDraggableState sliderDraggableState, kotlin.jvm.functions.Function0 function0, float f) {
                    float floatValue = mutableFloatState.getFloatValue();
                    float Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(floatValue, (java.util.List<java.lang.Float>) list, floatRef.element, floatRef2.element);
                    if (floatValue != Camera2StreamConfigurationMap2) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1(sliderDraggableState, floatValue, Camera2StreamConfigurationMap2, f, function0, null), 3, null);
                    } else if (!sliderDraggableState.getHighSpeedVideoFpsRanges() && function0 != null) {
                        function0.invoke();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: $r8$lambda$_elkTKg-WdC7CjX9VArdUXQNVas, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m2734$r8$lambda$_elkTKgWdC7CjX9VArdUXQNVas(float f, androidx.compose.runtime.State state, float f2, float f3, float f4, androidx.compose.runtime.State state2, java.util.List list, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                    boolean z = drawScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl;
                    long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawScope.mo6530getCenterF1C5BW0() & 4294967295L))) & 4294967295L));
                    long m5744constructorimpl2 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawScope.mo6530getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)) - f) << 32));
                    long j = z ? m5744constructorimpl2 : m5744constructorimpl;
                    if (!z) {
                        m5744constructorimpl = m5744constructorimpl2;
                    }
                    long j2 = j;
                    androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, ((androidx.compose.ui.graphics.Color) state.getValue()).m6006unboximpl(), j2, m5744constructorimpl, f2, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
                    int i = (int) (j2 >> 32);
                    int i2 = (int) (m5744constructorimpl >> 32);
                    androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, ((androidx.compose.ui.graphics.Color) state2.getValue()).m6006unboximpl(), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) + ((java.lang.Float.intBitsToFloat(i2) - java.lang.Float.intBitsToFloat(i)) * f4)) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawScope.mo6530getCenterF1C5BW0() & 4294967295L))) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i) + ((java.lang.Float.intBitsToFloat(i2) - java.lang.Float.intBitsToFloat(i)) * f3)) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawScope.mo6530getCenterF1C5BW0() & 4294967295L))) & 4294967295L)), f2, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.lang.Object obj : list) {
                        float floatValue = ((java.lang.Number) obj).floatValue();
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(floatValue > f3 || floatValue < f4);
                        java.lang.Object obj2 = linkedHashMap.get(valueOf);
                        if (obj2 == null) {
                            obj2 = (java.util.List) new java.util.ArrayList();
                            linkedHashMap.put(valueOf, obj2);
                        }
                        ((java.util.List) obj2).add(obj);
                    }
                    for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                        boolean booleanValue = ((java.lang.Boolean) entry.getKey()).booleanValue();
                        java.util.List list2 = (java.util.List) entry.getValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
                        int size = list2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            arrayList.add(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawScope.mo6530getCenterF1C5BW0() & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.geometry.OffsetKt.m5775lerpWko1d7g(j2, m5744constructorimpl, ((java.lang.Number) list2.get(i3)).floatValue()) >> 32))) << 32))));
                            i3++;
                            m5744constructorimpl = m5744constructorimpl;
                        }
                        long j3 = m5744constructorimpl;
                        androidx.compose.ui.graphics.drawscope.DrawScope.m6523drawPointsF8ZwMP8$default(drawScope, arrayList, androidx.compose.ui.graphics.PointMode.INSTANCE.m6298getPointsr_lszbg(), ((androidx.compose.ui.graphics.Color) (booleanValue ? state3 : state4).getValue()).m6006unboximpl(), f2, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
                        m5744constructorimpl = j3;
                    }
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ kotlin.Unit $r8$lambda$ijKyOQN_Yxj1CyUUoULwY41L1wI(final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, float f, final java.util.List list, final kotlin.jvm.functions.Function0 function0, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final boolean z, androidx.compose.material.SliderColors sliderColors, final androidx.compose.runtime.State state, androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, int i) {
                    int i2;
                    kotlin.jvm.internal.Ref.FloatRef floatRef;
                    kotlin.jvm.internal.Ref.FloatRef floatRef2;
                    float f2;
                    kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> noInspectorInfo;
                    androidx.compose.ui.Modifier draggable;
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(boxWithConstraintsScope) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2085116814, i2, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:195)");
                        }
                        boolean z2 = composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl;
                        final float m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(boxWithConstraintsScope.getCamera2StreamConfigurationMap());
                        final kotlin.jvm.internal.Ref.FloatRef floatRef3 = new kotlin.jvm.internal.Ref.FloatRef();
                        final kotlin.jvm.internal.Ref.FloatRef floatRef4 = new kotlin.jvm.internal.Ref.FloatRef();
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                        float f3 = getOutputMinFrameDuration;
                        floatRef3.element = java.lang.Math.max(m8554getMaxWidthimpl - density.mo1418toPx0680j_4(f3), 0.0f);
                        floatRef4.element = java.lang.Math.min(density.mo1418toPx0680j_4(f3), floatRef3.element);
                        java.lang.Object rememberedValue = composer.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
                        java.lang.Object rememberedValue2 = composer.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(Camera2StreamConfigurationMap((kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>) closedFloatingPointRange, floatRef4, floatRef3, f));
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        final androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue2;
                        java.lang.Object rememberedValue3 = composer.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        final androidx.compose.runtime.MutableFloatState mutableFloatState2 = (androidx.compose.runtime.MutableFloatState) rememberedValue3;
                        boolean changed = composer.changed(floatRef4.element);
                        boolean changed2 = composer.changed(floatRef3.element);
                        boolean changed3 = composer.changed(closedFloatingPointRange);
                        java.lang.Object rememberedValue4 = composer.rememberedValue();
                        if ((changed | changed2 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new androidx.compose.material.SliderDraggableState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.compose.material.SliderKt.m2726$r8$lambda$BFvsa8HUoH0vOM15rx_7XM7GxI(androidx.compose.runtime.MutableFloatState.this, mutableFloatState2, floatRef4, floatRef3, state, closedFloatingPointRange, ((java.lang.Float) obj).floatValue());
                                }
                            });
                            composer.updateRememberedValue(rememberedValue4);
                        }
                        final androidx.compose.material.SliderDraggableState sliderDraggableState = (androidx.compose.material.SliderDraggableState) rememberedValue4;
                        boolean changed4 = composer.changed(closedFloatingPointRange);
                        boolean changed5 = composer.changed(floatRef4.element);
                        boolean changed6 = composer.changed(floatRef3.element);
                        java.lang.Object rememberedValue5 = composer.rememberedValue();
                        if ((changed4 | changed5 | changed6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.reflect.KFunction) new androidx.compose.material.SliderKt$Slider$2$2$1(closedFloatingPointRange, floatRef4, floatRef3);
                            composer.updateRememberedValue(rememberedValue5);
                        }
                        getHighSpeedVideoSizes((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5), closedFloatingPointRange, kotlin.ranges.RangesKt.rangeTo(floatRef4.element, floatRef3.element), mutableFloatState, f, composer, 3072);
                        boolean changedInstance = composer.changedInstance(list);
                        boolean changed7 = composer.changed(floatRef4.element);
                        boolean changed8 = composer.changed(floatRef3.element);
                        boolean changedInstance2 = composer.changedInstance(coroutineScope);
                        boolean changedInstance3 = composer.changedInstance(sliderDraggableState);
                        boolean changed9 = composer.changed(function0);
                        java.lang.Object rememberedValue6 = composer.rememberedValue();
                        if ((changedInstance | changed7 | changed8 | changedInstance2 | changedInstance3 | changed9) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.compose.material.SliderKt.m2733$r8$lambda$WXvwF8TvY9C9lDLd1PyB51t2B8(androidx.compose.runtime.MutableFloatState.this, list, floatRef4, floatRef3, coroutineScope, sliderDraggableState, function0, ((java.lang.Float) obj).floatValue());
                                }
                            };
                            composer.updateRememberedValue(rememberedValue6);
                        }
                        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((kotlin.jvm.functions.Function1) rememberedValue6, composer, 0);
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        final androidx.compose.material.SliderDraggableState sliderDraggableState2 = sliderDraggableState;
                        final androidx.compose.runtime.MutableFloatState mutableFloatState3 = mutableFloatState;
                        final androidx.compose.runtime.MutableFloatState mutableFloatState4 = mutableFloatState2;
                        if (androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()) {
                            floatRef = floatRef4;
                            floatRef2 = floatRef3;
                            f2 = m8554getMaxWidthimpl;
                            final boolean z3 = z2;
                            noInspectorInfo = new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                                    invoke2(inspectorInfo);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                                    inspectorInfo.setName("sliderTapModifier");
                                    inspectorInfo.getProperties().set("draggableState", androidx.compose.foundation.gestures.DraggableState.this);
                                    inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                                    inspectorInfo.getProperties().set("maxPx", java.lang.Float.valueOf(m8554getMaxWidthimpl));
                                    inspectorInfo.getProperties().set("isRtl", java.lang.Boolean.valueOf(z3));
                                    inspectorInfo.getProperties().set("rawOffset", mutableFloatState3);
                                    inspectorInfo.getProperties().set("gestureEndAction", rememberUpdatedState);
                                    inspectorInfo.getProperties().set("pressOffset", mutableFloatState4);
                                    inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z));
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                        } else {
                            floatRef = floatRef4;
                            floatRef2 = floatRef3;
                            f2 = m8554getMaxWidthimpl;
                            noInspectorInfo = androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo();
                        }
                        kotlin.jvm.internal.Ref.FloatRef floatRef5 = floatRef;
                        final float f4 = f2;
                        final boolean z4 = z2;
                        androidx.compose.ui.Modifier composed = androidx.compose.ui.ComposedModifierKt.composed(companion, noInspectorInfo, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return androidx.compose.material.SliderKt.m2725$r8$lambda$6kahxMXZQfDstKT67YiXNOaQ8k(z, sliderDraggableState2, mutableInteractionSource, f4, z4, mutableFloatState4, mutableFloatState3, rememberUpdatedState, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                        boolean highSpeedVideoFpsRanges = sliderDraggableState.getHighSpeedVideoFpsRanges();
                        androidx.compose.ui.Modifier.Companion companion3 = companion2;
                        boolean changed10 = composer.changed(rememberUpdatedState);
                        java.lang.Object rememberedValue7 = composer.rememberedValue();
                        if (changed10 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (kotlin.jvm.functions.Function3) new androidx.compose.material.SliderKt$Slider$2$drag$1$1(rememberUpdatedState, null);
                            composer.updateRememberedValue(rememberedValue7);
                        }
                        draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(companion3, sliderDraggableState2, orientation, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : highSpeedVideoFpsRanges, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : null, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : (kotlin.jvm.functions.Function3) rememberedValue7, (r20 & 128) != 0 ? false : z2);
                        getHighSpeedVideoFpsRangesFor(z, getHighSpeedVideoSizes(((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue(), kotlin.ranges.RangesKt.coerceIn(f, ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue(), ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue())), list, sliderColors, floatRef2.element - floatRef5.element, mutableInteractionSource, composed.then(draggable), composer, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }

                public static /* synthetic */ kotlin.Unit $r8$lambda$njpnG27SKQaKrYVLGIl04kwmCPQ(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, float f) {
                    pointerInputChange.consume();
                    floatRef.element = f;
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: $r8$lambda$nwB73U-x0uz6X2nTkmnrOkQzDQA, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m2735$r8$lambda$nwB73Ux0uz6X2nTkmnrOkQzDQA(androidx.compose.ui.Modifier modifier, androidx.compose.material.SliderColors sliderColors, boolean z, float f, float f2, java.util.List list, float f3, float f4, int i, androidx.compose.runtime.Composer composer, int i2) {
                    getHighSpeedVideoSizes(modifier, sliderColors, z, f, f2, list, f3, f4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }

                public static /* synthetic */ kotlin.Unit $r8$lambda$o63LJOphjcQslhkzlWDps2Zf1Hs(boolean z, final kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, final int i, final float f, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function0 function0, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    if (!z) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                    }
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(androidx.compose.material.SliderKt.m2730$r8$lambda$VMpRYKL9C239MzO2Hhtcc6lcb8(kotlin.ranges.ClosedFloatingPointRange.this, i, f, function1, function0, ((java.lang.Float) obj).floatValue()));
                        }
                    }, 1, null);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: $r8$lambda$qkalZ6Z_mhu9UuBQyQJW-9KQ8rg, reason: not valid java name */
                public static /* synthetic */ kotlin.Unit m2736$r8$lambda$qkalZ6Z_mhu9UuBQyQJW9KQ8rg(androidx.compose.runtime.State state, float f, float f2) {
                    ((kotlin.jvm.functions.Function1) state.getValue()).invoke(kotlin.ranges.RangesKt.rangeTo(f, f2));
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ kotlin.Unit $r8$lambda$tFi39EFQghjKHDUa3ry7tO2r0WE(androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableFloatState mutableFloatState2, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, androidx.compose.runtime.State state, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange2, boolean z, float f) {
                    kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> rangeTo;
                    if (z) {
                        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f);
                        mutableFloatState2.setFloatValue(getHighSpeedVideoFpsRanges(closedFloatingPointRange2, floatRef, floatRef2, ((java.lang.Number) closedFloatingPointRange.getEndInclusive()).floatValue()));
                        float floatValue = mutableFloatState2.getFloatValue();
                        rangeTo = kotlin.ranges.RangesKt.rangeTo(kotlin.ranges.RangesKt.coerceIn(mutableFloatState.getFloatValue(), floatRef.element, floatValue), floatValue);
                    } else {
                        mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + f);
                        mutableFloatState.setFloatValue(getHighSpeedVideoFpsRanges(closedFloatingPointRange2, floatRef, floatRef2, ((java.lang.Number) closedFloatingPointRange.getStart()).floatValue()));
                        float floatValue2 = mutableFloatState.getFloatValue();
                        rangeTo = kotlin.ranges.RangesKt.rangeTo(floatValue2, kotlin.ranges.RangesKt.coerceIn(mutableFloatState2.getFloatValue(), floatValue2, floatRef2.element));
                    }
                    ((kotlin.jvm.functions.Function1) state.getValue()).invoke(getHighResolutionOutputSizeshNQ4ISI(floatRef, floatRef2, closedFloatingPointRange2, rangeTo));
                    return kotlin.Unit.INSTANCE;
                }

                public static final /* synthetic */ java.lang.Object access$animateToTarget(androidx.compose.foundation.gestures.DraggableState draggableState, float f, float f2, float f3, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object drag$default = androidx.compose.foundation.gestures.DraggableState.drag$default(draggableState, null, new androidx.compose.material.SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
                    return drag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : kotlin.Unit.INSTANCE;
                }
            }
