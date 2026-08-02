package com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddressSuccessCreditApplication;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "addresses", "billingAddress", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/saveaddress/SaveAddressSuccessCreditApplication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAddresses", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "getBillingAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SaveAddressSuccessCreditApplication {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> addresses;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address billingAddress;

    public SaveAddressSuccessCreditApplication(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address) {
        this.addresses = list;
        this.billingAddress = address;
    }

    public /* synthetic */ SaveAddressSuccessCreditApplication(java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : address);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> getAddresses() {
        return this.addresses;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getBillingAddress() {
        return this.billingAddress;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list = this.addresses;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = this.billingAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveAddressSuccessCreditApplication(addresses=");
        sb.append(list);
        sb.append(", billingAddress=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list = this.addresses;
        int hashCode = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = this.billingAddress;
        return (hashCode * 31) + (address != null ? address.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication saveAddressSuccessCreditApplication = (com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, saveAddressSuccessCreditApplication.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, saveAddressSuccessCreditApplication.billingAddress);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> addresses, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address billingAddress) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication(addresses, billingAddress);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getBillingAddress() {
        return this.billingAddress;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> component1() {
        return this.addresses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddressSuccessCreditApplication saveAddressSuccessCreditApplication, java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = saveAddressSuccessCreditApplication.addresses;
        }
        if ((i & 2) != 0) {
            address = saveAddressSuccessCreditApplication.billingAddress;
        }
        return saveAddressSuccessCreditApplication.copy(list, address);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveAddressSuccessCreditApplication() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
