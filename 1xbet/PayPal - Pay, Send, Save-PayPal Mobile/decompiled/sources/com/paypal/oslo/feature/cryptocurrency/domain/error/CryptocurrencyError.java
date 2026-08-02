package com.paypal.oslo.feature.cryptocurrency.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "", "<init>", "()V", "Network", "Business", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptocurrencyError {
    public static final int $stable = 0;

    private CryptocurrencyError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Network;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Network INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Network();

        public final int hashCode() {
            return -1016636143;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "<init>", "()V", "DataNotFound", "DataUnavailable", "ApiNotImplemented", "InvalidInput", "CodeInvalidated", "InternalDecline", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$ApiNotImplemented;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$CodeInvalidated;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$DataNotFound;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$DataUnavailable;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$InternalDecline;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$InvalidInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$DataNotFound;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DataNotFound extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound();

            public final int hashCode() {
                return 1460855658;
            }

            private DataNotFound() {
                super(null);
            }

            public final java.lang.String toString() {
                return "DataNotFound";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound)) {
                    return false;
                }
                return true;
            }
        }

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$DataUnavailable;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "", "", "errorMessages", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$DataUnavailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrorMessages"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DataUnavailable extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business {
            public static final int $stable = 8;
            private final java.util.List<java.lang.String> errorMessages;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataUnavailable(java.util.List<java.lang.String> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.errorMessages = list;
            }

            public final java.util.List<java.lang.String> getErrorMessages() {
                return this.errorMessages;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.errorMessages;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataUnavailable(errorMessages=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorMessages.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessages, ((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable) other).errorMessages);
            }

            public final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable copy(java.util.List<java.lang.String> errorMessages) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessages, "");
                return new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable(errorMessages);
            }

            public final java.util.List<java.lang.String> component1() {
                return this.errorMessages;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable copy$default(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataUnavailable dataUnavailable, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = dataUnavailable.errorMessages;
                }
                return dataUnavailable.copy(list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$ApiNotImplemented;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ApiNotImplemented extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.ApiNotImplemented INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.ApiNotImplemented();

            public final int hashCode() {
                return 995245656;
            }

            private ApiNotImplemented() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ApiNotImplemented";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.ApiNotImplemented)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$InvalidInput;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$InvalidInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidInput extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidInput(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidInput(message=");
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
                return (other instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput) other).message);
            }

            public final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput copy$default(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InvalidInput invalidInput, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = invalidInput.message;
                }
                return invalidInput.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$CodeInvalidated;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CodeInvalidated extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.CodeInvalidated INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.CodeInvalidated();

            public final int hashCode() {
                return -1564967029;
            }

            private CodeInvalidated() {
                super(null);
            }

            public final java.lang.String toString() {
                return "CodeInvalidated";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.CodeInvalidated)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business$InternalDecline;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InternalDecline extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InternalDecline INSTANCE = new com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InternalDecline();

            public final int hashCode() {
                return -1626723672;
            }

            private InternalDecline() {
                super(null);
            }

            public final java.lang.String toString() {
                return "InternalDecline";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InternalDecline)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CryptocurrencyError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
