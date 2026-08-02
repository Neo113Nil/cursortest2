package com.paypal.oslo.feature.searchandintelligence.domain.model.productcard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/CommerceItemType;", "type", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/CommerceItemType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductCardKt {
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType type(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCard, "");
        java.lang.String str = productCard.getDetails().get(com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel.DETAIL_KEY_COMMERCE_ITEM_TYPE);
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "PRODUCT") ? com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.PRODUCT : kotlin.jvm.internal.Intrinsics.areEqual(str, "GIFT_CARD") ? com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.GIFT_CARD : com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.UNKNOWN;
    }
}
