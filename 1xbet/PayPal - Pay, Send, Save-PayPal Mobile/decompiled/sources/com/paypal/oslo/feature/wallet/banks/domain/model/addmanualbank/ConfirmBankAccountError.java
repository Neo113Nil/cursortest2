package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "", "<init>", "()V", "", "getMessage", "()Ljava/lang/String;", "message", "Network", "Business", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ConfirmBankAccountError {
    public static final int $stable = 0;

    public abstract java.lang.String getMessage();

    private ConfirmBankAccountError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Network;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Network;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Network(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ Network(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Network) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Network) other).message);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Network copy(java.lang.String message) {
            return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Network(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Network copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Network network, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = network.message;
            }
            return network.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Network() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "<init>", "()V", "MissingBankAccount", "ConfirmationFailed", "PartialDataAvailable", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$ConfirmationFailed;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$MissingBankAccount;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$PartialDataAvailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError {
        public static final int $stable = 0;

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$MissingBankAccount;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$MissingBankAccount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingBankAccount extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business {
            public static final int $stable = 0;
            private final java.lang.String message;

            public MissingBankAccount(java.lang.String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ MissingBankAccount(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError
            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingBankAccount(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.MissingBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.MissingBankAccount) other).message);
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.MissingBankAccount copy(java.lang.String message) {
                return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.MissingBankAccount(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.MissingBankAccount copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.MissingBankAccount missingBankAccount, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = missingBankAccount.message;
                }
                return missingBankAccount.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public MissingBankAccount() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$ConfirmationFailed;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$ConfirmationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmationFailed extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business {
            public static final int $stable = 0;
            private final java.lang.String message;

            public ConfirmationFailed(java.lang.String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ ConfirmationFailed(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError
            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationFailed(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.ConfirmationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.ConfirmationFailed) other).message);
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.ConfirmationFailed copy(java.lang.String message) {
                return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.ConfirmationFailed(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.ConfirmationFailed copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.ConfirmationFailed confirmationFailed, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = confirmationFailed.message;
                }
                return confirmationFailed.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ConfirmationFailed() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$PartialDataAvailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business;", "", "", "errorMessages", "message", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError$Business$PartialDataAvailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getErrorMessages", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PartialDataAvailable extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business {
            public static final int $stable = 8;
            private final java.util.List<java.lang.String> errorMessages;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PartialDataAvailable(java.util.List<java.lang.String> list, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.errorMessages = list;
                this.message = str;
            }

            public final java.util.List<java.lang.String> getErrorMessages() {
                return this.errorMessages;
            }

            public /* synthetic */ PartialDataAvailable(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list) : str);
            }

            @Override // com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError
            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.errorMessages;
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialDataAvailable(errorMessages=");
                sb.append(list);
                sb.append(", message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorMessages.hashCode();
                java.lang.String str = this.message;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable partialDataAvailable = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessages, partialDataAvailable.errorMessages) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, partialDataAvailable.message);
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable copy(java.util.List<java.lang.String> errorMessages, java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessages, "");
                return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable(errorMessages, message);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.util.List<java.lang.String> component1() {
                return this.errorMessages;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError.Business.PartialDataAvailable partialDataAvailable, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = partialDataAvailable.errorMessages;
                }
                if ((i & 2) != 0) {
                    str = partialDataAvailable.message;
                }
                return partialDataAvailable.copy(list, str);
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConfirmBankAccountError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
