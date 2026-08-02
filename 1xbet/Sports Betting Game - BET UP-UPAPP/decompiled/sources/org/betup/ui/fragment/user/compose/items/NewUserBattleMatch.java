package org.betup.ui.fragment.user.compose.items;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleUiItem.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0085\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\fHÖ\u0001J\t\u00109\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#¨\u0006:"}, d2 = {"Lorg/betup/ui/fragment/user/compose/items/NewUserBattleMatch;", "", "id", "", "league", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleLeague;", "awayTeam", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleTeam;", "homeTeam", "sport", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleSport;", "scoreAway", "", "scoreHome", "date", "", "matchState", "currentPeriod", "currentTime", "resultRaw", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/ui/fragment/user/compose/items/NewUserBattleLeague;Lorg/betup/ui/fragment/user/compose/items/NewUserBattleTeam;Lorg/betup/ui/fragment/user/compose/items/NewUserBattleTeam;Lorg/betup/ui/fragment/user/compose/items/NewUserBattleSport;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getLeague", "()Lorg/betup/ui/fragment/user/compose/items/NewUserBattleLeague;", "getAwayTeam", "()Lorg/betup/ui/fragment/user/compose/items/NewUserBattleTeam;", "getHomeTeam", "getSport", "()Lorg/betup/ui/fragment/user/compose/items/NewUserBattleSport;", "getScoreAway", "()I", "getScoreHome", "getDate", "()Ljava/lang/String;", "getMatchState", "getCurrentPeriod", "getCurrentTime", "getResultRaw", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NewUserBattleMatch {
    public static final int $stable = 0;
    private final NewUserBattleTeam awayTeam;
    private final String currentPeriod;
    private final String currentTime;
    private final String date;
    private final NewUserBattleTeam homeTeam;
    private final long id;
    private final NewUserBattleLeague league;
    private final int matchState;
    private final String resultRaw;
    private final int scoreAway;
    private final int scoreHome;
    private final NewUserBattleSport sport;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCurrentPeriod() {
        return this.currentPeriod;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: component12, reason: from getter */
    public final String getResultRaw() {
        return this.resultRaw;
    }

    /* renamed from: component2, reason: from getter */
    public final NewUserBattleLeague getLeague() {
        return this.league;
    }

    /* renamed from: component3, reason: from getter */
    public final NewUserBattleTeam getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final NewUserBattleTeam getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final NewUserBattleSport getSport() {
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

    public final NewUserBattleMatch copy(long id, NewUserBattleLeague league, NewUserBattleTeam awayTeam, NewUserBattleTeam homeTeam, NewUserBattleSport sport, int scoreAway, int scoreHome, String date, int matchState, String currentPeriod, String currentTime, String resultRaw) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(currentPeriod, "currentPeriod");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        return new NewUserBattleMatch(id, league, awayTeam, homeTeam, sport, scoreAway, scoreHome, date, matchState, currentPeriod, currentTime, resultRaw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleMatch)) {
            return false;
        }
        NewUserBattleMatch newUserBattleMatch = (NewUserBattleMatch) other;
        return this.id == newUserBattleMatch.id && Intrinsics.areEqual(this.league, newUserBattleMatch.league) && Intrinsics.areEqual(this.awayTeam, newUserBattleMatch.awayTeam) && Intrinsics.areEqual(this.homeTeam, newUserBattleMatch.homeTeam) && Intrinsics.areEqual(this.sport, newUserBattleMatch.sport) && this.scoreAway == newUserBattleMatch.scoreAway && this.scoreHome == newUserBattleMatch.scoreHome && Intrinsics.areEqual(this.date, newUserBattleMatch.date) && this.matchState == newUserBattleMatch.matchState && Intrinsics.areEqual(this.currentPeriod, newUserBattleMatch.currentPeriod) && Intrinsics.areEqual(this.currentTime, newUserBattleMatch.currentTime) && Intrinsics.areEqual(this.resultRaw, newUserBattleMatch.resultRaw);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + this.league.hashCode()) * 31) + this.awayTeam.hashCode()) * 31;
        NewUserBattleTeam newUserBattleTeam = this.homeTeam;
        int hashCode2 = (((((((((((((((hashCode + (newUserBattleTeam == null ? 0 : newUserBattleTeam.hashCode())) * 31) + this.sport.hashCode()) * 31) + Integer.hashCode(this.scoreAway)) * 31) + Integer.hashCode(this.scoreHome)) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.matchState)) * 31) + this.currentPeriod.hashCode()) * 31) + this.currentTime.hashCode()) * 31;
        String str = this.resultRaw;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NewUserBattleMatch(id=" + this.id + ", league=" + this.league + ", awayTeam=" + this.awayTeam + ", homeTeam=" + this.homeTeam + ", sport=" + this.sport + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", date=" + this.date + ", matchState=" + this.matchState + ", currentPeriod=" + this.currentPeriod + ", currentTime=" + this.currentTime + ", resultRaw=" + this.resultRaw + ")";
    }

    public NewUserBattleMatch(long j, NewUserBattleLeague league, NewUserBattleTeam awayTeam, NewUserBattleTeam newUserBattleTeam, NewUserBattleSport sport, int i, int i2, String date, int i3, String currentPeriod, String currentTime, String str) {
        Intrinsics.checkNotNullParameter(league, "league");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(currentPeriod, "currentPeriod");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        this.id = j;
        this.league = league;
        this.awayTeam = awayTeam;
        this.homeTeam = newUserBattleTeam;
        this.sport = sport;
        this.scoreAway = i;
        this.scoreHome = i2;
        this.date = date;
        this.matchState = i3;
        this.currentPeriod = currentPeriod;
        this.currentTime = currentTime;
        this.resultRaw = str;
    }

    public /* synthetic */ NewUserBattleMatch(long j, NewUserBattleLeague newUserBattleLeague, NewUserBattleTeam newUserBattleTeam, NewUserBattleTeam newUserBattleTeam2, NewUserBattleSport newUserBattleSport, int i, int i2, String str, int i3, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, newUserBattleLeague, newUserBattleTeam, newUserBattleTeam2, newUserBattleSport, i, i2, str, i3, str2, str3, (i4 & 2048) != 0 ? null : str4);
    }

    public final long getId() {
        return this.id;
    }

    public final NewUserBattleLeague getLeague() {
        return this.league;
    }

    public final NewUserBattleTeam getAwayTeam() {
        return this.awayTeam;
    }

    public final NewUserBattleTeam getHomeTeam() {
        return this.homeTeam;
    }

    public final NewUserBattleSport getSport() {
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
