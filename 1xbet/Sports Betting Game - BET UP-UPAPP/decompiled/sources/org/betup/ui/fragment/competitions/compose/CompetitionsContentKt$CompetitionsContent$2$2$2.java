package org.betup.ui.fragment.competitions.compose;

import android.os.Bundle;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.Spread;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.dialogs.events.OpenCompetitionsPreviewEvent;
import org.betup.ui.fragment.competitions.compose.components.CompetitionsNoDataViewKt;
import org.betup.ui.fragment.competitions.compose.items.CompetitionCardKt;
import org.betup.ui.fragment.competitions.compose.items.NewCompetitionUiItem;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: CompetitionsContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CompetitionsContentKt$CompetitionsContent$2$2$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<List<NewCompetitionUiItem>> $activeCompetitions$delegate;
    final /* synthetic */ CompetitionsController $controller;
    final /* synthetic */ State<Boolean> $hasMoreActive$delegate;
    final /* synthetic */ State<Boolean> $isActiveLoading$delegate;
    final /* synthetic */ State<Boolean> $isLoadMoreActive$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    CompetitionsContentKt$CompetitionsContent$2$2$2(State<? extends List<NewCompetitionUiItem>> state, State<Boolean> state2, State<Boolean> state3, CompetitionsController competitionsController, State<Boolean> state4) {
        this.$activeCompetitions$delegate = state;
        this.$hasMoreActive$delegate = state2;
        this.$isLoadMoreActive$delegate = state3;
        this.$controller = competitionsController;
        this.$isActiveLoading$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        List CompetitionsContent$lambda$3;
        boolean CompetitionsContent$lambda$9;
        boolean CompetitionsContent$lambda$11;
        boolean CompetitionsContent$lambda$7;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1445976196, i, -1, "org.betup.ui.fragment.competitions.compose.CompetitionsContent.<anonymous>.<anonymous>.<anonymous> (CompetitionsContent.kt:102)");
        }
        CompetitionsContent$lambda$3 = CompetitionsContentKt.CompetitionsContent$lambda$3(this.$activeCompetitions$delegate);
        if (CompetitionsContent$lambda$3.isEmpty()) {
            CompetitionsContent$lambda$7 = CompetitionsContentKt.CompetitionsContent$lambda$7(this.$isActiveLoading$delegate);
            if (!CompetitionsContent$lambda$7) {
                composer.startReplaceGroup(-1445036236);
                CompetitionsNoDataViewKt.CompetitionsNoDataView(StringResources_androidKt.stringResource(R.string.competitions_no_active, composer, 6), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        }
        composer.startReplaceGroup(-1444630911);
        LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        float f = 16;
        PaddingValues m1512PaddingValuesa9UjIt4 = PaddingKt.m1512PaddingValuesa9UjIt4(Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(34));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(this.$activeCompetitions$delegate);
        final State<List<NewCompetitionUiItem>> state = this.$activeCompetitions$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = CompetitionsContentKt$CompetitionsContent$2$2$2.invoke$lambda$5$lambda$4(State.this, (LazyListScope) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(fillMaxSize$default, rememberLazyListStateWithoutSavedState, m1512PaddingValuesa9UjIt4, false, m1397spacedBy0680j_4, null, null, true, null, (Function1) rememberedValue, composer, 12607494, Spread.ROUND);
        CompetitionsContent$lambda$9 = CompetitionsContentKt.CompetitionsContent$lambda$9(this.$hasMoreActive$delegate);
        Boolean valueOf = Boolean.valueOf(CompetitionsContent$lambda$9);
        CompetitionsContent$lambda$11 = CompetitionsContentKt.CompetitionsContent$lambda$11(this.$isLoadMoreActive$delegate);
        Boolean valueOf2 = Boolean.valueOf(CompetitionsContent$lambda$11);
        composer.startReplaceGroup(-1224400529);
        boolean changed2 = composer.changed(rememberLazyListStateWithoutSavedState) | composer.changed(this.$activeCompetitions$delegate) | composer.changed(this.$hasMoreActive$delegate) | composer.changed(this.$isLoadMoreActive$delegate) | composer.changedInstance(this.$controller);
        CompetitionsController competitionsController = this.$controller;
        State<List<NewCompetitionUiItem>> state2 = this.$activeCompetitions$delegate;
        State<Boolean> state3 = this.$hasMoreActive$delegate;
        State<Boolean> state4 = this.$isLoadMoreActive$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function2) new CompetitionsContentKt$CompetitionsContent$2$2$2$2$1(rememberLazyListStateWithoutSavedState, competitionsController, state2, state3, state4, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue2, composer, 0);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(State state, LazyListScope LazyColumn) {
        final List CompetitionsContent$lambda$3;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        CompetitionsContent$lambda$3 = CompetitionsContentKt.CompetitionsContent$lambda$3(state);
        final Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$5$lambda$4$lambda$0;
                invoke$lambda$5$lambda$4$lambda$0 = CompetitionsContentKt$CompetitionsContent$2$2$2.invoke$lambda$5$lambda$4$lambda$0((NewCompetitionUiItem) obj);
                return invoke$lambda$5$lambda$4$lambda$0;
            }
        };
        final CompetitionsContentKt$CompetitionsContent$2$2$2$invoke$lambda$5$lambda$4$$inlined$items$default$1 competitionsContentKt$CompetitionsContent$2$2$2$invoke$lambda$5$lambda$4$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$invoke$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(NewCompetitionUiItem newCompetitionUiItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((NewCompetitionUiItem) obj);
            }
        };
        LazyColumn.items(CompetitionsContent$lambda$3.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$invoke$lambda$5$lambda$4$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(CompetitionsContent$lambda$3.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$invoke$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(CompetitionsContent$lambda$3.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$invoke$lambda$5$lambda$4$$inlined$items$default$4
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
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final NewCompetitionUiItem newCompetitionUiItem = (NewCompetitionUiItem) CompetitionsContent$lambda$3.get(i);
                composer.startReplaceGroup(2143142376);
                composer.startReplaceGroup(5004770);
                boolean changed = composer.changed(newCompetitionUiItem);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Log.d("CompetitionsContent", "Enter competition clicked: " + NewCompetitionUiItem.this.getId());
                            Bundle bundle = new Bundle();
                            bundle.putLong("competition_id", NewCompetitionUiItem.this.getId());
                            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.COMPETITION_DETAILS, bundle));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean changed2 = composer.changed(newCompetitionUiItem);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$2$2$2$1$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Log.d("CompetitionsContent", "Competition card clicked for preview: " + NewCompetitionUiItem.this.getId());
                            EventBus.getDefault().post(new OpenCompetitionsPreviewEvent(NewCompetitionUiItem.this.getId(), null, null));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                CompetitionCardKt.CompetitionCard(null, newCompetitionUiItem, function0, (Function0) rememberedValue2, composer, 0, 1);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$5$lambda$4$lambda$0(NewCompetitionUiItem competition) {
        Intrinsics.checkNotNullParameter(competition, "competition");
        return competition.getUniqueLocalId();
    }
}
