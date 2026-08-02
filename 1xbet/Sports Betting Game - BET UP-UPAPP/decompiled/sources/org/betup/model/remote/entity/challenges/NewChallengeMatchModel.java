package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jº\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0011HÖ\u0001J\t\u0010G\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(¨\u0006H"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "", "id", "", "league", "Lorg/betup/model/remote/entity/challenges/NewChallengeLeagueModel;", "awayTeam", "Lorg/betup/model/remote/entity/challenges/NewChallengeTeamModel;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/challenges/NewChallengeSportModel;", "scoreAway", "", "scoreHome", "date", "", "matchState", "", "submatches", "", "statVarietyId", "currentPeriod", "currentTime", "resultRaw", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/challenges/NewChallengeLeagueModel;Lorg/betup/model/remote/entity/challenges/NewChallengeTeamModel;Lorg/betup/model/remote/entity/challenges/NewChallengeTeamModel;Lorg/betup/model/remote/entity/challenges/NewChallengeSportModel;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/challenges/NewChallengeLeagueModel;", "getAwayTeam", "()Lorg/betup/model/remote/entity/challenges/NewChallengeTeamModel;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/challenges/NewChallengeSportModel;", "getScoreAway", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubmatches", "()Ljava/util/List;", "getStatVarietyId", "()Ljava/lang/Object;", "getCurrentPeriod", "getCurrentTime", "getResultRaw", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(JLorg/betup/model/remote/entity/challenges/NewChallengeLeagueModel;Lorg/betup/model/remote/entity/challenges/NewChallengeTeamModel;Lorg/betup/model/remote/entity/challenges/NewChallengeTeamModel;Lorg/betup/model/remote/entity/challenges/NewChallengeSportModel;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeMatchModel {
    public static final int $stable = 8;

    @SerializedName("away_team")
    private final NewChallengeTeamModel awayTeam;

    @SerializedName("current_period")
    private final Object currentPeriod;

    @SerializedName("current_time")
    private final String currentTime;

    @SerializedName("date")
    private final String date;

    @SerializedName("home_team")
    private final NewChallengeTeamModel homeTeam;

    @SerializedName("id")
    private final long id;

    @SerializedName("league")
    private final NewChallengeLeagueModel league;

    @SerializedName("matchState")
    private final Integer matchState;

    @SerializedName("result_raw")
    private final String resultRaw;

    @SerializedName("score_away")
    private final Double scoreAway;

    @SerializedName("score_home")
    private final Double scoreHome;

    @SerializedName("sport")
    private final NewChallengeSportModel sport;

    @SerializedName("stat_variety_id")
    private final Object statVarietyId;

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
    public final Object getStatVarietyId() {
        return this.statVarietyId;
    }

    /* renamed from: component12, reason: from getter */
    public final Object getCurrentPeriod() {
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
    public final NewChallengeLeagueModel getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final NewChallengeTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final NewChallengeTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final NewChallengeSportModel getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getScoreHome() {
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

    public final NewChallengeMatchModel copy(long id, NewChallengeLeagueModel league, NewChallengeTeamModel awayTeam, NewChallengeTeamModel homeTeam, NewChallengeSportModel sport, Double scoreAway, Double scoreHome, String date, Integer matchState, List<? extends Object> submatches, Object statVarietyId, Object currentPeriod, String currentTime, String resultRaw) {
        return new NewChallengeMatchModel(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, submatches, statVarietyId, currentPeriod, currentTime, resultRaw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeMatchModel)) {
            return false;
        }
        NewChallengeMatchModel newChallengeMatchModel = (NewChallengeMatchModel) other;
        return this.id == newChallengeMatchModel.id && Intrinsics.areEqual(this.league, newChallengeMatchModel.league) && Intrinsics.areEqual(this.awayTeam, newChallengeMatchModel.awayTeam) && Intrinsics.areEqual(this.homeTeam, newChallengeMatchModel.homeTeam) && Intrinsics.areEqual(this.sport, newChallengeMatchModel.sport) && Intrinsics.areEqual((Object) this.scoreAway, (Object) newChallengeMatchModel.scoreAway) && Intrinsics.areEqual((Object) this.scoreHome, (Object) newChallengeMatchModel.scoreHome) && Intrinsics.areEqual(this.date, newChallengeMatchModel.date) && Intrinsics.areEqual(this.matchState, newChallengeMatchModel.matchState) && Intrinsics.areEqual(this.submatches, newChallengeMatchModel.submatches) && Intrinsics.areEqual(this.statVarietyId, newChallengeMatchModel.statVarietyId) && Intrinsics.areEqual(this.currentPeriod, newChallengeMatchModel.currentPeriod) && Intrinsics.areEqual(this.currentTime, newChallengeMatchModel.currentTime) && Intrinsics.areEqual(this.resultRaw, newChallengeMatchModel.resultRaw);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        NewChallengeLeagueModel newChallengeLeagueModel = this.league;
        int hashCode2 = (hashCode + (newChallengeLeagueModel == null ? 0 : newChallengeLeagueModel.hashCode())) * 31;
        NewChallengeTeamModel newChallengeTeamModel = this.awayTeam;
        int hashCode3 = (hashCode2 + (newChallengeTeamModel == null ? 0 : newChallengeTeamModel.hashCode())) * 31;
        NewChallengeTeamModel newChallengeTeamModel2 = this.homeTeam;
        int hashCode4 = (hashCode3 + (newChallengeTeamModel2 == null ? 0 : newChallengeTeamModel2.hashCode())) * 31;
        NewChallengeSportModel newChallengeSportModel = this.sport;
        int hashCode5 = (hashCode4 + (newChallengeSportModel == null ? 0 : newChallengeSportModel.hashCode())) * 31;
        Double d = this.scoreAway;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.scoreHome;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.date;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.matchState;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        List<Object> list = this.submatches;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.statVarietyId;
        int hashCode11 = (hashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.currentPeriod;
        int hashCode12 = (hashCode11 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str2 = this.currentTime;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resultRaw;
        return hashCode13 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeMatchModel(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", submatches=" + this.submatches + ", statVarietyId=" + this.statVarietyId + ", currentPeriod=" + this.currentPeriod + ", currentTime=" + this.currentTime + ", resultRaw=" + this.resultRaw + ")";
    }

    public NewChallengeMatchModel(long j, NewChallengeLeagueModel newChallengeLeagueModel, NewChallengeTeamModel newChallengeTeamModel, NewChallengeTeamModel newChallengeTeamModel2, NewChallengeSportModel newChallengeSportModel, Double d, Double d2, String str, Integer num, List<? extends Object> list, Object obj, Object obj2, String str2, String str3) {
        this.id = j;
        this.league = newChallengeLeagueModel;
        this.awayTeam = newChallengeTeamModel;
        this.homeTeam = newChallengeTeamModel2;
        this.sport = newChallengeSportModel;
        this.scoreAway = d;
        this.scoreHome = d2;
        this.date = str;
        this.matchState = num;
        this.submatches = list;
        this.statVarietyId = obj;
        this.currentPeriod = obj2;
        this.currentTime = str2;
        this.resultRaw = str3;
    }

    public /* synthetic */ NewChallengeMatchModel(long j, NewChallengeLeagueModel newChallengeLeagueModel, NewChallengeTeamModel newChallengeTeamModel, NewChallengeTeamModel newChallengeTeamModel2, NewChallengeSportModel newChallengeSportModel, Double d, Double d2, String str, Integer num, List list, Object obj, Object obj2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, newChallengeLeagueModel, newChallengeTeamModel, newChallengeTeamModel2, newChallengeSportModel, d, d2, str, num, list, obj, obj2, str2, (i & 8192) != 0 ? null : str3);
    }

    public final long getId() {
        return this.id;
    }

    public final NewChallengeLeagueModel getLeague() {
        return this.league;
    }

    public final NewChallengeTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    public final NewChallengeTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    public final NewChallengeSportModel getSport() {
        return this.sport;
    }

    public final Double getScoreAway() {
        return this.scoreAway;
    }

    public final Double getScoreHome() {
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

    public final Object getStatVarietyId() {
        return this.statVarietyId;
    }

    public final Object getCurrentPeriod() {
        return this.currentPeriod;
    }

    public final String getCurrentTime() {
        return this.currentTime;
    }

    public final String getResultRaw() {
        return this.resultRaw;
    }
}
