package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthChallengeContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/TransactionLevelContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "name", "", "stepUpAuthID", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "originApi", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthChallengeContingency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "getName", "Ljava/lang/String;", "getStepUpAuthID", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "getOriginApi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AuthChallengeContingency implements com.paypal.oslo.feature.inappcheckout.domain.entity.TransactionLevelContingency {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name;
    private final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName originApi;
    private final java.lang.String stepUpAuthID;

    public AuthChallengeContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyName, "");
        this.name = contingencyName;
        this.stepUpAuthID = str;
        this.originApi = apiName;
    }

    public /* synthetic */ AuthChallengeContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.AUTH_CHALLENGE : contingencyName, str, (i & 4) != 0 ? null : apiName);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName getName() {
        return this.name;
    }

    public final java.lang.String getStepUpAuthID() {
        return this.stepUpAuthID;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity
    public final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName getOriginApi() {
        return this.originApi;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName = this.name;
        java.lang.String str = this.stepUpAuthID;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName = this.originApi;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthChallengeContingency(name=");
        sb.append(contingencyName);
        sb.append(", stepUpAuthID=");
        sb.append(str);
        sb.append(", originApi=");
        sb.append(apiName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.stepUpAuthID;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName = this.originApi;
        return (((hashCode * 31) + hashCode2) * 31) + (apiName != null ? apiName.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency authChallengeContingency = (com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency) other;
        return this.name == authChallengeContingency.name && kotlin.jvm.internal.Intrinsics.areEqual(this.stepUpAuthID, authChallengeContingency.stepUpAuthID) && this.originApi == authChallengeContingency.originApi;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name2, java.lang.String stepUpAuthID, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName originApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency(name2, stepUpAuthID, originApi);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName getOriginApi() {
        return this.originApi;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStepUpAuthID() {
        return this.stepUpAuthID;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthChallengeContingency authChallengeContingency, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contingencyName = authChallengeContingency.name;
        }
        if ((i & 2) != 0) {
            str = authChallengeContingency.stepUpAuthID;
        }
        if ((i & 4) != 0) {
            apiName = authChallengeContingency.originApi;
        }
        return authChallengeContingency.copy(contingencyName, str, apiName);
    }
}
