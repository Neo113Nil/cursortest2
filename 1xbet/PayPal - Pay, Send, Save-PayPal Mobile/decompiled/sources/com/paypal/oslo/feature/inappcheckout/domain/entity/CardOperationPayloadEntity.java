package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0080\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b3\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b4\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b5\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b6\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;", "", "", "baToken", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardholderInputEntity;", "cardholder", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardAddressInputEntity;", "address", "paypalRequestId", "cardNumber", "", "preferred", "fiId", "securityCode", "expiryMonth", "expiryYear", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardholderInputEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardAddressInputEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardholderInputEntity;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardAddressInputEntity;", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardholderInputEntity;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardAddressInputEntity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBaToken", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardholderInputEntity;", "getCardholder", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardAddressInputEntity;", "getAddress", "getPaypalRequestId", "getCardNumber", "Z", "getPreferred", "getFiId", "getSecurityCode", "getExpiryMonth", "getExpiryYear"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardOperationPayloadEntity {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity address;
    private final java.lang.String baToken;
    private final java.lang.String cardNumber;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity cardholder;
    private final java.lang.String expiryMonth;
    private final java.lang.String expiryYear;
    private final java.lang.String fiId;
    private final java.lang.String paypalRequestId;
    private final boolean preferred;
    private final java.lang.String securityCode;

    public CardOperationPayloadEntity(java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity cardholderInputEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity cardAddressInputEntity, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardholderInputEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardAddressInputEntity, "");
        this.baToken = str;
        this.cardholder = cardholderInputEntity;
        this.address = cardAddressInputEntity;
        this.paypalRequestId = str2;
        this.cardNumber = str3;
        this.preferred = z;
        this.fiId = str4;
        this.securityCode = str5;
        this.expiryMonth = str6;
        this.expiryYear = str7;
    }

    public /* synthetic */ CardOperationPayloadEntity(java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity cardholderInputEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity cardAddressInputEntity, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cardholderInputEntity, cardAddressInputEntity, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7);
    }

    public final java.lang.String getBaToken() {
        return this.baToken;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity getCardholder() {
        return this.cardholder;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity getAddress() {
        return this.address;
    }

    public final java.lang.String getPaypalRequestId() {
        return this.paypalRequestId;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public final boolean getPreferred() {
        return this.preferred;
    }

    public final java.lang.String getFiId() {
        return this.fiId;
    }

    public final java.lang.String getSecurityCode() {
        return this.securityCode;
    }

    public final java.lang.String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final java.lang.String getExpiryYear() {
        return this.expiryYear;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.baToken;
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity cardholderInputEntity = this.cardholder;
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity cardAddressInputEntity = this.address;
        java.lang.String str2 = this.paypalRequestId;
        java.lang.String str3 = this.cardNumber;
        boolean z = this.preferred;
        java.lang.String str4 = this.fiId;
        java.lang.String str5 = this.securityCode;
        java.lang.String str6 = this.expiryMonth;
        java.lang.String str7 = this.expiryYear;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardOperationPayloadEntity(baToken=");
        sb.append(str);
        sb.append(", cardholder=");
        sb.append(cardholderInputEntity);
        sb.append(", address=");
        sb.append(cardAddressInputEntity);
        sb.append(", paypalRequestId=");
        sb.append(str2);
        sb.append(", cardNumber=");
        sb.append(str3);
        sb.append(", preferred=");
        sb.append(z);
        sb.append(", fiId=");
        sb.append(str4);
        sb.append(", securityCode=");
        sb.append(str5);
        sb.append(", expiryMonth=");
        sb.append(str6);
        sb.append(", expiryYear=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.baToken.hashCode();
        int hashCode2 = this.cardholder.hashCode();
        int hashCode3 = this.address.hashCode();
        java.lang.String str = this.paypalRequestId;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.cardNumber;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.preferred);
        java.lang.String str3 = this.fiId;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.securityCode;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.expiryMonth;
        int hashCode9 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.expiryYear;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity cardOperationPayloadEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baToken, cardOperationPayloadEntity.baToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardholder, cardOperationPayloadEntity.cardholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, cardOperationPayloadEntity.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalRequestId, cardOperationPayloadEntity.paypalRequestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, cardOperationPayloadEntity.cardNumber) && this.preferred == cardOperationPayloadEntity.preferred && kotlin.jvm.internal.Intrinsics.areEqual(this.fiId, cardOperationPayloadEntity.fiId) && kotlin.jvm.internal.Intrinsics.areEqual(this.securityCode, cardOperationPayloadEntity.securityCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryMonth, cardOperationPayloadEntity.expiryMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryYear, cardOperationPayloadEntity.expiryYear);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity copy(java.lang.String baToken, com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity cardholder, com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity address, java.lang.String paypalRequestId, java.lang.String cardNumber, boolean preferred, java.lang.String fiId, java.lang.String securityCode, java.lang.String expiryMonth, java.lang.String expiryYear) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardholder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity(baToken, cardholder, address, paypalRequestId, cardNumber, preferred, fiId, securityCode, expiryMonth, expiryYear);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getSecurityCode() {
        return this.securityCode;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getFiId() {
        return this.fiId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPreferred() {
        return this.preferred;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPaypalRequestId() {
        return this.paypalRequestId;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity getCardholder() {
        return this.cardholder;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBaToken() {
        return this.baToken;
    }
}
