package org.betup.ui.fragment.shop.compose;

import com.google.android.material.internal.ViewUtils;
import com.ironsource.V2;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.betup.model.remote.entity.shop.EntitlementStatus;
import org.betup.model.remote.entity.shop.ShopBadgeType;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.ui.fragment.shop.ShopItemType;
import org.betup.ui.fragment.shop.compose.ShopItemDataModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopPreviewSamples.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopPreviewSamples;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "firstPurchase", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "getFirstPurchase", "()Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "dailyDeal", "getDailyDeal", "bundle30", "getBundle30", "bundleSeason", "getBundleSeason", "coinPacks", "", "getCoinPacks", "()Ljava/util/List;", "bundle30WithEntitlement", "getBundle30WithEntitlement", "videoReward", "getVideoReward", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopPreviewSamples {
    public static final int $stable;
    private static final ShopItemDataModel bundle30;
    private static final ShopItemDataModel bundle30WithEntitlement;
    private static final ShopItemDataModel bundleSeason;
    private static final List<ShopItemDataModel> coinPacks;
    private static final ShopItemDataModel videoReward;
    public static final ShopPreviewSamples INSTANCE = new ShopPreviewSamples();
    private static final ShopItemDataModel firstPurchase = new ShopItemDataModel(1, ShopItemType.Banner, "FIRST PURCHASE OFFER", "3X BONUS", 300000, "$4.99", null, "", "3X", false, false, null, 0, 0, "new_shop_small_banner", null, null, ShopDisplaySection.FIRST_PURCHASE, null, null, null, null, false, null, Long.valueOf(System.currentTimeMillis() + 165600000), 0, null, null, null, 0, 1056816704, null);
    private static final ShopItemDataModel dailyDeal = new ShopItemDataModel(2, ShopItemType.Banner, "", "", 250000, "$2.99", "$9.99", "", "X10", true, false, null, 0, 0, "new_shop_no_ads", Double.valueOf(10.0d), 7, ShopDisplaySection.DAILY_DEALS, null, null, null, null, true, null, null, 70, null, null, null, 0, 1035746304, null);

    private ShopPreviewSamples() {
    }

    static {
        ShopItemDataModel copy;
        ShopItemDataModel shopItemDataModel = new ShopItemDataModel(3L, ShopItemType.Regular, "30 Day Boost", "Daily bonus & extra coins!", 750000L, "$9.99", null, "", null, false, false, null, 0, 0, "new_shop_big_package", null, null, ShopDisplaySection.BUNDLES, null, null, null, null, false, 30, null, 0, null, null, null, 0, 1065205568, null);
        bundle30 = shopItemDataModel;
        bundleSeason = new ShopItemDataModel(4L, ShopItemType.Regular, "Season Pass", "Big rewards for serious players!", SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, "$19.99", null, "", null, false, false, null, 0, 0, "new_shop_season_pass", null, null, ShopDisplaySection.BUNDLES, null, null, null, null, false, 90, null, 0, null, null, null, 0, 1065205568, null);
        coinPacks = CollectionsKt.listOf((Object[]) new ShopItemDataModel[]{new ShopItemDataModel(5L, ShopItemType.Regular, "Starter", "", 50000L, "$2.99", null, "", null, false, false, null, 0, 0, "new_shop_small_package", null, null, ShopDisplaySection.COIN_PACKS, null, null, "$0.060/1000", null, false, null, null, 0, null, null, null, 0, 1072545600, null), new ShopItemDataModel(6L, ShopItemType.Regular, "New", "", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, "$4.99", null, "", null, false, false, null, 0, 0, "new_shop_medium_package", null, null, ShopDisplaySection.COIN_PACKS, null, ShopBadgeType.NEW, "$0.050/1000", null, false, null, null, 0, null, null, null, 0, 1072021312, null), new ShopItemDataModel(7L, ShopItemType.Regular, "Most Popular", "", 400000L, "$14.99", null, "", null, true, false, null, 0, 0, "new_shop_large_package", null, null, ShopDisplaySection.COIN_PACKS, null, ShopBadgeType.BONUS_PCT_20, "$0.037/1000", null, false, null, null, 0, null, null, null, 0, 1072020800, null), new ShopItemDataModel(8L, ShopItemType.Regular, "Best Value", "", SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, "$49.99", null, "", null, false, false, null, 0, 0, "new_shop_best_value", null, null, ShopDisplaySection.COIN_PACKS, null, ShopBadgeType.BONUS_PCT_50, "$0.025/1000", null, false, null, null, 0, null, null, null, 0, 1072021312, null)});
        copy = shopItemDataModel.copy((r50 & 1) != 0 ? shopItemDataModel.id : 0L, (r50 & 2) != 0 ? shopItemDataModel.type : null, (r50 & 4) != 0 ? shopItemDataModel.title : null, (r50 & 8) != 0 ? shopItemDataModel.description : null, (r50 & 16) != 0 ? shopItemDataModel.amount : 0L, (r50 & 32) != 0 ? shopItemDataModel.price : null, (r50 & 64) != 0 ? shopItemDataModel.oldPrice : null, (r50 & 128) != 0 ? shopItemDataModel.imgUrl : null, (r50 & 256) != 0 ? shopItemDataModel.multiplier : null, (r50 & 512) != 0 ? shopItemDataModel.popular : false, (r50 & 1024) != 0 ? shopItemDataModel.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? shopItemDataModel.videoOfferPhase : null, (r50 & 4096) != 0 ? shopItemDataModel.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? shopItemDataModel.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? shopItemDataModel.storeCode : null, (r50 & 32768) != 0 ? shopItemDataModel.effectCoef : null, (r50 & 65536) != 0 ? shopItemDataModel.effectDuration : null, (r50 & 131072) != 0 ? shopItemDataModel.displaySection : null, (r50 & 262144) != 0 ? shopItemDataModel.displayLabel : null, (r50 & 524288) != 0 ? shopItemDataModel.badgeType : null, (r50 & 1048576) != 0 ? shopItemDataModel.unitPriceLabel : null, (r50 & 2097152) != 0 ? shopItemDataModel.entitlement : new ShopEntitlementModel(1L, 3L, "new_shop_big_package", V2.h, 30, 2, 1, EntitlementStatus.ACTIVE, null, null, true, ViewUtils.EDGE_TO_EDGE_FLAGS, null), (r50 & 4194304) != 0 ? shopItemDataModel.noAds : false, (r50 & 8388608) != 0 ? shopItemDataModel.packageDays : null, (r50 & 16777216) != 0 ? shopItemDataModel.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? shopItemDataModel.discountPercent : 0, (r50 & 67108864) != 0 ? shopItemDataModel.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? shopItemDataModel.htmlContent : null, (r50 & 268435456) != 0 ? shopItemDataModel.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? shopItemDataModel.columnsInRow : 0);
        bundle30WithEntitlement = copy;
        videoReward = ShopItemDataModel.Companion.createVideoReward$default(ShopItemDataModel.INSTANCE, 500L, true, null, 2, 5, 4, null);
        $stable = 8;
    }

    public final ShopItemDataModel getFirstPurchase() {
        return firstPurchase;
    }

    public final ShopItemDataModel getDailyDeal() {
        return dailyDeal;
    }

    public final ShopItemDataModel getBundle30() {
        return bundle30;
    }

    public final ShopItemDataModel getBundleSeason() {
        return bundleSeason;
    }

    public final List<ShopItemDataModel> getCoinPacks() {
        return coinPacks;
    }

    public final ShopItemDataModel getBundle30WithEntitlement() {
        return bundle30WithEntitlement;
    }

    public final ShopItemDataModel getVideoReward() {
        return videoReward;
    }
}
