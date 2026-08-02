package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7ChallengeDetailsResponseModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;", "", "id", "", "createdAt", "", "moneyAccept", "", "enterFee", "moneyToWin", "state", "participants", "", "Lorg/betup/model/remote/entity/challenges/V7ChallengeParticipantModel;", "match", "Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;)V", "getId", "()J", "getCreatedAt", "()Ljava/lang/String;", "getMoneyAccept", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnterFee", "getMoneyToWin", "getState", "getParticipants", "()Ljava/util/List;", "getMatch", "()Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lorg/betup/model/remote/entity/challenges/NewChallengeMatchModel;)Lorg/betup/model/remote/entity/challenges/V7ChallengeDetailsResponseModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7ChallengeDetailsResponseModel {
    public static final int $stable = 8;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("enterFee")
    private final Integer enterFee;

    @SerializedName("id")
    private final long id;

    @SerializedName("match")
    private final NewChallengeMatchModel match;

    @SerializedName("moneyAccept")
    private final Integer moneyAccept;

    @SerializedName("moneyToWin")
    private final Integer moneyToWin;

    @SerializedName("participants")
    private final List<V7ChallengeParticipantModel> participants;

    @SerializedName("state")
    private final Integer state;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMoneyAccept() {
        return this.moneyAccept;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getEnterFee() {
        return this.enterFee;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMoneyToWin() {
        return this.moneyToWin;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    public final List<V7ChallengeParticipantModel> component7() {
        return this.participants;
    }

    /* renamed from: component8, reason: from getter */
    public final NewChallengeMatchModel getMatch() {
        return this.match;
    }

    public final V7ChallengeDetailsResponseModel copy(long id, String createdAt, Integer moneyAccept, Integer enterFee, Integer moneyToWin, Integer state, List<V7ChallengeParticipantModel> participants, NewChallengeMatchModel match) {
        return new V7ChallengeDetailsResponseModel(id, createdAt, moneyAccept, enterFee, moneyToWin, state, participants, match);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7ChallengeDetailsResponseModel)) {
            return false;
        }
        V7ChallengeDetailsResponseModel v7ChallengeDetailsResponseModel = (V7ChallengeDetailsResponseModel) other;
        return this.id == v7ChallengeDetailsResponseModel.id && Intrinsics.areEqual(this.createdAt, v7ChallengeDetailsResponseModel.createdAt) && Intrinsics.areEqual(this.moneyAccept, v7ChallengeDetailsResponseModel.moneyAccept) && Intrinsics.areEqual(this.enterFee, v7ChallengeDetailsResponseModel.enterFee) && Intrinsics.areEqual(this.moneyToWin, v7ChallengeDetailsResponseModel.moneyToWin) && Intrinsics.areEqual(this.state, v7ChallengeDetailsResponseModel.state) && Intrinsics.areEqual(this.participants, v7ChallengeDetailsResponseModel.participants) && Intrinsics.areEqual(this.match, v7ChallengeDetailsResponseModel.match);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.createdAt;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.moneyAccept;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.enterFee;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.moneyToWin;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.state;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<V7ChallengeParticipantModel> list = this.participants;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        NewChallengeMatchModel newChallengeMatchModel = this.match;
        return hashCode7 + (newChallengeMatchModel != null ? newChallengeMatchModel.hashCode() : 0);
    }

    public String toString() {
        return "V7ChallengeDetailsResponseModel(id=" + this.id + ", createdAt=" + this.createdAt + ", moneyAccept=" + this.moneyAccept + ", enterFee=" + this.enterFee + ", moneyToWin=" + this.moneyToWin + ", state=" + this.state + ", participants=" + this.participants + ", match=" + this.match + ")";
    }

    public V7ChallengeDetailsResponseModel(long j, String str, Integer num, Integer num2, Integer num3, Integer num4, List<V7ChallengeParticipantModel> list, NewChallengeMatchModel newChallengeMatchModel) {
        this.id = j;
        this.createdAt = str;
        this.moneyAccept = num;
        this.enterFee = num2;
        this.moneyToWin = num3;
        this.state = num4;
        this.participants = list;
        this.match = newChallengeMatchModel;
    }

    public final long getId() {
        return this.id;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final Integer getMoneyAccept() {
        return this.moneyAccept;
    }

    public final Integer getEnterFee() {
        return this.enterFee;
    }

    public final Integer getMoneyToWin() {
        return this.moneyToWin;
    }

    public final Integer getState() {
        return this.state;
    }

    public final List<V7ChallengeParticipantModel> getParticipants() {
        return this.participants;
    }

    public final NewChallengeMatchModel getMatch() {
        return this.match;
    }
}
