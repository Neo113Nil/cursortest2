package com.paypal.oslo.feature.bankingbundle.domain.error;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "getErrorDetail", "()Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "errorDetail", "", "isRetryable", "Z", "()Z", "Network", "NullResponse", "UserProfileLoadFailed", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError$Network;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError$NullResponse;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError$UserProfileLoadFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BankingBundleError {
    public static final int $stable = 0;
    private final boolean isRetryable;

    public abstract com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail getErrorDetail();

    private BankingBundleError() {
    }

    /* renamed from: isRetryable, reason: from getter */
    public boolean getIsRetryable() {
        return this.isRetryable;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError$Network;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "errorDetail", "", "isRetryable", "<init>", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;Z)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/error/CallError;", "component2", "()Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;Z)Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError$Network;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getCallError", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "getErrorDetail", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.network.graphql.error.CallError callError;
        private final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail;
        private final boolean isRetryable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Network(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
            this.callError = callError;
            this.errorDetail = errorDetail;
            this.isRetryable = z;
        }

        public /* synthetic */ Network(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(callError, (i & 2) != 0 ? null : errorDetail, (i & 4) != 0 ? false : z);
        }

        public final com.paypal.oslo.core.network.graphql.error.CallError getCallError() {
            return this.callError;
        }

        @Override // com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError
        public final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail getErrorDetail() {
            return this.errorDetail;
        }

        @Override // com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError
        /* renamed from: isRetryable */
        public final boolean getIsRetryable() {
            return this.isRetryable;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.graphql.error.CallError callError = this.callError;
            com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail = this.errorDetail;
            boolean z = this.isRetryable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(callError=");
            sb.append(callError);
            sb.append(", errorDetail=");
            sb.append(errorDetail);
            sb.append(", isRetryable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.callError.hashCode();
            com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail = this.errorDetail;
            return (((hashCode * 31) + (errorDetail == null ? 0 : errorDetail.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isRetryable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network)) {
                return false;
            }
            com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network network = (com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.callError, network.callError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, network.errorDetail) && this.isRetryable == network.isRetryable;
        }

        public final com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network copy(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, boolean isRetryable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
            return new com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network(callError, errorDetail, isRetryable);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRetryable() {
            return this.isRetryable;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail getErrorDetail() {
            return this.errorDetail;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.graphql.error.CallError getCallError() {
            return this.callError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network copy$default(com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.Network network, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                callError = network.callError;
            }
            if ((i & 2) != 0) {
                errorDetail = network.errorDetail;
            }
            if ((i & 4) != 0) {
                z = network.isRetryable;
            }
            return network.copy(callError, errorDetail, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError$NullResponse;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "errorDetail", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "getErrorDetail", "()Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "isRetryable", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NullResponse extends com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.NullResponse INSTANCE = new com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.NullResponse();
        private static final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail = null;
        private static final boolean isRetryable = false;

        public final int hashCode() {
            return -654673699;
        }

        private NullResponse() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError
        public final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail getErrorDetail() {
            return errorDetail;
        }

        @Override // com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError
        /* renamed from: isRetryable */
        public final boolean getIsRetryable() {
            return isRetryable;
        }

        public final java.lang.String toString() {
            return "NullResponse";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.NullResponse)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError$UserProfileLoadFailed;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/BankingBundleError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "errorDetail", "Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "getErrorDetail", "()Lcom/paypal/oslo/feature/bankingbundle/domain/error/ErrorDetail;", "isRetryable", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserProfileLoadFailed extends com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.UserProfileLoadFailed INSTANCE = new com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.UserProfileLoadFailed();
        private static final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail = null;
        private static final boolean isRetryable = false;

        public final int hashCode() {
            return 891509868;
        }

        private UserProfileLoadFailed() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError
        public final com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail getErrorDetail() {
            return errorDetail;
        }

        @Override // com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError
        /* renamed from: isRetryable */
        public final boolean getIsRetryable() {
            return isRetryable;
        }

        public final java.lang.String toString() {
            return "UserProfileLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.domain.error.BankingBundleError.UserProfileLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BankingBundleError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
