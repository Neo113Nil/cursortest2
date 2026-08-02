package com.paypal.oslo.feature.onboarding.errorstruct.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "", "<init>", "()V", "DataNotFound", "InvalidData", "Network", "RequestError", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$DataNotFound;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$InvalidData;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$RequestError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ApiCallError {
    public static final int $stable = 0;

    private ApiCallError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$DataNotFound;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "", "errorDetails", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$DataNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataNotFound extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError {
        public static final int $stable = 0;
        private final java.lang.String errorDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataNotFound(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorDetails = str;
        }

        public final java.lang.String getErrorDetails() {
            return this.errorDetails;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataNotFound(errorDetails=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetails, ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound) other).errorDetails);
        }

        public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound copy(java.lang.String errorDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetails, "");
            return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound(errorDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorDetails() {
            return this.errorDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound dataNotFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dataNotFound.errorDetails;
            }
            return dataNotFound.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$InvalidData;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "", "errorDetails", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$InvalidData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidData extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError {
        public static final int $stable = 0;
        private final java.lang.String errorDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidData(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorDetails = str;
        }

        public final java.lang.String getErrorDetails() {
            return this.errorDetails;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidData(errorDetails=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetails, ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData) other).errorDetails);
        }

        public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData copy(java.lang.String errorDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetails, "");
            return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData(errorDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorDetails() {
            return this.errorDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData invalidData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidData.errorDetails;
            }
            return invalidData.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "<init>", "()V", "", "getErrorDetails", "()Ljava/lang/String;", "errorDetails", "NoInternet", "Timeout", "HttpError", "Unknown", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$HttpError;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$NoInternet;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$Timeout;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Network extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError {
        public static final int $stable = 0;

        public abstract java.lang.String getErrorDetails();

        private Network() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$NoInternet;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network;", "", "errorDetails", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$NoInternet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoInternet extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network {
            public static final int $stable = 0;
            private final java.lang.String errorDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoInternet(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorDetails = str;
            }

            @Override // com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorDetails;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInternet(errorDetails=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetails.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetails, ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) other).errorDetails);
            }

            public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet copy(java.lang.String errorDetails) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetails, "");
                return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet(errorDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet noInternet, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = noInternet.errorDetails;
                }
                return noInternet.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$Timeout;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network;", "", "errorDetails", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Timeout extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network {
            public static final int $stable = 0;
            private final java.lang.String errorDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Timeout(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorDetails = str;
            }

            @Override // com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorDetails;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout(errorDetails=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetails.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetails, ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout) other).errorDetails);
            }

            public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout copy(java.lang.String errorDetails) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetails, "");
                return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout(errorDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout timeout, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = timeout.errorDetails;
                }
                return timeout.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$HttpError;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network;", "", "statusCode", "", "errorDetails", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "Ljava/lang/String;", "getErrorDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network {
            public static final int $stable = 0;
            private final java.lang.String errorDetails;
            private final int statusCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HttpError(int i, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.statusCode = i;
                this.errorDetails = str;
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            public final java.lang.String toString() {
                int i = this.statusCode;
                java.lang.String str = this.errorDetails;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(statusCode=");
                sb.append(i);
                sb.append(", errorDetails=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Integer.hashCode(this.statusCode) * 31) + this.errorDetails.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError httpError = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError) other;
                return this.statusCode == httpError.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetails, httpError.errorDetails);
            }

            public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError copy(int statusCode, java.lang.String errorDetails) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetails, "");
                return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError(statusCode, errorDetails);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            /* renamed from: component1, reason: from getter */
            public final int getStatusCode() {
                return this.statusCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError httpError, int i, java.lang.String str, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = httpError.statusCode;
                }
                if ((i2 & 2) != 0) {
                    str = httpError.errorDetails;
                }
                return httpError.copy(i, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$Unknown;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network;", "", "errorDetails", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$Network$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unknown extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network {
            public static final int $stable = 0;
            private final java.lang.String errorDetails;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorDetails = str;
            }

            @Override // com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorDetails;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(errorDetails=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetails.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetails, ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown) other).errorDetails);
            }

            public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown copy(java.lang.String errorDetails) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetails, "");
                return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown(errorDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorDetails() {
                return this.errorDetails;
            }

            public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknown.errorDetails;
                }
                return unknown.copy(str);
            }
        }

        public /* synthetic */ Network(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$RequestError;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/Issue;", "issues", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError$RequestError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getIssues"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestError extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue> issues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestError(java.util.List<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.issues = list;
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue> getIssues() {
            return this.issues;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue> list = this.issues;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestError(issues=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.issues.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) && kotlin.jvm.internal.Intrinsics.areEqual(this.issues, ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) other).issues);
        }

        public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError copy(java.util.List<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue> issues) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issues, "");
            return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError(issues);
        }

        public final java.util.List<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue> component1() {
            return this.issues;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError requestError, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = requestError.issues;
            }
            return requestError.copy(list);
        }
    }

    public /* synthetic */ ApiCallError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
