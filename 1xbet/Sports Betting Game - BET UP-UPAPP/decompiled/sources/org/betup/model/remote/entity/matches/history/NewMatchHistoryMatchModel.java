package org.betup.model.remote.entity.matches.history;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchHistoryMatchModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryMatchModel;", "", "homeTeam", "Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryTeamModel;", "awayTeam", "date", "", "homeScore", "", "awayScore", "matchId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryTeamModel;Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryTeamModel;Ljava/lang/String;IIJ)V", "getHomeTeam", "()Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryTeamModel;", "getAwayTeam", "getDate", "()Ljava/lang/String;", "getHomeScore", "()I", "getAwayScore", "getMatchId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchHistoryMatchModel {
    public static final int $stable = 0;

    @SerializedName("awayScore")
    private final int awayScore;

    @SerializedName("awayTeam")
    private final NewMatchHistoryTeamModel awayTeam;

    @SerializedName("date")
    private final String date;

    @SerializedName("homeScore")
    private final int homeScore;

    @SerializedName("homeTeam")
    private final NewMatchHistoryTeamModel homeTeam;

    @SerializedName("matchId")
    private final long matchId;

    public static /* synthetic */ NewMatchHistoryMatchModel copy$default(NewMatchHistoryMatchModel newMatchHistoryMatchModel, NewMatchHistoryTeamModel newMatchHistoryTeamModel, NewMatchHistoryTeamModel newMatchHistoryTeamModel2, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            newMatchHistoryTeamModel = newMatchHistoryMatchModel.homeTeam;
        }
        if ((i3 & 2) != 0) {
            newMatchHistoryTeamModel2 = newMatchHistoryMatchModel.awayTeam;
        }
        NewMatchHistoryTeamModel newMatchHistoryTeamModel3 = newMatchHistoryTeamModel2;
        if ((i3 & 4) != 0) {
            str = newMatchHistoryMatchModel.date;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            i = newMatchHistoryMatchModel.homeScore;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = newMatchHistoryMatchModel.awayScore;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            j = newMatchHistoryMatchModel.matchId;
        }
        return newMatchHistoryMatchModel.copy(newMatchHistoryTeamModel, newMatchHistoryTeamModel3, str2, i4, i5, j);
    }

    /* renamed from: component1, reason: from getter */
    public final NewMatchHistoryTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    /* renamed from: component2, reason: from getter */
    public final NewMatchHistoryTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHomeScore() {
        return this.homeScore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component6, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    public final NewMatchHistoryMatchModel copy(NewMatchHistoryTeamModel homeTeam, NewMatchHistoryTeamModel awayTeam, String date, int homeScore, int awayScore, long matchId) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(date, "date");
        return new NewMatchHistoryMatchModel(homeTeam, awayTeam, date, homeScore, awayScore, matchId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchHistoryMatchModel)) {
            return false;
        }
        NewMatchHistoryMatchModel newMatchHistoryMatchModel = (NewMatchHistoryMatchModel) other;
        return Intrinsics.areEqual(this.homeTeam, newMatchHistoryMatchModel.homeTeam) && Intrinsics.areEqual(this.awayTeam, newMatchHistoryMatchModel.awayTeam) && Intrinsics.areEqual(this.date, newMatchHistoryMatchModel.date) && this.homeScore == newMatchHistoryMatchModel.homeScore && this.awayScore == newMatchHistoryMatchModel.awayScore && this.matchId == newMatchHistoryMatchModel.matchId;
    }

    public int hashCode() {
        return (((((((((this.homeTeam.hashCode() * 31) + this.awayTeam.hashCode()) * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.homeScore)) * 31) + Integer.hashCode(this.awayScore)) * 31) + Long.hashCode(this.matchId);
    }

    public String toString() {
        return "NewMatchHistoryMatchModel(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", date=" + this.date + ", homeScore=" + this.homeScore + ", awayScore=" + this.awayScore + ", matchId=" + this.matchId + ")";
    }

    public NewMatchHistoryMatchModel(NewMatchHistoryTeamModel homeTeam, NewMatchHistoryTeamModel awayTeam, String date, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(homeTeam, "homeTeam");
        Intrinsics.checkNotNullParameter(awayTeam, "awayTeam");
        Intrinsics.checkNotNullParameter(date, "date");
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.date = date;
        this.homeScore = i;
        this.awayScore = i2;
        this.matchId = j;
    }

    public final NewMatchHistoryTeamModel getHomeTeam() {
        return this.homeTeam;
    }

    public final NewMatchHistoryTeamModel getAwayTeam() {
        return this.awayTeam;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getHomeScore() {
        return this.homeScore;
    }

    public final int getAwayScore() {
        return this.awayScore;
    }

    public final long getMatchId() {
        return this.matchId;
    }
}
