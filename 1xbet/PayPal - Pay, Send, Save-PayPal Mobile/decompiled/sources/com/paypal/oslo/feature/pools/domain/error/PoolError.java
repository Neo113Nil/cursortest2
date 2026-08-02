package com.paypal.oslo.feature.pools.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "", "<init>", "()V", "Network", "Business", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PoolError {
    public static final int $stable = 0;

    private PoolError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Network;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Network;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.pools.domain.error.PoolError {
        public static final int $stable = 0;
        private final java.lang.String errorCode;

        public Network(java.lang.String str) {
            super(null);
            this.errorCode = str;
        }

        public /* synthetic */ Network(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(errorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorCode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Network) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.paypal.oslo.feature.pools.domain.error.PoolError.Network) other).errorCode);
        }

        public final com.paypal.oslo.feature.pools.domain.error.PoolError.Network copy(java.lang.String errorCode) {
            return new com.paypal.oslo.feature.pools.domain.error.PoolError.Network(errorCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.domain.error.PoolError.Network copy$default(com.paypal.oslo.feature.pools.domain.error.PoolError.Network network, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = network.errorCode;
            }
            return network.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Network() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "<init>", "()V", "DataNotFound", "Unauthorized", "ServerError", "PartialDataAvailable", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$DataNotFound;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$PartialDataAvailable;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$ServerError;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$Unauthorized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.pools.domain.error.PoolError {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$DataNotFound;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$DataNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DataNotFound extends com.paypal.oslo.feature.pools.domain.error.PoolError.Business {
            public static final int $stable = 0;
            private final java.lang.String errorCode;

            public DataNotFound(java.lang.String str) {
                super(null);
                this.errorCode = str;
            }

            public /* synthetic */ DataNotFound(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataNotFound(errorCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound) other).errorCode);
            }

            public final com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound copy(java.lang.String errorCode) {
                return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(errorCode);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound copy$default(com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound dataNotFound, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = dataNotFound.errorCode;
                }
                return dataNotFound.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DataNotFound() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$Unauthorized;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$Unauthorized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unauthorized extends com.paypal.oslo.feature.pools.domain.error.PoolError.Business {
            public static final int $stable = 0;
            private final java.lang.String errorCode;

            public Unauthorized(java.lang.String str) {
                super(null);
                this.errorCode = str;
            }

            public /* synthetic */ Unauthorized(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unauthorized(errorCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized) other).errorCode);
            }

            public final com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized copy(java.lang.String errorCode) {
                return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized(errorCode);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized copy$default(com.paypal.oslo.feature.pools.domain.error.PoolError.Business.Unauthorized unauthorized, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unauthorized.errorCode;
                }
                return unauthorized.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Unauthorized() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$ServerError;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ServerError extends com.paypal.oslo.feature.pools.domain.error.PoolError.Business {
            public static final int $stable = 0;
            private final java.lang.String errorCode;

            public ServerError(java.lang.String str) {
                super(null);
                this.errorCode = str;
            }

            public /* synthetic */ ServerError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(errorCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError) other).errorCode);
            }

            public final com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError copy(java.lang.String errorCode) {
                return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError(errorCode);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError copy$default(com.paypal.oslo.feature.pools.domain.error.PoolError.Business.ServerError serverError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = serverError.errorCode;
                }
                return serverError.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ServerError() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$PartialDataAvailable;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/domain/error/PoolError$Business$PartialDataAvailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PartialDataAvailable extends com.paypal.oslo.feature.pools.domain.error.PoolError.Business {
            public static final int $stable = 0;
            private final java.lang.String errorCode;

            public PartialDataAvailable(java.lang.String str) {
                super(null);
                this.errorCode = str;
            }

            public /* synthetic */ PartialDataAvailable(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialDataAvailable(errorCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable) other).errorCode);
            }

            public final com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable copy(java.lang.String errorCode) {
                return new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable(errorCode);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable copy$default(com.paypal.oslo.feature.pools.domain.error.PoolError.Business.PartialDataAvailable partialDataAvailable, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = partialDataAvailable.errorCode;
                }
                return partialDataAvailable.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public PartialDataAvailable() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PoolError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
