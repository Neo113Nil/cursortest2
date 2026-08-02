package org.betup.ui.fragment.user.compose;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerScope;
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
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.dialogs.events.OpenCreateBattleDialogEvent;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattlesNoDataViewKt;
import org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2;
import org.betup.ui.fragment.user.compose.components.BattleStatsItemKt;
import org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt;
import org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt;
import org.betup.ui.fragment.user.compose.items.NewUserBattleMatch;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.betup.ui.fragment.user.controller.UserBattlesController;
import org.betup.utils.NavigationHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserBattlesContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserBattlesContentKt$UserBattlesContent$4$2 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ State<List<BattleCountModel>> $battleCounts$delegate;
    final /* synthetic */ UserBattlesController $controller;
    final /* synthetic */ State<Boolean> $hasMoreAvailableBattles$delegate;
    final /* synthetic */ State<Boolean> $hasMorePrivateBattles$delegate;
    final /* synthetic */ State<Boolean> $hasMoreStatsBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoadMoreAvailableBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoadMorePrivateBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoadMoreStatsBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ State<List<NewUserBattleUiItem>> $realAvailableBattles$delegate;
    final /* synthetic */ State<List<NewUserBattleUiItem>> $realPrivateBattles$delegate;
    final /* synthetic */ State<List<NewUserBattleModel>> $realStatsBattles$delegate;
    final /* synthetic */ MutableState<ChallengeState> $selectedStatsFilter$delegate;
    final /* synthetic */ State<Integer> $totalItems$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    UserBattlesContentKt$UserBattlesContent$4$2(UserBattlesController userBattlesController, State<? extends List<NewUserBattleUiItem>> state, State<Boolean> state2, State<Boolean> state3, State<Boolean> state4, State<? extends List<NewUserBattleUiItem>> state5, State<Boolean> state6, State<Boolean> state7, State<? extends List<NewUserBattleModel>> state8, MutableState<ChallengeState> mutableState, State<Boolean> state9, State<Boolean> state10, State<? extends List<BattleCountModel>> state11, State<Integer> state12) {
        this.$controller = userBattlesController;
        this.$realAvailableBattles$delegate = state;
        this.$isLoading$delegate = state2;
        this.$hasMoreAvailableBattles$delegate = state3;
        this.$isLoadMoreAvailableBattles$delegate = state4;
        this.$realPrivateBattles$delegate = state5;
        this.$hasMorePrivateBattles$delegate = state6;
        this.$isLoadMorePrivateBattles$delegate = state7;
        this.$realStatsBattles$delegate = state8;
        this.$selectedStatsFilter$delegate = mutableState;
        this.$hasMoreStatsBattles$delegate = state9;
        this.$isLoadMoreStatsBattles$delegate = state10;
        this.$battleCounts$delegate = state11;
        this.$totalItems$delegate = state12;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(UserBattlesController userBattlesController) {
        if (userBattlesController != null) {
            userBattlesController.loadAvailableBattles();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UserBattlesContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UserBattlesController $controller;
        final /* synthetic */ List<NewUserBattleUiItem> $currentAvailableBattles;
        final /* synthetic */ State<Boolean> $hasMoreAvailableBattles$delegate;
        final /* synthetic */ State<Boolean> $isLoadMoreAvailableBattles$delegate;
        final /* synthetic */ State<Boolean> $isLoading$delegate;
        final /* synthetic */ State<List<NewUserBattleUiItem>> $realAvailableBattles$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<NewUserBattleUiItem> list, State<Boolean> state, State<Boolean> state2, UserBattlesController userBattlesController, State<Boolean> state3, State<? extends List<NewUserBattleUiItem>> state4) {
            this.$currentAvailableBattles = list;
            this.$hasMoreAvailableBattles$delegate = state;
            this.$isLoading$delegate = state2;
            this.$controller = userBattlesController;
            this.$isLoadMoreAvailableBattles$delegate = state3;
            this.$realAvailableBattles$delegate = state4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$2$lambda$1$lambda$0() {
            EventBus.getDefault().post(new OpenCreateBattleDialogEvent(null, null, 3, null));
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            List UserBattlesContent$lambda$8;
            State<Boolean> state;
            UserBattlesController userBattlesController;
            State<Boolean> state2;
            State<Boolean> state3;
            List<NewUserBattleUiItem> list;
            boolean UserBattlesContent$lambda$20;
            boolean UserBattlesContent$lambda$14;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1008039418, i, -1, "org.betup.ui.fragment.user.compose.UserBattlesContent.<anonymous>.<anonymous>.<anonymous> (UserBattlesContent.kt:214)");
            }
            if (this.$currentAvailableBattles.isEmpty()) {
                composer.startReplaceGroup(-86120286);
                String stringResource = StringResources_androidKt.stringResource(R.string.battles_no_available, composer, 6);
                composer.startReplaceGroup(1849434622);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$12$lambda$11;
                            invoke$lambda$12$lambda$11 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass2.invoke$lambda$12$lambda$11();
                            return invoke$lambda$12$lambda$11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                BattlesNoDataViewKt.BattlesNoDataView(stringResource, (Function0) rememberedValue, composer, 48, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-90755592);
                List<NewUserBattleUiItem> list2 = this.$currentAvailableBattles;
                State<Boolean> state4 = this.$hasMoreAvailableBattles$delegate;
                State<Boolean> state5 = this.$isLoading$delegate;
                UserBattlesController userBattlesController2 = this.$controller;
                State<Boolean> state6 = this.$isLoadMoreAvailableBattles$delegate;
                State<List<NewUserBattleUiItem>> state7 = this.$realAvailableBattles$delegate;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceGroup(-782802711);
                UserBattlesContent$lambda$8 = UserBattlesContentKt.UserBattlesContent$lambda$8(state7);
                if (UserBattlesContent$lambda$8.isEmpty()) {
                    state = state6;
                    userBattlesController = userBattlesController2;
                    state2 = state5;
                    state3 = state4;
                    list = list2;
                } else {
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, Dp.m7774constructorimpl(12), 0.0f, 11, null);
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer, 6);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1520paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                    String stringResource2 = StringResources_androidKt.stringResource(R.string.battles_create_battle, composer, 6);
                    composer.startReplaceGroup(1849434622);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$10$lambda$2$lambda$1$lambda$0;
                                invoke$lambda$10$lambda$2$lambda$1$lambda$0 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass2.invoke$lambda$10$lambda$2$lambda$1$lambda$0();
                                return invoke$lambda$10$lambda$2$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    state = state6;
                    userBattlesController = userBattlesController2;
                    state2 = state5;
                    state3 = state4;
                    list = list2;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource2, false, true, false, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 1597440, 0, 0, 2097067);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                }
                composer.endReplaceGroup();
                LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
                UserBattlesContent$lambda$20 = UserBattlesContentKt.UserBattlesContent$lambda$20(state3);
                Boolean valueOf = Boolean.valueOf(UserBattlesContent$lambda$20);
                UserBattlesContent$lambda$14 = UserBattlesContentKt.UserBattlesContent$lambda$14(state2);
                Boolean valueOf2 = Boolean.valueOf(UserBattlesContent$lambda$14);
                composer.startReplaceGroup(-1224400529);
                final List<NewUserBattleUiItem> list3 = list;
                State<Boolean> state8 = state3;
                State<Boolean> state9 = state2;
                final UserBattlesController userBattlesController3 = userBattlesController;
                boolean changed = composer.changed(rememberLazyListStateWithoutSavedState) | composer.changedInstance(list3) | composer.changed(state8) | composer.changed(state9) | composer.changedInstance(userBattlesController3);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function2) new UserBattlesContentKt$UserBattlesContent$4$2$2$1$2$1(rememberLazyListStateWithoutSavedState, list3, userBattlesController3, state8, state9, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue3, composer, 0);
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), UserBattleListDimens.INSTANCE.m14237getListHorizontalPaddingD9Ej5fM(), UserBattleListDimens.INSTANCE.m14240getListTopPaddingD9Ej5fM(), UserBattleListDimens.INSTANCE.m14237getListHorizontalPaddingD9Ej5fM(), 0.0f, 8, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(UserBattleListDimens.INSTANCE.m14238getListItemSpacingD9Ej5fM());
                composer.startReplaceGroup(-1746271574);
                final State<Boolean> state10 = state;
                boolean changedInstance = composer.changedInstance(list3) | composer.changedInstance(userBattlesController3) | composer.changed(state10);
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$10$lambda$9$lambda$8;
                            invoke$lambda$10$lambda$9$lambda$8 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass2.invoke$lambda$10$lambda$9$lambda$8(list3, userBattlesController3, state10, (LazyListScope) obj);
                            return invoke$lambda$10$lambda$9$lambda$8;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default2, rememberLazyListStateWithoutSavedState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue4, composer, 24576, 492);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11() {
            EventBus.getDefault().post(new OpenCreateBattleDialogEvent(null, null, 3, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8(final List list, final UserBattlesController userBattlesController, State state, LazyListScope LazyColumn) {
            boolean UserBattlesContent$lambda$26;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final UserBattlesContentKt$UserBattlesContent$4$2$2$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 userBattlesContentKt$UserBattlesContent$4$2$2$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(NewUserBattleUiItem newUserBattleUiItem) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((NewUserBattleUiItem) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
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
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
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
                    final NewUserBattleUiItem newUserBattleUiItem = (NewUserBattleUiItem) list.get(i);
                    composer.startReplaceGroup(1408923346);
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, UserBattleListDimens.INSTANCE.m14239getListItemVerticalMarginD9Ej5fM(), 1, null);
                    composer.startReplaceGroup(-1633490746);
                    boolean changedInstance = composer.changedInstance(userBattlesController) | composer.changed(newUserBattleUiItem);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final UserBattlesController userBattlesController2 = userBattlesController;
                        rememberedValue = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$1$3$1$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j) {
                                UserBattlesController userBattlesController3 = UserBattlesController.this;
                                if (userBattlesController3 != null) {
                                    NewUserBattleMatch match = newUserBattleUiItem.getMatch();
                                    userBattlesController3.acceptBattle(j, match != null ? Long.valueOf(match.getId()) : null);
                                }
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean changedInstance2 = composer.changedInstance(userBattlesController) | composer.changed(newUserBattleUiItem);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final UserBattlesController userBattlesController3 = userBattlesController;
                        rememberedValue2 = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$1$3$1$1$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j) {
                                UserBattlesController userBattlesController4 = UserBattlesController.this;
                                if (userBattlesController4 != null) {
                                    NewUserBattleMatch match = newUserBattleUiItem.getMatch();
                                    userBattlesController4.acceptBattle(j, match != null ? Long.valueOf(match.getId()) : null);
                                }
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function12 = (Function1) rememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1849434622);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function2) new Function2<Integer, Boolean, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$2$1$3$1$1$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
                                invoke(num.intValue(), bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i4, boolean z) {
                                NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i4, z, (String) null, false, 12, (Object) null);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    composer.endReplaceGroup();
                    NewUserBattleItemKt.NewUserBattleItem(m1518paddingVpY3zN4$default, newUserBattleUiItem, function1, function12, (Function2) rememberedValue3, composer, 24582, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            UserBattlesContent$lambda$26 = UserBattlesContentKt.UserBattlesContent$lambda$26(state);
            if (UserBattlesContent$lambda$26) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserBattlesContentKt.INSTANCE.getLambda$841678983$app_release(), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(UserBattlesController userBattlesController) {
        if (userBattlesController != null) {
            userBattlesController.loadPrivateBattles();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UserBattlesContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4, reason: invalid class name */
    static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UserBattlesController $controller;
        final /* synthetic */ List<NewUserBattleUiItem> $currentPrivateBattles;
        final /* synthetic */ State<Boolean> $hasMorePrivateBattles$delegate;
        final /* synthetic */ State<Boolean> $isLoadMorePrivateBattles$delegate;
        final /* synthetic */ State<Boolean> $isLoading$delegate;
        final /* synthetic */ State<List<NewUserBattleUiItem>> $realPrivateBattles$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(List<NewUserBattleUiItem> list, State<Boolean> state, State<Boolean> state2, UserBattlesController userBattlesController, State<Boolean> state3, State<? extends List<NewUserBattleUiItem>> state4) {
            this.$currentPrivateBattles = list;
            this.$hasMorePrivateBattles$delegate = state;
            this.$isLoading$delegate = state2;
            this.$controller = userBattlesController;
            this.$isLoadMorePrivateBattles$delegate = state3;
            this.$realPrivateBattles$delegate = state4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$2$lambda$1$lambda$0() {
            EventBus.getDefault().post(new OpenCreateBattleDialogEvent(null, null, 3, null));
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            List UserBattlesContent$lambda$10;
            State<Boolean> state;
            UserBattlesController userBattlesController;
            State<Boolean> state2;
            State<Boolean> state3;
            List<NewUserBattleUiItem> list;
            boolean UserBattlesContent$lambda$22;
            boolean UserBattlesContent$lambda$14;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1924572847, i, -1, "org.betup.ui.fragment.user.compose.UserBattlesContent.<anonymous>.<anonymous>.<anonymous> (UserBattlesContent.kt:319)");
            }
            if (this.$currentPrivateBattles.isEmpty()) {
                composer.startReplaceGroup(1436074461);
                String stringResource = StringResources_androidKt.stringResource(R.string.battles_no_private, composer, 6);
                composer.startReplaceGroup(1849434622);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$12$lambda$11;
                            invoke$lambda$12$lambda$11 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass4.invoke$lambda$12$lambda$11();
                            return invoke$lambda$12$lambda$11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                BattlesNoDataViewKt.BattlesNoDataView(stringResource, (Function0) rememberedValue, composer, 48, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1431460421);
                List<NewUserBattleUiItem> list2 = this.$currentPrivateBattles;
                State<Boolean> state4 = this.$hasMorePrivateBattles$delegate;
                State<Boolean> state5 = this.$isLoading$delegate;
                UserBattlesController userBattlesController2 = this.$controller;
                State<Boolean> state6 = this.$isLoadMorePrivateBattles$delegate;
                State<List<NewUserBattleUiItem>> state7 = this.$realPrivateBattles$delegate;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceGroup(547682064);
                UserBattlesContent$lambda$10 = UserBattlesContentKt.UserBattlesContent$lambda$10(state7);
                if (UserBattlesContent$lambda$10.isEmpty()) {
                    state = state6;
                    userBattlesController = userBattlesController2;
                    state2 = state5;
                    state3 = state4;
                    list = list2;
                } else {
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, Dp.m7774constructorimpl(12), 0.0f, 11, null);
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composer, 6);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1520paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                    String stringResource2 = StringResources_androidKt.stringResource(R.string.battles_create_battle, composer, 6);
                    composer.startReplaceGroup(1849434622);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$10$lambda$2$lambda$1$lambda$0;
                                invoke$lambda$10$lambda$2$lambda$1$lambda$0 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass4.invoke$lambda$10$lambda$2$lambda$1$lambda$0();
                                return invoke$lambda$10$lambda$2$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    state = state6;
                    userBattlesController = userBattlesController2;
                    state2 = state5;
                    state3 = state4;
                    list = list2;
                    CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource2, false, true, false, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 1597440, 0, 0, 2097067);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                }
                composer.endReplaceGroup();
                LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
                UserBattlesContent$lambda$22 = UserBattlesContentKt.UserBattlesContent$lambda$22(state3);
                Boolean valueOf = Boolean.valueOf(UserBattlesContent$lambda$22);
                UserBattlesContent$lambda$14 = UserBattlesContentKt.UserBattlesContent$lambda$14(state2);
                Boolean valueOf2 = Boolean.valueOf(UserBattlesContent$lambda$14);
                composer.startReplaceGroup(-1224400529);
                final List<NewUserBattleUiItem> list3 = list;
                State<Boolean> state8 = state3;
                State<Boolean> state9 = state2;
                final UserBattlesController userBattlesController3 = userBattlesController;
                boolean changed = composer.changed(rememberLazyListStateWithoutSavedState) | composer.changedInstance(list3) | composer.changed(state8) | composer.changed(state9) | composer.changedInstance(userBattlesController3);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function2) new UserBattlesContentKt$UserBattlesContent$4$2$4$1$2$1(rememberLazyListStateWithoutSavedState, list3, userBattlesController3, state8, state9, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue3, composer, 0);
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), UserBattleListDimens.INSTANCE.m14237getListHorizontalPaddingD9Ej5fM(), UserBattleListDimens.INSTANCE.m14240getListTopPaddingD9Ej5fM(), UserBattleListDimens.INSTANCE.m14237getListHorizontalPaddingD9Ej5fM(), 0.0f, 8, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(UserBattleListDimens.INSTANCE.m14238getListItemSpacingD9Ej5fM());
                composer.startReplaceGroup(-1746271574);
                final State<Boolean> state10 = state;
                boolean changedInstance = composer.changedInstance(list3) | composer.changedInstance(userBattlesController3) | composer.changed(state10);
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$10$lambda$9$lambda$8;
                            invoke$lambda$10$lambda$9$lambda$8 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass4.invoke$lambda$10$lambda$9$lambda$8(list3, userBattlesController3, state10, (LazyListScope) obj);
                            return invoke$lambda$10$lambda$9$lambda$8;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default2, rememberLazyListStateWithoutSavedState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue4, composer, 24576, 492);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11() {
            EventBus.getDefault().post(new OpenCreateBattleDialogEvent(null, null, 3, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8(final List list, final UserBattlesController userBattlesController, State state, LazyListScope LazyColumn) {
            boolean UserBattlesContent$lambda$28;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final UserBattlesContentKt$UserBattlesContent$4$2$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 userBattlesContentKt$UserBattlesContent$4$2$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(NewUserBattleUiItem newUserBattleUiItem) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((NewUserBattleUiItem) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
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
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
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
                    final NewUserBattleUiItem newUserBattleUiItem = (NewUserBattleUiItem) list.get(i);
                    composer.startReplaceGroup(-358389751);
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, UserBattleListDimens.INSTANCE.m14239getListItemVerticalMarginD9Ej5fM(), 1, null);
                    composer.startReplaceGroup(-1633490746);
                    boolean changedInstance = composer.changedInstance(userBattlesController) | composer.changed(newUserBattleUiItem);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final UserBattlesController userBattlesController2 = userBattlesController;
                        rememberedValue = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$1$3$1$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j) {
                                UserBattlesController userBattlesController3 = UserBattlesController.this;
                                if (userBattlesController3 != null) {
                                    NewUserBattleMatch match = newUserBattleUiItem.getMatch();
                                    userBattlesController3.acceptBattle(j, match != null ? Long.valueOf(match.getId()) : null);
                                }
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean changedInstance2 = composer.changedInstance(userBattlesController) | composer.changed(newUserBattleUiItem);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final UserBattlesController userBattlesController3 = userBattlesController;
                        rememberedValue2 = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$1$3$1$1$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                invoke(l.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j) {
                                UserBattlesController userBattlesController4 = UserBattlesController.this;
                                if (userBattlesController4 != null) {
                                    NewUserBattleMatch match = newUserBattleUiItem.getMatch();
                                    userBattlesController4.acceptBattle(j, match != null ? Long.valueOf(match.getId()) : null);
                                }
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function12 = (Function1) rememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1849434622);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function2) new Function2<Integer, Boolean, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$4$1$3$1$1$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
                                invoke(num.intValue(), bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i4, boolean z) {
                                NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i4, z, (String) null, false, 12, (Object) null);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    composer.endReplaceGroup();
                    NewUserBattleItemKt.NewUserBattleItem(m1518paddingVpY3zN4$default, newUserBattleUiItem, function1, function12, (Function2) rememberedValue3, composer, 24582, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            UserBattlesContent$lambda$28 = UserBattlesContentKt.UserBattlesContent$lambda$28(state);
            if (UserBattlesContent$lambda$28) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserBattlesContentKt.INSTANCE.getLambda$1387495664$app_release(), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(UserBattlesController userBattlesController, MutableState mutableState) {
        ChallengeState UserBattlesContent$lambda$32;
        if (userBattlesController != null) {
            UserBattlesContent$lambda$32 = UserBattlesContentKt.UserBattlesContent$lambda$32(mutableState);
            userBattlesController.loadStatsBattles(UserBattlesContent$lambda$32 != null ? Integer.valueOf(UserBattlesContent$lambda$32.getValue()) : null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UserBattlesContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6, reason: invalid class name */
    static final class AnonymousClass6 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ State<List<BattleCountModel>> $battleCounts$delegate;
        final /* synthetic */ UserBattlesController $controller;
        final /* synthetic */ List<NewUserBattleModel> $filteredBattles;
        final /* synthetic */ State<Boolean> $hasMoreStatsBattles$delegate;
        final /* synthetic */ State<Boolean> $isLoadMoreStatsBattles$delegate;
        final /* synthetic */ State<Boolean> $isLoading$delegate;
        final /* synthetic */ MutableState<ChallengeState> $selectedStatsFilter$delegate;
        final /* synthetic */ State<Integer> $totalItems$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(List<NewUserBattleModel> list, State<Boolean> state, State<Boolean> state2, UserBattlesController userBattlesController, State<Boolean> state3, MutableState<ChallengeState> mutableState, State<? extends List<BattleCountModel>> state4, State<Integer> state5) {
            this.$filteredBattles = list;
            this.$hasMoreStatsBattles$delegate = state;
            this.$isLoading$delegate = state2;
            this.$controller = userBattlesController;
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
        public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(UserBattlesController userBattlesController, MutableState mutableState, ChallengeState challengeState) {
            mutableState.setValue(challengeState);
            Integer valueOf = challengeState != null ? Integer.valueOf(challengeState.getValue()) : null;
            Log.d("UserBattlesContent", "Filter changed to: " + challengeState + " (value: " + valueOf + ")");
            if (userBattlesController != null) {
                userBattlesController.loadStatsBattles(valueOf);
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            State<Integer> state;
            State<List<BattleCountModel>> state2;
            String str;
            UserBattlesController userBattlesController;
            String str2;
            MutableState<ChallengeState> mutableState;
            int i2;
            ChallengeState UserBattlesContent$lambda$32;
            List UserBattlesContent$lambda$16;
            int UserBattlesContent$lambda$18;
            boolean UserBattlesContent$lambda$24;
            boolean UserBattlesContent$lambda$14;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(544787534, i, -1, "org.betup.ui.fragment.user.compose.UserBattlesContent.<anonymous>.<anonymous>.<anonymous> (UserBattlesContent.kt:425)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            final List<NewUserBattleModel> list = this.$filteredBattles;
            State<Boolean> state3 = this.$hasMoreStatsBattles$delegate;
            State<Boolean> state4 = this.$isLoading$delegate;
            final UserBattlesController userBattlesController2 = this.$controller;
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
                userBattlesController = userBattlesController2;
                str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                mutableState = mutableState2;
                composer.startReplaceGroup(759865070);
                String stringResource = StringResources_androidKt.stringResource(R.string.battles_no_stats, composer, 6);
                composer.startReplaceGroup(1849434622);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$10$lambda$6$lambda$5;
                            invoke$lambda$10$lambda$6$lambda$5 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass6.invoke$lambda$10$lambda$6$lambda$5();
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
                composer.startReplaceGroup(756864239);
                LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
                UserBattlesContent$lambda$24 = UserBattlesContentKt.UserBattlesContent$lambda$24(state3);
                Boolean valueOf = Boolean.valueOf(UserBattlesContent$lambda$24);
                UserBattlesContent$lambda$14 = UserBattlesContentKt.UserBattlesContent$lambda$14(state4);
                Boolean valueOf2 = Boolean.valueOf(UserBattlesContent$lambda$14);
                composer.startReplaceGroup(-1224400529);
                boolean changed = composer.changed(rememberLazyListStateWithoutSavedState) | composer.changedInstance(list) | composer.changed(state3) | composer.changed(state4) | composer.changedInstance(userBattlesController2);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    state = state7;
                    state2 = state6;
                    str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    mutableState = mutableState2;
                    rememberedValue2 = (Function2) new UserBattlesContentKt$UserBattlesContent$4$2$6$1$1$1(rememberLazyListStateWithoutSavedState, list, userBattlesController2, state3, state4, null);
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
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(UserBattleListDimens.INSTANCE.m14238getListItemSpacingD9Ej5fM());
                composer.startReplaceGroup(-1746271574);
                boolean changedInstance = composer.changedInstance(list) | composer.changedInstance(userBattlesController2) | composer.changed(state5);
                Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$10$lambda$4$lambda$3;
                            invoke$lambda$10$lambda$4$lambda$3 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass6.invoke$lambda$10$lambda$4$lambda$3(list, userBattlesController2, state5, (LazyListScope) obj);
                            return invoke$lambda$10$lambda$4$lambda$3;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                userBattlesController = userBattlesController2;
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
            UserBattlesContent$lambda$32 = UserBattlesContentKt.UserBattlesContent$lambda$32(mutableState);
            composer.startReplaceGroup(-1633490746);
            final UserBattlesController userBattlesController3 = userBattlesController;
            boolean changedInstance2 = composer.changedInstance(userBattlesController3);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                final MutableState<ChallengeState> mutableState3 = mutableState;
                rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                        invoke$lambda$10$lambda$9$lambda$8$lambda$7 = UserBattlesContentKt$UserBattlesContent$4$2.AnonymousClass6.invoke$lambda$10$lambda$9$lambda$8$lambda$7(UserBattlesController.this, mutableState3, (ChallengeState) obj);
                        return invoke$lambda$10$lambda$9$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            Function1 function1 = (Function1) rememberedValue4;
            composer.endReplaceGroup();
            UserBattlesContent$lambda$16 = UserBattlesContentKt.UserBattlesContent$lambda$16(state2);
            UserBattlesContent$lambda$18 = UserBattlesContentKt.UserBattlesContent$lambda$18(state);
            BattlesStatsFilterKt.BattlesStatsFilter(UserBattlesContent$lambda$32, function1, UserBattlesContent$lambda$16, UserBattlesContent$lambda$18, composer, 0, 0);
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
        public static final Unit invoke$lambda$10$lambda$4$lambda$3(final List list, final UserBattlesController userBattlesController, State state, LazyListScope LazyColumn) {
            boolean UserBattlesContent$lambda$30;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final UserBattlesContentKt$UserBattlesContent$4$2$6$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1 userBattlesContentKt$UserBattlesContent$4$2$6$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(NewUserBattleModel newUserBattleModel) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((NewUserBattleModel) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$3
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
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$4
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
                    composer.startReplaceGroup(-782851319);
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, UserBattleListDimens.INSTANCE.m14239getListItemVerticalMarginD9Ej5fM(), 1, null);
                    composer.startReplaceGroup(-1633490746);
                    boolean changedInstance = composer.changedInstance(list) | composer.changedInstance(userBattlesController);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final List list2 = list;
                        final UserBattlesController userBattlesController2 = userBattlesController;
                        rememberedValue = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$6$1$2$1$1$1$1
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
                                UserBattlesController userBattlesController3 = userBattlesController2;
                                if (userBattlesController3 != null) {
                                    userBattlesController3.openBattlePreview(j, arrayList2);
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
            UserBattlesContent$lambda$30 = UserBattlesContentKt.UserBattlesContent$lambda$30(state);
            if (UserBattlesContent$lambda$30) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserBattlesContentKt.INSTANCE.getLambda$212158047$app_release(), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        boolean UserBattlesContent$lambda$14;
        boolean UserBattlesContent$lambda$142;
        List UserBattlesContent$lambda$12;
        boolean UserBattlesContent$lambda$143;
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-891231610, i2, -1, "org.betup.ui.fragment.user.compose.UserBattlesContent.<anonymous>.<anonymous> (UserBattlesContent.kt:202)");
        }
        if (i == 0) {
            composer.startReplaceGroup(807169219);
            List UserBattlesContent$lambda$8 = this.$controller != null ? UserBattlesContentKt.UserBattlesContent$lambda$8(this.$realAvailableBattles$delegate) : CollectionsKt.emptyList();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UserBattlesContent$lambda$14 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
            composer.startReplaceGroup(5004770);
            boolean changedInstance = composer.changedInstance(this.$controller);
            final UserBattlesController userBattlesController = this.$controller;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = UserBattlesContentKt$UserBattlesContent$4$2.invoke$lambda$1$lambda$0(UserBattlesController.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default, UserBattlesContent$lambda$14, (Function0) rememberedValue, !UserBattlesContent$lambda$8.isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(-1008039418, true, new AnonymousClass2(UserBattlesContent$lambda$8, this.$hasMoreAvailableBattles$delegate, this.$isLoading$delegate, this.$controller, this.$isLoadMoreAvailableBattles$delegate, this.$realAvailableBattles$delegate), composer, 54), composer, 196614, 16);
            composer.endReplaceGroup();
        } else if (i == 1) {
            composer.startReplaceGroup(813020841);
            List UserBattlesContent$lambda$10 = this.$controller != null ? UserBattlesContentKt.UserBattlesContent$lambda$10(this.$realPrivateBattles$delegate) : CollectionsKt.emptyList();
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UserBattlesContent$lambda$142 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
            composer.startReplaceGroup(5004770);
            boolean changedInstance2 = composer.changedInstance(this.$controller);
            final UserBattlesController userBattlesController2 = this.$controller;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = UserBattlesContentKt$UserBattlesContent$4$2.invoke$lambda$3$lambda$2(UserBattlesController.this);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default2, UserBattlesContent$lambda$142, (Function0) rememberedValue2, !UserBattlesContent$lambda$10.isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(1924572847, true, new AnonymousClass4(UserBattlesContent$lambda$10, this.$hasMorePrivateBattles$delegate, this.$isLoading$delegate, this.$controller, this.$isLoadMorePrivateBattles$delegate, this.$realPrivateBattles$delegate), composer, 54), composer, 196614, 16);
            composer.endReplaceGroup();
        } else if (i == 2) {
            composer.startReplaceGroup(818823979);
            UserBattlesContent$lambda$12 = UserBattlesContentKt.UserBattlesContent$lambda$12(this.$realStatsBattles$delegate);
            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            UserBattlesContent$lambda$143 = UserBattlesContentKt.UserBattlesContent$lambda$14(this.$isLoading$delegate);
            composer.startReplaceGroup(-1633490746);
            boolean changedInstance3 = composer.changedInstance(this.$controller);
            final UserBattlesController userBattlesController3 = this.$controller;
            final MutableState<ChallengeState> mutableState = this.$selectedStatsFilter$delegate;
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$4$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$4;
                        invoke$lambda$5$lambda$4 = UserBattlesContentKt$UserBattlesContent$4$2.invoke$lambda$5$lambda$4(UserBattlesController.this, mutableState);
                        return invoke$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default3, UserBattlesContent$lambda$143, (Function0) rememberedValue3, !UserBattlesContent$lambda$12.isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(544787534, true, new AnonymousClass6(UserBattlesContent$lambda$12, this.$hasMoreStatsBattles$delegate, this.$isLoading$delegate, this.$controller, this.$isLoadMoreStatsBattles$delegate, this.$selectedStatsFilter$delegate, this.$battleCounts$delegate, this.$totalItems$delegate), composer, 54), composer, 196614, 16);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(824090042);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
