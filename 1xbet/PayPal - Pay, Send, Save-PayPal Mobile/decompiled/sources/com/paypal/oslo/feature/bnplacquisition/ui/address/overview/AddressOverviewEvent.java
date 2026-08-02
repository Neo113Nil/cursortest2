package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadAddresses", "AddressesFormatted", "AddressSelected", "AddNewAddressPressed", "DonePressed", "ClosePressed", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddNewAddressPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddressSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddressesFormatted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$DonePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$LoadAddresses;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AddressOverviewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AddressOverviewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$LoadAddresses;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FormattedAddressOverviewItem;", "formattedAddressOverviewItems", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$LoadAddresses;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFormattedAddressOverviewItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadAddresses extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> formattedAddressOverviewItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadAddresses(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> list) {
            super("LoadAddresses", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.formattedAddressOverviewItems = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> getFormattedAddressOverviewItems() {
            return this.formattedAddressOverviewItems;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> list = this.formattedAddressOverviewItems;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadAddresses(formattedAddressOverviewItems=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formattedAddressOverviewItems.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAddressOverviewItems, ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses) other).formattedAddressOverviewItems);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> formattedAddressOverviewItems) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAddressOverviewItems, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses(formattedAddressOverviewItems);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem> component1() {
            return this.formattedAddressOverviewItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses loadAddresses, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loadAddresses.formattedAddressOverviewItems;
            }
            return loadAddresses.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddressesFormatted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddressesFormatted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressesFormatted extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressesFormatted(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel addressOverviewUiModel) {
            super("AddressesFormatted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressOverviewUiModel, "");
            this.uiModel = addressOverviewUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel addressOverviewUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressesFormatted(uiModel=");
            sb.append(addressOverviewUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted copy(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted addressesFormatted, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel addressOverviewUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressOverviewUiModel = addressesFormatted.uiModel;
            }
            return addressesFormatted.copy(addressOverviewUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddressSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "", "addressId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddressSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressSelected extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent {
        public static final int $stable = 0;
        private final java.lang.String addressId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressSelected(java.lang.String str) {
            super("AddressSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.addressId = str;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSelected(addressId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.addressId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected) other).addressId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected copy(java.lang.String addressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected(addressId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected addressSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addressSelected.addressId;
            }
            return addressSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$AddNewAddressPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddNewAddressPressed extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddNewAddressPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddNewAddressPressed();

        public final int hashCode() {
            return -2011248365;
        }

        private AddNewAddressPressed() {
            super("AddNewAddressPressed", null);
        }

        public final java.lang.String toString() {
            return "AddNewAddressPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddNewAddressPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$DonePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DonePressed extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.DonePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.DonePressed();

        public final int hashCode() {
            return 255180570;
        }

        private DonePressed() {
            super("DonePressed", null);
        }

        public final java.lang.String toString() {
            return "DonePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.DonePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.ClosePressed();

        public final int hashCode() {
            return -1250384528;
        }

        private ClosePressed() {
            super("ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AddressOverviewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
