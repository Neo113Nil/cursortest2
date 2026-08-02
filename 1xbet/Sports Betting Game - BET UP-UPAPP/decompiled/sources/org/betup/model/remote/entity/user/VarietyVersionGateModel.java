package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: VarietyVersionGatesConfigModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018Jd\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018¨\u0006)"}, d2 = {"Lorg/betup/model/remote/entity/user/VarietyVersionGateModel;", "", "id", "", "enabled", "", "paramTIds", "", "", "minAppVersion", "maxAppVersion", "minBuildNumber", "maxBuildNumber", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getEnabled", "()Z", "getParamTIds", "()Ljava/util/List;", "getMinAppVersion", "getMaxAppVersion", "getMinBuildNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxBuildNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lorg/betup/model/remote/entity/user/VarietyVersionGateModel;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VarietyVersionGateModel {
    public static final int $stable = 8;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("id")
    private final String id;

    @SerializedName("maxAppVersion")
    private final String maxAppVersion;

    @SerializedName("maxBuildNumber")
    private final Long maxBuildNumber;

    @SerializedName("minAppVersion")
    private final String minAppVersion;

    @SerializedName("minBuildNumber")
    private final Long minBuildNumber;

    @SerializedName("paramTIds")
    private final List<Long> paramTIds;

    public VarietyVersionGateModel() {
        this(null, false, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ VarietyVersionGateModel copy$default(VarietyVersionGateModel varietyVersionGateModel, String str, boolean z, List list, String str2, String str3, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = varietyVersionGateModel.id;
        }
        if ((i & 2) != 0) {
            z = varietyVersionGateModel.enabled;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = varietyVersionGateModel.paramTIds;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = varietyVersionGateModel.minAppVersion;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = varietyVersionGateModel.maxAppVersion;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            l = varietyVersionGateModel.minBuildNumber;
        }
        Long l3 = l;
        if ((i & 64) != 0) {
            l2 = varietyVersionGateModel.maxBuildNumber;
        }
        return varietyVersionGateModel.copy(str, z2, list2, str4, str5, l3, l2);
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
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMaxAppVersion() {
        return this.maxAppVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getMinBuildNumber() {
        return this.minBuildNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getMaxBuildNumber() {
        return this.maxBuildNumber;
    }

    public final VarietyVersionGateModel copy(String id, boolean enabled, List<Long> paramTIds, String minAppVersion, String maxAppVersion, Long minBuildNumber, Long maxBuildNumber) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new VarietyVersionGateModel(id, enabled, paramTIds, minAppVersion, maxAppVersion, minBuildNumber, maxBuildNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VarietyVersionGateModel)) {
            return false;
        }
        VarietyVersionGateModel varietyVersionGateModel = (VarietyVersionGateModel) other;
        return Intrinsics.areEqual(this.id, varietyVersionGateModel.id) && this.enabled == varietyVersionGateModel.enabled && Intrinsics.areEqual(this.paramTIds, varietyVersionGateModel.paramTIds) && Intrinsics.areEqual(this.minAppVersion, varietyVersionGateModel.minAppVersion) && Intrinsics.areEqual(this.maxAppVersion, varietyVersionGateModel.maxAppVersion) && Intrinsics.areEqual(this.minBuildNumber, varietyVersionGateModel.minBuildNumber) && Intrinsics.areEqual(this.maxBuildNumber, varietyVersionGateModel.maxBuildNumber);
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
        List<Long> list = this.paramTIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.minAppVersion;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxAppVersion;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.minBuildNumber;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maxBuildNumber;
        return hashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "VarietyVersionGateModel(id=" + this.id + ", enabled=" + this.enabled + ", paramTIds=" + this.paramTIds + ", minAppVersion=" + this.minAppVersion + ", maxAppVersion=" + this.maxAppVersion + ", minBuildNumber=" + this.minBuildNumber + ", maxBuildNumber=" + this.maxBuildNumber + ")";
    }

    public VarietyVersionGateModel(String id, boolean z, List<Long> list, String str, String str2, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.enabled = z;
        this.paramTIds = list;
        this.minAppVersion = str;
        this.maxAppVersion = str2;
        this.minBuildNumber = l;
        this.maxBuildNumber = l2;
    }

    public /* synthetic */ VarietyVersionGateModel(String str, boolean z, List list, String str2, String str3, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l, (i & 64) == 0 ? l2 : null);
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

    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final String getMaxAppVersion() {
        return this.maxAppVersion;
    }

    public final Long getMinBuildNumber() {
        return this.minBuildNumber;
    }

    public final Long getMaxBuildNumber() {
        return this.maxBuildNumber;
    }
}
