package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleMatchModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jº\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\fHÖ\u0001J\t\u0010C\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b(\u0010#R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b+\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'¨\u0006D"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewUserBattleMatchModel;", "", "id", "", "league", "Lorg/betup/model/remote/entity/challenges/NewUserBattleLeagueModel;", "awayTeam", "Lorg/betup/model/remote/entity/challenges/NewUserBattleTeamModel;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/challenges/NewUserBattleSportModel;", "scoreAway", "", "scoreHome", "date", "", "matchState", "submatches", "", "statVarietyId", "currentPeriod", "currentTime", "resultRaw", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/challenges/NewUserBattleLeagueModel;Lorg/betup/model/remote/entity/challenges/NewUserBattleTeamModel;Lorg/betup/model/remote/entity/challenges/NewUserBattleTeamModel;Lorg/betup/model/remote/entity/challenges/NewUserBattleSportModel;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/challenges/NewUserBattleLeagueModel;", "getAwayTeam", "()Lorg/betup/model/remote/entity/challenges/NewUserBattleTeamModel;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/challenges/NewUserBattleSportModel;", "getScoreAway", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "getSubmatches", "()Ljava/util/List;", "getStatVarietyId", "getCurrentPeriod", "getCurrentTime", "getResultRaw", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(JLorg/betup/model/remote/entity/challenges/NewUserBattleLeagueModel;Lorg/betup/model/remote/entity/challenges/NewUserBattleTeamModel;Lorg/betup/model/remote/entity/challenges/NewUserBattleTeamModel;Lorg/betup/model/remote/entity/challenges/NewUserBattleSportModel;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/challenges/NewUserBattleMatchModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserBattleMatchModel {
    public static final int $stable = 8;

    @SerializedName("away_team")
    private final NewUserBattleTeamModel awayTeam;

    @SerializedName("current_period")
    private final String currentPeriod;

    @SerializedName("current_time")
    private final String currentTime;

    @SerializedName("date")
    private final String date;

    @SerializedName("home_team")
    private final NewUserBattleTeamModel homeTeam;

    @SerializedName("id")
    private final long id;

    @SerializedName("league")
    private final NewUserBattleLeagueModel league;

    @SerializedName("matchState")
    private final Integer matchState;

    @SerializedName("result_raw")
    private final String resultRaw;

    @SerializedName("score_away")
    private final Integer scoreAway;

    @SerializedName("score_home")
    private final Integer scoreHome;

    @SerializedName("sport")
    private final NewUserBattleSportModel sport;

    @SerializedName("stat_variety_id")
    private final Integer statVarietyId;

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
    public final Integer getStatVarietyId() {
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

    /* renamed from: component14, reason: from getter */
    public final String getResultRaw() {
        return this.resultRaw;
    }

    /* renamed from: component2, reason: from getter */
    public final NewUserBattleLeagueModel getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final NewUserBattleTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final NewUserBattleTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final NewUserBattleSportModel getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getMatchState() {
        return this.matchState;
    }

    public final NewUserBattleMatchModel copy(long id, NewUserBattleLeagueModel league, NewUserBattleTeamModel awayTeam, NewUserBattleTeamModel homeTeam, NewUserBattleSportModel sport, Integer scoreAway, Integer scoreHome, String date, Integer matchState, List<? extends Object> submatches, Integer statVarietyId, String currentPeriod, String currentTime, String resultRaw) {
        return new NewUserBattleMatchModel(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, submatches, statVarietyId, currentPeriod, currentTime, resultRaw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleMatchModel)) {
            return false;
        }
        NewUserBattleMatchModel newUserBattleMatchModel = (NewUserBattleMatchModel) other;
        return this.id == newUserBattleMatchModel.id && Intrinsics.areEqual(this.league, newUserBattleMatchModel.league) && Intrinsics.areEqual(this.awayTeam, newUserBattleMatchModel.awayTeam) && Intrinsics.areEqual(this.homeTeam, newUserBattleMatchModel.homeTeam) && Intrinsics.areEqual(this.sport, newUserBattleMatchModel.sport) && Intrinsics.areEqual(this.scoreAway, newUserBattleMatchModel.scoreAway) && Intrinsics.areEqual(this.scoreHome, newUserBattleMatchModel.scoreHome) && Intrinsics.areEqual(this.date, newUserBattleMatchModel.date) && Intrinsics.areEqual(this.matchState, newUserBattleMatchModel.matchState) && Intrinsics.areEqual(this.submatches, newUserBattleMatchModel.submatches) && Intrinsics.areEqual(this.statVarietyId, newUserBattleMatchModel.statVarietyId) && Intrinsics.areEqual(this.currentPeriod, newUserBattleMatchModel.currentPeriod) && Intrinsics.areEqual(this.currentTime, newUserBattleMatchModel.currentTime) && Intrinsics.areEqual(this.resultRaw, newUserBattleMatchModel.resultRaw);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        NewUserBattleLeagueModel newUserBattleLeagueModel = this.league;
        int hashCode2 = (hashCode + (newUserBattleLeagueModel == null ? 0 : newUserBattleLeagueModel.hashCode())) * 31;
        NewUserBattleTeamModel newUserBattleTeamModel = this.awayTeam;
        int hashCode3 = (hashCode2 + (newUserBattleTeamModel == null ? 0 : newUserBattleTeamModel.hashCode())) * 31;
        NewUserBattleTeamModel newUserBattleTeamModel2 = this.homeTeam;
        int hashCode4 = (hashCode3 + (newUserBattleTeamModel2 == null ? 0 : newUserBattleTeamModel2.hashCode())) * 31;
        NewUserBattleSportModel newUserBattleSportModel = this.sport;
        int hashCode5 = (hashCode4 + (newUserBattleSportModel == null ? 0 : newUserBattleSportModel.hashCode())) * 31;
        Integer num = this.scoreAway;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.scoreHome;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.date;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.matchState;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Object> list = this.submatches;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.statVarietyId;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.currentPeriod;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentTime;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.resultRaw;
        return hashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "NewUserBattleMatchModel(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", submatches=" + this.submatches + ", statVarietyId=" + this.statVarietyId + ", currentPeriod=" + this.currentPeriod + ", currentTime=" + this.currentTime + ", resultRaw=" + this.resultRaw + ")";
    }

    public NewUserBattleMatchModel(long j, NewUserBattleLeagueModel newUserBattleLeagueModel, NewUserBattleTeamModel newUserBattleTeamModel, NewUserBattleTeamModel newUserBattleTeamModel2, NewUserBattleSportModel newUserBattleSportModel, Integer num, Integer num2, String str, Integer num3, List<? extends Object> list, Integer num4, String str2, String str3, String str4) {
        this.id = j;
        this.league = newUserBattleLeagueModel;
        this.awayTeam = newUserBattleTeamModel;
        this.homeTeam = newUserBattleTeamModel2;
        this.sport = newUserBattleSportModel;
        this.scoreAway = num;
        this.scoreHome = num2;
        this.date = str;
        this.matchState = num3;
        this.submatches = list;
        this.statVarietyId = num4;
        this.currentPeriod = str2;
        this.currentTime = str3;
        this.resultRaw = str4;
    }

    public /* synthetic */ NewUserBattleMatchModel(long j, NewUserBattleLeagueModel newUserBattleLeagueModel, NewUserBattleTeamModel newUserBattleTeamModel, NewUserBattleTeamModel newUserBattleTeamModel2, NewUserBattleSportModel newUserBattleSportModel, Integer num, Integer num2, String str, Integer num3, List list, Integer num4, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, newUserBattleLeagueModel, newUserBattleTeamModel, newUserBattleTeamModel2, newUserBattleSportModel, num, num2, str, num3, list, num4, str2, str3, (i & 8192) != 0 ? null : str4);
    }

    public final long getId() {
        return this.id;
    }

    public final NewUserBattleLeagueModel getLeague() {
        return this.league;
    }

    public final NewUserBattleTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    public final NewUserBattleTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    public final NewUserBattleSportModel getSport() {
        return this.sport;
    }

    public final Integer getScoreAway() {
        return this.scoreAway;
    }

    public final Integer getScoreHome() {
        return this.scoreHome;
    }

    public final String getDate() {
        return this.date;
    }

    public final Integer getMatchState() {
        return this.matchState;
    }

    public final List<Object> getSubmatches() {
        return this.submatches;
    }

    public final Integer getStatVarietyId() {
        return this.statVarietyId;
    }

    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final String getCurrentTime() {
        return this.currentTime;
    }

    public final String getResultRaw() {
        return this.resultRaw;
    }
}
