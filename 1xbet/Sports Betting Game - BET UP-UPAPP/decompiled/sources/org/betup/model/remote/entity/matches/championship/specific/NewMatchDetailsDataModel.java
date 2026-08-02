package org.betup.model.remote.entity.matches.championship.specific;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchesForLeagueModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u008b\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\fHÖ\u0001J\t\u0010;\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$¨\u0006<"}, d2 = {"Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchDetailsDataModel;", "", "id", "", "league", "Lorg/betup/model/remote/entity/matches/championship/specific/NewLeagueModel;", "awayTeam", "Lorg/betup/model/remote/entity/matches/championship/specific/NewTeamModel;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/matches/championship/specific/NewSportModel;", "scoreAway", "", "scoreHome", "date", "", "matchState", "submatches", "", "currentPeriod", "currentTime", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/championship/specific/NewLeagueModel;Lorg/betup/model/remote/entity/matches/championship/specific/NewTeamModel;Lorg/betup/model/remote/entity/matches/championship/specific/NewTeamModel;Lorg/betup/model/remote/entity/matches/championship/specific/NewSportModel;IILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewLeagueModel;", "getAwayTeam", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewTeamModel;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewSportModel;", "getScoreAway", "()I", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "getSubmatches", "()Ljava/util/List;", "getCurrentPeriod", "getCurrentTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchDetailsDataModel {
    public static final int $stable = 8;

    @SerializedName("away_team")
    private final NewTeamModel awayTeam;

    @SerializedName("current_period")
    private final String currentPeriod;

    @SerializedName("current_time")
    private final String currentTime;

    @SerializedName("date")
    private final String date;

    @SerializedName("home_team")
    private final NewTeamModel homeTeam;

    @SerializedName("id")
    private final long id;

    @SerializedName("league")
    private final NewLeagueModel league;

    @SerializedName("matchState")
    private final int matchState;

    @SerializedName("score_away")
    private final int scoreAway;

    @SerializedName("score_home")
    private final int scoreHome;

    @SerializedName("sport")
    private final NewSportModel sport;

    @SerializedName("submatches")
    private final List<Object> submatches;

    public NewMatchDetailsDataModel() {
        this(0L, null, null, null, null, 0, 0, null, 0, null, null, null, 4095, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<Object> component10() {
        return this.submatches;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: component2, reason: from getter */
    public final NewLeagueModel getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final NewTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final NewTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final NewSportModel getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final int getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component7, reason: from getter */
    public final int getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMatchState() {
        return this.matchState;
    }

    public final NewMatchDetailsDataModel copy(long id, NewLeagueModel league, NewTeamModel awayTeam, NewTeamModel homeTeam, NewSportModel sport, int scoreAway, int scoreHome, String date, int matchState, List<? extends Object> submatches, String currentPeriod, String currentTime) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        return new NewMatchDetailsDataModel(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, submatches, currentPeriod, currentTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchDetailsDataModel)) {
            return false;
        }
        NewMatchDetailsDataModel newMatchDetailsDataModel = (NewMatchDetailsDataModel) other;
        return this.id == newMatchDetailsDataModel.id && Intrinsics.areEqual(this.league, newMatchDetailsDataModel.league) && Intrinsics.areEqual(this.awayTeam, newMatchDetailsDataModel.awayTeam) && Intrinsics.areEqual(this.homeTeam, newMatchDetailsDataModel.homeTeam) && Intrinsics.areEqual(this.sport, newMatchDetailsDataModel.sport) && this.scoreAway == newMatchDetailsDataModel.scoreAway && this.scoreHome == newMatchDetailsDataModel.scoreHome && Intrinsics.areEqual(this.date, newMatchDetailsDataModel.date) && this.matchState == newMatchDetailsDataModel.matchState && Intrinsics.areEqual(this.submatches, newMatchDetailsDataModel.submatches) && Intrinsics.areEqual(this.currentPeriod, newMatchDetailsDataModel.currentPeriod) && Intrinsics.areEqual(this.currentTime, newMatchDetailsDataModel.currentTime);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((Long.hashCode(this.id) * 31) + this.league.hashCode()) * 31) + this.awayTeam.hashCode()) * 31) + this.homeTeam.hashCode()) * 31) + this.sport.hashCode()) * 31) + Integer.hashCode(this.scoreAway)) * 31) + Integer.hashCode(this.scoreHome)) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.matchState)) * 31) + this.submatches.hashCode()) * 31;
        String str = this.currentPeriod;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentTime;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NewMatchDetailsDataModel(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", submatches=" + this.submatches + ", currentPeriod=" + this.currentPeriod + ", currentTime=" + this.currentTime + ")";
    }

    public NewMatchDetailsDataModel(long j, NewLeagueModel league, NewTeamModel awayTeam, NewTeamModel homeTeam, NewSportModel sport, int i, int i2, String date, int i3, List<? extends Object> submatches, String str, String str2) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        this.id = j;
        this.league = league;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.sport = sport;
        this.scoreAway = i;
        this.scoreHome = i2;
        this.date = date;
        this.matchState = i3;
        this.submatches = submatches;
        this.currentPeriod = str;
        this.currentTime = str2;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ NewMatchDetailsDataModel(long j, NewLeagueModel newLeagueModel, NewTeamModel newTeamModel, NewTeamModel newTeamModel2, NewSportModel newSportModel, int i, int i2, String str, int i3, List list, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? new NewLeagueModel(0, null, null, 7, null) : newLeagueModel, (i4 & 4) != 0 ? new NewTeamModel(0, null, null, 7, null) : newTeamModel, (i4 & 8) != 0 ? new NewTeamModel(0, null, null, 7, null) : newTeamModel2, (i4 & 16) != 0 ? new NewSportModel(0, null, null, null, null, 31, null) : newSportModel, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? "" : str, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? CollectionsKt.emptyList() : list, (i4 & 1024) != 0 ? null : str2, (i4 & 2048) == 0 ? str3 : null);
    }

    public final NewLeagueModel getLeague() {
        return this.league;
    }

    public final NewTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    public final NewTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    public final NewSportModel getSport() {
        return this.sport;
    }

    public final int getScoreAway() {
        return this.scoreAway;
    }

    public final int getScoreHome() {
        return this.scoreHome;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getMatchState() {
        return this.matchState;
    }

    public final List<Object> getSubmatches() {
        return this.submatches;
    }

    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final String getCurrentTime() {
        return this.currentTime;
    }
}
