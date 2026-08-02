package org.betup.ui.fragment.shop.compose;

import android.util.Log;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.shop.NewShopEffectModel;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.model.remote.entity.shop.ShopBadgeType;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.model.remote.entity.shop.ShopPresentationMode;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.fragment.shop.ShopItemType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopItemDataModel.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bZ\b\u0087\b\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0080\u0001B¿\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0014\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\u0014¢\u0006\u0004\b+\u0010,J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0007HÆ\u0003J\t\u0010_\u001a\u00020\u0007HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0007HÆ\u0003J\t\u0010b\u001a\u00020\u0007HÆ\u0003J\t\u0010c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010e\u001a\u00020\u000fHÆ\u0003J\t\u0010f\u001a\u00020\u000fHÆ\u0003J\t\u0010g\u001a\u00020\u0012HÆ\u0003J\t\u0010h\u001a\u00020\u0014HÆ\u0003J\t\u0010i\u001a\u00020\u0014HÆ\u0003J\t\u0010j\u001a\u00020\u0007HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010l\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010EJ\u000b\u0010m\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010r\u001a\u00020\u000fHÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010RJ\t\u0010u\u001a\u00020\u0014HÆ\u0003J\t\u0010v\u001a\u00020'HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010y\u001a\u00020\u0014HÆ\u0003JÒ\u0002\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010*\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020\u000f2\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020\u0014HÖ\u0001J\t\u0010\u007f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010:R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\"\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0015\u0010#\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010F\u001a\u0004\bP\u0010ER\u0015\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010S\u001a\u0004\bQ\u0010RR\u0011\u0010%\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0013\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bX\u00102R\u0011\u0010*\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bY\u0010>R\u0011\u0010Z\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b[\u0010:¨\u0006\u0081\u0001"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "", "id", "", "type", "Lorg/betup/ui/fragment/shop/ShopItemType;", "title", "", "description", "amount", "price", "oldPrice", "imgUrl", "multiplier", "popular", "", "isVideoRewardAvailable", "videoOfferPhase", "Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "videoRemainingInInterval", "", "videoMaxPerInterval", "storeCode", "effectCoef", "", "effectDuration", "displaySection", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "displayLabel", "badgeType", "Lorg/betup/model/remote/entity/shop/ShopBadgeType;", "unitPriceLabel", "entitlement", "Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "noAds", "packageDays", "offerExpiresAtMillis", "discountPercent", "presentationMode", "Lorg/betup/model/remote/entity/shop/ShopPresentationMode;", "htmlContent", "htmlTemplateUrl", "columnsInRow", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLorg/betup/ui/fragment/shop/ShopItemType;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLorg/betup/ui/common/video/VideoOfferAvailabilityPhase;IILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lorg/betup/model/remote/entity/shop/ShopDisplaySection;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/ShopBadgeType;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;ZLjava/lang/Integer;Ljava/lang/Long;ILorg/betup/model/remote/entity/shop/ShopPresentationMode;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()J", "getType", "()Lorg/betup/ui/fragment/shop/ShopItemType;", "getTitle", "()Ljava/lang/String;", "getDescription", "getAmount", "getPrice", "getOldPrice", "getImgUrl", "getMultiplier", "getPopular", "()Z", "getVideoOfferPhase", "()Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "getVideoRemainingInInterval", "()I", "getVideoMaxPerInterval", "getStoreCode", "getEffectCoef", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEffectDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisplaySection", "()Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "getDisplayLabel", "getBadgeType", "()Lorg/betup/model/remote/entity/shop/ShopBadgeType;", "getUnitPriceLabel", "getEntitlement", "()Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "getNoAds", "getPackageDays", "getOfferExpiresAtMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDiscountPercent", "getPresentationMode", "()Lorg/betup/model/remote/entity/shop/ShopPresentationMode;", "getHtmlContent", "getHtmlTemplateUrl", "getColumnsInRow", "usesHtmlPresentation", "getUsesHtmlPresentation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(JLorg/betup/ui/fragment/shop/ShopItemType;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLorg/betup/ui/common/video/VideoOfferAvailabilityPhase;IILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lorg/betup/model/remote/entity/shop/ShopDisplaySection;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/ShopBadgeType;Ljava/lang/String;Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;ZLjava/lang/Integer;Ljava/lang/Long;ILorg/betup/model/remote/entity/shop/ShopPresentationMode;Ljava/lang/String;Ljava/lang/String;I)Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "equals", "other", "hashCode", "toString", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopItemDataModel {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long amount;
    private final ShopBadgeType badgeType;
    private final int columnsInRow;
    private final String description;
    private final int discountPercent;
    private final String displayLabel;
    private final ShopDisplaySection displaySection;
    private final Double effectCoef;
    private final Integer effectDuration;
    private final ShopEntitlementModel entitlement;
    private final String htmlContent;
    private final String htmlTemplateUrl;
    private final long id;
    private final String imgUrl;
    private final boolean isVideoRewardAvailable;
    private final String multiplier;
    private final boolean noAds;
    private final Long offerExpiresAtMillis;
    private final String oldPrice;
    private final Integer packageDays;
    private final boolean popular;
    private final ShopPresentationMode presentationMode;
    private final String price;
    private final String storeCode;
    private final String title;
    private final ShopItemType type;
    private final String unitPriceLabel;
    private final int videoMaxPerInterval;
    private final VideoOfferAvailabilityPhase videoOfferPhase;
    private final int videoRemainingInInterval;

    /* compiled from: ShopItemDataModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShopPresentationMode.values().length];
            try {
                iArr[ShopPresentationMode.HTML_INLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopPresentationMode.HTML_REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopPresentationMode.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getPopular() {
        return this.popular;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsVideoRewardAvailable() {
        return this.isVideoRewardAvailable;
    }

    /* renamed from: component12, reason: from getter */
    public final VideoOfferAvailabilityPhase getVideoOfferPhase() {
        return this.videoOfferPhase;
    }

    /* renamed from: component13, reason: from getter */
    public final int getVideoRemainingInInterval() {
        return this.videoRemainingInInterval;
    }

    /* renamed from: component14, reason: from getter */
    public final int getVideoMaxPerInterval() {
        return this.videoMaxPerInterval;
    }

    /* renamed from: component15, reason: from getter */
    public final String getStoreCode() {
        return this.storeCode;
    }

    /* renamed from: component16, reason: from getter */
    public final Double getEffectCoef() {
        return this.effectCoef;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getEffectDuration() {
        return this.effectDuration;
    }

    /* renamed from: component18, reason: from getter */
    public final ShopDisplaySection getDisplaySection() {
        return this.displaySection;
    }

    /* renamed from: component19, reason: from getter */
    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final ShopItemType getType() {
        return this.type;
    }

    /* renamed from: component20, reason: from getter */
    public final ShopBadgeType getBadgeType() {
        return this.badgeType;
    }

    /* renamed from: component21, reason: from getter */
    public final String getUnitPriceLabel() {
        return this.unitPriceLabel;
    }

    /* renamed from: component22, reason: from getter */
    public final ShopEntitlementModel getEntitlement() {
        return this.entitlement;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getNoAds() {
        return this.noAds;
    }

    /* renamed from: component24, reason: from getter */
    public final Integer getPackageDays() {
        return this.packageDays;
    }

    /* renamed from: component25, reason: from getter */
    public final Long getOfferExpiresAtMillis() {
        return this.offerExpiresAtMillis;
    }

    /* renamed from: component26, reason: from getter */
    public final int getDiscountPercent() {
        return this.discountPercent;
    }

    /* renamed from: component27, reason: from getter */
    public final ShopPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    /* renamed from: component28, reason: from getter */
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    /* renamed from: component29, reason: from getter */
    public final String getHtmlTemplateUrl() {
        return this.htmlTemplateUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component30, reason: from getter */
    public final int getColumnsInRow() {
        return this.columnsInRow;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMultiplier() {
        return this.multiplier;
    }

    public final ShopItemDataModel copy(long id, ShopItemType type, String title, String description, long amount, String price, String oldPrice, String imgUrl, String multiplier, boolean popular, boolean isVideoRewardAvailable, VideoOfferAvailabilityPhase videoOfferPhase, int videoRemainingInInterval, int videoMaxPerInterval, String storeCode, Double effectCoef, Integer effectDuration, ShopDisplaySection displaySection, String displayLabel, ShopBadgeType badgeType, String unitPriceLabel, ShopEntitlementModel entitlement, boolean noAds, Integer packageDays, Long offerExpiresAtMillis, int discountPercent, ShopPresentationMode presentationMode, String htmlContent, String htmlTemplateUrl, int columnsInRow) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(oldPrice, "oldPrice");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(videoOfferPhase, "videoOfferPhase");
        Intrinsics.checkNotNullParameter(storeCode, "storeCode");
        Intrinsics.checkNotNullParameter(presentationMode, "presentationMode");
        return new ShopItemDataModel(id, type, title, description, amount, price, oldPrice, imgUrl, multiplier, popular, isVideoRewardAvailable, videoOfferPhase, videoRemainingInInterval, videoMaxPerInterval, storeCode, effectCoef, effectDuration, displaySection, displayLabel, badgeType, unitPriceLabel, entitlement, noAds, packageDays, offerExpiresAtMillis, discountPercent, presentationMode, htmlContent, htmlTemplateUrl, columnsInRow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopItemDataModel)) {
            return false;
        }
        ShopItemDataModel shopItemDataModel = (ShopItemDataModel) other;
        return this.id == shopItemDataModel.id && this.type == shopItemDataModel.type && Intrinsics.areEqual(this.title, shopItemDataModel.title) && Intrinsics.areEqual(this.description, shopItemDataModel.description) && this.amount == shopItemDataModel.amount && Intrinsics.areEqual(this.price, shopItemDataModel.price) && Intrinsics.areEqual(this.oldPrice, shopItemDataModel.oldPrice) && Intrinsics.areEqual(this.imgUrl, shopItemDataModel.imgUrl) && Intrinsics.areEqual(this.multiplier, shopItemDataModel.multiplier) && this.popular == shopItemDataModel.popular && this.isVideoRewardAvailable == shopItemDataModel.isVideoRewardAvailable && this.videoOfferPhase == shopItemDataModel.videoOfferPhase && this.videoRemainingInInterval == shopItemDataModel.videoRemainingInInterval && this.videoMaxPerInterval == shopItemDataModel.videoMaxPerInterval && Intrinsics.areEqual(this.storeCode, shopItemDataModel.storeCode) && Intrinsics.areEqual((Object) this.effectCoef, (Object) shopItemDataModel.effectCoef) && Intrinsics.areEqual(this.effectDuration, shopItemDataModel.effectDuration) && this.displaySection == shopItemDataModel.displaySection && Intrinsics.areEqual(this.displayLabel, shopItemDataModel.displayLabel) && this.badgeType == shopItemDataModel.badgeType && Intrinsics.areEqual(this.unitPriceLabel, shopItemDataModel.unitPriceLabel) && Intrinsics.areEqual(this.entitlement, shopItemDataModel.entitlement) && this.noAds == shopItemDataModel.noAds && Intrinsics.areEqual(this.packageDays, shopItemDataModel.packageDays) && Intrinsics.areEqual(this.offerExpiresAtMillis, shopItemDataModel.offerExpiresAtMillis) && this.discountPercent == shopItemDataModel.discountPercent && this.presentationMode == shopItemDataModel.presentationMode && Intrinsics.areEqual(this.htmlContent, shopItemDataModel.htmlContent) && Intrinsics.areEqual(this.htmlTemplateUrl, shopItemDataModel.htmlTemplateUrl) && this.columnsInRow == shopItemDataModel.columnsInRow;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Long.hashCode(this.id) * 31) + this.type.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + this.price.hashCode()) * 31) + this.oldPrice.hashCode()) * 31) + this.imgUrl.hashCode()) * 31;
        String str = this.multiplier;
        int hashCode2 = (((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.popular)) * 31) + Boolean.hashCode(this.isVideoRewardAvailable)) * 31) + this.videoOfferPhase.hashCode()) * 31) + Integer.hashCode(this.videoRemainingInInterval)) * 31) + Integer.hashCode(this.videoMaxPerInterval)) * 31) + this.storeCode.hashCode()) * 31;
        Double d = this.effectCoef;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.effectDuration;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ShopDisplaySection shopDisplaySection = this.displaySection;
        int hashCode5 = (hashCode4 + (shopDisplaySection == null ? 0 : shopDisplaySection.hashCode())) * 31;
        String str2 = this.displayLabel;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShopBadgeType shopBadgeType = this.badgeType;
        int hashCode7 = (hashCode6 + (shopBadgeType == null ? 0 : shopBadgeType.hashCode())) * 31;
        String str3 = this.unitPriceLabel;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShopEntitlementModel shopEntitlementModel = this.entitlement;
        int hashCode9 = (((hashCode8 + (shopEntitlementModel == null ? 0 : shopEntitlementModel.hashCode())) * 31) + Boolean.hashCode(this.noAds)) * 31;
        Integer num2 = this.packageDays;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.offerExpiresAtMillis;
        int hashCode11 = (((((hashCode10 + (l == null ? 0 : l.hashCode())) * 31) + Integer.hashCode(this.discountPercent)) * 31) + this.presentationMode.hashCode()) * 31;
        String str4 = this.htmlContent;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.htmlTemplateUrl;
        return ((hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.columnsInRow);
    }

    public String toString() {
        return "ShopItemDataModel(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", amount=" + this.amount + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", imgUrl=" + this.imgUrl + ", multiplier=" + this.multiplier + ", popular=" + this.popular + ", isVideoRewardAvailable=" + this.isVideoRewardAvailable + ", videoOfferPhase=" + this.videoOfferPhase + ", videoRemainingInInterval=" + this.videoRemainingInInterval + ", videoMaxPerInterval=" + this.videoMaxPerInterval + ", storeCode=" + this.storeCode + ", effectCoef=" + this.effectCoef + ", effectDuration=" + this.effectDuration + ", displaySection=" + this.displaySection + ", displayLabel=" + this.displayLabel + ", badgeType=" + this.badgeType + ", unitPriceLabel=" + this.unitPriceLabel + ", entitlement=" + this.entitlement + ", noAds=" + this.noAds + ", packageDays=" + this.packageDays + ", offerExpiresAtMillis=" + this.offerExpiresAtMillis + ", discountPercent=" + this.discountPercent + ", presentationMode=" + this.presentationMode + ", htmlContent=" + this.htmlContent + ", htmlTemplateUrl=" + this.htmlTemplateUrl + ", columnsInRow=" + this.columnsInRow + ")";
    }

    public ShopItemDataModel(long j, ShopItemType type, String title, String description, long j2, String price, String oldPrice, String imgUrl, String str, boolean z, boolean z2, VideoOfferAvailabilityPhase videoOfferPhase, int i, int i2, String storeCode, Double d, Integer num, ShopDisplaySection shopDisplaySection, String str2, ShopBadgeType shopBadgeType, String str3, ShopEntitlementModel shopEntitlementModel, boolean z3, Integer num2, Long l, int i3, ShopPresentationMode presentationMode, String str4, String str5, int i4) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(oldPrice, "oldPrice");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(videoOfferPhase, "videoOfferPhase");
        Intrinsics.checkNotNullParameter(storeCode, "storeCode");
        Intrinsics.checkNotNullParameter(presentationMode, "presentationMode");
        this.id = j;
        this.type = type;
        this.title = title;
        this.description = description;
        this.amount = j2;
        this.price = price;
        this.oldPrice = oldPrice;
        this.imgUrl = imgUrl;
        this.multiplier = str;
        this.popular = z;
        this.isVideoRewardAvailable = z2;
        this.videoOfferPhase = videoOfferPhase;
        this.videoRemainingInInterval = i;
        this.videoMaxPerInterval = i2;
        this.storeCode = storeCode;
        this.effectCoef = d;
        this.effectDuration = num;
        this.displaySection = shopDisplaySection;
        this.displayLabel = str2;
        this.badgeType = shopBadgeType;
        this.unitPriceLabel = str3;
        this.entitlement = shopEntitlementModel;
        this.noAds = z3;
        this.packageDays = num2;
        this.offerExpiresAtMillis = l;
        this.discountPercent = i3;
        this.presentationMode = presentationMode;
        this.htmlContent = str4;
        this.htmlTemplateUrl = str5;
        this.columnsInRow = i4;
    }

    public /* synthetic */ ShopItemDataModel(long j, ShopItemType shopItemType, String str, String str2, long j2, String str3, String str4, String str5, String str6, boolean z, boolean z2, VideoOfferAvailabilityPhase videoOfferAvailabilityPhase, int i, int i2, String str7, Double d, Integer num, ShopDisplaySection shopDisplaySection, String str8, ShopBadgeType shopBadgeType, String str9, ShopEntitlementModel shopEntitlementModel, boolean z3, Integer num2, Long l, int i3, ShopPresentationMode shopPresentationMode, String str10, String str11, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, shopItemType, str, str2, j2, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? "" : str4, str5, (i5 & 256) != 0 ? null : str6, (i5 & 512) != 0 ? false : z, (i5 & 1024) != 0 ? false : z2, (i5 & 2048) != 0 ? VideoOfferAvailabilityPhase.CHECKING : videoOfferAvailabilityPhase, (i5 & 4096) != 0 ? 0 : i, (i5 & 8192) != 0 ? 0 : i2, (i5 & 16384) != 0 ? "" : str7, (32768 & i5) != 0 ? null : d, (65536 & i5) != 0 ? null : num, (131072 & i5) != 0 ? null : shopDisplaySection, (262144 & i5) != 0 ? null : str8, (524288 & i5) != 0 ? null : shopBadgeType, (1048576 & i5) != 0 ? null : str9, (2097152 & i5) != 0 ? null : shopEntitlementModel, (4194304 & i5) != 0 ? false : z3, (8388608 & i5) != 0 ? null : num2, (16777216 & i5) != 0 ? null : l, (33554432 & i5) != 0 ? 0 : i3, (67108864 & i5) != 0 ? ShopPresentationMode.NATIVE : shopPresentationMode, (134217728 & i5) != 0 ? null : str10, (268435456 & i5) != 0 ? null : str11, (i5 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? 1 : i4);
    }

    public final long getId() {
        return this.id;
    }

    public final ShopItemType getType() {
        return this.type;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getOldPrice() {
        return this.oldPrice;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final boolean getPopular() {
        return this.popular;
    }

    public final boolean isVideoRewardAvailable() {
        return this.isVideoRewardAvailable;
    }

    public final VideoOfferAvailabilityPhase getVideoOfferPhase() {
        return this.videoOfferPhase;
    }

    public final int getVideoRemainingInInterval() {
        return this.videoRemainingInInterval;
    }

    public final int getVideoMaxPerInterval() {
        return this.videoMaxPerInterval;
    }

    public final String getStoreCode() {
        return this.storeCode;
    }

    public final Double getEffectCoef() {
        return this.effectCoef;
    }

    public final Integer getEffectDuration() {
        return this.effectDuration;
    }

    public final ShopDisplaySection getDisplaySection() {
        return this.displaySection;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final ShopBadgeType getBadgeType() {
        return this.badgeType;
    }

    public final String getUnitPriceLabel() {
        return this.unitPriceLabel;
    }

    public final ShopEntitlementModel getEntitlement() {
        return this.entitlement;
    }

    public final boolean getNoAds() {
        return this.noAds;
    }

    public final Integer getPackageDays() {
        return this.packageDays;
    }

    public final Long getOfferExpiresAtMillis() {
        return this.offerExpiresAtMillis;
    }

    public final int getDiscountPercent() {
        return this.discountPercent;
    }

    public final ShopPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    public final String getHtmlContent() {
        return this.htmlContent;
    }

    public final String getHtmlTemplateUrl() {
        return this.htmlTemplateUrl;
    }

    public final int getColumnsInRow() {
        return this.columnsInRow;
    }

    public final boolean getUsesHtmlPresentation() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.presentationMode.ordinal()];
        if (i == 1) {
            String str = this.htmlContent;
            if (str == null || StringsKt.isBlank(str)) {
                return false;
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            String str2 = this.htmlTemplateUrl;
            if (str2 == null || StringsKt.isBlank(str2)) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: ShopItemDataModel.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J6\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001b¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "resolveLocalizedText", "", "text", "fromNewShopItemModel", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "item", "Lorg/betup/model/remote/entity/shop/NewShopItemModel;", "entitlement", "Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "computeUnitPriceLabel", "price", "coins", "", "createVideoReward", "amount", "isAvailable", "", "availabilityPhase", "Lorg/betup/ui/common/video/VideoOfferAvailabilityPhase;", "videoRemainingInInterval", "", "videoMaxPerInterval", "getMock", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: ShopItemDataModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ShopDisplaySection.values().length];
                try {
                    iArr[ShopDisplaySection.FIRST_PURCHASE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r2 != null) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[Catch: Exception -> 0x0086, TryCatch #0 {Exception -> 0x0086, blocks: (B:6:0x000f, B:8:0x0019, B:10:0x002c, B:14:0x0036, B:20:0x003c, B:22:0x0044, B:26:0x004e, B:28:0x0056, B:30:0x0069, B:32:0x0071, B:36:0x007b), top: B:5:0x000f }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final String resolveLocalizedText(String text) {
            String str;
            JsonElement jsonElement;
            String str2 = text;
            if (str2 == null || str2.length() == 0) {
                return "";
            }
            try {
                JsonElement parseString = JsonParser.parseString(text);
                if (!parseString.isJsonObject()) {
                    return text;
                }
                JsonObject asJsonObject = parseString.getAsJsonObject();
                JsonElement jsonElement2 = asJsonObject.get(Locale.getDefault().getLanguage());
                String str3 = null;
                if (jsonElement2 != null) {
                    if (!jsonElement2.isJsonPrimitive()) {
                        jsonElement2 = null;
                    }
                    if (jsonElement2 != null) {
                        str = jsonElement2.getAsString();
                    }
                }
                JsonElement jsonElement3 = asJsonObject.get("en");
                if (jsonElement3 != null) {
                    if (!jsonElement3.isJsonPrimitive()) {
                        jsonElement3 = null;
                    }
                    if (jsonElement3 != null) {
                        str = jsonElement3.getAsString();
                        if (str == null) {
                            Set<Map.Entry<String, JsonElement>> entrySet = asJsonObject.entrySet();
                            Intrinsics.checkNotNullExpressionValue(entrySet, "entrySet(...)");
                            Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(entrySet);
                            if (entry != null && (jsonElement = (JsonElement) entry.getValue()) != null) {
                                if (!jsonElement.isJsonPrimitive()) {
                                    jsonElement = null;
                                }
                                if (jsonElement != null) {
                                    str3 = jsonElement.getAsString();
                                }
                            }
                            return str3 == null ? text : str3;
                        }
                        return str;
                    }
                }
                str = null;
                if (str == null) {
                }
                return str;
            } catch (Exception unused) {
                return text == null ? "" : text;
            }
        }

        public static /* synthetic */ ShopItemDataModel fromNewShopItemModel$default(Companion companion, NewShopItemModel newShopItemModel, ShopEntitlementModel shopEntitlementModel, int i, Object obj) {
            if ((i & 2) != 0) {
                shopEntitlementModel = null;
            }
            return companion.fromNewShopItemModel(newShopItemModel, shopEntitlementModel);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ShopItemDataModel fromNewShopItemModel(NewShopItemModel item, ShopEntitlementModel entitlement) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String offerExpiresAt;
            Long l;
            Object m10853constructorimpl;
            boolean z;
            String name;
            String resolveLocalizedText;
            Intrinsics.checkNotNullParameter(item, "item");
            Log.d("ShopItemDataModel", "Converting item " + item.getId() + ": storeCode=" + item.getStoreCode() + ", price=" + item.getPrice() + ", betcoins=" + item.getBetcoins() + ", itemType=" + item.getItemType() + ", popular=" + item.getPopular());
            ShopItemType itemType = item.getItemType();
            if (itemType == null) {
                itemType = ShopItemType.Regular;
            }
            ShopItemType shopItemType = itemType;
            Log.d("ShopItemDataModel", "Using itemType: " + shopItemType + " for item " + item.getId());
            NewShopEffectModel effect = item.getEffect();
            if (effect != null) {
                str = effect.getCoef() > 0.0d ? "X" + ((int) effect.getCoef()) : null;
            } else {
                str = null;
            }
            String resolveLocalizedText2 = resolveLocalizedText(item.getTitleText());
            NewShopEffectModel effect2 = item.getEffect();
            String str6 = (effect2 == null || (name = effect2.getName()) == null || (resolveLocalizedText = ShopItemDataModel.INSTANCE.resolveLocalizedText(name)) == null) ? "" : resolveLocalizedText;
            if (item.getEffect() != null) {
                str2 = item.getEffectDuration() != null ? StringsKt.replace$default(str6, "%s", item.getEffectDuration().toString(), false, 4, (Object) null) : str6;
            } else {
                str2 = resolveLocalizedText2.length() > 0 ? resolveLocalizedText2 : "";
            }
            long displayTotalCoins = item.getDisplayTotalCoins() > 0 ? item.getDisplayTotalCoins() : item.getBetcoins();
            String resolveLocalizedText3 = resolveLocalizedText(item.getDisplayLabel());
            ShopDisplaySection displaySection = item.getDisplaySection();
            if ((displaySection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[displaySection.ordinal()]) == 1) {
                String str7 = resolveLocalizedText2;
                if (str7.length() == 0) {
                    str7 = resolveLocalizedText3;
                }
                str3 = str7;
            } else {
                String str8 = resolveLocalizedText3;
                if (!(str8.length() == 0)) {
                    resolveLocalizedText2 = str8;
                }
                str3 = resolveLocalizedText2;
            }
            String str9 = str3;
            String formatShopDisplayPrice = ShopPriceFormattingKt.formatShopDisplayPrice(item.getPrice(), item.getVisualPrice());
            long id = item.getId();
            String oldPrice = item.getOldPrice();
            if (oldPrice != null) {
                if (oldPrice.length() > 0) {
                    String oldStoreCode = item.getOldStoreCode();
                    if (!(oldStoreCode == null || StringsKt.isBlank(oldStoreCode))) {
                        z = true;
                        if (!z) {
                            oldPrice = null;
                        }
                        if (oldPrice != null) {
                            str4 = oldPrice;
                            String icon = item.getIcon();
                            String str10 = icon != null ? "" : icon;
                            boolean z2 = !item.getPopular() || item.getBadgeType() == ShopBadgeType.POPULAR;
                            String storeCode = item.getStoreCode();
                            NewShopEffectModel effect3 = item.getEffect();
                            Double valueOf = effect3 == null ? Double.valueOf(effect3.getCoef()) : null;
                            Integer effectDuration = item.getEffectDuration();
                            ShopDisplaySection displaySection2 = item.getDisplaySection();
                            str5 = resolveLocalizedText3;
                            if (str5.length() != 0) {
                                str5 = null;
                            }
                            String str11 = str5;
                            ShopBadgeType badgeType = item.getBadgeType();
                            String formatShopUnitPriceLabel = ShopPriceFormattingKt.formatShopUnitPriceLabel(formatShopDisplayPrice, displayTotalCoins);
                            boolean noAds = item.getNoAds();
                            Integer packageDays = item.getPackageDays();
                            offerExpiresAt = item.getOfferExpiresAt();
                            if (offerExpiresAt == null) {
                                Companion companion = ShopItemDataModel.INSTANCE;
                                try {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    m10853constructorimpl = Result.m10853constructorimpl(Long.valueOf(Instant.parse(offerExpiresAt).toEpochMilli()));
                                } catch (Throwable th) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
                                }
                                if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                                    m10853constructorimpl = null;
                                }
                                l = (Long) m10853constructorimpl;
                            } else {
                                l = null;
                            }
                            ShopItemDataModel shopItemDataModel = new ShopItemDataModel(id, shopItemType, str9, str2, displayTotalCoins, formatShopDisplayPrice, str4, str10, str, z2, false, null, 0, 0, storeCode, valueOf, effectDuration, displaySection2, str11, badgeType, formatShopUnitPriceLabel, entitlement, noAds, packageDays, l, item.getDiscount(), item.getPresentation().getMode(), item.getPresentation().getHtmlContent(), item.getPresentation().getHtmlTemplateUrl(), RangesKt.coerceIn(item.getPresentation().getColumnsInRow(), 1, 2), 15360, null);
                            Log.d("ShopItemDataModel", "Converted item " + item.getId() + " to ShopItemDataModel: id=" + shopItemDataModel.getId() + ", type=" + shopItemDataModel.getType() + ", price=" + shopItemDataModel.getPrice() + ", popular=" + shopItemDataModel.getPopular());
                            return shopItemDataModel;
                        }
                    }
                }
                z = false;
                if (!z) {
                }
                if (oldPrice != null) {
                }
            }
            str4 = "";
            String icon2 = item.getIcon();
            if (icon2 != null) {
            }
            if (item.getPopular()) {
            }
            String storeCode2 = item.getStoreCode();
            NewShopEffectModel effect32 = item.getEffect();
            if (effect32 == null) {
            }
            Integer effectDuration2 = item.getEffectDuration();
            ShopDisplaySection displaySection22 = item.getDisplaySection();
            str5 = resolveLocalizedText3;
            if (str5.length() != 0) {
            }
            String str112 = str5;
            ShopBadgeType badgeType2 = item.getBadgeType();
            String formatShopUnitPriceLabel2 = ShopPriceFormattingKt.formatShopUnitPriceLabel(formatShopDisplayPrice, displayTotalCoins);
            boolean noAds2 = item.getNoAds();
            Integer packageDays2 = item.getPackageDays();
            offerExpiresAt = item.getOfferExpiresAt();
            if (offerExpiresAt == null) {
            }
            ShopItemDataModel shopItemDataModel2 = new ShopItemDataModel(id, shopItemType, str9, str2, displayTotalCoins, formatShopDisplayPrice, str4, str10, str, z2, false, null, 0, 0, storeCode2, valueOf, effectDuration2, displaySection22, str112, badgeType2, formatShopUnitPriceLabel2, entitlement, noAds2, packageDays2, l, item.getDiscount(), item.getPresentation().getMode(), item.getPresentation().getHtmlContent(), item.getPresentation().getHtmlTemplateUrl(), RangesKt.coerceIn(item.getPresentation().getColumnsInRow(), 1, 2), 15360, null);
            Log.d("ShopItemDataModel", "Converted item " + item.getId() + " to ShopItemDataModel: id=" + shopItemDataModel2.getId() + ", type=" + shopItemDataModel2.getType() + ", price=" + shopItemDataModel2.getPrice() + ", popular=" + shopItemDataModel2.getPopular());
            return shopItemDataModel2;
        }

        private final String computeUnitPriceLabel(String price, long coins) {
            if (price == null) {
                price = "";
            }
            return ShopPriceFormattingKt.formatShopUnitPriceLabel(price, coins);
        }

        public static /* synthetic */ ShopItemDataModel createVideoReward$default(Companion companion, long j, boolean z, VideoOfferAvailabilityPhase videoOfferAvailabilityPhase, int i, int i2, int i3, Object obj) {
            VideoOfferAvailabilityPhase videoOfferAvailabilityPhase2;
            if ((i3 & 2) != 0) {
                z = true;
            }
            boolean z2 = z;
            if ((i3 & 4) != 0) {
                if (z2) {
                    videoOfferAvailabilityPhase2 = VideoOfferAvailabilityPhase.READY;
                } else {
                    videoOfferAvailabilityPhase2 = VideoOfferAvailabilityPhase.CHECKING;
                }
                videoOfferAvailabilityPhase = videoOfferAvailabilityPhase2;
            }
            return companion.createVideoReward(j, z2, videoOfferAvailabilityPhase, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
        }

        public final ShopItemDataModel createVideoReward(long amount, boolean isAvailable, VideoOfferAvailabilityPhase availabilityPhase, int videoRemainingInInterval, int videoMaxPerInterval) {
            Intrinsics.checkNotNullParameter(availabilityPhase, "availabilityPhase");
            return new ShopItemDataModel(-1L, ShopItemType.Bonus, "", "", amount, "", "", ShopVideoRewardHtml.HERO_IMAGE_URL, null, false, isAvailable, availabilityPhase, videoRemainingInInterval, videoMaxPerInterval, null, null, null, ShopDisplaySection.FREE_REWARDS, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073594368, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final List<ShopItemDataModel> getMock() {
            String str = null;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z = false;
            VideoOfferAvailabilityPhase videoOfferAvailabilityPhase = null;
            int i = 0;
            int i2 = 0;
            String str2 = null;
            boolean z2 = false;
            Integer num = null;
            int i3 = 0;
            String str3 = null;
            String str4 = null;
            int i4 = 0;
            long j = 250000;
            int i5 = 1073741056;
            String str5 = null;
            boolean z3 = false;
            boolean z4 = true;
            int i6 = 1073741056;
            String str6 = null;
            boolean z5 = false;
            return CollectionsKt.listOf((Object[]) new ShopItemDataModel[]{new ShopItemDataModel(-1L, ShopItemType.Bonus, "VIDEO REWARD", "Watch an ad and get", 1000L, "", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, str, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(1L, ShopItemType.Bonus, "AD REWARD", "Watch an ad and get", 1000L, "", "", "", null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, 0, 1073741056, null), new ShopItemDataModel(2L, ShopItemType.Regular, "Daily Bonus", "for 7 days", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, "$1.99", "", "", "X10", z, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073740800, defaultConstructorMarker), new ShopItemDataModel(3L, ShopItemType.Banner, "SPECIAL OFFER", "Limited time only!", j, "$2.99", "", "", null, z, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073741056, defaultConstructorMarker), new ShopItemDataModel(4L, ShopItemType.Regular, "Premium Pack", "Best value", j, "$2.99", "", "", "X10", true, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073740800, defaultConstructorMarker), new ShopItemDataModel(5L, ShopItemType.Regular, "", "", DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US, "$49.99", "", "", str5, z3, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, i5, defaultConstructorMarker), new ShopItemDataModel(6L, ShopItemType.Regular, "Mega Pack", "Ultimate value", 1000000L, "$29.99", "", "", str5, z3, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, i5, defaultConstructorMarker), new ShopItemDataModel(7L, ShopItemType.Regular, "Free Gift", "Claim now", 300000L, "", "", "", str5, z3, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, i5, defaultConstructorMarker), new ShopItemDataModel(8L, ShopItemType.Bonus, "VIP REWARD", "Exclusive bonus", 50000L, "", "", "", str5, z4, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, i5, defaultConstructorMarker), new ShopItemDataModel(9L, ShopItemType.Regular, "Diamond Pack", "For serious players", 10000000L, "$99.99", "", "", "X20", z4, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073740800, defaultConstructorMarker), new ShopItemDataModel(10L, ShopItemType.Regular, "Starter Pack", "Perfect for beginners", 50000L, "$0.99", "", "", null, false, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073741056, defaultConstructorMarker), new ShopItemDataModel(11L, ShopItemType.Banner, "FLASH SALE", "50% OFF - Today only!", 500000L, "$4.99", "", "", "X15", true, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073740800, defaultConstructorMarker), new ShopItemDataModel(12L, ShopItemType.Regular, "Super Mega Ultra Premium Pack", "Everything you need", 750000L, "$19.99", "", "", str6, z5, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, i6, defaultConstructorMarker), new ShopItemDataModel(13L, ShopItemType.Regular, "", "", 150000L, "$1.49", "", "", str6, z5, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, i6, defaultConstructorMarker), new ShopItemDataModel(14L, ShopItemType.Bonus, "BONUS REWARD", "Special multiplier", ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, "", "", "", "X5", z5, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073740800, defaultConstructorMarker), new ShopItemDataModel(15L, ShopItemType.Regular, "Complete Pack", "This is a very long description that might wrap to multiple lines to test the layout behavior with extended text content", 800000L, "$9.99", "", "", null, z5, 0 == true ? 1 : 0, videoOfferAvailabilityPhase, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, z2, num, 0 == true ? 1 : 0, i3, 0 == true ? 1 : 0, str3, str4, i4, 1073741056, defaultConstructorMarker)});
        }
    }
}
