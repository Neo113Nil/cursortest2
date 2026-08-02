package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CitAuthContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/TransactionLevelContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "name", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "originApi", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CitAuthContingency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "getName", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "getOriginApi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CitAuthContingency implements com.paypal.oslo.feature.inappcheckout.domain.entity.TransactionLevelContingency {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name;
    private final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName originApi;

    public CitAuthContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyName, "");
        this.name = contingencyName;
        this.originApi = apiName;
    }

    public /* synthetic */ CitAuthContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.CIT_AUTH : contingencyName, (i & 2) != 0 ? null : apiName);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName getName() {
        return this.name;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity
    public final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName getOriginApi() {
        return this.originApi;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName = this.name;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName = this.originApi;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CitAuthContingency(name=");
        sb.append(contingencyName);
        sb.append(", originApi=");
        sb.append(apiName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName = this.originApi;
        return (hashCode * 31) + (apiName == null ? 0 : apiName.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency citAuthContingency = (com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency) other;
        return this.name == citAuthContingency.name && this.originApi == citAuthContingency.originApi;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name2, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName originApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency(name2, originApi);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName getOriginApi() {
        return this.originApi;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.CitAuthContingency citAuthContingency, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contingencyName = citAuthContingency.name;
        }
        if ((i & 2) != 0) {
            apiName = citAuthContingency.originApi;
        }
        return citAuthContingency.copy(contingencyName, apiName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CitAuthContingency() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
