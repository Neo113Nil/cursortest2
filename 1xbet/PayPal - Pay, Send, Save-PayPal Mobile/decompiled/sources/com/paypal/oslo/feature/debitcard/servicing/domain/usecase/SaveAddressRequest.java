package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressRequest;", "", "", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "address", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SaveAddressRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress address;
    private final java.lang.String debitInstrumentId;

    public SaveAddressRequest(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardAddress, "");
        this.debitInstrumentId = str;
        this.address = debitCardAddress;
    }

    public final java.lang.String getDebitInstrumentId() {
        return this.debitInstrumentId;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.debitInstrumentId;
        com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveAddressRequest(debitInstrumentId=");
        sb.append(str);
        sb.append(", address=");
        sb.append(debitCardAddress);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.debitInstrumentId.hashCode() * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest saveAddressRequest = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, saveAddressRequest.debitInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, saveAddressRequest.address);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest copy(java.lang.String debitInstrumentId, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest(debitInstrumentId, address);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress getAddress() {
        return this.address;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDebitInstrumentId() {
        return this.debitInstrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest saveAddressRequest, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = saveAddressRequest.debitInstrumentId;
        }
        if ((i & 2) != 0) {
            debitCardAddress = saveAddressRequest.address;
        }
        return saveAddressRequest.copy(str, debitCardAddress);
    }
}
