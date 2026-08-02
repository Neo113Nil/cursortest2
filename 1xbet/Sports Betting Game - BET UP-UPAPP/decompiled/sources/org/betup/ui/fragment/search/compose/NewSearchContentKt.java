package org.betup.ui.fragment.search.compose;

import android.os.Bundle;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.search.V7LeagueSearchResult;
import org.betup.model.remote.entity.search.V7MatchSearchResult;
import org.betup.model.remote.entity.search.V7SearchLeagueData;
import org.betup.model.remote.entity.search.V7TeamSearchResult;
import org.betup.model.remote.entity.search.V7UserSearchResult;
import org.betup.services.search.RecentSearchesService;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.fragment.bets.BetsTabBarComposeKt;
import org.betup.ui.fragment.matches.compose.CustomSearchBarKt;
import org.betup.ui.fragment.search.controller.SearchAllResults;
import org.betup.ui.fragment.search.controller.SearchController;
import org.betup.ui.fragment.search.controller.SearchType;
import org.betup.ui.views.ComposeUtils;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: NewSearchContent.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000b\u001aE\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0018\u001aË\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010.¨\u0006/²\u0006\n\u00100\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"NewSearchContent", "", "controller", "Lorg/betup/ui/fragment/search/controller/SearchController;", "recentSearchesService", "Lorg/betup/services/search/RecentSearchesService;", "onBackClick", "Lkotlin/Function0;", "isInBottomSheet", "", "onNavigate", "(Lorg/betup/ui/fragment/search/controller/SearchController;Lorg/betup/services/search/RecentSearchesService;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RecentAndTrendingView", "recentSearches", "", "", "trendingSearches", "isLoadingTrending", "onSearchClick", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RecentSearchItem", FirebaseAnalytics.Param.TERM, "onClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SearchResultsView", "searchType", "Lorg/betup/ui/fragment/search/controller/SearchType;", "allResults", "Lorg/betup/ui/fragment/search/controller/SearchAllResults;", "leaguesResults", "Lorg/betup/model/remote/entity/search/V7LeagueSearchResult;", "teamsResults", "Lorg/betup/model/remote/entity/search/V7TeamSearchResult;", "matchesResults", "Lorg/betup/model/remote/entity/search/V7MatchSearchResult;", "usersResults", "Lorg/betup/model/remote/entity/search/V7UserSearchResult;", "isLoading", "isLoadingMore", "hasMore", "onLoadMore", "onLeagueClick", "onTeamClick", "onMatchClick", "onUserClick", "(Lorg/betup/ui/fragment/search/controller/SearchType;Lorg/betup/ui/fragment/search/controller/SearchAllResults;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "searchQuery"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NewSearchContentKt {

    /* compiled from: NewSearchContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchType.values().length];
            try {
                iArr[SearchType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchType.LEAGUES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchType.TEAMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchType.MATCHES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchType.USERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$40(SearchController searchController, RecentSearchesService recentSearchesService, Function0 function0, boolean z, Function0 function02, int i, int i2, Composer composer, int i3) {
        NewSearchContent(searchController, recentSearchesService, function0, z, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentAndTrendingView$lambda$47(List list, List list2, boolean z, Function1 function1, int i, Composer composer, int i2) {
        RecentAndTrendingView(list, list2, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentSearchItem$lambda$50(String str, Function0 function0, int i, Composer composer, int i2) {
        RecentSearchItem(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchResultsView$lambda$70(SearchType searchType, SearchAllResults searchAllResults, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, int i2, Composer composer, int i3) {
        SearchResultsView(searchType, searchAllResults, list, list2, list3, list4, z, z2, z3, function0, function1, function12, function13, function14, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0496, code lost:
    
        if (NewSearchContent$lambda$9(r26).isEmpty() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04c7, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04a9, code lost:
    
        if (NewSearchContent$lambda$8(r25).isEmpty() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04b6, code lost:
    
        if (NewSearchContent$lambda$7(r24).isEmpty() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04c3, code lost:
    
        if (NewSearchContent$lambda$6(r23).isEmpty() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0507, code lost:
    
        if (NewSearchContent$lambda$5(r22).getUsers().isEmpty() != false) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0517 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0481  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewSearchContent(final SearchController controller, final RecentSearchesService recentSearchesService, final Function0<Unit> onBackClick, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Function0<Unit> function02;
        int i5;
        boolean z3;
        State collectAsState;
        State collectAsState2;
        State collectAsState3;
        State collectAsState4;
        State collectAsState5;
        State collectAsState6;
        State collectAsState7;
        State collectAsState8;
        State collectAsState9;
        State collectAsState10;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changedInstance;
        Object rememberedValue3;
        boolean changedInstance2;
        Object rememberedValue4;
        boolean changedInstance3;
        Object rememberedValue5;
        Function0<Unit> function03;
        int i6;
        int i7;
        boolean changedInstance4;
        Object rememberedValue6;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int i8;
        boolean z4;
        boolean changedInstance5;
        Object rememberedValue7;
        Composer composer2;
        final Function0<Unit> function04;
        final Function0<Unit> function05;
        final boolean z5;
        boolean changedInstance6;
        Object rememberedValue8;
        boolean changedInstance7;
        Object rememberedValue9;
        boolean changedInstance8;
        Object rememberedValue10;
        boolean changedInstance9;
        Object rememberedValue11;
        boolean changedInstance10;
        Object rememberedValue12;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(recentSearchesService, "recentSearchesService");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer startRestartGroup = composer.startRestartGroup(-344426676);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(recentSearchesService) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onBackClick) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                i5 = i3;
                if ((i5 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    z3 = i9 != 0 ? false : z2;
                    if (i4 != 0) {
                        function02 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-344426676, i5, -1, "org.betup.ui.fragment.search.compose.NewSearchContent (NewSearchContent.kt:52)");
                    }
                    collectAsState = SnapshotStateKt.collectAsState(controller.getSearchQuery(), null, startRestartGroup, 0, 1);
                    collectAsState2 = SnapshotStateKt.collectAsState(controller.getSearchType(), null, startRestartGroup, 0, 1);
                    collectAsState3 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                    collectAsState4 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
                    collectAsState5 = SnapshotStateKt.collectAsState(controller.getHasMoreFlow(), null, startRestartGroup, 0, 1);
                    collectAsState6 = SnapshotStateKt.collectAsState(controller.getAllResults(), null, startRestartGroup, 0, 1);
                    collectAsState7 = SnapshotStateKt.collectAsState(controller.getLeaguesResults(), null, startRestartGroup, 0, 1);
                    collectAsState8 = SnapshotStateKt.collectAsState(controller.getTeamsResults(), null, startRestartGroup, 0, 1);
                    collectAsState9 = SnapshotStateKt.collectAsState(controller.getMatchesResults(), null, startRestartGroup, 0, 1);
                    collectAsState10 = SnapshotStateKt.collectAsState(controller.getUsersResults(), null, startRestartGroup, 0, 1);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(recentSearchesService.getRecentSearches(), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    State collectAsState11 = SnapshotStateKt.collectAsState(controller.getTrendingItems(), null, startRestartGroup, 0, 1);
                    State collectAsState12 = SnapshotStateKt.collectAsState(controller.isLoadingTrending(), null, startRestartGroup, 0, 1);
                    Integer valueOf = Integer.valueOf(NewSearchContent$lambda$11(collectAsState11).size());
                    Boolean valueOf2 = Boolean.valueOf(NewSearchContent$lambda$12(collectAsState12));
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed = startRestartGroup.changed(collectAsState11) | startRestartGroup.changed(collectAsState12);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function2) new NewSearchContentKt$NewSearchContent$1$1(collectAsState11, collectAsState12, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, startRestartGroup, 0);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    if (z3) {
                        companion = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(12), 0.0f, 0.0f, 13, null);
                    } else {
                        companion = Modifier.INSTANCE;
                    }
                    Modifier then = fillMaxSize$default.then(companion);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String NewSearchContent$lambda$0 = NewSearchContent$lambda$0(collectAsState);
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(controller);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit NewSearchContent$lambda$39$lambda$15$lambda$14;
                                NewSearchContent$lambda$39$lambda$15$lambda$14 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$15$lambda$14(SearchController.this, (String) obj);
                                return NewSearchContent$lambda$39$lambda$15$lambda$14;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function1 = (Function1) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance2 = startRestartGroup.changedInstance(controller);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit NewSearchContent$lambda$39$lambda$17$lambda$16;
                                NewSearchContent$lambda$39$lambda$17$lambda$16 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$17$lambda$16(SearchController.this, (String) obj);
                                return NewSearchContent$lambda$39$lambda$17$lambda$16;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function12 = (Function1) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance3 = startRestartGroup.changedInstance(controller);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit NewSearchContent$lambda$39$lambda$19$lambda$18;
                                NewSearchContent$lambda$39$lambda$19$lambda$18 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$19$lambda$18(SearchController.this);
                                return NewSearchContent$lambda$39$lambda$19$lambda$18;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    function03 = function02;
                    CustomSearchBarKt.CustomSearchBar(NewSearchContent$lambda$0, function1, onBackClick, function12, (Function0) rememberedValue5, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), false, false, null, null, startRestartGroup, (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 960);
                    List listOf = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.all, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_leagues, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_teams, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.matches, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_users, startRestartGroup, 6)});
                    i6 = WhenMappings.$EnumSwitchMapping$0[NewSearchContent$lambda$1(collectAsState2).ordinal()];
                    if (i6 == 1) {
                        i7 = 0;
                    } else if (i6 == 2) {
                        i7 = 1;
                    } else if (i6 == 3) {
                        i7 = 2;
                    } else if (i6 == 4) {
                        i7 = 3;
                    } else {
                        if (i6 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i7 = 4;
                    }
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance4 = startRestartGroup.changedInstance(controller);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit NewSearchContent$lambda$39$lambda$21$lambda$20;
                                NewSearchContent$lambda$39$lambda$21$lambda$20 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$21$lambda$20(SearchController.this, ((Integer) obj).intValue());
                                return NewSearchContent$lambda$39$lambda$21$lambda$20;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    startRestartGroup.endReplaceGroup();
                    BetsTabBarComposeKt.BetsTabBarCompose(m1518paddingVpY3zN4$default, i7, (Function1) rememberedValue6, listOf, false, startRestartGroup, 6, 16);
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    i8 = WhenMappings.$EnumSwitchMapping$0[NewSearchContent$lambda$1(collectAsState2).ordinal()];
                    if (i8 == 1) {
                        if (NewSearchContent$lambda$5(collectAsState6).getLeagues().isEmpty()) {
                            if (NewSearchContent$lambda$5(collectAsState6).getTeams().isEmpty()) {
                                if (NewSearchContent$lambda$5(collectAsState6).getMatches().isEmpty()) {
                                }
                            }
                        }
                        z4 = true;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                    if (NewSearchContent$lambda$0(collectAsState).length() == 0 || (!z4 && !NewSearchContent$lambda$2(collectAsState3))) {
                        startRestartGroup.startReplaceGroup(1137963368);
                        Object value = mutableState.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                        List list = (List) value;
                        List<String> NewSearchContent$lambda$11 = NewSearchContent$lambda$11(collectAsState11);
                        boolean NewSearchContent$lambda$12 = NewSearchContent$lambda$12(collectAsState12);
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance5 = startRestartGroup.changedInstance(controller);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22;
                                    NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22(SearchController.this, (String) obj);
                                    return NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        startRestartGroup.endReplaceGroup();
                        RecentAndTrendingView(list, NewSearchContent$lambda$11, NewSearchContent$lambda$12, (Function1) rememberedValue7, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        function04 = function03;
                    } else {
                        startRestartGroup.startReplaceGroup(1138621653);
                        SearchType NewSearchContent$lambda$1 = NewSearchContent$lambda$1(collectAsState2);
                        SearchAllResults NewSearchContent$lambda$5 = NewSearchContent$lambda$5(collectAsState6);
                        List<V7LeagueSearchResult> NewSearchContent$lambda$6 = NewSearchContent$lambda$6(collectAsState7);
                        List<V7TeamSearchResult> NewSearchContent$lambda$7 = NewSearchContent$lambda$7(collectAsState8);
                        List<V7MatchSearchResult> NewSearchContent$lambda$8 = NewSearchContent$lambda$8(collectAsState9);
                        List<V7UserSearchResult> NewSearchContent$lambda$9 = NewSearchContent$lambda$9(collectAsState10);
                        boolean NewSearchContent$lambda$2 = NewSearchContent$lambda$2(collectAsState3);
                        boolean NewSearchContent$lambda$3 = NewSearchContent$lambda$3(collectAsState4);
                        boolean NewSearchContent$lambda$4 = NewSearchContent$lambda$4(collectAsState5);
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance6 = startRestartGroup.changedInstance(controller);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24;
                                    NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24(SearchController.this);
                                    return NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        Function0 function06 = (Function0) rememberedValue8;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        int i10 = i5 & 57344;
                        changedInstance7 = startRestartGroup.changedInstance(recentSearchesService) | (i10 != 16384);
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (!changedInstance7 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            function04 = function03;
                            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27;
                                    NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27(RecentSearchesService.this, function04, (V7LeagueSearchResult) obj);
                                    return NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        } else {
                            function04 = function03;
                        }
                        Function1 function13 = (Function1) rememberedValue9;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance8 = (i10 != 16384) | startRestartGroup.changedInstance(recentSearchesService);
                        rememberedValue10 = startRestartGroup.rememberedValue();
                        if (!changedInstance8 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30;
                                    NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30(RecentSearchesService.this, function04, (V7TeamSearchResult) obj);
                                    return NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        Function1 function14 = (Function1) rememberedValue10;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance9 = (i10 != 16384) | startRestartGroup.changedInstance(recentSearchesService);
                        rememberedValue11 = startRestartGroup.rememberedValue();
                        if (!changedInstance9 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33;
                                    NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33(RecentSearchesService.this, function04, (V7MatchSearchResult) obj);
                                    return NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        Function1 function15 = (Function1) rememberedValue11;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changedInstance10 = startRestartGroup.changedInstance(recentSearchesService) | (i10 != 16384);
                        rememberedValue12 = startRestartGroup.rememberedValue();
                        if (!changedInstance10 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36;
                                    NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36(RecentSearchesService.this, function04, (V7UserSearchResult) obj);
                                    return NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                        }
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        SearchResultsView(NewSearchContent$lambda$1, NewSearchContent$lambda$5, NewSearchContent$lambda$6, NewSearchContent$lambda$7, NewSearchContent$lambda$8, NewSearchContent$lambda$9, NewSearchContent$lambda$2, NewSearchContent$lambda$3, NewSearchContent$lambda$4, function06, function13, function14, function15, (Function1) rememberedValue12, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
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
                    function05 = function04;
                    z5 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z5 = z2;
                    function05 = function02;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit NewSearchContent$lambda$40;
                            NewSearchContent$lambda$40 = NewSearchContentKt.NewSearchContent$lambda$40(SearchController.this, recentSearchesService, onBackClick, z5, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return NewSearchContent$lambda$40;
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            collectAsState = SnapshotStateKt.collectAsState(controller.getSearchQuery(), null, startRestartGroup, 0, 1);
            collectAsState2 = SnapshotStateKt.collectAsState(controller.getSearchType(), null, startRestartGroup, 0, 1);
            collectAsState3 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
            collectAsState4 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
            collectAsState5 = SnapshotStateKt.collectAsState(controller.getHasMoreFlow(), null, startRestartGroup, 0, 1);
            collectAsState6 = SnapshotStateKt.collectAsState(controller.getAllResults(), null, startRestartGroup, 0, 1);
            collectAsState7 = SnapshotStateKt.collectAsState(controller.getLeaguesResults(), null, startRestartGroup, 0, 1);
            collectAsState8 = SnapshotStateKt.collectAsState(controller.getTeamsResults(), null, startRestartGroup, 0, 1);
            collectAsState9 = SnapshotStateKt.collectAsState(controller.getMatchesResults(), null, startRestartGroup, 0, 1);
            collectAsState10 = SnapshotStateKt.collectAsState(controller.getUsersResults(), null, startRestartGroup, 0, 1);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State collectAsState112 = SnapshotStateKt.collectAsState(controller.getTrendingItems(), null, startRestartGroup, 0, 1);
            State collectAsState122 = SnapshotStateKt.collectAsState(controller.isLoadingTrending(), null, startRestartGroup, 0, 1);
            Integer valueOf3 = Integer.valueOf(NewSearchContent$lambda$11(collectAsState112).size());
            Boolean valueOf22 = Boolean.valueOf(NewSearchContent$lambda$12(collectAsState122));
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(collectAsState112) | startRestartGroup.changed(collectAsState122);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function2) new NewSearchContentKt$NewSearchContent$1$1(collectAsState112, collectAsState122, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf3, valueOf22, (Function2) rememberedValue2, startRestartGroup, 0);
            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            if (z3) {
            }
            Modifier then2 = fillMaxSize$default3.then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            String NewSearchContent$lambda$02 = NewSearchContent$lambda$0(collectAsState);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(controller);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit NewSearchContent$lambda$39$lambda$15$lambda$14;
                    NewSearchContent$lambda$39$lambda$15$lambda$14 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$15$lambda$14(SearchController.this, (String) obj);
                    return NewSearchContent$lambda$39$lambda$15$lambda$14;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            Function1 function16 = (Function1) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance2 = startRestartGroup.changedInstance(controller);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit NewSearchContent$lambda$39$lambda$17$lambda$16;
                    NewSearchContent$lambda$39$lambda$17$lambda$16 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$17$lambda$16(SearchController.this, (String) obj);
                    return NewSearchContent$lambda$39$lambda$17$lambda$16;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            Function1 function122 = (Function1) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance3 = startRestartGroup.changedInstance(controller);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit NewSearchContent$lambda$39$lambda$19$lambda$18;
                    NewSearchContent$lambda$39$lambda$19$lambda$18 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$19$lambda$18(SearchController.this);
                    return NewSearchContent$lambda$39$lambda$19$lambda$18;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            function03 = function02;
            CustomSearchBarKt.CustomSearchBar(NewSearchContent$lambda$02, function16, onBackClick, function122, (Function0) rememberedValue5, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), false, false, null, null, startRestartGroup, (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 960);
            List listOf2 = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.all, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_leagues, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_teams, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.matches, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_users, startRestartGroup, 6)});
            i6 = WhenMappings.$EnumSwitchMapping$0[NewSearchContent$lambda$1(collectAsState2).ordinal()];
            if (i6 == 1) {
            }
            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance4 = startRestartGroup.changedInstance(controller);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit NewSearchContent$lambda$39$lambda$21$lambda$20;
                    NewSearchContent$lambda$39$lambda$21$lambda$20 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$21$lambda$20(SearchController.this, ((Integer) obj).intValue());
                    return NewSearchContent$lambda$39$lambda$21$lambda$20;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceGroup();
            BetsTabBarComposeKt.BetsTabBarCompose(m1518paddingVpY3zN4$default2, i7, (Function1) rememberedValue6, listOf2, false, startRestartGroup, 6, 16);
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
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
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            i8 = WhenMappings.$EnumSwitchMapping$0[NewSearchContent$lambda$1(collectAsState2).ordinal()];
            if (i8 == 1) {
            }
            if (NewSearchContent$lambda$0(collectAsState).length() == 0) {
                startRestartGroup.startReplaceGroup(1138621653);
                SearchType NewSearchContent$lambda$13 = NewSearchContent$lambda$1(collectAsState2);
                SearchAllResults NewSearchContent$lambda$52 = NewSearchContent$lambda$5(collectAsState6);
                List<V7LeagueSearchResult> NewSearchContent$lambda$62 = NewSearchContent$lambda$6(collectAsState7);
                List<V7TeamSearchResult> NewSearchContent$lambda$72 = NewSearchContent$lambda$7(collectAsState8);
                List<V7MatchSearchResult> NewSearchContent$lambda$82 = NewSearchContent$lambda$8(collectAsState9);
                List<V7UserSearchResult> NewSearchContent$lambda$92 = NewSearchContent$lambda$9(collectAsState10);
                boolean NewSearchContent$lambda$22 = NewSearchContent$lambda$2(collectAsState3);
                boolean NewSearchContent$lambda$32 = NewSearchContent$lambda$3(collectAsState4);
                boolean NewSearchContent$lambda$42 = NewSearchContent$lambda$4(collectAsState5);
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance6 = startRestartGroup.changedInstance(controller);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance6) {
                }
                rememberedValue8 = new Function0() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24;
                        NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24(SearchController.this);
                        return NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
                Function0 function062 = (Function0) rememberedValue8;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                int i102 = i5 & 57344;
                changedInstance7 = startRestartGroup.changedInstance(recentSearchesService) | (i102 != 16384);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance7) {
                }
                function04 = function03;
                rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27;
                        NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27(RecentSearchesService.this, function04, (V7LeagueSearchResult) obj);
                        return NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
                Function1 function132 = (Function1) rememberedValue9;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance8 = (i102 != 16384) | startRestartGroup.changedInstance(recentSearchesService);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changedInstance8) {
                }
                rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30;
                        NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30(RecentSearchesService.this, function04, (V7TeamSearchResult) obj);
                        return NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
                Function1 function142 = (Function1) rememberedValue10;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance9 = (i102 != 16384) | startRestartGroup.changedInstance(recentSearchesService);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changedInstance9) {
                }
                rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33;
                        NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33(RecentSearchesService.this, function04, (V7MatchSearchResult) obj);
                        return NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
                Function1 function152 = (Function1) rememberedValue11;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance10 = startRestartGroup.changedInstance(recentSearchesService) | (i102 != 16384);
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (!changedInstance10) {
                }
                rememberedValue12 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36;
                        NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36(RecentSearchesService.this, function04, (V7UserSearchResult) obj);
                        return NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                SearchResultsView(NewSearchContent$lambda$13, NewSearchContent$lambda$52, NewSearchContent$lambda$62, NewSearchContent$lambda$72, NewSearchContent$lambda$82, NewSearchContent$lambda$92, NewSearchContent$lambda$22, NewSearchContent$lambda$32, NewSearchContent$lambda$42, function062, function132, function142, function152, (Function1) rememberedValue12, composer2, 0, 0);
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
                function05 = function04;
                z5 = z3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            startRestartGroup.startReplaceGroup(1137963368);
            Object value2 = mutableState2.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
            List list2 = (List) value2;
            List<String> NewSearchContent$lambda$112 = NewSearchContent$lambda$11(collectAsState112);
            boolean NewSearchContent$lambda$122 = NewSearchContent$lambda$12(collectAsState122);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance5 = startRestartGroup.changedInstance(controller);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22;
                    NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22(SearchController.this, (String) obj);
                    return NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceGroup();
            RecentAndTrendingView(list2, NewSearchContent$lambda$112, NewSearchContent$lambda$122, (Function1) rememberedValue7, startRestartGroup, 0);
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            function04 = function03;
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
            function05 = function04;
            z5 = z3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        collectAsState = SnapshotStateKt.collectAsState(controller.getSearchQuery(), null, startRestartGroup, 0, 1);
        collectAsState2 = SnapshotStateKt.collectAsState(controller.getSearchType(), null, startRestartGroup, 0, 1);
        collectAsState3 = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
        collectAsState4 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), null, startRestartGroup, 0, 1);
        collectAsState5 = SnapshotStateKt.collectAsState(controller.getHasMoreFlow(), null, startRestartGroup, 0, 1);
        collectAsState6 = SnapshotStateKt.collectAsState(controller.getAllResults(), null, startRestartGroup, 0, 1);
        collectAsState7 = SnapshotStateKt.collectAsState(controller.getLeaguesResults(), null, startRestartGroup, 0, 1);
        collectAsState8 = SnapshotStateKt.collectAsState(controller.getTeamsResults(), null, startRestartGroup, 0, 1);
        collectAsState9 = SnapshotStateKt.collectAsState(controller.getMatchesResults(), null, startRestartGroup, 0, 1);
        collectAsState10 = SnapshotStateKt.collectAsState(controller.getUsersResults(), null, startRestartGroup, 0, 1);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState22 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        State collectAsState1122 = SnapshotStateKt.collectAsState(controller.getTrendingItems(), null, startRestartGroup, 0, 1);
        State collectAsState1222 = SnapshotStateKt.collectAsState(controller.isLoadingTrending(), null, startRestartGroup, 0, 1);
        Integer valueOf32 = Integer.valueOf(NewSearchContent$lambda$11(collectAsState1122).size());
        Boolean valueOf222 = Boolean.valueOf(NewSearchContent$lambda$12(collectAsState1222));
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(collectAsState1122) | startRestartGroup.changed(collectAsState1222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function2) new NewSearchContentKt$NewSearchContent$1$1(collectAsState1122, collectAsState1222, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32, valueOf222, (Function2) rememberedValue2, startRestartGroup, 0);
        Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        if (z3) {
        }
        Modifier then22 = fillMaxSize$default32.then(companion);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
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
        String NewSearchContent$lambda$022 = NewSearchContent$lambda$0(collectAsState);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(controller);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit NewSearchContent$lambda$39$lambda$15$lambda$14;
                NewSearchContent$lambda$39$lambda$15$lambda$14 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$15$lambda$14(SearchController.this, (String) obj);
                return NewSearchContent$lambda$39$lambda$15$lambda$14;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        Function1 function162 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(controller);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit NewSearchContent$lambda$39$lambda$17$lambda$16;
                NewSearchContent$lambda$39$lambda$17$lambda$16 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$17$lambda$16(SearchController.this, (String) obj);
                return NewSearchContent$lambda$39$lambda$17$lambda$16;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        Function1 function1222 = (Function1) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance3 = startRestartGroup.changedInstance(controller);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit NewSearchContent$lambda$39$lambda$19$lambda$18;
                NewSearchContent$lambda$39$lambda$19$lambda$18 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$19$lambda$18(SearchController.this);
                return NewSearchContent$lambda$39$lambda$19$lambda$18;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        function03 = function02;
        CustomSearchBarKt.CustomSearchBar(NewSearchContent$lambda$022, function162, onBackClick, function1222, (Function0) rememberedValue5, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), false, false, null, null, startRestartGroup, (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 960);
        List listOf22 = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.all, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_leagues, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_teams, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.matches, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.title_users, startRestartGroup, 6)});
        i6 = WhenMappings.$EnumSwitchMapping$0[NewSearchContent$lambda$1(collectAsState2).ordinal()];
        if (i6 == 1) {
        }
        Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance4 = startRestartGroup.changedInstance(controller);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit NewSearchContent$lambda$39$lambda$21$lambda$20;
                NewSearchContent$lambda$39$lambda$21$lambda$20 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$21$lambda$20(SearchController.this, ((Integer) obj).intValue());
                return NewSearchContent$lambda$39$lambda$21$lambda$20;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        BetsTabBarComposeKt.BetsTabBarCompose(m1518paddingVpY3zN4$default22, i7, (Function1) rememberedValue6, listOf22, false, startRestartGroup, 6, 16);
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
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
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        i8 = WhenMappings.$EnumSwitchMapping$0[NewSearchContent$lambda$1(collectAsState2).ordinal()];
        if (i8 == 1) {
        }
        if (NewSearchContent$lambda$0(collectAsState).length() == 0) {
        }
        startRestartGroup.startReplaceGroup(1137963368);
        Object value22 = mutableState22.getValue();
        Intrinsics.checkNotNullExpressionValue(value22, "<get-value>(...)");
        List list22 = (List) value22;
        List<String> NewSearchContent$lambda$1122 = NewSearchContent$lambda$11(collectAsState1122);
        boolean NewSearchContent$lambda$1222 = NewSearchContent$lambda$12(collectAsState1222);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance5 = startRestartGroup.changedInstance(controller);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changedInstance5) {
        }
        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22;
                NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22 = NewSearchContentKt.NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22(SearchController.this, (String) obj);
                return NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        RecentAndTrendingView(list22, NewSearchContent$lambda$1122, NewSearchContent$lambda$1222, (Function1) rememberedValue7, startRestartGroup, 0);
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        function04 = function03;
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
        function05 = function04;
        z5 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$15$lambda$14(SearchController searchController, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        searchController.setSearchQuery(newValue);
        if (newValue.length() > 0) {
            searchController.performSearch(newValue);
        } else {
            searchController.setSearchQuery("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$17$lambda$16(SearchController searchController, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() > 0) {
            searchController.performSearch(query);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$19$lambda$18(SearchController searchController) {
        searchController.setSearchQuery("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$21$lambda$20(SearchController searchController, int i) {
        if (i == 0) {
            searchController.setSearchType(SearchType.ALL);
        } else if (i == 1) {
            searchController.setSearchType(SearchType.LEAGUES);
        } else if (i == 2) {
            searchController.setSearchType(SearchType.TEAMS);
        } else if (i == 3) {
            searchController.setSearchType(SearchType.MATCHES);
        } else if (i == 4) {
            searchController.setSearchType(SearchType.USERS);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$38$lambda$23$lambda$22(SearchController searchController, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        searchController.setSearchQuery(query);
        searchController.performSearch(query);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$38$lambda$25$lambda$24(SearchController searchController) {
        searchController.loadMore();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$38$lambda$28$lambda$27(RecentSearchesService recentSearchesService, Function0 function0, V7LeagueSearchResult league) {
        Intrinsics.checkNotNullParameter(league, "league");
        String name = league.getName();
        if (name == null) {
            name = "";
        }
        if (name.length() > 0) {
            recentSearchesService.addToRecents(name);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", (int) league.getId());
        bundle.putBoolean("isLive", false);
        bundle.putString("filter", "All");
        bundle.putBoolean("isFavorite", false);
        if (function0 != null) {
            function0.invoke();
        }
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUE_MATCHES, bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$38$lambda$31$lambda$30(RecentSearchesService recentSearchesService, Function0 function0, V7TeamSearchResult team) {
        Intrinsics.checkNotNullParameter(team, "team");
        String name = team.getName();
        if (name == null) {
            name = "";
        }
        if (name.length() > 0) {
            recentSearchesService.addToRecents(name);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("teamId", team.getId());
        if (function0 != null) {
            function0.invoke();
        }
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TEAM_DETAILS, bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$38$lambda$34$lambda$33(RecentSearchesService recentSearchesService, Function0 function0, V7MatchSearchResult match) {
        String name;
        Intrinsics.checkNotNullParameter(match, "match");
        String name2 = match.getHomeTeam().getName();
        String str = "";
        if (name2 == null) {
            name2 = "";
        }
        String name3 = match.getAwayTeam().getName();
        if (name3 == null) {
            name3 = "";
        }
        if (name2.length() > 0 && name3.length() > 0) {
            str = name2 + " - " + name3;
        } else {
            V7SearchLeagueData league = match.getLeague();
            if (league != null && (name = league.getName()) != null) {
                str = name;
            }
        }
        if (str.length() > 0) {
            recentSearchesService.addToRecents(str);
        }
        boolean z = match.getMatchState() == MatchState.LIVE.getVal();
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", match.getId());
        bundle.putBoolean("isLive", z);
        bundle.putInt("participationId", 0);
        if (function0 != null) {
            function0.invoke();
        }
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSearchContent$lambda$39$lambda$38$lambda$37$lambda$36(RecentSearchesService recentSearchesService, Function0 function0, V7UserSearchResult user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (user.getName().length() > 0) {
            recentSearchesService.addToRecents(user.getName());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", (int) user.getId());
        bundle.putBoolean("return", true);
        if (function0 != null) {
            function0.invoke();
        }
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FOREIGN_USER_DETAILS, bundle));
        return Unit.INSTANCE;
    }

    private static final void RecentAndTrendingView(final List<String> list, final List<String> list2, final boolean z, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1126099456);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1126099456, i2, -1, "org.betup.ui.fragment.search.compose.RecentAndTrendingView (NewSearchContent.kt:257)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f = 4;
            PaddingValues m1509PaddingValues0680j_4 = PaddingKt.m1509PaddingValues0680j_4(Dp.m7774constructorimpl(f));
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = startRestartGroup.changedInstance(list) | ((i2 & 7168) == 2048) | ((i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changedInstance(list2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RecentAndTrendingView$lambda$46$lambda$45;
                        RecentAndTrendingView$lambda$46$lambda$45 = NewSearchContentKt.RecentAndTrendingView$lambda$46$lambda$45(list, z, list2, function1, (LazyListScope) obj);
                        return RecentAndTrendingView$lambda$46$lambda$45;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyColumn(fillMaxSize$default, null, m1509PaddingValues0680j_4, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer2, 24966, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecentAndTrendingView$lambda$47;
                    RecentAndTrendingView$lambda$47 = NewSearchContentKt.RecentAndTrendingView$lambda$47(list, list2, z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecentAndTrendingView$lambda$47;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentAndTrendingView$lambda$46$lambda$45(final List list, boolean z, final List list2, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!list.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.m14082getLambda$547963184$app_release(), 3, null);
            final NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$1 newSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(String str) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((String) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$3
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
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$4
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
                    final String str = (String) list.get(i);
                    composer.startReplaceGroup(-1725542192);
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function1) | composer.changed(str);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(str);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    NewSearchContentKt.RecentSearchItem(str, (Function0) rememberedValue, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        if (z) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.getLambda$1703478393$app_release(), 3, null);
        } else if (!list2.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.m14086getLambda$850364075$app_release(), 3, null);
            final NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$5 newSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$5 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(String str) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((String) obj);
                }
            };
            LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list2.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$lambda$46$lambda$45$$inlined$items$default$8
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
                    final String str = (String) list2.get(i);
                    composer.startReplaceGroup(313113951);
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function1) | composer.changed(str);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$RecentAndTrendingView$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(str);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    NewSearchContentKt.RecentSearchItem(str, (Function0) rememberedValue, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecentSearchItem(final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-432784796);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432784796, i2, -1, "org.betup.ui.fragment.search.compose.RecentSearchItem (NewSearchContent.kt:314)");
            }
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(8));
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit RecentSearchItem$lambda$49$lambda$48;
                        RecentSearchItem$lambda$49$lambda$48 = NewSearchContentKt.RecentSearchItem$lambda$49$lambda$48(Function0.this);
                        return RecentSearchItem$lambda$49$lambda$48;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(str, m1517paddingVpY3zN4.then(ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, i2 & 14, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecentSearchItem$lambda$50;
                    RecentSearchItem$lambda$50 = NewSearchContentKt.RecentSearchItem$lambda$50(str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecentSearchItem$lambda$50;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentSearchItem$lambda$49$lambda$48(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void SearchResultsView(final SearchType searchType, final SearchAllResults searchAllResults, final List<V7LeagueSearchResult> list, final List<V7TeamSearchResult> list2, final List<V7MatchSearchResult> list3, final List<V7UserSearchResult> list4, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, final Function1<? super V7LeagueSearchResult, Unit> function1, final Function1<? super V7TeamSearchResult, Unit> function12, final Function1<? super V7MatchSearchResult, Unit> function13, final Function1<? super V7UserSearchResult, Unit> function14, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(105002477);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(searchAllResults) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(list3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(list4) ? 131072 : 65536;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
        }
        int i10 = i4;
        if ((i3 & 306259091) != 306259090 || (i10 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(105002477, i3, i10, "org.betup.ui.fragment.search.compose.SearchResultsView (NewSearchContent.kt:346)");
            }
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            Boolean valueOf = Boolean.valueOf(z3);
            Boolean valueOf2 = Boolean.valueOf(z2);
            startRestartGroup.startReplaceGroup(-1224400529);
            int i11 = i3 & 14;
            int i12 = 29360128 & i3;
            boolean changed = ((i3 & 1879048192) == 536870912) | startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | (i11 == 4) | startRestartGroup.changedInstance(searchAllResults) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(list2) | startRestartGroup.changedInstance(list3) | startRestartGroup.changedInstance(list4) | ((i3 & 234881024) == 67108864) | (i12 == 8388608);
            NewSearchContentKt$SearchResultsView$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i5 = i3;
                z4 = false;
                i6 = i12;
                i7 = i11;
                i8 = i10;
                i9 = -1224400529;
                rememberedValue = new NewSearchContentKt$SearchResultsView$1$1(rememberLazyListStateWithoutSavedState, searchType, searchAllResults, list, list2, list3, list4, z3, z2, function0, null);
                composer2 = startRestartGroup;
                composer2.updateRememberedValue(rememberedValue);
            } else {
                i5 = i3;
                composer2 = startRestartGroup;
                i6 = i12;
                i7 = i11;
                i8 = i10;
                i9 = -1224400529;
                z4 = false;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue, composer2, ((i5 >> 21) & 112) | ((i5 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH));
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f = 8;
            PaddingValues m1509PaddingValues0680j_4 = PaddingKt.m1509PaddingValues0680j_4(Dp.m7774constructorimpl(f));
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
            composer2.startReplaceGroup(i9);
            boolean changedInstance = composer2.changedInstance(searchAllResults) | (i7 == 4 ? true : z4) | ((i8 & 14) == 4 ? true : z4) | ((i8 & 112) == 32 ? true : z4) | ((i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256 ? true : z4) | ((i8 & 7168) == 2048 ? true : z4) | composer2.changedInstance(list) | composer2.changedInstance(list2) | composer2.changedInstance(list3) | composer2.changedInstance(list4) | (i6 == 8388608 ? true : z4);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composer3 = composer2;
                Function1 function15 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SearchResultsView$lambda$69$lambda$68;
                        SearchResultsView$lambda$69$lambda$68 = NewSearchContentKt.SearchResultsView$lambda$69$lambda$68(SearchType.this, searchAllResults, list, list2, list3, list4, z2, function1, function12, function13, function14, (LazyListScope) obj);
                        return SearchResultsView$lambda$69$lambda$68;
                    }
                };
                composer3.updateRememberedValue(function15);
                rememberedValue2 = function15;
            } else {
                composer3 = composer2;
            }
            composer3.endReplaceGroup();
            LazyDslKt.LazyColumn(fillMaxSize$default, rememberLazyListStateWithoutSavedState, m1509PaddingValues0680j_4, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue2, composer3, 24966, 488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SearchResultsView$lambda$70;
                    SearchResultsView$lambda$70 = NewSearchContentKt.SearchResultsView$lambda$70(SearchType.this, searchAllResults, list, list2, list3, list4, z, z2, z3, function0, function1, function12, function13, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SearchResultsView$lambda$70;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchResultsView$lambda$69$lambda$68(SearchType searchType, SearchAllResults searchAllResults, final List list, final List list2, final List list3, final List list4, boolean z, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, LazyListScope LazyColumn) {
        boolean z2;
        Function1<? super Integer, ? extends Object> function15;
        Function1<? super Integer, ? extends Object> function16;
        boolean z3;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        int i = WhenMappings.$EnumSwitchMapping$0[searchType.ordinal()];
        if (i == 1) {
            if (searchAllResults.getLeagues().isEmpty()) {
                z2 = true;
                function15 = null;
            } else {
                z2 = true;
                function15 = null;
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.getLambda$8464965$app_release(), 3, null);
                final List<V7LeagueSearchResult> leagues = searchAllResults.getLeagues();
                final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$1 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(V7LeagueSearchResult v7LeagueSearchResult) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((V7LeagueSearchResult) obj);
                    }
                };
                LazyColumn.items(leagues.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i2) {
                        return Function1.this.invoke(leagues.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                        int i4;
                        ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                        if ((i3 & 6) == 0) {
                            i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                            ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final V7LeagueSearchResult v7LeagueSearchResult = (V7LeagueSearchResult) leagues.get(i2);
                        composer.startReplaceGroup(739865517);
                        composer.startReplaceGroup(-1633490746);
                        boolean changed = composer.changed(function1) | composer.changed(v7LeagueSearchResult);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function17 = function1;
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function17.invoke(v7LeagueSearchResult);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        SearchItemComponentsKt.SearchLeagueItem(v7LeagueSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (!searchAllResults.getTeams().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.m14083getLambda$607182546$app_release(), 3, null);
                final List<V7TeamSearchResult> teams = searchAllResults.getTeams();
                final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$5 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$5 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(V7TeamSearchResult v7TeamSearchResult) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((V7TeamSearchResult) obj);
                    }
                };
                LazyColumn.items(teams.size(), function15, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i2) {
                        return Function1.this.invoke(teams.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, z2, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                        int i4;
                        ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                        if ((i3 & 6) == 0) {
                            i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                            ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final V7TeamSearchResult v7TeamSearchResult = (V7TeamSearchResult) teams.get(i2);
                        composer.startReplaceGroup(295787612);
                        composer.startReplaceGroup(-1633490746);
                        boolean changed = composer.changed(function12) | composer.changed(v7TeamSearchResult);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function17 = function12;
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$2$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function17.invoke(v7TeamSearchResult);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        SearchItemComponentsKt.SearchTeamItem(v7TeamSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (searchAllResults.getMatches().isEmpty()) {
                function16 = function15;
                z3 = z2;
            } else {
                function16 = function15;
                z3 = z2;
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.m14084getLambda$683021107$app_release(), 3, null);
                final List<V7MatchSearchResult> matches = searchAllResults.getMatches();
                final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$9 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$9 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$9
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(V7MatchSearchResult v7MatchSearchResult) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((V7MatchSearchResult) obj);
                    }
                };
                LazyColumn.items(matches.size(), function16, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i2) {
                        return Function1.this.invoke(matches.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, z3, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                        int i4;
                        ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                        if ((i3 & 6) == 0) {
                            i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                            ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final V7MatchSearchResult v7MatchSearchResult = (V7MatchSearchResult) matches.get(i2);
                        composer.startReplaceGroup(-144275546);
                        composer.startReplaceGroup(-1633490746);
                        boolean changed = composer.changed(function13) | composer.changed(v7MatchSearchResult);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function17 = function13;
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$3$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function17.invoke(v7MatchSearchResult);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        SearchItemComponentsKt.SearchMatchItem(v7MatchSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            if (!searchAllResults.getUsers().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.m14085getLambda$758859668$app_release(), 3, null);
                final List<V7UserSearchResult> users = searchAllResults.getUsers();
                final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$13 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$13 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$13
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(V7UserSearchResult v7UserSearchResult) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((V7UserSearchResult) obj);
                    }
                };
                LazyColumn.items(users.size(), function16, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i2) {
                        return Function1.this.invoke(users.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, z3, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                        int i4;
                        ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                        if ((i3 & 6) == 0) {
                            i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                            ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final V7UserSearchResult v7UserSearchResult = (V7UserSearchResult) users.get(i2);
                        composer.startReplaceGroup(826340684);
                        composer.startReplaceGroup(-1633490746);
                        boolean changed = composer.changed(function14) | composer.changed(v7UserSearchResult);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function17 = function14;
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$4$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function17.invoke(v7UserSearchResult);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        SearchItemComponentsKt.SearchUserItem(v7UserSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        } else if (i == 2) {
            final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$17 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$17 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$17
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(V7LeagueSearchResult v7LeagueSearchResult) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((V7LeagueSearchResult) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$19
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(list.get(i2));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$20
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final V7LeagueSearchResult v7LeagueSearchResult = (V7LeagueSearchResult) list.get(i2);
                    composer.startReplaceGroup(-1388314297);
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function1) | composer.changed(v7LeagueSearchResult);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function17 = function1;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$5$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function17.invoke(v7LeagueSearchResult);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    SearchItemComponentsKt.SearchLeagueItem(v7LeagueSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else if (i == 3) {
            final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$21 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$21 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$21
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(V7TeamSearchResult v7TeamSearchResult) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((V7TeamSearchResult) obj);
                }
            };
            LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$23
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(list2.get(i2));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$24
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final V7TeamSearchResult v7TeamSearchResult = (V7TeamSearchResult) list2.get(i2);
                    composer.startReplaceGroup(-113424418);
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function12) | composer.changed(v7TeamSearchResult);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function17 = function12;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$6$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function17.invoke(v7TeamSearchResult);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    SearchItemComponentsKt.SearchTeamItem(v7TeamSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else if (i == 4) {
            final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$25 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$25 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$25
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(V7MatchSearchResult v7MatchSearchResult) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((V7MatchSearchResult) obj);
                }
            };
            LazyColumn.items(list3.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$27
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(list3.get(i2));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$28
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final V7MatchSearchResult v7MatchSearchResult = (V7MatchSearchResult) list3.get(i2);
                    composer.startReplaceGroup(968807366);
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function13) | composer.changed(v7MatchSearchResult);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function17 = function13;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$7$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function17.invoke(v7MatchSearchResult);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    SearchItemComponentsKt.SearchMatchItem(v7MatchSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            final NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$29 newSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$29 = new Function1() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$29
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(V7UserSearchResult v7UserSearchResult) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((V7UserSearchResult) obj);
                }
            };
            LazyColumn.items(list4.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$31
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return Function1.this.invoke(list4.get(i2));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$lambda$69$lambda$68$$inlined$items$default$32
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                    if ((i3 & 6) == 0) {
                        i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
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
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final V7UserSearchResult v7UserSearchResult = (V7UserSearchResult) list4.get(i2);
                    composer.startReplaceGroup(2068463754);
                    composer.startReplaceGroup(-1633490746);
                    boolean changed = composer.changed(function14) | composer.changed(v7UserSearchResult);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function17 = function14;
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.search.compose.NewSearchContentKt$SearchResultsView$2$1$8$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function17.invoke(v7UserSearchResult);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    SearchItemComponentsKt.SearchUserItem(v7UserSearchResult, (Function0) rememberedValue, null, composer, 0, 4);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        if (z) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NewSearchContentKt.INSTANCE.getLambda$348453565$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    private static final String NewSearchContent$lambda$0(State<String> state) {
        return state.getValue();
    }

    private static final SearchType NewSearchContent$lambda$1(State<? extends SearchType> state) {
        return state.getValue();
    }

    private static final boolean NewSearchContent$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean NewSearchContent$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean NewSearchContent$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final SearchAllResults NewSearchContent$lambda$5(State<SearchAllResults> state) {
        return state.getValue();
    }

    private static final List<V7LeagueSearchResult> NewSearchContent$lambda$6(State<? extends List<V7LeagueSearchResult>> state) {
        return state.getValue();
    }

    private static final List<V7TeamSearchResult> NewSearchContent$lambda$7(State<? extends List<V7TeamSearchResult>> state) {
        return state.getValue();
    }

    private static final List<V7MatchSearchResult> NewSearchContent$lambda$8(State<? extends List<V7MatchSearchResult>> state) {
        return state.getValue();
    }

    private static final List<V7UserSearchResult> NewSearchContent$lambda$9(State<? extends List<V7UserSearchResult>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> NewSearchContent$lambda$11(State<? extends List<String>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NewSearchContent$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
