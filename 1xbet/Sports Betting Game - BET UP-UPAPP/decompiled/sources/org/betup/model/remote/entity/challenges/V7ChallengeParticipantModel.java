package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import io.sentry.SentryBaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7ChallengeDetailsResponseModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003JV\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lorg/betup/model/remote/entity/challenges/V7ChallengeParticipantModel;", "", SentryBaseEvent.JsonKeys.USER, "Lorg/betup/model/remote/entity/challenges/V7ChallengeUserModel;", "isCreator", "", "state", "", "moneyReturned", "", "finalCoefficient", "", "placedBet", "Lorg/betup/model/remote/entity/challenges/V7ChallengePlacedBetModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/challenges/V7ChallengeUserModel;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Lorg/betup/model/remote/entity/challenges/V7ChallengePlacedBetModel;)V", "getUser", "()Lorg/betup/model/remote/entity/challenges/V7ChallengeUserModel;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoneyReturned", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFinalCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPlacedBet", "()Lorg/betup/model/remote/entity/challenges/V7ChallengePlacedBetModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lorg/betup/model/remote/entity/challenges/V7ChallengeUserModel;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Lorg/betup/model/remote/entity/challenges/V7ChallengePlacedBetModel;)Lorg/betup/model/remote/entity/challenges/V7ChallengeParticipantModel;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7ChallengeParticipantModel {
    public static final int $stable = 0;

    @SerializedName("finalCoefficient")
    private final Double finalCoefficient;

    @SerializedName("isCreator")
    private final Boolean isCreator;

    @SerializedName("moneyReturned")
    private final Long moneyReturned;

    @SerializedName("placedBet")
    private final V7ChallengePlacedBetModel placedBet;

    @SerializedName("state")
    private final Integer state;

    @SerializedName(SentryBaseEvent.JsonKeys.USER)
    private final V7ChallengeUserModel user;

    public static /* synthetic */ V7ChallengeParticipantModel copy$default(V7ChallengeParticipantModel v7ChallengeParticipantModel, V7ChallengeUserModel v7ChallengeUserModel, Boolean bool, Integer num, Long l, Double d, V7ChallengePlacedBetModel v7ChallengePlacedBetModel, int i, Object obj) {
        if ((i & 1) != 0) {
            v7ChallengeUserModel = v7ChallengeParticipantModel.user;
        }
        if ((i & 2) != 0) {
            bool = v7ChallengeParticipantModel.isCreator;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            num = v7ChallengeParticipantModel.state;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            l = v7ChallengeParticipantModel.moneyReturned;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            d = v7ChallengeParticipantModel.finalCoefficient;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            v7ChallengePlacedBetModel = v7ChallengeParticipantModel.placedBet;
        }
        return v7ChallengeParticipantModel.copy(v7ChallengeUserModel, bool2, num2, l2, d2, v7ChallengePlacedBetModel);
    }

    /* renamed from: component1, reason: from getter */
    public final V7ChallengeUserModel getUser() {
        return this.user;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsCreator() {
        return this.isCreator;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getMoneyReturned() {
        return this.moneyReturned;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getFinalCoefficient() {
        return this.finalCoefficient;
    }

    /* renamed from: component6, reason: from getter */
    public final V7ChallengePlacedBetModel getPlacedBet() {
        return this.placedBet;
    }

    public final V7ChallengeParticipantModel copy(V7ChallengeUserModel user, Boolean isCreator, Integer state, Long moneyReturned, Double finalCoefficient, V7ChallengePlacedBetModel placedBet) {
        return new V7ChallengeParticipantModel(user, isCreator, state, moneyReturned, finalCoefficient, placedBet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7ChallengeParticipantModel)) {
            return false;
        }
        V7ChallengeParticipantModel v7ChallengeParticipantModel = (V7ChallengeParticipantModel) other;
        return Intrinsics.areEqual(this.user, v7ChallengeParticipantModel.user) && Intrinsics.areEqual(this.isCreator, v7ChallengeParticipantModel.isCreator) && Intrinsics.areEqual(this.state, v7ChallengeParticipantModel.state) && Intrinsics.areEqual(this.moneyReturned, v7ChallengeParticipantModel.moneyReturned) && Intrinsics.areEqual((Object) this.finalCoefficient, (Object) v7ChallengeParticipantModel.finalCoefficient) && Intrinsics.areEqual(this.placedBet, v7ChallengeParticipantModel.placedBet);
    }

    public int hashCode() {
        V7ChallengeUserModel v7ChallengeUserModel = this.user;
        int hashCode = (v7ChallengeUserModel == null ? 0 : v7ChallengeUserModel.hashCode()) * 31;
        Boolean bool = this.isCreator;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.state;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.moneyReturned;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.finalCoefficient;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        V7ChallengePlacedBetModel v7ChallengePlacedBetModel = this.placedBet;
        return hashCode5 + (v7ChallengePlacedBetModel != null ? v7ChallengePlacedBetModel.hashCode() : 0);
    }

    public String toString() {
        return "V7ChallengeParticipantModel(user=" + this.user + ", isCreator=" + this.isCreator + ", state=" + this.state + ", moneyReturned=" + this.moneyReturned + ", finalCoefficient=" + this.finalCoefficient + ", placedBet=" + this.placedBet + ")";
    }

    public V7ChallengeParticipantModel(V7ChallengeUserModel v7ChallengeUserModel, Boolean bool, Integer num, Long l, Double d, V7ChallengePlacedBetModel v7ChallengePlacedBetModel) {
        this.user = v7ChallengeUserModel;
        this.isCreator = bool;
        this.state = num;
        this.moneyReturned = l;
        this.finalCoefficient = d;
        this.placedBet = v7ChallengePlacedBetModel;
    }

    public final V7ChallengeUserModel getUser() {
        return this.user;
    }

    public final Boolean isCreator() {
        return this.isCreator;
    }

    public final Integer getState() {
        return this.state;
    }

    public final Long getMoneyReturned() {
        return this.moneyReturned;
    }

    public final Double getFinalCoefficient() {
        return this.finalCoefficient;
    }

    public final V7ChallengePlacedBetModel getPlacedBet() {
        return this.placedBet;
    }
}
