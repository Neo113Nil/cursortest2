package com.paypal.oslo.feature.wallet.cards.domain.detail.model;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b+\u0010,J\u009e\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bC\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\bF\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010*R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "brand", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "issuer", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "productClass", "expirationDate", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "cardArt", "nickName", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "billingAddress", "currencyCode", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "status", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;", "institutionImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "component4", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "component5", "()Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "component8", "component9", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "component10", "component11", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "component12", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "getBrand", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "getIssuer", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "getProductClass", "getExpirationDate", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "getCardArt", "getNickName", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "getBillingAddress", "getCurrencyCode", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "getStatus", "Ljava/util/List;", "getInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardDetail {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt;
    private final java.lang.String currencyCode;
    private final java.lang.String expirationDate;
    private final java.lang.String id;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> institutionImages;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer;
    private final java.lang.String lastNChars;
    private final java.lang.String nickName;
    private final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status;

    public CardDetail(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer, com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass, java.lang.String str3, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt, java.lang.String str4, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String str5, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.lastNChars = str2;
        this.brand = cardBrand;
        this.issuer = issuer;
        this.productClass = cardProductClass;
        this.expirationDate = str3;
        this.cardArt = cardArt;
        this.nickName = str4;
        this.billingAddress = billingAddress;
        this.currencyCode = str5;
        this.status = cardStatus;
        this.institutionImages = list;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand getBrand() {
        return this.brand;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer getIssuer() {
        return this.issuer;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass getProductClass() {
        return this.productClass;
    }

    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt getCardArt() {
        return this.cardArt;
    }

    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus getStatus() {
        return this.status;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> getInstitutionImages() {
        return this.institutionImages;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand = this.brand;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = this.issuer;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass = this.productClass;
        java.lang.String str3 = this.expirationDate;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt = this.cardArt;
        java.lang.String str4 = this.nickName;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = this.billingAddress;
        java.lang.String str5 = this.currencyCode;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus = this.status;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> list = this.institutionImages;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDetail(id=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", brand=");
        sb.append(cardBrand);
        sb.append(", issuer=");
        sb.append(issuer);
        sb.append(", productClass=");
        sb.append(cardProductClass);
        sb.append(", expirationDate=");
        sb.append(str3);
        sb.append(", cardArt=");
        sb.append(cardArt);
        sb.append(", nickName=");
        sb.append(str4);
        sb.append(", billingAddress=");
        sb.append(billingAddress);
        sb.append(", currencyCode=");
        sb.append(str5);
        sb.append(", status=");
        sb.append(cardStatus);
        sb.append(", institutionImages=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.lastNChars.hashCode();
        int hashCode3 = this.brand.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = this.issuer;
        int hashCode4 = issuer == null ? 0 : issuer.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass = this.productClass;
        int hashCode5 = cardProductClass == null ? 0 : cardProductClass.hashCode();
        java.lang.String str = this.expirationDate;
        int hashCode6 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt = this.cardArt;
        int hashCode7 = cardArt == null ? 0 : cardArt.hashCode();
        java.lang.String str2 = this.nickName;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = this.billingAddress;
        int hashCode9 = billingAddress == null ? 0 : billingAddress.hashCode();
        java.lang.String str3 = this.currencyCode;
        int hashCode10 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus = this.status;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (cardStatus != null ? cardStatus.hashCode() : 0)) * 31) + this.institutionImages.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail cardDetail = (com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, cardDetail.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, cardDetail.lastNChars) && this.brand == cardDetail.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, cardDetail.issuer) && this.productClass == cardDetail.productClass && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, cardDetail.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, cardDetail.cardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickName, cardDetail.nickName) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, cardDetail.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, cardDetail.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, cardDetail.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, cardDetail.institutionImages);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand, com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer, com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass, java.lang.String expirationDate, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt, java.lang.String nickName, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String currencyCode, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> institutionImages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImages, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail(id, lastNChars, brand, issuer, productClass, expirationDate, cardArt, nickName, billingAddress, currencyCode, status, institutionImages);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getNickName() {
        return this.nickName;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt getCardArt() {
        return this.cardArt;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass getProductClass() {
        return this.productClass;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer getIssuer() {
        return this.issuer;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand getBrand() {
        return this.brand;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> component12() {
        return this.institutionImages;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus getStatus() {
        return this.status;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
