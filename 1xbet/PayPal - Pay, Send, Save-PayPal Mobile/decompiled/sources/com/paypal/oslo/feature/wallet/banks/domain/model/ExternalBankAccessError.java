package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;", "", "<init>", "()V", "Network", "Business", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ExternalBankAccessError {
    public static final int $stable = 0;

    private ExternalBankAccessError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Network;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Network INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Network();

        public final int hashCode() {
            return -1225294263;
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;", "<init>", "()V", "MissingConnectUrl", "PartialDataAvailable", "NoBankAccountsAvailable", "LinkingFailed", "ContentUnavailable", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$ContentUnavailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$LinkingFailed;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$MissingConnectUrl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$NoBankAccountsAvailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$PartialDataAvailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError {
        public static final int $stable = 0;

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$MissingConnectUrl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingConnectUrl extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.MissingConnectUrl INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.MissingConnectUrl();

            public final int hashCode() {
                return -306269342;
            }

            private MissingConnectUrl() {
                super(null);
            }

            public final java.lang.String toString() {
                return "MissingConnectUrl";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.MissingConnectUrl)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJB\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR2\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$PartialDataAvailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business;", "", "", "errorMessages", "", "", "errorExtensions", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$PartialDataAvailable;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrorMessages", "getErrorExtensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PartialDataAvailable extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business {
            public static final int $stable = 8;
            private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> errorExtensions;
            private final java.util.List<java.lang.String> errorMessages;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public PartialDataAvailable(java.util.List<java.lang.String> list, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> list2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.errorMessages = list;
                this.errorExtensions = list2;
            }

            public /* synthetic */ PartialDataAvailable(java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : list2);
            }

            public final java.util.List<java.lang.String> getErrorMessages() {
                return this.errorMessages;
            }

            public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getErrorExtensions() {
                return this.errorExtensions;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.errorMessages;
                java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list2 = this.errorExtensions;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialDataAvailable(errorMessages=");
                sb.append(list);
                sb.append(", errorExtensions=");
                sb.append(list2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorMessages.hashCode();
                java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list = this.errorExtensions;
                return (hashCode * 31) + (list == null ? 0 : list.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable partialDataAvailable = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessages, partialDataAvailable.errorMessages) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorExtensions, partialDataAvailable.errorExtensions);
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable copy(java.util.List<java.lang.String> errorMessages, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> errorExtensions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessages, "");
                return new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable(errorMessages, errorExtensions);
            }

            public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> component2() {
                return this.errorExtensions;
            }

            public final java.util.List<java.lang.String> component1() {
                return this.errorMessages;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable partialDataAvailable, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = partialDataAvailable.errorMessages;
                }
                if ((i & 2) != 0) {
                    list2 = partialDataAvailable.errorExtensions;
                }
                return partialDataAvailable.copy(list, list2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$NoBankAccountsAvailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoBankAccountsAvailable extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.NoBankAccountsAvailable INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.NoBankAccountsAvailable();

            public final int hashCode() {
                return -201252003;
            }

            private NoBankAccountsAvailable() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NoBankAccountsAvailable";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.NoBankAccountsAvailable)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$LinkingFailed;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LinkingFailed extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.LinkingFailed INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.LinkingFailed();

            public final int hashCode() {
                return 1967008956;
            }

            private LinkingFailed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "LinkingFailed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.LinkingFailed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$ContentUnavailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError$Business$ContentUnavailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ContentUnavailable extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business {
            public static final int $stable = 0;
            private final java.lang.String description;

            public ContentUnavailable(java.lang.String str) {
                super(null);
                this.description = str;
            }

            public final java.lang.String getDescription() {
                return this.description;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.description;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentUnavailable(description=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.description;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable) other).description);
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable copy(java.lang.String description) {
                return new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable(description);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getDescription() {
                return this.description;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.ContentUnavailable contentUnavailable, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = contentUnavailable.description;
                }
                return contentUnavailable.copy(str);
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ExternalBankAccessError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
