package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeDataModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013HÆ\u0003J}\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0011HÖ\u0001J\t\u00107\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeMatch;", "", "id", "", "league", "Lorg/betup/model/remote/entity/challenges/ChallengeLeague;", "awayTeam", "Lorg/betup/model/remote/entity/challenges/ChallengeTeam;", "homeTeam", "sport", "Lorg/betup/model/remote/entity/challenges/ChallengeSport;", "scoreAway", "", "scoreHome", "date", "", "matchState", "", "submatches", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/challenges/ChallengeLeague;Lorg/betup/model/remote/entity/challenges/ChallengeTeam;Lorg/betup/model/remote/entity/challenges/ChallengeTeam;Lorg/betup/model/remote/entity/challenges/ChallengeSport;DDLjava/lang/String;ILjava/util/List;)V", "getId", "()J", "getLeague", "()Lorg/betup/model/remote/entity/challenges/ChallengeLeague;", "getAwayTeam", "()Lorg/betup/model/remote/entity/challenges/ChallengeTeam;", "getHomeTeam", "getSport", "()Lorg/betup/model/remote/entity/challenges/ChallengeSport;", "getScoreAway", "()D", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "()I", "getSubmatches", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChallengeMatch {
    public static final int $stable = 8;

    @SerializedName("away_team")
    private final ChallengeTeam awayTeam;

    @SerializedName("date")
    private final String date;

    @SerializedName("home_team")
    private final ChallengeTeam homeTeam;

    @SerializedName("id")
    private final long id;

    @SerializedName("league")
    private final ChallengeLeague league;

    @SerializedName("matchState")
    private final int matchState;

    @SerializedName("score_away")
    private final double scoreAway;

    @SerializedName("score_home")
    private final double scoreHome;

    @SerializedName("sport")
    private final ChallengeSport sport;

    @SerializedName("submatches")
    private final List<Object> submatches;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<Object> component10() {
        return this.submatches;
    }

    /* renamed from: component2, reason: from getter */
    public final ChallengeLeague getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final ChallengeTeam getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final ChallengeTeam getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final ChallengeSport getSport() {
        return this.sport;
    }

    /* renamed from: component6, reason: from getter */
    public final double getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component7, reason: from getter */
    public final double getScoreHome() {
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

    public final ChallengeMatch copy(long id, ChallengeLeague league, ChallengeTeam awayTeam, ChallengeTeam homeTeam, ChallengeSport sport, double scoreAway, double scoreHome, String date, int matchState, List<? extends Object> submatches) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new ChallengeMatch(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, submatches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeMatch)) {
            return false;
        }
        ChallengeMatch challengeMatch = (ChallengeMatch) other;
        return this.id == challengeMatch.id && Intrinsics.areEqual(this.league, challengeMatch.league) && Intrinsics.areEqual(this.awayTeam, challengeMatch.awayTeam) && Intrinsics.areEqual(this.homeTeam, challengeMatch.homeTeam) && Intrinsics.areEqual(this.sport, challengeMatch.sport) && Double.compare(this.scoreAway, challengeMatch.scoreAway) == 0 && Double.compare(this.scoreHome, challengeMatch.scoreHome) == 0 && Intrinsics.areEqual(this.date, challengeMatch.date) && this.matchState == challengeMatch.matchState && Intrinsics.areEqual(this.submatches, challengeMatch.submatches);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ChallengeLeague challengeLeague = this.league;
        int hashCode2 = (hashCode + (challengeLeague == null ? 0 : challengeLeague.hashCode())) * 31;
        ChallengeTeam challengeTeam = this.awayTeam;
        int hashCode3 = (hashCode2 + (challengeTeam == null ? 0 : challengeTeam.hashCode())) * 31;
        ChallengeTeam challengeTeam2 = this.homeTeam;
        int hashCode4 = (hashCode3 + (challengeTeam2 == null ? 0 : challengeTeam2.hashCode())) * 31;
        ChallengeSport challengeSport = this.sport;
        int hashCode5 = (((((((((hashCode4 + (challengeSport == null ? 0 : challengeSport.hashCode())) * 31) + Double.hashCode(this.scoreAway)) * 31) + Double.hashCode(this.scoreHome)) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.matchState)) * 31;
        List<Object> list = this.submatches;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ChallengeMatch(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", submatches=" + this.submatches + ")";
    }

    public ChallengeMatch(long j, ChallengeLeague challengeLeague, ChallengeTeam challengeTeam, ChallengeTeam challengeTeam2, ChallengeSport challengeSport, double d, double d2, String date, int i, List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.id = j;
        this.league = challengeLeague;
        this.awayTeam = challengeTeam;
        this.homeTeam = challengeTeam2;
        this.sport = challengeSport;
        this.scoreAway = d;
        this.scoreHome = d2;
        this.date = date;
        this.matchState = i;
        this.submatches = list;
    }

    public final long getId() {
        return this.id;
    }

    public final ChallengeLeague getLeague() {
        return this.league;
    }

    public final ChallengeTeam getAwayTeam() {
        return this.awayTeam;
    }

    public final ChallengeTeam getHomeTeam() {
        return this.homeTeam;
    }

    public final ChallengeSport getSport() {
        return this.sport;
    }

    public final double getScoreAway() {
        return this.scoreAway;
    }

    public final double getScoreHome() {
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
}
