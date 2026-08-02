package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.entity.matches.VarietyBetRestrictionInfoModel;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetInfoModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionRuleModel;
import org.betup.ui.common.compose.CommonButtonMatchBetKt;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryCategoryUiItem;
import org.betup.utils.VarietyBetRestrictions;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: MatchBetGroupsTabContent.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u001aë\u0004\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u00182\"\b\u0002\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00182\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2&\b\u0002\u0010\u001c\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\u0004\u0012\u00020\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050!2\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010!2\u0018\b\u0002\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010!2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u00192\b\b\u0002\u00100\u001a\u00020\u000f2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010!2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00052\b\b\u0002\u00104\u001a\u00020\u00192#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00052%\b\u0002\u00109\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0007¢\u0006\u0002\u0010;\u001aÉ\u0002\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010*\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010!2\u0018\b\u0002\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010\f2\b\b\u0002\u0010C\u001a\u00020\u00192\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010!H\u0003¢\u0006\u0002\u0010E\u001a\r\u0010F\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010G¨\u0006H"}, d2 = {"MatchBetGroupsTabContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "subMatches", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "selectedTabIndex", "", "betGroups", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "onTabSelected", "Lkotlin/Function1;", "onBetClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "groupId", "betIndex", "selectedBetIds", "", "validatingBetIds", "expandedStates", "", "", "expandedStatesPerTab", "onExpandToggle", "onExpandAllToggle", "Lkotlin/Function3;", "oddType", "Lorg/betup/model/local/entity/OddType;", "getBetCurrentList", "Lkotlin/Function0;", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "showCustomScrollbar", "isInBattle", "compactBattleFlow", "onTestUnlockClick", "onFirstBetGroupBounds", "Landroid/graphics/Rect;", "onBetSectionReady", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "resultRaw", "", "matchState", "hideExpandButton", "showPlayerStatsMinStakeInfo", "playerStatsMinStakeBetcoins", "onTogglePlayerStatsMinStakeInfo", "myPlacedBets", "Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetInfoModel;", "isMyPlacedBetsLoading", "onMyPlacedBetClick", "betlistId", "finishedMatchUpcomingCategories", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "onUpcomingMatchClick", "matchId", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZZJLkotlin/jvm/functions/Function0;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V", "BetGroupsPageContent", "tabIndex", "varietyParamTId", "varietyBetRestriction", "Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;", "getDisplayCoefficientForBet", "", "showVarietyMinStakeInfo", "onToggleVarietyMinStakeInfo", "(ILjava/lang/Long;Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lorg/betup/model/local/entity/OddType;Ljava/lang/Integer;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "BetGroupsTabContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchBetGroupsTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsPageContent$lambda$37(int i, Long l, VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel, List list, Map map, Set set, Set set2, Function2 function2, Function2 function22, OddType oddType, Integer num, boolean z, boolean z2, boolean z3, Function1 function1, Function0 function0, Function1 function12, boolean z4, Function0 function02, int i2, int i3, int i4, Composer composer, int i5) {
        BetGroupsPageContent(i, l, varietyBetRestrictionInfoModel, list, map, set, set2, function2, function22, oddType, num, z, z2, z3, function1, function0, function12, z4, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsTabContentPreview$lambda$38(int i, Composer composer, int i2) {
        BetGroupsTabContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MatchBetGroupsTabContent$lambda$10$lambda$9(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchBetGroupsTabContent$lambda$24(Modifier modifier, List list, int i, List list2, Function1 function1, Function2 function2, Set set, Set set2, Map map, Map map2, Function2 function22, Function3 function3, OddType oddType, Function0 function0, boolean z, boolean z2, boolean z3, Function0 function02, Function1 function12, Function0 function03, Integer num, String str, Integer num2, boolean z4, boolean z5, long j, Function0 function04, List list3, boolean z6, Function1 function13, List list4, Function1 function14, int i2, int i3, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        MatchBetGroupsTabContent(modifier, list, i, list2, function1, function2, set, set2, map, map2, function22, function3, oddType, function0, z, z2, z3, function02, function12, function03, num, str, num2, z4, z5, j, function04, list3, z6, function13, list4, function14, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6, i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchBetGroupsTabContent$lambda$1$lambda$0(int i, long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchBetGroupsTabContent$lambda$3$lambda$2(int i, boolean z, List list) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchBetGroupsTabContent$lambda$5$lambda$4(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0551 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0598 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0739 A[LOOP:0: B:225:0x0733->B:227:0x0739, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchBetGroupsTabContent(Modifier modifier, final List<BetGroupsTabs> subMatches, final int i, final List<MatchVarietyGroupBetsModel> betGroups, final Function1<? super Integer, Unit> onTabSelected, final Function2<? super Long, ? super Integer, Unit> onBetClick, Set<Long> set, Set<Long> set2, Map<Long, Boolean> map, Map<Integer, ? extends Map<Long, Boolean>> map2, Function2<? super Integer, ? super Long, Unit> function2, Function3<? super Integer, ? super Boolean, ? super List<Long>, Unit> function3, OddType oddType, final Function0<? extends List<? extends BetModel>> getBetCurrentList, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function1<? super Rect, Unit> function1, Function0<Unit> function02, Integer num, String str, Integer num2, boolean z4, boolean z5, long j, Function0<Unit> function03, List<MatchPlacedBetInfoModel> list, boolean z6, Function1<? super Long, Unit> function12, List<MatchHistoryCategoryUiItem> list2, Function1<? super Long, Unit> function13, Composer composer, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Function2<? super Integer, ? super Long, Unit> function22;
        Function3<? super Integer, ? super Boolean, ? super List<Long>, Unit> function32;
        boolean z7;
        int i35;
        Function1<? super Long, Unit> function14;
        boolean z8;
        List<BetGroupsTabs> list3;
        boolean z9;
        List<BetGroupsTabs> list4;
        Iterator<T> it;
        boolean z10;
        boolean z11;
        List<BetGroupsTabs> list5;
        int i36;
        boolean changed;
        Object rememberedValue;
        final PagerState rememberPagerStateWithoutSavedState;
        boolean changed2;
        MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1 rememberedValue2;
        boolean changed3;
        MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1 rememberedValue3;
        Iterator<T> it2;
        List<MatchVarietyGroupBetsModel> list6;
        Iterator it3;
        boolean z12;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        float m7774constructorimpl3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final List<BetGroupsTabs> list7;
        final int i37;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        final boolean z13;
        final Function1<? super Rect, Unit> function15;
        final Function0<Unit> function04;
        final Integer num3;
        final Integer num4;
        final String str2;
        final List<MatchPlacedBetInfoModel> list8;
        final Function1<? super Long, Unit> function16;
        final Set<Long> set3;
        final Map<Integer, ? extends Map<Long, Boolean>> map3;
        final Function3<? super Integer, ? super Boolean, ? super List<Long>, Unit> function33;
        final OddType oddType2;
        final boolean z14;
        final Function0<Unit> function05;
        final boolean z15;
        final boolean z16;
        final boolean z17;
        final boolean z18;
        final Function2<? super Integer, ? super Long, Unit> function23;
        final Set<Long> set4;
        final Map<Long, Boolean> map4;
        final Modifier modifier2;
        final Function1<? super Long, Unit> function17;
        final List<MatchHistoryCategoryUiItem> list9;
        final long j2;
        final Function0<Unit> function06;
        String str3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(subMatches, "subMatches");
        Intrinsics.checkNotNullParameter(betGroups, "betGroups");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(getBetCurrentList, "getBetCurrentList");
        Composer startRestartGroup = composer.startRestartGroup(114873);
        int i38 = i6 & 1;
        if (i38 != 0) {
            i8 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i8 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i8 = i2;
        }
        if ((i6 & 2) != 0) {
            i8 |= 48;
        } else if ((i2 & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(subMatches) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= startRestartGroup.changed(i) ? 256 : 128;
            if ((i6 & 16) == 0) {
                i8 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i8 |= startRestartGroup.changedInstance(onTabSelected) ? 16384 : 8192;
            }
            if ((i6 & 32) == 0) {
                i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i8 |= startRestartGroup.changedInstance(onBetClick) ? 131072 : 65536;
            }
            i9 = i6 & 64;
            if (i9 == 0) {
                i8 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i8 |= startRestartGroup.changedInstance(set) ? 1048576 : 524288;
            }
            i10 = i6 & 128;
            if (i10 == 0) {
                i8 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i8 |= startRestartGroup.changedInstance(set2) ? 8388608 : 4194304;
            }
            i11 = i6 & 256;
            if (i11 == 0) {
                i8 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i8 |= startRestartGroup.changedInstance(map) ? 67108864 : 33554432;
            }
            i12 = i6 & 512;
            if (i12 == 0) {
                i8 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i8 |= startRestartGroup.changedInstance(map2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            i13 = i6 & 1024;
            if (i13 == 0) {
                i14 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i14 = i3 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
            } else {
                i14 = i3;
            }
            i15 = i6 & 2048;
            if (i15 == 0) {
                i14 |= 48;
            } else if ((i3 & 48) == 0) {
                i14 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            int i39 = i14;
            i16 = i6 & 4096;
            if (i16 == 0) {
                i39 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i39 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 256 : 128;
            }
            if ((i6 & 8192) == 0) {
                i39 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i39 |= startRestartGroup.changedInstance(getBetCurrentList) ? 2048 : 1024;
            }
            i17 = i6 & 16384;
            if (i17 == 0) {
                i39 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i39 |= startRestartGroup.changed(z) ? 16384 : 8192;
                i18 = i6 & 32768;
                if (i18 != 0) {
                    i39 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i39 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                i19 = i6 & 65536;
                if (i19 != 0) {
                    i39 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i39 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                i20 = i6 & 262144;
                if (i20 != 0) {
                    i39 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i39 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                }
                i21 = i6 & 524288;
                if (i21 != 0) {
                    i39 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    i39 |= startRestartGroup.changedInstance(function02) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                }
                i22 = i6 & 1048576;
                if (i22 != 0) {
                    i23 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    i23 = i4 | (startRestartGroup.changed(num) ? 4 : 2);
                } else {
                    i23 = i4;
                }
                i24 = i6 & 2097152;
                if (i24 != 0) {
                    i23 |= 48;
                } else if ((i4 & 48) == 0) {
                    i23 |= startRestartGroup.changed(str) ? 32 : 16;
                }
                int i40 = i23;
                i25 = i6 & 4194304;
                if (i25 != 0) {
                    i40 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i40 |= startRestartGroup.changed(num2) ? 256 : 128;
                    i26 = i6 & 8388608;
                    if (i26 == 0) {
                        i40 |= 3072;
                    } else if ((i4 & 3072) == 0) {
                        i40 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                        i27 = i6 & 16777216;
                        if (i27 != 0) {
                            i40 |= 24576;
                        } else if ((i4 & 24576) == 0) {
                            i40 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                            i28 = i6 & 67108864;
                            if (i28 == 0) {
                                i40 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i40 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
                            }
                            i29 = i6 & C.BUFFER_FLAG_FIRST_SAMPLE;
                            if (i29 == 0) {
                                i40 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i40 |= startRestartGroup.changedInstance(list) ? 8388608 : 4194304;
                            }
                            i30 = i6 & 268435456;
                            if (i30 == 0) {
                                i40 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i40 |= startRestartGroup.changed(z6) ? 67108864 : 33554432;
                            }
                            i31 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                            if (i31 == 0) {
                                i40 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                i40 |= startRestartGroup.changedInstance(function12) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            }
                            i32 = i6 & 1073741824;
                            if (i32 == 0) {
                                i33 = i5 | 6;
                            } else if ((i5 & 6) == 0) {
                                i33 = i5 | (startRestartGroup.changedInstance(list2) ? 4 : 2);
                            } else {
                                i33 = i5;
                            }
                            i34 = i7 & 1;
                            if (i34 == 0) {
                                i33 |= 48;
                            } else if ((i5 & 48) == 0) {
                                i33 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
                            }
                            if ((i8 & 306782355) == 306782354 || (302589075 & i39) != 302589074 || (306717843 & i40) != 306717842 || (i33 & 19) != 18 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i38 == 0 ? Modifier.INSTANCE : modifier;
                                Set<Long> emptySet = i9 == 0 ? SetsKt.emptySet() : set;
                                Set<Long> emptySet2 = i10 == 0 ? SetsKt.emptySet() : set2;
                                Map<Long, Boolean> emptyMap = i11 == 0 ? MapsKt.emptyMap() : map;
                                Map<Integer, ? extends Map<Long, Boolean>> map5 = i12 == 0 ? null : map2;
                                if (i13 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit MatchBetGroupsTabContent$lambda$1$lambda$0;
                                                MatchBetGroupsTabContent$lambda$1$lambda$0 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$1$lambda$0(((Integer) obj).intValue(), ((Long) obj2).longValue());
                                                return MatchBetGroupsTabContent$lambda$1$lambda$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    function22 = (Function2) rememberedValue4;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    function22 = function2;
                                }
                                if (i15 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function3() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                Unit MatchBetGroupsTabContent$lambda$3$lambda$2;
                                                MatchBetGroupsTabContent$lambda$3$lambda$2 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$3$lambda$2(((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (List) obj3);
                                                return MatchBetGroupsTabContent$lambda$3$lambda$2;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    function32 = (Function3) rememberedValue5;
                                } else {
                                    function32 = function3;
                                }
                                OddType oddType3 = i16 == 0 ? null : oddType;
                                boolean z19 = i17 == 0 ? false : z;
                                boolean z20 = i18 == 0 ? true : z2;
                                if (i19 == 0) {
                                    i35 = 131072;
                                    z7 = false;
                                } else {
                                    z7 = z3;
                                    i35 = 131072;
                                }
                                Function0<Unit> function07 = (i6 & i35) == 0 ? null : function0;
                                Function1<? super Rect, Unit> function18 = i20 == 0 ? null : function1;
                                Function0<Unit> function08 = i21 == 0 ? null : function02;
                                Integer num5 = i22 == 0 ? null : num;
                                String str4 = i24 == 0 ? null : str;
                                Integer num6 = i25 == 0 ? null : num2;
                                boolean z21 = i26 == 0 ? false : z4;
                                boolean z22 = i27 == 0 ? false : z5;
                                long j3 = (33554432 & i6) == 0 ? 0L : j;
                                Function0<Unit> function09 = i28 == 0 ? null : function03;
                                List<MatchPlacedBetInfoModel> emptyList = i29 == 0 ? CollectionsKt.emptyList() : list;
                                boolean z23 = i30 == 0 ? false : z6;
                                if (i31 == 0) {
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit MatchBetGroupsTabContent$lambda$5$lambda$4;
                                                MatchBetGroupsTabContent$lambda$5$lambda$4 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$5$lambda$4(((Long) obj).longValue());
                                                return MatchBetGroupsTabContent$lambda$5$lambda$4;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    function14 = (Function1) rememberedValue6;
                                } else {
                                    function14 = function12;
                                }
                                List<MatchHistoryCategoryUiItem> emptyList2 = i32 == 0 ? CollectionsKt.emptyList() : list2;
                                Function1<? super Long, Unit> function19 = i34 == 0 ? null : function13;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(114873, i8, i39, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContent (MatchBetGroupsTabContent.kt:80)");
                                }
                                z8 = (num5 != null && num5.intValue() == 64) || (num5 != null && num5.intValue() == 65);
                                boolean z24 = num6 != null && num6.intValue() == 3;
                                if (z8 || !z24 || (str3 = str4) == null || StringsKt.isBlank(str3)) {
                                    list3 = subMatches;
                                    z9 = false;
                                } else {
                                    list3 = subMatches;
                                    z9 = true;
                                }
                                list4 = list3;
                                if ((list4 instanceof Collection) || !list4.isEmpty()) {
                                    it = list4.iterator();
                                    while (it.hasNext()) {
                                        if (!((BetGroupsTabs) it.next()).getBets().isEmpty()) {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                }
                                z10 = false;
                                z11 = (z24 || z9 || z10) ? false : true;
                                startRestartGroup.startReplaceGroup(110462632);
                                if (z9) {
                                    list5 = list3;
                                } else {
                                    String stringResource = StringResources_androidKt.stringResource(R.string.results, startRestartGroup, 6);
                                    List emptyList3 = CollectionsKt.emptyList();
                                    List emptyList4 = CollectionsKt.emptyList();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit unit;
                                                unit = Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    list5 = CollectionsKt.listOf(new BetGroupsTabs(stringResource, emptyList3, emptyList4, (Function0) rememberedValue7, 0, true, 0, 0, null, null, null, 1984, null));
                                }
                                startRestartGroup.endReplaceGroup();
                                i36 = !z9 ? 0 : i;
                                final int coerceAtLeast = RangesKt.coerceAtLeast(list5.size(), 1);
                                boolean z25 = z19;
                                int coerceIn = RangesKt.coerceIn(i36, 0, coerceAtLeast - 1);
                                startRestartGroup.startReplaceGroup(5004770);
                                changed = startRestartGroup.changed(coerceAtLeast);
                                Function2<? super Integer, ? super Long, Unit> function24 = function22;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int MatchBetGroupsTabContent$lambda$10$lambda$9;
                                            MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast);
                                            return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
                                Integer valueOf = Integer.valueOf(i36);
                                Boolean valueOf2 = Boolean.valueOf(z11);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
                                Set<Long> set5 = emptySet2;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, startRestartGroup, 0);
                                Integer valueOf3 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                                Boolean valueOf4 = Boolean.valueOf(z11);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                int i41 = i8 & 57344;
                                changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i41 != 16384);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf3, valueOf4, (Function2) rememberedValue3, startRestartGroup, 0);
                                List<? extends BetModel> invoke = getBetCurrentList.invoke();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke, 10));
                                it2 = invoke.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(Long.valueOf(((BetModel) it2.next()).getGrabbedBetId()));
                                }
                                Set set6 = CollectionsKt.toSet(arrayList);
                                List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
                                Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set6, rememberPagerStateWithoutSavedState.getCurrentPage());
                                list6 = MatchBetGroupsTabContent$getBetGroupsForTab;
                                if ((list6 instanceof Collection) || !list6.isEmpty()) {
                                    it3 = list6.iterator();
                                    while (it3.hasNext()) {
                                        Iterator it4 = it3;
                                        if (!Intrinsics.areEqual((Object) MatchBetGroupsTabContent$getExpandedStatesForTab.get(Long.valueOf(((MatchVarietyGroupBetsModel) it3.next()).getGroup().getId())), (Object) true)) {
                                            z12 = false;
                                            break;
                                        }
                                        it3 = it4;
                                    }
                                }
                                z12 = true;
                                if (!z7) {
                                    m7774constructorimpl = BattleFlowDimens.INSTANCE.m13156getBetTabRowPaddingStartD9Ej5fM();
                                } else {
                                    m7774constructorimpl = Dp.m7774constructorimpl(12);
                                }
                                if (!z7) {
                                    m7774constructorimpl2 = BattleFlowDimens.INSTANCE.m13155getBetTabIconD9Ej5fM();
                                } else {
                                    m7774constructorimpl2 = Dp.m7774constructorimpl(24);
                                }
                                if (!z7) {
                                    m7774constructorimpl3 = BattleFlowDimens.INSTANCE.m13157getBetTabSpacerD9Ej5fM();
                                } else {
                                    m7774constructorimpl3 = Dp.m7774constructorimpl(8);
                                }
                                Map<Long, Boolean> map6 = emptyMap;
                                final float f = m7774constructorimpl3;
                                int i42 = i36;
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                Modifier modifier3 = companion;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                int i43 = i39;
                                List<BetGroupsTabs> list10 = list5;
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
                                startRestartGroup.startReplaceGroup(-832081566);
                                if (z11) {
                                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), m7774constructorimpl, 0.0f, 0.0f, 0.0f, 14, null);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    list7 = list10;
                                    i37 = i42;
                                    boolean changed4 = startRestartGroup.changed(z9) | startRestartGroup.changedInstance(list3) | ((i40 & 7168) == 2048) | startRestartGroup.changed(z12) | startRestartGroup.changed(m7774constructorimpl2) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changedInstance(list7) | ((i43 & 112) == 32) | startRestartGroup.changed(f) | startRestartGroup.changed(i37) | ((i43 & 458752) == 131072) | (i41 == 16384);
                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        final boolean z26 = z9;
                                        final boolean z27 = z21;
                                        final boolean z28 = z12;
                                        final float f2 = m7774constructorimpl2;
                                        final Function3<? super Integer, ? super Boolean, ? super List<Long>, Unit> function34 = function32;
                                        final boolean z29 = z20;
                                        rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit MatchBetGroupsTabContent$lambda$23$lambda$21$lambda$20;
                                                MatchBetGroupsTabContent$lambda$23$lambda$21$lambda$20 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$23$lambda$21$lambda$20(z26, subMatches, z27, list7, z28, f2, rememberPagerStateWithoutSavedState, function34, f, i37, z29, onTabSelected, (LazyListScope) obj);
                                                return MatchBetGroupsTabContent$lambda$23$lambda$21$lambda$20;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    LazyDslKt.LazyRow(m1520paddingqDBjuR0$default, null, null, false, null, centerVertically, null, false, null, (Function1) rememberedValue8, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 478);
                                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, f), startRestartGroup, 0);
                                } else {
                                    list7 = list10;
                                    i37 = i42;
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor2);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (!z9) {
                                    startRestartGroup.startReplaceGroup(1760815041);
                                    RacingResultsListKt.RacingResultsList(str4, num5, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, ((i40 << 3) & 112) | ((i40 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                    startRestartGroup.endReplaceGroup();
                                } else if (z11) {
                                    startRestartGroup.startReplaceGroup(1761094227);
                                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    int i44 = i40 >> 21;
                                    int i45 = ((i40 >> 18) & 7168) | (i44 & 112) | (i44 & 14) | 1572864 | (i43 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                                    int i46 = i33 << 12;
                                    MatchFinishedMyBetsContentKt.MatchFinishedMyBetsContent(emptyList, z23, oddType3, function14, emptyList2, function19, fillMaxSize$default2, startRestartGroup, i45 | (57344 & i46) | (i46 & 458752), 0);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(1761657590);
                                    composer2 = startRestartGroup;
                                    PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1186534971, true, new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$2$1(list7, emptySet, set5, function24, onBetClick, oddType3, num5, z20, z7, z25, i37, function18, function08, getBetCurrentList, z22, function09, z9, map5, map6, set6), composer2, 54), composer2, 48, 24576, 16380);
                                    composer2.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z13 = z20;
                                    function15 = function18;
                                    function04 = function08;
                                    num3 = num5;
                                    num4 = num6;
                                    str2 = str4;
                                    list8 = emptyList;
                                    function16 = function19;
                                    set3 = emptySet;
                                    map3 = map5;
                                    function33 = function32;
                                    oddType2 = oddType3;
                                    z14 = z7;
                                    function05 = function07;
                                    z15 = z21;
                                    z16 = z22;
                                    z17 = z23;
                                    z18 = z25;
                                    function23 = function24;
                                    set4 = set5;
                                    map4 = map6;
                                    modifier2 = modifier3;
                                    function17 = function14;
                                    list9 = emptyList2;
                                    j2 = j3;
                                    function06 = function09;
                                }
                                composer2 = startRestartGroup;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z13 = z20;
                                function15 = function18;
                                function04 = function08;
                                num3 = num5;
                                num4 = num6;
                                str2 = str4;
                                list8 = emptyList;
                                function16 = function19;
                                set3 = emptySet;
                                map3 = map5;
                                function33 = function32;
                                oddType2 = oddType3;
                                z14 = z7;
                                function05 = function07;
                                z15 = z21;
                                z16 = z22;
                                z17 = z23;
                                z18 = z25;
                                function23 = function24;
                                set4 = set5;
                                map4 = map6;
                                modifier2 = modifier3;
                                function17 = function14;
                                list9 = emptyList2;
                                j2 = j3;
                                function06 = function09;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                set3 = set;
                                set4 = set2;
                                map4 = map;
                                map3 = map2;
                                function23 = function2;
                                oddType2 = oddType;
                                z18 = z;
                                z13 = z2;
                                z14 = z3;
                                function05 = function0;
                                function15 = function1;
                                function04 = function02;
                                num3 = num;
                                str2 = str;
                                num4 = num2;
                                z15 = z4;
                                z16 = z5;
                                j2 = j;
                                function06 = function03;
                                list8 = list;
                                z17 = z6;
                                function17 = function12;
                                list9 = list2;
                                function16 = function13;
                                composer2 = startRestartGroup;
                                function33 = function3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit MatchBetGroupsTabContent$lambda$24;
                                        MatchBetGroupsTabContent$lambda$24 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$24(Modifier.this, subMatches, i, betGroups, onTabSelected, onBetClick, set3, set4, map4, map3, function23, function33, oddType2, getBetCurrentList, z18, z13, z14, function05, function15, function04, num3, str2, num4, z15, z16, j2, function06, list8, z17, function17, list9, function16, i2, i3, i4, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                        return MatchBetGroupsTabContent$lambda$24;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i28 = i6 & 67108864;
                        if (i28 == 0) {
                        }
                        i29 = i6 & C.BUFFER_FLAG_FIRST_SAMPLE;
                        if (i29 == 0) {
                        }
                        i30 = i6 & 268435456;
                        if (i30 == 0) {
                        }
                        i31 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                        if (i31 == 0) {
                        }
                        i32 = i6 & 1073741824;
                        if (i32 == 0) {
                        }
                        i34 = i7 & 1;
                        if (i34 == 0) {
                        }
                        if ((i8 & 306782355) == 306782354) {
                        }
                        if (i38 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i6 & i35) == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        if ((33554432 & i6) == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if (i29 == 0) {
                        }
                        if (i30 == 0) {
                        }
                        if (i31 == 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i34 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (num5 != null) {
                            if (num6 != null) {
                                if (z8) {
                                }
                                list3 = subMatches;
                                z9 = false;
                                list4 = list3;
                                if (list4 instanceof Collection) {
                                }
                                it = list4.iterator();
                                while (it.hasNext()) {
                                }
                                z10 = false;
                                if (z24) {
                                }
                                startRestartGroup.startReplaceGroup(110462632);
                                if (z9) {
                                }
                                startRestartGroup.endReplaceGroup();
                                if (!z9) {
                                }
                                final int coerceAtLeast2 = RangesKt.coerceAtLeast(list5.size(), 1);
                                boolean z252 = z19;
                                int coerceIn2 = RangesKt.coerceIn(i36, 0, coerceAtLeast2 - 1);
                                startRestartGroup.startReplaceGroup(5004770);
                                changed = startRestartGroup.changed(coerceAtLeast2);
                                Function2<? super Integer, ? super Long, Unit> function242 = function22;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int MatchBetGroupsTabContent$lambda$10$lambda$9;
                                        MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast2);
                                        return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceGroup();
                                rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn2, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
                                Integer valueOf5 = Integer.valueOf(i36);
                                Boolean valueOf22 = Boolean.valueOf(z11);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
                                Set<Long> set52 = emptySet2;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf5, valueOf22, (Function2) rememberedValue2, startRestartGroup, 0);
                                Integer valueOf32 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                                Boolean valueOf42 = Boolean.valueOf(z11);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                int i412 = i8 & 57344;
                                changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i412 != 16384);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3) {
                                }
                                rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf32, valueOf42, (Function2) rememberedValue3, startRestartGroup, 0);
                                List<? extends BetModel> invoke2 = getBetCurrentList.invoke();
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke2, 10));
                                it2 = invoke2.iterator();
                                while (it2.hasNext()) {
                                }
                                Set set62 = CollectionsKt.toSet(arrayList2);
                                List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab2 = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
                                Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab2 = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set62, rememberPagerStateWithoutSavedState.getCurrentPage());
                                list6 = MatchBetGroupsTabContent$getBetGroupsForTab2;
                                if (list6 instanceof Collection) {
                                }
                                it3 = list6.iterator();
                                while (it3.hasNext()) {
                                }
                                z12 = true;
                                if (!z7) {
                                }
                                if (!z7) {
                                }
                                if (!z7) {
                                }
                                Map<Long, Boolean> map62 = emptyMap;
                                final float f3 = m7774constructorimpl3;
                                int i422 = i36;
                                Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                Modifier modifier32 = companion;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                int i432 = i39;
                                List<BetGroupsTabs> list102 = list5;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                startRestartGroup.startReplaceGroup(-832081566);
                                if (z11) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier weight$default2 = ColumnScope.weight$default(columnScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting()) {
                                }
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                if (!z9) {
                                }
                                composer2 = startRestartGroup;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z13 = z20;
                                function15 = function18;
                                function04 = function08;
                                num3 = num5;
                                num4 = num6;
                                str2 = str4;
                                list8 = emptyList;
                                function16 = function19;
                                set3 = emptySet;
                                map3 = map5;
                                function33 = function32;
                                oddType2 = oddType3;
                                z14 = z7;
                                function05 = function07;
                                z15 = z21;
                                z16 = z22;
                                z17 = z23;
                                z18 = z252;
                                function23 = function242;
                                set4 = set52;
                                map4 = map62;
                                modifier2 = modifier32;
                                function17 = function14;
                                list9 = emptyList2;
                                j2 = j3;
                                function06 = function09;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            if (z8) {
                            }
                            list3 = subMatches;
                            z9 = false;
                            list4 = list3;
                            if (list4 instanceof Collection) {
                            }
                            it = list4.iterator();
                            while (it.hasNext()) {
                            }
                            z10 = false;
                            if (z24) {
                            }
                            startRestartGroup.startReplaceGroup(110462632);
                            if (z9) {
                            }
                            startRestartGroup.endReplaceGroup();
                            if (!z9) {
                            }
                            final int coerceAtLeast22 = RangesKt.coerceAtLeast(list5.size(), 1);
                            boolean z2522 = z19;
                            int coerceIn22 = RangesKt.coerceIn(i36, 0, coerceAtLeast22 - 1);
                            startRestartGroup.startReplaceGroup(5004770);
                            changed = startRestartGroup.changed(coerceAtLeast22);
                            Function2<? super Integer, ? super Long, Unit> function2422 = function22;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int MatchBetGroupsTabContent$lambda$10$lambda$9;
                                    MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast22);
                                    return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn22, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
                            Integer valueOf52 = Integer.valueOf(i36);
                            Boolean valueOf222 = Boolean.valueOf(z11);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
                            Set<Long> set522 = emptySet2;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf52, valueOf222, (Function2) rememberedValue2, startRestartGroup, 0);
                            Integer valueOf322 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                            Boolean valueOf422 = Boolean.valueOf(z11);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            int i4122 = i8 & 57344;
                            changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i4122 != 16384);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf322, valueOf422, (Function2) rememberedValue3, startRestartGroup, 0);
                            List<? extends BetModel> invoke22 = getBetCurrentList.invoke();
                            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke22, 10));
                            it2 = invoke22.iterator();
                            while (it2.hasNext()) {
                            }
                            Set set622 = CollectionsKt.toSet(arrayList22);
                            List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab22 = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
                            Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab22 = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set622, rememberPagerStateWithoutSavedState.getCurrentPage());
                            list6 = MatchBetGroupsTabContent$getBetGroupsForTab22;
                            if (list6 instanceof Collection) {
                            }
                            it3 = list6.iterator();
                            while (it3.hasNext()) {
                            }
                            z12 = true;
                            if (!z7) {
                            }
                            if (!z7) {
                            }
                            if (!z7) {
                            }
                            Map<Long, Boolean> map622 = emptyMap;
                            final float f32 = m7774constructorimpl3;
                            int i4222 = i36;
                            Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            Modifier modifier322 = companion;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32);
                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                            int i4322 = i39;
                            List<BetGroupsTabs> list1022 = list5;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-832081566);
                            if (z11) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier weight$default22 = ColumnScope.weight$default(columnScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22);
                            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            if (!z9) {
                            }
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z13 = z20;
                            function15 = function18;
                            function04 = function08;
                            num3 = num5;
                            num4 = num6;
                            str2 = str4;
                            list8 = emptyList;
                            function16 = function19;
                            set3 = emptySet;
                            map3 = map5;
                            function33 = function32;
                            oddType2 = oddType3;
                            z14 = z7;
                            function05 = function07;
                            z15 = z21;
                            z16 = z22;
                            z17 = z23;
                            z18 = z2522;
                            function23 = function2422;
                            set4 = set522;
                            map4 = map622;
                            modifier2 = modifier322;
                            function17 = function14;
                            list9 = emptyList2;
                            j2 = j3;
                            function06 = function09;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        if (num6 != null) {
                        }
                        if (z8) {
                        }
                        list3 = subMatches;
                        z9 = false;
                        list4 = list3;
                        if (list4 instanceof Collection) {
                        }
                        it = list4.iterator();
                        while (it.hasNext()) {
                        }
                        z10 = false;
                        if (z24) {
                        }
                        startRestartGroup.startReplaceGroup(110462632);
                        if (z9) {
                        }
                        startRestartGroup.endReplaceGroup();
                        if (!z9) {
                        }
                        final int coerceAtLeast222 = RangesKt.coerceAtLeast(list5.size(), 1);
                        boolean z25222 = z19;
                        int coerceIn222 = RangesKt.coerceIn(i36, 0, coerceAtLeast222 - 1);
                        startRestartGroup.startReplaceGroup(5004770);
                        changed = startRestartGroup.changed(coerceAtLeast222);
                        Function2<? super Integer, ? super Long, Unit> function24222 = function22;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int MatchBetGroupsTabContent$lambda$10$lambda$9;
                                MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast222);
                                return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn222, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
                        Integer valueOf522 = Integer.valueOf(i36);
                        Boolean valueOf2222 = Boolean.valueOf(z11);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
                        Set<Long> set5222 = emptySet2;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf522, valueOf2222, (Function2) rememberedValue2, startRestartGroup, 0);
                        Integer valueOf3222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                        Boolean valueOf4222 = Boolean.valueOf(z11);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        int i41222 = i8 & 57344;
                        changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i41222 != 16384);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf3222, valueOf4222, (Function2) rememberedValue3, startRestartGroup, 0);
                        List<? extends BetModel> invoke222 = getBetCurrentList.invoke();
                        ArrayList arrayList222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke222, 10));
                        it2 = invoke222.iterator();
                        while (it2.hasNext()) {
                        }
                        Set set6222 = CollectionsKt.toSet(arrayList222);
                        List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab222 = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
                        Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab222 = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set6222, rememberPagerStateWithoutSavedState.getCurrentPage());
                        list6 = MatchBetGroupsTabContent$getBetGroupsForTab222;
                        if (list6 instanceof Collection) {
                        }
                        it3 = list6.iterator();
                        while (it3.hasNext()) {
                        }
                        z12 = true;
                        if (!z7) {
                        }
                        if (!z7) {
                        }
                        if (!z7) {
                        }
                        Map<Long, Boolean> map6222 = emptyMap;
                        final float f322 = m7774constructorimpl3;
                        int i42222 = i36;
                        Modifier fillMaxSize$default322 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        Modifier modifier3222 = companion;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322);
                        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                        int i43222 = i39;
                        List<BetGroupsTabs> list10222 = list5;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-832081566);
                        if (z11) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier weight$default222 = ColumnScope.weight$default(columnScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222);
                        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                        if (!z9) {
                        }
                        composer2 = startRestartGroup;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z13 = z20;
                        function15 = function18;
                        function04 = function08;
                        num3 = num5;
                        num4 = num6;
                        str2 = str4;
                        list8 = emptyList;
                        function16 = function19;
                        set3 = emptySet;
                        map3 = map5;
                        function33 = function32;
                        oddType2 = oddType3;
                        z14 = z7;
                        function05 = function07;
                        z15 = z21;
                        z16 = z22;
                        z17 = z23;
                        z18 = z25222;
                        function23 = function24222;
                        set4 = set5222;
                        map4 = map6222;
                        modifier2 = modifier3222;
                        function17 = function14;
                        list9 = emptyList2;
                        j2 = j3;
                        function06 = function09;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i27 = i6 & 16777216;
                    if (i27 != 0) {
                    }
                    i28 = i6 & 67108864;
                    if (i28 == 0) {
                    }
                    i29 = i6 & C.BUFFER_FLAG_FIRST_SAMPLE;
                    if (i29 == 0) {
                    }
                    i30 = i6 & 268435456;
                    if (i30 == 0) {
                    }
                    i31 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                    if (i31 == 0) {
                    }
                    i32 = i6 & 1073741824;
                    if (i32 == 0) {
                    }
                    i34 = i7 & 1;
                    if (i34 == 0) {
                    }
                    if ((i8 & 306782355) == 306782354) {
                    }
                    if (i38 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if ((i6 & i35) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    if ((33554432 & i6) == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if (i29 == 0) {
                    }
                    if (i30 == 0) {
                    }
                    if (i31 == 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i34 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (num5 != null) {
                    }
                    if (num6 != null) {
                    }
                    if (z8) {
                    }
                    list3 = subMatches;
                    z9 = false;
                    list4 = list3;
                    if (list4 instanceof Collection) {
                    }
                    it = list4.iterator();
                    while (it.hasNext()) {
                    }
                    z10 = false;
                    if (z24) {
                    }
                    startRestartGroup.startReplaceGroup(110462632);
                    if (z9) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (!z9) {
                    }
                    final int coerceAtLeast2222 = RangesKt.coerceAtLeast(list5.size(), 1);
                    boolean z252222 = z19;
                    int coerceIn2222 = RangesKt.coerceIn(i36, 0, coerceAtLeast2222 - 1);
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(coerceAtLeast2222);
                    Function2<? super Integer, ? super Long, Unit> function242222 = function22;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int MatchBetGroupsTabContent$lambda$10$lambda$9;
                            MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast2222);
                            return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn2222, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
                    Integer valueOf5222 = Integer.valueOf(i36);
                    Boolean valueOf22222 = Boolean.valueOf(z11);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
                    Set<Long> set52222 = emptySet2;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf5222, valueOf22222, (Function2) rememberedValue2, startRestartGroup, 0);
                    Integer valueOf32222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                    Boolean valueOf42222 = Boolean.valueOf(z11);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    int i412222 = i8 & 57344;
                    changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i412222 != 16384);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf32222, valueOf42222, (Function2) rememberedValue3, startRestartGroup, 0);
                    List<? extends BetModel> invoke2222 = getBetCurrentList.invoke();
                    ArrayList arrayList2222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke2222, 10));
                    it2 = invoke2222.iterator();
                    while (it2.hasNext()) {
                    }
                    Set set62222 = CollectionsKt.toSet(arrayList2222);
                    List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab2222 = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
                    Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab2222 = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set62222, rememberPagerStateWithoutSavedState.getCurrentPage());
                    list6 = MatchBetGroupsTabContent$getBetGroupsForTab2222;
                    if (list6 instanceof Collection) {
                    }
                    it3 = list6.iterator();
                    while (it3.hasNext()) {
                    }
                    z12 = true;
                    if (!z7) {
                    }
                    if (!z7) {
                    }
                    if (!z7) {
                    }
                    Map<Long, Boolean> map62222 = emptyMap;
                    final float f3222 = m7774constructorimpl3;
                    int i422222 = i36;
                    Modifier fillMaxSize$default3222 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    Modifier modifier32222 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3222);
                    Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                    int i432222 = i39;
                    List<BetGroupsTabs> list102222 = list5;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-832081566);
                    if (z11) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier weight$default2222 = ColumnScope.weight$default(columnScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2222);
                    Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                    if (!z9) {
                    }
                    composer2 = startRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z13 = z20;
                    function15 = function18;
                    function04 = function08;
                    num3 = num5;
                    num4 = num6;
                    str2 = str4;
                    list8 = emptyList;
                    function16 = function19;
                    set3 = emptySet;
                    map3 = map5;
                    function33 = function32;
                    oddType2 = oddType3;
                    z14 = z7;
                    function05 = function07;
                    z15 = z21;
                    z16 = z22;
                    z17 = z23;
                    z18 = z252222;
                    function23 = function242222;
                    set4 = set52222;
                    map4 = map62222;
                    modifier2 = modifier32222;
                    function17 = function14;
                    list9 = emptyList2;
                    j2 = j3;
                    function06 = function09;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i26 = i6 & 8388608;
                if (i26 == 0) {
                }
                i27 = i6 & 16777216;
                if (i27 != 0) {
                }
                i28 = i6 & 67108864;
                if (i28 == 0) {
                }
                i29 = i6 & C.BUFFER_FLAG_FIRST_SAMPLE;
                if (i29 == 0) {
                }
                i30 = i6 & 268435456;
                if (i30 == 0) {
                }
                i31 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                if (i31 == 0) {
                }
                i32 = i6 & 1073741824;
                if (i32 == 0) {
                }
                i34 = i7 & 1;
                if (i34 == 0) {
                }
                if ((i8 & 306782355) == 306782354) {
                }
                if (i38 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if ((i6 & i35) == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                if (i25 == 0) {
                }
                if (i26 == 0) {
                }
                if (i27 == 0) {
                }
                if ((33554432 & i6) == 0) {
                }
                if (i28 == 0) {
                }
                if (i29 == 0) {
                }
                if (i30 == 0) {
                }
                if (i31 == 0) {
                }
                if (i32 == 0) {
                }
                if (i34 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (num5 != null) {
                }
                if (num6 != null) {
                }
                if (z8) {
                }
                list3 = subMatches;
                z9 = false;
                list4 = list3;
                if (list4 instanceof Collection) {
                }
                it = list4.iterator();
                while (it.hasNext()) {
                }
                z10 = false;
                if (z24) {
                }
                startRestartGroup.startReplaceGroup(110462632);
                if (z9) {
                }
                startRestartGroup.endReplaceGroup();
                if (!z9) {
                }
                final int coerceAtLeast22222 = RangesKt.coerceAtLeast(list5.size(), 1);
                boolean z2522222 = z19;
                int coerceIn22222 = RangesKt.coerceIn(i36, 0, coerceAtLeast22222 - 1);
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(coerceAtLeast22222);
                Function2<? super Integer, ? super Long, Unit> function2422222 = function22;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int MatchBetGroupsTabContent$lambda$10$lambda$9;
                        MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast22222);
                        return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn22222, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
                Integer valueOf52222 = Integer.valueOf(i36);
                Boolean valueOf222222 = Boolean.valueOf(z11);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
                Set<Long> set522222 = emptySet2;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf52222, valueOf222222, (Function2) rememberedValue2, startRestartGroup, 0);
                Integer valueOf322222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                Boolean valueOf422222 = Boolean.valueOf(z11);
                startRestartGroup.startReplaceGroup(-1224400529);
                int i4122222 = i8 & 57344;
                changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i4122222 != 16384);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf322222, valueOf422222, (Function2) rememberedValue3, startRestartGroup, 0);
                List<? extends BetModel> invoke22222 = getBetCurrentList.invoke();
                ArrayList arrayList22222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke22222, 10));
                it2 = invoke22222.iterator();
                while (it2.hasNext()) {
                }
                Set set622222 = CollectionsKt.toSet(arrayList22222);
                List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab22222 = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
                Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab22222 = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set622222, rememberPagerStateWithoutSavedState.getCurrentPage());
                list6 = MatchBetGroupsTabContent$getBetGroupsForTab22222;
                if (list6 instanceof Collection) {
                }
                it3 = list6.iterator();
                while (it3.hasNext()) {
                }
                z12 = true;
                if (!z7) {
                }
                if (!z7) {
                }
                if (!z7) {
                }
                Map<Long, Boolean> map622222 = emptyMap;
                final float f32222 = m7774constructorimpl3;
                int i4222222 = i36;
                Modifier fillMaxSize$default32222 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                Modifier modifier322222 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32222);
                Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                int i4322222 = i39;
                List<BetGroupsTabs> list1022222 = list5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-832081566);
                if (z11) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier weight$default22222 = ColumnScope.weight$default(columnScopeInstance22222, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22222);
                Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                if (!z9) {
                }
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z13 = z20;
                function15 = function18;
                function04 = function08;
                num3 = num5;
                num4 = num6;
                str2 = str4;
                list8 = emptyList;
                function16 = function19;
                set3 = emptySet;
                map3 = map5;
                function33 = function32;
                oddType2 = oddType3;
                z14 = z7;
                function05 = function07;
                z15 = z21;
                z16 = z22;
                z17 = z23;
                z18 = z2522222;
                function23 = function2422222;
                set4 = set522222;
                map4 = map622222;
                modifier2 = modifier322222;
                function17 = function14;
                list9 = emptyList2;
                j2 = j3;
                function06 = function09;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i18 = i6 & 32768;
            if (i18 != 0) {
            }
            i19 = i6 & 65536;
            if (i19 != 0) {
            }
            i20 = i6 & 262144;
            if (i20 != 0) {
            }
            i21 = i6 & 524288;
            if (i21 != 0) {
            }
            i22 = i6 & 1048576;
            if (i22 != 0) {
            }
            i24 = i6 & 2097152;
            if (i24 != 0) {
            }
            int i402 = i23;
            i25 = i6 & 4194304;
            if (i25 != 0) {
            }
            i26 = i6 & 8388608;
            if (i26 == 0) {
            }
            i27 = i6 & 16777216;
            if (i27 != 0) {
            }
            i28 = i6 & 67108864;
            if (i28 == 0) {
            }
            i29 = i6 & C.BUFFER_FLAG_FIRST_SAMPLE;
            if (i29 == 0) {
            }
            i30 = i6 & 268435456;
            if (i30 == 0) {
            }
            i31 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
            if (i31 == 0) {
            }
            i32 = i6 & 1073741824;
            if (i32 == 0) {
            }
            i34 = i7 & 1;
            if (i34 == 0) {
            }
            if ((i8 & 306782355) == 306782354) {
            }
            if (i38 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if ((i6 & i35) == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            if (i25 == 0) {
            }
            if (i26 == 0) {
            }
            if (i27 == 0) {
            }
            if ((33554432 & i6) == 0) {
            }
            if (i28 == 0) {
            }
            if (i29 == 0) {
            }
            if (i30 == 0) {
            }
            if (i31 == 0) {
            }
            if (i32 == 0) {
            }
            if (i34 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (num5 != null) {
            }
            if (num6 != null) {
            }
            if (z8) {
            }
            list3 = subMatches;
            z9 = false;
            list4 = list3;
            if (list4 instanceof Collection) {
            }
            it = list4.iterator();
            while (it.hasNext()) {
            }
            z10 = false;
            if (z24) {
            }
            startRestartGroup.startReplaceGroup(110462632);
            if (z9) {
            }
            startRestartGroup.endReplaceGroup();
            if (!z9) {
            }
            final int coerceAtLeast222222 = RangesKt.coerceAtLeast(list5.size(), 1);
            boolean z25222222 = z19;
            int coerceIn222222 = RangesKt.coerceIn(i36, 0, coerceAtLeast222222 - 1);
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(coerceAtLeast222222);
            Function2<? super Integer, ? super Long, Unit> function24222222 = function22;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int MatchBetGroupsTabContent$lambda$10$lambda$9;
                    MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast222222);
                    return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn222222, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
            Integer valueOf522222 = Integer.valueOf(i36);
            Boolean valueOf2222222 = Boolean.valueOf(z11);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
            Set<Long> set5222222 = emptySet2;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf522222, valueOf2222222, (Function2) rememberedValue2, startRestartGroup, 0);
            Integer valueOf3222222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
            Boolean valueOf4222222 = Boolean.valueOf(z11);
            startRestartGroup.startReplaceGroup(-1224400529);
            int i41222222 = i8 & 57344;
            changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i41222222 != 16384);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf3222222, valueOf4222222, (Function2) rememberedValue3, startRestartGroup, 0);
            List<? extends BetModel> invoke222222 = getBetCurrentList.invoke();
            ArrayList arrayList222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke222222, 10));
            it2 = invoke222222.iterator();
            while (it2.hasNext()) {
            }
            Set set6222222 = CollectionsKt.toSet(arrayList222222);
            List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab222222 = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
            Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab222222 = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set6222222, rememberPagerStateWithoutSavedState.getCurrentPage());
            list6 = MatchBetGroupsTabContent$getBetGroupsForTab222222;
            if (list6 instanceof Collection) {
            }
            it3 = list6.iterator();
            while (it3.hasNext()) {
            }
            z12 = true;
            if (!z7) {
            }
            if (!z7) {
            }
            if (!z7) {
            }
            Map<Long, Boolean> map6222222 = emptyMap;
            final float f322222 = m7774constructorimpl3;
            int i42222222 = i36;
            Modifier fillMaxSize$default322222 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            Modifier modifier3222222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322222);
            Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
            int i43222222 = i39;
            List<BetGroupsTabs> list10222222 = list5;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-832081566);
            if (z11) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier weight$default222222 = ColumnScope.weight$default(columnScopeInstance222222, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222222);
            Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
            if (!z9) {
            }
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z13 = z20;
            function15 = function18;
            function04 = function08;
            num3 = num5;
            num4 = num6;
            str2 = str4;
            list8 = emptyList;
            function16 = function19;
            set3 = emptySet;
            map3 = map5;
            function33 = function32;
            oddType2 = oddType3;
            z14 = z7;
            function05 = function07;
            z15 = z21;
            z16 = z22;
            z17 = z23;
            z18 = z25222222;
            function23 = function24222222;
            set4 = set5222222;
            map4 = map6222222;
            modifier2 = modifier3222222;
            function17 = function14;
            list9 = emptyList2;
            j2 = j3;
            function06 = function09;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i6 & 16) == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        i9 = i6 & 64;
        if (i9 == 0) {
        }
        i10 = i6 & 128;
        if (i10 == 0) {
        }
        i11 = i6 & 256;
        if (i11 == 0) {
        }
        i12 = i6 & 512;
        if (i12 == 0) {
        }
        i13 = i6 & 1024;
        if (i13 == 0) {
        }
        i15 = i6 & 2048;
        if (i15 == 0) {
        }
        int i392 = i14;
        i16 = i6 & 4096;
        if (i16 == 0) {
        }
        if ((i6 & 8192) == 0) {
        }
        i17 = i6 & 16384;
        if (i17 == 0) {
        }
        i18 = i6 & 32768;
        if (i18 != 0) {
        }
        i19 = i6 & 65536;
        if (i19 != 0) {
        }
        i20 = i6 & 262144;
        if (i20 != 0) {
        }
        i21 = i6 & 524288;
        if (i21 != 0) {
        }
        i22 = i6 & 1048576;
        if (i22 != 0) {
        }
        i24 = i6 & 2097152;
        if (i24 != 0) {
        }
        int i4022 = i23;
        i25 = i6 & 4194304;
        if (i25 != 0) {
        }
        i26 = i6 & 8388608;
        if (i26 == 0) {
        }
        i27 = i6 & 16777216;
        if (i27 != 0) {
        }
        i28 = i6 & 67108864;
        if (i28 == 0) {
        }
        i29 = i6 & C.BUFFER_FLAG_FIRST_SAMPLE;
        if (i29 == 0) {
        }
        i30 = i6 & 268435456;
        if (i30 == 0) {
        }
        i31 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
        if (i31 == 0) {
        }
        i32 = i6 & 1073741824;
        if (i32 == 0) {
        }
        i34 = i7 & 1;
        if (i34 == 0) {
        }
        if ((i8 & 306782355) == 306782354) {
        }
        if (i38 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if ((i6 & i35) == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        if (i25 == 0) {
        }
        if (i26 == 0) {
        }
        if (i27 == 0) {
        }
        if ((33554432 & i6) == 0) {
        }
        if (i28 == 0) {
        }
        if (i29 == 0) {
        }
        if (i30 == 0) {
        }
        if (i31 == 0) {
        }
        if (i32 == 0) {
        }
        if (i34 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (num5 != null) {
        }
        if (num6 != null) {
        }
        if (z8) {
        }
        list3 = subMatches;
        z9 = false;
        list4 = list3;
        if (list4 instanceof Collection) {
        }
        it = list4.iterator();
        while (it.hasNext()) {
        }
        z10 = false;
        if (z24) {
        }
        startRestartGroup.startReplaceGroup(110462632);
        if (z9) {
        }
        startRestartGroup.endReplaceGroup();
        if (!z9) {
        }
        final int coerceAtLeast2222222 = RangesKt.coerceAtLeast(list5.size(), 1);
        boolean z252222222 = z19;
        int coerceIn2222222 = RangesKt.coerceIn(i36, 0, coerceAtLeast2222222 - 1);
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(coerceAtLeast2222222);
        Function2<? super Integer, ? super Long, Unit> function242222222 = function22;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int MatchBetGroupsTabContent$lambda$10$lambda$9;
                MatchBetGroupsTabContent$lambda$10$lambda$9 = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$lambda$10$lambda$9(coerceAtLeast2222222);
                return Integer.valueOf(MatchBetGroupsTabContent$lambda$10$lambda$9);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(coerceIn2222222, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
        Integer valueOf5222222 = Integer.valueOf(i36);
        Boolean valueOf22222222 = Boolean.valueOf(z11);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed2 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36);
        Set<Long> set52222222 = emptySet2;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(z11, list5, rememberPagerStateWithoutSavedState, i36, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf5222222, valueOf22222222, (Function2) rememberedValue2, startRestartGroup, 0);
        Integer valueOf32222222 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
        Boolean valueOf42222222 = Boolean.valueOf(z11);
        startRestartGroup.startReplaceGroup(-1224400529);
        int i412222222 = i8 & 57344;
        changed3 = startRestartGroup.changed(z11) | startRestartGroup.changedInstance(list5) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changed(i36) | (i412222222 != 16384);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$5$1(z11, list5, rememberPagerStateWithoutSavedState, i36, onTabSelected, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32222222, valueOf42222222, (Function2) rememberedValue3, startRestartGroup, 0);
        List<? extends BetModel> invoke2222222 = getBetCurrentList.invoke();
        ArrayList arrayList2222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke2222222, 10));
        it2 = invoke2222222.iterator();
        while (it2.hasNext()) {
        }
        Set set62222222 = CollectionsKt.toSet(arrayList2222222);
        List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab2222222 = MatchBetGroupsTabContent$getBetGroupsForTab(z9, list5, rememberPagerStateWithoutSavedState.getCurrentPage());
        Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab2222222 = MatchBetGroupsTabContent$getExpandedStatesForTab(map5, emptyMap, z9, list5, set62222222, rememberPagerStateWithoutSavedState.getCurrentPage());
        list6 = MatchBetGroupsTabContent$getBetGroupsForTab2222222;
        if (list6 instanceof Collection) {
        }
        it3 = list6.iterator();
        while (it3.hasNext()) {
        }
        z12 = true;
        if (!z7) {
        }
        if (!z7) {
        }
        if (!z7) {
        }
        Map<Long, Boolean> map62222222 = emptyMap;
        final float f3222222 = m7774constructorimpl3;
        int i422222222 = i36;
        Modifier fillMaxSize$default3222222 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        Modifier modifier32222222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3222222);
        Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
        int i432222222 = i392;
        List<BetGroupsTabs> list102222222 = list5;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-832081566);
        if (z11) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier weight$default2222222 = ColumnScope.weight$default(columnScopeInstance2222222, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2222222);
        Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
        if (!z9) {
        }
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z13 = z20;
        function15 = function18;
        function04 = function08;
        num3 = num5;
        num4 = num6;
        str2 = str4;
        list8 = emptyList;
        function16 = function19;
        set3 = emptySet;
        map3 = map5;
        function33 = function32;
        oddType2 = oddType3;
        z14 = z7;
        function05 = function07;
        z15 = z21;
        z16 = z22;
        z17 = z23;
        z18 = z252222222;
        function23 = function242222222;
        set4 = set52222222;
        map4 = map62222222;
        modifier2 = modifier32222222;
        function17 = function14;
        list9 = emptyList2;
        j2 = j3;
        function06 = function09;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab(boolean z, List<BetGroupsTabs> list, int i) {
        List<MatchVarietyGroupBetsModel> bets;
        if (z) {
            return CollectionsKt.emptyList();
        }
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(list, i);
        return (betGroupsTabs == null || (bets = betGroupsTabs.getBets()) == null) ? CollectionsKt.emptyList() : bets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Long, Boolean> MatchBetGroupsTabContent$getExpandedStatesForTab(Map<Integer, ? extends Map<Long, Boolean>> map, Map<Long, Boolean> map2, boolean z, List<BetGroupsTabs> list, Set<Long> set, int i) {
        List<MatchVarietyGroupBetsModel> MatchBetGroupsTabContent$getBetGroupsForTab = MatchBetGroupsTabContent$getBetGroupsForTab(z, list, i);
        if (map != null && (map2 = map.get(Integer.valueOf(i))) == null) {
            map2 = MapsKt.emptyMap();
        }
        List<MatchVarietyGroupBetsModel> list2 = MatchBetGroupsTabContent$getBetGroupsForTab;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) it.next();
            List<MatchVarietyBetOptionModel> bets = matchVarietyGroupBetsModel.getBets();
            if (!(bets instanceof Collection) || !bets.isEmpty()) {
                Iterator<T> it2 = bets.iterator();
                while (it2.hasNext()) {
                    if (set.contains(Long.valueOf(((MatchVarietyBetOptionModel) it2.next()).getGrabbedBetId()))) {
                        break;
                    }
                }
            }
            z2 = false;
            Pair pair = TuplesKt.to(Long.valueOf(matchVarietyGroupBetsModel.getGroup().getId()), Boolean.valueOf(z2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (MatchVarietyGroupBetsModel matchVarietyGroupBetsModel2 : list2) {
            Boolean bool = map2.get(Long.valueOf(matchVarietyGroupBetsModel2.getGroup().getId()));
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = (Boolean) linkedHashMap.get(Long.valueOf(matchVarietyGroupBetsModel2.getGroup().getId()));
            Pair pair2 = TuplesKt.to(Long.valueOf(matchVarietyGroupBetsModel2.getGroup().getId()), Boolean.valueOf(booleanValue || (bool2 != null ? bool2.booleanValue() : false)));
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        return linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchBetGroupsTabContent$lambda$23$lambda$21$lambda$20(boolean z, List list, boolean z2, final List list2, boolean z3, float f, PagerState pagerState, Function3 function3, final float f2, final int i, final boolean z4, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        if (!z && !list.isEmpty() && !z2) {
            LazyListScope.item$default(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-1495487674, true, new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$1$1$1(z3, f, pagerState, z, list2, function3, f2)), 3, null);
        }
        LazyRow.items(list2.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$lambda$23$lambda$21$lambda$20$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                list2.get(i2);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$lambda$23$lambda$21$lambda$20$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, final int i2, Composer composer, int i3) {
                int i4;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & Opcodes.I2S) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                BetGroupsTabs betGroupsTabs = (BetGroupsTabs) list2.get(i2);
                composer.startReplaceGroup(28728119);
                String title = betGroupsTabs.getTitle();
                boolean z5 = i2 == i;
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, f2, 0.0f, 11, null);
                boolean z6 = z4;
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(function1) | ((((i4 & 112) ^ 48) > 32 && composer.changed(i2)) || (i4 & 48) == 32);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(Integer.valueOf(i2));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                CommonButtonMatchBetKt.CommonButtonMatchBet(m1520paddingqDBjuR0$default, z5, title, z6, false, null, true, (Function0) rememberedValue, null, false, false, null, false, false, false, false, false, null, composer, 1572864, 12582912, 130864);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetGroupsPageContent(final int i, Long l, VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel, final List<MatchVarietyGroupBetsModel> list, final Map<Long, Boolean> map, final Set<Long> set, final Set<Long> set2, final Function2<? super Integer, ? super Long, Unit> function2, final Function2<? super Long, ? super Integer, Unit> function22, final OddType oddType, final Integer num, final boolean z, boolean z2, final boolean z3, final Function1<? super Rect, Unit> function1, final Function0<Unit> function0, Function1<? super Long, Double> function12, boolean z4, Function0<Unit> function02, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Long l2;
        VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel2;
        boolean z5;
        Function1<? super Long, Double> function13;
        boolean z6;
        Function0<Unit> function03;
        Object rememberedValue;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        BoxScopeInstance boxScopeInstance;
        boolean z7;
        float m7774constructorimpl;
        boolean changedInstance;
        Object rememberedValue3;
        int i12;
        BoxScopeInstance boxScopeInstance2;
        Composer composer2;
        boolean changedInstance2;
        Object obj;
        MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1;
        final boolean z8;
        final Function0<Unit> function04;
        final Long l3;
        final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel3;
        final boolean z9;
        final Function1<? super Long, Double> function14;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-282231490);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i4 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        int i14 = i4 & 4;
        if (i14 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changed(varietyBetRestrictionInfoModel) ? 256 : 128;
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= startRestartGroup.changedInstance(map) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= startRestartGroup.changedInstance(set) ? 131072 : 65536;
            }
            if ((i4 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= startRestartGroup.changedInstance(set2) ? 1048576 : 524288;
            }
            if ((i4 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                if ((i4 & 256) != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= startRestartGroup.changedInstance(function22) ? 67108864 : 33554432;
                    if ((i4 & 512) == 0) {
                        i6 = 805306368;
                    } else {
                        if ((805306368 & i2) == 0) {
                            i6 = startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        if ((i4 & 1024) != 0) {
                            i7 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i7 = i3 | (startRestartGroup.changed(num) ? 4 : 2);
                        } else {
                            i7 = i3;
                        }
                        if ((i4 & 2048) != 0) {
                            i7 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i7 |= startRestartGroup.changed(z) ? 32 : 16;
                        }
                        int i15 = i7;
                        i8 = i4 & 4096;
                        if (i8 != 0) {
                            i15 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i15 |= startRestartGroup.changed(z2) ? 256 : 128;
                            if ((i4 & 8192) == 0) {
                                i15 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i15 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                            }
                            if ((i4 & 16384) == 0) {
                                i15 |= 24576;
                            } else if ((i3 & 24576) == 0) {
                                i15 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                if ((i4 & 32768) != 0) {
                                    i15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i15 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                                }
                                i9 = i4 & 65536;
                                if (i9 != 0) {
                                    i15 |= 1572864;
                                } else if ((i3 & 1572864) == 0) {
                                    i15 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                                }
                                i10 = i4 & 131072;
                                if (i10 != 0) {
                                    i15 |= 12582912;
                                } else if ((i3 & 12582912) == 0) {
                                    i15 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                                }
                                i11 = i4 & 262144;
                                if (i11 != 0) {
                                    i15 |= 100663296;
                                } else if ((i3 & 100663296) == 0) {
                                    i15 |= startRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                                }
                                if ((i5 & 306783379) == 306783378 || (38347923 & i15) != 38347922 || !startRestartGroup.getSkipping()) {
                                    l2 = i13 != 0 ? null : l;
                                    varietyBetRestrictionInfoModel2 = i14 != 0 ? null : varietyBetRestrictionInfoModel;
                                    z5 = i8 != 0 ? false : z2;
                                    function13 = i9 != 0 ? null : function12;
                                    z6 = i10 != 0 ? false : z4;
                                    function03 = i11 != 0 ? null : function02;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-282231490, i5, i15, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsPageContent (MatchBetGroupsTabContent.kt:310)");
                                    }
                                    LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Handler(Looper.getMainLooper());
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    final Handler handler = (Handler) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new AtomicReference(null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    final AtomicReference atomicReference = (AtomicReference) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                                    Modifier weight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    if (z3) {
                                        m7774constructorimpl = Dp.m7774constructorimpl(z5 ? 14 : 18);
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                        m7774constructorimpl = Dp.m7774constructorimpl(0);
                                    }
                                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(fillMaxSize$default2, 0.0f, 0.0f, m7774constructorimpl, 0.0f, 11, null);
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    changedInstance = ((i5 & 234881024) == 67108864) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(map) | ((i5 & 112) == 32 ? true : z7) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z7) | ((57344 & i15) == 16384 ? true : z7) | startRestartGroup.changedInstance(atomicReference) | startRestartGroup.changedInstance(handler) | ((29360128 & i15) == 8388608 ? true : z7) | ((1879048192 & i5) == 536870912 ? true : z7) | startRestartGroup.changedInstance(set) | startRestartGroup.changedInstance(set2) | ((29360128 & i5) == 8388608) | ((i5 & 14) == 4) | ((i15 & 112) == 32) | ((i15 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i15 & 14) == 4) | ((3670016 & i15) == 1048576) | ((234881024 & i15) == 67108864);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        i12 = i15;
                                        final Long l4 = l2;
                                        final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel4 = varietyBetRestrictionInfoModel2;
                                        final boolean z10 = z6;
                                        boxScopeInstance2 = boxScopeInstance;
                                        final boolean z11 = z5;
                                        final Function1<? super Long, Double> function15 = function13;
                                        final Function0<Unit> function05 = function03;
                                        Function1 function16 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                                                BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(list, map, l4, varietyBetRestrictionInfoModel4, function1, atomicReference, handler, z10, oddType, set, set2, function2, i, function22, z, z11, num, function15, function05, (LazyListScope) obj2);
                                                return BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                                            }
                                        };
                                        composer2 = startRestartGroup;
                                        composer2.updateRememberedValue(function16);
                                        rememberedValue3 = function16;
                                    } else {
                                        i12 = i15;
                                        composer2 = startRestartGroup;
                                        boxScopeInstance2 = boxScopeInstance;
                                    }
                                    composer2.endReplaceGroup();
                                    LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default, rememberLazyListStateWithoutSavedState, null, false, null, null, null, false, null, (Function1) rememberedValue3, composer2, 0, 508);
                                    Integer valueOf = Integer.valueOf(list.size());
                                    composer2.startReplaceGroup(-1633490746);
                                    changedInstance2 = composer2.changedInstance(list) | ((i12 & 458752) == 131072);
                                    Object rememberedValue4 = composer2.rememberedValue();
                                    if (!changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        obj = null;
                                        matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(list, function0, null);
                                        composer2.updateRememberedValue(matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1);
                                    } else {
                                        matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = rememberedValue4;
                                        obj = null;
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1, composer2, 0);
                                    composer2.startReplaceGroup(-477162259);
                                    if (z3) {
                                        Modifier align = boxScopeInstance2.align(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, obj), 0.0f, 0.0f, Dp.m7774constructorimpl(12), 0.0f, 11, null), Alignment.INSTANCE.getCenterEnd());
                                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, align);
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor3);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                                        Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        BetSlipListUiKt.m13488CustomScrollbart6yy7ic(rememberLazyListStateWithoutSavedState, SizeKt.m1568width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, obj), Dp.m7774constructorimpl(8)), 0L, 0L, null, composer2, 48, 28);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                    }
                                    composer2.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z8 = z6;
                                    function04 = function03;
                                    l3 = l2;
                                    varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel2;
                                    z9 = z5;
                                    function14 = function13;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    l3 = l;
                                    varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel;
                                    z9 = z2;
                                    function14 = function12;
                                    z8 = z4;
                                    function04 = function02;
                                    composer2 = startRestartGroup;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            Unit BetGroupsPageContent$lambda$37;
                                            BetGroupsPageContent$lambda$37 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$37(i, l3, varietyBetRestrictionInfoModel3, list, map, set, set2, function2, function22, oddType, num, z, z9, z3, function1, function0, function14, z8, function04, i2, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                                            return BetGroupsPageContent$lambda$37;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i4 & 32768) != 0) {
                            }
                            i9 = i4 & 65536;
                            if (i9 != 0) {
                            }
                            i10 = i4 & 131072;
                            if (i10 != 0) {
                            }
                            i11 = i4 & 262144;
                            if (i11 != 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            if (i13 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            LazyListState rememberLazyListStateWithoutSavedState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final Handler handler2 = (Handler) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            final AtomicReference atomicReference2 = (AtomicReference) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            Modifier weight$default2 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            if (z3) {
                            }
                            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(fillMaxSize$default22, 0.0f, 0.0f, m7774constructorimpl, 0.0f, 11, null);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changedInstance = ((i5 & 234881024) == 67108864) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(map) | ((i5 & 112) == 32 ? true : z7) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z7) | ((57344 & i15) == 16384 ? true : z7) | startRestartGroup.changedInstance(atomicReference2) | startRestartGroup.changedInstance(handler2) | ((29360128 & i15) == 8388608 ? true : z7) | ((1879048192 & i5) == 536870912 ? true : z7) | startRestartGroup.changedInstance(set) | startRestartGroup.changedInstance(set2) | ((29360128 & i5) == 8388608) | ((i5 & 14) == 4) | ((i15 & 112) == 32) | ((i15 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i15 & 14) == 4) | ((3670016 & i15) == 1048576) | ((234881024 & i15) == 67108864);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changedInstance) {
                            }
                            i12 = i15;
                            final Long l42 = l2;
                            final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel42 = varietyBetRestrictionInfoModel2;
                            final boolean z102 = z6;
                            boxScopeInstance2 = boxScopeInstance;
                            final boolean z112 = z5;
                            final Function1 function152 = function13;
                            final Function0 function052 = function03;
                            Function1 function162 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                                    BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(list, map, l42, varietyBetRestrictionInfoModel42, function1, atomicReference2, handler2, z102, oddType, set, set2, function2, i, function22, z, z112, num, function152, function052, (LazyListScope) obj2);
                                    return BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                                }
                            };
                            composer2 = startRestartGroup;
                            composer2.updateRememberedValue(function162);
                            rememberedValue3 = function162;
                            composer2.endReplaceGroup();
                            LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default2, rememberLazyListStateWithoutSavedState2, null, false, null, null, null, false, null, (Function1) rememberedValue3, composer2, 0, 508);
                            Integer valueOf2 = Integer.valueOf(list.size());
                            composer2.startReplaceGroup(-1633490746);
                            changedInstance2 = composer2.changedInstance(list) | ((i12 & 458752) == 131072);
                            Object rememberedValue42 = composer2.rememberedValue();
                            if (changedInstance2) {
                            }
                            obj = null;
                            matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(list, function0, null);
                            composer2.updateRememberedValue(matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1, composer2, 0);
                            composer2.startReplaceGroup(-477162259);
                            if (z3) {
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z8 = z6;
                            function04 = function03;
                            l3 = l2;
                            varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel2;
                            z9 = z5;
                            function14 = function13;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i4 & 8192) == 0) {
                        }
                        if ((i4 & 16384) == 0) {
                        }
                        if ((i4 & 32768) != 0) {
                        }
                        i9 = i4 & 65536;
                        if (i9 != 0) {
                        }
                        i10 = i4 & 131072;
                        if (i10 != 0) {
                        }
                        i11 = i4 & 262144;
                        if (i11 != 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LazyListState rememberLazyListStateWithoutSavedState22 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final Handler handler22 = (Handler) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        final AtomicReference atomicReference22 = (AtomicReference) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32);
                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        Modifier weight$default22 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22);
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        if (z3) {
                        }
                        Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(fillMaxSize$default222, 0.0f, 0.0f, m7774constructorimpl, 0.0f, 11, null);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changedInstance = ((i5 & 234881024) == 67108864) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(map) | ((i5 & 112) == 32 ? true : z7) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z7) | ((57344 & i15) == 16384 ? true : z7) | startRestartGroup.changedInstance(atomicReference22) | startRestartGroup.changedInstance(handler22) | ((29360128 & i15) == 8388608 ? true : z7) | ((1879048192 & i5) == 536870912 ? true : z7) | startRestartGroup.changedInstance(set) | startRestartGroup.changedInstance(set2) | ((29360128 & i5) == 8388608) | ((i5 & 14) == 4) | ((i15 & 112) == 32) | ((i15 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i15 & 14) == 4) | ((3670016 & i15) == 1048576) | ((234881024 & i15) == 67108864);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changedInstance) {
                        }
                        i12 = i15;
                        final Long l422 = l2;
                        final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel422 = varietyBetRestrictionInfoModel2;
                        final boolean z1022 = z6;
                        boxScopeInstance2 = boxScopeInstance;
                        final boolean z1122 = z5;
                        final Function1 function1522 = function13;
                        final Function0 function0522 = function03;
                        Function1 function1622 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                                BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(list, map, l422, varietyBetRestrictionInfoModel422, function1, atomicReference22, handler22, z1022, oddType, set, set2, function2, i, function22, z, z1122, num, function1522, function0522, (LazyListScope) obj2);
                                return BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                            }
                        };
                        composer2 = startRestartGroup;
                        composer2.updateRememberedValue(function1622);
                        rememberedValue3 = function1622;
                        composer2.endReplaceGroup();
                        LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default22, rememberLazyListStateWithoutSavedState22, null, false, null, null, null, false, null, (Function1) rememberedValue3, composer2, 0, 508);
                        Integer valueOf22 = Integer.valueOf(list.size());
                        composer2.startReplaceGroup(-1633490746);
                        changedInstance2 = composer2.changedInstance(list) | ((i12 & 458752) == 131072);
                        Object rememberedValue422 = composer2.rememberedValue();
                        if (changedInstance2) {
                        }
                        obj = null;
                        matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(list, function0, null);
                        composer2.updateRememberedValue(matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1, composer2, 0);
                        composer2.startReplaceGroup(-477162259);
                        if (z3) {
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z8 = z6;
                        function04 = function03;
                        l3 = l2;
                        varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel2;
                        z9 = z5;
                        function14 = function13;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i5 |= i6;
                    if ((i4 & 1024) != 0) {
                    }
                    if ((i4 & 2048) != 0) {
                    }
                    int i152 = i7;
                    i8 = i4 & 4096;
                    if (i8 != 0) {
                    }
                    if ((i4 & 8192) == 0) {
                    }
                    if ((i4 & 16384) == 0) {
                    }
                    if ((i4 & 32768) != 0) {
                    }
                    i9 = i4 & 65536;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 131072;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 262144;
                    if (i11 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    LazyListState rememberLazyListStateWithoutSavedState222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final Handler handler222 = (Handler) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final AtomicReference atomicReference222 = (AtomicReference) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxSize$default322 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322);
                    Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    Modifier weight$default222 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222);
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    if (z3) {
                    }
                    Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(fillMaxSize$default2222, 0.0f, 0.0f, m7774constructorimpl, 0.0f, 11, null);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changedInstance = ((i5 & 234881024) == 67108864) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(map) | ((i5 & 112) == 32 ? true : z7) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z7) | ((57344 & i152) == 16384 ? true : z7) | startRestartGroup.changedInstance(atomicReference222) | startRestartGroup.changedInstance(handler222) | ((29360128 & i152) == 8388608 ? true : z7) | ((1879048192 & i5) == 536870912 ? true : z7) | startRestartGroup.changedInstance(set) | startRestartGroup.changedInstance(set2) | ((29360128 & i5) == 8388608) | ((i5 & 14) == 4) | ((i152 & 112) == 32) | ((i152 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i152 & 14) == 4) | ((3670016 & i152) == 1048576) | ((234881024 & i152) == 67108864);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance) {
                    }
                    i12 = i152;
                    final Long l4222 = l2;
                    final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel4222 = varietyBetRestrictionInfoModel2;
                    final boolean z10222 = z6;
                    boxScopeInstance2 = boxScopeInstance;
                    final boolean z11222 = z5;
                    final Function1 function15222 = function13;
                    final Function0 function05222 = function03;
                    Function1 function16222 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                            BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(list, map, l4222, varietyBetRestrictionInfoModel4222, function1, atomicReference222, handler222, z10222, oddType, set, set2, function2, i, function22, z, z11222, num, function15222, function05222, (LazyListScope) obj2);
                            return BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                        }
                    };
                    composer2 = startRestartGroup;
                    composer2.updateRememberedValue(function16222);
                    rememberedValue3 = function16222;
                    composer2.endReplaceGroup();
                    LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default222, rememberLazyListStateWithoutSavedState222, null, false, null, null, null, false, null, (Function1) rememberedValue3, composer2, 0, 508);
                    Integer valueOf222 = Integer.valueOf(list.size());
                    composer2.startReplaceGroup(-1633490746);
                    changedInstance2 = composer2.changedInstance(list) | ((i12 & 458752) == 131072);
                    Object rememberedValue4222 = composer2.rememberedValue();
                    if (changedInstance2) {
                    }
                    obj = null;
                    matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(list, function0, null);
                    composer2.updateRememberedValue(matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1, composer2, 0);
                    composer2.startReplaceGroup(-477162259);
                    if (z3) {
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z8 = z6;
                    function04 = function03;
                    l3 = l2;
                    varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel2;
                    z9 = z5;
                    function14 = function13;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i4 & 512) == 0) {
                }
                i5 |= i6;
                if ((i4 & 1024) != 0) {
                }
                if ((i4 & 2048) != 0) {
                }
                int i1522 = i7;
                i8 = i4 & 4096;
                if (i8 != 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((i4 & 32768) != 0) {
                }
                i9 = i4 & 65536;
                if (i9 != 0) {
                }
                i10 = i4 & 131072;
                if (i10 != 0) {
                }
                i11 = i4 & 262144;
                if (i11 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                LazyListState rememberLazyListStateWithoutSavedState2222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final Handler handler2222 = (Handler) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final AtomicReference atomicReference2222 = (AtomicReference) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxSize$default3222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3222);
                Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                Modifier weight$default2222 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2222);
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                if (z3) {
                }
                Modifier m1520paddingqDBjuR0$default2222 = PaddingKt.m1520paddingqDBjuR0$default(fillMaxSize$default22222, 0.0f, 0.0f, m7774constructorimpl, 0.0f, 11, null);
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance = ((i5 & 234881024) == 67108864) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(map) | ((i5 & 112) == 32 ? true : z7) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z7) | ((57344 & i1522) == 16384 ? true : z7) | startRestartGroup.changedInstance(atomicReference2222) | startRestartGroup.changedInstance(handler2222) | ((29360128 & i1522) == 8388608 ? true : z7) | ((1879048192 & i5) == 536870912 ? true : z7) | startRestartGroup.changedInstance(set) | startRestartGroup.changedInstance(set2) | ((29360128 & i5) == 8388608) | ((i5 & 14) == 4) | ((i1522 & 112) == 32) | ((i1522 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i1522 & 14) == 4) | ((3670016 & i1522) == 1048576) | ((234881024 & i1522) == 67108864);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                i12 = i1522;
                final Long l42222 = l2;
                final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel42222 = varietyBetRestrictionInfoModel2;
                final boolean z102222 = z6;
                boxScopeInstance2 = boxScopeInstance;
                final boolean z112222 = z5;
                final Function1 function152222 = function13;
                final Function0 function052222 = function03;
                Function1 function162222 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                        BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(list, map, l42222, varietyBetRestrictionInfoModel42222, function1, atomicReference2222, handler2222, z102222, oddType, set, set2, function2, i, function22, z, z112222, num, function152222, function052222, (LazyListScope) obj2);
                        return BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                    }
                };
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(function162222);
                rememberedValue3 = function162222;
                composer2.endReplaceGroup();
                LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default2222, rememberLazyListStateWithoutSavedState2222, null, false, null, null, null, false, null, (Function1) rememberedValue3, composer2, 0, 508);
                Integer valueOf2222 = Integer.valueOf(list.size());
                composer2.startReplaceGroup(-1633490746);
                changedInstance2 = composer2.changedInstance(list) | ((i12 & 458752) == 131072);
                Object rememberedValue42222 = composer2.rememberedValue();
                if (changedInstance2) {
                }
                obj = null;
                matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(list, function0, null);
                composer2.updateRememberedValue(matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1);
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1, composer2, 0);
                composer2.startReplaceGroup(-477162259);
                if (z3) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z8 = z6;
                function04 = function03;
                l3 = l2;
                varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel2;
                z9 = z5;
                function14 = function13;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i4 & 256) != 0) {
            }
            if ((i4 & 512) == 0) {
            }
            i5 |= i6;
            if ((i4 & 1024) != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            int i15222 = i7;
            i8 = i4 & 4096;
            if (i8 != 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((i4 & 32768) != 0) {
            }
            i9 = i4 & 65536;
            if (i9 != 0) {
            }
            i10 = i4 & 131072;
            if (i10 != 0) {
            }
            i11 = i4 & 262144;
            if (i11 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyListState rememberLazyListStateWithoutSavedState22222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final Handler handler22222 = (Handler) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final AtomicReference atomicReference22222 = (AtomicReference) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxSize$default32222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32222);
            Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            Modifier weight$default22222 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22222);
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            if (z3) {
            }
            Modifier m1520paddingqDBjuR0$default22222 = PaddingKt.m1520paddingqDBjuR0$default(fillMaxSize$default222222, 0.0f, 0.0f, m7774constructorimpl, 0.0f, 11, null);
            startRestartGroup.startReplaceGroup(-1224400529);
            changedInstance = ((i5 & 234881024) == 67108864) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(map) | ((i5 & 112) == 32 ? true : z7) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z7) | ((57344 & i15222) == 16384 ? true : z7) | startRestartGroup.changedInstance(atomicReference22222) | startRestartGroup.changedInstance(handler22222) | ((29360128 & i15222) == 8388608 ? true : z7) | ((1879048192 & i5) == 536870912 ? true : z7) | startRestartGroup.changedInstance(set) | startRestartGroup.changedInstance(set2) | ((29360128 & i5) == 8388608) | ((i5 & 14) == 4) | ((i15222 & 112) == 32) | ((i15222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i15222 & 14) == 4) | ((3670016 & i15222) == 1048576) | ((234881024 & i15222) == 67108864);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            i12 = i15222;
            final Long l422222 = l2;
            final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel422222 = varietyBetRestrictionInfoModel2;
            final boolean z1022222 = z6;
            boxScopeInstance2 = boxScopeInstance;
            final boolean z1122222 = z5;
            final Function1 function1522222 = function13;
            final Function0 function0522222 = function03;
            Function1 function1622222 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                    BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(list, map, l422222, varietyBetRestrictionInfoModel422222, function1, atomicReference22222, handler22222, z1022222, oddType, set, set2, function2, i, function22, z, z1122222, num, function1522222, function0522222, (LazyListScope) obj2);
                    return BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                }
            };
            composer2 = startRestartGroup;
            composer2.updateRememberedValue(function1622222);
            rememberedValue3 = function1622222;
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default22222, rememberLazyListStateWithoutSavedState22222, null, false, null, null, null, false, null, (Function1) rememberedValue3, composer2, 0, 508);
            Integer valueOf22222 = Integer.valueOf(list.size());
            composer2.startReplaceGroup(-1633490746);
            changedInstance2 = composer2.changedInstance(list) | ((i12 & 458752) == 131072);
            Object rememberedValue422222 = composer2.rememberedValue();
            if (changedInstance2) {
            }
            obj = null;
            matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(list, function0, null);
            composer2.updateRememberedValue(matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1);
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1, composer2, 0);
            composer2.startReplaceGroup(-477162259);
            if (z3) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z8 = z6;
            function04 = function03;
            l3 = l2;
            varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel2;
            z9 = z5;
            function14 = function13;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if ((i4 & 128) == 0) {
        }
        if ((i4 & 256) != 0) {
        }
        if ((i4 & 512) == 0) {
        }
        i5 |= i6;
        if ((i4 & 1024) != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        int i152222 = i7;
        i8 = i4 & 4096;
        if (i8 != 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((i4 & 32768) != 0) {
        }
        i9 = i4 & 65536;
        if (i9 != 0) {
        }
        i10 = i4 & 131072;
        if (i10 != 0) {
        }
        i11 = i4 & 262144;
        if (i11 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        LazyListState rememberLazyListStateWithoutSavedState222222 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final Handler handler222222 = (Handler) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final AtomicReference atomicReference222222 = (AtomicReference) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxSize$default322222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322222);
        Function0<ComposeUiNode> constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        Modifier weight$default222222 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222222);
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        if (z3) {
        }
        Modifier m1520paddingqDBjuR0$default222222 = PaddingKt.m1520paddingqDBjuR0$default(fillMaxSize$default2222222, 0.0f, 0.0f, m7774constructorimpl, 0.0f, 11, null);
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance = ((i5 & 234881024) == 67108864) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(map) | ((i5 & 112) == 32 ? true : z7) | ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z7) | ((57344 & i152222) == 16384 ? true : z7) | startRestartGroup.changedInstance(atomicReference222222) | startRestartGroup.changedInstance(handler222222) | ((29360128 & i152222) == 8388608 ? true : z7) | ((1879048192 & i5) == 536870912 ? true : z7) | startRestartGroup.changedInstance(set) | startRestartGroup.changedInstance(set2) | ((29360128 & i5) == 8388608) | ((i5 & 14) == 4) | ((i152222 & 112) == 32) | ((i152222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((i152222 & 14) == 4) | ((3670016 & i152222) == 1048576) | ((234881024 & i152222) == 67108864);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        i12 = i152222;
        final Long l4222222 = l2;
        final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel4222222 = varietyBetRestrictionInfoModel2;
        final boolean z10222222 = z6;
        boxScopeInstance2 = boxScopeInstance;
        final boolean z11222222 = z5;
        final Function1 function15222222 = function13;
        final Function0 function05222222 = function03;
        Function1 function16222222 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
                BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31 = MatchBetGroupsTabContentKt.BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(list, map, l4222222, varietyBetRestrictionInfoModel4222222, function1, atomicReference222222, handler222222, z10222222, oddType, set, set2, function2, i, function22, z, z11222222, num, function15222222, function05222222, (LazyListScope) obj2);
                return BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31;
            }
        };
        composer2 = startRestartGroup;
        composer2.updateRememberedValue(function16222222);
        rememberedValue3 = function16222222;
        composer2.endReplaceGroup();
        LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default222222, rememberLazyListStateWithoutSavedState222222, null, false, null, null, null, false, null, (Function1) rememberedValue3, composer2, 0, 508);
        Integer valueOf222222 = Integer.valueOf(list.size());
        composer2.startReplaceGroup(-1633490746);
        changedInstance2 = composer2.changedInstance(list) | ((i12 & 458752) == 131072);
        Object rememberedValue4222222 = composer2.rememberedValue();
        if (changedInstance2) {
        }
        obj = null;
        matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 = new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(list, function0, null);
        composer2.updateRememberedValue(matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1);
        composer2.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) matchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1, composer2, 0);
        composer2.startReplaceGroup(-477162259);
        if (z3) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z8 = z6;
        function04 = function03;
        l3 = l2;
        varietyBetRestrictionInfoModel3 = varietyBetRestrictionInfoModel2;
        z9 = z5;
        function14 = function13;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void BetGroupsTabContentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1965585775);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1965585775, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabContentPreview (MatchBetGroupsTabContent.kt:447)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BetGroupsTabContentPreview$lambda$38;
                    BetGroupsTabContentPreview$lambda$38 = MatchBetGroupsTabContentKt.BetGroupsTabContentPreview$lambda$38(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BetGroupsTabContentPreview$lambda$38;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31(final List list, final Map map, final Long l, final VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel, final Function1 function1, final AtomicReference atomicReference, final Handler handler, final boolean z, final OddType oddType, final Set set, final Set set2, final Function2 function2, final int i, final Function2 function22, final boolean z2, final boolean z3, final Integer num, final Function1 function12, final Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                return invoke(num2.intValue());
            }

            public final Object invoke(int i2) {
                list.get(i2);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$BetGroupsPageContent$lambda$36$lambda$35$lambda$32$lambda$31$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num2, Composer composer, Integer num3) {
                invoke(lazyItemScope, num2.intValue(), composer, num3.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                Modifier.Companion companion;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & Opcodes.I2S) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) list.get(i2);
                composer.startReplaceGroup(2068016149);
                final long id = matchVarietyGroupBetsModel.getGroup().getId();
                Boolean bool = (Boolean) map.get(Long.valueOf(id));
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                boolean z4 = i2 == 0;
                VarietyBetRestrictionRuleModel findEnforcedRuleForVariety = VarietyBetRestrictions.INSTANCE.findEnforcedRuleForVariety(l, varietyBetRestrictionInfoModel);
                long enforcedMinStakeForVariety = VarietyBetRestrictions.INSTANCE.enforcedMinStakeForVariety(l, varietyBetRestrictionInfoModel);
                String name = matchVarietyGroupBetsModel.getGroup().getName();
                List<MatchVarietyBetOptionModel> bets = matchVarietyGroupBetsModel.getBets();
                boolean z5 = !matchVarietyGroupBetsModel.getGroup().getUserAvailable();
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(8), 7, null);
                composer.startReplaceGroup(-210341646);
                if (z4 && function1 != null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer.startReplaceGroup(-1746271574);
                    boolean changedInstance = composer.changedInstance(atomicReference) | composer.changedInstance(handler) | composer.changed(function1);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final AtomicReference atomicReference2 = atomicReference;
                        final Handler handler2 = handler;
                        final Function1 function13 = function1;
                        rememberedValue = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LayoutCoordinates coordinates) {
                                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                                long positionInWindow = LayoutCoordinatesKt.positionInWindow(coordinates);
                                long mo6536getSizeYbymL2g = coordinates.mo6536getSizeYbymL2g();
                                int i5 = (int) (positionInWindow >> 32);
                                int i6 = (int) (positionInWindow & 4294967295L);
                                final Rect rect = new Rect((int) Float.intBitsToFloat(i5), (int) Float.intBitsToFloat(i6), ((int) Float.intBitsToFloat(i5)) + ((int) (mo6536getSizeYbymL2g >> 32)), ((int) Float.intBitsToFloat(i6)) + ((int) (mo6536getSizeYbymL2g & 4294967295L)));
                                if (Intrinsics.areEqual(rect, atomicReference2.get())) {
                                    return;
                                }
                                atomicReference2.set(rect);
                                Handler handler3 = handler2;
                                final Function1<Rect, Unit> function14 = function13;
                                handler3.post(new Runnable() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$1$1$1$1$1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        function14.invoke(rect);
                                    }
                                });
                                Log.d("MatchBetGroupsTabContent", "First bet group bounds reported: " + rect);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    companion = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) rememberedValue);
                } else {
                    companion = Modifier.INSTANCE;
                }
                composer.endReplaceGroup();
                Modifier then = m1520paddingqDBjuR0$default.then(companion);
                int displayColumns = matchVarietyGroupBetsModel.getGroup().getDisplayColumns();
                String id2 = findEnforcedRuleForVariety != null ? findEnforcedRuleForVariety.getId() : null;
                boolean z6 = z && findEnforcedRuleForVariety != null && enforcedMinStakeForVariety > 0;
                OddType oddType2 = oddType;
                Set set3 = set;
                Set set4 = set2;
                composer.startReplaceGroup(-1746271574);
                boolean changed = composer.changed(function2) | composer.changed(i) | composer.changed(id);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function2 function23 = function2;
                    final int i5 = i;
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function23.invoke(Integer.valueOf(i5), Long.valueOf(id));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean changed2 = composer.changed(function22) | composer.changed(id);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final Function2 function24 = function22;
                    rememberedValue3 = (Function2) new Function2<Integer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$1$1$1$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num2, Integer num3) {
                            invoke(num2.intValue(), num3.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i6, int i7) {
                            function24.invoke(Long.valueOf(id), Integer.valueOf(i7));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                BetGroupCardKt.BetGroupCard(then, name, bets, oddType2, booleanValue, set3, set4, function02, (Function2) rememberedValue3, z5, displayColumns, z2, z3, num, function12, id2, z6, enforcedMinStakeForVariety, function0, composer, 0, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
