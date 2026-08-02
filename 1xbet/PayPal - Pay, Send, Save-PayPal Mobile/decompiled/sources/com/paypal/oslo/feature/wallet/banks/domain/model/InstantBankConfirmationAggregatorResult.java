package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJn\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b.\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b0\u0010\u0014R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorResult;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "aggregator", "", "bankName", "externalBankId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "internalInstitutionId", "inlineLogoUrl", "primaryLogoUrl", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "institutions", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "getAggregator", "Ljava/lang/String;", "getBankName", "getExternalBankId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getIntegrationType", "getInternalInstitutionId", "getInlineLogoUrl", "getPrimaryLogoUrl", "Ljava/util/List;", "getInstitutions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InstantBankConfirmationAggregatorResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator;
    private final java.lang.String bankName;
    private final java.lang.String externalBankId;
    private final java.lang.String inlineLogoUrl;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> institutions;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
    private final java.lang.String internalInstitutionId;
    private final java.lang.String primaryLogoUrl;

    public InstantBankConfirmationAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.aggregator = bankAggregator;
        this.bankName = str;
        this.externalBankId = str2;
        this.integrationType = integrationType;
        this.internalInstitutionId = str3;
        this.inlineLogoUrl = str4;
        this.primaryLogoUrl = str5;
        this.institutions = list;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    public final java.lang.String getPrimaryLogoUrl() {
        return this.primaryLogoUrl;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> getInstitutions() {
        return this.institutions;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = this.aggregator;
        java.lang.String str = this.bankName;
        java.lang.String str2 = this.externalBankId;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        java.lang.String str3 = this.internalInstitutionId;
        java.lang.String str4 = this.inlineLogoUrl;
        java.lang.String str5 = this.primaryLogoUrl;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> list = this.institutions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstantBankConfirmationAggregatorResult(aggregator=");
        sb.append(bankAggregator);
        sb.append(", bankName=");
        sb.append(str);
        sb.append(", externalBankId=");
        sb.append(str2);
        sb.append(", integrationType=");
        sb.append(integrationType);
        sb.append(", internalInstitutionId=");
        sb.append(str3);
        sb.append(", inlineLogoUrl=");
        sb.append(str4);
        sb.append(", primaryLogoUrl=");
        sb.append(str5);
        sb.append(", institutions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.aggregator.hashCode();
        java.lang.String str = this.bankName;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.externalBankId;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int hashCode4 = this.integrationType.hashCode();
        java.lang.String str3 = this.internalInstitutionId;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        int hashCode6 = this.inlineLogoUrl.hashCode();
        int hashCode7 = this.primaryLogoUrl.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> list = this.institutions;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult instantBankConfirmationAggregatorResult = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult) other;
        return this.aggregator == instantBankConfirmationAggregatorResult.aggregator && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, instantBankConfirmationAggregatorResult.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, instantBankConfirmationAggregatorResult.externalBankId) && this.integrationType == instantBankConfirmationAggregatorResult.integrationType && kotlin.jvm.internal.Intrinsics.areEqual(this.internalInstitutionId, instantBankConfirmationAggregatorResult.internalInstitutionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoUrl, instantBankConfirmationAggregatorResult.inlineLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryLogoUrl, instantBankConfirmationAggregatorResult.primaryLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutions, instantBankConfirmationAggregatorResult.institutions);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult copy(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator, java.lang.String bankName, java.lang.String externalBankId, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String internalInstitutionId, java.lang.String inlineLogoUrl, java.lang.String primaryLogoUrl, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> institutions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineLogoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryLogoUrl, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult(aggregator, bankName, externalBankId, integrationType, internalInstitutionId, inlineLogoUrl, primaryLogoUrl, institutions);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> component8() {
        return this.institutions;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPrimaryLogoUrl() {
        return this.primaryLogoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }
}
