package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsParams;", "", "", "aggregatorName", "searchQuery", "", "maxResults", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingInstitutionsParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAggregatorName", "getSearchQuery", "Ljava/lang/Integer;", "getMaxResults"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OpenBankingInstitutionsParams {
    public static final int $stable = 0;
    private final java.lang.String aggregatorName;
    private final java.lang.Integer maxResults;
    private final java.lang.String searchQuery;

    public OpenBankingInstitutionsParams(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.aggregatorName = str;
        this.searchQuery = str2;
        this.maxResults = num;
    }

    public /* synthetic */ OpenBankingInstitutionsParams(java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }

    public final java.lang.String getAggregatorName() {
        return this.aggregatorName;
    }

    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    public final java.lang.Integer getMaxResults() {
        return this.maxResults;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.aggregatorName;
        java.lang.String str2 = this.searchQuery;
        java.lang.Integer num = this.maxResults;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenBankingInstitutionsParams(aggregatorName=");
        sb.append(str);
        sb.append(", searchQuery=");
        sb.append(str2);
        sb.append(", maxResults=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.aggregatorName.hashCode();
        java.lang.String str = this.searchQuery;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.maxResults;
        return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams openBankingInstitutionsParams = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.aggregatorName, openBankingInstitutionsParams.aggregatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchQuery, openBankingInstitutionsParams.searchQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxResults, openBankingInstitutionsParams.maxResults);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams copy(java.lang.String aggregatorName, java.lang.String searchQuery, java.lang.Integer maxResults) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregatorName, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams(aggregatorName, searchQuery, maxResults);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getMaxResults() {
        return this.maxResults;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSearchQuery() {
        return this.searchQuery;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAggregatorName() {
        return this.aggregatorName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingInstitutionsParams openBankingInstitutionsParams, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = openBankingInstitutionsParams.aggregatorName;
        }
        if ((i & 2) != 0) {
            str2 = openBankingInstitutionsParams.searchQuery;
        }
        if ((i & 4) != 0) {
            num = openBankingInstitutionsParams.maxResults;
        }
        return openBankingInstitutionsParams.copy(str, str2, num);
    }
}
