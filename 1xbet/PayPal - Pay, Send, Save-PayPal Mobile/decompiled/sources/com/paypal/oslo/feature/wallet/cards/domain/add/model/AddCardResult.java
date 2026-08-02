package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b+\u0010,J®\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bB\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bC\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bD\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010(R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", "", "", "cardId", "lastNChars", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "brand", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "issuer", "nickName", "expirationDate", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "billingAddress", "addressId", "currencyCode", "productClass", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "status", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;", "institutionImages", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "cardArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "component4", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "component12", "()Ljava/util/List;", "component13", "()Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "getBrand", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "getIssuer", "getNickName", "getExpirationDate", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "getBillingAddress", "getAddressId", "getCurrencyCode", "getProductClass", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "getStatus", "Ljava/util/List;", "getInstitutionImages", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "getCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddCardResult {
    public static final int $stable = 8;
    private final java.lang.String addressId;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt;
    private final java.lang.String cardId;
    private final java.lang.String currencyCode;
    private final java.lang.String expirationDate;
    private final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> institutionImages;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer;
    private final java.lang.String lastNChars;
    private final java.lang.String nickName;
    private final java.lang.String productClass;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status;

    public AddCardResult(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> list, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.cardId = str;
        this.lastNChars = str2;
        this.brand = cardBrand;
        this.issuer = issuer;
        this.nickName = str3;
        this.expirationDate = str4;
        this.billingAddress = billingAddress;
        this.addressId = str5;
        this.currencyCode = str6;
        this.productClass = str7;
        this.status = cardStatus;
        this.institutionImages = list;
        this.cardArt = cardArt;
    }

    public final java.lang.String getCardId() {
        return this.cardId;
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

    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final java.lang.String getAddressId() {
        return this.addressId;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getProductClass() {
        return this.productClass;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus getStatus() {
        return this.status;
    }

    public /* synthetic */ AddCardResult(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus, java.util.List list, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : cardBrand, (i & 8) != 0 ? null : issuer, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : billingAddress, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : cardStatus, (i & 2048) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4096) == 0 ? cardArt : null);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> getInstitutionImages() {
        return this.institutionImages;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt getCardArt() {
        return this.cardArt;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardId;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand = this.brand;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = this.issuer;
        java.lang.String str3 = this.nickName;
        java.lang.String str4 = this.expirationDate;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = this.billingAddress;
        java.lang.String str5 = this.addressId;
        java.lang.String str6 = this.currencyCode;
        java.lang.String str7 = this.productClass;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus = this.status;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> list = this.institutionImages;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt = this.cardArt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardResult(cardId=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", brand=");
        sb.append(cardBrand);
        sb.append(", issuer=");
        sb.append(issuer);
        sb.append(", nickName=");
        sb.append(str3);
        sb.append(", expirationDate=");
        sb.append(str4);
        sb.append(", billingAddress=");
        sb.append(billingAddress);
        sb.append(", addressId=");
        sb.append(str5);
        sb.append(", currencyCode=");
        sb.append(str6);
        sb.append(", productClass=");
        sb.append(str7);
        sb.append(", status=");
        sb.append(cardStatus);
        sb.append(", institutionImages=");
        sb.append(list);
        sb.append(", cardArt=");
        sb.append(cardArt);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cardId.hashCode();
        java.lang.String str = this.lastNChars;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand = this.brand;
        int hashCode3 = cardBrand == null ? 0 : cardBrand.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = this.issuer;
        int hashCode4 = issuer == null ? 0 : issuer.hashCode();
        java.lang.String str2 = this.nickName;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.expirationDate;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = this.billingAddress;
        int hashCode7 = billingAddress == null ? 0 : billingAddress.hashCode();
        java.lang.String str4 = this.addressId;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.currencyCode;
        int hashCode9 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.productClass;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus = this.status;
        int hashCode11 = cardStatus == null ? 0 : cardStatus.hashCode();
        int hashCode12 = this.institutionImages.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt = this.cardArt;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (cardArt != null ? cardArt.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult addCardResult = (com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, addCardResult.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, addCardResult.lastNChars) && this.brand == addCardResult.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.issuer, addCardResult.issuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickName, addCardResult.nickName) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, addCardResult.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, addCardResult.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, addCardResult.addressId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, addCardResult.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.productClass, addCardResult.productClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, addCardResult.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionImages, addCardResult.institutionImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, addCardResult.cardArt);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult copy(java.lang.String cardId, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand, com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer, java.lang.String nickName, java.lang.String expirationDate, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, java.lang.String addressId, java.lang.String currencyCode, java.lang.String productClass, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status, java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> institutionImages, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImages, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult(cardId, lastNChars, brand, issuer, nickName, expirationDate, billingAddress, addressId, currencyCode, productClass, status, institutionImages, cardArt);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getAddressId() {
        return this.addressId;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNickName() {
        return this.nickName;
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

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt getCardArt() {
        return this.cardArt;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> component12() {
        return this.institutionImages;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus getStatus() {
        return this.status;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getProductClass() {
        return this.productClass;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardId() {
        return this.cardId;
    }
}
