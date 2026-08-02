package org.betup.ui.fragment.search.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.search.V7SearchLeaguesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchMatchesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchTeamsInteractor;
import org.betup.model.remote.api.rest.search.V7SearchUsersInteractor;
import org.betup.model.remote.api.rest.search.V7TrendingItemsInteractor;
import org.betup.model.remote.entity.search.TrendingItemsResponse;
import org.betup.model.remote.entity.search.V7LeagueSearchResult;
import org.betup.model.remote.entity.search.V7MatchSearchResult;
import org.betup.model.remote.entity.search.V7SearchLeaguesResponse;
import org.betup.model.remote.entity.search.V7SearchMatchesResponse;
import org.betup.model.remote.entity.search.V7SearchTeamsResponse;
import org.betup.model.remote.entity.search.V7SearchUsersResponse;
import org.betup.model.remote.entity.search.V7TeamSearchResult;
import org.betup.model.remote.entity.search.V7UserSearchResult;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SearchController.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bJ\u0006\u0010c\u001a\u00020`J\u001c\u0010d\u001a\u00020`2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020`0fH\u0002J\u000e\u0010h\u001a\u00020`2\u0006\u0010i\u001a\u000201J\u000e\u0010j\u001a\u00020`2\u0006\u0010k\u001a\u00020$J\u000e\u0010l\u001a\u00020`2\u0006\u0010k\u001a\u00020$J\u0006\u0010m\u001a\u00020`J\u0010\u0010n\u001a\u00020`2\u0006\u0010k\u001a\u00020$H\u0002J\b\u0010o\u001a\u00020`H\u0002J\u0010\u0010p\u001a\u00020`2\u0006\u0010k\u001a\u00020$H\u0002J\b\u0010q\u001a\u00020`H\u0002J\u0010\u0010r\u001a\u00020`2\u0006\u0010k\u001a\u00020$H\u0002J\b\u0010s\u001a\u00020`H\u0002J\u0010\u0010t\u001a\u00020`2\u0006\u0010k\u001a\u00020$H\u0002J\b\u0010u\u001a\u00020`H\u0002J\u0018\u0010v\u001a\u00020`2\u0006\u0010k\u001a\u00020$2\u0006\u0010w\u001a\u00020.H\u0002J\u0018\u0010x\u001a\u00020`2\u0006\u0010k\u001a\u00020$2\u0006\u0010w\u001a\u00020.H\u0002J\u0018\u0010y\u001a\u00020`2\u0006\u0010k\u001a\u00020$2\u0006\u0010w\u001a\u00020.H\u0002J\u0010\u0010z\u001a\u00020`2\u0006\u0010k\u001a\u00020$H\u0002J\b\u0010{\u001a\u00020`H\u0002J\u0018\u0010|\u001a\u00020`2\u0006\u0010k\u001a\u00020$2\u0006\u0010w\u001a\u00020.H\u0002J\t\u0010\u0086\u0001\u001a\u00020`H\u0002J\t\u0010\u0087\u0001\u001a\u00020`H\u0002J%\u0010\u0088\u0001\u001a\u00020.2\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008b\u0001\u001a\u00020Y2\u0007\u0010\u008c\u0001\u001a\u00020YH\u0002J\u0007\u0010\u008d\u0001\u001a\u00020.R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0*0&¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002010&¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050&¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090*0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090*0&¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u001a\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0*0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0*0&¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u001a\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0*0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0*0&¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0*0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0*0&¢\u0006\b\n\u0000\u001a\u0004\bG\u0010(R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020.0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\b\n\u0000\u001a\u0004\bI\u0010(R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020.0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\b\n\u0000\u001a\u0004\bK\u0010(R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020.0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\b\n\u0000\u001a\u0004\bN\u0010(R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020.0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010(R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020.0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\b\n\u0000\u001a\u0004\bT\u0010(R\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020.0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\b\n\u0000\u001a\u0004\bW\u0010(R\u000e\u0010X\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020YX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020YX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020$0~X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0080\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020$0~X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0082\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020$0~X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0084\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020$0~X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u008e\u0001\u001a\u00030\u008f\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020.0&¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010(¨\u0006\u0092\u0001"}, d2 = {"Lorg/betup/ui/fragment/search/controller/SearchController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "searchMatchesInteractor", "Lorg/betup/model/remote/api/rest/search/V7SearchMatchesInteractor;", "getSearchMatchesInteractor", "()Lorg/betup/model/remote/api/rest/search/V7SearchMatchesInteractor;", "setSearchMatchesInteractor", "(Lorg/betup/model/remote/api/rest/search/V7SearchMatchesInteractor;)V", "searchTeamsInteractor", "Lorg/betup/model/remote/api/rest/search/V7SearchTeamsInteractor;", "getSearchTeamsInteractor", "()Lorg/betup/model/remote/api/rest/search/V7SearchTeamsInteractor;", "setSearchTeamsInteractor", "(Lorg/betup/model/remote/api/rest/search/V7SearchTeamsInteractor;)V", "searchLeaguesInteractor", "Lorg/betup/model/remote/api/rest/search/V7SearchLeaguesInteractor;", "getSearchLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/search/V7SearchLeaguesInteractor;", "setSearchLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/search/V7SearchLeaguesInteractor;)V", "searchUsersInteractor", "Lorg/betup/model/remote/api/rest/search/V7SearchUsersInteractor;", "getSearchUsersInteractor", "()Lorg/betup/model/remote/api/rest/search/V7SearchUsersInteractor;", "setSearchUsersInteractor", "(Lorg/betup/model/remote/api/rest/search/V7SearchUsersInteractor;)V", "trendingItemsInteractor", "Lorg/betup/model/remote/api/rest/search/V7TrendingItemsInteractor;", "getTrendingItemsInteractor", "()Lorg/betup/model/remote/api/rest/search/V7TrendingItemsInteractor;", "setTrendingItemsInteractor", "(Lorg/betup/model/remote/api/rest/search/V7TrendingItemsInteractor;)V", "_searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "searchQuery", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchQuery", "()Lkotlinx/coroutines/flow/StateFlow;", "_trendingItems", "", "trendingItems", "getTrendingItems", "_isLoadingTrending", "", "isLoadingTrending", "_searchType", "Lorg/betup/ui/fragment/search/controller/SearchType;", "searchType", "getSearchType", "_allResults", "Lorg/betup/ui/fragment/search/controller/SearchAllResults;", "allResults", "getAllResults", "_leaguesResults", "Lorg/betup/model/remote/entity/search/V7LeagueSearchResult;", "leaguesResults", "getLeaguesResults", "_teamsResults", "Lorg/betup/model/remote/entity/search/V7TeamSearchResult;", "teamsResults", "getTeamsResults", "_matchesResults", "Lorg/betup/model/remote/entity/search/V7MatchSearchResult;", "matchesResults", "getMatchesResults", "_usersResults", "Lorg/betup/model/remote/entity/search/V7UserSearchResult;", "usersResults", "getUsersResults", "_isLoading", "isLoading", "_isLoadingMore", "isLoadingMore", "_hasMoreLeagues", "hasMoreLeagues", "getHasMoreLeagues", "_hasMoreTeams", "hasMoreTeams", "getHasMoreTeams", "_hasMoreMatches", "hasMoreMatches", "getHasMoreMatches", "_hasMoreUsers", "hasMoreUsers", "getHasMoreUsers", "leaguesOffset", "", "teamsOffset", "matchesOffset", "usersOffset", "pageLimit", "currentQuery", "initialize", "", "context", "Landroid/content/Context;", "loadTrendingItems", "updateTrendingItems", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "Lorg/betup/model/remote/entity/search/TrendingItemsResponse;", "setSearchType", "type", "setSearchQuery", "query", "performSearch", "loadMore", "searchAll", "loadMoreAll", "searchLeagues", "loadMoreLeagues", "searchTeams", "loadMoreTeams", "searchMatches", "loadMoreMatches", "searchLeaguesInternal", "append", "searchTeamsInternal", "searchMatchesInternal", "searchUsers", "loadMoreUsers", "searchUsersInternal", "leaguesListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/search/V7SearchLeaguesResponse;", "teamsListener", "Lorg/betup/model/remote/entity/search/V7SearchTeamsResponse;", "matchesListener", "Lorg/betup/model/remote/entity/search/V7SearchMatchesResponse;", "usersListener", "Lorg/betup/model/remote/entity/search/V7SearchUsersResponse;", "resetPagination", "clearResults", "resolveHasMore", "totalItems", "", "accumulatedSize", "receivedSize", "hasMore", "scope", "Lkotlinx/coroutines/CoroutineScope;", "hasMoreFlow", "getHasMoreFlow", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchController {
    public static final int $stable = 8;
    private final MutableStateFlow<SearchAllResults> _allResults;
    private final MutableStateFlow<Boolean> _hasMoreLeagues;
    private final MutableStateFlow<Boolean> _hasMoreMatches;
    private final MutableStateFlow<Boolean> _hasMoreTeams;
    private final MutableStateFlow<Boolean> _hasMoreUsers;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingMore;
    private final MutableStateFlow<Boolean> _isLoadingTrending;
    private final MutableStateFlow<List<V7LeagueSearchResult>> _leaguesResults;
    private final MutableStateFlow<List<V7MatchSearchResult>> _matchesResults;
    private final MutableStateFlow<String> _searchQuery;
    private final MutableStateFlow<SearchType> _searchType;
    private final MutableStateFlow<List<V7TeamSearchResult>> _teamsResults;
    private final MutableStateFlow<List<String>> _trendingItems;
    private final MutableStateFlow<List<V7UserSearchResult>> _usersResults;
    private final StateFlow<SearchAllResults> allResults;
    private String currentQuery;
    private final StateFlow<Boolean> hasMoreFlow;
    private final StateFlow<Boolean> hasMoreLeagues;
    private final StateFlow<Boolean> hasMoreMatches;
    private final StateFlow<Boolean> hasMoreTeams;
    private final StateFlow<Boolean> hasMoreUsers;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingMore;
    private final StateFlow<Boolean> isLoadingTrending;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7SearchLeaguesResponse, String> leaguesListener;
    private int leaguesOffset;
    private final StateFlow<List<V7LeagueSearchResult>> leaguesResults;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7SearchMatchesResponse, String> matchesListener;
    private int matchesOffset;
    private final StateFlow<List<V7MatchSearchResult>> matchesResults;
    private final int pageLimit;
    private final CoroutineScope scope;

    @Inject
    public V7SearchLeaguesInteractor searchLeaguesInteractor;

    @Inject
    public V7SearchMatchesInteractor searchMatchesInteractor;
    private final StateFlow<String> searchQuery;

    @Inject
    public V7SearchTeamsInteractor searchTeamsInteractor;
    private final StateFlow<SearchType> searchType;

    @Inject
    public V7SearchUsersInteractor searchUsersInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7SearchTeamsResponse, String> teamsListener;
    private int teamsOffset;
    private final StateFlow<List<V7TeamSearchResult>> teamsResults;
    private final StateFlow<List<String>> trendingItems;

    @Inject
    public V7TrendingItemsInteractor trendingItemsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7SearchUsersResponse, String> usersListener;
    private int usersOffset;
    private final StateFlow<List<V7UserSearchResult>> usersResults;

    /* compiled from: SearchController.kt */
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

    @Inject
    public SearchController() {
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._searchQuery = MutableStateFlow;
        this.searchQuery = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<String>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._trendingItems = MutableStateFlow2;
        this.trendingItems = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingTrending = MutableStateFlow3;
        this.isLoadingTrending = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<SearchType> MutableStateFlow4 = StateFlowKt.MutableStateFlow(SearchType.ALL);
        this._searchType = MutableStateFlow4;
        this.searchType = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<SearchAllResults> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new SearchAllResults(null, null, null, null, 15, null));
        this._allResults = MutableStateFlow5;
        this.allResults = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<V7LeagueSearchResult>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._leaguesResults = MutableStateFlow6;
        this.leaguesResults = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<V7TeamSearchResult>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._teamsResults = MutableStateFlow7;
        this.teamsResults = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<List<V7MatchSearchResult>> MutableStateFlow8 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._matchesResults = MutableStateFlow8;
        this.matchesResults = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<List<V7UserSearchResult>> MutableStateFlow9 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._usersResults = MutableStateFlow9;
        this.usersResults = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow10;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Boolean> MutableStateFlow11 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingMore = MutableStateFlow11;
        this.isLoadingMore = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<Boolean> MutableStateFlow12 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreLeagues = MutableStateFlow12;
        this.hasMoreLeagues = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<Boolean> MutableStateFlow13 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreTeams = MutableStateFlow13;
        this.hasMoreTeams = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<Boolean> MutableStateFlow14 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreMatches = MutableStateFlow14;
        this.hasMoreMatches = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<Boolean> MutableStateFlow15 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreUsers = MutableStateFlow15;
        this.hasMoreUsers = FlowKt.asStateFlow(MutableStateFlow15);
        this.pageLimit = 10;
        this.currentQuery = "";
        this.leaguesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.search.controller.SearchController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SearchController.leaguesListener$lambda$5(SearchController.this, fetchedResponseMessage);
            }
        };
        this.teamsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.search.controller.SearchController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SearchController.teamsListener$lambda$6(SearchController.this, fetchedResponseMessage);
            }
        };
        this.matchesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.search.controller.SearchController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SearchController.matchesListener$lambda$7(SearchController.this, fetchedResponseMessage);
            }
        };
        this.usersListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.search.controller.SearchController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SearchController.usersListener$lambda$8(SearchController.this, fetchedResponseMessage);
            }
        };
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.scope = CoroutineScope;
        this.hasMoreFlow = FlowKt.stateIn(FlowKt.combine(MutableStateFlow12, MutableStateFlow13, MutableStateFlow14, FlowKt.combine(MutableStateFlow15, MutableStateFlow4, new SearchController$hasMoreFlow$1(null)), new SearchController$hasMoreFlow$2(null)), CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), false);
    }

    public final V7SearchMatchesInteractor getSearchMatchesInteractor() {
        V7SearchMatchesInteractor v7SearchMatchesInteractor = this.searchMatchesInteractor;
        if (v7SearchMatchesInteractor != null) {
            return v7SearchMatchesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchMatchesInteractor");
        return null;
    }

    public final void setSearchMatchesInteractor(V7SearchMatchesInteractor v7SearchMatchesInteractor) {
        Intrinsics.checkNotNullParameter(v7SearchMatchesInteractor, "<set-?>");
        this.searchMatchesInteractor = v7SearchMatchesInteractor;
    }

    public final V7SearchTeamsInteractor getSearchTeamsInteractor() {
        V7SearchTeamsInteractor v7SearchTeamsInteractor = this.searchTeamsInteractor;
        if (v7SearchTeamsInteractor != null) {
            return v7SearchTeamsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchTeamsInteractor");
        return null;
    }

    public final void setSearchTeamsInteractor(V7SearchTeamsInteractor v7SearchTeamsInteractor) {
        Intrinsics.checkNotNullParameter(v7SearchTeamsInteractor, "<set-?>");
        this.searchTeamsInteractor = v7SearchTeamsInteractor;
    }

    public final V7SearchLeaguesInteractor getSearchLeaguesInteractor() {
        V7SearchLeaguesInteractor v7SearchLeaguesInteractor = this.searchLeaguesInteractor;
        if (v7SearchLeaguesInteractor != null) {
            return v7SearchLeaguesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchLeaguesInteractor");
        return null;
    }

    public final void setSearchLeaguesInteractor(V7SearchLeaguesInteractor v7SearchLeaguesInteractor) {
        Intrinsics.checkNotNullParameter(v7SearchLeaguesInteractor, "<set-?>");
        this.searchLeaguesInteractor = v7SearchLeaguesInteractor;
    }

    public final V7SearchUsersInteractor getSearchUsersInteractor() {
        V7SearchUsersInteractor v7SearchUsersInteractor = this.searchUsersInteractor;
        if (v7SearchUsersInteractor != null) {
            return v7SearchUsersInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchUsersInteractor");
        return null;
    }

    public final void setSearchUsersInteractor(V7SearchUsersInteractor v7SearchUsersInteractor) {
        Intrinsics.checkNotNullParameter(v7SearchUsersInteractor, "<set-?>");
        this.searchUsersInteractor = v7SearchUsersInteractor;
    }

    public final V7TrendingItemsInteractor getTrendingItemsInteractor() {
        V7TrendingItemsInteractor v7TrendingItemsInteractor = this.trendingItemsInteractor;
        if (v7TrendingItemsInteractor != null) {
            return v7TrendingItemsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trendingItemsInteractor");
        return null;
    }

    public final void setTrendingItemsInteractor(V7TrendingItemsInteractor v7TrendingItemsInteractor) {
        Intrinsics.checkNotNullParameter(v7TrendingItemsInteractor, "<set-?>");
        this.trendingItemsInteractor = v7TrendingItemsInteractor;
    }

    public final StateFlow<String> getSearchQuery() {
        return this.searchQuery;
    }

    public final StateFlow<List<String>> getTrendingItems() {
        return this.trendingItems;
    }

    public final StateFlow<Boolean> isLoadingTrending() {
        return this.isLoadingTrending;
    }

    public final StateFlow<SearchType> getSearchType() {
        return this.searchType;
    }

    public final StateFlow<SearchAllResults> getAllResults() {
        return this.allResults;
    }

    public final StateFlow<List<V7LeagueSearchResult>> getLeaguesResults() {
        return this.leaguesResults;
    }

    public final StateFlow<List<V7TeamSearchResult>> getTeamsResults() {
        return this.teamsResults;
    }

    public final StateFlow<List<V7MatchSearchResult>> getMatchesResults() {
        return this.matchesResults;
    }

    public final StateFlow<List<V7UserSearchResult>> getUsersResults() {
        return this.usersResults;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isLoadingMore() {
        return this.isLoadingMore;
    }

    public final StateFlow<Boolean> getHasMoreLeagues() {
        return this.hasMoreLeagues;
    }

    public final StateFlow<Boolean> getHasMoreTeams() {
        return this.hasMoreTeams;
    }

    public final StateFlow<Boolean> getHasMoreMatches() {
        return this.hasMoreMatches;
    }

    public final StateFlow<Boolean> getHasMoreUsers() {
        return this.hasMoreUsers;
    }

    public final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        loadTrendingItems();
    }

    public final void loadTrendingItems() {
        if (this._isLoadingTrending.getValue().booleanValue()) {
            Log.d("SearchController", "Already loading trending items, skipping");
            return;
        }
        Log.d("SearchController", "Starting to load trending items");
        this._isLoadingTrending.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        getTrendingItemsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<TrendingItemsResponse, Unit>() { // from class: org.betup.ui.fragment.search.controller.SearchController$loadTrendingItems$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<TrendingItemsResponse, Unit> responseMessage) {
                CoroutineScope coroutineScope;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                Log.d("SearchController", "onFetched called with stat: " + responseMessage.getStat() + ", model: " + (responseMessage.getModel() != null));
                Log.d("SearchController", "Current thread: " + Thread.currentThread().getName());
                if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                    SearchController.this.updateTrendingItems(responseMessage);
                } else {
                    coroutineScope = SearchController.this.scope;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new SearchController$loadTrendingItems$1$onFetched$1(SearchController.this, responseMessage, null), 2, null);
                }
            }
        }, Unit.INSTANCE, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTrendingItems(FetchedResponseMessage<TrendingItemsResponse, Unit> responseMessage) {
        this._isLoadingTrending.setValue(false);
        Log.d("SearchController", "isLoadingTrending set to false");
        if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
            List<String> items = responseMessage.getModel().getItems();
            Log.d("SearchController", "Setting trending items: " + items.size() + " items - " + items);
            this._trendingItems.setValue(items);
            Log.d("SearchController", "Trending items StateFlow updated, current value: " + this._trendingItems.getValue().size());
            return;
        }
        Log.d("SearchController", "Trending items failed: stat=" + responseMessage.getStat() + ", model=" + responseMessage.getModel());
    }

    public final void setSearchType(SearchType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this._searchType.getValue() != type) {
            this._searchType.setValue(type);
            resetPagination();
            if (this._searchQuery.getValue().length() > 0) {
                performSearch(this._searchQuery.getValue());
            }
        }
    }

    public final void setSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._searchQuery.setValue(query);
        if (query.length() == 0) {
            clearResults();
        }
    }

    public final void performSearch(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() == 0) {
            clearResults();
            return;
        }
        this.currentQuery = query;
        resetPagination();
        clearResults();
        int i = WhenMappings.$EnumSwitchMapping$0[this._searchType.getValue().ordinal()];
        if (i == 1) {
            searchAll(query);
            return;
        }
        if (i == 2) {
            searchLeagues(query);
            return;
        }
        if (i == 3) {
            searchTeams(query);
        } else if (i == 4) {
            searchMatches(query);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            searchUsers(query);
        }
    }

    public final void loadMore() {
        if (this._isLoadingMore.getValue().booleanValue() || this._searchQuery.getValue().length() == 0) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this._searchType.getValue().ordinal()];
        if (i == 1) {
            loadMoreAll();
            return;
        }
        if (i == 2) {
            loadMoreLeagues();
            return;
        }
        if (i == 3) {
            loadMoreTeams();
        } else if (i == 4) {
            loadMoreMatches();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            loadMoreUsers();
        }
    }

    private final void searchAll(String query) {
        if (this._isLoading.getValue().booleanValue()) {
            return;
        }
        this._isLoading.setValue(true);
        this.leaguesOffset = 0;
        this.teamsOffset = 0;
        this.matchesOffset = 0;
        this.usersOffset = 0;
        searchLeaguesInternal(query, false);
        searchTeamsInternal(query, false);
        searchMatchesInternal(query, false);
        searchUsersInternal(query, false);
    }

    private final void loadMoreAll() {
        boolean z;
        if (!this._hasMoreLeagues.getValue().booleanValue() || this._isLoadingMore.getValue().booleanValue()) {
            z = false;
        } else {
            this.leaguesOffset += this.pageLimit;
            searchLeaguesInternal(this.currentQuery, true);
            z = true;
        }
        if (this._hasMoreTeams.getValue().booleanValue() && !this._isLoadingMore.getValue().booleanValue()) {
            this.teamsOffset += this.pageLimit;
            searchTeamsInternal(this.currentQuery, true);
            z = true;
        }
        if (this._hasMoreMatches.getValue().booleanValue() && !this._isLoadingMore.getValue().booleanValue()) {
            this.matchesOffset += this.pageLimit;
            searchMatchesInternal(this.currentQuery, true);
            z = true;
        }
        if (this._hasMoreUsers.getValue().booleanValue() && !this._isLoadingMore.getValue().booleanValue()) {
            this.usersOffset += this.pageLimit;
            searchUsersInternal(this.currentQuery, true);
            z = true;
        }
        if (z) {
            this._isLoadingMore.setValue(true);
        }
    }

    private final void searchLeagues(String query) {
        this.leaguesOffset = 0;
        searchLeaguesInternal(query, false);
    }

    private final void loadMoreLeagues() {
        if (!this._hasMoreLeagues.getValue().booleanValue() || this._isLoadingMore.getValue().booleanValue()) {
            return;
        }
        this._isLoadingMore.setValue(true);
        this.leaguesOffset += this.pageLimit;
        searchLeaguesInternal(this.currentQuery, true);
    }

    private final void searchTeams(String query) {
        this.teamsOffset = 0;
        searchTeamsInternal(query, false);
    }

    private final void loadMoreTeams() {
        if (!this._hasMoreTeams.getValue().booleanValue() || this._isLoadingMore.getValue().booleanValue()) {
            return;
        }
        this._isLoadingMore.setValue(true);
        this.teamsOffset += this.pageLimit;
        searchTeamsInternal(this.currentQuery, true);
    }

    private final void searchMatches(String query) {
        this.matchesOffset = 0;
        searchMatchesInternal(query, false);
    }

    private final void loadMoreMatches() {
        if (!this._hasMoreMatches.getValue().booleanValue() || this._isLoadingMore.getValue().booleanValue()) {
            return;
        }
        this._isLoadingMore.setValue(true);
        this.matchesOffset += this.pageLimit;
        searchMatchesInternal(this.currentQuery, true);
    }

    private final void searchLeaguesInternal(String query, boolean append) {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.leaguesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.pageLimit);
        getSearchLeaguesInteractor().load(this.leaguesListener, query, bundle);
    }

    private final void searchTeamsInternal(String query, boolean append) {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.teamsOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.pageLimit);
        getSearchTeamsInteractor().load(this.teamsListener, query, bundle);
    }

    private final void searchMatchesInternal(String query, boolean append) {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.matchesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.pageLimit);
        getSearchMatchesInteractor().load(this.matchesListener, query, bundle);
    }

    private final void searchUsers(String query) {
        this.usersOffset = 0;
        searchUsersInternal(query, false);
    }

    private final void loadMoreUsers() {
        if (!this._hasMoreUsers.getValue().booleanValue() || this._isLoadingMore.getValue().booleanValue()) {
            return;
        }
        this._isLoadingMore.setValue(true);
        this.usersOffset += this.pageLimit;
        searchUsersInternal(this.currentQuery, true);
    }

    private final void searchUsersInternal(String query, boolean append) {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.usersOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.pageLimit);
        getSearchUsersInteractor().load(this.usersListener, query, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void leaguesListener$lambda$5(SearchController searchController, FetchedResponseMessage fetchedResponseMessage) {
        FetchStat stat;
        if (searchController._searchType.getValue() == SearchType.ALL) {
            searchController._isLoadingMore.setValue(false);
        } else {
            searchController._isLoadingMore.setValue(false);
            searchController._isLoading.setValue(false);
        }
        if (!Intrinsics.areEqual((fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null) ? null : stat.name(), "SUCCESS") || fetchedResponseMessage.getModel() == null) {
            return;
        }
        List<V7LeagueSearchResult> items = ((V7SearchLeaguesResponse) fetchedResponseMessage.getModel()).getItems();
        if (searchController._searchType.getValue() == SearchType.ALL) {
            SearchAllResults value = searchController._allResults.getValue();
            List<V7LeagueSearchResult> plus = searchController.leaguesOffset == 0 ? items : CollectionsKt.plus((Collection) value.getLeagues(), (Iterable) items);
            searchController._allResults.setValue(SearchAllResults.copy$default(value, plus, null, null, null, 14, null));
            searchController._hasMoreLeagues.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchLeaguesResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus.size(), items.size())));
            return;
        }
        List<V7LeagueSearchResult> plus2 = searchController.leaguesOffset == 0 ? items : CollectionsKt.plus((Collection) searchController._leaguesResults.getValue(), (Iterable) items);
        searchController._leaguesResults.setValue(plus2);
        searchController._hasMoreLeagues.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchLeaguesResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus2.size(), items.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void teamsListener$lambda$6(SearchController searchController, FetchedResponseMessage fetchedResponseMessage) {
        FetchStat stat;
        if (searchController._searchType.getValue() == SearchType.ALL) {
            searchController._isLoadingMore.setValue(false);
        } else {
            searchController._isLoadingMore.setValue(false);
            searchController._isLoading.setValue(false);
        }
        if (!Intrinsics.areEqual((fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null) ? null : stat.name(), "SUCCESS") || fetchedResponseMessage.getModel() == null) {
            return;
        }
        List<V7TeamSearchResult> items = ((V7SearchTeamsResponse) fetchedResponseMessage.getModel()).getItems();
        if (searchController._searchType.getValue() == SearchType.ALL) {
            SearchAllResults value = searchController._allResults.getValue();
            List<V7TeamSearchResult> plus = searchController.teamsOffset == 0 ? items : CollectionsKt.plus((Collection) value.getTeams(), (Iterable) items);
            searchController._allResults.setValue(SearchAllResults.copy$default(value, null, plus, null, null, 13, null));
            searchController._hasMoreTeams.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchTeamsResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus.size(), items.size())));
            return;
        }
        List<V7TeamSearchResult> plus2 = searchController.teamsOffset == 0 ? items : CollectionsKt.plus((Collection) searchController._teamsResults.getValue(), (Iterable) items);
        searchController._teamsResults.setValue(plus2);
        searchController._hasMoreTeams.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchTeamsResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus2.size(), items.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void matchesListener$lambda$7(SearchController searchController, FetchedResponseMessage fetchedResponseMessage) {
        FetchStat stat;
        if (searchController._searchType.getValue() == SearchType.ALL) {
            searchController._isLoadingMore.setValue(false);
            if (!searchController._isLoadingMore.getValue().booleanValue()) {
                searchController._isLoading.setValue(false);
            }
        } else {
            searchController._isLoadingMore.setValue(false);
            searchController._isLoading.setValue(false);
        }
        if (!Intrinsics.areEqual((fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null) ? null : stat.name(), "SUCCESS") || fetchedResponseMessage.getModel() == null) {
            return;
        }
        List<V7MatchSearchResult> items = ((V7SearchMatchesResponse) fetchedResponseMessage.getModel()).getItems();
        if (searchController._searchType.getValue() == SearchType.ALL) {
            SearchAllResults value = searchController._allResults.getValue();
            List<V7MatchSearchResult> plus = searchController.matchesOffset == 0 ? items : CollectionsKt.plus((Collection) value.getMatches(), (Iterable) items);
            searchController._allResults.setValue(SearchAllResults.copy$default(value, null, null, plus, null, 11, null));
            searchController._hasMoreMatches.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchMatchesResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus.size(), items.size())));
            return;
        }
        List<V7MatchSearchResult> plus2 = searchController.matchesOffset == 0 ? items : CollectionsKt.plus((Collection) searchController._matchesResults.getValue(), (Iterable) items);
        searchController._matchesResults.setValue(plus2);
        searchController._hasMoreMatches.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchMatchesResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus2.size(), items.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void usersListener$lambda$8(SearchController searchController, FetchedResponseMessage fetchedResponseMessage) {
        FetchStat stat;
        if (searchController._searchType.getValue() == SearchType.ALL) {
            searchController._isLoadingMore.setValue(false);
        } else {
            searchController._isLoadingMore.setValue(false);
            searchController._isLoading.setValue(false);
        }
        if (!Intrinsics.areEqual((fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null) ? null : stat.name(), "SUCCESS") || fetchedResponseMessage.getModel() == null) {
            return;
        }
        List<V7UserSearchResult> items = ((V7SearchUsersResponse) fetchedResponseMessage.getModel()).getItems();
        if (searchController._searchType.getValue() == SearchType.ALL) {
            SearchAllResults value = searchController._allResults.getValue();
            List<V7UserSearchResult> plus = searchController.usersOffset == 0 ? items : CollectionsKt.plus((Collection) value.getUsers(), (Iterable) items);
            searchController._allResults.setValue(SearchAllResults.copy$default(value, null, null, null, plus, 7, null));
            searchController._hasMoreUsers.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchUsersResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus.size(), items.size())));
            return;
        }
        List<V7UserSearchResult> plus2 = searchController.usersOffset == 0 ? items : CollectionsKt.plus((Collection) searchController._usersResults.getValue(), (Iterable) items);
        searchController._usersResults.setValue(plus2);
        searchController._hasMoreUsers.setValue(Boolean.valueOf(searchController.resolveHasMore(((V7SearchUsersResponse) fetchedResponseMessage.getModel()).getTotalItems(), plus2.size(), items.size())));
    }

    private final void resetPagination() {
        this.leaguesOffset = 0;
        this.teamsOffset = 0;
        this.matchesOffset = 0;
        this.usersOffset = 0;
        this._hasMoreLeagues.setValue(true);
        this._hasMoreTeams.setValue(true);
        this._hasMoreMatches.setValue(true);
        this._hasMoreUsers.setValue(true);
    }

    private final void clearResults() {
        this._allResults.setValue(new SearchAllResults(null, null, null, null, 15, null));
        this._leaguesResults.setValue(CollectionsKt.emptyList());
        this._teamsResults.setValue(CollectionsKt.emptyList());
        this._matchesResults.setValue(CollectionsKt.emptyList());
        this._usersResults.setValue(CollectionsKt.emptyList());
    }

    private final boolean resolveHasMore(long totalItems, int accumulatedSize, int receivedSize) {
        return totalItems > 0 ? ((long) accumulatedSize) < totalItems : receivedSize > 0 && receivedSize >= this.pageLimit;
    }

    public final boolean hasMore() {
        int i = WhenMappings.$EnumSwitchMapping$0[this._searchType.getValue().ordinal()];
        if (i == 1) {
            return this._hasMoreLeagues.getValue().booleanValue() || this._hasMoreTeams.getValue().booleanValue() || this._hasMoreMatches.getValue().booleanValue() || this._hasMoreUsers.getValue().booleanValue();
        }
        if (i == 2) {
            return this._hasMoreLeagues.getValue().booleanValue();
        }
        if (i == 3) {
            return this._hasMoreTeams.getValue().booleanValue();
        }
        if (i == 4) {
            return this._hasMoreMatches.getValue().booleanValue();
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return this._hasMoreUsers.getValue().booleanValue();
    }

    public final StateFlow<Boolean> getHasMoreFlow() {
        return this.hasMoreFlow;
    }
}
