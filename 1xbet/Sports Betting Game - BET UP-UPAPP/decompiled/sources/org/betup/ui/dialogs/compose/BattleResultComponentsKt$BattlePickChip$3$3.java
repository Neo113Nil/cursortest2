package org.betup.ui.dialogs.compose;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.BattleBetHighlightStyle;

/* compiled from: BattleResultComponents.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BattleResultComponentsKt$BattlePickChip$3$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ Boolean $betWon;
    final /* synthetic */ RoundedCornerShape $chipShape;
    final /* synthetic */ String $coefficient;
    final /* synthetic */ boolean $compact;
    final /* synthetic */ String $displayBetName;
    final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    final /* synthetic */ BattleBetHighlightStyle $highlight;
    final /* synthetic */ String $periodTag;

    /* compiled from: BattleResultComponents.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BattleBetHighlightStyle.values().length];
            try {
                iArr[BattleBetHighlightStyle.WINNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleBetHighlightStyle.LOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    BattleResultComponentsKt$BattlePickChip$3$3(String str, String str2, String str3, BattleBetHighlightStyle battleBetHighlightStyle, Boolean bool, boolean z, RoundedCornerShape roundedCornerShape, MutableState<Boolean> mutableState) {
        this.$periodTag = str;
        this.$displayBetName = str2;
        this.$coefficient = str3;
        this.$highlight = battleBetHighlightStyle;
        this.$betWon = bool;
        this.$compact = z;
        this.$chipShape = roundedCornerShape;
        this.$expanded$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        long m5167copywmQWz5c$default;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1218613479, i, -1, "org.betup.ui.dialogs.compose.BattlePickChip.<anonymous>.<anonymous> (BattleResultComponents.kt:872)");
        }
        String str = this.$periodTag;
        String str2 = this.$displayBetName;
        String str3 = this.$coefficient;
        BattleBetHighlightStyle battleBetHighlightStyle = this.$highlight;
        Boolean bool = this.$betWon;
        boolean z = this.$compact;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        float m7774constructorimpl = Dp.m7774constructorimpl(10);
        RoundedCornerShape roundedCornerShape = this.$chipShape;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$highlight.ordinal()];
        if (i2 == 1) {
            m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
        } else if (i2 == 2) {
            m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        Modifier m4803shadows4CzXII$default = ShadowKt.m4803shadows4CzXII$default(fillMaxWidth$default, m7774constructorimpl, roundedCornerShape, false, m5167copywmQWz5c$default, 0L, 20, null);
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        final MutableState<Boolean> mutableState = this.$expanded$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$BattlePickChip$3$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = BattleResultComponentsKt$BattlePickChip$3$3.invoke$lambda$2$lambda$1(MutableState.this);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        BattleResultComponentsKt.BattlePickChipBody(str, str2, str3, battleBetHighlightStyle, bool, z, true, ClickableKt.m1057clickableO2vRcR0$default(m4803shadows4CzXII$default, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue2, 28, null), composer, 1572864, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(MutableState mutableState) {
        BattleResultComponentsKt.BattlePickChip$lambda$34(mutableState, false);
        return Unit.INSTANCE;
    }
}
