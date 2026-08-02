package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchPlacedBetInfoModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetInfoModel;", "", "betlistId", "", "placedBet", "Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetModel;", "moneyPlaced", "createdAt", "", "betlistState", "", "betlistPlacedBetsCount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/matches/details/MatchPlacedBetModel;JLjava/lang/String;II)V", "getBetlistId", "()J", "getPlacedBet", "()Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetModel;", "getMoneyPlaced", "getCreatedAt", "()Ljava/lang/String;", "getBetlistState", "()I", "getBetlistPlacedBetsCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MatchPlacedBetInfoModel {
    public static final int $stable = 8;

    @SerializedName("betlistId")
    private final long betlistId;

    @SerializedName("betlist_placed_bets_count")
    private final int betlistPlacedBetsCount;

    @SerializedName("betlist_state")
    private final int betlistState;

    @SerializedName("created_at")
    @JsonAdapter(FlexibleCreatedAtAdapter.class)
    private final String createdAt;

    @SerializedName("money_placed")
    private final long moneyPlaced;

    @SerializedName("placedBet")
    private final MatchPlacedBetModel placedBet;

    public MatchPlacedBetInfoModel() {
        this(0L, null, 0L, null, 0, 0, 63, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBetlistId() {
        return this.betlistId;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchPlacedBetModel getPlacedBet() {
        return this.placedBet;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBetlistState() {
        return this.betlistState;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBetlistPlacedBetsCount() {
        return this.betlistPlacedBetsCount;
    }

    public final MatchPlacedBetInfoModel copy(long betlistId, MatchPlacedBetModel placedBet, long moneyPlaced, String createdAt, int betlistState, int betlistPlacedBetsCount) {
        return new MatchPlacedBetInfoModel(betlistId, placedBet, moneyPlaced, createdAt, betlistState, betlistPlacedBetsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchPlacedBetInfoModel)) {
            return false;
        }
        MatchPlacedBetInfoModel matchPlacedBetInfoModel = (MatchPlacedBetInfoModel) other;
        return this.betlistId == matchPlacedBetInfoModel.betlistId && Intrinsics.areEqual(this.placedBet, matchPlacedBetInfoModel.placedBet) && this.moneyPlaced == matchPlacedBetInfoModel.moneyPlaced && Intrinsics.areEqual(this.createdAt, matchPlacedBetInfoModel.createdAt) && this.betlistState == matchPlacedBetInfoModel.betlistState && this.betlistPlacedBetsCount == matchPlacedBetInfoModel.betlistPlacedBetsCount;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.betlistId) * 31;
        MatchPlacedBetModel matchPlacedBetModel = this.placedBet;
        int hashCode2 = (((hashCode + (matchPlacedBetModel == null ? 0 : matchPlacedBetModel.hashCode())) * 31) + Long.hashCode(this.moneyPlaced)) * 31;
        String str = this.createdAt;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.betlistState)) * 31) + Integer.hashCode(this.betlistPlacedBetsCount);
    }

    public String toString() {
        return "MatchPlacedBetInfoModel(betlistId=" + this.betlistId + ", placedBet=" + this.placedBet + ", moneyPlaced=" + this.moneyPlaced + ", createdAt=" + this.createdAt + ", betlistState=" + this.betlistState + ", betlistPlacedBetsCount=" + this.betlistPlacedBetsCount + ")";
    }

    public MatchPlacedBetInfoModel(long j, MatchPlacedBetModel matchPlacedBetModel, long j2, String str, int i, int i2) {
        this.betlistId = j;
        this.placedBet = matchPlacedBetModel;
        this.moneyPlaced = j2;
        this.createdAt = str;
        this.betlistState = i;
        this.betlistPlacedBetsCount = i2;
    }

    public /* synthetic */ MatchPlacedBetInfoModel(long j, MatchPlacedBetModel matchPlacedBetModel, long j2, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? null : matchPlacedBetModel, (i3 & 4) == 0 ? j2 : 0L, (i3 & 8) == 0 ? str : null, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 1 : i2);
    }

    public final long getBetlistId() {
        return this.betlistId;
    }

    public final MatchPlacedBetModel getPlacedBet() {
        return this.placedBet;
    }

    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getBetlistState() {
        return this.betlistState;
    }

    public final int getBetlistPlacedBetsCount() {
        return this.betlistPlacedBetsCount;
    }
}
