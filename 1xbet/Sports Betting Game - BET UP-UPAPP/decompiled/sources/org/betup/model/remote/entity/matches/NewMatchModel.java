package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0099\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\fHÖ\u0001J\t\u0010>\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%¨\u0006?"}, d2 = {"Lorg/betup/model/remote/entity/matches/NewMatchModel;", "", "id", "", "league", "Lorg/betup/model/remote/entity/matches/NewLeagueModel;", "awayTeam", "Lorg/betup/model/remote/entity/matches/NewTeamModel;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/matches/NewSportModel;", "scoreAway", "", "scoreHome", "date", "", "matchState", "submatches", "", "statVarietyId", "currentPeriod", "currentTime", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/NewLeagueModel;Lorg/betup/model/remote/entity/matches/NewTeamModel;Lorg/betup/model/remote/entity/matches/NewTeamModel;Lorg/betup/model/remote/entity/matches/NewSportModel;IILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/matches/NewLeagueModel;", "getAwayTeam", "()Lorg/betup/model/remote/entity/matches/NewTeamModel;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/matches/NewSportModel;", "getScoreAway", "()I", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "getSubmatches", "()Ljava/util/List;", "getStatVarietyId", "getCurrentPeriod", "getCurrentTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchModel {
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

    @SerializedName("stat_variety_id")
    private final String statVarietyId;

    @SerializedName("submatches")
    private final List<Object> submatches;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<Object> component10() {
        return this.submatches;
    }

    /* renamed from: component11, reason: from getter */
    public final String getStatVarietyId() {
        return this.statVarietyId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    /* renamed from: component13, reason: from getter */
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

    public final NewMatchModel copy(long id, NewLeagueModel league, NewTeamModel awayTeam, NewTeamModel homeTeam, NewSportModel sport, int scoreAway, int scoreHome, String date, int matchState, List<? extends Object> submatches, String statVarietyId, String currentPeriod, String currentTime) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        return new NewMatchModel(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, submatches, statVarietyId, currentPeriod, currentTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchModel)) {
            return false;
        }
        NewMatchModel newMatchModel = (NewMatchModel) other;
        return this.id == newMatchModel.id && Intrinsics.areEqual(this.league, newMatchModel.league) && Intrinsics.areEqual(this.awayTeam, newMatchModel.awayTeam) && Intrinsics.areEqual(this.homeTeam, newMatchModel.homeTeam) && Intrinsics.areEqual(this.sport, newMatchModel.sport) && this.scoreAway == newMatchModel.scoreAway && this.scoreHome == newMatchModel.scoreHome && Intrinsics.areEqual(this.date, newMatchModel.date) && this.matchState == newMatchModel.matchState && Intrinsics.areEqual(this.submatches, newMatchModel.submatches) && Intrinsics.areEqual(this.statVarietyId, newMatchModel.statVarietyId) && Intrinsics.areEqual(this.currentPeriod, newMatchModel.currentPeriod) && Intrinsics.areEqual(this.currentTime, newMatchModel.currentTime);
    }

    public int hashCode() {
        int hashCode = ((((((((((((Long.hashCode(this.id) * 31) + this.league.hashCode()) * 31) + this.awayTeam.hashCode()) * 31) + this.homeTeam.hashCode()) * 31) + this.sport.hashCode()) * 31) + Integer.hashCode(this.scoreAway)) * 31) + Integer.hashCode(this.scoreHome)) * 31;
        String str = this.date;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.matchState)) * 31) + this.submatches.hashCode()) * 31;
        String str2 = this.statVarietyId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentPeriod;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentTime;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "NewMatchModel(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", submatches=" + this.submatches + ", statVarietyId=" + this.statVarietyId + ", currentPeriod=" + this.currentPeriod + ", currentTime=" + this.currentTime + ")";
    }

    public NewMatchModel(long j, NewLeagueModel league, NewTeamModel awayTeam, NewTeamModel homeTeam, NewSportModel sport, int i, int i2, String str, int i3, List<? extends Object> submatches, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        this.id = j;
        this.league = league;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.sport = sport;
        this.scoreAway = i;
        this.scoreHome = i2;
        this.date = str;
        this.matchState = i3;
        this.submatches = submatches;
        this.statVarietyId = str2;
        this.currentPeriod = str3;
        this.currentTime = str4;
    }

    public final long getId() {
        return this.id;
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

    public /* synthetic */ NewMatchModel(long j, NewLeagueModel newLeagueModel, NewTeamModel newTeamModel, NewTeamModel newTeamModel2, NewSportModel newSportModel, int i, int i2, String str, int i3, List list, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, newLeagueModel, newTeamModel, newTeamModel2, newSportModel, i, i2, str, i3, (i4 & 512) != 0 ? CollectionsKt.emptyList() : list, (i4 & 1024) != 0 ? null : str2, (i4 & 2048) != 0 ? null : str3, (i4 & 4096) != 0 ? null : str4);
    }

    public final String getStatVarietyId() {
        return this.statVarietyId;
    }

    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final String getCurrentTime() {
        return this.currentTime;
    }
}
