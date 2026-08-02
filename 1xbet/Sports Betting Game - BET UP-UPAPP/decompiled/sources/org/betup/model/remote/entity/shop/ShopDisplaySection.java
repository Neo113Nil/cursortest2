package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "FIRST_PURCHASE", "DAILY_DEALS", "BUNDLES", "COIN_PACKS", "FREE_REWARDS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShopDisplaySection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShopDisplaySection[] $VALUES;

    @SerializedName("FIRST_PURCHASE")
    public static final ShopDisplaySection FIRST_PURCHASE = new ShopDisplaySection("FIRST_PURCHASE", 0);

    @SerializedName("DAILY_DEALS")
    public static final ShopDisplaySection DAILY_DEALS = new ShopDisplaySection("DAILY_DEALS", 1);

    @SerializedName("BUNDLES")
    public static final ShopDisplaySection BUNDLES = new ShopDisplaySection("BUNDLES", 2);

    @SerializedName("COIN_PACKS")
    public static final ShopDisplaySection COIN_PACKS = new ShopDisplaySection("COIN_PACKS", 3);

    @SerializedName("FREE_REWARDS")
    public static final ShopDisplaySection FREE_REWARDS = new ShopDisplaySection("FREE_REWARDS", 4);

    private static final /* synthetic */ ShopDisplaySection[] $values() {
        return new ShopDisplaySection[]{FIRST_PURCHASE, DAILY_DEALS, BUNDLES, COIN_PACKS, FREE_REWARDS};
    }

    public static EnumEntries<ShopDisplaySection> getEntries() {
        return $ENTRIES;
    }

    private ShopDisplaySection(String str, int i) {
    }

    static {
        ShopDisplaySection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ShopDisplaySection valueOf(String str) {
        return (ShopDisplaySection) Enum.valueOf(ShopDisplaySection.class, str);
    }

    public static ShopDisplaySection[] values() {
        return (ShopDisplaySection[]) $VALUES.clone();
    }
}
