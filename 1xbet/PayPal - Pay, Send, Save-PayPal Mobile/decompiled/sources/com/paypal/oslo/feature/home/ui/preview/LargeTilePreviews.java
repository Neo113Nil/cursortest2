package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/LargeTilePreviews;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/home/ui/preview/LargeTilePreviews$Builder;", "", "Lkotlin/ExtensionFunctionType;", "configure", "Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "createLargeTileContent$home_prodRelease", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "createSampleLargeTiles$home_prodRelease", "(I)Ljava/util/List;", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LargeTilePreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews();

    private LargeTilePreviews() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\"\u0010\u0017\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010 \u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\"\u0010$\u001a\u00020#8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R$\u0010,\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR$\u0010/\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR$\u00102\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR$\u00105\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\t\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR$\u00108\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\t\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/LargeTilePreviews$Builder;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "build", "()Lcom/paypal/oslo/feature/home/domain/model/LargeTileContent;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "subtitle", "getSubtitle", "setSubtitle", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getDescription", "setDescription", "backgroundImageUrl", "getBackgroundImageUrl", "setBackgroundImageUrl", "iconUrl", "getIconUrl", "setIconUrl", "buttonText", "getButtonText", "setButtonText", "overlayGradient", "getOverlayGradient", "setOverlayGradient", "", "showFavoriteButton", "Z", "getShowFavoriteButton", "()Z", "setShowFavoriteButton", "(Z)V", "isFavorite", "setFavorite", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "getProductName", "setProductName", "paymentOption", "getPaymentOption", "setPaymentOption", "financingDetails", "getFinancingDetails", "setFinancingDetails", "currentPrice", "getCurrentPrice", "setCurrentPrice", "originalPrice", "getOriginalPrice", "setOriginalPrice"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private java.lang.String buttonText;
        private boolean isFavorite;
        private java.lang.String overlayGradient;
        private boolean showFavoriteButton;
        private java.lang.String subtitle;
        private java.lang.String id = "preview-large-tile-".concat(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        private java.lang.String title = "XX Rewards";
        private java.lang.String description = "Description";
        private java.lang.String backgroundImageUrl = "https://preview.url/background.png";
        private java.lang.String iconUrl = "https://preview.url/icon.png";
        private java.lang.String productName = "Air Force 1 '07 LV8";
        private java.lang.String paymentOption = com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanTestTag.PAYMENT_PLAN;
        private java.lang.String financingDetails = "12mo, 0% financing";
        private java.lang.String currentPrice = "$115.00";
        private java.lang.String originalPrice = "$130.00";

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

        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        public final void setSubtitle(java.lang.String str) {
            this.subtitle = str;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final void setDescription(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        public final java.lang.String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final void setBackgroundImageUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.backgroundImageUrl = str;
        }

        public final java.lang.String getIconUrl() {
            return this.iconUrl;
        }

        public final void setIconUrl(java.lang.String str) {
            this.iconUrl = str;
        }

        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        public final void setButtonText(java.lang.String str) {
            this.buttonText = str;
        }

        public final java.lang.String getOverlayGradient() {
            return this.overlayGradient;
        }

        public final void setOverlayGradient(java.lang.String str) {
            this.overlayGradient = str;
        }

        public final boolean getShowFavoriteButton() {
            return this.showFavoriteButton;
        }

        public final void setShowFavoriteButton(boolean z) {
            this.showFavoriteButton = z;
        }

        /* renamed from: isFavorite, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        public final void setFavorite(boolean z) {
            this.isFavorite = z;
        }

        public final java.lang.String getProductName() {
            return this.productName;
        }

        public final void setProductName(java.lang.String str) {
            this.productName = str;
        }

        public final java.lang.String getPaymentOption() {
            return this.paymentOption;
        }

        public final void setPaymentOption(java.lang.String str) {
            this.paymentOption = str;
        }

        public final java.lang.String getFinancingDetails() {
            return this.financingDetails;
        }

        public final void setFinancingDetails(java.lang.String str) {
            this.financingDetails = str;
        }

        public final java.lang.String getCurrentPrice() {
            return this.currentPrice;
        }

        public final void setCurrentPrice(java.lang.String str) {
            this.currentPrice = str;
        }

        public final java.lang.String getOriginalPrice() {
            return this.originalPrice;
        }

        public final void setOriginalPrice(java.lang.String str) {
            this.originalPrice = str;
        }

        public final com.paypal.oslo.feature.home.domain.model.LargeTileContent build() {
            return new com.paypal.oslo.feature.home.domain.model.LargeTileContent(this.id, this.title, this.subtitle, this.description, this.backgroundImageUrl, this.iconUrl, this.buttonText, this.overlayGradient, this.showFavoriteButton, this.isFavorite, this.productName, this.paymentOption, this.financingDetails, this.currentPrice, this.originalPrice, null, null, null, null, 491520, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.LargeTileContent createLargeTileContent$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews largeTilePreviews, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return largeTilePreviews.createLargeTileContent$home_prodRelease(function1);
    }

    public final com.paypal.oslo.feature.home.domain.model.LargeTileContent createLargeTileContent$home_prodRelease(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.Builder, kotlin.Unit> configure) {
        com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.Builder builder = new com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.Builder();
        if (configure != null) {
            configure.invoke(builder);
        }
        return builder.build();
    }

    public static /* synthetic */ java.util.List createSampleLargeTiles$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews largeTilePreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return largeTilePreviews.createSampleLargeTiles$home_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.LargeTileContent> createSampleLargeTiles$home_prodRelease(int count) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final int i = 0; i < count; i++) {
            arrayList.add(INSTANCE.createLargeTileContent$home_prodRelease(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.$r8$lambda$VnROsPlRZ11riw7u6FLa6LNhNcM(i, (com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.Builder) obj);
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VnROsPlRZ11riw7u6FLa6LNhNcM(int i, com.paypal.oslo.feature.home.ui.preview.LargeTilePreviews.Builder builder) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setId("large-tile-".concat(java.lang.String.valueOf(i)));
        builder.setTitle("XX Rewards ".concat(java.lang.String.valueOf(i)));
        int i2 = i % 2;
        builder.setSubtitle(i2 == 0 ? "Special Offer ".concat(java.lang.String.valueOf(i)) : null);
        builder.setDescription("Description ".concat(java.lang.String.valueOf(i)));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://preview.url/background");
        sb.append(i);
        sb.append(".png");
        builder.setBackgroundImageUrl(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https://preview.url/icon");
        sb2.append(i);
        sb2.append(".png");
        builder.setIconUrl(sb2.toString());
        int i3 = i % 3;
        builder.setButtonText(i3 != 0 ? "Button Text ".concat(java.lang.String.valueOf(i)) : null);
        builder.setShowFavoriteButton(false);
        builder.setFavorite(false);
        builder.setProductName("Product Name ".concat(java.lang.String.valueOf(i)));
        builder.setPaymentOption(i3 != 0 ? i3 != 1 ? "Monthly" : com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.PayLaterTitle : com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanTestTag.PAYMENT_PLAN);
        if (i2 == 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(i + 6);
            sb3.append("mo, 0% financing");
            str = sb3.toString();
        } else {
            str = "No interest or fees";
        }
        builder.setFinancingDetails(str);
        int i4 = i * 5;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        sb4.append(i4 + 99);
        sb4.append(".99");
        builder.setCurrentPrice(sb4.toString());
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        sb5.append(i4 + 125);
        sb5.append(".99");
        builder.setOriginalPrice(sb5.toString());
        return kotlin.Unit.INSTANCE;
    }
}
