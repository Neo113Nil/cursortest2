package com.paypal.oslo.feature.taptopay.domain.model.personalization;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/PromotionData;", "", "", "title", "Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/ProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "imageUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/ProductName;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/ProductName;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/ProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/PromotionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Lcom/paypal/oslo/feature/taptopay/domain/model/personalization/ProductName;", "getProductName", "getImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PromotionData {
    public static final int $stable = 0;
    private final java.lang.String imageUrl;
    private final com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName;
    private final java.lang.String title;

    public PromotionData(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.productName = productName;
        this.imageUrl = str2;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName = this.productName;
        java.lang.String str2 = this.imageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionData(title=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(productName);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.productName.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.personalization.PromotionData)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.personalization.PromotionData promotionData = (com.paypal.oslo.feature.taptopay.domain.model.personalization.PromotionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, promotionData.title) && this.productName == promotionData.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, promotionData.imageUrl);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.personalization.PromotionData copy(java.lang.String title, com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName, java.lang.String imageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.personalization.PromotionData(title, productName, imageUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName getProductName() {
        return this.productName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.personalization.PromotionData copy$default(com.paypal.oslo.feature.taptopay.domain.model.personalization.PromotionData promotionData, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.personalization.ProductName productName, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = promotionData.title;
        }
        if ((i & 2) != 0) {
            productName = promotionData.productName;
        }
        if ((i & 4) != 0) {
            str2 = promotionData.imageUrl;
        }
        return promotionData.copy(str, productName, str2);
    }
}
