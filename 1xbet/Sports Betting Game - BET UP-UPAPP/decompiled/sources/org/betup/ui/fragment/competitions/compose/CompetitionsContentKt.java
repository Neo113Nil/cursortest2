package org.betup.ui.fragment.competitions.compose;

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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.model.remote.entity.competitions.CompetitionHistoryCountModel;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.fragment.bets.BetsTabBarComposeKt;
import org.betup.ui.fragment.competitions.compose.history.components.CompetitionHistoryFilterKt;
import org.betup.ui.fragment.competitions.compose.history.model.CompetitionHistoryFilterState;
import org.betup.ui.fragment.competitions.compose.history.model.CompetitionHistoryItemUiModel;
import org.betup.ui.fragment.competitions.compose.items.NewCompetitionUiItem;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;

/* compiled from: CompetitionsContent.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002"}, d2 = {"CompetitionsContent", "", "controller", "Lorg/betup/ui/fragment/competitions/controller/CompetitionsController;", "(Lorg/betup/ui/fragment/competitions/controller/CompetitionsController;Landroidx/compose/runtime/Composer;II)V", "app_release", "currentTab", "", "activeCompetitions", "", "Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionUiItem;", "historyCompetitions", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryItemUiModel;", "isActiveLoading", "", "hasMoreActive", "isLoadMoreActive", "hasMoreHistory", "isLoadMoreHistory", "historyCount", "Lorg/betup/model/remote/entity/competitions/CompetitionHistoryCountModel;", "selectedHistoryFilter", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryFilterState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionsContentKt {

    /* compiled from: CompetitionsContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CompetitionHistoryFilterState.values().length];
            try {
                iArr[CompetitionHistoryFilterState.LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CompetitionHistoryFilterState.WON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CompetitionHistoryFilterState.NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionsContent$lambda$33(CompetitionsController competitionsController, int i, int i2, Composer composer, int i3) {
        CompetitionsContent(competitionsController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CompetitionsContent(CompetitionsController competitionsController, Composer composer, final int i, final int i2) {
        CompetitionsController competitionsController2;
        int i3;
        final CompetitionsController competitionsController3;
        Composer startRestartGroup = composer.startRestartGroup(47612416);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            competitionsController2 = competitionsController;
        } else if ((i & 6) == 0) {
            competitionsController2 = competitionsController;
            i3 = (startRestartGroup.changedInstance(competitionsController2) ? 4 : 2) | i;
        } else {
            competitionsController2 = competitionsController;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            final CompetitionsController competitionsController4 = i4 != 0 ? null : competitionsController2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47612416, i3, -1, "org.betup.ui.fragment.competitions.compose.CompetitionsContent (CompetitionsContent.kt:39)");
            }
            Log.d("CompetitionsContent", "Controller received: " + (competitionsController4 != null));
            StateFlow<Integer> currentTab = competitionsController4 != null ? competitionsController4.getCurrentTab() : null;
            startRestartGroup.startReplaceGroup(-1489100016);
            MutableState collectAsState = currentTab == null ? null : SnapshotStateKt.collectAsState(currentTab, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489100726);
            if (collectAsState == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState = (MutableState) rememberedValue;
            }
            State state = collectAsState;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<NewCompetitionUiItem>> activeCompetitions = competitionsController4 != null ? competitionsController4.getActiveCompetitions() : null;
            startRestartGroup.startReplaceGroup(-1489096400);
            MutableState collectAsState2 = activeCompetitions == null ? null : SnapshotStateKt.collectAsState(activeCompetitions, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489097340);
            if (collectAsState2 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState2 = (MutableState) rememberedValue2;
            }
            State state2 = collectAsState2;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<CompetitionHistoryItemUiModel>> historyCompetitions = competitionsController4 != null ? competitionsController4.getHistoryCompetitions() : null;
            startRestartGroup.startReplaceGroup(-1489092144);
            MutableState collectAsState3 = historyCompetitions == null ? null : SnapshotStateKt.collectAsState(historyCompetitions, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489093115);
            if (collectAsState3 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState3 = (MutableState) rememberedValue3;
            }
            State state3 = collectAsState3;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isActiveCompetitionsLoading = competitionsController4 != null ? competitionsController4.isActiveCompetitionsLoading() : null;
            startRestartGroup.startReplaceGroup(-1489087760);
            MutableState collectAsState4 = isActiveCompetitionsLoading == null ? null : SnapshotStateKt.collectAsState(isActiveCompetitionsLoading, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489088985);
            if (collectAsState4 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState4 = (MutableState) rememberedValue4;
            }
            State state4 = collectAsState4;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMoreActiveCompetitions = competitionsController4 != null ? competitionsController4.getHasMoreActiveCompetitions() : null;
            startRestartGroup.startReplaceGroup(-1489083696);
            MutableState collectAsState5 = hasMoreActiveCompetitions == null ? null : SnapshotStateKt.collectAsState(hasMoreActiveCompetitions, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489084860);
            if (collectAsState5 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState5 = (MutableState) rememberedValue5;
            }
            State state5 = collectAsState5;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMoreActiveCompetitions = competitionsController4 != null ? competitionsController4.isLoadMoreActiveCompetitions() : null;
            startRestartGroup.startReplaceGroup(-1489079472);
            MutableState collectAsState6 = isLoadMoreActiveCompetitions == null ? null : SnapshotStateKt.collectAsState(isLoadMoreActiveCompetitions, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489080728);
            if (collectAsState6 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState6 = (MutableState) rememberedValue6;
            }
            State state6 = collectAsState6;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMoreHistoryCompetitions = competitionsController4 != null ? competitionsController4.getHasMoreHistoryCompetitions() : null;
            startRestartGroup.startReplaceGroup(-1489075344);
            MutableState collectAsState7 = hasMoreHistoryCompetitions == null ? null : SnapshotStateKt.collectAsState(hasMoreHistoryCompetitions, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489076539);
            if (collectAsState7 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState7 = (MutableState) rememberedValue7;
            }
            State state7 = collectAsState7;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMoreHistoryCompetitions = competitionsController4 != null ? competitionsController4.isLoadMoreHistoryCompetitions() : null;
            startRestartGroup.startReplaceGroup(-1489071056);
            MutableState collectAsState8 = isLoadMoreHistoryCompetitions == null ? null : SnapshotStateKt.collectAsState(isLoadMoreHistoryCompetitions, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489072343);
            if (collectAsState8 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState8 = (MutableState) rememberedValue8;
            }
            State state8 = collectAsState8;
            startRestartGroup.endReplaceGroup();
            StateFlow<CompetitionHistoryCountModel> historyCount = competitionsController4 != null ? competitionsController4.getHistoryCount() : null;
            startRestartGroup.startReplaceGroup(-1489067440);
            MutableState collectAsState9 = historyCount == null ? null : SnapshotStateKt.collectAsState(historyCount, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1489068201);
            if (collectAsState9 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState9 = (MutableState) rememberedValue9;
            }
            State state9 = collectAsState9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            final MutableState mutableState = (MutableState) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            Integer valueOf = Integer.valueOf(CompetitionsContent$lambda$1(state));
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changed = startRestartGroup.changed(state) | startRestartGroup.changedInstance(competitionsController4);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = (Function2) new CompetitionsContentKt$CompetitionsContent$1$1(competitionsController4, state, null);
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue11, startRestartGroup, 0);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            List listOf = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.competitions_active, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.competitions_history, startRestartGroup, 6)});
            int CompetitionsContent$lambda$1 = CompetitionsContent$lambda$1(state);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(competitionsController4);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function1() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CompetitionsContent$lambda$32$lambda$23$lambda$22;
                        CompetitionsContent$lambda$32$lambda$23$lambda$22 = CompetitionsContentKt.CompetitionsContent$lambda$32$lambda$23$lambda$22(CompetitionsController.this, ((Integer) obj).intValue());
                        return CompetitionsContent$lambda$32$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            startRestartGroup.endReplaceGroup();
            BetsTabBarComposeKt.BetsTabBarCompose(null, CompetitionsContent$lambda$1, (Function1) rememberedValue12, listOf, false, startRestartGroup, 0, 17);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int CompetitionsContent$lambda$12 = CompetitionsContent$lambda$1(state);
            if (CompetitionsContent$lambda$12 != 0) {
                if (CompetitionsContent$lambda$12 == 1) {
                    startRestartGroup.startReplaceGroup(-1221951884);
                    boolean z = !CompetitionsContent$lambda$5(state3).isEmpty();
                    Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(5004770);
                    boolean changedInstance2 = startRestartGroup.changedInstance(competitionsController4);
                    Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = new Function0() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CompetitionsContent$lambda$32$lambda$31$lambda$27$lambda$26;
                                CompetitionsContent$lambda$32$lambda$31$lambda$27$lambda$26 = CompetitionsContentKt.CompetitionsContent$lambda$32$lambda$31$lambda$27$lambda$26(CompetitionsController.this);
                                return CompetitionsContent$lambda$32$lambda$31$lambda$27$lambda$26;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    startRestartGroup.endReplaceGroup();
                    SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default3, false, (Function0) rememberedValue13, z, null, ComposableLambdaKt.rememberComposableLambda(-1905870853, true, new CompetitionsContentKt$CompetitionsContent$2$2$4(state3, state7, state8, competitionsController4), startRestartGroup, 54), startRestartGroup, 196662, 16);
                    float f = 12;
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), 0.0f, 9, null);
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                    Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CompetitionHistoryFilterState CompetitionsContent$lambda$19 = CompetitionsContent$lambda$19(mutableState);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    boolean changedInstance3 = startRestartGroup.changedInstance(competitionsController4);
                    Object rememberedValue14 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new Function1() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit CompetitionsContent$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28;
                                CompetitionsContent$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28 = CompetitionsContentKt.CompetitionsContent$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28(CompetitionsController.this, mutableState, (CompetitionHistoryFilterState) obj);
                                return CompetitionsContent$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    startRestartGroup.endReplaceGroup();
                    CompetitionHistoryFilterKt.CompetitionHistoryFilter(CompetitionsContent$lambda$19, (Function1) rememberedValue14, CompetitionsContent$lambda$5(state3).size(), CompetitionsContent$lambda$17(state9), startRestartGroup, 0, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(-1216270018);
                    startRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                competitionsController3 = competitionsController4;
            } else {
                startRestartGroup.startReplaceGroup(-1227412286);
                boolean CompetitionsContent$lambda$7 = CompetitionsContent$lambda$7(state4);
                boolean z2 = !CompetitionsContent$lambda$3(state2).isEmpty();
                Modifier fillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                boolean changedInstance4 = startRestartGroup.changedInstance(competitionsController4);
                Object rememberedValue15 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new Function0() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CompetitionsContent$lambda$32$lambda$31$lambda$25$lambda$24;
                            CompetitionsContent$lambda$32$lambda$31$lambda$25$lambda$24 = CompetitionsContentKt.CompetitionsContent$lambda$32$lambda$31$lambda$25$lambda$24(CompetitionsController.this);
                            return CompetitionsContent$lambda$32$lambda$31$lambda$25$lambda$24;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                }
                startRestartGroup.endReplaceGroup();
                competitionsController3 = competitionsController4;
                SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default4, CompetitionsContent$lambda$7, (Function0) rememberedValue15, z2, null, ComposableLambdaKt.rememberComposableLambda(1445976196, true, new CompetitionsContentKt$CompetitionsContent$2$2$2(state2, state5, state6, competitionsController3, state4), startRestartGroup, 54), startRestartGroup, 196614, 16);
                startRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
            competitionsController3 = competitionsController2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionsContent$lambda$33;
                    CompetitionsContent$lambda$33 = CompetitionsContentKt.CompetitionsContent$lambda$33(CompetitionsController.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionsContent$lambda$33;
                }
            });
        }
    }

    private static final CompetitionHistoryFilterState CompetitionsContent$lambda$19(MutableState<CompetitionHistoryFilterState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionsContent$lambda$32$lambda$23$lambda$22(CompetitionsController competitionsController, int i) {
        if (competitionsController != null) {
            competitionsController.setCurrentTab(i);
        }
        Log.d("CompetitionsContent", "Tab selected: " + i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionsContent$lambda$32$lambda$31$lambda$25$lambda$24(CompetitionsController competitionsController) {
        if (competitionsController != null) {
            competitionsController.refreshAllCompetitions();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionsContent$lambda$32$lambda$31$lambda$27$lambda$26(CompetitionsController competitionsController) {
        if (competitionsController != null) {
            competitionsController.refreshAllCompetitions();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionsContent$lambda$32$lambda$31$lambda$30$lambda$29$lambda$28(CompetitionsController competitionsController, MutableState mutableState, CompetitionHistoryFilterState competitionHistoryFilterState) {
        int i;
        mutableState.setValue(competitionHistoryFilterState);
        int i2 = competitionHistoryFilterState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[competitionHistoryFilterState.ordinal()];
        if (i2 != -1) {
            i = 1;
            if (i2 != 1) {
                i = 2;
                if (i2 != 2) {
                    i = 3;
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        } else {
            i = 0;
        }
        Log.d("CompetitionsContent", "History filter changed to: " + competitionHistoryFilterState + " (value: " + i + ")");
        if (competitionsController != null) {
            competitionsController.setHistoryFilterState(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CompetitionsContent$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewCompetitionUiItem> CompetitionsContent$lambda$3(State<? extends List<NewCompetitionUiItem>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CompetitionHistoryItemUiModel> CompetitionsContent$lambda$5(State<? extends List<CompetitionHistoryItemUiModel>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CompetitionsContent$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CompetitionsContent$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CompetitionsContent$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CompetitionsContent$lambda$13(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CompetitionsContent$lambda$15(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final CompetitionHistoryCountModel CompetitionsContent$lambda$17(State<CompetitionHistoryCountModel> state) {
        return state.getValue();
    }
}
