package org.betup.ui.fragment.matches.details.compose.tabs.quiz;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.details.BetDataModel;
import org.betup.model.remote.entity.matches.details.BetGroupSectionResponseModel;
import org.betup.model.remote.entity.matches.details.BetSectionModel;
import org.betup.ui.common.compose.CommonButtonMatchBetKt;
import org.betup.utils.OddHelper;

/* compiled from: QuizQuestionsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class QuizQuestionsScreenKt$QuizQuestionPage$1$2 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function5<Integer, Long, String, Float, String, Unit> $onAnswerSelected;
    final /* synthetic */ BetSectionModel $question;
    final /* synthetic */ int $questionIndex;
    final /* synthetic */ QuizSelectionState $selectionState;

    /* JADX WARN: Multi-variable type inference failed */
    QuizQuestionsScreenKt$QuizQuestionPage$1$2(BetSectionModel betSectionModel, QuizSelectionState quizSelectionState, int i, OddType oddType, Function5<? super Integer, ? super Long, ? super String, ? super Float, ? super String, Unit> function5) {
        this.$question = betSectionModel;
        this.$selectionState = quizSelectionState;
        this.$questionIndex = i;
        this.$oddType = oddType;
        this.$onAnswerSelected = function5;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2138538211, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizQuestionPage.<anonymous>.<anonymous> (QuizQuestionsScreen.kt:247)");
        }
        BetGroupSectionResponseModel betGroupSectionResponseModel = (BetGroupSectionResponseModel) CollectionsKt.firstOrNull((List) this.$question.getGroups());
        Alignment.Horizontal horizontal = null;
        List<BetDataModel> bets = betGroupSectionResponseModel != null ? betGroupSectionResponseModel.getBets() : null;
        if (bets != null) {
            QuizSelectionState quizSelectionState = this.$selectionState;
            final int i2 = this.$questionIndex;
            OddType oddType = this.$oddType;
            final Function5<Integer, Long, String, Float, String, Unit> function5 = this.$onAnswerSelected;
            final BetSectionModel betSectionModel = this.$question;
            for (final BetDataModel betDataModel : bets) {
                boolean isAnswerSelected = quizSelectionState.isAnswerSelected(i2, betDataModel.getId());
                Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal, false, 3, horizontal);
                String name = betDataModel.getName();
                String format = OddHelper.format(oddType, betDataModel.getCoefficient());
                composer2.startReplaceGroup(-1224400529);
                boolean changed = composer2.changed(function5) | composer2.changed(i2) | composer2.changed(betDataModel) | composer2.changedInstance(betSectionModel);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizQuestionsScreenKt$QuizQuestionPage$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = QuizQuestionsScreenKt$QuizQuestionPage$1$2.invoke$lambda$2$lambda$1$lambda$0(Function5.this, i2, betDataModel, betSectionModel);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                CommonButtonMatchBetKt.CommonButtonMatchBet(wrapContentWidth$default, isAnswerSelected, name, false, true, format, false, (Function0) rememberedValue, null, false, false, null, false, false, false, false, false, null, composer, 24582, 12582912, 130888);
                composer2 = composer;
                quizSelectionState = quizSelectionState;
                betSectionModel = betSectionModel;
                function5 = function5;
                oddType = oddType;
                i2 = i2;
                horizontal = horizontal;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function5 function5, int i, BetDataModel betDataModel, BetSectionModel betSectionModel) {
        Integer valueOf = Integer.valueOf(i);
        Long valueOf2 = Long.valueOf(betDataModel.getId());
        String name = betDataModel.getName();
        Float valueOf3 = Float.valueOf(betDataModel.getCoefficient());
        String name2 = betSectionModel.getVariety().getName();
        if (name2 == null) {
            name2 = "";
        }
        function5.invoke(valueOf, valueOf2, name, valueOf3, name2);
        return Unit.INSTANCE;
    }
}
