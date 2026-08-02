package org.betup.ui.fragment.bets.quiz;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.model.remote.entity.quiz.QuizShortParticipationModel;
import org.betup.model.remote.entity.quiz.QuizStateCountModel;
import org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreenKt;

/* compiled from: QuizResultsFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class QuizResultsFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ QuizResultsFragment this$0;

    QuizResultsFragment$onCreateView$1$1(QuizResultsFragment quizResultsFragment) {
        this.this$0 = quizResultsFragment;
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
            ComposerKt.traceEventStart(1444076329, i, -1, "org.betup.ui.fragment.bets.quiz.QuizResultsFragment.onCreateView.<anonymous>.<anonymous> (QuizResultsFragment.kt:29)");
        }
        StateFlow<List<QuizShortParticipationModel>> participations = this.this$0.getController().getParticipations();
        StateFlow<Integer> filterState = this.this$0.getController().getFilterState();
        StateFlow<Boolean> isLoading = this.this$0.getController().isLoading();
        StateFlow<Boolean> isLoadingMore = this.this$0.getController().isLoadingMore();
        StateFlow<Boolean> hasMore = this.this$0.getController().getHasMore();
        StateFlow<List<QuizStateCountModel>> stateCounts = this.this$0.getController().getStateCounts();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final QuizResultsFragment quizResultsFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.quiz.QuizResultsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = QuizResultsFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(QuizResultsFragment.this, (QuizShortParticipationModel) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final QuizResultsFragment quizResultsFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.bets.quiz.QuizResultsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = QuizResultsFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(QuizResultsFragment.this, (Integer) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function1 function12 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final QuizResultsFragment quizResultsFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.quiz.QuizResultsFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = QuizResultsFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(QuizResultsFragment.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function0 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final QuizResultsFragment quizResultsFragment4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.quiz.QuizResultsFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = QuizResultsFragment$onCreateView$1$1.invoke$lambda$7$lambda$6(QuizResultsFragment.this);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        QuizResultsScreenKt.QuizResultsScreen(participations, function1, function12, function0, filterState, isLoading, isLoadingMore, hasMore, (Function0) rememberedValue4, stateCounts, null, composer, 0, 0, 1024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(QuizResultsFragment quizResultsFragment, QuizShortParticipationModel participation) {
        Intrinsics.checkNotNullParameter(participation, "participation");
        quizResultsFragment.showQuizParticipationDialog(participation.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(QuizResultsFragment quizResultsFragment) {
        quizResultsFragment.getController().reloadParticipations();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(QuizResultsFragment quizResultsFragment, Integer num) {
        quizResultsFragment.getController().setFilterState(num);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(QuizResultsFragment quizResultsFragment) {
        quizResultsFragment.getController().loadMoreParticipations();
        return Unit.INSTANCE;
    }
}
