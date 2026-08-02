package org.betup.ui.tour.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: TourDemoMatchSimulationScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;

    TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2(Animatable<Float, AnimationVector1D> animatable) {
        this.$progress = animatable;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(float f, float f2, long j, long j2, float f3, long j3, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * f;
        float f4 = 2;
        float f5 = f2 / f4;
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j, Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        float f6 = (f2 - (f4 * f3)) / f4;
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j2, Offset.m4919constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(RangesKt.coerceAtLeast(intBitsToFloat - r20, 0.0f)) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j, Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) - intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j3, Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat + f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(RangesKt.coerceAtLeast((Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) - intBitsToFloat) - r20, 0.0f)) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(164449541, i2, -1, "org.betup.ui.tour.compose.TourDemoMatchSimulationScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TourDemoMatchSimulationScreen.kt:268)");
        }
        float m7774constructorimpl = Dp.m7774constructorimpl(6);
        float m7774constructorimpl2 = Dp.m7774constructorimpl(28);
        float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
        final float coerceIn = RangesKt.coerceIn(this.$progress.getValue().floatValue(), 0.0f, 1.0f);
        float m7774constructorimpl3 = Dp.m7774constructorimpl(Dp.m7774constructorimpl(mo1423getMaxWidthD9Ej5fM - m7774constructorimpl2) * coerceIn);
        final long j = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
        final long j2 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        final long j3 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        final float mo1167toPx0680j_4 = density.mo1167toPx0680j_4(m7774constructorimpl);
        final float mo1167toPx0680j_42 = density.mo1167toPx0680j_4(Dp.m7774constructorimpl(1));
        Modifier align = BoxWithConstraints.align(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl), Alignment.INSTANCE.getCenter());
        composer.startReplaceGroup(-1224400529);
        boolean changed = composer.changed(coerceIn) | composer.changed(mo1167toPx0680j_4) | composer.changed(j) | composer.changed(j2) | composer.changed(mo1167toPx0680j_42) | composer.changed(j3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2.invoke$lambda$3$lambda$2(coerceIn, mo1167toPx0680j_4, j, j2, mo1167toPx0680j_42, j3, (DrawScope) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CanvasKt.Canvas(align, (Function1) rememberedValue, composer, 0);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ball, composer, 6);
        Modifier m1476offsetVpY3zN4$default = OffsetKt.m1476offsetVpY3zN4$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl2), m7774constructorimpl3, 0.0f, 2, null);
        composer.startReplaceGroup(5004770);
        boolean changed2 = composer.changed(coerceIn);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.tour.compose.TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = TourDemoMatchSimulationScreenKt$TourDemoMatchSimulationScreen$2$1$1$2.invoke$lambda$5$lambda$4(coerceIn, (GraphicsLayerScope) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        ImageKt.Image(painterResource, (String) null, BoxWithConstraints.align(GraphicsLayerModifierKt.graphicsLayer(m1476offsetVpY3zN4$default, (Function1) rememberedValue2), Alignment.INSTANCE.getCenterStart()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ(f * 720.0f);
        return Unit.INSTANCE;
    }
}
