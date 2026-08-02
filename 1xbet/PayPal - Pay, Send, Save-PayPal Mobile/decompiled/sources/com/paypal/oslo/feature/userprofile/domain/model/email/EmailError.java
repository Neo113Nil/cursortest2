package com.paypal.oslo.feature.userprofile.domain.model.email;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "", "<init>", "()V", "NetworkError", "ValidationError", "ServerError", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$NetworkError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$ServerError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class EmailError {
    public static final int $stable = 0;

    private EmailError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$NetworkError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(message=");
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
            return (other instanceof com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError) other).message);
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError copy$default(com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.NetworkError networkError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.message;
            }
            return networkError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$ValidationError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "graphQLError", "<init>", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "copy", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;)Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "getGraphQLError", "getMessage", "message"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationError(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
            this.graphQLError = graphQLError;
        }

        public final com.paypal.oslo.core.network.graphql.error.GraphQLError getGraphQLError() {
            return this.graphQLError;
        }

        public final java.lang.String getMessage() {
            return this.graphQLError.getMessage();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = this.graphQLError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(graphQLError=");
            sb.append(graphQLError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.graphQLError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.graphQLError, ((com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError) other).graphQLError);
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError copy(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
            return new com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError(graphQLError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.graphql.error.GraphQLError getGraphQLError() {
            return this.graphQLError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError copy$default(com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ValidationError validationError, com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                graphQLError = validationError.graphQLError;
            }
            return validationError.copy(graphQLError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$ServerError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(message=");
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
            return (other instanceof com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError) other).message);
        }

        public final com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError copy$default(com.paypal.oslo.feature.userprofile.domain.model.email.EmailError.ServerError serverError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = serverError.message;
            }
            return serverError.copy(str);
        }
    }

    public /* synthetic */ EmailError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
