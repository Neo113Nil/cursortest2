package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopLayoutSectionModel;", "", "type", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "resetAt", "", "items", "", "Lorg/betup/model/remote/entity/shop/NewShopItemModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/shop/ShopDisplaySection;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "getResetAt", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShopLayoutSectionModel {
    public static final int $stable = 8;

    @SerializedName("items")
    private final List<NewShopItemModel> items;

    @SerializedName("reset_at")
    private final String resetAt;

    @SerializedName("type")
    private final ShopDisplaySection type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopLayoutSectionModel copy$default(ShopLayoutSectionModel shopLayoutSectionModel, ShopDisplaySection shopDisplaySection, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            shopDisplaySection = shopLayoutSectionModel.type;
        }
        if ((i & 2) != 0) {
            str = shopLayoutSectionModel.resetAt;
        }
        if ((i & 4) != 0) {
            list = shopLayoutSectionModel.items;
        }
        return shopLayoutSectionModel.copy(shopDisplaySection, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ShopDisplaySection getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResetAt() {
        return this.resetAt;
    }

    public final List<NewShopItemModel> component3() {
        return this.items;
    }

    public final ShopLayoutSectionModel copy(ShopDisplaySection type, String resetAt, List<NewShopItemModel> items) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ShopLayoutSectionModel(type, resetAt, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopLayoutSectionModel)) {
            return false;
        }
        ShopLayoutSectionModel shopLayoutSectionModel = (ShopLayoutSectionModel) other;
        return this.type == shopLayoutSectionModel.type && Intrinsics.areEqual(this.resetAt, shopLayoutSectionModel.resetAt) && Intrinsics.areEqual(this.items, shopLayoutSectionModel.items);
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.resetAt;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "ShopLayoutSectionModel(type=" + this.type + ", resetAt=" + this.resetAt + ", items=" + this.items + ")";
    }

    public ShopLayoutSectionModel(ShopDisplaySection type, String str, List<NewShopItemModel> items) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        this.type = type;
        this.resetAt = str;
        this.items = items;
    }

    public final ShopDisplaySection getType() {
        return this.type;
    }

    public final String getResetAt() {
        return this.resetAt;
    }

    public /* synthetic */ ShopLayoutSectionModel(ShopDisplaySection shopDisplaySection, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shopDisplaySection, (i & 2) != 0 ? null : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<NewShopItemModel> getItems() {
        return this.items;
    }
}
