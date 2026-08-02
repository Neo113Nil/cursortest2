package org.betup.ui.dialogs.controller;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.BasePagingController;
import org.betup.ui.fragment.matches.FavoriteSaver;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CreateBattleDialogController.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010+\u001a\u00020\u0002H\u0014J*\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020106H\u0016J8\u00108\u001a\u0002012\f\u00109\u001a\b\u0012\u0004\u0012\u000204032\f\u0010:\u001a\b\u0012\u0004\u0012\u000204032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020106H\u0016J<\u0010\u0085\u0001\u001a\u0002012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u0002010\u0082\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010b¢\u0006\u0003\u0010\u008a\u0001J\u0012\u0010\u008b\u0001\u001a\u0002012\u0007\u0010\u008c\u0001\u001a\u000207H\u0014J\u0012\u0010\u008d\u0001\u001a\u0002012\u0007\u0010\u008c\u0001\u001a\u000207H\u0002J\u0010\u0010\u008e\u0001\u001a\u0002012\u0007\u0010\u008f\u0001\u001a\u00020LJ\u0012\u0010\u0090\u0001\u001a\u0002012\u0007\u0010\u008c\u0001\u001a\u000207H\u0002J\u0010\u0010\u0091\u0001\u001a\u0002012\u0007\u0010\u0092\u0001\u001a\u00020PJ\u0012\u0010\u0093\u0001\u001a\u0002012\u0007\u0010\u008c\u0001\u001a\u000207H\u0002J\u0010\u0010\u0094\u0001\u001a\u0002012\u0007\u0010\u0095\u0001\u001a\u00020TJ\u0012\u0010\u0096\u0001\u001a\u0002012\u0007\u0010\u0095\u0001\u001a\u00020TH\u0002J\u0010\u0010\u009c\u0001\u001a\u0002012\u0007\u0010\u009d\u0001\u001a\u000204J\u0019\u0010\u009e\u0001\u001a\u0002012\u0007\u0010\u009f\u0001\u001a\u00020b2\u0007\u0010 \u0001\u001a\u000204J\u0019\u0010¡\u0001\u001a\u0002012\u0007\u0010¢\u0001\u001a\u0002042\u0007\u0010\u009f\u0001\u001a\u00020bJ(\u0010£\u0001\u001a\u0002012\u0007\u0010¢\u0001\u001a\u0002042\u0007\u0010¤\u0001\u001a\u0002072\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020b03J\u0010\u0010¦\u0001\u001a\u0002012\u0007\u0010§\u0001\u001a\u00020bJ\u0007\u0010¨\u0001\u001a\u000201J\u0007\u0010©\u0001\u001a\u000207J\u0007\u0010ª\u0001\u001a\u000201J\u0007\u0010«\u0001\u001a\u000201J\u0010\u0010¬\u0001\u001a\u0002012\u0007\u0010\u00ad\u0001\u001a\u00020BJ\u0010\u0010®\u0001\u001a\u0002012\u0007\u0010\u00ad\u0001\u001a\u00020BJ\u0007\u0010¯\u0001\u001a\u000201J\t\u0010°\u0001\u001a\u000201H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020-X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u0002040<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u0002040>¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020B0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020B0>¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020B0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020B0>¢\u0006\b\n\u0000\u001a\u0004\bG\u0010@R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020B0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020B0>¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u001a\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L030<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L030>¢\u0006\b\n\u0000\u001a\u0004\bN\u0010@R\u001a\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P030<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P030>¢\u0006\b\n\u0000\u001a\u0004\bR\u0010@R\u001a\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T030<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T030>¢\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u0016\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0>¢\u0006\b\n\u0000\u001a\u0004\bY\u0010@R\u0016\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0>¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010@R\u0016\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010T0>¢\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u001a\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0a0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0a0>¢\u0006\b\n\u0000\u001a\u0004\bd\u0010@R\u001a\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f030<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f030>¢\u0006\b\n\u0000\u001a\u0004\bh\u0010@R\u0014\u0010i\u001a\b\u0012\u0004\u0012\u0002040<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u0002040>¢\u0006\b\n\u0000\u001a\u0004\bk\u0010@R\u001a\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m030<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m030>¢\u0006\b\n\u0000\u001a\u0004\bo\u0010@R,\u0010p\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u0002070q0q0<X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010r\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u0002070q0q0>¢\u0006\b\n\u0000\u001a\u0004\bs\u0010@R\u0014\u0010t\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010w\u001a\u00020x8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010{\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0015\u0010~\u001a\u00020B8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u000b\u0012\u0004\u0012\u000201\u0018\u00010\u0082\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010bX\u0082\u000e¢\u0006\u0005\n\u0003\u0010\u0084\u0001R\u001f\u0010\u0097\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0006\u0012\u0004\u0018\u0001040\u0098\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u009a\u0001\u001a\u001c\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009b\u000103\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u0098\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006±\u0001"}, d2 = {"Lorg/betup/ui/dialogs/controller/CreateBattleDialogController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "sportsInteractor", "Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;", "getSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;", "setSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;)V", "leaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;", "getLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;", "setLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;)V", "matchesInteractor", "Lorg/betup/model/remote/api/rest/matches/NewLeagueMatchesInteractor;", "getMatchesInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewLeagueMatchesInteractor;", "setMatchesInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewLeagueMatchesInteractor;)V", "matchBetGroupsInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "getMatchBetGroupsInteractor", "()Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "setMatchBetGroupsInteractor", "(Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;)V", "matchDetailsInteractor", "Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "getMatchDetailsInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "setMatchDetailsInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "saveFavorites", "", "ids", "", "", "onResult", "Lkotlin/Function1;", "", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "_currentStep", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentStep", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStep", "()Lkotlinx/coroutines/flow/StateFlow;", "_sportsQuery", "", "sportsQuery", "getSportsQuery", "_leaguesQuery", "leaguesQuery", "getLeaguesQuery", "_matchesQuery", "matchesQuery", "getMatchesQuery", "_sports", "Lorg/betup/model/remote/entity/sports/NewSport;", "sports", "getSports", "_leagues", "Lorg/betup/model/remote/entity/leagues/NewLeague;", "leagues", "getLeagues", "_matches", "Lorg/betup/model/remote/entity/matches/NewMatchItemModel;", "matches", "getMatches", "_selectedNewSport", "selectedNewSport", "getSelectedNewSport", "_selectedLeague", "selectedLeague", "getSelectedLeague", "_selectedMatch", "selectedMatch", "getSelectedMatch", "_selectedBetIds", "", "", "selectedBetIds", "getSelectedBetIds", "_betGroups", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "betGroups", "getBetGroups", "_selectedBetGroupTabIndex", "selectedBetGroupTabIndex", "getSelectedBetGroupTabIndex", "_subMatches", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "subMatches", "getSubMatches", "_expandedStatesPerTab", "", "expandedStatesPerTab", "getExpandedStatesPerTab", "currentOffset", "getCurrentOffset", "()I", "currentFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "getCurrentFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "hasMoreData", "getHasMoreData", "()Z", "currentQuery", "getCurrentQuery", "()Ljava/lang/String;", "onDismiss", "Lkotlin/Function0;", "battleId", "Ljava/lang/Long;", "bind", "activity", "Lorg/betup/ui/MainActivity;", "context", "Landroid/content/Context;", "(Lorg/betup/ui/MainActivity;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Ljava/lang/Long;)V", "loadPage", "append", "loadSportsPage", "selectSport", "sport", "loadLeaguesPage", "selectLeague", "league", "loadMatchesPage", "selectMatch", "match", "loadMatchDetails", "matchDetailsListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "matchBetListener", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupModel;", "onBetGroupTabSelected", "index", "onBetClick", "groupId", "betIndex", "onExpandToggle", "tabIndex", "setAllExpanded", "expanded", "groupIds", "selectBet", "betId", "goBack", "onBackPressed", "createOrAcceptBattle", "dismiss", "updateSearchQuery", "query", "executeSearch", "clearSearch", "loadNextPage", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateBattleDialogController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;
    private final MutableStateFlow<List<MatchVarietyGroupBetsModel>> _betGroups;
    private final MutableStateFlow<Integer> _currentStep;
    private final MutableStateFlow<Map<Integer, Map<Long, Boolean>>> _expandedStatesPerTab;
    private final MutableStateFlow<List<NewLeague>> _leagues;
    private final MutableStateFlow<String> _leaguesQuery;
    private final MutableStateFlow<List<NewMatchItemModel>> _matches;
    private final MutableStateFlow<String> _matchesQuery;
    private final MutableStateFlow<Integer> _selectedBetGroupTabIndex;
    private final MutableStateFlow<Set<Long>> _selectedBetIds;
    private final MutableStateFlow<NewLeague> _selectedLeague;
    private final MutableStateFlow<NewMatchItemModel> _selectedMatch;
    private final MutableStateFlow<NewSport> _selectedNewSport;
    private final MutableStateFlow<List<NewSport>> _sports;
    private final MutableStateFlow<String> _sportsQuery;
    private final MutableStateFlow<List<BetGroupsTabs>> _subMatches;
    private Long battleId;
    private final StateFlow<List<MatchVarietyGroupBetsModel>> betGroups;
    private final CoroutineScope controllerScope;
    private final StateFlow<Integer> currentStep;
    private final StateFlow<Map<Integer, Map<Long, Boolean>>> expandedStatesPerTab;
    private final FavouriteTypeK favouriteType;
    private final StateFlow<List<NewLeague>> leagues;

    @Inject
    public NewLeaguesInteractor leaguesInteractor;
    private final StateFlow<String> leaguesQuery;

    @Inject
    public MatchVarietiesInteractor matchBetGroupsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<MatchVarietyGroupModel>, List<Integer>> matchBetListener;

    @Inject
    public MatchShortInfoInteractor matchDetailsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<MatchShortInfoModel, Integer> matchDetailsListener;

    @Inject
    public MatchFilterState matchFilterState;
    private final StateFlow<List<NewMatchItemModel>> matches;

    @Inject
    public NewLeagueMatchesInteractor matchesInteractor;
    private final StateFlow<String> matchesQuery;
    private Function0<Unit> onDismiss;
    private final StateFlow<Integer> selectedBetGroupTabIndex;
    private final StateFlow<Set<Long>> selectedBetIds;
    private final StateFlow<NewLeague> selectedLeague;
    private final StateFlow<NewMatchItemModel> selectedMatch;
    private final StateFlow<NewSport> selectedNewSport;
    private final StateFlow<List<NewSport>> sports;

    @Inject
    public NewSportsInteractor sportsInteractor;
    private final StateFlow<String> sportsQuery;
    private final StateFlow<List<BetGroupsTabs>> subMatches;

    public final NewSportsInteractor getSportsInteractor() {
        NewSportsInteractor newSportsInteractor = this.sportsInteractor;
        if (newSportsInteractor != null) {
            return newSportsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportsInteractor");
        return null;
    }

    public final void setSportsInteractor(NewSportsInteractor newSportsInteractor) {
        Intrinsics.checkNotNullParameter(newSportsInteractor, "<set-?>");
        this.sportsInteractor = newSportsInteractor;
    }

    public final NewLeaguesInteractor getLeaguesInteractor() {
        NewLeaguesInteractor newLeaguesInteractor = this.leaguesInteractor;
        if (newLeaguesInteractor != null) {
            return newLeaguesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leaguesInteractor");
        return null;
    }

    public final void setLeaguesInteractor(NewLeaguesInteractor newLeaguesInteractor) {
        Intrinsics.checkNotNullParameter(newLeaguesInteractor, "<set-?>");
        this.leaguesInteractor = newLeaguesInteractor;
    }

    public final NewLeagueMatchesInteractor getMatchesInteractor() {
        NewLeagueMatchesInteractor newLeagueMatchesInteractor = this.matchesInteractor;
        if (newLeagueMatchesInteractor != null) {
            return newLeagueMatchesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchesInteractor");
        return null;
    }

    public final void setMatchesInteractor(NewLeagueMatchesInteractor newLeagueMatchesInteractor) {
        Intrinsics.checkNotNullParameter(newLeagueMatchesInteractor, "<set-?>");
        this.matchesInteractor = newLeagueMatchesInteractor;
    }

    public final MatchVarietiesInteractor getMatchBetGroupsInteractor() {
        MatchVarietiesInteractor matchVarietiesInteractor = this.matchBetGroupsInteractor;
        if (matchVarietiesInteractor != null) {
            return matchVarietiesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchBetGroupsInteractor");
        return null;
    }

    public final void setMatchBetGroupsInteractor(MatchVarietiesInteractor matchVarietiesInteractor) {
        Intrinsics.checkNotNullParameter(matchVarietiesInteractor, "<set-?>");
        this.matchBetGroupsInteractor = matchVarietiesInteractor;
    }

    public final MatchShortInfoInteractor getMatchDetailsInteractor() {
        MatchShortInfoInteractor matchShortInfoInteractor = this.matchDetailsInteractor;
        if (matchShortInfoInteractor != null) {
            return matchShortInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchDetailsInteractor");
        return null;
    }

    public final void setMatchDetailsInteractor(MatchShortInfoInteractor matchShortInfoInteractor) {
        Intrinsics.checkNotNullParameter(matchShortInfoInteractor, "<set-?>");
        this.matchDetailsInteractor = matchShortInfoInteractor;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public MatchFilterState getMatchFilterState() {
        MatchFilterState matchFilterState = this.matchFilterState;
        if (matchFilterState != null) {
            return matchFilterState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchFilterState");
        return null;
    }

    public void setMatchFilterState(MatchFilterState matchFilterState) {
        Intrinsics.checkNotNullParameter(matchFilterState, "<set-?>");
        this.matchFilterState = matchFilterState;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavoriteSaver getFavoriteSaver() {
        return this;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavouriteTypeK getFavouriteType() {
        return this.favouriteType;
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(false);
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavoritesWithDeleteAndPut(List<Integer> initialIds, List<Integer> newIds, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(initialIds, "initialIds");
        Intrinsics.checkNotNullParameter(newIds, "newIds");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(false);
    }

    @Inject
    public CreateBattleDialogController() {
        super(0, 1, null);
        this.controllerScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.favouriteType = FavouriteTypeK.Sports.INSTANCE;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this._currentStep = MutableStateFlow;
        this.currentStep = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this._sportsQuery = MutableStateFlow2;
        this.sportsQuery = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this._leaguesQuery = MutableStateFlow3;
        this.leaguesQuery = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow("");
        this._matchesQuery = MutableStateFlow4;
        this.matchesQuery = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<List<NewSport>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._sports = MutableStateFlow5;
        this.sports = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<NewLeague>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._leagues = MutableStateFlow6;
        this.leagues = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<NewMatchItemModel>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._matches = MutableStateFlow7;
        this.matches = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<NewSport> MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this._selectedNewSport = MutableStateFlow8;
        this.selectedNewSport = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<NewLeague> MutableStateFlow9 = StateFlowKt.MutableStateFlow(null);
        this._selectedLeague = MutableStateFlow9;
        this.selectedLeague = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<NewMatchItemModel> MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this._selectedMatch = MutableStateFlow10;
        this.selectedMatch = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Set<Long>> MutableStateFlow11 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._selectedBetIds = MutableStateFlow11;
        this.selectedBetIds = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<List<MatchVarietyGroupBetsModel>> MutableStateFlow12 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betGroups = MutableStateFlow12;
        this.betGroups = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<Integer> MutableStateFlow13 = StateFlowKt.MutableStateFlow(0);
        this._selectedBetGroupTabIndex = MutableStateFlow13;
        this.selectedBetGroupTabIndex = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<List<BetGroupsTabs>> MutableStateFlow14 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._subMatches = MutableStateFlow14;
        this.subMatches = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<Map<Integer, Map<Long, Boolean>>> MutableStateFlow15 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this._expandedStatesPerTab = MutableStateFlow15;
        this.expandedStatesPerTab = FlowKt.asStateFlow(MutableStateFlow15);
        this.matchDetailsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.CreateBattleDialogController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CreateBattleDialogController.matchDetailsListener$lambda$6(CreateBattleDialogController.this, fetchedResponseMessage);
            }
        };
        this.matchBetListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.CreateBattleDialogController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CreateBattleDialogController.matchBetListener$lambda$7(CreateBattleDialogController.this, fetchedResponseMessage);
            }
        };
    }

    public final StateFlow<Integer> getCurrentStep() {
        return this.currentStep;
    }

    public final StateFlow<String> getSportsQuery() {
        return this.sportsQuery;
    }

    public final StateFlow<String> getLeaguesQuery() {
        return this.leaguesQuery;
    }

    public final StateFlow<String> getMatchesQuery() {
        return this.matchesQuery;
    }

    public final StateFlow<List<NewSport>> getSports() {
        return this.sports;
    }

    public final StateFlow<List<NewLeague>> getLeagues() {
        return this.leagues;
    }

    public final StateFlow<List<NewMatchItemModel>> getMatches() {
        return this.matches;
    }

    public final StateFlow<NewSport> getSelectedNewSport() {
        return this.selectedNewSport;
    }

    public final StateFlow<NewLeague> getSelectedLeague() {
        return this.selectedLeague;
    }

    public final StateFlow<NewMatchItemModel> getSelectedMatch() {
        return this.selectedMatch;
    }

    public final StateFlow<Set<Long>> getSelectedBetIds() {
        return this.selectedBetIds;
    }

    public final StateFlow<List<MatchVarietyGroupBetsModel>> getBetGroups() {
        return this.betGroups;
    }

    public final StateFlow<Integer> getSelectedBetGroupTabIndex() {
        return this.selectedBetGroupTabIndex;
    }

    public final StateFlow<List<BetGroupsTabs>> getSubMatches() {
        return this.subMatches;
    }

    public final StateFlow<Map<Integer, Map<Long, Boolean>>> getExpandedStatesPerTab() {
        return this.expandedStatesPerTab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentOffset() {
        return getOffset();
    }

    private final NewMatchFilter getCurrentFilter() {
        return getMatchFilterState().getSelectedFilter().getValue();
    }

    private final boolean getHasMoreData() {
        return get_hasMore().getValue().booleanValue();
    }

    private final String getCurrentQuery() {
        int intValue = this._currentStep.getValue().intValue();
        if (intValue == 0) {
            return this._sportsQuery.getValue();
        }
        if (intValue == 1) {
            return this._leaguesQuery.getValue();
        }
        if (intValue == 2) {
            return this._matchesQuery.getValue();
        }
        return "";
    }

    public final void bind(MainActivity activity, Function0<Unit> onDismiss, Context context, Long battleId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDismiss = onDismiss;
        this.battleId = battleId;
        if (battleId != null) {
            this._currentStep.setValue(2);
        } else {
            super.bind(context);
        }
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        if (!getIsActive()) {
            Log.d("CreateBattleDialogController", "Controller not active, skipping loadPage");
            return;
        }
        Log.d("CreateBattleDialogController", "loadPage called, append: " + append + ", current step: " + this._currentStep.getValue() + ", offset: " + getCurrentOffset());
        int intValue = this._currentStep.getValue().intValue();
        if (intValue == 0) {
            loadSportsPage(append);
        } else if (intValue == 1) {
            loadLeaguesPage(append);
        } else {
            if (intValue != 2) {
                return;
            }
            loadMatchesPage(append);
        }
    }

    private final void loadSportsPage(boolean append) {
        Log.d("CreateBattleDialogController", "loadSportsPage called, append: " + append + ", offset: " + getCurrentOffset() + ", query: '" + getCurrentQuery() + "'");
        setLoadingStates(append);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getCurrentOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 50);
        bundle.putString("name", getCurrentQuery());
        bundle.putString("matchDateFilter", getCurrentFilter().getName());
        getSportsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.CreateBattleDialogController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CreateBattleDialogController.loadSportsPage$lambda$1(CreateBattleDialogController.this, fetchedResponseMessage);
            }
        }, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadSportsPage$lambda$1(CreateBattleDialogController createBattleDialogController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(createBattleDialogController.controllerScope, Dispatchers.getMain(), null, new CreateBattleDialogController$loadSportsPage$1$1(fetchedResponseMessage, createBattleDialogController, null), 2, null);
    }

    public final void selectSport(NewSport sport) {
        Intrinsics.checkNotNullParameter(sport, "sport");
        this._selectedNewSport.setValue(sport);
        this._currentStep.setValue(1);
        resetState();
        loadInitial();
    }

    private final void loadLeaguesPage(boolean append) {
        setLoadingStates(append);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getCurrentOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 50);
        bundle.putString("searchTerm", getCurrentQuery());
        bundle.putString("matchDateFilter", getCurrentFilter().getName());
        NewLeaguesInteractor leaguesInteractor = getLeaguesInteractor();
        BaseCachedSharedInteractor.OnFetchedListener onFetchedListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.CreateBattleDialogController$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CreateBattleDialogController.loadLeaguesPage$lambda$3(CreateBattleDialogController.this, fetchedResponseMessage);
            }
        };
        NewSport value = this._selectedNewSport.getValue();
        leaguesInteractor.load(onFetchedListener, value != null ? Integer.valueOf(value.getId()) : null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadLeaguesPage$lambda$3(CreateBattleDialogController createBattleDialogController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(createBattleDialogController.controllerScope, Dispatchers.getMain(), null, new CreateBattleDialogController$loadLeaguesPage$1$1(fetchedResponseMessage, createBattleDialogController, null), 2, null);
    }

    public final void selectLeague(NewLeague league) {
        Intrinsics.checkNotNullParameter(league, "league");
        this._selectedLeague.setValue(league);
        this._currentStep.setValue(2);
        resetState();
        loadInitial();
    }

    private final void loadMatchesPage(boolean append) {
        setLoadingStates(append);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getCurrentOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 50);
        bundle.putBoolean("getExpandedBetsInfo", true);
        bundle.putString("type", "ALL_CURRENT");
        NewLeagueMatchesInteractor matchesInteractor = getMatchesInteractor();
        BaseCachedSharedInteractor.OnFetchedListener onFetchedListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.CreateBattleDialogController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                CreateBattleDialogController.loadMatchesPage$lambda$5(CreateBattleDialogController.this, fetchedResponseMessage);
            }
        };
        NewLeague value = this._selectedLeague.getValue();
        matchesInteractor.load(onFetchedListener, value != null ? Integer.valueOf(value.getId()) : null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMatchesPage$lambda$5(CreateBattleDialogController createBattleDialogController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(createBattleDialogController.controllerScope, Dispatchers.getMain(), null, new CreateBattleDialogController$loadMatchesPage$1$1(fetchedResponseMessage, createBattleDialogController, null), 2, null);
    }

    public final void selectMatch(NewMatchItemModel match) {
        Intrinsics.checkNotNullParameter(match, "match");
        this._selectedMatch.setValue(match);
        this._currentStep.setValue(3);
        loadMatchDetails(match);
    }

    private final void loadMatchDetails(NewMatchItemModel match) {
        setLoadingStates(false);
        getMatchDetailsInteractor().load(this.matchDetailsListener, Integer.valueOf((int) match.getMatch().getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void matchDetailsListener$lambda$6(CreateBattleDialogController createBattleDialogController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(createBattleDialogController.controllerScope, Dispatchers.getMain(), null, new CreateBattleDialogController$matchDetailsListener$1$1(fetchedResponseMessage, createBattleDialogController, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void matchBetListener$lambda$7(CreateBattleDialogController createBattleDialogController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(createBattleDialogController.controllerScope, Dispatchers.getMain(), null, new CreateBattleDialogController$matchBetListener$1$1(fetchedResponseMessage, createBattleDialogController, null), 2, null);
    }

    public final void onBetGroupTabSelected(int index) {
        List<MatchVarietyGroupBetsModel> emptyList;
        this._selectedBetGroupTabIndex.setValue(Integer.valueOf(index));
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this._subMatches.getValue(), index);
        if (betGroupsTabs == null || (emptyList = betGroupsTabs.getBets()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        this._betGroups.setValue(emptyList);
    }

    public final void onBetClick(long groupId, int betIndex) {
        Object obj;
        MatchVarietyBetOptionModel matchVarietyBetOptionModel;
        Set<Long> mutableSet = CollectionsKt.toMutableSet(this._selectedBetIds.getValue());
        Iterator<T> it = this._betGroups.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((MatchVarietyGroupBetsModel) obj).getGroup().getId() == groupId) {
                    break;
                }
            }
        }
        MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) obj;
        if (matchVarietyGroupBetsModel == null || (matchVarietyBetOptionModel = (MatchVarietyBetOptionModel) CollectionsKt.getOrNull(matchVarietyGroupBetsModel.getBets(), betIndex)) == null) {
            return;
        }
        if (mutableSet.contains(Long.valueOf(matchVarietyBetOptionModel.getGrabbedBetId()))) {
            mutableSet.remove(Long.valueOf(matchVarietyBetOptionModel.getGrabbedBetId()));
        } else {
            mutableSet.add(Long.valueOf(matchVarietyBetOptionModel.getGrabbedBetId()));
        }
        this._selectedBetIds.setValue(mutableSet);
    }

    public final void onExpandToggle(int tabIndex, long groupId) {
        LinkedHashMap linkedHashMap;
        Map<Integer, Map<Long, Boolean>> mutableMap = MapsKt.toMutableMap(this._expandedStatesPerTab.getValue());
        Map<Long, Boolean> map = mutableMap.get(Integer.valueOf(tabIndex));
        if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(Long.valueOf(groupId), Boolean.valueOf(!(linkedHashMap.get(Long.valueOf(groupId)) != null ? r2.booleanValue() : false)));
        mutableMap.put(Integer.valueOf(tabIndex), linkedHashMap);
        this._expandedStatesPerTab.setValue(mutableMap);
    }

    public final void setAllExpanded(int tabIndex, boolean expanded, List<Long> groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        Map<Integer, Map<Long, Boolean>> mutableMap = MapsKt.toMutableMap(this._expandedStatesPerTab.getValue());
        List<Long> list = groupIds;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            ((Number) obj).longValue();
            linkedHashMap.put(obj, Boolean.valueOf(expanded));
        }
        mutableMap.put(Integer.valueOf(tabIndex), MapsKt.toMutableMap(linkedHashMap));
        this._expandedStatesPerTab.setValue(mutableMap);
    }

    public final void selectBet(long betId) {
        Set<Long> mutableSet = CollectionsKt.toMutableSet(this._selectedBetIds.getValue());
        if (mutableSet.contains(Long.valueOf(betId))) {
            mutableSet.remove(Long.valueOf(betId));
        } else {
            mutableSet.add(Long.valueOf(betId));
        }
        this._selectedBetIds.setValue(mutableSet);
    }

    public final void goBack() {
        if (this._currentStep.getValue().intValue() > 0) {
            this._currentStep.setValue(Integer.valueOf(r0.getValue().intValue() - 1));
        }
    }

    public final boolean onBackPressed() {
        if (this._currentStep.getValue().intValue() <= 0) {
            return false;
        }
        goBack();
        return true;
    }

    public final void createOrAcceptBattle() {
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void dismiss() {
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void updateSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        int intValue = this._currentStep.getValue().intValue();
        if (intValue == 0) {
            this._sportsQuery.setValue(query);
        } else if (intValue == 1) {
            this._leaguesQuery.setValue(query);
        } else {
            if (intValue != 2) {
                return;
            }
            this._matchesQuery.setValue(query);
        }
    }

    public final void executeSearch(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        int intValue = this._currentStep.getValue().intValue();
        if (intValue == 0) {
            this._sportsQuery.setValue(query);
        } else if (intValue == 1) {
            this._leaguesQuery.setValue(query);
        } else if (intValue == 2) {
            this._matchesQuery.setValue(query);
        }
        resetState();
        loadInitial();
    }

    public final void clearSearch() {
        int intValue = this._currentStep.getValue().intValue();
        if (intValue == 0) {
            this._sportsQuery.setValue("");
        } else if (intValue == 1) {
            this._leaguesQuery.setValue("");
        } else if (intValue == 2) {
            this._matchesQuery.setValue("");
        }
        resetState();
        loadInitial();
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
        Log.d("CreateBattleDialogController", "loadNextPage called, current offset: " + getCurrentOffset() + ", hasMore: " + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
        if (!getHasMoreData() || isLoadingMore().getValue().booleanValue() || isLoading().getValue().booleanValue()) {
            Log.d("CreateBattleDialogController", "loadNextPage blocked: hasMore=" + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
            return;
        }
        if (!getIsActive()) {
            Log.d("CreateBattleDialogController", "loadNextPage blocked: not active");
            return;
        }
        setOffset(getOffset() + 50);
        Log.d("CreateBattleDialogController", "Offset incremented to: " + getOffset());
        loadPage(true);
    }
}
