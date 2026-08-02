package com.paypal.oslo.feature.oneonboarding.domain.error;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b2\u00020\u0001:\u0005\t\n\u000b\f\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\r\u000e\u000f\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "", "<init>", "()V", "", "getIssue", "()Ljava/lang/String;", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "Companion", "GraphQLError", "CollectedItemsError", "NetworkError", "GenericError", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$CollectedItemsError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$GenericError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$GraphQLError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$NetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class FlowStepError {
    public static final int $stable = 0;
    public static final java.lang.String COLLECTED_ITEMS_ERROR = "COLLECTED_ITEMS_ERROR";
    public static final java.lang.String GENERIC_ERROR = "GENERIC_ERROR";
    public static final java.lang.String GRAPHQL_ERROR = "GRAPHQL_ERROR";
    public static final java.lang.String NETWORK_ERROR = "NETWORK_ERROR";

    private FlowStepError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$GraphQLError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$GraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphQLError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError) other).message);
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError copy$default(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError graphQLError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = graphQLError.message;
            }
            return graphQLError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$CollectedItemsError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfo", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$CollectedItemsError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContextualInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CollectedItemsError extends com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> contextualInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectedItemsError(java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contextualInfo = list;
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> getContextualInfo() {
            return this.contextualInfo;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list = this.contextualInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CollectedItemsError(contextualInfo=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contextualInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError) && kotlin.jvm.internal.Intrinsics.areEqual(this.contextualInfo, ((com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError) other).contextualInfo);
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError copy(java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> contextualInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfo, "");
            return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError(contextualInfo);
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> component1() {
            return this.contextualInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError copy$default(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError collectedItemsError, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = collectedItemsError.contextualInfo;
            }
            return collectedItemsError.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$NetworkError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;", "type", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType networkErrorType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkErrorType, "");
            this.type = networkErrorType;
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType networkErrorType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(type=");
            sb.append(networkErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError) other).type);
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError copy(com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError copy$default(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError networkError, com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType networkErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkErrorType = networkError.type;
            }
            return networkError.copy(networkErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$GenericError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/FlowStepError$GenericError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenericError extends com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError) other).message);
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError copy$default(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError genericError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = genericError.message;
            }
            return genericError.copy(str);
        }
    }

    public final java.lang.String getIssue() {
        if (this instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GraphQLError) {
            return "GRAPHQL_ERROR";
        }
        if (this instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.CollectedItemsError) {
            return COLLECTED_ITEMS_ERROR;
        }
        if (this instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.NetworkError) {
            return "NETWORK_ERROR";
        }
        if (this instanceof com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GenericError) {
            return GENERIC_ERROR;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ FlowStepError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
