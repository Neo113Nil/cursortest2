package Fj;

import java.util.List;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonuikitcore.OzonGradient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e GR_DELIVERY;
    public static final e GR_FADE_HORIZONTAL_FLOOR_1;
    public static final e GR_FAVOURITE_PROMO_BANNER;
    public static final e GR_FAVOURITE_PROMO_FADE;
    public static final e GR_FRESH;
    public static final e GR_FRESH_SKU_SCROLL;
    public static final e GR_GIFT;
    public static final e GR_HIGH_DEMAND_DELIVERY;
    public static final e GR_LIKEZON_EXPRESS_PRIMARY;
    public static final e GR_LIKEZON_EXPRESS_SECONDARY;
    public static final e GR_LIKEZON_FRESH_PRIMARY;
    public static final e GR_LIKEZON_FRESH_SECONDARY;
    public static final e GR_LIKEZON_IN_CART;
    public static final e GR_LIKEZON_OZON_PRIMARY;
    public static final e GR_LIKEZON_OZON_SECONDARY;
    public static final e GR_LOW_DEMAND_DELIVERY;
    public static final e GR_MARKETING_PRIMARY;
    public static final e GR_OVERLAY_LIVE;
    public static final e GR_OVERLAY_PRIMARY;
    public static final e GR_OVERLAY_TERTIARY_REVERSED;
    public static final e GR_OZON_CARD;
    public static final e GR_PREMIUM_PLUS;
    public static final e GR_PREMIUM_PRO;
    public static final e GR_SALE;
    public static final e GR_SBER_PAY;
    public static final e GR_SELECT_FADE;
    public static final e GR_SELECT_INSTALLMENT;
    public static final e GR_SOCIAL_PRIMARY;
    public static final e GR_SOCIAL_SECONDARY;
    public static final e GR_STARS;
    public static final e GR_STARS_PROGRAM;
    public static final e GR_TILE;
    public static final e GR_TOP_TRAVEL;
    public static final e GR_TRAVEL;

    @NotNull
    private final OzonGradient gradient;

    @NotNull
    private final String token;

    static {
        d dVar = d.GR_FAVOURITE_PROMO_FADE_1;
        String d11 = dVar.d();
        d dVar2 = d.GR_FAVOURITE_PROMO_FADE_2;
        List b02 = C7714v.b0(d11, dVar2.d());
        a aVar = a.LEFT_RIGHT;
        List b03 = C7714v.b0(dVar.d(), dVar2.d());
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        e eVar = new e("GR_FAVOURITE_PROMO_FADE", 0, "grFavouritePromoFade", new OzonGradient(b02, null, aVar, b03, null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_FAVOURITE_PROMO_FADE = eVar;
        d dVar3 = d.GR_FAVOURITE_PROMO_BANNER_1;
        String d12 = dVar3.d();
        d dVar4 = d.GR_FAVOURITE_PROMO_BANNER_2;
        List b04 = C7714v.b0(d12, dVar4.d());
        a aVar2 = a.BL_TR;
        e eVar2 = new e("GR_FAVOURITE_PROMO_BANNER", 1, "grFavouritePromoBanner", new OzonGradient(b04, null, aVar2, C7714v.b0(dVar3.d(), dVar4.d()), null, C7714v.b0(Float.valueOf(0.53f), valueOf2), 18, null));
        GR_FAVOURITE_PROMO_BANNER = eVar2;
        d dVar5 = d.GR_FRESH_SKU_SCROLL_1;
        String d13 = dVar5.d();
        d dVar6 = d.GR_FRESH_SKU_SCROLL_2;
        String d14 = dVar6.d();
        d dVar7 = d.GR_FRESH_SKU_SCROLL_3;
        List b05 = C7714v.b0(d13, d14, dVar7.d());
        a aVar3 = a.TOP_BOTTOM;
        List b06 = C7714v.b0(dVar5.d(), dVar6.d(), dVar7.d());
        Float valueOf3 = Float.valueOf(0.52f);
        e eVar3 = new e("GR_FRESH_SKU_SCROLL", 2, "grFreshSkuScroll", new OzonGradient(b05, null, aVar3, b06, null, C7714v.b0(valueOf, valueOf3, valueOf2), 18, null));
        GR_FRESH_SKU_SCROLL = eVar3;
        d dVar8 = d.GR_LOW_DEMAND_DELIVERY_1;
        String d15 = dVar8.d();
        d dVar9 = d.GR_LOW_DEMAND_DELIVERY_2;
        e eVar4 = new e("GR_LOW_DEMAND_DELIVERY", 3, "grLowDemandDelivery", new OzonGradient(C7714v.b0(d15, dVar9.d()), null, aVar, C7714v.b0(dVar8.d(), dVar9.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_LOW_DEMAND_DELIVERY = eVar4;
        d dVar10 = d.GR_HIGH_DEMAND_DELIVERY_1;
        String d16 = dVar10.d();
        d dVar11 = d.GR_HIGH_DEMAND_DELIVERY_2;
        e eVar5 = new e("GR_HIGH_DEMAND_DELIVERY", 4, "grHighDemandDelivery", new OzonGradient(C7714v.b0(d16, dVar11.d()), null, aVar, C7714v.b0(dVar10.d(), dVar11.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_HIGH_DEMAND_DELIVERY = eVar5;
        d dVar12 = d.GR_SALE_1;
        String d17 = dVar12.d();
        d dVar13 = d.GR_SALE_2;
        List b07 = C7714v.b0(d17, dVar13.d());
        a aVar4 = a.TL_BR;
        e eVar6 = new e("GR_SALE", 5, "grSale", new OzonGradient(b07, null, aVar4, C7714v.b0(dVar12.d(), dVar13.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_SALE = eVar6;
        d dVar14 = d.GR_GIFT_1;
        String d18 = dVar14.d();
        d dVar15 = d.GR_GIFT_2;
        e eVar7 = new e("GR_GIFT", 6, "grGift", new OzonGradient(C7714v.b0(d18, dVar15.d()), null, aVar4, C7714v.b0(dVar14.d(), dVar15.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_GIFT = eVar7;
        d dVar16 = d.GR_TRAVEL_1;
        String d19 = dVar16.d();
        d dVar17 = d.GR_TRAVEL_2;
        String d21 = dVar17.d();
        d dVar18 = d.GR_TRAVEL_3;
        e eVar8 = new e("GR_TRAVEL", 7, "grTravel", new OzonGradient(C7714v.b0(d19, d21, dVar18.d()), null, aVar4, C7714v.b0(dVar16.d(), dVar17.d(), dVar18.d()), null, C7714v.b0(Float.valueOf(0.4f), Float.valueOf(0.8f), valueOf2), 18, null));
        GR_TRAVEL = eVar8;
        d dVar19 = d.GR_FRESH_1;
        String d22 = dVar19.d();
        d dVar20 = d.GR_FRESH_2;
        e eVar9 = new e("GR_FRESH", 8, "grFresh", new OzonGradient(C7714v.b0(d22, dVar20.d()), null, aVar4, C7714v.b0(dVar19.d(), dVar20.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_FRESH = eVar9;
        d dVar21 = d.GR_SOCIAL_PRIMARY_1;
        String d23 = dVar21.d();
        d dVar22 = d.GR_SOCIAL_PRIMARY_2;
        e eVar10 = new e("GR_SOCIAL_PRIMARY", 9, "grSocialPrimary", new OzonGradient(C7714v.b0(d23, dVar22.d()), null, aVar4, C7714v.b0(dVar21.d(), dVar22.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_SOCIAL_PRIMARY = eVar10;
        d dVar23 = d.GR_SOCIAL_SECONDARY_1;
        String d24 = dVar23.d();
        d dVar24 = d.GR_SOCIAL_SECONDARY_2;
        e eVar11 = new e("GR_SOCIAL_SECONDARY", 10, "grSocialSecondary", new OzonGradient(C7714v.b0(d24, dVar24.d()), null, aVar4, C7714v.b0(dVar23.d(), dVar24.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_SOCIAL_SECONDARY = eVar11;
        d dVar25 = d.GR_DELIVERY_1;
        String d25 = dVar25.d();
        d dVar26 = d.GR_DELIVERY_2;
        String d26 = dVar26.d();
        d dVar27 = d.GR_DELIVERY_3;
        String d27 = dVar27.d();
        d dVar28 = d.GR_DELIVERY_4;
        List b08 = C7714v.b0(d25, d26, d27, dVar28.d());
        List b09 = C7714v.b0(dVar25.d(), dVar26.d(), dVar27.d(), dVar28.d());
        Float valueOf4 = Float.valueOf(0.25f);
        e eVar12 = new e("GR_DELIVERY", 11, "grDelivery", new OzonGradient(b08, null, aVar4, b09, null, C7714v.b0(valueOf, valueOf4, Float.valueOf(0.75f), valueOf2), 18, null));
        GR_DELIVERY = eVar12;
        d dVar29 = d.GR_TILE_1;
        String d28 = dVar29.d();
        d dVar30 = d.GR_TILE_2;
        String d29 = dVar30.d();
        d dVar31 = d.GR_TILE_3;
        e eVar13 = new e("GR_TILE", 12, "grTile", new OzonGradient(C7714v.b0(d28, d29, dVar31.d()), null, aVar4, C7714v.b0(dVar29.d(), dVar30.d(), dVar31.d()), null, C7714v.b0(Float.valueOf(0.22f), Float.valueOf(0.64f), valueOf2), 18, null));
        GR_TILE = eVar13;
        d dVar32 = d.GR_PREMIUM_PLUS_1;
        String d31 = dVar32.d();
        d dVar33 = d.GR_PREMIUM_PLUS_2;
        String d32 = dVar33.d();
        d dVar34 = d.GR_PREMIUM_PLUS_3;
        List b010 = C7714v.b0(d31, d32, dVar34.d());
        List b011 = C7714v.b0(dVar32.d(), dVar33.d(), dVar34.d());
        Float valueOf5 = Float.valueOf(0.6f);
        e eVar14 = new e("GR_PREMIUM_PLUS", 13, "grPremiumPlus", new OzonGradient(b010, null, aVar4, b011, null, C7714v.b0(valueOf, valueOf5, valueOf2), 18, null));
        GR_PREMIUM_PLUS = eVar14;
        d dVar35 = d.GR_PREMIUM_PRO_1;
        String d33 = dVar35.d();
        d dVar36 = d.GR_PREMIUM_PRO_2;
        String d34 = dVar36.d();
        d dVar37 = d.GR_PREMIUM_PRO_3;
        e eVar15 = new e("GR_PREMIUM_PRO", 14, "grPremiumPro", new OzonGradient(C7714v.b0(d33, d34, dVar37.d()), null, aVar2, C7714v.b0(dVar35.d(), dVar36.d(), dVar37.d()), null, C7714v.b0(valueOf, Float.valueOf(0.7f), valueOf2), 18, null));
        GR_PREMIUM_PRO = eVar15;
        d dVar38 = d.GR_MARKETING_PRIMARY_1;
        String d35 = dVar38.d();
        d dVar39 = d.GR_MARKETING_PRIMARY_2;
        e eVar16 = new e("GR_MARKETING_PRIMARY", 15, "grMarketingPrimary", new OzonGradient(C7714v.b0(d35, dVar39.d()), null, aVar4, C7714v.b0(dVar38.d(), dVar39.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_MARKETING_PRIMARY = eVar16;
        d dVar40 = d.GR_OVERLAY_LIVE_1;
        String d36 = dVar40.d();
        d dVar41 = d.GR_OVERLAY_LIVE_2;
        e eVar17 = new e("GR_OVERLAY_LIVE", 16, "grOverlayLive", new OzonGradient(C7714v.b0(d36, dVar41.d()), null, aVar3, C7714v.b0(dVar40.d(), dVar41.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_OVERLAY_LIVE = eVar17;
        d dVar42 = d.GR_OVERLAY_PRIMARY_1;
        String d37 = dVar42.d();
        d dVar43 = d.GR_OVERLAY_PRIMARY_2;
        e eVar18 = new e("GR_OVERLAY_PRIMARY", 17, "grOverlayPrimary", new OzonGradient(C7714v.b0(d37, dVar43.d()), null, aVar3, C7714v.b0(dVar42.d(), dVar43.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_OVERLAY_PRIMARY = eVar18;
        d dVar44 = d.GR_OVERLAY_TERTIARY_REVERSED_1;
        String d38 = dVar44.d();
        d dVar45 = d.GR_OVERLAY_TERTIARY_REVERSED_2;
        e eVar19 = new e("GR_OVERLAY_TERTIARY_REVERSED", 18, "grOverlayTertiaryReversed", new OzonGradient(C7714v.b0(d38, dVar45.d()), null, aVar3, C7714v.b0(dVar44.d(), dVar45.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_OVERLAY_TERTIARY_REVERSED = eVar19;
        d dVar46 = d.GR_FADE_HORIZONTAL_FLOOR_1_1;
        String d39 = dVar46.d();
        d dVar47 = d.GR_FADE_HORIZONTAL_FLOOR_1_2;
        e eVar20 = new e("GR_FADE_HORIZONTAL_FLOOR_1", 19, "grFadeHorizontalFloor1", new OzonGradient(C7714v.b0(d39, dVar47.d()), null, aVar, C7714v.b0(dVar46.d(), dVar47.d()), null, C7714v.b0(valueOf, valueOf5), 18, null));
        GR_FADE_HORIZONTAL_FLOOR_1 = eVar20;
        d dVar48 = d.GR_SBER_PAY_1;
        String d41 = dVar48.d();
        d dVar49 = d.GR_SBER_PAY_2;
        String d42 = dVar49.d();
        d dVar50 = d.GR_SBER_PAY_3;
        String d43 = dVar50.d();
        d dVar51 = d.GR_SBER_PAY_4;
        String d44 = dVar51.d();
        d dVar52 = d.GR_SBER_PAY_5;
        e eVar21 = new e("GR_SBER_PAY", 20, "grSberPay", new OzonGradient(C7714v.b0(d41, d42, d43, d44, dVar52.d()), null, aVar, C7714v.b0(dVar48.d(), dVar49.d(), dVar50.d(), dVar51.d(), dVar52.d()), null, C7714v.b0(valueOf, Float.valueOf(0.08f), valueOf4, valueOf3, valueOf2), 18, null));
        GR_SBER_PAY = eVar21;
        d dVar53 = d.GR_OZON_CARD_1;
        String d45 = dVar53.d();
        d dVar54 = d.GR_OZON_CARD_2;
        e eVar22 = new e("GR_OZON_CARD", 21, "grOzonCard", new OzonGradient(C7714v.b0(d45, dVar54.d()), null, aVar, C7714v.b0(dVar53.d(), dVar54.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_OZON_CARD = eVar22;
        d dVar55 = d.GR_TOP_TRAVEL_1;
        String d46 = dVar55.d();
        d dVar56 = d.GR_TOP_TRAVEL_2;
        e eVar23 = new e("GR_TOP_TRAVEL", 22, "grTopTravel", new OzonGradient(C7714v.b0(d46, dVar56.d()), null, aVar4, C7714v.b0(dVar55.d(), dVar56.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_TOP_TRAVEL = eVar23;
        d dVar57 = d.GR_STARS_1;
        String d47 = dVar57.d();
        d dVar58 = d.GR_STARS_2;
        e eVar24 = new e("GR_STARS", 23, "grStars", new OzonGradient(C7714v.b0(d47, dVar58.d()), null, aVar4, C7714v.b0(dVar57.d(), dVar58.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_STARS = eVar24;
        d dVar59 = d.GR_SELECT_FADE_1;
        String d48 = dVar59.d();
        d dVar60 = d.GR_SELECT_FADE_2;
        e eVar25 = new e("GR_SELECT_FADE", 24, "grSelectFade", new OzonGradient(C7714v.b0(d48, dVar60.d()), null, aVar3, C7714v.b0(dVar59.d(), dVar60.d()), null, C7714v.b0(valueOf, Float.valueOf(0.9f)), 18, null));
        GR_SELECT_FADE = eVar25;
        d dVar61 = d.GR_SELECT_INSTALLMENT_1;
        String d49 = dVar61.d();
        d dVar62 = d.GR_SELECT_INSTALLMENT_2;
        e eVar26 = new e("GR_SELECT_INSTALLMENT", 25, "grSelectInstallment", new OzonGradient(C7714v.b0(d49, dVar62.d()), null, aVar4, C7714v.b0(dVar61.d(), dVar62.d()), null, C7714v.b0(valueOf, valueOf2), 18, null));
        GR_SELECT_INSTALLMENT = eVar26;
        d dVar63 = d.GR_STARS_PROGRAM_1;
        String d51 = dVar63.d();
        d dVar64 = d.GR_STARS_PROGRAM_2;
        String d52 = dVar64.d();
        d dVar65 = d.GR_STARS_PROGRAM_3;
        String d53 = dVar65.d();
        d dVar66 = d.GR_STARS_PROGRAM_4;
        e eVar27 = new e("GR_STARS_PROGRAM", 26, "grStarsProgram", new OzonGradient(C7714v.b0(d51, d52, d53, dVar66.d()), null, aVar4, C7714v.b0(dVar63.d(), dVar64.d(), dVar65.d(), dVar66.d()), null, C7714v.b0(Float.valueOf(0.23f), Float.valueOf(0.51f), Float.valueOf(0.74f), valueOf2), 18, null));
        GR_STARS_PROGRAM = eVar27;
        d dVar67 = d.GR_LIKEZON_IN_CART_1;
        String d54 = dVar67.d();
        d dVar68 = d.GR_LIKEZON_IN_CART_2;
        String d55 = dVar68.d();
        d dVar69 = d.GR_LIKEZON_IN_CART_3;
        List b012 = C7714v.b0(d54, d55, dVar69.d());
        List b013 = C7714v.b0(dVar67.d(), dVar68.d(), dVar69.d());
        Float valueOf6 = Float.valueOf(0.5f);
        e eVar28 = new e("GR_LIKEZON_IN_CART", 27, "grLikezonInCart", new OzonGradient(b012, null, aVar4, b013, null, C7714v.b0(valueOf, valueOf6, valueOf2), 18, null));
        GR_LIKEZON_IN_CART = eVar28;
        d dVar70 = d.GR_LIKEZON_OZON_PRIMARY_1;
        String d56 = dVar70.d();
        d dVar71 = d.GR_LIKEZON_OZON_PRIMARY_2;
        String d57 = dVar71.d();
        d dVar72 = d.GR_LIKEZON_OZON_PRIMARY_3;
        e eVar29 = new e("GR_LIKEZON_OZON_PRIMARY", 28, "grLikezonOzonPrimary", new OzonGradient(C7714v.b0(d56, d57, dVar72.d()), null, aVar4, C7714v.b0(dVar70.d(), dVar71.d(), dVar72.d()), null, C7714v.b0(valueOf, valueOf6, valueOf2), 18, null));
        GR_LIKEZON_OZON_PRIMARY = eVar29;
        d dVar73 = d.GR_LIKEZON_OZON_SECONDARY_1;
        String d58 = dVar73.d();
        d dVar74 = d.GR_LIKEZON_OZON_SECONDARY_2;
        String d59 = dVar74.d();
        d dVar75 = d.GR_LIKEZON_OZON_SECONDARY_3;
        e eVar30 = new e("GR_LIKEZON_OZON_SECONDARY", 29, "grLikezonOzonSecondary", new OzonGradient(C7714v.b0(d58, d59, dVar75.d()), null, aVar4, C7714v.b0(dVar73.d(), dVar74.d(), dVar75.d()), null, C7714v.b0(valueOf, valueOf6, valueOf2), 18, null));
        GR_LIKEZON_OZON_SECONDARY = eVar30;
        d dVar76 = d.GR_LIKEZON_EXPRESS_PRIMARY_1;
        String d61 = dVar76.d();
        d dVar77 = d.GR_LIKEZON_EXPRESS_PRIMARY_2;
        String d62 = dVar77.d();
        d dVar78 = d.GR_LIKEZON_EXPRESS_PRIMARY_3;
        e eVar31 = new e("GR_LIKEZON_EXPRESS_PRIMARY", 30, "grLikezonExpressPrimary", new OzonGradient(C7714v.b0(d61, d62, dVar78.d()), null, aVar4, C7714v.b0(dVar76.d(), dVar77.d(), dVar78.d()), null, C7714v.b0(valueOf, valueOf6, valueOf2), 18, null));
        GR_LIKEZON_EXPRESS_PRIMARY = eVar31;
        d dVar79 = d.GR_LIKEZON_EXPRESS_SECONDARY_1;
        String d63 = dVar79.d();
        d dVar80 = d.GR_LIKEZON_EXPRESS_SECONDARY_2;
        String d64 = dVar80.d();
        d dVar81 = d.GR_LIKEZON_EXPRESS_SECONDARY_3;
        e eVar32 = new e("GR_LIKEZON_EXPRESS_SECONDARY", 31, "grLikezonExpressSecondary", new OzonGradient(C7714v.b0(d63, d64, dVar81.d()), null, aVar4, C7714v.b0(dVar79.d(), dVar80.d(), dVar81.d()), null, C7714v.b0(valueOf, valueOf6, valueOf2), 18, null));
        GR_LIKEZON_EXPRESS_SECONDARY = eVar32;
        d dVar82 = d.GR_LIKEZON_FRESH_PRIMARY_1;
        String d65 = dVar82.d();
        d dVar83 = d.GR_LIKEZON_FRESH_PRIMARY_2;
        String d66 = dVar83.d();
        d dVar84 = d.GR_LIKEZON_FRESH_PRIMARY_3;
        e eVar33 = new e("GR_LIKEZON_FRESH_PRIMARY", 32, "grLikezonFreshPrimary", new OzonGradient(C7714v.b0(d65, d66, dVar84.d()), null, aVar4, C7714v.b0(dVar82.d(), dVar83.d(), dVar84.d()), null, C7714v.b0(valueOf, valueOf6, valueOf2), 18, null));
        GR_LIKEZON_FRESH_PRIMARY = eVar33;
        d dVar85 = d.GR_LIKEZON_FRESH_SECONDARY_1;
        String d67 = dVar85.d();
        d dVar86 = d.GR_LIKEZON_FRESH_SECONDARY_2;
        String d68 = dVar86.d();
        d dVar87 = d.GR_LIKEZON_FRESH_SECONDARY_3;
        e eVar34 = new e("GR_LIKEZON_FRESH_SECONDARY", 33, "grLikezonFreshSecondary", new OzonGradient(C7714v.b0(d67, d68, dVar87.d()), null, aVar4, C7714v.b0(dVar85.d(), dVar86.d(), dVar87.d()), null, C7714v.b0(valueOf, valueOf6, valueOf2), 18, null));
        GR_LIKEZON_FRESH_SECONDARY = eVar34;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, eVar34};
        $VALUES = eVarArr;
        $ENTRIES = Xc.b.a(eVarArr);
    }

    private e(String str, int i11, String str2, OzonGradient ozonGradient) {
        this.token = str2;
        this.gradient = ozonGradient;
    }

    @NotNull
    public static Xc.a<e> a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final OzonGradient b() {
        return this.gradient;
    }

    @NotNull
    public final String d() {
        return this.token;
    }
}
