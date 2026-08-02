package org.betup.ui.fragment.matches.details.compose;

import android.graphics.Rect;
import android.os.Bundle;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.LeagueModelShort;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetInfoModel;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.SportModelShort;
import org.betup.model.remote.entity.matches.details.TeamModelShort;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import org.betup.model.remote.entity.messaging.MessageModel;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.basetabs.MatchDetailsButtonTabs;
import org.betup.ui.fragment.matches.details.compose.tabs.BattlesTabKt;
import org.betup.ui.fragment.matches.details.compose.tabs.CommentsTabKt;
import org.betup.ui.fragment.matches.details.compose.tabs.QuizTabKt;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt;
import org.betup.ui.fragment.matches.details.compose.tabs.comments.MatchCommentsCallbacks;
import org.betup.ui.fragment.matches.details.compose.tabs.comments.MatchCommentsState;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.StatisticsTabContentKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryCategoryUiItem;
import org.betup.ui.fragment.user.compose.messages.MessagesModelsKt;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.betup.utils.DateHelper;
import org.betup.utils.NavigationHelper;
import org.betup.utils.UiExtensionsKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: MatchDetailsScreen.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¸\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u008a\u0084\u0002²\u0006\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001fX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001fX\u008a\u0084\u0002²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001fX\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001fX\u008a\u0084\u0002²\u0006\u0010\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100.X\u008a\u0084\u0002²\u0006\u0010\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100.X\u008a\u0084\u0002²\u0006\"\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190101X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0010\u00104\u001a\b\u0012\u0004\u0012\u0002050\u001fX\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u00108\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"MatchDetailsScreen", "", "onBackClick", "Lkotlin/Function0;", "onNotificationClick", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "onOpenOneClickBetSettings", "onFirstBetGroupBounds", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onBetSectionReady", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "onBaseMatchItemBounds", "onHistoryMatchClick", "", "Lkotlin/ParameterName;", "name", "matchId", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/fragment/matches/details/MatchDetailsController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/tour/compose/TourState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "match", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "isSubscribed", "", "oneClickBetEnabled", "isLoading", "selectedTabIndex", "", "subMatches", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "tabItems", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "matchBaseData", "Lorg/betup/ui/fragment/matches/details/compose/MatchTopBaseData;", "selectedBetGroupTabIndex", "betGroups", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "myPlacedBets", "Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetInfoModel;", "isMyPlacedBetsLoading", "finishedMatchUpcomingCategories", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "selectedBetIds", "", "validatingBetIds", "expandedStatesPerTab", "", "showPlayerStatsMinStakeInfo", "playerStatsMinStake", "commentMessages", "Lorg/betup/model/remote/entity/messaging/ExtendedMessageModel;", "isCommentsLoading", "isCommentsLoadingMore", "hasMoreComments", "isSendingComment", "isInputFocused"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchDetailsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$86(Function0 function0, Function0 function02, MatchDetailsController matchDetailsController, Function0 function03, Function1 function1, Function0 function04, TourState tourState, Function1 function12, Function1 function13, int i, int i2, Composer composer, int i3) {
        MatchDetailsScreen(function0, function02, matchDetailsController, function03, function1, function04, tourState, function12, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0473, code lost:
    
        if (java.lang.Boolean.valueOf(!kotlin.text.StringsKt.isBlank(r6)).booleanValue() != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x057f, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0878, code lost:
    
        if (r38.intValue() <= 0) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0d5d, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0d84, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0dab, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0dd2, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0df9, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0e20, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0e47, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0a77, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0a9d, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01bb, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02c9, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0376, code lost:
    
        if (r2 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03ad, code lost:
    
        if (r2 != null) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0ee9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0f05  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0eec  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0dcc  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0df3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0e1a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0e41  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0cfc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0f57  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchDetailsScreen(final Function0<Unit> onBackClick, final Function0<Unit> onNotificationClick, final MatchDetailsController controller, final Function0<Unit> onOpenOneClickBetSettings, Function1<? super Rect, Unit> function1, Function0<Unit> function0, TourState tourState, Function1<? super Rect, Unit> function12, Function1<? super Long, Unit> function13, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Function1<? super Rect, Unit> function14;
        int i7;
        boolean changed;
        Object obj;
        final State collectAsState;
        State collectAsState2;
        MatchTopBaseData MatchDetailsScreen$lambda$8;
        boolean changed2;
        Date sendDate;
        String timeFromTimestamp;
        Object obj2;
        String name;
        String str;
        TeamModelShort homeTeam;
        String name2;
        String str2;
        TeamModelShort awayTeam;
        MatchShortInfoModel MatchDetailsScreen$lambda$1;
        String str3;
        TeamModelShort homeTeam2;
        String photoUrl;
        MatchShortInfoModel MatchDetailsScreen$lambda$12;
        String str4;
        TeamModelShort awayTeam2;
        String photoUrl2;
        String str5;
        char c;
        int i8;
        String str6;
        String date;
        String dateTime;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        boolean changedInstance3;
        Object rememberedValue3;
        boolean changedInstance4;
        Object obj3;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        MatchShortInfoModel MatchDetailsScreen$lambda$13;
        String name3;
        SportModelShort sport;
        MatchShortInfoModel MatchDetailsScreen$lambda$14;
        String photoUrl3;
        SportModelShort sport2;
        final MatchShortInfoModel MatchDetailsScreen$lambda$15;
        Integer num;
        String str7;
        Function0 function02;
        String str8;
        Function1 function15;
        Object obj4;
        Object obj5;
        State state;
        Function1<? super Rect, Unit> function16;
        String str9;
        int i9;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        int MatchDetailsScreen$lambda$5;
        boolean z;
        Map<Long, Boolean> map;
        Integer num2;
        int sportId;
        MatchShortInfoModel MatchDetailsScreen$lambda$16;
        Integer num3;
        MatchState matchStat;
        Integer valueOf;
        boolean z2;
        TourStep tourStep;
        boolean z3;
        boolean changedInstance5;
        Object obj6;
        boolean changedInstance6;
        Object obj7;
        boolean changedInstance7;
        Object obj8;
        boolean changedInstance8;
        Object obj9;
        boolean changedInstance9;
        Object obj10;
        boolean changedInstance10;
        Object obj11;
        boolean changedInstance11;
        Object obj12;
        SportModelShort sport3;
        Composer composer2;
        boolean changed3;
        MatchDetailsScreenKt$MatchDetailsScreen$2$2$1 rememberedValue5;
        final Function1<? super Rect, Unit> function17;
        final Function0<Unit> function03;
        final TourState tourState2;
        final Function1<? super Long, Unit> function18;
        final Function1<? super Rect, Unit> function19;
        LeagueModelShort league;
        LeagueModelShort league2;
        LeagueModelShort league3;
        char c2;
        String scoreFirstTeam;
        String scoreSecondTeam;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onNotificationClick, "onNotificationClick");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onOpenOneClickBetSettings, "onOpenOneClickBetSettings");
        Composer startRestartGroup = composer.startRestartGroup(327744306);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(onBackClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onNotificationClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(controller) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onOpenOneClickBetSettings) ? 2048 : 1024;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(tourState) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    function14 = function12;
                } else {
                    function14 = function12;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                    }
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function13) ? 67108864 : 33554432;
                }
                if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                    Function1<? super Rect, Unit> function110 = i10 != 0 ? null : function1;
                    Function0<Unit> function04 = i4 != 0 ? null : function0;
                    TourState tourState3 = i5 != 0 ? null : tourState;
                    Function1<? super Rect, Unit> function111 = i6 != 0 ? null : function14;
                    Function1<? super Long, Unit> function112 = i7 != 0 ? null : function13;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(327744306, i3, -1, "org.betup.ui.fragment.matches.details.compose.MatchDetailsScreen (MatchDetailsScreen.kt:55)");
                    }
                    boolean isTourActive = tourState3 != null ? tourState3.isTourActive() : false;
                    TourStep currentStep = tourState3 != null ? tourState3.getCurrentStep() : null;
                    boolean isBetSectionReady = tourState3 != null ? tourState3.isBetSectionReady() : false;
                    Boolean valueOf2 = Boolean.valueOf(isTourActive);
                    Boolean valueOf3 = Boolean.valueOf(isBetSectionReady);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changed = startRestartGroup.changed(currentStep == null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(isBetSectionReady);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed) {
                        obj = rememberedValue6;
                    }
                    MatchDetailsScreenKt$MatchDetailsScreen$1$1 matchDetailsScreenKt$MatchDetailsScreen$1$1 = new MatchDetailsScreenKt$MatchDetailsScreen$1$1(isTourActive, currentStep, isBetSectionReady, null);
                    startRestartGroup.updateRememberedValue(matchDetailsScreenKt$MatchDetailsScreen$1$1);
                    obj = matchDetailsScreenKt$MatchDetailsScreen$1$1;
                    startRestartGroup.endReplaceGroup();
                    TourStep tourStep2 = currentStep;
                    EffectsKt.LaunchedEffect(valueOf2, tourStep2, valueOf3, (Function2) obj, startRestartGroup, 0);
                    collectAsState = SnapshotStateKt.collectAsState(controller.getCurrentMatch(), null, startRestartGroup, 0, 1);
                    boolean z4 = isBetSectionReady;
                    State collectAsState3 = SnapshotStateKt.collectAsState(controller.isSubscribed(), null, startRestartGroup, 0, 1);
                    State collectAsState4 = SnapshotStateKt.collectAsState(controller.getOneClickBetEnabled(), null, startRestartGroup, 0, 1);
                    State collectAsState5 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                    collectAsState2 = SnapshotStateKt.collectAsState(controller.getSelectedTabIndex(), null, startRestartGroup, 0, 1);
                    State collectAsState6 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
                    State collectAsState7 = SnapshotStateKt.collectAsState(controller.getTabItems(), null, startRestartGroup, 0, 1);
                    State collectAsState8 = SnapshotStateKt.collectAsState(controller.getDisplayBaseMatchInfo(), null, startRestartGroup, 0, 1);
                    State collectAsState9 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
                    State collectAsState10 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
                    State collectAsState11 = SnapshotStateKt.collectAsState(controller.getMyPlacedBets(), null, startRestartGroup, 0, 1);
                    State collectAsState12 = SnapshotStateKt.collectAsState(controller.isMyPlacedBetsLoading(), null, startRestartGroup, 0, 1);
                    State collectAsState13 = SnapshotStateKt.collectAsState(controller.getFinishedMatchUpcomingCategories(), null, startRestartGroup, 0, 1);
                    State collectAsState14 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
                    State collectAsState15 = SnapshotStateKt.collectAsState(controller.getValidatingBetIds(), null, startRestartGroup, 0, 1);
                    State collectAsState16 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
                    State collectAsState17 = SnapshotStateKt.collectAsState(controller.getShowPlayerStatsMinStakeInfo(), null, startRestartGroup, 0, 1);
                    State collectAsState18 = SnapshotStateKt.collectAsState(controller.getPlayerStatsMinStake(), null, startRestartGroup, 0, 1);
                    MatchDetailsScreen$lambda$8 = MatchDetailsScreen$lambda$8(collectAsState8);
                    State collectAsState19 = SnapshotStateKt.collectAsState(controller.getMatchComments(), null, startRestartGroup, 0, 1);
                    State collectAsState20 = SnapshotStateKt.collectAsState(controller.isMatchCommentsLoading(), null, startRestartGroup, 0, 1);
                    boolean z5 = isTourActive;
                    State collectAsState21 = SnapshotStateKt.collectAsState(controller.isMatchCommentsLoadingMore(), null, startRestartGroup, 0, 1);
                    final Function1<? super Rect, Unit> function113 = function111;
                    State collectAsState22 = SnapshotStateKt.collectAsState(controller.getHasMoreMatchComments(), null, startRestartGroup, 0, 1);
                    State collectAsState23 = SnapshotStateKt.collectAsState(controller.isSendingMatchComment(), null, startRestartGroup, 0, 1);
                    int currentUserId = controller.getCurrentUserId();
                    List<ExtendedMessageModel> MatchDetailsScreen$lambda$19 = MatchDetailsScreen$lambda$19(collectAsState19);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed2 = startRestartGroup.changed(MatchDetailsScreen$lambda$19) | startRestartGroup.changed(currentUserId);
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                        obj2 = rememberedValue7;
                    }
                    List<ExtendedMessageModel> MatchDetailsScreen$lambda$192 = MatchDetailsScreen$lambda$19(collectAsState19);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(MatchDetailsScreen$lambda$192, 10));
                    for (ExtendedMessageModel extendedMessageModel : MatchDetailsScreen$lambda$192) {
                        MessageModel message = extendedMessageModel.getMessage();
                        arrayList.add(MessagesModelsKt.toBubbleUi(extendedMessageModel, currentUserId, (message == null || (sendDate = message.getSendDate()) == null || (timeFromTimestamp = DateHelper.getTimeFromTimestamp(sendDate.getTime())) == null) ? "" : timeFromTimestamp));
                    }
                    ArrayList arrayList2 = arrayList;
                    startRestartGroup.updateRememberedValue(arrayList2);
                    obj2 = arrayList2;
                    List list = (List) obj2;
                    startRestartGroup.endReplaceGroup();
                    if (MatchDetailsScreen$lambda$8 != null || (name = MatchDetailsScreen$lambda$8.getFirstTeamName()) == null) {
                        MatchShortInfoModel MatchDetailsScreen$lambda$17 = MatchDetailsScreen$lambda$1(collectAsState);
                        name = (MatchDetailsScreen$lambda$17 != null || (homeTeam = MatchDetailsScreen$lambda$17.getHomeTeam()) == null) ? null : homeTeam.getName();
                        if (name == null) {
                            str = "";
                            if (MatchDetailsScreen$lambda$8 != null || (name2 = MatchDetailsScreen$lambda$8.getSecondTeamName()) == null) {
                                MatchShortInfoModel MatchDetailsScreen$lambda$18 = MatchDetailsScreen$lambda$1(collectAsState);
                                name2 = (MatchDetailsScreen$lambda$18 != null || (awayTeam = MatchDetailsScreen$lambda$18.getAwayTeam()) == null) ? null : awayTeam.getName();
                                if (name2 == null) {
                                    str2 = "";
                                    if (MatchDetailsScreen$lambda$8 != null && (photoUrl = MatchDetailsScreen$lambda$8.getFirstTeamImage()) != null) {
                                        if (StringsKt.isBlank(photoUrl)) {
                                            photoUrl = null;
                                        }
                                    }
                                    MatchDetailsScreen$lambda$1 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$1 != null || (homeTeam2 = MatchDetailsScreen$lambda$1.getHomeTeam()) == null || (photoUrl = homeTeam2.getPhotoUrl()) == null || StringsKt.isBlank(photoUrl)) {
                                        str3 = null;
                                        if (MatchDetailsScreen$lambda$8 != null && (photoUrl2 = MatchDetailsScreen$lambda$8.getSecondTeamImage()) != null) {
                                            if (StringsKt.isBlank(photoUrl2)) {
                                                photoUrl2 = null;
                                            }
                                        }
                                        MatchDetailsScreen$lambda$12 = MatchDetailsScreen$lambda$1(collectAsState);
                                        if (MatchDetailsScreen$lambda$12 != null || (awayTeam2 = MatchDetailsScreen$lambda$12.getAwayTeam()) == null || (photoUrl2 = awayTeam2.getPhotoUrl()) == null || StringsKt.isBlank(photoUrl2)) {
                                            str4 = null;
                                            MatchShortInfoModel MatchDetailsScreen$lambda$110 = MatchDetailsScreen$lambda$1(collectAsState);
                                            boolean z6 = MatchDetailsScreen$lambda$110 != null ? MatchState.fromInt(MatchDetailsScreen$lambda$110.getMatchState()) == MatchState.LIVE : false;
                                            if (MatchDetailsScreen$lambda$8 != null && MatchDetailsScreen$lambda$8.isScoreAvailable()) {
                                                scoreFirstTeam = MatchDetailsScreen$lambda$8.getScoreFirstTeam();
                                                if (scoreFirstTeam == null) {
                                                    scoreFirstTeam = "";
                                                }
                                                scoreSecondTeam = MatchDetailsScreen$lambda$8.getScoreSecondTeam();
                                                if (scoreSecondTeam == null) {
                                                    scoreSecondTeam = "";
                                                }
                                                if (!StringsKt.isBlank(scoreFirstTeam) && !StringsKt.isBlank(scoreSecondTeam)) {
                                                    str5 = scoreFirstTeam + " - " + scoreSecondTeam;
                                                    if (MatchDetailsScreen$lambda$8 == null) {
                                                        c = 0;
                                                        i8 = 2;
                                                    } else if (MatchDetailsScreen$lambda$8.isScoreAvailable()) {
                                                        i8 = 2;
                                                        String[] strArr = new String[2];
                                                        String playTimeName = MatchDetailsScreen$lambda$8.getPlayTimeName();
                                                        if (Boolean.valueOf(!StringsKt.isBlank(playTimeName)).booleanValue()) {
                                                            c = 0;
                                                        } else {
                                                            c = 0;
                                                            playTimeName = null;
                                                        }
                                                        strArr[c] = playTimeName;
                                                        String playTime = MatchDetailsScreen$lambda$8.getPlayTime();
                                                        if (playTime != null) {
                                                            c2 = 1;
                                                        } else {
                                                            c2 = 1;
                                                        }
                                                        playTime = null;
                                                        strArr[c2] = playTime;
                                                        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), " ", null, null, 0, null, null, 62, null);
                                                        if (StringsKt.isBlank(joinToString$default)) {
                                                            joinToString$default = MatchDetailsScreen$lambda$8.getCurrentTimeForMatchDetail();
                                                        }
                                                        dateTime = joinToString$default;
                                                        str6 = dateTime;
                                                        MatchShortInfoModel MatchDetailsScreen$lambda$111 = MatchDetailsScreen$lambda$1(collectAsState);
                                                        MatchCommentsState matchCommentsState = new MatchCommentsState(MatchDetailsScreen$lambda$111 != null ? Long.valueOf(MatchDetailsScreen$lambda$111.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                                                        startRestartGroup.startReplaceGroup(5004770);
                                                        changedInstance = startRestartGroup.changedInstance(controller);
                                                        rememberedValue = startRestartGroup.rememberedValue();
                                                        if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$37$lambda$36;
                                                                    MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                                                    return MatchDetailsScreen$lambda$37$lambda$36;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                                        }
                                                        Function0 function05 = (Function0) rememberedValue;
                                                        startRestartGroup.endReplaceGroup();
                                                        startRestartGroup.startReplaceGroup(5004770);
                                                        changedInstance2 = startRestartGroup.changedInstance(controller);
                                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                                        if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$39$lambda$38;
                                                                    MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                                                    return MatchDetailsScreen$lambda$39$lambda$38;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                                        }
                                                        Function0 function06 = (Function0) rememberedValue2;
                                                        startRestartGroup.endReplaceGroup();
                                                        startRestartGroup.startReplaceGroup(5004770);
                                                        changedInstance3 = startRestartGroup.changedInstance(controller);
                                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                                        if (!changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj13) {
                                                                    Unit MatchDetailsScreen$lambda$41$lambda$40;
                                                                    MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                                                    return MatchDetailsScreen$lambda$41$lambda$40;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        MatchCommentsCallbacks matchCommentsCallbacks = new MatchCommentsCallbacks(function05, function06, (Function1) rememberedValue3);
                                                        boolean MatchDetailsScreen$lambda$4 = MatchDetailsScreen$lambda$4(collectAsState5);
                                                        startRestartGroup.startReplaceGroup(5004770);
                                                        changedInstance4 = startRestartGroup.changedInstance(controller);
                                                        Object rememberedValue8 = startRestartGroup.rememberedValue();
                                                        if (!changedInstance4) {
                                                            obj3 = rememberedValue8;
                                                        }
                                                        Function0 function07 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit MatchDetailsScreen$lambda$43$lambda$42;
                                                                MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                                                return MatchDetailsScreen$lambda$43$lambda$42;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(function07);
                                                        obj3 = function07;
                                                        startRestartGroup.endReplaceGroup();
                                                        boolean z7 = c;
                                                        int i11 = i8;
                                                        PullRefreshState m2661rememberPullRefreshStateUuyPYSY = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$4, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                                        startRestartGroup.startReplaceGroup(1849434622);
                                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z7), null, i11, null);
                                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                                        }
                                                        final MutableState mutableState = (MutableState) rememberedValue4;
                                                        startRestartGroup.endReplaceGroup();
                                                        boolean z8 = (MatchDetailsScreen$lambda$5(collectAsState2) == i11 || !MatchDetailsScreen$lambda$45(mutableState)) ? z7 ? 1 : 0 : true;
                                                        Modifier pullRefresh$default = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY, z7, i11, null);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z7);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z7 ? 1 : 0);
                                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default);
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
                                                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                                                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                                                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                        float f = 12;
                                                        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f), 0.0f, 2, null);
                                                        MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                                                        if (MatchDetailsScreen$lambda$13 != null || (league3 = MatchDetailsScreen$lambda$13.getLeague()) == null || (name3 = league3.getName()) == null) {
                                                            MatchShortInfoModel MatchDetailsScreen$lambda$112 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            name3 = (MatchDetailsScreen$lambda$112 != null || (sport = MatchDetailsScreen$lambda$112.getSport()) == null) ? "" : sport.getName();
                                                        }
                                                        MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                                                        if (MatchDetailsScreen$lambda$14 != null || (league2 = MatchDetailsScreen$lambda$14.getLeague()) == null || (photoUrl3 = league2.getPhotoUrl()) == null) {
                                                            MatchShortInfoModel MatchDetailsScreen$lambda$113 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            photoUrl3 = (MatchDetailsScreen$lambda$113 != null || (sport2 = MatchDetailsScreen$lambda$113.getSport()) == null) ? "" : sport2.getPhotoUrl();
                                                        }
                                                        boolean MatchDetailsScreen$lambda$2 = MatchDetailsScreen$lambda$2(collectAsState3);
                                                        startRestartGroup.startReplaceGroup(790956202);
                                                        MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                                                        if (MatchDetailsScreen$lambda$15 != null && (league = MatchDetailsScreen$lambda$15.getLeague()) != null) {
                                                            num = Integer.valueOf(league.getId());
                                                        }
                                                        num = null;
                                                        startRestartGroup.startReplaceGroup(790959342);
                                                        if (num == null) {
                                                            str7 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                                            function02 = null;
                                                        } else {
                                                            final int intValue = num.intValue();
                                                            startRestartGroup.startReplaceGroup(-1633490746);
                                                            boolean changed4 = startRestartGroup.changed(intValue) | startRestartGroup.changedInstance(MatchDetailsScreen$lambda$15);
                                                            str7 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                                                            Object rememberedValue9 = startRestartGroup.rememberedValue();
                                                            if (changed4 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda2
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$51$lambda$50$lambda$49$lambda$48;
                                                                        MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$51$lambda$50$lambda$49$lambda$48 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$51$lambda$50$lambda$49$lambda$48(intValue, MatchDetailsScreen$lambda$15);
                                                                        return MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$51$lambda$50$lambda$49$lambda$48;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            function02 = (Function0) rememberedValue9;
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        startRestartGroup.endReplaceGroup();
                                                        int i12 = i3;
                                                        String str10 = str7;
                                                        MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$2, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                                                        startRestartGroup.startReplaceGroup(790972505);
                                                        if (MatchDetailsScreen$lambda$8 == null) {
                                                            state = collectAsState;
                                                            str8 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                                            str9 = str10;
                                                            function16 = function113;
                                                            i9 = 733328855;
                                                        } else {
                                                            Modifier then = AnimationModifierKt.animateContentSize$default(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), AnimationSpecKt.tween$default(200, 0, null, 6, null), null, 2, null).then(z8 ? SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(130)) : SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null));
                                                            str8 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, str8);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str10);
                                                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                                                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            startRestartGroup.startReusableNode();
                                                            if (startRestartGroup.getInserting()) {
                                                                startRestartGroup.createNode(constructor4);
                                                            } else {
                                                                startRestartGroup.useNode();
                                                            }
                                                            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                                                            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash4);
                                                            }
                                                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                            List<MatchDetailsButtonTabs> MatchDetailsScreen$lambda$7 = MatchDetailsScreen$lambda$7(collectAsState7);
                                                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(MatchDetailsScreen$lambda$7, 10));
                                                            Iterator<T> it = MatchDetailsScreen$lambda$7.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList3.add(((MatchDetailsButtonTabs) it.next()).getBaseButtonMatchUIItem());
                                                            }
                                                            ArrayList arrayList4 = arrayList3;
                                                            startRestartGroup.startReplaceGroup(-216848200);
                                                            if (function113 == null) {
                                                                function15 = null;
                                                            } else {
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                boolean changed5 = startRestartGroup.changed(function113);
                                                                Object rememberedValue10 = startRestartGroup.rememberedValue();
                                                                if (changed5 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda3
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj13) {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$55$lambda$54$lambda$53;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$55$lambda$54$lambda$53 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$55$lambda$54$lambda$53(Function1.this, (Rect) obj13);
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$55$lambda$54$lambda$53;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(rememberedValue10);
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                function15 = (Function1) rememberedValue10;
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            boolean changed6 = startRestartGroup.changed(collectAsState);
                                                            Object rememberedValue11 = startRestartGroup.rememberedValue();
                                                            if (!changed6) {
                                                                obj4 = rememberedValue11;
                                                            }
                                                            Function0 function08 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda4
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$58$lambda$57;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$58$lambda$57 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$58$lambda$57(State.this);
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$58$lambda$57;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function08);
                                                            obj4 = function08;
                                                            Function0 function09 = (Function0) obj4;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            boolean changed7 = startRestartGroup.changed(collectAsState);
                                                            Object rememberedValue12 = startRestartGroup.rememberedValue();
                                                            if (!changed7) {
                                                                obj5 = rememberedValue12;
                                                            }
                                                            Function0 function010 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda5
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60(State.this);
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function010);
                                                            obj5 = function010;
                                                            startRestartGroup.endReplaceGroup();
                                                            state = collectAsState;
                                                            function16 = function113;
                                                            str9 = str10;
                                                            i9 = 733328855;
                                                            MatchTopBaseItemKt.MatchTopBaseItem(null, MatchDetailsScreen$lambda$8, arrayList4, function09, (Function0) obj5, function15, startRestartGroup, 0, 1);
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            startRestartGroup.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            Unit unit = Unit.INSTANCE;
                                                            Unit unit2 = Unit.INSTANCE;
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                                                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                                                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (startRestartGroup.getInserting()) {
                                                            startRestartGroup.createNode(constructor5);
                                                        } else {
                                                            startRestartGroup.useNode();
                                                        }
                                                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                                        MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                                                        if (MatchDetailsScreen$lambda$5 != 0) {
                                                            if (MatchDetailsScreen$lambda$5 == 1) {
                                                                startRestartGroup.startReplaceGroup(550071186);
                                                                StatisticsTabContentKt.StatisticsTabContent(null, controller, function112, startRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 1);
                                                                startRestartGroup.endReplaceGroup();
                                                                Unit unit3 = Unit.INSTANCE;
                                                            } else if (MatchDetailsScreen$lambda$5 == 2) {
                                                                startRestartGroup.startReplaceGroup(550077140);
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                Object rememberedValue13 = startRestartGroup.rememberedValue();
                                                                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue13 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda13
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj13) {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$81$lambda$80;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$81$lambda$80 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$81$lambda$80(MutableState.this, ((Boolean) obj13).booleanValue());
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$81$lambda$80;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                CommentsTabKt.CommentsTabContent(matchCommentsState, matchCommentsCallbacks, null, (Function1) rememberedValue13, startRestartGroup, 3072, 4);
                                                                startRestartGroup.endReplaceGroup();
                                                                Unit unit4 = Unit.INSTANCE;
                                                            } else if (MatchDetailsScreen$lambda$5 == 3) {
                                                                startRestartGroup.startReplaceGroup(550084990);
                                                                BattlesTabKt.BattlesTabContent(null, controller, startRestartGroup, (i12 >> 3) & 112, 1);
                                                                startRestartGroup.endReplaceGroup();
                                                                Unit unit5 = Unit.INSTANCE;
                                                            } else if (MatchDetailsScreen$lambda$5 != 4) {
                                                                startRestartGroup.startReplaceGroup(-127111794);
                                                                startRestartGroup.endReplaceGroup();
                                                                Unit unit6 = Unit.INSTANCE;
                                                            } else {
                                                                startRestartGroup.startReplaceGroup(550087163);
                                                                QuizTabKt.QuizTabContent(null, controller, startRestartGroup, (i12 >> 3) & 112, 1);
                                                                startRestartGroup.endReplaceGroup();
                                                                Unit unit7 = Unit.INSTANCE;
                                                            }
                                                            tourStep = tourStep2;
                                                            z2 = z5;
                                                        } else {
                                                            startRestartGroup.startReplaceGroup(-130544424);
                                                            List<BetGroupsTabs> MatchDetailsScreen$lambda$6 = MatchDetailsScreen$lambda$6(collectAsState6);
                                                            int MatchDetailsScreen$lambda$9 = MatchDetailsScreen$lambda$9(collectAsState9);
                                                            List<MatchVarietyGroupBetsModel> MatchDetailsScreen$lambda$10 = MatchDetailsScreen$lambda$10(collectAsState10);
                                                            Set<Long> MatchDetailsScreen$lambda$142 = MatchDetailsScreen$lambda$14(collectAsState14);
                                                            Set<Long> MatchDetailsScreen$lambda$152 = MatchDetailsScreen$lambda$15(collectAsState15);
                                                            Map<Long, Boolean> map2 = MatchDetailsScreen$lambda$16(collectAsState16).get(Integer.valueOf(MatchDetailsScreen$lambda$9(collectAsState9)));
                                                            if (map2 == null) {
                                                                List<MatchVarietyGroupBetsModel> MatchDetailsScreen$lambda$102 = MatchDetailsScreen$lambda$10(collectAsState10);
                                                                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(MatchDetailsScreen$lambda$102, 10)), 16));
                                                                Iterator<T> it2 = MatchDetailsScreen$lambda$102.iterator();
                                                                while (it2.hasNext()) {
                                                                    Pair pair = TuplesKt.to(Long.valueOf(((MatchVarietyGroupBetsModel) it2.next()).getGroup().getId()), false);
                                                                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                                                                }
                                                                z = false;
                                                                map = linkedHashMap;
                                                            } else {
                                                                z = false;
                                                                map = map2;
                                                            }
                                                            Map<Integer, Map<Long, Boolean>> MatchDetailsScreen$lambda$162 = MatchDetailsScreen$lambda$16(collectAsState16);
                                                            OddType oddType = controller.getOddType();
                                                            MatchShortInfoModel MatchDetailsScreen$lambda$114 = MatchDetailsScreen$lambda$1(state);
                                                            if (MatchDetailsScreen$lambda$114 != null && (sport3 = MatchDetailsScreen$lambda$114.getSport()) != null) {
                                                                sportId = sport3.getId();
                                                            } else if (MatchDetailsScreen$lambda$8 != null) {
                                                                sportId = MatchDetailsScreen$lambda$8.getSportId();
                                                            } else {
                                                                num2 = null;
                                                                MatchShortInfoModel MatchDetailsScreen$lambda$115 = MatchDetailsScreen$lambda$1(state);
                                                                String resultRaw = MatchDetailsScreen$lambda$115 == null ? MatchDetailsScreen$lambda$115.getResultRaw() : null;
                                                                MatchDetailsScreen$lambda$16 = MatchDetailsScreen$lambda$1(state);
                                                                if (MatchDetailsScreen$lambda$16 == null) {
                                                                    valueOf = Integer.valueOf(MatchDetailsScreen$lambda$16.getMatchState());
                                                                } else if (MatchDetailsScreen$lambda$8 == null || (matchStat = MatchDetailsScreen$lambda$8.getMatchStat()) == null) {
                                                                    num3 = null;
                                                                    z2 = z5;
                                                                    if (z2) {
                                                                        tourStep = tourStep2;
                                                                        if (tourStep == TourStep.SELECT_MATCH) {
                                                                            z3 = true;
                                                                            boolean MatchDetailsScreen$lambda$172 = MatchDetailsScreen$lambda$17(collectAsState17);
                                                                            long MatchDetailsScreen$lambda$182 = MatchDetailsScreen$lambda$18(collectAsState18);
                                                                            List<MatchPlacedBetInfoModel> MatchDetailsScreen$lambda$11 = MatchDetailsScreen$lambda$11(collectAsState11);
                                                                            boolean MatchDetailsScreen$lambda$122 = MatchDetailsScreen$lambda$12(collectAsState12);
                                                                            List<MatchHistoryCategoryUiItem> MatchDetailsScreen$lambda$132 = MatchDetailsScreen$lambda$13(collectAsState13);
                                                                            startRestartGroup.startReplaceGroup(5004770);
                                                                            changedInstance5 = startRestartGroup.changedInstance(controller);
                                                                            Object rememberedValue14 = startRestartGroup.rememberedValue();
                                                                            if (!changedInstance5) {
                                                                                obj6 = rememberedValue14;
                                                                            }
                                                                            Function1 function114 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda6
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj13) {
                                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66(MatchDetailsController.this, ((Integer) obj13).intValue());
                                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                                }
                                                                            };
                                                                            startRestartGroup.updateRememberedValue(function114);
                                                                            obj6 = function114;
                                                                            Function1 function115 = (Function1) obj6;
                                                                            startRestartGroup.endReplaceGroup();
                                                                            startRestartGroup.startReplaceGroup(5004770);
                                                                            changedInstance6 = startRestartGroup.changedInstance(controller);
                                                                            Object rememberedValue15 = startRestartGroup.rememberedValue();
                                                                            if (!changedInstance6) {
                                                                                obj7 = rememberedValue15;
                                                                            }
                                                                            Function2 function2 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda7
                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                public final Object invoke(Object obj13, Object obj14) {
                                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68(MatchDetailsController.this, ((Long) obj13).longValue(), ((Integer) obj14).intValue());
                                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                                }
                                                                            };
                                                                            startRestartGroup.updateRememberedValue(function2);
                                                                            obj7 = function2;
                                                                            Function2 function22 = (Function2) obj7;
                                                                            startRestartGroup.endReplaceGroup();
                                                                            startRestartGroup.startReplaceGroup(5004770);
                                                                            changedInstance7 = startRestartGroup.changedInstance(controller);
                                                                            Object rememberedValue16 = startRestartGroup.rememberedValue();
                                                                            if (!changedInstance7) {
                                                                                obj8 = rememberedValue16;
                                                                            }
                                                                            Function2 function23 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda8
                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                public final Object invoke(Object obj13, Object obj14) {
                                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Long) obj14).longValue());
                                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                                }
                                                                            };
                                                                            startRestartGroup.updateRememberedValue(function23);
                                                                            obj8 = function23;
                                                                            Function2 function24 = (Function2) obj8;
                                                                            startRestartGroup.endReplaceGroup();
                                                                            startRestartGroup.startReplaceGroup(5004770);
                                                                            changedInstance8 = startRestartGroup.changedInstance(controller);
                                                                            Object rememberedValue17 = startRestartGroup.rememberedValue();
                                                                            if (!changedInstance8) {
                                                                                obj9 = rememberedValue17;
                                                                            }
                                                                            Function3 function3 = new Function3() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda9
                                                                                @Override // kotlin.jvm.functions.Function3
                                                                                public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Boolean) obj14).booleanValue(), (List) obj15);
                                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                                }
                                                                            };
                                                                            startRestartGroup.updateRememberedValue(function3);
                                                                            obj9 = function3;
                                                                            Function3 function32 = (Function3) obj9;
                                                                            startRestartGroup.endReplaceGroup();
                                                                            startRestartGroup.startReplaceGroup(5004770);
                                                                            changedInstance9 = startRestartGroup.changedInstance(controller);
                                                                            Object rememberedValue18 = startRestartGroup.rememberedValue();
                                                                            if (!changedInstance9) {
                                                                                obj10 = rememberedValue18;
                                                                            }
                                                                            Function0 function011 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda10
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    List currentBets;
                                                                                    currentBets = MatchDetailsController.this.getCurrentBets();
                                                                                    return currentBets;
                                                                                }
                                                                            };
                                                                            startRestartGroup.updateRememberedValue(function011);
                                                                            obj10 = function011;
                                                                            Function0 function012 = (Function0) obj10;
                                                                            startRestartGroup.endReplaceGroup();
                                                                            startRestartGroup.startReplaceGroup(5004770);
                                                                            changedInstance10 = startRestartGroup.changedInstance(controller);
                                                                            Object rememberedValue19 = startRestartGroup.rememberedValue();
                                                                            if (!changedInstance10) {
                                                                                obj11 = rememberedValue19;
                                                                            }
                                                                            Function0 function013 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda11
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76(MatchDetailsController.this);
                                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                                }
                                                                            };
                                                                            startRestartGroup.updateRememberedValue(function013);
                                                                            obj11 = function013;
                                                                            Function0 function014 = (Function0) obj11;
                                                                            startRestartGroup.endReplaceGroup();
                                                                            startRestartGroup.startReplaceGroup(5004770);
                                                                            changedInstance11 = startRestartGroup.changedInstance(controller);
                                                                            Object rememberedValue20 = startRestartGroup.rememberedValue();
                                                                            if (!changedInstance11) {
                                                                                obj12 = rememberedValue20;
                                                                            }
                                                                            Function1 function116 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda12
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj13) {
                                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78(MatchDetailsController.this, ((Long) obj13).longValue());
                                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                                }
                                                                            };
                                                                            startRestartGroup.updateRememberedValue(function116);
                                                                            obj12 = function116;
                                                                            startRestartGroup.endReplaceGroup();
                                                                            int i13 = i12 << 12;
                                                                            MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(null, MatchDetailsScreen$lambda$6, MatchDetailsScreen$lambda$9, MatchDetailsScreen$lambda$10, function115, function22, MatchDetailsScreen$lambda$142, MatchDetailsScreen$lambda$152, map, MatchDetailsScreen$lambda$162, function24, function32, oddType, function012, false, false, false, null, function110, function04, num2, resultRaw, num3, z3, MatchDetailsScreen$lambda$172, MatchDetailsScreen$lambda$182, function014, MatchDetailsScreen$lambda$11, MatchDetailsScreen$lambda$122, (Function1) obj12, MatchDetailsScreen$lambda$132, function112, startRestartGroup, 0, (234881024 & i13) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13 & 1879048192), 0, (i12 >> 21) & 112, 212993, 0);
                                                                            startRestartGroup.endReplaceGroup();
                                                                            Unit unit8 = Unit.INSTANCE;
                                                                        }
                                                                    } else {
                                                                        tourStep = tourStep2;
                                                                    }
                                                                    z3 = z;
                                                                    boolean MatchDetailsScreen$lambda$1722 = MatchDetailsScreen$lambda$17(collectAsState17);
                                                                    long MatchDetailsScreen$lambda$1822 = MatchDetailsScreen$lambda$18(collectAsState18);
                                                                    List<MatchPlacedBetInfoModel> MatchDetailsScreen$lambda$116 = MatchDetailsScreen$lambda$11(collectAsState11);
                                                                    boolean MatchDetailsScreen$lambda$1222 = MatchDetailsScreen$lambda$12(collectAsState12);
                                                                    List<MatchHistoryCategoryUiItem> MatchDetailsScreen$lambda$1322 = MatchDetailsScreen$lambda$13(collectAsState13);
                                                                    startRestartGroup.startReplaceGroup(5004770);
                                                                    changedInstance5 = startRestartGroup.changedInstance(controller);
                                                                    Object rememberedValue142 = startRestartGroup.rememberedValue();
                                                                    if (!changedInstance5) {
                                                                    }
                                                                    Function1 function1142 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda6
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj13) {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66(MatchDetailsController.this, ((Integer) obj13).intValue());
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(function1142);
                                                                    obj6 = function1142;
                                                                    Function1 function1152 = (Function1) obj6;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    startRestartGroup.startReplaceGroup(5004770);
                                                                    changedInstance6 = startRestartGroup.changedInstance(controller);
                                                                    Object rememberedValue152 = startRestartGroup.rememberedValue();
                                                                    if (!changedInstance6) {
                                                                    }
                                                                    Function2 function25 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda7
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(Object obj13, Object obj14) {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68(MatchDetailsController.this, ((Long) obj13).longValue(), ((Integer) obj14).intValue());
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(function25);
                                                                    obj7 = function25;
                                                                    Function2 function222 = (Function2) obj7;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    startRestartGroup.startReplaceGroup(5004770);
                                                                    changedInstance7 = startRestartGroup.changedInstance(controller);
                                                                    Object rememberedValue162 = startRestartGroup.rememberedValue();
                                                                    if (!changedInstance7) {
                                                                    }
                                                                    Function2 function232 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda8
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(Object obj13, Object obj14) {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Long) obj14).longValue());
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(function232);
                                                                    obj8 = function232;
                                                                    Function2 function242 = (Function2) obj8;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    startRestartGroup.startReplaceGroup(5004770);
                                                                    changedInstance8 = startRestartGroup.changedInstance(controller);
                                                                    Object rememberedValue172 = startRestartGroup.rememberedValue();
                                                                    if (!changedInstance8) {
                                                                    }
                                                                    Function3 function33 = new Function3() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda9
                                                                        @Override // kotlin.jvm.functions.Function3
                                                                        public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Boolean) obj14).booleanValue(), (List) obj15);
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(function33);
                                                                    obj9 = function33;
                                                                    Function3 function322 = (Function3) obj9;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    startRestartGroup.startReplaceGroup(5004770);
                                                                    changedInstance9 = startRestartGroup.changedInstance(controller);
                                                                    Object rememberedValue182 = startRestartGroup.rememberedValue();
                                                                    if (!changedInstance9) {
                                                                    }
                                                                    Function0 function0112 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda10
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            List currentBets;
                                                                            currentBets = MatchDetailsController.this.getCurrentBets();
                                                                            return currentBets;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(function0112);
                                                                    obj10 = function0112;
                                                                    Function0 function0122 = (Function0) obj10;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    startRestartGroup.startReplaceGroup(5004770);
                                                                    changedInstance10 = startRestartGroup.changedInstance(controller);
                                                                    Object rememberedValue192 = startRestartGroup.rememberedValue();
                                                                    if (!changedInstance10) {
                                                                    }
                                                                    Function0 function0132 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda11
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76(MatchDetailsController.this);
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(function0132);
                                                                    obj11 = function0132;
                                                                    Function0 function0142 = (Function0) obj11;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    startRestartGroup.startReplaceGroup(5004770);
                                                                    changedInstance11 = startRestartGroup.changedInstance(controller);
                                                                    Object rememberedValue202 = startRestartGroup.rememberedValue();
                                                                    if (!changedInstance11) {
                                                                    }
                                                                    Function1 function1162 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda12
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj13) {
                                                                            Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                            MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78(MatchDetailsController.this, ((Long) obj13).longValue());
                                                                            return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                        }
                                                                    };
                                                                    startRestartGroup.updateRememberedValue(function1162);
                                                                    obj12 = function1162;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    int i132 = i12 << 12;
                                                                    MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(null, MatchDetailsScreen$lambda$6, MatchDetailsScreen$lambda$9, MatchDetailsScreen$lambda$10, function1152, function222, MatchDetailsScreen$lambda$142, MatchDetailsScreen$lambda$152, map, MatchDetailsScreen$lambda$162, function242, function322, oddType, function0122, false, false, false, null, function110, function04, num2, resultRaw, num3, z3, MatchDetailsScreen$lambda$1722, MatchDetailsScreen$lambda$1822, function0142, MatchDetailsScreen$lambda$116, MatchDetailsScreen$lambda$1222, (Function1) obj12, MatchDetailsScreen$lambda$1322, function112, startRestartGroup, 0, (234881024 & i132) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132 & 1879048192), 0, (i12 >> 21) & 112, 212993, 0);
                                                                    startRestartGroup.endReplaceGroup();
                                                                    Unit unit82 = Unit.INSTANCE;
                                                                } else {
                                                                    valueOf = Integer.valueOf(matchStat.getVal());
                                                                }
                                                                num3 = valueOf;
                                                                z2 = z5;
                                                                if (z2) {
                                                                }
                                                                z3 = z;
                                                                boolean MatchDetailsScreen$lambda$17222 = MatchDetailsScreen$lambda$17(collectAsState17);
                                                                long MatchDetailsScreen$lambda$18222 = MatchDetailsScreen$lambda$18(collectAsState18);
                                                                List<MatchPlacedBetInfoModel> MatchDetailsScreen$lambda$1162 = MatchDetailsScreen$lambda$11(collectAsState11);
                                                                boolean MatchDetailsScreen$lambda$12222 = MatchDetailsScreen$lambda$12(collectAsState12);
                                                                List<MatchHistoryCategoryUiItem> MatchDetailsScreen$lambda$13222 = MatchDetailsScreen$lambda$13(collectAsState13);
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                changedInstance5 = startRestartGroup.changedInstance(controller);
                                                                Object rememberedValue1422 = startRestartGroup.rememberedValue();
                                                                if (!changedInstance5) {
                                                                }
                                                                Function1 function11422 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda6
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj13) {
                                                                        Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                        MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66(MatchDetailsController.this, ((Integer) obj13).intValue());
                                                                        return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(function11422);
                                                                obj6 = function11422;
                                                                Function1 function11522 = (Function1) obj6;
                                                                startRestartGroup.endReplaceGroup();
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                changedInstance6 = startRestartGroup.changedInstance(controller);
                                                                Object rememberedValue1522 = startRestartGroup.rememberedValue();
                                                                if (!changedInstance6) {
                                                                }
                                                                Function2 function252 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda7
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj13, Object obj14) {
                                                                        Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                        MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68(MatchDetailsController.this, ((Long) obj13).longValue(), ((Integer) obj14).intValue());
                                                                        return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(function252);
                                                                obj7 = function252;
                                                                Function2 function2222 = (Function2) obj7;
                                                                startRestartGroup.endReplaceGroup();
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                changedInstance7 = startRestartGroup.changedInstance(controller);
                                                                Object rememberedValue1622 = startRestartGroup.rememberedValue();
                                                                if (!changedInstance7) {
                                                                }
                                                                Function2 function2322 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda8
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj13, Object obj14) {
                                                                        Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                        MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Long) obj14).longValue());
                                                                        return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(function2322);
                                                                obj8 = function2322;
                                                                Function2 function2422 = (Function2) obj8;
                                                                startRestartGroup.endReplaceGroup();
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                changedInstance8 = startRestartGroup.changedInstance(controller);
                                                                Object rememberedValue1722 = startRestartGroup.rememberedValue();
                                                                if (!changedInstance8) {
                                                                }
                                                                Function3 function332 = new Function3() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda9
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                                        Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                        MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Boolean) obj14).booleanValue(), (List) obj15);
                                                                        return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(function332);
                                                                obj9 = function332;
                                                                Function3 function3222 = (Function3) obj9;
                                                                startRestartGroup.endReplaceGroup();
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                changedInstance9 = startRestartGroup.changedInstance(controller);
                                                                Object rememberedValue1822 = startRestartGroup.rememberedValue();
                                                                if (!changedInstance9) {
                                                                }
                                                                Function0 function01122 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda10
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        List currentBets;
                                                                        currentBets = MatchDetailsController.this.getCurrentBets();
                                                                        return currentBets;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(function01122);
                                                                obj10 = function01122;
                                                                Function0 function01222 = (Function0) obj10;
                                                                startRestartGroup.endReplaceGroup();
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                changedInstance10 = startRestartGroup.changedInstance(controller);
                                                                Object rememberedValue1922 = startRestartGroup.rememberedValue();
                                                                if (!changedInstance10) {
                                                                }
                                                                Function0 function01322 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda11
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                        MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76(MatchDetailsController.this);
                                                                        return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(function01322);
                                                                obj11 = function01322;
                                                                Function0 function01422 = (Function0) obj11;
                                                                startRestartGroup.endReplaceGroup();
                                                                startRestartGroup.startReplaceGroup(5004770);
                                                                changedInstance11 = startRestartGroup.changedInstance(controller);
                                                                Object rememberedValue2022 = startRestartGroup.rememberedValue();
                                                                if (!changedInstance11) {
                                                                }
                                                                Function1 function11622 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda12
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj13) {
                                                                        Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                        MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78(MatchDetailsController.this, ((Long) obj13).longValue());
                                                                        return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(function11622);
                                                                obj12 = function11622;
                                                                startRestartGroup.endReplaceGroup();
                                                                int i1322 = i12 << 12;
                                                                MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(null, MatchDetailsScreen$lambda$6, MatchDetailsScreen$lambda$9, MatchDetailsScreen$lambda$10, function11522, function2222, MatchDetailsScreen$lambda$142, MatchDetailsScreen$lambda$152, map, MatchDetailsScreen$lambda$162, function2422, function3222, oddType, function01222, false, false, false, null, function110, function04, num2, resultRaw, num3, z3, MatchDetailsScreen$lambda$17222, MatchDetailsScreen$lambda$18222, function01422, MatchDetailsScreen$lambda$1162, MatchDetailsScreen$lambda$12222, (Function1) obj12, MatchDetailsScreen$lambda$13222, function112, startRestartGroup, 0, (234881024 & i1322) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i1322 & 1879048192), 0, (i12 >> 21) & 112, 212993, 0);
                                                                startRestartGroup.endReplaceGroup();
                                                                Unit unit822 = Unit.INSTANCE;
                                                            }
                                                            num2 = Integer.valueOf(sportId);
                                                            MatchShortInfoModel MatchDetailsScreen$lambda$1152 = MatchDetailsScreen$lambda$1(state);
                                                            if (MatchDetailsScreen$lambda$1152 == null) {
                                                            }
                                                            MatchDetailsScreen$lambda$16 = MatchDetailsScreen$lambda$1(state);
                                                            if (MatchDetailsScreen$lambda$16 == null) {
                                                            }
                                                            num3 = valueOf;
                                                            z2 = z5;
                                                            if (z2) {
                                                            }
                                                            z3 = z;
                                                            boolean MatchDetailsScreen$lambda$172222 = MatchDetailsScreen$lambda$17(collectAsState17);
                                                            long MatchDetailsScreen$lambda$182222 = MatchDetailsScreen$lambda$18(collectAsState18);
                                                            List<MatchPlacedBetInfoModel> MatchDetailsScreen$lambda$11622 = MatchDetailsScreen$lambda$11(collectAsState11);
                                                            boolean MatchDetailsScreen$lambda$122222 = MatchDetailsScreen$lambda$12(collectAsState12);
                                                            List<MatchHistoryCategoryUiItem> MatchDetailsScreen$lambda$132222 = MatchDetailsScreen$lambda$13(collectAsState13);
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance5 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue14222 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance5) {
                                                            }
                                                            Function1 function114222 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda6
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj13) {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66(MatchDetailsController.this, ((Integer) obj13).intValue());
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function114222);
                                                            obj6 = function114222;
                                                            Function1 function115222 = (Function1) obj6;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance6 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue15222 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance6) {
                                                            }
                                                            Function2 function2522 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda7
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj13, Object obj14) {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68(MatchDetailsController.this, ((Long) obj13).longValue(), ((Integer) obj14).intValue());
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function2522);
                                                            obj7 = function2522;
                                                            Function2 function22222 = (Function2) obj7;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance7 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue16222 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance7) {
                                                            }
                                                            Function2 function23222 = new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda8
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj13, Object obj14) {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Long) obj14).longValue());
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function23222);
                                                            obj8 = function23222;
                                                            Function2 function24222 = (Function2) obj8;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance8 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue17222 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance8) {
                                                            }
                                                            Function3 function3322 = new Function3() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda9
                                                                @Override // kotlin.jvm.functions.Function3
                                                                public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72(MatchDetailsController.this, ((Integer) obj13).intValue(), ((Boolean) obj14).booleanValue(), (List) obj15);
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function3322);
                                                            obj9 = function3322;
                                                            Function3 function32222 = (Function3) obj9;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance9 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue18222 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance9) {
                                                            }
                                                            Function0 function011222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda10
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    List currentBets;
                                                                    currentBets = MatchDetailsController.this.getCurrentBets();
                                                                    return currentBets;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function011222);
                                                            obj10 = function011222;
                                                            Function0 function012222 = (Function0) obj10;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance10 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue19222 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance10) {
                                                            }
                                                            Function0 function013222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda11
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76(MatchDetailsController.this);
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function013222);
                                                            obj11 = function013222;
                                                            Function0 function014222 = (Function0) obj11;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance11 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue20222 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance11) {
                                                            }
                                                            Function1 function116222 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda12
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj13) {
                                                                    Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                    MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78(MatchDetailsController.this, ((Long) obj13).longValue());
                                                                    return MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function116222);
                                                            obj12 = function116222;
                                                            startRestartGroup.endReplaceGroup();
                                                            int i13222 = i12 << 12;
                                                            MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(null, MatchDetailsScreen$lambda$6, MatchDetailsScreen$lambda$9, MatchDetailsScreen$lambda$10, function115222, function22222, MatchDetailsScreen$lambda$142, MatchDetailsScreen$lambda$152, map, MatchDetailsScreen$lambda$162, function24222, function32222, oddType, function012222, false, false, false, null, function110, function04, num2, resultRaw, num3, z3, MatchDetailsScreen$lambda$172222, MatchDetailsScreen$lambda$182222, function014222, MatchDetailsScreen$lambda$11622, MatchDetailsScreen$lambda$122222, (Function1) obj12, MatchDetailsScreen$lambda$132222, function112, startRestartGroup, 0, (234881024 & i13222) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13222 & 1879048192), 0, (i12 >> 21) & 112, 212993, 0);
                                                            startRestartGroup.endReplaceGroup();
                                                            Unit unit8222 = Unit.INSTANCE;
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
                                                        composer2 = startRestartGroup;
                                                        PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                                                        Boolean valueOf4 = Boolean.valueOf(z2);
                                                        Boolean valueOf5 = Boolean.valueOf(z4);
                                                        composer2.startReplaceGroup(-1746271574);
                                                        changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                                                        rememberedValue5 = composer2.rememberedValue();
                                                        if (!changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                                                            composer2.updateRememberedValue(rememberedValue5);
                                                        }
                                                        composer2.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(valueOf4, tourStep, valueOf5, (Function2) rememberedValue5, composer2, 0);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        composer2.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        function17 = function110;
                                                        function03 = function04;
                                                        tourState2 = tourState3;
                                                        function18 = function112;
                                                        function19 = function16;
                                                    } else {
                                                        c = 0;
                                                        i8 = 2;
                                                    }
                                                    if (MatchDetailsScreen$lambda$8 != null) {
                                                        dateTime = MatchDetailsScreen$lambda$8.getCurrentDateForMatchDetail();
                                                    } else {
                                                        MatchShortInfoModel MatchDetailsScreen$lambda$117 = MatchDetailsScreen$lambda$1(collectAsState);
                                                        if (MatchDetailsScreen$lambda$117 == null || (date = MatchDetailsScreen$lambda$117.getDate()) == null || (dateTime = DateHelper.getDateTime(date)) == null) {
                                                            str6 = "";
                                                            MatchShortInfoModel MatchDetailsScreen$lambda$1112 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            MatchCommentsState matchCommentsState2 = new MatchCommentsState(MatchDetailsScreen$lambda$1112 != null ? Long.valueOf(MatchDetailsScreen$lambda$1112.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance = startRestartGroup.changedInstance(controller);
                                                            rememberedValue = startRestartGroup.rememberedValue();
                                                            if (!changedInstance) {
                                                            }
                                                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$37$lambda$36;
                                                                    MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                                                    return MatchDetailsScreen$lambda$37$lambda$36;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                                            Function0 function052 = (Function0) rememberedValue;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance2 = startRestartGroup.changedInstance(controller);
                                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance2) {
                                                            }
                                                            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$39$lambda$38;
                                                                    MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                                                    return MatchDetailsScreen$lambda$39$lambda$38;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                                            Function0 function062 = (Function0) rememberedValue2;
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance3 = startRestartGroup.changedInstance(controller);
                                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance3) {
                                                            }
                                                            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj13) {
                                                                    Unit MatchDetailsScreen$lambda$41$lambda$40;
                                                                    MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                                                    return MatchDetailsScreen$lambda$41$lambda$40;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                                            startRestartGroup.endReplaceGroup();
                                                            MatchCommentsCallbacks matchCommentsCallbacks2 = new MatchCommentsCallbacks(function052, function062, (Function1) rememberedValue3);
                                                            boolean MatchDetailsScreen$lambda$42 = MatchDetailsScreen$lambda$4(collectAsState5);
                                                            startRestartGroup.startReplaceGroup(5004770);
                                                            changedInstance4 = startRestartGroup.changedInstance(controller);
                                                            Object rememberedValue82 = startRestartGroup.rememberedValue();
                                                            if (!changedInstance4) {
                                                            }
                                                            Function0 function072 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    Unit MatchDetailsScreen$lambda$43$lambda$42;
                                                                    MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                                                    return MatchDetailsScreen$lambda$43$lambda$42;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(function072);
                                                            obj3 = function072;
                                                            startRestartGroup.endReplaceGroup();
                                                            boolean z72 = c;
                                                            int i112 = i8;
                                                            PullRefreshState m2661rememberPullRefreshStateUuyPYSY2 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$42, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                                            startRestartGroup.startReplaceGroup(1849434622);
                                                            rememberedValue4 = startRestartGroup.rememberedValue();
                                                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                            }
                                                            final MutableState mutableState2 = (MutableState) rememberedValue4;
                                                            startRestartGroup.endReplaceGroup();
                                                            if (MatchDetailsScreen$lambda$5(collectAsState2) == i112) {
                                                            }
                                                            Modifier pullRefresh$default2 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2, z72, i112, null);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z72);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z72 ? 1 : 0);
                                                            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default2);
                                                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            }
                                                            startRestartGroup.startReusableNode();
                                                            if (startRestartGroup.getInserting()) {
                                                            }
                                                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (!m4610constructorimpl.getInserting()) {
                                                            }
                                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
                                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                                            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                                                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            }
                                                            startRestartGroup.startReusableNode();
                                                            if (startRestartGroup.getInserting()) {
                                                            }
                                                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                                            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (!m4610constructorimpl2.getInserting()) {
                                                            }
                                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                                                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            }
                                                            startRestartGroup.startReusableNode();
                                                            if (startRestartGroup.getInserting()) {
                                                            }
                                                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (!m4610constructorimpl3.getInserting()) {
                                                            }
                                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                                                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                                                            float f2 = 12;
                                                            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), 0.0f, 2, null);
                                                            MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            if (MatchDetailsScreen$lambda$13 != null) {
                                                            }
                                                            MatchShortInfoModel MatchDetailsScreen$lambda$1122 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            if (MatchDetailsScreen$lambda$1122 != null) {
                                                            }
                                                            MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            if (MatchDetailsScreen$lambda$14 != null) {
                                                            }
                                                            MatchShortInfoModel MatchDetailsScreen$lambda$1132 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            if (MatchDetailsScreen$lambda$1132 != null) {
                                                            }
                                                            boolean MatchDetailsScreen$lambda$22 = MatchDetailsScreen$lambda$2(collectAsState3);
                                                            startRestartGroup.startReplaceGroup(790956202);
                                                            MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                                                            if (MatchDetailsScreen$lambda$15 != null) {
                                                                num = Integer.valueOf(league.getId());
                                                            }
                                                            num = null;
                                                            startRestartGroup.startReplaceGroup(790959342);
                                                            if (num == null) {
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            startRestartGroup.endReplaceGroup();
                                                            int i122 = i3;
                                                            String str102 = str7;
                                                            MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default2, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$22, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                                                            startRestartGroup.startReplaceGroup(790972505);
                                                            if (MatchDetailsScreen$lambda$8 == null) {
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            startRestartGroup.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                                                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                            CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                                                            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            }
                                                            startRestartGroup.startReusableNode();
                                                            if (startRestartGroup.getInserting()) {
                                                            }
                                                            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                                            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (!m4610constructorimpl4.getInserting()) {
                                                            }
                                                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash52);
                                                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                                                            MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                                                            if (MatchDetailsScreen$lambda$5 != 0) {
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
                                                            composer2 = startRestartGroup;
                                                            PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY2, boxScopeInstance4.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                                                            Boolean valueOf42 = Boolean.valueOf(z2);
                                                            Boolean valueOf52 = Boolean.valueOf(z4);
                                                            composer2.startReplaceGroup(-1746271574);
                                                            changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                                                            rememberedValue5 = composer2.rememberedValue();
                                                            if (!changed3) {
                                                            }
                                                            rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                                                            composer2.updateRememberedValue(rememberedValue5);
                                                            composer2.endReplaceGroup();
                                                            EffectsKt.LaunchedEffect(valueOf42, tourStep, valueOf52, (Function2) rememberedValue5, composer2, 0);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            composer2.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            function17 = function110;
                                                            function03 = function04;
                                                            tourState2 = tourState3;
                                                            function18 = function112;
                                                            function19 = function16;
                                                        }
                                                    }
                                                    str6 = dateTime;
                                                    MatchShortInfoModel MatchDetailsScreen$lambda$11122 = MatchDetailsScreen$lambda$1(collectAsState);
                                                    MatchCommentsState matchCommentsState22 = new MatchCommentsState(MatchDetailsScreen$lambda$11122 != null ? Long.valueOf(MatchDetailsScreen$lambda$11122.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                                                    startRestartGroup.startReplaceGroup(5004770);
                                                    changedInstance = startRestartGroup.changedInstance(controller);
                                                    rememberedValue = startRestartGroup.rememberedValue();
                                                    if (!changedInstance) {
                                                    }
                                                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit MatchDetailsScreen$lambda$37$lambda$36;
                                                            MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                                            return MatchDetailsScreen$lambda$37$lambda$36;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                    Function0 function0522 = (Function0) rememberedValue;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(5004770);
                                                    changedInstance2 = startRestartGroup.changedInstance(controller);
                                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance2) {
                                                    }
                                                    rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit MatchDetailsScreen$lambda$39$lambda$38;
                                                            MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                                            return MatchDetailsScreen$lambda$39$lambda$38;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    Function0 function0622 = (Function0) rememberedValue2;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(5004770);
                                                    changedInstance3 = startRestartGroup.changedInstance(controller);
                                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance3) {
                                                    }
                                                    rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj13) {
                                                            Unit MatchDetailsScreen$lambda$41$lambda$40;
                                                            MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                                            return MatchDetailsScreen$lambda$41$lambda$40;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    startRestartGroup.endReplaceGroup();
                                                    MatchCommentsCallbacks matchCommentsCallbacks22 = new MatchCommentsCallbacks(function0522, function0622, (Function1) rememberedValue3);
                                                    boolean MatchDetailsScreen$lambda$422 = MatchDetailsScreen$lambda$4(collectAsState5);
                                                    startRestartGroup.startReplaceGroup(5004770);
                                                    changedInstance4 = startRestartGroup.changedInstance(controller);
                                                    Object rememberedValue822 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance4) {
                                                    }
                                                    Function0 function0722 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Unit MatchDetailsScreen$lambda$43$lambda$42;
                                                            MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                                            return MatchDetailsScreen$lambda$43$lambda$42;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(function0722);
                                                    obj3 = function0722;
                                                    startRestartGroup.endReplaceGroup();
                                                    boolean z722 = c;
                                                    int i1122 = i8;
                                                    PullRefreshState m2661rememberPullRefreshStateUuyPYSY22 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$422, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    }
                                                    final MutableState mutableState22 = (MutableState) rememberedValue4;
                                                    startRestartGroup.endReplaceGroup();
                                                    if (MatchDetailsScreen$lambda$5(collectAsState2) == i1122) {
                                                    }
                                                    Modifier pullRefresh$default22 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY22, z722, i1122, null);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z722);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z722 ? 1 : 0);
                                                    CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default22);
                                                    Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    }
                                                    startRestartGroup.startReusableNode();
                                                    if (startRestartGroup.getInserting()) {
                                                    }
                                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl.getInserting()) {
                                                    }
                                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62);
                                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                                                    Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                    MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32);
                                                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    }
                                                    startRestartGroup.startReusableNode();
                                                    if (startRestartGroup.getInserting()) {
                                                    }
                                                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl2.getInserting()) {
                                                    }
                                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                    ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                    Modifier.Companion companion22 = Modifier.INSTANCE;
                                                    MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                                                    Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    }
                                                    startRestartGroup.startReusableNode();
                                                    if (startRestartGroup.getInserting()) {
                                                    }
                                                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl3.getInserting()) {
                                                    }
                                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                                                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                    ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                                                    float f22 = 12;
                                                    Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f22), 0.0f, 2, null);
                                                    MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                                                    if (MatchDetailsScreen$lambda$13 != null) {
                                                    }
                                                    MatchShortInfoModel MatchDetailsScreen$lambda$11222 = MatchDetailsScreen$lambda$1(collectAsState);
                                                    if (MatchDetailsScreen$lambda$11222 != null) {
                                                    }
                                                    MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                                                    if (MatchDetailsScreen$lambda$14 != null) {
                                                    }
                                                    MatchShortInfoModel MatchDetailsScreen$lambda$11322 = MatchDetailsScreen$lambda$1(collectAsState);
                                                    if (MatchDetailsScreen$lambda$11322 != null) {
                                                    }
                                                    boolean MatchDetailsScreen$lambda$222 = MatchDetailsScreen$lambda$2(collectAsState3);
                                                    startRestartGroup.startReplaceGroup(790956202);
                                                    MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                                                    if (MatchDetailsScreen$lambda$15 != null) {
                                                    }
                                                    num = null;
                                                    startRestartGroup.startReplaceGroup(790959342);
                                                    if (num == null) {
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.endReplaceGroup();
                                                    int i1222 = i3;
                                                    String str1022 = str7;
                                                    MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default22, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$222, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                                                    startRestartGroup.startReplaceGroup(790972505);
                                                    if (MatchDetailsScreen$lambda$8 == null) {
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    startRestartGroup.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance32, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
                                                    Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    }
                                                    startRestartGroup.startReusableNode();
                                                    if (startRestartGroup.getInserting()) {
                                                    }
                                                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl4.getInserting()) {
                                                    }
                                                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash522);
                                                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                                                    MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                                                    if (MatchDetailsScreen$lambda$5 != 0) {
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
                                                    composer2 = startRestartGroup;
                                                    PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY22, boxScopeInstance42.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                                                    Boolean valueOf422 = Boolean.valueOf(z2);
                                                    Boolean valueOf522 = Boolean.valueOf(z4);
                                                    composer2.startReplaceGroup(-1746271574);
                                                    changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                                                    rememberedValue5 = composer2.rememberedValue();
                                                    if (!changed3) {
                                                    }
                                                    rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                                                    composer2.updateRememberedValue(rememberedValue5);
                                                    composer2.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(valueOf422, tourStep, valueOf522, (Function2) rememberedValue5, composer2, 0);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    function17 = function110;
                                                    function03 = function04;
                                                    tourState2 = tourState3;
                                                    function18 = function112;
                                                    function19 = function16;
                                                }
                                            }
                                            str5 = "";
                                            if (MatchDetailsScreen$lambda$8 == null) {
                                            }
                                            if (MatchDetailsScreen$lambda$8 != null) {
                                            }
                                            str6 = dateTime;
                                            MatchShortInfoModel MatchDetailsScreen$lambda$111222 = MatchDetailsScreen$lambda$1(collectAsState);
                                            MatchCommentsState matchCommentsState222 = new MatchCommentsState(MatchDetailsScreen$lambda$111222 != null ? Long.valueOf(MatchDetailsScreen$lambda$111222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                                            startRestartGroup.startReplaceGroup(5004770);
                                            changedInstance = startRestartGroup.changedInstance(controller);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changedInstance) {
                                            }
                                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit MatchDetailsScreen$lambda$37$lambda$36;
                                                    MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                                    return MatchDetailsScreen$lambda$37$lambda$36;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                            Function0 function05222 = (Function0) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(5004770);
                                            changedInstance2 = startRestartGroup.changedInstance(controller);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changedInstance2) {
                                            }
                                            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit MatchDetailsScreen$lambda$39$lambda$38;
                                                    MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                                    return MatchDetailsScreen$lambda$39$lambda$38;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                            Function0 function06222 = (Function0) rememberedValue2;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(5004770);
                                            changedInstance3 = startRestartGroup.changedInstance(controller);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (!changedInstance3) {
                                            }
                                            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj13) {
                                                    Unit MatchDetailsScreen$lambda$41$lambda$40;
                                                    MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                                    return MatchDetailsScreen$lambda$41$lambda$40;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                            startRestartGroup.endReplaceGroup();
                                            MatchCommentsCallbacks matchCommentsCallbacks222 = new MatchCommentsCallbacks(function05222, function06222, (Function1) rememberedValue3);
                                            boolean MatchDetailsScreen$lambda$4222 = MatchDetailsScreen$lambda$4(collectAsState5);
                                            startRestartGroup.startReplaceGroup(5004770);
                                            changedInstance4 = startRestartGroup.changedInstance(controller);
                                            Object rememberedValue8222 = startRestartGroup.rememberedValue();
                                            if (!changedInstance4) {
                                            }
                                            Function0 function07222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit MatchDetailsScreen$lambda$43$lambda$42;
                                                    MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                                    return MatchDetailsScreen$lambda$43$lambda$42;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(function07222);
                                            obj3 = function07222;
                                            startRestartGroup.endReplaceGroup();
                                            boolean z7222 = c;
                                            int i11222 = i8;
                                            PullRefreshState m2661rememberPullRefreshStateUuyPYSY222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$4222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            final MutableState mutableState222 = (MutableState) rememberedValue4;
                                            startRestartGroup.endReplaceGroup();
                                            if (MatchDetailsScreen$lambda$5(collectAsState2) == i11222) {
                                            }
                                            Modifier pullRefresh$default222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY222, z7222, i11222, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z7222);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z7222 ? 1 : 0);
                                            CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default222);
                                            Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl.getInserting()) {
                                            }
                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622);
                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
                                            Modifier fillMaxSize$default322 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322);
                                            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl2.getInserting()) {
                                            }
                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion222 = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
                                            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl3.getInserting()) {
                                            }
                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
                                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                                            float f222 = 12;
                                            Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f222), 0.0f, 2, null);
                                            MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                                            if (MatchDetailsScreen$lambda$13 != null) {
                                            }
                                            MatchShortInfoModel MatchDetailsScreen$lambda$112222 = MatchDetailsScreen$lambda$1(collectAsState);
                                            if (MatchDetailsScreen$lambda$112222 != null) {
                                            }
                                            MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                                            if (MatchDetailsScreen$lambda$14 != null) {
                                            }
                                            MatchShortInfoModel MatchDetailsScreen$lambda$113222 = MatchDetailsScreen$lambda$1(collectAsState);
                                            if (MatchDetailsScreen$lambda$113222 != null) {
                                            }
                                            boolean MatchDetailsScreen$lambda$2222 = MatchDetailsScreen$lambda$2(collectAsState3);
                                            startRestartGroup.startReplaceGroup(790956202);
                                            MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                                            if (MatchDetailsScreen$lambda$15 != null) {
                                            }
                                            num = null;
                                            startRestartGroup.startReplaceGroup(790959342);
                                            if (num == null) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.endReplaceGroup();
                                            int i12222 = i3;
                                            String str10222 = str7;
                                            MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$2222, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                                            startRestartGroup.startReplaceGroup(790972505);
                                            if (MatchDetailsScreen$lambda$8 == null) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance322, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                                            MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222);
                                            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl4.getInserting()) {
                                            }
                                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5222);
                                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                                            MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                                            if (MatchDetailsScreen$lambda$5 != 0) {
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
                                            composer2 = startRestartGroup;
                                            PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY222, boxScopeInstance422.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                                            Boolean valueOf4222 = Boolean.valueOf(z2);
                                            Boolean valueOf5222 = Boolean.valueOf(z4);
                                            composer2.startReplaceGroup(-1746271574);
                                            changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                                            rememberedValue5 = composer2.rememberedValue();
                                            if (!changed3) {
                                            }
                                            rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                                            composer2.updateRememberedValue(rememberedValue5);
                                            composer2.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf4222, tourStep, valueOf5222, (Function2) rememberedValue5, composer2, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function17 = function110;
                                            function03 = function04;
                                            tourState2 = tourState3;
                                            function18 = function112;
                                            function19 = function16;
                                        }
                                        str4 = photoUrl2;
                                        MatchShortInfoModel MatchDetailsScreen$lambda$1102 = MatchDetailsScreen$lambda$1(collectAsState);
                                        if (MatchDetailsScreen$lambda$1102 != null) {
                                        }
                                        if (MatchDetailsScreen$lambda$8 != null) {
                                            scoreFirstTeam = MatchDetailsScreen$lambda$8.getScoreFirstTeam();
                                            if (scoreFirstTeam == null) {
                                            }
                                            scoreSecondTeam = MatchDetailsScreen$lambda$8.getScoreSecondTeam();
                                            if (scoreSecondTeam == null) {
                                            }
                                            if (!StringsKt.isBlank(scoreFirstTeam)) {
                                                str5 = scoreFirstTeam + " - " + scoreSecondTeam;
                                                if (MatchDetailsScreen$lambda$8 == null) {
                                                }
                                                if (MatchDetailsScreen$lambda$8 != null) {
                                                }
                                                str6 = dateTime;
                                                MatchShortInfoModel MatchDetailsScreen$lambda$1112222 = MatchDetailsScreen$lambda$1(collectAsState);
                                                MatchCommentsState matchCommentsState2222 = new MatchCommentsState(MatchDetailsScreen$lambda$1112222 != null ? Long.valueOf(MatchDetailsScreen$lambda$1112222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                                                startRestartGroup.startReplaceGroup(5004770);
                                                changedInstance = startRestartGroup.changedInstance(controller);
                                                rememberedValue = startRestartGroup.rememberedValue();
                                                if (!changedInstance) {
                                                }
                                                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit MatchDetailsScreen$lambda$37$lambda$36;
                                                        MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                                        return MatchDetailsScreen$lambda$37$lambda$36;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                Function0 function052222 = (Function0) rememberedValue;
                                                startRestartGroup.endReplaceGroup();
                                                startRestartGroup.startReplaceGroup(5004770);
                                                changedInstance2 = startRestartGroup.changedInstance(controller);
                                                rememberedValue2 = startRestartGroup.rememberedValue();
                                                if (!changedInstance2) {
                                                }
                                                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit MatchDetailsScreen$lambda$39$lambda$38;
                                                        MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                                        return MatchDetailsScreen$lambda$39$lambda$38;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                                Function0 function062222 = (Function0) rememberedValue2;
                                                startRestartGroup.endReplaceGroup();
                                                startRestartGroup.startReplaceGroup(5004770);
                                                changedInstance3 = startRestartGroup.changedInstance(controller);
                                                rememberedValue3 = startRestartGroup.rememberedValue();
                                                if (!changedInstance3) {
                                                }
                                                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj13) {
                                                        Unit MatchDetailsScreen$lambda$41$lambda$40;
                                                        MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                                        return MatchDetailsScreen$lambda$41$lambda$40;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                                startRestartGroup.endReplaceGroup();
                                                MatchCommentsCallbacks matchCommentsCallbacks2222 = new MatchCommentsCallbacks(function052222, function062222, (Function1) rememberedValue3);
                                                boolean MatchDetailsScreen$lambda$42222 = MatchDetailsScreen$lambda$4(collectAsState5);
                                                startRestartGroup.startReplaceGroup(5004770);
                                                changedInstance4 = startRestartGroup.changedInstance(controller);
                                                Object rememberedValue82222 = startRestartGroup.rememberedValue();
                                                if (!changedInstance4) {
                                                }
                                                Function0 function072222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit MatchDetailsScreen$lambda$43$lambda$42;
                                                        MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                                        return MatchDetailsScreen$lambda$43$lambda$42;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(function072222);
                                                obj3 = function072222;
                                                startRestartGroup.endReplaceGroup();
                                                boolean z72222 = c;
                                                int i112222 = i8;
                                                PullRefreshState m2661rememberPullRefreshStateUuyPYSY2222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$42222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                                startRestartGroup.startReplaceGroup(1849434622);
                                                rememberedValue4 = startRestartGroup.rememberedValue();
                                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                final MutableState mutableState2222 = (MutableState) rememberedValue4;
                                                startRestartGroup.endReplaceGroup();
                                                if (MatchDetailsScreen$lambda$5(collectAsState2) == i112222) {
                                                }
                                                Modifier pullRefresh$default2222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2222, z72222, i112222, null);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy4222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z72222);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z72222 ? 1 : 0);
                                                CompositionLocalMap currentCompositionLocalMap6222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier6222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default2222);
                                                Function0<ComposeUiNode> constructor6222 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl.getInserting()) {
                                                }
                                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6222);
                                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier6222, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance4222 = BoxScopeInstance.INSTANCE;
                                                Modifier fillMaxSize$default3222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3222);
                                                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl2.getInserting()) {
                                                }
                                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion2222 = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
                                                Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl3.getInserting()) {
                                                }
                                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
                                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                                                float f2222 = 12;
                                                Modifier m1518paddingVpY3zN4$default2222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222), 0.0f, 2, null);
                                                MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                                                if (MatchDetailsScreen$lambda$13 != null) {
                                                }
                                                MatchShortInfoModel MatchDetailsScreen$lambda$1122222 = MatchDetailsScreen$lambda$1(collectAsState);
                                                if (MatchDetailsScreen$lambda$1122222 != null) {
                                                }
                                                MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                                                if (MatchDetailsScreen$lambda$14 != null) {
                                                }
                                                MatchShortInfoModel MatchDetailsScreen$lambda$1132222 = MatchDetailsScreen$lambda$1(collectAsState);
                                                if (MatchDetailsScreen$lambda$1132222 != null) {
                                                }
                                                boolean MatchDetailsScreen$lambda$22222 = MatchDetailsScreen$lambda$2(collectAsState3);
                                                startRestartGroup.startReplaceGroup(790956202);
                                                MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                                                if (MatchDetailsScreen$lambda$15 != null) {
                                                }
                                                num = null;
                                                startRestartGroup.startReplaceGroup(790959342);
                                                if (num == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                startRestartGroup.endReplaceGroup();
                                                int i122222 = i3;
                                                String str102222 = str7;
                                                MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default2222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$22222, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                                                startRestartGroup.startReplaceGroup(790972505);
                                                if (MatchDetailsScreen$lambda$8 == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance3222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap52222 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222);
                                                Function0<ComposeUiNode> constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl4.getInserting()) {
                                                }
                                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash52222);
                                                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
                                                MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                                                if (MatchDetailsScreen$lambda$5 != 0) {
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
                                                composer2 = startRestartGroup;
                                                PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY2222, boxScopeInstance4222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                                                Boolean valueOf42222 = Boolean.valueOf(z2);
                                                Boolean valueOf52222 = Boolean.valueOf(z4);
                                                composer2.startReplaceGroup(-1746271574);
                                                changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                                                rememberedValue5 = composer2.rememberedValue();
                                                if (!changed3) {
                                                }
                                                rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                                                composer2.updateRememberedValue(rememberedValue5);
                                                composer2.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(valueOf42222, tourStep, valueOf52222, (Function2) rememberedValue5, composer2, 0);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                function17 = function110;
                                                function03 = function04;
                                                tourState2 = tourState3;
                                                function18 = function112;
                                                function19 = function16;
                                            }
                                        }
                                        str5 = "";
                                        if (MatchDetailsScreen$lambda$8 == null) {
                                        }
                                        if (MatchDetailsScreen$lambda$8 != null) {
                                        }
                                        str6 = dateTime;
                                        MatchShortInfoModel MatchDetailsScreen$lambda$11122222 = MatchDetailsScreen$lambda$1(collectAsState);
                                        MatchCommentsState matchCommentsState22222 = new MatchCommentsState(MatchDetailsScreen$lambda$11122222 != null ? Long.valueOf(MatchDetailsScreen$lambda$11122222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changedInstance = startRestartGroup.changedInstance(controller);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changedInstance) {
                                        }
                                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit MatchDetailsScreen$lambda$37$lambda$36;
                                                MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                                return MatchDetailsScreen$lambda$37$lambda$36;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                        Function0 function0522222 = (Function0) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changedInstance2 = startRestartGroup.changedInstance(controller);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!changedInstance2) {
                                        }
                                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit MatchDetailsScreen$lambda$39$lambda$38;
                                                MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                                return MatchDetailsScreen$lambda$39$lambda$38;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                        Function0 function0622222 = (Function0) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changedInstance3 = startRestartGroup.changedInstance(controller);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!changedInstance3) {
                                        }
                                        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj13) {
                                                Unit MatchDetailsScreen$lambda$41$lambda$40;
                                                MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                                return MatchDetailsScreen$lambda$41$lambda$40;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                        startRestartGroup.endReplaceGroup();
                                        MatchCommentsCallbacks matchCommentsCallbacks22222 = new MatchCommentsCallbacks(function0522222, function0622222, (Function1) rememberedValue3);
                                        boolean MatchDetailsScreen$lambda$422222 = MatchDetailsScreen$lambda$4(collectAsState5);
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changedInstance4 = startRestartGroup.changedInstance(controller);
                                        Object rememberedValue822222 = startRestartGroup.rememberedValue();
                                        if (!changedInstance4) {
                                        }
                                        Function0 function0722222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit MatchDetailsScreen$lambda$43$lambda$42;
                                                MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                                return MatchDetailsScreen$lambda$43$lambda$42;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(function0722222);
                                        obj3 = function0722222;
                                        startRestartGroup.endReplaceGroup();
                                        boolean z722222 = c;
                                        int i1122222 = i8;
                                        PullRefreshState m2661rememberPullRefreshStateUuyPYSY22222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$422222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        final MutableState mutableState22222 = (MutableState) rememberedValue4;
                                        startRestartGroup.endReplaceGroup();
                                        if (MatchDetailsScreen$lambda$5(collectAsState2) == i1122222) {
                                        }
                                        Modifier pullRefresh$default22222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY22222, z722222, i1122222, null);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy42222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z722222);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z722222 ? 1 : 0);
                                        CompositionLocalMap currentCompositionLocalMap62222 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier62222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default22222);
                                        Function0<ComposeUiNode> constructor62222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy42222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl.getInserting()) {
                                        }
                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62222);
                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier62222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance42222 = BoxScopeInstance.INSTANCE;
                                        Modifier fillMaxSize$default32222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy32222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32222);
                                        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl2.getInserting()) {
                                        }
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance32222 = ColumnScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion22222 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222);
                                        Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl3.getInserting()) {
                                        }
                                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322222);
                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                                        float f22222 = 12;
                                        Modifier m1518paddingVpY3zN4$default22222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222), 0.0f, 2, null);
                                        MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                                        if (MatchDetailsScreen$lambda$13 != null) {
                                        }
                                        MatchShortInfoModel MatchDetailsScreen$lambda$11222222 = MatchDetailsScreen$lambda$1(collectAsState);
                                        if (MatchDetailsScreen$lambda$11222222 != null) {
                                        }
                                        MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                                        if (MatchDetailsScreen$lambda$14 != null) {
                                        }
                                        MatchShortInfoModel MatchDetailsScreen$lambda$11322222 = MatchDetailsScreen$lambda$1(collectAsState);
                                        if (MatchDetailsScreen$lambda$11322222 != null) {
                                        }
                                        boolean MatchDetailsScreen$lambda$222222 = MatchDetailsScreen$lambda$2(collectAsState3);
                                        startRestartGroup.startReplaceGroup(790956202);
                                        MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                                        if (MatchDetailsScreen$lambda$15 != null) {
                                        }
                                        num = null;
                                        startRestartGroup.startReplaceGroup(790959342);
                                        if (num == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.endReplaceGroup();
                                        int i1222222 = i3;
                                        String str1022222 = str7;
                                        MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default22222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$222222, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                                        startRestartGroup.startReplaceGroup(790972505);
                                        if (MatchDetailsScreen$lambda$8 == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance32222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy322222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap522222 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier522222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222);
                                        Function0<ComposeUiNode> constructor522222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap522222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl4.getInserting()) {
                                        }
                                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash522222);
                                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier522222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance322222 = BoxScopeInstance.INSTANCE;
                                        MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                                        if (MatchDetailsScreen$lambda$5 != 0) {
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
                                        composer2 = startRestartGroup;
                                        PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY22222, boxScopeInstance42222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                                        Boolean valueOf422222 = Boolean.valueOf(z2);
                                        Boolean valueOf522222 = Boolean.valueOf(z4);
                                        composer2.startReplaceGroup(-1746271574);
                                        changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                                        rememberedValue5 = composer2.rememberedValue();
                                        if (!changed3) {
                                        }
                                        rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                                        composer2.updateRememberedValue(rememberedValue5);
                                        composer2.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(valueOf422222, tourStep, valueOf522222, (Function2) rememberedValue5, composer2, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function17 = function110;
                                        function03 = function04;
                                        tourState2 = tourState3;
                                        function18 = function112;
                                        function19 = function16;
                                    }
                                    str3 = photoUrl;
                                    if (MatchDetailsScreen$lambda$8 != null) {
                                        if (StringsKt.isBlank(photoUrl2)) {
                                        }
                                    }
                                    MatchDetailsScreen$lambda$12 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$12 != null) {
                                    }
                                    str4 = null;
                                    MatchShortInfoModel MatchDetailsScreen$lambda$11022 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$11022 != null) {
                                    }
                                    if (MatchDetailsScreen$lambda$8 != null) {
                                    }
                                    str5 = "";
                                    if (MatchDetailsScreen$lambda$8 == null) {
                                    }
                                    if (MatchDetailsScreen$lambda$8 != null) {
                                    }
                                    str6 = dateTime;
                                    MatchShortInfoModel MatchDetailsScreen$lambda$111222222 = MatchDetailsScreen$lambda$1(collectAsState);
                                    MatchCommentsState matchCommentsState222222 = new MatchCommentsState(MatchDetailsScreen$lambda$111222222 != null ? Long.valueOf(MatchDetailsScreen$lambda$111222222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changedInstance = startRestartGroup.changedInstance(controller);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changedInstance) {
                                    }
                                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit MatchDetailsScreen$lambda$37$lambda$36;
                                            MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                            return MatchDetailsScreen$lambda$37$lambda$36;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    Function0 function05222222 = (Function0) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changedInstance2 = startRestartGroup.changedInstance(controller);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2) {
                                    }
                                    rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit MatchDetailsScreen$lambda$39$lambda$38;
                                            MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                            return MatchDetailsScreen$lambda$39$lambda$38;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    Function0 function06222222 = (Function0) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changedInstance3 = startRestartGroup.changedInstance(controller);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changedInstance3) {
                                    }
                                    rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj13) {
                                            Unit MatchDetailsScreen$lambda$41$lambda$40;
                                            MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                            return MatchDetailsScreen$lambda$41$lambda$40;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                    startRestartGroup.endReplaceGroup();
                                    MatchCommentsCallbacks matchCommentsCallbacks222222 = new MatchCommentsCallbacks(function05222222, function06222222, (Function1) rememberedValue3);
                                    boolean MatchDetailsScreen$lambda$4222222 = MatchDetailsScreen$lambda$4(collectAsState5);
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changedInstance4 = startRestartGroup.changedInstance(controller);
                                    Object rememberedValue8222222 = startRestartGroup.rememberedValue();
                                    if (!changedInstance4) {
                                    }
                                    Function0 function07222222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit MatchDetailsScreen$lambda$43$lambda$42;
                                            MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                            return MatchDetailsScreen$lambda$43$lambda$42;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(function07222222);
                                    obj3 = function07222222;
                                    startRestartGroup.endReplaceGroup();
                                    boolean z7222222 = c;
                                    int i11222222 = i8;
                                    PullRefreshState m2661rememberPullRefreshStateUuyPYSY222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$4222222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final MutableState mutableState222222 = (MutableState) rememberedValue4;
                                    startRestartGroup.endReplaceGroup();
                                    if (MatchDetailsScreen$lambda$5(collectAsState2) == i11222222) {
                                    }
                                    Modifier pullRefresh$default222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY222222, z7222222, i11222222, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy422222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z7222222);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z7222222 ? 1 : 0);
                                    CompositionLocalMap currentCompositionLocalMap622222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier622222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default222222);
                                    Function0<ComposeUiNode> constructor622222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy422222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting()) {
                                    }
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622222);
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier622222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance422222 = BoxScopeInstance.INSTANCE;
                                    Modifier fillMaxSize$default322222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy322222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322222);
                                    Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl2.getInserting()) {
                                    }
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance322222 = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion222222 = Modifier.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222222);
                                    Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl3.getInserting()) {
                                    }
                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222222);
                                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
                                    float f222222 = 12;
                                    Modifier m1518paddingVpY3zN4$default222222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222), 0.0f, 2, null);
                                    MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$13 != null) {
                                    }
                                    MatchShortInfoModel MatchDetailsScreen$lambda$112222222 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$112222222 != null) {
                                    }
                                    MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$14 != null) {
                                    }
                                    MatchShortInfoModel MatchDetailsScreen$lambda$113222222 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$113222222 != null) {
                                    }
                                    boolean MatchDetailsScreen$lambda$2222222 = MatchDetailsScreen$lambda$2(collectAsState3);
                                    startRestartGroup.startReplaceGroup(790956202);
                                    MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                                    if (MatchDetailsScreen$lambda$15 != null) {
                                    }
                                    num = null;
                                    startRestartGroup.startReplaceGroup(790959342);
                                    if (num == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.endReplaceGroup();
                                    int i12222222 = i3;
                                    String str10222222 = str7;
                                    MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default222222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$2222222, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                                    startRestartGroup.startReplaceGroup(790972505);
                                    if (MatchDetailsScreen$lambda$8 == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier fillMaxSize$default2222222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance322222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy3222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap5222222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier5222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222222);
                                    Function0<ComposeUiNode> constructor5222222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap5222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl4.getInserting()) {
                                    }
                                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5222222);
                                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier5222222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance3222222 = BoxScopeInstance.INSTANCE;
                                    MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                                    if (MatchDetailsScreen$lambda$5 != 0) {
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
                                    composer2 = startRestartGroup;
                                    PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY222222, boxScopeInstance422222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                                    Boolean valueOf4222222 = Boolean.valueOf(z2);
                                    Boolean valueOf5222222 = Boolean.valueOf(z4);
                                    composer2.startReplaceGroup(-1746271574);
                                    changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                                    rememberedValue5 = composer2.rememberedValue();
                                    if (!changed3) {
                                    }
                                    rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                                    composer2.updateRememberedValue(rememberedValue5);
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf4222222, tourStep, valueOf5222222, (Function2) rememberedValue5, composer2, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function17 = function110;
                                    function03 = function04;
                                    tourState2 = tourState3;
                                    function18 = function112;
                                    function19 = function16;
                                }
                            }
                            str2 = name2;
                            if (MatchDetailsScreen$lambda$8 != null) {
                                if (StringsKt.isBlank(photoUrl)) {
                                }
                            }
                            MatchDetailsScreen$lambda$1 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$1 != null) {
                            }
                            str3 = null;
                            if (MatchDetailsScreen$lambda$8 != null) {
                            }
                            MatchDetailsScreen$lambda$12 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$12 != null) {
                            }
                            str4 = null;
                            MatchShortInfoModel MatchDetailsScreen$lambda$110222 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$110222 != null) {
                            }
                            if (MatchDetailsScreen$lambda$8 != null) {
                            }
                            str5 = "";
                            if (MatchDetailsScreen$lambda$8 == null) {
                            }
                            if (MatchDetailsScreen$lambda$8 != null) {
                            }
                            str6 = dateTime;
                            MatchShortInfoModel MatchDetailsScreen$lambda$1112222222 = MatchDetailsScreen$lambda$1(collectAsState);
                            MatchCommentsState matchCommentsState2222222 = new MatchCommentsState(MatchDetailsScreen$lambda$1112222222 != null ? Long.valueOf(MatchDetailsScreen$lambda$1112222222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance = startRestartGroup.changedInstance(controller);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit MatchDetailsScreen$lambda$37$lambda$36;
                                    MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                                    return MatchDetailsScreen$lambda$37$lambda$36;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            Function0 function052222222 = (Function0) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance2 = startRestartGroup.changedInstance(controller);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changedInstance2) {
                            }
                            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit MatchDetailsScreen$lambda$39$lambda$38;
                                    MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                                    return MatchDetailsScreen$lambda$39$lambda$38;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            Function0 function062222222 = (Function0) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance3 = startRestartGroup.changedInstance(controller);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changedInstance3) {
                            }
                            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj13) {
                                    Unit MatchDetailsScreen$lambda$41$lambda$40;
                                    MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                                    return MatchDetailsScreen$lambda$41$lambda$40;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceGroup();
                            MatchCommentsCallbacks matchCommentsCallbacks2222222 = new MatchCommentsCallbacks(function052222222, function062222222, (Function1) rememberedValue3);
                            boolean MatchDetailsScreen$lambda$42222222 = MatchDetailsScreen$lambda$4(collectAsState5);
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance4 = startRestartGroup.changedInstance(controller);
                            Object rememberedValue82222222 = startRestartGroup.rememberedValue();
                            if (!changedInstance4) {
                            }
                            Function0 function072222222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit MatchDetailsScreen$lambda$43$lambda$42;
                                    MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                                    return MatchDetailsScreen$lambda$43$lambda$42;
                                }
                            };
                            startRestartGroup.updateRememberedValue(function072222222);
                            obj3 = function072222222;
                            startRestartGroup.endReplaceGroup();
                            boolean z72222222 = c;
                            int i112222222 = i8;
                            PullRefreshState m2661rememberPullRefreshStateUuyPYSY2222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$42222222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            }
                            final MutableState mutableState2222222 = (MutableState) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            if (MatchDetailsScreen$lambda$5(collectAsState2) == i112222222) {
                            }
                            Modifier pullRefresh$default2222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2222222, z72222222, i112222222, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy4222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z72222222);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z72222222 ? 1 : 0);
                            CompositionLocalMap currentCompositionLocalMap6222222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default2222222);
                            Function0<ComposeUiNode> constructor6222222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6222222);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier6222222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance4222222 = BoxScopeInstance.INSTANCE;
                            Modifier fillMaxSize$default3222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy3222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22222222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3222222);
                            Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy3222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance3222222 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            Modifier.Companion companion2222222 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy22222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32222222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222222);
                            Function0<ComposeUiNode> constructor32222222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting()) {
                            }
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222222);
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22222222 = ColumnScopeInstance.INSTANCE;
                            float f2222222 = 12;
                            Modifier m1518paddingVpY3zN4$default2222222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222222), 0.0f, 2, null);
                            MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$13 != null) {
                            }
                            MatchShortInfoModel MatchDetailsScreen$lambda$1122222222 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$1122222222 != null) {
                            }
                            MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$14 != null) {
                            }
                            MatchShortInfoModel MatchDetailsScreen$lambda$1132222222 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$1132222222 != null) {
                            }
                            boolean MatchDetailsScreen$lambda$22222222 = MatchDetailsScreen$lambda$2(collectAsState3);
                            startRestartGroup.startReplaceGroup(790956202);
                            MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                            if (MatchDetailsScreen$lambda$15 != null) {
                            }
                            num = null;
                            startRestartGroup.startReplaceGroup(790959342);
                            if (num == null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endReplaceGroup();
                            int i122222222 = i3;
                            String str102222222 = str7;
                            MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default2222222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$22222222, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                            startRestartGroup.startReplaceGroup(790972505);
                            if (MatchDetailsScreen$lambda$8 == null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier fillMaxSize$default22222222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance3222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                            MeasurePolicy maybeCachedBoxMeasurePolicy32222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap52222222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier52222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222222);
                            Function0<ComposeUiNode> constructor52222222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap52222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl4.getInserting()) {
                            }
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash52222222);
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier52222222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance32222222 = BoxScopeInstance.INSTANCE;
                            MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                            if (MatchDetailsScreen$lambda$5 != 0) {
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
                            composer2 = startRestartGroup;
                            PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY2222222, boxScopeInstance4222222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                            Boolean valueOf42222222 = Boolean.valueOf(z2);
                            Boolean valueOf52222222 = Boolean.valueOf(z4);
                            composer2.startReplaceGroup(-1746271574);
                            changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                            rememberedValue5 = composer2.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                            composer2.updateRememberedValue(rememberedValue5);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf42222222, tourStep, valueOf52222222, (Function2) rememberedValue5, composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function17 = function110;
                            function03 = function04;
                            tourState2 = tourState3;
                            function18 = function112;
                            function19 = function16;
                        }
                    }
                    str = name;
                    if (MatchDetailsScreen$lambda$8 != null) {
                    }
                    MatchShortInfoModel MatchDetailsScreen$lambda$183 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$183 != null) {
                    }
                    if (name2 == null) {
                    }
                    str2 = name2;
                    if (MatchDetailsScreen$lambda$8 != null) {
                    }
                    MatchDetailsScreen$lambda$1 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$1 != null) {
                    }
                    str3 = null;
                    if (MatchDetailsScreen$lambda$8 != null) {
                    }
                    MatchDetailsScreen$lambda$12 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$12 != null) {
                    }
                    str4 = null;
                    MatchShortInfoModel MatchDetailsScreen$lambda$1102222 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$1102222 != null) {
                    }
                    if (MatchDetailsScreen$lambda$8 != null) {
                    }
                    str5 = "";
                    if (MatchDetailsScreen$lambda$8 == null) {
                    }
                    if (MatchDetailsScreen$lambda$8 != null) {
                    }
                    str6 = dateTime;
                    MatchShortInfoModel MatchDetailsScreen$lambda$11122222222 = MatchDetailsScreen$lambda$1(collectAsState);
                    MatchCommentsState matchCommentsState22222222 = new MatchCommentsState(MatchDetailsScreen$lambda$11122222222 != null ? Long.valueOf(MatchDetailsScreen$lambda$11122222222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list, MatchDetailsScreen$lambda$20(collectAsState20), MatchDetailsScreen$lambda$21(collectAsState21), MatchDetailsScreen$lambda$22(collectAsState22), MatchDetailsScreen$lambda$23(collectAsState23));
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(controller);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MatchDetailsScreen$lambda$37$lambda$36;
                            MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                            return MatchDetailsScreen$lambda$37$lambda$36;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    Function0 function0522222222 = (Function0) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance2 = startRestartGroup.changedInstance(controller);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MatchDetailsScreen$lambda$39$lambda$38;
                            MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                            return MatchDetailsScreen$lambda$39$lambda$38;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    Function0 function0622222222 = (Function0) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance3 = startRestartGroup.changedInstance(controller);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            Unit MatchDetailsScreen$lambda$41$lambda$40;
                            MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                            return MatchDetailsScreen$lambda$41$lambda$40;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    MatchCommentsCallbacks matchCommentsCallbacks22222222 = new MatchCommentsCallbacks(function0522222222, function0622222222, (Function1) rememberedValue3);
                    boolean MatchDetailsScreen$lambda$422222222 = MatchDetailsScreen$lambda$4(collectAsState5);
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance4 = startRestartGroup.changedInstance(controller);
                    Object rememberedValue822222222 = startRestartGroup.rememberedValue();
                    if (!changedInstance4) {
                    }
                    Function0 function0722222222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MatchDetailsScreen$lambda$43$lambda$42;
                            MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                            return MatchDetailsScreen$lambda$43$lambda$42;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function0722222222);
                    obj3 = function0722222222;
                    startRestartGroup.endReplaceGroup();
                    boolean z722222222 = c;
                    int i1122222222 = i8;
                    PullRefreshState m2661rememberPullRefreshStateUuyPYSY22222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$422222222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState22222222 = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    if (MatchDetailsScreen$lambda$5(collectAsState2) == i1122222222) {
                    }
                    Modifier pullRefresh$default22222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY22222222, z722222222, i1122222222, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy42222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z722222222);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z722222222 ? 1 : 0);
                    CompositionLocalMap currentCompositionLocalMap62222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier62222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default22222222);
                    Function0<ComposeUiNode> constructor62222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy42222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62222222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier62222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance42222222 = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxSize$default32222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy32222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32222222);
                    Function0<ComposeUiNode> constructor222222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy32222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance32222222 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    Modifier.Companion companion22222222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap322222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier322222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222222);
                    Function0<ComposeUiNode> constructor322222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322222222);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222222222 = ColumnScopeInstance.INSTANCE;
                    float f22222222 = 12;
                    Modifier m1518paddingVpY3zN4$default22222222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222222), 0.0f, 2, null);
                    MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$13 != null) {
                    }
                    MatchShortInfoModel MatchDetailsScreen$lambda$11222222222 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$11222222222 != null) {
                    }
                    MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$14 != null) {
                    }
                    MatchShortInfoModel MatchDetailsScreen$lambda$11322222222 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$11322222222 != null) {
                    }
                    boolean MatchDetailsScreen$lambda$222222222 = MatchDetailsScreen$lambda$2(collectAsState3);
                    startRestartGroup.startReplaceGroup(790956202);
                    MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
                    if (MatchDetailsScreen$lambda$15 != null) {
                    }
                    num = null;
                    startRestartGroup.startReplaceGroup(790959342);
                    if (num == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endReplaceGroup();
                    int i1222222222 = i3;
                    String str1022222222 = str7;
                    MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default22222222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$222222222, function02, MatchDetailsScreen$lambda$3(collectAsState4), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
                    startRestartGroup.startReplaceGroup(790972505);
                    if (MatchDetailsScreen$lambda$8 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier fillMaxSize$default222222222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance32222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
                    MeasurePolicy maybeCachedBoxMeasurePolicy322222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap522222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier522222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222222);
                    Function0<ComposeUiNode> constructor522222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy322222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap522222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl4.getInserting()) {
                    }
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash522222222);
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier522222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance322222222 = BoxScopeInstance.INSTANCE;
                    MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
                    if (MatchDetailsScreen$lambda$5 != 0) {
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
                    composer2 = startRestartGroup;
                    PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState5), m2661rememberPullRefreshStateUuyPYSY22222222, boxScopeInstance42222222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
                    Boolean valueOf422222222 = Boolean.valueOf(z2);
                    Boolean valueOf522222222 = Boolean.valueOf(z4);
                    composer2.startReplaceGroup(-1746271574);
                    changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z4);
                    rememberedValue5 = composer2.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z4, null);
                    composer2.updateRememberedValue(rememberedValue5);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf422222222, tourStep, valueOf522222222, (Function2) rememberedValue5, composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function17 = function110;
                    function03 = function04;
                    tourState2 = tourState3;
                    function18 = function112;
                    function19 = function16;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function17 = function1;
                    function03 = function0;
                    function19 = function14;
                    composer2 = startRestartGroup;
                    tourState2 = tourState;
                    function18 = function13;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj13, Object obj14) {
                            Unit MatchDetailsScreen$lambda$86;
                            MatchDetailsScreen$lambda$86 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$86(Function0.this, onNotificationClick, controller, onOpenOneClickBetSettings, function17, function03, tourState2, function19, function18, i, i2, (Composer) obj13, ((Integer) obj14).intValue());
                            return MatchDetailsScreen$lambda$86;
                        }
                    });
                    return;
                }
                return;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (tourState3 != null) {
            }
            if (tourState3 != null) {
            }
            if (tourState3 != null) {
            }
            Boolean valueOf22 = Boolean.valueOf(isTourActive);
            Boolean valueOf32 = Boolean.valueOf(isBetSectionReady);
            startRestartGroup.startReplaceGroup(-1746271574);
            changed = startRestartGroup.changed(currentStep == null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(isBetSectionReady);
            Object rememberedValue62 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            MatchDetailsScreenKt$MatchDetailsScreen$1$1 matchDetailsScreenKt$MatchDetailsScreen$1$12 = new MatchDetailsScreenKt$MatchDetailsScreen$1$1(isTourActive, currentStep, isBetSectionReady, null);
            startRestartGroup.updateRememberedValue(matchDetailsScreenKt$MatchDetailsScreen$1$12);
            obj = matchDetailsScreenKt$MatchDetailsScreen$1$12;
            startRestartGroup.endReplaceGroup();
            TourStep tourStep22 = currentStep;
            EffectsKt.LaunchedEffect(valueOf22, tourStep22, valueOf32, (Function2) obj, startRestartGroup, 0);
            collectAsState = SnapshotStateKt.collectAsState(controller.getCurrentMatch(), null, startRestartGroup, 0, 1);
            boolean z42 = isBetSectionReady;
            State collectAsState32 = SnapshotStateKt.collectAsState(controller.isSubscribed(), null, startRestartGroup, 0, 1);
            State collectAsState42 = SnapshotStateKt.collectAsState(controller.getOneClickBetEnabled(), null, startRestartGroup, 0, 1);
            State collectAsState52 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
            collectAsState2 = SnapshotStateKt.collectAsState(controller.getSelectedTabIndex(), null, startRestartGroup, 0, 1);
            State collectAsState62 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
            State collectAsState72 = SnapshotStateKt.collectAsState(controller.getTabItems(), null, startRestartGroup, 0, 1);
            State collectAsState82 = SnapshotStateKt.collectAsState(controller.getDisplayBaseMatchInfo(), null, startRestartGroup, 0, 1);
            State collectAsState92 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
            State collectAsState102 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
            State collectAsState112 = SnapshotStateKt.collectAsState(controller.getMyPlacedBets(), null, startRestartGroup, 0, 1);
            State collectAsState122 = SnapshotStateKt.collectAsState(controller.isMyPlacedBetsLoading(), null, startRestartGroup, 0, 1);
            State collectAsState132 = SnapshotStateKt.collectAsState(controller.getFinishedMatchUpcomingCategories(), null, startRestartGroup, 0, 1);
            State collectAsState142 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
            State collectAsState152 = SnapshotStateKt.collectAsState(controller.getValidatingBetIds(), null, startRestartGroup, 0, 1);
            State collectAsState162 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
            State collectAsState172 = SnapshotStateKt.collectAsState(controller.getShowPlayerStatsMinStakeInfo(), null, startRestartGroup, 0, 1);
            State collectAsState182 = SnapshotStateKt.collectAsState(controller.getPlayerStatsMinStake(), null, startRestartGroup, 0, 1);
            MatchDetailsScreen$lambda$8 = MatchDetailsScreen$lambda$8(collectAsState82);
            State collectAsState192 = SnapshotStateKt.collectAsState(controller.getMatchComments(), null, startRestartGroup, 0, 1);
            State collectAsState202 = SnapshotStateKt.collectAsState(controller.isMatchCommentsLoading(), null, startRestartGroup, 0, 1);
            boolean z52 = isTourActive;
            State collectAsState212 = SnapshotStateKt.collectAsState(controller.isMatchCommentsLoadingMore(), null, startRestartGroup, 0, 1);
            final Function1 function1132 = function111;
            State collectAsState222 = SnapshotStateKt.collectAsState(controller.getHasMoreMatchComments(), null, startRestartGroup, 0, 1);
            State collectAsState232 = SnapshotStateKt.collectAsState(controller.isSendingMatchComment(), null, startRestartGroup, 0, 1);
            int currentUserId2 = controller.getCurrentUserId();
            List<ExtendedMessageModel> MatchDetailsScreen$lambda$193 = MatchDetailsScreen$lambda$19(collectAsState192);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed2 = startRestartGroup.changed(MatchDetailsScreen$lambda$193) | startRestartGroup.changed(currentUserId2);
            Object rememberedValue72 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            List<ExtendedMessageModel> MatchDetailsScreen$lambda$1922 = MatchDetailsScreen$lambda$19(collectAsState192);
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(MatchDetailsScreen$lambda$1922, 10));
            while (r2.hasNext()) {
            }
            ArrayList arrayList22 = arrayList5;
            startRestartGroup.updateRememberedValue(arrayList22);
            obj2 = arrayList22;
            List list2 = (List) obj2;
            startRestartGroup.endReplaceGroup();
            if (MatchDetailsScreen$lambda$8 != null) {
            }
            MatchShortInfoModel MatchDetailsScreen$lambda$173 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$173 != null) {
            }
            if (name == null) {
            }
            str = name;
            if (MatchDetailsScreen$lambda$8 != null) {
            }
            MatchShortInfoModel MatchDetailsScreen$lambda$1832 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$1832 != null) {
            }
            if (name2 == null) {
            }
            str2 = name2;
            if (MatchDetailsScreen$lambda$8 != null) {
            }
            MatchDetailsScreen$lambda$1 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$1 != null) {
            }
            str3 = null;
            if (MatchDetailsScreen$lambda$8 != null) {
            }
            MatchDetailsScreen$lambda$12 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$12 != null) {
            }
            str4 = null;
            MatchShortInfoModel MatchDetailsScreen$lambda$11022222 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$11022222 != null) {
            }
            if (MatchDetailsScreen$lambda$8 != null) {
            }
            str5 = "";
            if (MatchDetailsScreen$lambda$8 == null) {
            }
            if (MatchDetailsScreen$lambda$8 != null) {
            }
            str6 = dateTime;
            MatchShortInfoModel MatchDetailsScreen$lambda$111222222222 = MatchDetailsScreen$lambda$1(collectAsState);
            MatchCommentsState matchCommentsState222222222 = new MatchCommentsState(MatchDetailsScreen$lambda$111222222222 != null ? Long.valueOf(MatchDetailsScreen$lambda$111222222222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list2, MatchDetailsScreen$lambda$20(collectAsState202), MatchDetailsScreen$lambda$21(collectAsState212), MatchDetailsScreen$lambda$22(collectAsState222), MatchDetailsScreen$lambda$23(collectAsState232));
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(controller);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MatchDetailsScreen$lambda$37$lambda$36;
                    MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                    return MatchDetailsScreen$lambda$37$lambda$36;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            Function0 function05222222222 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance2 = startRestartGroup.changedInstance(controller);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MatchDetailsScreen$lambda$39$lambda$38;
                    MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                    return MatchDetailsScreen$lambda$39$lambda$38;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            Function0 function06222222222 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance3 = startRestartGroup.changedInstance(controller);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj13) {
                    Unit MatchDetailsScreen$lambda$41$lambda$40;
                    MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                    return MatchDetailsScreen$lambda$41$lambda$40;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            MatchCommentsCallbacks matchCommentsCallbacks222222222 = new MatchCommentsCallbacks(function05222222222, function06222222222, (Function1) rememberedValue3);
            boolean MatchDetailsScreen$lambda$4222222222 = MatchDetailsScreen$lambda$4(collectAsState52);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance4 = startRestartGroup.changedInstance(controller);
            Object rememberedValue8222222222 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            Function0 function07222222222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MatchDetailsScreen$lambda$43$lambda$42;
                    MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                    return MatchDetailsScreen$lambda$43$lambda$42;
                }
            };
            startRestartGroup.updateRememberedValue(function07222222222);
            obj3 = function07222222222;
            startRestartGroup.endReplaceGroup();
            boolean z7222222222 = c;
            int i11222222222 = i8;
            PullRefreshState m2661rememberPullRefreshStateUuyPYSY222222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$4222222222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState222222222 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            if (MatchDetailsScreen$lambda$5(collectAsState2) == i11222222222) {
            }
            Modifier pullRefresh$default222222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY222222222, z7222222222, i11222222222, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy422222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z7222222222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z7222222222 ? 1 : 0);
            CompositionLocalMap currentCompositionLocalMap622222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier622222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default222222222);
            Function0<ComposeUiNode> constructor622222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy422222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier622222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance422222222 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default322222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy322222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322222222);
            Function0<ComposeUiNode> constructor2222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy322222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance322222222 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion222222222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222222222);
            Function0<ComposeUiNode> constructor3222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222222222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222222222 = ColumnScopeInstance.INSTANCE;
            float f222222222 = 12;
            Modifier m1518paddingVpY3zN4$default222222222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222222), 0.0f, 2, null);
            MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$13 != null) {
            }
            MatchShortInfoModel MatchDetailsScreen$lambda$112222222222 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$112222222222 != null) {
            }
            MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$14 != null) {
            }
            MatchShortInfoModel MatchDetailsScreen$lambda$113222222222 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$113222222222 != null) {
            }
            boolean MatchDetailsScreen$lambda$2222222222 = MatchDetailsScreen$lambda$2(collectAsState32);
            startRestartGroup.startReplaceGroup(790956202);
            MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
            if (MatchDetailsScreen$lambda$15 != null) {
            }
            num = null;
            startRestartGroup.startReplaceGroup(790959342);
            if (num == null) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endReplaceGroup();
            int i12222222222 = i3;
            String str10222222222 = str7;
            MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default222222222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$2222222222, function02, MatchDetailsScreen$lambda$3(collectAsState42), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
            startRestartGroup.startReplaceGroup(790972505);
            if (MatchDetailsScreen$lambda$8 == null) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier fillMaxSize$default2222222222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance322222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
            MeasurePolicy maybeCachedBoxMeasurePolicy3222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5222222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222222222);
            Function0<ComposeUiNode> constructor5222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap5222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5222222222);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier5222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3222222222 = BoxScopeInstance.INSTANCE;
            MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
            if (MatchDetailsScreen$lambda$5 != 0) {
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
            composer2 = startRestartGroup;
            PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState52), m2661rememberPullRefreshStateUuyPYSY222222222, boxScopeInstance422222222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
            Boolean valueOf4222222222 = Boolean.valueOf(z2);
            Boolean valueOf5222222222 = Boolean.valueOf(z42);
            composer2.startReplaceGroup(-1746271574);
            changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z42);
            rememberedValue5 = composer2.rememberedValue();
            if (!changed3) {
            }
            rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z42, null);
            composer2.updateRememberedValue(rememberedValue5);
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf4222222222, tourStep, valueOf5222222222, (Function2) rememberedValue5, composer2, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            function17 = function110;
            function03 = function04;
            tourState2 = tourState3;
            function18 = function112;
            function19 = function16;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (tourState3 != null) {
        }
        if (tourState3 != null) {
        }
        if (tourState3 != null) {
        }
        Boolean valueOf222 = Boolean.valueOf(isTourActive);
        Boolean valueOf322 = Boolean.valueOf(isBetSectionReady);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = startRestartGroup.changed(currentStep == null ? -1 : currentStep.ordinal()) | startRestartGroup.changed(isTourActive) | startRestartGroup.changed(isBetSectionReady);
        Object rememberedValue622 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        MatchDetailsScreenKt$MatchDetailsScreen$1$1 matchDetailsScreenKt$MatchDetailsScreen$1$122 = new MatchDetailsScreenKt$MatchDetailsScreen$1$1(isTourActive, currentStep, isBetSectionReady, null);
        startRestartGroup.updateRememberedValue(matchDetailsScreenKt$MatchDetailsScreen$1$122);
        obj = matchDetailsScreenKt$MatchDetailsScreen$1$122;
        startRestartGroup.endReplaceGroup();
        TourStep tourStep222 = currentStep;
        EffectsKt.LaunchedEffect(valueOf222, tourStep222, valueOf322, (Function2) obj, startRestartGroup, 0);
        collectAsState = SnapshotStateKt.collectAsState(controller.getCurrentMatch(), null, startRestartGroup, 0, 1);
        boolean z422 = isBetSectionReady;
        State collectAsState322 = SnapshotStateKt.collectAsState(controller.isSubscribed(), null, startRestartGroup, 0, 1);
        State collectAsState422 = SnapshotStateKt.collectAsState(controller.getOneClickBetEnabled(), null, startRestartGroup, 0, 1);
        State collectAsState522 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
        collectAsState2 = SnapshotStateKt.collectAsState(controller.getSelectedTabIndex(), null, startRestartGroup, 0, 1);
        State collectAsState622 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
        State collectAsState722 = SnapshotStateKt.collectAsState(controller.getTabItems(), null, startRestartGroup, 0, 1);
        State collectAsState822 = SnapshotStateKt.collectAsState(controller.getDisplayBaseMatchInfo(), null, startRestartGroup, 0, 1);
        State collectAsState922 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
        State collectAsState1022 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
        State collectAsState1122 = SnapshotStateKt.collectAsState(controller.getMyPlacedBets(), null, startRestartGroup, 0, 1);
        State collectAsState1222 = SnapshotStateKt.collectAsState(controller.isMyPlacedBetsLoading(), null, startRestartGroup, 0, 1);
        State collectAsState1322 = SnapshotStateKt.collectAsState(controller.getFinishedMatchUpcomingCategories(), null, startRestartGroup, 0, 1);
        State collectAsState1422 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
        State collectAsState1522 = SnapshotStateKt.collectAsState(controller.getValidatingBetIds(), null, startRestartGroup, 0, 1);
        State collectAsState1622 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
        State collectAsState1722 = SnapshotStateKt.collectAsState(controller.getShowPlayerStatsMinStakeInfo(), null, startRestartGroup, 0, 1);
        State collectAsState1822 = SnapshotStateKt.collectAsState(controller.getPlayerStatsMinStake(), null, startRestartGroup, 0, 1);
        MatchDetailsScreen$lambda$8 = MatchDetailsScreen$lambda$8(collectAsState822);
        State collectAsState1922 = SnapshotStateKt.collectAsState(controller.getMatchComments(), null, startRestartGroup, 0, 1);
        State collectAsState2022 = SnapshotStateKt.collectAsState(controller.isMatchCommentsLoading(), null, startRestartGroup, 0, 1);
        boolean z522 = isTourActive;
        State collectAsState2122 = SnapshotStateKt.collectAsState(controller.isMatchCommentsLoadingMore(), null, startRestartGroup, 0, 1);
        final Function1 function11322 = function111;
        State collectAsState2222 = SnapshotStateKt.collectAsState(controller.getHasMoreMatchComments(), null, startRestartGroup, 0, 1);
        State collectAsState2322 = SnapshotStateKt.collectAsState(controller.isSendingMatchComment(), null, startRestartGroup, 0, 1);
        int currentUserId22 = controller.getCurrentUserId();
        List<ExtendedMessageModel> MatchDetailsScreen$lambda$1932 = MatchDetailsScreen$lambda$19(collectAsState1922);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed2 = startRestartGroup.changed(MatchDetailsScreen$lambda$1932) | startRestartGroup.changed(currentUserId22);
        Object rememberedValue722 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        List<ExtendedMessageModel> MatchDetailsScreen$lambda$19222 = MatchDetailsScreen$lambda$19(collectAsState1922);
        ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(MatchDetailsScreen$lambda$19222, 10));
        while (r2.hasNext()) {
        }
        ArrayList arrayList222 = arrayList52;
        startRestartGroup.updateRememberedValue(arrayList222);
        obj2 = arrayList222;
        List list22 = (List) obj2;
        startRestartGroup.endReplaceGroup();
        if (MatchDetailsScreen$lambda$8 != null) {
        }
        MatchShortInfoModel MatchDetailsScreen$lambda$1732 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$1732 != null) {
        }
        if (name == null) {
        }
        str = name;
        if (MatchDetailsScreen$lambda$8 != null) {
        }
        MatchShortInfoModel MatchDetailsScreen$lambda$18322 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$18322 != null) {
        }
        if (name2 == null) {
        }
        str2 = name2;
        if (MatchDetailsScreen$lambda$8 != null) {
        }
        MatchDetailsScreen$lambda$1 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$1 != null) {
        }
        str3 = null;
        if (MatchDetailsScreen$lambda$8 != null) {
        }
        MatchDetailsScreen$lambda$12 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$12 != null) {
        }
        str4 = null;
        MatchShortInfoModel MatchDetailsScreen$lambda$110222222 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$110222222 != null) {
        }
        if (MatchDetailsScreen$lambda$8 != null) {
        }
        str5 = "";
        if (MatchDetailsScreen$lambda$8 == null) {
        }
        if (MatchDetailsScreen$lambda$8 != null) {
        }
        str6 = dateTime;
        MatchShortInfoModel MatchDetailsScreen$lambda$1112222222222 = MatchDetailsScreen$lambda$1(collectAsState);
        MatchCommentsState matchCommentsState2222222222 = new MatchCommentsState(MatchDetailsScreen$lambda$1112222222222 != null ? Long.valueOf(MatchDetailsScreen$lambda$1112222222222.getId()) : null, str, str3, str2, str4, str5, str6, z6, list22, MatchDetailsScreen$lambda$20(collectAsState2022), MatchDetailsScreen$lambda$21(collectAsState2122), MatchDetailsScreen$lambda$22(collectAsState2222), MatchDetailsScreen$lambda$23(collectAsState2322));
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(controller);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MatchDetailsScreen$lambda$37$lambda$36;
                MatchDetailsScreen$lambda$37$lambda$36 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController.this);
                return MatchDetailsScreen$lambda$37$lambda$36;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        Function0 function052222222222 = (Function0) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(controller);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MatchDetailsScreen$lambda$39$lambda$38;
                MatchDetailsScreen$lambda$39$lambda$38 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController.this);
                return MatchDetailsScreen$lambda$39$lambda$38;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        Function0 function062222222222 = (Function0) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance3 = startRestartGroup.changedInstance(controller);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj13) {
                Unit MatchDetailsScreen$lambda$41$lambda$40;
                MatchDetailsScreen$lambda$41$lambda$40 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController.this, (String) obj13);
                return MatchDetailsScreen$lambda$41$lambda$40;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        MatchCommentsCallbacks matchCommentsCallbacks2222222222 = new MatchCommentsCallbacks(function052222222222, function062222222222, (Function1) rememberedValue3);
        boolean MatchDetailsScreen$lambda$42222222222 = MatchDetailsScreen$lambda$4(collectAsState522);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance4 = startRestartGroup.changedInstance(controller);
        Object rememberedValue82222222222 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        Function0 function072222222222 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailsScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MatchDetailsScreen$lambda$43$lambda$42;
                MatchDetailsScreen$lambda$43$lambda$42 = MatchDetailsScreenKt.MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController.this);
                return MatchDetailsScreen$lambda$43$lambda$42;
            }
        };
        startRestartGroup.updateRememberedValue(function072222222222);
        obj3 = function072222222222;
        startRestartGroup.endReplaceGroup();
        boolean z72222222222 = c;
        int i112222222222 = i8;
        PullRefreshState m2661rememberPullRefreshStateUuyPYSY2222222222 = PullRefreshStateKt.m2661rememberPullRefreshStateUuyPYSY(MatchDetailsScreen$lambda$42222222222, (Function0) obj3, 0.0f, 0.0f, startRestartGroup, 0, 12);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2222222222 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        if (MatchDetailsScreen$lambda$5(collectAsState2) == i112222222222) {
        }
        Modifier pullRefresh$default2222222222 = PullRefreshKt.pullRefresh$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m2661rememberPullRefreshStateUuyPYSY2222222222, z72222222222, i112222222222, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy4222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z72222222222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z72222222222 ? 1 : 0);
        CompositionLocalMap currentCompositionLocalMap6222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier6222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pullRefresh$default2222222222);
        Function0<ComposeUiNode> constructor6222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy4222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6222222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier6222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance4222222222 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default3222222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3222222222);
        Function0<ComposeUiNode> constructor22222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy3222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3222222222 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion2222222222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy22222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222222222);
        Function0<ComposeUiNode> constructor32222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222222222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222222222 = ColumnScopeInstance.INSTANCE;
        float f2222222222 = 12;
        Modifier m1518paddingVpY3zN4$default2222222222 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222222222), 0.0f, 2, null);
        MatchDetailsScreen$lambda$13 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$13 != null) {
        }
        MatchShortInfoModel MatchDetailsScreen$lambda$1122222222222 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$1122222222222 != null) {
        }
        MatchDetailsScreen$lambda$14 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$14 != null) {
        }
        MatchShortInfoModel MatchDetailsScreen$lambda$1132222222222 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$1132222222222 != null) {
        }
        boolean MatchDetailsScreen$lambda$22222222222 = MatchDetailsScreen$lambda$2(collectAsState322);
        startRestartGroup.startReplaceGroup(790956202);
        MatchDetailsScreen$lambda$15 = MatchDetailsScreen$lambda$1(collectAsState);
        if (MatchDetailsScreen$lambda$15 != null) {
        }
        num = null;
        startRestartGroup.startReplaceGroup(790959342);
        if (num == null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.endReplaceGroup();
        int i122222222222 = i3;
        String str102222222222 = str7;
        MatchDetailTopElementKt.MatchDetailTopElement(m1518paddingVpY3zN4$default2222222222, onBackClick, name3, photoUrl3, onNotificationClick, MatchDetailsScreen$lambda$22222222222, function02, MatchDetailsScreen$lambda$3(collectAsState422), onOpenOneClickBetSettings, startRestartGroup, ((i3 << 3) & 112) | 6 | ((i3 << 9) & 57344) | ((i3 << 15) & 234881024), 0);
        startRestartGroup.startReplaceGroup(790972505);
        if (MatchDetailsScreen$lambda$8 == null) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier fillMaxSize$default22222222222 = SizeKt.fillMaxSize$default(ColumnScope.weight$default(columnScopeInstance3222222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, i9, str8);
        MeasurePolicy maybeCachedBoxMeasurePolicy32222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str9);
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap52222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222222222);
        Function0<ComposeUiNode> constructor52222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap52222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash52222222222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier52222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32222222222 = BoxScopeInstance.INSTANCE;
        MatchDetailsScreen$lambda$5 = MatchDetailsScreen$lambda$5(collectAsState2);
        if (MatchDetailsScreen$lambda$5 != 0) {
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
        composer2 = startRestartGroup;
        PullRefreshIndicatorKt.m2657PullRefreshIndicatorjB83MbM(MatchDetailsScreen$lambda$4(collectAsState522), m2661rememberPullRefreshStateUuyPYSY2222222222, boxScopeInstance4222222222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0L, 0L, false, startRestartGroup, PullRefreshState.$stable << 3, 56);
        Boolean valueOf42222222222 = Boolean.valueOf(z2);
        Boolean valueOf52222222222 = Boolean.valueOf(z422);
        composer2.startReplaceGroup(-1746271574);
        changed3 = composer2.changed(z2) | composer2.changed(tourStep == null ? -1 : tourStep.ordinal()) | composer2.changed(z422);
        rememberedValue5 = composer2.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = new MatchDetailsScreenKt$MatchDetailsScreen$2$2$1(z2, tourStep, z422, null);
        composer2.updateRememberedValue(rememberedValue5);
        composer2.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf42222222222, tourStep, valueOf52222222222, (Function2) rememberedValue5, composer2, 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function17 = function110;
        function03 = function04;
        tourState2 = tourState3;
        function18 = function112;
        function19 = function16;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$37$lambda$36(MatchDetailsController matchDetailsController) {
        matchDetailsController.refreshMatchComments();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$39$lambda$38(MatchDetailsController matchDetailsController) {
        matchDetailsController.loadMoreMatchComments();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$41$lambda$40(MatchDetailsController matchDetailsController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchDetailsController.sendMatchComment(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$43$lambda$42(MatchDetailsController matchDetailsController) {
        matchDetailsController.invokeRefresh();
        return Unit.INSTANCE;
    }

    private static final boolean MatchDetailsScreen$lambda$45(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MatchDetailsScreen$lambda$46(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$51$lambda$50$lambda$49$lambda$48(int i, MatchShortInfoModel matchShortInfoModel) {
        NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i, UiExtensionsKt.isLive(matchShortInfoModel), (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$55$lambda$54$lambda$53(Function1 function1, Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        function1.invoke(rect);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$58$lambda$57(State state) {
        TeamModelShort homeTeam;
        MatchShortInfoModel MatchDetailsScreen$lambda$1 = MatchDetailsScreen$lambda$1(state);
        long id = (MatchDetailsScreen$lambda$1 == null || (homeTeam = MatchDetailsScreen$lambda$1.getHomeTeam()) == null) ? 0L : homeTeam.getId();
        if (id > 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("teamId", id);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TEAM_DETAILS, bundle));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$64$lambda$63$lambda$62$lambda$61$lambda$60(State state) {
        TeamModelShort awayTeam;
        MatchShortInfoModel MatchDetailsScreen$lambda$1 = MatchDetailsScreen$lambda$1(state);
        long id = (MatchDetailsScreen$lambda$1 == null || (awayTeam = MatchDetailsScreen$lambda$1.getAwayTeam()) == null) ? 0L : awayTeam.getId();
        if (id > 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("teamId", id);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TEAM_DETAILS, bundle));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$67$lambda$66(MatchDetailsController matchDetailsController, int i) {
        matchDetailsController.onBetGroupTabSelected(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$69$lambda$68(MatchDetailsController matchDetailsController, long j, int i) {
        matchDetailsController.onBetClick(j, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$71$lambda$70(MatchDetailsController matchDetailsController, int i, long j) {
        matchDetailsController.onExpandToggle(i, j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$73$lambda$72(MatchDetailsController matchDetailsController, int i, boolean z, List groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        matchDetailsController.setAllExpanded(i, z, groupIds);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$77$lambda$76(MatchDetailsController matchDetailsController) {
        matchDetailsController.togglePlayerStatsMinStakeInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$79$lambda$78(MatchDetailsController matchDetailsController, long j) {
        matchDetailsController.onMyPlacedBetClick(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailsScreen$lambda$85$lambda$83$lambda$82$lambda$81$lambda$80(MutableState mutableState, boolean z) {
        MatchDetailsScreen$lambda$46(mutableState, z);
        return Unit.INSTANCE;
    }

    private static final MatchShortInfoModel MatchDetailsScreen$lambda$1(State<MatchShortInfoModel> state) {
        return state.getValue();
    }

    private static final boolean MatchDetailsScreen$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean MatchDetailsScreen$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean MatchDetailsScreen$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final int MatchDetailsScreen$lambda$5(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<BetGroupsTabs> MatchDetailsScreen$lambda$6(State<? extends List<BetGroupsTabs>> state) {
        return state.getValue();
    }

    private static final List<MatchDetailsButtonTabs> MatchDetailsScreen$lambda$7(State<? extends List<? extends MatchDetailsButtonTabs>> state) {
        return (List) state.getValue();
    }

    private static final MatchTopBaseData MatchDetailsScreen$lambda$8(State<MatchTopBaseData> state) {
        return state.getValue();
    }

    private static final int MatchDetailsScreen$lambda$9(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<MatchVarietyGroupBetsModel> MatchDetailsScreen$lambda$10(State<? extends List<MatchVarietyGroupBetsModel>> state) {
        return state.getValue();
    }

    private static final List<MatchPlacedBetInfoModel> MatchDetailsScreen$lambda$11(State<? extends List<MatchPlacedBetInfoModel>> state) {
        return state.getValue();
    }

    private static final boolean MatchDetailsScreen$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<MatchHistoryCategoryUiItem> MatchDetailsScreen$lambda$13(State<? extends List<MatchHistoryCategoryUiItem>> state) {
        return state.getValue();
    }

    private static final Set<Long> MatchDetailsScreen$lambda$14(State<? extends Set<Long>> state) {
        return state.getValue();
    }

    private static final Set<Long> MatchDetailsScreen$lambda$15(State<? extends Set<Long>> state) {
        return state.getValue();
    }

    private static final Map<Integer, Map<Long, Boolean>> MatchDetailsScreen$lambda$16(State<? extends Map<Integer, ? extends Map<Long, Boolean>>> state) {
        return (Map) state.getValue();
    }

    private static final boolean MatchDetailsScreen$lambda$17(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long MatchDetailsScreen$lambda$18(State<Long> state) {
        return state.getValue().longValue();
    }

    private static final List<ExtendedMessageModel> MatchDetailsScreen$lambda$19(State<? extends List<? extends ExtendedMessageModel>> state) {
        return (List) state.getValue();
    }

    private static final boolean MatchDetailsScreen$lambda$20(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean MatchDetailsScreen$lambda$21(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean MatchDetailsScreen$lambda$22(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean MatchDetailsScreen$lambda$23(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
