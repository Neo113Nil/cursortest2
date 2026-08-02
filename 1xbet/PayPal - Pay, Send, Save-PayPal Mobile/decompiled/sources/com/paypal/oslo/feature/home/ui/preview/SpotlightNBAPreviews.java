package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/SpotlightNBAPreviews;", "", "<init>", "()V", "", "id", "cardImageURL", "footerText", "footerSubText", "buttonText", "Lcom/paypal/oslo/feature/home/domain/model/SpotlightNBA;", "createSpotlightNBA$home_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/SpotlightNBA;", "createCashbackCard$home_prodRelease", "()Lcom/paypal/oslo/feature/home/domain/model/SpotlightNBA;", "", "createTestItems$home_prodRelease", "()Ljava/util/List;", "title", "subtitle", "items", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "createTestSection$home_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/domain/model/Section;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SpotlightNBAPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.SpotlightNBAPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.SpotlightNBAPreviews();

    private SpotlightNBAPreviews() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.SpotlightNBA createSpotlightNBA$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SpotlightNBAPreviews spotlightNBAPreviews, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "test-nba-default";
        }
        if ((i & 2) != 0) {
            str2 = "https://www.paypalobjects.com/home-nav/financial-product-cards/card-art/PayPalTestStandardCard.png";
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = "Earn rewards on PayPal purchases.";
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = null;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = "Learn More";
        }
        return spotlightNBAPreviews.createSpotlightNBA$home_prodRelease(str, str6, str7, str8, str5);
    }

    public final com.paypal.oslo.feature.home.domain.model.SpotlightNBA createSpotlightNBA$home_prodRelease(java.lang.String id, java.lang.String cardImageURL, java.lang.String footerText, java.lang.String footerSubText, java.lang.String buttonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardImageURL, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footerText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
        return new com.paypal.oslo.feature.home.domain.model.SpotlightNBA(id, cardImageURL, footerText, footerSubText, buttonText, null, null, null, null, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
    }

    public final com.paypal.oslo.feature.home.domain.model.SpotlightNBA createCashbackCard$home_prodRelease() {
        return createSpotlightNBA$home_prodRelease$default(this, "test-cashback-card", "https://www.paypalobjects.com/home-nav/financial-product-cards/card-art/PayPalTestStandardCard.png", "Earn rewards on your PayPal purchases.", null, "Apply Now", 8, null);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.SpotlightNBA> createTestItems$home_prodRelease() {
        return kotlin.collections.CollectionsKt.listOf(createCashbackCard$home_prodRelease());
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Section createTestSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SpotlightNBAPreviews spotlightNBAPreviews, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "spotlight_nba";
        }
        java.lang.String str5 = (i & 2) != 0 ? null : str2;
        java.lang.String str6 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.listOf(spotlightNBAPreviews.createCashbackCard$home_prodRelease());
        }
        return spotlightNBAPreviews.createTestSection$home_prodRelease(str, str5, str6, list, (i & 16) == 0 ? str4 : null);
    }

    public final com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SpotlightNBA> createTestSection$home_prodRelease(java.lang.String id, java.lang.String title, java.lang.String subtitle, java.util.List<com.paypal.oslo.feature.home.domain.model.SpotlightNBA> items, java.lang.String buttonText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.feature.home.domain.model.Section<>(id, com.paypal.oslo.feature.home.domain.model.SectionTypes.NEXT_BEST_ACTION, title, subtitle, items, buttonText, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 192, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
