package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.betup.model.remote.api.rest.shop.ShopRequestParams;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopBadgeType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "POPULAR", ShopRequestParams.SHOP_TYPE_NEW, "BONUS_PCT_20", "BONUS_PCT_50", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShopBadgeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShopBadgeType[] $VALUES;

    @SerializedName("POPULAR")
    public static final ShopBadgeType POPULAR = new ShopBadgeType("POPULAR", 0);

    @SerializedName(ShopRequestParams.SHOP_TYPE_NEW)
    public static final ShopBadgeType NEW = new ShopBadgeType(ShopRequestParams.SHOP_TYPE_NEW, 1);

    @SerializedName("BONUS_PCT_20")
    public static final ShopBadgeType BONUS_PCT_20 = new ShopBadgeType("BONUS_PCT_20", 2);

    @SerializedName("BONUS_PCT_50")
    public static final ShopBadgeType BONUS_PCT_50 = new ShopBadgeType("BONUS_PCT_50", 3);

    private static final /* synthetic */ ShopBadgeType[] $values() {
        return new ShopBadgeType[]{POPULAR, NEW, BONUS_PCT_20, BONUS_PCT_50};
    }

    public static EnumEntries<ShopBadgeType> getEntries() {
        return $ENTRIES;
    }

    private ShopBadgeType(String str, int i) {
    }

    static {
        ShopBadgeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ShopBadgeType valueOf(String str) {
        return (ShopBadgeType) Enum.valueOf(ShopBadgeType.class, str);
    }

    public static ShopBadgeType[] values() {
        return (ShopBadgeType[]) $VALUES.clone();
    }
}
