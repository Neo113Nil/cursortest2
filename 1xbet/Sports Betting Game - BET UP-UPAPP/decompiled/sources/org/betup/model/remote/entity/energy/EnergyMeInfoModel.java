package org.betup.model.remote.entity.energy;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: EnergyMeInfoModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lorg/betup/model/remote/entity/energy/EnergyMeInfoModel;", "", "userId", "", "currentEnergy", "maxEnergy", "recoverySpeed", "activeBoosters", "", "Lorg/betup/model/remote/entity/energy/BoosterModel;", "nextUpdate", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJJJLjava/util/List;Ljava/lang/String;)V", "getUserId", "()J", "getCurrentEnergy", "setCurrentEnergy", "(J)V", "getMaxEnergy", "setMaxEnergy", "getRecoverySpeed", "getActiveBoosters", "()Ljava/util/List;", "getNextUpdate", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EnergyMeInfoModel {
    public static final int $stable = 8;

    @SerializedName("activeBoosters")
    private final List<BoosterModel> activeBoosters;

    @SerializedName("current_energy")
    private long currentEnergy;

    @SerializedName("max_energy")
    private long maxEnergy;

    @SerializedName("nextUpdate")
    private final String nextUpdate;

    @SerializedName("recovery_speed")
    private final long recoverySpeed;

    @SerializedName("userId")
    private final long userId;

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCurrentEnergy() {
        return this.currentEnergy;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaxEnergy() {
        return this.maxEnergy;
    }

    /* renamed from: component4, reason: from getter */
    public final long getRecoverySpeed() {
        return this.recoverySpeed;
    }

    public final List<BoosterModel> component5() {
        return this.activeBoosters;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNextUpdate() {
        return this.nextUpdate;
    }

    public final EnergyMeInfoModel copy(long userId, long currentEnergy, long maxEnergy, long recoverySpeed, List<BoosterModel> activeBoosters, String nextUpdate) {
        Intrinsics.checkNotNullParameter(activeBoosters, "activeBoosters");
        Intrinsics.checkNotNullParameter(nextUpdate, "nextUpdate");
        return new EnergyMeInfoModel(userId, currentEnergy, maxEnergy, recoverySpeed, activeBoosters, nextUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergyMeInfoModel)) {
            return false;
        }
        EnergyMeInfoModel energyMeInfoModel = (EnergyMeInfoModel) other;
        return this.userId == energyMeInfoModel.userId && this.currentEnergy == energyMeInfoModel.currentEnergy && this.maxEnergy == energyMeInfoModel.maxEnergy && this.recoverySpeed == energyMeInfoModel.recoverySpeed && Intrinsics.areEqual(this.activeBoosters, energyMeInfoModel.activeBoosters) && Intrinsics.areEqual(this.nextUpdate, energyMeInfoModel.nextUpdate);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.userId) * 31) + Long.hashCode(this.currentEnergy)) * 31) + Long.hashCode(this.maxEnergy)) * 31) + Long.hashCode(this.recoverySpeed)) * 31) + this.activeBoosters.hashCode()) * 31) + this.nextUpdate.hashCode();
    }

    public String toString() {
        return "EnergyMeInfoModel(userId=" + this.userId + ", currentEnergy=" + this.currentEnergy + ", maxEnergy=" + this.maxEnergy + ", recoverySpeed=" + this.recoverySpeed + ", activeBoosters=" + this.activeBoosters + ", nextUpdate=" + this.nextUpdate + ")";
    }

    public EnergyMeInfoModel(long j, long j2, long j3, long j4, List<BoosterModel> activeBoosters, String nextUpdate) {
        Intrinsics.checkNotNullParameter(activeBoosters, "activeBoosters");
        Intrinsics.checkNotNullParameter(nextUpdate, "nextUpdate");
        this.userId = j;
        this.currentEnergy = j2;
        this.maxEnergy = j3;
        this.recoverySpeed = j4;
        this.activeBoosters = activeBoosters;
        this.nextUpdate = nextUpdate;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getCurrentEnergy() {
        return this.currentEnergy;
    }

    public final void setCurrentEnergy(long j) {
        this.currentEnergy = j;
    }

    public final long getMaxEnergy() {
        return this.maxEnergy;
    }

    public final void setMaxEnergy(long j) {
        this.maxEnergy = j;
    }

    public final long getRecoverySpeed() {
        return this.recoverySpeed;
    }

    public final List<BoosterModel> getActiveBoosters() {
        return this.activeBoosters;
    }

    public final String getNextUpdate() {
        return this.nextUpdate;
    }
}
