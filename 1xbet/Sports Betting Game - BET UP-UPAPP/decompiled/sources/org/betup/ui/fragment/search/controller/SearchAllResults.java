package org.betup.ui.fragment.search.controller;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.search.V7LeagueSearchResult;
import org.betup.model.remote.entity.search.V7MatchSearchResult;
import org.betup.model.remote.entity.search.V7TeamSearchResult;
import org.betup.model.remote.entity.search.V7UserSearchResult;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SearchController.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JI\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/fragment/search/controller/SearchAllResults;", "", "leagues", "", "Lorg/betup/model/remote/entity/search/V7LeagueSearchResult;", "teams", "Lorg/betup/model/remote/entity/search/V7TeamSearchResult;", "matches", "Lorg/betup/model/remote/entity/search/V7MatchSearchResult;", "users", "Lorg/betup/model/remote/entity/search/V7UserSearchResult;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLeagues", "()Ljava/util/List;", "getTeams", "getMatches", "getUsers", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchAllResults {
    public static final int $stable = 8;
    private final List<V7LeagueSearchResult> leagues;
    private final List<V7MatchSearchResult> matches;
    private final List<V7TeamSearchResult> teams;
    private final List<V7UserSearchResult> users;

    public SearchAllResults() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchAllResults copy$default(SearchAllResults searchAllResults, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchAllResults.leagues;
        }
        if ((i & 2) != 0) {
            list2 = searchAllResults.teams;
        }
        if ((i & 4) != 0) {
            list3 = searchAllResults.matches;
        }
        if ((i & 8) != 0) {
            list4 = searchAllResults.users;
        }
        return searchAllResults.copy(list, list2, list3, list4);
    }

    public final List<V7LeagueSearchResult> component1() {
        return this.leagues;
    }

    public final List<V7TeamSearchResult> component2() {
        return this.teams;
    }

    public final List<V7MatchSearchResult> component3() {
        return this.matches;
    }

    public final List<V7UserSearchResult> component4() {
        return this.users;
    }

    public final SearchAllResults copy(List<V7LeagueSearchResult> leagues, List<V7TeamSearchResult> teams, List<V7MatchSearchResult> matches, List<V7UserSearchResult> users) {
        Intrinsics.checkNotNullParameter(leagues, "leagues");
        Intrinsics.checkNotNullParameter(teams, "teams");
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(users, "users");
        return new SearchAllResults(leagues, teams, matches, users);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAllResults)) {
            return false;
        }
        SearchAllResults searchAllResults = (SearchAllResults) other;
        return Intrinsics.areEqual(this.leagues, searchAllResults.leagues) && Intrinsics.areEqual(this.teams, searchAllResults.teams) && Intrinsics.areEqual(this.matches, searchAllResults.matches) && Intrinsics.areEqual(this.users, searchAllResults.users);
    }

    public int hashCode() {
        return (((((this.leagues.hashCode() * 31) + this.teams.hashCode()) * 31) + this.matches.hashCode()) * 31) + this.users.hashCode();
    }

    public String toString() {
        return "SearchAllResults(leagues=" + this.leagues + ", teams=" + this.teams + ", matches=" + this.matches + ", users=" + this.users + ")";
    }

    public SearchAllResults(List<V7LeagueSearchResult> leagues, List<V7TeamSearchResult> teams, List<V7MatchSearchResult> matches, List<V7UserSearchResult> users) {
        Intrinsics.checkNotNullParameter(leagues, "leagues");
        Intrinsics.checkNotNullParameter(teams, "teams");
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(users, "users");
        this.leagues = leagues;
        this.teams = teams;
        this.matches = matches;
        this.users = users;
    }

    public /* synthetic */ SearchAllResults(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4);
    }

    public final List<V7LeagueSearchResult> getLeagues() {
        return this.leagues;
    }

    public final List<V7TeamSearchResult> getTeams() {
        return this.teams;
    }

    public final List<V7MatchSearchResult> getMatches() {
        return this.matches;
    }

    public final List<V7UserSearchResult> getUsers() {
        return this.users;
    }
}
