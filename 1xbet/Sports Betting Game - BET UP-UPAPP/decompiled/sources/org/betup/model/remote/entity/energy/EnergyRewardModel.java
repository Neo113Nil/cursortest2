package org.betup.model.remote.entity.energy;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: EnergyRewardModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006 "}, d2 = {"Lorg/betup/model/remote/entity/energy/EnergyRewardModel;", "", "createdAt", "", "amount", "", "addedJustNow", "", "type", "Lorg/betup/model/remote/entity/energy/RewardType;", "currentEnergy", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IZLorg/betup/model/remote/entity/energy/RewardType;I)V", "getCreatedAt", "()Ljava/lang/String;", "getAmount", "()I", "getAddedJustNow", "()Z", "getType", "()Lorg/betup/model/remote/entity/energy/RewardType;", "getCurrentEnergy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EnergyRewardModel {
    public static final int $stable = 0;

    @SerializedName("added_just_now")
    private final boolean addedJustNow;

    @SerializedName("amount")
    private final int amount;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("currentEnergy")
    private final int currentEnergy;

    @SerializedName("type")
    private final RewardType type;

    public static /* synthetic */ EnergyRewardModel copy$default(EnergyRewardModel energyRewardModel, String str, int i, boolean z, RewardType rewardType, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = energyRewardModel.createdAt;
        }
        if ((i3 & 2) != 0) {
            i = energyRewardModel.amount;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            z = energyRewardModel.addedJustNow;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            rewardType = energyRewardModel.type;
        }
        RewardType rewardType2 = rewardType;
        if ((i3 & 16) != 0) {
            i2 = energyRewardModel.currentEnergy;
        }
        return energyRewardModel.copy(str, i4, z2, rewardType2, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAddedJustNow() {
        return this.addedJustNow;
    }

    /* renamed from: component4, reason: from getter */
    public final RewardType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrentEnergy() {
        return this.currentEnergy;
    }

    public final EnergyRewardModel copy(String createdAt, int amount, boolean addedJustNow, RewardType type, int currentEnergy) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(type, "type");
        return new EnergyRewardModel(createdAt, amount, addedJustNow, type, currentEnergy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergyRewardModel)) {
            return false;
        }
        EnergyRewardModel energyRewardModel = (EnergyRewardModel) other;
        return Intrinsics.areEqual(this.createdAt, energyRewardModel.createdAt) && this.amount == energyRewardModel.amount && this.addedJustNow == energyRewardModel.addedJustNow && this.type == energyRewardModel.type && this.currentEnergy == energyRewardModel.currentEnergy;
    }

    public int hashCode() {
        return (((((((this.createdAt.hashCode() * 31) + Integer.hashCode(this.amount)) * 31) + Boolean.hashCode(this.addedJustNow)) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.currentEnergy);
    }

    public String toString() {
        return "EnergyRewardModel(createdAt=" + this.createdAt + ", amount=" + this.amount + ", addedJustNow=" + this.addedJustNow + ", type=" + this.type + ", currentEnergy=" + this.currentEnergy + ")";
    }

    public EnergyRewardModel(String createdAt, int i, boolean z, RewardType type, int i2) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(type, "type");
        this.createdAt = createdAt;
        this.amount = i;
        this.addedJustNow = z;
        this.type = type;
        this.currentEnergy = i2;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final boolean getAddedJustNow() {
        return this.addedJustNow;
    }

    public final RewardType getType() {
        return this.type;
    }

    public final int getCurrentEnergy() {
        return this.currentEnergy;
    }
}
