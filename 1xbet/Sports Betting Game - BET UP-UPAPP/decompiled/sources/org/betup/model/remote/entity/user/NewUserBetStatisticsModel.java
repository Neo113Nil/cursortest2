package org.betup.model.remote.entity.user;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBetStatisticsModel.kt */
@JsonAdapter(NewUserBetStatisticsModelDeserializer.class)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0011HÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u0014HÆ\u0003J\t\u0010;\u001a\u00020\u0014HÆ\u0003J©\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*¨\u0006B"}, d2 = {"Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "", "allBets", "", "returned", "pending", "won", "lost", "sold", "canceled", "highScore", "", "biggestWin", "biggestLoss", "betWinningStreak", "currentWinStreak", "maxWinningOdds", "", "averageBetAmount", "mostPopularBet", "", "mostProfitableBet", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIIIIIJJJIIDJLjava/lang/String;Ljava/lang/String;)V", "getAllBets", "()I", "getReturned", "getPending", "getWon", "getLost", "getSold", "getCanceled", "getHighScore", "()J", "getBiggestWin", "getBiggestLoss", "getBetWinningStreak", "getCurrentWinStreak", "getMaxWinningOdds", "()D", "getAverageBetAmount", "getMostPopularBet", "()Ljava/lang/String;", "getMostProfitableBet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserBetStatisticsModel {
    public static final int $stable = 0;

    @SerializedName("all_bets")
    private final int allBets;

    @SerializedName("average_bet_amount")
    private final long averageBetAmount;

    @SerializedName("bet_winning_streak")
    private final int betWinningStreak;

    @SerializedName("biggest_loss")
    private final long biggestLoss;

    @SerializedName("biggest_win")
    private final long biggestWin;

    @SerializedName("canceled")
    private final int canceled;

    @SerializedName("current_win_streak")
    private final int currentWinStreak;

    @SerializedName("high_score")
    private final long highScore;

    @SerializedName("lost")
    private final int lost;

    @SerializedName("max_winning_odds")
    private final double maxWinningOdds;

    @SerializedName("most_popular_bet")
    private final String mostPopularBet;

    @SerializedName("most_profitable_bet")
    private final String mostProfitableBet;

    @SerializedName("pending")
    private final int pending;

    @SerializedName("returned")
    private final int returned;

    @SerializedName("sold")
    private final int sold;

    @SerializedName("won")
    private final int won;

    /* renamed from: component1, reason: from getter */
    public final int getAllBets() {
        return this.allBets;
    }

    /* renamed from: component10, reason: from getter */
    public final long getBiggestLoss() {
        return this.biggestLoss;
    }

    /* renamed from: component11, reason: from getter */
    public final int getBetWinningStreak() {
        return this.betWinningStreak;
    }

    /* renamed from: component12, reason: from getter */
    public final int getCurrentWinStreak() {
        return this.currentWinStreak;
    }

    /* renamed from: component13, reason: from getter */
    public final double getMaxWinningOdds() {
        return this.maxWinningOdds;
    }

    /* renamed from: component14, reason: from getter */
    public final long getAverageBetAmount() {
        return this.averageBetAmount;
    }

    /* renamed from: component15, reason: from getter */
    public final String getMostPopularBet() {
        return this.mostPopularBet;
    }

    /* renamed from: component16, reason: from getter */
    public final String getMostProfitableBet() {
        return this.mostProfitableBet;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReturned() {
        return this.returned;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPending() {
        return this.pending;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWon() {
        return this.won;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLost() {
        return this.lost;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSold() {
        return this.sold;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCanceled() {
        return this.canceled;
    }

    /* renamed from: component8, reason: from getter */
    public final long getHighScore() {
        return this.highScore;
    }

    /* renamed from: component9, reason: from getter */
    public final long getBiggestWin() {
        return this.biggestWin;
    }

    public final NewUserBetStatisticsModel copy(int allBets, int returned, int pending, int won, int lost, int sold, int canceled, long highScore, long biggestWin, long biggestLoss, int betWinningStreak, int currentWinStreak, double maxWinningOdds, long averageBetAmount, String mostPopularBet, String mostProfitableBet) {
        Intrinsics.checkNotNullParameter(mostPopularBet, "mostPopularBet");
        Intrinsics.checkNotNullParameter(mostProfitableBet, "mostProfitableBet");
        return new NewUserBetStatisticsModel(allBets, returned, pending, won, lost, sold, canceled, highScore, biggestWin, biggestLoss, betWinningStreak, currentWinStreak, maxWinningOdds, averageBetAmount, mostPopularBet, mostProfitableBet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBetStatisticsModel)) {
            return false;
        }
        NewUserBetStatisticsModel newUserBetStatisticsModel = (NewUserBetStatisticsModel) other;
        return this.allBets == newUserBetStatisticsModel.allBets && this.returned == newUserBetStatisticsModel.returned && this.pending == newUserBetStatisticsModel.pending && this.won == newUserBetStatisticsModel.won && this.lost == newUserBetStatisticsModel.lost && this.sold == newUserBetStatisticsModel.sold && this.canceled == newUserBetStatisticsModel.canceled && this.highScore == newUserBetStatisticsModel.highScore && this.biggestWin == newUserBetStatisticsModel.biggestWin && this.biggestLoss == newUserBetStatisticsModel.biggestLoss && this.betWinningStreak == newUserBetStatisticsModel.betWinningStreak && this.currentWinStreak == newUserBetStatisticsModel.currentWinStreak && Double.compare(this.maxWinningOdds, newUserBetStatisticsModel.maxWinningOdds) == 0 && this.averageBetAmount == newUserBetStatisticsModel.averageBetAmount && Intrinsics.areEqual(this.mostPopularBet, newUserBetStatisticsModel.mostPopularBet) && Intrinsics.areEqual(this.mostProfitableBet, newUserBetStatisticsModel.mostProfitableBet);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.allBets) * 31) + Integer.hashCode(this.returned)) * 31) + Integer.hashCode(this.pending)) * 31) + Integer.hashCode(this.won)) * 31) + Integer.hashCode(this.lost)) * 31) + Integer.hashCode(this.sold)) * 31) + Integer.hashCode(this.canceled)) * 31) + Long.hashCode(this.highScore)) * 31) + Long.hashCode(this.biggestWin)) * 31) + Long.hashCode(this.biggestLoss)) * 31) + Integer.hashCode(this.betWinningStreak)) * 31) + Integer.hashCode(this.currentWinStreak)) * 31) + Double.hashCode(this.maxWinningOdds)) * 31) + Long.hashCode(this.averageBetAmount)) * 31) + this.mostPopularBet.hashCode()) * 31) + this.mostProfitableBet.hashCode();
    }

    public String toString() {
        return "NewUserBetStatisticsModel(allBets=" + this.allBets + ", returned=" + this.returned + ", pending=" + this.pending + ", won=" + this.won + ", lost=" + this.lost + ", sold=" + this.sold + ", canceled=" + this.canceled + ", highScore=" + this.highScore + ", biggestWin=" + this.biggestWin + ", biggestLoss=" + this.biggestLoss + ", betWinningStreak=" + this.betWinningStreak + ", currentWinStreak=" + this.currentWinStreak + ", maxWinningOdds=" + this.maxWinningOdds + ", averageBetAmount=" + this.averageBetAmount + ", mostPopularBet=" + this.mostPopularBet + ", mostProfitableBet=" + this.mostProfitableBet + ")";
    }

    public NewUserBetStatisticsModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, int i8, int i9, double d, long j4, String mostPopularBet, String mostProfitableBet) {
        Intrinsics.checkNotNullParameter(mostPopularBet, "mostPopularBet");
        Intrinsics.checkNotNullParameter(mostProfitableBet, "mostProfitableBet");
        this.allBets = i;
        this.returned = i2;
        this.pending = i3;
        this.won = i4;
        this.lost = i5;
        this.sold = i6;
        this.canceled = i7;
        this.highScore = j;
        this.biggestWin = j2;
        this.biggestLoss = j3;
        this.betWinningStreak = i8;
        this.currentWinStreak = i9;
        this.maxWinningOdds = d;
        this.averageBetAmount = j4;
        this.mostPopularBet = mostPopularBet;
        this.mostProfitableBet = mostProfitableBet;
    }

    public /* synthetic */ NewUserBetStatisticsModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, int i8, int i9, double d, long j4, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, i6, i7, j, j2, j3, i8, (i10 & 2048) != 0 ? 0 : i9, d, j4, str, str2);
    }

    public final int getAllBets() {
        return this.allBets;
    }

    public final int getReturned() {
        return this.returned;
    }

    public final int getPending() {
        return this.pending;
    }

    public final int getWon() {
        return this.won;
    }

    public final int getLost() {
        return this.lost;
    }

    public final int getSold() {
        return this.sold;
    }

    public final int getCanceled() {
        return this.canceled;
    }

    public final long getHighScore() {
        return this.highScore;
    }

    public final long getBiggestWin() {
        return this.biggestWin;
    }

    public final long getBiggestLoss() {
        return this.biggestLoss;
    }

    public final int getBetWinningStreak() {
        return this.betWinningStreak;
    }

    public final int getCurrentWinStreak() {
        return this.currentWinStreak;
    }

    public final double getMaxWinningOdds() {
        return this.maxWinningOdds;
    }

    public final long getAverageBetAmount() {
        return this.averageBetAmount;
    }

    public final String getMostPopularBet() {
        return this.mostPopularBet;
    }

    public final String getMostProfitableBet() {
        return this.mostProfitableBet;
    }
}
