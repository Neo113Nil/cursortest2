package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0013\u0010!\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b \u0010\u000bR\u0013\u0010#\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\"\u0010\u000bR\u0013\u0010'\u001a\u0004\u0018\u00010$8G¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "", "", "message", "", "path", "", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getPath", "Ljava/util/Map;", "getExtensions", "getCorrelationId", "correlationId", "getErrorCode", "errorCode", "", "getTimestamp", "()Ljava/lang/Long;", "timestamp"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GraphQLError {
    private final java.util.Map<java.lang.String, java.lang.Object> extensions;
    private final java.lang.String message;
    private final java.util.List<java.lang.Object> path;

    public GraphQLError(java.lang.String str, java.util.List<? extends java.lang.Object> list, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.path = list;
        this.extensions = map;
    }

    public /* synthetic */ GraphQLError(java.lang.String str, java.util.List list, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : map);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getExtensions() {
        return this.extensions;
    }

    public final java.lang.String getCorrelationId() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extensions;
        java.lang.Object obj = map != null ? map.get("correlationId") : null;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public final java.lang.String getErrorCode() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extensions;
        java.lang.Object obj = map != null ? map.get("errorCode") : null;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public final java.lang.Long getTimestamp() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extensions;
        java.lang.Object obj = map != null ? map.get("timestamp") : null;
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.util.List<java.lang.Object> list = this.path;
        java.util.Map<java.lang.String, java.lang.Object> map = this.extensions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(message=");
        sb.append(str);
        sb.append(", path=");
        sb.append(list);
        sb.append(", extensions=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        java.util.List<java.lang.Object> list = this.path;
        int hashCode2 = list == null ? 0 : list.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.extensions;
        return (((hashCode * 31) + hashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.network.graphql.error.GraphQLError)) {
            return false;
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, graphQLError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, graphQLError.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, graphQLError.extensions);
    }

    public final com.paypal.oslo.core.network.graphql.error.GraphQLError copy(java.lang.String message, java.util.List<? extends java.lang.Object> path, java.util.Map<java.lang.String, ? extends java.lang.Object> extensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.core.network.graphql.error.GraphQLError(message, path, extensions);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.extensions;
    }

    public final java.util.List<java.lang.Object> component2() {
        return this.path;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.network.graphql.error.GraphQLError copy$default(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError, java.lang.String str, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = graphQLError.message;
        }
        if ((i & 2) != 0) {
            list = graphQLError.path;
        }
        if ((i & 4) != 0) {
            map = graphQLError.extensions;
        }
        return graphQLError.copy(str, list, map);
    }
}
