package com.paypal.oslo.feature.userprofile.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent;", "", "AddressSavedSuccessfully", "RiskDeclined", "Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent$AddressSavedSuccessfully;", "Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent$RiskDeclined;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AddEditAddressEvent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent$AddressSavedSuccessfully;", "Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "address", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfileAddress;)Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent$AddressSavedSuccessfully;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressSavedSuccessfully implements com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.userstore.model.ProfileAddress address;

        public AddressSavedSuccessfully(com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileAddress, "");
            this.address = profileAddress;
        }

        public final com.paypal.oslo.core.userstore.model.ProfileAddress getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSavedSuccessfully(address=");
            sb.append(profileAddress);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully) other).address);
        }

        public final com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully copy(com.paypal.oslo.core.userstore.model.ProfileAddress address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully(address);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.ProfileAddress getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully copy$default(com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully addressSavedSuccessfully, com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profileAddress = addressSavedSuccessfully.address;
            }
            return addressSavedSuccessfully.copy(profileAddress);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent$RiskDeclined;", "Lcom/paypal/oslo/feature/userprofile/ui/AddEditAddressEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RiskDeclined implements com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.RiskDeclined INSTANCE = new com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.RiskDeclined();

        public final int hashCode() {
            return 360662419;
        }

        private RiskDeclined() {
        }

        public final java.lang.String toString() {
            return "RiskDeclined";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.RiskDeclined)) {
                return false;
            }
            return true;
        }
    }
}
