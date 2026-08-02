package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001aj\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\u001a\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a;\u0010\u001f\u001a\u00020\u0001*\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010$\u001aO\u0010%\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b&\u0010'\u001aY\u0010%\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b(\u0010)\u001aA\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b*\u0010+\u001aK\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b,\u0010-\u001aI\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b&\u0010.\u001a5\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0004\b/\u00100\u001a-\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0004\b1\u00102\u001a3\u00103\u001a\u00020\u0001*\u00020\u00122\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109\u001a#\u0010:\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0002¢\u0006\u0004\b;\u0010<\u001a3\u0010=\u001a\u00020\u0001*\u00020\u00122\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0002¢\u0006\u0004\b>\u00109\u001a;\u0010?\u001a\u00020\u0001*\u00020\u00122\u0006\u00104\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00106\u001a\u000207H\u0002¢\u0006\u0004\b@\u0010A\"\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010E\"\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010E\"\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010E\"\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010E\"\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010E\"\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010E\"\u0016\u0010R\u001a\u00020\u000fX\u0080\u0004¢\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010T\"\u0016\u0010V\u001a\u00020\u000fX\u0080\u0004¢\u0006\n\n\u0002\u0010U\u001a\u0004\bW\u0010T\"\u0016\u0010X\u001a\u00020\u000fX\u0080\u0004¢\u0006\n\n\u0002\u0010U\u001a\u0004\bY\u0010T\"\u0016\u0010Z\u001a\u00020\u000fX\u0080\u0004¢\u0006\n\n\u0002\u0010U\u001a\u0004\b[\u0010T\"\u000e\u0010\\\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010^\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010_\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010`\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010a\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010b\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010c\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010d\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010e\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010f\u001a\u00020gX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010i\"\u0014\u0010j\u001a\u00020gX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010i\"\u000e\u0010l\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010m\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010n\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010o\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010p\u001a\u00020]X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010q\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"LinearProgressIndicator", "", "progress", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "trackColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "LinearProgressIndicator-_5eSR-E", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "gapSize", "Landroidx/compose/ui/unit/Dp;", "drawStopIndicator", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "LinearProgressIndicator-GJbTh5U", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJIFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-rIrjwxo", "(Landroidx/compose/ui/Modifier;JJIFLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawLinearIndicator", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "CircularProgressIndicator", "CircularProgressIndicator-DUhRLBM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-IyT6zlY", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-4lLiAd8", "(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorTrack", "drawCircularIndicatorTrack-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "circularIndeterminateGlobalRotationAnimationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "getCircularIndeterminateGlobalRotationAnimationSpec", "()Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "circularIndeterminateRotationAnimationSpec", "getCircularIndeterminateRotationAnimationSpec", "circularIndeterminateProgressAnimationSpec", "getCircularIndeterminateProgressAnimationSpec", "linearIndeterminateFirstLineHeadAnimationSpec", "getLinearIndeterminateFirstLineHeadAnimationSpec", "linearIndeterminateFirstLineTailAnimationSpec", "getLinearIndeterminateFirstLineTailAnimationSpec", "linearIndeterminateSecondLineHeadAnimationSpec", "getLinearIndeterminateSecondLineHeadAnimationSpec", "linearIndeterminateSecondLineTailAnimationSpec", "getLinearIndeterminateSecondLineTailAnimationSpec", "LinearIndicatorWidth", "getLinearIndicatorWidth", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "LinearIndicatorHeight", "getLinearIndicatorHeight", "StopIndicatorTrailingSpace", "getStopIndicatorTrailingSpace", "CircularIndicatorDiameter", "getCircularIndicatorDiameter", "LinearAnimationDuration", "", "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "FirstLineHeadDelay", "FirstLineTailDelay", "SecondLineHeadDelay", "SecondLineTailDelay", "LinearIndeterminateProgressEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getLinearIndeterminateProgressEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "CircularProgressEasing", "getCircularProgressEasing", "CircularIndeterminateMinProgress", "CircularIndeterminateMaxProgress", "CircularAnimationProgressDuration", "CircularAnimationAdditionalRotationDelay", "CircularAnimationAdditionalRotationDuration", "CircularAdditionalRotationDegreesTarget", "CircularGlobalRotationDegreesTarget", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    public static final float CircularAdditionalRotationDegreesTarget = 360.0f;
    public static final int CircularAnimationAdditionalRotationDelay = 1500;
    public static final int CircularAnimationAdditionalRotationDuration = 300;
    public static final int CircularAnimationProgressDuration = 6000;
    public static final float CircularGlobalRotationDegreesTarget = 1080.0f;
    public static final float CircularIndeterminateMaxProgress = 0.87f;
    public static final float CircularIndeterminateMinProgress = 0.1f;
    public static final int FirstLineHeadDelay = 0;
    public static final int FirstLineHeadDuration = 1000;
    public static final int FirstLineTailDelay = 250;
    public static final int FirstLineTailDuration = 1000;
    public static final int LinearAnimationDuration = 1750;
    public static final int SecondLineHeadDelay = 650;
    public static final int SecondLineHeadDuration = 850;
    public static final int SecondLineTailDelay = 900;
    public static final int SecondLineTailDuration = 850;
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(240.0f);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.material3.tokens.LinearProgressIndicatorTokens.INSTANCE.m4790getHeightD9Ej5fM();
    private static final float getOutputMinFrameDuration = androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.material3.tokens.CircularProgressIndicatorTokens.INSTANCE.m4499getSizeD9Ej5fM();
    private static final androidx.compose.animation.core.CubicBezierEasing getHighSpeedVideoFpsRangesFor = androidx.compose.material3.tokens.MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier();
    private static final androidx.compose.animation.core.CubicBezierEasing getHighResolutionOutputSizeshNQ4ISI = androidx.compose.material3.tokens.MotionTokens.INSTANCE.getEasingStandardCubicBezier();

    public static /* synthetic */ float $r8$lambda$Uxtam1ISvwqfxK40pyTfv5C0cZc(float f) {
        return f;
    }

    public static /* synthetic */ float $r8$lambda$zw5ithL3krYaa3KeDZ9TyT6BPOU(float f) {
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005e  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize` and `drawStopIndicator`, see `LegacyLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @kotlin.ReplaceWith(expression = "LinearProgressIndicator(progress, modifier, color, trackColor, strokeCap, gapSize, drawStopIndicator)", imports = {}))
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3623LinearProgressIndicator_5eSRE(final kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, long j, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        long j4;
        int i5;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        long j5;
        int i8;
        int i9;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1796992155);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        companion = modifier2;
                        j5 = j4;
                        i7 = i4;
                    } else {
                        companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                        }
                        if ((i3 & 8) != 0) {
                            j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            i6 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw();
                        }
                        i7 = i4;
                        j5 = j4;
                    }
                    int i11 = i6;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1796992155, i7, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:100)");
                    }
                    m3620LinearProgressIndicatorGJbTh5U(function0, companion, j3, j5, i11, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3600getLinearIndicatorTrackGapSizeD9Ej5fM(), null, startRestartGroup, (i7 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344), 64);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    i6 = i11;
                    j4 = j5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final long j6 = j3;
                    final long j7 = j4;
                    final int i12 = i6;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.m3611$r8$lambda$xfMRsPZk77vZ4XK4higJSnyvKo(kotlin.jvm.functions.Function0.this, modifier3, j6, j7, i12, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* renamed from: LinearProgressIndicator-GJbTh5U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3620LinearProgressIndicatorGJbTh5U(final kotlin.jvm.functions.Function0<java.lang.Float> function0, androidx.compose.ui.Modifier modifier, long j, long j2, int i, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        final long j3;
        long j4;
        int i5;
        int i6;
        int i7;
        float f2;
        final float f3;
        final int i8;
        final long j5;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function12;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        final int m3601getLinearStrokeCapKaPHkGw;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function13;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-339970038);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 16384 : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changedInstance(function1)) ? 1048576 : 524288;
                }
                if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        function13 = function1;
                        companion = modifier2;
                        m3601getLinearStrokeCapKaPHkGw = i6;
                    } else {
                        companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i3 & 4) != 0) {
                            j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        m3601getLinearStrokeCapKaPHkGw = i5 != 0 ? androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw() : i6;
                        if (i7 != 0) {
                            f2 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3600getLinearIndicatorTrackGapSizeD9Ej5fM();
                        }
                        if ((i3 & 64) != 0) {
                            boolean z = (((i4 & 896) ^ 384) > 256 && startRestartGroup.changed(j3)) || (i4 & 384) == 256;
                            boolean z2 = (57344 & i4) == 16384;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$6CX_wapx2RQSxmLL4RXBiw7s8rM(j3, m3601getLinearStrokeCapKaPHkGw, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                            i4 &= -3670017;
                        } else {
                            function13 = function1;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-339970038, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                    }
                    boolean z3 = (i4 & 14) == 4;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return java.lang.Float.valueOf(androidx.compose.material3.ProgressIndicatorKt.m3603$r8$lambda$4dD_KQh3SBvg6BVByWzxsfa4tg(kotlin.jvm.functions.Function0.this));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    androidx.compose.ui.Modifier then = companion.then(androidx.compose.material3.internal.AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds());
                    boolean changed = startRestartGroup.changed(function02);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$MEfbtl1PP4BnUSvRi30OfkL69IY(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.ui.Modifier m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(then, true, (kotlin.jvm.functions.Function1) rememberedValue3), getHighSpeedVideoSizes, getHighSpeedVideoFpsRanges);
                    boolean z4 = (57344 & i4) == 16384;
                    boolean z5 = (458752 & i4) == 131072;
                    boolean changed2 = startRestartGroup.changed(function02);
                    androidx.compose.ui.Modifier modifier3 = companion;
                    boolean z6 = (((i4 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j4)) || (i4 & 3072) == 2048;
                    boolean z7 = (((i4 & 896) ^ 384) > 256 && startRestartGroup.changed(j3)) || (i4 & 384) == 256;
                    final long j6 = j3;
                    boolean z8 = (((3670016 & i4) ^ 1572864) > 1048576 && startRestartGroup.changed(function13)) || (i4 & 1572864) == 1048576;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z8 | z7 | z5 | z4 | changed2 | z6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final int i10 = m3601getLinearStrokeCapKaPHkGw;
                        final float f4 = f2;
                        final long j7 = j4;
                        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function14 = function13;
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$cZzLTIqoMGp_wry5UELhD8UF2as(i10, f4, function02, j7, j6, function14, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.foundation.CanvasKt.Canvas(m1742sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    f3 = f2;
                    function12 = function13;
                    j5 = j6;
                    i8 = m3601getLinearStrokeCapKaPHkGw;
                    modifier2 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f3 = f2;
                    i8 = i6;
                    j5 = j3;
                    function12 = function1;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    final long j8 = j4;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$lW9qydqJgESRHMhwX4HAyKOWWtI(kotlin.jvm.functions.Function0.this, modifier4, j5, j8, i8, f3, function12, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0083  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyIndeterminateLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @kotlin.ReplaceWith(expression = "LinearProgressIndicator(modifier, color, trackColor, strokeCap, gapSize)", imports = {}))
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3619LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier modifier, long j, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        long j3;
        long j4;
        int i5;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int m3601getLinearStrokeCapKaPHkGw;
        int i6;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-476865359);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i7 = 32;
                    i4 |= i7;
                }
            } else {
                j3 = j;
            }
            i7 = 16;
            i4 |= i7;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i6 = 256;
                    i4 |= i6;
                }
            } else {
                j4 = j2;
            }
            i6 = 128;
            i4 |= i6;
        } else {
            j4 = j2;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 2048 : 1024;
            if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    companion = modifier2;
                } else {
                    companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i9 != 0) {
                        m3601getLinearStrokeCapKaPHkGw = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw();
                        long j5 = j4;
                        int i10 = i4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-476865359, i10, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:219)");
                        }
                        m3625LinearProgressIndicatorrIrjwxo(companion, j3, j5, m3601getLinearStrokeCapKaPHkGw, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3600getLinearIndicatorTrackGapSizeD9Ej5fM(), startRestartGroup, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        j4 = j5;
                        i5 = m3601getLinearStrokeCapKaPHkGw;
                    }
                }
                m3601getLinearStrokeCapKaPHkGw = i5;
                long j52 = j4;
                int i102 = i4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m3625LinearProgressIndicatorrIrjwxo(companion, j3, j52, m3601getLinearStrokeCapKaPHkGw, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3600getLinearIndicatorTrackGapSizeD9Ej5fM(), startRestartGroup, (i102 & 14) | 24576 | (i102 & 112) | (i102 & 896) | (i102 & 7168), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                j4 = j52;
                i5 = m3601getLinearStrokeCapKaPHkGw;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final long j6 = j3;
                final long j7 = j4;
                final int i11 = i5;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$vg55v0LZPKQ0xBrln7LawjCc3UI(androidx.compose.ui.Modifier.this, j6, j7, i11, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025e  */
    /* renamed from: LinearProgressIndicator-rIrjwxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3625LinearProgressIndicatorrIrjwxo(androidx.compose.ui.Modifier modifier, long j, long j2, int i, float f, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        long j3;
        long j4;
        int i5;
        int i6;
        final float f2;
        final long j5;
        final int i7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(567589233);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            j4 = j2;
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 2048 : 1024;
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        companion = modifier2;
                    } else {
                        companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                            i4 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i9 != 0) {
                            i5 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw();
                        }
                        if (i6 != 0) {
                            f2 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3600getLinearIndicatorTrackGapSizeD9Ej5fM();
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(567589233, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:254)");
                    }
                    androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, getLinearIndeterminateFirstLineHeadAnimationSpec(), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat2 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, getLinearIndeterminateFirstLineTailAnimationSpec(), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat3 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, getLinearIndeterminateSecondLineHeadAnimationSpec(), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat4 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, getLinearIndeterminateSecondLineTailAnimationSpec(), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    androidx.compose.ui.Modifier modifier3 = companion;
                    androidx.compose.ui.Modifier m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion.then(androidx.compose.material3.internal.AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds())), getHighSpeedVideoSizes, getHighSpeedVideoFpsRanges);
                    boolean z = (i4 & 7168) == 2048;
                    boolean z2 = (57344 & i4) == 16384;
                    boolean changed = startRestartGroup.changed(animateFloat);
                    boolean z3 = (((i4 & 896) ^ 384) > 256 && startRestartGroup.changed(j4)) || (i4 & 384) == 256;
                    boolean changed2 = startRestartGroup.changed(animateFloat2);
                    final long j6 = j4;
                    boolean z4 = (((i4 & 112) ^ 48) > 32 && startRestartGroup.changed(j3)) || (i4 & 48) == 32;
                    boolean changed3 = startRestartGroup.changed(animateFloat3);
                    boolean changed4 = startRestartGroup.changed(animateFloat4);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changed2 | z | z2 | changed | z3 | z4 | changed3 | changed4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final int i10 = i5;
                        final float f3 = f2;
                        final long j7 = j3;
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$TF8fZlbBNDFsONMn06PGu5RSrVU(i10, f3, animateFloat, j6, animateFloat2, j7, animateFloat3, animateFloat4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.foundation.CanvasKt.Canvas(m1742sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    i7 = i5;
                    j5 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j5 = j4;
                    i7 = i5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    final long j8 = j3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$C7C1JBOkR4s_tWQhDm8EvzvrSE0(androidx.compose.ui.Modifier.this, j8, j5, i7, f2, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0058  */
    @kotlin.Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.ReplaceWith(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3622LinearProgressIndicator_5eSRE(final float f, androidx.compose.ui.Modifier modifier, long j, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        long j4;
        int i5;
        int i6;
        final long j5;
        long j6;
        final int i7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int m3601getLinearStrokeCapKaPHkGw;
        long j7;
        boolean z;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(905419617);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            m3601getLinearStrokeCapKaPHkGw = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw();
                            j7 = j3;
                            j6 = j4;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:359)");
                            }
                            z = (i4 & 14) == 4;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return java.lang.Float.valueOf(androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$Uxtam1ISvwqfxK40pyTfv5C0cZc(f));
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            m3620LinearProgressIndicatorGJbTh5U((kotlin.jvm.functions.Function0) rememberedValue, modifier2, j7, j6, m3601getLinearStrokeCapKaPHkGw, 0.0f, null, startRestartGroup, i4 & 65520, 96);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            i7 = m3601getLinearStrokeCapKaPHkGw;
                            j5 = j7;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                    }
                    j7 = j3;
                    j6 = j4;
                    m3601getLinearStrokeCapKaPHkGw = i6;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if ((i4 & 14) == 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Float.valueOf(androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$Uxtam1ISvwqfxK40pyTfv5C0cZc(f));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    m3620LinearProgressIndicatorGJbTh5U((kotlin.jvm.functions.Function0) rememberedValue, modifier2, j7, j6, m3601getLinearStrokeCapKaPHkGw, 0.0f, null, startRestartGroup, i4 & 65520, 96);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i7 = m3601getLinearStrokeCapKaPHkGw;
                    j5 = j7;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j5 = j3;
                    j6 = j4;
                    i7 = i6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = modifier2;
                    final long j8 = j6;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$HMLzJ9oYzB7cC0_dTMs71Us6P3U(f, modifier3, j5, j8, i7, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005c  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3624LinearProgressIndicatoreaDK9VM(final float f, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        long j4;
        androidx.compose.ui.Modifier.Companion companion;
        final long j5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        long linearTrackColor;
        long j6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-372717133);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                j3 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                } else {
                    companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        linearTrackColor = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                        j6 = j3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-372717133, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:376)");
                        }
                        m3622LinearProgressIndicator_5eSRE(f, companion, j6, linearTrackColor, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        j3 = j6;
                        j5 = linearTrackColor;
                    }
                }
                j6 = j3;
                linearTrackColor = j4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m3622LinearProgressIndicator_5eSRE(f, companion, j6, linearTrackColor, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                j3 = j6;
                j5 = linearTrackColor;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j5 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final long j7 = j3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$J71XslCLWCpx9u2hcmbBubs1L9M(f, modifier3, j7, j5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m3621LinearProgressIndicatorRIQooxk(androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j3;
        long j4;
        androidx.compose.ui.Modifier.Companion companion;
        long j5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(585576195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
            } else {
                companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearColor(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(startRestartGroup, 6);
                    i3 &= -897;
                }
            }
            int i5 = i3;
            j5 = j3;
            long j6 = j4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(585576195, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:391)");
            }
            m3625LinearProgressIndicatorrIrjwxo(companion, j5, j6, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3601getLinearStrokeCapKaPHkGw(), 0.0f, startRestartGroup, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            j4 = j6;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            j5 = j3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier3 = companion;
            final long j7 = j5;
            final long j8 = j4;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ProgressIndicatorKt.m3610$r8$lambda$wqopBnBFOO2Owg17BjmyjKcKD0(androidx.compose.ui.Modifier.this, j7, j8, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        float f4 = intBitsToFloat2 / 2.0f;
        boolean z = drawScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr;
        float f5 = (z ? f : 1.0f - f2) * intBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * intBitsToFloat;
        if (androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw()) || intBitsToFloat2 > intBitsToFloat) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f5) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f6) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L)), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = intBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (java.lang.Math.abs(f2 - f) > 0.0f) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f5) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f8) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L)), f3, i, null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005e  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyCircularProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @kotlin.ReplaceWith(expression = "CircularProgressIndicator(progress, modifier, color, strokeWidth, trackColor, strokeCap, gapSize)", imports = {}))
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3614CircularProgressIndicatorDUhRLBM(final kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        int i5;
        float f2;
        long j4;
        int i6;
        int i7;
        final long j5;
        final long j6;
        final int i8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-761680467);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 256;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 128;
                i4 |= i10;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i9 = 16384;
                            i4 |= i9;
                        }
                    } else {
                        j4 = j2;
                    }
                    i9 = 8192;
                    i4 |= i9;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                f2 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3599getCircularStrokeWidthD9Ej5fM();
                            }
                            if ((i3 & 16) != 0) {
                                j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(startRestartGroup, 6);
                                i4 &= -57345;
                            }
                            if (i6 != 0) {
                                i7 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3596getCircularDeterminateStrokeCapKaPHkGw();
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        float f3 = f2;
                        i8 = i7;
                        int i12 = i4;
                        long j7 = j4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-761680467, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                        }
                        m3615CircularProgressIndicatorIyT6zlY(function0, modifier2, j3, f3, j7, i8, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3598getCircularIndicatorTrackGapSizeD9Ej5fM(), startRestartGroup, (i12 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        f2 = f3;
                        j5 = j3;
                        j6 = j7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j5 = j3;
                        j6 = j4;
                        i8 = i7;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        final float f4 = f2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$G7UPrpsO3sjPwg0KXN9G1bNK0q4(kotlin.jvm.functions.Function0.this, modifier3, j5, f4, j6, i8, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-IyT6zlY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3615CircularProgressIndicatorIyT6zlY(final kotlin.jvm.functions.Function0<java.lang.Float> function0, androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, float f2, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        float f3;
        long j4;
        int i6;
        int i7;
        int i8;
        float f4;
        androidx.compose.ui.Modifier modifier2;
        final long j5;
        final long j6;
        final float f5;
        final float f6;
        final int i9;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        float m3599getCircularStrokeWidthD9Ej5fM;
        long j7;
        int m3596getCircularDeterminateStrokeCapKaPHkGw;
        float m3598getCircularIndicatorTrackGapSizeD9Ej5fM;
        boolean z;
        java.lang.Object rememberedValue;
        boolean changed;
        java.lang.Object rememberedValue2;
        boolean changed2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean changedInstance;
        boolean z6;
        java.lang.Object rememberedValue3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1798883595);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    j4 = j2;
                    i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i7 = i;
                } else {
                    i7 = i;
                    if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(f4) ? 1048576 : 524288;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        companion = modifier;
                        j7 = j4;
                        m3599getCircularStrokeWidthD9Ej5fM = f3;
                        m3596getCircularDeterminateStrokeCapKaPHkGw = i7;
                    } else {
                        companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if ((i3 & 4) != 0) {
                            j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        m3599getCircularStrokeWidthD9Ej5fM = i5 != 0 ? androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3599getCircularStrokeWidthD9Ej5fM() : f3;
                        if ((i3 & 16) != 0) {
                            j7 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularDeterminateTrackColor(startRestartGroup, 6);
                            i4 &= -57345;
                        } else {
                            j7 = j4;
                        }
                        m3596getCircularDeterminateStrokeCapKaPHkGw = i6 != 0 ? androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3596getCircularDeterminateStrokeCapKaPHkGw() : i7;
                        if (i8 != 0) {
                            m3598getCircularIndicatorTrackGapSizeD9Ej5fM = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3598getCircularIndicatorTrackGapSizeD9Ej5fM();
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1798883595, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)");
                            }
                            z = (i4 & 14) != 4;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda24
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return java.lang.Float.valueOf(androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$0DKnE3aXi7vJNdMUKA2y9n_M88s(kotlin.jvm.functions.Function0.this));
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                            final androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(m3599getCircularStrokeWidthD9Ej5fM), 0.0f, m3596getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                            changed = startRestartGroup.changed(function02);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda25
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$wTVy5JkB0Yl6sDBKr_bW2FjmDy0(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, (kotlin.jvm.functions.Function1) rememberedValue2), Camera2StreamConfigurationMap);
                            changed2 = startRestartGroup.changed(function02);
                            modifier2 = companion;
                            z2 = (i4 & 458752) != 131072;
                            z3 = (3670016 & i4) != 1048576;
                            z4 = (i4 & 7168) != 2048;
                            final float f7 = m3599getCircularStrokeWidthD9Ej5fM;
                            z5 = (((57344 & i4) ^ 24576) <= 16384 && startRestartGroup.changed(j7)) || (i4 & 24576) == 16384;
                            changedInstance = startRestartGroup.changedInstance(stroke);
                            final long j8 = j7;
                            z6 = (((i4 & 896) ^ 384) <= 256 && startRestartGroup.changed(j3)) || (i4 & 384) == 256;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!(z2 | changed2 | z3 | z4 | z5 | changedInstance | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                final int i11 = m3596getCircularDeterminateStrokeCapKaPHkGw;
                                final float f8 = m3598getCircularIndicatorTrackGapSizeD9Ej5fM;
                                final long j9 = j3;
                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda26
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$iNxOS4TIxTNGqKoDObVugw7X9WM(kotlin.jvm.functions.Function0.this, i11, f8, f7, j8, stroke, j9, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.foundation.CanvasKt.Canvas(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            f6 = m3598getCircularIndicatorTrackGapSizeD9Ej5fM;
                            f5 = f7;
                            j5 = j8;
                            i9 = m3596getCircularDeterminateStrokeCapKaPHkGw;
                            j6 = j3;
                        }
                    }
                    m3598getCircularIndicatorTrackGapSizeD9Ej5fM = f4;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if ((i4 & 14) != 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Float.valueOf(androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$0DKnE3aXi7vJNdMUKA2y9n_M88s(kotlin.jvm.functions.Function0.this));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue;
                    final androidx.compose.ui.graphics.drawscope.Stroke stroke2 = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(m3599getCircularStrokeWidthD9Ej5fM), 0.0f, m3596getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    changed = startRestartGroup.changed(function022);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$wTVy5JkB0Yl6sDBKr_bW2FjmDy0(kotlin.jvm.functions.Function0.this, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.ui.Modifier m1740size3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, (kotlin.jvm.functions.Function1) rememberedValue2), Camera2StreamConfigurationMap);
                    changed2 = startRestartGroup.changed(function022);
                    modifier2 = companion;
                    if ((i4 & 458752) != 131072) {
                    }
                    if ((3670016 & i4) != 1048576) {
                    }
                    if ((i4 & 7168) != 2048) {
                    }
                    final float f72 = m3599getCircularStrokeWidthD9Ej5fM;
                    if (((57344 & i4) ^ 24576) <= 16384) {
                    }
                    changedInstance = startRestartGroup.changedInstance(stroke2);
                    final long j82 = j7;
                    if (((i4 & 896) ^ 384) <= 256) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!(z2 | changed2 | z3 | z4 | z5 | changedInstance | z6)) {
                    }
                    final int i112 = m3596getCircularDeterminateStrokeCapKaPHkGw;
                    final float f82 = m3598getCircularIndicatorTrackGapSizeD9Ej5fM;
                    final long j92 = j3;
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$iNxOS4TIxTNGqKoDObVugw7X9WM(kotlin.jvm.functions.Function0.this, i112, f82, f72, j82, stroke2, j92, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.compose.foundation.CanvasKt.Canvas(m1740size3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    f6 = m3598getCircularIndicatorTrackGapSizeD9Ej5fM;
                    f5 = f72;
                    j5 = j82;
                    i9 = m3596getCircularDeterminateStrokeCapKaPHkGw;
                    j6 = j3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    j5 = j4;
                    j6 = j3;
                    f5 = f3;
                    f6 = f4;
                    i9 = i7;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.m3608$r8$lambda$h3kSGqaida1I2Eb0AgYL672fu0(kotlin.jvm.functions.Function0.this, modifier3, j6, f5, j5, i9, f6, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f3 = f;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0079  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `gapSize`", replaceWith = @kotlin.ReplaceWith(expression = "CircularProgressIndicator(modifier, color, strokeWidth, trackColor, strokeCap, gapSize)", imports = {}))
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3616CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        long j3;
        float f2;
        long j4;
        int i5;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        final float f3;
        final int i7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        long j5;
        int m3597getCircularIndeterminateStrokeCapKaPHkGw;
        float f4;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-115871647);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i10 = 32;
                    i4 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 16;
            i4 |= i10;
        } else {
            j3 = j;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 2048;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 1024;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        companion = modifier2;
                    } else {
                        companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i4 &= -113;
                        }
                        if (i12 != 0) {
                            f2 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3599getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 8) != 0) {
                            j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            i8 = i4;
                            j5 = j4;
                            m3597getCircularIndeterminateStrokeCapKaPHkGw = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3597getCircularIndeterminateStrokeCapKaPHkGw();
                            f4 = f2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:594)");
                            }
                            m3612CircularProgressIndicator4lLiAd8(companion, j3, f4, j5, m3597getCircularIndeterminateStrokeCapKaPHkGw, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3598getCircularIndicatorTrackGapSizeD9Ej5fM(), startRestartGroup, (i8 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            i7 = m3597getCircularIndeterminateStrokeCapKaPHkGw;
                            j4 = j5;
                            f3 = f4;
                        }
                    }
                    i8 = i4;
                    f4 = f2;
                    j5 = j4;
                    m3597getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    m3612CircularProgressIndicator4lLiAd8(companion, j3, f4, j5, m3597getCircularIndeterminateStrokeCapKaPHkGw, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3598getCircularIndicatorTrackGapSizeD9Ej5fM(), startRestartGroup, (i8 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i7 = m3597getCircularIndeterminateStrokeCapKaPHkGw;
                    j4 = j5;
                    f3 = f4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    f3 = f2;
                    i7 = i6;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final long j6 = j3;
                    final long j7 = j4;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.m3604$r8$lambda$5dKMFI4nCOs1HfnN1qog4qwh_U(androidx.compose.ui.Modifier.this, j6, f3, j7, i7, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-4lLiAd8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3612CircularProgressIndicator4lLiAd8(androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, float f2, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        float f3;
        long j4;
        int i5;
        int i6;
        int i7;
        float f4;
        androidx.compose.ui.Modifier modifier2;
        final float f5;
        final long j5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        long j6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(333154241);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f3 = f;
            i4 |= startRestartGroup.changed(f3) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 16384 : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        companion = modifier;
                        j6 = j4;
                    } else {
                        companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if ((i3 & 2) != 0) {
                            j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i4 &= -113;
                        }
                        if (i9 != 0) {
                            f3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3599getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 8) != 0) {
                            j6 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularIndeterminateTrackColor(startRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            j6 = j4;
                        }
                        if (i5 != 0) {
                            i6 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3597getCircularIndeterminateStrokeCapKaPHkGw();
                        }
                        if (i7 != 0) {
                            f4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3598getCircularIndicatorTrackGapSizeD9Ej5fM();
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(333154241, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                    }
                    final androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(f3), 0.0f, i6, 0, null, 26, null);
                    androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1080.0f, getCircularIndeterminateGlobalRotationAnimationSpec(), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat2 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 360.0f, getCircularIndeterminateRotationAnimationSpec(), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloat3 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.1f, 0.87f, getCircularIndeterminateProgressAnimationSpec(), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                    androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion), Camera2StreamConfigurationMap);
                    boolean changed = startRestartGroup.changed(animateFloat3);
                    androidx.compose.ui.Modifier modifier3 = companion;
                    boolean z = (i4 & 57344) == 16384;
                    final float f6 = f3;
                    boolean z2 = (458752 & i4) == 131072;
                    final float f7 = f4;
                    boolean z3 = (i4 & 896) == 256;
                    boolean changed2 = startRestartGroup.changed(animateFloat);
                    boolean changed3 = startRestartGroup.changed(animateFloat2);
                    boolean z4 = (((i4 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j6)) || (i4 & 3072) == 2048;
                    boolean changedInstance = startRestartGroup.changedInstance(stroke);
                    final long j7 = j6;
                    boolean z5 = (((i4 & 112) ^ 48) > 32 && startRestartGroup.changed(j3)) || (i4 & 48) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z | changed | z2 | z3 | changed2 | changed3 | z4 | changedInstance | z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final int i10 = i6;
                        final long j8 = j3;
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                highSpeedVideoFpsRangesFor = androidx.compose.material3.ProgressIndicatorKt.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State.this, i10, f7, f6, animateFloat, animateFloat2, j7, stroke, j8, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                return highSpeedVideoFpsRangesFor;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.foundation.CanvasKt.Canvas(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    f4 = f7;
                    j5 = j7;
                    f5 = f6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    f5 = f3;
                    j5 = j4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    final long j9 = j3;
                    final int i11 = i6;
                    final float f8 = f4;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.m3609$r8$lambda$vnlHHjSGDjEnbcrAVLNWgptI3Y(androidx.compose.ui.Modifier.this, j9, f5, j5, i11, f8, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State state, int i, float f, float f2, androidx.compose.runtime.State state2, androidx.compose.runtime.State state3, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke, long j2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float floatValue = ((java.lang.Number) state.getValue()).floatValue() * 360.0f;
        float m8601constructorimpl = (((androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw()) || java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)) > java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) ? f : androidx.compose.ui.unit.Dp.m8601constructorimpl(f + f2)) / ((float) (drawScope.mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
        float floatValue2 = ((java.lang.Number) state2.getValue()).floatValue();
        float floatValue3 = ((java.lang.Number) state3.getValue()).floatValue();
        long mo6530getCenterF1C5BW0 = drawScope.mo6530getCenterF1C5BW0();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
        long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6459rotateUv8p0NA(floatValue2 + floatValue3, mo6530getCenterF1C5BW0);
            getHighSpeedVideoFpsRanges(drawScope, java.lang.Math.min(floatValue, m8601constructorimpl) + floatValue, (360.0f - floatValue) - (java.lang.Math.min(floatValue, m8601constructorimpl) * 2.0f), j, stroke);
            getHighSpeedVideoFpsRanges(drawScope, 0.0f, floatValue, j2, stroke);
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0062  */
    @kotlin.Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.ReplaceWith(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3613CircularProgressIndicatorDUhRLBM(final float f, androidx.compose.ui.Modifier modifier, long j, float f2, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        int i5;
        float f3;
        long j4;
        int i6;
        int i7;
        final long j5;
        final float f4;
        final int i8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int m3596getCircularDeterminateStrokeCapKaPHkGw;
        int i9;
        float f5;
        long j6;
        boolean z;
        java.lang.Object rememberedValue;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1472321743);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i11 = 256;
                        i4 |= i11;
                    }
                } else {
                    j3 = j;
                }
                i11 = 128;
                i4 |= i11;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f3 = f2;
                i4 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i10 = 16384;
                            i4 |= i10;
                        }
                    } else {
                        j4 = j2;
                    }
                    i10 = 8192;
                    i4 |= i10;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                j3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                f3 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3599getCircularStrokeWidthD9Ej5fM();
                            }
                            if ((i3 & 16) != 0) {
                                j4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(startRestartGroup, 6);
                                i4 &= -57345;
                            }
                            if (i6 != 0) {
                                m3596getCircularDeterminateStrokeCapKaPHkGw = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3596getCircularDeterminateStrokeCapKaPHkGw();
                                i9 = i4;
                                f5 = f3;
                                j6 = j4;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1472321743, i9, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                                }
                                z = (i9 & 14) == 4;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda21
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return java.lang.Float.valueOf(androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$zw5ithL3krYaa3KeDZ9TyT6BPOU(f));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                m3615CircularProgressIndicatorIyT6zlY((kotlin.jvm.functions.Function0) rememberedValue, modifier2, j3, f5, j6, m3596getCircularDeterminateStrokeCapKaPHkGw, 0.0f, startRestartGroup, i9 & 524272, 64);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                j4 = j6;
                                j5 = j3;
                                i8 = m3596getCircularDeterminateStrokeCapKaPHkGw;
                                f4 = f5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        i9 = i4;
                        f5 = f3;
                        j6 = j4;
                        m3596getCircularDeterminateStrokeCapKaPHkGw = i7;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        if ((i9 & 14) == 4) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return java.lang.Float.valueOf(androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$zw5ithL3krYaa3KeDZ9TyT6BPOU(f));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        m3615CircularProgressIndicatorIyT6zlY((kotlin.jvm.functions.Function0) rememberedValue, modifier2, j3, f5, j6, m3596getCircularDeterminateStrokeCapKaPHkGw, 0.0f, startRestartGroup, i9 & 524272, 64);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        j4 = j6;
                        j5 = j3;
                        i8 = m3596getCircularDeterminateStrokeCapKaPHkGw;
                        f4 = f5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j5 = j3;
                        f4 = f3;
                        i8 = i7;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        final long j7 = j4;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return androidx.compose.material3.ProgressIndicatorKt.m3606$r8$lambda$WBGlyN3dYAzlE5rGuAxF4Oik(f, modifier3, j5, f4, j7, i8, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f2;
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f2;
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005e  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3617CircularProgressIndicatorMBs18nI(final float f, androidx.compose.ui.Modifier modifier, long j, float f2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        long j2;
        int i4;
        float f3;
        androidx.compose.ui.Modifier.Companion companion;
        long j3;
        final float f4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(402841196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            j2 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            f4 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3599getCircularStrokeWidthD9Ej5fM();
                            j3 = j2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:723)");
                            }
                            m3613CircularProgressIndicatorDUhRLBM(f, companion, j3, f4, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(startRestartGroup, 6), androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3596getCircularDeterminateStrokeCapKaPHkGw(), startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }
                    }
                    j3 = j2;
                    f4 = f3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    m3613CircularProgressIndicatorDUhRLBM(f, companion, j3, f4, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(startRestartGroup, 6), androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3596getCircularDeterminateStrokeCapKaPHkGw(), startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    j3 = j2;
                    f4 = f3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final long j4 = j3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$22RpfYoFjCzBGz3JFLtSx0MXyYQ(f, modifier3, j4, f4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f3 = f2;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3618CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier modifier, long j, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j2;
        float f2;
        androidx.compose.ui.Modifier.Companion companion;
        long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float m3599getCircularStrokeWidthD9Ej5fM;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(947193756);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        j2 = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularColor(startRestartGroup, 6);
                        i3 &= -113;
                    }
                    if (i6 != 0) {
                        m3599getCircularStrokeWidthD9Ej5fM = androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3599getCircularStrokeWidthD9Ej5fM();
                        long j4 = j2;
                        int i7 = i3;
                        j3 = j4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(947193756, i7, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:740)");
                        }
                        m3612CircularProgressIndicator4lLiAd8(companion, j3, m3599getCircularStrokeWidthD9Ej5fM, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(startRestartGroup, 6), androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3597getCircularIndeterminateStrokeCapKaPHkGw(), 0.0f, startRestartGroup, (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896), 32);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        f2 = m3599getCircularStrokeWidthD9Ej5fM;
                    }
                }
                m3599getCircularStrokeWidthD9Ej5fM = f2;
                long j42 = j2;
                int i72 = i3;
                j3 = j42;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m3612CircularProgressIndicator4lLiAd8(companion, j3, m3599getCircularStrokeWidthD9Ej5fM, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(startRestartGroup, 6), androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3597getCircularIndeterminateStrokeCapKaPHkGw(), 0.0f, startRestartGroup, (i72 & 14) | 24576 | (i72 & 112) | (i72 & 896), 32);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                f2 = m3599getCircularStrokeWidthD9Ej5fM;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final long j5 = j3;
                final float f3 = f2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.ProgressIndicatorKt.m3607$r8$lambda$eVBZn8HFG2Wk27YiIfIdJEodsA(androidx.compose.ui.Modifier.this, j5, f3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)) - (2.0f * (stroke.getWidth() / 2.0f));
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j, f, f2, false, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(r0) & 4294967295L) | (java.lang.Float.floatToRawIntBits(r0) << 32)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
    }

    public static final androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> getCircularIndeterminateGlobalRotationAnimationSpec() {
        return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(6000, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
    }

    public static final androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> getCircularIndeterminateRotationAnimationSpec() {
        return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$znJlBuemfdbT0l0pmMSAxJl2gco((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> getCircularIndeterminateProgressAnimationSpec() {
        return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ProgressIndicatorKt.m3605$r8$lambda$VlsLxQJgkU0PJEDIFqFDt_xLS4((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> getLinearIndeterminateFirstLineHeadAnimationSpec() {
        return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$8J22HkfacnJII3qzJ073bMOQEdU((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> getLinearIndeterminateFirstLineTailAnimationSpec() {
        return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$IiM3O9mycC2x_B_w0mirGu13Q9k((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> getLinearIndeterminateSecondLineHeadAnimationSpec() {
        return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$yt90bCqh7BaPDDasFkmPK85zbxo((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final androidx.compose.animation.core.InfiniteRepeatableSpec<java.lang.Float> getLinearIndeterminateSecondLineTailAnimationSpec() {
        return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ProgressIndicatorKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ProgressIndicatorKt.$r8$lambda$VwNzL5Bqv0S2Xmk1ekeeT0JxzcQ((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
            }
        }), null, 0L, 6, null);
    }

    public static final float getLinearIndicatorWidth() {
        return getHighSpeedVideoSizes;
    }

    public static final float getLinearIndicatorHeight() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final float getStopIndicatorTrailingSpace() {
        return getOutputMinFrameDuration;
    }

    public static final float getCircularIndicatorDiameter() {
        return Camera2StreamConfigurationMap;
    }

    public static final androidx.compose.animation.core.CubicBezierEasing getLinearIndeterminateProgressEasing() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final androidx.compose.animation.core.CubicBezierEasing getCircularProgressEasing() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ float $r8$lambda$0DKnE3aXi7vJNdMUKA2y9n_M88s(kotlin.jvm.functions.Function0 function0) {
        float floatValue = ((java.lang.Number) function0.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            return 1.0f;
        }
        return floatValue;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$22RpfYoFjCzBGz3JFLtSx0MXyYQ(float f, androidx.compose.ui.Modifier modifier, long j, float f2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3617CircularProgressIndicatorMBs18nI(f, modifier, j, f2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4-dD_KQh3SBvg6BVByWzxsfa4tg, reason: not valid java name */
    public static /* synthetic */ float m3603$r8$lambda$4dD_KQh3SBvg6BVByWzxsfa4tg(kotlin.jvm.functions.Function0 function0) {
        float floatValue = ((java.lang.Number) function0.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            return 1.0f;
        }
        return floatValue;
    }

    /* renamed from: $r8$lambda$5dKMFI4nCOs1HfnN1qog4qwh_-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3604$r8$lambda$5dKMFI4nCOs1HfnN1qog4qwh_U(androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3616CircularProgressIndicatorLxG7B9w(modifier, j, f, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6CX_wapx2RQSxmLL4RXBiw7s8rM(long j, int i, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3595drawStopIndicatorEgI2THU(drawScope, androidx.compose.material3.ProgressIndicatorDefaults.INSTANCE.m3602getLinearTrackStopIndicatorSizeD9Ej5fM(), j, i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8J22HkfacnJII3qzJ073bMOQEdU(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 0), getHighSpeedVideoFpsRangesFor);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), 1000);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C7C1JBOkR4s_tWQhDm8EvzvrSE0(androidx.compose.ui.Modifier modifier, long j, long j2, int i, float f, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3625LinearProgressIndicatorrIrjwxo(modifier, j, j2, i, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G7UPrpsO3sjPwg0KXN9G1bNK0q4(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3614CircularProgressIndicatorDUhRLBM(function0, modifier, j, f, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HMLzJ9oYzB7cC0_dTMs71Us6P3U(float f, androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3622LinearProgressIndicator_5eSRE(f, modifier, j, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IiM3O9mycC2x_B_w0mirGu13Q9k(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 250), getHighSpeedVideoFpsRangesFor);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), 1250);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J71XslCLWCpx9u2hcmbBubs1L9M(float f, androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3624LinearProgressIndicatoreaDK9VM(f, modifier, j, j2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MEfbtl1PP4BnUSvRi30OfkL69IY(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        java.lang.Object invoke = function0.invoke();
        if (java.lang.Float.isNaN(((java.lang.Number) invoke).floatValue())) {
            invoke = null;
        }
        java.lang.Float f = (java.lang.Float) invoke;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ProgressBarRangeInfo(f != null ? f.floatValue() : 0.0f, kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TF8fZlbBNDFsONMn06PGu5RSrVU(int i, float f, androidx.compose.runtime.State state, long j, androidx.compose.runtime.State state2, long j2, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        float m8601constructorimpl = ((androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw()) || java.lang.Float.intBitsToFloat((int) (4294967295L & drawScope.mo6531getSizeNHjbRc())) > java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) ? f : androidx.compose.ui.unit.Dp.m8601constructorimpl(drawScope.mo1414toDpu2uoSUM(intBitsToFloat) + f)) / drawScope.mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)));
        if (((java.lang.Number) state.getValue()).floatValue() < 1.0f - m8601constructorimpl) {
            getHighSpeedVideoFpsRangesFor(drawScope, ((java.lang.Number) state.getValue()).floatValue() > 0.0f ? ((java.lang.Number) state.getValue()).floatValue() + m8601constructorimpl : 0.0f, 1.0f, j, intBitsToFloat, i);
        }
        if (((java.lang.Number) state.getValue()).floatValue() - ((java.lang.Number) state2.getValue()).floatValue() > 0.0f) {
            getHighSpeedVideoFpsRangesFor(drawScope, ((java.lang.Number) state.getValue()).floatValue(), ((java.lang.Number) state2.getValue()).floatValue(), j2, intBitsToFloat, i);
        }
        if (((java.lang.Number) state2.getValue()).floatValue() > m8601constructorimpl) {
            getHighSpeedVideoFpsRangesFor(drawScope, ((java.lang.Number) state3.getValue()).floatValue() > 0.0f ? ((java.lang.Number) state3.getValue()).floatValue() + m8601constructorimpl : 0.0f, ((java.lang.Number) state2.getValue()).floatValue() < 1.0f ? ((java.lang.Number) state2.getValue()).floatValue() - m8601constructorimpl : 1.0f, j, intBitsToFloat, i);
        }
        if (((java.lang.Number) state3.getValue()).floatValue() - ((java.lang.Number) state4.getValue()).floatValue() > 0.0f) {
            getHighSpeedVideoFpsRangesFor(drawScope, ((java.lang.Number) state3.getValue()).floatValue(), ((java.lang.Number) state4.getValue()).floatValue(), j2, intBitsToFloat, i);
        }
        if (((java.lang.Number) state4.getValue()).floatValue() > m8601constructorimpl) {
            getHighSpeedVideoFpsRangesFor(drawScope, 0.0f, ((java.lang.Number) state4.getValue()).floatValue() < 1.0f ? ((java.lang.Number) state4.getValue()).floatValue() - m8601constructorimpl : 1.0f, j, intBitsToFloat, i);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VlsLxQJgkU0PJE-DIFqFDt_xLS4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3605$r8$lambda$VlsLxQJgkU0PJEDIFqFDt_xLS4(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(6000);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.87f), 3000), getHighResolutionOutputSizeshNQ4ISI);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.1f), 6000);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WBG-lyN3dYA-zl-E5rGuAxF4Oik, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3606$r8$lambda$WBGlyN3dYAzlE5rGuAxF4Oik(float f, androidx.compose.ui.Modifier modifier, long j, float f2, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3613CircularProgressIndicatorDUhRLBM(f, modifier, j, f2, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VwNzL5Bqv0S2Xmk1ekeeT0JxzcQ(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 900), getHighSpeedVideoFpsRangesFor);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), LinearAnimationDuration);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cZzLTIqoMGp_wry5UELhD8UF2as(int i, float f, kotlin.jvm.functions.Function0 function0, long j, long j2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        float m8601constructorimpl = ((androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw()) || java.lang.Float.intBitsToFloat((int) (4294967295L & drawScope.mo6531getSizeNHjbRc())) > java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) ? f : androidx.compose.ui.unit.Dp.m8601constructorimpl(drawScope.mo1414toDpu2uoSUM(intBitsToFloat) + f)) / drawScope.mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)));
        float floatValue = ((java.lang.Number) function0.invoke()).floatValue();
        float min = floatValue + java.lang.Math.min(floatValue, m8601constructorimpl);
        if (min <= 1.0f) {
            getHighSpeedVideoFpsRangesFor(drawScope, min, 1.0f, j, intBitsToFloat, i);
        }
        getHighSpeedVideoFpsRangesFor(drawScope, 0.0f, floatValue, j2, intBitsToFloat, i);
        function1.invoke(drawScope);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eVBZn8HFG2Wk27YiIfIdJE-odsA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3607$r8$lambda$eVBZn8HFG2Wk27YiIfIdJEodsA(androidx.compose.ui.Modifier modifier, long j, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3618CircularProgressIndicatoraMcp0Q(modifier, j, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h3k-SGqaida1I2Eb0AgYL672fu0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3608$r8$lambda$h3kSGqaida1I2Eb0AgYL672fu0(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, float f2, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3615CircularProgressIndicatorIyT6zlY(function0, modifier, j, f, j2, i, f2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iNxOS4TIxTNGqKoDObVugw7X9WM(kotlin.jvm.functions.Function0 function0, int i, float f, float f2, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke, long j2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float floatValue = ((java.lang.Number) function0.invoke()).floatValue() * 360.0f;
        float m8601constructorimpl = (((androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(i, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw()) || java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L)) > java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) ? f : androidx.compose.ui.unit.Dp.m8601constructorimpl(f + f2)) / ((float) (drawScope.mo1414toDpu2uoSUM(java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32))) * 3.141592653589793d))) * 360.0f;
        getHighSpeedVideoFpsRanges(drawScope, 270.0f + floatValue + java.lang.Math.min(floatValue, m8601constructorimpl), (360.0f - floatValue) - (java.lang.Math.min(floatValue, m8601constructorimpl) * 2.0f), j, stroke);
        getHighSpeedVideoFpsRanges(drawScope, 270.0f, floatValue, j2, stroke);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lW9qydqJgESRHMhwX4HAyKOWWtI(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, long j, long j2, int i, float f, kotlin.jvm.functions.Function1 function1, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3620LinearProgressIndicatorGJbTh5U(function0, modifier, j, j2, i, f, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v-nlHHjSGDjEnbcrAVLNWgptI3Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3609$r8$lambda$vnlHHjSGDjEnbcrAVLNWgptI3Y(androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, float f2, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3612CircularProgressIndicator4lLiAd8(modifier, j, f, j2, i, f2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vg55v0LZPKQ0xBrln7LawjCc3UI(androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3619LinearProgressIndicator2cYBFYY(modifier, j, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wTVy5JkB0Yl6sDBKr_bW2FjmDy0(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        java.lang.Object invoke = function0.invoke();
        if (java.lang.Float.isNaN(((java.lang.Number) invoke).floatValue())) {
            invoke = null;
        }
        java.lang.Float f = (java.lang.Float) invoke;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ProgressBarRangeInfo(f != null ? f.floatValue() : 0.0f, kotlin.ranges.RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wqopBnBFOO2Owg17BjmyjKc-KD0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3610$r8$lambda$wqopBnBFOO2Owg17BjmyjKcKD0(androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3621LinearProgressIndicatorRIQooxk(modifier, j, j2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xfMRsPZk77v-Z4XK4higJSnyvKo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3611$r8$lambda$xfMRsPZk77vZ4XK4higJSnyvKo(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m3623LinearProgressIndicator_5eSRE(function0, modifier, j, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yt90bCqh7BaPDDasFkmPK85zbxo(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), SecondLineHeadDelay), getHighSpeedVideoFpsRangesFor);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), 1500);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$znJlBuemfdbT0l0pmMSAxJl2gco(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(6000);
        java.lang.Float valueOf = java.lang.Float.valueOf(90.0f);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, 300), androidx.compose.material3.tokens.MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier());
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf, 1500);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(180.0f);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, 1800);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf2, 3000);
        java.lang.Float valueOf3 = java.lang.Float.valueOf(270.0f);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf3, 3300);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf3, 4500);
        java.lang.Float valueOf4 = java.lang.Float.valueOf(360.0f);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf4, 4800);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) valueOf4, 6000);
        return kotlin.Unit.INSTANCE;
    }
}
