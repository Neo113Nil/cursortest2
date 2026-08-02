package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "T", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/Object;Ljava/util/Map;)Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData", "Ljava/util/Map;", "getExtensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GraphQLData<T> {
    private final T data;
    private final java.util.Map<java.lang.String, java.lang.Object> extensions;

    public GraphQLData(T t, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.data = t;
        this.extensions = map;
    }

    public final T getData() {
        return this.data;
    }

    public /* synthetic */ GraphQLData(java.lang.Object obj, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getExtensions() {
        return this.extensions;
    }

    public final java.lang.String toString() {
        T t = this.data;
        java.util.Map<java.lang.String, java.lang.Object> map = this.extensions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLData(data=");
        sb.append(t);
        sb.append(", extensions=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        T t = this.data;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.extensions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.network.graphql.GraphQLData)) {
            return false;
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.data, graphQLData.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, graphQLData.extensions);
    }

    public final com.paypal.oslo.core.network.graphql.GraphQLData<T> copy(T data, java.util.Map<java.lang.String, ? extends java.lang.Object> extensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "");
        return new com.paypal.oslo.core.network.graphql.GraphQLData<>(data, extensions);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component2() {
        return this.extensions;
    }

    public final T component1() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.network.graphql.GraphQLData copy$default(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData, java.lang.Object obj, java.util.Map map, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = graphQLData.data;
        }
        if ((i & 2) != 0) {
            map = graphQLData.extensions;
        }
        return graphQLData.copy(obj, map);
    }
}
