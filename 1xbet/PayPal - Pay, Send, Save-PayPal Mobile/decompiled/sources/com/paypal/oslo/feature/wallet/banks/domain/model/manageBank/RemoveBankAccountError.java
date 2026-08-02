package com.paypal.oslo.feature.wallet.banks.domain.model.manageBank;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError;", "", "<init>", "()V", "Network", "Business", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class RemoveBankAccountError {
    public static final int $stable = 0;

    private RemoveBankAccountError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Network;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Network INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Network();

        public final int hashCode() {
            return -1607474988;
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError;", "<init>", "()V", "DataAvailable", "NoDataAvailable", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business$DataAvailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business$NoDataAvailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError {
        public static final int $stable = 0;

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business$DataAvailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business$DataAvailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DataAvailable extends com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business {
            public static final int $stable = 8;
            private final java.util.List<java.lang.String> errors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataAvailable(java.util.List<java.lang.String> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.errors = list;
            }

            public final java.util.List<java.lang.String> getErrors() {
                return this.errors;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.errors;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataAvailable(errors=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errors.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.DataAvailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.DataAvailable) other).errors);
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.DataAvailable copy(java.util.List<java.lang.String> errors) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
                return new com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.DataAvailable(errors);
            }

            public final java.util.List<java.lang.String> component1() {
                return this.errors;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.DataAvailable copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.DataAvailable dataAvailable, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = dataAvailable.errors;
                }
                return dataAvailable.copy(list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business$NoDataAvailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoDataAvailable extends com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.NoDataAvailable INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.NoDataAvailable();

            public final int hashCode() {
                return 1721019850;
            }

            private NoDataAvailable() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NoDataAvailable";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.NoDataAvailable)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RemoveBankAccountError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
