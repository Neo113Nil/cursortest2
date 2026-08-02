package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0005R+\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001a8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressInputState;", "Landroid/os/Parcelable;", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "initialValue", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;)V", "Lkotlin/Function1;", "transform", "", "update", "(Lkotlin/jvm/functions/Function1;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "<set-?>", "address$delegate", "Landroidx/compose/runtime/MutableState;", "getAddress", "()Lcom/paypal/oslo/feature/businesscustomers/ui/model/AddressFields;", "setAddress", "address", "", "isModified$delegate", "isModified", "()Z", "setModified", "(Z)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressInputState implements android.os.Parcelable {
    public static final int $stable = 0;

    /* renamed from: address$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState address;

    /* renamed from: isModified$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isModified;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState> CREATOR = new android.os.Parcelable.Creator<com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState>() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields = (com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields) androidx.core.os.ParcelCompat.readParcelable(source, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields.class.getClassLoader(), com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields.class);
            if (addressFields == null) {
                addressFields = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields(null, null, null, null, null, null, 63, null);
            }
            boolean z = source.readInt() == 1;
            com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState addressInputState = new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState(addressFields);
            addressInputState.setModified(z);
            return addressInputState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState[] newArray(int size) {
            return new com.paypal.oslo.feature.businesscustomers.ui.model.AddressInputState[size];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AddressInputState(com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFields, "");
        this.address = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(addressFields, null, 2, null);
        this.isModified = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ AddressInputState(com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields(null, null, null, null, null, null, 63, null) : addressFields);
    }

    private final void setAddress(com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields addressFields) {
        this.address.setValue(addressFields);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields getAddress() {
        return (com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields) this.address.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setModified(boolean z) {
        this.isModified.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isModified() {
        return ((java.lang.Boolean) this.isModified.getValue()).booleanValue();
    }

    public final void update(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields, com.paypal.oslo.feature.businesscustomers.ui.model.AddressFields> transform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        setAddress(transform.invoke(getAddress()));
        setModified(true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeParcelable(getAddress(), flags);
        dest.writeInt(isModified() ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressInputState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
