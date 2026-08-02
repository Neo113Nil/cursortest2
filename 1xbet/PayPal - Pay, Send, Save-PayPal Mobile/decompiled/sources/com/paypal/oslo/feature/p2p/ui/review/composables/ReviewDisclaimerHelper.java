package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/composables/ReviewDisclaimerHelper;", "", "<init>", "()V", "Lcom/paypal/pds/core/RichText;", "buildDisclaimerRichText", "()Lcom/paypal/pds/core/RichText;", "Ljava/util/Locale;", "locale", "", "buildSellerProtectionUrl", "(Ljava/util/Locale;)Ljava/lang/String;", "buildPurchaseProtectionUrl", "REVIEW_DISCLAIMER_LINK_TEXT", "Ljava/lang/String;", "REVIEW_DISCLAIMER_TEXT", "SELLER_PROTECTION_URL_TEMPLATE", "PURCHASE_PROTECTION_URL_TEMPLATE", "SELLER_PROTECTION_LINK_TAG"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewDisclaimerHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.review.composables.ReviewDisclaimerHelper INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewDisclaimerHelper();
    public static final java.lang.String PURCHASE_PROTECTION_URL_TEMPLATE = "https://www.paypal.com/%1$s/legalhub/buyer-protection?locale.x=%2$s";
    public static final java.lang.String REVIEW_DISCLAIMER_LINK_TEXT = "PayPal Seller Protection";
    public static final java.lang.String REVIEW_DISCLAIMER_TEXT = "If you're requesting money for a purchase, you'll pay a seller fee when your contact pays you. You could be covered by";
    public static final java.lang.String SELLER_PROTECTION_LINK_TAG = "seller_protection";
    public static final java.lang.String SELLER_PROTECTION_URL_TEMPLATE = "https://www.paypal.com/%1$s/legalhub/seller-protection?locale.x=%2$s";

    private ReviewDisclaimerHelper() {
    }

    public final com.paypal.pds.core.RichText buildDisclaimerRichText() {
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewDisclaimerHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewDisclaimerHelper.$r8$lambda$fQ6gwoDIfYumBzC8zVHfkoYvOoc((com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public final java.lang.String buildSellerProtectionUrl(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String country = locale.getCountry();
        if (kotlin.text.StringsKt.isBlank(country)) {
            country = "us";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase = country.toLowerCase(locale2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String obj = locale.toString();
        if (obj.length() == 0) {
            obj = "en_US";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(SELLER_PROTECTION_URL_TEMPLATE, java.util.Arrays.copyOf(new java.lang.Object[]{lowerCase, obj}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String buildPurchaseProtectionUrl(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String country = locale.getCountry();
        if (kotlin.text.StringsKt.isBlank(country)) {
            country = "us";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase = country.toLowerCase(locale2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String obj = locale.toString();
        if (obj.length() == 0) {
            obj = "en_US";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(PURCHASE_PROTECTION_URL_TEMPLATE, java.util.Arrays.copyOf(new java.lang.Object[]{lowerCase, obj}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fQ6gwoDIfYumBzC8zVHfkoYvOoc(com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, "If you're requesting money for a purchase, you'll pay a seller fee when your contact pays you. You could be covered by ", null, false, 6, null);
        builder.appendLink(REVIEW_DISCLAIMER_LINK_TEXT, SELLER_PROTECTION_LINK_TAG);
        com.paypal.pds.core.Builder.append$default(builder, ".", null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }
}
