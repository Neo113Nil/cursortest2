package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeBetModel;", "", "id", "", "bet", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;)V", "getId", "()J", "getBet", "()Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeBetModel {
    public static final int $stable = 0;

    @SerializedName("bet")
    private final NewChallengeBetDetailsModel bet;

    @SerializedName("id")
    private final long id;

    public static /* synthetic */ NewChallengeBetModel copy$default(NewChallengeBetModel newChallengeBetModel, long j, NewChallengeBetDetailsModel newChallengeBetDetailsModel, int i, Object obj) {
        if ((i & 1) != 0) {
            j = newChallengeBetModel.id;
        }
        if ((i & 2) != 0) {
            newChallengeBetDetailsModel = newChallengeBetModel.bet;
        }
        return newChallengeBetModel.copy(j, newChallengeBetDetailsModel);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final NewChallengeBetDetailsModel getBet() {
        return this.bet;
    }

    public final NewChallengeBetModel copy(long id, NewChallengeBetDetailsModel bet) {
        return new NewChallengeBetModel(id, bet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeBetModel)) {
            return false;
        }
        NewChallengeBetModel newChallengeBetModel = (NewChallengeBetModel) other;
        return this.id == newChallengeBetModel.id && Intrinsics.areEqual(this.bet, newChallengeBetModel.bet);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        NewChallengeBetDetailsModel newChallengeBetDetailsModel = this.bet;
        return hashCode + (newChallengeBetDetailsModel == null ? 0 : newChallengeBetDetailsModel.hashCode());
    }

    public String toString() {
        return "NewChallengeBetModel(id=" + this.id + ", bet=" + this.bet + ")";
    }

    public NewChallengeBetModel(long j, NewChallengeBetDetailsModel newChallengeBetDetailsModel) {
        this.id = j;
        this.bet = newChallengeBetDetailsModel;
    }

    public final long getId() {
        return this.id;
    }

    public final NewChallengeBetDetailsModel getBet() {
        return this.bet;
    }
}
