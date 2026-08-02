package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError;", "", "<init>", "()V", "Network", "Business", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BalanceDepositSelectionError {
    public static final int $stable = 0;

    private BalanceDepositSelectionError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Network;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError;", "<init>", "()V", "NetworkFailure", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Network$NetworkFailure;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Network extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError {
        public static final int $stable = 0;

        private Network() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Network$NetworkFailure;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Network;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NetworkFailure extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Network {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Network.NetworkFailure INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Network.NetworkFailure();

            public final int hashCode() {
                return -1642535570;
            }

            private NetworkFailure() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NetworkFailure";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Network.NetworkFailure)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Network(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError;", "<init>", "()V", "Error", "MissingData", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business$MissingData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError {
        public static final int $stable = 0;

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "errorCode", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getErrors", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business {
            public static final int $stable = 8;
            private final java.lang.String errorCode;
            private final java.util.List<java.lang.String> errors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(java.util.List<java.lang.String> list, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.errors = list;
                this.errorCode = str;
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.util.List<java.lang.String> getErrors() {
                return this.errors;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.errors;
                java.lang.String str = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errors=");
                sb.append(list);
                sb.append(", errorCode=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errors.hashCode();
                java.lang.String str = this.errorCode;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error error = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errors, error.errors) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode);
            }

            public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error copy(java.util.List<java.lang.String> errors, java.lang.String errorCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
                return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error(errors, errorCode);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.util.List<java.lang.String> component1() {
                return this.errors;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error error, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = error.errors;
                }
                if ((i & 2) != 0) {
                    str = error.errorCode;
                }
                return error.copy(list, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business$MissingData;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingData extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.MissingData INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.MissingData();

            public final int hashCode() {
                return 158866292;
            }

            private MissingData() {
                super(null);
            }

            public final java.lang.String toString() {
                return "MissingData";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.MissingData)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BalanceDepositSelectionError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
