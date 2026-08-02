package org.betup.ui.fragment.competitions.details;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.ui.common.compose.HapticFeedbackEffect;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.dialogs.events.OpenCompetitionsPreviewEvent;
import org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: CompetitionDetailsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CompetitionDetailsFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ComposeView $this_apply;
    final /* synthetic */ CompetitionDetailsFragment this$0;

    CompetitionDetailsFragment$onCreateView$1$1(CompetitionDetailsFragment competitionDetailsFragment, ComposeView composeView) {
        this.this$0 = competitionDetailsFragment;
        this.$this_apply = composeView;
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
            ComposerKt.traceEventStart(1223301246, i, -1, "org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment.onCreateView.<anonymous>.<anonymous> (CompetitionDetailsFragment.kt:59)");
        }
        CompetitionDetailsController competitionDetailsController = this.this$0.getCompetitionDetailsController();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$this_apply);
        final CompetitionDetailsFragment competitionDetailsFragment = this.this$0;
        final ComposeView composeView = this.$this_apply;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = CompetitionDetailsFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(CompetitionDetailsFragment.this, composeView);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CompetitionDetailsContentKt.CompetitionDetailsContent(competitionDetailsController, (Function0) rememberedValue, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(final CompetitionDetailsFragment competitionDetailsFragment, final ComposeView composeView) {
        competitionDetailsFragment.getCompetitionDetailsController().placeBet(new Function2() { // from class: org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$3$lambda$2$lambda$0;
                invoke$lambda$3$lambda$2$lambda$0 = CompetitionDetailsFragment$onCreateView$1$1.invoke$lambda$3$lambda$2$lambda$0(CompetitionDetailsFragment.this, composeView, ((Long) obj).longValue(), ((Long) obj2).longValue());
                return invoke$lambda$3$lambda$2$lambda$0;
            }
        }, new Function1() { // from class: org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3$lambda$2$lambda$1;
                invoke$lambda$3$lambda$2$lambda$1 = CompetitionDetailsFragment$onCreateView$1$1.invoke$lambda$3$lambda$2$lambda$1(ComposeView.this, (String) obj);
                return invoke$lambda$3$lambda$2$lambda$1;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$0(CompetitionDetailsFragment competitionDetailsFragment, ComposeView composeView, long j, long j2) {
        HapticFeedbackEffect.perform(competitionDetailsFragment.requireActivity(), HapticFeedbackType.PlaceBetSuccess);
        SnackbarHelper.showShort(composeView.getContext(), R.string.competition_joined);
        Bundle bundle = new Bundle();
        CompetitionDetailsWithParticipantModel value = competitionDetailsFragment.getCompetitionDetailsController().getCompetitionDetails().getValue();
        bundle.putLong("competition_id", value != null ? value.getId() : 0L);
        EventBus.getDefault().post(new OpenCompetitionsPreviewEvent(j, Long.valueOf(j2), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(ComposeView composeView, String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        SnackbarHelper.showShort(composeView.getContext(), "Error: " + errorMsg);
        return Unit.INSTANCE;
    }
}
