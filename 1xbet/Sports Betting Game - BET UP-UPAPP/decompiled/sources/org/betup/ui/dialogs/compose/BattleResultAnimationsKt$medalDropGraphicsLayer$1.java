package org.betup.ui.dialogs.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: BattleResultAnimations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BattleResultAnimationsKt$medalDropGraphicsLayer$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $revealPhase;

    BattleResultAnimationsKt$medalDropGraphicsLayer$1(int i) {
        this.$revealPhase = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        TweenSpec tweenSpec;
        float invoke$lambda$0;
        float f;
        float invoke$lambda$02;
        float f2;
        final float invoke$lambda$03;
        boolean changed;
        Object rememberedValue;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(1327272871);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327272871, i, -1, "org.betup.ui.dialogs.compose.medalDropGraphicsLayer.<anonymous> (BattleResultAnimations.kt:149)");
        }
        ProvidableCompositionLocal<Object> localBattleRevealResetKey = BattleResultAnimationsKt.getLocalBattleRevealResetKey();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localBattleRevealResetKey);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.startMovableGroup(-96054443, consume);
        boolean z = this.$revealPhase >= 1;
        final float f3 = 0.0f;
        float f4 = z ? 1.0f : 0.0f;
        if (!z) {
            tweenSpec = BattleResultAnimationsKt.BattleRevealSnapSpec;
        } else {
            tweenSpec = AnimationSpecKt.tween$default(560, 0, new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f), 2, null);
        }
        final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f4, tweenSpec, 0.0f, "medalDrop", null, composer, 3072, 20);
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume2;
        if (invoke$lambda$0(animateFloatAsState) >= 0.6f) {
            if (invoke$lambda$0(animateFloatAsState) < 0.82f) {
                f3 = ((invoke$lambda$0(animateFloatAsState) - 0.6f) / 0.22f) * 6.0f;
            } else if (invoke$lambda$0(animateFloatAsState) < 1.0f) {
                invoke$lambda$0 = 1.0f - ((invoke$lambda$0(animateFloatAsState) - 0.82f) / 0.18f);
                f = -2.0f;
            }
            if (invoke$lambda$0(animateFloatAsState) >= 0.6f) {
                invoke$lambda$02 = (invoke$lambda$0(animateFloatAsState) / 0.6f) * 0.3f;
                f2 = 0.72f;
            } else if (invoke$lambda$0(animateFloatAsState) >= 0.82f) {
                invoke$lambda$02 = ((invoke$lambda$0(animateFloatAsState) - 0.82f) / 0.18f) * 0.01f;
                f2 = 0.99f;
            } else {
                invoke$lambda$03 = 1.02f - (((invoke$lambda$0(animateFloatAsState) - 0.6f) / 0.22f) * 0.03f);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1224400529);
                changed = composer.changed(density) | composer.changed(f3) | composer.changed(invoke$lambda$03) | composer.changed(animateFloatAsState);
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$medalDropGraphicsLayer$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$3$lambda$2;
                            invoke$lambda$3$lambda$2 = BattleResultAnimationsKt$medalDropGraphicsLayer$1.invoke$lambda$3$lambda$2(Density.this, invoke$lambda$03, f3, animateFloatAsState, (GraphicsLayerScope) obj);
                            return invoke$lambda$3$lambda$2;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue);
                composer.endMovableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return graphicsLayer;
            }
            invoke$lambda$03 = invoke$lambda$02 + f2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1224400529);
            changed = composer.changed(density) | composer.changed(f3) | composer.changed(invoke$lambda$03) | composer.changed(animateFloatAsState);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$medalDropGraphicsLayer$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = BattleResultAnimationsKt$medalDropGraphicsLayer$1.invoke$lambda$3$lambda$2(Density.this, invoke$lambda$03, f3, animateFloatAsState, (GraphicsLayerScope) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue);
            composer.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            return graphicsLayer2;
        }
        invoke$lambda$0 = 1.0f - (invoke$lambda$0(animateFloatAsState) / 0.6f);
        f = -72.0f;
        f3 = invoke$lambda$0 * f;
        if (invoke$lambda$0(animateFloatAsState) >= 0.6f) {
        }
        invoke$lambda$03 = invoke$lambda$02 + f2;
        Modifier.Companion companion22 = Modifier.INSTANCE;
        composer.startReplaceGroup(-1224400529);
        changed = composer.changed(density) | composer.changed(f3) | composer.changed(invoke$lambda$03) | composer.changed(animateFloatAsState);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$medalDropGraphicsLayer$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3$lambda$2;
                invoke$lambda$3$lambda$2 = BattleResultAnimationsKt$medalDropGraphicsLayer$1.invoke$lambda$3$lambda$2(Density.this, invoke$lambda$03, f3, animateFloatAsState, (GraphicsLayerScope) obj);
                return invoke$lambda$3$lambda$2;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        composer.endReplaceGroup();
        Modifier graphicsLayer22 = GraphicsLayerModifierKt.graphicsLayer(companion22, (Function1) rememberedValue);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return graphicsLayer22;
    }

    private static final float invoke$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Density density, float f, float f2, State state, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(density.mo1167toPx0680j_4(Dp.m7774constructorimpl(f2)));
        graphicsLayer.setScaleX(f);
        graphicsLayer.setScaleY(f);
        graphicsLayer.setAlpha(RangesKt.coerceIn(invoke$lambda$0(state), 0.0f, 1.0f));
        return Unit.INSTANCE;
    }
}
