package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import androidx.credentials.provider.CredentialEntry;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.text.NumberFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.betup.R;
import org.betup.model.remote.api.rest.shop.ShopRequestParams;
import org.betup.model.remote.entity.shop.ShopBadgeType;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.dialogs.offer.OfferHtmlInjector;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* compiled from: ShopHtmlInjector.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¨\u0006!"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopHtmlInjector;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "inject", "", "context", "Landroid/content/Context;", "html", "item", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "buyLabel", "labels", "Lorg/betup/ui/fragment/shop/compose/ShopHtmlLabels;", "cornerRibbon", "Lorg/betup/ui/fragment/shop/compose/ShopHtmlInjector$CornerRibbon;", "eyebrowFor", "headlineFor", "subtitleFor", "badgeLabel", "badge", "Lorg/betup/model/remote/entity/shop/ShopBadgeType;", "buildBulletsHtml", "buildDailyDealBullets", "borderColorFor", "titleAccentFor", "formatCoins", "amount", "", "escape", "value", "escapeJs", "CornerRibbon", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopHtmlInjector {
    public static final int $stable = 0;
    public static final ShopHtmlInjector INSTANCE = new ShopHtmlInjector();

    /* compiled from: ShopHtmlInjector.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VideoOfferAvailabilityPhase.values().length];
            try {
                iArr[VideoOfferAvailabilityPhase.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShopBadgeType.values().length];
            try {
                iArr2[ShopBadgeType.BONUS_PCT_20.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShopBadgeType.BONUS_PCT_50.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShopBadgeType.NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ShopBadgeType.POPULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ShopDisplaySection.values().length];
            try {
                iArr3[ShopDisplaySection.FIRST_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ShopDisplaySection.BUNDLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ShopDisplaySection.COIN_PACKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private ShopHtmlInjector() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0383  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String inject(Context context, String html, ShopItemDataModel item, String buyLabel, ShopHtmlLabels labels) {
        boolean isCtaDisabled;
        ShopEntitlementModel shopEntitlementModel;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        String str;
        String formatOfferCountdown;
        String str2;
        String str3;
        ShopDisplaySection displaySection;
        String str4;
        String unitPriceLabel;
        String unitPriceLabel2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String videoSubtitle;
        int i;
        String num;
        String l;
        String nextClaimCountdownLabel$default;
        Long nextClaimAtMillis;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(buyLabel, "buyLabel");
        Intrinsics.checkNotNullParameter(labels, "labels");
        String resolveShopIconUrl = ShopHtmlDrawableResolver.INSTANCE.resolveShopIconUrl(context, item.getImgUrl());
        OfferHtmlInjector offerHtmlInjector = OfferHtmlInjector.INSTANCE;
        String oldPrice = item.getOldPrice();
        if (oldPrice.length() <= 0) {
            oldPrice = null;
        }
        String inject = offerHtmlInjector.inject(html, resolveShopIconUrl, oldPrice, item.getPrice(), formatCoins(ShopEntitlementUi.INSTANCE.displayCoinAmount(item)), true);
        CornerRibbon cornerRibbon = cornerRibbon(item);
        boolean z4 = item.getId() == -1;
        ShopEntitlementModel entitlement = item.getEntitlement();
        boolean hasActiveEntitlement = ShopEntitlementUi.INSTANCE.hasActiveEntitlement(entitlement);
        if (z4) {
            isCtaDisabled = item.getVideoOfferPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS;
        } else {
            isCtaDisabled = ShopEntitlementUi.INSTANCE.isCtaDisabled(item, false);
        }
        if (!hasActiveEntitlement || entitlement == null || entitlement.getCanClaim()) {
            shopEntitlementModel = entitlement;
        } else {
            shopEntitlementModel = entitlement;
            if (ShopEntitlementUi.remainingMsUntilNextClaim$default(ShopEntitlementUi.INSTANCE, entitlement, 0L, 2, null) != null) {
                z = true;
                j = 0;
                if (z && shopEntitlementModel != null && (nextClaimAtMillis = ShopEntitlementUi.INSTANCE.nextClaimAtMillis(shopEntitlementModel)) != null) {
                    j = nextClaimAtMillis.longValue();
                }
                long j2 = j;
                String str11 = "";
                String str12 = (z || shopEntitlementModel == null || (nextClaimCountdownLabel$default = ShopEntitlementUi.nextClaimCountdownLabel$default(ShopEntitlementUi.INSTANCE, context, shopEntitlementModel, 0L, 4, null)) == null) ? "" : nextClaimCountdownLabel$default;
                String string = context.getString(R.string.shop_entitlement_next_claim_in, "%1$s");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String escape = escape(string);
                z2 = (hasActiveEntitlement || shopEntitlementModel == null || shopEntitlementModel.getCanClaim()) ? false : true;
                Long offerExpiresAtMillis = item.getOfferExpiresAtMillis();
                z3 = offerExpiresAtMillis == null && offerExpiresAtMillis.longValue() > System.currentTimeMillis();
                String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(inject, "{{title}}", escape(item.getTitle()), false, 4, (Object) null), "{{eyebrow}}", escape(eyebrowFor(item)), false, 4, (Object) null), "{{headline}}", escape(headlineFor(item)), false, 4, (Object) null), "{{subtitle}}", escape(subtitleFor(item)), false, 4, (Object) null), "{{subtitleDisplay}}", !z2 ? "none" : "-webkit-box", false, 4, (Object) null);
                if (z2) {
                    str = "";
                } else {
                    str = "entitlement-waiting";
                }
                String replace$default2 = StringsKt.replace$default(replace$default, "{{cardEntitlementClass}}", str, false, 4, (Object) null);
                formatOfferCountdown = ShopCardChromeKt.formatOfferCountdown(offerExpiresAtMillis);
                if (formatOfferCountdown == null) {
                    formatOfferCountdown = "00:00:00";
                }
                String replace$default3 = StringsKt.replace$default(replace$default2, "{{timer}}", escape(formatOfferCountdown), false, 4, (Object) null);
                str2 = "0";
                String replace$default4 = StringsKt.replace$default(replace$default3, "{{offerExpiresAtMillis}}", (offerExpiresAtMillis != null || (l = offerExpiresAtMillis.toString()) == null) ? "0" : l, false, 4, (Object) null);
                if (z3) {
                    str3 = "none";
                } else {
                    str3 = "flex";
                }
                String replace$default5 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default4, "{{timerDisplay}}", str3, false, 4, (Object) null), "{{badge}}", escape(badgeLabel(item.getBadgeType())), false, 4, (Object) null), "{{badgeDisplay}}", (item.getBadgeType() != null || item.getPopular()) ? "none" : "block", false, 4, (Object) null), "{{discount}}", item.getDiscountPercent() <= 0 ? "-" + item.getDiscountPercent() + "%" : "", false, 4, (Object) null), "{{discountDisplay}}", item.getDiscountPercent() <= 0 ? "inline" : "none", false, 4, (Object) null), "{{oldPriceDisplay}}", item.getOldPrice().length() <= 0 ? "inline" : "none", false, 4, (Object) null), "{{buyLabel}}", escape(ShopEntitlementUi.INSTANCE.resolveBundleCtaLabel(context, item, buyLabel)), false, 4, (Object) null), "{{storeCode}}", escape(item.getStoreCode()), false, 4, (Object) null);
                displaySection = item.getDisplaySection();
                if (displaySection != null || (r3 = displaySection.name()) == null) {
                    String str13 = "";
                }
                String replace$default6 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default5, "{{section}}", escape(str13), false, 4, (Object) null), "{{borderColor}}", borderColorFor(item), false, 4, (Object) null), "{{aspectRatio}}", ShopHtmlLoadSpecKt.shopHtmlAspectRatioLabel(item), false, 4, (Object) null), "{{titleAccent}}", titleAccentFor(item), false, 4, (Object) null);
                Integer packageDays = item.getPackageDays();
                String replace$default7 = StringsKt.replace$default(replace$default6, "{{packageDays}}", (packageDays != null || (num = packageDays.toString()) == null) ? "" : num, false, 4, (Object) null);
                if (item.getPackageDays() != null || item.getPackageDays().intValue() <= 0) {
                    str4 = "none";
                } else {
                    str4 = "flex";
                }
                String replace$default8 = StringsKt.replace$default(StringsKt.replace$default(replace$default7, "{{daysDisplay}}", str4, false, 4, (Object) null), "{{bulletsHtml}}", buildBulletsHtml(context, item), false, 4, (Object) null);
                unitPriceLabel = item.getUnitPriceLabel();
                if (unitPriceLabel == null) {
                    unitPriceLabel = "";
                }
                String replace$default9 = StringsKt.replace$default(replace$default8, "{{unitPrice}}", escape(unitPriceLabel), false, 4, (Object) null);
                unitPriceLabel2 = item.getUnitPriceLabel();
                if (unitPriceLabel2 != null || unitPriceLabel2.length() == 0) {
                    str5 = "none";
                } else {
                    str5 = "flex";
                }
                String str14 = "1";
                String replace$default10 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default9, "{{unitPriceDisplay}}", str5, false, 4, (Object) null), "{{popularRibbonDisplay}}", "none", false, 4, (Object) null), "{{cornerRibbonText}}", escape(cornerRibbon.getText()), false, 4, (Object) null), "{{cornerRibbonDisplay}}", !cornerRibbon.getVisible() ? "block" : "none", false, 4, (Object) null), "{{cornerRibbonClass}}", cornerRibbon.getCssClass(), false, 4, (Object) null), "{{heroDisplay}}", resolveShopIconUrl == null ? "block" : "none", false, 4, (Object) null), "{{heroOpacity}}", resolveShopIconUrl == null ? "1" : "0.85", false, 4, (Object) null), "{{playOverlayDisplay}}", resolveShopIconUrl == null ? "none" : "block", false, 4, (Object) null);
                if (z4) {
                    if (item.getVideoOfferPhase() == VideoOfferAvailabilityPhase.UNAVAILABLE) {
                        str14 = "0.72";
                    } else if (item.getVideoOfferPhase() == VideoOfferAvailabilityPhase.COOLDOWN || item.getVideoOfferPhase() == VideoOfferAvailabilityPhase.LIMIT_REACHED) {
                        str14 = "0.55";
                    }
                }
                String replace$default11 = StringsKt.replace$default(StringsKt.replace$default(replace$default10, "{{cardOpacity}}", str14, false, 4, (Object) null), "{{ctaDisabled}}", !isCtaDisabled ? "true" : CredentialEntry.FALSE_STRING, false, 4, (Object) null);
                if (isCtaDisabled) {
                    str6 = "";
                } else {
                    str6 = "is-disabled";
                }
                String replace$default12 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default11, "{{ctaDisabledClass}}", str6, false, 4, (Object) null), "{{nextClaimAtMillis}}", String.valueOf(j2), false, 4, (Object) null), "{{entitlementTimerDisplay}}", !z ? "block" : "none", false, 4, (Object) null), "{{entitlementTimerInitial}}", escape(str12), false, 4, (Object) null), "{{entitlementTimerFormat}}", escape, false, 4, (Object) null);
                if (hasActiveEntitlement || shopEntitlementModel == null) {
                    str7 = "none";
                } else {
                    str7 = "flex";
                }
                String replace$default13 = StringsKt.replace$default(replace$default12, "{{entitlementDisplay}}", str7, false, 4, (Object) null);
                if (hasActiveEntitlement || shopEntitlementModel == null) {
                    str8 = "";
                } else {
                    str8 = escape(ShopEntitlementUi.INSTANCE.progressLabel(context, shopEntitlementModel));
                }
                String replace$default14 = StringsKt.replace$default(replace$default13, "{{entitlementProgress}}", str8, false, 4, (Object) null);
                if (hasActiveEntitlement && shopEntitlementModel != null) {
                    str2 = String.valueOf(ShopEntitlementUi.INSTANCE.progressPercent(shopEntitlementModel));
                }
                String replace$default15 = StringsKt.replace$default(replace$default14, "{{entitlementProgressPct}}", str2, false, 4, (Object) null);
                if (hasActiveEntitlement || shopEntitlementModel == null || shopEntitlementModel.getDaysMissed() <= 0) {
                    str9 = "";
                } else {
                    String string2 = context.getString(R.string.shop_entitlement_days_missed, Integer.valueOf(shopEntitlementModel.getDaysMissed()));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    str9 = escape(string2);
                }
                String replace$default16 = StringsKt.replace$default(StringsKt.replace$default(replace$default15, "{{entitlementMissed}}", str9, false, 4, (Object) null), "{{entitlementMissedDisplay}}", (hasActiveEntitlement || shopEntitlementModel == null || shopEntitlementModel.getDaysMissed() <= 0) ? "none" : "block", false, 4, (Object) null);
                if (hasActiveEntitlement) {
                    str10 = "";
                } else {
                    String string3 = context.getString(R.string.shop_coins_per_day);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    str10 = escape(string3);
                }
                String replace$default17 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default16, "{{coinsPerDaySuffix}}", str10, false, 4, (Object) null), "{{coinsPerDayDisplay}}", !hasActiveEntitlement ? "inline" : "none", false, 4, (Object) null), "{{videoTitle}}", escape(labels.getVideoTitle()), false, 4, (Object) null);
                if (item.getVideoOfferPhase() != VideoOfferAvailabilityPhase.CHECKING) {
                    videoSubtitle = StringsKt.trimEnd(StringsKt.trimEnd((CharSequence) labels.getVideoSubtitle()).toString(), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, Typography.ellipsis);
                } else {
                    videoSubtitle = labels.getVideoSubtitle();
                }
                String replace$default18 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default17, "{{videoSubtitle}}", escape(videoSubtitle), false, 4, (Object) null), "{{videoQuota}}", escape(labels.getVideoQuotaLabel()), false, 4, (Object) null), "{{videoLoadingDisplay}}", !labels.getVideoLoading() ? "block" : "none", false, 4, (Object) null);
                i = WhenMappings.$EnumSwitchMapping$0[item.getVideoOfferPhase().ordinal()];
                if (i != 1) {
                    str11 = "is-checking";
                } else if (i == 2) {
                    str11 = "is-ready";
                }
                return ShopResponsiveHtml.INSTANCE.inject(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default18, "{{videoStateClass}}", str11, false, 4, (Object) null), "{{videoCheckingDotsDisplay}}", item.getVideoOfferPhase() != VideoOfferAvailabilityPhase.CHECKING ? "inline" : "none", false, 4, (Object) null), "{{videoQuotaDisplay}}", StringsKt.isBlank(labels.getVideoQuotaLabel()) ? "none" : "inline-flex", false, 4, (Object) null), "{{ctaAction}}", !z4 ? "watchVideo()" : "purchase('" + escapeJs(item.getStoreCode()) + "')", false, 4, (Object) null));
            }
        }
        z = false;
        j = 0;
        if (z) {
            j = nextClaimAtMillis.longValue();
        }
        long j22 = j;
        String str112 = "";
        if (z) {
        }
        String string4 = context.getString(R.string.shop_entitlement_next_claim_in, "%1$s");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String escape2 = escape(string4);
        if (hasActiveEntitlement) {
        }
        Long offerExpiresAtMillis2 = item.getOfferExpiresAtMillis();
        if (offerExpiresAtMillis2 == null) {
        }
        String replace$default19 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(inject, "{{title}}", escape(item.getTitle()), false, 4, (Object) null), "{{eyebrow}}", escape(eyebrowFor(item)), false, 4, (Object) null), "{{headline}}", escape(headlineFor(item)), false, 4, (Object) null), "{{subtitle}}", escape(subtitleFor(item)), false, 4, (Object) null), "{{subtitleDisplay}}", !z2 ? "none" : "-webkit-box", false, 4, (Object) null);
        if (z2) {
        }
        String replace$default22 = StringsKt.replace$default(replace$default19, "{{cardEntitlementClass}}", str, false, 4, (Object) null);
        formatOfferCountdown = ShopCardChromeKt.formatOfferCountdown(offerExpiresAtMillis2);
        if (formatOfferCountdown == null) {
        }
        String replace$default32 = StringsKt.replace$default(replace$default22, "{{timer}}", escape(formatOfferCountdown), false, 4, (Object) null);
        str2 = "0";
        String replace$default42 = StringsKt.replace$default(replace$default32, "{{offerExpiresAtMillis}}", (offerExpiresAtMillis2 != null || (l = offerExpiresAtMillis2.toString()) == null) ? "0" : l, false, 4, (Object) null);
        if (z3) {
        }
        String replace$default52 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default42, "{{timerDisplay}}", str3, false, 4, (Object) null), "{{badge}}", escape(badgeLabel(item.getBadgeType())), false, 4, (Object) null), "{{badgeDisplay}}", (item.getBadgeType() != null || item.getPopular()) ? "none" : "block", false, 4, (Object) null), "{{discount}}", item.getDiscountPercent() <= 0 ? "-" + item.getDiscountPercent() + "%" : "", false, 4, (Object) null), "{{discountDisplay}}", item.getDiscountPercent() <= 0 ? "inline" : "none", false, 4, (Object) null), "{{oldPriceDisplay}}", item.getOldPrice().length() <= 0 ? "inline" : "none", false, 4, (Object) null), "{{buyLabel}}", escape(ShopEntitlementUi.INSTANCE.resolveBundleCtaLabel(context, item, buyLabel)), false, 4, (Object) null), "{{storeCode}}", escape(item.getStoreCode()), false, 4, (Object) null);
        displaySection = item.getDisplaySection();
        if (displaySection != null) {
        }
        String str132 = "";
        String replace$default62 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default52, "{{section}}", escape(str132), false, 4, (Object) null), "{{borderColor}}", borderColorFor(item), false, 4, (Object) null), "{{aspectRatio}}", ShopHtmlLoadSpecKt.shopHtmlAspectRatioLabel(item), false, 4, (Object) null), "{{titleAccent}}", titleAccentFor(item), false, 4, (Object) null);
        Integer packageDays2 = item.getPackageDays();
        String replace$default72 = StringsKt.replace$default(replace$default62, "{{packageDays}}", (packageDays2 != null || (num = packageDays2.toString()) == null) ? "" : num, false, 4, (Object) null);
        if (item.getPackageDays() != null) {
        }
        str4 = "none";
        String replace$default82 = StringsKt.replace$default(StringsKt.replace$default(replace$default72, "{{daysDisplay}}", str4, false, 4, (Object) null), "{{bulletsHtml}}", buildBulletsHtml(context, item), false, 4, (Object) null);
        unitPriceLabel = item.getUnitPriceLabel();
        if (unitPriceLabel == null) {
        }
        String replace$default92 = StringsKt.replace$default(replace$default82, "{{unitPrice}}", escape(unitPriceLabel), false, 4, (Object) null);
        unitPriceLabel2 = item.getUnitPriceLabel();
        if (unitPriceLabel2 != null) {
        }
        str5 = "none";
        String str142 = "1";
        String replace$default102 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default92, "{{unitPriceDisplay}}", str5, false, 4, (Object) null), "{{popularRibbonDisplay}}", "none", false, 4, (Object) null), "{{cornerRibbonText}}", escape(cornerRibbon.getText()), false, 4, (Object) null), "{{cornerRibbonDisplay}}", !cornerRibbon.getVisible() ? "block" : "none", false, 4, (Object) null), "{{cornerRibbonClass}}", cornerRibbon.getCssClass(), false, 4, (Object) null), "{{heroDisplay}}", resolveShopIconUrl == null ? "block" : "none", false, 4, (Object) null), "{{heroOpacity}}", resolveShopIconUrl == null ? "1" : "0.85", false, 4, (Object) null), "{{playOverlayDisplay}}", resolveShopIconUrl == null ? "none" : "block", false, 4, (Object) null);
        if (z4) {
        }
        String replace$default112 = StringsKt.replace$default(StringsKt.replace$default(replace$default102, "{{cardOpacity}}", str142, false, 4, (Object) null), "{{ctaDisabled}}", !isCtaDisabled ? "true" : CredentialEntry.FALSE_STRING, false, 4, (Object) null);
        if (isCtaDisabled) {
        }
        String replace$default122 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default112, "{{ctaDisabledClass}}", str6, false, 4, (Object) null), "{{nextClaimAtMillis}}", String.valueOf(j22), false, 4, (Object) null), "{{entitlementTimerDisplay}}", !z ? "block" : "none", false, 4, (Object) null), "{{entitlementTimerInitial}}", escape(str12), false, 4, (Object) null), "{{entitlementTimerFormat}}", escape2, false, 4, (Object) null);
        if (hasActiveEntitlement) {
        }
        str7 = "none";
        String replace$default132 = StringsKt.replace$default(replace$default122, "{{entitlementDisplay}}", str7, false, 4, (Object) null);
        if (hasActiveEntitlement) {
        }
        str8 = "";
        String replace$default142 = StringsKt.replace$default(replace$default132, "{{entitlementProgress}}", str8, false, 4, (Object) null);
        if (hasActiveEntitlement) {
            str2 = String.valueOf(ShopEntitlementUi.INSTANCE.progressPercent(shopEntitlementModel));
        }
        String replace$default152 = StringsKt.replace$default(replace$default142, "{{entitlementProgressPct}}", str2, false, 4, (Object) null);
        if (hasActiveEntitlement) {
        }
        str9 = "";
        String replace$default162 = StringsKt.replace$default(StringsKt.replace$default(replace$default152, "{{entitlementMissed}}", str9, false, 4, (Object) null), "{{entitlementMissedDisplay}}", (hasActiveEntitlement || shopEntitlementModel == null || shopEntitlementModel.getDaysMissed() <= 0) ? "none" : "block", false, 4, (Object) null);
        if (hasActiveEntitlement) {
        }
        String replace$default172 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default162, "{{coinsPerDaySuffix}}", str10, false, 4, (Object) null), "{{coinsPerDayDisplay}}", !hasActiveEntitlement ? "inline" : "none", false, 4, (Object) null), "{{videoTitle}}", escape(labels.getVideoTitle()), false, 4, (Object) null);
        if (item.getVideoOfferPhase() != VideoOfferAvailabilityPhase.CHECKING) {
        }
        String replace$default182 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default172, "{{videoSubtitle}}", escape(videoSubtitle), false, 4, (Object) null), "{{videoQuota}}", escape(labels.getVideoQuotaLabel()), false, 4, (Object) null), "{{videoLoadingDisplay}}", !labels.getVideoLoading() ? "block" : "none", false, 4, (Object) null);
        i = WhenMappings.$EnumSwitchMapping$0[item.getVideoOfferPhase().ordinal()];
        if (i != 1) {
        }
        return ShopResponsiveHtml.INSTANCE.inject(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(replace$default182, "{{videoStateClass}}", str112, false, 4, (Object) null), "{{videoCheckingDotsDisplay}}", item.getVideoOfferPhase() != VideoOfferAvailabilityPhase.CHECKING ? "inline" : "none", false, 4, (Object) null), "{{videoQuotaDisplay}}", StringsKt.isBlank(labels.getVideoQuotaLabel()) ? "none" : "inline-flex", false, 4, (Object) null), "{{ctaAction}}", !z4 ? "watchVideo()" : "purchase('" + escapeJs(item.getStoreCode()) + "')", false, 4, (Object) null));
    }

    /* compiled from: ShopHtmlInjector.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopHtmlInjector$CornerRibbon;", "", "text", "", VastAttributes.VISIBLE, "", "cssClass", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ZLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getVisible", "()Z", "getCssClass", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class CornerRibbon {
        private final String cssClass;
        private final String text;
        private final boolean visible;

        public static /* synthetic */ CornerRibbon copy$default(CornerRibbon cornerRibbon, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cornerRibbon.text;
            }
            if ((i & 2) != 0) {
                z = cornerRibbon.visible;
            }
            if ((i & 4) != 0) {
                str2 = cornerRibbon.cssClass;
            }
            return cornerRibbon.copy(str, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getVisible() {
            return this.visible;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCssClass() {
            return this.cssClass;
        }

        public final CornerRibbon copy(String text, boolean visible, String cssClass) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(cssClass, "cssClass");
            return new CornerRibbon(text, visible, cssClass);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CornerRibbon)) {
                return false;
            }
            CornerRibbon cornerRibbon = (CornerRibbon) other;
            return Intrinsics.areEqual(this.text, cornerRibbon.text) && this.visible == cornerRibbon.visible && Intrinsics.areEqual(this.cssClass, cornerRibbon.cssClass);
        }

        public int hashCode() {
            return (((this.text.hashCode() * 31) + Boolean.hashCode(this.visible)) * 31) + this.cssClass.hashCode();
        }

        public String toString() {
            return "CornerRibbon(text=" + this.text + ", visible=" + this.visible + ", cssClass=" + this.cssClass + ")";
        }

        public CornerRibbon(String text, boolean z, String cssClass) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(cssClass, "cssClass");
            this.text = text;
            this.visible = z;
            this.cssClass = cssClass;
        }

        public final String getCssClass() {
            return this.cssClass;
        }

        public final String getText() {
            return this.text;
        }

        public final boolean getVisible() {
            return this.visible;
        }
    }

    private final CornerRibbon cornerRibbon(ShopItemDataModel item) {
        ShopBadgeType badgeType = item.getBadgeType();
        int i = badgeType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[badgeType.ordinal()];
        if (i == 1) {
            return new CornerRibbon("+20%", true, "ribbon-green");
        }
        if (i == 2) {
            return new CornerRibbon("+50%", true, "ribbon-blue");
        }
        if (i == 3) {
            return new CornerRibbon(ShopRequestParams.SHOP_TYPE_NEW, true, "ribbon-silver");
        }
        return new CornerRibbon("", false, "");
    }

    private final String eyebrowFor(ShopItemDataModel item) {
        String displayLabel = item.getDisplayLabel();
        if (displayLabel != null) {
            if (StringsKt.isBlank(displayLabel)) {
                displayLabel = null;
            }
            if (displayLabel != null) {
                return displayLabel;
            }
        }
        return item.getTitle();
    }

    private final String headlineFor(ShopItemDataModel item) {
        if (item.getDisplaySection() != ShopDisplaySection.FIRST_PURCHASE) {
            return item.getTitle().length() > 0 ? item.getTitle() : item.getDescription();
        }
        String title = item.getTitle();
        String str = null;
        if (StringsKt.isBlank(title)) {
            title = null;
        }
        if (title != null) {
            return title;
        }
        String multiplier = item.getMultiplier();
        if (multiplier == null || StringsKt.isBlank(multiplier)) {
            multiplier = null;
        }
        if (multiplier != null) {
            return multiplier;
        }
        String description = item.getDescription();
        if (!StringsKt.isBlank(description) && !Intrinsics.areEqual(description, item.getTitle())) {
            str = description;
        }
        return str == null ? "" : str;
    }

    private final String subtitleFor(ShopItemDataModel item) {
        ShopDisplaySection displaySection = item.getDisplaySection();
        int i = displaySection == null ? -1 : WhenMappings.$EnumSwitchMapping$2[displaySection.ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2 || i == 3) {
            return item.getDescription();
        }
        return item.getDescription();
    }

    private final String badgeLabel(ShopBadgeType badge) {
        int i = badge == null ? -1 : WhenMappings.$EnumSwitchMapping$1[badge.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            return "+20%";
        }
        if (i == 2) {
            return "+50%";
        }
        if (i == 3) {
            return ShopRequestParams.SHOP_TYPE_NEW;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "POPULAR";
    }

    private final String buildBulletsHtml(Context context, ShopItemDataModel item) {
        if (item.getDisplaySection() == ShopDisplaySection.DAILY_DEALS) {
            return buildDailyDealBullets(context, item);
        }
        ArrayList arrayList = new ArrayList();
        if (item.getEffectCoef() != null && item.getEffectDuration() != null) {
            String string = context.getString(R.string.shop_effect_daily_bonus_format, Integer.valueOf((int) item.getEffectCoef().doubleValue()), item.getEffectDuration());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(string);
        } else if (item.getDescription().length() > 0 && !Intrinsics.areEqual(item.getDescription(), item.getTitle())) {
            arrayList.add(item.getDescription());
        }
        if (item.getNoAds()) {
            String string2 = context.getString(R.string.shop_no_ads_removes_forced_ads);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(string2);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlInjector$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence buildBulletsHtml$lambda$5;
                buildBulletsHtml$lambda$5 = ShopHtmlInjector.buildBulletsHtml$lambda$5((String) obj);
                return buildBulletsHtml$lambda$5;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildBulletsHtml$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "<div class=\"bullet\">" + INSTANCE.escape(it) + "</div>";
    }

    private final String buildDailyDealBullets(Context context, ShopItemDataModel item) {
        ArrayList arrayList = new ArrayList();
        if (item.getEffectCoef() != null && item.getEffectDuration() != null) {
            String string = context.getString(R.string.shop_effect_daily_bonus_format, Integer.valueOf((int) item.getEffectCoef().doubleValue()), item.getEffectDuration());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add("<div class=\"bullet\">" + escape(string) + "</div>");
        }
        if (item.getNoAds()) {
            String string2 = context.getString(R.string.shop_no_ads_removes_forced_ads);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add("<div class=\"bullet\">" + escape(string2) + "</div>");
        }
        if (item.getAmount() > 0) {
            arrayList.add("<div class=\"bullet coin-line\">+ " + formatCoins(item.getAmount()) + "<img class=\"coin-icon coin-icon-inline\" src=\"https://qbetapp.info/uploads_api/shop/component_betcoin.svg\" alt=\"\" /></div>");
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    private final String borderColorFor(ShopItemDataModel item) {
        Integer packageDays;
        return item.getDisplaySection() == ShopDisplaySection.FIRST_PURCHASE ? "#D4A056" : item.getBadgeType() == ShopBadgeType.BONUS_PCT_50 ? "#9B6DFF" : item.getBadgeType() == ShopBadgeType.BONUS_PCT_20 ? "#E8B84A" : item.getDisplaySection() == ShopDisplaySection.DAILY_DEALS ? "#FFB84D" : (!(item.getDisplaySection() == ShopDisplaySection.BUNDLES && (packageDays = item.getPackageDays()) != null && packageDays.intValue() == 90) && (item.getDisplaySection() == ShopDisplaySection.BUNDLES || item.getBadgeType() != ShopBadgeType.NEW)) ? "#CD7F32" : "#C0C0C0";
    }

    private final String titleAccentFor(ShopItemDataModel item) {
        Integer packageDays;
        if (item.getBadgeType() == ShopBadgeType.BONUS_PCT_50) {
            return "#B794FF";
        }
        if (item.getBadgeType() == ShopBadgeType.BONUS_PCT_20) {
            return "#E8B84A";
        }
        if ((item.getDisplaySection() == ShopDisplaySection.BUNDLES && (packageDays = item.getPackageDays()) != null && packageDays.intValue() == 90) || item.getBadgeType() == ShopBadgeType.NEW) {
            return "#E0E0E8";
        }
        item.getDisplaySection();
        ShopDisplaySection shopDisplaySection = ShopDisplaySection.BUNDLES;
        return "#FFB03A";
    }

    private final String formatCoins(long amount) {
        if (amount <= 0) {
            return "";
        }
        String format = NumberFormat.getIntegerInstance().format(amount);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final String escape(String value) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(value, X3.j.c, "&amp;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null);
    }

    private final String escapeJs(String value) {
        return StringsKt.replace$default(StringsKt.replace$default(value, "\\", "\\\\", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null);
    }
}
