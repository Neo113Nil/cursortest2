package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopLayoutModel;", "", "sections", "", "Lorg/betup/model/remote/entity/shop/ShopLayoutSectionModel;", "activeEntitlements", "Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "shopV2Enabled", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/util/List;Z)V", "getSections", "()Ljava/util/List;", "getActiveEntitlements", "getShopV2Enabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShopLayoutModel {
    public static final int $stable = 8;

    @SerializedName("active_entitlements")
    private final List<ShopEntitlementModel> activeEntitlements;

    @SerializedName("sections")
    private final List<ShopLayoutSectionModel> sections;

    @SerializedName("shop_v2_enabled")
    private final boolean shopV2Enabled;

    public ShopLayoutModel() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopLayoutModel copy$default(ShopLayoutModel shopLayoutModel, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shopLayoutModel.sections;
        }
        if ((i & 2) != 0) {
            list2 = shopLayoutModel.activeEntitlements;
        }
        if ((i & 4) != 0) {
            z = shopLayoutModel.shopV2Enabled;
        }
        return shopLayoutModel.copy(list, list2, z);
    }

    public final List<ShopLayoutSectionModel> component1() {
        return this.sections;
    }

    public final List<ShopEntitlementModel> component2() {
        return this.activeEntitlements;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShopV2Enabled() {
        return this.shopV2Enabled;
    }

    public final ShopLayoutModel copy(List<ShopLayoutSectionModel> sections, List<ShopEntitlementModel> activeEntitlements, boolean shopV2Enabled) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(activeEntitlements, "activeEntitlements");
        return new ShopLayoutModel(sections, activeEntitlements, shopV2Enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopLayoutModel)) {
            return false;
        }
        ShopLayoutModel shopLayoutModel = (ShopLayoutModel) other;
        return Intrinsics.areEqual(this.sections, shopLayoutModel.sections) && Intrinsics.areEqual(this.activeEntitlements, shopLayoutModel.activeEntitlements) && this.shopV2Enabled == shopLayoutModel.shopV2Enabled;
    }

    public int hashCode() {
        return (((this.sections.hashCode() * 31) + this.activeEntitlements.hashCode()) * 31) + Boolean.hashCode(this.shopV2Enabled);
    }

    public String toString() {
        return "ShopLayoutModel(sections=" + this.sections + ", activeEntitlements=" + this.activeEntitlements + ", shopV2Enabled=" + this.shopV2Enabled + ")";
    }

    public ShopLayoutModel(List<ShopLayoutSectionModel> sections, List<ShopEntitlementModel> activeEntitlements, boolean z) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(activeEntitlements, "activeEntitlements");
        this.sections = sections;
        this.activeEntitlements = activeEntitlements;
        this.shopV2Enabled = z;
    }

    public /* synthetic */ ShopLayoutModel(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z);
    }

    public final List<ShopLayoutSectionModel> getSections() {
        return this.sections;
    }

    public final List<ShopEntitlementModel> getActiveEntitlements() {
        return this.activeEntitlements;
    }

    public final boolean getShopV2Enabled() {
        return this.shopV2Enabled;
    }
}
