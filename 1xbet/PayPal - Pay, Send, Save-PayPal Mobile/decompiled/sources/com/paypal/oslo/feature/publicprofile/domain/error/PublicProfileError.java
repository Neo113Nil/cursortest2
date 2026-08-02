package com.paypal.oslo.feature.publicprofile.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "", "<init>", "()V", "GraphQLError", "NetworkError", "UnknownError", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError$GraphQLError;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError$NetworkError;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PublicProfileError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError$GraphQLError;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "", "code", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError$GraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError {
        public static final int $stable = 0;
        private final java.lang.String code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphQLError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.code = str;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(code=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, ((com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError) other).code);
        }

        public final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError copy(java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError(code);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError copy$default(com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError graphQLError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = graphQLError.code;
            }
            return graphQLError.copy(str);
        }
    }

    private PublicProfileError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError$NetworkError;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.NetworkError INSTANCE = new com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.NetworkError();

        public final int hashCode() {
            return -1166981329;
        }

        private NetworkError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError$UnknownError;", "Lcom/paypal/oslo/feature/publicprofile/domain/error/PublicProfileError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError INSTANCE = new com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError();

        public final int hashCode() {
            return 1828185747;
        }

        private UnknownError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnknownError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.UnknownError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PublicProfileError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
