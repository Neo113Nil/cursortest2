package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aW\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u000e\u001aO\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0005\u001a\u00020\u00152\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001b\u0010\u0017\u001aM\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0005\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u001f\u001aM\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0005\u001a\u00020\"2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010#\u001aO\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0006\u0010\u0005\u001a\u00020&2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020&0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b'\u0010\u0017\u001aO\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0005\u001a\u00020*2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020*0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b+\u0010\u0017\u001a}\u0010-\u001a\b\u0012\u0004\u0012\u0002H.0\u0004\"\u0004\b\u0000\u0010.\"\b\b\u0001\u0010/*\u0002002\u0006\u0010\u0005\u001a\u0002H.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H/022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H.0\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H.2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u00103\u001aM\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u00104\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b5\u00106\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0005\u001a\u00020\u00152\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b7\u00108\u001aE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b9\u00108\u001aC\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0005\u001a\u00020\u001e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010:\u001aC\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0005\u001a\u00020\"2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010;\u001aE\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0006\u0010\u0005\u001a\u00020&2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020&0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b<\u00108\u001aE\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0005\u001a\u00020*2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020*0\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b=\u00108\u001as\u0010-\u001a\b\u0012\u0004\u0012\u0002H.0\u0004\"\u0004\b\u0000\u0010.\"\b\b\u0001\u0010/*\u0002002\u0006\u0010\u0005\u001a\u0002H.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H/022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H.0\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u0001H.2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010>\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?²\u0006\u001e\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u00020\r\u0018\u00010\f\"\u0004\b\u0000\u0010.X\u008a\u0084\u0002²\u0006\u0016\u0010A\u001a\b\u0012\u0004\u0012\u0002H.0\u0007\"\u0004\b\u0000\u0010.X\u008a\u0084\u0002"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "animateFloatAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "visibilityThreshold", "label", "", "finishedListener", "Lkotlin/Function1;", "", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "dpDefaultSpring", "animateSizeAsState", "Landroidx/compose/ui/geometry/Size;", "animateSizeAsState-YLp_XPw", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "sizeDefaultSpring", "animateOffsetAsState", "Landroidx/compose/ui/geometry/Offset;", "animateOffsetAsState-7362WCg", "offsetDefaultSpring", "animateRectAsState", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "rectDefaultSpring", "animateIntAsState", "", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "intDefaultSpring", "animateIntOffsetAsState", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffsetAsState-HyPO7BM", "intOffsetDefaultSpring", "animateIntSizeAsState", "Landroidx/compose/ui/unit/IntSize;", "animateIntSizeAsState-4goxYXU", "intSizeDefaultSpring", "animateValueAsState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState-LjSzlW0", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateOffsetAsState-N6fFfp4", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-8f6pmRE", "animateIntSizeAsState-zTRF_AQ", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "animSpec"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.Dp> getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.Dp.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Size> getInputFormats = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Size.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Offset> getOutputFormats = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Offset.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.geometry.Rect> getOutputMinFrameDuration = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.geometry.Rect.INSTANCE), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, java.lang.Integer.valueOf(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(kotlin.jvm.internal.IntCompanionObject.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntOffset> getHighSpeedVideoFpsRanges = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntOffset.INSTANCE)), 3, null);
    private static final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> getHighSpeedVideoFpsRangesFor = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 3, null);

    public static final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState(float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, float f2, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.SpringSpec springSpec;
        androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec2 = (i2 & 2) != 0 ? Camera2StreamConfigurationMap : animationSpec;
        float f3 = (i2 & 4) != 0 ? 0.01f : f2;
        java.lang.String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function12 = (i2 & 16) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (springSpec2 == Camera2StreamConfigurationMap) {
            composer.startReplaceGroup(1144089983);
            boolean z = (((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, java.lang.Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            springSpec = (androidx.compose.animation.core.SpringSpec) rememberedValue;
        } else {
            composer.startReplaceGroup(1144199909);
            composer.endReplaceGroup();
            springSpec = springSpec2;
        }
        int i3 = i << 3;
        androidx.compose.runtime.State<java.lang.Float> animateValueAsState = animateValueAsState(java.lang.Float.valueOf(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), springSpec, java.lang.Float.valueOf(f3), str2, function12, composer, (i & 14) | (i3 & 7168) | (57344 & i3) | (458752 & i3), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> m1173animateDpAsStateAjpBEmI(float f, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Dp, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getHighSpeedVideoSizes;
        }
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.Dp> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        java.lang.String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Dp, kotlin.Unit> function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> animateValueAsState = animateValueAsState(androidx.compose.ui.unit.Dp.m8599boximpl(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), animationSpec2, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.geometry.Size> m1182animateSizeAsStateYLp_XPw(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Size> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Size, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Size> animationSpec2 = (i2 & 2) != 0 ? getInputFormats : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "SizeAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Size, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1374633148, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:152)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Size> animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Size.m5809boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE), animationSpec2, null, str2, function12, composer, ((i << 3) & 896) | (i & 14) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> m1179animateOffsetAsState7362WCg(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec2 = (i2 & 2) != 0 ? getOutputFormats : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "OffsetAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(357896800, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:191)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Offset.m5741boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), animationSpec2, null, str2, function12, composer, ((i << 3) & 896) | (i & 14) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    public static final androidx.compose.runtime.State<androidx.compose.ui.geometry.Rect> animateRectAsState(androidx.compose.ui.geometry.Rect rect, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Rect> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getOutputMinFrameDuration;
        }
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Rect> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "RectAnimation";
        }
        java.lang.String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Rect, kotlin.Unit> function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(536062978, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:232)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Rect> animateValueAsState = animateValueAsState(rect, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE), animationSpec2, null, str2, function12, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    public static final androidx.compose.runtime.State<java.lang.Integer> animateIntAsState(int i, androidx.compose.animation.core.AnimationSpec<java.lang.Integer> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.compose.animation.core.AnimationSpec<java.lang.Integer> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "IntAnimation";
        }
        java.lang.String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(428074472, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:270)");
        }
        int i4 = i2 << 6;
        androidx.compose.runtime.State<java.lang.Integer> animateValueAsState = animateValueAsState(java.lang.Integer.valueOf(i), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> m1176animateIntOffsetAsStateHyPO7BM(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntOffset, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec2 = (i2 & 2) != 0 ? getHighSpeedVideoFpsRanges : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "IntOffsetAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntOffset, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-696782904, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:309)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntOffset> animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntOffset.m8720boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), animationSpec2, null, str2, function12, composer, ((i << 3) & 896) | (i & 14) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> m1177animateIntSizeAsState4goxYXU(long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.IntSize> animationSpec, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.unit.IntSize> animationSpec2 = (i2 & 2) != 0 ? getHighSpeedVideoFpsRangesFor : animationSpec;
        java.lang.String str2 = (i2 & 4) != 0 ? "IntSizeAnimation" : str;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function12 = (i2 & 8) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(582576328, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:347)");
        }
        int i3 = i << 6;
        androidx.compose.runtime.State<androidx.compose.ui.unit.IntSize> animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntSize.m8764boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE), animationSpec2, null, str2, function12, composer, ((i << 3) & 896) | (i & 14) | (57344 & i3) | (i3 & 458752), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlinx.coroutines.channels.Channel channel, java.lang.Object obj) {
        channel.mo9266trySendJP2dKIU(obj);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateFloatAsState(float f, androidx.compose.animation.core.AnimationSpec animationSpec, float f2, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = Camera2StreamConfigurationMap;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        float f3 = f2;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1091643291, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = animateFloatAsState(f, animationSpec2, f3, null, function12, composer, (i & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i << 3) & 57344), 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateFloatAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m1174animateDpAsStateKz89ssw(float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getHighSpeedVideoSizes;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(704104481, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.unit.Dp.m8599boximpl(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.Dp.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m1181animateSizeAsStateLjSzlW0(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getInputFormats;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(875212471, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Size.m5809boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Size.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m1180animateOffsetAsStateN6fFfp4(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getOutputFormats;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-456513133, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.geometry.Offset.m5741boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateRectAsState(androidx.compose.ui.geometry.Rect rect, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getOutputMinFrameDuration;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-782613967, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:516)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(rect, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Rect.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateIntAsState(int i, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-842612981, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:534)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(java.lang.Integer.valueOf(i), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m1175animateIntOffsetAsState8f6pmRE(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getHighSpeedVideoFpsRanges;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1010307371, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:552)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntOffset.m8720boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.State m1178animateIntSizeAsStatezTRF_AQ(long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = getHighSpeedVideoFpsRangesFor;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1749239765, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:570)");
        }
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(androidx.compose.ui.unit.IntSize.m8764boximpl(j), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntSize.INSTANCE), animationSpec2, null, null, function12, composer, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.runtime.State<T> animateValueAsState(final T t, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, androidx.compose.animation.core.AnimationSpec<T> animationSpec, T t2, java.lang.String str, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.SpringSpec springSpec;
        if ((i2 & 4) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            springSpec = (androidx.compose.animation.core.SpringSpec) rememberedValue;
        } else {
            springSpec = animationSpec;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        java.lang.String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12 = (i2 & 32) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.compose.animation.core.Animatable(t, twoWayConverter, t3, str2);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue3;
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function12, composer, (i >> 15) & 14);
        if (t3 != null && (springSpec instanceof androidx.compose.animation.core.SpringSpec)) {
            androidx.compose.animation.core.SpringSpec springSpec2 = (androidx.compose.animation.core.SpringSpec) springSpec;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(springSpec2.getVisibilityThreshold(), t3)) {
                springSpec = androidx.compose.animation.core.AnimationSpecKt.spring(springSpec2.getDampingRatio(), springSpec2.getStiffness(), t3);
            }
        }
        androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(springSpec, composer, 0);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        final kotlinx.coroutines.channels.Channel channel = (kotlinx.coroutines.channels.Channel) rememberedValue4;
        boolean changedInstance = composer.changedInstance(channel);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i & 6) == 4;
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((z | changedInstance) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.AnimateAsStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.animation.core.AnimateAsStateKt.getHighSpeedVideoSizes(kotlinx.coroutines.channels.Channel.this, t);
                    return highSpeedVideoSizes;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue5, composer, 0);
        boolean changedInstance2 = composer.changedInstance(channel);
        boolean changedInstance3 = composer.changedInstance(animatable);
        boolean changed = composer.changed(rememberUpdatedState2);
        boolean changed2 = composer.changed(rememberUpdatedState);
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if ((changedInstance2 | changedInstance3 | changed | changed2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = (kotlin.jvm.functions.Function2) new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1(channel, animatable, rememberUpdatedState2, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue6);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(channel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer, 0);
        androidx.compose.runtime.State<T> state = (androidx.compose.runtime.State) mutableState.getValue();
        if (state == null) {
            state = animatable.asState();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return state;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ androidx.compose.runtime.State animateValueAsState(java.lang.Object obj, androidx.compose.animation.core.TwoWayConverter twoWayConverter, androidx.compose.animation.core.AnimationSpec animationSpec, java.lang.Object obj2, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.animation.core.AnimationSpec animationSpec2;
        if ((i2 & 4) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            animationSpec2 = (androidx.compose.animation.core.SpringSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        java.lang.Object obj3 = (i2 & 8) != 0 ? null : obj2;
        kotlin.jvm.functions.Function1 function12 = (i2 & 16) != 0 ? null : function1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-846382129, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:591)");
        }
        int i3 = i & 8;
        androidx.compose.runtime.State animateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", function12, composer, i3 | 24576 | (i & 14) | (i & 112) | (i & 896) | (i3 << 9) | (i & 7168) | ((i << 3) & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighSpeedVideoFpsRanges(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super T, kotlin.Unit>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> androidx.compose.animation.core.AnimationSpec<T> getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State<? extends androidx.compose.animation.core.AnimationSpec<T>> state) {
        return state.getValue();
    }
}
