package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedBetModel;", "", "id", "", "bet", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/Object;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBet", "()Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Object;)Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedBetModel;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeCreatedBetModel {
    public static final int $stable = 8;

    @SerializedName("bet")
    private final Object bet;

    @SerializedName("id")
    private final Long id;

    public static /* synthetic */ NewChallengeCreatedBetModel copy$default(NewChallengeCreatedBetModel newChallengeCreatedBetModel, Long l, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            l = newChallengeCreatedBetModel.id;
        }
        if ((i & 2) != 0) {
            obj = newChallengeCreatedBetModel.bet;
        }
        return newChallengeCreatedBetModel.copy(l, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getBet() {
        return this.bet;
    }

    public final NewChallengeCreatedBetModel copy(Long id, Object bet) {
        return new NewChallengeCreatedBetModel(id, bet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeCreatedBetModel)) {
            return false;
        }
        NewChallengeCreatedBetModel newChallengeCreatedBetModel = (NewChallengeCreatedBetModel) other;
        return Intrinsics.areEqual(this.id, newChallengeCreatedBetModel.id) && Intrinsics.areEqual(this.bet, newChallengeCreatedBetModel.bet);
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Object obj = this.bet;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeCreatedBetModel(id=" + this.id + ", bet=" + this.bet + ")";
    }

    public NewChallengeCreatedBetModel(Long l, Object obj) {
        this.id = l;
        this.bet = obj;
    }

    public final Long getId() {
        return this.id;
    }

    public final Object getBet() {
        return this.bet;
    }
}
