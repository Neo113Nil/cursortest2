package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class RequestPhysicalCardDecisionState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RequestPhysicalCardDecisionState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;", "", "retryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState {
        public static final int $stable = 0;
        private final int retryCount;

        public Loading(int i) {
            super("Loading", null);
            this.retryCount = i;
        }

        public /* synthetic */ Loading(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading) && this.retryCount == ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading) other).retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading copy(int retryCount) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading(retryCount);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading loading, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = loading.retryCount;
            }
            return loading.copy(i);
        }

        public Loading() {
            this(0, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "debitInstrumentResponse", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "getDebitInstrumentResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentForRequestPhysicalCardResponse, "");
            this.debitInstrumentResponse = debitInstrumentForRequestPhysicalCardResponse;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse getDebitInstrumentResponse() {
            return this.debitInstrumentResponse;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse = this.debitInstrumentResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(debitInstrumentResponse=");
            sb.append(debitInstrumentForRequestPhysicalCardResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstrumentResponse.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentResponse, ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success) other).debitInstrumentResponse);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success copy(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentResponse, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success(debitInstrumentResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse getDebitInstrumentResponse() {
            return this.debitInstrumentResponse;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success success, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentForRequestPhysicalCardResponse = success.debitInstrumentResponse;
            }
            return success.copy(debitInstrumentForRequestPhysicalCardResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
            this.retryCount = i;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i2 & 2) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error) other;
            return this.errorType == error.errorType && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error(errorType, retryCount);
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error error, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                debitErrorType = error.errorType;
            }
            if ((i2 & 2) != 0) {
                i = error.retryCount;
            }
            return error.copy(debitErrorType, i);
        }
    }

    public /* synthetic */ RequestPhysicalCardDecisionState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
