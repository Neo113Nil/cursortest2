package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductTier;", "", "<init>", "(Ljava/lang/String;I)V", "MASTERCARD_STANDARD", "MASTERCARD_WORLD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductTier {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier MASTERCARD_STANDARD;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier MASTERCARD_WORLD;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ProductTier(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier productTier = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier("MASTERCARD_STANDARD", 0);
        MASTERCARD_STANDARD = productTier;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier productTier2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier("MASTERCARD_WORLD", 1);
        MASTERCARD_WORLD = productTier2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier productTier3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier("UNKNOWN", 2);
        UNKNOWN = productTier3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier[] productTierArr = {productTier, productTier2, productTier3};
        getHighResolutionOutputSizeshNQ4ISI = productTierArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(productTierArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
