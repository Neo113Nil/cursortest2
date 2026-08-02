package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.core.view.MotionEventCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.flashbet.model.FlashBetGameAnswerDto;
import org.betup.games.flashbet.model.FlashBetGameQuestionDto;
import org.betup.ui.common.compose.CommonButtonMatchBetKt;
import org.betup.ui.fragment.flashbet.controller.FlashBetGameController;

/* compiled from: FlashBetGameContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$18$3 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ FlashBetGameController $controller;
    final /* synthetic */ FlashBetGameQuestionDto $q;
    final /* synthetic */ State<Long> $selectedAnswerId$delegate;
    final /* synthetic */ State<Boolean> $submitLoading$delegate;
    final /* synthetic */ MutableState<Boolean> $timeExpiredByCountdown$delegate;

    FlashBetGameContentKt$FlashBetGameContent$4$1$4$18$3(FlashBetGameQuestionDto flashBetGameQuestionDto, FlashBetGameController flashBetGameController, State<Long> state, State<Boolean> state2, MutableState<Boolean> mutableState) {
        this.$q = flashBetGameQuestionDto;
        this.$controller = flashBetGameController;
        this.$selectedAnswerId$delegate = state;
        this.$submitLoading$delegate = state2;
        this.$timeExpiredByCountdown$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(FlashBetGameController flashBetGameController, FlashBetGameAnswerDto flashBetGameAnswerDto) {
        flashBetGameController.selectAnswer(flashBetGameAnswerDto.getId());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        Long FlashBetGameContent$lambda$4;
        boolean FlashBetGameContent$lambda$3;
        boolean z;
        boolean changedInstance;
        Object rememberedValue;
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1419514948, i, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetGameContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlashBetGameContent.kt:590)");
        }
        List<FlashBetGameAnswerDto> answers = this.$q.getAnswers();
        final FlashBetGameController flashBetGameController = this.$controller;
        State<Long> state = this.$selectedAnswerId$delegate;
        State<Boolean> state2 = this.$submitLoading$delegate;
        MutableState<Boolean> mutableState = this.$timeExpiredByCountdown$delegate;
        for (final FlashBetGameAnswerDto flashBetGameAnswerDto : answers) {
            FlashBetGameContent$lambda$4 = FlashBetGameContentKt.FlashBetGameContent$lambda$4(state);
            boolean z2 = FlashBetGameContent$lambda$4 != null && FlashBetGameContent$lambda$4.longValue() == flashBetGameAnswerDto.getId();
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
            String answer = flashBetGameAnswerDto.getAnswer();
            FlashBetGameContent$lambda$3 = FlashBetGameContentKt.FlashBetGameContent$lambda$3(state2);
            if (!FlashBetGameContent$lambda$3) {
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95(mutableState);
                if (!FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95) {
                    z = true;
                    composer2.startReplaceGroup(-1633490746);
                    changedInstance = composer2.changedInstance(flashBetGameController) | composer2.changed(flashBetGameAnswerDto);
                    rememberedValue = composer.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$18$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$2$lambda$1$lambda$0;
                                invoke$lambda$2$lambda$1$lambda$0 = FlashBetGameContentKt$FlashBetGameContent$4$1$4$18$3.invoke$lambda$2$lambda$1$lambda$0(FlashBetGameController.this, flashBetGameAnswerDto);
                                return invoke$lambda$2$lambda$1$lambda$0;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    CommonButtonMatchBetKt.CommonButtonMatchBet(wrapContentWidth$default, z2, answer, true, true, "", z, (Function0) rememberedValue, null, false, false, null, false, false, false, false, true, null, composer, 224262, 14155776, MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                    composer2 = composer;
                    state = state;
                    mutableState = mutableState;
                    state2 = state2;
                    flashBetGameController = flashBetGameController;
                }
            }
            z = false;
            composer2.startReplaceGroup(-1633490746);
            changedInstance = composer2.changedInstance(flashBetGameController) | composer2.changed(flashBetGameAnswerDto);
            rememberedValue = composer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$18$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$2$lambda$1$lambda$0 = FlashBetGameContentKt$FlashBetGameContent$4$1$4$18$3.invoke$lambda$2$lambda$1$lambda$0(FlashBetGameController.this, flashBetGameAnswerDto);
                    return invoke$lambda$2$lambda$1$lambda$0;
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            CommonButtonMatchBetKt.CommonButtonMatchBet(wrapContentWidth$default, z2, answer, true, true, "", z, (Function0) rememberedValue, null, false, false, null, false, false, false, false, true, null, composer, 224262, 14155776, MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            composer2 = composer;
            state = state;
            mutableState = mutableState;
            state2 = state2;
            flashBetGameController = flashBetGameController;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
