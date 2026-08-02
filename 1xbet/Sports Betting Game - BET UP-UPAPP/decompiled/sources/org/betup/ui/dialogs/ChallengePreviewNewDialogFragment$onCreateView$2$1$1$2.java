package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.dialogs.controller.ChallengePreviewController;
import org.betup.ui.fragment.bets.betlist.details.BetTicketShareChooserScreenKt;

/* compiled from: ChallengePreviewNewDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChallengePreviewController.BattleShareChooserState $shareState;
    final /* synthetic */ ChallengePreviewNewDialogFragment this$0;

    ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2(ChallengePreviewController.BattleShareChooserState battleShareChooserState, ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        this.$shareState = battleShareChooserState;
        this.this$0 = challengePreviewNewDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-692545440, i, -1, "org.betup.ui.dialogs.ChallengePreviewNewDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChallengePreviewNewDialogFragment.kt:98)");
        }
        List listOf = CollectionsKt.listOf(this.$shareState.getBitmap());
        String shareLink = this.$shareState.getShareLink();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2.invoke$lambda$1$lambda$0(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2.invoke$lambda$3$lambda$2(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2.invoke$lambda$5$lambda$4(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function03 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.dialogs.ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = ChallengePreviewNewDialogFragment$onCreateView$2$1$1$2.invoke$lambda$7$lambda$6(ChallengePreviewNewDialogFragment.this);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        BetTicketShareChooserScreenKt.BetTicketShareChooserScreen(listOf, shareLink, function0, function02, function03, (Function0) rememberedValue4, R.string.battle_share, R.string.battle_share_chooser_hint, R.string.battle_share_chooser_link_label, R.string.cd_share_battle_preview, composer, 920125440, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().shareBattleImageOnly();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().shareBattleImageAndLink();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().shareBattleLinkOnly();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        challengePreviewNewDialogFragment.getController().dismissShareChooser();
        return Unit.INSTANCE;
    }
}
