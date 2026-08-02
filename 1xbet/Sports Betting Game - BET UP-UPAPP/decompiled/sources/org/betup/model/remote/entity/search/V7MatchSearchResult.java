package org.betup.model.remote.entity.search;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7SearchResponse.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010&J\u008a\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&¨\u0006;"}, d2 = {"Lorg/betup/model/remote/entity/search/V7MatchSearchResult;", "", "id", "", "league", "Lorg/betup/model/remote/entity/search/V7SearchLeagueData;", "awayTeam", "Lorg/betup/model/remote/entity/search/V7SearchTeamData;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/search/V7SearchSportData;", "date", "", "matchState", "startDate", "interestFactor", "scoreHome", "", "scoreAway", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILorg/betup/model/remote/entity/search/V7SearchLeagueData;Lorg/betup/model/remote/entity/search/V7SearchTeamData;Lorg/betup/model/remote/entity/search/V7SearchTeamData;Lorg/betup/model/remote/entity/search/V7SearchSportData;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getId", "()I", "getLeague", "()Lorg/betup/model/remote/entity/search/V7SearchLeagueData;", "getAwayTeam", "()Lorg/betup/model/remote/entity/search/V7SearchTeamData;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/search/V7SearchSportData;", "getDate", "()Ljava/lang/String;", "getMatchState", "getStartDate", "getInterestFactor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScoreHome", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScoreAway", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ILorg/betup/model/remote/entity/search/V7SearchLeagueData;Lorg/betup/model/remote/entity/search/V7SearchTeamData;Lorg/betup/model/remote/entity/search/V7SearchTeamData;Lorg/betup/model/remote/entity/search/V7SearchSportData;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lorg/betup/model/remote/entity/search/V7MatchSearchResult;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7MatchSearchResult {
    public static final int $stable = 0;

    @SerializedName("away_team")
    private final V7SearchTeamData awayTeam;

    @SerializedName("date")
    private final String date;

    @SerializedName("home_team")
    private final V7SearchTeamData homeTeam;

    @SerializedName("id")
    private final int id;

    @SerializedName("interest_factor")
    private final Integer interestFactor;

    @SerializedName("league")
    private final V7SearchLeagueData league;

    @SerializedName("matchState")
    private final int matchState;

    @SerializedName("score_away")
    private final Double scoreAway;

    @SerializedName("score_home")
    private final Double scoreHome;

    @SerializedName("sport")
    private final V7SearchSportData sport;

    @SerializedName("startDate")
    private final String startDate;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Double getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component11, reason: from getter */
    public final Double getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component2, reason: from getter */
    public final V7SearchLeagueData getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final V7SearchTeamData getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final V7SearchTeamData getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final V7SearchSportData getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMatchState() {
        return this.matchState;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getInterestFactor() {
        return this.interestFactor;
    }

    public final V7MatchSearchResult copy(int id, V7SearchLeagueData league, V7SearchTeamData awayTeam, V7SearchTeamData homeTeam, V7SearchSportData sport, String date, int matchState, String startDate, Integer interestFactor, Double scoreHome, Double scoreAway) {
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        return new V7MatchSearchResult(id, league, awayTeam, homeTeam, sport, date, matchState, startDate, interestFactor, scoreHome, scoreAway);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7MatchSearchResult)) {
            return false;
        }
        V7MatchSearchResult v7MatchSearchResult = (V7MatchSearchResult) other;
        return this.id == v7MatchSearchResult.id && Intrinsics.areEqual(this.league, v7MatchSearchResult.league) && Intrinsics.areEqual(this.awayTeam, v7MatchSearchResult.awayTeam) && Intrinsics.areEqual(this.homeTeam, v7MatchSearchResult.homeTeam) && Intrinsics.areEqual(this.sport, v7MatchSearchResult.sport) && Intrinsics.areEqual(this.date, v7MatchSearchResult.date) && this.matchState == v7MatchSearchResult.matchState && Intrinsics.areEqual(this.startDate, v7MatchSearchResult.startDate) && Intrinsics.areEqual(this.interestFactor, v7MatchSearchResult.interestFactor) && Intrinsics.areEqual((Object) this.scoreHome, (Object) v7MatchSearchResult.scoreHome) && Intrinsics.areEqual((Object) this.scoreAway, (Object) v7MatchSearchResult.scoreAway);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        V7SearchLeagueData v7SearchLeagueData = this.league;
        int hashCode2 = (((((hashCode + (v7SearchLeagueData == null ? 0 : v7SearchLeagueData.hashCode())) * 31) + this.awayTeam.hashCode()) * 31) + this.homeTeam.hashCode()) * 31;
        V7SearchSportData v7SearchSportData = this.sport;
        int hashCode3 = (hashCode2 + (v7SearchSportData == null ? 0 : v7SearchSportData.hashCode())) * 31;
        String str = this.date;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.matchState)) * 31;
        String str2 = this.startDate;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.interestFactor;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.scoreHome;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.scoreAway;
        return hashCode7 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "V7MatchSearchResult(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", date=" + this.date + ", matchState=" + this.matchState + ", startDate=" + this.startDate + ", interestFactor=" + this.interestFactor + ", scoreHome=" + this.scoreHome + ", scoreAway=" + this.scoreAway + ")";
    }

    public V7MatchSearchResult(int i, V7SearchLeagueData v7SearchLeagueData, V7SearchTeamData awayTeam, V7SearchTeamData homeTeam, V7SearchSportData v7SearchSportData, String str, int i2, String str2, Integer num, Double d, Double d2) {
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        this.id = i;
        this.league = v7SearchLeagueData;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.sport = v7SearchSportData;
        this.date = str;
        this.matchState = i2;
        this.startDate = str2;
        this.interestFactor = num;
        this.scoreHome = d;
        this.scoreAway = d2;
    }

    public /* synthetic */ V7MatchSearchResult(int i, V7SearchLeagueData v7SearchLeagueData, V7SearchTeamData v7SearchTeamData, V7SearchTeamData v7SearchTeamData2, V7SearchSportData v7SearchSportData, String str, int i2, String str2, Integer num, Double d, Double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : v7SearchLeagueData, v7SearchTeamData, v7SearchTeamData2, (i3 & 16) != 0 ? null : v7SearchSportData, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : d, (i3 & 1024) != 0 ? null : d2);
    }

    public final int getId() {
        return this.id;
    }

    public final V7SearchLeagueData getLeague() {
        return this.league;
    }

    public final V7SearchTeamData getAwayTeam() {
        return this.awayTeam;
    }

    public final V7SearchTeamData getHomeTeam() {
        return this.homeTeam;
    }

    public final V7SearchSportData getSport() {
        return this.sport;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getMatchState() {
        return this.matchState;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final Integer getInterestFactor() {
        return this.interestFactor;
    }

    public final Double getScoreHome() {
        return this.scoreHome;
    }

    public final Double getScoreAway() {
        return this.scoreAway;
    }
}
