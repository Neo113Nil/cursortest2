package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7ChallengeDetailsResponseModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/entity/challenges/V7ChallengePlacedBetModel;", "", "id", "", "bet", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBet", "()Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;", "component1", "component2", "copy", "(Ljava/lang/Long;Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;)Lorg/betup/model/remote/entity/challenges/V7ChallengePlacedBetModel;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7ChallengePlacedBetModel {
    public static final int $stable = 0;

    @SerializedName("bet")
    private final NewChallengeBetDetailsModel bet;

    @SerializedName("id")
    private final Long id;

    public static /* synthetic */ V7ChallengePlacedBetModel copy$default(V7ChallengePlacedBetModel v7ChallengePlacedBetModel, Long l, NewChallengeBetDetailsModel newChallengeBetDetailsModel, int i, Object obj) {
        if ((i & 1) != 0) {
            l = v7ChallengePlacedBetModel.id;
        }
        if ((i & 2) != 0) {
            newChallengeBetDetailsModel = v7ChallengePlacedBetModel.bet;
        }
        return v7ChallengePlacedBetModel.copy(l, newChallengeBetDetailsModel);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final NewChallengeBetDetailsModel getBet() {
        return this.bet;
    }

    public final V7ChallengePlacedBetModel copy(Long id, NewChallengeBetDetailsModel bet) {
        return new V7ChallengePlacedBetModel(id, bet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7ChallengePlacedBetModel)) {
            return false;
        }
        V7ChallengePlacedBetModel v7ChallengePlacedBetModel = (V7ChallengePlacedBetModel) other;
        return Intrinsics.areEqual(this.id, v7ChallengePlacedBetModel.id) && Intrinsics.areEqual(this.bet, v7ChallengePlacedBetModel.bet);
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        NewChallengeBetDetailsModel newChallengeBetDetailsModel = this.bet;
        return hashCode + (newChallengeBetDetailsModel != null ? newChallengeBetDetailsModel.hashCode() : 0);
    }

    public String toString() {
        return "V7ChallengePlacedBetModel(id=" + this.id + ", bet=" + this.bet + ")";
    }

    public V7ChallengePlacedBetModel(Long l, NewChallengeBetDetailsModel newChallengeBetDetailsModel) {
        this.id = l;
        this.bet = newChallengeBetDetailsModel;
    }

    public final Long getId() {
        return this.id;
    }

    public final NewChallengeBetDetailsModel getBet() {
        return this.bet;
    }
}
