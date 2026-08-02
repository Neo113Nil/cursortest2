package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsWithParticipantModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionParticipantBetModel;", "", "id", "", "placedCoefficient", "", "betTypeId", "", "betName", "", "betsGameType", "state", "setOnLive", "", "betTypeGroup", "Lorg/betup/model/remote/entity/competitions/CompetitionBetTypeGroupModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JDILjava/lang/String;Ljava/lang/String;IZLorg/betup/model/remote/entity/competitions/CompetitionBetTypeGroupModel;)V", "getId", "()J", "getPlacedCoefficient", "()D", "getBetTypeId", "()I", "getBetName", "()Ljava/lang/String;", "getBetsGameType", "getState", "getSetOnLive", "()Z", "getBetTypeGroup", "()Lorg/betup/model/remote/entity/competitions/CompetitionBetTypeGroupModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionParticipantBetModel {
    public static final int $stable = 0;

    @SerializedName("bet_name")
    private final String betName;

    @SerializedName("bet_type_group")
    private final CompetitionBetTypeGroupModel betTypeGroup;

    @SerializedName("bet_type_id")
    private final int betTypeId;

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

    public CompetitionParticipantBetModel() {
        this(0L, 0.0d, 0, null, null, 0, false, null, 255, null);
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
    public final int getBetTypeId() {
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
    public final CompetitionBetTypeGroupModel getBetTypeGroup() {
        return this.betTypeGroup;
    }

    public final CompetitionParticipantBetModel copy(long id, double placedCoefficient, int betTypeId, String betName, String betsGameType, int state, boolean setOnLive, CompetitionBetTypeGroupModel betTypeGroup) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(betsGameType, "betsGameType");
        Intrinsics.checkNotNullParameter(betTypeGroup, "betTypeGroup");
        return new CompetitionParticipantBetModel(id, placedCoefficient, betTypeId, betName, betsGameType, state, setOnLive, betTypeGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionParticipantBetModel)) {
            return false;
        }
        CompetitionParticipantBetModel competitionParticipantBetModel = (CompetitionParticipantBetModel) other;
        return this.id == competitionParticipantBetModel.id && Double.compare(this.placedCoefficient, competitionParticipantBetModel.placedCoefficient) == 0 && this.betTypeId == competitionParticipantBetModel.betTypeId && Intrinsics.areEqual(this.betName, competitionParticipantBetModel.betName) && Intrinsics.areEqual(this.betsGameType, competitionParticipantBetModel.betsGameType) && this.state == competitionParticipantBetModel.state && this.setOnLive == competitionParticipantBetModel.setOnLive && Intrinsics.areEqual(this.betTypeGroup, competitionParticipantBetModel.betTypeGroup);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + Double.hashCode(this.placedCoefficient)) * 31) + Integer.hashCode(this.betTypeId)) * 31) + this.betName.hashCode()) * 31) + this.betsGameType.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + Boolean.hashCode(this.setOnLive)) * 31) + this.betTypeGroup.hashCode();
    }

    public String toString() {
        return "CompetitionParticipantBetModel(id=" + this.id + ", placedCoefficient=" + this.placedCoefficient + ", betTypeId=" + this.betTypeId + ", betName=" + this.betName + ", betsGameType=" + this.betsGameType + ", state=" + this.state + ", setOnLive=" + this.setOnLive + ", betTypeGroup=" + this.betTypeGroup + ")";
    }

    public CompetitionParticipantBetModel(long j, double d, int i, String betName, String betsGameType, int i2, boolean z, CompetitionBetTypeGroupModel betTypeGroup) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(betsGameType, "betsGameType");
        Intrinsics.checkNotNullParameter(betTypeGroup, "betTypeGroup");
        this.id = j;
        this.placedCoefficient = d;
        this.betTypeId = i;
        this.betName = betName;
        this.betsGameType = betsGameType;
        this.state = i2;
        this.setOnLive = z;
        this.betTypeGroup = betTypeGroup;
    }

    public /* synthetic */ CompetitionParticipantBetModel(long j, double d, int i, String str, String str2, int i2, boolean z, CompetitionBetTypeGroupModel competitionBetTypeGroupModel, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0.0d : d, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str, (i3 & 16) == 0 ? str2 : "", (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0 ? z : false, (i3 & 128) != 0 ? new CompetitionBetTypeGroupModel(0, 0, null, false, 0, 0, 0, 127, null) : competitionBetTypeGroupModel);
    }

    public final long getId() {
        return this.id;
    }

    public final double getPlacedCoefficient() {
        return this.placedCoefficient;
    }

    public final int getBetTypeId() {
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

    public final CompetitionBetTypeGroupModel getBetTypeGroup() {
        return this.betTypeGroup;
    }
}
