package org.betup.model.remote.entity.shop;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.ironsource.X3;
import io.bidmachine.media3.common.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.betup.ui.fragment.shop.ShopItemType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewShopItemModel.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b*\u0010+J\b\u0010Y\u001a\u00020\u0005H\u0016J\u0006\u0010Z\u001a\u00020[J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010=J\t\u0010h\u001a\u00020\u0014HÆ\u0003J\t\u0010i\u001a\u00020\u0014HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\t\u0010k\u001a\u00020\u0014HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010q\u001a\u00020\bHÆ\u0003J\t\u0010r\u001a\u00020\bHÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010=J\t\u0010t\u001a\u00020\bHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010w\u001a\u00020'HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÔ\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010#\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020\u00142\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010/R\u0016\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010 \u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0016\u0010!\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u001a\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010>\u001a\u0004\bN\u0010=R\u0016\u0010#\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0018\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010/R\u0016\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010/\"\u0004\bU\u0010VR\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010/\"\u0004\bX\u0010V¨\u0006\u007f"}, d2 = {"Lorg/betup/model/remote/entity/shop/NewShopItemModel;", "", "id", "", X3.i.H0, "", "bonusIcon", "bonus", "", "storeCode", "oldStoreCode", "betcoins", FirebaseAnalytics.Param.DISCOUNT, "itemType", "Lorg/betup/ui/fragment/shop/ShopItemType;", "titleText", "effect", "Lorg/betup/model/remote/entity/shop/NewShopEffectModel;", "effectDuration", "noAds", "", "openBets", "color", "popular", "displaySection", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "displayOrder", "displayLabel", "badgeType", "Lorg/betup/model/remote/entity/shop/ShopBadgeType;", "rewardType", "Lorg/betup/model/remote/entity/shop/ShopRewardType;", "instantCoins", "dailyCoins", "packageDays", "displayTotalCoins", "offerExpiresAt", "visualPrice", "presentation", "Lorg/betup/model/remote/entity/shop/ShopItemPresentationModel;", "price", "oldPrice", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JILorg/betup/ui/fragment/shop/ShopItemType;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/NewShopEffectModel;Ljava/lang/Integer;ZZLjava/lang/String;ZLorg/betup/model/remote/entity/shop/ShopDisplaySection;ILjava/lang/String;Lorg/betup/model/remote/entity/shop/ShopBadgeType;Lorg/betup/model/remote/entity/shop/ShopRewardType;JJLjava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/ShopItemPresentationModel;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getIcon", "()Ljava/lang/String;", "getBonusIcon", "getBonus", "()J", "getStoreCode", "getOldStoreCode", "getBetcoins", "getDiscount", "getItemType", "()Lorg/betup/ui/fragment/shop/ShopItemType;", "getTitleText", "getEffect", "()Lorg/betup/model/remote/entity/shop/NewShopEffectModel;", "getEffectDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNoAds", "()Z", "getOpenBets", "getColor", "getPopular", "getDisplaySection", "()Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "getDisplayOrder", "getDisplayLabel", "getBadgeType", "()Lorg/betup/model/remote/entity/shop/ShopBadgeType;", "getRewardType", "()Lorg/betup/model/remote/entity/shop/ShopRewardType;", "getInstantCoins", "getDailyCoins", "getPackageDays", "getDisplayTotalCoins", "getOfferExpiresAt", "getVisualPrice", "getPresentation", "()Lorg/betup/model/remote/entity/shop/ShopItemPresentationModel;", "getPrice", "setPrice", "(Ljava/lang/String;)V", "getOldPrice", "setOldPrice", "toString", "toShopItemModel", "Lorg/betup/model/remote/entity/shop/ShopItemModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JILorg/betup/ui/fragment/shop/ShopItemType;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/NewShopEffectModel;Ljava/lang/Integer;ZZLjava/lang/String;ZLorg/betup/model/remote/entity/shop/ShopDisplaySection;ILjava/lang/String;Lorg/betup/model/remote/entity/shop/ShopBadgeType;Lorg/betup/model/remote/entity/shop/ShopRewardType;JJLjava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/ShopItemPresentationModel;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/shop/NewShopItemModel;", "equals", "other", "hashCode", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewShopItemModel {
    public static final int $stable = 8;

    @SerializedName("badge_type")
    private final ShopBadgeType badgeType;

    @SerializedName("betcoins")
    private final long betcoins;

    @SerializedName("bonus")
    private final long bonus;

    @SerializedName("bonusIcon")
    private final String bonusIcon;

    @SerializedName("color")
    private final String color;

    @SerializedName("daily_coins")
    private final long dailyCoins;

    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    private final int discount;

    @SerializedName("display_label")
    private final String displayLabel;

    @SerializedName("display_order")
    private final int displayOrder;

    @SerializedName("display_section")
    private final ShopDisplaySection displaySection;

    @SerializedName("display_total_coins")
    private final long displayTotalCoins;

    @SerializedName("effect")
    private final NewShopEffectModel effect;

    @SerializedName("effect_duration")
    private final Integer effectDuration;

    @SerializedName(X3.i.H0)
    private final String icon;

    @SerializedName("id")
    private final int id;

    @SerializedName("instant_coins")
    private final long instantCoins;

    @SerializedName("item_type")
    private final ShopItemType itemType;

    @SerializedName("no_ads")
    private final boolean noAds;

    @SerializedName("offer_expires_at")
    private final String offerExpiresAt;
    private String oldPrice;

    @SerializedName("old_store_code")
    private final String oldStoreCode;

    @SerializedName("open_bets")
    private final boolean openBets;

    @SerializedName("package_days")
    private final Integer packageDays;

    @SerializedName("is_popular")
    private final boolean popular;

    @SerializedName("presentation")
    private final ShopItemPresentationModel presentation;
    private String price;

    @SerializedName("reward_type")
    private final ShopRewardType rewardType;

    @SerializedName("store_code")
    private final String storeCode;

    @SerializedName("title_text")
    private final String titleText;

    @SerializedName("visual_price")
    private final String visualPrice;

    public NewShopItemModel() {
        this(0, null, null, 0L, null, null, 0L, 0, null, null, null, null, false, false, null, false, null, 0, null, null, null, 0L, 0L, null, 0L, null, null, null, null, null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component11, reason: from getter */
    public final NewShopEffectModel getEffect() {
        return this.effect;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getEffectDuration() {
        return this.effectDuration;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getNoAds() {
        return this.noAds;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getOpenBets() {
        return this.openBets;
    }

    /* renamed from: component15, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getPopular() {
        return this.popular;
    }

    /* renamed from: component17, reason: from getter */
    public final ShopDisplaySection getDisplaySection() {
        return this.displaySection;
    }

    /* renamed from: component18, reason: from getter */
    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    /* renamed from: component19, reason: from getter */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component20, reason: from getter */
    public final ShopBadgeType getBadgeType() {
        return this.badgeType;
    }

    /* renamed from: component21, reason: from getter */
    public final ShopRewardType getRewardType() {
        return this.rewardType;
    }

    /* renamed from: component22, reason: from getter */
    public final long getInstantCoins() {
        return this.instantCoins;
    }

    /* renamed from: component23, reason: from getter */
    public final long getDailyCoins() {
        return this.dailyCoins;
    }

    /* renamed from: component24, reason: from getter */
    public final Integer getPackageDays() {
        return this.packageDays;
    }

    /* renamed from: component25, reason: from getter */
    public final long getDisplayTotalCoins() {
        return this.displayTotalCoins;
    }

    /* renamed from: component26, reason: from getter */
    public final String getOfferExpiresAt() {
        return this.offerExpiresAt;
    }

    /* renamed from: component27, reason: from getter */
    public final String getVisualPrice() {
        return this.visualPrice;
    }

    /* renamed from: component28, reason: from getter */
    public final ShopItemPresentationModel getPresentation() {
        return this.presentation;
    }

    /* renamed from: component29, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBonusIcon() {
        return this.bonusIcon;
    }

    /* renamed from: component30, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBonus() {
        return this.bonus;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStoreCode() {
        return this.storeCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOldStoreCode() {
        return this.oldStoreCode;
    }

    /* renamed from: component7, reason: from getter */
    public final long getBetcoins() {
        return this.betcoins;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDiscount() {
        return this.discount;
    }

    /* renamed from: component9, reason: from getter */
    public final ShopItemType getItemType() {
        return this.itemType;
    }

    public final NewShopItemModel copy(int id, String icon, String bonusIcon, long bonus, String storeCode, String oldStoreCode, long betcoins, int discount, ShopItemType itemType, String titleText, NewShopEffectModel effect, Integer effectDuration, boolean noAds, boolean openBets, String color, boolean popular, ShopDisplaySection displaySection, int displayOrder, String displayLabel, ShopBadgeType badgeType, ShopRewardType rewardType, long instantCoins, long dailyCoins, Integer packageDays, long displayTotalCoins, String offerExpiresAt, String visualPrice, ShopItemPresentationModel presentation, String price, String oldPrice) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(bonusIcon, "bonusIcon");
        Intrinsics.checkNotNullParameter(storeCode, "storeCode");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        return new NewShopItemModel(id, icon, bonusIcon, bonus, storeCode, oldStoreCode, betcoins, discount, itemType, titleText, effect, effectDuration, noAds, openBets, color, popular, displaySection, displayOrder, displayLabel, badgeType, rewardType, instantCoins, dailyCoins, packageDays, displayTotalCoins, offerExpiresAt, visualPrice, presentation, price, oldPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewShopItemModel)) {
            return false;
        }
        NewShopItemModel newShopItemModel = (NewShopItemModel) other;
        return this.id == newShopItemModel.id && Intrinsics.areEqual(this.icon, newShopItemModel.icon) && Intrinsics.areEqual(this.bonusIcon, newShopItemModel.bonusIcon) && this.bonus == newShopItemModel.bonus && Intrinsics.areEqual(this.storeCode, newShopItemModel.storeCode) && Intrinsics.areEqual(this.oldStoreCode, newShopItemModel.oldStoreCode) && this.betcoins == newShopItemModel.betcoins && this.discount == newShopItemModel.discount && this.itemType == newShopItemModel.itemType && Intrinsics.areEqual(this.titleText, newShopItemModel.titleText) && Intrinsics.areEqual(this.effect, newShopItemModel.effect) && Intrinsics.areEqual(this.effectDuration, newShopItemModel.effectDuration) && this.noAds == newShopItemModel.noAds && this.openBets == newShopItemModel.openBets && Intrinsics.areEqual(this.color, newShopItemModel.color) && this.popular == newShopItemModel.popular && this.displaySection == newShopItemModel.displaySection && this.displayOrder == newShopItemModel.displayOrder && Intrinsics.areEqual(this.displayLabel, newShopItemModel.displayLabel) && this.badgeType == newShopItemModel.badgeType && this.rewardType == newShopItemModel.rewardType && this.instantCoins == newShopItemModel.instantCoins && this.dailyCoins == newShopItemModel.dailyCoins && Intrinsics.areEqual(this.packageDays, newShopItemModel.packageDays) && this.displayTotalCoins == newShopItemModel.displayTotalCoins && Intrinsics.areEqual(this.offerExpiresAt, newShopItemModel.offerExpiresAt) && Intrinsics.areEqual(this.visualPrice, newShopItemModel.visualPrice) && Intrinsics.areEqual(this.presentation, newShopItemModel.presentation) && Intrinsics.areEqual(this.price, newShopItemModel.price) && Intrinsics.areEqual(this.oldPrice, newShopItemModel.oldPrice);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.id) * 31) + this.icon.hashCode()) * 31) + this.bonusIcon.hashCode()) * 31) + Long.hashCode(this.bonus)) * 31) + this.storeCode.hashCode()) * 31;
        String str = this.oldStoreCode;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.betcoins)) * 31) + Integer.hashCode(this.discount)) * 31;
        ShopItemType shopItemType = this.itemType;
        int hashCode3 = (((hashCode2 + (shopItemType == null ? 0 : shopItemType.hashCode())) * 31) + this.titleText.hashCode()) * 31;
        NewShopEffectModel newShopEffectModel = this.effect;
        int hashCode4 = (hashCode3 + (newShopEffectModel == null ? 0 : newShopEffectModel.hashCode())) * 31;
        Integer num = this.effectDuration;
        int hashCode5 = (((((((((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.noAds)) * 31) + Boolean.hashCode(this.openBets)) * 31) + this.color.hashCode()) * 31) + Boolean.hashCode(this.popular)) * 31;
        ShopDisplaySection shopDisplaySection = this.displaySection;
        int hashCode6 = (((hashCode5 + (shopDisplaySection == null ? 0 : shopDisplaySection.hashCode())) * 31) + Integer.hashCode(this.displayOrder)) * 31;
        String str2 = this.displayLabel;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShopBadgeType shopBadgeType = this.badgeType;
        int hashCode8 = (hashCode7 + (shopBadgeType == null ? 0 : shopBadgeType.hashCode())) * 31;
        ShopRewardType shopRewardType = this.rewardType;
        int hashCode9 = (((((hashCode8 + (shopRewardType == null ? 0 : shopRewardType.hashCode())) * 31) + Long.hashCode(this.instantCoins)) * 31) + Long.hashCode(this.dailyCoins)) * 31;
        Integer num2 = this.packageDays;
        int hashCode10 = (((hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31) + Long.hashCode(this.displayTotalCoins)) * 31;
        String str3 = this.offerExpiresAt;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.visualPrice;
        int hashCode12 = (((hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.presentation.hashCode()) * 31;
        String str5 = this.price;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.oldPrice;
        return hashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public NewShopItemModel(int i, String icon, String bonusIcon, long j, String storeCode, String str, long j2, int i2, ShopItemType shopItemType, String titleText, NewShopEffectModel newShopEffectModel, Integer num, boolean z, boolean z2, String color, boolean z3, ShopDisplaySection shopDisplaySection, int i3, String str2, ShopBadgeType shopBadgeType, ShopRewardType shopRewardType, long j3, long j4, Integer num2, long j5, String str3, String str4, ShopItemPresentationModel presentation, String str5, String str6) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(bonusIcon, "bonusIcon");
        Intrinsics.checkNotNullParameter(storeCode, "storeCode");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        this.id = i;
        this.icon = icon;
        this.bonusIcon = bonusIcon;
        this.bonus = j;
        this.storeCode = storeCode;
        this.oldStoreCode = str;
        this.betcoins = j2;
        this.discount = i2;
        this.itemType = shopItemType;
        this.titleText = titleText;
        this.effect = newShopEffectModel;
        this.effectDuration = num;
        this.noAds = z;
        this.openBets = z2;
        this.color = color;
        this.popular = z3;
        this.displaySection = shopDisplaySection;
        this.displayOrder = i3;
        this.displayLabel = str2;
        this.badgeType = shopBadgeType;
        this.rewardType = shopRewardType;
        this.instantCoins = j3;
        this.dailyCoins = j4;
        this.packageDays = num2;
        this.displayTotalCoins = j5;
        this.offerExpiresAt = str3;
        this.visualPrice = str4;
        this.presentation = presentation;
        this.price = str5;
        this.oldPrice = str6;
    }

    public /* synthetic */ NewShopItemModel(int i, String str, String str2, long j, String str3, String str4, long j2, int i2, ShopItemType shopItemType, String str5, NewShopEffectModel newShopEffectModel, Integer num, boolean z, boolean z2, String str6, boolean z3, ShopDisplaySection shopDisplaySection, int i3, String str7, ShopBadgeType shopBadgeType, ShopRewardType shopRewardType, long j3, long j4, Integer num2, long j5, String str8, String str9, ShopItemPresentationModel shopItemPresentationModel, String str10, String str11, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? null : str4, (i4 & 64) != 0 ? 0L : j2, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? null : shopItemType, (i4 & 512) != 0 ? "" : str5, (i4 & 1024) != 0 ? null : newShopEffectModel, (i4 & 2048) != 0 ? null : num, (i4 & 4096) != 0 ? false : z, (i4 & 8192) != 0 ? false : z2, (i4 & 16384) == 0 ? str6 : "", (32768 & i4) != 0 ? false : z3, (i4 & 65536) != 0 ? null : shopDisplaySection, (i4 & 131072) != 0 ? 0 : i3, (i4 & 262144) != 0 ? null : str7, (i4 & 524288) != 0 ? null : shopBadgeType, (i4 & 1048576) != 0 ? null : shopRewardType, (i4 & 2097152) != 0 ? 0L : j3, (i4 & 4194304) != 0 ? 0L : j4, (i4 & 8388608) != 0 ? null : num2, (i4 & 16777216) != 0 ? 0L : j5, (i4 & 33554432) != 0 ? null : str8, (i4 & 67108864) != 0 ? null : str9, (i4 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? new ShopItemPresentationModel(null, null, null, 0, 15, null) : shopItemPresentationModel, (i4 & 268435456) != 0 ? null : str10, (i4 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str11);
    }

    public final int getId() {
        return this.id;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getBonusIcon() {
        return this.bonusIcon;
    }

    public final long getBonus() {
        return this.bonus;
    }

    public final String getStoreCode() {
        return this.storeCode;
    }

    public final String getOldStoreCode() {
        return this.oldStoreCode;
    }

    public final long getBetcoins() {
        return this.betcoins;
    }

    public final int getDiscount() {
        return this.discount;
    }

    public final ShopItemType getItemType() {
        return this.itemType;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final NewShopEffectModel getEffect() {
        return this.effect;
    }

    public final Integer getEffectDuration() {
        return this.effectDuration;
    }

    public final boolean getNoAds() {
        return this.noAds;
    }

    public final boolean getOpenBets() {
        return this.openBets;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getPopular() {
        return this.popular;
    }

    public final ShopDisplaySection getDisplaySection() {
        return this.displaySection;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final ShopBadgeType getBadgeType() {
        return this.badgeType;
    }

    public final ShopRewardType getRewardType() {
        return this.rewardType;
    }

    public final long getInstantCoins() {
        return this.instantCoins;
    }

    public final long getDailyCoins() {
        return this.dailyCoins;
    }

    public final Integer getPackageDays() {
        return this.packageDays;
    }

    public final long getDisplayTotalCoins() {
        return this.displayTotalCoins;
    }

    public final String getOfferExpiresAt() {
        return this.offerExpiresAt;
    }

    public final String getVisualPrice() {
        return this.visualPrice;
    }

    public final ShopItemPresentationModel getPresentation() {
        return this.presentation;
    }

    public final String getPrice() {
        return this.price;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final String getOldPrice() {
        return this.oldPrice;
    }

    public final void setOldPrice(String str) {
        this.oldPrice = str;
    }

    public String toString() {
        int i = this.id;
        String str = this.titleText;
        String str2 = this.storeCode;
        boolean z = this.popular;
        return "NewShopItemModel(id=" + i + ", titleText='" + str + "', storeCode='" + str2 + "', popular=" + z + ", is_popular=" + z + ")";
    }

    public final ShopItemModel toShopItemModel() {
        ShopItemModel shopItemModel = new ShopItemModel();
        shopItemModel.setId(this.id);
        shopItemModel.setIcon(this.icon);
        shopItemModel.setBonusIcon(this.bonusIcon);
        shopItemModel.setBonus(this.bonus);
        shopItemModel.setStoreCode(this.storeCode);
        shopItemModel.setBetcoins(this.betcoins);
        shopItemModel.setDiscount(this.discount);
        shopItemModel.setItemType(this.itemType);
        shopItemModel.setTitleText(this.titleText);
        shopItemModel.setEffectDuration(this.effectDuration);
        shopItemModel.setNoAds(this.noAds);
        shopItemModel.setOpenBets(this.openBets);
        shopItemModel.setColor(this.color);
        shopItemModel.setPrice(this.price);
        NewShopEffectModel newShopEffectModel = this.effect;
        if (newShopEffectModel != null) {
            ShopEffectModel shopEffectModel = new ShopEffectModel();
            shopEffectModel.setName(newShopEffectModel.getName());
            shopEffectModel.setDesc(newShopEffectModel.getDesc());
            shopEffectModel.setPhotoUrl(newShopEffectModel.getPhotoUrl());
            shopEffectModel.setEffectGroup(newShopEffectModel.getEffectGroup());
            shopItemModel.setEffect(shopEffectModel);
        }
        shopItemModel.setTickets(0L);
        shopItemModel.setIndex(-1);
        shopItemModel.setAvailable(true);
        shopItemModel.setName("");
        return shopItemModel;
    }
}
