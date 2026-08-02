package org.betup.ui.fragment.shop.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopUiModels.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopSectionUiModel;", "", "type", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "titleRes", "", "resetAtMillis", "", "items", "", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/shop/ShopDisplaySection;ILjava/lang/Long;Ljava/util/List;)V", "getType", "()Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "getTitleRes", "()I", "getResetAtMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Lorg/betup/model/remote/entity/shop/ShopDisplaySection;ILjava/lang/Long;Ljava/util/List;)Lorg/betup/ui/fragment/shop/compose/ShopSectionUiModel;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopSectionUiModel {
    public static final int $stable = 8;
    private final List<ShopItemDataModel> items;
    private final Long resetAtMillis;
    private final int titleRes;
    private final ShopDisplaySection type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopSectionUiModel copy$default(ShopSectionUiModel shopSectionUiModel, ShopDisplaySection shopDisplaySection, int i, Long l, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shopDisplaySection = shopSectionUiModel.type;
        }
        if ((i2 & 2) != 0) {
            i = shopSectionUiModel.titleRes;
        }
        if ((i2 & 4) != 0) {
            l = shopSectionUiModel.resetAtMillis;
        }
        if ((i2 & 8) != 0) {
            list = shopSectionUiModel.items;
        }
        return shopSectionUiModel.copy(shopDisplaySection, i, l, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ShopDisplaySection getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getResetAtMillis() {
        return this.resetAtMillis;
    }

    public final List<ShopItemDataModel> component4() {
        return this.items;
    }

    public final ShopSectionUiModel copy(ShopDisplaySection type, int titleRes, Long resetAtMillis, List<ShopItemDataModel> items) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ShopSectionUiModel(type, titleRes, resetAtMillis, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopSectionUiModel)) {
            return false;
        }
        ShopSectionUiModel shopSectionUiModel = (ShopSectionUiModel) other;
        return this.type == shopSectionUiModel.type && this.titleRes == shopSectionUiModel.titleRes && Intrinsics.areEqual(this.resetAtMillis, shopSectionUiModel.resetAtMillis) && Intrinsics.areEqual(this.items, shopSectionUiModel.items);
    }

    public int hashCode() {
        int hashCode = ((this.type.hashCode() * 31) + Integer.hashCode(this.titleRes)) * 31;
        Long l = this.resetAtMillis;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "ShopSectionUiModel(type=" + this.type + ", titleRes=" + this.titleRes + ", resetAtMillis=" + this.resetAtMillis + ", items=" + this.items + ")";
    }

    public ShopSectionUiModel(ShopDisplaySection type, int i, Long l, List<ShopItemDataModel> items) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(items, "items");
        this.type = type;
        this.titleRes = i;
        this.resetAtMillis = l;
        this.items = items;
    }

    public final ShopDisplaySection getType() {
        return this.type;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final Long getResetAtMillis() {
        return this.resetAtMillis;
    }

    public /* synthetic */ ShopSectionUiModel(ShopDisplaySection shopDisplaySection, int i, Long l, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(shopDisplaySection, i, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<ShopItemDataModel> getItems() {
        return this.items;
    }
}
