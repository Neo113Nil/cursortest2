package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageInput;", "", "", "carrierId", "trackingNumber", "Lcom/apollographql/apollo/api/Optional;", "transactionNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCarrierId", "getTrackingNumber", "Lcom/apollographql/apollo/api/Optional;", "getTransactionNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShipmentPackageInput {
    private final java.lang.String carrierId;
    private final java.lang.String trackingNumber;
    private final com.apollographql.apollo.api.Optional<java.lang.String> transactionNumber;

    public ShipmentPackageInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.carrierId = str;
        this.trackingNumber = str2;
        this.transactionNumber = optional;
    }

    public final java.lang.String getCarrierId() {
        return this.carrierId;
    }

    public final java.lang.String getTrackingNumber() {
        return this.trackingNumber;
    }

    public /* synthetic */ ShipmentPackageInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getTransactionNumber() {
        return this.transactionNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.carrierId;
        java.lang.String str2 = this.trackingNumber;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.transactionNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShipmentPackageInput(carrierId=");
        sb.append(str);
        sb.append(", trackingNumber=");
        sb.append(str2);
        sb.append(", transactionNumber=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.carrierId.hashCode() * 31) + this.trackingNumber.hashCode()) * 31) + this.transactionNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput shipmentPackageInput = (com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.carrierId, shipmentPackageInput.carrierId) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingNumber, shipmentPackageInput.trackingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionNumber, shipmentPackageInput.transactionNumber);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput copy(java.lang.String carrierId, java.lang.String trackingNumber, com.apollographql.apollo.api.Optional<java.lang.String> transactionNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrierId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionNumber, "");
        return new com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput(carrierId, trackingNumber, transactionNumber);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.transactionNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTrackingNumber() {
        return this.trackingNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCarrierId() {
        return this.carrierId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput copy$default(com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput shipmentPackageInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = shipmentPackageInput.carrierId;
        }
        if ((i & 2) != 0) {
            str2 = shipmentPackageInput.trackingNumber;
        }
        if ((i & 4) != 0) {
            optional = shipmentPackageInput.transactionNumber;
        }
        return shipmentPackageInput.copy(str, str2, optional);
    }
}
