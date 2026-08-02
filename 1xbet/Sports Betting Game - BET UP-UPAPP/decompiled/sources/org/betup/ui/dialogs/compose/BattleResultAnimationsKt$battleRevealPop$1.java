package org.betup.ui.dialogs.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BattleResultAnimations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BattleResultAnimationsKt$battleRevealPop$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $revealPhase;
    final /* synthetic */ int $threshold;

    BattleResultAnimationsKt$battleRevealPop$1(int i, int i2) {
        this.$revealPhase = i;
        this.$threshold = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(1168006319);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1168006319, i, -1, "org.betup.ui.dialogs.compose.battleRevealPop.<anonymous> (BattleResultAnimations.kt:327)");
        }
        ProvidableCompositionLocal<Object> localBattleRevealResetKey = BattleResultAnimationsKt.getLocalBattleRevealResetKey();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localBattleRevealResetKey);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.startMovableGroup(1467610955, consume);
        boolean z = this.$revealPhase >= this.$threshold;
        final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, z ? BattleResultAnimationsKt.BattleRevealInSpec : BattleResultAnimationsKt.BattleRevealSnapSpec, 0.0f, "battleRevealPop", null, composer, 3072, 20);
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(animateFloatAsState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$battleRevealPop$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = BattleResultAnimationsKt$battleRevealPop$1.invoke$lambda$2$lambda$1(State.this, (GraphicsLayerScope) obj);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(composed, (Function1) rememberedValue);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(State state, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(invoke$lambda$0(state));
        graphicsLayer.setScaleX((invoke$lambda$0(state) * 0.18f) + 0.82f);
        graphicsLayer.setScaleY((invoke$lambda$0(state) * 0.18f) + 0.82f);
        return Unit.INSTANCE;
    }

    private static final float invoke$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
