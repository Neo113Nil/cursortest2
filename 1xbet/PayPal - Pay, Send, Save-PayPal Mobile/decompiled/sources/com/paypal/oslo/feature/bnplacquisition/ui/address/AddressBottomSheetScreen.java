package com.paypal.oslo.feature.bnplacquisition.ui.address;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen;", "", "<init>", "()V", "Overview", "Edit", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen$Edit;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen$Overview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AddressBottomSheetScreen {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen$Overview;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Overview extends com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Overview INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Overview();

        public final int hashCode() {
            return -1242553439;
        }

        private Overview() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Overview";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Overview)) {
                return false;
            }
            return true;
        }
    }

    private AddressBottomSheetScreen() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen$Edit;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "prefillAddress", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/AddressBottomSheetScreen$Edit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getPrefillAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Edit extends com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address prefillAddress;

        public Edit(com.paypal.oslo.core.i18n.domain.model.Address address) {
            super(null);
            this.prefillAddress = address;
        }

        public /* synthetic */ Edit(com.paypal.oslo.core.i18n.domain.model.Address address, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address);
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getPrefillAddress() {
            return this.prefillAddress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.prefillAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Edit(prefillAddress=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.core.i18n.domain.model.Address address = this.prefillAddress;
            if (address == null) {
                return 0;
            }
            return address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit) && kotlin.jvm.internal.Intrinsics.areEqual(this.prefillAddress, ((com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit) other).prefillAddress);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit copy(com.paypal.oslo.core.i18n.domain.model.Address prefillAddress) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit(prefillAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getPrefillAddress() {
            return this.prefillAddress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.AddressBottomSheetScreen.Edit edit, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = edit.prefillAddress;
            }
            return edit.copy(address);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Edit() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ AddressBottomSheetScreen(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
