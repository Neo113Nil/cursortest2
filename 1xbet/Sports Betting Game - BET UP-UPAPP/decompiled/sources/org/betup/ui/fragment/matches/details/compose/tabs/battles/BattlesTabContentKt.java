package org.betup.ui.fragment.matches.details.compose.tabs.battles;

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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattlesLoadingViewKt;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleUiItem;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BattlesTabContent.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"BattlesTabContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/matches/details/MatchDetailsController;Landroidx/compose/runtime/Composer;II)V", "app_release", "isLoading", "", "battles", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleUiItem;", "hasMoreBattles", "canCreateBattle"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattlesTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesTabContent$lambda$13(Modifier modifier, MatchDetailsController matchDetailsController, int i, int i2, Composer composer, int i3) {
        BattlesTabContent(modifier, matchDetailsController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BattlesTabContent(Modifier modifier, final MatchDetailsController controller, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(-2074203342);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2074203342, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContent (BattlesTabContent.kt:44)");
            }
            final State collectAsState = SnapshotStateKt.collectAsState(controller.isBattlesLoading(), null, startRestartGroup, 0, 1);
            final State collectAsState2 = SnapshotStateKt.collectAsState(controller.getAvailableBattles(), null, startRestartGroup, 0, 1);
            final State collectAsState3 = SnapshotStateKt.collectAsState(controller.getHasMoreAvailableBattles(), null, startRestartGroup, 0, 1);
            final State collectAsState4 = SnapshotStateKt.collectAsState(controller.getCanCreateBattle(), null, startRestartGroup, 0, 1);
            final LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(controller);
            BattlesTabContentKt$BattlesTabContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new BattlesTabContentKt$BattlesTabContent$1$1(controller, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier4 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (BattlesTabContent$lambda$0(collectAsState) && BattlesTabContent$lambda$1(collectAsState2).isEmpty()) {
                startRestartGroup.startReplaceGroup(1497143062);
                BattlesLoadingViewKt.BattlesLoadingView(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                modifier2 = modifier4;
            } else if (!BattlesTabContent$lambda$1(collectAsState2).isEmpty()) {
                startRestartGroup.startReplaceGroup(1497461432);
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                startRestartGroup.startReplaceGroup(-1224400529);
                boolean changed = startRestartGroup.changed(collectAsState2) | startRestartGroup.changedInstance(controller) | startRestartGroup.changed(collectAsState4) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BattlesTabContent$lambda$12$lambda$9$lambda$8;
                            BattlesTabContent$lambda$12$lambda$9$lambda$8 = BattlesTabContentKt.BattlesTabContent$lambda$12$lambda$9$lambda$8(State.this, controller, collectAsState4, collectAsState3, collectAsState, rememberLazyListStateWithoutSavedState, (LazyListScope) obj);
                            return BattlesTabContent$lambda$12$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function1);
                    rememberedValue2 = function1;
                }
                startRestartGroup.endReplaceGroup();
                modifier2 = modifier4;
                composer2 = startRestartGroup;
                LazyDslKt.LazyColumn(m1518paddingVpY3zN4$default, rememberLazyListStateWithoutSavedState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue2, composer2, 24582, 492);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                modifier2 = modifier4;
                composer2.startReplaceGroup(1503229354);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                composer2.startReplaceGroup(-1633490746);
                boolean changed2 = composer2.changed(collectAsState4) | composer2.changedInstance(controller);
                Object rememberedValue3 = composer2.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BattlesTabContent$lambda$12$lambda$11$lambda$10;
                            BattlesTabContent$lambda$12$lambda$11$lambda$10 = BattlesTabContentKt.BattlesTabContent$lambda$12$lambda$11$lambda$10(MatchDetailsController.this, collectAsState4, (LazyListScope) obj);
                            return BattlesTabContent$lambda$12$lambda$11$lambda$10;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer2.endReplaceGroup();
                LazyDslKt.LazyColumn(fillMaxSize$default2, rememberLazyListStateWithoutSavedState, null, false, m1397spacedBy0680j_42, null, null, false, null, (Function1) rememberedValue3, composer2, 24582, 492);
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattlesTabContent$lambda$13;
                    BattlesTabContent$lambda$13 = BattlesTabContentKt.BattlesTabContent$lambda$13(Modifier.this, controller, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattlesTabContent$lambda$13;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesTabContent$lambda$12$lambda$9$lambda$8(final State state, final MatchDetailsController matchDetailsController, State state2, final State state3, final State state4, final LazyListState lazyListState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BattlesTabContentKt.INSTANCE.getLambda$369941278$app_release(), 3, null);
        final List<BattleUiItem> BattlesTabContent$lambda$1 = BattlesTabContent$lambda$1(state);
        final BattlesTabContentKt$BattlesTabContent$lambda$12$lambda$9$lambda$8$$inlined$items$default$1 battlesTabContentKt$BattlesTabContent$lambda$12$lambda$9$lambda$8$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$lambda$12$lambda$9$lambda$8$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BattleUiItem battleUiItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((BattleUiItem) obj);
            }
        };
        LazyColumn.items(BattlesTabContent$lambda$1.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$lambda$12$lambda$9$lambda$8$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(BattlesTabContent$lambda$1.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$lambda$12$lambda$9$lambda$8$$inlined$items$default$4
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
                BattleUiItem battleUiItem = (BattleUiItem) BattlesTabContent$lambda$1.get(i);
                composer.startReplaceGroup(-88515195);
                composer.startReplaceGroup(5004770);
                boolean changedInstance = composer.changedInstance(matchDetailsController);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MatchDetailsController matchDetailsController2 = matchDetailsController;
                    rememberedValue = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$2$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            MatchDetailsController.this.acceptBattle(j);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(state) | composer.changedInstance(matchDetailsController);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final MatchDetailsController matchDetailsController3 = matchDetailsController;
                    final State state5 = state;
                    rememberedValue2 = (Function1) new Function1<Long, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$2$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            List BattlesTabContent$lambda$12;
                            BattlesTabContent$lambda$12 = BattlesTabContentKt.BattlesTabContent$lambda$1(state5);
                            List list = BattlesTabContent$lambda$12;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Long.valueOf(((BattleUiItem) it.next()).getId()));
                            }
                            MatchDetailsController.this.openBattlePreview(j, arrayList);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                BattleMatchDetItemKt.BattleMatchDetItem(null, battleUiItem, function1, (Function1) rememberedValue2, false, false, composer, 0, 49);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (BattlesTabContent$lambda$3(state2)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1425877625, true, new BattlesTabContentKt$BattlesTabContent$2$1$1$2(matchDetailsController)), 3, null);
        }
        if (BattlesTabContent$lambda$2(state3) && !BattlesTabContent$lambda$0(state4)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(874196208, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt$BattlesTabContent$2$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    boolean BattlesTabContent$lambda$2;
                    boolean BattlesTabContent$lambda$0;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(874196208, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BattlesTabContent.kt:154)");
                    }
                    LazyListState lazyListState2 = LazyListState.this;
                    BattlesTabContent$lambda$2 = BattlesTabContentKt.BattlesTabContent$lambda$2(state3);
                    Boolean valueOf = Boolean.valueOf(BattlesTabContent$lambda$2);
                    BattlesTabContent$lambda$0 = BattlesTabContentKt.BattlesTabContent$lambda$0(state4);
                    Boolean valueOf2 = Boolean.valueOf(BattlesTabContent$lambda$0);
                    composer.startReplaceGroup(-1224400529);
                    boolean changed = composer.changed(LazyListState.this) | composer.changed(state) | composer.changed(state4) | composer.changed(state3) | composer.changedInstance(matchDetailsController);
                    LazyListState lazyListState3 = LazyListState.this;
                    MatchDetailsController matchDetailsController2 = matchDetailsController;
                    State<List<BattleUiItem>> state5 = state;
                    State<Boolean> state6 = state4;
                    State<Boolean> state7 = state3;
                    BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1 rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new BattlesTabContentKt$BattlesTabContent$2$1$1$3$1$1(lazyListState3, matchDetailsController2, state5, state6, state7, null);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    EffectsKt.LaunchedEffect(lazyListState2, valueOf, valueOf2, (Function2) rememberedValue, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (BattlesTabContent$lambda$0(state4) && !BattlesTabContent$lambda$1(state).isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BattlesTabContentKt.INSTANCE.getLambda$1971514097$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesTabContent$lambda$12$lambda$11$lambda$10(MatchDetailsController matchDetailsController, State state, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1921726654, true, new BattlesTabContentKt$BattlesTabContent$2$2$1$1(matchDetailsController, state)), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BattlesTabContent$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<BattleUiItem> BattlesTabContent$lambda$1(State<? extends List<BattleUiItem>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BattlesTabContent$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BattlesTabContent$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
