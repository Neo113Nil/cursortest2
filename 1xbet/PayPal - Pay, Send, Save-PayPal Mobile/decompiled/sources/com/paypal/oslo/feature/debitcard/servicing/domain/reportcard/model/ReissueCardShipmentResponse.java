package com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardShipmentResponse;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/DebitInstrumentShipment;", "shipment", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/DebitInstrumentShipment;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/DebitInstrumentShipment;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/DebitInstrumentShipment;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/ReissueCardShipmentResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/model/DebitInstrumentShipment;", "getShipment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReissueCardShipmentResponse {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment shipment;

    public ReissueCardShipmentResponse(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment debitInstrumentShipment) {
        this.shipment = debitInstrumentShipment;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment getShipment() {
        return this.shipment;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment debitInstrumentShipment = this.shipment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReissueCardShipmentResponse(shipment=");
        sb.append(debitInstrumentShipment);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment debitInstrumentShipment = this.shipment;
        if (debitInstrumentShipment == null) {
            return 0;
        }
        return debitInstrumentShipment.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipment, ((com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse) other).shipment);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse copy(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment shipment) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse(shipment);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment getShipment() {
        return this.shipment;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.ReissueCardShipmentResponse reissueCardShipmentResponse, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.model.DebitInstrumentShipment debitInstrumentShipment, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentShipment = reissueCardShipmentResponse.shipment;
        }
        return reissueCardShipmentResponse.copy(debitInstrumentShipment);
    }
}
