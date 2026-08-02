package org.betup.ui.fragment.competitions.compose;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.Spread;
import org.betup.R;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.dialogs.events.OpenCompetitionsPreviewEvent;
import org.betup.ui.fragment.competitions.compose.components.CompetitionsNoDataViewKt;
import org.betup.ui.fragment.competitions.compose.history.model.CompetitionHistoryItemUiModel;
import org.betup.ui.fragment.competitions.compose.items.CompetitionHistoryCardKt;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: CompetitionsContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CompetitionsContentKt$CompetitionsContent$2$2$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CompetitionsController $controller;
    final /* synthetic */ State<Boolean> $hasMoreHistory$delegate;
    final /* synthetic */ State<List<CompetitionHistoryItemUiModel>> $historyCompetitions$delegate;
    final /* synthetic */ State<Boolean> $isLoadMoreHistory$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    CompetitionsContentKt$CompetitionsContent$2$2$4(State<? extends List<CompetitionHistoryItemUiModel>> state, State<Boolean> state2, State<Boolean> state3, CompetitionsController competitionsController) {
        this.$historyCompetitions$delegate = state;
        this.$hasMoreHistory$delegate = state2;
        this.$isLoadMoreHistory$delegate = state3;
        this.$controller = competitionsController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List CompetitionsContent$lambda$5;
        boolean CompetitionsContent$lambda$13;
        boolean CompetitionsContent$lambda$15;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1905870853, i, -1, "org.betup.ui.fragment.competitions.compose.CompetitionsContent.<anonymous>.<anonymous>.<anonymous> (CompetitionsContent.kt:195)");
        }
        CompetitionsContent$lambda$5 = CompetitionsContentKt.CompetitionsContent$lambda$5(this.$historyCompetitions$delegate);
        if (CompetitionsContent$lambda$5.isEmpty()) {
            composer.startReplaceGroup(1669140188);
            CompetitionsNoDataViewKt.CompetitionsNoDataView(StringResources_androidKt.stringResource(R.string.competitions_no_history, composer, 6), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1669512560);
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
            float f = 12;
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(74), Dp.m7774constructorimpl(f), 0.0f, 8, null);
            PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(34), 7, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
            composer.startReplaceGroup(5004770);
            boolean changed = composer.changed(this.$historyCompetitions$delegate);
            final State<List<CompetitionHistoryItemUiModel>> state = this.$historyCompetitions$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$4$lambda$3;
                        invoke$lambda$4$lambda$3 = CompetitionsContentKt$CompetitionsContent$2$2$4.invoke$lambda$4$lambda$3(State.this, (LazyListScope) obj);
                        return invoke$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default, rememberLazyListStateWithoutSavedState, m1513PaddingValuesa9UjIt4$default, false, m1397spacedBy0680j_4, null, null, true, null, (Function1) rememberedValue, composer, 12607872, Spread.ROUND);
            CompetitionsContent$lambda$13 = CompetitionsContentKt.CompetitionsContent$lambda$13(this.$hasMoreHistory$delegate);
            Boolean valueOf = Boolean.valueOf(CompetitionsContent$lambda$13);
            CompetitionsContent$lambda$15 = CompetitionsContentKt.CompetitionsContent$lambda$15(this.$isLoadMoreHistory$delegate);
            Boolean valueOf2 = Boolean.valueOf(CompetitionsContent$lambda$15);
            composer.startReplaceGroup(-1224400529);
            boolean changed2 = composer.changed(rememberLazyListStateWithoutSavedState) | composer.changed(this.$historyCompetitions$delegate) | composer.changed(this.$hasMoreHistory$delegate) | composer.changed(this.$isLoadMoreHistory$delegate) | composer.changedInstance(this.$controller);
            CompetitionsController competitionsController = this.$controller;
            State<List<CompetitionHistoryItemUiModel>> state2 = this.$historyCompetitions$delegate;
            State<Boolean> state3 = this.$hasMoreHistory$delegate;
            State<Boolean> state4 = this.$isLoadMoreHistory$delegate;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new CompetitionsContentKt$CompetitionsContent$2$2$4$2$1(rememberLazyListStateWithoutSavedState, competitionsController, state2, state3, state4, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue2, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(State state, LazyListScope LazyColumn) {
        final List CompetitionsContent$lambda$5;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        CompetitionsContent$lambda$5 = CompetitionsContentKt.CompetitionsContent$lambda$5(state);
        final Function2 function2 = new Function2() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object invoke$lambda$4$lambda$3$lambda$0;
                invoke$lambda$4$lambda$3$lambda$0 = CompetitionsContentKt$CompetitionsContent$2$2$4.invoke$lambda$4$lambda$3$lambda$0(((Integer) obj).intValue(), (CompetitionHistoryItemUiModel) obj2);
                return invoke$lambda$4$lambda$3$lambda$0;
            }
        };
        LazyColumn.items(CompetitionsContent$lambda$5.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function2.this.invoke(Integer.valueOf(i), CompetitionsContent$lambda$5.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                CompetitionsContent$lambda$5.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final CompetitionHistoryItemUiModel competitionHistoryItemUiModel = (CompetitionHistoryItemUiModel) CompetitionsContent$lambda$5.get(i);
                composer.startReplaceGroup(-1561271667);
                composer.startReplaceGroup(5004770);
                boolean changed = composer.changed(competitionHistoryItemUiModel);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$4$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            Log.d("CompetitionsContent", "History competition clicked: " + j);
                            EventBus.getDefault().post(new OpenCompetitionsPreviewEvent(j, Long.valueOf(CompetitionHistoryItemUiModel.this.getId()), Boolean.valueOf(CompetitionHistoryItemUiModel.this.isWin())));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                CompetitionHistoryCardKt.CompetitionHistoryCard(null, competitionHistoryItemUiModel, (Function1) rememberedValue, composer, 0, 1);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$4$lambda$3$lambda$0(int i, CompetitionHistoryItemUiModel competition) {
        Intrinsics.checkNotNullParameter(competition, "competition");
        return competition.getCompetitionId() + "_" + competition.getId() + "_" + i;
    }
}
