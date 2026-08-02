package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.MatchState;
import org.json.JSONObject;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchShortDetailsDataModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÂ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003Jo\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u000eHÖ\u0001J\t\u00105\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010\r\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u00066"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;", "", "id", "", "league", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsLeagueModel;", "awayTeam", "Lorg/betup/model/remote/entity/matches/details/TeamDataModelShort;", "homeTeam", "sport", "Lorg/json/JSONObject;", "date", "", "matchState", "", "scoreAway", "", "scoreHome", "resultRaw", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/details/MatchDetailsLeagueModel;Lorg/betup/model/remote/entity/matches/details/TeamDataModelShort;Lorg/betup/model/remote/entity/matches/details/TeamDataModelShort;Lorg/json/JSONObject;Ljava/lang/String;IFFLjava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/matches/details/MatchDetailsLeagueModel;", "getAwayTeam", "()Lorg/betup/model/remote/entity/matches/details/TeamDataModelShort;", "getHomeTeam", "getSport", "()Lorg/json/JSONObject;", "getDate", "()Ljava/lang/String;", "getScoreAway", "()F", "getScoreHome", "getResultRaw", "getMatchState", "Lorg/betup/model/remote/entity/matches/MatchState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MatchShortDetailsDataModel {
    public static final int $stable = 8;

    @SerializedName("away_team")
    private final TeamDataModelShort awayTeam;

    @SerializedName("date")
    private final String date;

    @SerializedName("home_team")
    private final TeamDataModelShort homeTeam;

    @SerializedName("id")
    private final long id;

    @SerializedName("league")
    private final MatchDetailsLeagueModel league;

    @SerializedName("matchState")
    @Expose
    private int matchState;

    @SerializedName("result_raw")
    private final String resultRaw;

    @SerializedName("score_away")
    private final float scoreAway;

    @SerializedName("score_home")
    private final float scoreHome;

    @SerializedName("sport")
    private final JSONObject sport;

    /* renamed from: component7, reason: from getter */
    private final int getMatchState() {
        return this.matchState;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getResultRaw() {
        return this.resultRaw;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchDetailsLeagueModel getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final TeamDataModelShort getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final TeamDataModelShort getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final JSONObject getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component8, reason: from getter */
    public final float getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component9, reason: from getter */
    public final float getScoreHome() {
        return this.scoreHome;
    }

    public final MatchShortDetailsDataModel copy(long id, MatchDetailsLeagueModel league, TeamDataModelShort awayTeam, TeamDataModelShort homeTeam, JSONObject sport, String date, int matchState, float scoreAway, float scoreHome, String resultRaw) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(date, "date");
        return new MatchShortDetailsDataModel(id, league, awayTeam, homeTeam, sport, date, matchState, scoreAway, scoreHome, resultRaw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchShortDetailsDataModel)) {
            return false;
        }
        MatchShortDetailsDataModel matchShortDetailsDataModel = (MatchShortDetailsDataModel) other;
        return this.id == matchShortDetailsDataModel.id && Intrinsics.areEqual(this.league, matchShortDetailsDataModel.league) && Intrinsics.areEqual(this.awayTeam, matchShortDetailsDataModel.awayTeam) && Intrinsics.areEqual(this.homeTeam, matchShortDetailsDataModel.homeTeam) && Intrinsics.areEqual(this.sport, matchShortDetailsDataModel.sport) && Intrinsics.areEqual(this.date, matchShortDetailsDataModel.date) && this.matchState == matchShortDetailsDataModel.matchState && Float.compare(this.scoreAway, matchShortDetailsDataModel.scoreAway) == 0 && Float.compare(this.scoreHome, matchShortDetailsDataModel.scoreHome) == 0 && Intrinsics.areEqual(this.resultRaw, matchShortDetailsDataModel.resultRaw);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((Long.hashCode(this.id) * 31) + this.league.hashCode()) * 31) + this.awayTeam.hashCode()) * 31) + this.homeTeam.hashCode()) * 31) + this.sport.hashCode()) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.matchState)) * 31) + Float.hashCode(this.scoreAway)) * 31) + Float.hashCode(this.scoreHome)) * 31;
        String str = this.resultRaw;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MatchShortDetailsDataModel(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", date=" + this.date + ", matchState=" + this.matchState + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", resultRaw=" + this.resultRaw + ")";
    }

    public MatchShortDetailsDataModel(long j, MatchDetailsLeagueModel league, TeamDataModelShort awayTeam, TeamDataModelShort homeTeam, JSONObject sport, String date, int i, float f, float f2, String str) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(date, "date");
        this.id = j;
        this.league = league;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.sport = sport;
        this.date = date;
        this.matchState = i;
        this.scoreAway = f;
        this.scoreHome = f2;
        this.resultRaw = str;
    }

    public /* synthetic */ MatchShortDetailsDataModel(long j, MatchDetailsLeagueModel matchDetailsLeagueModel, TeamDataModelShort teamDataModelShort, TeamDataModelShort teamDataModelShort2, JSONObject jSONObject, String str, int i, float f, float f2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, matchDetailsLeagueModel, teamDataModelShort, teamDataModelShort2, jSONObject, str, i, f, f2, (i2 & 512) != 0 ? null : str2);
    }

    public final long getId() {
        return this.id;
    }

    public final MatchDetailsLeagueModel getLeague() {
        return this.league;
    }

    public final TeamDataModelShort getAwayTeam() {
        return this.awayTeam;
    }

    public final TeamDataModelShort getHomeTeam() {
        return this.homeTeam;
    }

    public final JSONObject getSport() {
        return this.sport;
    }

    public final String getDate() {
        return this.date;
    }

    public final float getScoreAway() {
        return this.scoreAway;
    }

    public final float getScoreHome() {
        return this.scoreHome;
    }

    public final String getResultRaw() {
        return this.resultRaw;
    }

    public final MatchState getMatchState() {
        MatchState fromInt = MatchState.fromInt(this.matchState);
        Intrinsics.checkNotNullExpressionValue(fromInt, "fromInt(...)");
        return fromInt;
    }
}
