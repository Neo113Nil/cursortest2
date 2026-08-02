package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: VarietyBetRestrictionsConfigModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lorg/betup/model/remote/entity/user/VarietyBetRestrictionRuleModel;", "", "id", "", "enabled", "", "paramTIds", "", "", "minStakeBetcoins", "enforcementEnabled", "visibility", "Lorg/betup/model/remote/entity/user/VarietyBetRestrictionVisibilityModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ZLjava/util/List;JZLorg/betup/model/remote/entity/user/VarietyBetRestrictionVisibilityModel;)V", "getId", "()Ljava/lang/String;", "getEnabled", "()Z", "getParamTIds", "()Ljava/util/List;", "getMinStakeBetcoins", "()J", "getEnforcementEnabled", "getVisibility", "()Lorg/betup/model/remote/entity/user/VarietyBetRestrictionVisibilityModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VarietyBetRestrictionRuleModel {
    public static final int $stable = 8;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("enforcementEnabled")
    private final boolean enforcementEnabled;

    @SerializedName("id")
    private final String id;

    @SerializedName("minStakeBetcoins")
    private final long minStakeBetcoins;

    @SerializedName("paramTIds")
    private final List<Long> paramTIds;

    @SerializedName("visibility")
    private final VarietyBetRestrictionVisibilityModel visibility;

    public static /* synthetic */ VarietyBetRestrictionRuleModel copy$default(VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel, String str, boolean z, List list, long j, boolean z2, VarietyBetRestrictionVisibilityModel varietyBetRestrictionVisibilityModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = varietyBetRestrictionRuleModel.id;
        }
        if ((i & 2) != 0) {
            z = varietyBetRestrictionRuleModel.enabled;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            list = varietyBetRestrictionRuleModel.paramTIds;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            j = varietyBetRestrictionRuleModel.minStakeBetcoins;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            z2 = varietyBetRestrictionRuleModel.enforcementEnabled;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            varietyBetRestrictionVisibilityModel = varietyBetRestrictionRuleModel.visibility;
        }
        return varietyBetRestrictionRuleModel.copy(str, z3, list2, j2, z4, varietyBetRestrictionVisibilityModel);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<Long> component3() {
        return this.paramTIds;
    }

    /* renamed from: component4, reason: from getter */
    public final long getMinStakeBetcoins() {
        return this.minStakeBetcoins;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnforcementEnabled() {
        return this.enforcementEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final VarietyBetRestrictionVisibilityModel getVisibility() {
        return this.visibility;
    }

    public final VarietyBetRestrictionRuleModel copy(String id, boolean enabled, List<Long> paramTIds, long minStakeBetcoins, boolean enforcementEnabled, VarietyBetRestrictionVisibilityModel visibility) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new VarietyBetRestrictionRuleModel(id, enabled, paramTIds, minStakeBetcoins, enforcementEnabled, visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VarietyBetRestrictionRuleModel)) {
            return false;
        }
        VarietyBetRestrictionRuleModel varietyBetRestrictionRuleModel = (VarietyBetRestrictionRuleModel) other;
        return Intrinsics.areEqual(this.id, varietyBetRestrictionRuleModel.id) && this.enabled == varietyBetRestrictionRuleModel.enabled && Intrinsics.areEqual(this.paramTIds, varietyBetRestrictionRuleModel.paramTIds) && this.minStakeBetcoins == varietyBetRestrictionRuleModel.minStakeBetcoins && this.enforcementEnabled == varietyBetRestrictionRuleModel.enforcementEnabled && Intrinsics.areEqual(this.visibility, varietyBetRestrictionRuleModel.visibility);
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
        List<Long> list = this.paramTIds;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.minStakeBetcoins)) * 31) + Boolean.hashCode(this.enforcementEnabled)) * 31) + this.visibility.hashCode();
    }

    public String toString() {
        return "VarietyBetRestrictionRuleModel(id=" + this.id + ", enabled=" + this.enabled + ", paramTIds=" + this.paramTIds + ", minStakeBetcoins=" + this.minStakeBetcoins + ", enforcementEnabled=" + this.enforcementEnabled + ", visibility=" + this.visibility + ")";
    }

    public VarietyBetRestrictionRuleModel(String id, boolean z, List<Long> list, long j, boolean z2, VarietyBetRestrictionVisibilityModel visibility) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.id = id;
        this.enabled = z;
        this.paramTIds = list;
        this.minStakeBetcoins = j;
        this.enforcementEnabled = z2;
        this.visibility = visibility;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<Long> getParamTIds() {
        return this.paramTIds;
    }

    public final long getMinStakeBetcoins() {
        return this.minStakeBetcoins;
    }

    public final boolean getEnforcementEnabled() {
        return this.enforcementEnabled;
    }

    public final VarietyBetRestrictionVisibilityModel getVisibility() {
        return this.visibility;
    }

    public /* synthetic */ VarietyBetRestrictionRuleModel(String str, boolean z, List list, long j, boolean z2, VarietyBetRestrictionVisibilityModel varietyBetRestrictionVisibilityModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? 1000L : j, (i & 16) == 0 ? z2 : true, (i & 32) != 0 ? new VarietyBetRestrictionVisibilityModel(false, false, false, 7, null) : varietyBetRestrictionVisibilityModel);
    }
}
