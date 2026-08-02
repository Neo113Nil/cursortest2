package com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadAddresses", "AddressSelected", "AddressesLoaded", "LoadingFailed", "AddNewAddressClicked", "SaveAddress", "SaveSuccessful", "SaveFailed", "DismissAddressSelection", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddNewAddressClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddressSelected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddressesLoaded;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$DismissAddressSelection;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$LoadAddresses;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$LoadingFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$SaveAddress;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$SaveFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$SaveSuccessful;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AddressSelectionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AddressSelectionEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$LoadAddresses;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "newlyAddedAddressId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$LoadAddresses;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "getNewlyAddedAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadAddresses extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        private final java.lang.String debitInstrumentId;
        private final java.lang.String newlyAddedAddressId;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadAddresses(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2) {
            super("LoadAddresses", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.debitInstrumentId = str;
            this.productName = debitCardProductName;
            this.newlyAddedAddressId = str2;
        }

        public /* synthetic */ LoadAddresses(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, debitCardProductName, (i & 4) != 0 ? null : str2);
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.debitInstrumentId;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str2 = this.newlyAddedAddressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadAddresses(debitInstrumentId=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitCardProductName);
            sb.append(", newlyAddedAddressId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debitInstrumentId.hashCode();
            int hashCode2 = this.productName.hashCode();
            java.lang.String str = this.newlyAddedAddressId;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses loadAddresses = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, loadAddresses.debitInstrumentId) && this.productName == loadAddresses.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedAddressId, loadAddresses.newlyAddedAddressId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses copy(java.lang.String debitInstrumentId, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String newlyAddedAddressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses(debitInstrumentId, productName, newlyAddedAddressId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses loadAddresses, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loadAddresses.debitInstrumentId;
            }
            if ((i & 2) != 0) {
                debitCardProductName = loadAddresses.productName;
            }
            if ((i & 4) != 0) {
                str2 = loadAddresses.newlyAddedAddressId;
            }
            return loadAddresses.copy(str, debitCardProductName, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddressSelected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddressSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressSelected extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        private final int index;

        public AddressSelected(int i) {
            super("AddressSelected", null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String toString() {
            int i = this.index;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSelected(index=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.index);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected) && this.index == ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected) other).index;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected copy(int index) {
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected(index);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected addressSelected, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = addressSelected.index;
            }
            return addressSelected.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ6\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddressesLoaded;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "addresses", "", "debitInstrumentId", "newlyAddedAddressId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddressesLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAddresses", "Ljava/lang/String;", "getDebitInstrumentId", "getNewlyAddedAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressesLoaded extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses;
        private final java.lang.String debitInstrumentId;
        private final java.lang.String newlyAddedAddressId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressesLoaded(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list, java.lang.String str, java.lang.String str2) {
            super("AddressesLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.addresses = list;
            this.debitInstrumentId = str;
            this.newlyAddedAddressId = str2;
        }

        public /* synthetic */ AddressesLoaded(java.util.List list, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i & 4) != 0 ? null : str2);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> getAddresses() {
            return this.addresses;
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list = this.addresses;
            java.lang.String str = this.debitInstrumentId;
            java.lang.String str2 = this.newlyAddedAddressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressesLoaded(addresses=");
            sb.append(list);
            sb.append(", debitInstrumentId=");
            sb.append(str);
            sb.append(", newlyAddedAddressId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.addresses.hashCode();
            int hashCode2 = this.debitInstrumentId.hashCode();
            java.lang.String str = this.newlyAddedAddressId;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded addressesLoaded = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, addressesLoaded.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, addressesLoaded.debitInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedAddressId, addressesLoaded.newlyAddedAddressId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses, java.lang.String debitInstrumentId, java.lang.String newlyAddedAddressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded(addresses, debitInstrumentId, newlyAddedAddressId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> component1() {
            return this.addresses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded addressesLoaded, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = addressesLoaded.addresses;
            }
            if ((i & 2) != 0) {
                str = addressesLoaded.debitInstrumentId;
            }
            if ((i & 4) != 0) {
                str2 = addressesLoaded.newlyAddedAddressId;
            }
            return addressesLoaded.copy(list, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$LoadingFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "newlyAddedAddressId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$LoadingFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "getNewlyAddedAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingFailed extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final java.lang.String newlyAddedAddressId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingFailed(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str2) {
            super("LoadingFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorCode = str;
            this.errorType = debitErrorType;
            this.newlyAddedAddressId = str2;
        }

        public /* synthetic */ LoadingFailed(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, debitErrorType, (i & 4) != 0 ? null : str2);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str2 = this.newlyAddedAddressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadingFailed(errorCode=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", newlyAddedAddressId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            int hashCode2 = this.errorType.hashCode();
            java.lang.String str = this.newlyAddedAddressId;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed loadingFailed = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, loadingFailed.errorCode) && this.errorType == loadingFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedAddressId, loadingFailed.newlyAddedAddressId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed copy(java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String newlyAddedAddressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed(errorCode, errorType, newlyAddedAddressId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNewlyAddedAddressId() {
            return this.newlyAddedAddressId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed loadingFailed, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loadingFailed.errorCode;
            }
            if ((i & 2) != 0) {
                debitErrorType = loadingFailed.errorType;
            }
            if ((i & 4) != 0) {
                str2 = loadingFailed.newlyAddedAddressId;
            }
            return loadingFailed.copy(str, debitErrorType, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$AddNewAddressClicked;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddNewAddressClicked extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddNewAddressClicked INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddNewAddressClicked();

        public final int hashCode() {
            return -1733204786;
        }

        private AddNewAddressClicked() {
            super("AddNewAddressClicked", null);
        }

        public final java.lang.String toString() {
            return "AddNewAddressClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddNewAddressClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$SaveAddress;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveAddress extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress();

        public final int hashCode() {
            return -1252387813;
        }

        private SaveAddress() {
            super("SaveAddress", null);
        }

        public final java.lang.String toString() {
            return "SaveAddress";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$SaveSuccessful;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveSuccessful extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveSuccessful INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveSuccessful();

        public final int hashCode() {
            return -1579029229;
        }

        private SaveSuccessful() {
            super("SaveSuccessful", null);
        }

        public final java.lang.String toString() {
            return "SaveSuccessful";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveSuccessful)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$SaveFailed;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$SaveFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveFailed extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveFailed(java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
            super("SaveFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorCode = str;
            this.errorType = debitErrorType;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveFailed(errorCode=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorCode.hashCode() * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed saveFailed = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, saveFailed.errorCode) && this.errorType == saveFailed.errorType;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed copy(java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed(errorCode, errorType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed saveFailed, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = saveFailed.errorCode;
            }
            if ((i & 2) != 0) {
                debitErrorType = saveFailed.errorType;
            }
            return saveFailed.copy(str, debitErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent$DismissAddressSelection;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissAddressSelection extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.DismissAddressSelection INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.DismissAddressSelection();

        public final int hashCode() {
            return 1057565958;
        }

        private DismissAddressSelection() {
            super("DismissAddressSelection", null);
        }

        public final java.lang.String toString() {
            return "DismissAddressSelection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.DismissAddressSelection)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AddressSelectionEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
