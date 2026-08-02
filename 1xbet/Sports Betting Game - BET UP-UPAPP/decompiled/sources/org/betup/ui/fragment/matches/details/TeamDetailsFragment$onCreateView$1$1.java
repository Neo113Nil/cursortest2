package org.betup.ui.fragment.matches.details;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.bus.NavigateMessage;
import org.betup.ui.fragment.matches.details.compose.TeamDetailsScreenKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: TeamDetailsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TeamDetailsFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ TeamDetailsFragment this$0;

    TeamDetailsFragment$onCreateView$1$1(TeamDetailsFragment teamDetailsFragment) {
        this.this$0 = teamDetailsFragment;
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
            ComposerKt.traceEventStart(1787567727, i, -1, "org.betup.ui.fragment.matches.details.TeamDetailsFragment.onCreateView.<anonymous>.<anonymous> (TeamDetailsFragment.kt:42)");
        }
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final TeamDetailsFragment teamDetailsFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.TeamDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TeamDetailsFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(TeamDetailsFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        TeamDetailsController controller = this.this$0.getController();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.details.TeamDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = TeamDetailsFragment$onCreateView$1$1.invoke$lambda$4$lambda$3(((Long) obj).longValue());
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        TeamDetailsScreenKt.TeamDetailsScreen(function0, controller, (Function1) rememberedValue2, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TeamDetailsFragment teamDetailsFragment) {
        teamDetailsFragment.requireActivity().getSupportFragmentManager().popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", (int) j);
        bundle.putBoolean("isLive", false);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        return Unit.INSTANCE;
    }
}
