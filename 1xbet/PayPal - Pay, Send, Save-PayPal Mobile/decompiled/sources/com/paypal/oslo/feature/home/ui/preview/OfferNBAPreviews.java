package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/OfferNBAPreviews;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/home/ui/preview/OfferNBAPreviews$OfferNBAItemBuilder;", "", "Lkotlin/ExtensionFunctionType;", "configure", "Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "createOfferNBAItem$home_prodRelease", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "createCashbackMastercardOffer$home_prodRelease", "()Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "createPayPalDebitCardOffer$home_prodRelease", "createPayPalCreditCardOffer$home_prodRelease", "", "createSampleOfferNBAItems$home_prodRelease", "()Ljava/util/List;", "OfferNBAItemBuilder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OfferNBAPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews();

    private OfferNBAPreviews() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\"\u0010\u0017\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\"\u0010\u001a\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\"\u0010\u001d\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/OfferNBAPreviews$OfferNBAItemBuilder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "build", "()Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "imageURL", "getImageURL", "setImageURL", "label", "getLabel", "setLabel", "footerLabel", "getFooterLabel", "setFooterLabel", "footerDescription", "getFooterDescription", "setFooterDescription", "ctaText", "getCtaText", "setCtaText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OfferNBAItemBuilder {
        public static final int $stable = 8;
        private java.lang.String id = "preview-nba-offer";
        private java.lang.String title = "Sample Offer";
        private java.lang.String imageURL = "https://preview.url/card.png";
        private java.lang.String label = "Sample Label";
        private java.lang.String footerLabel = "Earn rewards";
        private java.lang.String footerDescription = "on your purchases";
        private java.lang.String ctaText = "Apply";

        public final java.lang.String getId() {
            return this.id;
        }

        public final void setId(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final void setTitle(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        }

        public final java.lang.String getImageURL() {
            return this.imageURL;
        }

        public final void setImageURL(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.imageURL = str;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        public final void setLabel(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.label = str;
        }

        public final java.lang.String getFooterLabel() {
            return this.footerLabel;
        }

        public final void setFooterLabel(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.footerLabel = str;
        }

        public final java.lang.String getFooterDescription() {
            return this.footerDescription;
        }

        public final void setFooterDescription(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.footerDescription = str;
        }

        public final java.lang.String getCtaText() {
            return this.ctaText;
        }

        public final void setCtaText(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.ctaText = str;
        }

        public final com.paypal.oslo.feature.home.domain.model.OfferNBAItem build() {
            return new com.paypal.oslo.feature.home.domain.model.OfferNBAItem(this.id, this.imageURL, this.label, this.footerLabel, this.footerDescription, this.ctaText, null, 64, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.OfferNBAItem createOfferNBAItem$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews offerNBAPreviews, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return offerNBAPreviews.createOfferNBAItem$home_prodRelease(function1);
    }

    public final com.paypal.oslo.feature.home.domain.model.OfferNBAItem createOfferNBAItem$home_prodRelease(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder, kotlin.Unit> configure) {
        com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder offerNBAItemBuilder = new com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder();
        if (configure != null) {
            configure.invoke(offerNBAItemBuilder);
        }
        return offerNBAItemBuilder.build();
    }

    public final com.paypal.oslo.feature.home.domain.model.OfferNBAItem createCashbackMastercardOffer$home_prodRelease() {
        return createOfferNBAItem$home_prodRelease(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.$r8$lambda$OPjreVfNP7USpdiculYBl2US8CY((com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder) obj);
            }
        });
    }

    public final com.paypal.oslo.feature.home.domain.model.OfferNBAItem createPayPalDebitCardOffer$home_prodRelease() {
        return createOfferNBAItem$home_prodRelease(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.$r8$lambda$staI_lvdvo8D6gkA83jKUsfgSwU((com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder) obj);
            }
        });
    }

    public final com.paypal.oslo.feature.home.domain.model.OfferNBAItem createPayPalCreditCardOffer$home_prodRelease() {
        return createOfferNBAItem$home_prodRelease(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.$r8$lambda$kjK919uHgigDPMw5B_txf3Hrn18((com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder) obj);
            }
        });
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.OfferNBAItem> createSampleOfferNBAItems$home_prodRelease() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.home.domain.model.OfferNBAItem[]{createCashbackMastercardOffer$home_prodRelease(), createPayPalDebitCardOffer$home_prodRelease(), createPayPalCreditCardOffer$home_prodRelease()});
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OPjreVfNP7USpdiculYBl2US8CY(com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder offerNBAItemBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerNBAItemBuilder, "");
        offerNBAItemBuilder.setId("1");
        offerNBAItemBuilder.setTitle("Cashback Mastercard");
        offerNBAItemBuilder.setImageURL("https://cdn.joinhoney.com/oslo-lifestyle-images/HomeDemoContent_121025/NBA%2003%20-%2001.png");
        offerNBAItemBuilder.setLabel("Cashback Mastercard");
        offerNBAItemBuilder.setFooterLabel("Earn 3% cash back");
        offerNBAItemBuilder.setFooterDescription("with the Cashback Mastercard");
        offerNBAItemBuilder.setCtaText("Apply");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kjK919uHgigDPMw5B_txf3Hrn18(com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder offerNBAItemBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerNBAItemBuilder, "");
        offerNBAItemBuilder.setId(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        offerNBAItemBuilder.setTitle("Credit Card");
        offerNBAItemBuilder.setImageURL("https://images.unsplash.com/photo-1496181133206-80ce9b88a853?w=300&h=200&fit=crop&crop=center");
        offerNBAItemBuilder.setLabel("PayPal Credit Card");
        offerNBAItemBuilder.setFooterLabel("No annual fee");
        offerNBAItemBuilder.setFooterDescription("Build your credit");
        offerNBAItemBuilder.setCtaText("See More");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$staI_lvdvo8D6gkA83jKUsfgSwU(com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.OfferNBAItemBuilder offerNBAItemBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerNBAItemBuilder, "");
        offerNBAItemBuilder.setId(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
        offerNBAItemBuilder.setTitle(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME);
        offerNBAItemBuilder.setImageURL("https://images.unsplash.com/photo-1484704849700-f032a568e944?w=300&h=200&fit=crop&crop=center");
        offerNBAItemBuilder.setLabel(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME);
        offerNBAItemBuilder.setFooterLabel("Earn rewards");
        offerNBAItemBuilder.setFooterDescription("Get 5% cashback");
        offerNBAItemBuilder.setCtaText("Apply");
        return kotlin.Unit.INSTANCE;
    }
}
