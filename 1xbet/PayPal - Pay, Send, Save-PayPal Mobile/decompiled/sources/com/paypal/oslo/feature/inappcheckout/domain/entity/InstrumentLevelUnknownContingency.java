package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentLevelUnknownContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentLevelContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "name", "", "fundingInstrument", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "originApi", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentLevelUnknownContingency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "getName", "Ljava/lang/String;", "getFundingInstrument", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "getOriginApi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstrumentLevelUnknownContingency implements com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelContingency {
    public static final int $stable = 0;
    private final java.lang.String fundingInstrument;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name;
    private final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName originApi;

    public InstrumentLevelUnknownContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyName, "");
        this.name = contingencyName;
        this.fundingInstrument = str;
        this.originApi = apiName;
    }

    public /* synthetic */ InstrumentLevelUnknownContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.UNKNOWN__ : contingencyName, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : apiName);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName getName() {
        return this.name;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelContingency
    public final java.lang.String getFundingInstrument() {
        return this.fundingInstrument;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity
    public final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName getOriginApi() {
        return this.originApi;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName = this.name;
        java.lang.String str = this.fundingInstrument;
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName = this.originApi;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstrumentLevelUnknownContingency(name=");
        sb.append(contingencyName);
        sb.append(", fundingInstrument=");
        sb.append(str);
        sb.append(", originApi=");
        sb.append(apiName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.fundingInstrument;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName = this.originApi;
        return (((hashCode * 31) + hashCode2) * 31) + (apiName != null ? apiName.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency instrumentLevelUnknownContingency = (com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency) other;
        return this.name == instrumentLevelUnknownContingency.name && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, instrumentLevelUnknownContingency.fundingInstrument) && this.originApi == instrumentLevelUnknownContingency.originApi;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency copy(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name2, java.lang.String fundingInstrument, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName originApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency(name2, fundingInstrument, originApi);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.model.ApiName getOriginApi() {
        return this.originApi;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFundingInstrument() {
        return this.fundingInstrument;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency instrumentLevelUnknownContingency, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName apiName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contingencyName = instrumentLevelUnknownContingency.name;
        }
        if ((i & 2) != 0) {
            str = instrumentLevelUnknownContingency.fundingInstrument;
        }
        if ((i & 4) != 0) {
            apiName = instrumentLevelUnknownContingency.originApi;
        }
        return instrumentLevelUnknownContingency.copy(contingencyName, str, apiName);
    }

    public InstrumentLevelUnknownContingency() {
        this(null, null, null, 7, null);
    }
}
