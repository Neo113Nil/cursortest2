package org.betup.ui.dialogs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt;
import org.betup.ui.dialogs.controller.ChallengeAcceptController;
import org.betup.ui.dialogs.events.BattleBackToBetSelectionEvent;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.utils.NavigationHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ChallengeAcceptDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChallengeAcceptDialogFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Long $amount;
    final /* synthetic */ Long $userId;
    final /* synthetic */ ChallengeAcceptDialogFragment this$0;

    ChallengeAcceptDialogFragment$onCreateView$1$1(ChallengeAcceptDialogFragment challengeAcceptDialogFragment, Long l, Long l2) {
        this.this$0 = challengeAcceptDialogFragment;
        this.$amount = l;
        this.$userId = l2;
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
            ComposerKt.traceEventStart(-1666963183, i, -1, "org.betup.ui.dialogs.ChallengeAcceptDialogFragment.onCreateView.<anonymous>.<anonymous> (ChallengeAcceptDialogFragment.kt:102)");
        }
        ChallengeAcceptController controller = this.this$0.getController();
        BetsController betController = this.this$0.getBetController();
        boolean z = this.$amount == null;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ChallengeAcceptDialogFragment challengeAcceptDialogFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.ChallengeAcceptDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ChallengeAcceptDialogFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(ChallengeAcceptDialogFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance2 = composer.changedInstance(this.this$0) | composer.changed(this.$userId);
        final ChallengeAcceptDialogFragment challengeAcceptDialogFragment2 = this.this$0;
        final Long l = this.$userId;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.ChallengeAcceptDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = ChallengeAcceptDialogFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(ChallengeAcceptDialogFragment.this, l);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ChallengeAcceptDialogFragment challengeAcceptDialogFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function2() { // from class: org.betup.ui.dialogs.ChallengeAcceptDialogFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = ChallengeAcceptDialogFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(ChallengeAcceptDialogFragment.this, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        ChallengeAcceptScreenKt.ChallengeAcceptScreen(null, controller, betController, function0, function02, z, (Function2) rememberedValue3, composer, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ChallengeAcceptDialogFragment challengeAcceptDialogFragment) {
        challengeAcceptDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(ChallengeAcceptDialogFragment challengeAcceptDialogFragment, int i, boolean z) {
        challengeAcceptDialogFragment.dismiss();
        NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i, z, (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(ChallengeAcceptDialogFragment challengeAcceptDialogFragment, Long l) {
        long j;
        int i;
        int i2;
        challengeAcceptDialogFragment.dismiss();
        EventBus eventBus = EventBus.getDefault();
        j = challengeAcceptDialogFragment.allMatchId;
        i = challengeAcceptDialogFragment.allLeagueId;
        i2 = challengeAcceptDialogFragment.allSportId;
        eventBus.post(new BattleBackToBetSelectionEvent(j, i, i2, l));
        return Unit.INSTANCE;
    }
}
