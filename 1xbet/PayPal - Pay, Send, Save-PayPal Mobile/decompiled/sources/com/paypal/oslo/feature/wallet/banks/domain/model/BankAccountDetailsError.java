package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError;", "", "Business", "Technical", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BankAccountDetailsError {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError;", "NotFound", "InvalidData", "Unauthorized", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business$InvalidData;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business$NotFound;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business$Unauthorized;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Business extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business$NotFound;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NotFound implements com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.NotFound INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.NotFound();

            public final int hashCode() {
                return 1721803474;
            }

            private NotFound() {
            }

            public final java.lang.String toString() {
                return "NotFound";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.NotFound)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business$InvalidData;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidData implements com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.InvalidData INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.InvalidData();

            public final int hashCode() {
                return 1814325502;
            }

            private InvalidData() {
            }

            public final java.lang.String toString() {
                return "InvalidData";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.InvalidData)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business$Unauthorized;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unauthorized implements com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.Unauthorized INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.Unauthorized();

            public final int hashCode() {
                return 528697815;
            }

            private Unauthorized() {
            }

            public final java.lang.String toString() {
                return "Unauthorized";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.Unauthorized)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError;", "Network", "ServiceUnavailable", "Unknown", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical$Network;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical$ServiceUnavailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Technical extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical$Network;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Network implements com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Network INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Network();

            public final int hashCode() {
                return 551821394;
            }

            private Network() {
            }

            public final java.lang.String toString() {
                return "Network";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Network)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical$ServiceUnavailable;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ServiceUnavailable implements com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.ServiceUnavailable INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.ServiceUnavailable();

            public final int hashCode() {
                return 1455333815;
            }

            private ServiceUnavailable() {
            }

            public final java.lang.String toString() {
                return "ServiceUnavailable";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.ServiceUnavailable)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical$Unknown;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError$Technical$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unknown implements com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical {
            public static final int $stable = 0;
            private final java.lang.String message;

            public Unknown(java.lang.String str) {
                this.message = str;
            }

            public /* synthetic */ Unknown(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
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
                return (other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown) other).message);
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown copy(java.lang.String message) {
                return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknown.message;
                }
                return unknown.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Unknown() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }
}
