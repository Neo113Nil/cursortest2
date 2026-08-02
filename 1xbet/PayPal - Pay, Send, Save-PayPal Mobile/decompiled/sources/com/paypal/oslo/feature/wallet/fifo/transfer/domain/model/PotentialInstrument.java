package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u008a\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b8\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b9\u0010\u0015R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/PotentialInstrument;", "", "", "type", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "cardBrand", "currencyCode", "countryCode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedWithdrawalTime;", "estimatedWithdrawalTime", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;", "displayFee", "transferMethod", "transferMode", "", "supportedCurrencies", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedAmountBreakdown;", "estimatedAmountBreakdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedWithdrawalTime;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedAmountBreakdown;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedWithdrawalTime;", "component7", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedAmountBreakdown;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedWithdrawalTime;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedAmountBreakdown;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/PotentialInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getCardType", "getCardBrand", "getCurrencyCode", "getCountryCode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedWithdrawalTime;", "getEstimatedWithdrawalTime", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;", "getDisplayFee", "getTransferMethod", "getTransferMode", "Ljava/util/List;", "getSupportedCurrencies", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EstimatedAmountBreakdown;", "getEstimatedAmountBreakdown"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PotentialInstrument {
    public static final int $stable = 8;
    private final java.lang.String cardBrand;
    private final java.lang.String cardType;
    private final java.lang.String countryCode;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown estimatedAmountBreakdown;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime estimatedWithdrawalTime;
    private final java.util.List<java.lang.String> supportedCurrencies;
    private final java.lang.String transferMethod;
    private final java.lang.String transferMode;
    private final java.lang.String type;

    public PotentialInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime estimatedWithdrawalTime, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee, java.lang.String str6, java.lang.String str7, java.util.List<java.lang.String> list, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown estimatedAmountBreakdown) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(estimatedWithdrawalTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayFee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.cardType = str2;
        this.cardBrand = str3;
        this.currencyCode = str4;
        this.countryCode = str5;
        this.estimatedWithdrawalTime = estimatedWithdrawalTime;
        this.displayFee = displayFee;
        this.transferMethod = str6;
        this.transferMode = str7;
        this.supportedCurrencies = list;
        this.estimatedAmountBreakdown = estimatedAmountBreakdown;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String getCardBrand() {
        return this.cardBrand;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime getEstimatedWithdrawalTime() {
        return this.estimatedWithdrawalTime;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee getDisplayFee() {
        return this.displayFee;
    }

    public final java.lang.String getTransferMethod() {
        return this.transferMethod;
    }

    public final java.lang.String getTransferMode() {
        return this.transferMode;
    }

    public final java.util.List<java.lang.String> getSupportedCurrencies() {
        return this.supportedCurrencies;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown getEstimatedAmountBreakdown() {
        return this.estimatedAmountBreakdown;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.String str2 = this.cardType;
        java.lang.String str3 = this.cardBrand;
        java.lang.String str4 = this.currencyCode;
        java.lang.String str5 = this.countryCode;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime estimatedWithdrawalTime = this.estimatedWithdrawalTime;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee = this.displayFee;
        java.lang.String str6 = this.transferMethod;
        java.lang.String str7 = this.transferMode;
        java.util.List<java.lang.String> list = this.supportedCurrencies;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown estimatedAmountBreakdown = this.estimatedAmountBreakdown;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PotentialInstrument(type=");
        sb.append(str);
        sb.append(", cardType=");
        sb.append(str2);
        sb.append(", cardBrand=");
        sb.append(str3);
        sb.append(", currencyCode=");
        sb.append(str4);
        sb.append(", countryCode=");
        sb.append(str5);
        sb.append(", estimatedWithdrawalTime=");
        sb.append(estimatedWithdrawalTime);
        sb.append(", displayFee=");
        sb.append(displayFee);
        sb.append(", transferMethod=");
        sb.append(str6);
        sb.append(", transferMode=");
        sb.append(str7);
        sb.append(", supportedCurrencies=");
        sb.append(list);
        sb.append(", estimatedAmountBreakdown=");
        sb.append(estimatedAmountBreakdown);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.cardType;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.cardBrand;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int hashCode4 = this.currencyCode.hashCode();
        int hashCode5 = this.countryCode.hashCode();
        int hashCode6 = this.estimatedWithdrawalTime.hashCode();
        int hashCode7 = this.displayFee.hashCode();
        int hashCode8 = this.transferMethod.hashCode();
        int hashCode9 = this.transferMode.hashCode();
        int hashCode10 = this.supportedCurrencies.hashCode();
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown estimatedAmountBreakdown = this.estimatedAmountBreakdown;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (estimatedAmountBreakdown != null ? estimatedAmountBreakdown.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument potentialInstrument = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, potentialInstrument.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardType, potentialInstrument.cardType) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardBrand, potentialInstrument.cardBrand) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, potentialInstrument.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, potentialInstrument.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedWithdrawalTime, potentialInstrument.estimatedWithdrawalTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayFee, potentialInstrument.displayFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMethod, potentialInstrument.transferMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMode, potentialInstrument.transferMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedCurrencies, potentialInstrument.supportedCurrencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedAmountBreakdown, potentialInstrument.estimatedAmountBreakdown);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument copy(java.lang.String type, java.lang.String cardType, java.lang.String cardBrand, java.lang.String currencyCode, java.lang.String countryCode, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime estimatedWithdrawalTime, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee, java.lang.String transferMethod, java.lang.String transferMode, java.util.List<java.lang.String> supportedCurrencies, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown estimatedAmountBreakdown) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(estimatedWithdrawalTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayFee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCurrencies, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument(type, cardType, cardBrand, currencyCode, countryCode, estimatedWithdrawalTime, displayFee, transferMethod, transferMode, supportedCurrencies, estimatedAmountBreakdown);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getTransferMode() {
        return this.transferMode;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getTransferMethod() {
        return this.transferMethod;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee getDisplayFee() {
        return this.displayFee;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedWithdrawalTime getEstimatedWithdrawalTime() {
        return this.estimatedWithdrawalTime;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardBrand() {
        return this.cardBrand;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardType() {
        return this.cardType;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EstimatedAmountBreakdown getEstimatedAmountBreakdown() {
        return this.estimatedAmountBreakdown;
    }

    public final java.util.List<java.lang.String> component10() {
        return this.supportedCurrencies;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }
}
