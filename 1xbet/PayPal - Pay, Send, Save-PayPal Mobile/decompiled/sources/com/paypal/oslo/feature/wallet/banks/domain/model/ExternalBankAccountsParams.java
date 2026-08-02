package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJd\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccountsParams;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "aggregator", "", "countryCode", "credentialToken", "externalBankId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "addFIFlow", "internalInstitutionId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "credentialType", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "component8", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccountsParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "getAggregator", "Ljava/lang/String;", "getCountryCode", "getCredentialToken", "getExternalBankId", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getAddFIFlow", "getInternalInstitutionId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getIntegrationType", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "getCredentialType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExternalBankAccountsParams {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator;
    private final java.lang.String countryCode;
    private final java.lang.String credentialToken;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType;
    private final java.lang.String externalBankId;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
    private final java.lang.String internalInstitutionId;

    public ExternalBankAccountsParams(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        this.aggregator = bankAggregator;
        this.countryCode = str;
        this.credentialToken = str2;
        this.externalBankId = str3;
        this.addFIFlow = addFIFlow;
        this.internalInstitutionId = str4;
        this.integrationType = integrationType;
        this.credentialType = credentialType;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    public /* synthetic */ ExternalBankAccountsParams(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bankAggregator, str, str2, str3, (i & 16) != 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET : addFIFlow, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.HOSTED_URL : integrationType, (i & 128) != 0 ? null : credentialType);
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAddFIFlow() {
        return this.addFIFlow;
    }

    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType getCredentialType() {
        return this.credentialType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = this.aggregator;
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.credentialToken;
        java.lang.String str3 = this.externalBankId;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.addFIFlow;
        java.lang.String str4 = this.internalInstitutionId;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType = this.credentialType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalBankAccountsParams(aggregator=");
        sb.append(bankAggregator);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(", credentialToken=");
        sb.append(str2);
        sb.append(", externalBankId=");
        sb.append(str3);
        sb.append(", addFIFlow=");
        sb.append(addFIFlow);
        sb.append(", internalInstitutionId=");
        sb.append(str4);
        sb.append(", integrationType=");
        sb.append(integrationType);
        sb.append(", credentialType=");
        sb.append(credentialType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.aggregator.hashCode();
        int hashCode2 = this.countryCode.hashCode();
        int hashCode3 = this.credentialToken.hashCode();
        int hashCode4 = this.externalBankId.hashCode();
        int hashCode5 = this.addFIFlow.hashCode();
        java.lang.String str = this.internalInstitutionId;
        int hashCode6 = str == null ? 0 : str.hashCode();
        int hashCode7 = this.integrationType.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType = this.credentialType;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (credentialType != null ? credentialType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams externalBankAccountsParams = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams) other;
        return this.aggregator == externalBankAccountsParams.aggregator && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, externalBankAccountsParams.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, externalBankAccountsParams.credentialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, externalBankAccountsParams.externalBankId) && this.addFIFlow == externalBankAccountsParams.addFIFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.internalInstitutionId, externalBankAccountsParams.internalInstitutionId) && this.integrationType == externalBankAccountsParams.integrationType && this.credentialType == externalBankAccountsParams.credentialType;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams copy(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator, java.lang.String countryCode, java.lang.String credentialToken, java.lang.String externalBankId, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.lang.String internalInstitutionId, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams(aggregator, countryCode, credentialToken, externalBankId, addFIFlow, internalInstitutionId, integrationType, credentialType);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType getCredentialType() {
        return this.credentialType;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAddFIFlow() {
        return this.addFIFlow;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCredentialToken() {
        return this.credentialToken;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }
}
