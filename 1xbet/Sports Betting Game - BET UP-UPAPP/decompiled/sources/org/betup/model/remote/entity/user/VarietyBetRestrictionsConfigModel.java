package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3731tg;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: VarietyBetRestrictionsConfigModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/user/VarietyBetRestrictionsConfigModel;", "", "version", "", "globalEnabled", "", "rules", "", "Lorg/betup/model/remote/entity/user/VarietyBetRestrictionRuleModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IZLjava/util/List;)V", C3731tg.b, "()I", "getGlobalEnabled", "()Z", "getRules", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VarietyBetRestrictionsConfigModel {
    public static final int $stable = 8;

    @SerializedName("globalEnabled")
    private final boolean globalEnabled;

    @SerializedName("rules")
    private final List<VarietyBetRestrictionRuleModel> rules;

    @SerializedName("version")
    private final int version;

    public VarietyBetRestrictionsConfigModel() {
        this(0, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VarietyBetRestrictionsConfigModel copy$default(VarietyBetRestrictionsConfigModel varietyBetRestrictionsConfigModel, int i, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = varietyBetRestrictionsConfigModel.version;
        }
        if ((i2 & 2) != 0) {
            z = varietyBetRestrictionsConfigModel.globalEnabled;
        }
        if ((i2 & 4) != 0) {
            list = varietyBetRestrictionsConfigModel.rules;
        }
        return varietyBetRestrictionsConfigModel.copy(i, z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getGlobalEnabled() {
        return this.globalEnabled;
    }

    public final List<VarietyBetRestrictionRuleModel> component3() {
        return this.rules;
    }

    public final VarietyBetRestrictionsConfigModel copy(int version, boolean globalEnabled, List<VarietyBetRestrictionRuleModel> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        return new VarietyBetRestrictionsConfigModel(version, globalEnabled, rules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VarietyBetRestrictionsConfigModel)) {
            return false;
        }
        VarietyBetRestrictionsConfigModel varietyBetRestrictionsConfigModel = (VarietyBetRestrictionsConfigModel) other;
        return this.version == varietyBetRestrictionsConfigModel.version && this.globalEnabled == varietyBetRestrictionsConfigModel.globalEnabled && Intrinsics.areEqual(this.rules, varietyBetRestrictionsConfigModel.rules);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.version) * 31) + Boolean.hashCode(this.globalEnabled)) * 31) + this.rules.hashCode();
    }

    public String toString() {
        return "VarietyBetRestrictionsConfigModel(version=" + this.version + ", globalEnabled=" + this.globalEnabled + ", rules=" + this.rules + ")";
    }

    public VarietyBetRestrictionsConfigModel(int i, boolean z, List<VarietyBetRestrictionRuleModel> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.version = i;
        this.globalEnabled = z;
        this.rules = rules;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean getGlobalEnabled() {
        return this.globalEnabled;
    }

    public /* synthetic */ VarietyBetRestrictionsConfigModel(int i, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<VarietyBetRestrictionRuleModel> getRules() {
        return this.rules;
    }
}
