package com.paypal.oslo.core.network.graphql.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "<init>", "()V", "Network", "GraphQL", "Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CallError {
    private CallError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "error", "<init>", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "component1", "()Lcom/paypal/oslo/core/network/http/error/NetworkError;", "copy", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.core.network.graphql.error.CallError {
        private final com.paypal.oslo.core.network.http.error.NetworkError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Network(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
            this.error = networkError;
        }

        public final com.paypal.oslo.core.network.http.error.NetworkError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.http.error.NetworkError networkError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(error=");
            sb.append(networkError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.core.network.graphql.error.CallError.Network) other).error);
        }

        public final com.paypal.oslo.core.network.graphql.error.CallError.Network copy(com.paypal.oslo.core.network.http.error.NetworkError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.network.graphql.error.CallError.Network(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.http.error.NetworkError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.graphql.error.CallError.Network copy$default(com.paypal.oslo.core.network.graphql.error.CallError.Network network, com.paypal.oslo.core.network.http.error.NetworkError networkError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkError = network.error;
            }
            return network.copy(networkError);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ:\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Larrow/core/NonEmptyList;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "", "isCritical", "", "", "affectedCriticalPaths", "<init>", "(Ljava/util/List;ZLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-1X0FA-Y", "()Ljava/util/List;", "component1", "component2", "()Z", "component3", "copy-lNWZWLA", "(Ljava/util/List;ZLjava/util/List;)Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "copy", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors-1X0FA-Y", "Z", "getAffectedCriticalPaths"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQL extends com.paypal.oslo.core.network.graphql.error.CallError {
        private final java.util.List<java.lang.String> affectedCriticalPaths;
        private final java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> errors;
        private final boolean isCritical;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private GraphQL(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> list, boolean z, java.util.List<java.lang.String> list2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.errors = list;
            this.isCritical = z;
            this.affectedCriticalPaths = list2;
        }

        /* renamed from: getErrors-1X0FA-Y, reason: not valid java name */
        public final java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY() {
            return this.errors;
        }

        public final boolean isCritical() {
            return this.isCritical;
        }

        public /* synthetic */ GraphQL(java.util.List list, boolean z, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, null);
        }

        public final java.util.List<java.lang.String> getAffectedCriticalPaths() {
            return this.affectedCriticalPaths;
        }

        public final java.lang.String toString() {
            java.lang.String m9607toStringimpl = arrow.core.NonEmptyList.m9607toStringimpl(this.errors);
            boolean z = this.isCritical;
            java.util.List<java.lang.String> list = this.affectedCriticalPaths;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQL(errors=");
            sb.append(m9607toStringimpl);
            sb.append(", isCritical=");
            sb.append(z);
            sb.append(", affectedCriticalPaths=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((arrow.core.NonEmptyList.m9586hashCodeimpl(this.errors) * 31) + java.lang.Boolean.hashCode(this.isCritical)) * 31) + this.affectedCriticalPaths.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                return false;
            }
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) other;
            return arrow.core.NonEmptyList.m9576equalsimpl0(this.errors, graphQL.errors) && this.isCritical == graphQL.isCritical && kotlin.jvm.internal.Intrinsics.areEqual(this.affectedCriticalPaths, graphQL.affectedCriticalPaths);
        }

        /* renamed from: copy-lNWZWLA, reason: not valid java name */
        public final com.paypal.oslo.core.network.graphql.error.CallError.GraphQL m11658copylNWZWLA(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> errors, boolean isCritical, java.util.List<java.lang.String> affectedCriticalPaths) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affectedCriticalPaths, "");
            return new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(errors, isCritical, affectedCriticalPaths, null);
        }

        public final java.util.List<java.lang.String> component3() {
            return this.affectedCriticalPaths;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCritical() {
            return this.isCritical;
        }

        /* renamed from: component1-1X0FA-Y, reason: not valid java name */
        public final java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11657component11X0FAY() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-lNWZWLA$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.core.network.graphql.error.CallError.GraphQL m11656copylNWZWLA$default(com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL, java.util.List list, boolean z, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = graphQL.errors;
            }
            if ((i & 2) != 0) {
                z = graphQL.isCritical;
            }
            if ((i & 4) != 0) {
                list2 = graphQL.affectedCriticalPaths;
            }
            return graphQL.m11658copylNWZWLA(list, z, list2);
        }

        public /* synthetic */ GraphQL(java.util.List list, boolean z, java.util.List list2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, list2);
        }
    }

    public /* synthetic */ CallError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
