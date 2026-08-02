package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopRewardType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "INSTANT_COINS", "DAILY_COIN_PACKAGE", "EFFECT_ONLY", "HYBRID", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShopRewardType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShopRewardType[] $VALUES;

    @SerializedName("INSTANT_COINS")
    public static final ShopRewardType INSTANT_COINS = new ShopRewardType("INSTANT_COINS", 0);

    @SerializedName("DAILY_COIN_PACKAGE")
    public static final ShopRewardType DAILY_COIN_PACKAGE = new ShopRewardType("DAILY_COIN_PACKAGE", 1);

    @SerializedName("EFFECT_ONLY")
    public static final ShopRewardType EFFECT_ONLY = new ShopRewardType("EFFECT_ONLY", 2);

    @SerializedName("HYBRID")
    public static final ShopRewardType HYBRID = new ShopRewardType("HYBRID", 3);

    private static final /* synthetic */ ShopRewardType[] $values() {
        return new ShopRewardType[]{INSTANT_COINS, DAILY_COIN_PACKAGE, EFFECT_ONLY, HYBRID};
    }

    public static EnumEntries<ShopRewardType> getEntries() {
        return $ENTRIES;
    }

    private ShopRewardType(String str, int i) {
    }

    static {
        ShopRewardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ShopRewardType valueOf(String str) {
        return (ShopRewardType) Enum.valueOf(ShopRewardType.class, str);
    }

    public static ShopRewardType[] values() {
        return (ShopRewardType[]) $VALUES.clone();
    }
}
