package com.ingo.sdk.kotlin.common.features.submit_transaction;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionUseCaseParameters;", "", "", "transactionReferenceNumber", "promoCode", "accountIdentifier", "Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;", "fundsTiming", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;)Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionUseCaseParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransactionReferenceNumber", "getPromoCode", "getAccountIdentifier", "Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;", "getFundsTiming"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SubmitTransactionUseCaseParameters {
    private final java.lang.String accountIdentifier;
    private final com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming;
    private final java.lang.String promoCode;
    private final java.lang.String transactionReferenceNumber;

    public SubmitTransactionUseCaseParameters(java.lang.String str, java.lang.String str2, java.lang.String str3, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTiming, "");
        this.transactionReferenceNumber = str;
        this.promoCode = str2;
        this.accountIdentifier = str3;
        this.fundsTiming = fundsTiming;
    }

    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public final java.lang.String getPromoCode() {
        return this.promoCode;
    }

    public final java.lang.String getAccountIdentifier() {
        return this.accountIdentifier;
    }

    public final com.ingo.sdk.kotlin.common.constants.FundsTiming getFundsTiming() {
        return this.fundsTiming;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionReferenceNumber;
        java.lang.String str2 = this.promoCode;
        java.lang.String str3 = this.accountIdentifier;
        com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming = this.fundsTiming;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitTransactionUseCaseParameters(transactionReferenceNumber=");
        sb.append(str);
        sb.append(", promoCode=");
        sb.append(str2);
        sb.append(", accountIdentifier=");
        sb.append(str3);
        sb.append(", fundsTiming=");
        sb.append(fundsTiming);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.transactionReferenceNumber.hashCode() * 31) + this.promoCode.hashCode()) * 31) + this.accountIdentifier.hashCode()) * 31) + this.fundsTiming.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters submitTransactionUseCaseParameters = (com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, submitTransactionUseCaseParameters.transactionReferenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.promoCode, submitTransactionUseCaseParameters.promoCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountIdentifier, submitTransactionUseCaseParameters.accountIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundsTiming, submitTransactionUseCaseParameters.fundsTiming);
    }

    public final com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters copy(java.lang.String transactionReferenceNumber, java.lang.String promoCode, java.lang.String accountIdentifier, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promoCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTiming, "");
        return new com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters(transactionReferenceNumber, promoCode, accountIdentifier, fundsTiming);
    }

    /* renamed from: component4, reason: from getter */
    public final com.ingo.sdk.kotlin.common.constants.FundsTiming getFundsTiming() {
        return this.fundsTiming;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAccountIdentifier() {
        return this.accountIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPromoCode() {
        return this.promoCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters copy$default(com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters submitTransactionUseCaseParameters, java.lang.String str, java.lang.String str2, java.lang.String str3, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = submitTransactionUseCaseParameters.transactionReferenceNumber;
        }
        if ((i & 2) != 0) {
            str2 = submitTransactionUseCaseParameters.promoCode;
        }
        if ((i & 4) != 0) {
            str3 = submitTransactionUseCaseParameters.accountIdentifier;
        }
        if ((i & 8) != 0) {
            fundsTiming = submitTransactionUseCaseParameters.fundsTiming;
        }
        return submitTransactionUseCaseParameters.copy(str, str2, str3, fundsTiming);
    }
}
