package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aO\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "toolBarPrefix", "ctaText", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabInterstitialDetails;", "generateMockInterstitialDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabInterstitialDetails;", "url", "merchantName", "merchantDisplayName", "toolbarSubtitle", "honeyStoreId", "interstitialDetails", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "generateMockOfferDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabInterstitialDetails;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "generateMockOfferDetailsWithInterstitial", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockDataUtilsKt {
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails generateMockInterstitialDetails$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "Buy Now Pay Later at ";
        }
        if ((i & 2) != 0) {
            str2 = "Split it your way with PayPal Pay in 4";
        }
        if ((i & 4) != 0) {
            str3 = "Taking you to";
        }
        if ((i & 8) != 0) {
            str4 = "PayPal";
        }
        return generateMockInterstitialDetails(str, str2, str3, str4);
    }

    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails generateMockInterstitialDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails(com.paypal.pds.core.RichTextKt.toRichText$default(str, null, false, null, 7, null), str2, str3, str4, null, 16, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails generateMockOfferDetails$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails iabInterstitialDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "https://nike.com";
        }
        if ((i & 2) != 0) {
            str2 = "Nike";
        }
        java.lang.String str6 = str2;
        java.lang.String str7 = (i & 4) != 0 ? null : str3;
        java.lang.String str8 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            str5 = "test-store";
        }
        return generateMockOfferDetails(str, str6, str7, str8, str5, (i & 32) != 0 ? null : iabInterstitialDetails);
    }

    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails generateMockOfferDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails iabInterstitialDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails(str, str2, null, str3, null, null, str4, str5, null, null, null, null, null, iabInterstitialDetails, 7988, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails generateMockOfferDetailsWithInterstitial$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "https://nike.com";
        }
        if ((i & 2) != 0) {
            str2 = "Nike";
        }
        if ((i & 4) != 0) {
            str3 = "Nike";
        }
        if ((i & 8) != 0) {
            str4 = "test-store";
        }
        return generateMockOfferDetailsWithInterstitial(str, str2, str3, str4);
    }

    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails generateMockOfferDetailsWithInterstitial(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        return generateMockOfferDetails$default(str, str2, str3, null, str4, generateMockInterstitialDetails$default(null, null, null, null, 15, null), 8, null);
    }
}
