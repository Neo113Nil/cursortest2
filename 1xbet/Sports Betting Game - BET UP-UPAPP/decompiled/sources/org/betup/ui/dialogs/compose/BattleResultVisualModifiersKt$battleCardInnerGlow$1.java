package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BattleResultVisualModifiers.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BattleResultVisualModifiersKt$battleCardInnerGlow$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ long $glowColor;

    BattleResultVisualModifiersKt$battleCardInnerGlow$1(long j, float f) {
        this.$glowColor = j;
        this.$cornerRadius = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(1787654854);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1787654854, i, -1, "org.betup.ui.dialogs.compose.battleCardInnerGlow.<anonymous> (BattleResultVisualModifiers.kt:46)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(this.$cornerRadius);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$glowColor) | composer.changed(mo1167toPx0680j_4);
        final long j = this.$glowColor;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultVisualModifiersKt$battleCardInnerGlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = BattleResultVisualModifiersKt$battleCardInnerGlow$1.invoke$lambda$2$lambda$1(j, mo1167toPx0680j_4, (DrawScope) obj);
                    return invoke$lambda$2$lambda$1;
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
    public static final Unit invoke$lambda$2$lambda$1(long j, float f, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (Color.m5170getAlphaimpl(j) <= 0.0f) {
            return Unit.INSTANCE;
        }
        Brush.Companion companion = Brush.INSTANCE;
        List listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(j, Color.m5170getAlphaimpl(j) * 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(j, Color.m5170getAlphaimpl(j) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())});
        float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) / 2.0f;
        DrawScope.m5725drawRoundRectZuiqVtQ$default(drawBehind, Brush.Companion.m5121radialGradientP_VxKs$default(companion, listOf, Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) * 0.08f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), Size.m4994getMaxDimensionimpl(drawBehind.mo5730getSizeNHjbRc()) * 0.85f, 0, 8, (Object) null), 0L, drawBehind.mo5730getSizeNHjbRc(), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), 0.0f, null, null, 0, 242, null);
        return Unit.INSTANCE;
    }
}
