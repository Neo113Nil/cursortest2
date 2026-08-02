package com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;", "", "<init>", "()V", "ListAddresses", "SaveAddress", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType$ListAddresses;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType$SaveAddress;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddressSelectionRetryType {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType$ListAddresses;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;", "", "newlyAddedAddressId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType$ListAddresses;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewlyAddedAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ListAddresses extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType {
        public static final int $stable = 0;
        private final java.lang.String newlyAddedAddressId;

        public ListAddresses(java.lang.String str) {
            super(null);
            this.newlyAddedAddressId = str;
        }

        public /* synthetic */ ListAddresses(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newlyAddedAddressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListAddresses(newlyAddedAddressId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.newlyAddedAddressId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedAddressId, ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses) other).newlyAddedAddressId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses copy(java.lang.String newlyAddedAddressId) {
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses(newlyAddedAddressId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses listAddresses, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = listAddresses.newlyAddedAddressId;
            }
            return listAddresses.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ListAddresses() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    private AddressSelectionRetryType() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType$SaveAddress;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "addresses", "", "selectedIndex", "", "debitInstrumentId", "<init>", "(Ljava/util/List;ILjava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;ILjava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionRetryType$SaveAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getAddresses", com.visa.cbp.getEncExpo.warmup, "getSelectedIndex", "Ljava/lang/String;", "getDebitInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveAddress extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses;
        private final java.lang.String debitInstrumentId;
        private final int selectedIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveAddress(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list, int i, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.addresses = list;
            this.selectedIndex = i;
            this.debitInstrumentId = str;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> getAddresses() {
            return this.addresses;
        }

        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list = this.addresses;
            int i = this.selectedIndex;
            java.lang.String str = this.debitInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveAddress(addresses=");
            sb.append(list);
            sb.append(", selectedIndex=");
            sb.append(i);
            sb.append(", debitInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.addresses.hashCode() * 31) + java.lang.Integer.hashCode(this.selectedIndex)) * 31) + this.debitInstrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress saveAddress = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, saveAddress.addresses) && this.selectedIndex == saveAddress.selectedIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, saveAddress.debitInstrumentId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses, int selectedIndex, java.lang.String debitInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress(addresses, selectedIndex, debitInstrumentId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> component1() {
            return this.addresses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress saveAddress, java.util.List list, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = saveAddress.addresses;
            }
            if ((i2 & 2) != 0) {
                i = saveAddress.selectedIndex;
            }
            if ((i2 & 4) != 0) {
                str = saveAddress.debitInstrumentId;
            }
            return saveAddress.copy(list, i, str);
        }
    }

    public /* synthetic */ AddressSelectionRetryType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
