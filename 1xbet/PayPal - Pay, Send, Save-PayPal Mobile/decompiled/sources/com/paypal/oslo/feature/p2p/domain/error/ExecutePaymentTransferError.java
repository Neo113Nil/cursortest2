package com.paypal.oslo.feature.p2p.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;", "", "<init>", "()V", "Network", "Business", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ExecutePaymentTransferError {
    public static final int $stable = 0;

    private ExecutePaymentTransferError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Network;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Network extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Network INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Network();

        public final int hashCode() {
            return -1992162643;
        }

        private Network() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Network";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;", "<init>", "()V", "NoData", "InsufficientFunds", "AmountExceedsLimit", "InvalidRecipient", "AccountRestricted", "SecurityBlock", "ServerError", "UnexpectedResponseType", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$AccountRestricted;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$AmountExceedsLimit;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$InsufficientFunds;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$InvalidRecipient;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$NoData;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$SecurityBlock;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$ServerError;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$UnexpectedResponseType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class Business extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError {
        public static final int $stable = 0;

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$NoData;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoData extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData();

            public final int hashCode() {
                return -870777704;
            }

            private NoData() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NoData";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$InsufficientFunds;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InsufficientFunds extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InsufficientFunds INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InsufficientFunds();

            public final int hashCode() {
                return 1262473822;
            }

            private InsufficientFunds() {
                super(null);
            }

            public final java.lang.String toString() {
                return "InsufficientFunds";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InsufficientFunds)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$AmountExceedsLimit;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AmountExceedsLimit extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AmountExceedsLimit INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AmountExceedsLimit();

            public final int hashCode() {
                return -124166079;
            }

            private AmountExceedsLimit() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AmountExceedsLimit";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AmountExceedsLimit)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$InvalidRecipient;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidRecipient extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InvalidRecipient INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InvalidRecipient();

            public final int hashCode() {
                return -267326161;
            }

            private InvalidRecipient() {
                super(null);
            }

            public final java.lang.String toString() {
                return "InvalidRecipient";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InvalidRecipient)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$AccountRestricted;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AccountRestricted extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AccountRestricted INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AccountRestricted();

            public final int hashCode() {
                return 688929979;
            }

            private AccountRestricted() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AccountRestricted";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AccountRestricted)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$SecurityBlock;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SecurityBlock extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.SecurityBlock INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.SecurityBlock();

            public final int hashCode() {
                return -1728714496;
            }

            private SecurityBlock() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SecurityBlock";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.SecurityBlock)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$ServerError;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ServerError extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
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
                return (other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError) other).message);
            }

            public final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError copy$default(com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError serverError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = serverError.message;
                }
                return serverError.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business$UnexpectedResponseType;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnexpectedResponseType extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.UnexpectedResponseType INSTANCE = new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.UnexpectedResponseType();

            public final int hashCode() {
                return 2033170329;
            }

            private UnexpectedResponseType() {
                super(null);
            }

            public final java.lang.String toString() {
                return "UnexpectedResponseType";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.UnexpectedResponseType)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExecutePaymentTransferError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
