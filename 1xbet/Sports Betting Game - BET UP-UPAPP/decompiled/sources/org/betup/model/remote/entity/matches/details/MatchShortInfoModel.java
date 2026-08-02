package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchShortInfoModel.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\t\u0010E\u001a\u00020\u0011HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00103J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jæ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0011HÖ\u0001J\t\u0010U\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010-R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-¨\u0006V"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "", "id", "", "league", "Lorg/betup/model/remote/entity/matches/details/LeagueModelShort;", "awayTeam", "Lorg/betup/model/remote/entity/matches/details/TeamModelShort;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/matches/details/SportModelShort;", "scoreAway", "", "scoreHome", "date", "", "matchState", "", "submatches", "", "Lorg/betup/model/remote/entity/matches/details/SubmatchModelShort;", "statVarietyId", "statVarietyIds", "participation", "Lorg/betup/model/remote/entity/matches/details/ParticipationModel;", "quizParticipation", "errorCodes", "currentPeriod", "currentTime", "resultRaw", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/details/LeagueModelShort;Lorg/betup/model/remote/entity/matches/details/TeamModelShort;Lorg/betup/model/remote/entity/matches/details/TeamModelShort;Lorg/betup/model/remote/entity/matches/details/SportModelShort;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;ILjava/util/List;Ljava/lang/Long;Ljava/util/List;Lorg/betup/model/remote/entity/matches/details/ParticipationModel;Lorg/betup/model/remote/entity/matches/details/ParticipationModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/matches/details/LeagueModelShort;", "getAwayTeam", "()Lorg/betup/model/remote/entity/matches/details/TeamModelShort;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/matches/details/SportModelShort;", "getScoreAway", "()Ljava/lang/Number;", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "()I", "getSubmatches", "()Ljava/util/List;", "getStatVarietyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatVarietyIds", "getParticipation", "()Lorg/betup/model/remote/entity/matches/details/ParticipationModel;", "getQuizParticipation", "getErrorCodes", "getCurrentPeriod", "getCurrentTime", "getResultRaw", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(JLorg/betup/model/remote/entity/matches/details/LeagueModelShort;Lorg/betup/model/remote/entity/matches/details/TeamModelShort;Lorg/betup/model/remote/entity/matches/details/TeamModelShort;Lorg/betup/model/remote/entity/matches/details/SportModelShort;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;ILjava/util/List;Ljava/lang/Long;Ljava/util/List;Lorg/betup/model/remote/entity/matches/details/ParticipationModel;Lorg/betup/model/remote/entity/matches/details/ParticipationModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MatchShortInfoModel {
    public static final int $stable = 8;

    @SerializedName("away_team")
    private final TeamModelShort awayTeam;

    @SerializedName("current_period")
    private final String currentPeriod;

    @SerializedName("current_time")
    private final String currentTime;

    @SerializedName("date")
    private final String date;

    @SerializedName("errorCodes")
    private final List<Integer> errorCodes;

    @SerializedName("home_team")
    private final TeamModelShort homeTeam;

    @SerializedName("id")
    private final long id;

    @SerializedName("league")
    private final LeagueModelShort league;

    @SerializedName("matchState")
    private final int matchState;

    @SerializedName("participation")
    private final ParticipationModel participation;

    @SerializedName("quizParticipation")
    private final ParticipationModel quizParticipation;

    @SerializedName("result_raw")
    private final String resultRaw;

    @SerializedName("score_away")
    private final Number scoreAway;

    @SerializedName("score_home")
    private final Number scoreHome;

    @SerializedName("sport")
    private final SportModelShort sport;

    @SerializedName("stat_variety_id")
    private final Long statVarietyId;

    @SerializedName("stat_variety_ids")
    private final List<Long> statVarietyIds;

    @SerializedName("submatches")
    private final List<SubmatchModelShort> submatches;

    public MatchShortInfoModel() {
        this(0L, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<SubmatchModelShort> component10() {
        return this.submatches;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getStatVarietyId() {
        return this.statVarietyId;
    }

    public final List<Long> component12() {
        return this.statVarietyIds;
    }

    /* renamed from: component13, reason: from getter */
    public final ParticipationModel getParticipation() {
        return this.participation;
    }

    /* renamed from: component14, reason: from getter */
    public final ParticipationModel getQuizParticipation() {
        return this.quizParticipation;
    }

    public final List<Integer> component15() {
        return this.errorCodes;
    }

    /* renamed from: component16, reason: from getter */
    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: component18, reason: from getter */
    public final String getResultRaw() {
        return this.resultRaw;
    }

    /* renamed from: component2, reason: from getter */
    public final LeagueModelShort getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final TeamModelShort getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final TeamModelShort getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final SportModelShort getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final Number getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component7, reason: from getter */
    public final Number getScoreHome() {
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

    public final MatchShortInfoModel copy(long id, LeagueModelShort league, TeamModelShort awayTeam, TeamModelShort homeTeam, SportModelShort sport, Number scoreAway, Number scoreHome, String date, int matchState, List<SubmatchModelShort> submatches, Long statVarietyId, List<Long> statVarietyIds, ParticipationModel participation, ParticipationModel quizParticipation, List<Integer> errorCodes, String currentPeriod, String currentTime, String resultRaw) {
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(scoreAway, "scoreAway");
        Intrinsics.checkNotNullParameter(scoreHome, "scoreHome");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        Intrinsics.checkNotNullParameter(statVarietyIds, "statVarietyIds");
        Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        return new MatchShortInfoModel(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, submatches, statVarietyId, statVarietyIds, participation, quizParticipation, errorCodes, currentPeriod, currentTime, resultRaw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchShortInfoModel)) {
            return false;
        }
        MatchShortInfoModel matchShortInfoModel = (MatchShortInfoModel) other;
        return this.id == matchShortInfoModel.id && Intrinsics.areEqual(this.league, matchShortInfoModel.league) && Intrinsics.areEqual(this.awayTeam, matchShortInfoModel.awayTeam) && Intrinsics.areEqual(this.homeTeam, matchShortInfoModel.homeTeam) && Intrinsics.areEqual(this.sport, matchShortInfoModel.sport) && Intrinsics.areEqual(this.scoreAway, matchShortInfoModel.scoreAway) && Intrinsics.areEqual(this.scoreHome, matchShortInfoModel.scoreHome) && Intrinsics.areEqual(this.date, matchShortInfoModel.date) && this.matchState == matchShortInfoModel.matchState && Intrinsics.areEqual(this.submatches, matchShortInfoModel.submatches) && Intrinsics.areEqual(this.statVarietyId, matchShortInfoModel.statVarietyId) && Intrinsics.areEqual(this.statVarietyIds, matchShortInfoModel.statVarietyIds) && Intrinsics.areEqual(this.participation, matchShortInfoModel.participation) && Intrinsics.areEqual(this.quizParticipation, matchShortInfoModel.quizParticipation) && Intrinsics.areEqual(this.errorCodes, matchShortInfoModel.errorCodes) && Intrinsics.areEqual(this.currentPeriod, matchShortInfoModel.currentPeriod) && Intrinsics.areEqual(this.currentTime, matchShortInfoModel.currentTime) && Intrinsics.areEqual(this.resultRaw, matchShortInfoModel.resultRaw);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        LeagueModelShort leagueModelShort = this.league;
        int hashCode2 = (hashCode + (leagueModelShort == null ? 0 : leagueModelShort.hashCode())) * 31;
        TeamModelShort teamModelShort = this.awayTeam;
        int hashCode3 = (hashCode2 + (teamModelShort == null ? 0 : teamModelShort.hashCode())) * 31;
        TeamModelShort teamModelShort2 = this.homeTeam;
        int hashCode4 = (((((((((((((hashCode3 + (teamModelShort2 == null ? 0 : teamModelShort2.hashCode())) * 31) + this.sport.hashCode()) * 31) + this.scoreAway.hashCode()) * 31) + this.scoreHome.hashCode()) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.matchState)) * 31) + this.submatches.hashCode()) * 31;
        Long l = this.statVarietyId;
        int hashCode5 = (((hashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.statVarietyIds.hashCode()) * 31;
        ParticipationModel participationModel = this.participation;
        int hashCode6 = (hashCode5 + (participationModel == null ? 0 : participationModel.hashCode())) * 31;
        ParticipationModel participationModel2 = this.quizParticipation;
        int hashCode7 = (((hashCode6 + (participationModel2 == null ? 0 : participationModel2.hashCode())) * 31) + this.errorCodes.hashCode()) * 31;
        String str = this.currentPeriod;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currentTime;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resultRaw;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MatchShortInfoModel(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", submatches=" + this.submatches + ", statVarietyId=" + this.statVarietyId + ", statVarietyIds=" + this.statVarietyIds + ", participation=" + this.participation + ", quizParticipation=" + this.quizParticipation + ", errorCodes=" + this.errorCodes + ", currentPeriod=" + this.currentPeriod + ", currentTime=" + this.currentTime + ", resultRaw=" + this.resultRaw + ")";
    }

    public MatchShortInfoModel(long j, LeagueModelShort leagueModelShort, TeamModelShort teamModelShort, TeamModelShort teamModelShort2, SportModelShort sport, Number scoreAway, Number scoreHome, String date, int i, List<SubmatchModelShort> submatches, Long l, List<Long> statVarietyIds, ParticipationModel participationModel, ParticipationModel participationModel2, List<Integer> errorCodes, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(scoreAway, "scoreAway");
        Intrinsics.checkNotNullParameter(scoreHome, "scoreHome");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(submatches, "submatches");
        Intrinsics.checkNotNullParameter(statVarietyIds, "statVarietyIds");
        Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        this.id = j;
        this.league = leagueModelShort;
        this.awayTeam = teamModelShort;
        this.homeTeam = teamModelShort2;
        this.sport = sport;
        this.scoreAway = scoreAway;
        this.scoreHome = scoreHome;
        this.date = date;
        this.matchState = i;
        this.submatches = submatches;
        this.statVarietyId = l;
        this.statVarietyIds = statVarietyIds;
        this.participation = participationModel;
        this.quizParticipation = participationModel2;
        this.errorCodes = errorCodes;
        this.currentPeriod = str;
        this.currentTime = str2;
        this.resultRaw = str3;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ MatchShortInfoModel(long j, LeagueModelShort leagueModelShort, TeamModelShort teamModelShort, TeamModelShort teamModelShort2, SportModelShort sportModelShort, Number number, Number number2, String str, int i, List list, Long l, List list2, ParticipationModel participationModel, ParticipationModel participationModel2, List list3, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? new LeagueModelShort(0, null, null, 7, null) : leagueModelShort, (i2 & 4) != 0 ? new TeamModelShort(0, null, null, 7, null) : teamModelShort, (i2 & 8) != 0 ? new TeamModelShort(0, null, null, 7, null) : teamModelShort2, (i2 & 16) != 0 ? new SportModelShort(0, null, null, null, null, 31, null) : sportModelShort, (i2 & 32) != 0 ? (Number) 0 : number, (i2 & 64) != 0 ? (Number) 0 : number2, (i2 & 128) != 0 ? "" : str, (i2 & 256) == 0 ? i : 0, (i2 & 512) != 0 ? CollectionsKt.emptyList() : list, (i2 & 1024) != 0 ? null : l, (i2 & 2048) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 4096) != 0 ? null : participationModel, (i2 & 8192) != 0 ? null : participationModel2, (i2 & 16384) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 32768) != 0 ? "" : str2, (i2 & 65536) != 0 ? "" : str3, (i2 & 131072) != 0 ? null : str4);
    }

    public final LeagueModelShort getLeague() {
        return this.league;
    }

    public final TeamModelShort getAwayTeam() {
        return this.awayTeam;
    }

    public final TeamModelShort getHomeTeam() {
        return this.homeTeam;
    }

    public final SportModelShort getSport() {
        return this.sport;
    }

    public final Number getScoreAway() {
        return this.scoreAway;
    }

    public final Number getScoreHome() {
        return this.scoreHome;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getMatchState() {
        return this.matchState;
    }

    public final List<SubmatchModelShort> getSubmatches() {
        return this.submatches;
    }

    public final Long getStatVarietyId() {
        return this.statVarietyId;
    }

    public final List<Long> getStatVarietyIds() {
        return this.statVarietyIds;
    }

    public final ParticipationModel getParticipation() {
        return this.participation;
    }

    public final ParticipationModel getQuizParticipation() {
        return this.quizParticipation;
    }

    public final List<Integer> getErrorCodes() {
        return this.errorCodes;
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
