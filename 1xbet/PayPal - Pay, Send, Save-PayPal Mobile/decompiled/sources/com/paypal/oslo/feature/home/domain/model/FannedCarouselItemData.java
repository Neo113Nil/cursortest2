package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0084\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0014R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "", "", "id", "imageUrl", "title", "subtitle", "primaryColor", "secondaryColor", "storeUrl", "", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "benefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "benefitsMetadata", "Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "instrumentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "component10", "()Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;)Lcom/paypal/oslo/feature/home/domain/model/FannedCarouselItemData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getImageUrl", "getTitle", "getSubtitle", "getPrimaryColor", "getSecondaryColor", "getStoreUrl", "Ljava/util/List;", "getBenefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "getBenefitsMetadata", "Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "getInstrumentation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FannedCarouselItemData {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes;
    private final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata;
    private final java.lang.String id;
    private final java.lang.String imageUrl;
    private final com.paypal.oslo.feature.home.domain.model.TileInstrumentation instrumentation;
    private final java.lang.String primaryColor;
    private final java.lang.String secondaryColor;
    private final java.lang.String storeUrl;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    /* JADX WARN: Multi-variable type inference failed */
    public FannedCarouselItemData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
        this.id = str;
        this.imageUrl = str2;
        this.title = str3;
        this.subtitle = str4;
        this.primaryColor = str5;
        this.secondaryColor = str6;
        this.storeUrl = str7;
        this.benefitTypes = list;
        this.benefitsMetadata = benefitsMetadata;
        this.instrumentation = tileInstrumentation;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final java.lang.String getPrimaryColor() {
        return this.primaryColor;
    }

    public final java.lang.String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final java.lang.String getStoreUrl() {
        return this.storeUrl;
    }

    public /* synthetic */ FannedCarouselItemData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL) : list, (i & 256) != 0 ? new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : benefitsMetadata, (i & 512) != 0 ? null : tileInstrumentation);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> getBenefitTypes() {
        return this.benefitTypes;
    }

    public final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata getBenefitsMetadata() {
        return this.benefitsMetadata;
    }

    public final com.paypal.oslo.feature.home.domain.model.TileInstrumentation getInstrumentation() {
        return this.instrumentation;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.imageUrl;
        java.lang.String str3 = this.title;
        java.lang.String str4 = this.subtitle;
        java.lang.String str5 = this.primaryColor;
        java.lang.String str6 = this.secondaryColor;
        java.lang.String str7 = this.storeUrl;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list = this.benefitTypes;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata = this.benefitsMetadata;
        com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = this.instrumentation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FannedCarouselItemData(id=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", subtitle=");
        sb.append(str4);
        sb.append(", primaryColor=");
        sb.append(str5);
        sb.append(", secondaryColor=");
        sb.append(str6);
        sb.append(", storeUrl=");
        sb.append(str7);
        sb.append(", benefitTypes=");
        sb.append(list);
        sb.append(", benefitsMetadata=");
        sb.append(benefitsMetadata);
        sb.append(", instrumentation=");
        sb.append(tileInstrumentation);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.imageUrl.hashCode();
        int hashCode3 = this.title.hashCode();
        java.lang.String str = this.subtitle;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.primaryColor;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.secondaryColor;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.storeUrl;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        int hashCode8 = this.benefitTypes.hashCode();
        int hashCode9 = this.benefitsMetadata.hashCode();
        com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = this.instrumentation;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (tileInstrumentation != null ? tileInstrumentation.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData)) {
            return false;
        }
        com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData = (com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fannedCarouselItemData.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, fannedCarouselItemData.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, fannedCarouselItemData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, fannedCarouselItemData.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryColor, fannedCarouselItemData.primaryColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryColor, fannedCarouselItemData.secondaryColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeUrl, fannedCarouselItemData.storeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitTypes, fannedCarouselItemData.benefitTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitsMetadata, fannedCarouselItemData.benefitsMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentation, fannedCarouselItemData.instrumentation);
    }

    public final com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData copy(java.lang.String id, java.lang.String imageUrl, java.lang.String title, java.lang.String subtitle, java.lang.String primaryColor, java.lang.String secondaryColor, java.lang.String storeUrl, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation instrumentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
        return new com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData(id, imageUrl, title, subtitle, primaryColor, secondaryColor, storeUrl, benefitTypes, benefitsMetadata, instrumentation);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata getBenefitsMetadata() {
        return this.benefitsMetadata;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> component8() {
        return this.benefitTypes;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getStoreUrl() {
        return this.storeUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSecondaryColor() {
        return this.secondaryColor;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPrimaryColor() {
        return this.primaryColor;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.home.domain.model.TileInstrumentation getInstrumentation() {
        return this.instrumentation;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
