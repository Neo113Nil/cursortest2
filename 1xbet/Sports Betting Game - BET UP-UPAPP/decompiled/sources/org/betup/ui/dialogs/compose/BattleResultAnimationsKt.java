package org.betup.ui.dialogs.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import androidx.mediarouter.media.MediaRouterJellybean;
import com.ironsource.C3664q2;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BattleResultAnimations.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a'\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0011\u001a1\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0018\u001a\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\f\u001a'\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010#\u001a\"\u0010$\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a*\u0010&\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e\u001a\"\u0010(\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020\fH\u0007¢\u0006\u0002\u0010+\u001a\u001f\u0010,\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020\fH\u0007¢\u0006\u0002\u0010+\u001a\u0015\u0010-\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010.\u001a'\u0010/\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0007¢\u0006\u0002\u0010#\u001a/\u00100\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u00101\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u00102\u001a3\u00103\u001a\u00020\u001c*\u00020\u001c2\u0006\u00104\u001a\u0002052\u0006\u00101\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u00106\u001a\u000207¢\u0006\u0004\b8\u00109\u001a\u001f\u0010:\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020\fH\u0007¢\u0006\u0002\u0010+\u001a)\u0010;\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010<\u001a)\u0010=\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010<\u001a)\u0010>\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010<\u001aD\u0010?\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u000e2\u0011\u0010B\u001a\r\u0012\u0004\u0012\u00020\u001e0C¢\u0006\u0002\bDH\u0007¢\u0006\u0002\u0010E\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006F²\u0006\n\u0010G\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010H\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010I\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u0010I\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010L\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010M\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010N\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010O\u001a\u00020\u0004X\u008a\u0084\u0002"}, d2 = {"BattleRevealEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "BattleRevealInSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BattleRevealSnapSpec", "LocalBattleRevealResetKey", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalBattleRevealResetKey", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberBattleRevealPhase", "", "enabled", "", "resetKey", "fullSequence", "(ZLjava/lang/Object;ZLandroidx/compose/runtime/Composer;I)I", "rememberAnimatedBattleAmountValue", "", "amountText", "", "revealPhase", "phaseThreshold", "(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;II)Ljava/lang/Long;", "parseBattleAmount", "Lorg/betup/ui/dialogs/compose/ParsedBattleAmount;", "medalDropGraphicsLayer", "Landroidx/compose/ui/Modifier;", "BattleConfettiBurst", "", "modifier", C3664q2.v, "palette", "Lorg/betup/ui/dialogs/compose/BattleResultPalette;", "(Landroidx/compose/ui/Modifier;ZLorg/betup/ui/dialogs/compose/BattleResultPalette;Landroidx/compose/runtime/Composer;II)V", "battleRevealRise", "threshold", "battleRevealSlide", "fromLeft", "battleRevealPop", "rememberGlowPulse", "durationMs", "(ZILandroidx/compose/runtime/Composer;II)F", "rememberShimmerProgress", "rememberEmblemEntrance", "(ZLandroidx/compose/runtime/Composer;I)F", "BattleCelebrationParticles", "BattleAmbientGlow", "pulse", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;FZLandroidx/compose/runtime/Composer;II)V", "battleColumnGlow", "glowColor", "Landroidx/compose/ui/graphics/Color;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "battleColumnGlow-M0xzIa8", "(Landroidx/compose/ui/Modifier;JFZF)Landroidx/compose/ui/Modifier;", "rememberRingRotation", "BattlePendingLightRays", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;FLandroidx/compose/runtime/Composer;II)V", "BattleVictoryLightRays", "BattleVictoryBaseGlow", "BattleAnimatedEmblem", "animationsEnabled", "useLegacyEntrance", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/compose/BattleResultPalette;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release", TypedValues.CycleType.S_WAVE_PHASE, "animated", "progress", "burstKey", "started", "scale", "alpha", "time", Key.ROTATION}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleResultAnimationsKt {
    private static final CubicBezierEasing BattleRevealEasing;
    private static final TweenSpec<Float> BattleRevealInSpec;
    private static final TweenSpec<Float> BattleRevealSnapSpec;
    private static final ProvidableCompositionLocal<Object> LocalBattleRevealResetKey;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleAmbientGlow$lambda$39(Modifier modifier, BattleResultPalette battleResultPalette, float f, boolean z, int i, int i2, Composer composer, int i3) {
        BattleAmbientGlow(modifier, battleResultPalette, f, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleAmbientGlow$lambda$42(Modifier modifier, BattleResultPalette battleResultPalette, float f, boolean z, int i, int i2, Composer composer, int i3) {
        BattleAmbientGlow(modifier, battleResultPalette, f, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleAnimatedEmblem$lambda$60(Modifier modifier, BattleResultPalette battleResultPalette, boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        BattleAnimatedEmblem(modifier, battleResultPalette, z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleCelebrationParticles$lambda$31(Modifier modifier, boolean z, BattleResultPalette battleResultPalette, int i, int i2, Composer composer, int i3) {
        BattleCelebrationParticles(modifier, z, battleResultPalette, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleCelebrationParticles$lambda$38(Modifier modifier, boolean z, BattleResultPalette battleResultPalette, int i, int i2, Composer composer, int i3) {
        BattleCelebrationParticles(modifier, z, battleResultPalette, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleConfettiBurst$lambda$22(Modifier modifier, boolean z, BattleResultPalette battleResultPalette, int i, int i2, Composer composer, int i3) {
        BattleConfettiBurst(modifier, z, battleResultPalette, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleConfettiBurst$lambda$8(Modifier modifier, boolean z, BattleResultPalette battleResultPalette, int i, int i2, Composer composer, int i3) {
        BattleConfettiBurst(modifier, z, battleResultPalette, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlePendingLightRays$lambda$49(Modifier modifier, BattleResultPalette battleResultPalette, float f, int i, int i2, Composer composer, int i3) {
        BattlePendingLightRays(modifier, battleResultPalette, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleVictoryBaseGlow$lambda$56(Modifier modifier, BattleResultPalette battleResultPalette, float f, int i, int i2, Composer composer, int i3) {
        BattleVictoryBaseGlow(modifier, battleResultPalette, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleVictoryLightRays$lambda$53(Modifier modifier, BattleResultPalette battleResultPalette, float f, int i, int i2, Composer composer, int i3) {
        BattleVictoryLightRays(modifier, battleResultPalette, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LocalBattleRevealResetKey$lambda$0() {
        return null;
    }

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
        BattleRevealEasing = cubicBezierEasing;
        BattleRevealInSpec = AnimationSpecKt.tween$default(380, 0, cubicBezierEasing, 2, null);
        BattleRevealSnapSpec = AnimationSpecKt.tween$default(0, 0, null, 6, null);
        LocalBattleRevealResetKey = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object LocalBattleRevealResetKey$lambda$0;
                LocalBattleRevealResetKey$lambda$0 = BattleResultAnimationsKt.LocalBattleRevealResetKey$lambda$0();
                return LocalBattleRevealResetKey$lambda$0;
            }
        }, 1, null);
    }

    public static final ProvidableCompositionLocal<Object> getLocalBattleRevealResetKey() {
        return LocalBattleRevealResetKey;
    }

    public static final int rememberBattleRevealPhase(boolean z, Object obj, boolean z2, Composer composer, int i) {
        composer.startReplaceGroup(2084709181);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2084709181, i, -1, "org.betup.ui.dialogs.compose.rememberBattleRevealPhase (BattleResultAnimations.kt:68)");
        }
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(z ? -1 : 8);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        composer.endReplaceGroup();
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z2);
        composer.startReplaceGroup(-1746271574);
        boolean changed2 = ((((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4) | composer.changed(mutableIntState) | ((((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.changed(z2)) || (i & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function2) new BattleResultAnimationsKt$rememberBattleRevealPhase$1$1(z, z2, mutableIntState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, obj, valueOf2, (Function2) rememberedValue2, composer, i & 1022);
        int rememberBattleRevealPhase$lambda$2 = rememberBattleRevealPhase$lambda$2(mutableIntState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberBattleRevealPhase$lambda$2;
    }

    private static final int rememberBattleRevealPhase$lambda$2(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final Long rememberAnimatedBattleAmountValue(String amountText, boolean z, int i, int i2, Composer composer, int i3, int i4) {
        long rememberAnimatedBattleAmountValue$lambda$6;
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        composer.startReplaceGroup(-1443752723);
        int i5 = (i4 & 8) != 0 ? 3 : i2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1443752723, i3, -1, "org.betup.ui.dialogs.compose.rememberAnimatedBattleAmountValue (BattleResultAnimations.kt:112)");
        }
        composer.startReplaceGroup(5004770);
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(amountText)) || (i3 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = parseBattleAmount(amountText);
            composer.updateRememberedValue(rememberedValue);
        }
        ParsedBattleAmount parsedBattleAmount = (ParsedBattleAmount) rememberedValue;
        composer.endReplaceGroup();
        boolean z3 = z && i >= i5 && parsedBattleAmount != null;
        float f = 0.0f;
        if (z3 && parsedBattleAmount != null) {
            f = parsedBattleAmount.getValue();
        }
        Long l = null;
        State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(720, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "battleAmountCountUp", null, composer, 3072, 20);
        if (parsedBattleAmount != null) {
            if (!z) {
                rememberAnimatedBattleAmountValue$lambda$6 = parsedBattleAmount.getValue();
            } else {
                rememberAnimatedBattleAmountValue$lambda$6 = !z3 ? 0L : (long) rememberAnimatedBattleAmountValue$lambda$6(animateFloatAsState);
            }
            l = Long.valueOf(rememberAnimatedBattleAmountValue$lambda$6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return l;
    }

    public static final ParsedBattleAmount parseBattleAmount(String amountText) {
        String str;
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        if (StringsKt.startsWith$default(amountText, "+", false, 2, (Object) null)) {
            str = "+";
        } else {
            str = StringsKt.startsWith$default(amountText, "-", false, 2, (Object) null) ? "-" : "";
        }
        Long longOrNull = StringsKt.toLongOrNull(StringsKt.replace$default(StringsKt.removePrefix(StringsKt.removePrefix(amountText, (CharSequence) "+"), (CharSequence) "-"), ",", "", false, 4, (Object) null));
        if (longOrNull != null) {
            return new ParsedBattleAmount(str, longOrNull.longValue());
        }
        return null;
    }

    public static final Modifier medalDropGraphicsLayer(boolean z, int i) {
        if (!z) {
            return Modifier.INSTANCE;
        }
        return ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new BattleResultAnimationsKt$medalDropGraphicsLayer$1(i), 1, null);
    }

    public static final void BattleConfettiBurst(Modifier modifier, final boolean z, final BattleResultPalette palette, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(-2072980214);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072980214, i3, -1, "org.betup.ui.dialogs.compose.BattleConfettiBurst (BattleResultAnimations.kt:198)");
            }
            if (!z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = companion;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BattleConfettiBurst$lambda$8;
                            BattleConfettiBurst$lambda$8 = BattleResultAnimationsKt.BattleConfettiBurst$lambda$8(Modifier.this, z, palette, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BattleConfettiBurst$lambda$8;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.startReplaceGroup(1849434622);
            ArrayList rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList = new ArrayList(28);
                int i5 = 0;
                for (int i6 = 28; i5 < i6; i6 = 28) {
                    Composer composer3 = startRestartGroup;
                    float nextFloat = (((float) (Random.INSTANCE.nextFloat() * 3.141592653589793d)) - 1.5707964f) + ((Random.INSTANCE.nextFloat() - 0.5f) * 0.5f);
                    float nextFloat2 = (Random.INSTANCE.nextFloat() * 130.0f) + 90.0f;
                    double d = nextFloat;
                    arrayList.add(new BurstParticle(((float) Math.cos(d)) * nextFloat2, (Math.abs((float) Math.sin(d)) * nextFloat2 * 1.2f) + 40.0f, (Random.INSTANCE.nextFloat() * 720.0f) - 360.0f, (int) (Random.INSTANCE.nextFloat() * 250.0f), ((int) (Random.INSTANCE.nextFloat() * 700.0f)) + 1000, i5 % 4 == 0, ((Color) CollectionsKt.random(CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(palette.m13235getAccent0d7_KjU()), Color.m5158boximpl(ColorKt.Color(4294955922L)), Color.m5158boximpl(ColorKt.Color(4282244228L)), Color.m5158boximpl(ColorKt.Color(4294925166L)), Color.m5158boximpl(ColorKt.Color(4286340351L)), Color.m5158boximpl(Color.INSTANCE.m5205getWhite0d7_KjU())}), Random.INSTANCE)).m5178unboximpl(), null));
                    i5++;
                    startRestartGroup = composer3;
                }
                rememberedValue = arrayList;
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue);
            } else {
                composer2 = startRestartGroup;
            }
            final List list = (List) rememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            Object rememberedValue2 = composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer2.updateRememberedValue(rememberedValue2);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            Object rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer2.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState = (MutableState) rememberedValue3;
            composer2.endReplaceGroup();
            Boolean valueOf = Boolean.valueOf(z);
            composer2.startReplaceGroup(-1633490746);
            boolean z2 = (i3 & 112) == 32;
            BattleResultAnimationsKt$BattleConfettiBurst$2$1 rememberedValue4 = composer2.rememberedValue();
            if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new BattleResultAnimationsKt$BattleConfettiBurst$2$1(z, mutableIntState, null);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer2, (i3 >> 3) & 14);
            Integer valueOf2 = Integer.valueOf(BattleConfettiBurst$lambda$12(mutableIntState));
            composer2.startReplaceGroup(-1633490746);
            BattleResultAnimationsKt$BattleConfettiBurst$3$1 rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new BattleResultAnimationsKt$BattleConfettiBurst$3$1(mutableIntState, mutableState, null);
                composer2.updateRememberedValue(rememberedValue5);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, composer2, 0);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceGroup(-1633490746);
            boolean changedInstance = composer2.changedInstance(list);
            Object rememberedValue6 = composer2.rememberedValue();
            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleConfettiBurst$lambda$21$lambda$20;
                        BattleConfettiBurst$lambda$21$lambda$20 = BattleResultAnimationsKt.BattleConfettiBurst$lambda$21$lambda$20(list, mutableState, (DrawScope) obj);
                        return BattleConfettiBurst$lambda$21$lambda$20;
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            composer2.endReplaceGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue6, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = companion;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleConfettiBurst$lambda$22;
                    BattleConfettiBurst$lambda$22 = BattleResultAnimationsKt.BattleConfettiBurst$lambda$22(Modifier.this, z, palette, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleConfettiBurst$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BattleConfettiBurst$lambda$12(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final float BattleConfettiBurst$lambda$15(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BattleConfettiBurst$lambda$16(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleConfettiBurst$lambda$21$lambda$20(List list, MutableState mutableState, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.35f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BurstParticle burstParticle = (BurstParticle) it.next();
            float coerceIn = RangesKt.coerceIn((BattleConfettiBurst$lambda$15(mutableState) - (burstParticle.getDelayMs() / 1700.0f)) / (burstParticle.getDurationMs() / 1700.0f), 0.0f, 1.0f);
            if (coerceIn > 0.0f) {
                float f = 1.0f - coerceIn;
                float f2 = 1.0f - (f * f);
                float coerceIn2 = RangesKt.coerceIn(f, 0.0f, 1.0f);
                float intBitsToFloat3 = Float.intBitsToFloat((int) (m4919constructorimpl >> 32)) + (burstParticle.getDx() * f2);
                float intBitsToFloat4 = Float.intBitsToFloat((int) (m4919constructorimpl & 4294967295L)) + (burstParticle.getDy() * f2);
                long m4919constructorimpl2 = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                if (burstParticle.isCoin()) {
                    DrawScope.m5711drawCircleVaOC9Bg$default(Canvas, Color.m5167copywmQWz5c$default(ColorKt.Color(4294946874L), coerceIn2 * 0.9f, 0.0f, 0.0f, 0.0f, 14, null), 5.0f, m4919constructorimpl2, 0.0f, null, null, 0, 120, null);
                } else {
                    long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(burstParticle.m13256getColor0d7_KjU(), coerceIn2 * 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                    float intBitsToFloat5 = Float.intBitsToFloat((int) (m4919constructorimpl2 >> 32)) - 3.5f;
                    float intBitsToFloat6 = Float.intBitsToFloat((int) (m4919constructorimpl2 & 4294967295L)) - 2.0f;
                    DrawScope.m5724drawRectnJ9OG0$default(Canvas, m5167copywmQWz5c$default, Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(7.0f) << 32) | (Float.floatToRawIntBits(4.0f) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Modifier battleRevealRise(Modifier modifier, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !z ? modifier : ComposedModifierKt.composed$default(modifier, null, new BattleResultAnimationsKt$battleRevealRise$1(i, i2), 1, null);
    }

    public static final Modifier battleRevealSlide(Modifier modifier, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !z ? modifier : ComposedModifierKt.composed$default(modifier, null, new BattleResultAnimationsKt$battleRevealSlide$1(i, i2, z2), 1, null);
    }

    public static final Modifier battleRevealPop(Modifier modifier, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !z ? modifier : ComposedModifierKt.composed$default(modifier, null, new BattleResultAnimationsKt$battleRevealPop$1(i, i2), 1, null);
    }

    public static final float rememberGlowPulse(boolean z, int i, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(1564126023);
        if ((i3 & 2) != 0) {
            i = 1300;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1564126023, i2, -1, "org.betup.ui.dialogs.compose.rememberGlowPulse (BattleResultAnimations.kt:345)");
        }
        if (!z) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return 1.0f;
        }
        float rememberGlowPulse$lambda$23 = rememberGlowPulse$lambda$23(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("battleGlowPulse", composer, 6, 0), 0.45f, 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i, 0, EasingKt.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "battleGlowPulseValue", composer, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberGlowPulse$lambda$23;
    }

    public static final float rememberShimmerProgress(boolean z, int i, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(-105221303);
        if ((i3 & 2) != 0) {
            i = 2200;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-105221303, i2, -1, "org.betup.ui.dialogs.compose.rememberShimmerProgress (BattleResultAnimations.kt:361)");
        }
        if (!z) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return 0.0f;
        }
        float rememberShimmerProgress$lambda$24 = rememberShimmerProgress$lambda$24(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("battleShimmer", composer, 6, 0), -0.4f, 1.4f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "battleShimmerProgress", composer, InfiniteTransition.$stable | 24960 | (InfiniteRepeatableSpec.$stable << 9), 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberShimmerProgress$lambda$24;
    }

    private static final boolean rememberEmblemEntrance$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberEmblemEntrance$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void BattleCelebrationParticles(Modifier modifier, final boolean z, final BattleResultPalette palette, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(-2126296319);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2126296319, i3, -1, "org.betup.ui.dialogs.compose.BattleCelebrationParticles (BattleResultAnimations.kt:411)");
            }
            if (!z || palette.getTone() != BattleResultTone.WON) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BattleCelebrationParticles$lambda$31;
                            BattleCelebrationParticles$lambda$31 = BattleResultAnimationsKt.BattleCelebrationParticles$lambda$31(Modifier.this, z, palette, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BattleCelebrationParticles$lambda$31;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.startReplaceGroup(1849434622);
            ArrayList rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList = new ArrayList(28);
                for (int i5 = 0; i5 < 28; i5++) {
                    arrayList.add(new ConfettiParticle(Random.INSTANCE.nextFloat(), Random.INSTANCE.nextFloat() * (-0.3f), (Random.INSTANCE.nextFloat() * 0.35f) + 0.15f, (Random.INSTANCE.nextFloat() * 5.0f) + 3.0f, ((Color) CollectionsKt.random(CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(palette.m13235getAccent0d7_KjU()), Color.m5158boximpl(ColorKt.Color(4294956367L)), Color.m5158boximpl(ColorKt.Color(4294965473L)), Color.m5158boximpl(palette.m13243getGlow0d7_KjU())}), Random.INSTANCE)).m5178unboximpl(), Random.INSTANCE.nextFloat() * 6.2831855f, null));
                }
                rememberedValue = arrayList;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final List list = (List) rememberedValue;
            startRestartGroup.endReplaceGroup();
            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("confetti", startRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(3200, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "confettiTime", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changedInstance = startRestartGroup.changedInstance(list) | startRestartGroup.changed(animateFloat);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleCelebrationParticles$lambda$37$lambda$36;
                        BattleCelebrationParticles$lambda$37$lambda$36 = BattleResultAnimationsKt.BattleCelebrationParticles$lambda$37$lambda$36(list, animateFloat, (DrawScope) obj);
                        return BattleCelebrationParticles$lambda$37$lambda$36;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue2, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Modifier modifier5 = modifier3;
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleCelebrationParticles$lambda$38;
                    BattleCelebrationParticles$lambda$38 = BattleResultAnimationsKt.BattleCelebrationParticles$lambda$38(Modifier.this, z, palette, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleCelebrationParticles$lambda$38;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleCelebrationParticles$lambda$37$lambda$36(List list, State state, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConfettiParticle confettiParticle = (ConfettiParticle) it.next();
            float BattleCelebrationParticles$lambda$34 = ((BattleCelebrationParticles$lambda$34(state) * confettiParticle.getSpeed()) + confettiParticle.getYStart()) % 1.2f;
            DrawScope.m5711drawCircleVaOC9Bg$default(Canvas, Color.m5167copywmQWz5c$default(confettiParticle.m13303getHue0d7_KjU(), RangesKt.coerceIn(BattleCelebrationParticles$lambda$34 < 0.1f ? BattleCelebrationParticles$lambda$34 / 0.1f : BattleCelebrationParticles$lambda$34 > 0.85f ? (1.2f - BattleCelebrationParticles$lambda$34) / 0.35f : 1.0f, 0.0f, 1.0f) * 0.85f, 0.0f, 0.0f, 0.0f, 14, null), confettiParticle.getSize(), Offset.m4919constructorimpl((Float.floatToRawIntBits(BattleCelebrationParticles$lambda$34 * intBitsToFloat2 * 1.1f) & 4294967295L) | (Float.floatToRawIntBits((confettiParticle.getXRatio() * intBitsToFloat) + (((float) Math.sin((BattleCelebrationParticles$lambda$34(state) * 6.0f) + confettiParticle.getPhase())) * 12.0f)) << 32)), 0.0f, null, null, 0, 120, null);
        }
        return Unit.INSTANCE;
    }

    public static final void BattleAmbientGlow(Modifier modifier, final BattleResultPalette palette, final float f, final boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(814600711);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
        } else {
            companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(814600711, i3, -1, "org.betup.ui.dialogs.compose.BattleAmbientGlow (BattleResultAnimations.kt:470)");
            }
            if (!z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BattleAmbientGlow$lambda$39;
                            BattleAmbientGlow$lambda$39 = BattleResultAnimationsKt.BattleAmbientGlow$lambda$39(Modifier.this, palette, f, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BattleAmbientGlow$lambda$39;
                        }
                    });
                    return;
                }
                return;
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleAmbientGlow$lambda$41$lambda$40;
                        BattleAmbientGlow$lambda$41$lambda$40 = BattleResultAnimationsKt.BattleAmbientGlow$lambda$41$lambda$40(BattleResultPalette.this, f, (DrawScope) obj);
                        return BattleAmbientGlow$lambda$41$lambda$40;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Modifier modifier4 = companion;
            endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleAmbientGlow$lambda$42;
                    BattleAmbientGlow$lambda$42 = BattleResultAnimationsKt.BattleAmbientGlow$lambda$42(Modifier.this, palette, f, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleAmbientGlow$lambda$42;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleAmbientGlow$lambda$41$lambda$40(BattleResultPalette battleResultPalette, float f, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.28f) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) / 2.0f;
        long m4919constructorimpl2 = Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.32f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        DrawScope.m5710drawCircleV9BoPsw$default(Canvas, Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), f * 0.28f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13235getAccent0d7_KjU(), f * 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), m4919constructorimpl, Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.48f, 0, 8, (Object) null), Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.48f, m4919constructorimpl, 0.0f, null, null, 0, 120, null);
        DrawScope.m5710drawCircleV9BoPsw$default(Canvas, Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13236getAccentBright0d7_KjU(), 0.12f * f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), m4919constructorimpl2, Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.62f, 0, 8, (Object) null), Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.62f, m4919constructorimpl2, 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    /* renamed from: battleColumnGlow-M0xzIa8, reason: not valid java name */
    public static final Modifier m13202battleColumnGlowM0xzIa8(Modifier battleColumnGlow, final long j, final float f, boolean z, final float f2) {
        Intrinsics.checkNotNullParameter(battleColumnGlow, "$this$battleColumnGlow");
        return (!z || Color.m5169equalsimpl0(j, Color.INSTANCE.m5203getTransparent0d7_KjU())) ? battleColumnGlow : DrawModifierKt.drawBehind(battleColumnGlow, new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit battleColumnGlow_M0xzIa8$lambda$44;
                battleColumnGlow_M0xzIa8$lambda$44 = BattleResultAnimationsKt.battleColumnGlow_M0xzIa8$lambda$44(f2, f, j, (DrawScope) obj);
                return battleColumnGlow_M0xzIa8$lambda$44;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit battleColumnGlow_M0xzIa8$lambda$44(float f, float f2, long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float f3 = drawBehind.mo1167toPx0680j_4(f);
        int i = 0;
        while (i < 3) {
            int i2 = i + 1;
            float f4 = i2;
            float f5 = 5.0f * f4;
            long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(j, (0.22f * f2) / f4, 0.0f, 0.0f, 0.0f, 14, null);
            float f6 = -f5;
            long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
            float f7 = 2 * f5;
            float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() >> 32)) + f7;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo5730getSizeNHjbRc() & 4294967295L)) + f7;
            float f8 = f3 + f5;
            DrawScope.m5726drawRoundRectuAw5IA$default(drawBehind, m5167copywmQWz5c$default, m4919constructorimpl, Size.m4987constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f8) << 32) | (4294967295L & Float.floatToRawIntBits(f8))), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
            i = i2;
        }
        return Unit.INSTANCE;
    }

    public static final float rememberRingRotation(boolean z, int i, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(-1506764641);
        if ((i3 & 2) != 0) {
            i = 4800;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1506764641, i2, -1, "org.betup.ui.dialogs.compose.rememberRingRotation (BattleResultAnimations.kt:526)");
        }
        if (!z) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return 0.0f;
        }
        float rememberRingRotation$lambda$45 = rememberRingRotation$lambda$45(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("battleRingRotation", composer, 6, 0), 0.0f, 360.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "battleRingRotationValue", composer, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberRingRotation$lambda$45;
    }

    public static final void BattlePendingLightRays(Modifier modifier, final BattleResultPalette palette, final float f, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(-767105198);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-767105198, i3, -1, "org.betup.ui.dialogs.compose.BattlePendingLightRays (BattleResultAnimations.kt:546)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i3 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattlePendingLightRays$lambda$48$lambda$47;
                        BattlePendingLightRays$lambda$48$lambda$47 = BattleResultAnimationsKt.BattlePendingLightRays$lambda$48$lambda$47(BattleResultPalette.this, f, (DrawScope) obj);
                        return BattlePendingLightRays$lambda$48$lambda$47;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattlePendingLightRays$lambda$49;
                    BattlePendingLightRays$lambda$49 = BattleResultAnimationsKt.BattlePendingLightRays$lambda$49(Modifier.this, palette, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattlePendingLightRays$lambda$49;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlePendingLightRays$lambda$48$lambda$47(BattleResultPalette battleResultPalette, float f, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) / 2.0f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.36f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        for (int i = 0; i < 10; i++) {
            float radians = (float) Math.toRadians((i * (360.0d / 10)) - 90.0d);
            float m4995getMinDimensionimpl = Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.1f;
            float m4995getMinDimensionimpl2 = Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.52f * f;
            int i2 = (int) (m4919constructorimpl >> 32);
            double d = radians;
            int i3 = (int) (m4919constructorimpl & 4294967295L);
            DrawScope.m5716drawLineNGM6Ib0$default(Canvas, Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), f * 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i2) + (((float) Math.cos(d)) * m4995getMinDimensionimpl)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i3) + (((float) Math.sin(d)) * m4995getMinDimensionimpl)) & 4294967295L)), Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i2) + (((float) Math.cos(d)) * m4995getMinDimensionimpl2)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i3) + (((float) Math.sin(d)) * m4995getMinDimensionimpl2)) & 4294967295L)), Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.038f, 0, null, 0.0f, null, 0, 496, null);
        }
        DrawScope.m5710drawCircleV9BoPsw$default(Canvas, Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13236getAccentBright0d7_KjU(), 0.28f * f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), f * 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), m4919constructorimpl, Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.38f, 0, 8, (Object) null), Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.38f, m4919constructorimpl, 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    public static final void BattleVictoryLightRays(Modifier modifier, final BattleResultPalette palette, final float f, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(-112267209);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-112267209, i3, -1, "org.betup.ui.dialogs.compose.BattleVictoryLightRays (BattleResultAnimations.kt:590)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i3 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleVictoryLightRays$lambda$52$lambda$51;
                        BattleVictoryLightRays$lambda$52$lambda$51 = BattleResultAnimationsKt.BattleVictoryLightRays$lambda$52$lambda$51(BattleResultPalette.this, f, (DrawScope) obj);
                        return BattleVictoryLightRays$lambda$52$lambda$51;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleVictoryLightRays$lambda$53;
                    BattleVictoryLightRays$lambda$53 = BattleResultAnimationsKt.BattleVictoryLightRays$lambda$53(Modifier.this, palette, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleVictoryLightRays$lambda$53;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleVictoryLightRays$lambda$52$lambda$51(BattleResultPalette battleResultPalette, float f, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) / 2.0f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.38f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        for (int i = 0; i < 14; i++) {
            float radians = (float) Math.toRadians((i * (360.0d / 14)) - 90.0d);
            float m4995getMinDimensionimpl = Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.08f;
            float m4995getMinDimensionimpl2 = Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.58f * f;
            int i2 = (int) (m4919constructorimpl >> 32);
            double d = radians;
            int i3 = (int) (m4919constructorimpl & 4294967295L);
            DrawScope.m5716drawLineNGM6Ib0$default(Canvas, Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), f * 0.14f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i2) + (((float) Math.cos(d)) * m4995getMinDimensionimpl)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i3) + (((float) Math.sin(d)) * m4995getMinDimensionimpl)) & 4294967295L)), Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i2) + (((float) Math.cos(d)) * m4995getMinDimensionimpl2)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i3) + (((float) Math.sin(d)) * m4995getMinDimensionimpl2)) & 4294967295L)), Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.045f, 0, null, 0.0f, null, 0, 496, null);
        }
        DrawScope.m5710drawCircleV9BoPsw$default(Canvas, Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13236getAccentBright0d7_KjU(), 0.35f * f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), f * 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), m4919constructorimpl, Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.42f, 0, 8, (Object) null), Size.m4995getMinDimensionimpl(Canvas.mo5730getSizeNHjbRc()) * 0.42f, m4919constructorimpl, 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    public static final void BattleVictoryBaseGlow(Modifier modifier, final BattleResultPalette palette, final float f, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Composer startRestartGroup = composer.startRestartGroup(-1719711538);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(palette) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719711538, i3, -1, "org.betup.ui.dialogs.compose.BattleVictoryBaseGlow (BattleResultAnimations.kt:634)");
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i3 & 112) == 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BattleVictoryBaseGlow$lambda$55$lambda$54;
                        BattleVictoryBaseGlow$lambda$55$lambda$54 = BattleResultAnimationsKt.BattleVictoryBaseGlow$lambda$55$lambda$54(BattleResultPalette.this, f, (DrawScope) obj);
                        return BattleVictoryBaseGlow$lambda$55$lambda$54;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifier, (Function1) rememberedValue, startRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattleVictoryBaseGlow$lambda$56;
                    BattleVictoryBaseGlow$lambda$56 = BattleResultAnimationsKt.BattleVictoryBaseGlow$lambda$56(Modifier.this, palette, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattleVictoryBaseGlow$lambda$56;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleVictoryBaseGlow$lambda$55$lambda$54(BattleResultPalette battleResultPalette, float f, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) / 2.0f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.92f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        Brush m5121radialGradientP_VxKs$default = Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13243getGlow0d7_KjU(), 0.42f * f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13235getAccent0d7_KjU(), f * 0.14f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), m4919constructorimpl, Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * 0.55f, 0, 8, (Object) null);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m4919constructorimpl >> 32)) - (Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) * 0.5f);
        long m4919constructorimpl2 = Offset.m4919constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (m4919constructorimpl & 4294967295L)) - (Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.22f)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32));
        DrawScope.m5717drawOvalAsUm42w$default(Canvas, m5121radialGradientP_VxKs$default, m4919constructorimpl2, Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L)) * 0.35f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattleAnimatedEmblem(Modifier modifier, final BattleResultPalette palette, final boolean z, boolean z2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(palette, "palette");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1850945856);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if ((i3 & 9347) == 9346 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    z3 = true;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1850945856, i3, -1, "org.betup.ui.dialogs.compose.BattleAnimatedEmblem (BattleResultAnimations.kt:660)");
                }
                final float rememberEmblemEntrance = rememberEmblemEntrance(!z && z3, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(642518737);
                if (!z3) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceGroup(5004770);
                    boolean changed = startRestartGroup.changed(rememberEmblemEntrance);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BattleAnimatedEmblem$lambda$58$lambda$57;
                                BattleAnimatedEmblem$lambda$58$lambda$57 = BattleResultAnimationsKt.BattleAnimatedEmblem$lambda$58$lambda$57(rememberEmblemEntrance, (GraphicsLayerScope) obj);
                                return BattleAnimatedEmblem$lambda$58$lambda$57;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    companion2 = GraphicsLayerModifierKt.graphicsLayer(companion3, (Function1) rememberedValue);
                } else {
                    companion2 = Modifier.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                Modifier then = companion.then(companion2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final boolean z4 = z3;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BattleAnimatedEmblem$lambda$60;
                        BattleAnimatedEmblem$lambda$60 = BattleResultAnimationsKt.BattleAnimatedEmblem$lambda$60(Modifier.this, palette, z, z4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return BattleAnimatedEmblem$lambda$60;
                    }
                });
                return;
            }
            return;
        }
        z3 = z2;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9347) == 9346) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final float rememberEmblemEntrance2 = rememberEmblemEntrance(!z && z3, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(642518737);
        if (!z3) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then2 = companion.then(companion2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        content.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattleAnimatedEmblem$lambda$58$lambda$57(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(f);
        graphicsLayer.setScaleY(f);
        graphicsLayer.setAlpha(RangesKt.coerceIn(f, 0.0f, 1.0f));
        return Unit.INSTANCE;
    }

    public static final float rememberEmblemEntrance(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(1032043294);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032043294, i, -1, "org.betup.ui.dialogs.compose.rememberEmblemEntrance (BattleResultAnimations.kt:377)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!z), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        Boolean valueOf = Boolean.valueOf(z);
        composer.startReplaceGroup(-1633490746);
        int i2 = i & 14;
        boolean z2 = ((i2 ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4;
        BattleResultAnimationsKt$rememberEmblemEntrance$1$1 rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new BattleResultAnimationsKt$rememberEmblemEntrance$1$1(z, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, i2);
        State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(rememberEmblemEntrance$lambda$26(mutableState) ? 1.0f : 0.72f, AnimationSpecKt.tween$default(650, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, "emblemScale", null, composer, 3072, 20);
        State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(rememberEmblemEntrance$lambda$26(mutableState) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "emblemAlpha", null, composer, 3120, 20);
        float rememberEmblemEntrance$lambda$29 = (rememberEmblemEntrance$lambda$29(animateFloatAsState) * rememberEmblemEntrance$lambda$30(animateFloatAsState2)) + ((1.0f - rememberEmblemEntrance$lambda$30(animateFloatAsState2)) * 0.72f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberEmblemEntrance$lambda$29;
    }

    /* renamed from: battleColumnGlow-M0xzIa8$default, reason: not valid java name */
    public static /* synthetic */ Modifier m13203battleColumnGlowM0xzIa8$default(Modifier modifier, long j, float f, boolean z, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            f2 = Dp.m7774constructorimpl(12);
        }
        return m13202battleColumnGlowM0xzIa8(modifier, j, f, z, f2);
    }

    private static final float rememberAnimatedBattleAmountValue$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float rememberGlowPulse$lambda$23(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float rememberShimmerProgress$lambda$24(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float rememberEmblemEntrance$lambda$29(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float rememberEmblemEntrance$lambda$30(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float BattleCelebrationParticles$lambda$34(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float rememberRingRotation$lambda$45(State<Float> state) {
        return state.getValue().floatValue();
    }
}
