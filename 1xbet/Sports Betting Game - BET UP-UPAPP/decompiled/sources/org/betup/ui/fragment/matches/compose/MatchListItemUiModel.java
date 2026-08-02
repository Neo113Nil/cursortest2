package org.betup.ui.fragment.matches.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchListItemUiModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006-"}, d2 = {"Lorg/betup/ui/fragment/matches/compose/MatchListItemUiModel;", "", "id", "", "homeTeam", "", "awayTeam", "homeTeamLogo", "awayTeamLogo", "startDate", "state", "score", "sportName", "leagueName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getHomeTeam", "()Ljava/lang/String;", "getAwayTeam", "getHomeTeamLogo", "getAwayTeamLogo", "getStartDate", "getState", "getScore", "getSportName", "getLeagueName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchListItemUiModel {
    public static final int $stable = 0;
    private final String awayTeam;
    private final String awayTeamLogo;
    private final String homeTeam;
    private final String homeTeamLogo;
    private final long id;
    private final String leagueName;
    private final String score;
    private final String sportName;
    private final long startDate;
    private final String state;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* renamed from: component6, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component8, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    public final MatchListItemUiModel copy(long id, String homeTeam, String awayTeam, String homeTeamLogo, String awayTeamLogo, long startDate, String state, String score, String sportName, String leagueName) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(leagueName, "leagueName");
        return new MatchListItemUiModel(id, homeTeam, awayTeam, homeTeamLogo, awayTeamLogo, startDate, state, score, sportName, leagueName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchListItemUiModel)) {
            return false;
        }
        MatchListItemUiModel matchListItemUiModel = (MatchListItemUiModel) other;
        return this.id == matchListItemUiModel.id && Intrinsics.areEqual(this.homeTeam, matchListItemUiModel.homeTeam) && Intrinsics.areEqual(this.awayTeam, matchListItemUiModel.awayTeam) && Intrinsics.areEqual(this.homeTeamLogo, matchListItemUiModel.homeTeamLogo) && Intrinsics.areEqual(this.awayTeamLogo, matchListItemUiModel.awayTeamLogo) && this.startDate == matchListItemUiModel.startDate && Intrinsics.areEqual(this.state, matchListItemUiModel.state) && Intrinsics.areEqual(this.score, matchListItemUiModel.score) && Intrinsics.areEqual(this.sportName, matchListItemUiModel.sportName) && Intrinsics.areEqual(this.leagueName, matchListItemUiModel.leagueName);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + this.homeTeam.hashCode()) * 31) + this.awayTeam.hashCode()) * 31;
        String str = this.homeTeamLogo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayTeamLogo;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.startDate)) * 31) + this.state.hashCode()) * 31;
        String str3 = this.score;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.sportName.hashCode()) * 31) + this.leagueName.hashCode();
    }

    public String toString() {
        return "MatchListItemUiModel(id=" + this.id + ", homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", homeTeamLogo=" + this.homeTeamLogo + ", awayTeamLogo=" + this.awayTeamLogo + ", startDate=" + this.startDate + ", state=" + this.state + ", score=" + this.score + ", sportName=" + this.sportName + ", leagueName=" + this.leagueName + ")";
    }

    public MatchListItemUiModel(long j, String homeTeam, String awayTeam, String str, String str2, long j2, String state, String str3, String sportName, String leagueName) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(leagueName, "leagueName");
        this.id = j;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamLogo = str;
        this.awayTeamLogo = str2;
        this.startDate = j2;
        this.state = state;
        this.score = str3;
        this.sportName = sportName;
        this.leagueName = leagueName;
    }

    public final long getId() {
        return this.id;
    }

    public final String getHomeTeam() {
        return this.homeTeam;
    }

    public final String getAwayTeam() {
        return this.awayTeam;
    }

    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final String getState() {
        return this.state;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }
}
