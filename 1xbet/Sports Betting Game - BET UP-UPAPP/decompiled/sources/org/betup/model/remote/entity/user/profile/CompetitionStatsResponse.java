package org.betup.model.remote.entity.user.profile;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionStatsResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/user/profile/CompetitionStatsResponse;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "won", "jackpots", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJJ)V", "getEntries", "()J", "getWon", "getJackpots", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionStatsResponse {
    public static final int $stable = 0;

    @SerializedName(RemoteConfigConstants.ResponseFieldKey.ENTRIES)
    private final long entries;

    @SerializedName("jackpots")
    private final long jackpots;

    @SerializedName("won")
    private final long won;

    public CompetitionStatsResponse() {
        this(0L, 0L, 0L, 7, null);
    }

    public static /* synthetic */ CompetitionStatsResponse copy$default(CompetitionStatsResponse competitionStatsResponse, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = competitionStatsResponse.entries;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = competitionStatsResponse.won;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = competitionStatsResponse.jackpots;
        }
        return competitionStatsResponse.copy(j4, j5, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getEntries() {
        return this.entries;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWon() {
        return this.won;
    }

    /* renamed from: component3, reason: from getter */
    public final long getJackpots() {
        return this.jackpots;
    }

    public final CompetitionStatsResponse copy(long entries, long won, long jackpots) {
        return new CompetitionStatsResponse(entries, won, jackpots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionStatsResponse)) {
            return false;
        }
        CompetitionStatsResponse competitionStatsResponse = (CompetitionStatsResponse) other;
        return this.entries == competitionStatsResponse.entries && this.won == competitionStatsResponse.won && this.jackpots == competitionStatsResponse.jackpots;
    }

    public int hashCode() {
        return (((Long.hashCode(this.entries) * 31) + Long.hashCode(this.won)) * 31) + Long.hashCode(this.jackpots);
    }

    public String toString() {
        return "CompetitionStatsResponse(entries=" + this.entries + ", won=" + this.won + ", jackpots=" + this.jackpots + ")";
    }

    public CompetitionStatsResponse(long j, long j2, long j3) {
        this.entries = j;
        this.won = j2;
        this.jackpots = j3;
    }

    public /* synthetic */ CompetitionStatsResponse(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }

    public final long getEntries() {
        return this.entries;
    }

    public final long getWon() {
        return this.won;
    }

    public final long getJackpots() {
        return this.jackpots;
    }
}
