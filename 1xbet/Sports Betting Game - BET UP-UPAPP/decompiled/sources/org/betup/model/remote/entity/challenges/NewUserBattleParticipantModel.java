package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import io.sentry.SentryBaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003JV\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0004\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantModel;", "", SentryBaseEvent.JsonKeys.USER, "Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantUserModel;", "isCreator", "", "state", "", "moneyReturned", "", "finalCoefficient", "", "placedBet", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantUserModel;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Object;)V", "getUser", "()Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantUserModel;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoneyReturned", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFinalCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPlacedBet", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantUserModel;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Object;)Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantModel;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserBattleParticipantModel {
    public static final int $stable = 8;

    @SerializedName("finalCoefficient")
    private final Double finalCoefficient;

    @SerializedName("isCreator")
    private final Boolean isCreator;

    @SerializedName("moneyReturned")
    private final Long moneyReturned;

    @SerializedName("placedBet")
    private final Object placedBet;

    @SerializedName("state")
    private final Integer state;

    @SerializedName(SentryBaseEvent.JsonKeys.USER)
    private final NewUserBattleParticipantUserModel user;

    public static /* synthetic */ NewUserBattleParticipantModel copy$default(NewUserBattleParticipantModel newUserBattleParticipantModel, NewUserBattleParticipantUserModel newUserBattleParticipantUserModel, Boolean bool, Integer num, Long l, Double d, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            newUserBattleParticipantUserModel = newUserBattleParticipantModel.user;
        }
        if ((i & 2) != 0) {
            bool = newUserBattleParticipantModel.isCreator;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            num = newUserBattleParticipantModel.state;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            l = newUserBattleParticipantModel.moneyReturned;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            d = newUserBattleParticipantModel.finalCoefficient;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            obj = newUserBattleParticipantModel.placedBet;
        }
        return newUserBattleParticipantModel.copy(newUserBattleParticipantUserModel, bool2, num2, l2, d2, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final NewUserBattleParticipantUserModel getUser() {
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
    public final Object getPlacedBet() {
        return this.placedBet;
    }

    public final NewUserBattleParticipantModel copy(NewUserBattleParticipantUserModel user, Boolean isCreator, Integer state, Long moneyReturned, Double finalCoefficient, Object placedBet) {
        return new NewUserBattleParticipantModel(user, isCreator, state, moneyReturned, finalCoefficient, placedBet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleParticipantModel)) {
            return false;
        }
        NewUserBattleParticipantModel newUserBattleParticipantModel = (NewUserBattleParticipantModel) other;
        return Intrinsics.areEqual(this.user, newUserBattleParticipantModel.user) && Intrinsics.areEqual(this.isCreator, newUserBattleParticipantModel.isCreator) && Intrinsics.areEqual(this.state, newUserBattleParticipantModel.state) && Intrinsics.areEqual(this.moneyReturned, newUserBattleParticipantModel.moneyReturned) && Intrinsics.areEqual((Object) this.finalCoefficient, (Object) newUserBattleParticipantModel.finalCoefficient) && Intrinsics.areEqual(this.placedBet, newUserBattleParticipantModel.placedBet);
    }

    public int hashCode() {
        NewUserBattleParticipantUserModel newUserBattleParticipantUserModel = this.user;
        int hashCode = (newUserBattleParticipantUserModel == null ? 0 : newUserBattleParticipantUserModel.hashCode()) * 31;
        Boolean bool = this.isCreator;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.state;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.moneyReturned;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.finalCoefficient;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Object obj = this.placedBet;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NewUserBattleParticipantModel(user=" + this.user + ", isCreator=" + this.isCreator + ", state=" + this.state + ", moneyReturned=" + this.moneyReturned + ", finalCoefficient=" + this.finalCoefficient + ", placedBet=" + this.placedBet + ")";
    }

    public NewUserBattleParticipantModel(NewUserBattleParticipantUserModel newUserBattleParticipantUserModel, Boolean bool, Integer num, Long l, Double d, Object obj) {
        this.user = newUserBattleParticipantUserModel;
        this.isCreator = bool;
        this.state = num;
        this.moneyReturned = l;
        this.finalCoefficient = d;
        this.placedBet = obj;
    }

    public /* synthetic */ NewUserBattleParticipantModel(NewUserBattleParticipantUserModel newUserBattleParticipantUserModel, Boolean bool, Integer num, Long l, Double d, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(newUserBattleParticipantUserModel, bool, num, l, d, (i & 32) != 0 ? null : obj);
    }

    public final NewUserBattleParticipantUserModel getUser() {
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

    public final Object getPlacedBet() {
        return this.placedBet;
    }
}
