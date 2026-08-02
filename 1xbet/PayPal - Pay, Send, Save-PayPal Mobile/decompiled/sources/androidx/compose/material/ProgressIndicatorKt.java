package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001aA\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001aK\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!\u001aA\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010#\u001a5\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007¢\u0006\u0004\b$\u0010%\u001a-\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007¢\u0006\u0004\b&\u0010'\u001a3\u0010(\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.\u001a#\u0010/\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00102\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b3\u0010.\u001a;\u00104\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b5\u00106\"\u0010\u00107\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u0010\u00109\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u0010\u0010:\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u000e\u0010;\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S²\u0006\n\u0010T\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"increaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "LinearProgressIndicator", "", "progress", "", "modifier", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawLinearIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "CircularProgressIndicator", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "LinearIndicatorHeight", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "LinearIndicatorWidth", "CircularIndicatorDiameter", "LinearAnimationDuration", "", "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "FirstLineHeadDelay", "FirstLineTailDelay", "SecondLineHeadDelay", "SecondLineTailDelay", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "RotationsPerCycle", "RotationDuration", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "RotationAngleOffset", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "CircularEasing", "material", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m2691getStrokeWidthD9Ej5fM();
    private static final float getOutputFormats = androidx.compose.ui.unit.Dp.m8601constructorimpl(240.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing Camera2StreamConfigurationMap = new androidx.compose.animation.core.CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing getInputSizeshNQ4ISI = new androidx.compose.animation.core.CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing getHighSpeedVideoSizesFor = new androidx.compose.animation.core.CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoSizes(float f, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        final int i = measureScope.mo1412roundToPx0680j_4(f);
        long getHighSpeedVideoFpsRangesFor2 = constraints.getGetHighSpeedVideoFpsRangesFor();
        int i2 = i * 2;
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(getHighSpeedVideoFpsRangesFor2, 0, i2));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight() - i2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.this, i, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRangesFor;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, -i, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2706LinearProgressIndicator_5eSRE(final float f, androidx.compose.ui.Modifier modifier, long j, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        long j4;
        int i5;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-531984864);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
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
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    i5 = i;
                    if (startRestartGroup.changed(i5)) {
                        i6 = 16384;
                        i4 |= i6;
                    }
                } else {
                    i5 = i;
                }
                i6 = 8192;
                i4 |= i6;
            } else {
                i5 = i;
            }
            boolean z = true;
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    companion = modifier2;
                } else {
                    companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        i5 = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-531984864, i4, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:108)");
                }
                float f2 = f < 0.0f ? 0.0f : f;
                float f3 = f2 <= 1.0f ? f2 : 1.0f;
                androidx.compose.ui.Modifier increaseSemanticsBounds = increaseSemanticsBounds(companion);
                java.lang.Float valueOf = java.lang.Float.valueOf(f3);
                if (java.lang.Float.isNaN(valueOf.floatValue())) {
                    valueOf = null;
                }
                androidx.compose.ui.Modifier m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(increaseSemanticsBounds, valueOf != null ? valueOf.floatValue() : 0.0f, null, 0, 6, null), getOutputFormats, getHighSpeedVideoFpsRanges);
                boolean z2 = (((i4 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j4)) || (i4 & 3072) == 2048;
                boolean z3 = (((57344 & i4) ^ 24576) > 16384 && startRestartGroup.changed(i5)) || (i4 & 24576) == 16384;
                boolean changed = startRestartGroup.changed(f3);
                if ((((i4 & 896) ^ 384) <= 256 || !startRestartGroup.changed(j3)) && (i4 & 384) != 256) {
                    z = false;
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z2 | z3 | changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final long j5 = j4;
                    final int i8 = i5;
                    final float f4 = f3;
                    final long j6 = j3;
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoSizes;
                            highSpeedVideoSizes = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoSizes(j5, i8, f4, j6, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            return highSpeedVideoSizes;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.CanvasKt.Canvas(m1742sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            final int i9 = i5;
            final long j7 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final long j8 = j3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit Camera2StreamConfigurationMap2;
                        ((java.lang.Integer) obj2).intValue();
                        Camera2StreamConfigurationMap2 = androidx.compose.material.ProgressIndicatorKt.Camera2StreamConfigurationMap(f, modifier3, j8, j7, i9, i2, i3, (androidx.compose.runtime.Composer) obj);
                        return Camera2StreamConfigurationMap2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        boolean z4 = true;
        if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        final int i92 = i5;
        final long j72 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(long j, int i, float f, long j2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        getHighResolutionOutputSizeshNQ4ISI(drawScope, j, intBitsToFloat, i);
        getHighResolutionOutputSizeshNQ4ISI(drawScope, 0.0f, f, j2, intBitsToFloat, i);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x025a, code lost:
    
        if (r1.changed(r10) == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e8  */
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2704LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier modifier, long j, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        long j3;
        long j4;
        int i5;
        final int i6;
        final long j5;
        androidx.compose.ui.Modifier.Companion companion;
        int i7;
        long j6;
        boolean z;
        androidx.compose.runtime.State<java.lang.Float> state;
        boolean z2;
        boolean changed;
        boolean changed2;
        boolean changed3;
        boolean changed4;
        java.lang.Object rememberedValue;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1501635280);
        int i9 = i3 & 1;
        if (i9 != 0) {
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
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                if (startRestartGroup.changed(i5)) {
                    i8 = 2048;
                    i4 |= i8;
                }
            } else {
                i5 = i;
            }
            i8 = 1024;
            i4 |= i8;
        } else {
            i5 = i;
        }
        if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                companion = modifier2;
            } else {
                companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    j4 = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i7 = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
                    i4 &= -7169;
                } else {
                    i7 = i5;
                }
                i5 = i7;
            }
            long j7 = j4;
            int i10 = i4;
            final long j8 = j3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1501635280, i10, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)");
            }
            androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoSizes((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                        return highSpeedVideoSizes;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            boolean z3 = true;
            androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue2), null, 0L, 6, null), null, startRestartGroup, (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9) | androidx.compose.animation.core.InfiniteTransition.$stable | 432, 8);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ProgressIndicatorKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.State<java.lang.Float> animateFloat2 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue3), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoFpsRanges((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                        return highSpeedVideoFpsRanges;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final androidx.compose.runtime.State<java.lang.Float> animateFloat3 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue4), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit inputSizeshNQ4ISI;
                        inputSizeshNQ4ISI = androidx.compose.material.ProgressIndicatorKt.getInputSizeshNQ4ISI((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                        return inputSizeshNQ4ISI;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final androidx.compose.runtime.State<java.lang.Float> animateFloat4 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue5), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
            androidx.compose.ui.Modifier m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(increaseSemanticsBounds(companion)), getOutputFormats, getHighSpeedVideoFpsRanges);
            if (((i10 & 896) ^ 384) > 256) {
                j6 = j7;
            } else {
                j6 = j7;
            }
            if ((i10 & 384) != 256) {
                z = false;
                if ((((i10 & 7168) ^ 3072) > 2048 || !startRestartGroup.changed(i5)) && (i10 & 3072) != 2048) {
                    state = animateFloat;
                    z2 = false;
                } else {
                    z2 = true;
                    state = animateFloat;
                }
                changed = startRestartGroup.changed(state);
                changed2 = startRestartGroup.changed(animateFloat2);
                androidx.compose.ui.Modifier modifier3 = companion;
                if ((((i10 & 112) ^ 48) > 32 || !startRestartGroup.changed(j8)) && (i10 & 48) != 32) {
                    z3 = false;
                }
                changed3 = startRestartGroup.changed(animateFloat3);
                changed4 = startRestartGroup.changed(animateFloat4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed3 | z2 | z | changed | changed2 | z3 | changed4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final long j9 = j6;
                    final int i11 = i5;
                    final androidx.compose.runtime.State<java.lang.Float> state2 = state;
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            kotlin.Unit highSpeedVideoSizes;
                            highSpeedVideoSizes = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoSizes(j9, i11, j8, state2, animateFloat2, animateFloat3, animateFloat4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                            return highSpeedVideoSizes;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.CanvasKt.Canvas(m1742sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                j3 = j8;
                i6 = i5;
                j5 = j6;
                modifier2 = modifier3;
            }
            z = true;
            if (((i10 & 7168) ^ 3072) > 2048) {
            }
            state = animateFloat;
            z2 = false;
            changed = startRestartGroup.changed(state);
            changed2 = startRestartGroup.changed(animateFloat2);
            androidx.compose.ui.Modifier modifier32 = companion;
            if (((i10 & 112) ^ 48) > 32) {
            }
            z3 = false;
            changed3 = startRestartGroup.changed(animateFloat3);
            changed4 = startRestartGroup.changed(animateFloat4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changed3 | z2 | z | changed | changed2 | z3 | changed4)) {
            }
            final long j92 = j6;
            final int i112 = i5;
            final androidx.compose.runtime.State state22 = state;
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoSizes(j92, i112, j8, state22, animateFloat2, animateFloat3, animateFloat4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    return highSpeedVideoSizes;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.foundation.CanvasKt.Canvas(m1742sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            j3 = j8;
            i6 = i5;
            j5 = j6;
            modifier2 = modifier32;
        } else {
            startRestartGroup.skipToGroupEnd();
            i6 = i5;
            j5 = j4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier4 = modifier2;
            final long j10 = j3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap2;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap2 = androidx.compose.material.ProgressIndicatorKt.Camera2StreamConfigurationMap(androidx.compose.ui.Modifier.this, j10, j5, i6, i2, i3, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(1800);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 0), Camera2StreamConfigurationMap);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameStart);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(1800);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), com.visa.cbp.getCertUsage.getODAData), getHighSpeedVideoFpsRangesFor);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), 1183);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(1800);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 1000), getInputSizeshNQ4ISI);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), 1567);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getInputSizeshNQ4ISI(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(1800);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 1267), getHighSpeedVideoSizesFor);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(1.0f), 1800);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(long j, int i, long j2, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() & 4294967295L));
        getHighResolutionOutputSizeshNQ4ISI(drawScope, j, intBitsToFloat, i);
        if (getHighSpeedVideoSizes((androidx.compose.runtime.State<java.lang.Float>) state) - getOutputMinFrameDuration(state2) > 0.0f) {
            getHighResolutionOutputSizeshNQ4ISI(drawScope, getHighSpeedVideoSizes((androidx.compose.runtime.State<java.lang.Float>) state), getOutputMinFrameDuration(state2), j2, intBitsToFloat, i);
        }
        if (getInputFormats(state3) - getOutputFormats(state4) > 0.0f) {
            getHighResolutionOutputSizeshNQ4ISI(drawScope, getInputFormats(state3), getOutputFormats(state4), j2, intBitsToFloat, i);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0052  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2707LinearProgressIndicatoreaDK9VM(final float f, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        long j4;
        androidx.compose.ui.Modifier.Companion companion;
        final long j5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        long j6;
        long m5995copywmQWz5c$default;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-850309746);
        if ((i & 6) == 0) {
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
                    j6 = j3;
                } else {
                    companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        j6 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                        i3 &= -897;
                    } else {
                        j6 = j3;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        m5995copywmQWz5c$default = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j6, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:225)");
                        }
                        m2706LinearProgressIndicator_5eSRE(f, companion, j6, m5995copywmQWz5c$default, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw(), startRestartGroup, i3 & 8190, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        j3 = j6;
                        j5 = m5995copywmQWz5c$default;
                    }
                }
                m5995copywmQWz5c$default = j4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m2706LinearProgressIndicator_5eSRE(f, companion, j6, m5995copywmQWz5c$default, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw(), startRestartGroup, i3 & 8190, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                j3 = j6;
                j5 = m5995copywmQWz5c$default;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j5 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final long j7 = j3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        ((java.lang.Integer) obj2).intValue();
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ProgressIndicatorKt.getHighResolutionOutputSizeshNQ4ISI(f, modifier3, j7, j5, i, i2, (androidx.compose.runtime.Composer) obj);
                        return highResolutionOutputSizeshNQ4ISI;
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
    public static final /* synthetic */ void m2705LinearProgressIndicatorRIQooxk(androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j3;
        long j4;
        androidx.compose.ui.Modifier.Companion companion;
        long j5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-819397058);
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
                    j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            }
            int i5 = i3;
            j5 = j3;
            long j6 = j4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-819397058, i5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:233)");
            }
            m2704LinearProgressIndicator2cYBFYY(companion, j5, j6, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw(), startRestartGroup, i5 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    ((java.lang.Integer) obj2).intValue();
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ProgressIndicatorKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.this, j7, j8, i, i2, (androidx.compose.runtime.Composer) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, float f3, int i) {
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
        kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> rangeTo = kotlin.ranges.RangesKt.rangeTo(f7, intBitsToFloat - f7);
        float floatValue = ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f5), rangeTo)).floatValue();
        float floatValue2 = ((java.lang.Number) kotlin.ranges.RangesKt.coerceIn(java.lang.Float.valueOf(f6), rangeTo)).floatValue();
        if (java.lang.Math.abs(f2 - f) > 0.0f) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(floatValue) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(floatValue2) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L)), f3, i, null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, int i) {
        getHighResolutionOutputSizeshNQ4ISI(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2700CircularProgressIndicatorDUhRLBM(final float f, androidx.compose.ui.Modifier modifier, long j, float f2, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        float f3;
        int i6;
        long j4;
        int i7;
        androidx.compose.ui.Modifier modifier2;
        final float f4;
        final long j5;
        final int i8;
        final long j6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1746618448);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
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
                f3 = f2;
                i4 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    j4 = j2;
                    i4 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                    if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        i7 = i;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(i7)) ? 131072 : 65536;
                    } else {
                        i7 = i;
                    }
                    boolean z = true;
                    if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            companion = modifier;
                        } else {
                            companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                f3 = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m2691getStrokeWidthD9Ej5fM();
                            }
                            if (i6 != 0) {
                                j4 = androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU();
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                                i7 = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1746618448, i4, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                        }
                        float f5 = f < 0.0f ? 0.0f : f;
                        if (f5 > 1.0f) {
                            f5 = 1.0f;
                        }
                        final androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(f3), 0.0f, i7, 0, null, 26, null);
                        java.lang.Float valueOf = java.lang.Float.valueOf(f5);
                        if (java.lang.Float.isNaN(valueOf.floatValue())) {
                            valueOf = null;
                        }
                        androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(companion, valueOf != null ? valueOf.floatValue() : 0.0f, null, 0, 6, null), getHighSpeedVideoSizes);
                        boolean changed = startRestartGroup.changed(f5);
                        modifier2 = companion;
                        boolean z2 = (i4 & 57344) == 16384;
                        boolean changedInstance = startRestartGroup.changedInstance(stroke);
                        int i10 = i7;
                        if ((((i4 & 896) ^ 384) <= 256 || !startRestartGroup.changed(j3)) && (i4 & 384) != 256) {
                            z = false;
                        }
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z2 | changed | changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final float f6 = f5;
                            final long j7 = j4;
                            final long j8 = j3;
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit Camera2StreamConfigurationMap2;
                                    Camera2StreamConfigurationMap2 = androidx.compose.material.ProgressIndicatorKt.Camera2StreamConfigurationMap(f6, j7, stroke, j8, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                    return Camera2StreamConfigurationMap2;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.foundation.CanvasKt.Canvas(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        f4 = f3;
                        j5 = j3;
                        j6 = j4;
                        i8 = i10;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        f4 = f3;
                        j5 = j3;
                        i8 = i7;
                        j6 = j4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRanges;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRanges = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoFpsRanges(f, modifier3, j5, f4, j6, i8, i2, i3, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRanges;
                            }
                        });
                        return;
                    }
                    return;
                }
                j4 = j2;
                if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                boolean z3 = true;
                if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            j4 = j2;
            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            boolean z32 = true;
            if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        j4 = j2;
        if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        boolean z322 = true;
        if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(float f, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke, long j2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        getHighSpeedVideoSizes(drawScope, j, stroke);
        getHighSpeedVideoSizes(drawScope, f * 360.0f, j2, stroke);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009f  */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2701CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        long j3;
        float f2;
        int i5;
        int i6;
        final long j4;
        final long j5;
        final int i7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        long j6;
        int i8;
        int m6342getSquareKaPHkGw;
        float f3;
        long j7;
        int i9;
        boolean z;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        boolean z2;
        boolean changedInstance;
        boolean changed;
        boolean changed2;
        boolean changed3;
        boolean changed4;
        boolean z3;
        java.lang.Object rememberedValue3;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1119119072);
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
            j3 = j;
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    i6 = i;
                    if (startRestartGroup.changed(i6)) {
                        i10 = 16384;
                        i4 |= i10;
                    }
                } else {
                    i6 = i;
                }
                i10 = 8192;
                i4 |= i10;
            } else {
                i6 = i;
            }
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    j6 = j2;
                    companion = modifier2;
                } else {
                    companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        j3 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                    }
                    if (i12 != 0) {
                        f2 = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m2691getStrokeWidthD9Ej5fM();
                    }
                    long m6031getTransparent0d7_KjU = i5 != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU() : j2;
                    if ((i3 & 16) != 0) {
                        i8 = i4 & (-57345);
                        m6342getSquareKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw();
                        f3 = f2;
                        j6 = m6031getTransparent0d7_KjU;
                        j7 = j3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1119119072, i8, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
                        }
                        final androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(f3), 0.0f, m6342getSquareKaPHkGw, 0, null, 26, null);
                        androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                        i9 = i8;
                        z = true;
                        final androidx.compose.runtime.State animateValue = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(6660, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 12), 16);
                        final androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 286.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(1332, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    highSpeedVideoFpsRangesFor = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoFpsRangesFor((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.runtime.State<java.lang.Float> animateFloat2 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 290.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit Camera2StreamConfigurationMap2;
                                    Camera2StreamConfigurationMap2 = androidx.compose.material.ProgressIndicatorKt.Camera2StreamConfigurationMap((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) obj);
                                    return Camera2StreamConfigurationMap2;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final androidx.compose.runtime.State<java.lang.Float> animateFloat3 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 290.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue2), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                        androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion), getHighSpeedVideoSizes);
                        z2 = (i9 & 7168) != 2048;
                        changedInstance = startRestartGroup.changedInstance(stroke);
                        changed = startRestartGroup.changed(animateValue);
                        changed2 = startRestartGroup.changed(animateFloat2);
                        changed3 = startRestartGroup.changed(animateFloat3);
                        changed4 = startRestartGroup.changed(animateFloat);
                        androidx.compose.ui.Modifier modifier3 = companion;
                        z3 = (i9 & 896) != 256;
                        if ((((i9 & 112) ^ 48) > 32 || !startRestartGroup.changed(j7)) && (i9 & 48) != 32) {
                            z = false;
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(z3 | changedInstance | z2 | changed | changed2 | changed3 | changed4 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final long j8 = j6;
                            final float f4 = f3;
                            final long j9 = j7;
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ProgressIndicatorKt.getHighResolutionOutputSizeshNQ4ISI(j8, stroke, f4, j9, animateValue, animateFloat2, animateFloat3, animateFloat, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.foundation.CanvasKt.Canvas(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        j5 = j7;
                        f2 = f3;
                        j4 = j6;
                        i7 = m6342getSquareKaPHkGw;
                        modifier2 = modifier3;
                    } else {
                        j6 = m6031getTransparent0d7_KjU;
                    }
                }
                j7 = j3;
                m6342getSquareKaPHkGw = i6;
                i8 = i4;
                f3 = f2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                final androidx.compose.ui.graphics.drawscope.Stroke stroke2 = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(f3), 0.0f, m6342getSquareKaPHkGw, 0, null, 26, null);
                androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition2 = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                i9 = i8;
                z = true;
                final androidx.compose.runtime.State animateValue2 = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(6660, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 12), 16);
                final androidx.compose.runtime.State animateFloat4 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 286.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(1332, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.runtime.State animateFloat22 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 290.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.runtime.State animateFloat32 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 290.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes((kotlin.jvm.functions.Function1) rememberedValue2), null, 0L, 6, null), null, startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 8);
                androidx.compose.ui.Modifier m1740size3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion), getHighSpeedVideoSizes);
                if ((i9 & 7168) != 2048) {
                }
                changedInstance = startRestartGroup.changedInstance(stroke2);
                changed = startRestartGroup.changed(animateValue2);
                changed2 = startRestartGroup.changed(animateFloat22);
                changed3 = startRestartGroup.changed(animateFloat32);
                changed4 = startRestartGroup.changed(animateFloat4);
                androidx.compose.ui.Modifier modifier32 = companion;
                if ((i9 & 896) != 256) {
                }
                if (((i9 & 112) ^ 48) > 32) {
                }
                z = false;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(z3 | changedInstance | z2 | changed | changed2 | changed3 | changed4 | z)) {
                }
                final long j82 = j6;
                final float f42 = f3;
                final long j92 = j7;
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ProgressIndicatorKt.getHighResolutionOutputSizeshNQ4ISI(j82, stroke2, f42, j92, animateValue2, animateFloat22, animateFloat32, animateFloat4, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.foundation.CanvasKt.Canvas(m1740size3ABfNKs2, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                j5 = j7;
                f2 = f3;
                j4 = j6;
                i7 = m6342getSquareKaPHkGw;
                modifier2 = modifier32;
            } else {
                startRestartGroup.skipToGroupEnd();
                j4 = j2;
                j5 = j3;
                i7 = i6;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                final float f5 = f2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoFpsRangesFor;
                        ((java.lang.Integer) obj2).intValue();
                        highSpeedVideoFpsRangesFor = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier.this, j5, f5, j4, i7, i2, i3, (androidx.compose.runtime.Composer) obj);
                        return highSpeedVideoFpsRangesFor;
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(1332);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 0), getHighResolutionOutputSizeshNQ4ISI);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(290.0f), 666);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(1332);
        keyframesSpecConfig.using(keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(0.0f), 666), getHighResolutionOutputSizeshNQ4ISI);
        keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig) java.lang.Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(long j, androidx.compose.ui.graphics.drawscope.Stroke stroke, float f, long j2, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        getHighSpeedVideoSizes(drawScope, j, stroke);
        Camera2StreamConfigurationMap(drawScope, getHighSpeedVideoFpsRanges((androidx.compose.runtime.State<java.lang.Float>) state3) + (((getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.State<java.lang.Integer>) state) * 216.0f) % 360.0f) - 90.0f) + getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.State<java.lang.Float>) state4), f, java.lang.Math.abs(Camera2StreamConfigurationMap((androidx.compose.runtime.State<java.lang.Float>) state2) - getHighSpeedVideoFpsRanges((androidx.compose.runtime.State<java.lang.Float>) state3)), j2, stroke);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0054  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2702CircularProgressIndicatorMBs18nI(final float f, androidx.compose.ui.Modifier modifier, long j, float f2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
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
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-409649739);
        if ((i & 6) == 0) {
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
                            j2 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            f4 = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m2691getStrokeWidthD9Ej5fM();
                            j3 = j2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:430)");
                            }
                            m2700CircularProgressIndicatorDUhRLBM(f, companion, j3, f4, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
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
                    m2700CircularProgressIndicatorDUhRLBM(f, companion, j3, f4, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
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
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                            ((java.lang.Integer) obj2).intValue();
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ProgressIndicatorKt.getHighResolutionOutputSizeshNQ4ISI(f, modifier3, j4, f4, i, i2, (androidx.compose.runtime.Composer) obj);
                            return highResolutionOutputSizeshNQ4ISI;
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
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2703CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier modifier, long j, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j2;
        float f2;
        androidx.compose.ui.Modifier.Companion companion;
        long j3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float m2691getStrokeWidthD9Ej5fM;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-392089979);
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
                        j2 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2562getPrimary0d7_KjU();
                        i3 &= -113;
                    }
                    if (i6 != 0) {
                        m2691getStrokeWidthD9Ej5fM = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m2691getStrokeWidthD9Ej5fM();
                        long j4 = j2;
                        int i7 = i3;
                        j3 = j4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-392089979, i7, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:446)");
                        }
                        m2701CircularProgressIndicatorLxG7B9w(companion, j3, m2691getStrokeWidthD9Ej5fM, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), startRestartGroup, (i7 & 14) | 3072 | (i7 & 112) | (i7 & 896), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        f2 = m2691getStrokeWidthD9Ej5fM;
                    }
                }
                m2691getStrokeWidthD9Ej5fM = f2;
                long j42 = j2;
                int i72 = i3;
                j3 = j42;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                m2701CircularProgressIndicatorLxG7B9w(companion, j3, m2691getStrokeWidthD9Ej5fM, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6342getSquareKaPHkGw(), startRestartGroup, (i72 & 14) | 3072 | (i72 & 112) | (i72 & 896), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                f2 = m2691getStrokeWidthD9Ej5fM;
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
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        kotlin.Unit Camera2StreamConfigurationMap2;
                        ((java.lang.Integer) obj2).intValue();
                        Camera2StreamConfigurationMap2 = androidx.compose.material.ProgressIndicatorKt.Camera2StreamConfigurationMap(androidx.compose.ui.Modifier.this, j5, f3, i, i2, (androidx.compose.runtime.Composer) obj);
                        return Camera2StreamConfigurationMap2;
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

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (drawScope.mo6531getSizeNHjbRc() >> 32)) - (2.0f * (stroke.getWidth() / 2.0f));
        androidx.compose.ui.graphics.drawscope.DrawScope.m6511drawArcyD3GUKo$default(drawScope, j, f, f2, false, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(r0) & 4294967295L) | (java.lang.Float.floatToRawIntBits(r0) << 32)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        getHighSpeedVideoFpsRangesFor(drawScope, 0.0f, 360.0f, j, stroke);
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        getHighSpeedVideoFpsRangesFor(drawScope, 270.0f, f, j, stroke);
    }

    private static final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        getHighSpeedVideoFpsRangesFor(drawScope, f + (androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(stroke.getCap(), androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw()) ? 0.0f : ((f2 / androidx.compose.ui.unit.Dp.m8601constructorimpl(getHighSpeedVideoSizes / 2.0f)) * 57.29578f) / 2.0f), java.lang.Math.max(f3, 0.1f), j, stroke);
    }

    public static final androidx.compose.ui.Modifier increaseSemanticsBounds(androidx.compose.ui.Modifier modifier) {
        final float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);
        return androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics(androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                androidx.compose.ui.layout.MeasureResult highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoSizes(m8601constructorimpl, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                return highSpeedVideoSizes;
            }
        }), true, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.material.ProgressIndicatorKt.getHighSpeedVideoFpsRangesFor();
                return highSpeedVideoFpsRangesFor;
            }
        }), 0.0f, m8601constructorimpl, 1, null);
    }

    private static final float getHighSpeedVideoSizes(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final float getOutputMinFrameDuration(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final float getInputFormats(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final float getOutputFormats(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final int getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.State<java.lang.Integer> state) {
        return state.getValue().intValue();
    }

    private static final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Camera2StreamConfigurationMap(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    private static final float getHighSpeedVideoFpsRanges(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(float f, androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, androidx.compose.runtime.Composer composer) {
        m2707LinearProgressIndicatoreaDK9VM(f, modifier, j, j2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(float f, androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        m2706LinearProgressIndicator_5eSRE(f, modifier, j, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, androidx.compose.runtime.Composer composer) {
        m2705LinearProgressIndicatorRIQooxk(modifier, j, j2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, long j, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        m2704LinearProgressIndicator2cYBFYY(modifier, j, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.Modifier modifier, long j, float f, int i, int i2, androidx.compose.runtime.Composer composer) {
        m2703CircularProgressIndicatoraMcp0Q(modifier, j, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(float f, androidx.compose.ui.Modifier modifier, long j, float f2, int i, int i2, androidx.compose.runtime.Composer composer) {
        m2702CircularProgressIndicatorMBs18nI(f, modifier, j, f2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, long j, float f, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        m2701CircularProgressIndicatorLxG7B9w(modifier, j, f, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(float f, androidx.compose.ui.Modifier modifier, long j, float f2, long j2, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        m2700CircularProgressIndicatorDUhRLBM(f, modifier, j, f2, j2, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }
}
