package org.betup.ui.fragment.user.compose.items;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserBattleUiItem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0012HÆ\u0003J\t\u0010<\u001a\u00020\u0014HÆ\u0003J\t\u0010=\u001a\u00020\u0016HÆ\u0003J©\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010?\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006D"}, d2 = {"Lorg/betup/ui/fragment/user/compose/items/UserBattleUiItem;", "", "id", "", "matchId", "homeTeam", "", "homeTeamLogo", "awayTeam", "awayTeamLogo", "matchTime", "matchDate", "homeScore", "awayScore", "opponentUsername", "opponentAvatar", "battleAmount", "canAccept", "", "state", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "createdBy", "Lorg/betup/ui/fragment/user/compose/items/UserBattleCreator;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLorg/betup/model/remote/entity/challenges/ChallengeState;Lorg/betup/ui/fragment/user/compose/items/UserBattleCreator;)V", "getId", "()J", "getMatchId", "getHomeTeam", "()Ljava/lang/String;", "getHomeTeamLogo", "getAwayTeam", "getAwayTeamLogo", "getMatchTime", "getMatchDate", "getHomeScore", "getAwayScore", "getOpponentUsername", "getOpponentAvatar", "getBattleAmount", "getCanAccept", "()Z", "getState", "()Lorg/betup/model/remote/entity/challenges/ChallengeState;", "getCreatedBy", "()Lorg/betup/ui/fragment/user/compose/items/UserBattleCreator;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserBattleUiItem {
    public static final int $stable = 0;
    private final String awayScore;
    private final String awayTeam;
    private final String awayTeamLogo;
    private final long battleAmount;
    private final boolean canAccept;
    private final UserBattleCreator createdBy;
    private final String homeScore;
    private final String homeTeam;
    private final String homeTeamLogo;
    private final long id;
    private final String matchDate;
    private final long matchId;
    private final String matchTime;
    private final String opponentAvatar;
    private final String opponentUsername;
    private final ChallengeState state;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOpponentUsername() {
        return this.opponentUsername;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOpponentAvatar() {
        return this.opponentAvatar;
    }

    /* renamed from: component13, reason: from getter */
    public final long getBattleAmount() {
        return this.battleAmount;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getCanAccept() {
        return this.canAccept;
    }

    /* renamed from: component15, reason: from getter */
    public final ChallengeState getState() {
        return this.state;
    }

    /* renamed from: component16, reason: from getter */
    public final UserBattleCreator getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMatchTime() {
        return this.matchTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMatchDate() {
        return this.matchDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getHomeScore() {
        return this.homeScore;
    }

    public final UserBattleUiItem copy(long id, long matchId, String homeTeam, String homeTeamLogo, String awayTeam, String awayTeamLogo, String matchTime, String matchDate, String homeScore, String awayScore, String opponentUsername, String opponentAvatar, long battleAmount, boolean canAccept, ChallengeState state, UserBattleCreator createdBy) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(homeTeamLogo, "homeTeamLogo");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(awayTeamLogo, "awayTeamLogo");
        Intrinsics.checkNotNullParameter(matchTime, "matchTime");
        Intrinsics.checkNotNullParameter(matchDate, "matchDate");
        Intrinsics.checkNotNullParameter(homeScore, "homeScore");
        Intrinsics.checkNotNullParameter(awayScore, "awayScore");
        Intrinsics.checkNotNullParameter(opponentUsername, "opponentUsername");
        Intrinsics.checkNotNullParameter(opponentAvatar, "opponentAvatar");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        return new UserBattleUiItem(id, matchId, homeTeam, homeTeamLogo, awayTeam, awayTeamLogo, matchTime, matchDate, homeScore, awayScore, opponentUsername, opponentAvatar, battleAmount, canAccept, state, createdBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBattleUiItem)) {
            return false;
        }
        UserBattleUiItem userBattleUiItem = (UserBattleUiItem) other;
        return this.id == userBattleUiItem.id && this.matchId == userBattleUiItem.matchId && Intrinsics.areEqual(this.homeTeam, userBattleUiItem.homeTeam) && Intrinsics.areEqual(this.homeTeamLogo, userBattleUiItem.homeTeamLogo) && Intrinsics.areEqual(this.awayTeam, userBattleUiItem.awayTeam) && Intrinsics.areEqual(this.awayTeamLogo, userBattleUiItem.awayTeamLogo) && Intrinsics.areEqual(this.matchTime, userBattleUiItem.matchTime) && Intrinsics.areEqual(this.matchDate, userBattleUiItem.matchDate) && Intrinsics.areEqual(this.homeScore, userBattleUiItem.homeScore) && Intrinsics.areEqual(this.awayScore, userBattleUiItem.awayScore) && Intrinsics.areEqual(this.opponentUsername, userBattleUiItem.opponentUsername) && Intrinsics.areEqual(this.opponentAvatar, userBattleUiItem.opponentAvatar) && this.battleAmount == userBattleUiItem.battleAmount && this.canAccept == userBattleUiItem.canAccept && Intrinsics.areEqual(this.state, userBattleUiItem.state) && Intrinsics.areEqual(this.createdBy, userBattleUiItem.createdBy);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.matchId)) * 31) + this.homeTeam.hashCode()) * 31) + this.homeTeamLogo.hashCode()) * 31) + this.awayTeam.hashCode()) * 31) + this.awayTeamLogo.hashCode()) * 31) + this.matchTime.hashCode()) * 31) + this.matchDate.hashCode()) * 31) + this.homeScore.hashCode()) * 31) + this.awayScore.hashCode()) * 31) + this.opponentUsername.hashCode()) * 31) + this.opponentAvatar.hashCode()) * 31) + Long.hashCode(this.battleAmount)) * 31) + Boolean.hashCode(this.canAccept)) * 31) + this.state.hashCode()) * 31) + this.createdBy.hashCode();
    }

    public String toString() {
        return "UserBattleUiItem(id=" + this.id + ", matchId=" + this.matchId + ", homeTeam=" + this.homeTeam + ", homeTeamLogo=" + this.homeTeamLogo + ", awayTeam=" + this.awayTeam + ", awayTeamLogo=" + this.awayTeamLogo + ", matchTime=" + this.matchTime + ", matchDate=" + this.matchDate + ", homeScore=" + this.homeScore + ", awayScore=" + this.awayScore + ", opponentUsername=" + this.opponentUsername + ", opponentAvatar=" + this.opponentAvatar + ", battleAmount=" + this.battleAmount + ", canAccept=" + this.canAccept + ", state=" + this.state + ", createdBy=" + this.createdBy + ")";
    }

    public UserBattleUiItem(long j, long j2, String homeTeam, String homeTeamLogo, String awayTeam, String awayTeamLogo, String matchTime, String matchDate, String homeScore, String awayScore, String opponentUsername, String opponentAvatar, long j3, boolean z, ChallengeState state, UserBattleCreator createdBy) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(homeTeamLogo, "homeTeamLogo");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(awayTeamLogo, "awayTeamLogo");
        Intrinsics.checkNotNullParameter(matchTime, "matchTime");
        Intrinsics.checkNotNullParameter(matchDate, "matchDate");
        Intrinsics.checkNotNullParameter(homeScore, "homeScore");
        Intrinsics.checkNotNullParameter(awayScore, "awayScore");
        Intrinsics.checkNotNullParameter(opponentUsername, "opponentUsername");
        Intrinsics.checkNotNullParameter(opponentAvatar, "opponentAvatar");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        this.id = j;
        this.matchId = j2;
        this.homeTeam = homeTeam;
        this.homeTeamLogo = homeTeamLogo;
        this.awayTeam = awayTeam;
        this.awayTeamLogo = awayTeamLogo;
        this.matchTime = matchTime;
        this.matchDate = matchDate;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.opponentUsername = opponentUsername;
        this.opponentAvatar = opponentAvatar;
        this.battleAmount = j3;
        this.canAccept = z;
        this.state = state;
        this.createdBy = createdBy;
    }

    public /* synthetic */ UserBattleUiItem(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j3, boolean z, ChallengeState challengeState, UserBattleCreator userBattleCreator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, str2, str3, str4, str5, str6, (i & 256) != 0 ? "-" : str7, (i & 512) != 0 ? "-" : str8, str9, str10, j3, (i & 8192) != 0 ? true : z, challengeState, userBattleCreator);
    }

    public final long getId() {
        return this.id;
    }

    public final long getMatchId() {
        return this.matchId;
    }

    public final String getHomeTeam() {
        return this.homeTeam;
    }

    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    public final String getAwayTeam() {
        return this.awayTeam;
    }

    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    public final String getMatchTime() {
        return this.matchTime;
    }

    public final String getMatchDate() {
        return this.matchDate;
    }

    public final String getHomeScore() {
        return this.homeScore;
    }

    public final String getAwayScore() {
        return this.awayScore;
    }

    public final String getOpponentUsername() {
        return this.opponentUsername;
    }

    public final String getOpponentAvatar() {
        return this.opponentAvatar;
    }

    public final long getBattleAmount() {
        return this.battleAmount;
    }

    public final boolean getCanAccept() {
        return this.canAccept;
    }

    public final ChallengeState getState() {
        return this.state;
    }

    public final UserBattleCreator getCreatedBy() {
        return this.createdBy;
    }
}
