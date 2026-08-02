package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J¢\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b;\u0010\u0017R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;", "", "", "id", "title", "highlightedTitle", "backgroundImageUrl", "primaryQualifier", "merchantName", "merchantLogoUrl", "buttonText", "subtitle", "storeUrl", "", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "benefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "benefitsMetadata", "Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "instrumentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "()Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "component13", "()Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;)Lcom/paypal/oslo/feature/home/domain/model/DeckCardContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getHighlightedTitle", "getBackgroundImageUrl", "getPrimaryQualifier", "getMerchantName", "getMerchantLogoUrl", "getButtonText", "getSubtitle", "getStoreUrl", "Ljava/util/List;", "getBenefitTypes", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/BenefitsMetadata;", "getBenefitsMetadata", "Lcom/paypal/oslo/feature/home/domain/model/TileInstrumentation;", "getInstrumentation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeckCardContent {
    public static final int $stable = 8;
    private final java.lang.String backgroundImageUrl;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes;
    private final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata;
    private final java.lang.String buttonText;
    private final java.lang.String highlightedTitle;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.home.domain.model.TileInstrumentation instrumentation;
    private final java.lang.String merchantLogoUrl;
    private final java.lang.String merchantName;
    private final java.lang.String primaryQualifier;
    private final java.lang.String storeUrl;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DeckCardContent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
        this.id = str;
        this.title = str2;
        this.highlightedTitle = str3;
        this.backgroundImageUrl = str4;
        this.primaryQualifier = str5;
        this.merchantName = str6;
        this.merchantLogoUrl = str7;
        this.buttonText = str8;
        this.subtitle = str9;
        this.storeUrl = str10;
        this.benefitTypes = list;
        this.benefitsMetadata = benefitsMetadata;
        this.instrumentation = tileInstrumentation;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getHighlightedTitle() {
        return this.highlightedTitle;
    }

    public final java.lang.String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final java.lang.String getPrimaryQualifier() {
        return this.primaryQualifier;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DeckCardContent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.util.List list, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, r6, str4, str5, str6, str7, r11, r12, r13, r14, r15, (i & 4096) != 0 ? null : tileInstrumentation);
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2;
        java.lang.String str11 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.String str12 = (i & 4) != 0 ? null : str3;
        java.lang.String str13 = (i & 128) != 0 ? "Shop" : str8;
        java.lang.String str14 = (i & 256) != 0 ? "Sponsored" : str9;
        java.lang.String str15 = (i & 512) != 0 ? null : str10;
        java.util.List listOf = (i & 1024) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL) : list;
        if ((i & 2048) != 0) {
            benefitsMetadata2 = new com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata(str11, (java.lang.String) (objArr2 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            benefitsMetadata2 = benefitsMetadata;
        }
    }

    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
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
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.highlightedTitle;
        java.lang.String str4 = this.backgroundImageUrl;
        java.lang.String str5 = this.primaryQualifier;
        java.lang.String str6 = this.merchantName;
        java.lang.String str7 = this.merchantLogoUrl;
        java.lang.String str8 = this.buttonText;
        java.lang.String str9 = this.subtitle;
        java.lang.String str10 = this.storeUrl;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list = this.benefitTypes;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata = this.benefitsMetadata;
        com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = this.instrumentation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeckCardContent(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", highlightedTitle=");
        sb.append(str3);
        sb.append(", backgroundImageUrl=");
        sb.append(str4);
        sb.append(", primaryQualifier=");
        sb.append(str5);
        sb.append(", merchantName=");
        sb.append(str6);
        sb.append(", merchantLogoUrl=");
        sb.append(str7);
        sb.append(", buttonText=");
        sb.append(str8);
        sb.append(", subtitle=");
        sb.append(str9);
        sb.append(", storeUrl=");
        sb.append(str10);
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
        int hashCode2 = this.title.hashCode();
        java.lang.String str = this.highlightedTitle;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.backgroundImageUrl.hashCode();
        java.lang.String str2 = this.primaryQualifier;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        int hashCode6 = this.merchantName.hashCode();
        int hashCode7 = this.merchantLogoUrl.hashCode();
        int hashCode8 = this.buttonText.hashCode();
        java.lang.String str3 = this.subtitle;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.storeUrl;
        int hashCode10 = str4 == null ? 0 : str4.hashCode();
        int hashCode11 = this.benefitTypes.hashCode();
        int hashCode12 = this.benefitsMetadata.hashCode();
        com.paypal.oslo.feature.home.domain.model.TileInstrumentation tileInstrumentation = this.instrumentation;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (tileInstrumentation != null ? tileInstrumentation.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.domain.model.DeckCardContent)) {
            return false;
        }
        com.paypal.oslo.feature.home.domain.model.DeckCardContent deckCardContent = (com.paypal.oslo.feature.home.domain.model.DeckCardContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, deckCardContent.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, deckCardContent.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.highlightedTitle, deckCardContent.highlightedTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundImageUrl, deckCardContent.backgroundImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryQualifier, deckCardContent.primaryQualifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, deckCardContent.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, deckCardContent.merchantLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, deckCardContent.buttonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, deckCardContent.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.storeUrl, deckCardContent.storeUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitTypes, deckCardContent.benefitTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefitsMetadata, deckCardContent.benefitsMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentation, deckCardContent.instrumentation);
    }

    public final com.paypal.oslo.feature.home.domain.model.DeckCardContent copy(java.lang.String id, java.lang.String title, java.lang.String highlightedTitle, java.lang.String backgroundImageUrl, java.lang.String primaryQualifier, java.lang.String merchantName, java.lang.String merchantLogoUrl, java.lang.String buttonText, java.lang.String subtitle, java.lang.String storeUrl, java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> benefitTypes, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata, com.paypal.oslo.feature.home.domain.model.TileInstrumentation instrumentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundImageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantLogoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefitsMetadata, "");
        return new com.paypal.oslo.feature.home.domain.model.DeckCardContent(id, title, highlightedTitle, backgroundImageUrl, primaryQualifier, merchantName, merchantLogoUrl, buttonText, subtitle, storeUrl, benefitTypes, benefitsMetadata, instrumentation);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPrimaryQualifier() {
        return this.primaryQualifier;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getHighlightedTitle() {
        return this.highlightedTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.home.domain.model.TileInstrumentation getInstrumentation() {
        return this.instrumentation;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata getBenefitsMetadata() {
        return this.benefitsMetadata;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> component11() {
        return this.benefitTypes;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getStoreUrl() {
        return this.storeUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
