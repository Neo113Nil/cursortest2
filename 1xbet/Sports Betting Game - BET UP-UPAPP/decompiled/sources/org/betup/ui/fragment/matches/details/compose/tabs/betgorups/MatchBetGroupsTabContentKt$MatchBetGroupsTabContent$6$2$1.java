package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import android.graphics.Rect;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.VarietyBetRestrictionInfoModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;

/* compiled from: MatchBetGroupsTabContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$2$1 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ boolean $compactBattleFlow;
    final /* synthetic */ Set<Long> $currentBetIds;
    final /* synthetic */ int $effectiveSelectedTabIndex;
    final /* synthetic */ Map<Long, Boolean> $expandedStates;
    final /* synthetic */ Map<Integer, Map<Long, Boolean>> $expandedStatesPerTab;
    final /* synthetic */ Function0<List<BetModel>> $getBetCurrentList;
    final /* synthetic */ boolean $isInBattle;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function2<Long, Integer, Unit> $onBetClick;
    final /* synthetic */ Function0<Unit> $onBetSectionReady;
    final /* synthetic */ Function2<Integer, Long, Unit> $onExpandToggle;
    final /* synthetic */ Function1<Rect, Unit> $onFirstBetGroupBounds;
    final /* synthetic */ Function0<Unit> $onTogglePlayerStatsMinStakeInfo;
    final /* synthetic */ List<BetGroupsTabs> $racingSubMatches;
    final /* synthetic */ Set<Long> $selectedBetIds;
    final /* synthetic */ boolean $shouldShowRacingResults;
    final /* synthetic */ boolean $showCustomScrollbar;
    final /* synthetic */ boolean $showPlayerStatsMinStakeInfo;
    final /* synthetic */ Integer $sportId;
    final /* synthetic */ Set<Long> $validatingBetIds;

    /* JADX WARN: Multi-variable type inference failed */
    MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$2$1(List<BetGroupsTabs> list, Set<Long> set, Set<Long> set2, Function2<? super Integer, ? super Long, Unit> function2, Function2<? super Long, ? super Integer, Unit> function22, OddType oddType, Integer num, boolean z, boolean z2, boolean z3, int i, Function1<? super Rect, Unit> function1, Function0<Unit> function0, Function0<? extends List<? extends BetModel>> function02, boolean z4, Function0<Unit> function03, boolean z5, Map<Integer, ? extends Map<Long, Boolean>> map, Map<Long, Boolean> map2, Set<Long> set3) {
        this.$racingSubMatches = list;
        this.$selectedBetIds = set;
        this.$validatingBetIds = set2;
        this.$onExpandToggle = function2;
        this.$onBetClick = function22;
        this.$oddType = oddType;
        this.$sportId = num;
        this.$isInBattle = z;
        this.$compactBattleFlow = z2;
        this.$showCustomScrollbar = z3;
        this.$effectiveSelectedTabIndex = i;
        this.$onFirstBetGroupBounds = function1;
        this.$onBetSectionReady = function0;
        this.$getBetCurrentList = function02;
        this.$showPlayerStatsMinStakeInfo = z4;
        this.$onTogglePlayerStatsMinStakeInfo = function03;
        this.$shouldShowRacingResults = z5;
        this.$expandedStatesPerTab = map;
        this.$expandedStates = map2;
        this.$currentBetIds = set3;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        List MatchBetGroupsTabContent$getBetGroupsForTab;
        Map MatchBetGroupsTabContent$getExpandedStatesForTab;
        int i3;
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1186534971, i2, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContent.<anonymous>.<anonymous>.<anonymous> (MatchBetGroupsTabContent.kt:256)");
        }
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this.$racingSubMatches, i);
        Long paramTId = betGroupsTabs != null ? betGroupsTabs.getParamTId() : null;
        VarietyBetRestrictionInfoModel varietyBetRestriction = betGroupsTabs != null ? betGroupsTabs.getVarietyBetRestriction() : null;
        MatchBetGroupsTabContent$getBetGroupsForTab = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$getBetGroupsForTab(this.$shouldShowRacingResults, this.$racingSubMatches, i);
        MatchBetGroupsTabContent$getExpandedStatesForTab = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$getExpandedStatesForTab(this.$expandedStatesPerTab, this.$expandedStates, this.$shouldShowRacingResults, this.$racingSubMatches, this.$currentBetIds, i);
        Set<Long> set = this.$selectedBetIds;
        Set<Long> set2 = this.$validatingBetIds;
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(this.$onExpandToggle);
        final Function2<Integer, Long, Unit> function2 = this.$onExpandToggle;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$2$1.invoke$lambda$1$lambda$0(Function2.this, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function2 function22 = (Function2) rememberedValue;
        composer.endReplaceGroup();
        Function2<Long, Integer, Unit> function23 = this.$onBetClick;
        OddType oddType = this.$oddType;
        Integer num = this.$sportId;
        boolean z = this.$isInBattle;
        boolean z2 = this.$compactBattleFlow;
        boolean z3 = this.$showCustomScrollbar;
        int i4 = this.$effectiveSelectedTabIndex;
        Function1<Rect, Unit> function1 = i == i4 ? this.$onFirstBetGroupBounds : null;
        if (i == i4) {
            function0 = this.$onBetSectionReady;
            i3 = 5004770;
        } else {
            i3 = 5004770;
            function0 = null;
        }
        composer.startReplaceGroup(i3);
        boolean changed2 = composer.changed(this.$getBetCurrentList);
        final Function0<List<BetModel>> function02 = this.$getBetCurrentList;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Double invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$2$1.invoke$lambda$4$lambda$3(Function0.this, ((Long) obj).longValue());
                    return invoke$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        MatchBetGroupsTabContentKt.BetGroupsPageContent(i, paramTId, varietyBetRestriction, MatchBetGroupsTabContent$getBetGroupsForTab, MatchBetGroupsTabContent$getExpandedStatesForTab, set, set2, function22, function23, oddType, num, z, z2, z3, function1, function0, (Function1) rememberedValue2, this.$showPlayerStatsMinStakeInfo, this.$onTogglePlayerStatsMinStakeInfo, composer, (i2 >> 3) & 14, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, int i, long j) {
        function2.invoke(Integer.valueOf(i), Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double invoke$lambda$4$lambda$3(Function0 function0, long j) {
        Object obj;
        MatchDetailsBetDataModel bet;
        Iterator it = ((Iterable) function0.invoke()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((BetModel) obj).getGrabbedBetId() == j) {
                break;
            }
        }
        BetModel betModel = (BetModel) obj;
        if (betModel == null || (bet = betModel.getBet()) == null) {
            return null;
        }
        return Double.valueOf(bet.getGrabbedCoeficient());
    }
}
