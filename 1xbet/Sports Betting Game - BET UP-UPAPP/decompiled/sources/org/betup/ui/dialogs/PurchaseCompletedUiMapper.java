package org.betup.ui.dialogs;

import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.model.remote.entity.shop.ShopRewardType;
import org.betup.ui.fragment.shop.compose.ShopItemDataModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PurchaseCompletedUiModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rJ\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\"\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\"\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/dialogs/PurchaseCompletedUiMapper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "fromDailyClaim", "Lorg/betup/ui/dialogs/PurchaseCompletedUiModel;", "item", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "claimedAmount", "", "fromInstantAmount", "amount", "fromShopItem", "Lorg/betup/model/remote/entity/shop/NewShopItemModel;", "buildInstantModel", "title", "", UnifiedMediationParams.KEY_ICON_URL, "buildDailyPackageModel", "buildHybridModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseCompletedUiMapper {
    public static final int $stable = 0;
    public static final PurchaseCompletedUiMapper INSTANCE = new PurchaseCompletedUiMapper();

    /* compiled from: PurchaseCompletedUiModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShopRewardType.values().length];
            try {
                iArr[ShopRewardType.DAILY_COIN_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopRewardType.HYBRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopRewardType.EFFECT_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShopRewardType.INSTANT_COINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PurchaseCompletedUiMapper() {
    }

    public final PurchaseCompletedUiModel fromDailyClaim(ShopItemDataModel item, long claimedAmount) {
        Intrinsics.checkNotNullParameter(item, "item");
        String title = item.getTitle();
        if (StringsKt.isBlank(title)) {
            title = item.getDescription();
        }
        String str = title;
        String imgUrl = item.getImgUrl();
        if (StringsKt.isBlank(imgUrl)) {
            imgUrl = null;
        }
        return new PurchaseCompletedUiModel(str, imgUrl, PurchaseCompletedKind.DAILY_CLAIM, claimedAmount, 0L, 0L, null, 0L, null, 496, null);
    }

    public final PurchaseCompletedUiModel fromInstantAmount(long amount) {
        return new PurchaseCompletedUiModel(null, null, PurchaseCompletedKind.INSTANT, amount, 0L, 0L, null, 0L, null, 499, null);
    }

    public final PurchaseCompletedUiModel fromShopItem(NewShopItemModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ShopItemDataModel fromNewShopItemModel$default = ShopItemDataModel.Companion.fromNewShopItemModel$default(ShopItemDataModel.INSTANCE, item, null, 2, null);
        String title = fromNewShopItemModel$default.getTitle();
        if (StringsKt.isBlank(title)) {
            title = fromNewShopItemModel$default.getDescription();
        }
        String str = title;
        String icon = item.getIcon();
        String str2 = !StringsKt.isBlank(icon) ? icon : null;
        ShopRewardType rewardType = item.getRewardType();
        if (rewardType == null) {
            rewardType = ShopRewardType.INSTANT_COINS;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[rewardType.ordinal()];
        if (i == 1) {
            return buildDailyPackageModel(item, str, str2);
        }
        if (i == 2) {
            return buildHybridModel(item, str, str2);
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return buildInstantModel(item, str, str2);
        }
        PurchaseCompletedKind purchaseCompletedKind = PurchaseCompletedKind.EFFECT;
        String description = fromNewShopItemModel$default.getDescription();
        if (StringsKt.isBlank(description)) {
            description = str;
        }
        return new PurchaseCompletedUiModel(str, str2, purchaseCompletedKind, 0L, 0L, 0L, null, 0L, description, 248, null);
    }

    private final PurchaseCompletedUiModel buildInstantModel(NewShopItemModel item, String title, String iconUrl) {
        long instantCoins = item.getInstantCoins() > 0 ? item.getInstantCoins() : item.getBetcoins();
        return new PurchaseCompletedUiModel(title, iconUrl, PurchaseCompletedKind.INSTANT, instantCoins, item.getBonus(), 0L, null, instantCoins + item.getBonus(), null, 352, null);
    }

    private final PurchaseCompletedUiModel buildDailyPackageModel(NewShopItemModel item, String title, String iconUrl) {
        Integer packageDays = item.getPackageDays();
        return new PurchaseCompletedUiModel(title, iconUrl, PurchaseCompletedKind.DAILY_PACKAGE, item.getInstantCoins(), 0L, item.getDailyCoins(), packageDays, item.getDisplayTotalCoins() > 0 ? item.getDisplayTotalCoins() : item.getInstantCoins() + ((packageDays == null || packageDays.intValue() <= 0) ? 0L : item.getDailyCoins() * packageDays.intValue()), null, 272, null);
    }

    private final PurchaseCompletedUiModel buildHybridModel(NewShopItemModel item, String title, String iconUrl) {
        Integer packageDays = item.getPackageDays();
        long dailyCoins = (packageDays == null || packageDays.intValue() <= 0) ? 0L : item.getDailyCoins() * packageDays.intValue();
        long instantCoins = item.getInstantCoins() > 0 ? item.getInstantCoins() : item.getBetcoins();
        return new PurchaseCompletedUiModel(title, iconUrl, PurchaseCompletedKind.HYBRID, instantCoins, item.getBonus(), item.getDailyCoins(), packageDays, item.getDisplayTotalCoins() > 0 ? item.getDisplayTotalCoins() : item.getBonus() + instantCoins + dailyCoins, null, 256, null);
    }
}
