package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jl\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "", "", "id", "lastNChars", "issuerName", "productDisplayName", "productIdentifier", "partnerSettingsUrl", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "instrumentArt", "currencyCode", "balanceValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getIssuerName", "getProductDisplayName", "getProductIdentifier", "getPartnerSettingsUrl", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "getInstrumentArt", "getCurrencyCode", "getBalanceValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PaymentTokenInfo {
    public static final int $stable = 0;
    private final java.lang.String balanceValue;
    private final java.lang.String currencyCode;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt;
    private final java.lang.String issuerName;
    private final java.lang.String lastNChars;
    private final java.lang.String partnerSettingsUrl;
    private final java.lang.String productDisplayName;
    private final java.lang.String productIdentifier;

    public PaymentTokenInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentArt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.id = str;
        this.lastNChars = str2;
        this.issuerName = str3;
        this.productDisplayName = str4;
        this.productIdentifier = str5;
        this.partnerSettingsUrl = str6;
        this.instrumentArt = instrumentArt;
        this.currencyCode = str7;
        this.balanceValue = str8;
    }

    public /* synthetic */ PaymentTokenInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, java.lang.String str7, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, instrumentArt, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : str8);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    public final java.lang.String getProductDisplayName() {
        return this.productDisplayName;
    }

    public final java.lang.String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final java.lang.String getPartnerSettingsUrl() {
        return this.partnerSettingsUrl;
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getBalanceValue() {
        return this.balanceValue;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.lastNChars;
        java.lang.String str3 = this.issuerName;
        java.lang.String str4 = this.productDisplayName;
        java.lang.String str5 = this.productIdentifier;
        java.lang.String str6 = this.partnerSettingsUrl;
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt = this.instrumentArt;
        java.lang.String str7 = this.currencyCode;
        java.lang.String str8 = this.balanceValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTokenInfo(id=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", issuerName=");
        sb.append(str3);
        sb.append(", productDisplayName=");
        sb.append(str4);
        sb.append(", productIdentifier=");
        sb.append(str5);
        sb.append(", partnerSettingsUrl=");
        sb.append(str6);
        sb.append(", instrumentArt=");
        sb.append(instrumentArt);
        sb.append(", currencyCode=");
        sb.append(str7);
        sb.append(", balanceValue=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.lastNChars.hashCode();
        int hashCode3 = this.issuerName.hashCode();
        int hashCode4 = this.productDisplayName.hashCode();
        int hashCode5 = this.productIdentifier.hashCode();
        int hashCode6 = this.partnerSettingsUrl.hashCode();
        int hashCode7 = this.instrumentArt.hashCode();
        int hashCode8 = this.currencyCode.hashCode();
        java.lang.String str = this.balanceValue;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentTokenInfo.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, paymentTokenInfo.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, paymentTokenInfo.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.productDisplayName, paymentTokenInfo.productDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.productIdentifier, paymentTokenInfo.productIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerSettingsUrl, paymentTokenInfo.partnerSettingsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentArt, paymentTokenInfo.instrumentArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, paymentTokenInfo.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceValue, paymentTokenInfo.balanceValue);
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo copy(java.lang.String id, java.lang.String lastNChars, java.lang.String issuerName, java.lang.String productDisplayName, java.lang.String productIdentifier, java.lang.String partnerSettingsUrl, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, java.lang.String currencyCode, java.lang.String balanceValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDisplayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerSettingsUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentArt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo(id, lastNChars, issuerName, productDisplayName, productIdentifier, partnerSettingsUrl, instrumentArt, currencyCode, balanceValue);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getBalanceValue() {
        return this.balanceValue;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPartnerSettingsUrl() {
        return this.partnerSettingsUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getProductIdentifier() {
        return this.productIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getProductDisplayName() {
        return this.productDisplayName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
