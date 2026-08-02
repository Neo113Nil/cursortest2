package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetGoalCelebration.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a'\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0017²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u0084\u0002"}, d2 = {"FLASH_BET_GOAL_CELEBRATION_DURATION_MS", "", "FLASH_BET_GOAL_LOTTIE_ITERATIONS", "", "FLASH_BET_GOAL_CONFETTI_HORIZONTAL_PADDING", "Landroidx/compose/ui/unit/Dp;", "F", "FLASH_BET_GOAL_CONFETTI_VERTICAL_OFFSET", "FLASH_BET_GOAL_CONFETTI_WIDTH", "FLASH_BET_GOAL_CONFETTI_HEIGHT", "FlashBetGoalCelebrationOverlay", "", "celebrationKey", "side", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetGoalSide;", "modifier", "Landroidx/compose/ui/Modifier;", "(ILorg/betup/ui/fragment/flashbet/compose/FlashBetGoalSide;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FlashBetGoalScorerBanner", "scorerLabel", "", "minute", "(ILjava/lang/String;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetGoalCelebrationKt {
    public static final long FLASH_BET_GOAL_CELEBRATION_DURATION_MS = 2200;
    private static final int FLASH_BET_GOAL_LOTTIE_ITERATIONS = 2;
    private static final float FLASH_BET_GOAL_CONFETTI_HORIZONTAL_PADDING = Dp.m7774constructorimpl(4);
    private static final float FLASH_BET_GOAL_CONFETTI_VERTICAL_OFFSET = Dp.m7774constructorimpl(-8);
    private static final float FLASH_BET_GOAL_CONFETTI_WIDTH = Dp.m7774constructorimpl(88);
    private static final float FLASH_BET_GOAL_CONFETTI_HEIGHT = Dp.m7774constructorimpl(96);

    /* compiled from: FlashBetGoalCelebration.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlashBetGoalSide.values().length];
            try {
                iArr[FlashBetGoalSide.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashBetGoalSide.AWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGoalCelebrationOverlay$lambda$2(int i, FlashBetGoalSide flashBetGoalSide, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        FlashBetGoalCelebrationOverlay(i, flashBetGoalSide, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGoalScorerBanner$lambda$3(int i, String str, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        FlashBetGoalScorerBanner(i, str, i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetGoalScorerBanner$lambda$5(int i, String str, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        FlashBetGoalScorerBanner(i, str, i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetGoalCelebrationOverlay(final int i, final FlashBetGoalSide side, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Alignment topStart;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(side, "side");
        Composer startRestartGroup = composer.startRestartGroup(1728257846);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(side.ordinal()) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i4 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1728257846, i4, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetGoalCelebrationOverlay (FlashBetGoalCelebration.kt:42)");
                }
                LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.confety)), null, null, null, null, null, startRestartGroup, 6, 62);
                i5 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
                if (i5 != 1) {
                    topStart = Alignment.INSTANCE.getTopStart();
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    topStart = Alignment.INSTANCE.getTopEnd();
                }
                Alignment alignment = topStart;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                startRestartGroup.startMovableGroup(-1343038723, Integer.valueOf(i));
                modifier3 = modifier4;
                LottieAnimationKt.LottieAnimation(FlashBetGoalCelebrationOverlay$lambda$0(rememberLottieComposition), SizeKt.m1565sizeVpY3zN4(OffsetKt.m1476offsetVpY3zN4$default(PaddingKt.m1518paddingVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, alignment), FLASH_BET_GOAL_CONFETTI_HORIZONTAL_PADDING, 0.0f, 2, null), 0.0f, FLASH_BET_GOAL_CONFETTI_VERTICAL_OFFSET, 1, null), FLASH_BET_GOAL_CONFETTI_WIDTH, FLASH_BET_GOAL_CONFETTI_HEIGHT), false, false, null, 0.0f, 2, false, false, false, null, false, false, null, null, null, false, null, null, startRestartGroup, 1572864, 0, 524220);
                startRestartGroup.endMovableGroup();
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
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGoalCelebrationKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetGoalCelebrationOverlay$lambda$2;
                        FlashBetGoalCelebrationOverlay$lambda$2 = FlashBetGoalCelebrationKt.FlashBetGoalCelebrationOverlay$lambda$2(i, side, modifier5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetGoalCelebrationOverlay$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i4 & Opcodes.I2S) == 146) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        LottieCompositionResult rememberLottieComposition2 = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m8308boximpl(LottieCompositionSpec.RawRes.m8309constructorimpl(R.raw.confety)), null, null, null, null, null, startRestartGroup, 6, 62);
        i5 = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i5 != 1) {
        }
        Alignment alignment2 = topStart;
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
        startRestartGroup.startMovableGroup(-1343038723, Integer.valueOf(i));
        modifier3 = modifier4;
        LottieAnimationKt.LottieAnimation(FlashBetGoalCelebrationOverlay$lambda$0(rememberLottieComposition2), SizeKt.m1565sizeVpY3zN4(OffsetKt.m1476offsetVpY3zN4$default(PaddingKt.m1518paddingVpY3zN4$default(boxScopeInstance2.align(Modifier.INSTANCE, alignment2), FLASH_BET_GOAL_CONFETTI_HORIZONTAL_PADDING, 0.0f, 2, null), 0.0f, FLASH_BET_GOAL_CONFETTI_VERTICAL_OFFSET, 1, null), FLASH_BET_GOAL_CONFETTI_WIDTH, FLASH_BET_GOAL_CONFETTI_HEIGHT), false, false, null, 0.0f, 2, false, false, false, null, false, false, null, null, null, false, null, null, startRestartGroup, 1572864, 0, 524220);
        startRestartGroup.endMovableGroup();
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

    private static final LottieComposition FlashBetGoalCelebrationOverlay$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetGoalScorerBanner(final int i, final String scorerLabel, final int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        final Modifier modifier2;
        int i6;
        Composer composer2;
        Intrinsics.checkNotNullParameter(scorerLabel, "scorerLabel");
        Composer startRestartGroup = composer.startRestartGroup(-41224333);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(scorerLabel) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i6 = i5;
            if ((i6 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-41224333, i6, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetGoalScorerBanner (FlashBetGoalCelebration.kt:72)");
                }
                if (!StringsKt.isBlank(scorerLabel)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGoalCelebrationKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FlashBetGoalScorerBanner$lambda$3;
                                FlashBetGoalScorerBanner$lambda$3 = FlashBetGoalCelebrationKt.FlashBetGoalScorerBanner$lambda$3(i, scorerLabel, i2, modifier4, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                return FlashBetGoalScorerBanner$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                startRestartGroup.startMovableGroup(-961870988, Integer.valueOf(i));
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String upperCase = StringResources_androidKt.stringResource(R.string.flash_bet_event_goal, startRestartGroup, 6).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                TextKt.m2642Text4IGK_g(upperCase, (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(22), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, TextUnitKt.getSp(3), (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 12782592, 0, 130386);
                float f = 2;
                Modifier modifier5 = modifier3;
                TextKt.m2642Text4IGK_g(scorerLabel, PaddingKt.m1518paddingVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 0.0f, 0.0f, 13, null), Dp.m7774constructorimpl(8), 0.0f, 2, null), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i6 >> 3) & 14) | 199728, 0, 130512);
                composer2 = startRestartGroup;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_event_minute, new Object[]{Integer.valueOf(i2)}, startRestartGroup, 6), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 131024);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endMovableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGoalCelebrationKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetGoalScorerBanner$lambda$5;
                        FlashBetGoalScorerBanner$lambda$5 = FlashBetGoalCelebrationKt.FlashBetGoalScorerBanner$lambda$5(i, scorerLabel, i2, modifier2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetGoalScorerBanner$lambda$5;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i6 = i5;
        if ((i6 & 1171) == 1170) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!StringsKt.isBlank(scorerLabel)) {
        }
    }
}
