package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.teams.NewTeam;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J¤\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\fHÖ\u0001J\t\u0010A\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%¨\u0006B"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;", "", "id", "", "league", "Lorg/betup/model/remote/entity/leagues/NewLeague;", "awayTeam", "Lorg/betup/model/remote/entity/teams/NewTeam;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/sports/NewSport;", "scoreAway", "", "scoreHome", "date", "", "matchState", "submatches", "", "statVarietyId", "currentPeriod", "currentTime", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/leagues/NewLeague;Lorg/betup/model/remote/entity/teams/NewTeam;Lorg/betup/model/remote/entity/teams/NewTeam;Lorg/betup/model/remote/entity/sports/NewSport;IILjava/lang/String;ILjava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/leagues/NewLeague;", "getAwayTeam", "()Lorg/betup/model/remote/entity/teams/NewTeam;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/sports/NewSport;", "getScoreAway", "()I", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "getSubmatches", "()Ljava/util/List;", "getStatVarietyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentPeriod", "getCurrentTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(JLorg/betup/model/remote/entity/leagues/NewLeague;Lorg/betup/model/remote/entity/teams/NewTeam;Lorg/betup/model/remote/entity/teams/NewTeam;Lorg/betup/model/remote/entity/sports/NewSport;IILjava/lang/String;ILjava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionMatchInfoModel {
    public static final int $stable = 8;

    @SerializedName("away_team")
    private final NewTeam awayTeam;

    @SerializedName("current_period")
    private final String currentPeriod;

    @SerializedName("current_time")
    private final String currentTime;

    @SerializedName("date")
    private final String date;

    @SerializedName("home_team")
    private final NewTeam homeTeam;

    @SerializedName("id")
    private final long id;

    @SerializedName("league")
    private final NewLeague league;

    @SerializedName("matchState")
    private final int matchState;

    @SerializedName("score_away")
    private final int scoreAway;

    @SerializedName("score_home")
    private final int scoreHome;

    @SerializedName("sport")
    private final NewSport sport;

    @SerializedName("stat_variety_id")
    private final Long statVarietyId;

    @SerializedName("submatches")
    private final List<Object> submatches;

    public CompetitionMatchInfoModel() {
        this(0L, null, null, null, null, 0, 0, null, 0, null, null, null, null, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<Object> component10() {
        return this.submatches;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getStatVarietyId() {
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
    public final NewLeague getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final NewTeam getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final NewTeam getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final NewSport getSport() {
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

    public final CompetitionMatchInfoModel copy(long id, NewLeague league, NewTeam awayTeam, NewTeam homeTeam, NewSport sport, int scoreAway, int scoreHome, String date, int matchState, List<? extends Object> submatches, Long statVarietyId, String currentPeriod, String currentTime) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        return new CompetitionMatchInfoModel(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, submatches, statVarietyId, currentPeriod, currentTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionMatchInfoModel)) {
            return false;
        }
        CompetitionMatchInfoModel competitionMatchInfoModel = (CompetitionMatchInfoModel) other;
        return this.id == competitionMatchInfoModel.id && Intrinsics.areEqual(this.league, competitionMatchInfoModel.league) && Intrinsics.areEqual(this.awayTeam, competitionMatchInfoModel.awayTeam) && Intrinsics.areEqual(this.homeTeam, competitionMatchInfoModel.homeTeam) && Intrinsics.areEqual(this.sport, competitionMatchInfoModel.sport) && this.scoreAway == competitionMatchInfoModel.scoreAway && this.scoreHome == competitionMatchInfoModel.scoreHome && Intrinsics.areEqual(this.date, competitionMatchInfoModel.date) && this.matchState == competitionMatchInfoModel.matchState && Intrinsics.areEqual(this.submatches, competitionMatchInfoModel.submatches) && Intrinsics.areEqual(this.statVarietyId, competitionMatchInfoModel.statVarietyId) && Intrinsics.areEqual(this.currentPeriod, competitionMatchInfoModel.currentPeriod) && Intrinsics.areEqual(this.currentTime, competitionMatchInfoModel.currentTime);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        NewLeague newLeague = this.league;
        int hashCode2 = (hashCode + (newLeague == null ? 0 : newLeague.hashCode())) * 31;
        NewTeam newTeam = this.awayTeam;
        int hashCode3 = (hashCode2 + (newTeam == null ? 0 : newTeam.hashCode())) * 31;
        NewTeam newTeam2 = this.homeTeam;
        int hashCode4 = (hashCode3 + (newTeam2 == null ? 0 : newTeam2.hashCode())) * 31;
        NewSport newSport = this.sport;
        int hashCode5 = (((((((((((hashCode4 + (newSport == null ? 0 : newSport.hashCode())) * 31) + Integer.hashCode(this.scoreAway)) * 31) + Integer.hashCode(this.scoreHome)) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.matchState)) * 31) + this.submatches.hashCode()) * 31;
        Long l = this.statVarietyId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.currentPeriod;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentTime;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CompetitionMatchInfoModel(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", submatches=" + this.submatches + ", statVarietyId=" + this.statVarietyId + ", currentPeriod=" + this.currentPeriod + ", currentTime=" + this.currentTime + ")";
    }

    public CompetitionMatchInfoModel(long j, NewLeague newLeague, NewTeam newTeam, NewTeam newTeam2, NewSport newSport, int i, int i2, String date, int i3, List<? extends Object> submatches, Long l, String str, String str2) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        this.id = j;
        this.league = newLeague;
        this.awayTeam = newTeam;
        this.homeTeam = newTeam2;
        this.sport = newSport;
        this.scoreAway = i;
        this.scoreHome = i2;
        this.date = date;
        this.matchState = i3;
        this.submatches = submatches;
        this.statVarietyId = l;
        this.currentPeriod = str;
        this.currentTime = str2;
    }

    public final long getId() {
        return this.id;
    }

    public final NewLeague getLeague() {
        return this.league;
    }

    public final NewTeam getAwayTeam() {
        return this.awayTeam;
    }

    public final NewTeam getHomeTeam() {
        return this.homeTeam;
    }

    public final NewSport getSport() {
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

    public /* synthetic */ CompetitionMatchInfoModel(long j, NewLeague newLeague, NewTeam newTeam, NewTeam newTeam2, NewSport newSport, int i, int i2, String str, int i3, List list, Long l, String str2, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? null : newLeague, (i4 & 4) != 0 ? null : newTeam, (i4 & 8) != 0 ? null : newTeam2, (i4 & 16) != 0 ? null : newSport, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? "" : str, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? CollectionsKt.emptyList() : list, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : str2, (i4 & 4096) == 0 ? str3 : null);
    }

    public final int getMatchState() {
        return this.matchState;
    }

    public final List<Object> getSubmatches() {
        return this.submatches;
    }

    public final Long getStatVarietyId() {
        return this.statVarietyId;
    }

    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final String getCurrentTime() {
        return this.currentTime;
    }
}
