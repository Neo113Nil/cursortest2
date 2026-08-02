package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\rR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitsUiData;", "", "", "title", "frontImage", "merchantName", "merchantLogo", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitsUiDataItem;", "benefitsItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitsUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getFrontImage", "getMerchantName", "getMerchantLogo", "Ljava/util/List;", "getBenefitsItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BenefitsUiData {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem> benefitsItems;
    private final java.lang.String frontImage;
    private final java.lang.String merchantLogo;
    private final java.lang.String merchantName;
    private final java.lang.String title;

    public BenefitsUiData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.frontImage = str2;
        this.merchantName = str3;
        this.merchantLogo = str4;
        this.benefitsItems = list;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getFrontImage() {
        return this.frontImage;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getMerchantLogo() {
        return this.merchantLogo;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem> getBenefitsItems() {
        return this.benefitsItems;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.frontImage;
        java.lang.String str3 = this.merchantName;
        java.lang.String str4 = this.merchantLogo;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem> list = this.benefitsItems;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BenefitsUiData(title=");
        sb.append(str);
        sb.append(", frontImage=");
        sb.append(str2);
        sb.append(", merchantName=");
        sb.append(str3);
        sb.append(", merchantLogo=");
        sb.append(str4);
        sb.append(", benefitsItems=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.frontImage.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + this.merchantLogo.hashCode()) * 31) + this.benefitsItems.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiData benefitsUiData = (com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, benefitsUiData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.frontImage, benefitsUiData.frontImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, benefitsUiData.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogo, benefitsUiData.merchantLogo) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitsItems, benefitsUiData.benefitsItems);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiData copy(java.lang.String title, java.lang.String frontImage, java.lang.String merchantName, java.lang.String merchantLogo, java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem> benefitsItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frontImage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantLogo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsItems, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiData(title, frontImage, merchantName, merchantLogo, benefitsItems);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem> component5() {
        return this.benefitsItems;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMerchantLogo() {
        return this.merchantLogo;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFrontImage() {
        return this.frontImage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiData copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiData benefitsUiData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = benefitsUiData.title;
        }
        if ((i & 2) != 0) {
            str2 = benefitsUiData.frontImage;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = benefitsUiData.merchantName;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = benefitsUiData.merchantLogo;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            list = benefitsUiData.benefitsItems;
        }
        return benefitsUiData.copy(str, str5, str6, str7, list);
    }
}
