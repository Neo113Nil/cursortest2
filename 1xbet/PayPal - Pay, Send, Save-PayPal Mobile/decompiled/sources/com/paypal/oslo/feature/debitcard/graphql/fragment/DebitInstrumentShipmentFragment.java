package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentShipmentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentShipmentStatus;", "status", "", "shipmentDate", "estimatedArrivalDate", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentShipmentStatus;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentShipmentStatus;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentShipmentStatus;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentShipmentFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentShipmentStatus;", "getStatus", "Ljava/lang/Object;", "getShipmentDate", "getEstimatedArrivalDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentShipmentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.Object estimatedArrivalDate;
    private final java.lang.Object shipmentDate;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus status;

    public DebitInstrumentShipmentFragment(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus, java.lang.Object obj, java.lang.Object obj2) {
        this.status = debitInstrumentShipmentStatus;
        this.shipmentDate = obj;
        this.estimatedArrivalDate = obj2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus getStatus() {
        return this.status;
    }

    public final java.lang.Object getShipmentDate() {
        return this.shipmentDate;
    }

    public final java.lang.Object getEstimatedArrivalDate() {
        return this.estimatedArrivalDate;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus = this.status;
        java.lang.Object obj = this.shipmentDate;
        java.lang.Object obj2 = this.estimatedArrivalDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentShipmentFragment(status=");
        sb.append(debitInstrumentShipmentStatus);
        sb.append(", shipmentDate=");
        sb.append(obj);
        sb.append(", estimatedArrivalDate=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus = this.status;
        int hashCode = debitInstrumentShipmentStatus == null ? 0 : debitInstrumentShipmentStatus.hashCode();
        java.lang.Object obj = this.shipmentDate;
        int hashCode2 = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.estimatedArrivalDate;
        return (((hashCode * 31) + hashCode2) * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment) other;
        return this.status == debitInstrumentShipmentFragment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.shipmentDate, debitInstrumentShipmentFragment.shipmentDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedArrivalDate, debitInstrumentShipmentFragment.estimatedArrivalDate);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus status, java.lang.Object shipmentDate, java.lang.Object estimatedArrivalDate) {
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment(status, shipmentDate, estimatedArrivalDate);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getEstimatedArrivalDate() {
        return this.estimatedArrivalDate;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getShipmentDate() {
        return this.shipmentDate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentShipmentStatus debitInstrumentShipmentStatus, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            debitInstrumentShipmentStatus = debitInstrumentShipmentFragment.status;
        }
        if ((i & 2) != 0) {
            obj = debitInstrumentShipmentFragment.shipmentDate;
        }
        if ((i & 4) != 0) {
            obj2 = debitInstrumentShipmentFragment.estimatedArrivalDate;
        }
        return debitInstrumentShipmentFragment.copy(debitInstrumentShipmentStatus, obj, obj2);
    }
}
