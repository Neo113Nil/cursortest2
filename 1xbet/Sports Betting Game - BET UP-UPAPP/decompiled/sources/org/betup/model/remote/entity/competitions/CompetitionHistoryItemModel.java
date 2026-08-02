package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.sports.NewSport;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionHistoryResponseModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionHistoryItemModel;", "", "id", "", "participantId", "date", "", "sport", "Lorg/betup/model/remote/entity/sports/NewSport;", "totalBetsCount", "wonBetsCount", "competitionState", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJLjava/lang/String;Lorg/betup/model/remote/entity/sports/NewSport;JJJ)V", "getId", "()J", "getParticipantId", "getDate", "()Ljava/lang/String;", "getSport", "()Lorg/betup/model/remote/entity/sports/NewSport;", "getTotalBetsCount", "getWonBetsCount", "getCompetitionState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionHistoryItemModel {
    public static final int $stable = 0;

    @SerializedName("competitionState")
    private final long competitionState;

    @SerializedName("date")
    private final String date;

    @SerializedName("id")
    private final long id;

    @SerializedName("participantId")
    private final long participantId;

    @SerializedName("sport")
    private final NewSport sport;

    @SerializedName("totalBetsCount")
    private final long totalBetsCount;

    @SerializedName("wonBetsCount")
    private final long wonBetsCount;

    public CompetitionHistoryItemModel() {
        this(0L, 0L, null, null, 0L, 0L, 0L, 127, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getParticipantId() {
        return this.participantId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final NewSport getSport() {
        return this.sport;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTotalBetsCount() {
        return this.totalBetsCount;
    }

    /* renamed from: component6, reason: from getter */
    public final long getWonBetsCount() {
        return this.wonBetsCount;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCompetitionState() {
        return this.competitionState;
    }

    public final CompetitionHistoryItemModel copy(long id, long participantId, String date, NewSport sport, long totalBetsCount, long wonBetsCount, long competitionState) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new CompetitionHistoryItemModel(id, participantId, date, sport, totalBetsCount, wonBetsCount, competitionState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionHistoryItemModel)) {
            return false;
        }
        CompetitionHistoryItemModel competitionHistoryItemModel = (CompetitionHistoryItemModel) other;
        return this.id == competitionHistoryItemModel.id && this.participantId == competitionHistoryItemModel.participantId && Intrinsics.areEqual(this.date, competitionHistoryItemModel.date) && Intrinsics.areEqual(this.sport, competitionHistoryItemModel.sport) && this.totalBetsCount == competitionHistoryItemModel.totalBetsCount && this.wonBetsCount == competitionHistoryItemModel.wonBetsCount && this.competitionState == competitionHistoryItemModel.competitionState;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + Long.hashCode(this.participantId)) * 31) + this.date.hashCode()) * 31;
        NewSport newSport = this.sport;
        return ((((((hashCode + (newSport == null ? 0 : newSport.hashCode())) * 31) + Long.hashCode(this.totalBetsCount)) * 31) + Long.hashCode(this.wonBetsCount)) * 31) + Long.hashCode(this.competitionState);
    }

    public String toString() {
        return "CompetitionHistoryItemModel(id=" + this.id + ", participantId=" + this.participantId + ", date=" + this.date + ", sport=" + this.sport + ", totalBetsCount=" + this.totalBetsCount + ", wonBetsCount=" + this.wonBetsCount + ", competitionState=" + this.competitionState + ")";
    }

    public CompetitionHistoryItemModel(long j, long j2, String date, NewSport newSport, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.id = j;
        this.participantId = j2;
        this.date = date;
        this.sport = newSport;
        this.totalBetsCount = j3;
        this.wonBetsCount = j4;
        this.competitionState = j5;
    }

    public final long getId() {
        return this.id;
    }

    public final long getParticipantId() {
        return this.participantId;
    }

    public final String getDate() {
        return this.date;
    }

    public /* synthetic */ CompetitionHistoryItemModel(long j, long j2, String str, NewSport newSport, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : newSport, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? 0L : j4, (i & 64) == 0 ? j5 : 0L);
    }

    public final NewSport getSport() {
        return this.sport;
    }

    public final long getTotalBetsCount() {
        return this.totalBetsCount;
    }

    public final long getWonBetsCount() {
        return this.wonBetsCount;
    }

    public final long getCompetitionState() {
        return this.competitionState;
    }
}
