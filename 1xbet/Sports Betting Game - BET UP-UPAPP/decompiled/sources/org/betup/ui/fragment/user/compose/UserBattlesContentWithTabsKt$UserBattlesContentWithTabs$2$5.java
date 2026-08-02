package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
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
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.dialogs.events.OpenCreateBattleDialogEvent;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattlesNoDataViewKt;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.compose.components.NewUserBattleItemKt;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.betup.utils.NavigationHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserBattlesContentWithTabs.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UserDetailsController $controller;
    final /* synthetic */ List<NewUserBattleUiItem> $currentPrivateBattles;
    final /* synthetic */ State<Boolean> $hasMorePrivateBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoadMorePrivateBattles$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;

    UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5(List<NewUserBattleUiItem> list, State<Boolean> state, State<Boolean> state2, UserDetailsController userDetailsController, State<Boolean> state3) {
        this.$currentPrivateBattles = list;
        this.$hasMorePrivateBattles$delegate = state;
        this.$isLoading$delegate = state2;
        this.$controller = userDetailsController;
        this.$isLoadMorePrivateBattles$delegate = state3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean UserBattlesContentWithTabs$lambda$18;
        boolean UserBattlesContentWithTabs$lambda$10;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2015344191, i, -1, "org.betup.ui.fragment.user.compose.UserBattlesContentWithTabs.<anonymous>.<anonymous> (UserBattlesContentWithTabs.kt:315)");
        }
        if (this.$currentPrivateBattles.isEmpty()) {
            composer.startReplaceGroup(-224099827);
            String stringResource = StringResources_androidKt.stringResource(R.string.battles_no_private, composer, 6);
            composer.startReplaceGroup(1849434622);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$9$lambda$8;
                        invoke$lambda$9$lambda$8 = UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5.invoke$lambda$9$lambda$8();
                        return invoke$lambda$9$lambda$8;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            BattlesNoDataViewKt.BattlesNoDataView(stringResource, (Function0) rememberedValue, composer, 48, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-228823421);
            final List<NewUserBattleUiItem> list = this.$currentPrivateBattles;
            State<Boolean> state = this.$hasMorePrivateBattles$delegate;
            State<Boolean> state2 = this.$isLoading$delegate;
            final UserDetailsController userDetailsController = this.$controller;
            final State<Boolean> state3 = this.$isLoadMorePrivateBattles$delegate;
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
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, composer, 0, 3);
            UserBattlesContentWithTabs$lambda$18 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$18(state);
            Boolean valueOf = Boolean.valueOf(UserBattlesContentWithTabs$lambda$18);
            UserBattlesContentWithTabs$lambda$10 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$10(state2);
            Boolean valueOf2 = Boolean.valueOf(UserBattlesContentWithTabs$lambda$10);
            composer.startReplaceGroup(-1224400529);
            boolean changed = composer.changed(rememberLazyListStateWithoutSavedState) | composer.changedInstance(list) | composer.changed(state) | composer.changed(state2) | composer.changedInstance(userDetailsController);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$1$1(rememberLazyListStateWithoutSavedState, list, userDetailsController, state, state2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue2, composer, 0);
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), UserBattleListDimens.INSTANCE.m14237getListHorizontalPaddingD9Ej5fM(), UserBattleListDimens.INSTANCE.m14240getListTopPaddingD9Ej5fM(), UserBattleListDimens.INSTANCE.m14237getListHorizontalPaddingD9Ej5fM(), 0.0f, 8, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(UserBattleListDimens.INSTANCE.m14238getListItemSpacingD9Ej5fM());
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance = composer.changedInstance(list) | composer.changedInstance(userDetailsController) | composer.changed(state3);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$7$lambda$6$lambda$5;
                        invoke$lambda$7$lambda$6$lambda$5 = UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5.invoke$lambda$7$lambda$6$lambda$5(list, userDetailsController, state3, (LazyListScope) obj);
                        return invoke$lambda$7$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default, rememberLazyListStateWithoutSavedState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue3, composer, 24576, 492);
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
    public static final Unit invoke$lambda$9$lambda$8() {
        EventBus.getDefault().post(new OpenCreateBattleDialogEvent(null, null, 3, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5(final List list, final UserDetailsController userDetailsController, State state, LazyListScope LazyColumn) {
        boolean UserBattlesContentWithTabs$lambda$24;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$default$1 userBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(NewUserBattleUiItem newUserBattleUiItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((NewUserBattleUiItem) obj);
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$default$3
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
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$default$4
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
                NewUserBattleUiItem newUserBattleUiItem = (NewUserBattleUiItem) list.get(i);
                composer.startReplaceGroup(1627880303);
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, UserBattleListDimens.INSTANCE.m14239getListItemVerticalMarginD9Ej5fM(), 1, null);
                composer.startReplaceGroup(5004770);
                boolean changedInstance = composer.changedInstance(userDetailsController);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final UserDetailsController userDetailsController2 = userDetailsController;
                    rememberedValue = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            UserDetailsController userDetailsController3 = UserDetailsController.this;
                            if (userDetailsController3 != null) {
                                userDetailsController3.acceptBattle(j);
                            }
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean changedInstance2 = composer.changedInstance(list) | composer.changedInstance(userDetailsController);
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final List list2 = list;
                    final UserDetailsController userDetailsController3 = userDetailsController;
                    rememberedValue2 = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$2$1$1$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            List<NewUserBattleUiItem> list3 = list2;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Long.valueOf(((NewUserBattleUiItem) it.next()).getId()));
                            }
                            ArrayList arrayList2 = arrayList;
                            UserDetailsController userDetailsController4 = userDetailsController3;
                            if (userDetailsController4 != null) {
                                userDetailsController4.openBattlePreview(j, arrayList2);
                            }
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$2$1$1$3$1 rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function2<Integer, Boolean, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5$1$2$1$1$3$1
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
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserBattlesContentWithTabsKt.INSTANCE.m14205getLambda$1021001435$app_release(), 3, null);
        UserBattlesContentWithTabs$lambda$24 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$24(state);
        if (UserBattlesContentWithTabs$lambda$24) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserBattlesContentWithTabsKt.INSTANCE.getLambda$179074688$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
