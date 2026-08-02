package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import io.sentry.SentryBaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003JV\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedParticipantModel;", "", SentryBaseEvent.JsonKeys.USER, "Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedUserModel;", "isCreator", "", "state", "", "moneyReturned", "", "finalCoefficient", "", "placedBet", "Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedBetModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedUserModel;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedBetModel;)V", "getUser", "()Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedUserModel;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoneyReturned", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFinalCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPlacedBet", "()Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedBetModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedUserModel;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedBetModel;)Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedParticipantModel;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeCreatedParticipantModel {
    public static final int $stable = 8;

    @SerializedName("finalCoefficient")
    private final Double finalCoefficient;

    @SerializedName("isCreator")
    private final Boolean isCreator;

    @SerializedName("moneyReturned")
    private final Long moneyReturned;

    @SerializedName("placedBet")
    private final NewChallengeCreatedBetModel placedBet;

    @SerializedName("state")
    private final Integer state;

    @SerializedName(SentryBaseEvent.JsonKeys.USER)
    private final NewChallengeCreatedUserModel user;

    public static /* synthetic */ NewChallengeCreatedParticipantModel copy$default(NewChallengeCreatedParticipantModel newChallengeCreatedParticipantModel, NewChallengeCreatedUserModel newChallengeCreatedUserModel, Boolean bool, Integer num, Long l, Double d, NewChallengeCreatedBetModel newChallengeCreatedBetModel, int i, Object obj) {
        if ((i & 1) != 0) {
            newChallengeCreatedUserModel = newChallengeCreatedParticipantModel.user;
        }
        if ((i & 2) != 0) {
            bool = newChallengeCreatedParticipantModel.isCreator;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            num = newChallengeCreatedParticipantModel.state;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            l = newChallengeCreatedParticipantModel.moneyReturned;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            d = newChallengeCreatedParticipantModel.finalCoefficient;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            newChallengeCreatedBetModel = newChallengeCreatedParticipantModel.placedBet;
        }
        return newChallengeCreatedParticipantModel.copy(newChallengeCreatedUserModel, bool2, num2, l2, d2, newChallengeCreatedBetModel);
    }

    /* renamed from: component1, reason: from getter */
    public final NewChallengeCreatedUserModel getUser() {
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
    public final NewChallengeCreatedBetModel getPlacedBet() {
        return this.placedBet;
    }

    public final NewChallengeCreatedParticipantModel copy(NewChallengeCreatedUserModel user, Boolean isCreator, Integer state, Long moneyReturned, Double finalCoefficient, NewChallengeCreatedBetModel placedBet) {
        return new NewChallengeCreatedParticipantModel(user, isCreator, state, moneyReturned, finalCoefficient, placedBet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeCreatedParticipantModel)) {
            return false;
        }
        NewChallengeCreatedParticipantModel newChallengeCreatedParticipantModel = (NewChallengeCreatedParticipantModel) other;
        return Intrinsics.areEqual(this.user, newChallengeCreatedParticipantModel.user) && Intrinsics.areEqual(this.isCreator, newChallengeCreatedParticipantModel.isCreator) && Intrinsics.areEqual(this.state, newChallengeCreatedParticipantModel.state) && Intrinsics.areEqual(this.moneyReturned, newChallengeCreatedParticipantModel.moneyReturned) && Intrinsics.areEqual((Object) this.finalCoefficient, (Object) newChallengeCreatedParticipantModel.finalCoefficient) && Intrinsics.areEqual(this.placedBet, newChallengeCreatedParticipantModel.placedBet);
    }

    public int hashCode() {
        NewChallengeCreatedUserModel newChallengeCreatedUserModel = this.user;
        int hashCode = (newChallengeCreatedUserModel == null ? 0 : newChallengeCreatedUserModel.hashCode()) * 31;
        Boolean bool = this.isCreator;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.state;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.moneyReturned;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.finalCoefficient;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        NewChallengeCreatedBetModel newChallengeCreatedBetModel = this.placedBet;
        return hashCode5 + (newChallengeCreatedBetModel != null ? newChallengeCreatedBetModel.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeCreatedParticipantModel(user=" + this.user + ", isCreator=" + this.isCreator + ", state=" + this.state + ", moneyReturned=" + this.moneyReturned + ", finalCoefficient=" + this.finalCoefficient + ", placedBet=" + this.placedBet + ")";
    }

    public NewChallengeCreatedParticipantModel(NewChallengeCreatedUserModel newChallengeCreatedUserModel, Boolean bool, Integer num, Long l, Double d, NewChallengeCreatedBetModel newChallengeCreatedBetModel) {
        this.user = newChallengeCreatedUserModel;
        this.isCreator = bool;
        this.state = num;
        this.moneyReturned = l;
        this.finalCoefficient = d;
        this.placedBet = newChallengeCreatedBetModel;
    }

    public final NewChallengeCreatedUserModel getUser() {
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

    public final NewChallengeCreatedBetModel getPlacedBet() {
        return this.placedBet;
    }
}
