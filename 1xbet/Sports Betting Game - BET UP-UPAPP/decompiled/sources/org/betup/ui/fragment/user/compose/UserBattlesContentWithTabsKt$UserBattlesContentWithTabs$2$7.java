package org.betup.ui.fragment.user.compose;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.dialogs.events.OpenCreateBattleDialogEvent;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattlesNoDataViewKt;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.compose.components.BattleStatsItemKt;
import org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserBattlesContentWithTabs.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<List<BattleCountModel>> $battleCounts$delegate;
    final /* synthetic */ UserDetailsController $controller;
    final /* synthetic */ List<NewUserBattleModel> $filteredBattles;
    final /* synthetic */ State<Boolean> $hasMoreStatsBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoadMoreStatsBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<ChallengeState> $selectedStatsFilter$delegate;
    final /* synthetic */ State<Integer> $totalItems$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7(List<NewUserBattleModel> list, State<Boolean> state, State<Boolean> state2, UserDetailsController userDetailsController, State<Boolean> state3, MutableState<ChallengeState> mutableState, State<? extends List<BattleCountModel>> state4, State<Integer> state5) {
        this.$filteredBattles = list;
        this.$hasMoreStatsBattles$delegate = state;
        this.$isLoading$delegate = state2;
        this.$controller = userDetailsController;
        this.$isLoadMoreStatsBattles$delegate = state3;
        this.$selectedStatsFilter$delegate = mutableState;
        this.$battleCounts$delegate = state4;
        this.$totalItems$delegate = state5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$6$lambda$5() {
        EventBus.getDefault().post(new OpenCreateBattleDialogEvent(null, null, 3, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(UserDetailsController userDetailsController, MutableState mutableState, ChallengeState challengeState) {
        mutableState.setValue(challengeState);
        Integer valueOf = challengeState != null ? Integer.valueOf(challengeState.getValue()) : null;
        Log.d("UserBattlesContentWithTabs", "Filter changed to: " + challengeState + " (value: " + valueOf + ")");
        if (userDetailsController != null) {
            userDetailsController.loadStatsBattles(valueOf);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        State<Integer> state;
        State<List<BattleCountModel>> state2;
        String str;
        UserDetailsController userDetailsController;
        String str2;
        MutableState<ChallengeState> mutableState;
        int i2;
        ChallengeState UserBattlesContentWithTabs$lambda$29;
        List UserBattlesContentWithTabs$lambda$12;
        int UserBattlesContentWithTabs$lambda$14;
        boolean UserBattlesContentWithTabs$lambda$20;
        boolean UserBattlesContentWithTabs$lambda$10;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1778726366, i, -1, "org.betup.ui.fragment.user.compose.UserBattlesContentWithTabs.<anonymous>.<anonymous> (UserBattlesContentWithTabs.kt:422)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        final List<NewUserBattleModel> list = this.$filteredBattles;
        State<Boolean> state3 = this.$hasMoreStatsBattles$delegate;
        State<Boolean> state4 = this.$isLoading$delegate;
        final UserDetailsController userDetailsController2 = this.$controller;
        final State<Boolean> state5 = this.$isLoadMoreStatsBattles$delegate;
        MutableState<ChallengeState> mutableState2 = this.$selectedStatsFilter$delegate;
        State<List<BattleCountModel>> state6 = this.$battleCounts$delegate;
        State<Integer> state7 = this.$totalItems$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (list.isEmpty()) {
            state = state7;
            state2 = state6;
            str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            userDetailsController = userDetailsController2;
            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            mutableState = mutableState2;
            composer.startReplaceGroup(-1017542219);
            String stringResource = StringResources_androidKt.stringResource(R.string.battles_no_stats, composer, 6);
            composer.startReplaceGroup(1849434622);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$10$lambda$6$lambda$5;
                        invoke$lambda$10$lambda$6$lambda$5 = UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7.invoke$lambda$10$lambda$6$lambda$5();
                        return invoke$lambda$10$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            i2 = 0;
            BattlesNoDataViewKt.BattlesNoDataView(stringResource, (Function0) rememberedValue, composer, 48, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1021456310);
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
            UserBattlesContentWithTabs$lambda$20 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$20(state3);
            Boolean valueOf = Boolean.valueOf(UserBattlesContentWithTabs$lambda$20);
            UserBattlesContentWithTabs$lambda$10 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(state4);
            Boolean valueOf2 = Boolean.valueOf(UserBattlesContentWithTabs$lambda$10);
            composer.startReplaceGroup(-1224400529);
            boolean changed = composer.changed(rememberLazyListStateWithoutSavedState) | composer.changedInstance(list) | composer.changed(state3) | composer.changed(state4) | composer.changedInstance(userDetailsController2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                state = state7;
                state2 = state6;
                str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                mutableState = mutableState2;
                rememberedValue2 = (Function2) new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$1$1$1(rememberLazyListStateWithoutSavedState, list, userDetailsController2, state3, state4, null);
                composer.updateRememberedValue(rememberedValue2);
            } else {
                state = state7;
                state2 = state6;
                str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                mutableState = mutableState2;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue2, composer, 0);
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(72), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance = composer.changedInstance(list) | composer.changedInstance(userDetailsController2) | composer.changed(state5);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$10$lambda$4$lambda$3;
                        invoke$lambda$10$lambda$4$lambda$3 = UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7.invoke$lambda$10$lambda$4$lambda$3(list, userDetailsController2, state5, (LazyListScope) obj);
                        return invoke$lambda$10$lambda$4$lambda$3;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            userDetailsController = userDetailsController2;
            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default, rememberLazyListStateWithoutSavedState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue3, composer, 24582, 492);
            composer.endReplaceGroup();
            i2 = 0;
        }
        float f = 12;
        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), 0.0f, 9, null);
        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, i2);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1520paddingqDBjuR0$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        UserBattlesContentWithTabs$lambda$29 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$29(mutableState);
        composer.startReplaceGroup(-1633490746);
        final UserDetailsController userDetailsController3 = userDetailsController;
        boolean changedInstance2 = composer.changedInstance(userDetailsController3);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            final MutableState<ChallengeState> mutableState3 = mutableState;
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                    invoke$lambda$10$lambda$9$lambda$8$lambda$7 = UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7.invoke$lambda$10$lambda$9$lambda$8$lambda$7(UserDetailsController.this, mutableState3, (ChallengeState) obj);
                    return invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function1 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        UserBattlesContentWithTabs$lambda$12 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$12(state2);
        UserBattlesContentWithTabs$lambda$14 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$14(state);
        BattlesStatsFilterKt.BattlesStatsFilter(UserBattlesContentWithTabs$lambda$29, function1, UserBattlesContentWithTabs$lambda$12, UserBattlesContentWithTabs$lambda$14, composer, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$4$lambda$3(final List list, final UserDetailsController userDetailsController, State state, LazyListScope LazyColumn) {
        boolean UserBattlesContentWithTabs$lambda$26;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1 userBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(NewUserBattleModel newUserBattleModel) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((NewUserBattleModel) obj);
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$4
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
                NewUserBattleModel newUserBattleModel = (NewUserBattleModel) list.get(i);
                composer.startReplaceGroup(-2096137351);
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, UserBattleListDimens.INSTANCE.m14239getListItemVerticalMarginD9Ej5fM(), 1, null);
                composer.startReplaceGroup(-1633490746);
                boolean changedInstance = composer.changedInstance(list) | composer.changedInstance(userDetailsController);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final List list2 = list;
                    final UserDetailsController userDetailsController2 = userDetailsController;
                    rememberedValue = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            List<NewUserBattleModel> list3 = list2;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Long.valueOf(((NewUserBattleModel) it.next()).getId()));
                            }
                            ArrayList arrayList2 = arrayList;
                            UserDetailsController userDetailsController3 = userDetailsController2;
                            if (userDetailsController3 != null) {
                                userDetailsController3.openBattlePreview(j, arrayList2);
                            }
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                BattleStatsItemKt.BattleStatsItem(newUserBattleModel, m1518paddingVpY3zN4$default, (Function1) rememberedValue, composer, 48, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserBattlesContentWithTabsKt.INSTANCE.getLambda$1848172628$app_release(), 3, null);
        UserBattlesContentWithTabs$lambda$26 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$26(state);
        if (UserBattlesContentWithTabs$lambda$26) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserBattlesContentWithTabsKt.INSTANCE.m14207getLambda$1920043537$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
