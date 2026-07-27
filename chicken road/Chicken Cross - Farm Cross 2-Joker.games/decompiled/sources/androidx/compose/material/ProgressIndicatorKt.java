package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a3\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a3\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a9\u00100\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00107\u001aA\u0010:\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001a9\u0010=\u001a\u00020\u001f*\u0002012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u001a)\u0010B\u001a\u00020\u001f*\u0002012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0013\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_PROGRESS, "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "backgroundColor", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
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
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1112getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m3840constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m3840constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

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
    public static final void m1120LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final Modifier.Companion companion;
        final long m976getPrimary0d7_KjU;
        boolean changed;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-850309746);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(3,2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)74@3420L6,81@3655L175,77@3520L310:ProgressIndicator.kt#jmzs0o");
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
                    companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    m976getPrimary0d7_KjU = (i2 & 4) == 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m976getPrimary0d7_KjU() : j3;
                    if ((i2 & 8) != 0) {
                        j4 = Color.m1627copywmQWz5c$default(m976getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    m976getPrimary0d7_KjU = j3;
                }
                startRestartGroup.endDefaults();
                Modifier m463sizeVpY3zN4 = SizeKt.m463sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(companion, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                Color m1618boximpl = Color.m1618boximpl(j4);
                Float valueOf = Float.valueOf(f);
                Color m1618boximpl2 = Color.m1618boximpl(m976getPrimary0d7_KjU);
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(m1618boximpl) | startRestartGroup.changed(valueOf) | startRestartGroup.changed(m1618boximpl2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final long j5 = j4;
                    final long j6 = m976getPrimary0d7_KjU;
                    rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float m1458getHeightimpl = Size.m1458getHeightimpl(Canvas.mo2122getSizeNHjbRc());
                            ProgressIndicatorKt.m1141drawLinearIndicatorBackgroundbw27NRU(Canvas, j5, m1458getHeightimpl);
                            ProgressIndicatorKt.m1140drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j6, m1458getHeightimpl);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(m463sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                m976getPrimary0d7_KjU = j3;
            }
            final long j7 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    ProgressIndicatorKt.m1120LinearProgressIndicatoreaDK9VM(f, companion, m976getPrimary0d7_KjU, j7, composer2, i | 1, i2);
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
        Modifier m463sizeVpY3zN42 = SizeKt.m463sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(companion, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
        Color m1618boximpl3 = Color.m1618boximpl(j4);
        Float valueOf2 = Float.valueOf(f);
        Color m1618boximpl22 = Color.m1618boximpl(m976getPrimary0d7_KjU);
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m1618boximpl3) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(m1618boximpl22);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final long j52 = j4;
        final long j62 = m976getPrimary0d7_KjU;
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float m1458getHeightimpl = Size.m1458getHeightimpl(Canvas.mo2122getSizeNHjbRc());
                ProgressIndicatorKt.m1141drawLinearIndicatorBackgroundbw27NRU(Canvas, j52, m1458getHeightimpl);
                ProgressIndicatorKt.m1140drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j62, m1458getHeightimpl);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(m463sizeVpY3zN42, (Function1) rememberedValue, startRestartGroup, 0);
        final long j72 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final void m1119LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        final Modifier.Companion companion;
        final long m976getPrimary0d7_KjU;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)102@4593L6,105@4718L28,109@5000L319,120@5364L319,131@5729L323,142@6098L323,157@6553L557,153@6426L684:ProgressIndicator.kt#jmzs0o");
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
                companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                m976getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m976getPrimary0d7_KjU() : j3;
                if ((i2 & 4) != 0) {
                    j4 = Color.m1627copywmQWz5c$default(m976getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                m976getPrimary0d7_KjU = j3;
            }
            startRestartGroup.endDefaults();
            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 333);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 1000);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 1267);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            Modifier m463sizeVpY3zN4 = SizeKt.m463sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion), LinearIndicatorWidth, LinearIndicatorHeight);
            Object[] objArr = {Color.m1618boximpl(j4), animateFloat, animateFloat2, Color.m1618boximpl(m976getPrimary0d7_KjU), animateFloat3, animateFloat4};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z = false;
            for (int i7 = 0; i7 < 6; i7++) {
                z |= startRestartGroup.changed(objArr[i7]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final long j5 = j4;
                final long j6 = m976getPrimary0d7_KjU;
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope Canvas) {
                        float m1121LinearProgressIndicator_RIQooxk$lambda1;
                        float m1122LinearProgressIndicator_RIQooxk$lambda2;
                        float m1123LinearProgressIndicator_RIQooxk$lambda3;
                        float m1124LinearProgressIndicator_RIQooxk$lambda4;
                        float m1123LinearProgressIndicator_RIQooxk$lambda32;
                        float m1124LinearProgressIndicator_RIQooxk$lambda42;
                        float m1121LinearProgressIndicator_RIQooxk$lambda12;
                        float m1122LinearProgressIndicator_RIQooxk$lambda22;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float m1458getHeightimpl = Size.m1458getHeightimpl(Canvas.mo2122getSizeNHjbRc());
                        ProgressIndicatorKt.m1141drawLinearIndicatorBackgroundbw27NRU(Canvas, j5, m1458getHeightimpl);
                        m1121LinearProgressIndicator_RIQooxk$lambda1 = ProgressIndicatorKt.m1121LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                        m1122LinearProgressIndicator_RIQooxk$lambda2 = ProgressIndicatorKt.m1122LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                        if (m1121LinearProgressIndicator_RIQooxk$lambda1 - m1122LinearProgressIndicator_RIQooxk$lambda2 > 0.0f) {
                            m1121LinearProgressIndicator_RIQooxk$lambda12 = ProgressIndicatorKt.m1121LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                            m1122LinearProgressIndicator_RIQooxk$lambda22 = ProgressIndicatorKt.m1122LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                            ProgressIndicatorKt.m1140drawLinearIndicator42QJj7c(Canvas, m1121LinearProgressIndicator_RIQooxk$lambda12, m1122LinearProgressIndicator_RIQooxk$lambda22, j6, m1458getHeightimpl);
                        }
                        m1123LinearProgressIndicator_RIQooxk$lambda3 = ProgressIndicatorKt.m1123LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                        m1124LinearProgressIndicator_RIQooxk$lambda4 = ProgressIndicatorKt.m1124LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                        if (m1123LinearProgressIndicator_RIQooxk$lambda3 - m1124LinearProgressIndicator_RIQooxk$lambda4 > 0.0f) {
                            m1123LinearProgressIndicator_RIQooxk$lambda32 = ProgressIndicatorKt.m1123LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                            m1124LinearProgressIndicator_RIQooxk$lambda42 = ProgressIndicatorKt.m1124LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                            ProgressIndicatorKt.m1140drawLinearIndicator42QJj7c(Canvas, m1123LinearProgressIndicator_RIQooxk$lambda32, m1124LinearProgressIndicator_RIQooxk$lambda42, j6, m1458getHeightimpl);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m463sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            m976getPrimary0d7_KjU = j3;
        }
        final long j7 = j4;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                ProgressIndicatorKt.m1119LinearProgressIndicatorRIQooxk(Modifier.this, m976getPrimary0d7_KjU, j7, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-42QJj7c, reason: not valid java name */
    public static final void m1140drawLinearIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, float f3) {
        float m1461getWidthimpl = Size.m1461getWidthimpl(drawScope.mo2122getSizeNHjbRc());
        float m1458getHeightimpl = Size.m1458getHeightimpl(drawScope.mo2122getSizeNHjbRc()) / 2;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        DrawScope.m2109drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset((z ? f : 1.0f - f2) * m1461getWidthimpl, m1458getHeightimpl), OffsetKt.Offset((z ? f2 : 1.0f - f) * m1461getWidthimpl, m1458getHeightimpl), f3, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1141drawLinearIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, float f) {
        m1140drawLinearIndicator42QJj7c(drawScope, 0.0f, 1.0f, j, f);
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
    public static final void m1113CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final long j2;
        int i4;
        float f3;
        final long j3;
        float f4;
        Modifier modifier3;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-409649739);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)226@9099L6,*229@9214L7,232@9300L296:ProgressIndicator.kt#jmzs0o");
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
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        long m976getPrimary0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m976getPrimary0d7_KjU() : j2;
                        if (i4 != 0) {
                            modifier3 = companion;
                            j3 = m976getPrimary0d7_KjU;
                            f4 = ProgressIndicatorDefaults.INSTANCE.m1112getStrokeWidthD9Ej5fM();
                        } else {
                            j3 = m976getPrimary0d7_KjU;
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
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Stroke stroke = new Stroke(((Density) consume).mo315toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1932getButtKaPHkGw(), 0, null, 26, null);
                    CanvasKt.Canvas(SizeKt.m461size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            ProgressIndicatorKt.m1138drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke);
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
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        ProgressIndicatorKt.m1113CircularProgressIndicatorMBs18nI(f, modifier2, j2, f5, composer2, i | 1, i2);
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
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Stroke stroke2 = new Stroke(((Density) consume2).mo315toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1932getButtKaPHkGw(), 0, null, 26, null);
            CanvasKt.Canvas(SizeKt.m461size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.m1138drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke2);
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
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Stroke stroke22 = new Stroke(((Density) consume22).mo315toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1932getButtKaPHkGw(), 0, null, 26, null);
        CanvasKt.Canvas(SizeKt.m461size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                ProgressIndicatorKt.m1138drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke22);
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
    public static final void m1114CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f2;
        Modifier.Companion companion;
        long m976getPrimary0d7_KjU;
        float m1112getStrokeWidthD9Ej5fM;
        final Modifier modifier3;
        final long j3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-392089979);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)257@10275L6,*260@10390L7,264@10496L28,266@10654L278,278@11047L230,289@11395L345,301@11775L354,312@12134L582:ProgressIndicator.kt#jmzs0o");
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
                    companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    m976getPrimary0d7_KjU = (i2 & 2) == 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m976getPrimary0d7_KjU() : j2;
                    if (i6 != 0) {
                        m1112getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1112getStrokeWidthD9Ej5fM();
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Stroke stroke = new Stroke(((Density) consume).mo315toPx0680j_4(m1112getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m1934getSquareKaPHkGw(), 0, null, 26, null);
                        InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                        final State animateValue = InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12));
                        final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                        final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                CubicBezierEasing cubicBezierEasing;
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
                                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at(Float.valueOf(290.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                            }
                        }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                        final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                CubicBezierEasing cubicBezierEasing;
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                            }
                        }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                        final float f4 = m1112getStrokeWidthD9Ej5fM;
                        final long j4 = m976getPrimary0d7_KjU;
                        CanvasKt.Canvas(SizeKt.m461size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope Canvas) {
                                int m1117CircularProgressIndicator_aM_cp0Q$lambda8;
                                float m1115CircularProgressIndicator_aM_cp0Q$lambda10;
                                float m1116CircularProgressIndicator_aM_cp0Q$lambda11;
                                float m1118CircularProgressIndicator_aM_cp0Q$lambda9;
                                float m1116CircularProgressIndicator_aM_cp0Q$lambda112;
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                m1117CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m1117CircularProgressIndicator_aM_cp0Q$lambda8(animateValue);
                                m1115CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m1115CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat2);
                                m1116CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m1116CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                float abs = Math.abs(m1115CircularProgressIndicator_aM_cp0Q$lambda10 - m1116CircularProgressIndicator_aM_cp0Q$lambda11);
                                m1118CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m1118CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat);
                                float f5 = (((m1117CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1118CircularProgressIndicator_aM_cp0Q$lambda9;
                                m1116CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m1116CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                ProgressIndicatorKt.m1139drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1116CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f4, abs, j4, stroke);
                            }
                        }, startRestartGroup, 0);
                        modifier3 = companion;
                        j3 = m976getPrimary0d7_KjU;
                        f3 = m1112getStrokeWidthD9Ej5fM;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    m976getPrimary0d7_KjU = j2;
                }
                m1112getStrokeWidthD9Ej5fM = f2;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Stroke stroke2 = new Stroke(((Density) consume2).mo315toPx0680j_4(m1112getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m1934getSquareKaPHkGw(), 0, null, 26, null);
                InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                final State<Integer> animateValue2 = InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12));
                final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                final State<Float> animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        CubicBezierEasing cubicBezierEasing;
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
                        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at(Float.valueOf(290.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                    }
                }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                final State<Float> animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        CubicBezierEasing cubicBezierEasing;
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                final float f42 = m1112getStrokeWidthD9Ej5fM;
                final long j42 = m976getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m461size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope Canvas) {
                        int m1117CircularProgressIndicator_aM_cp0Q$lambda8;
                        float m1115CircularProgressIndicator_aM_cp0Q$lambda10;
                        float m1116CircularProgressIndicator_aM_cp0Q$lambda11;
                        float m1118CircularProgressIndicator_aM_cp0Q$lambda9;
                        float m1116CircularProgressIndicator_aM_cp0Q$lambda112;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        m1117CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m1117CircularProgressIndicator_aM_cp0Q$lambda8(animateValue2);
                        m1115CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m1115CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat22);
                        m1116CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m1116CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        float abs = Math.abs(m1115CircularProgressIndicator_aM_cp0Q$lambda10 - m1116CircularProgressIndicator_aM_cp0Q$lambda11);
                        m1118CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m1118CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat4);
                        float f5 = (((m1117CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1118CircularProgressIndicator_aM_cp0Q$lambda9;
                        m1116CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m1116CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        ProgressIndicatorKt.m1139drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1116CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f42, abs, j42, stroke2);
                    }
                }, startRestartGroup, 0);
                modifier3 = companion;
                j3 = m976getPrimary0d7_KjU;
                f3 = m1112getStrokeWidthD9Ej5fM;
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    ProgressIndicatorKt.m1114CircularProgressIndicatoraMcp0Q(Modifier.this, j3, f3, composer2, i | 1, i2);
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
        m1112getStrokeWidthD9Ej5fM = f2;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Stroke stroke22 = new Stroke(((Density) consume22).mo315toPx0680j_4(m1112getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m1934getSquareKaPHkGw(), 0, null, 26, null);
        InfiniteTransition rememberInfiniteTransition22 = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
        final State<Integer> animateValue22 = InfiniteTransitionKt.animateValue(rememberInfiniteTransition22, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12));
        final State<Float> animateFloat42 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, BaseRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
        final State<Float> animateFloat222 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, JumpRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                invoke2(keyframesSpecConfig);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                CubicBezierEasing cubicBezierEasing;
                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                keyframes.setDurationMillis(1332);
                KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), 0);
                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                keyframes.with(at, cubicBezierEasing);
                keyframes.at(Float.valueOf(290.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
            }
        }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
        final State<Float> animateFloat322 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, JumpRotationAngle, AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                invoke2(keyframesSpecConfig);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                CubicBezierEasing cubicBezierEasing;
                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                keyframes.setDurationMillis(1332);
                KeyframesSpec.KeyframeEntity<Float> at = keyframes.at(Float.valueOf(0.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                keyframes.with(at, cubicBezierEasing);
                keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
            }
        }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
        final float f422 = m1112getStrokeWidthD9Ej5fM;
        final long j422 = m976getPrimary0d7_KjU;
        CanvasKt.Canvas(SizeKt.m461size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                int m1117CircularProgressIndicator_aM_cp0Q$lambda8;
                float m1115CircularProgressIndicator_aM_cp0Q$lambda10;
                float m1116CircularProgressIndicator_aM_cp0Q$lambda11;
                float m1118CircularProgressIndicator_aM_cp0Q$lambda9;
                float m1116CircularProgressIndicator_aM_cp0Q$lambda112;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                m1117CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m1117CircularProgressIndicator_aM_cp0Q$lambda8(animateValue22);
                m1115CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m1115CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat222);
                m1116CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m1116CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat322);
                float abs = Math.abs(m1115CircularProgressIndicator_aM_cp0Q$lambda10 - m1116CircularProgressIndicator_aM_cp0Q$lambda11);
                m1118CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m1118CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat42);
                float f5 = (((m1117CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1118CircularProgressIndicator_aM_cp0Q$lambda9;
                m1116CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m1116CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat322);
                ProgressIndicatorKt.m1139drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1116CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f422, abs, j422, stroke22);
            }
        }, startRestartGroup, 0);
        modifier3 = companion;
        j3 = m976getPrimary0d7_KjU;
        f3 = m1112getStrokeWidthD9Ej5fM;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1137drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m1461getWidthimpl = Size.m1461getWidthimpl(drawScope.mo2122getSizeNHjbRc()) - (f3 * width);
        DrawScope.m2102drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m1461getWidthimpl, m1461getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1138drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m1137drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1139drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m1137drawCircularIndicator42QJj7c(drawScope, f + (((f2 / Dp.m3840constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-1, reason: not valid java name */
    public static final float m1121LinearProgressIndicator_RIQooxk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-2, reason: not valid java name */
    public static final float m1122LinearProgressIndicator_RIQooxk$lambda2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-3, reason: not valid java name */
    public static final float m1123LinearProgressIndicator_RIQooxk$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-4, reason: not valid java name */
    public static final float m1124LinearProgressIndicator_RIQooxk$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-8, reason: not valid java name */
    public static final int m1117CircularProgressIndicator_aM_cp0Q$lambda8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-9, reason: not valid java name */
    public static final float m1118CircularProgressIndicator_aM_cp0Q$lambda9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-10, reason: not valid java name */
    public static final float m1115CircularProgressIndicator_aM_cp0Q$lambda10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-11, reason: not valid java name */
    public static final float m1116CircularProgressIndicator_aM_cp0Q$lambda11(State<Float> state) {
        return state.getValue().floatValue();
    }
}
