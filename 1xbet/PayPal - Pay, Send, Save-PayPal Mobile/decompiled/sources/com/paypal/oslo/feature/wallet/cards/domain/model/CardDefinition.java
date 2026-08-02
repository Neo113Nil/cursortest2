package com.paypal.oslo.feature.wallet.cards.domain.model;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJÀ\u0001\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b2\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b7\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b8\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010!R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b;\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b>\u0010\u001dR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b?\u0010\u001bR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b@\u0010\u001bR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\bA\u0010\u001bR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\bB\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "cardClassification", "", "userCountryCode", "issuerCountryCode", "currencyCode", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "brand", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "issuers", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;", "logo", "bin", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardCapability;", "capabilities", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperation;", "operations", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardPolicy;", "policies", "", "numberGroupingPattern", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/util/List;", "getCardClassification", "Ljava/lang/String;", "getUserCountryCode", "getIssuerCountryCode", "getCurrencyCode", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "getBrand", "getIssuers", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;", "getLogo", "getBin", "getCapabilities", "getOperations", "getPolicies", "getNumberGroupingPattern"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardDefinition {
    public static final int $stable = 8;
    private final java.lang.String bin;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability> capabilities;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass> cardClassification;
    private final java.lang.String currencyCode;
    private final java.lang.String issuerCountryCode;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer> issuers;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage logo;
    private final java.util.List<java.lang.Integer> numberGroupingPattern;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> operations;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy> policies;
    private final java.lang.String userCountryCode;

    /* JADX WARN: Multi-variable type inference failed */
    public CardDefinition(java.util.List<? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass> list, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer> list2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage, java.lang.String str4, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability> list3, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> list4, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy> list5, java.util.List<java.lang.Integer> list6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
        this.cardClassification = list;
        this.userCountryCode = str;
        this.issuerCountryCode = str2;
        this.currencyCode = str3;
        this.brand = cardBrand;
        this.issuers = list2;
        this.logo = cardImage;
        this.bin = str4;
        this.capabilities = list3;
        this.operations = list4;
        this.policies = list5;
        this.numberGroupingPattern = list6;
    }

    public /* synthetic */ CardDefinition(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, java.util.List list2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage, java.lang.String str4, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, cardBrand, list2, cardImage, str4, list3, list4, list5, (i & 2048) != 0 ? null : list6);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass> getCardClassification() {
        return this.cardClassification;
    }

    public final java.lang.String getUserCountryCode() {
        return this.userCountryCode;
    }

    public final java.lang.String getIssuerCountryCode() {
        return this.issuerCountryCode;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand getBrand() {
        return this.brand;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer> getIssuers() {
        return this.issuers;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage getLogo() {
        return this.logo;
    }

    public final java.lang.String getBin() {
        return this.bin;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability> getCapabilities() {
        return this.capabilities;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> getOperations() {
        return this.operations;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy> getPolicies() {
        return this.policies;
    }

    public final java.util.List<java.lang.Integer> getNumberGroupingPattern() {
        return this.numberGroupingPattern;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass> list = this.cardClassification;
        java.lang.String str = this.userCountryCode;
        java.lang.String str2 = this.issuerCountryCode;
        java.lang.String str3 = this.currencyCode;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand = this.brand;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer> list2 = this.issuers;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage = this.logo;
        java.lang.String str4 = this.bin;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability> list3 = this.capabilities;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> list4 = this.operations;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy> list5 = this.policies;
        java.util.List<java.lang.Integer> list6 = this.numberGroupingPattern;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDefinition(cardClassification=");
        sb.append(list);
        sb.append(", userCountryCode=");
        sb.append(str);
        sb.append(", issuerCountryCode=");
        sb.append(str2);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", brand=");
        sb.append(cardBrand);
        sb.append(", issuers=");
        sb.append(list2);
        sb.append(", logo=");
        sb.append(cardImage);
        sb.append(", bin=");
        sb.append(str4);
        sb.append(", capabilities=");
        sb.append(list3);
        sb.append(", operations=");
        sb.append(list4);
        sb.append(", policies=");
        sb.append(list5);
        sb.append(", numberGroupingPattern=");
        sb.append(list6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardClassification.hashCode();
        java.lang.String str = this.userCountryCode;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.issuerCountryCode;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.currencyCode;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        int hashCode5 = this.brand.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer> list = this.issuers;
        int hashCode6 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage = this.logo;
        int hashCode7 = cardImage == null ? 0 : cardImage.hashCode();
        java.lang.String str4 = this.bin;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability> list2 = this.capabilities;
        int hashCode9 = list2 == null ? 0 : list2.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> list3 = this.operations;
        int hashCode10 = list3 == null ? 0 : list3.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy> list4 = this.policies;
        int hashCode11 = list4 == null ? 0 : list4.hashCode();
        java.util.List<java.lang.Integer> list5 = this.numberGroupingPattern;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (list5 != null ? list5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition = (com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardClassification, cardDefinition.cardClassification) && kotlin.jvm.internal.Intrinsics.areEqual(this.userCountryCode, cardDefinition.userCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerCountryCode, cardDefinition.issuerCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, cardDefinition.currencyCode) && this.brand == cardDefinition.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.issuers, cardDefinition.issuers) && kotlin.jvm.internal.Intrinsics.areEqual(this.logo, cardDefinition.logo) && kotlin.jvm.internal.Intrinsics.areEqual(this.bin, cardDefinition.bin) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, cardDefinition.capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.operations, cardDefinition.operations) && kotlin.jvm.internal.Intrinsics.areEqual(this.policies, cardDefinition.policies) && kotlin.jvm.internal.Intrinsics.areEqual(this.numberGroupingPattern, cardDefinition.numberGroupingPattern);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition copy(java.util.List<? extends com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass> cardClassification, java.lang.String userCountryCode, java.lang.String issuerCountryCode, java.lang.String currencyCode, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer> issuers, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage logo, java.lang.String bin, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability> capabilities, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> operations, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy> policies, java.util.List<java.lang.Integer> numberGroupingPattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardClassification, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition(cardClassification, userCountryCode, issuerCountryCode, currencyCode, brand, issuers, logo, bin, capabilities, operations, policies, numberGroupingPattern);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability> component9() {
        return this.capabilities;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getBin() {
        return this.bin;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage getLogo() {
        return this.logo;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer> component6() {
        return this.issuers;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand getBrand() {
        return this.brand;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIssuerCountryCode() {
        return this.issuerCountryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUserCountryCode() {
        return this.userCountryCode;
    }

    public final java.util.List<java.lang.Integer> component12() {
        return this.numberGroupingPattern;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy> component11() {
        return this.policies;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation> component10() {
        return this.operations;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass> component1() {
        return this.cardClassification;
    }
}
