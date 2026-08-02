package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u008a\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b7\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b8\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010 R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b?\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsParams;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "aggregator", "", "countryCode", "credentialToken", "externalBankId", "bankName", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "addFIFlow", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "operationMode", "", "bankAccountCandidateIds", "internalInstitutionId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "credentialType", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component7", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "component8", "()Ljava/util/List;", "component9", "component10", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "component11", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "getAggregator", "Ljava/lang/String;", "getCountryCode", "getCredentialToken", "getExternalBankId", "getBankName", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getAddFIFlow", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "getOperationMode", "Ljava/util/List;", "getBankAccountCandidateIds", "getInternalInstitutionId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getIntegrationType", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "getCredentialType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LinkExternalBankAccountsParams {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator;
    private final java.util.List<java.lang.String> bankAccountCandidateIds;
    private final java.lang.String bankName;
    private final java.lang.String countryCode;
    private final java.lang.String credentialToken;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType;
    private final java.lang.String externalBankId;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
    private final java.lang.String internalInstitutionId;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode operationMode;

    public LinkExternalBankAccountsParams(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode, java.util.List<java.lang.String> list, java.lang.String str5, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregatorOperationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.aggregator = bankAggregator;
        this.countryCode = str;
        this.credentialToken = str2;
        this.externalBankId = str3;
        this.bankName = str4;
        this.addFIFlow = addFIFlow;
        this.operationMode = openBankingAggregatorOperationMode;
        this.bankAccountCandidateIds = list;
        this.internalInstitutionId = str5;
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

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public /* synthetic */ LinkExternalBankAccountsParams(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode, java.util.List list, java.lang.String str5, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bankAggregator, str, str2, str3, str4, (i & 32) != 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET : addFIFlow, (i & 64) != 0 ? com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.FULL_MODE : openBankingAggregatorOperationMode, list, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : integrationType, (i & 1024) != 0 ? null : credentialType);
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAddFIFlow() {
        return this.addFIFlow;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode getOperationMode() {
        return this.operationMode;
    }

    public final java.util.List<java.lang.String> getBankAccountCandidateIds() {
        return this.bankAccountCandidateIds;
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
        java.lang.String str4 = this.bankName;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.addFIFlow;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode = this.operationMode;
        java.util.List<java.lang.String> list = this.bankAccountCandidateIds;
        java.lang.String str5 = this.internalInstitutionId;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType = this.credentialType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkExternalBankAccountsParams(aggregator=");
        sb.append(bankAggregator);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(", credentialToken=");
        sb.append(str2);
        sb.append(", externalBankId=");
        sb.append(str3);
        sb.append(", bankName=");
        sb.append(str4);
        sb.append(", addFIFlow=");
        sb.append(addFIFlow);
        sb.append(", operationMode=");
        sb.append(openBankingAggregatorOperationMode);
        sb.append(", bankAccountCandidateIds=");
        sb.append(list);
        sb.append(", internalInstitutionId=");
        sb.append(str5);
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
        int hashCode5 = this.bankName.hashCode();
        int hashCode6 = this.addFIFlow.hashCode();
        int hashCode7 = this.operationMode.hashCode();
        int hashCode8 = this.bankAccountCandidateIds.hashCode();
        java.lang.String str = this.internalInstitutionId;
        int hashCode9 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        int hashCode10 = integrationType == null ? 0 : integrationType.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType = this.credentialType;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (credentialType != null ? credentialType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams linkExternalBankAccountsParams = (com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams) other;
        return this.aggregator == linkExternalBankAccountsParams.aggregator && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, linkExternalBankAccountsParams.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialToken, linkExternalBankAccountsParams.credentialToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, linkExternalBankAccountsParams.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, linkExternalBankAccountsParams.bankName) && this.addFIFlow == linkExternalBankAccountsParams.addFIFlow && this.operationMode == linkExternalBankAccountsParams.operationMode && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountCandidateIds, linkExternalBankAccountsParams.bankAccountCandidateIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.internalInstitutionId, linkExternalBankAccountsParams.internalInstitutionId) && this.integrationType == linkExternalBankAccountsParams.integrationType && this.credentialType == linkExternalBankAccountsParams.credentialType;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams copy(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator, java.lang.String countryCode, java.lang.String credentialToken, java.lang.String externalBankId, java.lang.String bankName, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode operationMode, java.util.List<java.lang.String> bankAccountCandidateIds, java.lang.String internalInstitutionId, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountCandidateIds, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams(aggregator, countryCode, credentialToken, externalBankId, bankName, addFIFlow, operationMode, bankAccountCandidateIds, internalInstitutionId, integrationType, credentialType);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    public final java.util.List<java.lang.String> component8() {
        return this.bankAccountCandidateIds;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode getOperationMode() {
        return this.operationMode;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAddFIFlow() {
        return this.addFIFlow;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
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

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType getCredentialType() {
        return this.credentialType;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }
}
