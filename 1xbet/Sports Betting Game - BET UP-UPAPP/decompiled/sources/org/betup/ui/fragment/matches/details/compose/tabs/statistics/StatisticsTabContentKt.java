package org.betup.ui.fragment.matches.details.compose.tabs.statistics;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
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
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryItemKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.StatisticsItemKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryCategoryUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchStatisticsUiSingleItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchStatsTabs;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: StatisticsTabContent.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052%\b\u0002\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"StatisticsTabContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "onHistoryMatchClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "matchId", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/matches/details/MatchDetailsController;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "isLoading", "", "statsTabs", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs;", "statistics", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatisticsUiSingleItem;", "hasMoreData", "selectedTab", "", "historyData", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "isHistoryLoading", "hasStatisticsAvailable", "varietyTabs", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController$VarietyStatsTab;", "selectedVarietyIndex"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StatisticsTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsTabContent$lambda$26(Modifier modifier, MatchDetailsController matchDetailsController, Function1 function1, int i, int i2, Composer composer, int i3) {
        StatisticsTabContent(modifier, matchDetailsController, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x042b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatisticsTabContent(Modifier modifier, final MatchDetailsController controller, Function1<? super Long, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super Long, Unit> function12;
        Modifier.Companion companion;
        State collectAsState;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Function1<? super Long, Unit> function13;
        int i4;
        String str;
        State state;
        String str2;
        String str3;
        String str4;
        State state2;
        int i5;
        int StatisticsTabContent$lambda$4;
        Function1<? super Long, Unit> function14;
        int i6;
        int i7;
        final Function1<? super Long, Unit> function15;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(85425625);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                Function1<? super Long, Unit> function16 = i9 == 0 ? null : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(85425625, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContent (StatisticsTabContent.kt:37)");
                }
                State collectAsState2 = SnapshotStateKt.collectAsState(controller.isStatisticsLoading(), null, startRestartGroup, 0, 1);
                collectAsState = SnapshotStateKt.collectAsState(controller.getStatsTabs(), null, startRestartGroup, 0, 1);
                State collectAsState3 = SnapshotStateKt.collectAsState(controller.getStatistics(), null, startRestartGroup, 0, 1);
                SnapshotStateKt.collectAsState(controller.getHasMoreStatistics(), null, startRestartGroup, 0, 1);
                State collectAsState4 = SnapshotStateKt.collectAsState(controller.getSelectedStatsTabs(), null, startRestartGroup, 0, 1);
                State collectAsState5 = SnapshotStateKt.collectAsState(controller.getHistoryData(), null, startRestartGroup, 0, 1);
                State collectAsState6 = SnapshotStateKt.collectAsState(controller.isHistoryLoading(), null, startRestartGroup, 0, 1);
                State collectAsState7 = SnapshotStateKt.collectAsState(controller.getHasStatisticsAvailable(), null, startRestartGroup, 0, 1);
                State collectAsState8 = SnapshotStateKt.collectAsState(controller.getVarietyStatsTabs(), null, startRestartGroup, 0, 1);
                State collectAsState9 = SnapshotStateKt.collectAsState(controller.getSelectedVarietyIndex(), null, startRestartGroup, 0, 1);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Function1<? super Long, Unit> function17 = function16;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                String str5 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                String str6 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                State state3 = collectAsState3;
                String str7 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-162021093);
                int i10 = -1633490746;
                String str8 = "C89@4556L9:Column.kt#2w3rfo";
                if (StatisticsTabContent$lambda$1(collectAsState).isEmpty()) {
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1169748456);
                    int i11 = 0;
                    for (Object obj : StatisticsTabContent$lambda$1(collectAsState)) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final MatchStatsTabs matchStatsTabs = (MatchStatsTabs) obj;
                        String stringResource = StringResources_androidKt.stringResource(matchStatsTabs.getNameRes(), startRestartGroup, 0);
                        boolean z = StatisticsTabContent$lambda$4(collectAsState4) == i11;
                        startRestartGroup.startReplaceGroup(i10);
                        boolean changedInstance = startRestartGroup.changedInstance(controller) | startRestartGroup.changed(matchStatsTabs);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit StatisticsTabContent$lambda$25$lambda$13$lambda$12$lambda$11$lambda$10;
                                    StatisticsTabContent$lambda$25$lambda$13$lambda$12$lambda$11$lambda$10 = StatisticsTabContentKt.StatisticsTabContent$lambda$25$lambda$13$lambda$12$lambda$11$lambda$10(MatchDetailsController.this, matchStatsTabs);
                                    return StatisticsTabContent$lambda$25$lambda$13$lambda$12$lambda$11$lambda$10;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        CommonButtonKt.m12915CommonButtonUPEs2M4(null, z, stringResource, false, false, false, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 3072, 0, 0, 2097073);
                        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
                        state3 = state3;
                        collectAsState5 = collectAsState5;
                        i11 = i12;
                        str7 = str7;
                        function17 = function17;
                        str6 = str6;
                        str5 = str5;
                        str8 = str8;
                        i3 = i3;
                        i10 = -1633490746;
                    }
                    function13 = function17;
                    i4 = i3;
                    str = str7;
                    state = collectAsState5;
                    str2 = str5;
                    str3 = str8;
                    str4 = str6;
                    state2 = state3;
                    i5 = 6;
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                } else {
                    function13 = function17;
                    i4 = i3;
                    str = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    state = collectAsState5;
                    str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    str3 = str8;
                    str4 = str6;
                    state2 = state3;
                    i5 = 6;
                }
                startRestartGroup.endReplaceGroup();
                StatisticsTabContent$lambda$4 = StatisticsTabContent$lambda$4(collectAsState4);
                if (StatisticsTabContent$lambda$4 != 0) {
                    function14 = function13;
                    int i13 = 1;
                    startRestartGroup.startReplaceGroup(-726911647);
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, str4);
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    String str9 = str2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    String str10 = str;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str10);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, str3);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(1103516705);
                    if (StatisticsTabContent$lambda$8(collectAsState8).isEmpty()) {
                        i6 = 6;
                    } else {
                        Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(4)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        int i14 = 6;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                        boolean z2 = false;
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, horizontalScroll$default);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str10);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(406457842);
                        final int i15 = 0;
                        for (Object obj2 : StatisticsTabContent$lambda$8(collectAsState8)) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            String varietyName = ((MatchDetailsController.VarietyStatsTab) obj2).getVarietyName();
                            boolean z3 = StatisticsTabContent$lambda$9(collectAsState9) == i15 ? true : z2;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean changedInstance2 = startRestartGroup.changedInstance(controller) | startRestartGroup.changed(i15);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit StatisticsTabContent$lambda$25$lambda$21$lambda$17$lambda$16$lambda$15$lambda$14;
                                        StatisticsTabContent$lambda$25$lambda$21$lambda$17$lambda$16$lambda$15$lambda$14 = StatisticsTabContentKt.StatisticsTabContent$lambda$25$lambda$21$lambda$17$lambda$16$lambda$15$lambda$14(MatchDetailsController.this, i15);
                                        return StatisticsTabContent$lambda$25$lambda$21$lambda$17$lambda$16$lambda$15$lambda$14;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i17 = i15;
                            CommonButtonKt.m12915CommonButtonUPEs2M4(null, z3, varietyName, true, false, false, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 3072, 0, 0, 2097073);
                            startRestartGroup.startReplaceGroup(406473095);
                            if (i17 < StatisticsTabContent$lambda$8(collectAsState8).size() - 1) {
                                i7 = 6;
                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                            } else {
                                i7 = 6;
                            }
                            startRestartGroup.endReplaceGroup();
                            i14 = i7;
                            i15 = i16;
                            z2 = false;
                        }
                        i6 = i14;
                        i13 = 1;
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    }
                    startRestartGroup.endReplaceGroup();
                    if (!StatisticsTabContent$lambda$7(collectAsState7)) {
                        startRestartGroup.startReplaceGroup(-149448240);
                        LoadingViewKt.NoDataView(null, StringResources_androidKt.stringResource(R.string.no_stats_available, startRestartGroup, i6), startRestartGroup, 0, i13);
                        startRestartGroup.endReplaceGroup();
                    } else if (!StatisticsTabContent$lambda$2(state2).isEmpty()) {
                        startRestartGroup.startReplaceGroup(-149130056);
                        LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                        Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i13, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        final State state4 = state2;
                        boolean changed = startRestartGroup.changed(state4);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    Unit StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19;
                                    StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19 = StatisticsTabContentKt.StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19(State.this, (LazyListScope) obj3);
                                    return StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyColumn(fillMaxSize$default3, rememberLazyListStateWithoutSavedState, null, false, null, null, null, false, null, (Function1) rememberedValue3, startRestartGroup, 6, 508);
                        startRestartGroup.endReplaceGroup();
                    } else if (StatisticsTabContent$lambda$0(collectAsState2)) {
                        startRestartGroup.startReplaceGroup(-148360884);
                        LoadingViewKt.LoadingView(null, null, startRestartGroup, 0, 3);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-148197173);
                        LoadingViewKt.NoDataView(null, StringResources_androidKt.stringResource(R.string.no_stats_available, startRestartGroup, i6), startRestartGroup, 0, i13);
                        startRestartGroup.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else if (StatisticsTabContent$lambda$4 == 1) {
                    startRestartGroup.startReplaceGroup(-723876592);
                    if (StatisticsTabContent$lambda$6(collectAsState6)) {
                        startRestartGroup.startReplaceGroup(-723843453);
                        LoadingViewKt.HistoryLoadingView(null, startRestartGroup, 0, 1);
                        startRestartGroup.endReplaceGroup();
                        function14 = function13;
                    } else if (!StatisticsTabContent$lambda$5(state).isEmpty()) {
                        startRestartGroup.startReplaceGroup(-723656213);
                        Modifier fillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        final State state5 = state;
                        boolean changed2 = startRestartGroup.changed(state5) | ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            function15 = function13;
                            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    Unit StatisticsTabContent$lambda$25$lambda$24$lambda$23;
                                    StatisticsTabContent$lambda$25$lambda$24$lambda$23 = StatisticsTabContentKt.StatisticsTabContent$lambda$25$lambda$24$lambda$23(State.this, function15, (LazyListScope) obj3);
                                    return StatisticsTabContent$lambda$25$lambda$24$lambda$23;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        } else {
                            function15 = function13;
                        }
                        startRestartGroup.endReplaceGroup();
                        function14 = function15;
                        LazyDslKt.LazyColumn(fillMaxSize$default4, null, null, false, null, null, null, false, null, (Function1) rememberedValue4, startRestartGroup, 6, 510);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        function14 = function13;
                        startRestartGroup.startReplaceGroup(-723017489);
                        LoadingViewKt.NoDataView(null, StringResources_androidKt.stringResource(R.string.no_history_available, startRestartGroup, i5), startRestartGroup, 0, 1);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-722763971);
                    startRestartGroup.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                    function14 = function13;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                function14 = function12;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final Function1<? super Long, Unit> function18 = function14;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Unit StatisticsTabContent$lambda$26;
                        StatisticsTabContent$lambda$26 = StatisticsTabContentKt.StatisticsTabContent$lambda$26(Modifier.this, controller, function18, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                        return StatisticsTabContent$lambda$26;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState22 = SnapshotStateKt.collectAsState(controller.isStatisticsLoading(), null, startRestartGroup, 0, 1);
        collectAsState = SnapshotStateKt.collectAsState(controller.getStatsTabs(), null, startRestartGroup, 0, 1);
        State collectAsState32 = SnapshotStateKt.collectAsState(controller.getStatistics(), null, startRestartGroup, 0, 1);
        SnapshotStateKt.collectAsState(controller.getHasMoreStatistics(), null, startRestartGroup, 0, 1);
        State collectAsState42 = SnapshotStateKt.collectAsState(controller.getSelectedStatsTabs(), null, startRestartGroup, 0, 1);
        State collectAsState52 = SnapshotStateKt.collectAsState(controller.getHistoryData(), null, startRestartGroup, 0, 1);
        State collectAsState62 = SnapshotStateKt.collectAsState(controller.isHistoryLoading(), null, startRestartGroup, 0, 1);
        State collectAsState72 = SnapshotStateKt.collectAsState(controller.getHasStatisticsAvailable(), null, startRestartGroup, 0, 1);
        State collectAsState82 = SnapshotStateKt.collectAsState(controller.getVarietyStatsTabs(), null, startRestartGroup, 0, 1);
        State collectAsState92 = SnapshotStateKt.collectAsState(controller.getSelectedVarietyIndex(), null, startRestartGroup, 0, 1);
        Modifier fillMaxSize$default5 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Function1<? super Long, Unit> function172 = function16;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        String str52 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default5);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        String str62 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
        State state32 = collectAsState32;
        String str72 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-162021093);
        int i102 = -1633490746;
        String str82 = "C89@4556L9:Column.kt#2w3rfo";
        if (StatisticsTabContent$lambda$1(collectAsState).isEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        StatisticsTabContent$lambda$4 = StatisticsTabContent$lambda$4(collectAsState42);
        if (StatisticsTabContent$lambda$4 != 0) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsTabContent$lambda$25$lambda$13$lambda$12$lambda$11$lambda$10(MatchDetailsController matchDetailsController, MatchStatsTabs matchStatsTabs) {
        matchDetailsController.setSelectedStatisticsTab(matchStatsTabs);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsTabContent$lambda$25$lambda$21$lambda$17$lambda$16$lambda$15$lambda$14(MatchDetailsController matchDetailsController, int i) {
        matchDetailsController.selectVariety(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19(State state, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<MatchStatisticsUiSingleItem> StatisticsTabContent$lambda$2 = StatisticsTabContent$lambda$2(state);
        final StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19$$inlined$items$default$1 statisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MatchStatisticsUiSingleItem matchStatisticsUiSingleItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((MatchStatisticsUiSingleItem) obj);
            }
        };
        LazyColumn.items(StatisticsTabContent$lambda$2.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(StatisticsTabContent$lambda$2.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$21$lambda$20$lambda$19$$inlined$items$default$4
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
                MatchStatisticsUiSingleItem matchStatisticsUiSingleItem = (MatchStatisticsUiSingleItem) StatisticsTabContent$lambda$2.get(i);
                composer.startReplaceGroup(1864731358);
                StatisticsItemKt.StatisticsItem(matchStatisticsUiSingleItem, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(2)), composer, 48, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticsTabContent$lambda$25$lambda$24$lambda$23(State state, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<MatchHistoryCategoryUiItem> StatisticsTabContent$lambda$5 = StatisticsTabContent$lambda$5(state);
        final StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$24$lambda$23$$inlined$items$default$1 statisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$24$lambda$23$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$24$lambda$23$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MatchHistoryCategoryUiItem matchHistoryCategoryUiItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((MatchHistoryCategoryUiItem) obj);
            }
        };
        LazyColumn.items(StatisticsTabContent$lambda$5.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$24$lambda$23$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(StatisticsTabContent$lambda$5.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt$StatisticsTabContent$lambda$25$lambda$24$lambda$23$$inlined$items$default$4
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
                MatchHistoryCategoryUiItem matchHistoryCategoryUiItem = (MatchHistoryCategoryUiItem) StatisticsTabContent$lambda$5.get(i);
                composer.startReplaceGroup(-1922429343);
                HistoryCategoryItemKt.HistoryCategoryItem(matchHistoryCategoryUiItem, PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(2)), function1, composer, 48, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final boolean StatisticsTabContent$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<MatchStatsTabs> StatisticsTabContent$lambda$1(State<? extends List<? extends MatchStatsTabs>> state) {
        return (List) state.getValue();
    }

    private static final List<MatchStatisticsUiSingleItem> StatisticsTabContent$lambda$2(State<? extends List<MatchStatisticsUiSingleItem>> state) {
        return state.getValue();
    }

    private static final int StatisticsTabContent$lambda$4(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<MatchHistoryCategoryUiItem> StatisticsTabContent$lambda$5(State<? extends List<MatchHistoryCategoryUiItem>> state) {
        return state.getValue();
    }

    private static final boolean StatisticsTabContent$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean StatisticsTabContent$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<MatchDetailsController.VarietyStatsTab> StatisticsTabContent$lambda$8(State<? extends List<MatchDetailsController.VarietyStatsTab>> state) {
        return state.getValue();
    }

    private static final int StatisticsTabContent$lambda$9(State<Integer> state) {
        return state.getValue().intValue();
    }
}
