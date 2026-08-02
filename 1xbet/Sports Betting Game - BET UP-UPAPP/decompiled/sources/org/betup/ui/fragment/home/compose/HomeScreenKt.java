package org.betup.ui.fragment.home.compose;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.domain.quest.DailyQuestTask;
import org.betup.model.local.entity.OddType;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.home.compose.HomeLiveMatchesUiState;
import org.betup.ui.fragment.home.compose.HomeMoreMatchesUiState;
import org.betup.ui.tour.compose.HomeTourHighlight;
import org.betup.ui.tour.compose.HomeTourScroll;
import org.betup.ui.tour.compose.HomeTourScrollController;
import org.betup.ui.tour.compose.TourStep;
import org.betup.utils.SnackbarHelper;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0080\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\t2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010(\u001a\u00020\u00052\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00100\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00106\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020<H\u0007¢\u0006\u0002\u0010=¨\u0006>²\u0006\n\u0010?\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010@\u001a\u0004\u0018\u00010\u001eX\u008a\u008e\u0002²\u0006\u0018\u0010A\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C\u0018\u00010BX\u008a\u008e\u0002²\u0006\u0018\u0010D\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020C\u0018\u00010BX\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020CX\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u00020CX\u008a\u008e\u0002"}, d2 = {"HomeScreen", "", "uiState", "Lorg/betup/ui/fragment/home/compose/HomeUiState;", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "onClaimDailyQuest", "Lkotlin/Function1;", "", "onDailyQuestTaskClick", "Lorg/betup/domain/quest/DailyQuestTask;", "onSpecialOfferClick", "onVideoRewardClick", "onVideoRewardLongClick", "oddType", "Lorg/betup/model/local/entity/OddType;", "isBetSelected", "", "isBetValidating", "isBetLocked", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "onBetClick", "Lkotlin/Function2;", "onLoadMoreLiveMatches", "onLoadMoreMoreMatches", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "tourStep", "Lorg/betup/ui/tour/compose/TourStep;", "shouldRunHomeTourScroll", "shouldShowTourOverlay", "isHomeTourScrollAllowed", "onTrySkipInvisibleTourStep", "onTourScrollStarting", "onTourScrollFinished", "Lkotlin/ParameterName;", "name", "success", "isTourPullRefreshEnabled", "onCompetitionsBoundsReported", "Landroid/graphics/Rect;", "onBattlesBoundsReported", "onMinigamesBoundsReported", "onTopMatchesBoundsReported", "onRankingsBoundsReported", "onTvBetBoundsReported", "onFlashBetBoundsReported", "onLiveArenaSectionBoundsReported", "onMoreMatchesSectionBoundsReported", "onWinRateBoundsReported", "onGlobalRankBoundsReported", "onBestStreakBoundsReported", "onSpecialOfferBoundsReported", "onVideoRewardBoundsReported", "onDailyQuestsBoundsReported", "dailyBonusData", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/home/compose/HomeUiState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lorg/betup/model/local/entity/OddType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Lorg/betup/ui/tour/compose/TourStep;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;IIIIIII)V", "app_release", "isTourProgrammaticScroll", "lastListScrollTourStep", "gameModesScrollPinnedAt", "Lkotlin/Pair;", "", "scrollPinnedAtScrollEnd", "lastShouldShowTourOverlay", "gameModeTileBottomScreenPx", "lazyListViewportBottomScreenPx"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$41(HomeUiState homeUiState, boolean z, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function0 function04, OddType oddType, Function1 function13, Function1 function14, Function1 function15, Function2 function2, Function0 function05, Function0 function06, LazyListState lazyListState, TourStep tourStep, boolean z2, boolean z3, boolean z4, Function0 function07, Function0 function08, Function1 function16, boolean z5, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, Function1 function112, Function1 function113, Function1 function114, Function1 function115, Function1 function116, Function1 function117, Function1 function118, Function1 function119, Function1 function120, Function1 function121, DailyBonusData dailyBonusData, Modifier modifier, int i, int i2, int i3, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        HomeScreen(homeUiState, z, function0, function1, function12, function02, function03, function04, oddType, function13, function14, function15, function2, function05, function06, lazyListState, tourStep, z2, z3, z4, function07, function08, function16, z5, function17, function18, function19, function110, function111, function112, function113, function114, function115, function116, function117, function118, function119, function120, function121, dailyBonusData, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6, i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HomeScreen$lambda$5$lambda$4() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$9$lambda$8(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreen(final HomeUiState uiState, final boolean z, final Function0<Unit> onRefresh, final Function1<? super String, Unit> onClaimDailyQuest, final Function1<? super DailyQuestTask, Unit> onDailyQuestTaskClick, final Function0<Unit> onSpecialOfferClick, final Function0<Unit> onVideoRewardClick, Function0<Unit> function0, final OddType oddType, final Function1<? super Long, Boolean> isBetSelected, final Function1<? super Long, Boolean> isBetValidating, final Function1<? super HomeMatchOddUi, Boolean> isBetLocked, final Function2<? super Long, ? super HomeMatchOddUi, Unit> onBetClick, Function0<Unit> function02, Function0<Unit> function03, LazyListState lazyListState, TourStep tourStep, boolean z2, boolean z3, boolean z4, Function0<Boolean> function04, Function0<Unit> function05, Function1<? super Boolean, Unit> function1, boolean z5, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Function1<? super Rect, Unit> function14, Function1<? super Rect, Unit> function15, Function1<? super Rect, Unit> function16, Function1<? super Rect, Unit> function17, Function1<? super Rect, Unit> function18, Function1<? super Rect, Unit> function19, Function1<? super Rect, Unit> function110, Function1<? super Rect, Unit> function111, Function1<? super Rect, Unit> function112, Function1<? super Rect, Unit> function113, Function1<? super Rect, Unit> function114, Function1<? super Rect, Unit> function115, Function1<? super Rect, Unit> function116, DailyBonusData dailyBonusData, Modifier modifier, Composer composer, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7) {
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
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        Function0<Unit> function06;
        Function0<Unit> function07;
        LazyListState lazyListState2;
        int i41;
        Function0<Boolean> function08;
        Function0<Boolean> function09;
        Function0<Unit> function010;
        Function0<Unit> function011;
        Function1<? super Boolean, Unit> function117;
        Function0<Boolean> function012;
        Function0<Unit> function013;
        Function1<? super Boolean, Unit> function118;
        Function1<? super Rect, Unit> function119;
        DailyBonusData dailyBonusData2;
        boolean z6;
        TourStep tourStep2;
        Function1<? super Rect, Unit> function120;
        Function1<? super Rect, Unit> function121;
        Function1<? super Rect, Unit> function122;
        boolean z7;
        boolean z8;
        boolean z9;
        Function1<? super Rect, Unit> function123;
        Function1<? super Rect, Unit> function124;
        Function1<? super Rect, Unit> function125;
        Function1<? super Rect, Unit> function126;
        Function1<? super Rect, Unit> function127;
        Function1<? super Rect, Unit> function128;
        Function1<? super Rect, Unit> function129;
        Function1<? super Rect, Unit> function130;
        Function1<? super Rect, Unit> function131;
        Function1<? super Rect, Unit> function132;
        Function1<? super Rect, Unit> function133;
        Modifier modifier2;
        Function0<Unit> function014;
        Function0<Unit> function015;
        Function0<Unit> function016;
        LazyListState lazyListState3;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        int i42;
        boolean z10;
        Object rememberedValue4;
        Object rememberedValue5;
        int i43;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object rememberedValue6;
        MutableState mutableState;
        Object rememberedValue7;
        Object rememberedValue8;
        Object rememberedValue9;
        Object rememberedValue10;
        int i44;
        Object rememberedValue11;
        int i45;
        HomeScreenKt$HomeScreen$6$1 rememberedValue12;
        MutableState mutableState2;
        boolean z11;
        boolean changed2;
        HomeScreenKt$HomeScreen$7$1 rememberedValue13;
        boolean changed3;
        Object rememberedValue14;
        final Function0<Unit> function017;
        final Function0<Unit> function018;
        final Function0<Unit> function019;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final Function0<Boolean> function020;
        final Function0<Unit> function021;
        final Function1<? super Boolean, Unit> function134;
        final boolean z15;
        final Function1<? super Rect, Unit> function135;
        final Function1<? super Rect, Unit> function136;
        final Function1<? super Rect, Unit> function137;
        final Function1<? super Rect, Unit> function138;
        final Function1<? super Rect, Unit> function139;
        final Function1<? super Rect, Unit> function140;
        final Function1<? super Rect, Unit> function141;
        final Function1<? super Rect, Unit> function142;
        final Function1<? super Rect, Unit> function143;
        final Function1<? super Rect, Unit> function144;
        final Function1<? super Rect, Unit> function145;
        final Function1<? super Rect, Unit> function146;
        final Function1<? super Rect, Unit> function147;
        final Function1<? super Rect, Unit> function148;
        final Function1<? super Rect, Unit> function149;
        final DailyBonusData dailyBonusData3;
        final Modifier modifier3;
        final TourStep tourStep3;
        final LazyListState lazyListState4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onRefresh, "onRefresh");
        Intrinsics.checkNotNullParameter(onClaimDailyQuest, "onClaimDailyQuest");
        Intrinsics.checkNotNullParameter(onDailyQuestTaskClick, "onDailyQuestTaskClick");
        Intrinsics.checkNotNullParameter(onSpecialOfferClick, "onSpecialOfferClick");
        Intrinsics.checkNotNullParameter(onVideoRewardClick, "onVideoRewardClick");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        Intrinsics.checkNotNullParameter(isBetSelected, "isBetSelected");
        Intrinsics.checkNotNullParameter(isBetValidating, "isBetValidating");
        Intrinsics.checkNotNullParameter(isBetLocked, "isBetLocked");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Composer startRestartGroup = composer.startRestartGroup(-943828617);
        if ((i6 & 1) != 0) {
            i8 = i | 6;
        } else if ((i & 6) == 0) {
            i8 = ((i & 8) == 0 ? startRestartGroup.changed(uiState) : startRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i6 & 2) != 0) {
            i8 |= 48;
        } else if ((i & 48) == 0) {
            i8 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= startRestartGroup.changedInstance(onRefresh) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i8 |= 3072;
        } else if ((i & 3072) == 0) {
            i8 |= startRestartGroup.changedInstance(onClaimDailyQuest) ? 2048 : 1024;
        }
        if ((i6 & 16) != 0) {
            i8 |= 24576;
        } else if ((i & 24576) == 0) {
            i8 |= startRestartGroup.changedInstance(onDailyQuestTaskClick) ? 16384 : 8192;
        }
        if ((i6 & 32) != 0) {
            i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= startRestartGroup.changedInstance(onSpecialOfferClick) ? 131072 : 65536;
        }
        if ((i6 & 64) != 0) {
            i8 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i8 |= startRestartGroup.changedInstance(onVideoRewardClick) ? 1048576 : 524288;
        }
        int i46 = i6 & 128;
        if (i46 != 0) {
            i8 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i8 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i6 & 256) != 0) {
            i8 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i8 |= startRestartGroup.changed(oddType.ordinal()) ? 67108864 : 33554432;
        }
        if ((i6 & 512) != 0) {
            i8 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i8 |= startRestartGroup.changedInstance(isBetSelected) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        int i47 = i8;
        if ((i6 & 1024) != 0) {
            i9 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i9 = (startRestartGroup.changedInstance(isBetValidating) ? 4 : 2) | i2;
        } else {
            i9 = i2;
        }
        if ((i6 & 2048) != 0) {
            i9 |= 48;
        } else if ((i2 & 48) == 0) {
            i9 |= startRestartGroup.changedInstance(isBetLocked) ? 32 : 16;
        }
        if ((i6 & 4096) != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= startRestartGroup.changedInstance(onBetClick) ? 256 : 128;
            i10 = i6 & 8192;
            if (i10 == 0) {
                i9 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i9 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                i11 = i6 & 16384;
                if (i11 != 0) {
                    i9 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i9 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i9 |= ((i6 & 32768) == 0 && startRestartGroup.changed(lazyListState)) ? 131072 : 65536;
                    }
                    i12 = i6 & 65536;
                    if (i12 == 0) {
                        i9 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i9 |= startRestartGroup.changed(tourStep == null ? -1 : tourStep.ordinal()) ? 1048576 : 524288;
                    }
                    i13 = i6 & 131072;
                    if (i13 == 0) {
                        i9 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i9 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                        i14 = i6 & 262144;
                        if (i14 != 0) {
                            i9 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i9 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
                        }
                        i15 = i6 & 524288;
                        if (i15 != 0) {
                            i9 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i9 |= startRestartGroup.changed(z4) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        i16 = i6 & 1048576;
                        if (i16 != 0) {
                            i17 = i3;
                            i18 = i17 | 6;
                        } else {
                            i17 = i3;
                            if ((i17 & 6) == 0) {
                                i18 = i17 | (startRestartGroup.changedInstance(function04) ? 4 : 2);
                            } else {
                                i18 = i17;
                            }
                        }
                        i19 = i6 & 2097152;
                        if (i19 != 0) {
                            i18 |= 48;
                        } else if ((i17 & 48) == 0) {
                            i18 |= startRestartGroup.changedInstance(function05) ? 32 : 16;
                        }
                        int i48 = i18;
                        i20 = i6 & 4194304;
                        if (i20 != 0) {
                            i48 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i17 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i48 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                            i21 = i6 & 8388608;
                            if (i21 == 0) {
                                i48 |= 3072;
                            } else if ((i17 & 3072) == 0) {
                                i48 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                                i22 = i6 & 16777216;
                                if (i22 != 0) {
                                    i48 |= 24576;
                                } else if ((i17 & 24576) == 0) {
                                    i48 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                                    i23 = i6 & 33554432;
                                    if (i23 == 0) {
                                        i48 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i48 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                                    }
                                    i24 = i6 & 67108864;
                                    if (i24 == 0) {
                                        i48 |= 1572864;
                                    } else if ((i17 & 1572864) == 0) {
                                        i48 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                                    }
                                    i25 = i6 & 268435456;
                                    if (i25 == 0) {
                                        i48 |= 100663296;
                                    } else if ((i17 & 100663296) == 0) {
                                        i48 |= startRestartGroup.changedInstance(function16) ? 67108864 : 33554432;
                                    }
                                    i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                                    if (i26 == 0) {
                                        i48 |= 805306368;
                                    } else if ((i17 & 805306368) == 0) {
                                        i48 |= startRestartGroup.changedInstance(function17) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                    }
                                    i27 = i6 & 1073741824;
                                    if (i27 == 0) {
                                        i28 = i4;
                                        i29 = i28 | 6;
                                    } else {
                                        i28 = i4;
                                        if ((i28 & 6) == 0) {
                                            i29 = i28 | (startRestartGroup.changedInstance(function18) ? 4 : 2);
                                        } else {
                                            i29 = i28;
                                        }
                                    }
                                    i30 = i7 & 1;
                                    if (i30 == 0) {
                                        i29 |= 48;
                                    } else if ((i28 & 48) == 0) {
                                        i29 |= startRestartGroup.changedInstance(function19) ? 32 : 16;
                                    }
                                    int i49 = i29;
                                    i31 = i7 & 2;
                                    if (i31 == 0) {
                                        i49 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                    } else if ((i28 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i49 |= startRestartGroup.changedInstance(function110) ? 256 : 128;
                                        i32 = i7 & 4;
                                        if (i32 != 0) {
                                            i49 |= 3072;
                                        } else if ((i28 & 3072) == 0) {
                                            i49 |= startRestartGroup.changedInstance(function111) ? 2048 : 1024;
                                            i33 = i7 & 8;
                                            if (i33 == 0) {
                                                i49 |= 24576;
                                            } else if ((i28 & 24576) == 0) {
                                                i49 |= startRestartGroup.changedInstance(function112) ? 16384 : 8192;
                                                i34 = i7 & 16;
                                                if (i34 != 0) {
                                                    i49 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                                } else if ((i28 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                    i49 |= startRestartGroup.changedInstance(function113) ? 131072 : 65536;
                                                }
                                                i35 = i7 & 32;
                                                if (i35 != 0) {
                                                    i49 |= 1572864;
                                                } else if ((i28 & 1572864) == 0) {
                                                    i49 |= startRestartGroup.changedInstance(function114) ? 1048576 : 524288;
                                                }
                                                i36 = i7 & 64;
                                                if (i36 != 0) {
                                                    i49 |= 12582912;
                                                } else if ((i28 & 12582912) == 0) {
                                                    i49 |= startRestartGroup.changedInstance(function115) ? 8388608 : 4194304;
                                                }
                                                i37 = i7 & 128;
                                                if (i37 != 0) {
                                                    i49 |= 100663296;
                                                } else if ((i28 & 100663296) == 0) {
                                                    i49 |= startRestartGroup.changedInstance(function116) ? 67108864 : 33554432;
                                                }
                                                i38 = i7 & 256;
                                                if (i38 != 0) {
                                                    i49 |= 805306368;
                                                } else if ((i28 & 805306368) == 0) {
                                                    i49 |= startRestartGroup.changedInstance(dailyBonusData) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                                }
                                                i39 = i7 & 512;
                                                if (i39 != 0) {
                                                    i40 = i5 | 6;
                                                } else if ((i5 & 6) == 0) {
                                                    i40 = i5 | (startRestartGroup.changed(modifier) ? 4 : 2);
                                                } else {
                                                    i40 = i5;
                                                }
                                                if ((i47 & 306783379) == 306783378 || (306783379 & i9) != 306783378 || (302589075 & i48) != 302589074 || (i49 & 306783379) != 306783378 || (i40 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                                    startRestartGroup.startDefaults();
                                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                        Function0<Unit> function022 = i46 != 0 ? null : function0;
                                                        if (i10 != 0) {
                                                            startRestartGroup.startReplaceGroup(1849434622);
                                                            Object rememberedValue15 = startRestartGroup.rememberedValue();
                                                            if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue15 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        Unit unit;
                                                                        unit = Unit.INSTANCE;
                                                                        return unit;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue15);
                                                            }
                                                            function06 = (Function0) rememberedValue15;
                                                            startRestartGroup.endReplaceGroup();
                                                        } else {
                                                            function06 = function02;
                                                        }
                                                        if (i11 != 0) {
                                                            startRestartGroup.startReplaceGroup(1849434622);
                                                            Object rememberedValue16 = startRestartGroup.rememberedValue();
                                                            if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue16 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda1
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        Unit unit;
                                                                        unit = Unit.INSTANCE;
                                                                        return unit;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue16);
                                                            }
                                                            function07 = (Function0) rememberedValue16;
                                                            startRestartGroup.endReplaceGroup();
                                                        } else {
                                                            function07 = function03;
                                                        }
                                                        if ((32768 & i6) != 0) {
                                                            lazyListState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                                                            i9 &= -458753;
                                                        } else {
                                                            lazyListState2 = lazyListState;
                                                        }
                                                        TourStep tourStep4 = i12 != 0 ? null : tourStep;
                                                        boolean z16 = i13 != 0 ? false : z2;
                                                        boolean z17 = i14 != 0 ? false : z3;
                                                        boolean z18 = i15 != 0 ? true : z4;
                                                        if (i16 != 0) {
                                                            startRestartGroup.startReplaceGroup(1849434622);
                                                            Object rememberedValue17 = startRestartGroup.rememberedValue();
                                                            i41 = i9;
                                                            if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue17 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda2
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        boolean HomeScreen$lambda$5$lambda$4;
                                                                        HomeScreen$lambda$5$lambda$4 = HomeScreenKt.HomeScreen$lambda$5$lambda$4();
                                                                        return Boolean.valueOf(HomeScreen$lambda$5$lambda$4);
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue17);
                                                            }
                                                            function08 = (Function0) rememberedValue17;
                                                            startRestartGroup.endReplaceGroup();
                                                        } else {
                                                            i41 = i9;
                                                            function08 = function04;
                                                        }
                                                        if (i19 != 0) {
                                                            startRestartGroup.startReplaceGroup(1849434622);
                                                            Object rememberedValue18 = startRestartGroup.rememberedValue();
                                                            function09 = function08;
                                                            if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue18 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda3
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        Unit unit;
                                                                        unit = Unit.INSTANCE;
                                                                        return unit;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue18);
                                                            }
                                                            function010 = (Function0) rememberedValue18;
                                                            startRestartGroup.endReplaceGroup();
                                                        } else {
                                                            function09 = function08;
                                                            function010 = function05;
                                                        }
                                                        if (i20 != 0) {
                                                            startRestartGroup.startReplaceGroup(1849434622);
                                                            Object rememberedValue19 = startRestartGroup.rememberedValue();
                                                            function011 = function010;
                                                            if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue19 = new Function1() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda4
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        Unit HomeScreen$lambda$9$lambda$8;
                                                                        HomeScreen$lambda$9$lambda$8 = HomeScreenKt.HomeScreen$lambda$9$lambda$8(((Boolean) obj).booleanValue());
                                                                        return HomeScreen$lambda$9$lambda$8;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue19);
                                                            }
                                                            function117 = (Function1) rememberedValue19;
                                                            startRestartGroup.endReplaceGroup();
                                                        } else {
                                                            function011 = function010;
                                                            function117 = function1;
                                                        }
                                                        boolean z19 = i21 != 0 ? true : z5;
                                                        Function1<? super Rect, Unit> function150 = i22 != 0 ? null : function12;
                                                        Function1<? super Rect, Unit> function151 = i23 != 0 ? null : function13;
                                                        Function1<? super Rect, Unit> function152 = i24 != 0 ? null : function14;
                                                        Function1<? super Rect, Unit> function153 = (i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : function15;
                                                        Function1<? super Rect, Unit> function154 = i25 != 0 ? null : function16;
                                                        Function1<? super Rect, Unit> function155 = i26 != 0 ? null : function17;
                                                        Function1<? super Rect, Unit> function156 = i27 != 0 ? null : function18;
                                                        Function1<? super Rect, Unit> function157 = i30 != 0 ? null : function19;
                                                        Function1<? super Rect, Unit> function158 = i31 != 0 ? null : function110;
                                                        Function1<? super Rect, Unit> function159 = i32 != 0 ? null : function111;
                                                        Function1<? super Rect, Unit> function160 = i33 != 0 ? null : function112;
                                                        Function1<? super Rect, Unit> function161 = i34 != 0 ? null : function113;
                                                        Function1<? super Rect, Unit> function162 = i35 != 0 ? null : function114;
                                                        Function1<? super Rect, Unit> function163 = i36 != 0 ? null : function115;
                                                        Function1<? super Rect, Unit> function164 = i37 != 0 ? null : function116;
                                                        DailyBonusData dailyBonusData4 = i38 != 0 ? null : dailyBonusData;
                                                        if (i39 != 0) {
                                                            function012 = function09;
                                                            function013 = function011;
                                                            function118 = function117;
                                                            function119 = function164;
                                                            dailyBonusData2 = dailyBonusData4;
                                                            z6 = z19;
                                                            tourStep2 = tourStep4;
                                                            function120 = function158;
                                                            function121 = function159;
                                                            function122 = function163;
                                                            z7 = z16;
                                                            z8 = z17;
                                                            z9 = z18;
                                                            function123 = function150;
                                                            function124 = function151;
                                                            function125 = function152;
                                                            function126 = function153;
                                                            function127 = function154;
                                                            function128 = function155;
                                                            function129 = function156;
                                                            function130 = function157;
                                                            function131 = function160;
                                                            function132 = function161;
                                                            function133 = function162;
                                                            i9 = i41;
                                                            modifier2 = Modifier.INSTANCE;
                                                        } else {
                                                            function012 = function09;
                                                            function013 = function011;
                                                            function118 = function117;
                                                            function119 = function164;
                                                            dailyBonusData2 = dailyBonusData4;
                                                            z6 = z19;
                                                            tourStep2 = tourStep4;
                                                            function120 = function158;
                                                            function121 = function159;
                                                            function122 = function163;
                                                            z7 = z16;
                                                            z8 = z17;
                                                            z9 = z18;
                                                            function123 = function150;
                                                            function124 = function151;
                                                            function125 = function152;
                                                            function126 = function153;
                                                            function127 = function154;
                                                            function128 = function155;
                                                            function129 = function156;
                                                            function130 = function157;
                                                            function131 = function160;
                                                            function132 = function161;
                                                            function133 = function162;
                                                            i9 = i41;
                                                            modifier2 = modifier;
                                                        }
                                                        function014 = function022;
                                                        function015 = function06;
                                                        function016 = function07;
                                                        lazyListState3 = lazyListState2;
                                                    } else {
                                                        startRestartGroup.skipToGroupEnd();
                                                        if ((32768 & i6) != 0) {
                                                            i9 &= -458753;
                                                        }
                                                        function014 = function0;
                                                        function015 = function02;
                                                        function016 = function03;
                                                        lazyListState3 = lazyListState;
                                                        tourStep2 = tourStep;
                                                        z7 = z2;
                                                        z8 = z3;
                                                        z9 = z4;
                                                        function012 = function04;
                                                        function013 = function05;
                                                        function118 = function1;
                                                        z6 = z5;
                                                        function123 = function12;
                                                        function124 = function13;
                                                        function125 = function14;
                                                        function126 = function15;
                                                        function127 = function16;
                                                        function128 = function17;
                                                        function129 = function18;
                                                        function130 = function19;
                                                        function120 = function110;
                                                        function121 = function111;
                                                        function131 = function112;
                                                        function132 = function113;
                                                        function133 = function114;
                                                        function122 = function115;
                                                        function119 = function116;
                                                        dailyBonusData2 = dailyBonusData;
                                                        modifier2 = modifier;
                                                    }
                                                    startRestartGroup.endDefaults();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-943828617, i47, i9, "org.betup.ui.fragment.home.compose.HomeScreen (HomeScreen.kt:98)");
                                                    }
                                                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localContext);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    final Context context = (Context) consume;
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue = startRestartGroup.rememberedValue();
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda5
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit HomeScreen$lambda$11$lambda$10;
                                                                HomeScreen$lambda$11$lambda$10 = HomeScreenKt.HomeScreen$lambda$11$lambda$10();
                                                                return HomeScreen$lambda$11$lambda$10;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    Function0 function023 = (Function0) rememberedValue;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda6
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit HomeScreen$lambda$13$lambda$12;
                                                                HomeScreen$lambda$13$lambda$12 = HomeScreenKt.HomeScreen$lambda$13$lambda$12();
                                                                return HomeScreen$lambda$13$lambda$12;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    }
                                                    Function0 function024 = (Function0) rememberedValue2;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(5004770);
                                                    changed = startRestartGroup.changed(context);
                                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                Unit HomeScreen$lambda$15$lambda$14;
                                                                HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context);
                                                                return HomeScreen$lambda$15$lambda$14;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    }
                                                    Function0 function025 = (Function0) rememberedValue3;
                                                    startRestartGroup.endReplaceGroup();
                                                    boolean z20 = !(uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) || (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Visible);
                                                    boolean z21 = !(uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) || (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Visible);
                                                    startRestartGroup.startReplaceGroup(5004770);
                                                    i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                                    z10 = (i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
                                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                                    if (!z10 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue4 = new HomeTourScrollController(lazyListState3);
                                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                                    }
                                                    HomeTourScrollController homeTourScrollController = (HomeTourScrollController) rememberedValue4;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        i43 = 2;
                                                        snapshotMutationPolicy = null;
                                                        rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                                    } else {
                                                        i43 = 2;
                                                        snapshotMutationPolicy = null;
                                                    }
                                                    MutableState mutableState3 = (MutableState) rememberedValue5;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i43, snapshotMutationPolicy);
                                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                                    }
                                                    mutableState = (MutableState) rememberedValue6;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i43, snapshotMutationPolicy);
                                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                                    }
                                                    MutableState mutableState4 = (MutableState) rememberedValue7;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i43, snapshotMutationPolicy);
                                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                                    }
                                                    MutableState mutableState5 = (MutableState) rememberedValue8;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                                    }
                                                    MutableState mutableState6 = (MutableState) rememberedValue9;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue10 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                        i44 = 0;
                                                        rememberedValue10 = SnapshotIntStateKt.mutableIntStateOf(0);
                                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                                    } else {
                                                        i44 = 0;
                                                    }
                                                    MutableIntState mutableIntState = (MutableIntState) rememberedValue10;
                                                    startRestartGroup.endReplaceGroup();
                                                    startRestartGroup.startReplaceGroup(1849434622);
                                                    rememberedValue11 = startRestartGroup.rememberedValue();
                                                    Modifier modifier4 = modifier2;
                                                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue11 = SnapshotIntStateKt.mutableIntStateOf(i44);
                                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                                    }
                                                    MutableIntState mutableIntState2 = (MutableIntState) rememberedValue11;
                                                    startRestartGroup.endReplaceGroup();
                                                    Integer gameModesColumnIndex = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                                                    startRestartGroup.startReplaceGroup(-1746271574);
                                                    int i50 = 3670016 & i9;
                                                    i45 = i50 == 1048576 ? 1 : i44;
                                                    rememberedValue12 = startRestartGroup.rememberedValue();
                                                    if (i45 == 0 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState4, null);
                                                        startRestartGroup.updateRememberedValue(rememberedValue12);
                                                    }
                                                    startRestartGroup.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                                                    Boolean valueOf = Boolean.valueOf(z8);
                                                    startRestartGroup.startReplaceGroup(-1224400529);
                                                    boolean z22 = (234881024 & i9) == 67108864;
                                                    if (i42 > 131072 || !startRestartGroup.changed(lazyListState3)) {
                                                        mutableState2 = mutableState;
                                                        if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                                            z11 = false;
                                                            changed2 = z11 | z22 | (i50 != 1048576) | startRestartGroup.changed(homeTourScrollController);
                                                            rememberedValue13 = startRestartGroup.rememberedValue();
                                                            if (!changed2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController, mutableState6, mutableState5, null);
                                                                startRestartGroup.updateRememberedValue(rememberedValue13);
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            int i51 = (i9 >> 15) & 112;
                                                            EffectsKt.LaunchedEffect(valueOf, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i51);
                                                            Boolean valueOf2 = Boolean.valueOf(z7);
                                                            Boolean valueOf3 = Boolean.valueOf(z9);
                                                            startRestartGroup.startReplaceGroup(-1224400529);
                                                            changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i50 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                                                            rememberedValue14 = startRestartGroup.rememberedValue();
                                                            if (!changed3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController, uiState, lazyListState3, function013, mutableState3, mutableState2, mutableState4, mutableState5, mutableIntState, mutableIntState2, null);
                                                                startRestartGroup.updateRememberedValue(rememberedValue14);
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            int i52 = i9 >> 21;
                                                            EffectsKt.LaunchedEffect(valueOf2, tourStep2, valueOf3, (Function2) rememberedValue14, startRestartGroup, (i52 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i52 & 14) | i51);
                                                            TourStep tourStep5 = tourStep2;
                                                            LazyListState lazyListState5 = lazyListState3;
                                                            startRestartGroup = startRestartGroup;
                                                            SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function025, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep5, function123, function124, function127, gameModesColumnIndex, mutableState3, mutableIntState2, function023, function024, mutableIntState), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                            function017 = function014;
                                                            function018 = function015;
                                                            function019 = function016;
                                                            z12 = z7;
                                                            z13 = z8;
                                                            z14 = z9;
                                                            function020 = function012;
                                                            function021 = function013;
                                                            function134 = function118;
                                                            z15 = z6;
                                                            function135 = function123;
                                                            function136 = function124;
                                                            function137 = function125;
                                                            function138 = function126;
                                                            function139 = function127;
                                                            function140 = function128;
                                                            function141 = function129;
                                                            function142 = function130;
                                                            function143 = function120;
                                                            function144 = function121;
                                                            function145 = function131;
                                                            function146 = function132;
                                                            function147 = function133;
                                                            function148 = function122;
                                                            function149 = function119;
                                                            dailyBonusData3 = dailyBonusData2;
                                                            modifier3 = modifier4;
                                                            tourStep3 = tourStep5;
                                                            lazyListState4 = lazyListState5;
                                                        }
                                                    } else {
                                                        mutableState2 = mutableState;
                                                    }
                                                    z11 = true;
                                                    changed2 = z11 | z22 | (i50 != 1048576) | startRestartGroup.changed(homeTourScrollController);
                                                    rememberedValue13 = startRestartGroup.rememberedValue();
                                                    if (!changed2) {
                                                    }
                                                    rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController, mutableState6, mutableState5, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                                    startRestartGroup.endReplaceGroup();
                                                    int i512 = (i9 >> 15) & 112;
                                                    EffectsKt.LaunchedEffect(valueOf, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i512);
                                                    Boolean valueOf22 = Boolean.valueOf(z7);
                                                    Boolean valueOf32 = Boolean.valueOf(z9);
                                                    startRestartGroup.startReplaceGroup(-1224400529);
                                                    changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i50 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                                                    rememberedValue14 = startRestartGroup.rememberedValue();
                                                    if (!changed3) {
                                                    }
                                                    rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController, uiState, lazyListState3, function013, mutableState3, mutableState2, mutableState4, mutableState5, mutableIntState, mutableIntState2, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                                    startRestartGroup.endReplaceGroup();
                                                    int i522 = i9 >> 21;
                                                    EffectsKt.LaunchedEffect(valueOf22, tourStep2, valueOf32, (Function2) rememberedValue14, startRestartGroup, (i522 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i522 & 14) | i512);
                                                    TourStep tourStep52 = tourStep2;
                                                    LazyListState lazyListState52 = lazyListState3;
                                                    startRestartGroup = startRestartGroup;
                                                    SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function025, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep52, function123, function124, function127, gameModesColumnIndex, mutableState3, mutableIntState2, function023, function024, mutableIntState), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    function017 = function014;
                                                    function018 = function015;
                                                    function019 = function016;
                                                    z12 = z7;
                                                    z13 = z8;
                                                    z14 = z9;
                                                    function020 = function012;
                                                    function021 = function013;
                                                    function134 = function118;
                                                    z15 = z6;
                                                    function135 = function123;
                                                    function136 = function124;
                                                    function137 = function125;
                                                    function138 = function126;
                                                    function139 = function127;
                                                    function140 = function128;
                                                    function141 = function129;
                                                    function142 = function130;
                                                    function143 = function120;
                                                    function144 = function121;
                                                    function145 = function131;
                                                    function146 = function132;
                                                    function147 = function133;
                                                    function148 = function122;
                                                    function149 = function119;
                                                    dailyBonusData3 = dailyBonusData2;
                                                    modifier3 = modifier4;
                                                    tourStep3 = tourStep52;
                                                    lazyListState4 = lazyListState52;
                                                } else {
                                                    startRestartGroup.skipToGroupEnd();
                                                    function017 = function0;
                                                    function018 = function02;
                                                    function019 = function03;
                                                    lazyListState4 = lazyListState;
                                                    tourStep3 = tourStep;
                                                    z12 = z2;
                                                    z13 = z3;
                                                    z14 = z4;
                                                    function020 = function04;
                                                    function021 = function05;
                                                    function134 = function1;
                                                    z15 = z5;
                                                    function135 = function12;
                                                    function136 = function13;
                                                    function137 = function14;
                                                    function138 = function15;
                                                    function139 = function16;
                                                    function140 = function17;
                                                    function141 = function18;
                                                    function142 = function19;
                                                    function143 = function110;
                                                    function144 = function111;
                                                    function145 = function112;
                                                    function146 = function113;
                                                    function147 = function114;
                                                    function148 = function115;
                                                    function149 = function116;
                                                    dailyBonusData3 = dailyBonusData;
                                                    modifier3 = modifier;
                                                }
                                                endRestartGroup = startRestartGroup.endRestartGroup();
                                                if (endRestartGroup != null) {
                                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda8
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit HomeScreen$lambda$41;
                                                            HomeScreen$lambda$41 = HomeScreenKt.HomeScreen$lambda$41(HomeUiState.this, z, onRefresh, onClaimDailyQuest, onDailyQuestTaskClick, onSpecialOfferClick, onVideoRewardClick, function017, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, function018, function019, lazyListState4, tourStep3, z12, z13, z14, function020, function021, function134, z15, function135, function136, function137, function138, function139, function140, function141, function142, function143, function144, function145, function146, function147, function148, function149, dailyBonusData3, modifier3, i, i2, i3, i4, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                                            return HomeScreen$lambda$41;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            i34 = i7 & 16;
                                            if (i34 != 0) {
                                            }
                                            i35 = i7 & 32;
                                            if (i35 != 0) {
                                            }
                                            i36 = i7 & 64;
                                            if (i36 != 0) {
                                            }
                                            i37 = i7 & 128;
                                            if (i37 != 0) {
                                            }
                                            i38 = i7 & 256;
                                            if (i38 != 0) {
                                            }
                                            i39 = i7 & 512;
                                            if (i39 != 0) {
                                            }
                                            if ((i47 & 306783379) == 306783378) {
                                            }
                                            startRestartGroup.startDefaults();
                                            if ((i & 1) != 0) {
                                            }
                                            if (i46 != 0) {
                                            }
                                            if (i10 != 0) {
                                            }
                                            if (i11 != 0) {
                                            }
                                            if ((32768 & i6) != 0) {
                                            }
                                            if (i12 != 0) {
                                            }
                                            if (i13 != 0) {
                                            }
                                            if (i14 != 0) {
                                            }
                                            if (i15 != 0) {
                                            }
                                            if (i16 != 0) {
                                            }
                                            if (i19 != 0) {
                                            }
                                            if (i20 != 0) {
                                            }
                                            if (i21 != 0) {
                                            }
                                            if (i22 != 0) {
                                            }
                                            if (i23 != 0) {
                                            }
                                            if (i24 != 0) {
                                            }
                                            if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                                            }
                                            if (i25 != 0) {
                                            }
                                            if (i26 != 0) {
                                            }
                                            if (i27 != 0) {
                                            }
                                            if (i30 != 0) {
                                            }
                                            if (i31 != 0) {
                                            }
                                            if (i32 != 0) {
                                            }
                                            if (i33 != 0) {
                                            }
                                            if (i34 != 0) {
                                            }
                                            if (i35 != 0) {
                                            }
                                            if (i36 != 0) {
                                            }
                                            if (i37 != 0) {
                                            }
                                            if (i38 != 0) {
                                            }
                                            if (i39 != 0) {
                                            }
                                            function014 = function022;
                                            function015 = function06;
                                            function016 = function07;
                                            lazyListState3 = lazyListState2;
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume2 = startRestartGroup.consume(localContext2);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            final Context context2 = (Context) consume2;
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            }
                                            Function0 function0232 = (Function0) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            Function0 function0242 = (Function0) rememberedValue2;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(5004770);
                                            changed = startRestartGroup.changed(context2);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (!changed) {
                                            }
                                            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit HomeScreen$lambda$15$lambda$14;
                                                    HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context2);
                                                    return HomeScreen$lambda$15$lambda$14;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                            Function0 function0252 = (Function0) rememberedValue3;
                                            startRestartGroup.endReplaceGroup();
                                            if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                                            }
                                            if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                                            }
                                            startRestartGroup.startReplaceGroup(5004770);
                                            i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            if (i42 <= 131072) {
                                            }
                                            rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (!z10) {
                                            }
                                            rememberedValue4 = new HomeTourScrollController(lazyListState3);
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                            HomeTourScrollController homeTourScrollController2 = (HomeTourScrollController) rememberedValue4;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue5 = startRestartGroup.rememberedValue();
                                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableState mutableState32 = (MutableState) rememberedValue5;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue6 = startRestartGroup.rememberedValue();
                                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            mutableState = (MutableState) rememberedValue6;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue7 = startRestartGroup.rememberedValue();
                                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableState mutableState42 = (MutableState) rememberedValue7;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue8 = startRestartGroup.rememberedValue();
                                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableState mutableState52 = (MutableState) rememberedValue8;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue9 = startRestartGroup.rememberedValue();
                                            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableState mutableState62 = (MutableState) rememberedValue9;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue10 = startRestartGroup.rememberedValue();
                                            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableIntState mutableIntState3 = (MutableIntState) rememberedValue10;
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue11 = startRestartGroup.rememberedValue();
                                            Modifier modifier42 = modifier2;
                                            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableIntState mutableIntState22 = (MutableIntState) rememberedValue11;
                                            startRestartGroup.endReplaceGroup();
                                            Integer gameModesColumnIndex2 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                                            startRestartGroup.startReplaceGroup(-1746271574);
                                            int i502 = 3670016 & i9;
                                            if (i502 == 1048576) {
                                            }
                                            rememberedValue12 = startRestartGroup.rememberedValue();
                                            if (i45 == 0) {
                                            }
                                            rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState42, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue12);
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                                            Boolean valueOf4 = Boolean.valueOf(z8);
                                            startRestartGroup.startReplaceGroup(-1224400529);
                                            if ((234881024 & i9) == 67108864) {
                                            }
                                            if (i42 > 131072) {
                                            }
                                            mutableState2 = mutableState;
                                            if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                            }
                                            z11 = true;
                                            changed2 = z11 | z22 | (i502 != 1048576) | startRestartGroup.changed(homeTourScrollController2);
                                            rememberedValue13 = startRestartGroup.rememberedValue();
                                            if (!changed2) {
                                            }
                                            rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController2, mutableState62, mutableState52, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue13);
                                            startRestartGroup.endReplaceGroup();
                                            int i5122 = (i9 >> 15) & 112;
                                            EffectsKt.LaunchedEffect(valueOf4, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i5122);
                                            Boolean valueOf222 = Boolean.valueOf(z7);
                                            Boolean valueOf322 = Boolean.valueOf(z9);
                                            startRestartGroup.startReplaceGroup(-1224400529);
                                            changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i502 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController2) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                                            rememberedValue14 = startRestartGroup.rememberedValue();
                                            if (!changed3) {
                                            }
                                            rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController2, uiState, lazyListState3, function013, mutableState32, mutableState2, mutableState42, mutableState52, mutableIntState3, mutableIntState22, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue14);
                                            startRestartGroup.endReplaceGroup();
                                            int i5222 = i9 >> 21;
                                            EffectsKt.LaunchedEffect(valueOf222, tourStep2, valueOf322, (Function2) rememberedValue14, startRestartGroup, (i5222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i5222 & 14) | i5122);
                                            TourStep tourStep522 = tourStep2;
                                            LazyListState lazyListState522 = lazyListState3;
                                            startRestartGroup = startRestartGroup;
                                            SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier42, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function0252, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep522, function123, function124, function127, gameModesColumnIndex2, mutableState32, mutableIntState22, function0232, function0242, mutableIntState3), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function017 = function014;
                                            function018 = function015;
                                            function019 = function016;
                                            z12 = z7;
                                            z13 = z8;
                                            z14 = z9;
                                            function020 = function012;
                                            function021 = function013;
                                            function134 = function118;
                                            z15 = z6;
                                            function135 = function123;
                                            function136 = function124;
                                            function137 = function125;
                                            function138 = function126;
                                            function139 = function127;
                                            function140 = function128;
                                            function141 = function129;
                                            function142 = function130;
                                            function143 = function120;
                                            function144 = function121;
                                            function145 = function131;
                                            function146 = function132;
                                            function147 = function133;
                                            function148 = function122;
                                            function149 = function119;
                                            dailyBonusData3 = dailyBonusData2;
                                            modifier3 = modifier42;
                                            tourStep3 = tourStep522;
                                            lazyListState4 = lazyListState522;
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup != null) {
                                            }
                                        }
                                        i33 = i7 & 8;
                                        if (i33 == 0) {
                                        }
                                        i34 = i7 & 16;
                                        if (i34 != 0) {
                                        }
                                        i35 = i7 & 32;
                                        if (i35 != 0) {
                                        }
                                        i36 = i7 & 64;
                                        if (i36 != 0) {
                                        }
                                        i37 = i7 & 128;
                                        if (i37 != 0) {
                                        }
                                        i38 = i7 & 256;
                                        if (i38 != 0) {
                                        }
                                        i39 = i7 & 512;
                                        if (i39 != 0) {
                                        }
                                        if ((i47 & 306783379) == 306783378) {
                                        }
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) != 0) {
                                        }
                                        if (i46 != 0) {
                                        }
                                        if (i10 != 0) {
                                        }
                                        if (i11 != 0) {
                                        }
                                        if ((32768 & i6) != 0) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        if (i13 != 0) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        if (i15 != 0) {
                                        }
                                        if (i16 != 0) {
                                        }
                                        if (i19 != 0) {
                                        }
                                        if (i20 != 0) {
                                        }
                                        if (i21 != 0) {
                                        }
                                        if (i22 != 0) {
                                        }
                                        if (i23 != 0) {
                                        }
                                        if (i24 != 0) {
                                        }
                                        if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                                        }
                                        if (i25 != 0) {
                                        }
                                        if (i26 != 0) {
                                        }
                                        if (i27 != 0) {
                                        }
                                        if (i30 != 0) {
                                        }
                                        if (i31 != 0) {
                                        }
                                        if (i32 != 0) {
                                        }
                                        if (i33 != 0) {
                                        }
                                        if (i34 != 0) {
                                        }
                                        if (i35 != 0) {
                                        }
                                        if (i36 != 0) {
                                        }
                                        if (i37 != 0) {
                                        }
                                        if (i38 != 0) {
                                        }
                                        if (i39 != 0) {
                                        }
                                        function014 = function022;
                                        function015 = function06;
                                        function016 = function07;
                                        lazyListState3 = lazyListState2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume22 = startRestartGroup.consume(localContext22);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Context context22 = (Context) consume22;
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        }
                                        Function0 function02322 = (Function0) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        Function0 function02422 = (Function0) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(5004770);
                                        changed = startRestartGroup.changed(context22);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!changed) {
                                        }
                                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit HomeScreen$lambda$15$lambda$14;
                                                HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context22);
                                                return HomeScreen$lambda$15$lambda$14;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                        Function0 function02522 = (Function0) rememberedValue3;
                                        startRestartGroup.endReplaceGroup();
                                        if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                                        }
                                        if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                                        }
                                        startRestartGroup.startReplaceGroup(5004770);
                                        i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        if (i42 <= 131072) {
                                        }
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (!z10) {
                                        }
                                        rememberedValue4 = new HomeTourScrollController(lazyListState3);
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                        HomeTourScrollController homeTourScrollController22 = (HomeTourScrollController) rememberedValue4;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableState mutableState322 = (MutableState) rememberedValue5;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue6 = startRestartGroup.rememberedValue();
                                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        mutableState = (MutableState) rememberedValue6;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue7 = startRestartGroup.rememberedValue();
                                        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableState mutableState422 = (MutableState) rememberedValue7;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue8 = startRestartGroup.rememberedValue();
                                        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableState mutableState522 = (MutableState) rememberedValue8;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue9 = startRestartGroup.rememberedValue();
                                        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableState mutableState622 = (MutableState) rememberedValue9;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue10 = startRestartGroup.rememberedValue();
                                        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableIntState mutableIntState32 = (MutableIntState) rememberedValue10;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue11 = startRestartGroup.rememberedValue();
                                        Modifier modifier422 = modifier2;
                                        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableIntState mutableIntState222 = (MutableIntState) rememberedValue11;
                                        startRestartGroup.endReplaceGroup();
                                        Integer gameModesColumnIndex22 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                                        startRestartGroup.startReplaceGroup(-1746271574);
                                        int i5022 = 3670016 & i9;
                                        if (i5022 == 1048576) {
                                        }
                                        rememberedValue12 = startRestartGroup.rememberedValue();
                                        if (i45 == 0) {
                                        }
                                        rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState422, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue12);
                                        startRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                                        Boolean valueOf42 = Boolean.valueOf(z8);
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        if ((234881024 & i9) == 67108864) {
                                        }
                                        if (i42 > 131072) {
                                        }
                                        mutableState2 = mutableState;
                                        if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                        }
                                        z11 = true;
                                        changed2 = z11 | z22 | (i5022 != 1048576) | startRestartGroup.changed(homeTourScrollController22);
                                        rememberedValue13 = startRestartGroup.rememberedValue();
                                        if (!changed2) {
                                        }
                                        rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController22, mutableState622, mutableState522, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue13);
                                        startRestartGroup.endReplaceGroup();
                                        int i51222 = (i9 >> 15) & 112;
                                        EffectsKt.LaunchedEffect(valueOf42, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i51222);
                                        Boolean valueOf2222 = Boolean.valueOf(z7);
                                        Boolean valueOf3222 = Boolean.valueOf(z9);
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i5022 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController22) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                                        rememberedValue14 = startRestartGroup.rememberedValue();
                                        if (!changed3) {
                                        }
                                        rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController22, uiState, lazyListState3, function013, mutableState322, mutableState2, mutableState422, mutableState522, mutableIntState32, mutableIntState222, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue14);
                                        startRestartGroup.endReplaceGroup();
                                        int i52222 = i9 >> 21;
                                        EffectsKt.LaunchedEffect(valueOf2222, tourStep2, valueOf3222, (Function2) rememberedValue14, startRestartGroup, (i52222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i52222 & 14) | i51222);
                                        TourStep tourStep5222 = tourStep2;
                                        LazyListState lazyListState5222 = lazyListState3;
                                        startRestartGroup = startRestartGroup;
                                        SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier422, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function02522, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep5222, function123, function124, function127, gameModesColumnIndex22, mutableState322, mutableIntState222, function02322, function02422, mutableIntState32), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function017 = function014;
                                        function018 = function015;
                                        function019 = function016;
                                        z12 = z7;
                                        z13 = z8;
                                        z14 = z9;
                                        function020 = function012;
                                        function021 = function013;
                                        function134 = function118;
                                        z15 = z6;
                                        function135 = function123;
                                        function136 = function124;
                                        function137 = function125;
                                        function138 = function126;
                                        function139 = function127;
                                        function140 = function128;
                                        function141 = function129;
                                        function142 = function130;
                                        function143 = function120;
                                        function144 = function121;
                                        function145 = function131;
                                        function146 = function132;
                                        function147 = function133;
                                        function148 = function122;
                                        function149 = function119;
                                        dailyBonusData3 = dailyBonusData2;
                                        modifier3 = modifier422;
                                        tourStep3 = tourStep5222;
                                        lazyListState4 = lazyListState5222;
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup != null) {
                                        }
                                    }
                                    i32 = i7 & 4;
                                    if (i32 != 0) {
                                    }
                                    i33 = i7 & 8;
                                    if (i33 == 0) {
                                    }
                                    i34 = i7 & 16;
                                    if (i34 != 0) {
                                    }
                                    i35 = i7 & 32;
                                    if (i35 != 0) {
                                    }
                                    i36 = i7 & 64;
                                    if (i36 != 0) {
                                    }
                                    i37 = i7 & 128;
                                    if (i37 != 0) {
                                    }
                                    i38 = i7 & 256;
                                    if (i38 != 0) {
                                    }
                                    i39 = i7 & 512;
                                    if (i39 != 0) {
                                    }
                                    if ((i47 & 306783379) == 306783378) {
                                    }
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0) {
                                    }
                                    if (i46 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if ((32768 & i6) != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (i19 != 0) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    if (i21 != 0) {
                                    }
                                    if (i22 != 0) {
                                    }
                                    if (i23 != 0) {
                                    }
                                    if (i24 != 0) {
                                    }
                                    if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                                    }
                                    if (i25 != 0) {
                                    }
                                    if (i26 != 0) {
                                    }
                                    if (i27 != 0) {
                                    }
                                    if (i30 != 0) {
                                    }
                                    if (i31 != 0) {
                                    }
                                    if (i32 != 0) {
                                    }
                                    if (i33 != 0) {
                                    }
                                    if (i34 != 0) {
                                    }
                                    if (i35 != 0) {
                                    }
                                    if (i36 != 0) {
                                    }
                                    if (i37 != 0) {
                                    }
                                    if (i38 != 0) {
                                    }
                                    if (i39 != 0) {
                                    }
                                    function014 = function022;
                                    function015 = function06;
                                    function016 = function07;
                                    lazyListState3 = lazyListState2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<Context> localContext222 = AndroidCompositionLocals_androidKt.getLocalContext();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume222 = startRestartGroup.consume(localContext222);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Context context222 = (Context) consume222;
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    Function0 function023222 = (Function0) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    Function0 function024222 = (Function0) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changed = startRestartGroup.changed(context222);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit HomeScreen$lambda$15$lambda$14;
                                            HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context222);
                                            return HomeScreen$lambda$15$lambda$14;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                    Function0 function025222 = (Function0) rememberedValue3;
                                    startRestartGroup.endReplaceGroup();
                                    if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                                    }
                                    if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                                    }
                                    startRestartGroup.startReplaceGroup(5004770);
                                    i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    if (i42 <= 131072) {
                                    }
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!z10) {
                                    }
                                    rememberedValue4 = new HomeTourScrollController(lazyListState3);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                    HomeTourScrollController homeTourScrollController222 = (HomeTourScrollController) rememberedValue4;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableState mutableState3222 = (MutableState) rememberedValue5;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    mutableState = (MutableState) rememberedValue6;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableState mutableState4222 = (MutableState) rememberedValue7;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableState mutableState5222 = (MutableState) rememberedValue8;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableState mutableState6222 = (MutableState) rememberedValue9;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableIntState mutableIntState322 = (MutableIntState) rememberedValue10;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue11 = startRestartGroup.rememberedValue();
                                    Modifier modifier4222 = modifier2;
                                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableIntState mutableIntState2222 = (MutableIntState) rememberedValue11;
                                    startRestartGroup.endReplaceGroup();
                                    Integer gameModesColumnIndex222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    int i50222 = 3670016 & i9;
                                    if (i50222 == 1048576) {
                                    }
                                    rememberedValue12 = startRestartGroup.rememberedValue();
                                    if (i45 == 0) {
                                    }
                                    rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState4222, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                                    Boolean valueOf422 = Boolean.valueOf(z8);
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    if ((234881024 & i9) == 67108864) {
                                    }
                                    if (i42 > 131072) {
                                    }
                                    mutableState2 = mutableState;
                                    if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                    }
                                    z11 = true;
                                    changed2 = z11 | z22 | (i50222 != 1048576) | startRestartGroup.changed(homeTourScrollController222);
                                    rememberedValue13 = startRestartGroup.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController222, mutableState6222, mutableState5222, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                    startRestartGroup.endReplaceGroup();
                                    int i512222 = (i9 >> 15) & 112;
                                    EffectsKt.LaunchedEffect(valueOf422, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i512222);
                                    Boolean valueOf22222 = Boolean.valueOf(z7);
                                    Boolean valueOf32222 = Boolean.valueOf(z9);
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i50222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                                    rememberedValue14 = startRestartGroup.rememberedValue();
                                    if (!changed3) {
                                    }
                                    rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController222, uiState, lazyListState3, function013, mutableState3222, mutableState2, mutableState4222, mutableState5222, mutableIntState322, mutableIntState2222, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                    startRestartGroup.endReplaceGroup();
                                    int i522222 = i9 >> 21;
                                    EffectsKt.LaunchedEffect(valueOf22222, tourStep2, valueOf32222, (Function2) rememberedValue14, startRestartGroup, (i522222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i522222 & 14) | i512222);
                                    TourStep tourStep52222 = tourStep2;
                                    LazyListState lazyListState52222 = lazyListState3;
                                    startRestartGroup = startRestartGroup;
                                    SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier4222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function025222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep52222, function123, function124, function127, gameModesColumnIndex222, mutableState3222, mutableIntState2222, function023222, function024222, mutableIntState322), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function017 = function014;
                                    function018 = function015;
                                    function019 = function016;
                                    z12 = z7;
                                    z13 = z8;
                                    z14 = z9;
                                    function020 = function012;
                                    function021 = function013;
                                    function134 = function118;
                                    z15 = z6;
                                    function135 = function123;
                                    function136 = function124;
                                    function137 = function125;
                                    function138 = function126;
                                    function139 = function127;
                                    function140 = function128;
                                    function141 = function129;
                                    function142 = function130;
                                    function143 = function120;
                                    function144 = function121;
                                    function145 = function131;
                                    function146 = function132;
                                    function147 = function133;
                                    function148 = function122;
                                    function149 = function119;
                                    dailyBonusData3 = dailyBonusData2;
                                    modifier3 = modifier4222;
                                    tourStep3 = tourStep52222;
                                    lazyListState4 = lazyListState52222;
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                i23 = i6 & 33554432;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 67108864;
                                if (i24 == 0) {
                                }
                                i25 = i6 & 268435456;
                                if (i25 == 0) {
                                }
                                i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                                if (i26 == 0) {
                                }
                                i27 = i6 & 1073741824;
                                if (i27 == 0) {
                                }
                                i30 = i7 & 1;
                                if (i30 == 0) {
                                }
                                int i492 = i29;
                                i31 = i7 & 2;
                                if (i31 == 0) {
                                }
                                i32 = i7 & 4;
                                if (i32 != 0) {
                                }
                                i33 = i7 & 8;
                                if (i33 == 0) {
                                }
                                i34 = i7 & 16;
                                if (i34 != 0) {
                                }
                                i35 = i7 & 32;
                                if (i35 != 0) {
                                }
                                i36 = i7 & 64;
                                if (i36 != 0) {
                                }
                                i37 = i7 & 128;
                                if (i37 != 0) {
                                }
                                i38 = i7 & 256;
                                if (i38 != 0) {
                                }
                                i39 = i7 & 512;
                                if (i39 != 0) {
                                }
                                if ((i47 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                }
                                if (i46 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if ((32768 & i6) != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i13 != 0) {
                                }
                                if (i14 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (i20 != 0) {
                                }
                                if (i21 != 0) {
                                }
                                if (i22 != 0) {
                                }
                                if (i23 != 0) {
                                }
                                if (i24 != 0) {
                                }
                                if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                                }
                                if (i25 != 0) {
                                }
                                if (i26 != 0) {
                                }
                                if (i27 != 0) {
                                }
                                if (i30 != 0) {
                                }
                                if (i31 != 0) {
                                }
                                if (i32 != 0) {
                                }
                                if (i33 != 0) {
                                }
                                if (i34 != 0) {
                                }
                                if (i35 != 0) {
                                }
                                if (i36 != 0) {
                                }
                                if (i37 != 0) {
                                }
                                if (i38 != 0) {
                                }
                                if (i39 != 0) {
                                }
                                function014 = function022;
                                function015 = function06;
                                function016 = function07;
                                lazyListState3 = lazyListState2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<Context> localContext2222 = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2222 = startRestartGroup.consume(localContext2222);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Context context2222 = (Context) consume2222;
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                Function0 function0232222 = (Function0) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                Function0 function0242222 = (Function0) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(5004770);
                                changed = startRestartGroup.changed(context2222);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit HomeScreen$lambda$15$lambda$14;
                                        HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context2222);
                                        return HomeScreen$lambda$15$lambda$14;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                Function0 function0252222 = (Function0) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                                if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                                }
                                if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                                }
                                startRestartGroup.startReplaceGroup(5004770);
                                i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                if (i42 <= 131072) {
                                }
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!z10) {
                                }
                                rememberedValue4 = new HomeTourScrollController(lazyListState3);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                HomeTourScrollController homeTourScrollController2222 = (HomeTourScrollController) rememberedValue4;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState32222 = (MutableState) rememberedValue5;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState = (MutableState) rememberedValue6;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState42222 = (MutableState) rememberedValue7;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState52222 = (MutableState) rememberedValue8;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue9 = startRestartGroup.rememberedValue();
                                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState62222 = (MutableState) rememberedValue9;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue10 = startRestartGroup.rememberedValue();
                                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableIntState mutableIntState3222 = (MutableIntState) rememberedValue10;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue11 = startRestartGroup.rememberedValue();
                                Modifier modifier42222 = modifier2;
                                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableIntState mutableIntState22222 = (MutableIntState) rememberedValue11;
                                startRestartGroup.endReplaceGroup();
                                Integer gameModesColumnIndex2222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                                startRestartGroup.startReplaceGroup(-1746271574);
                                int i502222 = 3670016 & i9;
                                if (i502222 == 1048576) {
                                }
                                rememberedValue12 = startRestartGroup.rememberedValue();
                                if (i45 == 0) {
                                }
                                rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState42222, null);
                                startRestartGroup.updateRememberedValue(rememberedValue12);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                                Boolean valueOf4222 = Boolean.valueOf(z8);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                if ((234881024 & i9) == 67108864) {
                                }
                                if (i42 > 131072) {
                                }
                                mutableState2 = mutableState;
                                if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                }
                                z11 = true;
                                changed2 = z11 | z22 | (i502222 != 1048576) | startRestartGroup.changed(homeTourScrollController2222);
                                rememberedValue13 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController2222, mutableState62222, mutableState52222, null);
                                startRestartGroup.updateRememberedValue(rememberedValue13);
                                startRestartGroup.endReplaceGroup();
                                int i5122222 = (i9 >> 15) & 112;
                                EffectsKt.LaunchedEffect(valueOf4222, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i5122222);
                                Boolean valueOf222222 = Boolean.valueOf(z7);
                                Boolean valueOf322222 = Boolean.valueOf(z9);
                                startRestartGroup.startReplaceGroup(-1224400529);
                                changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i502222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController2222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                                rememberedValue14 = startRestartGroup.rememberedValue();
                                if (!changed3) {
                                }
                                rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController2222, uiState, lazyListState3, function013, mutableState32222, mutableState2, mutableState42222, mutableState52222, mutableIntState3222, mutableIntState22222, null);
                                startRestartGroup.updateRememberedValue(rememberedValue14);
                                startRestartGroup.endReplaceGroup();
                                int i5222222 = i9 >> 21;
                                EffectsKt.LaunchedEffect(valueOf222222, tourStep2, valueOf322222, (Function2) rememberedValue14, startRestartGroup, (i5222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i5222222 & 14) | i5122222);
                                TourStep tourStep522222 = tourStep2;
                                LazyListState lazyListState522222 = lazyListState3;
                                startRestartGroup = startRestartGroup;
                                SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier42222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function0252222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep522222, function123, function124, function127, gameModesColumnIndex2222, mutableState32222, mutableIntState22222, function0232222, function0242222, mutableIntState3222), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function017 = function014;
                                function018 = function015;
                                function019 = function016;
                                z12 = z7;
                                z13 = z8;
                                z14 = z9;
                                function020 = function012;
                                function021 = function013;
                                function134 = function118;
                                z15 = z6;
                                function135 = function123;
                                function136 = function124;
                                function137 = function125;
                                function138 = function126;
                                function139 = function127;
                                function140 = function128;
                                function141 = function129;
                                function142 = function130;
                                function143 = function120;
                                function144 = function121;
                                function145 = function131;
                                function146 = function132;
                                function147 = function133;
                                function148 = function122;
                                function149 = function119;
                                dailyBonusData3 = dailyBonusData2;
                                modifier3 = modifier42222;
                                tourStep3 = tourStep522222;
                                lazyListState4 = lazyListState522222;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i22 = i6 & 16777216;
                            if (i22 != 0) {
                            }
                            i23 = i6 & 33554432;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 67108864;
                            if (i24 == 0) {
                            }
                            i25 = i6 & 268435456;
                            if (i25 == 0) {
                            }
                            i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                            if (i26 == 0) {
                            }
                            i27 = i6 & 1073741824;
                            if (i27 == 0) {
                            }
                            i30 = i7 & 1;
                            if (i30 == 0) {
                            }
                            int i4922 = i29;
                            i31 = i7 & 2;
                            if (i31 == 0) {
                            }
                            i32 = i7 & 4;
                            if (i32 != 0) {
                            }
                            i33 = i7 & 8;
                            if (i33 == 0) {
                            }
                            i34 = i7 & 16;
                            if (i34 != 0) {
                            }
                            i35 = i7 & 32;
                            if (i35 != 0) {
                            }
                            i36 = i7 & 64;
                            if (i36 != 0) {
                            }
                            i37 = i7 & 128;
                            if (i37 != 0) {
                            }
                            i38 = i7 & 256;
                            if (i38 != 0) {
                            }
                            i39 = i7 & 512;
                            if (i39 != 0) {
                            }
                            if ((i47 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i46 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if ((32768 & i6) != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (i26 != 0) {
                            }
                            if (i27 != 0) {
                            }
                            if (i30 != 0) {
                            }
                            if (i31 != 0) {
                            }
                            if (i32 != 0) {
                            }
                            if (i33 != 0) {
                            }
                            if (i34 != 0) {
                            }
                            if (i35 != 0) {
                            }
                            if (i36 != 0) {
                            }
                            if (i37 != 0) {
                            }
                            if (i38 != 0) {
                            }
                            if (i39 != 0) {
                            }
                            function014 = function022;
                            function015 = function06;
                            function016 = function07;
                            lazyListState3 = lazyListState2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<Context> localContext22222 = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume22222 = startRestartGroup.consume(localContext22222);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Context context22222 = (Context) consume22222;
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            Function0 function02322222 = (Function0) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            Function0 function02422222 = (Function0) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            changed = startRestartGroup.changed(context22222);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit HomeScreen$lambda$15$lambda$14;
                                    HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context22222);
                                    return HomeScreen$lambda$15$lambda$14;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            Function0 function02522222 = (Function0) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                            }
                            if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            if (i42 <= 131072) {
                            }
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z10) {
                            }
                            rememberedValue4 = new HomeTourScrollController(lazyListState3);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            HomeTourScrollController homeTourScrollController22222 = (HomeTourScrollController) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState322222 = (MutableState) rememberedValue5;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (MutableState) rememberedValue6;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState422222 = (MutableState) rememberedValue7;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState522222 = (MutableState) rememberedValue8;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue9 = startRestartGroup.rememberedValue();
                            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState622222 = (MutableState) rememberedValue9;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue10 = startRestartGroup.rememberedValue();
                            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableIntState mutableIntState32222 = (MutableIntState) rememberedValue10;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue11 = startRestartGroup.rememberedValue();
                            Modifier modifier422222 = modifier2;
                            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableIntState mutableIntState222222 = (MutableIntState) rememberedValue11;
                            startRestartGroup.endReplaceGroup();
                            Integer gameModesColumnIndex22222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                            startRestartGroup.startReplaceGroup(-1746271574);
                            int i5022222 = 3670016 & i9;
                            if (i5022222 == 1048576) {
                            }
                            rememberedValue12 = startRestartGroup.rememberedValue();
                            if (i45 == 0) {
                            }
                            rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState422222, null);
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                            Boolean valueOf42222 = Boolean.valueOf(z8);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            if ((234881024 & i9) == 67108864) {
                            }
                            if (i42 > 131072) {
                            }
                            mutableState2 = mutableState;
                            if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                            }
                            z11 = true;
                            changed2 = z11 | z22 | (i5022222 != 1048576) | startRestartGroup.changed(homeTourScrollController22222);
                            rememberedValue13 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController22222, mutableState622222, mutableState522222, null);
                            startRestartGroup.updateRememberedValue(rememberedValue13);
                            startRestartGroup.endReplaceGroup();
                            int i51222222 = (i9 >> 15) & 112;
                            EffectsKt.LaunchedEffect(valueOf42222, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i51222222);
                            Boolean valueOf2222222 = Boolean.valueOf(z7);
                            Boolean valueOf3222222 = Boolean.valueOf(z9);
                            startRestartGroup.startReplaceGroup(-1224400529);
                            changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i5022222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController22222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                            rememberedValue14 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController22222, uiState, lazyListState3, function013, mutableState322222, mutableState2, mutableState422222, mutableState522222, mutableIntState32222, mutableIntState222222, null);
                            startRestartGroup.updateRememberedValue(rememberedValue14);
                            startRestartGroup.endReplaceGroup();
                            int i52222222 = i9 >> 21;
                            EffectsKt.LaunchedEffect(valueOf2222222, tourStep2, valueOf3222222, (Function2) rememberedValue14, startRestartGroup, (i52222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i52222222 & 14) | i51222222);
                            TourStep tourStep5222222 = tourStep2;
                            LazyListState lazyListState5222222 = lazyListState3;
                            startRestartGroup = startRestartGroup;
                            SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier422222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function02522222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep5222222, function123, function124, function127, gameModesColumnIndex22222, mutableState322222, mutableIntState222222, function02322222, function02422222, mutableIntState32222), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function017 = function014;
                            function018 = function015;
                            function019 = function016;
                            z12 = z7;
                            z13 = z8;
                            z14 = z9;
                            function020 = function012;
                            function021 = function013;
                            function134 = function118;
                            z15 = z6;
                            function135 = function123;
                            function136 = function124;
                            function137 = function125;
                            function138 = function126;
                            function139 = function127;
                            function140 = function128;
                            function141 = function129;
                            function142 = function130;
                            function143 = function120;
                            function144 = function121;
                            function145 = function131;
                            function146 = function132;
                            function147 = function133;
                            function148 = function122;
                            function149 = function119;
                            dailyBonusData3 = dailyBonusData2;
                            modifier3 = modifier422222;
                            tourStep3 = tourStep5222222;
                            lazyListState4 = lazyListState5222222;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i21 = i6 & 8388608;
                        if (i21 == 0) {
                        }
                        i22 = i6 & 16777216;
                        if (i22 != 0) {
                        }
                        i23 = i6 & 33554432;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 67108864;
                        if (i24 == 0) {
                        }
                        i25 = i6 & 268435456;
                        if (i25 == 0) {
                        }
                        i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                        if (i26 == 0) {
                        }
                        i27 = i6 & 1073741824;
                        if (i27 == 0) {
                        }
                        i30 = i7 & 1;
                        if (i30 == 0) {
                        }
                        int i49222 = i29;
                        i31 = i7 & 2;
                        if (i31 == 0) {
                        }
                        i32 = i7 & 4;
                        if (i32 != 0) {
                        }
                        i33 = i7 & 8;
                        if (i33 == 0) {
                        }
                        i34 = i7 & 16;
                        if (i34 != 0) {
                        }
                        i35 = i7 & 32;
                        if (i35 != 0) {
                        }
                        i36 = i7 & 64;
                        if (i36 != 0) {
                        }
                        i37 = i7 & 128;
                        if (i37 != 0) {
                        }
                        i38 = i7 & 256;
                        if (i38 != 0) {
                        }
                        i39 = i7 & 512;
                        if (i39 != 0) {
                        }
                        if ((i47 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i46 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((32768 & i6) != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                        }
                        if (i25 != 0) {
                        }
                        if (i26 != 0) {
                        }
                        if (i27 != 0) {
                        }
                        if (i30 != 0) {
                        }
                        if (i31 != 0) {
                        }
                        if (i32 != 0) {
                        }
                        if (i33 != 0) {
                        }
                        if (i34 != 0) {
                        }
                        if (i35 != 0) {
                        }
                        if (i36 != 0) {
                        }
                        if (i37 != 0) {
                        }
                        if (i38 != 0) {
                        }
                        if (i39 != 0) {
                        }
                        function014 = function022;
                        function015 = function06;
                        function016 = function07;
                        lazyListState3 = lazyListState2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Context> localContext222222 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume222222 = startRestartGroup.consume(localContext222222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Context context222222 = (Context) consume222222;
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        Function0 function023222222 = (Function0) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        Function0 function024222222 = (Function0) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        changed = startRestartGroup.changed(context222222);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit HomeScreen$lambda$15$lambda$14;
                                HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context222222);
                                return HomeScreen$lambda$15$lambda$14;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        Function0 function025222222 = (Function0) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                        }
                        if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                        }
                        startRestartGroup.startReplaceGroup(5004770);
                        i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        if (i42 <= 131072) {
                        }
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z10) {
                        }
                        rememberedValue4 = new HomeTourScrollController(lazyListState3);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        HomeTourScrollController homeTourScrollController222222 = (HomeTourScrollController) rememberedValue4;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState3222222 = (MutableState) rememberedValue5;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue6;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState4222222 = (MutableState) rememberedValue7;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState5222222 = (MutableState) rememberedValue8;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState6222222 = (MutableState) rememberedValue9;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue10 = startRestartGroup.rememberedValue();
                        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableIntState mutableIntState322222 = (MutableIntState) rememberedValue10;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue11 = startRestartGroup.rememberedValue();
                        Modifier modifier4222222 = modifier2;
                        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableIntState mutableIntState2222222 = (MutableIntState) rememberedValue11;
                        startRestartGroup.endReplaceGroup();
                        Integer gameModesColumnIndex222222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                        startRestartGroup.startReplaceGroup(-1746271574);
                        int i50222222 = 3670016 & i9;
                        if (i50222222 == 1048576) {
                        }
                        rememberedValue12 = startRestartGroup.rememberedValue();
                        if (i45 == 0) {
                        }
                        rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState4222222, null);
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                        Boolean valueOf422222 = Boolean.valueOf(z8);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        if ((234881024 & i9) == 67108864) {
                        }
                        if (i42 > 131072) {
                        }
                        mutableState2 = mutableState;
                        if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                        }
                        z11 = true;
                        changed2 = z11 | z22 | (i50222222 != 1048576) | startRestartGroup.changed(homeTourScrollController222222);
                        rememberedValue13 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController222222, mutableState6222222, mutableState5222222, null);
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                        startRestartGroup.endReplaceGroup();
                        int i512222222 = (i9 >> 15) & 112;
                        EffectsKt.LaunchedEffect(valueOf422222, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i512222222);
                        Boolean valueOf22222222 = Boolean.valueOf(z7);
                        Boolean valueOf32222222 = Boolean.valueOf(z9);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i50222222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48 & 14) != 4) | ((i48 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController222222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48 & 112) != 32);
                        rememberedValue14 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController222222, uiState, lazyListState3, function013, mutableState3222222, mutableState2, mutableState4222222, mutableState5222222, mutableIntState322222, mutableIntState2222222, null);
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                        startRestartGroup.endReplaceGroup();
                        int i522222222 = i9 >> 21;
                        EffectsKt.LaunchedEffect(valueOf22222222, tourStep2, valueOf32222222, (Function2) rememberedValue14, startRestartGroup, (i522222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i522222222 & 14) | i512222222);
                        TourStep tourStep52222222 = tourStep2;
                        LazyListState lazyListState52222222 = lazyListState3;
                        startRestartGroup = startRestartGroup;
                        SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier4222222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function025222222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep52222222, function123, function124, function127, gameModesColumnIndex222222, mutableState3222222, mutableIntState2222222, function023222222, function024222222, mutableIntState322222), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function017 = function014;
                        function018 = function015;
                        function019 = function016;
                        z12 = z7;
                        z13 = z8;
                        z14 = z9;
                        function020 = function012;
                        function021 = function013;
                        function134 = function118;
                        z15 = z6;
                        function135 = function123;
                        function136 = function124;
                        function137 = function125;
                        function138 = function126;
                        function139 = function127;
                        function140 = function128;
                        function141 = function129;
                        function142 = function130;
                        function143 = function120;
                        function144 = function121;
                        function145 = function131;
                        function146 = function132;
                        function147 = function133;
                        function148 = function122;
                        function149 = function119;
                        dailyBonusData3 = dailyBonusData2;
                        modifier3 = modifier4222222;
                        tourStep3 = tourStep52222222;
                        lazyListState4 = lazyListState52222222;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i6 & 262144;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 524288;
                    if (i15 != 0) {
                    }
                    i16 = i6 & 1048576;
                    if (i16 != 0) {
                    }
                    i19 = i6 & 2097152;
                    if (i19 != 0) {
                    }
                    int i482 = i18;
                    i20 = i6 & 4194304;
                    if (i20 != 0) {
                    }
                    i21 = i6 & 8388608;
                    if (i21 == 0) {
                    }
                    i22 = i6 & 16777216;
                    if (i22 != 0) {
                    }
                    i23 = i6 & 33554432;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 67108864;
                    if (i24 == 0) {
                    }
                    i25 = i6 & 268435456;
                    if (i25 == 0) {
                    }
                    i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                    if (i26 == 0) {
                    }
                    i27 = i6 & 1073741824;
                    if (i27 == 0) {
                    }
                    i30 = i7 & 1;
                    if (i30 == 0) {
                    }
                    int i492222 = i29;
                    i31 = i7 & 2;
                    if (i31 == 0) {
                    }
                    i32 = i7 & 4;
                    if (i32 != 0) {
                    }
                    i33 = i7 & 8;
                    if (i33 == 0) {
                    }
                    i34 = i7 & 16;
                    if (i34 != 0) {
                    }
                    i35 = i7 & 32;
                    if (i35 != 0) {
                    }
                    i36 = i7 & 64;
                    if (i36 != 0) {
                    }
                    i37 = i7 & 128;
                    if (i37 != 0) {
                    }
                    i38 = i7 & 256;
                    if (i38 != 0) {
                    }
                    i39 = i7 & 512;
                    if (i39 != 0) {
                    }
                    if ((i47 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i46 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((32768 & i6) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                    }
                    if (i25 != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i30 != 0) {
                    }
                    if (i31 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    if (i33 != 0) {
                    }
                    if (i34 != 0) {
                    }
                    if (i35 != 0) {
                    }
                    if (i36 != 0) {
                    }
                    if (i37 != 0) {
                    }
                    if (i38 != 0) {
                    }
                    if (i39 != 0) {
                    }
                    function014 = function022;
                    function015 = function06;
                    function016 = function07;
                    lazyListState3 = lazyListState2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Context> localContext2222222 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2222222 = startRestartGroup.consume(localContext2222222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context2222222 = (Context) consume2222222;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    Function0 function0232222222 = (Function0) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    Function0 function0242222222 = (Function0) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changed = startRestartGroup.changed(context2222222);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit HomeScreen$lambda$15$lambda$14;
                            HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context2222222);
                            return HomeScreen$lambda$15$lambda$14;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    Function0 function0252222222 = (Function0) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                    }
                    if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    if (i42 <= 131072) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z10) {
                    }
                    rememberedValue4 = new HomeTourScrollController(lazyListState3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    HomeTourScrollController homeTourScrollController2222222 = (HomeTourScrollController) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState32222222 = (MutableState) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState42222222 = (MutableState) rememberedValue7;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState52222222 = (MutableState) rememberedValue8;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState62222222 = (MutableState) rememberedValue9;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableIntState mutableIntState3222222 = (MutableIntState) rememberedValue10;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue11 = startRestartGroup.rememberedValue();
                    Modifier modifier42222222 = modifier2;
                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableIntState mutableIntState22222222 = (MutableIntState) rememberedValue11;
                    startRestartGroup.endReplaceGroup();
                    Integer gameModesColumnIndex2222222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    int i502222222 = 3670016 & i9;
                    if (i502222222 == 1048576) {
                    }
                    rememberedValue12 = startRestartGroup.rememberedValue();
                    if (i45 == 0) {
                    }
                    rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState42222222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                    Boolean valueOf4222222 = Boolean.valueOf(z8);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    if ((234881024 & i9) == 67108864) {
                    }
                    if (i42 > 131072) {
                    }
                    mutableState2 = mutableState;
                    if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                    }
                    z11 = true;
                    changed2 = z11 | z22 | (i502222222 != 1048576) | startRestartGroup.changed(homeTourScrollController2222222);
                    rememberedValue13 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController2222222, mutableState62222222, mutableState52222222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                    startRestartGroup.endReplaceGroup();
                    int i5122222222 = (i9 >> 15) & 112;
                    EffectsKt.LaunchedEffect(valueOf4222222, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i5122222222);
                    Boolean valueOf222222222 = Boolean.valueOf(z7);
                    Boolean valueOf322222222 = Boolean.valueOf(z9);
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i502222222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i482 & 14) != 4) | ((i482 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController2222222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i482 & 112) != 32);
                    rememberedValue14 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController2222222, uiState, lazyListState3, function013, mutableState32222222, mutableState2, mutableState42222222, mutableState52222222, mutableIntState3222222, mutableIntState22222222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                    startRestartGroup.endReplaceGroup();
                    int i5222222222 = i9 >> 21;
                    EffectsKt.LaunchedEffect(valueOf222222222, tourStep2, valueOf322222222, (Function2) rememberedValue14, startRestartGroup, (i5222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i5222222222 & 14) | i5122222222);
                    TourStep tourStep522222222 = tourStep2;
                    LazyListState lazyListState522222222 = lazyListState3;
                    startRestartGroup = startRestartGroup;
                    SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier42222222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function0252222222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep522222222, function123, function124, function127, gameModesColumnIndex2222222, mutableState32222222, mutableIntState22222222, function0232222222, function0242222222, mutableIntState3222222), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i482 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function017 = function014;
                    function018 = function015;
                    function019 = function016;
                    z12 = z7;
                    z13 = z8;
                    z14 = z9;
                    function020 = function012;
                    function021 = function013;
                    function134 = function118;
                    z15 = z6;
                    function135 = function123;
                    function136 = function124;
                    function137 = function125;
                    function138 = function126;
                    function139 = function127;
                    function140 = function128;
                    function141 = function129;
                    function142 = function130;
                    function143 = function120;
                    function144 = function121;
                    function145 = function131;
                    function146 = function132;
                    function147 = function133;
                    function148 = function122;
                    function149 = function119;
                    dailyBonusData3 = dailyBonusData2;
                    modifier3 = modifier42222222;
                    tourStep3 = tourStep522222222;
                    lazyListState4 = lazyListState522222222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i12 = i6 & 65536;
                if (i12 == 0) {
                }
                i13 = i6 & 131072;
                if (i13 == 0) {
                }
                i14 = i6 & 262144;
                if (i14 != 0) {
                }
                i15 = i6 & 524288;
                if (i15 != 0) {
                }
                i16 = i6 & 1048576;
                if (i16 != 0) {
                }
                i19 = i6 & 2097152;
                if (i19 != 0) {
                }
                int i4822 = i18;
                i20 = i6 & 4194304;
                if (i20 != 0) {
                }
                i21 = i6 & 8388608;
                if (i21 == 0) {
                }
                i22 = i6 & 16777216;
                if (i22 != 0) {
                }
                i23 = i6 & 33554432;
                if (i23 == 0) {
                }
                i24 = i6 & 67108864;
                if (i24 == 0) {
                }
                i25 = i6 & 268435456;
                if (i25 == 0) {
                }
                i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
                if (i26 == 0) {
                }
                i27 = i6 & 1073741824;
                if (i27 == 0) {
                }
                i30 = i7 & 1;
                if (i30 == 0) {
                }
                int i4922222 = i29;
                i31 = i7 & 2;
                if (i31 == 0) {
                }
                i32 = i7 & 4;
                if (i32 != 0) {
                }
                i33 = i7 & 8;
                if (i33 == 0) {
                }
                i34 = i7 & 16;
                if (i34 != 0) {
                }
                i35 = i7 & 32;
                if (i35 != 0) {
                }
                i36 = i7 & 64;
                if (i36 != 0) {
                }
                i37 = i7 & 128;
                if (i37 != 0) {
                }
                i38 = i7 & 256;
                if (i38 != 0) {
                }
                i39 = i7 & 512;
                if (i39 != 0) {
                }
                if ((i47 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i46 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((32768 & i6) != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
                }
                if (i25 != 0) {
                }
                if (i26 != 0) {
                }
                if (i27 != 0) {
                }
                if (i30 != 0) {
                }
                if (i31 != 0) {
                }
                if (i32 != 0) {
                }
                if (i33 != 0) {
                }
                if (i34 != 0) {
                }
                if (i35 != 0) {
                }
                if (i36 != 0) {
                }
                if (i37 != 0) {
                }
                if (i38 != 0) {
                }
                if (i39 != 0) {
                }
                function014 = function022;
                function015 = function06;
                function016 = function07;
                lazyListState3 = lazyListState2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Context> localContext22222222 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22222222 = startRestartGroup.consume(localContext22222222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context22222222 = (Context) consume22222222;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function02322222222 = (Function0) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function02422222222 = (Function0) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                changed = startRestartGroup.changed(context22222222);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HomeScreen$lambda$15$lambda$14;
                        HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context22222222);
                        return HomeScreen$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                Function0 function02522222222 = (Function0) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
                }
                if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                if (i42 <= 131072) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z10) {
                }
                rememberedValue4 = new HomeTourScrollController(lazyListState3);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                HomeTourScrollController homeTourScrollController22222222 = (HomeTourScrollController) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState322222222 = (MutableState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState422222222 = (MutableState) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState522222222 = (MutableState) rememberedValue8;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState622222222 = (MutableState) rememberedValue9;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                }
                MutableIntState mutableIntState32222222 = (MutableIntState) rememberedValue10;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue11 = startRestartGroup.rememberedValue();
                Modifier modifier422222222 = modifier2;
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                }
                MutableIntState mutableIntState222222222 = (MutableIntState) rememberedValue11;
                startRestartGroup.endReplaceGroup();
                Integer gameModesColumnIndex22222222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
                startRestartGroup.startReplaceGroup(-1746271574);
                int i5022222222 = 3670016 & i9;
                if (i5022222222 == 1048576) {
                }
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (i45 == 0) {
                }
                rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState422222222, null);
                startRestartGroup.updateRememberedValue(rememberedValue12);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
                Boolean valueOf42222222 = Boolean.valueOf(z8);
                startRestartGroup.startReplaceGroup(-1224400529);
                if ((234881024 & i9) == 67108864) {
                }
                if (i42 > 131072) {
                }
                mutableState2 = mutableState;
                if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                }
                z11 = true;
                changed2 = z11 | z22 | (i5022222222 != 1048576) | startRestartGroup.changed(homeTourScrollController22222222);
                rememberedValue13 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController22222222, mutableState622222222, mutableState522222222, null);
                startRestartGroup.updateRememberedValue(rememberedValue13);
                startRestartGroup.endReplaceGroup();
                int i51222222222 = (i9 >> 15) & 112;
                EffectsKt.LaunchedEffect(valueOf42222222, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i51222222222);
                Boolean valueOf2222222222 = Boolean.valueOf(z7);
                Boolean valueOf3222222222 = Boolean.valueOf(z9);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i5022222222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i4822 & 14) != 4) | ((i4822 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController22222222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i4822 & 112) != 32);
                rememberedValue14 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController22222222, uiState, lazyListState3, function013, mutableState322222222, mutableState2, mutableState422222222, mutableState522222222, mutableIntState32222222, mutableIntState222222222, null);
                startRestartGroup.updateRememberedValue(rememberedValue14);
                startRestartGroup.endReplaceGroup();
                int i52222222222 = i9 >> 21;
                EffectsKt.LaunchedEffect(valueOf2222222222, tourStep2, valueOf3222222222, (Function2) rememberedValue14, startRestartGroup, (i52222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i52222222222 & 14) | i51222222222);
                TourStep tourStep5222222222 = tourStep2;
                LazyListState lazyListState5222222222 = lazyListState3;
                startRestartGroup = startRestartGroup;
                SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier422222222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function02522222222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep5222222222, function123, function124, function127, gameModesColumnIndex22222222, mutableState322222222, mutableIntState222222222, function02322222222, function02422222222, mutableIntState32222222), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i4822 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function017 = function014;
                function018 = function015;
                function019 = function016;
                z12 = z7;
                z13 = z8;
                z14 = z9;
                function020 = function012;
                function021 = function013;
                function134 = function118;
                z15 = z6;
                function135 = function123;
                function136 = function124;
                function137 = function125;
                function138 = function126;
                function139 = function127;
                function140 = function128;
                function141 = function129;
                function142 = function130;
                function143 = function120;
                function144 = function121;
                function145 = function131;
                function146 = function132;
                function147 = function133;
                function148 = function122;
                function149 = function119;
                dailyBonusData3 = dailyBonusData2;
                modifier3 = modifier422222222;
                tourStep3 = tourStep5222222222;
                lazyListState4 = lazyListState5222222222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i11 = i6 & 16384;
            if (i11 != 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i12 = i6 & 65536;
            if (i12 == 0) {
            }
            i13 = i6 & 131072;
            if (i13 == 0) {
            }
            i14 = i6 & 262144;
            if (i14 != 0) {
            }
            i15 = i6 & 524288;
            if (i15 != 0) {
            }
            i16 = i6 & 1048576;
            if (i16 != 0) {
            }
            i19 = i6 & 2097152;
            if (i19 != 0) {
            }
            int i48222 = i18;
            i20 = i6 & 4194304;
            if (i20 != 0) {
            }
            i21 = i6 & 8388608;
            if (i21 == 0) {
            }
            i22 = i6 & 16777216;
            if (i22 != 0) {
            }
            i23 = i6 & 33554432;
            if (i23 == 0) {
            }
            i24 = i6 & 67108864;
            if (i24 == 0) {
            }
            i25 = i6 & 268435456;
            if (i25 == 0) {
            }
            i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
            if (i26 == 0) {
            }
            i27 = i6 & 1073741824;
            if (i27 == 0) {
            }
            i30 = i7 & 1;
            if (i30 == 0) {
            }
            int i49222222 = i29;
            i31 = i7 & 2;
            if (i31 == 0) {
            }
            i32 = i7 & 4;
            if (i32 != 0) {
            }
            i33 = i7 & 8;
            if (i33 == 0) {
            }
            i34 = i7 & 16;
            if (i34 != 0) {
            }
            i35 = i7 & 32;
            if (i35 != 0) {
            }
            i36 = i7 & 64;
            if (i36 != 0) {
            }
            i37 = i7 & 128;
            if (i37 != 0) {
            }
            i38 = i7 & 256;
            if (i38 != 0) {
            }
            i39 = i7 & 512;
            if (i39 != 0) {
            }
            if ((i47 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i46 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((32768 & i6) != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if (i24 != 0) {
            }
            if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            }
            if (i25 != 0) {
            }
            if (i26 != 0) {
            }
            if (i27 != 0) {
            }
            if (i30 != 0) {
            }
            if (i31 != 0) {
            }
            if (i32 != 0) {
            }
            if (i33 != 0) {
            }
            if (i34 != 0) {
            }
            if (i35 != 0) {
            }
            if (i36 != 0) {
            }
            if (i37 != 0) {
            }
            if (i38 != 0) {
            }
            if (i39 != 0) {
            }
            function014 = function022;
            function015 = function06;
            function016 = function07;
            lazyListState3 = lazyListState2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext222222222 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222222222 = startRestartGroup.consume(localContext222222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context222222222 = (Context) consume222222222;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            Function0 function023222222222 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            Function0 function024222222222 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changed = startRestartGroup.changed(context222222222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit HomeScreen$lambda$15$lambda$14;
                    HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context222222222);
                    return HomeScreen$lambda$15$lambda$14;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            Function0 function025222222222 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
            }
            if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if (i42 <= 131072) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z10) {
            }
            rememberedValue4 = new HomeTourScrollController(lazyListState3);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            HomeTourScrollController homeTourScrollController222222222 = (HomeTourScrollController) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState3222222222 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState4222222222 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState5222222222 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState6222222222 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            }
            MutableIntState mutableIntState322222222 = (MutableIntState) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue11 = startRestartGroup.rememberedValue();
            Modifier modifier4222222222 = modifier2;
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            }
            MutableIntState mutableIntState2222222222 = (MutableIntState) rememberedValue11;
            startRestartGroup.endReplaceGroup();
            Integer gameModesColumnIndex222222222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
            startRestartGroup.startReplaceGroup(-1746271574);
            int i50222222222 = 3670016 & i9;
            if (i50222222222 == 1048576) {
            }
            rememberedValue12 = startRestartGroup.rememberedValue();
            if (i45 == 0) {
            }
            rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState4222222222, null);
            startRestartGroup.updateRememberedValue(rememberedValue12);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
            Boolean valueOf422222222 = Boolean.valueOf(z8);
            startRestartGroup.startReplaceGroup(-1224400529);
            if ((234881024 & i9) == 67108864) {
            }
            if (i42 > 131072) {
            }
            mutableState2 = mutableState;
            if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            }
            z11 = true;
            changed2 = z11 | z22 | (i50222222222 != 1048576) | startRestartGroup.changed(homeTourScrollController222222222);
            rememberedValue13 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController222222222, mutableState6222222222, mutableState5222222222, null);
            startRestartGroup.updateRememberedValue(rememberedValue13);
            startRestartGroup.endReplaceGroup();
            int i512222222222 = (i9 >> 15) & 112;
            EffectsKt.LaunchedEffect(valueOf422222222, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i512222222222);
            Boolean valueOf22222222222 = Boolean.valueOf(z7);
            Boolean valueOf32222222222 = Boolean.valueOf(z9);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i50222222222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i48222 & 14) != 4) | ((i48222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController222222222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i48222 & 112) != 32);
            rememberedValue14 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController222222222, uiState, lazyListState3, function013, mutableState3222222222, mutableState2, mutableState4222222222, mutableState5222222222, mutableIntState322222222, mutableIntState2222222222, null);
            startRestartGroup.updateRememberedValue(rememberedValue14);
            startRestartGroup.endReplaceGroup();
            int i522222222222 = i9 >> 21;
            EffectsKt.LaunchedEffect(valueOf22222222222, tourStep2, valueOf32222222222, (Function2) rememberedValue14, startRestartGroup, (i522222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i522222222222 & 14) | i512222222222);
            TourStep tourStep52222222222 = tourStep2;
            LazyListState lazyListState52222222222 = lazyListState3;
            startRestartGroup = startRestartGroup;
            SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier4222222222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function025222222222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep52222222222, function123, function124, function127, gameModesColumnIndex222222222, mutableState3222222222, mutableIntState2222222222, function023222222222, function024222222222, mutableIntState322222222), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i48222 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function017 = function014;
            function018 = function015;
            function019 = function016;
            z12 = z7;
            z13 = z8;
            z14 = z9;
            function020 = function012;
            function021 = function013;
            function134 = function118;
            z15 = z6;
            function135 = function123;
            function136 = function124;
            function137 = function125;
            function138 = function126;
            function139 = function127;
            function140 = function128;
            function141 = function129;
            function142 = function130;
            function143 = function120;
            function144 = function121;
            function145 = function131;
            function146 = function132;
            function147 = function133;
            function148 = function122;
            function149 = function119;
            dailyBonusData3 = dailyBonusData2;
            modifier3 = modifier4222222222;
            tourStep3 = tourStep52222222222;
            lazyListState4 = lazyListState52222222222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i10 = i6 & 8192;
        if (i10 == 0) {
        }
        i11 = i6 & 16384;
        if (i11 != 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i12 = i6 & 65536;
        if (i12 == 0) {
        }
        i13 = i6 & 131072;
        if (i13 == 0) {
        }
        i14 = i6 & 262144;
        if (i14 != 0) {
        }
        i15 = i6 & 524288;
        if (i15 != 0) {
        }
        i16 = i6 & 1048576;
        if (i16 != 0) {
        }
        i19 = i6 & 2097152;
        if (i19 != 0) {
        }
        int i482222 = i18;
        i20 = i6 & 4194304;
        if (i20 != 0) {
        }
        i21 = i6 & 8388608;
        if (i21 == 0) {
        }
        i22 = i6 & 16777216;
        if (i22 != 0) {
        }
        i23 = i6 & 33554432;
        if (i23 == 0) {
        }
        i24 = i6 & 67108864;
        if (i24 == 0) {
        }
        i25 = i6 & 268435456;
        if (i25 == 0) {
        }
        i26 = i6 & C.BUFFER_FLAG_LAST_SAMPLE;
        if (i26 == 0) {
        }
        i27 = i6 & 1073741824;
        if (i27 == 0) {
        }
        i30 = i7 & 1;
        if (i30 == 0) {
        }
        int i492222222 = i29;
        i31 = i7 & 2;
        if (i31 == 0) {
        }
        i32 = i7 & 4;
        if (i32 != 0) {
        }
        i33 = i7 & 8;
        if (i33 == 0) {
        }
        i34 = i7 & 16;
        if (i34 != 0) {
        }
        i35 = i7 & 32;
        if (i35 != 0) {
        }
        i36 = i7 & 64;
        if (i36 != 0) {
        }
        i37 = i7 & 128;
        if (i37 != 0) {
        }
        i38 = i7 & 256;
        if (i38 != 0) {
        }
        i39 = i7 & 512;
        if (i39 != 0) {
        }
        if ((i47 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i46 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((32768 & i6) != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if ((i6 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
        }
        if (i25 != 0) {
        }
        if (i26 != 0) {
        }
        if (i27 != 0) {
        }
        if (i30 != 0) {
        }
        if (i31 != 0) {
        }
        if (i32 != 0) {
        }
        if (i33 != 0) {
        }
        if (i34 != 0) {
        }
        if (i35 != 0) {
        }
        if (i36 != 0) {
        }
        if (i37 != 0) {
        }
        if (i38 != 0) {
        }
        if (i39 != 0) {
        }
        function014 = function022;
        function015 = function06;
        function016 = function07;
        lazyListState3 = lazyListState2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2222222222 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222222222 = startRestartGroup.consume(localContext2222222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context2222222222 = (Context) consume2222222222;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        Function0 function0232222222222 = (Function0) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        Function0 function0242222222222 = (Function0) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changed = startRestartGroup.changed(context2222222222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit HomeScreen$lambda$15$lambda$14;
                HomeScreen$lambda$15$lambda$14 = HomeScreenKt.HomeScreen$lambda$15$lambda$14(context2222222222);
                return HomeScreen$lambda$15$lambda$14;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        Function0 function0252222222222 = (Function0) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        if (uiState.getLiveMatches() instanceof HomeLiveMatchesUiState.Loading) {
        }
        if (uiState.getMoreMatches() instanceof HomeMoreMatchesUiState.Loading) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        i42 = (458752 & i9) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if (i42 <= 131072) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z10) {
        }
        rememberedValue4 = new HomeTourScrollController(lazyListState3);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        HomeTourScrollController homeTourScrollController2222222222 = (HomeTourScrollController) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState32222222222 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState42222222222 = (MutableState) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState52222222222 = (MutableState) rememberedValue8;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState62222222222 = (MutableState) rememberedValue9;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
        }
        MutableIntState mutableIntState3222222222 = (MutableIntState) rememberedValue10;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue11 = startRestartGroup.rememberedValue();
        Modifier modifier42222222222 = modifier2;
        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
        }
        MutableIntState mutableIntState22222222222 = (MutableIntState) rememberedValue11;
        startRestartGroup.endReplaceGroup();
        Integer gameModesColumnIndex2222222222 = HomeTourHighlight.INSTANCE.gameModesColumnIndex(tourStep2);
        startRestartGroup.startReplaceGroup(-1746271574);
        int i502222222222 = 3670016 & i9;
        if (i502222222222 == 1048576) {
        }
        rememberedValue12 = startRestartGroup.rememberedValue();
        if (i45 == 0) {
        }
        rememberedValue12 = new HomeScreenKt$HomeScreen$6$1(tourStep2, mutableState, mutableState42222222222, null);
        startRestartGroup.updateRememberedValue(rememberedValue12);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(tourStep2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, (i9 >> 18) & 14);
        Boolean valueOf4222222222 = Boolean.valueOf(z8);
        startRestartGroup.startReplaceGroup(-1224400529);
        if ((234881024 & i9) == 67108864) {
        }
        if (i42 > 131072) {
        }
        mutableState2 = mutableState;
        if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
        }
        z11 = true;
        changed2 = z11 | z22 | (i502222222222 != 1048576) | startRestartGroup.changed(homeTourScrollController2222222222);
        rememberedValue13 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue13 = new HomeScreenKt$HomeScreen$7$1(z8, lazyListState3, tourStep2, homeTourScrollController2222222222, mutableState62222222222, mutableState52222222222, null);
        startRestartGroup.updateRememberedValue(rememberedValue13);
        startRestartGroup.endReplaceGroup();
        int i5122222222222 = (i9 >> 15) & 112;
        EffectsKt.LaunchedEffect(valueOf4222222222, tourStep2, (Function2) rememberedValue13, startRestartGroup, ((i9 >> 24) & 14) | i5122222222222);
        Boolean valueOf222222222222 = Boolean.valueOf(z7);
        Boolean valueOf322222222222 = Boolean.valueOf(z9);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed3 = ((i42 <= 131072 && startRestartGroup.changed(lazyListState3)) || (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | (i502222222222 != 1048576) | ((29360128 & i9) != 8388608) | ((1879048192 & i9) != 536870912) | ((i482222 & 14) != 4) | ((i482222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(homeTourScrollController2222222222) | ((i47 & 14) != 4 || ((i47 & 8) != 0 && startRestartGroup.changedInstance(uiState))) | ((i482222 & 112) != 32);
        rememberedValue14 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue14 = (Function2) new HomeScreenKt$HomeScreen$8$1(tourStep2, z7, z9, function012, function118, homeTourScrollController2222222222, uiState, lazyListState3, function013, mutableState32222222222, mutableState2, mutableState42222222222, mutableState52222222222, mutableIntState3222222222, mutableIntState22222222222, null);
        startRestartGroup.updateRememberedValue(rememberedValue14);
        startRestartGroup.endReplaceGroup();
        int i5222222222222 = i9 >> 21;
        EffectsKt.LaunchedEffect(valueOf222222222222, tourStep2, valueOf322222222222, (Function2) rememberedValue14, startRestartGroup, (i5222222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i5222222222222 & 14) | i5122222222222);
        TourStep tourStep522222222222 = tourStep2;
        LazyListState lazyListState522222222222 = lazyListState3;
        startRestartGroup = startRestartGroup;
        SwipeRefreshContainerKt.SwipeRefreshContainer(SizeKt.fillMaxSize$default(modifier42222222222, 0.0f, 1, null), z, onRefresh, z6, ComposableLambdaKt.rememberComposableLambda(1051473286, true, new HomeScreenKt$HomeScreen$9(lazyListState3, uiState, function0252222222222, function121, function131, function132, onSpecialOfferClick, onVideoRewardClick, function014, function133, function122, onClaimDailyQuest, onDailyQuestTaskClick, dailyBonusData2, function119, function129, function125, function128, z20, function130, function015, oddType, isBetSelected, isBetValidating, isBetLocked, onBetClick, z21, function120, function016, tourStep522222222222, function123, function124, function127, gameModesColumnIndex2222222222, mutableState32222222222, mutableIntState22222222222, function0232222222222, function0242222222222, mutableIntState3222222222), startRestartGroup, 54), startRestartGroup, (i47 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i47 & 112) | 24576 | (i482222 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function017 = function014;
        function018 = function015;
        function019 = function016;
        z12 = z7;
        z13 = z8;
        z14 = z9;
        function020 = function012;
        function021 = function013;
        function134 = function118;
        z15 = z6;
        function135 = function123;
        function136 = function124;
        function137 = function125;
        function138 = function126;
        function139 = function127;
        function140 = function128;
        function141 = function129;
        function142 = function130;
        function143 = function120;
        function144 = function121;
        function145 = function131;
        function146 = function132;
        function147 = function133;
        function148 = function122;
        function149 = function119;
        dailyBonusData3 = dailyBonusData2;
        modifier3 = modifier42222222222;
        tourStep3 = tourStep522222222222;
        lazyListState4 = lazyListState522222222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$11$lambda$10() {
        HomeStatsNavigation.INSTANCE.navigateToOwnProfile(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$13$lambda$12() {
        HomeStatsNavigation.INSTANCE.navigateToOwnProfile(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$15$lambda$14(Context context) {
        SnackbarHelper.showShort(context, R.string.home_snackbar_all_time_best_winning_streak);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HomeScreen$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeScreen$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TourStep HomeScreen$lambda$21(MutableState<TourStep> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> HomeScreen$lambda$24(MutableState<Pair<Integer, Integer>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> HomeScreen$lambda$27(MutableState<Pair<Integer, Integer>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HomeScreen$lambda$30(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeScreen$lambda$31(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HomeScreen$lambda$33(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HomeScreen$lambda$36(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HomeScreen$reportGameModeTileBottom(TourStep tourStep, MutableIntState mutableIntState, Rect rect) {
        if (tourStep == null || !HomeTourScroll.INSTANCE.isGameModeTileStep(tourStep)) {
            return;
        }
        mutableIntState.setIntValue(rect.bottom);
    }
}
