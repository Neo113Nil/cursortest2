package org.betup.ui.fragment.shop.compose;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.betup.model.remote.entity.shop.ShopBadgeType;
import org.betup.model.remote.entity.shop.ShopDisplaySection;

/* compiled from: ShopCardBorderStyle.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"shopCardBorderForSection", "Lorg/betup/ui/fragment/shop/compose/ShopCardBorderStyle;", "section", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "shopCardBorderForItem", "displaySection", "badgeType", "Lorg/betup/model/remote/entity/shop/ShopBadgeType;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopCardBorderStyleKt {

    /* compiled from: ShopCardBorderStyle.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShopDisplaySection.values().length];
            try {
                iArr[ShopDisplaySection.FIRST_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopDisplaySection.DAILY_DEALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopDisplaySection.BUNDLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShopDisplaySection.COIN_PACKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShopDisplaySection.FREE_REWARDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ShopCardBorderStyle shopCardBorderForSection(ShopDisplaySection shopDisplaySection) {
        int i = shopDisplaySection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[shopDisplaySection.ordinal()];
        if (i == -1) {
            return ShopCardBorderStyle.Default;
        }
        if (i == 1) {
            return ShopCardBorderStyle.FirstPurchase;
        }
        if (i == 2) {
            return ShopCardBorderStyle.DailyDeal;
        }
        if (i == 3) {
            return ShopCardBorderStyle.Bundle;
        }
        if (i == 4) {
            return ShopCardBorderStyle.CoinPack;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return ShopCardBorderStyle.Default;
    }

    public static final ShopCardBorderStyle shopCardBorderForItem(ShopDisplaySection shopDisplaySection, ShopBadgeType shopBadgeType) {
        return shopBadgeType == ShopBadgeType.BONUS_PCT_50 ? ShopCardBorderStyle.BestValue : shopCardBorderForSection(shopDisplaySection);
    }
}
