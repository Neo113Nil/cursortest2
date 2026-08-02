package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressContainerState;", "Landroid/os/Parcelable;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;", "billingAddressState", "shippingAddressState", "", "initialSameShippingAsBilling", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;Z)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "updateSameShippingAsBilling", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;", "getBillingAddressState", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;", "getShippingAddressState", "<set-?>", "isSameShippingAsBilling$delegate", "Landroidx/compose/runtime/MutableState;", "isSameShippingAsBilling", "()Z", "setSameShippingAsBilling", "isModified", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressContainerState implements android.os.Parcelable {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState billingAddressState;

    /* renamed from: isSameShippingAsBilling$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isSameShippingAsBilling;
    private final com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState shippingAddressState;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState> CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState>() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState.class);
            if (addressInputState == null) {
                addressInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(null, 1, null);
            }
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState2 = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState.class);
            if (addressInputState2 == null) {
                addressInputState2 = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(null, 1, null);
            }
            return new com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState(addressInputState, addressInputState2, source.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState[] newArray(int size) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.AddressContainerState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AddressContainerState(com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState, com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInputState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressInputState2, "");
        this.billingAddressState = addressInputState;
        this.shippingAddressState = addressInputState2;
        this.isSameShippingAsBilling = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z), null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AddressContainerState(com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState, com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(null, r1, 0 == true ? 1 : 0) : addressInputState, (i & 2) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(0 == true ? 1 : 0, r1, 0 == true ? 1 : 0) : addressInputState2, (i & 4) != 0 ? true : z);
        int i2 = 1;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState getBillingAddressState() {
        return this.billingAddressState;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState getShippingAddressState() {
        return this.shippingAddressState;
    }

    private final void setSameShippingAsBilling(boolean z) {
        this.isSameShippingAsBilling.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSameShippingAsBilling() {
        return ((java.lang.Boolean) this.isSameShippingAsBilling.getValue()).booleanValue();
    }

    public final boolean isModified() {
        return this.billingAddressState.isModified() || this.shippingAddressState.isModified();
    }

    public final void updateSameShippingAsBilling(boolean newValue) {
        setSameShippingAsBilling(newValue);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(this.billingAddressState, flags);
        dest.writeParcelable(this.shippingAddressState, flags);
        dest.writeInt(isSameShippingAsBilling() ? 1 : 0);
    }

    public AddressContainerState() {
        this(null, null, false, 7, null);
    }
}
