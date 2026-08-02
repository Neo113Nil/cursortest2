package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/IncludeRiskData;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "sourceId", "", "cmId", "", "additionalData", "<init>", "(Lcom/paypal/oslo/core/network/graphql/RiskSourceId;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/core/network/graphql/RiskSourceId;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/network/graphql/IncludeRiskData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getSourceId", "Ljava/lang/String;", "getCmId", "Ljava/util/Map;", "getAdditionalData", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IncludeRiskData implements com.apollographql.apollo.api.ExecutionContext.Element {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.graphql.IncludeRiskData.Companion INSTANCE = new com.paypal.oslo.core.network.graphql.IncludeRiskData.Companion(null);
    private final java.util.Map<java.lang.String, java.lang.String> additionalData;
    private final java.lang.String cmId;
    private final com.paypal.oslo.core.network.graphql.RiskSourceId sourceId;

    public IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskSourceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.sourceId = riskSourceId;
        this.cmId = str;
        this.additionalData = map;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element, com.apollographql.apollo.api.ExecutionContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super com.apollographql.apollo.api.ExecutionContext.Element, ? extends R> function2) {
        return (R) super.fold(r, function2);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element, com.apollographql.apollo.api.ExecutionContext
    public final /* bridge */ <E extends com.apollographql.apollo.api.ExecutionContext.Element> E get(com.apollographql.apollo.api.ExecutionContext.Key<E> key) {
        return (E) super.get(key);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element, com.apollographql.apollo.api.ExecutionContext
    public final /* bridge */ com.apollographql.apollo.api.ExecutionContext minusKey(com.apollographql.apollo.api.ExecutionContext.Key<?> key) {
        return super.minusKey(key);
    }

    @Override // com.apollographql.apollo.api.ExecutionContext
    public final /* bridge */ com.apollographql.apollo.api.ExecutionContext plus(com.apollographql.apollo.api.ExecutionContext executionContext) {
        return super.plus(executionContext);
    }

    public final com.paypal.oslo.core.network.graphql.RiskSourceId getSourceId() {
        return this.sourceId;
    }

    public final java.lang.String getCmId() {
        return this.cmId;
    }

    public /* synthetic */ IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(riskSourceId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalData() {
        return this.additionalData;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<com.paypal.oslo.core.network.graphql.IncludeRiskData> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/IncludeRiskData$Companion;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/paypal/oslo/core/network/graphql/IncludeRiskData;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.paypal.oslo.core.network.graphql.IncludeRiskData> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId = this.sourceId;
        java.lang.String str = this.cmId;
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IncludeRiskData(sourceId=");
        sb.append(riskSourceId);
        sb.append(", cmId=");
        sb.append(str);
        sb.append(", additionalData=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sourceId.hashCode();
        java.lang.String str = this.cmId;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.additionalData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.network.graphql.IncludeRiskData)) {
            return false;
        }
        com.paypal.oslo.core.network.graphql.IncludeRiskData includeRiskData = (com.paypal.oslo.core.network.graphql.IncludeRiskData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sourceId, includeRiskData.sourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cmId, includeRiskData.cmId) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalData, includeRiskData.additionalData);
    }

    public final com.paypal.oslo.core.network.graphql.IncludeRiskData copy(com.paypal.oslo.core.network.graphql.RiskSourceId sourceId, java.lang.String cmId, java.util.Map<java.lang.String, java.lang.String> additionalData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalData, "");
        return new com.paypal.oslo.core.network.graphql.IncludeRiskData(sourceId, cmId, additionalData);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return this.additionalData;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCmId() {
        return this.cmId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.network.graphql.RiskSourceId getSourceId() {
        return this.sourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.network.graphql.IncludeRiskData copy$default(com.paypal.oslo.core.network.graphql.IncludeRiskData includeRiskData, com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            riskSourceId = includeRiskData.sourceId;
        }
        if ((i & 2) != 0) {
            str = includeRiskData.cmId;
        }
        if ((i & 4) != 0) {
            map = includeRiskData.additionalData;
        }
        return includeRiskData.copy(riskSourceId, str, map);
    }
}
