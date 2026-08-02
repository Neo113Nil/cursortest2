package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jl\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;", "", "id", "", "placedCoefficient", "", "betTypeId", "", "betName", "", "betsGameType", "state", "setOnLive", "", "betTypeGroup", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetTypeGroupModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lorg/betup/model/remote/entity/challenges/NewChallengeBetTypeGroupModel;)V", "getId", "()J", "getPlacedCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBetTypeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBetName", "()Ljava/lang/String;", "getBetsGameType", "getState", "getSetOnLive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBetTypeGroup", "()Lorg/betup/model/remote/entity/challenges/NewChallengeBetTypeGroupModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lorg/betup/model/remote/entity/challenges/NewChallengeBetTypeGroupModel;)Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeBetDetailsModel {
    public static final int $stable = 0;

    @SerializedName("bet_name")
    private final String betName;

    @SerializedName("bet_type_group")
    private final NewChallengeBetTypeGroupModel betTypeGroup;

    @SerializedName("bet_type_id")
    private final Integer betTypeId;

    @SerializedName("bets_game_type")
    private final String betsGameType;

    @SerializedName("id")
    private final long id;

    @SerializedName("placed_coeficient")
    private final Double placedCoefficient;

    @SerializedName("set_on_live")
    private final Boolean setOnLive;

    @SerializedName("state")
    private final Integer state;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getPlacedCoefficient() {
        return this.placedCoefficient;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getBetTypeId() {
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
    public final Integer getState() {
        return this.state;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getSetOnLive() {
        return this.setOnLive;
    }

    /* renamed from: component8, reason: from getter */
    public final NewChallengeBetTypeGroupModel getBetTypeGroup() {
        return this.betTypeGroup;
    }

    public final NewChallengeBetDetailsModel copy(long id, Double placedCoefficient, Integer betTypeId, String betName, String betsGameType, Integer state, Boolean setOnLive, NewChallengeBetTypeGroupModel betTypeGroup) {
        return new NewChallengeBetDetailsModel(id, placedCoefficient, betTypeId, betName, betsGameType, state, setOnLive, betTypeGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeBetDetailsModel)) {
            return false;
        }
        NewChallengeBetDetailsModel newChallengeBetDetailsModel = (NewChallengeBetDetailsModel) other;
        return this.id == newChallengeBetDetailsModel.id && Intrinsics.areEqual((Object) this.placedCoefficient, (Object) newChallengeBetDetailsModel.placedCoefficient) && Intrinsics.areEqual(this.betTypeId, newChallengeBetDetailsModel.betTypeId) && Intrinsics.areEqual(this.betName, newChallengeBetDetailsModel.betName) && Intrinsics.areEqual(this.betsGameType, newChallengeBetDetailsModel.betsGameType) && Intrinsics.areEqual(this.state, newChallengeBetDetailsModel.state) && Intrinsics.areEqual(this.setOnLive, newChallengeBetDetailsModel.setOnLive) && Intrinsics.areEqual(this.betTypeGroup, newChallengeBetDetailsModel.betTypeGroup);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Double d = this.placedCoefficient;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.betTypeId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.betName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.betsGameType;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.state;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.setOnLive;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        NewChallengeBetTypeGroupModel newChallengeBetTypeGroupModel = this.betTypeGroup;
        return hashCode7 + (newChallengeBetTypeGroupModel != null ? newChallengeBetTypeGroupModel.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeBetDetailsModel(id=" + this.id + ", placedCoefficient=" + this.placedCoefficient + ", betTypeId=" + this.betTypeId + ", betName=" + this.betName + ", betsGameType=" + this.betsGameType + ", state=" + this.state + ", setOnLive=" + this.setOnLive + ", betTypeGroup=" + this.betTypeGroup + ")";
    }

    public NewChallengeBetDetailsModel(long j, Double d, Integer num, String str, String str2, Integer num2, Boolean bool, NewChallengeBetTypeGroupModel newChallengeBetTypeGroupModel) {
        this.id = j;
        this.placedCoefficient = d;
        this.betTypeId = num;
        this.betName = str;
        this.betsGameType = str2;
        this.state = num2;
        this.setOnLive = bool;
        this.betTypeGroup = newChallengeBetTypeGroupModel;
    }

    public final long getId() {
        return this.id;
    }

    public final Double getPlacedCoefficient() {
        return this.placedCoefficient;
    }

    public final Integer getBetTypeId() {
        return this.betTypeId;
    }

    public final String getBetName() {
        return this.betName;
    }

    public final String getBetsGameType() {
        return this.betsGameType;
    }

    public final Integer getState() {
        return this.state;
    }

    public final Boolean getSetOnLive() {
        return this.setOnLive;
    }

    public final NewChallengeBetTypeGroupModel getBetTypeGroup() {
        return this.betTypeGroup;
    }
}
