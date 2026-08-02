package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J|\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b7\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankConnectionContext;", "", "", "aggregatorName", "externalBankId", "bankName", "countryCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "bankLogoUrl", "credentialToken", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "bank", "instrumentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "component9", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankConnectionContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAggregatorName", "getExternalBankId", "getBankName", "getCountryCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getIntegrationType", "getBankLogoUrl", "getCredentialToken", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "getAction", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getBank", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BankConnectionContext {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action;
    private final java.lang.String aggregatorName;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank;
    private final java.lang.String bankLogoUrl;
    private final java.lang.String bankName;
    private final java.lang.String countryCode;
    private final java.lang.String credentialToken;
    private final java.lang.String externalBankId;
    private final java.lang.String instrumentId;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;

    public BankConnectionContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessAction, "");
        this.aggregatorName = str;
        this.externalBankId = str2;
        this.bankName = str3;
        this.countryCode = str4;
        this.integrationType = integrationType;
        this.bankLogoUrl = str5;
        this.credentialToken = str6;
        this.action = externalBankAccessAction;
        this.bank = instantBankConfirmationBankDetails;
        this.instrumentId = str7;
    }

    public /* synthetic */ BankConnectionContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, integrationType, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, externalBankAccessAction, instantBankConfirmationBankDetails, (i & 512) != 0 ? null : str7);
    }

    public final java.lang.String getAggregatorName() {
        return this.aggregatorName;
    }

    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    public final java.lang.String getBankLogoUrl() {
        return this.bankLogoUrl;
    }

    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
        return this.action;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
        return this.bank;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.aggregatorName;
        java.lang.String str2 = this.externalBankId;
        java.lang.String str3 = this.bankName;
        java.lang.String str4 = this.countryCode;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        java.lang.String str5 = this.bankLogoUrl;
        java.lang.String str6 = this.credentialToken;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction = this.action;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
        java.lang.String str7 = this.instrumentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankConnectionContext(aggregatorName=");
        sb.append(str);
        sb.append(", externalBankId=");
        sb.append(str2);
        sb.append(", bankName=");
        sb.append(str3);
        sb.append(", countryCode=");
        sb.append(str4);
        sb.append(", integrationType=");
        sb.append(integrationType);
        sb.append(", bankLogoUrl=");
        sb.append(str5);
        sb.append(", credentialToken=");
        sb.append(str6);
        sb.append(", action=");
        sb.append(externalBankAccessAction);
        sb.append(", bank=");
        sb.append(instantBankConfirmationBankDetails);
        sb.append(", instrumentId=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.aggregatorName.hashCode();
        int hashCode2 = this.externalBankId.hashCode();
        int hashCode3 = this.bankName.hashCode();
        int hashCode4 = this.countryCode.hashCode();
        int hashCode5 = this.integrationType.hashCode();
        java.lang.String str = this.bankLogoUrl;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.credentialToken;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        int hashCode8 = this.action.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = this.bank;
        int hashCode9 = instantBankConfirmationBankDetails == null ? 0 : instantBankConfirmationBankDetails.hashCode();
        java.lang.String str3 = this.instrumentId;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankConnectionContext)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankConnectionContext bankConnectionContext = (com.paypal.oslo.feature.wallet.banks.domain.model.BankConnectionContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.aggregatorName, bankConnectionContext.aggregatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, bankConnectionContext.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, bankConnectionContext.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, bankConnectionContext.countryCode) && this.integrationType == bankConnectionContext.integrationType && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoUrl, bankConnectionContext.bankLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, bankConnectionContext.credentialToken) && this.action == bankConnectionContext.action && kotlin.jvm.internal.Intrinsics.areEqual(this.bank, bankConnectionContext.bank) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, bankConnectionContext.instrumentId);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankConnectionContext copy(java.lang.String aggregatorName, java.lang.String externalBankId, java.lang.String bankName, java.lang.String countryCode, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String bankLogoUrl, java.lang.String credentialToken, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank, java.lang.String instrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatorName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankConnectionContext(aggregatorName, externalBankId, bankName, countryCode, integrationType, bankLogoUrl, credentialToken, action, bank, instrumentId);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
        return this.bank;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getBankLogoUrl() {
        return this.bankLogoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAggregatorName() {
        return this.aggregatorName;
    }
}
