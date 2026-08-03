package androidx.compose.material;

/* compiled from: ProgressIndicator.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a3\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a3\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a9\u00100\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00107\u001aA\u0010:\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001a9\u0010=\u001a\u00020\u001f*\u0002012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u001a)\u0010B\u001a\u00020\u001f*\u0002012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0013\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "backgroundColor", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m1451getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = androidx.compose.ui.unit.Dp.m4478constructorimpl(240);
    private static final float CircularIndicatorDiameter = androidx.compose.ui.unit.Dp.m4478constructorimpl(40);
    private static final androidx.compose.animation.core.CubicBezierEasing FirstLineHeadEasing = new androidx.compose.animation.core.CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing FirstLineTailEasing = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing SecondLineHeadEasing = new androidx.compose.animation.core.CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing SecondLineTailEasing = new androidx.compose.animation.core.CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final androidx.compose.animation.core.CubicBezierEasing CircularEasing = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1459LinearProgressIndicatoreaDK9VM(final float f, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        long j4;
        final androidx.compose.ui.Modifier.Companion companion;
        final long m1315getPrimary0d7_KjU;
        boolean changed;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-850309746);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(3,2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)74@3420L6,81@3655L175,77@3520L310:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j3 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    j4 = j2;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j4 = j2;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i6 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    m1315getPrimary0d7_KjU = (i2 & 4) == 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1315getPrimary0d7_KjU() : j3;
                    if ((i2 & 8) != 0) {
                        j4 = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m1315getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    m1315getPrimary0d7_KjU = j3;
                }
                startRestartGroup.endDefaults();
                androidx.compose.ui.Modifier m619sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m619sizeVpY3zN4(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(companion, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                androidx.compose.ui.graphics.Color m2103boximpl = androidx.compose.ui.graphics.Color.m2103boximpl(j4);
                java.lang.Float valueOf = java.lang.Float.valueOf(f);
                androidx.compose.ui.graphics.Color m2103boximpl2 = androidx.compose.ui.graphics.Color.m2103boximpl(m1315getPrimary0d7_KjU);
                startRestartGroup.startReplaceableGroup(1618982084);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(m2103boximpl) | startRestartGroup.changed(valueOf) | startRestartGroup.changed(m2103boximpl2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final long j5 = j4;
                    final long j6 = m1315getPrimary0d7_KjU;
                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
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
                            float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(Canvas.mo2592getSizeNHjbRc());
                            androidx.compose.material.ProgressIndicatorKt.m1480drawLinearIndicatorBackgroundbw27NRU(Canvas, j5, m1937getHeightimpl);
                            androidx.compose.material.ProgressIndicatorKt.m1479drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j6, m1937getHeightimpl);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.CanvasKt.Canvas(m619sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                m1315getPrimary0d7_KjU = j3;
            }
            final long j7 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
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
                    androidx.compose.material.ProgressIndicatorKt.m1459LinearProgressIndicatoreaDK9VM(f, companion, m1315getPrimary0d7_KjU, j7, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        startRestartGroup.endDefaults();
        androidx.compose.ui.Modifier m619sizeVpY3zN42 = androidx.compose.foundation.layout.SizeKt.m619sizeVpY3zN4(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(companion, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
        androidx.compose.ui.graphics.Color m2103boximpl3 = androidx.compose.ui.graphics.Color.m2103boximpl(j4);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(f);
        androidx.compose.ui.graphics.Color m2103boximpl22 = androidx.compose.ui.graphics.Color.m2103boximpl(m1315getPrimary0d7_KjU);
        startRestartGroup.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m2103boximpl3) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(m2103boximpl22);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final long j52 = j4;
        final long j62 = m1315getPrimary0d7_KjU;
        rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
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
                float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(Canvas.mo2592getSizeNHjbRc());
                androidx.compose.material.ProgressIndicatorKt.m1480drawLinearIndicatorBackgroundbw27NRU(Canvas, j52, m1937getHeightimpl);
                androidx.compose.material.ProgressIndicatorKt.m1479drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j62, m1937getHeightimpl);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.CanvasKt.Canvas(m619sizeVpY3zN42, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
        final long j72 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final void m1458LinearProgressIndicatorRIQooxk(androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j3;
        long j4;
        final androidx.compose.ui.Modifier.Companion companion;
        long m1315getPrimary0d7_KjU;
        final long j5;
        int i4;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-819397058);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)102@4593L6,105@4718L28,109@5000L319,120@5364L319,131@5729L323,142@6098L323,157@6553L557,153@6426L684:ProgressIndicator.kt#jmzs0o");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j3 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j4 = j2;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                m1315getPrimary0d7_KjU = (i2 & 2) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1315getPrimary0d7_KjU() : j3;
                if ((i2 & 4) != 0) {
                    j4 = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m1315getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                m1315getPrimary0d7_KjU = j3;
            }
            startRestartGroup.endDefaults();
            androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
            final androidx.compose.runtime.State animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                    androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 0);
                    cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.FirstLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(1.0f), com.unity3d.services.UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                }
            }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
            final androidx.compose.runtime.State animateFloat2 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                    androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 333);
                    cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.FirstLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
            final androidx.compose.runtime.State animateFloat3 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                    androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 1000);
                    cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.SecondLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
            final androidx.compose.runtime.State animateFloat4 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                    androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 1267);
                    cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.SecondLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
            androidx.compose.ui.Modifier m619sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m619sizeVpY3zN4(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion), LinearIndicatorWidth, LinearIndicatorHeight);
            java.lang.Object[] objArr = {androidx.compose.ui.graphics.Color.m2103boximpl(j4), animateFloat, animateFloat2, androidx.compose.ui.graphics.Color.m2103boximpl(m1315getPrimary0d7_KjU), animateFloat3, animateFloat4};
            startRestartGroup.startReplaceableGroup(-568225417);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i7 = 0; i7 < 6; i7++) {
                z |= startRestartGroup.changed(objArr[i7]);
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final long j6 = j4;
                final long j7 = m1315getPrimary0d7_KjU;
                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
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
                        float m1460LinearProgressIndicator_RIQooxk$lambda1;
                        float m1461LinearProgressIndicator_RIQooxk$lambda2;
                        float m1462LinearProgressIndicator_RIQooxk$lambda3;
                        float m1463LinearProgressIndicator_RIQooxk$lambda4;
                        float m1462LinearProgressIndicator_RIQooxk$lambda32;
                        float m1463LinearProgressIndicator_RIQooxk$lambda42;
                        float m1460LinearProgressIndicator_RIQooxk$lambda12;
                        float m1461LinearProgressIndicator_RIQooxk$lambda22;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(Canvas.mo2592getSizeNHjbRc());
                        androidx.compose.material.ProgressIndicatorKt.m1480drawLinearIndicatorBackgroundbw27NRU(Canvas, j6, m1937getHeightimpl);
                        m1460LinearProgressIndicator_RIQooxk$lambda1 = androidx.compose.material.ProgressIndicatorKt.m1460LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                        m1461LinearProgressIndicator_RIQooxk$lambda2 = androidx.compose.material.ProgressIndicatorKt.m1461LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                        if (m1460LinearProgressIndicator_RIQooxk$lambda1 - m1461LinearProgressIndicator_RIQooxk$lambda2 > 0.0f) {
                            m1460LinearProgressIndicator_RIQooxk$lambda12 = androidx.compose.material.ProgressIndicatorKt.m1460LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                            m1461LinearProgressIndicator_RIQooxk$lambda22 = androidx.compose.material.ProgressIndicatorKt.m1461LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                            androidx.compose.material.ProgressIndicatorKt.m1479drawLinearIndicator42QJj7c(Canvas, m1460LinearProgressIndicator_RIQooxk$lambda12, m1461LinearProgressIndicator_RIQooxk$lambda22, j7, m1937getHeightimpl);
                        }
                        m1462LinearProgressIndicator_RIQooxk$lambda3 = androidx.compose.material.ProgressIndicatorKt.m1462LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                        m1463LinearProgressIndicator_RIQooxk$lambda4 = androidx.compose.material.ProgressIndicatorKt.m1463LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                        if (m1462LinearProgressIndicator_RIQooxk$lambda3 - m1463LinearProgressIndicator_RIQooxk$lambda4 > 0.0f) {
                            m1462LinearProgressIndicator_RIQooxk$lambda32 = androidx.compose.material.ProgressIndicatorKt.m1462LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                            m1463LinearProgressIndicator_RIQooxk$lambda42 = androidx.compose.material.ProgressIndicatorKt.m1463LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                            androidx.compose.material.ProgressIndicatorKt.m1479drawLinearIndicator42QJj7c(Canvas, m1462LinearProgressIndicator_RIQooxk$lambda32, m1463LinearProgressIndicator_RIQooxk$lambda42, j7, m1937getHeightimpl);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.CanvasKt.Canvas(m619sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
            j5 = m1315getPrimary0d7_KjU;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            j5 = j3;
        }
        final long j8 = j4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i8) {
                androidx.compose.material.ProgressIndicatorKt.m1458LinearProgressIndicatorRIQooxk(androidx.compose.ui.Modifier.this, j5, j8, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-42QJj7c, reason: not valid java name */
    public static final void m1479drawLinearIndicator42QJj7c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, float f3) {
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc());
        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc()) / 2;
        boolean z = drawScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2664drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset((z ? f : 1.0f - f2) * m1940getWidthimpl, m1937getHeightimpl), androidx.compose.ui.geometry.OffsetKt.Offset((z ? f2 : 1.0f - f) * m1940getWidthimpl, m1937getHeightimpl), f3, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1480drawLinearIndicatorBackgroundbw27NRU(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f) {
        m1479drawLinearIndicator42QJj7c(drawScope, 0.0f, 1.0f, j, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1452CircularProgressIndicatorMBs18nI(final float f, androidx.compose.ui.Modifier modifier, long j, float f2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final long j2;
        int i4;
        float f3;
        final long j3;
        float f4;
        androidx.compose.ui.Modifier modifier3;
        final float f5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-409649739);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)226@9099L6,*229@9214L7,232@9300L296:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
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
            } else if ((i & 7168) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        long m1315getPrimary0d7_KjU = (i2 & 4) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1315getPrimary0d7_KjU() : j2;
                        if (i4 != 0) {
                            modifier3 = companion;
                            j3 = m1315getPrimary0d7_KjU;
                            f4 = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m1451getStrokeWidthD9Ej5fM();
                        } else {
                            j3 = m1315getPrimary0d7_KjU;
                            f4 = f3;
                            modifier3 = companion;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j3 = j2;
                        f4 = f3;
                        modifier3 = modifier2;
                    }
                    startRestartGroup.endDefaults();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume = startRestartGroup.consume(localDensity);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) consume).mo315toPx0680j_4(f4), 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw(), 0, null, 26, null);
                    androidx.compose.foundation.CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                            androidx.compose.material.ProgressIndicatorKt.m1477drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke);
                        }
                    }, startRestartGroup, 0);
                    modifier2 = modifier3;
                    j2 = j3;
                    f5 = f4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f5 = f3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
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
                        androidx.compose.material.ProgressIndicatorKt.m1452CircularProgressIndicatorMBs18nI(f, modifier2, j2, f5, composer2, i | 1, i2);
                    }
                });
                return;
            }
            f3 = f2;
            if ((i3 & 5851) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.endDefaults();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localDensity2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.graphics.drawscope.Stroke stroke2 = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) consume2).mo315toPx0680j_4(f4), 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw(), 0, null, 26, null);
            androidx.compose.foundation.CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                    androidx.compose.material.ProgressIndicatorKt.m1477drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke2);
                }
            }, startRestartGroup, 0);
            modifier2 = modifier3;
            j2 = j3;
            f5 = f4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.endDefaults();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22 = startRestartGroup.consume(localDensity22);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.graphics.drawscope.Stroke stroke22 = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) consume22).mo315toPx0680j_4(f4), 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw(), 0, null, 26, null);
        androidx.compose.foundation.CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                androidx.compose.material.ProgressIndicatorKt.m1477drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke22);
            }
        }, startRestartGroup, 0);
        modifier2 = modifier3;
        j2 = j3;
        f5 = f4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1453CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier modifier, long j, float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long j2;
        float f2;
        androidx.compose.ui.Modifier.Companion companion;
        long m1315getPrimary0d7_KjU;
        float m1451getStrokeWidthD9Ej5fM;
        final androidx.compose.ui.Modifier modifier3;
        final long j3;
        final float f3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-392089979);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)257@10275L6,*260@10390L7,264@10496L28,266@10654L278,278@11047L230,289@11395L345,301@11775L354,312@12134L582:ProgressIndicator.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
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
        } else if ((i & 896) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i5 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    m1315getPrimary0d7_KjU = (i2 & 2) == 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1315getPrimary0d7_KjU() : j2;
                    if (i6 != 0) {
                        m1451getStrokeWidthD9Ej5fM = androidx.compose.material.ProgressIndicatorDefaults.INSTANCE.m1451getStrokeWidthD9Ej5fM();
                        startRestartGroup.endDefaults();
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume = startRestartGroup.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) consume).mo315toPx0680j_4(m1451getStrokeWidthD9Ej5fM), 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2476getSquareKaPHkGw(), 0, null, 26, null);
                        androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                        final androidx.compose.runtime.State animateValue = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(6660, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 4528 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 12));
                        final androidx.compose.runtime.State animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, BaseRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(RotationDuration, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
                        final androidx.compose.runtime.State animateFloat2 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                                androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 0);
                                cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(290.0f), 666);
                            }
                        }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
                        final androidx.compose.runtime.State animateFloat3 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                                androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 666);
                                cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(290.0f), keyframes.getDurationMillis());
                            }
                        }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
                        final float f4 = m1451getStrokeWidthD9Ej5fM;
                        final long j4 = m1315getPrimary0d7_KjU;
                        androidx.compose.foundation.CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                                int m1456CircularProgressIndicator_aM_cp0Q$lambda8;
                                float m1454CircularProgressIndicator_aM_cp0Q$lambda10;
                                float m1455CircularProgressIndicator_aM_cp0Q$lambda11;
                                float m1457CircularProgressIndicator_aM_cp0Q$lambda9;
                                float m1455CircularProgressIndicator_aM_cp0Q$lambda112;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                m1456CircularProgressIndicator_aM_cp0Q$lambda8 = androidx.compose.material.ProgressIndicatorKt.m1456CircularProgressIndicator_aM_cp0Q$lambda8(animateValue);
                                m1454CircularProgressIndicator_aM_cp0Q$lambda10 = androidx.compose.material.ProgressIndicatorKt.m1454CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat2);
                                m1455CircularProgressIndicator_aM_cp0Q$lambda11 = androidx.compose.material.ProgressIndicatorKt.m1455CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                float abs = java.lang.Math.abs(m1454CircularProgressIndicator_aM_cp0Q$lambda10 - m1455CircularProgressIndicator_aM_cp0Q$lambda11);
                                m1457CircularProgressIndicator_aM_cp0Q$lambda9 = androidx.compose.material.ProgressIndicatorKt.m1457CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat);
                                float f5 = (((m1456CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1457CircularProgressIndicator_aM_cp0Q$lambda9;
                                m1455CircularProgressIndicator_aM_cp0Q$lambda112 = androidx.compose.material.ProgressIndicatorKt.m1455CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                androidx.compose.material.ProgressIndicatorKt.m1478drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1455CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f4, abs, j4, stroke);
                            }
                        }, startRestartGroup, 0);
                        modifier3 = companion;
                        j3 = m1315getPrimary0d7_KjU;
                        f3 = m1451getStrokeWidthD9Ej5fM;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    m1315getPrimary0d7_KjU = j2;
                }
                m1451getStrokeWidthD9Ej5fM = f2;
                startRestartGroup.endDefaults();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2 = startRestartGroup.consume(localDensity2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final androidx.compose.ui.graphics.drawscope.Stroke stroke2 = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) consume2).mo315toPx0680j_4(m1451getStrokeWidthD9Ej5fM), 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2476getSquareKaPHkGw(), 0, null, 26, null);
                androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition2 = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                final androidx.compose.runtime.State<java.lang.Integer> animateValue2 = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(6660, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 4528 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 12));
                final androidx.compose.runtime.State<java.lang.Float> animateFloat4 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, BaseRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(RotationDuration, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
                final androidx.compose.runtime.State<java.lang.Float> animateFloat22 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 0);
                        cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
                final androidx.compose.runtime.State<java.lang.Float> animateFloat32 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 666);
                        cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
                final float f42 = m1451getStrokeWidthD9Ej5fM;
                final long j42 = m1315getPrimary0d7_KjU;
                androidx.compose.foundation.CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                        int m1456CircularProgressIndicator_aM_cp0Q$lambda8;
                        float m1454CircularProgressIndicator_aM_cp0Q$lambda10;
                        float m1455CircularProgressIndicator_aM_cp0Q$lambda11;
                        float m1457CircularProgressIndicator_aM_cp0Q$lambda9;
                        float m1455CircularProgressIndicator_aM_cp0Q$lambda112;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        m1456CircularProgressIndicator_aM_cp0Q$lambda8 = androidx.compose.material.ProgressIndicatorKt.m1456CircularProgressIndicator_aM_cp0Q$lambda8(animateValue2);
                        m1454CircularProgressIndicator_aM_cp0Q$lambda10 = androidx.compose.material.ProgressIndicatorKt.m1454CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat22);
                        m1455CircularProgressIndicator_aM_cp0Q$lambda11 = androidx.compose.material.ProgressIndicatorKt.m1455CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        float abs = java.lang.Math.abs(m1454CircularProgressIndicator_aM_cp0Q$lambda10 - m1455CircularProgressIndicator_aM_cp0Q$lambda11);
                        m1457CircularProgressIndicator_aM_cp0Q$lambda9 = androidx.compose.material.ProgressIndicatorKt.m1457CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat4);
                        float f5 = (((m1456CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1457CircularProgressIndicator_aM_cp0Q$lambda9;
                        m1455CircularProgressIndicator_aM_cp0Q$lambda112 = androidx.compose.material.ProgressIndicatorKt.m1455CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        androidx.compose.material.ProgressIndicatorKt.m1478drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1455CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f42, abs, j42, stroke2);
                    }
                }, startRestartGroup, 0);
                modifier3 = companion;
                j3 = m1315getPrimary0d7_KjU;
                f3 = m1451getStrokeWidthD9Ej5fM;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
                f3 = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
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
                    androidx.compose.material.ProgressIndicatorKt.m1453CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier.this, j3, f3, composer2, i | 1, i2);
                }
            });
            return;
        }
        f2 = f;
        if ((i3 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if (i6 != 0) {
        }
        m1451getStrokeWidthD9Ej5fM = f2;
        startRestartGroup.endDefaults();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22 = startRestartGroup.consume(localDensity22);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final androidx.compose.ui.graphics.drawscope.Stroke stroke22 = new androidx.compose.ui.graphics.drawscope.Stroke(((androidx.compose.ui.unit.Density) consume22).mo315toPx0680j_4(m1451getStrokeWidthD9Ej5fM), 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2476getSquareKaPHkGw(), 0, null, 26, null);
        androidx.compose.animation.core.InfiniteTransition rememberInfiniteTransition22 = androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
        final androidx.compose.runtime.State<java.lang.Integer> animateValue22 = androidx.compose.animation.core.InfiniteTransitionKt.animateValue(rememberInfiniteTransition22, 0, 5, androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.IntCompanionObject.INSTANCE), androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(6660, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 4528 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 12));
        final androidx.compose.runtime.State<java.lang.Float> animateFloat42 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, BaseRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(RotationDuration, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
        final androidx.compose.runtime.State<java.lang.Float> animateFloat222 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, JumpRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                invoke2(keyframesSpecConfig);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                keyframes.setDurationMillis(1332);
                androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 0);
                cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.CircularEasing;
                keyframes.with(at, cubicBezierEasing);
                keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(290.0f), 666);
            }
        }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
        final androidx.compose.runtime.State<java.lang.Float> animateFloat322 = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, JumpRotationAngle, androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
                invoke2(keyframesSpecConfig);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframes) {
                androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                keyframes.setDurationMillis(1332);
                androidx.compose.animation.core.KeyframesSpec.KeyframeEntity<java.lang.Float> at = keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(0.0f), 666);
                cubicBezierEasing = androidx.compose.material.ProgressIndicatorKt.CircularEasing;
                keyframes.with(at, cubicBezierEasing);
                keyframes.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) java.lang.Float.valueOf(290.0f), keyframes.getDurationMillis());
            }
        }), null, 0L, 6, null), startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 432 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9));
        final float f422 = m1451getStrokeWidthD9Ej5fM;
        final long j422 = m1315getPrimary0d7_KjU;
        androidx.compose.foundation.CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.foundation.ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                int m1456CircularProgressIndicator_aM_cp0Q$lambda8;
                float m1454CircularProgressIndicator_aM_cp0Q$lambda10;
                float m1455CircularProgressIndicator_aM_cp0Q$lambda11;
                float m1457CircularProgressIndicator_aM_cp0Q$lambda9;
                float m1455CircularProgressIndicator_aM_cp0Q$lambda112;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                m1456CircularProgressIndicator_aM_cp0Q$lambda8 = androidx.compose.material.ProgressIndicatorKt.m1456CircularProgressIndicator_aM_cp0Q$lambda8(animateValue22);
                m1454CircularProgressIndicator_aM_cp0Q$lambda10 = androidx.compose.material.ProgressIndicatorKt.m1454CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat222);
                m1455CircularProgressIndicator_aM_cp0Q$lambda11 = androidx.compose.material.ProgressIndicatorKt.m1455CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat322);
                float abs = java.lang.Math.abs(m1454CircularProgressIndicator_aM_cp0Q$lambda10 - m1455CircularProgressIndicator_aM_cp0Q$lambda11);
                m1457CircularProgressIndicator_aM_cp0Q$lambda9 = androidx.compose.material.ProgressIndicatorKt.m1457CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat42);
                float f5 = (((m1456CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1457CircularProgressIndicator_aM_cp0Q$lambda9;
                m1455CircularProgressIndicator_aM_cp0Q$lambda112 = androidx.compose.material.ProgressIndicatorKt.m1455CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat322);
                androidx.compose.material.ProgressIndicatorKt.m1478drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1455CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f422, abs, j422, stroke22);
            }
        }, startRestartGroup, 0);
        modifier3 = companion;
        j3 = m1315getPrimary0d7_KjU;
        f3 = m1451getStrokeWidthD9Ej5fM;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1476drawCircularIndicator42QJj7c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc()) - (f3 * width);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2657drawArcyD3GUKo$default(drawScope, j, f, f2, false, androidx.compose.ui.geometry.OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m1940getWidthimpl, m1940getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1477drawDeterminateCircularIndicator42QJj7c(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        m1476drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1478drawIndeterminateCircularIndicatorhrjfTZI(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, float f2, float f3, long j, androidx.compose.ui.graphics.drawscope.Stroke stroke) {
        m1476drawCircularIndicator42QJj7c(drawScope, f + (((f2 / androidx.compose.ui.unit.Dp.m4478constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), java.lang.Math.max(f3, 0.1f), j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-1, reason: not valid java name */
    public static final float m1460LinearProgressIndicator_RIQooxk$lambda1(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-2, reason: not valid java name */
    public static final float m1461LinearProgressIndicator_RIQooxk$lambda2(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-3, reason: not valid java name */
    public static final float m1462LinearProgressIndicator_RIQooxk$lambda3(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-4, reason: not valid java name */
    public static final float m1463LinearProgressIndicator_RIQooxk$lambda4(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-8, reason: not valid java name */
    public static final int m1456CircularProgressIndicator_aM_cp0Q$lambda8(androidx.compose.runtime.State<java.lang.Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-9, reason: not valid java name */
    public static final float m1457CircularProgressIndicator_aM_cp0Q$lambda9(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-10, reason: not valid java name */
    public static final float m1454CircularProgressIndicator_aM_cp0Q$lambda10(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-11, reason: not valid java name */
    public static final float m1455CircularProgressIndicator_aM_cp0Q$lambda11(androidx.compose.runtime.State<java.lang.Float> state) {
        return state.getValue().floatValue();
    }
}
