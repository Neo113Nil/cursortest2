package org.betup.services.billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.ProductDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ProductDetailsPrice.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lorg/betup/services/billing/ProductDetailsPrice;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "formattedPrice", "", "details", "Lcom/android/billingclient/api/ProductDetails;", "priceAmountMicros", "", "priceCurrencyCode", "offerToken", "subscriptionFormattedPrice", "subscriptionPriceAmountMicros", "subscriptionPriceCurrencyCode", "firstSubscriptionPricingPhase", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductDetailsPrice {
    public static final int $stable = 0;
    public static final ProductDetailsPrice INSTANCE = new ProductDetailsPrice();

    private ProductDetailsPrice() {
    }

    @JvmStatic
    public static final String formattedPrice(ProductDetails details) {
        if (details == null) {
            return null;
        }
        String productType = details.getProductType();
        if (productType.hashCode() == 3541555 && productType.equals(BillingClient.ProductType.SUBS)) {
            return INSTANCE.subscriptionFormattedPrice(details);
        }
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = details.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails != null) {
            return oneTimePurchaseOfferDetails.getFormattedPrice();
        }
        return null;
    }

    @JvmStatic
    public static final long priceAmountMicros(ProductDetails details) {
        if (details == null) {
            return 0L;
        }
        String productType = details.getProductType();
        if (productType.hashCode() == 3541555 && productType.equals(BillingClient.ProductType.SUBS)) {
            return INSTANCE.subscriptionPriceAmountMicros(details);
        }
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = details.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails != null) {
            return oneTimePurchaseOfferDetails.getPriceAmountMicros();
        }
        return 0L;
    }

    @JvmStatic
    public static final String priceCurrencyCode(ProductDetails details) {
        if (details == null) {
            return null;
        }
        String productType = details.getProductType();
        if (productType.hashCode() == 3541555 && productType.equals(BillingClient.ProductType.SUBS)) {
            return INSTANCE.subscriptionPriceCurrencyCode(details);
        }
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = details.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails != null) {
            return oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        }
        return null;
    }

    @JvmStatic
    public static final String offerToken(ProductDetails details) {
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        if (details == null) {
            return null;
        }
        String productType = details.getProductType();
        if (productType.hashCode() == 3541555 && productType.equals(BillingClient.ProductType.SUBS)) {
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = details.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails2 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails2)) == null) {
                return null;
            }
            return subscriptionOfferDetails.getOfferToken();
        }
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = details.getOneTimePurchaseOfferDetails();
        if (oneTimePurchaseOfferDetails != null) {
            return oneTimePurchaseOfferDetails.getOfferToken();
        }
        return null;
    }

    private final String subscriptionFormattedPrice(ProductDetails details) {
        ProductDetails.PricingPhase firstSubscriptionPricingPhase = firstSubscriptionPricingPhase(details);
        if (firstSubscriptionPricingPhase != null) {
            return firstSubscriptionPricingPhase.getFormattedPrice();
        }
        return null;
    }

    private final long subscriptionPriceAmountMicros(ProductDetails details) {
        ProductDetails.PricingPhase firstSubscriptionPricingPhase = firstSubscriptionPricingPhase(details);
        if (firstSubscriptionPricingPhase != null) {
            return firstSubscriptionPricingPhase.getPriceAmountMicros();
        }
        return 0L;
    }

    private final String subscriptionPriceCurrencyCode(ProductDetails details) {
        ProductDetails.PricingPhase firstSubscriptionPricingPhase = firstSubscriptionPricingPhase(details);
        if (firstSubscriptionPricingPhase != null) {
            return firstSubscriptionPricingPhase.getPriceCurrencyCode();
        }
        return null;
    }

    private final ProductDetails.PricingPhase firstSubscriptionPricingPhase(ProductDetails details) {
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        ProductDetails.PricingPhases pricingPhases;
        List<ProductDetails.PricingPhase> pricingPhaseList;
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = details.getSubscriptionOfferDetails();
        if (subscriptionOfferDetails2 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) CollectionsKt.firstOrNull((List) subscriptionOfferDetails2)) == null || (pricingPhases = subscriptionOfferDetails.getPricingPhases()) == null || (pricingPhaseList = pricingPhases.getPricingPhaseList()) == null) {
            return null;
        }
        return (ProductDetails.PricingPhase) CollectionsKt.firstOrNull((List) pricingPhaseList);
    }
}
