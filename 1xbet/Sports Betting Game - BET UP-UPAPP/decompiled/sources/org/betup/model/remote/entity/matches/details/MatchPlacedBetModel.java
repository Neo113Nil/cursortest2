package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchPlacedBetInfoModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetModel;", "", "id", "", "placedCoefficient", "", "betTypeId", "betName", "", "betsGameType", "state", "", "setOnLive", "", "betTypeGroup", "Lorg/betup/model/remote/entity/bets/BetGroupModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JDJLjava/lang/String;Ljava/lang/String;IZLorg/betup/model/remote/entity/bets/BetGroupModel;)V", "getId", "()J", "getPlacedCoefficient", "()D", "getBetTypeId", "getBetName", "()Ljava/lang/String;", "getBetsGameType", "getState", "()I", "getSetOnLive", "()Z", "getBetTypeGroup", "()Lorg/betup/model/remote/entity/bets/BetGroupModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MatchPlacedBetModel {
    public static final int $stable = 8;

    @SerializedName("bet_name")
    private final String betName;

    @SerializedName("bet_type_group")
    private final BetGroupModel betTypeGroup;

    @SerializedName("bet_type_id")
    private final long betTypeId;

    @SerializedName("bets_game_type")
    private final String betsGameType;

    @SerializedName("id")
    private final long id;

    @SerializedName("placed_coeficient")
    private final double placedCoefficient;

    @SerializedName("set_on_live")
    private final boolean setOnLive;

    @SerializedName("state")
    private final int state;

    public MatchPlacedBetModel() {
        this(0L, 0.0d, 0L, null, null, 0, false, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getPlacedCoefficient() {
        return this.placedCoefficient;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBetTypeId() {
        return this.betTypeId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBetsGameType() {
        return this.betsGameType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSetOnLive() {
        return this.setOnLive;
    }

    /* renamed from: component8, reason: from getter */
    public final BetGroupModel getBetTypeGroup() {
        return this.betTypeGroup;
    }

    public final MatchPlacedBetModel copy(long id, double placedCoefficient, long betTypeId, String betName, String betsGameType, int state, boolean setOnLive, BetGroupModel betTypeGroup) {
        return new MatchPlacedBetModel(id, placedCoefficient, betTypeId, betName, betsGameType, state, setOnLive, betTypeGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchPlacedBetModel)) {
            return false;
        }
        MatchPlacedBetModel matchPlacedBetModel = (MatchPlacedBetModel) other;
        return this.id == matchPlacedBetModel.id && Double.compare(this.placedCoefficient, matchPlacedBetModel.placedCoefficient) == 0 && this.betTypeId == matchPlacedBetModel.betTypeId && Intrinsics.areEqual(this.betName, matchPlacedBetModel.betName) && Intrinsics.areEqual(this.betsGameType, matchPlacedBetModel.betsGameType) && this.state == matchPlacedBetModel.state && this.setOnLive == matchPlacedBetModel.setOnLive && Intrinsics.areEqual(this.betTypeGroup, matchPlacedBetModel.betTypeGroup);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.id) * 31) + Double.hashCode(this.placedCoefficient)) * 31) + Long.hashCode(this.betTypeId)) * 31;
        String str = this.betName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.betsGameType;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.state)) * 31) + Boolean.hashCode(this.setOnLive)) * 31;
        BetGroupModel betGroupModel = this.betTypeGroup;
        return hashCode3 + (betGroupModel != null ? betGroupModel.hashCode() : 0);
    }

    public String toString() {
        return "MatchPlacedBetModel(id=" + this.id + ", placedCoefficient=" + this.placedCoefficient + ", betTypeId=" + this.betTypeId + ", betName=" + this.betName + ", betsGameType=" + this.betsGameType + ", state=" + this.state + ", setOnLive=" + this.setOnLive + ", betTypeGroup=" + this.betTypeGroup + ")";
    }

    public MatchPlacedBetModel(long j, double d, long j2, String str, String str2, int i, boolean z, BetGroupModel betGroupModel) {
        this.id = j;
        this.placedCoefficient = d;
        this.betTypeId = j2;
        this.betName = str;
        this.betsGameType = str2;
        this.state = i;
        this.setOnLive = z;
        this.betTypeGroup = betGroupModel;
    }

    public /* synthetic */ MatchPlacedBetModel(long j, double d, long j2, String str, String str2, int i, boolean z, BetGroupModel betGroupModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) == 0 ? z : false, (i2 & 128) == 0 ? betGroupModel : null);
    }

    public final long getId() {
        return this.id;
    }

    public final double getPlacedCoefficient() {
        return this.placedCoefficient;
    }

    public final long getBetTypeId() {
        return this.betTypeId;
    }

    public final String getBetName() {
        return this.betName;
    }

    public final String getBetsGameType() {
        return this.betsGameType;
    }

    public final int getState() {
        return this.state;
    }

    public final boolean getSetOnLive() {
        return this.setOnLive;
    }

    public final BetGroupModel getBetTypeGroup() {
        return this.betTypeGroup;
    }
}
