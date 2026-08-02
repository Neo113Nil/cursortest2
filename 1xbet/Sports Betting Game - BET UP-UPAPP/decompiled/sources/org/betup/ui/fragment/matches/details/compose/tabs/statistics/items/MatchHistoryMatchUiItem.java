package org.betup.ui.fragment.matches.details.compose.tabs.statistics.items;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchHistoryMatchUiItem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryMatchUiItem;", "", "homeTeam", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryTeamUiItem;", "awayTeam", "date", "", "homeScore", "", "awayScore", "matchId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryTeamUiItem;Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryTeamUiItem;Ljava/lang/String;IIJ)V", "getHomeTeam", "()Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryTeamUiItem;", "getAwayTeam", "getDate", "()Ljava/lang/String;", "getHomeScore", "()I", "getAwayScore", "getMatchId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchHistoryMatchUiItem {
    public static final int $stable = 0;
    private final int awayScore;
    private final MatchHistoryTeamUiItem awayTeam;
    private final String date;
    private final int homeScore;
    private final MatchHistoryTeamUiItem homeTeam;
    private final long matchId;

    public static /* synthetic */ MatchHistoryMatchUiItem copy$default(MatchHistoryMatchUiItem matchHistoryMatchUiItem, MatchHistoryTeamUiItem matchHistoryTeamUiItem, MatchHistoryTeamUiItem matchHistoryTeamUiItem2, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            matchHistoryTeamUiItem = matchHistoryMatchUiItem.homeTeam;
        }
        if ((i3 & 2) != 0) {
            matchHistoryTeamUiItem2 = matchHistoryMatchUiItem.awayTeam;
        }
        MatchHistoryTeamUiItem matchHistoryTeamUiItem3 = matchHistoryTeamUiItem2;
        if ((i3 & 4) != 0) {
            str = matchHistoryMatchUiItem.date;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            i = matchHistoryMatchUiItem.homeScore;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = matchHistoryMatchUiItem.awayScore;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            j = matchHistoryMatchUiItem.matchId;
        }
        return matchHistoryMatchUiItem.copy(matchHistoryTeamUiItem, matchHistoryTeamUiItem3, str2, i4, i5, j);
    }

    /* renamed from: component1, reason: from getter */
    public final MatchHistoryTeamUiItem getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchHistoryTeamUiItem getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHomeScore() {
        return this.homeScore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component6, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    public final MatchHistoryMatchUiItem copy(MatchHistoryTeamUiItem homeTeam, MatchHistoryTeamUiItem awayTeam, String date, int homeScore, int awayScore, long matchId) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(date, "date");
        return new MatchHistoryMatchUiItem(homeTeam, awayTeam, date, homeScore, awayScore, matchId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchHistoryMatchUiItem)) {
            return false;
        }
        MatchHistoryMatchUiItem matchHistoryMatchUiItem = (MatchHistoryMatchUiItem) other;
        return Intrinsics.areEqual(this.homeTeam, matchHistoryMatchUiItem.homeTeam) && Intrinsics.areEqual(this.awayTeam, matchHistoryMatchUiItem.awayTeam) && Intrinsics.areEqual(this.date, matchHistoryMatchUiItem.date) && this.homeScore == matchHistoryMatchUiItem.homeScore && this.awayScore == matchHistoryMatchUiItem.awayScore && this.matchId == matchHistoryMatchUiItem.matchId;
    }

    public int hashCode() {
        return (((((((((this.homeTeam.hashCode() * 31) + this.awayTeam.hashCode()) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.homeScore)) * 31) + Integer.hashCode(this.awayScore)) * 31) + Long.hashCode(this.matchId);
    }

    public String toString() {
        return "MatchHistoryMatchUiItem(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", date=" + this.date + ", homeScore=" + this.homeScore + ", awayScore=" + this.awayScore + ", matchId=" + this.matchId + ")";
    }

    public MatchHistoryMatchUiItem(MatchHistoryTeamUiItem homeTeam, MatchHistoryTeamUiItem awayTeam, String date, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(date, "date");
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.date = date;
        this.homeScore = i;
        this.awayScore = i2;
        this.matchId = j;
    }

    public final MatchHistoryTeamUiItem getHomeTeam() {
        return this.homeTeam;
    }

    public final MatchHistoryTeamUiItem getAwayTeam() {
        return this.awayTeam;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getHomeScore() {
        return this.homeScore;
    }

    public final int getAwayScore() {
        return this.awayScore;
    }

    public final long getMatchId() {
        return this.matchId;
    }
}
