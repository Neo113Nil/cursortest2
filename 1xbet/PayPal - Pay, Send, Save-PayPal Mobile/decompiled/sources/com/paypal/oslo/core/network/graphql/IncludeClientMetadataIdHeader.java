package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/IncludeClientMetadataIdHeader;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "sourceId", "", "cmId", "<init>", "(Lcom/paypal/oslo/core/network/graphql/RiskSourceId;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/network/graphql/RiskSourceId;Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/IncludeClientMetadataIdHeader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "getSourceId", "Ljava/lang/String;", "getCmId", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "getKey", "()Lcom/apollographql/apollo/api/ExecutionContext$Key;", "key", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IncludeClientMetadataIdHeader implements com.apollographql.apollo.api.ExecutionContext.Element {
    public static final java.lang.String CLIENT_METADATA_ID_HEADER = "PayPal-Client-Metadata-Id";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader.Companion INSTANCE = new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader.Companion(null);
    private final java.lang.String cmId;
    private final com.paypal.oslo.core.network.graphql.RiskSourceId sourceId;

    public IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskSourceId, "");
        this.sourceId = riskSourceId;
        this.cmId = str;
    }

    public /* synthetic */ IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(riskSourceId, (i & 2) != 0 ? null : str);
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

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final com.apollographql.apollo.api.ExecutionContext.Key<com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/IncludeClientMetadataIdHeader$Companion;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/paypal/oslo/core/network/graphql/IncludeClientMetadataIdHeader;", "<init>", "()V", "", "CLIENT_METADATA_ID_HEADER", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements com.apollographql.apollo.api.ExecutionContext.Key<com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId = this.sourceId;
        java.lang.String str = this.cmId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IncludeClientMetadataIdHeader(sourceId=");
        sb.append(riskSourceId);
        sb.append(", cmId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sourceId.hashCode();
        java.lang.String str = this.cmId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader)) {
            return false;
        }
        com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader includeClientMetadataIdHeader = (com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sourceId, includeClientMetadataIdHeader.sourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cmId, includeClientMetadataIdHeader.cmId);
    }

    public final com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader copy(com.paypal.oslo.core.network.graphql.RiskSourceId sourceId, java.lang.String cmId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "");
        return new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(sourceId, cmId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCmId() {
        return this.cmId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.network.graphql.RiskSourceId getSourceId() {
        return this.sourceId;
    }

    public static /* synthetic */ com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader copy$default(com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader includeClientMetadataIdHeader, com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            riskSourceId = includeClientMetadataIdHeader.sourceId;
        }
        if ((i & 2) != 0) {
            str = includeClientMetadataIdHeader.cmId;
        }
        return includeClientMetadataIdHeader.copy(riskSourceId, str);
    }
}
