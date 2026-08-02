package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0098\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b4\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b7\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b8\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b9\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/FinancialInstitution;", "", "", "externalBankId", "bankName", "inlineLogoUrl", "primaryLogoUrl", "countryCode", "", "rank", "institutionUrl", "internalInstitutionId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "aggregatorName", "groupName", "groupRank", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/FinancialInstitution;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExternalBankId", "getBankName", "getInlineLogoUrl", "getPrimaryLogoUrl", "getCountryCode", "Ljava/lang/Integer;", "getRank", "getInstitutionUrl", "getInternalInstitutionId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getIntegrationType", "getAggregatorName", "getGroupName", "getGroupRank"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FinancialInstitution {
    public static final int $stable = 0;
    private final java.lang.String aggregatorName;
    private final java.lang.String bankName;
    private final java.lang.String countryCode;
    private final java.lang.String externalBankId;
    private final java.lang.String groupName;
    private final java.lang.Integer groupRank;
    private final java.lang.String inlineLogoUrl;
    private final java.lang.String institutionUrl;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
    private final java.lang.String internalInstitutionId;
    private final java.lang.String primaryLogoUrl;
    private final java.lang.Integer rank;

    public FinancialInstitution(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str8, java.lang.String str9, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        this.externalBankId = str;
        this.bankName = str2;
        this.inlineLogoUrl = str3;
        this.primaryLogoUrl = str4;
        this.countryCode = str5;
        this.rank = num;
        this.institutionUrl = str6;
        this.internalInstitutionId = str7;
        this.integrationType = integrationType;
        this.aggregatorName = str8;
        this.groupName = str9;
        this.groupRank = num2;
    }

    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    public final java.lang.String getBankName() {
        return this.bankName;
    }

    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    public final java.lang.String getPrimaryLogoUrl() {
        return this.primaryLogoUrl;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.Integer getRank() {
        return this.rank;
    }

    public final java.lang.String getInstitutionUrl() {
        return this.institutionUrl;
    }

    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    public final java.lang.String getAggregatorName() {
        return this.aggregatorName;
    }

    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    public final java.lang.Integer getGroupRank() {
        return this.groupRank;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.externalBankId;
        java.lang.String str2 = this.bankName;
        java.lang.String str3 = this.inlineLogoUrl;
        java.lang.String str4 = this.primaryLogoUrl;
        java.lang.String str5 = this.countryCode;
        java.lang.Integer num = this.rank;
        java.lang.String str6 = this.institutionUrl;
        java.lang.String str7 = this.internalInstitutionId;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        java.lang.String str8 = this.aggregatorName;
        java.lang.String str9 = this.groupName;
        java.lang.Integer num2 = this.groupRank;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FinancialInstitution(externalBankId=");
        sb.append(str);
        sb.append(", bankName=");
        sb.append(str2);
        sb.append(", inlineLogoUrl=");
        sb.append(str3);
        sb.append(", primaryLogoUrl=");
        sb.append(str4);
        sb.append(", countryCode=");
        sb.append(str5);
        sb.append(", rank=");
        sb.append(num);
        sb.append(", institutionUrl=");
        sb.append(str6);
        sb.append(", internalInstitutionId=");
        sb.append(str7);
        sb.append(", integrationType=");
        sb.append(integrationType);
        sb.append(", aggregatorName=");
        sb.append(str8);
        sb.append(", groupName=");
        sb.append(str9);
        sb.append(", groupRank=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.externalBankId.hashCode();
        int hashCode2 = this.bankName.hashCode();
        java.lang.String str = this.inlineLogoUrl;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.primaryLogoUrl;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        int hashCode5 = this.countryCode.hashCode();
        java.lang.Integer num = this.rank;
        int hashCode6 = num == null ? 0 : num.hashCode();
        java.lang.String str3 = this.institutionUrl;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.internalInstitutionId;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = this.integrationType;
        int hashCode9 = integrationType == null ? 0 : integrationType.hashCode();
        int hashCode10 = this.aggregatorName.hashCode();
        java.lang.String str5 = this.groupName;
        int hashCode11 = str5 == null ? 0 : str5.hashCode();
        java.lang.Integer num2 = this.groupRank;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution financialInstitution = (com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, financialInstitution.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, financialInstitution.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoUrl, financialInstitution.inlineLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryLogoUrl, financialInstitution.primaryLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, financialInstitution.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.rank, financialInstitution.rank) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionUrl, financialInstitution.institutionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.internalInstitutionId, financialInstitution.internalInstitutionId) && this.integrationType == financialInstitution.integrationType && kotlin.jvm.internal.Intrinsics.areEqual(this.aggregatorName, financialInstitution.aggregatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupName, financialInstitution.groupName) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupRank, financialInstitution.groupRank);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution copy(java.lang.String externalBankId, java.lang.String bankName, java.lang.String inlineLogoUrl, java.lang.String primaryLogoUrl, java.lang.String countryCode, java.lang.Integer rank, java.lang.String institutionUrl, java.lang.String internalInstitutionId, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String aggregatorName, java.lang.String groupName, java.lang.Integer groupRank) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatorName, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.FinancialInstitution(externalBankId, bankName, inlineLogoUrl, primaryLogoUrl, countryCode, rank, institutionUrl, internalInstitutionId, integrationType, aggregatorName, groupName, groupRank);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getIntegrationType() {
        return this.integrationType;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getInternalInstitutionId() {
        return this.internalInstitutionId;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getInstitutionUrl() {
        return this.institutionUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Integer getRank() {
        return this.rank;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPrimaryLogoUrl() {
        return this.primaryLogoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getInlineLogoUrl() {
        return this.inlineLogoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBankName() {
        return this.bankName;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.Integer getGroupRank() {
        return this.groupRank;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAggregatorName() {
        return this.aggregatorName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }
}
