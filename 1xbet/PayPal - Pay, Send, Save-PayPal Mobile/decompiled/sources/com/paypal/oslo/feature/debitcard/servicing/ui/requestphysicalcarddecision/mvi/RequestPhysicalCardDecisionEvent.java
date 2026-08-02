package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "FetchDebitInstrument", "FetchSuccess", "FetchFailed", "Retry", "FlowCancelled", "AgreementLinkClicked", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$AgreementLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchDebitInstrument;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FlowCancelled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$Retry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class RequestPhysicalCardDecisionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RequestPhysicalCardDecisionEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchDebitInstrument;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "instrumentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchDebitInstrument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getProductName", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchDebitInstrument extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent {
        public static final int $stable = 0;
        private final java.lang.String instrumentId;
        private final java.lang.String productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchDebitInstrument(java.lang.String str, java.lang.String str2) {
            super("FetchDebitInstrument", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.productName = str;
            this.instrumentId = str2;
        }

        public final java.lang.String getProductName() {
            return this.productName;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.productName;
            java.lang.String str2 = this.instrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchDebitInstrument(productName=");
            sb.append(str);
            sb.append(", instrumentId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.productName.hashCode() * 31) + this.instrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument fetchDebitInstrument = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.productName, fetchDebitInstrument.productName) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, fetchDebitInstrument.instrumentId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument copy(java.lang.String productName, java.lang.String instrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument(productName, instrumentId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument fetchDebitInstrument, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fetchDebitInstrument.productName;
            }
            if ((i & 2) != 0) {
                str2 = fetchDebitInstrument.instrumentId;
            }
            return fetchDebitInstrument.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "debitInstrumentResponse", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "getDebitInstrumentResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchSuccess(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse) {
            super("FetchSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentForRequestPhysicalCardResponse, "");
            this.debitInstrumentResponse = debitInstrumentForRequestPhysicalCardResponse;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse getDebitInstrumentResponse() {
            return this.debitInstrumentResponse;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse = this.debitInstrumentResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchSuccess(debitInstrumentResponse=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentResponse, ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess) other).debitInstrumentResponse);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess copy(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentResponse, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess(debitInstrumentResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse getDebitInstrumentResponse() {
            return this.debitInstrumentResponse;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess fetchSuccess, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentForRequestPhysicalCardResponse = fetchSuccess.debitInstrumentResponse;
            }
            return fetchSuccess.copy(debitInstrumentForRequestPhysicalCardResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FetchFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
            super("FetchFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed) && this.errorType == ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed) other).errorType;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed(errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed fetchFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = fetchFailed.errorType;
            }
            return fetchFailed.copy(debitErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$Retry;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retry extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.Retry INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.Retry();

        public final int hashCode() {
            return 1033385863;
        }

        private Retry() {
            super("Retry", null);
        }

        public final java.lang.String toString() {
            return "Retry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.Retry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$FlowCancelled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FlowCancelled extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled();

        public final int hashCode() {
            return 1840808354;
        }

        private FlowCancelled() {
            super("FlowCancelled", null);
        }

        public final java.lang.String toString() {
            return "FlowCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$AgreementLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "", "agreementUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent$AgreementLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAgreementUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgreementLinkClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent {
        public static final int $stable = 0;
        private final java.lang.String agreementUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgreementLinkClicked(java.lang.String str) {
            super("AgreementLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.agreementUrl = str;
        }

        public final java.lang.String getAgreementUrl() {
            return this.agreementUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.agreementUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreementLinkClicked(agreementUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementUrl, ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked) other).agreementUrl);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked copy(java.lang.String agreementUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementUrl, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked(agreementUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAgreementUrl() {
            return this.agreementUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked agreementLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = agreementLinkClicked.agreementUrl;
            }
            return agreementLinkClicked.copy(str);
        }
    }

    public /* synthetic */ RequestPhysicalCardDecisionEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
