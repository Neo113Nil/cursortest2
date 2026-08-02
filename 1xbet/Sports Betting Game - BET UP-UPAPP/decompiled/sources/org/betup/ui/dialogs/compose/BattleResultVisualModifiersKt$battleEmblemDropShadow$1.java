package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BattleResultVisualModifiers.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BattleResultVisualModifiersKt$battleEmblemDropShadow$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ float $blurSpread;
    final /* synthetic */ float $offsetY;
    final /* synthetic */ long $shadowColor;

    BattleResultVisualModifiersKt$battleEmblemDropShadow$1(long j, float f, float f2) {
        this.$shadowColor = j;
        this.$blurSpread = f;
        this.$offsetY = f2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(244962336);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(244962336, i, -1, "org.betup.ui.dialogs.compose.battleEmblemDropShadow.<anonymous> (BattleResultVisualModifiers.kt:19)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(this.$blurSpread);
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float mo1167toPx0680j_42 = ((Density) consume2).mo1167toPx0680j_4(this.$offsetY);
        composer.startReplaceGroup(-1746271574);
        boolean changed = composer.changed(this.$shadowColor) | composer.changed(mo1167toPx0680j_42) | composer.changed(mo1167toPx0680j_4);
        final long j = this.$shadowColor;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultVisualModifiersKt$battleEmblemDropShadow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = BattleResultVisualModifiersKt$battleEmblemDropShadow$1.invoke$lambda$4$lambda$3(j, mo1167toPx0680j_42, mo1167toPx0680j_4, (DrawScope) obj);
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier drawBehind = DrawModifierKt.drawBehind(composed, (Function1) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return drawBehind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(long j, float f, float f2, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (Color.m5170getAlphaimpl(j) > 0.0f) {
            float intBitsToFloat = (Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) * 0.62f) + f;
            long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(j, Color.m5170getAlphaimpl(j) * 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
            long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) * 0.18f) << 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) * 0.64f;
            float intBitsToFloat3 = (Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) * 0.12f) + (f2 * 0.2f);
            DrawScope.m5718drawOvalnJ9OG0$default(drawBehind, m5167copywmQWz5c$default, m4919constructorimpl, Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32)), 0.0f, null, null, 0, 120, null);
            int i = 0;
            while (i < 4) {
                int i2 = i + 1;
                long m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(j, Color.m5170getAlphaimpl(j) * (0.24f / i2), 0.0f, 0.0f, 0.0f, 14, null);
                float m4995getMinDimensionimpl = (Size.m4995getMinDimensionimpl(drawBehind.mo5730getSizeNHjbRc()) * 0.2f) + (i * (f2 / 4.0f));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) / 2.0f;
                float intBitsToFloat5 = (Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) * 0.54f) + f;
                DrawScope.m5711drawCircleVaOC9Bg$default(drawBehind, m5167copywmQWz5c$default2, m4995getMinDimensionimpl, Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32)), 0.0f, null, null, 0, 120, null);
                i = i2;
            }
        }
        return Unit.INSTANCE;
    }
}
