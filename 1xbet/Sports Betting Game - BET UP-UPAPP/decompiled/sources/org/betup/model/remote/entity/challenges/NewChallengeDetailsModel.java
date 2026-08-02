package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013JV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006$"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsModel;", "", "id", "", "moneyAccept", "enterFee", "moneyToWin", "state", "", "participantState", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMoneyAccept", "getEnterFee", "getMoneyToWin", "getState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParticipantState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsModel;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeDetailsModel {
    public static final int $stable = 0;

    @SerializedName("enterFee")
    private final Long enterFee;

    @SerializedName("id")
    private final Long id;

    @SerializedName("moneyAccept")
    private final Long moneyAccept;

    @SerializedName("moneyToWin")
    private final Long moneyToWin;

    @SerializedName("participantState")
    private final Integer participantState;

    @SerializedName("state")
    private final Integer state;

    public static /* synthetic */ NewChallengeDetailsModel copy$default(NewChallengeDetailsModel newChallengeDetailsModel, Long l, Long l2, Long l3, Long l4, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = newChallengeDetailsModel.id;
        }
        if ((i & 2) != 0) {
            l2 = newChallengeDetailsModel.moneyAccept;
        }
        Long l5 = l2;
        if ((i & 4) != 0) {
            l3 = newChallengeDetailsModel.enterFee;
        }
        Long l6 = l3;
        if ((i & 8) != 0) {
            l4 = newChallengeDetailsModel.moneyToWin;
        }
        Long l7 = l4;
        if ((i & 16) != 0) {
            num = newChallengeDetailsModel.state;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = newChallengeDetailsModel.participantState;
        }
        return newChallengeDetailsModel.copy(l, l5, l6, l7, num3, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getMoneyAccept() {
        return this.moneyAccept;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getEnterFee() {
        return this.enterFee;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getMoneyToWin() {
        return this.moneyToWin;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getParticipantState() {
        return this.participantState;
    }

    public final NewChallengeDetailsModel copy(Long id, Long moneyAccept, Long enterFee, Long moneyToWin, Integer state, Integer participantState) {
        return new NewChallengeDetailsModel(id, moneyAccept, enterFee, moneyToWin, state, participantState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeDetailsModel)) {
            return false;
        }
        NewChallengeDetailsModel newChallengeDetailsModel = (NewChallengeDetailsModel) other;
        return Intrinsics.areEqual(this.id, newChallengeDetailsModel.id) && Intrinsics.areEqual(this.moneyAccept, newChallengeDetailsModel.moneyAccept) && Intrinsics.areEqual(this.enterFee, newChallengeDetailsModel.enterFee) && Intrinsics.areEqual(this.moneyToWin, newChallengeDetailsModel.moneyToWin) && Intrinsics.areEqual(this.state, newChallengeDetailsModel.state) && Intrinsics.areEqual(this.participantState, newChallengeDetailsModel.participantState);
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.moneyAccept;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.enterFee;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.moneyToWin;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.state;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.participantState;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeDetailsModel(id=" + this.id + ", moneyAccept=" + this.moneyAccept + ", enterFee=" + this.enterFee + ", moneyToWin=" + this.moneyToWin + ", state=" + this.state + ", participantState=" + this.participantState + ")";
    }

    public NewChallengeDetailsModel(Long l, Long l2, Long l3, Long l4, Integer num, Integer num2) {
        this.id = l;
        this.moneyAccept = l2;
        this.enterFee = l3;
        this.moneyToWin = l4;
        this.state = num;
        this.participantState = num2;
    }

    public final Long getId() {
        return this.id;
    }

    public final Long getMoneyAccept() {
        return this.moneyAccept;
    }

    public final Long getEnterFee() {
        return this.enterFee;
    }

    public final Long getMoneyToWin() {
        return this.moneyToWin;
    }

    public final Integer getState() {
        return this.state;
    }

    public final Integer getParticipantState() {
        return this.participantState;
    }
}
