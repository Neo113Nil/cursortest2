package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: VarietyBetRestrictionInfoModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;", "", "ruleId", "", "minStakeBetcoins", "", "enforcementEnabled", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JZ)V", "getRuleId", "()Ljava/lang/String;", "getMinStakeBetcoins", "()J", "getEnforcementEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VarietyBetRestrictionInfoModel {
    public static final int $stable = 0;

    @SerializedName("enforcement_enabled")
    private final boolean enforcementEnabled;

    @SerializedName("min_stake_betcoins")
    private final long minStakeBetcoins;

    @SerializedName("rule_id")
    private final String ruleId;

    public VarietyBetRestrictionInfoModel() {
        this(null, 0L, false, 7, null);
    }

    public static /* synthetic */ VarietyBetRestrictionInfoModel copy$default(VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = varietyBetRestrictionInfoModel.ruleId;
        }
        if ((i & 2) != 0) {
            j = varietyBetRestrictionInfoModel.minStakeBetcoins;
        }
        if ((i & 4) != 0) {
            z = varietyBetRestrictionInfoModel.enforcementEnabled;
        }
        return varietyBetRestrictionInfoModel.copy(str, j, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMinStakeBetcoins() {
        return this.minStakeBetcoins;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnforcementEnabled() {
        return this.enforcementEnabled;
    }

    public final VarietyBetRestrictionInfoModel copy(String ruleId, long minStakeBetcoins, boolean enforcementEnabled) {
        return new VarietyBetRestrictionInfoModel(ruleId, minStakeBetcoins, enforcementEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VarietyBetRestrictionInfoModel)) {
            return false;
        }
        VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel = (VarietyBetRestrictionInfoModel) other;
        return Intrinsics.areEqual(this.ruleId, varietyBetRestrictionInfoModel.ruleId) && this.minStakeBetcoins == varietyBetRestrictionInfoModel.minStakeBetcoins && this.enforcementEnabled == varietyBetRestrictionInfoModel.enforcementEnabled;
    }

    public int hashCode() {
        String str = this.ruleId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.minStakeBetcoins)) * 31) + Boolean.hashCode(this.enforcementEnabled);
    }

    public String toString() {
        return "VarietyBetRestrictionInfoModel(ruleId=" + this.ruleId + ", minStakeBetcoins=" + this.minStakeBetcoins + ", enforcementEnabled=" + this.enforcementEnabled + ")";
    }

    public VarietyBetRestrictionInfoModel(String str, long j, boolean z) {
        this.ruleId = str;
        this.minStakeBetcoins = j;
        this.enforcementEnabled = z;
    }

    public /* synthetic */ VarietyBetRestrictionInfoModel(String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }

    public final String getRuleId() {
        return this.ruleId;
    }

    public final long getMinStakeBetcoins() {
        return this.minStakeBetcoins;
    }

    public final boolean getEnforcementEnabled() {
        return this.enforcementEnabled;
    }
}
