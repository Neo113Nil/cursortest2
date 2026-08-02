package org.betup.ui.fragment.matches.details.compose.tabs.statistics.items;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchStatisticsUiSingleItem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatisticsUiSingleItem;", "", "name", "", "teams", "Lkotlin/Pair;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatisticsUiTeamItem;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lkotlin/Pair;)V", "getName", "()Ljava/lang/String;", "getTeams", "()Lkotlin/Pair;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchStatisticsUiSingleItem {
    public static final int $stable = 0;
    private final String name;
    private final Pair<MatchStatisticsUiTeamItem, MatchStatisticsUiTeamItem> teams;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchStatisticsUiSingleItem copy$default(MatchStatisticsUiSingleItem matchStatisticsUiSingleItem, String str, Pair pair, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchStatisticsUiSingleItem.name;
        }
        if ((i & 2) != 0) {
            pair = matchStatisticsUiSingleItem.teams;
        }
        return matchStatisticsUiSingleItem.copy(str, pair);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Pair<MatchStatisticsUiTeamItem, MatchStatisticsUiTeamItem> component2() {
        return this.teams;
    }

    public final MatchStatisticsUiSingleItem copy(String name, Pair<MatchStatisticsUiTeamItem, MatchStatisticsUiTeamItem> teams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(teams, "teams");
        return new MatchStatisticsUiSingleItem(name, teams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchStatisticsUiSingleItem)) {
            return false;
        }
        MatchStatisticsUiSingleItem matchStatisticsUiSingleItem = (MatchStatisticsUiSingleItem) other;
        return Intrinsics.areEqual(this.name, matchStatisticsUiSingleItem.name) && Intrinsics.areEqual(this.teams, matchStatisticsUiSingleItem.teams);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.teams.hashCode();
    }

    public String toString() {
        return "MatchStatisticsUiSingleItem(name=" + this.name + ", teams=" + this.teams + ")";
    }

    public MatchStatisticsUiSingleItem(String name, Pair<MatchStatisticsUiTeamItem, MatchStatisticsUiTeamItem> teams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(teams, "teams");
        this.name = name;
        this.teams = teams;
    }

    public final String getName() {
        return this.name;
    }

    public final Pair<MatchStatisticsUiTeamItem, MatchStatisticsUiTeamItem> getTeams() {
        return this.teams;
    }
}
