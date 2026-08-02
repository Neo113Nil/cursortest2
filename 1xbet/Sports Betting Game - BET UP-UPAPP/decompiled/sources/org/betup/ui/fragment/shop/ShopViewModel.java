package org.betup.ui.fragment.shop;

import androidx.lifecycle.ViewModel;
import com.android.billingclient.api.ProductDetails;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.model.remote.entity.shop.ShopLayoutModel;
import org.betup.model.remote.entity.shop.ShopLayoutSectionModel;
import org.betup.services.billing.ProductDetailsPrice;
import org.betup.ui.fragment.shop.compose.ShopContentUiModel;
import org.betup.ui.fragment.shop.compose.ShopItemDataModel;
import org.betup.ui.fragment.shop.compose.ShopSectionUiModel;
import org.betup.utils.PriceFormatUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopViewModel.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bJ(\u0010\u0011\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bJ\u0014\u0010\u0017\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bJ$\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0017\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010$¨\u0006%"}, d2 = {"Lorg/betup/ui/fragment/shop/ShopViewModel;", "Landroidx/lifecycle/ViewModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "buildContentFromLayout", "Lorg/betup/ui/fragment/shop/compose/ShopContentUiModel;", TtmlNode.TAG_LAYOUT, "Lorg/betup/model/remote/entity/shop/ShopLayoutModel;", "videoReward", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "entitlements", "", "Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "prepareItemsForBilling", "", "items", "Lorg/betup/model/remote/entity/shop/NewShopItemModel;", "applyPrices", "details", "", "", "Lcom/android/billingclient/api/ProductDetails;", "itemsMissingPlayPrice", "resetOldPrices", "applyOldPriceFromPlay", "item", "formatProductPrice", "productDetails", "flattenLayoutItems", "sectionTitleRes", "", "section", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "parseInstantMillis", "", "iso", "(Ljava/lang/String;)Ljava/lang/Long;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopViewModel extends ViewModel {
    public static final int $stable = 8;

    /* compiled from: ShopViewModel.kt */
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopContentUiModel buildContentFromLayout$default(ShopViewModel shopViewModel, ShopLayoutModel shopLayoutModel, ShopItemDataModel shopItemDataModel, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = shopLayoutModel.getActiveEntitlements();
        }
        return shopViewModel.buildContentFromLayout(shopLayoutModel, shopItemDataModel, list);
    }

    public final ShopContentUiModel buildContentFromLayout(ShopLayoutModel layout, ShopItemDataModel videoReward, List<ShopEntitlementModel> entitlements) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(videoReward, "videoReward");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        List<ShopEntitlementModel> list = entitlements;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((ShopEntitlementModel) obj).getStoreCode(), obj);
        }
        List<ShopLayoutSectionModel> sections = layout.getSections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
        for (ShopLayoutSectionModel shopLayoutSectionModel : sections) {
            ShopDisplaySection type = shopLayoutSectionModel.getType();
            int sectionTitleRes = sectionTitleRes(shopLayoutSectionModel.getType());
            String resetAt = shopLayoutSectionModel.getResetAt();
            Long parseInstantMillis = resetAt != null ? parseInstantMillis(resetAt) : null;
            List<NewShopItemModel> items = shopLayoutSectionModel.getItems();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            for (NewShopItemModel newShopItemModel : items) {
                arrayList2.add(ShopItemDataModel.INSTANCE.fromNewShopItemModel(newShopItemModel, (ShopEntitlementModel) linkedHashMap.get(newShopItemModel.getStoreCode())));
            }
            arrayList.add(new ShopSectionUiModel(type, sectionTitleRes, parseInstantMillis, arrayList2));
        }
        return new ShopContentUiModel(arrayList, videoReward, entitlements, true);
    }

    public final void prepareItemsForBilling(List<NewShopItemModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        resetOldPrices(items);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            ((NewShopItemModel) it.next()).setPrice(null);
        }
    }

    public final void applyPrices(List<NewShopItemModel> items, Map<String, ProductDetails> details) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(details, "details");
        for (NewShopItemModel newShopItemModel : items) {
            ProductDetails productDetails = details.get(newShopItemModel.getStoreCode());
            String formatProductPrice = productDetails != null ? formatProductPrice(productDetails) : null;
            String str = formatProductPrice;
            if (str != null && !StringsKt.isBlank(str)) {
                newShopItemModel.setPrice(formatProductPrice);
            }
            applyOldPriceFromPlay(newShopItemModel, details);
        }
    }

    public final List<String> itemsMissingPlayPrice(List<NewShopItemModel> items) {
        String price;
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            NewShopItemModel newShopItemModel = (NewShopItemModel) obj;
            if (!StringsKt.isBlank(newShopItemModel.getStoreCode()) && ((price = newShopItemModel.getPrice()) == null || StringsKt.isBlank(price))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((NewShopItemModel) it.next()).getStoreCode());
        }
        return CollectionsKt.distinct(arrayList3);
    }

    public final void resetOldPrices(List<NewShopItemModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            ((NewShopItemModel) it.next()).setOldPrice(null);
        }
    }

    private final void applyOldPriceFromPlay(NewShopItemModel item, Map<String, ProductDetails> details) {
        String formatProductPrice;
        String oldStoreCode = item.getOldStoreCode();
        String str = null;
        String obj = oldStoreCode != null ? StringsKt.trim((CharSequence) oldStoreCode).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() == 0) {
            item.setOldPrice(null);
            return;
        }
        ProductDetails productDetails = details.get(obj);
        if (productDetails != null && (formatProductPrice = formatProductPrice(productDetails)) != null && formatProductPrice.length() > 0) {
            str = formatProductPrice;
        }
        item.setOldPrice(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    private final String formatProductPrice(ProductDetails productDetails) {
        String str;
        try {
            long priceAmountMicros = ProductDetailsPrice.priceAmountMicros(productDetails);
            String priceCurrencyCode = ProductDetailsPrice.priceCurrencyCode(productDetails);
            String formattedPrice = ProductDetailsPrice.formattedPrice(productDetails);
            if (priceAmountMicros > 0 && (str = priceCurrencyCode) != null && str.length() != 0) {
                formattedPrice = PriceFormatUtils.INSTANCE.formatPriceWithCurrencySymbol(priceAmountMicros, priceCurrencyCode);
                productDetails = productDetails;
                return formattedPrice;
            }
            ?? ensureSymbolBeforePrice = PriceFormatUtils.INSTANCE.ensureSymbolBeforePrice(formattedPrice, priceCurrencyCode);
            productDetails = ensureSymbolBeforePrice;
            if (ensureSymbolBeforePrice != 0) {
                formattedPrice = ensureSymbolBeforePrice;
                productDetails = ensureSymbolBeforePrice;
            }
            return formattedPrice;
        } catch (Exception unused) {
            return ProductDetailsPrice.formattedPrice(productDetails);
        }
    }

    public final List<NewShopItemModel> flattenLayoutItems(ShopLayoutModel layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        List<ShopLayoutSectionModel> sections = layout.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ShopLayoutSectionModel) it.next()).getItems());
        }
        return arrayList;
    }

    private final int sectionTitleRes(ShopDisplaySection section) {
        int i = WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
        if (i == 1) {
            return R.string.shop_section_first_purchase;
        }
        if (i == 2) {
            return R.string.shop_section_daily_deals;
        }
        if (i == 3) {
            return R.string.shop_section_bundles;
        }
        if (i == 4) {
            return R.string.shop_section_coin_packs;
        }
        if (i == 5) {
            return R.string.shop_section_free_rewards;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Long parseInstantMillis(String iso) {
        Object m10853constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ShopViewModel shopViewModel = this;
            m10853constructorimpl = Result.m10853constructorimpl(Long.valueOf(Instant.parse(iso).toEpochMilli()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = null;
        }
        return (Long) m10853constructorimpl;
    }
}
