package androidx.compose.material;

/* compiled from: Slider.kt */
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020'H\u0007¢\u0006\u0002\u0010(\u001ak\u0010)\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010&\u001a\u00020'2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00104\u001a}\u00105\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010\"\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010%2\b\b\u0002\u00106\u001a\u0002002\b\b\u0002\u0010&\u001a\u00020'H\u0007¢\u0006\u0002\u00107\u001aK\u00108\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u00109\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010&\u001a\u00020'2\u0006\u0010.\u001a\u00020\b2\u0006\u00106\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010:\u001aS\u0010;\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020!2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH\u0003¢\u0006\u0002\u0010>\u001a1\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010E\u001a \u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\bH\u0002\u001a0\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002\u001a<\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002\u001a.\u0010Q\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002\u001a\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010\"\u001a\u00020#H\u0002\u001aI\u0010U\u001a\u00020\u0012*\u00020V2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010W\u001a\u00020\u00032\u0006\u00106\u001a\u0002002\u0006\u0010&\u001a\u00020'2\u0006\u0010 \u001a\u00020!2\u0006\u0010X\u001a\u00020\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u0010Z\u001a;\u0010[\u001a\u0010\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\b\u0018\u00010\\*\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0082@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010d\u001a\u0098\u0001\u0010e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\b0g2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\b0g2\u0006\u0010 \u001a\u00020!2\u0006\u0010i\u001a\u00020!2\u0006\u0010S\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00120\u00140g2\u001e\u0010k\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120l0gH\u0002\u001aX\u0010m\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2\u0006\u0010 \u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010\"\u001a\u00020#H\u0002\u001aj\u0010n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010@\u001a\u00020A2\u0006\u00106\u001a\u0002002\u0006\u0010S\u001a\u00020\b2\u0006\u0010i\u001a\u00020!2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\b0g2\u0018\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00140g2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010 \u001a\u00020!H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0013\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbPressedElevation", "ThumbRadius", "getThumbRadius", "()F", "ThumbRippleRadius", "TrackHeight", "getTrackHeight", "CorrectValueSideEffect", "", "scaleToOffset", "Lkotlin/Function1;", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "value", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "RangeSlider", "values", "onValueChange", "modifier", "enabled", "", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", "width", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Slider", "interactionSource", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", "target", "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", "offset", "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final androidx.compose.ui.Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final androidx.compose.animation.core.TweenSpec<java.lang.Float> SliderToTickAnimation;
    private static final float ThumbRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(10);
    private static final float ThumbRippleRadius = androidx.compose.ui.unit.Dp.m4478constructorimpl(24);
    private static final float ThumbDefaultElevation = androidx.compose.ui.unit.Dp.m4478constructorimpl(1);
    private static final float ThumbPressedElevation = androidx.compose.ui.unit.Dp.m4478constructorimpl(6);
    private static final float TrackHeight = androidx.compose.ui.unit.Dp.m4478constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> onValueChange, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, int i, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material.SliderColors sliderColors, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i9;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3;
        int i10;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        int i11;
        androidx.compose.material.SliderColors m1486colorsq0g_0yA;
        final int i12;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final androidx.compose.material.SliderColors sliderColors2;
        final boolean z3;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final androidx.compose.ui.Modifier modifier2;
        int i13;
        int i14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1962335196);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(7,4,3,1,8,6,5,2)152@7357L39,153@7440L8,156@7533L35,157@7593L59,160@7657L3277:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i14 = 16384;
                            i4 |= i14;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i14 = 8192;
                    i4 |= i14;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        function02 = function0;
                        i4 |= startRestartGroup.changed(function02) ? 1048576 : 524288;
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 29360128) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i2 & 234881024) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(sliderColors)) {
                                i13 = androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i4 |= i13;
                            }
                            i13 = 33554432;
                            i4 |= i13;
                        }
                        if ((i4 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    closedFloatingPointRange3 = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
                                    i4 &= -57345;
                                } else {
                                    closedFloatingPointRange3 = closedFloatingPointRange2;
                                }
                                i10 = i6 != 0 ? 0 : i7;
                                function03 = i8 != 0 ? null : function0;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i3 & 256) != 0) {
                                    i11 = i4 & (-234881025);
                                    m1486colorsq0g_0yA = androidx.compose.material.SliderDefaults.INSTANCE.m1486colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                        throw new java.lang.IllegalArgumentException("steps should be >= 0".toString());
                                    }
                                    androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onValueChange, startRestartGroup, (i11 >> 3) & 14);
                                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i10);
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(valueOf);
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = stepsToTickFractions(i10);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    java.util.List list = (java.util.List) rememberedValue2;
                                    androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(companion);
                                    float f2 = ThumbRadius;
                                    float f3 = 2;
                                    androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(androidx.compose.foundation.FocusableKt.focusable(sliderSemantics(androidx.compose.foundation.layout.SizeKt.m613requiredSizeInqDBjuR0$default(minimumTouchTargetSize, androidx.compose.ui.unit.Dp.m4478constructorimpl(f2 * f3), androidx.compose.ui.unit.Dp.m4478constructorimpl(f2 * f3), 0.0f, 0.0f, 12, null), f, list, z2, onValueChange, closedFloatingPointRange3, i10), z2, mutableInteractionSource2), null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 2085116814, true, new androidx.compose.material.SliderKt$Slider$3(closedFloatingPointRange3, i11, f, mutableInteractionSource2, z2, list, m1486colorsq0g_0yA, rememberUpdatedState, function03)), startRestartGroup, 3072, 6);
                                    i12 = i10;
                                    function04 = function03;
                                    sliderColors2 = m1486colorsq0g_0yA;
                                    z3 = z2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    modifier2 = companion;
                                } else {
                                    i11 = i4;
                                    m1486colorsq0g_0yA = sliderColors;
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                    }
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 256) != 0) {
                                    int i16 = i4 & (-234881025);
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    m1486colorsq0g_0yA = sliderColors;
                                    i11 = i16;
                                    closedFloatingPointRange3 = closedFloatingPointRange2;
                                    i10 = i7;
                                    companion = modifier;
                                    function03 = function0;
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                    }
                                } else {
                                    companion = modifier;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i11 = i4;
                                    closedFloatingPointRange3 = closedFloatingPointRange2;
                                    i10 = i7;
                                    function03 = function0;
                                    m1486colorsq0g_0yA = sliderColors;
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                    }
                                }
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i12 = i7;
                            function04 = function02;
                            mutableInteractionSource3 = mutableInteractionSource;
                            sliderColors2 = sliderColors;
                        }
                        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$Slider$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i17) {
                                androidx.compose.material.SliderKt.Slider(f, onValueChange, modifier2, z3, closedFloatingPointRange3, i12, function04, mutableInteractionSource3, sliderColors2, composer2, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    function02 = function0;
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if ((i2 & 234881024) == 0) {
                    }
                    if ((i4 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                function02 = function0;
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if ((i2 & 234881024) == 0) {
                }
                if ((i4 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            function02 = function0;
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 234881024) == 0) {
            }
            if ((i4 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        function02 = function0;
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        if ((i4 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cd  */
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> values, final kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> onValueChange, androidx.compose.ui.Modifier modifier, boolean z, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, int i, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.material.SliderColors sliderColors, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        boolean z2;
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        androidx.compose.material.SliderColors sliderColors2;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        boolean z3;
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3;
        int i9;
        int i10;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
        final boolean z4;
        final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange4;
        final int i11;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final androidx.compose.material.SliderColors sliderColors3;
        int i12;
        int i13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1556183027);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(7,3,2,1,6,5,4)290@13278L8,292@13350L39,293@13447L39,296@13568L35,297@13628L59,301@13693L4911:Slider.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(values) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i13 = 8192;
                    i4 |= i13;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(function0) ? 1048576 : 524288;
                    }
                    if ((i2 & 29360128) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                            i12 = 8388608;
                            i4 |= i12;
                        }
                        i12 = 4194304;
                        i4 |= i12;
                    }
                    if ((i4 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i14 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRange2 = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i6 != 0) {
                                i7 = 0;
                            }
                            kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i8 == 0 ? null : function0;
                            if ((i3 & 128) == 0) {
                                i4 &= -29360129;
                                modifier3 = companion;
                                function02 = function04;
                                sliderColors2 = androidx.compose.material.SliderDefaults.INSTANCE.m1486colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                            } else {
                                sliderColors2 = sliderColors;
                                modifier3 = companion;
                                function02 = function04;
                            }
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i9 = i7;
                            i10 = i4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            function02 = function0;
                            sliderColors2 = sliderColors;
                            i10 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i9 = i7;
                        }
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
                        if (i9 >= 0) {
                            throw new java.lang.IllegalArgumentException("steps should be >= 0".toString());
                        }
                        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(onValueChange, startRestartGroup, (i10 >> 3) & 14);
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i9);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        boolean changed = startRestartGroup.changed(valueOf);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = stepsToTickFractions(i9);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.ui.Modifier minimumTouchTargetSize = androidx.compose.material.TouchTargetKt.minimumTouchTargetSize(modifier3);
                        float f = ThumbRadius;
                        composer2 = startRestartGroup;
                        androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(androidx.compose.foundation.layout.SizeKt.m613requiredSizeInqDBjuR0$default(minimumTouchTargetSize, androidx.compose.ui.unit.Dp.m4478constructorimpl(4 * f), androidx.compose.ui.unit.Dp.m4478constructorimpl(f * 2), 0.0f, 0.0f, 12, null), null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 652589923, true, new androidx.compose.material.SliderKt$RangeSlider$2(closedFloatingPointRange3, values, i10, rememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z3, (java.util.List) rememberedValue3, i9, sliderColors2, function02)), composer2, 3072, 6);
                        modifier4 = modifier3;
                        z4 = z3;
                        closedFloatingPointRange4 = closedFloatingPointRange3;
                        i11 = i9;
                        function03 = function02;
                        sliderColors3 = sliderColors2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        sliderColors3 = sliderColors;
                        modifier4 = modifier2;
                        z4 = z2;
                        closedFloatingPointRange4 = closedFloatingPointRange2;
                        i11 = i7;
                        composer2 = startRestartGroup;
                        function03 = function0;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                            invoke(composer3, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i15) {
                            androidx.compose.material.SliderKt.RangeSlider(values, onValueChange, modifier4, z4, closedFloatingPointRange4, i11, function03, sliderColors3, composer3, i2 | 1, i3);
                        }
                    });
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                if ((i4 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                z3 = z2;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i9 = i7;
                i10 = i4;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource22 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
                if (i9 >= 0) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            if ((i4 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            z3 = z2;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            i9 = i7;
            i10 = i4;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource32 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource222 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
            if (i9 >= 0) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        if ((i4 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        z3 = z2;
        closedFloatingPointRange3 = closedFloatingPointRange2;
        i9 = i7;
        i10 = i4;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource322 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2222 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue2;
        if (i9 >= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(final boolean z, final float f, final java.util.List<java.lang.Float> list, final androidx.compose.material.SliderColors sliderColors, final float f2, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1679682785);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SliderImpl)P(1,4,5!1,6)576@24423L712:Slider.kt#jmzs0o");
        androidx.compose.ui.Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = startRestartGroup.consume(localDensity);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume3 = startRestartGroup.consume(localViewConfiguration);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(231316251);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C*580@24583L7,589@24828L216,599@25053L76:Slider.kt#jmzs0o");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume4 = startRestartGroup.consume(localDensity2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
        float mo315toPx0680j_4 = density2.mo315toPx0680j_4(TrackHeight);
        float f3 = ThumbRadius;
        float mo315toPx0680j_42 = density2.mo315toPx0680j_4(f3);
        float mo311toDpu2uoSUM = density2.mo311toDpu2uoSUM(f2);
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(f3 * 2);
        float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(mo311toDpu2uoSUM * f);
        int i2 = i >> 6;
        Track(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, mo315toPx0680j_42, mo315toPx0680j_4, startRestartGroup, (i2 & 112) | 265222 | ((i << 6) & 896) | ((i << 9) & 57344));
        m1487SliderThumbPcYyNuk(boxScopeInstance, androidx.compose.ui.Modifier.INSTANCE, m4478constructorimpl2, mutableInteractionSource, sliderColors, z, m4478constructorimpl, startRestartGroup, (i2 & 7168) | 1572918 | ((i << 3) & 57344) | ((i << 15) & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.material.SliderKt.SliderImpl(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final java.util.List<java.lang.Float> list, final androidx.compose.material.SliderColors sliderColors, final float f3, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, final androidx.compose.ui.Modifier modifier, final androidx.compose.ui.Modifier modifier2, final androidx.compose.ui.Modifier modifier3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-278895713);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(RangeSliderImpl)P(1,6,5,9!1,10,7!1,4,8)618@25580L35,619@25648L33,620@25686L1488:Slider.kt#jmzs0o");
        final java.lang.String m1509getString4foXLRw = androidx.compose.material.Strings_androidKt.m1509getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m1508getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
        final java.lang.String m1509getString4foXLRw2 = androidx.compose.material.Strings_androidKt.m1509getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m1507getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
        androidx.compose.ui.Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = startRestartGroup.consume(localDensity);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume3 = startRestartGroup.consume(localViewConfiguration);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(then);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(2044256857);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C*624@25846L7,633@26154L267,646@26517L48,644@26431L369,657@26895L46,655@26809L359:Slider.kt#jmzs0o");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume4 = startRestartGroup.consume(localDensity2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume4;
        float mo315toPx0680j_4 = density2.mo315toPx0680j_4(TrackHeight);
        float f4 = ThumbRadius;
        float mo315toPx0680j_42 = density2.mo315toPx0680j_4(f4);
        float mo311toDpu2uoSUM = density2.mo311toDpu2uoSUM(f3);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(f4 * 2);
        float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(mo311toDpu2uoSUM * f);
        float m4478constructorimpl3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(mo311toDpu2uoSUM * f2);
        int i3 = i >> 9;
        int i4 = i << 6;
        Track(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, list, mo315toPx0680j_42, mo315toPx0680j_4, startRestartGroup, (i3 & 112) | 262144 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(m1509getString4foXLRw);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, m1509getString4foXLRw);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i5 = i & 57344;
        int i6 = (i << 15) & 458752;
        m1487SliderThumbPcYyNuk(boxScopeInstance, androidx.compose.foundation.FocusableKt.focusable(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, (kotlin.jvm.functions.Function1) rememberedValue), true, mutableInteractionSource).then(modifier2), m4478constructorimpl2, mutableInteractionSource, sliderColors, z, m4478constructorimpl, startRestartGroup, (i3 & 7168) | 1572870 | i5 | i6);
        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = startRestartGroup.changed(m1509getString4foXLRw2);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, m1509getString4foXLRw2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        m1487SliderThumbPcYyNuk(boxScopeInstance, androidx.compose.foundation.FocusableKt.focusable(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion2, true, (kotlin.jvm.functions.Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier3), m4478constructorimpl3, mutableInteractionSource2, sliderColors, z, m4478constructorimpl, startRestartGroup, ((i >> 12) & 7168) | 1572870 | i5 | i6);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                androidx.compose.material.SliderKt.RangeSliderImpl(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1487SliderThumbPcYyNuk(final androidx.compose.foundation.layout.BoxScope boxScope, final androidx.compose.ui.Modifier modifier, final float f, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.material.SliderColors sliderColors, final boolean z, final float f2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        float f3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(428907178);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SliderThumb)P(3,4:c#ui.unit.Dp,2!,5:c#ui.unit.Dp)678@27387L1518:Slider.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((2995931 & i2) != 599186 || !startRestartGroup.getSkipping()) {
            androidx.compose.ui.Modifier align = boxScope.align(androidx.compose.foundation.layout.PaddingKt.m572paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = startRestartGroup.consume(localViewConfiguration);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-587645648);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C679@27483L46,680@27572L658,680@27538L692,703@28586L59,707@28850L19,698@28392L507:Slider.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
            int i3 = i2 >> 9;
            int i4 = i3 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableInteractionSource) | startRestartGroup.changed(snapshotStateList);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.compose.material.SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.LaunchedEffect(mutableInteractionSource, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i4);
            if (!snapshotStateList.isEmpty()) {
                f3 = ThumbPressedElevation;
            } else {
                f3 = ThumbDefaultElevation;
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.BackgroundKt.m211backgroundbw27NRU(androidx.compose.ui.draw.ShadowKt.m1784shadows4CzXII$default(androidx.compose.foundation.HoverableKt.hoverable$default(androidx.compose.foundation.IndicationKt.indication(androidx.compose.foundation.layout.SizeKt.m619sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z ? f3 : androidx.compose.ui.unit.Dp.m4478constructorimpl(0), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, startRestartGroup, ((i2 >> 15) & 14) | (i3 & 112)).getValue().m2123unboximpl(), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                androidx.compose.material.SliderKt.m1487SliderThumbPcYyNuk(androidx.compose.foundation.layout.BoxScope.this, modifier, f, mutableInteractionSource, sliderColors, z, f2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Track(final androidx.compose.ui.Modifier modifier, final androidx.compose.material.SliderColors sliderColors, final boolean z, final float f, final float f2, final java.util.List<java.lang.Float> list, final float f3, final float f4, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1833126050);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(2!2,4!1,6)723@29198L35,724@29268L34,725@29338L34,726@29406L33,727@29444L1514:Slider.kt#jmzs0o");
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor = sliderColors.trackColor(z, false, startRestartGroup, i2);
        final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor2 = sliderColors.trackColor(z, true, startRestartGroup, i2);
        final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> tickColor = sliderColors.tickColor(z, false, startRestartGroup, i2);
        final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> tickColor2 = sliderColors.tickColor(z, true, startRestartGroup, i2);
        androidx.compose.foundation.CanvasKt.Canvas(modifier, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$Track$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                invoke2(drawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope Canvas) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                boolean z2 = Canvas.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl;
                long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(f3, androidx.compose.ui.geometry.Offset.m1872getYimpl(Canvas.mo2591getCenterF1C5BW0()));
                long Offset2 = androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Size.m1940getWidthimpl(Canvas.mo2592getSizeNHjbRc()) - f3, androidx.compose.ui.geometry.Offset.m1872getYimpl(Canvas.mo2591getCenterF1C5BW0()));
                long j = z2 ? Offset2 : Offset;
                long j2 = z2 ? Offset : Offset2;
                long j3 = j2;
                long j4 = j;
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2664drawLineNGM6Ib0$default(Canvas, trackColor.getValue().m2123unboximpl(), j, j2, f4, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2475getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2664drawLineNGM6Ib0$default(Canvas, trackColor2.getValue().m2123unboximpl(), androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(j4) + ((androidx.compose.ui.geometry.Offset.m1871getXimpl(j3) - androidx.compose.ui.geometry.Offset.m1871getXimpl(j4)) * f), androidx.compose.ui.geometry.Offset.m1872getYimpl(Canvas.mo2591getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(j4) + ((androidx.compose.ui.geometry.Offset.m1871getXimpl(j3) - androidx.compose.ui.geometry.Offset.m1871getXimpl(j4)) * f2), androidx.compose.ui.geometry.Offset.m1872getYimpl(Canvas.mo2591getCenterF1C5BW0())), f4, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2475getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                java.util.List<java.lang.Float> list2 = list;
                float f5 = f2;
                float f6 = f;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.lang.Object obj : list2) {
                    float floatValue = ((java.lang.Number) obj).floatValue();
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(floatValue > f5 || floatValue < f6);
                    java.lang.Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = (java.util.List) new java.util.ArrayList();
                        linkedHashMap.put(valueOf, obj2);
                    }
                    ((java.util.List) obj2).add(obj);
                }
                androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state = tickColor;
                androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> state2 = tickColor2;
                float f7 = f4;
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((java.lang.Boolean) entry.getKey()).booleanValue();
                    java.util.List list3 = (java.util.List) entry.getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    java.util.Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(androidx.compose.ui.geometry.OffsetKt.m1894lerpWko1d7g(j4, j3, ((java.lang.Number) it.next()).floatValue())), androidx.compose.ui.geometry.Offset.m1872getYimpl(Canvas.mo2591getCenterF1C5BW0()))));
                    }
                    long j5 = j3;
                    j4 = j4;
                    androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2669drawPointsF8ZwMP8$default(Canvas, arrayList, androidx.compose.ui.graphics.PointMode.INSTANCE.m2427getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2123unboximpl(), f7, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2475getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    f7 = f7;
                    j3 = j5;
                }
            }
        }, startRestartGroup, i & 14);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$Track$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.material.SliderKt.Track(androidx.compose.ui.Modifier.this, sliderColors, z, f, f2, list, f3, f4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, java.util.List<java.lang.Float> list, float f2, float f3) {
        java.lang.Object obj;
        java.util.Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                float abs = java.lang.Math.abs(androidx.compose.ui.util.MathHelpersKt.lerp(f2, f3, ((java.lang.Number) next).floatValue()) - f);
                do {
                    java.lang.Object next2 = it.next();
                    float abs2 = java.lang.Math.abs(androidx.compose.ui.util.MathHelpersKt.lerp(f2, f3, ((java.lang.Number) next2).floatValue()) - f);
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        java.lang.Float f4 = (java.lang.Float) obj;
        return f4 != null ? androidx.compose.ui.util.MathHelpersKt.lerp(f2, f3, f4.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m1490awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> continuation) {
        androidx.compose.material.SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        if (continuation instanceof androidx.compose.material.SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (androidx.compose.material.SliderKt$awaitSlop$1) continuation;
            if ((sliderKt$awaitSlop$1.label & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label -= Integer.MIN_VALUE;
                androidx.compose.material.SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                java.lang.Object obj = sliderKt$awaitSlop$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sliderKt$awaitSlop$12.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2, java.lang.Float f) {
                            invoke(pointerInputChange2, f.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInput, float f) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
                            pointerInput.consume();
                            kotlin.jvm.internal.Ref.FloatRef.this.element = f;
                        }
                    };
                    sliderKt$awaitSlop$12.L$0 = floatRef2;
                    sliderKt$awaitSlop$12.label = 1;
                    java.lang.Object m1356awaitHorizontalPointerSlopOrCancellationgDDlDlE = androidx.compose.material.DragGestureDetectorCopyKt.m1356awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
                    if (m1356awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m1356awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    floatRef = floatRef2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) sliderKt$awaitSlop$12.L$0;
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
        java.lang.Object obj2 = sliderKt$awaitSlop$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sliderKt$awaitSlop$122.label;
        if (i2 != 0) {
        }
        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj2;
        if (pointerInputChange == null) {
        }
    }

    private static final java.util.List<java.lang.Float> stepsToTickFractions(int i) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return androidx.compose.ui.util.MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> scale(float f, float f2, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, float f3, float f4) {
        return kotlin.ranges.RangesKt.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return kotlin.ranges.RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CorrectValueSideEffect(final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2, final androidx.compose.runtime.MutableState<java.lang.Float> mutableState, final float f, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-743965752);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(CorrectValueSideEffect)P(!1,3!1,4)822@32812L300,822@32801L311:Slider.kt#jmzs0o");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(function1) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & 46811) != 9362 || !startRestartGroup.getSkipping()) {
            java.lang.Object[] objArr = {closedFloatingPointRange, function1, java.lang.Float.valueOf(f), mutableState, closedFloatingPointRange2};
            startRestartGroup.startReplaceableGroup(-568225417);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i3 = 0; i3 < 5; i3++) {
                z |= startRestartGroup.changed(objArr[i3]);
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        float floatValue = (closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) / 1000;
                        float floatValue2 = function1.invoke(java.lang.Float.valueOf(f)).floatValue();
                        if (java.lang.Math.abs(floatValue2 - mutableState.getValue().floatValue()) <= floatValue || !closedFloatingPointRange2.contains(mutableState.getValue())) {
                            return;
                        }
                        mutableState.setValue(java.lang.Float.valueOf(floatValue2));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                androidx.compose.material.SliderKt.CorrectValueSideEffect(function1, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, composer2, i | 1);
            }
        });
    }

    static /* synthetic */ androidx.compose.ui.Modifier sliderSemantics$default(androidx.compose.ui.Modifier modifier, float f, java.util.List list, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.ranges.ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f);
        }
        return sliderSemantics(modifier, f, list, z, function1, closedFloatingPointRange, (i2 & 32) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier sliderSemantics(androidx.compose.ui.Modifier modifier, float f, final java.util.List<java.lang.Float> list, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, final int i) {
        final float coerceIn = kotlin.ranges.RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (!z) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semantics);
                }
                final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange2 = closedFloatingPointRange;
                final int i2 = i;
                final java.util.List<java.lang.Float> list2 = list;
                final float f2 = coerceIn;
                final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function12 = function1;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgress$default(semantics, null, new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Boolean>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Float f3) {
                        return invoke(f3.floatValue());
                    }

                    public final java.lang.Boolean invoke(float f3) {
                        boolean z2;
                        java.lang.Object obj;
                        float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(f3, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        if (i2 > 0) {
                            java.util.List<java.lang.Float> list3 = list2;
                            kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange3 = closedFloatingPointRange2;
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                            java.util.Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(java.lang.Float.valueOf(androidx.compose.ui.util.MathHelpersKt.lerp(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), ((java.lang.Number) it.next()).floatValue())));
                            }
                            java.util.Iterator it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                java.lang.Object next = it2.next();
                                if (it2.hasNext()) {
                                    float abs = java.lang.Math.abs(((java.lang.Number) next).floatValue() - coerceIn2);
                                    do {
                                        java.lang.Object next2 = it2.next();
                                        float abs2 = java.lang.Math.abs(((java.lang.Number) next2).floatValue() - coerceIn2);
                                        if (java.lang.Float.compare(abs, abs2) > 0) {
                                            next = next2;
                                            abs = abs2;
                                        }
                                    } while (it2.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            java.lang.Float f4 = (java.lang.Float) obj;
                            if (f4 != null) {
                                coerceIn2 = f4.floatValue();
                            }
                        }
                        if (coerceIn2 == f2) {
                            z2 = false;
                        } else {
                            function12.invoke(java.lang.Float.valueOf(coerceIn2));
                            z2 = true;
                        }
                        return java.lang.Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), f, closedFloatingPointRange, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object animateToTarget(androidx.compose.foundation.gestures.DraggableState draggableState, float f, float f2, float f3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag$default = androidx.compose.foundation.gestures.DraggableState.CC.drag$default(draggableState, null, new androidx.compose.material.SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
        return drag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier rangeSliderPressDragModifier(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2, androidx.compose.runtime.State<java.lang.Float> state, androidx.compose.runtime.State<java.lang.Float> state2, boolean z, boolean z2, float f, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> closedFloatingPointRange, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state3, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit>> state4) {
        return z ? androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, new java.lang.Object[]{mutableInteractionSource, mutableInteractionSource2, java.lang.Float.valueOf(f), java.lang.Boolean.valueOf(z2), closedFloatingPointRange}, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, f, state3, null)) : modifier;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier sliderTapModifier(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.gestures.DraggableState draggableState, final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final float f, final boolean z, final androidx.compose.runtime.State<java.lang.Float> state, final androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>> state2, final androidx.compose.runtime.MutableState<java.lang.Float> mutableState, final boolean z2) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", androidx.compose.foundation.gestures.DraggableState.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", java.lang.Float.valueOf(f));
                inspectorInfo.getProperties().set("isRtl", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(z2));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier composed, androidx.compose.runtime.Composer composer, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1945228890);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C879@34727L24:Slider.kt#jmzs0o");
                if (z2) {
                    composer.startReplaceableGroup(773894976);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    composer.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    composed = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(composed, new java.lang.Object[]{draggableState, mutableInteractionSource, java.lang.Float.valueOf(f), java.lang.Boolean.valueOf(z)}, (kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1(z, f, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                composer.endReplaceableGroup();
                return composed;
            }

            /* compiled from: Slider.kt */
            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {882}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ androidx.compose.foundation.gestures.DraggableState $draggableState;
                final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> $pressOffset;
                final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffset;
                final /* synthetic */ kotlinx.coroutines.CoroutineScope $scope;
                private /* synthetic */ java.lang.Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z, float f, androidx.compose.runtime.MutableState<java.lang.Float> mutableState, androidx.compose.runtime.State<java.lang.Float> state, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.gestures.DraggableState draggableState, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1 anonymousClass1 = new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                /* compiled from: Slider.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {887}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00521 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> $pressOffset;
                    final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ java.lang.Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00521(boolean z, float f, androidx.compose.runtime.MutableState<java.lang.Float> mutableState, androidx.compose.runtime.State<java.lang.Float> state, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.C00521> continuation) {
                        super(3, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return m1491invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
                    }

                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final java.lang.Object m1491invoked4ec7I(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.C00521 c00521 = new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.C00521(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                        c00521.L$0 = pressGestureScope;
                        c00521.J$0 = j;
                        return c00521.invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.compose.foundation.gestures.PressGestureScope pressGestureScope = (androidx.compose.foundation.gestures.PressGestureScope) this.L$0;
                                long j = this.J$0;
                                this.$pressOffset.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat((this.$isRtl ? this.$maxPx - androidx.compose.ui.geometry.Offset.m1871getXimpl(j) : androidx.compose.ui.geometry.Offset.m1871getXimpl(j)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                        } catch (androidx.compose.foundation.gestures.GestureCancellationException unused) {
                            this.$pressOffset.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = (androidx.compose.ui.input.pointer.PointerInputScope) this.L$0;
                        androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.C00521 c00521 = new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.C00521(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final kotlinx.coroutines.CoroutineScope coroutineScope = this.$scope;
                        final androidx.compose.foundation.gestures.DraggableState draggableState = this.$draggableState;
                        final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> state = this.$gestureEndAction;
                        this.label = 1;
                        if (androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00521, new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                                m1492invokek4lQ0M(offset.getPackedValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1492invokek4lQ0M(long j) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, null, new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531(draggableState, state, null), 3, null);
                            }

                            /* compiled from: Slider.kt */
                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", i = {}, l = {894}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            static final class C00531 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                final /* synthetic */ androidx.compose.foundation.gestures.DraggableState $draggableState;
                                final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> $gestureEndAction;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C00531(androidx.compose.foundation.gestures.DraggableState draggableState, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>> state, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531> continuation) {
                                    super(2, continuation);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                    return new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531(this.$draggableState, this.$gestureEndAction, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                    return ((androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                }

                                /* compiled from: Slider.kt */
                                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00541 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                    private /* synthetic */ java.lang.Object L$0;
                                    int label;

                                    C00541(kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531.C00541> continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                        androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531.C00541 c00541 = new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531.C00541(continuation);
                                        c00541.L$0 = obj;
                                        return c00541;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                        return ((androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531.C00541) create(dragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        ((androidx.compose.foundation.gestures.DragScope) this.L$0).dragBy(0.0f);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$draggableState.drag(androidx.compose.foundation.MutatePriority.UserInput, new androidx.compose.material.SliderKt$sliderTapModifier$2.AnonymousClass1.AnonymousClass2.C00531.C00541(null), this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.ResultKt.throwOnFailure(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                        }, this, 3, null) == coroutine_suspended) {
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
            }
        });
    }

    static {
        float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(48);
        SliderHeight = m4478constructorimpl;
        float m4478constructorimpl2 = androidx.compose.ui.unit.Dp.m4478constructorimpl(144);
        SliderMinWidth = m4478constructorimpl2;
        DefaultSliderConstraints = androidx.compose.foundation.layout.SizeKt.m605heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m624widthInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, m4478constructorimpl2, 0.0f, 2, null), 0.0f, m4478constructorimpl, 1, null);
        SliderToTickAnimation = new androidx.compose.animation.core.TweenSpec<>(100, 0, null, 6, null);
    }
}
