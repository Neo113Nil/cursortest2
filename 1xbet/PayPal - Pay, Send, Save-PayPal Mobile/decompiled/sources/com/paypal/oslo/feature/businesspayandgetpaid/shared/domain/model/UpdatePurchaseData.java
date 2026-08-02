package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jp\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/UpdatePurchaseData;", "", "", "paymentUuid", "originalPurchaseUuid", "Ljava/math/BigDecimal;", "amount", "currencyCode", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, "applicationIdentifier", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/UpdatePurchaseData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentUuid", "getOriginalPurchaseUuid", "Ljava/math/BigDecimal;", "getAmount", "getCurrencyCode", "getCardType", "getCardPaymentEntryMode", "getApplicationName", "getApplicationIdentifier", "getReferenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdatePurchaseData {
    public static final int $stable = 0;
    private final java.math.BigDecimal amount;
    private final java.lang.String applicationIdentifier;
    private final java.lang.String applicationName;
    private final java.lang.String cardPaymentEntryMode;
    private final java.lang.String cardType;
    private final java.lang.String currencyCode;
    private final java.lang.String originalPurchaseUuid;
    private final java.lang.String paymentUuid;
    private final java.lang.String referenceId;

    public UpdatePurchaseData(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.paymentUuid = str;
        this.originalPurchaseUuid = str2;
        this.amount = bigDecimal;
        this.currencyCode = str3;
        this.cardType = str4;
        this.cardPaymentEntryMode = str5;
        this.applicationName = str6;
        this.applicationIdentifier = str7;
        this.referenceId = str8;
    }

    public /* synthetic */ UpdatePurchaseData(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bigDecimal, str3, str4, str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    public final java.lang.String getPaymentUuid() {
        return this.paymentUuid;
    }

    public final java.lang.String getOriginalPurchaseUuid() {
        return this.originalPurchaseUuid;
    }

    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    public final java.lang.String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paymentUuid;
        java.lang.String str2 = this.originalPurchaseUuid;
        java.math.BigDecimal bigDecimal = this.amount;
        java.lang.String str3 = this.currencyCode;
        java.lang.String str4 = this.cardType;
        java.lang.String str5 = this.cardPaymentEntryMode;
        java.lang.String str6 = this.applicationName;
        java.lang.String str7 = this.applicationIdentifier;
        java.lang.String str8 = this.referenceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePurchaseData(paymentUuid=");
        sb.append(str);
        sb.append(", originalPurchaseUuid=");
        sb.append(str2);
        sb.append(", amount=");
        sb.append(bigDecimal);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", cardType=");
        sb.append(str4);
        sb.append(", cardPaymentEntryMode=");
        sb.append(str5);
        sb.append(", applicationName=");
        sb.append(str6);
        sb.append(", applicationIdentifier=");
        sb.append(str7);
        sb.append(", referenceId=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.paymentUuid.hashCode();
        int hashCode2 = this.originalPurchaseUuid.hashCode();
        int hashCode3 = this.amount.hashCode();
        int hashCode4 = this.currencyCode.hashCode();
        int hashCode5 = this.cardType.hashCode();
        int hashCode6 = this.cardPaymentEntryMode.hashCode();
        java.lang.String str = this.applicationName;
        int hashCode7 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.applicationIdentifier;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.referenceId;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData updatePurchaseData = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentUuid, updatePurchaseData.paymentUuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalPurchaseUuid, updatePurchaseData.originalPurchaseUuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, updatePurchaseData.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, updatePurchaseData.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, updatePurchaseData.cardType) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardPaymentEntryMode, updatePurchaseData.cardPaymentEntryMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationName, updatePurchaseData.applicationName) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationIdentifier, updatePurchaseData.applicationIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, updatePurchaseData.referenceId);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData copy(java.lang.String paymentUuid, java.lang.String originalPurchaseUuid, java.math.BigDecimal amount, java.lang.String currencyCode, java.lang.String cardType, java.lang.String cardPaymentEntryMode, java.lang.String applicationName, java.lang.String applicationIdentifier, java.lang.String referenceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentUuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalPurchaseUuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentEntryMode, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData(paymentUuid, originalPurchaseUuid, amount, currencyCode, cardType, cardPaymentEntryMode, applicationName, applicationIdentifier, referenceId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCardType() {
        return this.cardType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.math.BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOriginalPurchaseUuid() {
        return this.originalPurchaseUuid;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaymentUuid() {
        return this.paymentUuid;
    }
}
