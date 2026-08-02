package org.betup.ui.common.compose.slider;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: CustomBorderSlider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CustomBorderSliderKt$CustomBorderSlider$1$2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ long $activeTrackColor;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ long $inactiveTrackColor;
    final /* synthetic */ Function1<Integer, Unit> $onValueChange;
    final /* synthetic */ int $span;
    final /* synthetic */ int $step;
    final /* synthetic */ float $thumbRadius;
    final /* synthetic */ float $thumbSize;
    final /* synthetic */ float $trackHeight;
    final /* synthetic */ int $value;

    /* JADX WARN: Multi-variable type inference failed */
    CustomBorderSliderKt$CustomBorderSlider$1$2(int i, int i2, boolean z, int i3, Function1<? super Integer, Unit> function1, float f, float f2, long j, long j2, long j3, float f3) {
        this.$span = i;
        this.$value = i2;
        this.$enabled = z;
        this.$step = i3;
        this.$onValueChange = function1;
        this.$thumbRadius = f;
        this.$trackHeight = f2;
        this.$borderColor = j;
        this.$activeTrackColor = j2;
        this.$inactiveTrackColor = j3;
        this.$thumbSize = f3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(float f, float f2, long j, long j2, long j3, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f3 = 2;
        float intBitsToFloat = (Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) / f3) - (Canvas.mo1167toPx0680j_4(f) / f3);
        float f4 = Canvas.mo1167toPx0680j_4(Dp.m7774constructorimpl(1));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * f2;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
        float f5 = Canvas.mo1167toPx0680j_4(f);
        long m4987constructorimpl = Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        float f6 = Canvas.mo1167toPx0680j_4(f) / f3;
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j, m4919constructorimpl, m4987constructorimpl, CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        float f7 = intBitsToFloat + f4;
        long m4919constructorimpl2 = Offset.m4919constructorimpl((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
        float f8 = f3 * f4;
        float f9 = Canvas.mo1167toPx0680j_4(f) - f8;
        long m4987constructorimpl2 = Size.m4987constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2 - f8) << 32));
        float f10 = (Canvas.mo1167toPx0680j_4(f) - f8) / f3;
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j2, m4919constructorimpl2, m4987constructorimpl2, CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        long m4919constructorimpl3 = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) - intBitsToFloat2;
        float f11 = Canvas.mo1167toPx0680j_4(f);
        long m4987constructorimpl3 = Size.m4987constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
        float f12 = Canvas.mo1167toPx0680j_4(f) / f3;
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j, m4919constructorimpl3, m4987constructorimpl3, CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        long m4919constructorimpl4 = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat2 + f4) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
        float intBitsToFloat4 = (Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) - intBitsToFloat2) - f8;
        float f13 = Canvas.mo1167toPx0680j_4(f) - f8;
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j3, m4919constructorimpl4, Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(r0) & 4294967295L) | (Float.floatToRawIntBits((Canvas.mo1167toPx0680j_4(f) - f8) / f3) << 32)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        int i3;
        long j;
        long j2;
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
            ComposerKt.traceEventStart(-1926306418, i2, -1, "org.betup.ui.common.compose.slider.CustomBorderSlider.<anonymous>.<anonymous> (CustomBorderSlider.kt:72)");
        }
        float m7727getMaxWidthimpl = Constraints.m7727getMaxWidthimpl(BoxWithConstraints.mo1421getConstraintsmsEJaDk());
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        float mo1167toPx0680j_4 = density.mo1167toPx0680j_4(this.$thumbRadius);
        int i4 = this.$span;
        final float coerceIn = i4 == 0 ? 0.0f : RangesKt.coerceIn(this.$value / i4, 0.0f, 1.0f);
        float mo1163toDpu2uoSUM = density.mo1163toDpu2uoSUM(RangesKt.coerceAtLeast((coerceIn * m7727getMaxWidthimpl) - mo1167toPx0680j_4, 0.0f));
        composer.startReplaceGroup(-49543318);
        if (this.$enabled) {
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1224400529);
            boolean changed = composer.changed(m7727getMaxWidthimpl) | composer.changed(this.$span) | composer.changed(this.$step) | composer.changed(this.$onValueChange);
            int i5 = this.$span;
            int i6 = this.$step;
            Function1<Integer, Unit> function1 = this.$onValueChange;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (PointerInputEventHandler) new CustomBorderSliderKt$CustomBorderSlider$1$2$dragModifier$1$1(m7727getMaxWidthimpl, i5, i6, function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            companion = SuspendingPointerInputFilterKt.pointerInput(companion3, unit, (PointerInputEventHandler) rememberedValue);
        } else {
            companion = Modifier.INSTANCE;
        }
        composer.endReplaceGroup();
        Modifier then = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), 0.0f, 1, null).then(companion);
        Alignment centerStart = Alignment.INSTANCE.getCenterStart();
        boolean z = this.$enabled;
        int i7 = this.$span;
        int i8 = this.$step;
        Function1<Integer, Unit> function12 = this.$onValueChange;
        final float f = this.$trackHeight;
        final long j3 = this.$borderColor;
        final long j4 = this.$activeTrackColor;
        final long j5 = this.$inactiveTrackColor;
        float f2 = this.$thumbSize;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, then);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceGroup(198126399);
        if (z) {
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean changed2 = composer.changed(i7) | composer.changed(i8) | composer.changed(function12);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (PointerInputEventHandler) new CustomBorderSliderKt$CustomBorderSlider$1$2$1$tapModifier$1$1(i7, i8, function12);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            companion2 = SuspendingPointerInputFilterKt.pointerInput(companion4, unit2, (PointerInputEventHandler) rememberedValue2);
        } else {
            companion2 = Modifier.INSTANCE;
        }
        composer.endReplaceGroup();
        Modifier then2 = SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f).then(companion2);
        composer.startReplaceGroup(-1224400529);
        boolean changed3 = composer.changed(coerceIn) | composer.changed(j3) | composer.changed(j4) | composer.changed(j5);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            i3 = 1;
            j = j3;
            j2 = j4;
            rememberedValue3 = new Function1() { // from class: org.betup.ui.common.compose.slider.CustomBorderSliderKt$CustomBorderSlider$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$6$lambda$5$lambda$4;
                    invoke$lambda$6$lambda$5$lambda$4 = CustomBorderSliderKt$CustomBorderSlider$1$2.invoke$lambda$6$lambda$5$lambda$4(f, coerceIn, j3, j4, j5, (DrawScope) obj);
                    return invoke$lambda$6$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        } else {
            i3 = 1;
            j = j3;
            j2 = j4;
        }
        composer.endReplaceGroup();
        CanvasKt.Canvas(then2, (Function1) rememberedValue3, composer, 0);
        float f3 = i3;
        BoxKt.Box(BorderKt.m1036borderxT4_qwU(BackgroundKt.m1024backgroundbw27NRU(ShadowKt.m4803shadows4CzXII$default(SizeKt.m1563size3ABfNKs(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, mo1163toDpu2uoSUM, 0.0f, 0.0f, 0.0f, 14, null), f2), Dp.m7774constructorimpl(f3), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), j2, RoundedCornerShapeKt.getCircleShape()), Dp.m7774constructorimpl(f3), j, RoundedCornerShapeKt.getCircleShape()), composer, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
