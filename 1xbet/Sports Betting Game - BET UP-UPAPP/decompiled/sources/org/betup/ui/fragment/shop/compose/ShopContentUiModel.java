package org.betup.ui.fragment.shop.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopUiModels.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopContentUiModel;", "", "sections", "", "Lorg/betup/ui/fragment/shop/compose/ShopSectionUiModel;", "videoReward", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "entitlements", "Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "shopV2Enabled", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;Ljava/util/List;Z)V", "getSections", "()Ljava/util/List;", "getVideoReward", "()Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "getEntitlements", "getShopV2Enabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopContentUiModel {
    public static final int $stable = 8;
    private final List<ShopEntitlementModel> entitlements;
    private final List<ShopSectionUiModel> sections;
    private final boolean shopV2Enabled;
    private final ShopItemDataModel videoReward;

    public ShopContentUiModel() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopContentUiModel copy$default(ShopContentUiModel shopContentUiModel, List list, ShopItemDataModel shopItemDataModel, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shopContentUiModel.sections;
        }
        if ((i & 2) != 0) {
            shopItemDataModel = shopContentUiModel.videoReward;
        }
        if ((i & 4) != 0) {
            list2 = shopContentUiModel.entitlements;
        }
        if ((i & 8) != 0) {
            z = shopContentUiModel.shopV2Enabled;
        }
        return shopContentUiModel.copy(list, shopItemDataModel, list2, z);
    }

    public final List<ShopSectionUiModel> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final ShopItemDataModel getVideoReward() {
        return this.videoReward;
    }

    public final List<ShopEntitlementModel> component3() {
        return this.entitlements;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShopV2Enabled() {
        return this.shopV2Enabled;
    }

    public final ShopContentUiModel copy(List<ShopSectionUiModel> sections, ShopItemDataModel videoReward, List<ShopEntitlementModel> entitlements, boolean shopV2Enabled) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        return new ShopContentUiModel(sections, videoReward, entitlements, shopV2Enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopContentUiModel)) {
            return false;
        }
        ShopContentUiModel shopContentUiModel = (ShopContentUiModel) other;
        return Intrinsics.areEqual(this.sections, shopContentUiModel.sections) && Intrinsics.areEqual(this.videoReward, shopContentUiModel.videoReward) && Intrinsics.areEqual(this.entitlements, shopContentUiModel.entitlements) && this.shopV2Enabled == shopContentUiModel.shopV2Enabled;
    }

    public int hashCode() {
        int hashCode = this.sections.hashCode() * 31;
        ShopItemDataModel shopItemDataModel = this.videoReward;
        return ((((hashCode + (shopItemDataModel == null ? 0 : shopItemDataModel.hashCode())) * 31) + this.entitlements.hashCode()) * 31) + Boolean.hashCode(this.shopV2Enabled);
    }

    public String toString() {
        return "ShopContentUiModel(sections=" + this.sections + ", videoReward=" + this.videoReward + ", entitlements=" + this.entitlements + ", shopV2Enabled=" + this.shopV2Enabled + ")";
    }

    public ShopContentUiModel(List<ShopSectionUiModel> sections, ShopItemDataModel shopItemDataModel, List<ShopEntitlementModel> entitlements, boolean z) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        this.sections = sections;
        this.videoReward = shopItemDataModel;
        this.entitlements = entitlements;
        this.shopV2Enabled = z;
    }

    public /* synthetic */ ShopContentUiModel(List list, ShopItemDataModel shopItemDataModel, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : shopItemDataModel, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? false : z);
    }

    public final List<ShopSectionUiModel> getSections() {
        return this.sections;
    }

    public final ShopItemDataModel getVideoReward() {
        return this.videoReward;
    }

    public final List<ShopEntitlementModel> getEntitlements() {
        return this.entitlements;
    }

    public final boolean getShopV2Enabled() {
        return this.shopV2Enabled;
    }
}
