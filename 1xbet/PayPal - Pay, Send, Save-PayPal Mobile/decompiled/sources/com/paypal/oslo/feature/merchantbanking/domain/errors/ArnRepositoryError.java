package com.paypal.oslo.feature.merchantbanking.domain.errors;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "", "<init>", "()V", "Network", "GraphQLError", "RiskDenied", "Ineligible", "EnrollmentRequired", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$EnrollmentRequired;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$GraphQLError;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$Ineligible;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$Network;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$RiskDenied;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ArnRepositoryError {
    public static final int $stable = 0;

    private ArnRepositoryError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$Network;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;", "error", "<init>", "(Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;", "copy", "(Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;)Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$Network;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.network.graphql.error.CallError.Network error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Network(com.paypal.oslo.core.network.graphql.error.CallError.Network network) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
            this.error = network;
        }

        public final com.paypal.oslo.core.network.graphql.error.CallError.Network getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.graphql.error.CallError.Network network = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(error=");
            sb.append(network);
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
            return (other instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network) other).error);
        }

        public final com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network copy(com.paypal.oslo.core.network.graphql.error.CallError.Network error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.graphql.error.CallError.Network getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network copy$default(com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network network, com.paypal.oslo.core.network.graphql.error.CallError.Network network2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                network2 = network.error;
            }
            return network.copy(network2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$GraphQLError;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "error", "<init>", "(Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "copy", "(Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;)Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$GraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.network.graphql.error.CallError.GraphQL error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphQLError(com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQL, "");
            this.error = graphQL;
        }

        public final com.paypal.oslo.core.network.graphql.error.CallError.GraphQL getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(error=");
            sb.append(graphQL);
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
            return (other instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError) other).error);
        }

        public final com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError copy(com.paypal.oslo.core.network.graphql.error.CallError.GraphQL error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.graphql.error.CallError.GraphQL getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError copy$default(com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError graphQLError, com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                graphQL = graphQLError.error;
            }
            return graphQLError.copy(graphQL);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$RiskDenied;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RiskDenied extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.RiskDenied INSTANCE = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.RiskDenied();

        public final int hashCode() {
            return 551430365;
        }

        private RiskDenied() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RiskDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.RiskDenied)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$Ineligible;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ineligible extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Ineligible INSTANCE = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Ineligible();

        public final int hashCode() {
            return 896679823;
        }

        private Ineligible() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Ineligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Ineligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError$EnrollmentRequired;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollmentRequired extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.EnrollmentRequired INSTANCE = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.EnrollmentRequired();

        public final int hashCode() {
            return 1833851222;
        }

        private EnrollmentRequired() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EnrollmentRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.EnrollmentRequired)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ArnRepositoryError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
