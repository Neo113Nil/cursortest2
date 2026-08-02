package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ|\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0013R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b1\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/HeroProduct;", "", "", "id", "name", "imageUrl", "label", "", "qualifiers", "storeUrl", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "benefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "benefitsMetadata", "Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "instrumentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "component9", "()Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;)Lcom/paypal/oslo/feature/home/domain/model/HeroProduct;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getImageUrl", "getLabel", "Ljava/util/List;", "getQualifiers", "getStoreUrl", "getBenefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "getBenefitsMetadata", "Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "getInstrumentation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HeroProduct {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes;
    private final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata;
    private final java.lang.String id;
    private final java.lang.String imageUrl;
    private final com.paypal.oslo.feature.home.domain.model.TileInstrumentation instrumentation;
    private final java.lang.String label;
    private final java.lang.String name;
    private final java.util.List<java.lang.String> qualifiers;
    private final java.lang.String storeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public HeroProduct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list, java.lang.String str5, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list2, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
        this.id = str;
        this.name = str2;
        this.imageUrl = str3;
        this.label = str4;
        this.qualifiers = list;
        this.storeUrl = str5;
        this.benefitTypes = list2;
        this.benefitsMetadata = benefitsMetadata;
        this.instrumentation = tileInstrumentation;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HeroProduct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.String str5, java.util.List list2, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, r7, r8, r9, r10, r11, (i & 256) != 0 ? null : tileInstrumentation);
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2;
        java.lang.String str6 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.String str7 = (i & 8) != 0 ? null : str4;
        java.util.List emptyList = (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
        java.lang.String str8 = (i & 32) != 0 ? null : str5;
        java.util.List listOf = (i & 64) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL) : list2;
        if ((i & 128) != 0) {
            benefitsMetadata2 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata(str6, (java.lang.String) (objArr2 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            benefitsMetadata2 = benefitsMetadata;
        }
    }

    public final java.util.List<java.lang.String> getQualifiers() {
        return this.qualifiers;
    }

    public final java.lang.String getStoreUrl() {
        return this.storeUrl;
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
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.imageUrl;
        java.lang.String str4 = this.label;
        java.util.List<java.lang.String> list = this.qualifiers;
        java.lang.String str5 = this.storeUrl;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list2 = this.benefitTypes;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata = this.benefitsMetadata;
        com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = this.instrumentation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeroProduct(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", imageUrl=");
        sb.append(str3);
        sb.append(", label=");
        sb.append(str4);
        sb.append(", qualifiers=");
        sb.append(list);
        sb.append(", storeUrl=");
        sb.append(str5);
        sb.append(", benefitTypes=");
        sb.append(list2);
        sb.append(", benefitsMetadata=");
        sb.append(benefitsMetadata);
        sb.append(", instrumentation=");
        sb.append(tileInstrumentation);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.name.hashCode();
        int hashCode3 = this.imageUrl.hashCode();
        java.lang.String str = this.label;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int hashCode5 = this.qualifiers.hashCode();
        java.lang.String str2 = this.storeUrl;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        int hashCode7 = this.benefitTypes.hashCode();
        int hashCode8 = this.benefitsMetadata.hashCode();
        com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = this.instrumentation;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (tileInstrumentation != null ? tileInstrumentation.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.domain.model.HeroProduct)) {
            return false;
        }
        com.paypal.oslo.feature.home.domain.model.HeroProduct heroProduct = (com.paypal.oslo.feature.home.domain.model.HeroProduct) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, heroProduct.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, heroProduct.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, heroProduct.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, heroProduct.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifiers, heroProduct.qualifiers) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeUrl, heroProduct.storeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitTypes, heroProduct.benefitTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitsMetadata, heroProduct.benefitsMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentation, heroProduct.instrumentation);
    }

    public final com.paypal.oslo.feature.home.domain.model.HeroProduct copy(java.lang.String id, java.lang.String name2, java.lang.String imageUrl, java.lang.String label, java.util.List<java.lang.String> qualifiers, java.lang.String storeUrl, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation instrumentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifiers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
        return new com.paypal.oslo.feature.home.domain.model.HeroProduct(id, name2, imageUrl, label, qualifiers, storeUrl, benefitTypes, benefitsMetadata, instrumentation);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.home.domain.model.TileInstrumentation getInstrumentation() {
        return this.instrumentation;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata getBenefitsMetadata() {
        return this.benefitsMetadata;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> component7() {
        return this.benefitTypes;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getStoreUrl() {
        return this.storeUrl;
    }

    public final java.util.List<java.lang.String> component5() {
        return this.qualifiers;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
