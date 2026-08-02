package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/CallConfig;", "", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "authType", "", "", "headers", "<init>", "(Lcom/paypal/oslo/core/network/graphql/AuthType;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/AuthType;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/core/network/graphql/AuthType;Ljava/util/Map;)Lcom/paypal/oslo/core/network/graphql/CallConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "getAuthType", "Ljava/util/Map;", "getHeaders"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CallConfig {
    private final com.paypal.oslo.core.network.graphql.AuthType authType;
    private final java.util.Map<java.lang.String, java.lang.String> headers;

    public CallConfig(com.paypal.oslo.core.network.graphql.AuthType authType, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.authType = authType;
        this.headers = map;
    }

    public final com.paypal.oslo.core.network.graphql.AuthType getAuthType() {
        return this.authType;
    }

    public /* synthetic */ CallConfig(com.paypal.oslo.core.network.graphql.AuthType.User user, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("default_source", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))) : user, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.network.graphql.AuthType authType = this.authType;
        java.util.Map<java.lang.String, java.lang.String> map = this.headers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CallConfig(authType=");
        sb.append(authType);
        sb.append(", headers=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.authType.hashCode() * 31) + this.headers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.network.graphql.CallConfig)) {
            return false;
        }
        com.paypal.oslo.core.network.graphql.CallConfig callConfig = (com.paypal.oslo.core.network.graphql.CallConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authType, callConfig.authType) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, callConfig.headers);
    }

    public final com.paypal.oslo.core.network.graphql.CallConfig copy(com.paypal.oslo.core.network.graphql.AuthType authType, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        return new com.paypal.oslo.core.network.graphql.CallConfig(authType, headers);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.headers;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.network.graphql.AuthType getAuthType() {
        return this.authType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.network.graphql.CallConfig copy$default(com.paypal.oslo.core.network.graphql.CallConfig callConfig, com.paypal.oslo.core.network.graphql.AuthType authType, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authType = callConfig.authType;
        }
        if ((i & 2) != 0) {
            map = callConfig.headers;
        }
        return callConfig.copy(authType, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
